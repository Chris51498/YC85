select * from porduct;
delete  from porduct where pname='ƻ��' or pname='������';
commit;
insert into porduct
values(1,'ƻ��',15);
insert into porduct
values(7,'ƻ��',10);
insert into porduct
values(2,'����',15);
insert into porduct
values(5,'����',15);
insert into porduct
values(8,'�߹�',15);
insert into porduct
values(9,'��֦',15);
insert into porduct
values(10,'����',15);

COMMIT;


select * from(
select rownum as rn,productcode,pname,quantity
from (select * from porduct)
where rownum<=5)
where rn>=1;
