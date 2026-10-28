package qy0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.TextResource;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25297f;
import p730qt2.C30599e;
import p745y81.InterfaceC39332e;
import q51.C29979a;

/* JADX INFO: renamed from: qy0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lqy0/d;", "Lm91/f;", "Lqy0/h;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "modifier", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "c", "(Landroidx/compose/ui/Modifier;Lqy0/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30771d implements InterfaceC25297f<C30775h> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m94522d(Function1 function1, C30775h c30775h) {
        function1.invoke(c30775h.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m94523e(C30771d c30771d, Modifier modifier, C30775h c30775h, Function1 function1, int i13, Composer composer, int i14) {
        c30771d.Compose(modifier, c30775h, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    @Override // p720m91.InterfaceC25297f
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void Compose(Modifier modifier, C30775h itemState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-193063657);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(itemState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            TextResource textResourceM94568n = itemState.getLabel();
            InterfaceC39332e interfaceC39332eM94562h = itemState.getDateTextColor();
            InterfaceC39332e interfaceC39332eM94557b = itemState.getBackgroundColor();
            EnumC30774g enumC30774gM94571q = itemState.getViewCorners();
            InterfaceC39332e interfaceC39332eM94564j = itemState.getDotColor();
            InterfaceC39332e interfaceC39332eM94565k = itemState.getDotShadowColor();
            InterfaceC39332e interfaceC39332eM94563i = itemState.getDotBorderColor();
            boolean zM94567m = itemState.getIncreaseDotOffset();
            Float fM94566l = itemState.getDotSizeMultiplier();
            InterfaceC39332e interfaceC39332eM94559e = itemState.getDateBackgroundColor();
            InterfaceC39332e interfaceC39332eM94560f = itemState.getDateBorderColor();
            boolean z4 = false;
            boolean zM94569o = itemState.getShowDashedBorder();
            float fM94561g = itemState.getDateBorderWidth();
            float fM94558c = itemState.getCircleSize();
            boolean zM94572r = itemState.getIsEnabled();
            boolean zM94570p = itemState.getShowSelectedDateCircle();
            C39174f c39174fM94556a = itemState.getBackgroundCircleSize();
            if ((i14 & 896) == 256) {
                z4 = true;
            }
            boolean zM87157i = z4 | c28655q2.m87157i(itemState);
            Object objM87133R = c28655q2.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C30599e(6, onViewEvent, itemState);
                c28655q2.m87172p0(objM87133R);
            }
            c28655q = c28655q2;
            AbstractC30773f.m94548v(modifier, textResourceM94568n, interfaceC39332eM94562h, null, interfaceC39332eM94557b, c39174fM94556a, enumC30774gM94571q, interfaceC39332eM94564j, interfaceC39332eM94565k, interfaceC39332eM94563i, zM94567m, fM94566l, interfaceC39332eM94559e, interfaceC39332eM94560f, fM94561g, zM94569o, fM94558c, zM94572r, zM94570p, (InterfaceC4339a) objM87133R, c28655q, i14 & 14, 0, 8);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C29979a(this, modifier, itemState, onViewEvent, i13, 20);
        }
    }
}
