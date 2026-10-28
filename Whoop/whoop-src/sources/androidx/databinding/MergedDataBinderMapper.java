package androidx.databinding;

import android.util.Log;
import android.view.View;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class MergedDataBinderMapper extends AbstractC1175e {

    /* JADX INFO: renamed from: a */
    public final HashSet f5316a = new HashSet();

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList f5317b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c */
    public final CopyOnWriteArrayList f5318c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: a */
    public final void m3715a(AbstractC1175e abstractC1175e) {
        if (this.f5316a.add(abstractC1175e.getClass())) {
            this.f5317b.add(abstractC1175e);
            Iterator it = abstractC1175e.collectDependencies().iterator();
            while (it.hasNext()) {
                m3715a((AbstractC1175e) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3716b() {
        CopyOnWriteArrayList<String> copyOnWriteArrayList = this.f5318c;
        boolean z4 = false;
        for (String str : copyOnWriteArrayList) {
            try {
                Class<?> cls = Class.forName(str);
                if (AbstractC1175e.class.isAssignableFrom(cls)) {
                    m3715a((AbstractC1175e) cls.newInstance());
                    copyOnWriteArrayList.remove(str);
                    z4 = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e5) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e5);
            } catch (InstantiationException e13) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e13);
            }
        }
        return z4;
    }

    @Override // androidx.databinding.AbstractC1175e
    public final AbstractC1168a0 getDataBinder(InterfaceC1176f interfaceC1176f, View view, int i13) {
        Iterator it = this.f5317b.iterator();
        while (it.hasNext()) {
            AbstractC1168a0 dataBinder = ((AbstractC1175e) it.next()).getDataBinder((InterfaceC1176f) null, view, i13);
            if (dataBinder != null) {
                return dataBinder;
            }
        }
        if (m3716b()) {
            return getDataBinder((InterfaceC1176f) null, view, i13);
        }
        return null;
    }

    @Override // androidx.databinding.AbstractC1175e
    public final int getLayoutId(String str) {
        Iterator it = this.f5317b.iterator();
        while (it.hasNext()) {
            int layoutId = ((AbstractC1175e) it.next()).getLayoutId(str);
            if (layoutId != 0) {
                return layoutId;
            }
        }
        if (m3716b()) {
            return getLayoutId(str);
        }
        return 0;
    }

    @Override // androidx.databinding.AbstractC1175e
    public final AbstractC1168a0 getDataBinder(InterfaceC1176f interfaceC1176f, View[] viewArr, int i13) {
        Iterator it = this.f5317b.iterator();
        while (it.hasNext()) {
            AbstractC1168a0 dataBinder = ((AbstractC1175e) it.next()).getDataBinder((InterfaceC1176f) null, viewArr, i13);
            if (dataBinder != null) {
                return dataBinder;
            }
        }
        if (m3716b()) {
            return getDataBinder((InterfaceC1176f) null, viewArr, i13);
        }
        return null;
    }
}
