package com.itpe.springbatch;

import org.springframework.batch.item.ItemProcessor;

import com.itpe.springbatch.model.TaxpayerModel;

public class TaxpayerItemProcessor implements ItemProcessor<TaxpayerModel, TaxpayerModel>{

	
	@Override
	public TaxpayerModel process(TaxpayerModel tx) throws Exception {
		System.out.println("Processing Taxpyer :"+tx);
		
		/*
		 * Only return results which match criteria below
		 * 
		 */
		if(tx.getTaxpayerType().equals("G")){
			return null;
		}
		
		return tx;
	}

}
