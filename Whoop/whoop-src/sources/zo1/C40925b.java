package zo1;

import c13.AbstractC3855a;
import com.whoop.hormonalinsights.onboarding.domain.models.ContraceptionType;
import com.whoop.hormonalinsights.onboarding.domain.models.MciInterest;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: zo1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ|\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001f\u0010(R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b)\u0010\u001cR\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b&\u0010\u001c¨\u0006*"}, m65681d2 = {"Lzo1/b;", "", "", "", "lastPeriodDays", "removedPeriodDays", "", "cycleLength", "Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;", "interest", "Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;", "contraceptionType", "symptoms", "goals", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;Ljava/util/List;Ljava/util/List;)V", "a", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;Ljava/util/List;Ljava/util/List;)Lzo1/b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "g", "()Ljava/util/List;", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;", "f", "()Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;", "e", "Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;", "()Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;", "i", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40925b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<String> lastPeriodDays;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<String> removedPeriodDays;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Integer cycleLength;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final MciInterest interest;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final ContraceptionType contraceptionType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<String> symptoms;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<String> goals;

    public C40925b(List<String> list, List<String> list2, Integer num, MciInterest mciInterest, ContraceptionType contraceptionType, List<String> list3, List<String> list4) {
        this.lastPeriodDays = list;
        this.removedPeriodDays = list2;
        this.cycleLength = num;
        this.interest = mciInterest;
        this.contraceptionType = contraceptionType;
        this.symptoms = list3;
        this.goals = list4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C40925b m132736b(C40925b c40925b, List list, List list2, Integer num, MciInterest mciInterest, ContraceptionType contraceptionType, List list3, List list4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = c40925b.lastPeriodDays;
        }
        if ((i13 & 2) != 0) {
            list2 = c40925b.removedPeriodDays;
        }
        if ((i13 & 4) != 0) {
            num = c40925b.cycleLength;
        }
        if ((i13 & 8) != 0) {
            mciInterest = c40925b.interest;
        }
        if ((i13 & 16) != 0) {
            contraceptionType = c40925b.contraceptionType;
        }
        if ((i13 & 32) != 0) {
            list3 = c40925b.symptoms;
        }
        if ((i13 & 64) != 0) {
            list4 = c40925b.goals;
        }
        List list5 = list3;
        List list6 = list4;
        ContraceptionType contraceptionType2 = contraceptionType;
        Integer num2 = num;
        return c40925b.m132737a(list, list2, num2, mciInterest, contraceptionType2, list5, list6);
    }

    /* JADX INFO: renamed from: a */
    public final C40925b m132737a(List<String> lastPeriodDays, List<String> removedPeriodDays, Integer cycleLength, MciInterest interest, ContraceptionType contraceptionType, List<String> symptoms, List<String> goals) {
        return new C40925b(lastPeriodDays, removedPeriodDays, cycleLength, interest, contraceptionType, symptoms, goals);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ContraceptionType getContraceptionType() {
        return this.contraceptionType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getCycleLength() {
        return this.cycleLength;
    }

    /* JADX INFO: renamed from: e */
    public final List<String> m132740e() {
        return this.goals;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40925b)) {
            return false;
        }
        C40925b c40925b = (C40925b) other;
        return AbstractC22676k.m65745e(this.lastPeriodDays, c40925b.lastPeriodDays) && AbstractC22676k.m65745e(this.removedPeriodDays, c40925b.removedPeriodDays) && AbstractC22676k.m65745e(this.cycleLength, c40925b.cycleLength) && this.interest == c40925b.interest && this.contraceptionType == c40925b.contraceptionType && AbstractC22676k.m65745e(this.symptoms, c40925b.symptoms) && AbstractC22676k.m65745e(this.goals, c40925b.goals);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final MciInterest getInterest() {
        return this.interest;
    }

    /* JADX INFO: renamed from: g */
    public final List<String> m132742g() {
        return this.lastPeriodDays;
    }

    /* JADX INFO: renamed from: h */
    public final List<String> m132743h() {
        return this.removedPeriodDays;
    }

    public int hashCode() {
        List<String> list = this.lastPeriodDays;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.removedPeriodDays;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.cycleLength;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        MciInterest mciInterest = this.interest;
        int iHashCode4 = (iHashCode3 + (mciInterest == null ? 0 : mciInterest.hashCode())) * 31;
        ContraceptionType contraceptionType = this.contraceptionType;
        int iHashCode5 = (iHashCode4 + (contraceptionType == null ? 0 : contraceptionType.hashCode())) * 31;
        List<String> list3 = this.symptoms;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.goals;
        return iHashCode6 + (list4 != null ? list4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final List<String> m132744i() {
        return this.symptoms;
    }

    public String toString() {
        List<String> list = this.lastPeriodDays;
        List<String> list2 = this.removedPeriodDays;
        Integer num = this.cycleLength;
        MciInterest mciInterest = this.interest;
        ContraceptionType contraceptionType = this.contraceptionType;
        List<String> list3 = this.symptoms;
        List<String> list4 = this.goals;
        StringBuilder sbM124380j = AbstractC38963t7.m124380j("MciOnboardingDomainRequest(lastPeriodDays=", ", removedPeriodDays=", list, ", cycleLength=", list2);
        sbM124380j.append(num);
        sbM124380j.append(", interest=");
        sbM124380j.append(mciInterest);
        sbM124380j.append(", contraceptionType=");
        sbM124380j.append(contraceptionType);
        sbM124380j.append(", symptoms=");
        sbM124380j.append(list3);
        sbM124380j.append(", goals=");
        return AbstractC3855a.m11829m(sbM124380j, list4, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C40925b(List list, List list2, Integer num, MciInterest mciInterest, ContraceptionType contraceptionType, List list3, List list4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int i14 = i13 & 1;
        C25271y c25271y = C25271y.f99162w;
        this(i14 != 0 ? c25271y : list, (i13 & 2) != 0 ? c25271y : list2, (i13 & 4) != 0 ? null : num, (i13 & 8) != 0 ? null : mciInterest, (i13 & 16) != 0 ? null : contraceptionType, (i13 & 32) != 0 ? c25271y : list3, (i13 & 64) != 0 ? c25271y : list4);
    }
}
