package androidx.compose.material.ripple;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import bc3.AbstractC3006f0;
import c33.C3936c;
import c93.InterfaceC4339a;
import e93.AbstractC12889b;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.file.internal.C19683b;
import p002a0.C0047q0;
import p005a3.AbstractC0201g;
import p005a3.C0238p0;
import p005a3.InterfaceC0178a0;
import p005a3.InterfaceC0225m;
import p005a3.InterfaceC0245r;
import p007a6.C0410c;
import p026b2.AbstractC2316v;
import p181h2.C16617b;
import p181h2.C16620e;
import p208i2.AbstractC17876d;
import p208i2.InterfaceC17868a0;
import p208i2.InterfaceC17915v;
import p238j0.C21085k;
import p238j0.C21086l;
import p238j0.C21087m;
import p238j0.InterfaceC21083i;
import p238j0.InterfaceC21088n;
import p269k1.AbstractC22112c;
import p269k1.C22110a;
import p269k1.C22111b;
import p269k1.C22113d;
import p269k1.C22114e;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import v63.AbstractC35744b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Landroidx/compose/material/ripple/RippleNode;", "Lb2/v;", "La3/m;", "La3/r;", "La3/a0;", "Li2/a0;", "color", "Li2/a0;", "material-ripple"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public abstract class RippleNode extends AbstractC2316v implements InterfaceC0225m, InterfaceC0245r, InterfaceC0178a0 {

    /* JADX INFO: renamed from: O */
    public final InterfaceC21083i f4728O;

    /* JADX INFO: renamed from: P */
    public final boolean f4729P;

    /* JADX INFO: renamed from: Q */
    public final float f4730Q;

    /* JADX INFO: renamed from: R */
    public final InterfaceC4339a f4731R;

    /* JADX INFO: renamed from: S */
    public C3936c f4732S;

    /* JADX INFO: renamed from: T */
    public float f4733T;

    /* JADX INFO: renamed from: V */
    public boolean f4735V;
    private final InterfaceC17868a0 color;

    /* JADX INFO: renamed from: U */
    public long f4734U = 0;

    /* JADX INFO: renamed from: W */
    public final C0047q0 f4736W = new C0047q0();

    public RippleNode(InterfaceC21083i interfaceC21083i, boolean z4, float f13, InterfaceC17868a0 interfaceC17868a0, InterfaceC4339a interfaceC4339a) {
        this.f4728O = interfaceC21083i;
        this.f4729P = z4;
        this.f4730Q = f13;
        this.color = interfaceC17868a0;
        this.f4731R = interfaceC4339a;
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: M0 */
    public final boolean mo3462M0() {
        return false;
    }

    @Override // p005a3.InterfaceC0245r
    /* JADX INFO: renamed from: O */
    public final void mo459O(C0238p0 c0238p0) throws Throwable {
        c0238p0.m728a();
        C3936c c3936c = this.f4732S;
        if (c3936c != null) {
            c3936c.m11987d(c0238p0, this.f4733T, this.color.mo3457a());
        }
        C22110a c22110a = (C22110a) this;
        InterfaceC17915v interfaceC17915vM716w = c0238p0.f815w.f85852x.m716w();
        C22114e c22114e = c22110a.f85789Y;
        if (c22114e != null) {
            c22114e.m63320e(c22110a.f4734U, AbstractC12889b.m36258X(c22110a.f4733T), c22110a.color.mo3457a(), ((C22111b) c22110a.f4731R.invoke()).f85793d);
            c22114e.draw(AbstractC17876d.m51433a(interfaceC17915vM716w));
        }
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: P0 */
    public final void mo285P0() {
        AbstractC3006f0.m8732z(m7158L0(), null, null, new C0410c(this, null, 22), 3);
    }

    /* JADX INFO: renamed from: X0 */
    public final void m3463X0(InterfaceC21088n interfaceC21088n) throws Throwable {
        C22114e c22114e;
        if (!(interfaceC21088n instanceof C21086l)) {
            if (interfaceC21088n instanceof C21087m) {
                C22114e c22114e2 = ((C22110a) this).f85789Y;
                if (c22114e2 != null) {
                    c22114e2.m63319d();
                    return;
                }
                return;
            }
            if (!(interfaceC21088n instanceof C21085k) || (c22114e = ((C22110a) this).f85789Y) == null) {
                return;
            }
            c22114e.m63319d();
            return;
        }
        C21086l c21086l = (C21086l) interfaceC21088n;
        long j7 = this.f4734U;
        float f13 = this.f4733T;
        C22110a c22110a = (C22110a) this;
        C22113d c22113d = c22110a.f85788X;
        if (c22113d == null) {
            Object obj = (View) AbstractC0201g.m506f(c22110a, AndroidCompositionLocals_androidKt.f4980f);
            while (!(obj instanceof ViewGroup)) {
                ViewParent parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    throw new IllegalArgumentException(AbstractC18489d0.m53369j(obj, "Couldn't find a valid parent for ", ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount) {
                    C22113d c22113d2 = new C22113d(viewGroup.getContext());
                    viewGroup.addView(c22113d2);
                    c22113d = c22113d2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i13);
                    if (childAt instanceof C22113d) {
                        c22113d = (C22113d) childAt;
                        break;
                    }
                    i13++;
                }
            }
            c22110a.f85788X = c22113d;
        }
        C22114e c22114eM63315b = c22113d.m63315b(c22110a);
        c22114eM63315b.m63317b(c21086l, c22110a.f4729P, j7, AbstractC12889b.m36258X(f13), c22110a.color.mo3457a(), ((C22111b) c22110a.f4731R.invoke()).f85793d, new C19683b(c22110a, 14));
        c22110a.f85789Y = c22114eM63315b;
        AbstractC0201g.m508h(c22110a);
    }

    @Override // p005a3.InterfaceC0178a0
    /* JADX INFO: renamed from: g */
    public final void mo423g(long j7) throws Throwable {
        float fMo743q0;
        this.f4735V = true;
        InterfaceC39171c interfaceC39171c = AbstractC0201g.m516p(this).f776X;
        this.f4734U = AbstractC35744b.m113239l(j7);
        float f13 = this.f4730Q;
        if (Float.isNaN(f13)) {
            long j13 = this.f4734U;
            float f14 = AbstractC22112c.f85794a;
            fMo743q0 = C16617b.m47188d(AbstractC15751g.m44450c(C16620e.m47213e(j13), C16620e.m47211c(j13))) / 2.0f;
            if (this.f4729P) {
                fMo743q0 += interfaceC39171c.mo743q0(AbstractC22112c.f85794a);
            }
        } else {
            fMo743q0 = interfaceC39171c.mo743q0(f13);
        }
        this.f4733T = fMo743q0;
        C0047q0 c0047q0 = this.f4736W;
        Object[] objArr = c0047q0.f136a;
        int i13 = c0047q0.f137b;
        for (int i14 = 0; i14 < i13; i14++) {
            m3463X0((InterfaceC21088n) objArr[i14]);
        }
        c0047q0.m100c();
    }
}
