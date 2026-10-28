package com.whoop.whooplive;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1175e;
import androidx.databinding.InterfaceC1176f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p319m4.AbstractC25012a;
import pz2.AbstractC29653f;
import qz2.C30801b;

/* JADX INFO: loaded from: classes5.dex */
public class DataBinderMapperImpl extends AbstractC1175e {

    /* JADX INFO: renamed from: a */
    private static final SparseIntArray f33366a;

    /* JADX INFO: renamed from: com.whoop.whooplive.DataBinderMapperImpl$a */
    /* JADX INFO: loaded from: classes11.dex */
    public static class C10862a {

        /* JADX INFO: renamed from: a */
        static final HashMap<String, Integer> f33367a;

        static {
            HashMap<String, Integer> map = new HashMap<>(1);
            f33367a = map;
            map.put("layout/view_live_overlay_0", Integer.valueOf(AbstractC29653f.f121183c));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        f33366a = sparseIntArray;
        sparseIntArray.put(AbstractC29653f.f121183c, 1);
    }

    @Override // androidx.databinding.AbstractC1175e
    public List<AbstractC1175e> collectDependencies() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.whoop.realtime.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.AbstractC1175e
    public AbstractC1168a0 getDataBinder(InterfaceC1176f interfaceC1176f, View view, int i13) {
        int i14 = f33366a.get(i13);
        if (i14 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i14 != 1) {
            return null;
        }
        if ("layout/view_live_overlay_0".equals(tag)) {
            return new C30801b(interfaceC1176f, view);
        }
        throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "The tag for view_live_overlay is invalid. Received: "));
    }

    @Override // androidx.databinding.AbstractC1175e
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = C10862a.f33367a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.AbstractC1175e
    public AbstractC1168a0 getDataBinder(InterfaceC1176f interfaceC1176f, View[] viewArr, int i13) {
        if (viewArr == null || viewArr.length == 0 || f33366a.get(i13) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
