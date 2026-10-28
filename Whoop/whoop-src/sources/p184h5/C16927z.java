package p184h5;

import android.view.View;
import android.view.ViewGroup;
import d93.InterfaceC11820a;
import java.util.ArrayList;
import java.util.Iterator;
import m83.AbstractC25265s;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h5.z */
/* JADX INFO: loaded from: classes5.dex */
public class C16927z implements Iterator, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f64897w;

    /* JADX INFO: renamed from: x */
    public Iterator f64898x;

    /* JADX INFO: renamed from: y */
    public final Object f64899y;

    public C16927z(Iterator src, Function1 src2Dest) {
        this.f64897w = 1;
        AbstractC22676k.m65750j(src, "src");
        AbstractC22676k.m65750j(src2Dest, "src2Dest");
        this.f64898x = src;
        this.f64899y = src2Dest;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f64897w) {
            case 0:
                break;
        }
        return this.f64898x.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f64897w) {
            case 0:
                Object next = this.f64898x.next();
                ArrayList arrayList = (ArrayList) this.f64899y;
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                C16907r0 c16907r0 = viewGroup != null ? new C16907r0(viewGroup) : null;
                if (c16907r0 == null || !c16907r0.hasNext()) {
                    while (!this.f64898x.hasNext() && !arrayList.isEmpty()) {
                        this.f64898x = (Iterator) AbstractC25265s.m74112P0(arrayList);
                        AbstractC25265s.m74134l1(arrayList);
                    }
                } else {
                    arrayList.add(this.f64898x);
                    this.f64898x = c16907r0;
                }
                return next;
            default:
                return ((Function1) this.f64899y).invoke(this.f64898x.next());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        switch (this.f64897w) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C16927z(C16907r0 c16907r0) {
        this.f64897w = 0;
        this.f64899y = new ArrayList();
        this.f64898x = c16907r0;
    }
}
