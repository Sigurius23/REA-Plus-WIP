package f22;

import androidx.core.app.NotificationCompat;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.C1317l1;
import c22.EnumC3894b;
import ci2.InterfaceC4733b;
import j02.AbstractC21155m0;
import j02.InterfaceC21159o0;
import jk0.InterfaceC21750d;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import td1.InterfaceC33704b;

/* JADX INFO: renamed from: f22.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lf22/f;", "", "Landroidx/fragment/app/r0;", "activity", "Lci2/b;", "whoopStrapProvider", "Ltd1/b;", "whoopStrapProxy", "Lj02/o0;", "navigator", "<init>", "(Landroidx/fragment/app/r0;Lci2/b;Ltd1/b;Lj02/o0;)V", "Lf22/d;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Lf22/d;)V", "Landroidx/fragment/app/r0;", "b", "Lci2/b;", "c", "Ltd1/b;", "d", "Lj02/o0;", "pairing-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14034f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractActivityC1340r0 activity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC33704b whoopStrapProxy;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: f22.f$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f50083a;

        static {
            int[] iArr = new int[EnumC3894b.values().length];
            try {
                iArr[EnumC3894b.PAIRING_FLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3894b.PAIRING_FIRST_FLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f50083a = iArr;
        }
    }

    public C14034f(AbstractActivityC1340r0 activity, InterfaceC4733b whoopStrapProvider, InterfaceC33704b whoopStrapProxy, InterfaceC21159o0 navigator) {
        AbstractC22676k.m65750j(activity, "activity");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(whoopStrapProxy, "whoopStrapProxy");
        AbstractC22676k.m65750j(navigator, "navigator");
        this.activity = activity;
        this.whoopStrapProvider = whoopStrapProvider;
        this.whoopStrapProxy = whoopStrapProxy;
        this.navigator = navigator;
    }

    /* JADX INFO: renamed from: a */
    public final void m39955a(AbstractC14032d event) {
        AbstractC22676k.m65750j(event, "event");
        if (event.equals(AbstractC14032d.a.f50072a)) {
            AbstractC1329o1 supportFragmentManager = this.activity.getSupportFragmentManager();
            supportFragmentManager.getClass();
            supportFragmentManager.m4193x(new C1317l1(supportFragmentManager, null, -1, 0), false);
            return;
        }
        if (event.equals(AbstractC14032d.c.f50074a)) {
            this.activity.setResult(-1);
            this.activity.finish();
            return;
        }
        if (!(event instanceof AbstractC14032d.b)) {
            if (!(event instanceof AbstractC14032d.d)) {
                throw new NoWhenBranchMatchedException();
            }
            this.navigator.mo59392a(((AbstractC14032d.d) event).getAction());
            return;
        }
        InterfaceC21750d interfaceC21750d = (InterfaceC21750d) this.whoopStrapProvider.mo14817a().getValue();
        if (interfaceC21750d != null) {
            interfaceC21750d.mo24690G0();
        }
        this.whoopStrapProxy.mo106499l();
        int i13 = a.f50083a[((AbstractC14032d.b) event).getSource().ordinal()];
        if (i13 == 1) {
            this.activity.finish();
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.navigator.mo59393b(new AbstractC21155m0.z1(null, 1, null));
        }
    }
}
