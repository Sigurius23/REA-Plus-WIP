package l80;

import android.os.Bundle;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import c93.InterfaceC4356r;
import e93.AbstractC12889b;
import g80.C15565f;
import java.util.List;
import l83.C23454a0;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p040c0.InterfaceC3764o;
import p114eb.AbstractC12958g1;
import p114eb.C12953f;
import p114eb.C12974m;
import p114eb.C12982q;
import p114eb.C12987s0;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q80.AbstractC30031c;
import q80.C30032d;
import q80.InterfaceC30033e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: l80.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aÕ\u0001\u0010\u0016\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u00062\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u00062T\u0010\u0015\u001aP\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\u000fH\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Leb/s0;", "Lq80/e;", "group", "Lkotlin/Function0;", "Lg80/f;", "viewState", "Lkotlin/Function1;", "Lj80/b;", "Ll83/a0;", "onViewEvent", "Ll80/o;", "onNavigationEvent", "askForPushNotificationPermissions", "Lh80/b;", "onAnalyticsEvent", "Lkotlin/Function8;", "Lm91/u;", "Lp90/e;", "Lc31/k;", "Lg80/g;", "Lcom/whoop/activation/iajf/domain/SignUpSource;", "handleProgressButtonClick", "b", "(Leb/s0;Lq80/e;Lc93/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/r;)V", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23425b {
    /* JADX INFO: renamed from: b */
    public static final void m67912b(C12987s0 c12987s0, InterfaceC30033e group, final InterfaceC4351m viewState, final Function1 onViewEvent, Function1 function1, Function1 function2, Function1 function3, InterfaceC4356r interfaceC4356r) {
        List listM118958J;
        AbstractC22676k.m65750j(c12987s0, "<this>");
        AbstractC22676k.m65750j(group, "group");
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        final Function1 onNavigationEvent = function1;
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        final Function1 askForPushNotificationPermissions = function2;
        AbstractC22676k.m65750j(askForPushNotificationPermissions, "askForPushNotificationPermissions");
        final Function1 onAnalyticsEvent = function3;
        AbstractC22676k.m65750j(onAnalyticsEvent, "onAnalyticsEvent");
        final InterfaceC4356r handleProgressButtonClick = interfaceC4356r;
        AbstractC22676k.m65750j(handleProgressButtonClick, "handleProgressButtonClick");
        for (final C30032d c30032d : group.mo91934a()) {
            String strM8299l = c30032d.getIncludeSourceArgument() ? AbstractC2875y.m8299l(c30032d.getDestination().name(), "?source={source}") : c30032d.getDestination().name();
            if (c30032d.getIncludeSourceArgument()) {
                C12974m c12974m = new C12974m();
                m67913c(c12974m);
                listM118958J = AbstractC37056f.m118958J(new C12953f("source", c12974m.f44811a.m36452a()));
            } else {
                listM118958J = C25271y.f99162w;
            }
            AbstractC12889b.m36290t(c12987s0, strM8299l, listM118958J, null, null, null, null, new C37816b(new InterfaceC4352n() { // from class: l80.a
                @Override // c93.InterfaceC4352n
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int iIntValue = ((Integer) obj4).intValue();
                    return AbstractC23425b.m67914d(c30032d, viewState, "source", onViewEvent, onNavigationEvent, askForPushNotificationPermissions, onAnalyticsEvent, handleProgressButtonClick, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue);
                }
            }, true, -1676526815), 252);
            onNavigationEvent = function1;
            askForPushNotificationPermissions = function2;
            onAnalyticsEvent = function3;
            handleProgressButtonClick = interfaceC4356r;
        }
    }

    /* JADX INFO: renamed from: c */
    private static final C23454a0 m67913c(C12974m navArgument) {
        AbstractC22676k.m65750j(navArgument, "$this$navArgument");
        navArgument.m36462b(AbstractC12958g1.f44770o);
        navArgument.f44811a.f44789a = true;
        navArgument.m36461a(null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m67914d(C30032d c30032d, InterfaceC4351m interfaceC4351m, String str, Function1 function1, Function1 function2, Function1 function3, Function1 function4, InterfaceC4356r interfaceC4356r, InterfaceC3764o composable, C12982q entry, Composer composer, int i13) {
        AbstractC22676k.m65750j(composable, "$this$composable");
        AbstractC22676k.m65750j(entry, "entry");
        C15565f c15565f = (C15565f) interfaceC4351m.invoke(composer, 0);
        Bundle bundleM36479a = entry.m36479a();
        AbstractC30031c.m91926d(c30032d, c15565f, bundleM36479a != null ? bundleM36479a.getString(str) : null, function1, function2, function3, function4, interfaceC4356r, composer, 0, 0);
        return C23454a0.f92919a;
    }
}
