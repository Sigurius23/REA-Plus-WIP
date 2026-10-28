package androidx.databinding.library.baseAdapters;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1175e;
import androidx.databinding.InterfaceC1176f;
import java.util.ArrayList;
import java.util.List;
import p638y5.AbstractC39231a;

/* JADX INFO: loaded from: classes.dex */
public class DataBinderMapperImpl extends AbstractC1175e {

    /* JADX INFO: renamed from: a */
    public static final SparseIntArray f5334a = new SparseIntArray(0);

    @Override // androidx.databinding.AbstractC1175e
    public final List collectDependencies() {
        return new ArrayList(0);
    }

    @Override // androidx.databinding.AbstractC1175e
    public final AbstractC1168a0 getDataBinder(InterfaceC1176f interfaceC1176f, View view, int i13) {
        if (f5334a.get(i13) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.AbstractC1175e
    public final int getLayoutId(String str) {
        Integer num = (Integer) AbstractC39231a.f168691a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.AbstractC1175e
    public final AbstractC1168a0 getDataBinder(InterfaceC1176f interfaceC1176f, View[] viewArr, int i13) {
        if (viewArr.length != 0 && f5334a.get(i13) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }
}
