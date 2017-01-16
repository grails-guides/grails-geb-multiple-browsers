package grails.geb.multiple.browsers

import geb.spock.GebSpec
import grails.test.mixin.integration.Integration

@Integration
class DefaultHomePageSpec extends GebSpec {

    def "verifies there is _<h1>_ header with the text _Welcome to Grails when we visit the home page."() {
        when:
        go '/'

        then:

        $('h1').text() == 'Welcome to Grails'

    }
}