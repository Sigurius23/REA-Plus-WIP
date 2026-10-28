package cw1;

import bw1.AbstractC3684c;
import bw1.C3682a;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.membership.reactivationmodal.domain.models.MemberStatisticsModel;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.List;
import kd1.AbstractC22403o;
import m83.AbstractC25267u;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import ux1.C35367a;
import y71.C39274g;
import y71.C39282o;
import zv1.AbstractC41164a;

/* JADX INFO: renamed from: cw1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lcw1/a;", "", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lzv1/a;", "domainState", "Lbw1/c;", "a", "(Lzv1/a;)Lbw1/c;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11159a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: cw1.a$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f35720w = new a();

        /* JADX INFO: renamed from: a */
        public final long m30245a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite50();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m30245a((C39336i) obj));
        }
    }

    public C11159a(FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC3684c m30244a(AbstractC41164a domainState) {
        EnumC16313m0 enumC16313m0;
        if (!(domainState instanceof AbstractC41164a.b)) {
            if (!(domainState instanceof AbstractC41164a.a)) {
                return null;
            }
            AbstractC41164a.a aVar = (AbstractC41164a.a) domainState;
            AbstractC22403o.c cVar = new AbstractC22403o.c(aVar.getContent().getHeaderImg(), 0, 0, 0, 14, null);
            TextResource textResourceM21278l = AbstractC8693b.m21278l(aVar.getContent().getTitle());
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(aVar.getContent().getSubtitle());
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l(aVar.getContent().getBody());
            List<MemberStatisticsModel> cycleData = aVar.getContent().getCycleData();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(cycleData, 10));
            for (MemberStatisticsModel memberStatisticsModel : cycleData) {
                arrayList.add(new C35367a(AbstractC8693b.m21278l(memberStatisticsModel.getValue()), AbstractC8693b.m21278l(memberStatisticsModel.getTitle()), null, 4, null));
            }
            return new AbstractC3684c.a(cVar, textResourceM21278l, textResourceM21278l2, textResourceM21278l3, arrayList, new C3682a(AbstractC8693b.m21278l(aVar.getContent().getCta().getText()), aVar.getContent().getCta().getDestination()), AbstractC8693b.m21278l(aVar.getContent().getCloseText()));
        }
        AbstractC41164a.b bVar = (AbstractC41164a.b) domainState;
        AbstractC22403o.c cVar2 = new AbstractC22403o.c(bVar.getContent().getHeaderImg(), 0, 0, 0, 14, null);
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(bVar.getContent().getTitle());
        TextResource textResourceM21278l5 = AbstractC8693b.m21278l(bVar.getContent().getBody());
        C39282o.Companion companion = C39282o.INSTANCE;
        TextResource textResourceM21278l6 = AbstractC8693b.m21278l(bVar.getContent().getCta().getTitle());
        TextResource textResourceM21267a = AbstractC8693b.m21267a();
        String leftIcon = bVar.getContent().getCta().getLeftIcon();
        EnumC16313m0 enumC16313m1 = EnumC16313m0.CREDIT_CARD;
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC16313m0 = null;
                break;
            }
            enumC16313m0 = enumC16313m0ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC16313m0.name(), leftIcon)) {
                break;
            }
            i13++;
        }
        if (enumC16313m0 != null) {
            enumC16313m1 = enumC16313m0;
        }
        return new AbstractC3684c.b(cVar2, textResourceM21278l4, textResourceM21278l5, C39282o.Companion.m125229d(companion, textResourceM21278l6, null, null, textResourceM21267a, null, new C39274g(enumC16313m1.toWhoopIcon(), null, 2, null), p745y81.Function1.m125323a(a.f35720w), null, null, null, null, null, null, null, false, false, bVar.getContent().getCta().getDestination(), false, null, null, null, false, null, 8322966, null), AbstractC8693b.m21278l(bVar.getContent().getCloseText()), this.featureFlagChecker.isFeatureEnabled("use-card-button-for-dunning-cta-android"));
    }
}
