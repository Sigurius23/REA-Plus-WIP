package yu0;

import ci2.InterfaceC4733b;
import com.whoop.data.repositories.FeatureFlagChecker;
import ih0.AbstractC18489d0;
import java.util.Arrays;
import jk0.InterfaceC21750d;
import jt0.EnumC21935b;
import jt0.InterfaceC21934a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import st0.EnumC32978v;

/* JADX INFO: renamed from: yu0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lyu0/d;", "", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ljt0/a;", "connectivityAnalytics", "Lci2/b;", "whoopStrapProvider", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;Ljt0/a;Lci2/b;)V", "Lst0/v;", "a", "()Lst0/v;", "strapGen", "Lyu0/e;", "packetProfile", "Ll83/a0;", "b", "(Lst0/v;Lyu0/e;)V", "", "featureFlag", "c", "(Ljava/lang/String;Lyu0/e;)V", "featureName", "d", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Ljt0/a;", "Lci2/b;", "connectivity-analytics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39787d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21934a connectivityAnalytics;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: yu0.d$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f171416a;

        static {
            int[] iArr = new int[EnumC32978v.values().length];
            try {
                iArr[EnumC32978v.PUFFIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC32978v.MONUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC32978v.SYMPHONY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC32978v.GEN_4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC32978v.GOOSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC32978v.MAVERICK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f171416a = iArr;
        }
    }

    public C39787d(FeatureFlagChecker featureFlagChecker, InterfaceC21934a connectivityAnalytics, InterfaceC4733b whoopStrapProvider) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(connectivityAnalytics, "connectivityAnalytics");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        this.featureFlagChecker = featureFlagChecker;
        this.connectivityAnalytics = connectivityAnalytics;
        this.whoopStrapProvider = whoopStrapProvider;
    }

    /* JADX INFO: renamed from: a */
    private final EnumC32978v m127498a() {
        InterfaceC21750d interfaceC21750d = (InterfaceC21750d) AbstractC18489d0.m53367h(this.whoopStrapProvider);
        if (interfaceC21750d != null) {
            return interfaceC21750d.mo24752w0();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    private final void m127499b(EnumC32978v strapGen, EnumC39788e packetProfile) {
        switch (strapGen == null ? -1 : a.f171416a[strapGen.ordinal()]) {
            case -1:
            case 1:
            case 2:
            case 3:
                return;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 4:
                this.connectivityAnalytics.mo62488b(EnumC21935b.REALTIME_R10);
                return;
            case 5:
            case 6:
                InterfaceC21934a interfaceC21934a = this.connectivityAnalytics;
                EnumC21935b[] enumC21935bArrGen5PacketTypes = packetProfile.gen5PacketTypes();
                interfaceC21934a.mo62488b((EnumC21935b[]) Arrays.copyOf(enumC21935bArrGen5PacketTypes, enumC21935bArrGen5PacketTypes.length));
                return;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m127500c(String featureFlag, EnumC39788e packetProfile) {
        AbstractC22676k.m65750j(featureFlag, "featureFlag");
        AbstractC22676k.m65750j(packetProfile, "packetProfile");
        if (this.featureFlagChecker.isFeatureEnabled(featureFlag)) {
            m127499b(m127498a(), packetProfile);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m127501d(String featureFlag, String featureName) {
        AbstractC22676k.m65750j(featureFlag, "featureFlag");
        AbstractC22676k.m65750j(featureName, "featureName");
        if (this.featureFlagChecker.isFeatureEnabled(featureFlag)) {
            this.connectivityAnalytics.mo62487a(featureName);
        }
    }
}
