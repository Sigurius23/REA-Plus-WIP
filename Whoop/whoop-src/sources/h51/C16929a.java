package h51;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import aw0.C2101a;
import b91.EnumC2888c;
import c93.InterfaceC4339a;
import com.whoop.design.util.TextResource;
import g90.C15595a;
import ge0.C15728c;
import i91.AbstractC18247a;
import java.util.List;
import kd1.AbstractC22403o;
import l83.C23454a0;
import p133f1.C13989w1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25297f;
import p720m91.InterfaceC25312u;
import p745y81.InterfaceC39332e;
import y71.C39274g;

/* JADX INFO: renamed from: h51.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lh51/a;", "Lm91/f;", "Lh51/f;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "modifier", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "e", "(Landroidx/compose/ui/Modifier;Lh51/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C16929a implements InterfaceC25297f<C16934f> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final Modifier m47629f(Modifier modifier, InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(465852555);
        c28655q.m87173q(false);
        return modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m47630g(Function1 function1, Object tileStateEvent) {
        AbstractC22676k.m65750j(tileStateEvent, "tileStateEvent");
        function1.invoke(tileStateEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m47631h(Function1 function1, C16934f c16934f) {
        function1.invoke(c16934f.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m47632i(C16929a c16929a, Modifier modifier, C16934f c16934f, Function1 function1, int i13, Composer composer, int i14) {
        c16929a.Compose(modifier, c16934f, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    @Override // p720m91.InterfaceC25297f
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void Compose(Modifier modifier, C16934f itemState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-566952033);
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
            TextResource title = itemState.getTitle();
            AbstractC18247a titleColor = itemState.getTitleColor();
            EnumC2888c titleTypography = itemState.getTitleTypography();
            TextResource actionButtonText = itemState.getActionButtonText();
            C39274g actionButtonIcon = itemState.getActionButtonIcon();
            boolean showActionButton = itemState.getShowActionButton();
            boolean showTitle = itemState.getShowTitle();
            List<InterfaceC25312u> listM47683h = itemState.m47683h();
            C2101a c2101a = new C2101a(5, modifier);
            InterfaceC39332e backgroundColor = itemState.getBackgroundColor();
            AbstractC18247a onBoardingBarColor = itemState.getOnBoardingBarColor();
            boolean z4 = false;
            AbstractC22403o backgroundImage = itemState.getBackgroundImage();
            int i15 = i14 & 896;
            boolean z13 = i15 == 256;
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z13 || objM87133R == c28676v0) {
                objM87133R = new C15728c(onViewEvent, 17);
                c28655q2.m87172p0(objM87133R);
            }
            Function1 function1 = (Function1) objM87133R;
            if (i15 == 256) {
                z4 = true;
            }
            boolean zM87157i = z4 | c28655q2.m87157i(itemState);
            Object objM87133R2 = c28655q2.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C13989w1(24, onViewEvent, itemState);
                c28655q2.m87172p0(objM87133R2);
            }
            c28655q = c28655q2;
            AbstractC16932d.m47649m(title, titleColor, titleTypography, actionButtonText, actionButtonIcon, showActionButton, showTitle, listM47683h, null, c2101a, backgroundColor, onBoardingBarColor, backgroundImage, function1, (InterfaceC4339a) objM87133R2, itemState.getShowBottomSpacer(), c28655q, 0, 0, 256);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15595a(this, modifier, itemState, onViewEvent, i13, 18);
        }
    }
}
