package com.offcn.pay;

import com.offcn.bean.User;

import java.util.List;

public interface PayService {
    public void add(Double money);
    public void update(Double money);
    public void delete(Double money);
}
