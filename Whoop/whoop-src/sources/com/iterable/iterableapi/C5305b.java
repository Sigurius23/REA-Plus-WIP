package com.iterable.iterableapi;

import cg.C4556k;
import java.util.ArrayList;
import java.util.Iterator;
import l83.C23465k;
import m83.AbstractC25260n;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: com.iterable.iterableapi.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5305b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f21635a = 0;

    /* JADX INFO: renamed from: b */
    public final String f21636b;

    /* JADX INFO: renamed from: c */
    public int f21637c;

    public C5305b(int i13, String str) {
        this.f21637c = i13;
        this.f21636b = str;
    }

    /* JADX INFO: renamed from: a */
    public C23465k m16411a(String[] strArr) {
        Object obj;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new C23465k(str, Integer.valueOf(AbstractC39414r.m125888g0(this.f21636b, str, this.f21637c, false, 4))));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((Number) ((C23465k) obj2).f92938x).intValue() != -1) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int iIntValue = ((Number) ((C23465k) next).f92938x).intValue();
                do {
                    Object next2 = it.next();
                    int iIntValue2 = ((Number) ((C23465k) next2).f92938x).intValue();
                    if (iIntValue > iIntValue2) {
                        next = next2;
                        iIntValue = iIntValue2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (C23465k) obj;
    }

    /* JADX INFO: renamed from: b */
    public void m16412b(String[] strArr, C4556k c4556k) {
        C23465k c23465kM16411a = m16411a(strArr);
        if (c23465kM16411a == null) {
            throw new IllegalArgumentException(("Cannot find any of " + AbstractC25260n.m74049W0(strArr)).toString());
        }
        String str = (String) c23465kM16411a.f92937w;
        int iIntValue = ((Number) c23465kM16411a.f92938x).intValue();
        String strSubstring = this.f21636b.substring(this.f21637c, iIntValue);
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        this.f21637c = iIntValue;
        c4556k.invoke(strSubstring);
        this.f21637c = str.length() + this.f21637c;
    }

    /* JADX INFO: renamed from: c */
    public void m16413c(String[] strArr, Function1 function1) {
        C23465k c23465kM16411a = m16411a(strArr);
        String str = this.f21636b;
        int iIntValue = c23465kM16411a != null ? ((Number) c23465kM16411a.f92938x).intValue() : str.length();
        String strSubstring = str.substring(this.f21637c, iIntValue);
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        this.f21637c = iIntValue;
        function1.invoke(strSubstring);
    }

    public String toString() {
        switch (this.f21635a) {
            case 1:
                StringBuilder sb4 = new StringBuilder("Scanner(remainingText='");
                String strSubstring = this.f21636b.substring(this.f21637c);
                AbstractC22676k.m65749i(strSubstring, "substring(...)");
                sb4.append(strSubstring);
                sb4.append("')");
                return sb4.toString();
            default:
                return super.toString();
        }
    }

    public C5305b(String text) {
        AbstractC22676k.m65750j(text, "text");
        this.f21636b = text;
    }
}
