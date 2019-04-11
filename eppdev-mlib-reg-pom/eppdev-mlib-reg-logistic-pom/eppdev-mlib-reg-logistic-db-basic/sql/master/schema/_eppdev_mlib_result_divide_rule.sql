create table _eppdev_mlib_result_divide_rule(
  id char(32) comment 'UUID，唯一标识',
  model_id varchar comment '模型id',
  result_range varchar(64) comment '分段区间，分别通过小括号、中括号表示开闭区间',
  score integer comment '分段结果',
  create_date datetime comment '数据创建时间（技术字段）',
  update_date datetime comment '数据最后修改时间（技术字段）',
  create_by char(32) comment '数据创建人ID（技术字段）',
  update_by char(32) comment '数据最后修改人ID（技术字段）',
  remarks varchar(1024) comment '备注（技术字段）',
  del_flag integer comment '删除标识（技术字段）',
  primary key(id)
);


