package com.whoop.profile;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1175e;
import androidx.databinding.InterfaceC1176f;
import com.whoop.profile.databinding.FragmentMemberLevelsBindingImpl;
import com.whoop.profile.databinding.MemberLevelsCurrentViewBindingImpl;
import com.whoop.profile.databinding.ViewMemberLevelBindingImpl;
import com.whoop.profile.databinding.ViewOnboardingSegmentBarBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p319m4.AbstractC25012a;

/* JADX INFO: loaded from: classes4.dex */
public class DataBinderMapperImpl extends AbstractC1175e {
    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP;
    private static final int LAYOUT_FRAGMENTMEMBERLEVELS = 1;
    private static final int LAYOUT_MEMBERLEVELSCURRENTVIEW = 2;
    private static final int LAYOUT_VIEWMEMBERLEVEL = 3;
    private static final int LAYOUT_VIEWONBOARDINGSEGMENTBAR = 4;

    /* JADX INFO: loaded from: classes6.dex */
    public static class InnerBrLookup {
        static final SparseArray<String> sKeys;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            sKeys = sparseArray;
            sparseArray.put(0, "_all");
        }

        private InnerBrLookup() {
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static class InnerLayoutIdLookup {
        static final HashMap<String, Integer> sKeys;

        static {
            HashMap<String, Integer> map = new HashMap<>(4);
            sKeys = map;
            map.put("layout/fragment_member_levels_0", Integer.valueOf(C9691R.layout.fragment_member_levels));
            map.put("layout/member_levels_current_view_0", Integer.valueOf(C9691R.layout.member_levels_current_view));
            map.put("layout/view_member_level_0", Integer.valueOf(C9691R.layout.view_member_level));
            map.put("layout/view_onboarding_segment_bar_0", Integer.valueOf(C9691R.layout.view_onboarding_segment_bar));
        }

        private InnerLayoutIdLookup() {
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        INTERNAL_LAYOUT_ID_LOOKUP = sparseIntArray;
        sparseIntArray.put(C9691R.layout.fragment_member_levels, 1);
        sparseIntArray.put(C9691R.layout.member_levels_current_view, 2);
        sparseIntArray.put(C9691R.layout.view_member_level, 3);
        sparseIntArray.put(C9691R.layout.view_onboarding_segment_bar, 4);
    }

    @Override // androidx.databinding.AbstractC1175e
    public List<AbstractC1175e> collectDependencies() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    public String convertBrIdToString(int i13) {
        return InnerBrLookup.sKeys.get(i13);
    }

    @Override // androidx.databinding.AbstractC1175e
    public AbstractC1168a0 getDataBinder(InterfaceC1176f interfaceC1176f, View view, int i13) {
        int i14 = INTERNAL_LAYOUT_ID_LOOKUP.get(i13);
        if (i14 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i14 == 1) {
            if ("layout/fragment_member_levels_0".equals(tag)) {
                return new FragmentMemberLevelsBindingImpl(interfaceC1176f, view);
            }
            throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "The tag for fragment_member_levels is invalid. Received: "));
        }
        if (i14 == 2) {
            if ("layout/member_levels_current_view_0".equals(tag)) {
                return new MemberLevelsCurrentViewBindingImpl(interfaceC1176f, view);
            }
            throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "The tag for member_levels_current_view is invalid. Received: "));
        }
        if (i14 == 3) {
            if ("layout/view_member_level_0".equals(tag)) {
                return new ViewMemberLevelBindingImpl(interfaceC1176f, view);
            }
            throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "The tag for view_member_level is invalid. Received: "));
        }
        if (i14 != 4) {
            return null;
        }
        if ("layout/view_onboarding_segment_bar_0".equals(tag)) {
            return new ViewOnboardingSegmentBarBindingImpl(interfaceC1176f, view);
        }
        throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "The tag for view_onboarding_segment_bar is invalid. Received: "));
    }

    @Override // androidx.databinding.AbstractC1175e
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = InnerLayoutIdLookup.sKeys.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.AbstractC1175e
    public AbstractC1168a0 getDataBinder(InterfaceC1176f interfaceC1176f, View[] viewArr, int i13) {
        if (viewArr == null || viewArr.length == 0 || INTERNAL_LAYOUT_ID_LOOKUP.get(i13) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
