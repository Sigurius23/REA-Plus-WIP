package com.squareup.wire;

import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: com.squareup.wire.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C5585p {
    /* JADX INFO: renamed from: a */
    public static AbstractC5586q m16802a(Class type) {
        AbstractC22676k.m65750j(type, "type");
        try {
            Object obj = type.getField("ADAPTER").get(null);
            AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<M of com.squareup.wire.ProtoAdapter.Companion.get>");
            return (AbstractC5586q) obj;
        } catch (IllegalAccessException e5) {
            throw new IllegalArgumentException("failed to access " + type.getName() + "#ADAPTER", e5);
        } catch (NoSuchFieldException e13) {
            throw new IllegalArgumentException("failed to access " + type.getName() + "#ADAPTER", e13);
        }
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC5586q m16803b(String adapterString, ClassLoader classLoader) {
        AbstractC22676k.m65750j(adapterString, "adapterString");
        try {
            int iM125887f0 = AbstractC39414r.m125887f0(adapterString, '#', 0, false, 6);
            String strSubstring = adapterString.substring(0, iM125887f0);
            AbstractC22676k.m65749i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strSubstring2 = adapterString.substring(iM125887f0 + 1);
            AbstractC22676k.m65749i(strSubstring2, "this as java.lang.String).substring(startIndex)");
            Object obj = Class.forName(strSubstring, true, classLoader).getField(strSubstring2).get(null);
            AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
            return (AbstractC5586q) obj;
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("failed to access ".concat(adapterString), e5);
        } catch (IllegalAccessException e13) {
            throw new IllegalArgumentException("failed to access ".concat(adapterString), e13);
        } catch (NoSuchFieldException e14) {
            throw new IllegalArgumentException("failed to access ".concat(adapterString), e14);
        }
    }
}
