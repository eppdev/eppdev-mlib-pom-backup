create table _eppdev_mlib_conti_var_coef(
  id char(32) comment 'UUID，唯一标识',
  model_id varchar(64) comment '模型id',
  property_name varchar(128) comment '属性名称',
  coef double comment '属性值的权重',
  create_date datetime comment '数据创建时间（技术字段）',
  update_date datetime comment '数据最后修改时间（技术字段）',
  create_by char(32) comment '数据创建人ID（技术字段）',
  update_by char(32) comment '数据最后修改人ID（技术字段）',
  remarks varchar(1024) comment '备注（技术字段）',
  del_flag integer comment '删除标识（技术字段）',
  primary key(id)
);

create index idx___eppdev_mlib_conti_var_coef__model_id on _eppdev_mlib_conti_var_coef(model_id);

