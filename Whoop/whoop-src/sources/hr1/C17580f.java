package hr1;

import com.whoop.design.util.AbstractC8693b;
import cr1.EnumC11084d;
import cr1.InterfaceC11082b;
import gr1.C16104k;
import gr1.C16106m;
import gr1.C16110q;
import jb1.C21535a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import zq1.AbstractC40987b;

/* JADX INFO: renamed from: hr1.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lhr1/f;", "", "Lhr1/e;", "integrationsDiscoveryReducer", "Lhr1/b;", "integrationsDetailsReducer", "Lhr1/c;", "integrationsDetailsV2Reducer", "Lhr1/d;", "integrationsDisclaimerReducer", "<init>", "(Lhr1/e;Lhr1/b;Lhr1/c;Lhr1/d;)V", "Lcr1/b;", "domainResult", "Lgr1/q;", "a", "(Lcr1/b;)Lgr1/q;", "Lhr1/e;", "b", "Lhr1/b;", "c", "Lhr1/c;", "d", "Lhr1/d;", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17580f {

    /* JADX INFO: renamed from: e */
    public static final int f68115e = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C17579e integrationsDiscoveryReducer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C17576b integrationsDetailsReducer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C17577c integrationsDetailsV2Reducer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C17578d integrationsDisclaimerReducer;

    /* JADX INFO: renamed from: hr1.f$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f68120a;

        static {
            int[] iArr = new int[EnumC11084d.values().length];
            try {
                iArr[EnumC11084d.DISCONNECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC11084d.OTHER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f68120a = iArr;
        }
    }

    public C17580f(C17579e integrationsDiscoveryReducer, C17576b integrationsDetailsReducer, C17577c integrationsDetailsV2Reducer, C17578d integrationsDisclaimerReducer) {
        AbstractC22676k.m65750j(integrationsDiscoveryReducer, "integrationsDiscoveryReducer");
        AbstractC22676k.m65750j(integrationsDetailsReducer, "integrationsDetailsReducer");
        AbstractC22676k.m65750j(integrationsDetailsV2Reducer, "integrationsDetailsV2Reducer");
        AbstractC22676k.m65750j(integrationsDisclaimerReducer, "integrationsDisclaimerReducer");
        this.integrationsDiscoveryReducer = integrationsDiscoveryReducer;
        this.integrationsDetailsReducer = integrationsDetailsReducer;
        this.integrationsDetailsV2Reducer = integrationsDetailsV2Reducer;
        this.integrationsDisclaimerReducer = integrationsDisclaimerReducer;
    }

    /* JADX INFO: renamed from: a */
    public final C16110q m50060a(InterfaceC11082b domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        if (domainResult instanceof InterfaceC11082b.h) {
            int i13 = a.f68120a[((InterfaceC11082b.h) domainResult).getLoadingType().ordinal()];
            if (i13 == 1) {
                return new C16110q(new C16104k(AbstractC8693b.m21277k(AbstractC40987b.f176898f)), false, null, null, null, null, null, false, 254, null);
            }
            if (i13 == 2) {
                return new C16110q(new C16104k(null, 1, null), false, null, null, null, null, null, false, 254, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (domainResult instanceof InterfaceC11082b.i) {
            return new C16110q(new C16104k(null, 1, null), false, null, null, null, null, null, true, 126, null);
        }
        if (domainResult instanceof InterfaceC11082b.a) {
            return new C16110q(null, true, null, null, null, null, null, false, 253, null);
        }
        if (domainResult instanceof InterfaceC11082b.j) {
            return new C16110q(null, false, null, null, null, null, null, false, 255, null);
        }
        if (domainResult instanceof InterfaceC11082b.k) {
            return new C16110q(null, false, new C16106m(null, 1, null), null, null, null, null, false, 251, null);
        }
        if (domainResult instanceof InterfaceC11082b.f) {
            return this.integrationsDiscoveryReducer.m50056c((InterfaceC11082b.f) domainResult);
        }
        if (domainResult instanceof InterfaceC11082b.b) {
            return this.integrationsDetailsReducer.m50047a((InterfaceC11082b.b) domainResult);
        }
        if (domainResult instanceof InterfaceC11082b.d) {
            return this.integrationsDetailsV2Reducer.m50050a((InterfaceC11082b.d) domainResult);
        }
        if (domainResult instanceof InterfaceC11082b.e) {
            return this.integrationsDisclaimerReducer.m50051a((InterfaceC11082b.e) domainResult);
        }
        if (domainResult instanceof InterfaceC11082b.c) {
            throw new IllegalStateException();
        }
        throw new NoWhenBranchMatchedException();
    }
}
