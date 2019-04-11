create table _eppdev_mlib_property_rule(
  id char(32) comment 'UUID，唯一标识',
  var_rule_id char(32) comment '',
  property_name varchar(96) comment '属性名称',
  property_value varchar(64) comment '属性值（用于判断等于）',
  property_range varchar(128) comment '属性的区间，用于判断大于、大于等于、小于、小于等于，采用小括号、中括号表示开闭区间',
  create_date datetime comment '数据创建时间（技术字段）',
  update_date datetime comment '数据最后修改时间（技术字段）',
  create_by char(32) comment '数据创建人ID（技术字段）',
  update_by char(32) comment '数据最后修改人ID（技术字段）',
  remarks varchar(1024) comment '备注（技术字段）',
  del_flag integer comment '删除标识（技术字段）',
  primary key(id)
);

create index idx___eppdev_mlib_property_rule__var_rule_id on _eppdev_mlib_property_rule(var_rule_id);

