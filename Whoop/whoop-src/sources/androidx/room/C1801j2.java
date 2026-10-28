package androidx.room;

import java.lang.ref.WeakReference;
import java.util.Set;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.room.j2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1801j2 extends AbstractC1826s {

    /* JADX INFO: renamed from: b */
    public final C1835v f7105b;

    /* JADX INFO: renamed from: c */
    public final WeakReference f7106c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1801j2(C1835v c1835v, C1819p1 delegate) {
        super(delegate.f7169a);
        AbstractC22676k.m65750j(delegate, "delegate");
        this.f7105b = c1835v;
        this.f7106c = new WeakReference(delegate);
    }

    @Override // androidx.room.AbstractC1826s
    /* JADX INFO: renamed from: a */
    public final void mo5361a(Set tables) {
        AbstractC22676k.m65750j(tables, "tables");
        AbstractC1826s abstractC1826s = (AbstractC1826s) this.f7106c.get();
        if (abstractC1826s == null) {
            this.f7105b.m5456c(this);
        } else {
            abstractC1826s.mo5361a(tables);
        }
    }
}
