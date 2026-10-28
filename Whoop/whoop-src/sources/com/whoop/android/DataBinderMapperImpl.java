package com.whoop.android;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1175e;
import androidx.databinding.InterfaceC1176f;
import androidx.health.platform.client.proto.C1533u;
import hi0.AbstractC17308f;
import ii0.C18535b;
import ii0.C18536b0;
import ii0.C18539d;
import ii0.C18540d0;
import ii0.C18543f;
import ii0.C18544f0;
import ii0.C18547h;
import ii0.C18548h0;
import ii0.C18551j;
import ii0.C18552j0;
import ii0.C18555l;
import ii0.C18556l0;
import ii0.C18558n;
import ii0.C18560p;
import ii0.C18562r;
import ii0.C18564t;
import ii0.C18566v;
import ii0.C18568x;
import ii0.C18570z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p319m4.AbstractC25012a;

/* JADX INFO: loaded from: classes.dex */
public class DataBinderMapperImpl extends AbstractC1175e {

    /* JADX INFO: renamed from: a */
    private static final SparseIntArray f23473a;

    /* JADX INFO: renamed from: com.whoop.android.DataBinderMapperImpl$a */
    /* JADX INFO: loaded from: classes7.dex */
    public static class C5988a {

        /* JADX INFO: renamed from: a */
        static final HashMap<String, Integer> f23474a;

        static {
            HashMap<String, Integer> map = new HashMap<>(19);
            f23474a = map;
            map.put("layout/activity_ble_choose_strap_0", Integer.valueOf(AbstractC17308f.f66879a));
            map.put("layout/activity_ble_connect_strap_0", Integer.valueOf(AbstractC17308f.f66880b));
            map.put("layout/activity_edit_device_name_0", Integer.valueOf(AbstractC17308f.f66881c));
            map.put("layout/activity_main_v2_0", Integer.valueOf(AbstractC17308f.f66882d));
            map.put("layout/connect_strap_network_error_view_0", Integer.valueOf(AbstractC17308f.f66883e));
            map.put("layout/fragment_advanced_settings_0", Integer.valueOf(AbstractC17308f.f66884f));
            map.put("layout/fragment_debug_iterable_0", Integer.valueOf(AbstractC17308f.f66885g));
            map.put("layout/fragment_gift_whoop_landing_0", Integer.valueOf(AbstractC17308f.f66886h));
            map.put("layout/fragment_push_debug_0", Integer.valueOf(AbstractC17308f.f66888j));
            map.put("layout/fragment_settings_landing_0", Integer.valueOf(AbstractC17308f.f66889k));
            map.put("layout/fragment_strap_settings_landing_0", Integer.valueOf(AbstractC17308f.f66890l));
            map.put("layout/fragment_strap_status_0", Integer.valueOf(AbstractC17308f.f66891m));
            map.put("layout/view_advanced_settings_item_0", Integer.valueOf(AbstractC17308f.f66895q));
            map.put("layout/view_allow_location_permissions_0", Integer.valueOf(AbstractC17308f.f66896r));
            map.put("layout/view_choose_gen4_bluetooth_device_0", Integer.valueOf(AbstractC17308f.f66897s));
            map.put("layout/view_enable_bluetooth_services_0", Integer.valueOf(AbstractC17308f.f66898t));
            map.put("layout/view_enable_location_services_0", Integer.valueOf(AbstractC17308f.f66899u));
            map.put("layout/view_loading_0", Integer.valueOf(AbstractC17308f.f66900v));
            map.put("layout/view_new_strap_settings_battery_0", Integer.valueOf(AbstractC17308f.f66901w));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(19);
        f23473a = sparseIntArray;
        sparseIntArray.put(AbstractC17308f.f66879a, 1);
        sparseIntArray.put(AbstractC17308f.f66880b, 2);
        sparseIntArray.put(AbstractC17308f.f66881c, 3);
        sparseIntArray.put(AbstractC17308f.f66882d, 4);
        sparseIntArray.put(AbstractC17308f.f66883e, 5);
        sparseIntArray.put(AbstractC17308f.f66884f, 6);
        sparseIntArray.put(AbstractC17308f.f66885g, 7);
        sparseIntArray.put(AbstractC17308f.f66886h, 8);
        sparseIntArray.put(AbstractC17308f.f66888j, 9);
        sparseIntArray.put(AbstractC17308f.f66889k, 10);
        sparseIntArray.put(AbstractC17308f.f66890l, 11);
        sparseIntArray.put(AbstractC17308f.f66891m, 12);
        sparseIntArray.put(AbstractC17308f.f66895q, 13);
        sparseIntArray.put(AbstractC17308f.f66896r, 14);
        sparseIntArray.put(AbstractC17308f.f66897s, 15);
        sparseIntArray.put(AbstractC17308f.f66898t, 16);
        sparseIntArray.put(AbstractC17308f.f66899u, 17);
        sparseIntArray.put(AbstractC17308f.f66900v, 18);
        sparseIntArray.put(AbstractC17308f.f66901w, 19);
    }

