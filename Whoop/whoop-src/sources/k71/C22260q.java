package k71;

import a11.C0127e;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bp0.C3526n;
import com.whoop.design.util.TextResource;
import java.util.List;
import kd1.EnumC22400l;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25297f;
import p720m91.InterfaceC25312u;
import p745y81.InterfaceC39332e;
import y71.C39274g;

/* JADX INFO: renamed from: k71.q */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lk71/q;", "Lm91/f;", "Lk71/c0;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "modifier", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "c", "(Landroidx/compose/ui/Modifier;Lk71/c0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22260q implements InterfaceC25297f<C22245c0> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m63929d(Function1 function1, C22245c0 c22245c0, Object obj) {
        function1.invoke(c22245c0.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m63930e(C22260q c22260q, Modifier modifier, C22245c0 c22245c0, Function1 function1, int i13, Composer composer, int i14) {
        c22260q.Compose(modifier, c22245c0, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    @Override // p720m91.InterfaceC25297f
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void Compose(Modifier modifier, C22245c0 itemState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1002005861);
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
            InterfaceC39332e backgroundColor = itemState.getBackgroundColor();
            TextResource title = itemState.getTitle();
            TextResource lastUpdatedText = itemState.getLastUpdatedText();
            TextResource label = itemState.getLabel();
            InterfaceC39332e labelColor = itemState.getLabelColor();
            TextResource score = itemState.getScore();
            C39274g icon = itemState.getIcon();
            EnumC22400l ctaType = itemState.getCtaType();
            boolean z4 = false;
            float graphAspectRatio = itemState.getGraphAspectRatio();
            InterfaceC25312u graphItem = itemState.getGraphItem();
            TextResource body = itemState.getBody();
            boolean isCompact = itemState.getIsCompact();
            List<InterfaceC25312u> listM63801n = itemState.m63801n();
            if ((i14 & 896) == 256) {
                z4 = true;
            }
            boolean zM87157i = z4 | c28655q2.m87157i(itemState);
            Object objM87133R = c28655q2.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C3526n(onViewEvent, itemState, 20);
                c28655q2.m87172p0(objM87133R);
            }
            c28655q = c28655q2;
            AbstractC22269z.m63942K(modifier, backgroundColor, title, label, labelColor, score, icon, ctaType, graphAspectRatio, graphItem, body, lastUpdatedText, isCompact, listM63801n, (Function1) objM87133R, onViewEvent, c28655q, i14 & 14, (i14 << 9) & 458752, 0);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0127e(this, modifier, itemState, onViewEvent, i13, 12);
        }
    }
}
