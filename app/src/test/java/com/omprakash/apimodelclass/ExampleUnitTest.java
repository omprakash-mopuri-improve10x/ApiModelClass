package com.omprakash.apimodelclass;

import org.junit.Test;

import static org.junit.Assert.*;

import com.google.gson.Gson;
import com.omprakash.apimodelclass.models.Shop;
import com.omprakash.apimodelclass.network.Api;
import com.omprakash.apimodelclass.network.ApiService;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void getShops() throws IOException {
        Api api = new Api();
        ApiService apiService = api.createApiService();
        Call<List<Shop>> call = apiService.fetchShops();
        List<Shop> shops = call.execute().body();
        assertNotNull(shops);
        assertFalse(shops.isEmpty());
        System.out.println(new Gson().toJson(shops));
        System.out.println(new Gson().toJson(shops.get(0).getClientDetails()));
        assertEquals("USD", shops.get(0).getCurrentSubtotalPriceSet().getShopMoney().getCurrencyCode());
        assertEquals(false, shops.get(0).getLineItems().get(0).getGiftCard());
        assertEquals("STATE TAX", shops.get(0).getLineItems().get(0).getTaxLines().get(0).getTitle());
        assertEquals(null, shops.get(0).getPaymentTerms());
    }
}