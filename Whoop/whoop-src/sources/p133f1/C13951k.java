package p133f1;

import com.whoop.profile.view.edit.C9790n;
import java.util.List;
import java.util.NoSuchElementException;
import p002a0.AbstractC0058w;
import p002a0.C0029i0;
import p002a0.C0035k0;
import p088dc.AbstractC11895b;
import p268k0.AbstractC22086a;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: f1.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C13951k implements InterfaceC13970q0 {

    /* JADX INFO: renamed from: a */
    public final C0029i0 f49728a;

    /* JADX INFO: renamed from: b */
    public final List f49729b;

    /* JADX INFO: renamed from: c */
    public final int f49730c;

    /* JADX INFO: renamed from: d */
    public final int f49731d;

    /* JADX INFO: renamed from: e */
    public final boolean f49732e;

    /* JADX INFO: renamed from: f */
    public final C13981u f49733f;

    public C13951k(C0029i0 c0029i0, List list, int i13, int i14, boolean z4, C13981u c13981u) {
        this.f49728a = c0029i0;
        this.f49729b = list;
        this.f49730c = i13;
        this.f49731d = i14;
        this.f49732e = z4;
        this.f49733f = c13981u;
        if (list.size() > 1) {
            return;
        }
        AbstractC22086a.m63160c("MultiSelectionLayout requires an infoList size greater than 1, was " + list.size() + '.');
    }

    /* JADX INFO: renamed from: m */
    public static void m39730m(C0035k0 c0035k0, C13981u c13981u, C13972r c13972r, int i13, int i14) {
        C13981u c13981u2;
        if (c13981u.f49881c) {
            c13981u2 = new C13981u(c13972r.m39768a(i14), c13972r.m39768a(i13), i14 > i13);
        } else {
            c13981u2 = new C13981u(c13972r.m39768a(i13), c13972r.m39768a(i14), i13 > i14);
        }
        if (i13 > i14) {
            AbstractC22086a.m63160c("minOffset should be less than or equal to maxOffset: " + c13981u2);
        }
        long j7 = c13972r.f49815a;
        int iM79c = c0035k0.m79c(j7);
        Object[] objArr = c0035k0.f101c;
        Object obj = objArr[iM79c];
        c0035k0.f100b[iM79c] = j7;
        objArr[iM79c] = c13981u2;
    }

    @Override // p133f1.InterfaceC13970q0
    /* JADX INFO: renamed from: a */
    public final boolean mo39698a() {
        return this.f49732e;
    }

    @Override // p133f1.InterfaceC13970q0
    /* JADX INFO: renamed from: b */
    public final C13972r mo39699b() {
        return this.f49732e ? mo39708k() : mo39707j();
    }

    @Override // p133f1.InterfaceC13970q0
    /* JADX INFO: renamed from: c */
    public final C13972r mo39700c() {
        return mo39702e() == EnumC13939g.f49690w ? mo39707j() : mo39708k();
    }

    @Override // p133f1.InterfaceC13970q0
    /* JADX INFO: renamed from: d */
    public final int mo39701d() {
        return this.f49731d;
    }

    @Override // p133f1.InterfaceC13970q0
    /* JADX INFO: renamed from: e */
    public final EnumC13939g mo39702e() {
        int i13 = this.f49730c;
        int i14 = this.f49731d;
        if (i13 < i14) {
            return EnumC13939g.f49691x;
        }
        if (i13 > i14) {
            return EnumC13939g.f49690w;
        }
        return ((C13972r) this.f49729b.get(i13 / 2)).m39769b();
    }

    @Override // p133f1.InterfaceC13970q0
    /* JADX INFO: renamed from: f */
    public final boolean mo39703f(InterfaceC13970q0 interfaceC13970q0) {
        if (this.f49733f != null && interfaceC13970q0 != null && (interfaceC13970q0 instanceof C13951k)) {
            C13951k c13951k = (C13951k) interfaceC13970q0;
            List list = c13951k.f49729b;
            if (this.f49732e == c13951k.f49732e && this.f49730c == c13951k.f49730c && this.f49731d == c13951k.f49731d) {
                List list2 = this.f49729b;
                if (list2.size() == list.size()) {
                    int size = list2.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        C13972r c13972r = (C13972r) list2.get(i13);
                        C13972r c13972r2 = (C13972r) list.get(i13);
                        if (c13972r.f49815a != c13972r2.f49815a || c13972r.f49817c != c13972r2.f49817c || c13972r.f49818d != c13972r2.f49818d) {
                            return true;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override // p133f1.InterfaceC13970q0
    /* JADX INFO: renamed from: g */
    public final void mo39704g(Function1 function1) {
        int iM39731n = m39731n(mo39700c().f49815a);
        int iM39731n2 = m39731n((mo39702e() == EnumC13939g.f49690w ? mo39708k() : mo39707j()).f49815a);
        int i13 = iM39731n + 1;
        if (i13 >= iM39731n2) {
            return;
        }
        while (i13 < iM39731n2) {
            function1.invoke(this.f49729b.get(i13));
            i13++;
        }
    }

    @Override // p133f1.InterfaceC13970q0
    public final int getSize() {
        return this.f49729b.size();
    }

    @Override // p133f1.InterfaceC13970q0
    /* JADX INFO: renamed from: h */
    public final C0035k0 mo39705h(C13981u c13981u) {
        C13978t c13978t = c13981u.f49879a;
        boolean z4 = c13981u.f49881c;
        long j7 = c13978t.f49873c;
        int i13 = c13978t.f49872b;
        C13978t c13978t2 = c13981u.f49880b;
        long j13 = c13978t2.f49873c;
        int i14 = c13978t2.f49872b;
        if (j7 != j13) {
            C0035k0 c0035k0 = AbstractC0058w.f176a;
            C0035k0 c0035k1 = new C0035k0();
            m39730m(c0035k1, c13981u, mo39700c(), (z4 ? c13978t2 : c13978t).f49872b, mo39700c().f49820f.f92227a.f92216a.f92135x.length());
            mo39704g(new C9790n(this, c0035k1, c13981u));
            if (!z4) {
                c13978t = c13978t2;
            }
            m39730m(c0035k1, c13981u, mo39702e() == EnumC13939g.f49690w ? mo39708k() : mo39707j(), 0, c13978t.f49872b);
            return c0035k1;
        }
        if ((!z4 || i13 < i14) && (z4 || i13 > i14)) {
            AbstractC22086a.m63160c("unexpectedly miss-crossed selection: " + c13981u);
        }
        long j14 = c13978t.f49873c;
        C0035k0 c0035k2 = AbstractC0058w.f176a;
        C0035k0 c0035k3 = new C0035k0();
        c0035k3.m84h(j14, c13981u);
        return c0035k3;
    }

    @Override // p133f1.InterfaceC13970q0
    /* JADX INFO: renamed from: i */
    public final C13981u mo39706i() {
        return this.f49733f;
    }

    @Override // p133f1.InterfaceC13970q0
    /* JADX INFO: renamed from: j */
    public final C13972r mo39707j() {
        return (C13972r) this.f49729b.get(m39732o(this.f49731d, false));
    }

    @Override // p133f1.InterfaceC13970q0
    /* JADX INFO: renamed from: k */
    public final C13972r mo39708k() {
        return (C13972r) this.f49729b.get(m39732o(this.f49730c, true));
    }

    @Override // p133f1.InterfaceC13970q0
    /* JADX INFO: renamed from: l */
    public final int mo39709l() {
        return this.f49730c;
    }

    /* JADX INFO: renamed from: n */
    public final int m39731n(long j7) {
        try {
            return this.f49728a.m73c(j7);
        } catch (NoSuchElementException e5) {
            throw new IllegalStateException(AbstractC11895b.m31994m(j7, "Invalid selectableId: "), e5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public final int m39732o(int i13, boolean z4) {
        int iOrdinal = mo39702e().ordinal();
        boolean z13 = z4;
        if (iOrdinal == 0) {
            z13 = !z4 ? 1 : 0;
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return (i13 - (!z13)) / 2;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("MultiSelectionLayout(isStartHandle=");
        sb4.append(this.f49732e);
        sb4.append(", startPosition=");
        boolean z4 = true;
        float f13 = 2;
        sb4.append((this.f49730c + 1) / f13);
        sb4.append(", endPosition=");
        sb4.append((this.f49731d + 1) / f13);
        sb4.append(", crossed=");
        sb4.append(mo39702e());
        sb4.append(", infos=");
        StringBuilder sb5 = new StringBuilder("[\n\t");
        List list = this.f49729b;
        int size = list.size();
        int i13 = 0;
        while (i13 < size) {
            C13972r c13972r = (C13972r) list.get(i13);
            if (z4) {
                z4 = false;
            } else {
                sb5.append(",\n\t");
            }
            StringBuilder sb6 = new StringBuilder();
            i13++;
            sb6.append(i13);
            sb6.append(" -> ");
            sb6.append(c13972r);
            sb5.append(sb6.toString());
        }
        sb5.append("\n]");
        String string = sb5.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        sb4.append(string);
        sb4.append(')');
        return sb4.toString();
    }
}
