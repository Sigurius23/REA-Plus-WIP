package kh1;

import androidx.core.app.NotificationCompat;
import com.whoop.gifting.feature.gifting.domain.models.GiftingModels;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import nh1.InterfaceC26720a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: kh1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u009a\u0001\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010 \u001a\u0004\b!\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b$\u0010*R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b#\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010 \u001a\u0004\b/\u0010\u001aR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b,\u00100\u001a\u0004\b1\u0010\u001cR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010 \u001a\u0004\b2\u0010\u001aR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b1\u00103\u001a\u0004\b.\u00104R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b&\u00104R\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b'\u00103\u001a\u0004\b5\u00104R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b!\u00106\u001a\u0004\b(\u00107¨\u00068"}, m65681d2 = {"Lkh1/c;", "", "", "source", "giftType", "testCount", "selectedTier", "Lkh1/a;", "currentDialogType", "Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;", "response", "selectedCountry", "", "selectedQuantity", "selectedSegmentId", "", "manualRefresh", "displayRefreshingSpinner", "bottomSheetDismissed", "Lnh1/a;", NotificationCompat.CATEGORY_EVENT, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkh1/a;Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;Ljava/lang/String;ILjava/lang/String;ZZZLnh1/a;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkh1/a;Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;Ljava/lang/String;ILjava/lang/String;ZZZLnh1/a;)Lkh1/c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "m", "b", "f", "c", "n", "d", "l", "e", "Lkh1/a;", "()Lkh1/a;", "Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;", "g", "i", "I", "j", "k", "Z", "()Z", "getBottomSheetDismissed", "Lnh1/a;", "()Lnh1/a;", "gifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22482c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String giftType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String testCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String selectedTier;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC22480a currentDialogType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final GiftingModels response;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String selectedCountry;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int selectedQuantity;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String selectedSegmentId;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean manualRefresh;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean displayRefreshingSpinner;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final boolean bottomSheetDismissed;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final InterfaceC26720a event;

    public C22482c(String source, String giftType, String testCount, String selectedTier, InterfaceC22480a interfaceC22480a, GiftingModels giftingModels, String str, int i13, String selectedSegmentId, boolean z4, boolean z13, boolean z14, InterfaceC26720a interfaceC26720a) {
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(giftType, "giftType");
        AbstractC22676k.m65750j(testCount, "testCount");
        AbstractC22676k.m65750j(selectedTier, "selectedTier");
        AbstractC22676k.m65750j(selectedSegmentId, "selectedSegmentId");
        this.source = source;
        this.giftType = giftType;
        this.testCount = testCount;
        this.selectedTier = selectedTier;
        this.currentDialogType = interfaceC22480a;
        this.response = giftingModels;
        this.selectedCountry = str;
        this.selectedQuantity = i13;
        this.selectedSegmentId = selectedSegmentId;
        this.manualRefresh = z4;
        this.displayRefreshingSpinner = z13;
        this.bottomSheetDismissed = z14;
        this.event = interfaceC26720a;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C22482c m64948b(C22482c c22482c, String str, String str2, String str3, String str4, InterfaceC22480a interfaceC22480a, GiftingModels giftingModels, String str5, int i13, String str6, boolean z4, boolean z13, boolean z14, InterfaceC26720a interfaceC26720a, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = c22482c.source;
        }
        return c22482c.m64949a(str, (i14 & 2) != 0 ? c22482c.giftType : str2, (i14 & 4) != 0 ? c22482c.testCount : str3, (i14 & 8) != 0 ? c22482c.selectedTier : str4, (i14 & 16) != 0 ? c22482c.currentDialogType : interfaceC22480a, (i14 & 32) != 0 ? c22482c.response : giftingModels, (i14 & 64) != 0 ? c22482c.selectedCountry : str5, (i14 & 128) != 0 ? c22482c.selectedQuantity : i13, (i14 & 256) != 0 ? c22482c.selectedSegmentId : str6, (i14 & 512) != 0 ? c22482c.manualRefresh : z4, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c22482c.displayRefreshingSpinner : z13, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c22482c.bottomSheetDismissed : z14, (i14 & 4096) != 0 ? c22482c.event : interfaceC26720a);
    }

    /* JADX INFO: renamed from: a */
    public final C22482c m64949a(String source, String giftType, String testCount, String selectedTier, InterfaceC22480a currentDialogType, GiftingModels response, String selectedCountry, int selectedQuantity, String selectedSegmentId, boolean manualRefresh, boolean displayRefreshingSpinner, boolean bottomSheetDismissed, InterfaceC26720a event) {
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(giftType, "giftType");
        AbstractC22676k.m65750j(testCount, "testCount");
        AbstractC22676k.m65750j(selectedTier, "selectedTier");
        AbstractC22676k.m65750j(selectedSegmentId, "selectedSegmentId");
        return new C22482c(source, giftType, testCount, selectedTier, currentDialogType, response, selectedCountry, selectedQuantity, selectedSegmentId, manualRefresh, displayRefreshingSpinner, bottomSheetDismissed, event);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC22480a getCurrentDialogType() {
        return this.currentDialogType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getDisplayRefreshingSpinner() {
        return this.displayRefreshingSpinner;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC26720a getEvent() {
        return this.event;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22482c)) {
            return false;
        }
        C22482c c22482c = (C22482c) other;
        return AbstractC22676k.m65745e(this.source, c22482c.source) && AbstractC22676k.m65745e(this.giftType, c22482c.giftType) && AbstractC22676k.m65745e(this.testCount, c22482c.testCount) && AbstractC22676k.m65745e(this.selectedTier, c22482c.selectedTier) && AbstractC22676k.m65745e(this.currentDialogType, c22482c.currentDialogType) && AbstractC22676k.m65745e(this.response, c22482c.response) && AbstractC22676k.m65745e(this.selectedCountry, c22482c.selectedCountry) && this.selectedQuantity == c22482c.selectedQuantity && AbstractC22676k.m65745e(this.selectedSegmentId, c22482c.selectedSegmentId) && this.manualRefresh == c22482c.manualRefresh && this.displayRefreshingSpinner == c22482c.displayRefreshingSpinner && this.bottomSheetDismissed == c22482c.bottomSheetDismissed && AbstractC22676k.m65745e(this.event, c22482c.event);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getGiftType() {
        return this.giftType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getManualRefresh() {
        return this.manualRefresh;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final GiftingModels getResponse() {
        return this.response;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.source.hashCode() * 31, 31, this.giftType), 31, this.testCount), 31, this.selectedTier);
        InterfaceC22480a interfaceC22480a = this.currentDialogType;
        int iHashCode = (iM30450d + (interfaceC22480a == null ? 0 : interfaceC22480a.hashCode())) * 31;
        GiftingModels giftingModels = this.response;
        int iHashCode2 = (iHashCode + (giftingModels == null ? 0 : giftingModels.hashCode())) * 31;
        String str = this.selectedCountry;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.selectedQuantity, (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.selectedSegmentId), 31, this.manualRefresh), 31, this.displayRefreshingSpinner), 31, this.bottomSheetDismissed);
        InterfaceC26720a interfaceC26720a = this.event;
        return iM8289b + (interfaceC26720a != null ? interfaceC26720a.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getSelectedCountry() {
        return this.selectedCountry;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getSelectedQuantity() {
        return this.selectedQuantity;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getSelectedSegmentId() {
        return this.selectedSegmentId;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getSelectedTier() {
        return this.selectedTier;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getTestCount() {
        return this.testCount;
    }

    public String toString() {
        String str = this.source;
        String str2 = this.giftType;
        String str3 = this.testCount;
        String str4 = this.selectedTier;
        InterfaceC22480a interfaceC22480a = this.currentDialogType;
        GiftingModels giftingModels = this.response;
        String str5 = this.selectedCountry;
        int i13 = this.selectedQuantity;
        String str6 = this.selectedSegmentId;
        boolean z4 = this.manualRefresh;
        boolean z13 = this.displayRefreshingSpinner;
        boolean z14 = this.bottomSheetDismissed;
        InterfaceC26720a interfaceC26720a = this.event;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("GiftingDomainState(source=", str, ", giftType=", str2, ", testCount=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", selectedTier=", str4, ", currentDialogType=");
        sbM32001t.append(interfaceC22480a);
        sbM32001t.append(", response=");
        sbM32001t.append(giftingModels);
        sbM32001t.append(", selectedCountry=");
        AbstractC11266d.m30470x(i13, str5, ", selectedQuantity=", ", selectedSegmentId=", sbM32001t);
        AbstractC38963t7.m124390t(sbM32001t, str6, ", manualRefresh=", z4, ", displayRefreshingSpinner=");
        AbstractC38963t7.m124392v(sbM32001t, z13, ", bottomSheetDismissed=", z14, ", event=");
        sbM32001t.append(interfaceC26720a);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ C22482c(String str, String str2, String str3, String str4, InterfaceC22480a interfaceC22480a, GiftingModels giftingModels, String str5, int i13, String str6, boolean z4, boolean z13, boolean z14, InterfaceC26720a interfaceC26720a, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? "" : str2, (i14 & 4) != 0 ? "" : str3, (i14 & 8) != 0 ? "" : str4, (i14 & 16) != 0 ? null : interfaceC22480a, (i14 & 32) != 0 ? null : giftingModels, (i14 & 64) != 0 ? null : str5, (i14 & 128) != 0 ? 1 : i13, (i14 & 256) == 0 ? str6 : "", (i14 & 512) != 0 ? false : z4, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? false : z13, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0 ? z14 : false, (i14 & 4096) != 0 ? null : interfaceC26720a);
    }
}
