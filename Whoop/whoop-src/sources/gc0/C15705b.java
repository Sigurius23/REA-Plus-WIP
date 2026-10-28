package gc0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: gc0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJT\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001a\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001d\u0010\u000e¨\u0006\u001e"}, m65681d2 = {"Lgc0/b;", "", "", "testId", "selectedValue", "hormonalMode", "contraception", "cyclePhase", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lgc0/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "b", "f", "c", "e", "d", "g", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C15705b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String testId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String selectedValue;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String hormonalMode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String contraception;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String cyclePhase;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String source;

    public C15705b(String testId, String str, String str2, String str3, String str4, String source) {
        AbstractC22676k.m65750j(testId, "testId");
        AbstractC22676k.m65750j(source, "source");
        this.testId = testId;
        this.selectedValue = str;
        this.hormonalMode = str2;
        this.contraception = str3;
        this.cyclePhase = str4;
        this.source = source;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C15705b m44185b(C15705b c15705b, String str, String str2, String str3, String str4, String str5, String str6, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c15705b.testId;
        }
        if ((i13 & 2) != 0) {
            str2 = c15705b.selectedValue;
        }
        if ((i13 & 4) != 0) {
            str3 = c15705b.hormonalMode;
        }
        if ((i13 & 8) != 0) {
            str4 = c15705b.contraception;
        }
        if ((i13 & 16) != 0) {
            str5 = c15705b.cyclePhase;
        }
        if ((i13 & 32) != 0) {
            str6 = c15705b.source;
        }
        String str7 = str5;
        String str8 = str6;
        return c15705b.m44186a(str, str2, str3, str4, str7, str8);
    }

    /* JADX INFO: renamed from: a */
    public final C15705b m44186a(String testId, String selectedValue, String hormonalMode, String contraception, String cyclePhase, String source) {
        AbstractC22676k.m65750j(testId, "testId");
        AbstractC22676k.m65750j(source, "source");
        return new C15705b(testId, selectedValue, hormonalMode, contraception, cyclePhase, source);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getContraception() {
        return this.contraception;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCyclePhase() {
        return this.cyclePhase;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getHormonalMode() {
        return this.hormonalMode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15705b)) {
            return false;
        }
        C15705b c15705b = (C15705b) other;
        return AbstractC22676k.m65745e(this.testId, c15705b.testId) && AbstractC22676k.m65745e(this.selectedValue, c15705b.selectedValue) && AbstractC22676k.m65745e(this.hormonalMode, c15705b.hormonalMode) && AbstractC22676k.m65745e(this.contraception, c15705b.contraception) && AbstractC22676k.m65745e(this.cyclePhase, c15705b.cyclePhase) && AbstractC22676k.m65745e(this.source, c15705b.source);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSelectedValue() {
        return this.selectedValue;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTestId() {
        return this.testId;
    }

    public int hashCode() {
        int iHashCode = this.testId.hashCode() * 31;
        String str = this.selectedValue;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.hormonalMode;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.contraception;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cyclePhase;
        return this.source.hashCode() + ((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.testId;
        String str2 = this.selectedValue;
        String str3 = this.hormonalMode;
        String str4 = this.contraception;
        String str5 = this.cyclePhase;
        String str6 = this.source;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("HormonalContextDomainRequest(testId=", str, ", selectedValue=", str2, ", hormonalMode=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", contraception=", str4, ", cyclePhase=");
        return AbstractC11266d.m30464r(sbM32001t, str5, ", source=", str6, ")");
    }

    public /* synthetic */ C15705b(String str, String str2, String str3, String str4, String str5, String str6, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : str5, (i13 & 32) != 0 ? "USER" : str6);
    }
}
