package p210i4;

import java.util.Iterator;

/* JADX INFO: renamed from: i4.g */
/* JADX INFO: loaded from: classes.dex */
public final class C18065g extends AbstractC18060b implements Iterable {
    @Override // p210i4.AbstractC18060b
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C18065g mo51892a() {
        return (C18065g) super.mo51892a();
    }

    @Override // p210i4.AbstractC18060b, p210i4.AbstractC18061c
    public final Object clone() {
        return (C18065g) super.mo51892a();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C18064f(this);
    }
}
