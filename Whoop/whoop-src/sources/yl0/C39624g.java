package yl0;

import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: yl0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b#\b\u0081\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u008a\u0001\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b!\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b7\u00105R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b*\u00109R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b,\u0010:\u001a\u0004\b6\u0010\u0019R\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b%\u0010:\u001a\u0004\b.\u0010\u0019R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u00103\u001a\u0004\b2\u00105R\u0011\u0010<\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b;\u00105¨\u0006="}, m65681d2 = {"Lyl0/g;", "", "", "answeredYes", "", "magnitudeValue", "", "timeValue", "Lyl0/a;", "magnitudeConfig", "Lyl0/d;", "timeConfig", "isMagnitudeSheetVisible", "inputsCleared", "Lyl0/e;", "buttonState", "", "followupMessage", "commitPath", "didCommitSucceed", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Long;Lyl0/a;Lyl0/d;ZZLyl0/e;Ljava/lang/String;Ljava/lang/String;Z)V", "a", "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Long;Lyl0/a;Lyl0/d;ZZLyl0/e;Ljava/lang/String;Ljava/lang/String;Z)Lyl0/g;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "b", "Ljava/lang/Double;", "j", "()Ljava/lang/Double;", "Ljava/lang/Long;", "k", "()Ljava/lang/Long;", "d", "Lyl0/a;", "i", "()Lyl0/a;", "e", "Lyl0/d;", "getTimeConfig", "()Lyl0/d;", "f", "Z", "m", "()Z", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lyl0/e;", "()Lyl0/e;", "Ljava/lang/String;", "l", "isCommitClaimed", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39624g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Boolean answeredYes;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Double magnitudeValue;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Long timeValue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C39618a magnitudeConfig;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C39621d timeConfig;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean isMagnitudeSheetVisible;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean inputsCleared;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final EnumC39622e buttonState;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String followupMessage;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final String commitPath;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean didCommitSucceed;

    public C39624g(Boolean bool, Double d3, Long l7, C39618a c39618a, C39621d c39621d, boolean z4, boolean z13, EnumC39622e buttonState, String str, String commitPath, boolean z14) {
        AbstractC22676k.m65750j(buttonState, "buttonState");
        AbstractC22676k.m65750j(commitPath, "commitPath");
        this.answeredYes = bool;
        this.magnitudeValue = d3;
        this.timeValue = l7;
        this.magnitudeConfig = c39618a;
        this.timeConfig = c39621d;
        this.isMagnitudeSheetVisible = z4;
        this.inputsCleared = z13;
        this.buttonState = buttonState;
        this.followupMessage = str;
        this.commitPath = commitPath;
        this.didCommitSucceed = z14;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C39624g m126628b(C39624g c39624g, Boolean bool, Double d3, Long l7, C39618a c39618a, C39621d c39621d, boolean z4, boolean z13, EnumC39622e enumC39622e, String str, String str2, boolean z14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            bool = c39624g.answeredYes;
        }
        if ((i13 & 2) != 0) {
            d3 = c39624g.magnitudeValue;
        }
        if ((i13 & 4) != 0) {
            l7 = c39624g.timeValue;
        }
        if ((i13 & 8) != 0) {
            c39618a = c39624g.magnitudeConfig;
        }
        if ((i13 & 16) != 0) {
            c39621d = c39624g.timeConfig;
        }
        if ((i13 & 32) != 0) {
            z4 = c39624g.isMagnitudeSheetVisible;
        }
        if ((i13 & 64) != 0) {
            z13 = c39624g.inputsCleared;
        }
        if ((i13 & 128) != 0) {
            enumC39622e = c39624g.buttonState;
        }
        if ((i13 & 256) != 0) {
            str = c39624g.followupMessage;
        }
        if ((i13 & 512) != 0) {
            str2 = c39624g.commitPath;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            z14 = c39624g.didCommitSucceed;
        }
        String str3 = str2;
        boolean z15 = z14;
        EnumC39622e enumC39622e2 = enumC39622e;
        String str4 = str;
        boolean z16 = z4;
        boolean z17 = z13;
        C39621d c39621d2 = c39621d;
        Long l12 = l7;
        return c39624g.m126629a(bool, d3, l12, c39618a, c39621d2, z16, z17, enumC39622e2, str4, str3, z15);
    }

    /* JADX INFO: renamed from: a */
    public final C39624g m126629a(Boolean answeredYes, Double magnitudeValue, Long timeValue, C39618a magnitudeConfig, C39621d timeConfig, boolean isMagnitudeSheetVisible, boolean inputsCleared, EnumC39622e buttonState, String followupMessage, String commitPath, boolean didCommitSucceed) {
        AbstractC22676k.m65750j(buttonState, "buttonState");
        AbstractC22676k.m65750j(commitPath, "commitPath");
        return new C39624g(answeredYes, magnitudeValue, timeValue, magnitudeConfig, timeConfig, isMagnitudeSheetVisible, inputsCleared, buttonState, followupMessage, commitPath, didCommitSucceed);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getAnsweredYes() {
        return this.answeredYes;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC39622e getButtonState() {
        return this.buttonState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCommitPath() {
        return this.commitPath;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39624g)) {
            return false;
        }
        C39624g c39624g = (C39624g) other;
        return AbstractC22676k.m65745e(this.answeredYes, c39624g.answeredYes) && AbstractC22676k.m65745e(this.magnitudeValue, c39624g.magnitudeValue) && AbstractC22676k.m65745e(this.timeValue, c39624g.timeValue) && AbstractC22676k.m65745e(this.magnitudeConfig, c39624g.magnitudeConfig) && AbstractC22676k.m65745e(this.timeConfig, c39624g.timeConfig) && this.isMagnitudeSheetVisible == c39624g.isMagnitudeSheetVisible && this.inputsCleared == c39624g.inputsCleared && this.buttonState == c39624g.buttonState && AbstractC22676k.m65745e(this.followupMessage, c39624g.followupMessage) && AbstractC22676k.m65745e(this.commitPath, c39624g.commitPath) && this.didCommitSucceed == c39624g.didCommitSucceed;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getDidCommitSucceed() {
        return this.didCommitSucceed;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getFollowupMessage() {
        return this.followupMessage;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getInputsCleared() {
        return this.inputsCleared;
    }

    public int hashCode() {
        Boolean bool = this.answeredYes;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d3 = this.magnitudeValue;
        int iHashCode2 = (iHashCode + (d3 == null ? 0 : d3.hashCode())) * 31;
        Long l7 = this.timeValue;
        int iHashCode3 = (iHashCode2 + (l7 == null ? 0 : l7.hashCode())) * 31;
        C39618a c39618a = this.magnitudeConfig;
        int iHashCode4 = (iHashCode3 + (c39618a == null ? 0 : c39618a.hashCode())) * 31;
        C39621d c39621d = this.timeConfig;
        int iHashCode5 = (this.buttonState.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode4 + (c39621d == null ? 0 : c39621d.hashCode())) * 31, 31, this.isMagnitudeSheetVisible), 31, this.inputsCleared)) * 31;
        String str = this.followupMessage;
        return Boolean.hashCode(this.didCommitSucceed) + AbstractC11266d.m30450d((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.commitPath);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final C39618a getMagnitudeConfig() {
        return this.magnitudeConfig;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Double getMagnitudeValue() {
        return this.magnitudeValue;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Long getTimeValue() {
        return this.timeValue;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m126639l() {
        EnumC39622e enumC39622e = this.buttonState;
        return enumC39622e == EnumC39622e.LOADING || enumC39622e == EnumC39622e.SUCCESS || enumC39622e == EnumC39622e.TERMINAL_ERROR;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getIsMagnitudeSheetVisible() {
        return this.isMagnitudeSheetVisible;
    }

    public String toString() {
        Boolean bool = this.answeredYes;
        Double d3 = this.magnitudeValue;
        Long l7 = this.timeValue;
        C39618a c39618a = this.magnitudeConfig;
        C39621d c39621d = this.timeConfig;
        boolean z4 = this.isMagnitudeSheetVisible;
        boolean z13 = this.inputsCleared;
        EnumC39622e enumC39622e = this.buttonState;
        String str = this.followupMessage;
        String str2 = this.commitPath;
        boolean z14 = this.didCommitSucceed;
        StringBuilder sb4 = new StringBuilder("JournalEntryWidgetDomainState(answeredYes=");
        sb4.append(bool);
        sb4.append(", magnitudeValue=");
        sb4.append(d3);
        sb4.append(", timeValue=");
        sb4.append(l7);
        sb4.append(", magnitudeConfig=");
        sb4.append(c39618a);
        sb4.append(", timeConfig=");
        sb4.append(c39621d);
        sb4.append(", isMagnitudeSheetVisible=");
        sb4.append(z4);
        sb4.append(", inputsCleared=");
        sb4.append(z13);
        sb4.append(", buttonState=");
        sb4.append(enumC39622e);
        sb4.append(", followupMessage=");
        AbstractC11266d.m30444B(sb4, str, ", commitPath=", str2, ", didCommitSucceed=");
        return AbstractC18489d0.m53372m(sb4, z14, ")");
    }

    public /* synthetic */ C39624g(Boolean bool, Double d3, Long l7, C39618a c39618a, C39621d c39621d, boolean z4, boolean z13, EnumC39622e enumC39622e, String str, String str2, boolean z14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : bool, (i13 & 2) != 0 ? null : d3, (i13 & 4) != 0 ? null : l7, (i13 & 8) != 0 ? null : c39618a, (i13 & 16) != 0 ? null : c39621d, (i13 & 32) != 0 ? false : z4, (i13 & 64) != 0 ? false : z13, (i13 & 128) != 0 ? EnumC39622e.IDLE : enumC39622e, (i13 & 256) != 0 ? null : str, (i13 & 512) != 0 ? "" : str2, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? false : z14);
    }
}
