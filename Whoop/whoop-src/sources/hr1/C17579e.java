package hr1;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.integrations.domain.models.IntegrationSectionModel;
import com.whoop.integrations.domain.models.IntegrationTabDisplayType;
import com.whoop.integrations.domain.models.IntegrationTabModel;
import cr1.InterfaceC11082b;
import gr1.C16099f;
import gr1.C16101h;
import gr1.C16102i;
import gr1.C16103j;
import gr1.C16105l;
import gr1.C16110q;
import gr1.InterfaceC16100g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import m83.AbstractC25267u;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import zq1.AbstractC40986a;

/* JADX INFO: renamed from: hr1.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lhr1/e;", "", "<init>", "()V", "Lcom/whoop/integrations/domain/models/IntegrationSectionModel;", "Lgr1/l;", "e", "(Lcom/whoop/integrations/domain/models/IntegrationSectionModel;)Lgr1/l;", "Lcom/whoop/integrations/domain/models/IntegrationTabModel;", "Lgr1/g;", "d", "(Lcom/whoop/integrations/domain/models/IntegrationTabModel;)Lgr1/g;", "", "connected", "connectedFrom3P", "Lkd1/o;", "b", "(ZLjava/lang/Boolean;)Lkd1/o;", "Ly81/e;", "a", "(ZLjava/lang/Boolean;)Ly81/e;", "Lcr1/b$f;", "domainResult", "Lgr1/q;", "c", "(Lcr1/b$f;)Lgr1/q;", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17579e {

    /* JADX INFO: renamed from: hr1.e$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f68111a;

        static {
            int[] iArr = new int[IntegrationTabDisplayType.values().length];
            try {
                iArr[IntegrationTabDisplayType.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IntegrationTabDisplayType.NEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IntegrationTabDisplayType.SIMPLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f68111a = iArr;
        }
    }

    /* JADX INFO: renamed from: hr1.e$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f68112w = new b();

        /* JADX INFO: renamed from: a */
        public final long m50057a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentPositiveTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m50057a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: hr1.e$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f68113w = new c();

        /* JADX INFO: renamed from: a */
        public final long m50058a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentPositiveTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m50058a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: hr1.e$d */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f68114w = new d();

        /* JADX INFO: renamed from: a */
        public final long m50059a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m50059a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceC39332e m50052a(boolean connected, Boolean connectedFrom3P) {
        if (connectedFrom3P == null) {
            if (connected) {
                return p745y81.Function1.m125323a(b.f68112w);
            }
            return null;
        }
        if (connected && connectedFrom3P.booleanValue()) {
            return p745y81.Function1.m125323a(c.f68113w);
        }
        if (connected || connectedFrom3P.booleanValue()) {
            return p745y81.Function1.m125323a(d.f68114w);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    private final AbstractC22403o m50053b(boolean connected, Boolean connectedFrom3P) {
        if (connectedFrom3P == null) {
            if (connected) {
                return new AbstractC22403o.a(AbstractC40986a.f176889a);
            }
            return null;
        }
        if (connected && connectedFrom3P.booleanValue()) {
            return new AbstractC22403o.a(AbstractC40986a.f176889a);
        }
        if (connected || connectedFrom3P.booleanValue()) {
            return new AbstractC22403o.a(AbstractC40986a.f176891c);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    private final InterfaceC16100g m50054d(IntegrationTabModel integrationTabModel) {
        int i13 = a.f68111a[integrationTabModel.getDisplayType().ordinal()];
        if (i13 == 1) {
            return new C16101h(integrationTabModel.getId(), integrationTabModel.getReportingKey(), AbstractC22404p.m64503l(integrationTabModel.getIconImage()), AbstractC8693b.m21278l(integrationTabModel.getScreenName()), AbstractC8693b.m21278l(integrationTabModel.getTitle()), AbstractC8693b.m21278l(integrationTabModel.getSubtitle()), AbstractC8693b.m21278l(integrationTabModel.getCtaText()), AbstractC22404p.m64503l(integrationTabModel.getBannerImage()), integrationTabModel.getConnected(), integrationTabModel.getConnectedFrom3P());
        }
        if (i13 == 2) {
            return new C16102i(integrationTabModel.getId(), integrationTabModel.getReportingKey(), AbstractC22404p.m64503l(integrationTabModel.getIconImage()), AbstractC8693b.m21278l(integrationTabModel.getScreenName()), AbstractC8693b.m21278l(integrationTabModel.getTitle()), integrationTabModel.getConnected(), integrationTabModel.getConnectedFrom3P(), integrationTabModel.getDetailsUrl());
        }
        if (i13 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        String id4 = integrationTabModel.getId();
        String reportingKey = integrationTabModel.getReportingKey();
        AbstractC22403o abstractC22403oM64503l = AbstractC22404p.m64503l(integrationTabModel.getIconImage());
        TextResource textResourceM21278l = AbstractC8693b.m21278l(integrationTabModel.getScreenName());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(integrationTabModel.getTitle());
        Boolean connected = integrationTabModel.getConnected();
        boolean zBooleanValue = connected != null ? connected.booleanValue() : false;
        Boolean connectedFrom3P = integrationTabModel.getConnectedFrom3P();
        Boolean connected2 = integrationTabModel.getConnected();
        AbstractC22403o abstractC22403oM50053b = m50053b(connected2 != null ? connected2.booleanValue() : false, integrationTabModel.getConnectedFrom3P());
        Boolean connected3 = integrationTabModel.getConnected();
        return new C16103j(id4, reportingKey, abstractC22403oM64503l, textResourceM21278l, textResourceM21278l2, zBooleanValue, connectedFrom3P, abstractC22403oM50053b, m50052a(connected3 != null ? connected3.booleanValue() : false, integrationTabModel.getConnectedFrom3P()), integrationTabModel.getDetailsUrl());
    }

    /* JADX INFO: renamed from: e */
    private final C16105l m50055e(IntegrationSectionModel integrationSectionModel) {
        TextResource textResourceM21278l = AbstractC8693b.m21278l(integrationSectionModel.getSectionTitle());
        List<IntegrationTabModel> tabs = integrationSectionModel.getTabs();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(tabs, 10));
        Iterator<T> it = tabs.iterator();
        while (it.hasNext()) {
            arrayList.add(m50054d((IntegrationTabModel) it.next()));
        }
        return new C16105l(textResourceM21278l, arrayList);
    }

    /* JADX INFO: renamed from: c */
    public final C16110q m50056c(InterfaceC11082b.f domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        List<IntegrationSectionModel> integrations = domainResult.getData().getIntegrations();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(integrations, 10));
        Iterator<T> it = integrations.iterator();
        while (it.hasNext()) {
            arrayList.add(m50055e((IntegrationSectionModel) it.next()));
        }
        return new C16110q(null, false, null, new C16099f(arrayList), null, null, null, false, 247, null);
    }
}