    @Override // androidx.databinding.AbstractC1175e
    public List<AbstractC1175e> collectDependencies() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.whoop.community.DataBinderMapperImpl());
        arrayList.add(new com.whoop.profile.DataBinderMapperImpl());
        arrayList.add(new com.whoop.realtime.DataBinderMapperImpl());
        arrayList.add(new com.whoop.settings.DataBinderMapperImpl());
        arrayList.add(new com.whoop.sleep.coach.DataBinderMapperImpl());
        arrayList.add(new com.whoop.whooplive.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.AbstractC1175e
    public AbstractC1168a0 getDataBinder(InterfaceC1176f interfaceC1176f, View view, int i13) {
        int i14 = f23473a.get(i13);
        if (i14 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        switch (i14) {
            case 1:
                if ("layout/activity_ble_choose_strap_0".equals(tag)) {
                    return new C18535b(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "The tag for activity_ble_choose_strap is invalid. Received: "));
            case 2:
                if ("layout/activity_ble_connect_strap_0".equals(tag)) {
                    return new C18539d(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "The tag for activity_ble_connect_strap is invalid. Received: "));
            case 3:
                if ("layout/activity_edit_device_name_0".equals(tag)) {
                    return new C18543f(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "The tag for activity_edit_device_name is invalid. Received: "));
            case 4:
                if ("layout/activity_main_v2_0".equals(tag)) {
                    return new C18547h(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "The tag for activity_main_v2 is invalid. Received: "));
            case 5:
                if ("layout/connect_strap_network_error_view_0".equals(tag)) {
                    return new C18551j(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "The tag for connect_strap_network_error_view is invalid. Received: "));
            case 6:
                if ("layout/fragment_advanced_settings_0".equals(tag)) {
                    return new C18555l(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "The tag for fragment_advanced_settings is invalid. Received: "));
            case 7:
                if ("layout/fragment_debug_iterable_0".equals(tag)) {
                    return new C18558n(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "The tag for fragment_debug_iterable is invalid. Received: "));
            case 8:
                if ("layout/fragment_gift_whoop_landing_0".equals(tag)) {
                    return new C18560p(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "The tag for fragment_gift_whoop_landing is invalid. Received: "));
            case 9:
                if ("layout/fragment_push_debug_0".equals(tag)) {
                    return new C18562r(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "The tag for fragment_push_debug is invalid. Received: "));
            case 10:
                if ("layout/fragment_settings_landing_0".equals(tag)) {
                    return new C18564t(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "The tag for fragment_settings_landing is invalid. Received: "));
            case 11:
                if ("layout/fragment_strap_settings_landing_0".equals(tag)) {
                    return new C18566v(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "The tag for fragment_strap_settings_landing is invalid. Received: "));
            case 12:
                if ("layout/fragment_strap_status_0".equals(tag)) {
                    return new C18568x(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "The tag for fragment_strap_status is invalid. Received: "));
            case 13:
                if ("layout/view_advanced_settings_item_0".equals(tag)) {
                    return new C18570z(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "The tag for view_advanced_settings_item is invalid. Received: "));
            case 14:
                if ("layout/view_allow_location_permissions_0".equals(tag)) {
                    return new C18536b0(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "The tag for view_allow_location_permissions is invalid. Received: "));
            case 15:
                if ("layout/view_choose_gen4_bluetooth_device_0".equals(tag)) {
                    return new C18540d0(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "The tag for view_choose_gen4_bluetooth_device is invalid. Received: "));
            case 16:
                if ("layout/view_enable_bluetooth_services_0".equals(tag)) {
                    return new C18544f0(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "The tag for view_enable_bluetooth_services is invalid. Received: "));
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                if ("layout/view_enable_location_services_0".equals(tag)) {
                    return new C18548h0(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "The tag for view_enable_location_services is invalid. Received: "));
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                if ("layout/view_loading_0".equals(tag)) {
                    return new C18552j0(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "The tag for view_loading is invalid. Received: "));
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                if ("layout/view_new_strap_settings_battery_0".equals(tag)) {
                    return new C18556l0(interfaceC1176f, view);
                }
                throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "The tag for view_new_strap_settings_battery is invalid. Received: "));
            default:
                return null;
        }
    }

    @Override // androidx.databinding.AbstractC1175e
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = C5988a.f23474a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.AbstractC1175e
    public AbstractC1168a0 getDataBinder(InterfaceC1176f interfaceC1176f, View[] viewArr, int i13) {
        if (viewArr == null || viewArr.length == 0 || f23473a.get(i13) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
