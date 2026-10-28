package p355o2;

import android.graphics.Path;
import java.util.List;
import l83.EnumC23463i;
import m83.C25271y;
import p208i2.AbstractC17897m;
import p208i2.AbstractC17911t;
import p208i2.C17891j;
import p208i2.C17895l;
import p270k2.C22135i;
import p270k2.InterfaceC22131e;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: o2.g */
/* JADX INFO: loaded from: classes.dex */
public final class C27434g extends AbstractC27425b0 {

    /* JADX INFO: renamed from: b */
    public AbstractC17911t f110562b;

    /* JADX INFO: renamed from: c */
    public float f110563c = 1.0f;

    /* JADX INFO: renamed from: d */
    public List f110564d;

    /* JADX INFO: renamed from: e */
    public float f110565e;

    /* JADX INFO: renamed from: f */
    public float f110566f;

    /* JADX INFO: renamed from: g */
    public AbstractC17911t f110567g;

    /* JADX INFO: renamed from: h */
    public int f110568h;

    /* JADX INFO: renamed from: i */
    public int f110569i;

    /* JADX INFO: renamed from: j */
    public float f110570j;

    /* JADX INFO: renamed from: k */
    public float f110571k;

    /* JADX INFO: renamed from: l */
    public float f110572l;

    /* JADX INFO: renamed from: m */
    public float f110573m;

    /* JADX INFO: renamed from: n */
    public boolean f110574n;

    /* JADX INFO: renamed from: o */
    public boolean f110575o;

    /* JADX INFO: renamed from: p */
    public boolean f110576p;

    /* JADX INFO: renamed from: q */
    public C22135i f110577q;

    /* JADX INFO: renamed from: r */
    public final C17891j f110578r;

    /* JADX INFO: renamed from: s */
    public C17891j f110579s;

    /* JADX INFO: renamed from: t */
    public final Object f110580t;

    public C27434g() {
        int i13 = AbstractC27433f0.f110561a;
        this.f110564d = C25271y.f99162w;
        this.f110565e = 1.0f;
        this.f110568h = 0;
        this.f110569i = 0;
        this.f110570j = 4.0f;
        this.f110572l = 1.0f;
        this.f110574n = true;
        this.f110575o = true;
        C17891j c17891jM51478a = AbstractC17897m.m51478a();
        this.f110578r = c17891jM51478a;
        this.f110579s = c17891jM51478a;
        this.f110580t = AbstractC30060g.m92087G(EnumC23463i.f92935y, C27432f.f110558x);
    }

    @Override // p355o2.AbstractC27425b0
    /* JADX INFO: renamed from: a */
    public final void mo82851a(InterfaceC22131e interfaceC22131e) {
        C22135i c22135i;
        if (this.f110574n) {
            AbstractC27422a.m82850d(this.f110564d, this.f110578r);
            m82861e();
        } else if (this.f110576p) {
            m82861e();
        }
        this.f110574n = false;
        this.f110576p = false;
        AbstractC17911t abstractC17911t = this.f110562b;
        if (abstractC17911t != null) {
            InterfaceC22131e.m63378L(interfaceC22131e, this.f110579s, abstractC17911t, this.f110563c, null, 56);
        }
        AbstractC17911t abstractC17911t2 = this.f110567g;
        if (abstractC17911t2 != null) {
            C22135i c22135i2 = this.f110577q;
            if (this.f110575o || c22135i2 == null) {
                C22135i c22135i3 = new C22135i(this.f110566f, this.f110570j, this.f110568h, this.f110569i, null, 16);
                this.f110577q = c22135i3;
                this.f110575o = false;
                c22135i = c22135i3;
            } else {
                c22135i = c22135i2;
            }
            InterfaceC22131e.m63378L(interfaceC22131e, this.f110579s, abstractC17911t2, this.f110565e, c22135i, 48);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, l83.h] */
    /* JADX INFO: renamed from: e */
    public final void m82861e() {
        float f13 = this.f110571k;
        C17891j c17891j = this.f110578r;
        if (f13 == 0.0f && this.f110572l == 1.0f) {
            this.f110579s = c17891j;
            return;
        }
        if (AbstractC22676k.m65745e(this.f110579s, c17891j)) {
            this.f110579s = AbstractC17897m.m51478a();
        } else {
            int i13 = this.f110579s.f69587a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
            this.f110579s.f69587a.rewind();
            this.f110579s.m51465l(i13);
        }
        ?? r10 = this.f110580t;
        ((C17895l) r10.getValue()).m51470c(c17891j);
        float fM51468a = ((C17895l) r10.getValue()).m51468a();
        float f14 = this.f110571k;
        float f15 = this.f110573m;
        float f16 = ((f14 + f15) % 1.0f) * fM51468a;
        float f17 = ((this.f110572l + f15) % 1.0f) * fM51468a;
        if (f16 <= f17) {
            ((C17895l) r10.getValue()).m51469b(f16, f17, this.f110579s);
        } else {
            ((C17895l) r10.getValue()).m51469b(f16, fM51468a, this.f110579s);
            ((C17895l) r10.getValue()).m51469b(0.0f, f17, this.f110579s);
        }
    }

    public final String toString() {
        return this.f110578r.toString();
    }
}
