package ch;

import bh.InterfaceC3242e;
import java.util.Arrays;
import kh.C22467a;
import mh.C25542j;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p437qt.C30582e;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: ch.l */
/* JADX INFO: loaded from: classes.dex */
public final class C4591l {

    /* JADX INFO: renamed from: a */
    public final Object f18474a;

    /* JADX INFO: renamed from: b */
    public final C30582e f18475b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3242e f18476c;

    public C4591l(Object obj, C30582e c30582e, InterfaceC3242e interfaceC3242e) {
        this.f18474a = obj;
        this.f18475b = c30582e;
        this.f18476c = interfaceC3242e;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    public final boolean equals(Object obj) {
        boolean zM65745e;
        if (this != obj) {
            if (obj instanceof C4591l) {
                C4591l c4591l = (C4591l) obj;
                Object obj2 = c4591l.f18474a;
                this.f18475b.getClass();
                Object obj3 = this.f18474a;
                if (obj3 == obj2) {
                    zM65745e = true;
                } else if ((obj3 instanceof C25542j) && (obj2 instanceof C25542j)) {
                    C25542j c25542j = (C25542j) obj3;
                    C25542j c25542j2 = (C25542j) obj2;
                    if (AbstractC22676k.m65745e(c25542j.f100108a, c25542j2.f100108a) && c25542j.f100109b.equals(c25542j2.f100109b) && AbstractC22676k.m65745e(c25542j.f100112e, c25542j2.f100112e) && c25542j.f100113f == c25542j2.f100113f && AbstractC22676k.m65745e(c25542j.f100116i, c25542j2.f100116i) && AbstractC22676k.m65745e(c25542j.f100118k, c25542j2.f100118k) && c25542j.f100120m == c25542j2.f100120m && c25542j.f100121n == c25542j2.f100121n && c25542j.f100122o == c25542j2.f100122o && c25542j.f100123p == c25542j2.f100123p && c25542j.f100124q == c25542j2.f100124q && c25542j.f100125r == c25542j2.f100125r && c25542j.f100126s == c25542j2.f100126s && c25542j.f100132y.equals(c25542j2.f100132y) && c25542j.f100133z == c25542j2.f100133z && c25542j.f100114g == c25542j2.f100114g && c25542j.f100102A.equals(c25542j2.f100102A)) {
                        zM65745e = true;
                    } else {
                        zM65745e = false;
                    }
                } else {
                    zM65745e = AbstractC22676k.m65745e(obj3, obj2);
                }
                if (!zM65745e || !AbstractC22676k.m65745e(this.f18476c, c4591l.f18476c)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        this.f18475b.getClass();
        Object obj = this.f18474a;
        int iHashCode = 0;
        if (obj instanceof C25542j) {
            C25542j c25542j = (C25542j) obj;
            int iM106644c = AbstractC33745d.m106644c(c25542j.f100108a.hashCode() * 31, 961, c25542j.f100109b);
            C22467a c22467a = c25542j.f100112e;
            iHashCode = c25542j.f100102A.f100151w.hashCode() + ((c25542j.f100114g.hashCode() + ((c25542j.f100133z.hashCode() + ((c25542j.f100132y.hashCode() + ((c25542j.f100126s.hashCode() + ((c25542j.f100125r.hashCode() + ((c25542j.f100124q.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((AbstractC11895b.m31983b((c25542j.f100113f.hashCode() + ((iM106644c + (c22467a != null ? c22467a.hashCode() : 0)) * 961)) * 961, 31, c25542j.f100116i) + Arrays.hashCode(c25542j.f100118k.f146548w)) * 31, 31, c25542j.f100120m), 31, c25542j.f100121n), 31, c25542j.f100122o), 31, c25542j.f100123p)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        } else if (obj != null) {
            iHashCode = obj.hashCode();
        }
        return this.f18476c.hashCode() + (iHashCode * 31);
    }
}
