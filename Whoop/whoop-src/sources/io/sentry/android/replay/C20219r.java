package io.sentry.android.replay;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: io.sentry.android.replay.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C20219r extends ArrayList {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C20231t f75941w;

    public C20219r(C20231t c20231t) {
        this.f75941w = c20231t;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        View element = (View) obj;
        AbstractC22676k.m65750j(element, "element");
        Iterator it = this.f75941w.f76008y.iterator();
        while (it.hasNext()) {
            ((InterfaceC20206g) it.next()).mo56124b(element, true);
        }
        return super.add(element);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        for (InterfaceC20206g interfaceC20206g : this.f75941w.f76008y) {
            Iterator it = elements.iterator();
            while (it.hasNext()) {
                interfaceC20206g.mo56124b((View) it.next(), true);
            }
        }
        return super.addAll(elements);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof View) {
            return super.contains((View) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof View) {
            return super.indexOf((View) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof View) {
            return super.lastIndexOf((View) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof View) {
            return super.remove((View) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object remove(int i13) {
        Object objRemove = super.remove(i13);
        AbstractC22676k.m65749i(objRemove, "removeAt(...)");
        View view = (View) objRemove;
        Iterator it = this.f75941w.f76008y.iterator();
        while (it.hasNext()) {
            ((InterfaceC20206g) it.next()).mo56124b(view, false);
        }
        return view;
    }
}
