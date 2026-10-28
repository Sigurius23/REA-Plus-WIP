package yb3;

import d93.InterfaceC11820a;
import e93.AbstractC12889b;
import i93.C18284j;
import java.util.Iterator;
import java.util.NoSuchElementException;
import l83.C23465k;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: yb3.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C39398b implements Iterator, InterfaceC11820a {

    /* JADX INFO: renamed from: E */
    public int f169553E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C39399c f169554F;

    /* JADX INFO: renamed from: w */
    public int f169555w = -1;

    /* JADX INFO: renamed from: x */
    public int f169556x;

    /* JADX INFO: renamed from: y */
    public int f169557y;

    /* JADX INFO: renamed from: z */
    public C18284j f169558z;

    public C39398b(C39399c c39399c) {
        this.f169554F = c39399c;
        int iM36284n = AbstractC12889b.m36284n(0, 0, c39399c.f169559a.length());
        this.f169556x = iM36284n;
        this.f169557y = iM36284n;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0022 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:18:0x0075  */
    /* JADX INFO: renamed from: a */
    public final void m125835a() {
        C23465k c23465k;
        int i13 = this.f169557y;
        if (i13 < 0) {
            this.f169555w = 0;
            this.f169558z = null;
            return;
        }
        C39399c c39399c = this.f169554F;
        int i14 = c39399c.f169560b;
        if (i14 > 0) {
            int i15 = this.f169553E + 1;
            this.f169553E = i15;
            if (i15 >= i14) {
                this.f169558z = new C18284j(this.f169556x, AbstractC39414r.m125884c0(c39399c.f169559a), 1);
                this.f169557y = -1;
            } else if (i13 > c39399c.f169559a.length() && (c23465k = (C23465k) c39399c.f169561c.invoke(c39399c.f169559a, Integer.valueOf(this.f169557y))) != null) {
                int iIntValue = ((Number) c23465k.f92937w).intValue();
                int iIntValue2 = ((Number) c23465k.f92938x).intValue();
                this.f169558z = AbstractC12889b.m36278i0(this.f169556x, iIntValue);
                int i16 = iIntValue + iIntValue2;
                this.f169556x = i16;
                this.f169557y = i16 + (iIntValue2 == 0 ? 1 : 0);
            } else {
                this.f169558z = new C18284j(this.f169556x, AbstractC39414r.m125884c0(c39399c.f169559a), 1);
                this.f169557y = -1;
            }
        } else if (i13 > c39399c.f169559a.length()) {
            this.f169558z = new C18284j(this.f169556x, AbstractC39414r.m125884c0(c39399c.f169559a), 1);
            this.f169557y = -1;
        } else {
            int iIntValue3 = ((Number) c23465k.f92937w).intValue();
            int iIntValue4 = ((Number) c23465k.f92938x).intValue();
            this.f169558z = AbstractC12889b.m36278i0(this.f169556x, iIntValue3);
            int i17 = iIntValue3 + iIntValue4;
            this.f169556x = i17;
            this.f169557y = i17 + (iIntValue4 == 0 ? 1 : 0);
        }
        this.f169555w = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f169555w == -1) {
            m125835a();
        }
        return this.f169555w == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f169555w == -1) {
            m125835a();
        }
        if (this.f169555w == 0) {
            throw new NoSuchElementException();
        }
        C18284j c18284j = this.f169558z;
        AbstractC22676k.m65748h(c18284j, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f169558z = null;
        this.f169555w = -1;
        return c18284j;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
