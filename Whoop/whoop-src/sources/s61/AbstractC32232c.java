package s61;

import a11.C0127e;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import i71.C18204h;
import i71.InterfaceC18203g;
import i91.AbstractC18254h;
import i91.AbstractC18255i;
import i91.C18251e;
import i91.C18253g;
import j93.AbstractC21478l0;
import java.util.List;
import k61.C22230c;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2314t;
import p181h2.C16617b;
import p208i2.InterfaceC17910s0;
import p270k2.C22135i;
import p270k2.InterfaceC22131e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import u61.C34552a;

/* JADX INFO: renamed from: s61.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lk61/c;", "strokeState", "Lu61/a;", "segment", "Li71/h;", "scrollPosition", "Li71/g;", "dataScroller", "Ll83/a0;", "c", "(Lk61/c;Lu61/a;Li71/h;Li71/g;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32232c {
    /* JADX INFO: renamed from: c */
    public static final void m100273c(final C22230c strokeState, final C34552a segment, final C18204h scrollPosition, final InterfaceC18203g dataScroller, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(strokeState, "strokeState");
        AbstractC22676k.m65750j(segment, "segment");
        AbstractC22676k.m65750j(scrollPosition, "scrollPosition");
        AbstractC22676k.m65750j(dataScroller, "dataScroller");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(926132834);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(strokeState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(segment) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(scrollPosition) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= (i13 & 4096) == 0 ? c28655q.m87153g(dataScroller) : c28655q.m87157i(dataScroller) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        boolean z4 = false;
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            final AbstractC18254h abstractC18254hM52584a = AbstractC18255i.m52584a(strokeState.getBackground(), c28655q, 0);
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            boolean z13 = ((i14 & 14) == 4) | ((i14 & 896) == 256);
            if ((i14 & 7168) == 2048 || ((i14 & 4096) != 0 && c28655q.m87157i(dataScroller))) {
                z4 = true;
            }
            boolean zM87157i = z13 | z4 | c28655q.m87157i(segment) | c28655q.m87153g(abstractC18254hM52584a);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                Function1 function1 = new Function1() { // from class: s61.b
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC32232c.m100274d(strokeState, scrollPosition, dataScroller, segment, abstractC18254hM52584a, (InterfaceC22131e) obj);
                    }
                };
                c28655q.m87172p0(function1);
                objM87133R = function1;
            }
            AbstractC21478l0.m60421a(modifierM3407d, (Function1) objM87133R, c28655q, 6);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0127e(strokeState, segment, scrollPosition, dataScroller, i13, 19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m100274d(C22230c c22230c, C18204h c18204h, InterfaceC18203g interfaceC18203g, C34552a c34552a, AbstractC18254h abstractC18254h, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        C32233d c32233d = new C32233d(c22230c, c18204h, interfaceC18203g, Canvas);
        List<C16617b> listM100278c = c32233d.m100278c(c34552a, Canvas.mo731d());
        if (!listM100278c.isEmpty()) {
            InterfaceC17910s0 interfaceC17910s0M100280b = AbstractC32234e.m100280b(listM100278c);
            C22135i c22135iM100277b = c32233d.getStroke();
            if (abstractC18254h instanceof C18251e) {
                InterfaceC22131e.m63378L(Canvas, interfaceC17910s0M100280b, ((C18251e) abstractC18254h).getBrush(), 0.0f, c22135iM100277b, 52);
            } else {
                if (!(abstractC18254h instanceof C18253g)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC22131e.m63386z(Canvas, interfaceC17910s0M100280b, ((C18253g) abstractC18254h).getColor(), 0.0f, c22135iM100277b, 52);
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m100275e(C22230c c22230c, C34552a c34552a, C18204h c18204h, InterfaceC18203g interfaceC18203g, int i13, Composer composer, int i14) {
        m100273c(c22230c, c34552a, c18204h, interfaceC18203g, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
