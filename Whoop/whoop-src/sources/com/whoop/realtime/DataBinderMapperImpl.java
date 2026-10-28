package com.whoop.realtime;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1175e;
import androidx.databinding.InterfaceC1176f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import k52.AbstractC22209e;
import m52.C25082b;
import m52.C25084d;
import m52.C25086f;
import m52.C25088h;
import m52.C25090j;
import m52.C25092l;
import m52.C25094n;
import m52.C25096p;
import m52.C25098r;
import m52.C25100t;
import m52.C25102v;
import m52.C25104x;
import p319m4.AbstractC25012a;

/* JADX INFO: loaded from: classes4.dex */
public class DataBinderMapperImpl extends AbstractC1175e {

    /* JADX INFO: renamed from: a */
    private static final SparseIntArray f28733a;

    /* JADX INFO: renamed from: com.whoop.realtime.DataBinderMapperImpl$a */
    /* JADX INFO: loaded from: classes10.dex */
    public static class C9834a {

        /* JADX INFO: renamed from: a */
        static final HashMap<String, Integer> f28734a;

        static {
            HashMap<String, Integer> map = new HashMap<>(12);
            f28734a = map;
            map.put("layout/activity_start_activity_kotlin_0", Integer.valueOf(AbstractC22209e.f86390b));
            map.put("layout/fragment_real_time_activity_strain_0", Integer.valueOf(AbstractC22209e.f86391c));
            map.put("layout/fragment_real_time_heartrate_0", Integer.valueOf(AbstractC22209e.f86392d));
            map.put("layout/fragment_real_time_map_0", Integer.valueOf(AbstractC22209e.f86393e));
            map.put("layout/fragment_realtime_sleep_0", Integer.valueOf(AbstractC22209e.f86394f));
            map.put("layout/fragment_select_activity_0", Integer.valueOf(AbstractC22209e.f86395g));
            map.put("layout/layout_gps_map_0", Integer.valueOf(AbstractC22209e.f86396h));
            map.put("layout/layout_gps_map_fragment_activity_0", Integer.valueOf(AbstractC22209e.f86397i));
            map.put("layout/view_daystrain_0", Integer.valueOf(AbstractC22209e.f86399k));
            map.put("layout/view_real_time_strain_range_0", Integer.valueOf(AbstractC22209e.f86400l));
            map.put("layout/view_realtime_cell_0", Integer.valueOf(AbstractC22209e.f86401m));
            map.put("layout/view_rtstrain_range_segment_0", Integer.valueOf(AbstractC22209e.f86402n));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(12);
        f28733a = sparseIntArray;
        sparseIntArray.put(AbstractC22209e.f86390b, 1);
        sparseIntArray.put(AbstractC22209e.f86391c, 2);
        sparseIntArray.put(AbstractC22209e.f86392d, 3);
        sparseIntArray.put(AbstractC22209e.f86393e, 4);
        sparseIntArray.put(AbstractC22209e.f86394f, 5);
        sparseIntArray.put(AbstractC22209e.f86395g, 6);
        sparseIntArray.put(AbstractC22209e.f86396h, 7);
        sparseIntArray.put(AbstractC22209e.f86397i, 8);
        sparseIntArray.put(AbstractC22209e.f86399k, 9);
        sparseIntArray.put(AbstractC22209e.f86400l, 10);
        sparseIntArray.put(AbstractC22209e.f86401m, 11);
        sparseIntArray.put(AbstractC22209e.f86402n, 12);
    }

    @Override // androidx.databinding.AbstractC1175e
    public List<AbstractC1175e> collectDependencies() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.AbstractC1175e
    public AbstractC1168a0 getDataBinder(InterfaceC1176f interfaceC1176f, View view, int i13) {
        int i14 = f28733a.get(i13);
        if (i14 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        switch (i14) {
            case 1:
                if ("layout/activity_start_activity_kotlin_0".equals(tag)) {
                    return new C25082b(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "The tag for activity_start_activity_kotlin is invalid. Received: "));
            case 2:
                if ("layout/fragment_real_time_activity_strain_0".equals(tag)) {
                    return new C25084d(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "The tag for fragment_real_time_activity_strain is invalid. Received: "));
            case 3:
                if ("layout/fragment_real_time_heartrate_0".equals(tag)) {
                    return new C25086f(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "The tag for fragment_real_time_heartrate is invalid. Received: "));
            case 4:
                if ("layout/fragment_real_time_map_0".equals(tag)) {
                    return new C25088h(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "The tag for fragment_real_time_map is invalid. Received: "));
            case 5:
                if ("layout/fragment_realtime_sleep_0".equals(tag)) {
                    return new C25090j(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "The tag for fragment_realtime_sleep is invalid. Received: "));
            case 6:
                if ("layout/fragment_select_activity_0".equals(tag)) {
                    return new C25092l(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "The tag for fragment_select_activity is invalid. Received: "));
            case 7:
                if ("layout/layout_gps_map_0".equals(tag)) {
                    return new C25094n(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "The tag for layout_gps_map is invalid. Received: "));
            case 8:
                if ("layout/layout_gps_map_fragment_activity_0".equals(tag)) {
                    return new C25096p(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "The tag for layout_gps_map_fragment_activity is invalid. Received: "));
            case 9:
                if ("layout/view_daystrain_0".equals(tag)) {
                    return new C25098r(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "The tag for view_daystrain is invalid. Received: "));
            case 10:
                if ("layout/view_real_time_strain_range_0".equals(tag)) {
                    return new C25100t(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "The tag for view_real_time_strain_range is invalid. Received: "));
            case 11:
                if ("layout/view_realtime_cell_0".equals(tag)) {
                    return new C25102v(interfaceC1176f, new View[]{view});
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "The tag for view_realtime_cell is invalid. Received: "));
            case 12:
                if ("layout/view_rtstrain_range_segment_0".equals(tag)) {
                    return new C25104x(interfaceC1176f, new View[]{view});
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "The tag for view_rtstrain_range_segment is invalid. Received: "));
            default:
                return null;
        }
    }

    @Override // androidx.databinding.AbstractC1175e
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = C9834a.f28734a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.AbstractC1175e
    public AbstractC1168a0 getDataBinder(InterfaceC1176f interfaceC1176f, View[] viewArr, int i13) {
        int i14;
        if (viewArr != null && viewArr.length != 0 && (i14 = f28733a.get(i13)) > 0) {
            Object tag = viewArr[0].getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            if (i14 == 11) {
                if ("layout/view_realtime_cell_0".equals(tag)) {
                    return new C25102v(interfaceC1176f, viewArr);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "The tag for view_realtime_cell is invalid. Received: "));
            }
            if (i14 == 12) {
                if ("layout/view_rtstrain_range_segment_0".equals(tag)) {
                    return new C25104x(interfaceC1176f, viewArr);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "The tag for view_rtstrain_range_segment is invalid. Received: "));
            }
        }
        return null;
    }
}
