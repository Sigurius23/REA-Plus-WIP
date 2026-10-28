package p690zr;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: zr.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C41034k extends C41010c implements ListIterator {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C41037l f177009E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41034k(C41037l c41037l) {
        super(c41037l);
        this.f177009E = c41037l;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C41037l c41037l = this.f177009E;
        boolean zIsEmpty = c41037l.isEmpty();
        m133266b().add(obj);
        c41037l.f177016F.f177047E++;
        if (zIsEmpty) {
            c41037l.m133267a();
        }
    }

    /* JADX INFO: renamed from: b */
    public final ListIterator m133266b() {
        m133235a();
        return (ListIterator) this.f176967x;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return m133266b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return m133266b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return m133266b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return m133266b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m133266b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41034k(C41037l c41037l, int i13) {
        super(c41037l, ((List) c41037l.f177018x).listIterator(i13));
        this.f177009E = c41037l;
    }
}
