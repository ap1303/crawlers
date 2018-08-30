# -*- coding: utf-8 -*-
import scrapy


class WCSpider(scrapy.Spider):
    name = '207'
    start_urls = ['https://www.teach.cs.toronto.edu//~csc207h/summer/lectures.shtml']

    def __init__(self):
        super().__init__()
        self.count = 0

    def parse(self, response):
        if self.count == 0:
            for lecture in response.css('td.lectures ul li a::attr(href)'):
                print(lecture)
                yield response.follow(lecture, callback=self.parse_item)
        elif self.count == 1:
            for lecture in response.css('li a::attr(href)'):
                yield response.follow(lecture, callback=self.parse_item)
        elif self.count == 2:
            for lecture in response.css('li a::attr(href)'):
                yield response.follow(lecture, callback=self.parse_item)
        else:
            for lecture in response.css('li a::attr(href)'):
                yield response.follow(lecture, callback=self.parse_item)
        selectorList = response.css('span.links a::attr(href)').extract()
        for next_page in range(1, len(selectorList)):
            if next_page is not None:
                self.count += 1
                next_ = response.urljoin(selectorList[next_page])
                yield response.follow(next_)

    def parse_item(self, response):
        path = response.url.split('/')[-1]
        with open(path, 'wb') as f:
            f.write(response.body)


        
