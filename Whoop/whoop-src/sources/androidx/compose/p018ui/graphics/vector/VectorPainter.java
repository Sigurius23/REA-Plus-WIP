package androidx.compose.p018ui.graphics.vector;

import p000.AbstractC11266d;
import p005a3.C0222l0;
import p005a3.C0237p;
import p014aj.C0929d;
import p181h2.C16620e;
import p208i2.AbstractC17921y;
import p270k2.InterfaceC22131e;
import p331n2.AbstractC26165a;
import p355o2.C27424b;
import p355o2.C27429d0;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28633k1;
import p636y3.EnumC39181m;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Landroidx/compose/ui/graphics/vector/VectorPainter;", "Ln2/a;", "ui_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class VectorPainter extends AbstractC26165a {

    /* JADX INFO: renamed from: E */
    public final C28633k1 f4823E = AbstractC28683x.m87272z(new C16620e(0));

    /* JADX INFO: renamed from: F */
    public final C28633k1 f4824F = AbstractC28683x.m87272z(Boolean.FALSE);

    /* JADX INFO: renamed from: G */
    public final C27429d0 f4825G;

    /* JADX INFO: renamed from: H */
    public final C28621h1 f4826H;

    /* JADX INFO: renamed from: I */
    public float f4827I;

    /* JADX INFO: renamed from: J */
    public AbstractC17921y f4828J;

    /* JADX INFO: renamed from: K */
    public int f4829K;

    public VectorPainter(C27424b c27424b) {
        C27429d0 c27429d0 = new C27429d0(c27424b);
        c27429d0.f110528f = new C0222l0(this, 16);
        this.f4825G = c27429d0;
        this.f4826H = new C28621h1(0);
        this.f4827I = 1.0f;
        this.f4829K = -1;
    }

    @Override // p331n2.AbstractC26165a
    /* JADX INFO: renamed from: b */
    public final void mo3489b(float f13) {
        this.f4827I = f13;
    }

    @Override // p331n2.AbstractC26165a
    /* JADX INFO: renamed from: e */
    public final void mo3490e(AbstractC17921y abstractC17921y) {
        this.f4828J = abstractC17921y;
    }

    @Override // p331n2.AbstractC26165a
    /* JADX INFO: renamed from: h */
    public final long getF4822H() {
        return ((C16620e) this.f4823E.getValue()).f63951a;
    }

    @Override // p331n2.AbstractC26165a
    /* JADX INFO: renamed from: i */
    public final void mo3492i(InterfaceC22131e interfaceC22131e) {
        AbstractC17921y abstractC17921y = this.f4828J;
        C27429d0 c27429d0 = this.f4825G;
        if (abstractC17921y == null) {
            abstractC17921y = (AbstractC17921y) c27429d0.f110529g.getValue();
        }
        if (((Boolean) this.f4824F.getValue()).booleanValue() && interfaceC22131e.getLayoutDirection() == EnumC39181m.f168424x) {
            long jMo721B0 = interfaceC22131e.mo721B0();
            C0237p c0237pMo744t0 = interfaceC22131e.mo744t0();
            long jM670A = c0237pMo744t0.m670A();
            c0237pMo744t0.m716w().mo51426q();
            try {
                ((C0929d) c0237pMo744t0.f812x).m2359w(-1.0f, jMo721B0, 1.0f);
                c27429d0.m82860e(interfaceC22131e, this.f4827I, abstractC17921y);
                AbstractC11266d.m30472z(c0237pMo744t0, jM670A);
            } catch (Throwable th3) {
                AbstractC11266d.m30472z(c0237pMo744t0, jM670A);
                throw th3;
            }
        } else {
            c27429d0.m82860e(interfaceC22131e, this.f4827I, abstractC17921y);
        }
        this.f4829K = this.f4826H.m87024x();
    }
}
