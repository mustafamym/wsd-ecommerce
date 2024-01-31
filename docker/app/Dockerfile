FROM maven:3.8.5-openjdk-17

MAINTAINER Gulam Mustafa <mustafamym@gmail.com>

VOLUME /tmp

ADD restaurantService.jar restaurantService.jar

ADD entrypoint.sh entrypoint.sh

RUN sh -c 'touch /restaurantService.jar'

ENTRYPOINT [ "sh", "./entrypoint.sh" ]