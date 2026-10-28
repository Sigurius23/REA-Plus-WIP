package l00;

import androidx.lifecycle.AbstractC1637w1;
import com.stripe.android.model.ConsentUi;
import d00.C11429h;
import d00.C11433l;
import d00.C11434m;
import d00.InterfaceC11432k;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import p599wz.C37708d;
import p599wz.C37718g0;
import p599wz.C37738n;
import p631xz.C38747x;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l00.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C23027i extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E */
    public final C13045h2 f90780E;

    /* JADX INFO: renamed from: w */
    public final C11433l f90781w;

    /* JADX INFO: renamed from: x */
    public final C38747x f90782x;

    /* JADX INFO: renamed from: y */
    public final Function1 f90783y;

    /* JADX INFO: renamed from: z */
    public final C13045h2 f90784z;

    public C23027i(C11433l c11433l, C37718g0 linkConfiguration, C38747x linkAccountManager, Function1 dismissWithResult) {
        AbstractC22676k.m65750j(linkConfiguration, "linkConfiguration");
        AbstractC22676k.m65750j(linkAccountManager, "linkAccountManager");
        AbstractC22676k.m65750j(dismissWithResult, "dismissWithResult");
        this.f90781w = c11433l;
        this.f90782x = linkAccountManager;
        this.f90783y = dismissWithResult;
        C11434m c11434m = c11433l.f36662z;
        InterfaceC11432k interfaceC11432k = c11434m != null ? c11434m.f36664x : null;
        C11429h c11429h = interfaceC11432k instanceof C11429h ? (C11429h) interfaceC11432k : null;
        ConsentUi.ConsentPane consentPane = c11429h != null ? c11429h.f36648w : null;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(new C23028j(linkConfiguration.f161637x, c11433l.f36653H, linkConfiguration.f161605E, consentPane, null));
        this.f90784z = c13045h2M36593c;
        this.f90780E = c13045h2M36593c;
        if (consentPane == null) {
            dismissWithResult.invoke(new C37738n(new C37708d(c11433l, null), null, null, null, 14));
        }
    }
}
