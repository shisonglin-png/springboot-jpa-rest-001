package com.offcn.Impl;

import com.offcn.pay.PayService;
import org.springframework.stereotype.Service;

@Service
public class PayServiceImpl  implements PayService {
    @Override
    public void add(Double money) {
        System.out.println("增加金额");
    }

    @Override
    public void update(Double money) {
        System.out.println("修改金额");
    }

    @Override
    public void delete(Long id) {
        System.out.println("删除金额");
    }
}
