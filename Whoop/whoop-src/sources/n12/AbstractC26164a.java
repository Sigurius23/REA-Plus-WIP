package n12;

import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import l83.InterfaceC23457c;
import lh2.C24075f;
import or2.AbstractC28163g0;
import or2.C28198s;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n12.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b'\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00058DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Ln12/a;", "", "Lkotlin/Function0;", "Leb/a0;", "navControllerProvider", "Lor2/s;", "safeNavControllerProvider", "<init>", "(Lc93/a;Lc93/a;)V", "Landroidx/fragment/app/m0;", "fragment", "(Landroidx/fragment/app/m0;)V", "a", "Lc93/a;", "b", "e", "()Leb/a0;", "navController", "f", "()Lor2/s;", "safeNavController", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public abstract class AbstractC26164a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC4339a navControllerProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC4339a safeNavControllerProvider;

    public AbstractC26164a(InterfaceC4339a navControllerProvider, InterfaceC4339a safeNavControllerProvider) {
        AbstractC22676k.m65750j(navControllerProvider, "navControllerProvider");
        AbstractC22676k.m65750j(safeNavControllerProvider, "safeNavControllerProvider");
        this.navControllerProvider = navControllerProvider;
        this.safeNavControllerProvider = safeNavControllerProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final AbstractC12939a0 m77708c(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        return AbstractC5583n.m16799z(abstractComponentCallbacksC1320m0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C28198s m77709d(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        return AbstractC28163g0.m85259o(abstractComponentCallbacksC1320m0);
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC12939a0 m77710e() {
        return (AbstractC12939a0) this.navControllerProvider.invoke();
    }

    /* JADX INFO: renamed from: f */
    public final C28198s m77711f() {
        return (C28198s) this.safeNavControllerProvider.invoke();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC26164a(AbstractComponentCallbacksC1320m0 fragment) {
        this(new C24075f(fragment, 1), new C24075f(fragment, 2));
        AbstractC22676k.m65750j(fragment, "fragment");
    }
}
