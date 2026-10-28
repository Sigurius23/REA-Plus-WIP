package com.whoop.settings;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1175e;
import androidx.databinding.InterfaceC1176f;
import gb2.C15701c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p319m4.AbstractC25012a;
import p705ea2.AbstractC12921r;

/* JADX INFO: loaded from: classes4.dex */
public class DataBinderMapperImpl extends AbstractC1175e {

    /* JADX INFO: renamed from: a */
    private static final SparseIntArray f30067a;

    /* JADX INFO: renamed from: com.whoop.settings.DataBinderMapperImpl$a */
    /* JADX INFO: loaded from: classes10.dex */
    public static class C10024a {

        /* JADX INFO: renamed from: a */
        static final HashMap<String, Integer> f30068a;

        static {
            HashMap<String, Integer> map = new HashMap<>(1);
            f30068a = map;
            map.put("layout/fragment_my_account_landing_0", Integer.valueOf(AbstractC12921r.f44550b));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        f30067a = sparseIntArray;
        sparseIntArray.put(AbstractC12921r.f44550b, 1);
    }

    @Override // androidx.databinding.AbstractC1175e
    public List<AbstractC1175e> collectDependencies() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.AbstractC1175e
    public AbstractC1168a0 getDataBinder(InterfaceC1176f interfaceC1176f, View view, int i13) {
        int i14 = f30067a.get(i13);
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
        if ("layout/fragment_my_account_landing_0".equals(tag)) {
            return new C15701c(interfaceC1176f, view);
        }
        throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "The tag for fragment_my_account_landing is invalid. Received: "));
    }

    @Override // androidx.databinding.AbstractC1175e
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = C10024a.f30068a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.AbstractC1175e
    public AbstractC1168a0 getDataBinder(InterfaceC1176f interfaceC1176f, View[] viewArr, int i13) {
        if (viewArr == null || viewArr.length == 0 || f30067a.get(i13) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
