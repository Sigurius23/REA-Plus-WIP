package com.whoop.sleep.coach;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1175e;
import androidx.databinding.InterfaceC1176f;
import gf2.C15795d;
import gf2.C15811t;
import gf2.C15813v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p319m4.AbstractC25012a;
import qe2.AbstractC30313f;

/* JADX INFO: loaded from: classes4.dex */
public class DataBinderMapperImpl extends AbstractC1175e {

    /* JADX INFO: renamed from: a */
    private static final SparseIntArray f30850a;

    /* JADX INFO: renamed from: com.whoop.sleep.coach.DataBinderMapperImpl$a */
    /* JADX INFO: loaded from: classes10.dex */
    public static class C10206a {

        /* JADX INFO: renamed from: a */
        static final HashMap<String, Integer> f30851a;

        static {
            HashMap<String, Integer> map = new HashMap<>(3);
            f30851a = map;
            map.put("layout/fragment_tonights_sleep_container_0", Integer.valueOf(AbstractC30313f.f124215c));
            map.put("layout/sleep_goal_settings_view_0", Integer.valueOf(AbstractC30313f.f124230r));
            map.put("layout/view_feature_tooltip_0", Integer.valueOf(AbstractC30313f.f124231s));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(3);
        f30850a = sparseIntArray;
        sparseIntArray.put(AbstractC30313f.f124215c, 1);
        sparseIntArray.put(AbstractC30313f.f124230r, 2);
        sparseIntArray.put(AbstractC30313f.f124231s, 3);
    }

    @Override // androidx.databinding.AbstractC1175e
    public List<AbstractC1175e> collectDependencies() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.AbstractC1175e
    public AbstractC1168a0 getDataBinder(InterfaceC1176f interfaceC1176f, View view, int i13) {
        int i14 = f30850a.get(i13);
        if (i14 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i14 == 1) {
            if ("layout/fragment_tonights_sleep_container_0".equals(tag)) {
                return new C15795d(interfaceC1176f, view);
            }
            throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "The tag for fragment_tonights_sleep_container is invalid. Received: "));
        }
        if (i14 == 2) {
            if ("layout/sleep_goal_settings_view_0".equals(tag)) {
                return new C15811t(interfaceC1176f, view);
            }
            throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "The tag for sleep_goal_settings_view is invalid. Received: "));
        }
        if (i14 != 3) {
            return null;
        }
        if ("layout/view_feature_tooltip_0".equals(tag)) {
            return new C15813v(interfaceC1176f, view);
        }
        throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "The tag for view_feature_tooltip is invalid. Received: "));
    }

    @Override // androidx.databinding.AbstractC1175e
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = C10206a.f30851a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.AbstractC1175e
    public AbstractC1168a0 getDataBinder(InterfaceC1176f interfaceC1176f, View[] viewArr, int i13) {
        if (viewArr == null || viewArr.length == 0 || f30850a.get(i13) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
