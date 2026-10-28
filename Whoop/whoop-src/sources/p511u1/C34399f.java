package p511u1;

import androidx.room.AbstractC1772c1;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;

/* JADX INFO: renamed from: u1.f */
/* JADX INFO: loaded from: classes5.dex */
public class C34399f extends AbstractC34397d {

    /* JADX INFO: renamed from: E */
    public Object f144613E;

    /* JADX INFO: renamed from: F */
    public boolean f144614F;

    /* JADX INFO: renamed from: G */
    public int f144615G;

    /* JADX INFO: renamed from: z */
    public final C34398e f144616z;

    public C34399f(C34398e c34398e, AbstractC34409p[] abstractC34409pArr) {
        super(c34398e.f144611y, abstractC34409pArr);
        this.f144616z = c34398e;
        this.f144615G = c34398e.f144607E;
    }

    /* JADX INFO: renamed from: c */
    public final void m108765c(int i13, C34408o c34408o, Object obj, int i14) {
        int i15 = i14 * 5;
        AbstractC34409p[] abstractC34409pArr = this.f144604w;
        if (i15 <= 30) {
            int iM5367B = 1 << AbstractC1772c1.m5367B(i13, i15);
            if (c34408o.m108774h(iM5367B)) {
                abstractC34409pArr[i14].m108790a(Integer.bitCount(c34408o.f144624a) * 2, c34408o.m108772f(iM5367B), c34408o.f144627d);
                this.f144605x = i14;
                return;
            }
            int iM108785t = c34408o.m108785t(iM5367B);
            C34408o c34408oM108784s = c34408o.m108784s(iM108785t);
            abstractC34409pArr[i14].m108790a(Integer.bitCount(c34408o.f144624a) * 2, iM108785t, c34408o.f144627d);
            m108765c(i13, c34408oM108784s, obj, i14 + 1);
            return;
        }
        AbstractC34409p abstractC34409p = abstractC34409pArr[i14];
        Object[] objArr = c34408o.f144627d;
        abstractC34409p.m108790a(objArr.length, 0, objArr);
        while (true) {
            AbstractC34409p abstractC34409p2 = abstractC34409pArr[i14];
            if (AbstractC22676k.m65745e(abstractC34409p2.f144628w[abstractC34409p2.f144630y], obj)) {
                this.f144605x = i14;
                return;
            } else {
                abstractC34409pArr[i14].f144630y += 2;
            }
        }
    }

    @Override // p511u1.AbstractC34397d, java.util.Iterator
    public final Object next() {
        if (this.f144616z.f144607E != this.f144615G) {
            throw new ConcurrentModificationException();
        }
        if (!this.f144606y) {
            throw new NoSuchElementException();
        }
        AbstractC34409p abstractC34409p = this.f144604w[this.f144605x];
        this.f144613E = abstractC34409p.f144628w[abstractC34409p.f144630y];
        this.f144614F = true;
        return super.next();
    }

    @Override // p511u1.AbstractC34397d, java.util.Iterator
    public final void remove() {
        if (!this.f144614F) {
            throw new IllegalStateException();
        }
        boolean z4 = this.f144606y;
        C34398e c34398e = this.f144616z;
        if (!z4) {
            AbstractC22681m0.m65772c(c34398e).remove(this.f144613E);
        } else {
            if (!z4) {
                throw new NoSuchElementException();
            }
            AbstractC34409p abstractC34409p = this.f144604w[this.f144605x];
            Object obj = abstractC34409p.f144628w[abstractC34409p.f144630y];
            AbstractC22681m0.m65772c(c34398e).remove(this.f144613E);
            m108765c(obj != null ? obj.hashCode() : 0, c34398e.f144611y, obj, 0);
        }
        this.f144613E = null;
        this.f144614F = false;
        this.f144615G = c34398e.f144607E;
    }
}
