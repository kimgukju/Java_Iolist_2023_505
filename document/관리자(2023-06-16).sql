-- Iolist 관리자 화면

/*
iolist 라는 TABLESPACE(저장소) 를 생성
실제 저장되는 파일은 iolist.dbf 이다
처음 시작하는 크기는 1M(byte) 이고
용량이 부족할 경우 자동으로 확장하는데 1K(byte) 단위로 확장
*/
CREATE TABLESPACE iolist
DATAFILE 'C:/app/data/iolist.dbf'
SIZE 1M AUTOEXTEND ON NEXT 1K;

/*
새로운 사용자(SCHEME)를 생성하고
접속 비번을 12341234 로 설정하라
이 사용자 정보를 통해서 접근할수 있는 저장소는 iolist 이다
*/
CREATE USER iolist IDENTIFIED BY 12341234
DEFAULT TABLESPACE iolist;
