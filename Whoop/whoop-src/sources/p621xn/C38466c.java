package p621xn;

import e73.C12803b;
import java.util.ArrayDeque;
import java.util.List;
import p010a9.AbstractC0576a;
import p309lo.AbstractC24543a;
import p465rm.C31559p;
import p654yn.AbstractC39668h;

/* JADX INFO: renamed from: xn.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C38466c extends AbstractC0576a implements InterfaceC38468e {

    /* JADX INFO: renamed from: E */
    public long f164742E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f164743F;

    /* JADX INFO: renamed from: G */
    public Object f164744G;

    /* JADX INFO: renamed from: y */
    public long f164745y;

    /* JADX INFO: renamed from: z */
    public InterfaceC38468e f164746z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38466c() {
        super(3);
        this.f164743F = 2;
    }

    @Override // p621xn.InterfaceC38468e, qa.InterfaceC30100e
    /* JADX INFO: renamed from: b */
    public final int mo1673b(long j7) {
        InterfaceC38468e interfaceC38468e = this.f164746z;
        interfaceC38468e.getClass();
        return interfaceC38468e.mo1673b(j7 - this.f164742E);
    }

    @Override // p621xn.InterfaceC38468e, qa.InterfaceC30100e
    /* JADX INFO: renamed from: d */
    public final List mo1674d(long j7) {
        InterfaceC38468e interfaceC38468e = this.f164746z;
        interfaceC38468e.getClass();
        return interfaceC38468e.mo1674d(j7 - this.f164742E);
    }

    @Override // p621xn.InterfaceC38468e, qa.InterfaceC30100e
    /* JADX INFO: renamed from: h */
    public final long mo1675h(int i13) {
        InterfaceC38468e interfaceC38468e = this.f164746z;
        interfaceC38468e.getClass();
        return interfaceC38468e.mo1675h(i13) + this.f164742E;
    }

    @Override // p621xn.InterfaceC38468e, qa.InterfaceC30100e
    /* JADX INFO: renamed from: j */
    public final int mo1676j() {
        InterfaceC38468e interfaceC38468e = this.f164746z;
        interfaceC38468e.getClass();
        return interfaceC38468e.mo1676j();
    }

    /* JADX INFO: renamed from: o */
    public final void m123260o() {
        switch (this.f164743F) {
            case 0:
                ArrayDeque arrayDeque = (ArrayDeque) ((C12803b) this.f164744G).f43825c;
                AbstractC24543a.m71573i(arrayDeque.size() < 2);
                AbstractC24543a.m71569e(!arrayDeque.contains(this));
                this.f2052x = 0;
                this.f164746z = null;
                arrayDeque.addFirst(this);
                return;
            case 1:
                AbstractC38467d abstractC38467d = (AbstractC38467d) this.f164744G;
                synchronized (abstractC38467d.f164748b) {
                    this.f2052x = 0;
                    this.f164746z = null;
                    C38466c[] c38466cArr = abstractC38467d.f164752f;
                    int i13 = abstractC38467d.f164754h;
                    abstractC38467d.f164754h = i13 + 1;
                    c38466cArr[i13] = this;
                    if (!abstractC38467d.f164749c.isEmpty() && abstractC38467d.f164754h > 0) {
                        abstractC38467d.f164748b.notify();
                    }
                    break;
                }
                return;
            default:
                AbstractC39668h abstractC39668h = (AbstractC39668h) ((C31559p) this.f164744G).f130337x;
                this.f2052x = 0;
                this.f164746z = null;
                abstractC39668h.f170712b.add(this);
                return;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m123261p(long j7, InterfaceC38468e interfaceC38468e, long j13) {
        this.f164745y = j7;
        this.f164746z = interfaceC38468e;
        if (j13 != Long.MAX_VALUE) {
            j7 = j13;
        }
        this.f164742E = j7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38466c(InterfaceC38469f interfaceC38469f, int i13) {
        super(3);
        this.f164743F = i13;
        this.f164744G = interfaceC38469f;
    }
}
