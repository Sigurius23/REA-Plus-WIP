package io1;

import com.whoop.hormonalinsights.logsymptoms.domain.models.LogSymptomsResponse;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: io1.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJT\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b#\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0011R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b!\u0010$\u001a\u0004\b\u001f\u0010\u0011¨\u0006&"}, m65681d2 = {"Lio1/f;", "", "Lio1/d;", "currentDialogType", "Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;", "response", "", "manualRefresh", "displayRefreshingSpinner", "", "menstruation", "cervicalMucus", "<init>", "(Lio1/d;Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;ZZLjava/lang/String;Ljava/lang/String;)V", "a", "(Lio1/d;Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;ZZLjava/lang/String;Ljava/lang/String;)Lio1/f;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lio1/d;", "d", "()Lio1/d;", "b", "Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;", "c", "Z", "f", "()Z", "e", "Ljava/lang/String;", "g", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C20745f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC20743d currentDialogType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final LogSymptomsResponse response;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean manualRefresh;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean displayRefreshingSpinner;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String menstruation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String cervicalMucus;

    public C20745f(InterfaceC20743d interfaceC20743d, LogSymptomsResponse logSymptomsResponse, boolean z4, boolean z13, String str, String str2) {
        this.currentDialogType = interfaceC20743d;
        this.response = logSymptomsResponse;
        this.manualRefresh = z4;
        this.displayRefreshingSpinner = z13;
        this.menstruation = str;
        this.cervicalMucus = str2;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C20745f m57082b(C20745f c20745f, InterfaceC20743d interfaceC20743d, LogSymptomsResponse logSymptomsResponse, boolean z4, boolean z13, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC20743d = c20745f.currentDialogType;
        }
        if ((i13 & 2) != 0) {
            logSymptomsResponse = c20745f.response;
        }
        if ((i13 & 4) != 0) {
            z4 = c20745f.manualRefresh;
        }
        if ((i13 & 8) != 0) {
            z13 = c20745f.displayRefreshingSpinner;
        }
        if ((i13 & 16) != 0) {
            str = c20745f.menstruation;
        }
        if ((i13 & 32) != 0) {
            str2 = c20745f.cervicalMucus;
        }
        String str3 = str;
        String str4 = str2;
        return c20745f.m57083a(interfaceC20743d, logSymptomsResponse, z4, z13, str3, str4);
    }

    /* JADX INFO: renamed from: a */
    public final C20745f m57083a(InterfaceC20743d currentDialogType, LogSymptomsResponse response, boolean manualRefresh, boolean displayRefreshingSpinner, String menstruation, String cervicalMucus) {
        return new C20745f(currentDialogType, response, manualRefresh, displayRefreshingSpinner, menstruation, cervicalMucus);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCervicalMucus() {
        return this.cervicalMucus;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC20743d getCurrentDialogType() {
        return this.currentDialogType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getDisplayRefreshingSpinner() {
        return this.displayRefreshingSpinner;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20745f)) {
            return false;
        }
        C20745f c20745f = (C20745f) other;
        return AbstractC22676k.m65745e(this.currentDialogType, c20745f.currentDialogType) && AbstractC22676k.m65745e(this.response, c20745f.response) && this.manualRefresh == c20745f.manualRefresh && this.displayRefreshingSpinner == c20745f.displayRefreshingSpinner && AbstractC22676k.m65745e(this.menstruation, c20745f.menstruation) && AbstractC22676k.m65745e(this.cervicalMucus, c20745f.cervicalMucus);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getManualRefresh() {
        return this.manualRefresh;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getMenstruation() {
        return this.menstruation;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final LogSymptomsResponse getResponse() {
        return this.response;
    }

    public int hashCode() {
        InterfaceC20743d interfaceC20743d = this.currentDialogType;
        int iHashCode = (interfaceC20743d == null ? 0 : interfaceC20743d.hashCode()) * 31;
        LogSymptomsResponse logSymptomsResponse = this.response;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode + (logSymptomsResponse == null ? 0 : logSymptomsResponse.hashCode())) * 31, 31, this.manualRefresh), 31, this.displayRefreshingSpinner);
        String str = this.menstruation;
        int iHashCode2 = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cervicalMucus;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        InterfaceC20743d interfaceC20743d = this.currentDialogType;
        LogSymptomsResponse logSymptomsResponse = this.response;
        boolean z4 = this.manualRefresh;
        boolean z13 = this.displayRefreshingSpinner;
        String str = this.menstruation;
        String str2 = this.cervicalMucus;
        StringBuilder sb4 = new StringBuilder("LogSymptomsDomainState(currentDialogType=");
        sb4.append(interfaceC20743d);
        sb4.append(", response=");
        sb4.append(logSymptomsResponse);
        sb4.append(", manualRefresh=");
        AbstractC38963t7.m124392v(sb4, z4, ", displayRefreshingSpinner=", z13, ", menstruation=");
        return AbstractC11266d.m30464r(sb4, str, ", cervicalMucus=", str2, ")");
    }

    public /* synthetic */ C20745f(InterfaceC20743d interfaceC20743d, LogSymptomsResponse logSymptomsResponse, boolean z4, boolean z13, String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : interfaceC20743d, (i13 & 2) != 0 ? null : logSymptomsResponse, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? false : z13, (i13 & 16) != 0 ? null : str, (i13 & 32) != 0 ? null : str2);
    }
}
