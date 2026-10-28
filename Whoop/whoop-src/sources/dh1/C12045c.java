package dh1;

import androidx.core.app.NotificationCompat;
import com.whoop.gifting.feature.gifted.domain.models.GiftedModels;
import gh1.InterfaceC15852b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: dh1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJT\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b#\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010\u0012¨\u0006)"}, m65681d2 = {"Ldh1/c;", "", "Ldh1/a;", "currentDialogType", "Lcom/whoop/gifting/feature/gifted/domain/models/GiftedModels;", "response", "", "manualRefresh", "displayRefreshingSpinner", "Lgh1/b;", NotificationCompat.CATEGORY_EVENT, "", "giftCode", "<init>", "(Ldh1/a;Lcom/whoop/gifting/feature/gifted/domain/models/GiftedModels;ZZLgh1/b;Ljava/lang/String;)V", "a", "(Ldh1/a;Lcom/whoop/gifting/feature/gifted/domain/models/GiftedModels;ZZLgh1/b;Ljava/lang/String;)Ldh1/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ldh1/a;", "c", "()Ldh1/a;", "b", "Lcom/whoop/gifting/feature/gifted/domain/models/GiftedModels;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/gifting/feature/gifted/domain/models/GiftedModels;", "Z", "g", "()Z", "d", "e", "Lgh1/b;", "()Lgh1/b;", "f", "Ljava/lang/String;", "gifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12045c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC12043a currentDialogType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final GiftedModels response;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean manualRefresh;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean displayRefreshingSpinner;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC15852b event;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String giftCode;

    public C12045c(InterfaceC12043a interfaceC12043a, GiftedModels giftedModels, boolean z4, boolean z13, InterfaceC15852b interfaceC15852b, String str) {
        this.currentDialogType = interfaceC12043a;
        this.response = giftedModels;
        this.manualRefresh = z4;
        this.displayRefreshingSpinner = z13;
        this.event = interfaceC15852b;
        this.giftCode = str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C12045c m33170b(C12045c c12045c, InterfaceC12043a interfaceC12043a, GiftedModels giftedModels, boolean z4, boolean z13, InterfaceC15852b interfaceC15852b, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC12043a = c12045c.currentDialogType;
        }
        if ((i13 & 2) != 0) {
            giftedModels = c12045c.response;
        }
        if ((i13 & 4) != 0) {
            z4 = c12045c.manualRefresh;
        }
        if ((i13 & 8) != 0) {
            z13 = c12045c.displayRefreshingSpinner;
        }
        if ((i13 & 16) != 0) {
            interfaceC15852b = c12045c.event;
        }
        if ((i13 & 32) != 0) {
            str = c12045c.giftCode;
        }
        InterfaceC15852b interfaceC15852b2 = interfaceC15852b;
        String str2 = str;
        return c12045c.m33171a(interfaceC12043a, giftedModels, z4, z13, interfaceC15852b2, str2);
    }

    /* JADX INFO: renamed from: a */
    public final C12045c m33171a(InterfaceC12043a currentDialogType, GiftedModels response, boolean manualRefresh, boolean displayRefreshingSpinner, InterfaceC15852b event, String giftCode) {
        return new C12045c(currentDialogType, response, manualRefresh, displayRefreshingSpinner, event, giftCode);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC12043a getCurrentDialogType() {
        return this.currentDialogType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getDisplayRefreshingSpinner() {
        return this.displayRefreshingSpinner;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC15852b getEvent() {
        return this.event;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12045c)) {
            return false;
        }
        C12045c c12045c = (C12045c) other;
        return AbstractC22676k.m65745e(this.currentDialogType, c12045c.currentDialogType) && AbstractC22676k.m65745e(this.response, c12045c.response) && this.manualRefresh == c12045c.manualRefresh && this.displayRefreshingSpinner == c12045c.displayRefreshingSpinner && AbstractC22676k.m65745e(this.event, c12045c.event) && AbstractC22676k.m65745e(this.giftCode, c12045c.giftCode);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getGiftCode() {
        return this.giftCode;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getManualRefresh() {
        return this.manualRefresh;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final GiftedModels getResponse() {
        return this.response;
    }

    public int hashCode() {
        InterfaceC12043a interfaceC12043a = this.currentDialogType;
        int iHashCode = (interfaceC12043a == null ? 0 : interfaceC12043a.hashCode()) * 31;
        GiftedModels giftedModels = this.response;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode + (giftedModels == null ? 0 : giftedModels.hashCode())) * 31, 31, this.manualRefresh), 31, this.displayRefreshingSpinner);
        InterfaceC15852b interfaceC15852b = this.event;
        int iHashCode2 = (iM8289b + (interfaceC15852b == null ? 0 : interfaceC15852b.hashCode())) * 31;
        String str = this.giftCode;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        InterfaceC12043a interfaceC12043a = this.currentDialogType;
        GiftedModels giftedModels = this.response;
        boolean z4 = this.manualRefresh;
        boolean z13 = this.displayRefreshingSpinner;
        InterfaceC15852b interfaceC15852b = this.event;
        String str = this.giftCode;
        StringBuilder sb4 = new StringBuilder("GiftedDomainState(currentDialogType=");
        sb4.append(interfaceC12043a);
        sb4.append(", response=");
        sb4.append(giftedModels);
        sb4.append(", manualRefresh=");
        AbstractC38963t7.m124392v(sb4, z4, ", displayRefreshingSpinner=", z13, ", event=");
        sb4.append(interfaceC15852b);
        sb4.append(", giftCode=");
        sb4.append(str);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C12045c(InterfaceC12043a interfaceC12043a, GiftedModels giftedModels, boolean z4, boolean z13, InterfaceC15852b interfaceC15852b, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : interfaceC12043a, (i13 & 2) != 0 ? null : giftedModels, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? false : z13, (i13 & 16) != 0 ? null : interfaceC15852b, (i13 & 32) != 0 ? null : str);
    }
}
