package pf0;

import com.whoop.advancedlabsjoin.feature.join.domain.models.AdvancedLabsJoinModels;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: pf0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJP\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\u0011R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010$\u001a\u0004\b!\u0010%¨\u0006&"}, m65681d2 = {"Lpf0/c;", "", "", "source", "Lpf0/a;", "currentDialogType", "Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;", "response", "selectedSegmentId", "", "manualRefresh", "displayRefreshingSpinner", "<init>", "(Ljava/lang/String;Lpf0/a;Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;Ljava/lang/String;ZZ)V", "a", "(Ljava/lang/String;Lpf0/a;Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;Ljava/lang/String;ZZ)Lpf0/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "b", "Lpf0/a;", "c", "()Lpf0/a;", "Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;", "f", "()Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;", "d", "g", "e", "Z", "()Z", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29147c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC29145a currentDialogType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AdvancedLabsJoinModels response;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String selectedSegmentId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean manualRefresh;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean displayRefreshingSpinner;

    public C29147c(String source, InterfaceC29145a interfaceC29145a, AdvancedLabsJoinModels advancedLabsJoinModels, String selectedSegmentId, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(selectedSegmentId, "selectedSegmentId");
        this.source = source;
        this.currentDialogType = interfaceC29145a;
        this.response = advancedLabsJoinModels;
        this.selectedSegmentId = selectedSegmentId;
        this.manualRefresh = z4;
        this.displayRefreshingSpinner = z13;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C29147c m88555b(C29147c c29147c, String str, InterfaceC29145a interfaceC29145a, AdvancedLabsJoinModels advancedLabsJoinModels, String str2, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c29147c.source;
        }
        if ((i13 & 2) != 0) {
            interfaceC29145a = c29147c.currentDialogType;
        }
        if ((i13 & 4) != 0) {
            advancedLabsJoinModels = c29147c.response;
        }
        if ((i13 & 8) != 0) {
            str2 = c29147c.selectedSegmentId;
        }
        if ((i13 & 16) != 0) {
            z4 = c29147c.manualRefresh;
        }
        if ((i13 & 32) != 0) {
            z13 = c29147c.displayRefreshingSpinner;
        }
        boolean z14 = z4;
        boolean z15 = z13;
        return c29147c.m88556a(str, interfaceC29145a, advancedLabsJoinModels, str2, z14, z15);
    }

    /* JADX INFO: renamed from: a */
    public final C29147c m88556a(String source, InterfaceC29145a currentDialogType, AdvancedLabsJoinModels response, String selectedSegmentId, boolean manualRefresh, boolean displayRefreshingSpinner) {
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(selectedSegmentId, "selectedSegmentId");
        return new C29147c(source, currentDialogType, response, selectedSegmentId, manualRefresh, displayRefreshingSpinner);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC29145a getCurrentDialogType() {
        return this.currentDialogType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getDisplayRefreshingSpinner() {
        return this.displayRefreshingSpinner;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getManualRefresh() {
        return this.manualRefresh;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29147c)) {
            return false;
        }
        C29147c c29147c = (C29147c) other;
        return AbstractC22676k.m65745e(this.source, c29147c.source) && AbstractC22676k.m65745e(this.currentDialogType, c29147c.currentDialogType) && AbstractC22676k.m65745e(this.response, c29147c.response) && AbstractC22676k.m65745e(this.selectedSegmentId, c29147c.selectedSegmentId) && this.manualRefresh == c29147c.manualRefresh && this.displayRefreshingSpinner == c29147c.displayRefreshingSpinner;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final AdvancedLabsJoinModels getResponse() {
        return this.response;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSelectedSegmentId() {
        return this.selectedSegmentId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        int iHashCode = this.source.hashCode() * 31;
        InterfaceC29145a interfaceC29145a = this.currentDialogType;
        int iHashCode2 = (iHashCode + (interfaceC29145a == null ? 0 : interfaceC29145a.hashCode())) * 31;
        AdvancedLabsJoinModels advancedLabsJoinModels = this.response;
        return Boolean.hashCode(this.displayRefreshingSpinner) + AbstractC2875y.m8289b(AbstractC11266d.m30450d((iHashCode2 + (advancedLabsJoinModels != null ? advancedLabsJoinModels.hashCode() : 0)) * 31, 31, this.selectedSegmentId), 31, this.manualRefresh);
    }

    public String toString() {
        String str = this.source;
        InterfaceC29145a interfaceC29145a = this.currentDialogType;
        AdvancedLabsJoinModels advancedLabsJoinModels = this.response;
        String str2 = this.selectedSegmentId;
        boolean z4 = this.manualRefresh;
        boolean z13 = this.displayRefreshingSpinner;
        StringBuilder sb4 = new StringBuilder("AdvancedLabsJoinDomainState(source=");
        sb4.append(str);
        sb4.append(", currentDialogType=");
        sb4.append(interfaceC29145a);
        sb4.append(", response=");
        sb4.append(advancedLabsJoinModels);
        sb4.append(", selectedSegmentId=");
        sb4.append(str2);
        sb4.append(", manualRefresh=");
        return AbstractC36095b.m114682j(sb4, z4, ", displayRefreshingSpinner=", z13, ")");
    }

    public /* synthetic */ C29147c(String str, InterfaceC29145a interfaceC29145a, AdvancedLabsJoinModels advancedLabsJoinModels, String str2, boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? null : interfaceC29145a, (i13 & 4) != 0 ? null : advancedLabsJoinModels, (i13 & 8) != 0 ? "" : str2, (i13 & 16) != 0 ? false : z4, (i13 & 32) != 0 ? false : z13);
    }
}
