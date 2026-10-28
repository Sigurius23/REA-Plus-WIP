package androidx.databinding;

import android.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p314m.AbstractActivityC24852m;
import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: androidx.databinding.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1177g {

    /* JADX INFO: renamed from: a */
    public static final DataBinderMapperImpl f5333a = new DataBinderMapperImpl();

    /* JADX INFO: renamed from: a */
    public static AbstractC1168a0 m3730a(View view) {
        AbstractC1168a0 binding = AbstractC1168a0.getBinding(view);
        if (binding != null) {
            return binding;
        }
        Object tag = view.getTag();
        if (!(tag instanceof String)) {
            throw new IllegalArgumentException("View is not a binding layout");
        }
        DataBinderMapperImpl dataBinderMapperImpl = f5333a;
        int layoutId = dataBinderMapperImpl.getLayoutId((String) tag);
        if (layoutId != 0) {
            return dataBinderMapperImpl.getDataBinder((InterfaceC1176f) null, view, layoutId);
        }
        throw new IllegalArgumentException(AbstractC25012a.m73375h(tag, "View is not a binding layout. Tag: "));
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC1168a0 m3731b(ViewGroup viewGroup, int i13, int i14) {
        int childCount = viewGroup.getChildCount();
        int i15 = childCount - i13;
        DataBinderMapperImpl dataBinderMapperImpl = f5333a;
        if (i15 == 1) {
            return dataBinderMapperImpl.getDataBinder((InterfaceC1176f) null, viewGroup.getChildAt(childCount - 1), i14);
        }
        View[] viewArr = new View[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            viewArr[i16] = viewGroup.getChildAt(i16 + i13);
        }
        return dataBinderMapperImpl.getDataBinder((InterfaceC1176f) null, viewArr, i14);
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC1168a0 m3732c(LayoutInflater layoutInflater, int i13, ViewGroup viewGroup, boolean z4) {
        boolean z13 = viewGroup != null && z4;
        return z13 ? m3731b(viewGroup, z13 ? viewGroup.getChildCount() : 0, i13) : f5333a.getDataBinder((InterfaceC1176f) null, layoutInflater.inflate(i13, viewGroup, z4), i13);
    }

    /* JADX INFO: renamed from: d */
    public static AbstractC1168a0 m3733d(AbstractActivityC24852m abstractActivityC24852m, int i13) {
        abstractActivityC24852m.setContentView(i13);
        return m3731b((ViewGroup) abstractActivityC24852m.getWindow().getDecorView().findViewById(R.id.content), 0, i13);
    }
}
