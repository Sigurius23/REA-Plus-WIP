package p108e4;

import ad3.C0783z;
import androidx.compose.p018ui.Modifier;
import androidx.constraintlayout.core.parser.CLParsingException;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import m83.AbstractC25265s;
import p210i4.AbstractC18061c;
import p210i4.C18065g;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: e4.k */
/* JADX INFO: loaded from: classes.dex */
public final class C12677k {

    /* JADX INFO: renamed from: a */
    public final C18065g f43348a;

    /* JADX INFO: renamed from: b */
    public int f43349b;

    /* JADX INFO: renamed from: c */
    public final int f43350c;

    /* JADX INFO: renamed from: d */
    public int f43351d;

    /* JADX INFO: renamed from: e */
    public C0783z f43352e;

    /* JADX INFO: renamed from: f */
    public int f43353f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f43354g;

    public C12677k() {
        new ArrayList();
        this.f43348a = new C18065g(new char[0]);
        this.f43350c = 1000;
        this.f43351d = 1000;
        this.f43353f = 0;
        this.f43354g = new ArrayList();
    }

    /* JADX INFO: renamed from: b */
    public static Modifier m35476b(Modifier modifier, C12672f c12672f, Function1 function1) {
        return modifier.mo3471e(new C12676j(c12672f, function1));
    }

    /* JADX INFO: renamed from: a */
    public final C18065g m35477a(AbstractC12683q abstractC12683q) {
        String string = abstractC12683q.mo35474a().toString();
        C18065g c18065g = this.f43348a;
        AbstractC18061c abstractC18061cM51901u = c18065g.m51901u(string);
        if ((abstractC18061cM51901u instanceof C18065g ? (C18065g) abstractC18061cM51901u : null) == null) {
            c18065g.m51891B(string, new C18065g(new char[0]));
        }
        AbstractC18061c abstractC18061cM51896o = c18065g.m51896o(string);
        if (abstractC18061cM51896o instanceof C18065g) {
            return (C18065g) abstractC18061cM51896o;
        }
        StringBuilder sbM53375p = AbstractC18489d0.m53375p("no object found for key <", string, ">, found [");
        sbM53375p.append(abstractC18061cM51896o.m51909f());
        sbM53375p.append("] : ");
        sbM53375p.append(abstractC18061cM51896o);
        throw new CLParsingException(sbM53375p.toString(), c18065g);
    }

    /* JADX INFO: renamed from: c */
    public final C12672f m35478c() {
        int i13 = this.f43353f;
        this.f43353f = i13 + 1;
        ArrayList arrayList = this.f43354g;
        C12672f c12672f = (C12672f) AbstractC25265s.m74102I0(i13, arrayList);
        if (c12672f != null) {
            return c12672f;
        }
        C12672f c12672f2 = new C12672f(Integer.valueOf(this.f43353f));
        arrayList.add(c12672f2);
        return c12672f2;
    }

    /* JADX INFO: renamed from: d */
    public final C0783z m35479d() {
        C0783z c0783z = this.f43352e;
        if (c0783z != null) {
            return c0783z;
        }
        C0783z c0783z2 = new C0783z(this, 9);
        this.f43352e = c0783z2;
        return c0783z2;
    }

    /* JADX INFO: renamed from: e */
    public final void m35480e() {
        this.f43348a.f70145E.clear();
        this.f43351d = this.f43350c;
        this.f43349b = 0;
        this.f43353f = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12677k)) {
            return false;
        }
        return AbstractC22676k.m65745e(this.f43348a, ((C12677k) obj).f43348a);
    }

    public final int hashCode() {
        return this.f43348a.hashCode();
    }
}
