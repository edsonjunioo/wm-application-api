alter table supplier add active tinyint;
update supplier set active = 1;