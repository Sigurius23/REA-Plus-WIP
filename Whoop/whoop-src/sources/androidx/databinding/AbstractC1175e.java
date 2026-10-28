package androidx.databinding;

import android.view.View;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: androidx.databinding.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1175e {
    public List collectDependencies() {
        return Collections.EMPTY_LIST;
    }

    public abstract AbstractC1168a0 getDataBinder(InterfaceC1176f interfaceC1176f, View view, int i13);

    public abstract AbstractC1168a0 getDataBinder(InterfaceC1176f interfaceC1176f, View[] viewArr, int i13);

    public abstract int getLayoutId(String str);
}
