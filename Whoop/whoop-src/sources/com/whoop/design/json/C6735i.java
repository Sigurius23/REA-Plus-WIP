package com.whoop.design.json;

import c93.InterfaceC4351m;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import java.util.Map;

/* JADX INFO: renamed from: com.whoop.design.json.i */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C6735i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f25695w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Map.Entry f25696x;

    public /* synthetic */ C6735i(int i13, Map.Entry entry) {
        this.f25695w = i13;
        this.f25696x = entry;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        JsonDeserializationContext jsonDeserializationContext = (JsonDeserializationContext) obj;
        JsonObject jsonObject = (JsonObject) obj2;
        switch (this.f25695w) {
            case 0:
                return DesignSystemTypeAdapter.m20366f(this.f25696x, jsonDeserializationContext, jsonObject);
            default:
                return AbstractC6736j.m20393d(this.f25696x, jsonDeserializationContext, jsonObject);
        }
    }
}
