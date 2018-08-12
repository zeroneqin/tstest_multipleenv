# TSTest -Multiple Environment

## Introduction
In real test scenarios, multiple environment is very common, like regression test on multiple data centers, maybe dozens,hundreds,even thousands server need to be tested with same case. TSTest-Multiple Environment(Test Service-Test-Multiple environment) is a test framework for multiple env based on testng.
## Usage
Run it from command line or add this to jenkins job, pass the host address by ipList parameter.
`mvn  clean package -Dtestngfile=demo.xml -DipList=127.0.0.1,localhost`
## Author
Jun Qin
## Bug and issues
If you find any bug or issues, be free to send mail to zeroneqin@163.com
## License
MIT©️Jun Qin
