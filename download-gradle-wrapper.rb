require 'net/http'
require 'fileutils'

# Create directory if it doesn't exist
FileUtils.mkdir_p 'gradle/wrapper'

# Download the gradle-wrapper.jar
url = 'https://github.com/gradle/gradle/raw/master/gradle/wrapper/gradle-wrapper.jar'
puts "Downloading gradle-wrapper.jar from #{url}"
uri = URI(url)
response = Net::HTTP.get_response(uri)

if response.code == '200'
  File.open('gradle/wrapper/gradle-wrapper.jar', 'wb') do |file|
    file.write(response.body)
  end
  puts "Downloaded gradle-wrapper.jar successfully"
else
  puts "Failed to download gradle-wrapper.jar: #{response.code} #{response.message}"
  exit 1
end