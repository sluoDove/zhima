package com.zyt.zhima.dto;

import com.zyt.zhima.model.Lease;
import lombok.Data;

import java.util.List;

/**
 * @author ls
 * @date 2019/11/14
 * @desc
 */
@Data
public class LeaseDto {

    private String classes;

    private List<Lease> list;

}
