package hl2;

import com.whoop.training.data.network.response.hrsettings.HrSettingsResponse;
import com.whoop.training.data.network.response.hrsettings.ZoneRow;
import d13.AbstractC11478a;
import java.util.List;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: hl2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJP\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, m65681d2 = {"Lhl2/d;", "", "Lhl2/b;", "currentDialogType", "Lhl2/a;", "currentBottomSheet", "Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;", "successResponse", "", "Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;", "editedZonesValues", "", "saveEnabled", "<init>", "(Lhl2/b;Lhl2/a;Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;Ljava/util/List;Ljava/lang/Boolean;)V", "a", "(Lhl2/b;Lhl2/a;Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;Ljava/util/List;Ljava/lang/Boolean;)Lhl2/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lhl2/b;", "d", "()Lhl2/b;", "b", "Lhl2/a;", "c", "()Lhl2/a;", "Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;", "g", "()Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;", "Ljava/util/List;", "e", "()Ljava/util/List;", "Ljava/lang/Boolean;", "f", "()Ljava/lang/Boolean;", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17409d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC17407b currentDialogType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC17406a currentBottomSheet;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final HrSettingsResponse successResponse;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<ZoneRow> editedZonesValues;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Boolean saveEnabled;

    public C17409d(InterfaceC17407b interfaceC17407b, InterfaceC17406a interfaceC17406a, HrSettingsResponse successResponse, List<ZoneRow> list, Boolean bool) {
        AbstractC22676k.m65750j(successResponse, "successResponse");
        this.currentDialogType = interfaceC17407b;
        this.currentBottomSheet = interfaceC17406a;
        this.successResponse = successResponse;
        this.editedZonesValues = list;
        this.saveEnabled = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C17409d m49383b(C17409d c17409d, InterfaceC17407b interfaceC17407b, InterfaceC17406a interfaceC17406a, HrSettingsResponse hrSettingsResponse, List list, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC17407b = c17409d.currentDialogType;
        }
        if ((i13 & 2) != 0) {
            interfaceC17406a = c17409d.currentBottomSheet;
        }
        if ((i13 & 4) != 0) {
            hrSettingsResponse = c17409d.successResponse;
        }
        if ((i13 & 8) != 0) {
            list = c17409d.editedZonesValues;
        }
        if ((i13 & 16) != 0) {
            bool = c17409d.saveEnabled;
        }
        Boolean bool2 = bool;
        HrSettingsResponse hrSettingsResponse2 = hrSettingsResponse;
        return c17409d.m49384a(interfaceC17407b, interfaceC17406a, hrSettingsResponse2, list, bool2);
    }

    /* JADX INFO: renamed from: a */
    public final C17409d m49384a(InterfaceC17407b currentDialogType, InterfaceC17406a currentBottomSheet, HrSettingsResponse successResponse, List<ZoneRow> editedZonesValues, Boolean saveEnabled) {
        AbstractC22676k.m65750j(successResponse, "successResponse");
        return new C17409d(currentDialogType, currentBottomSheet, successResponse, editedZonesValues, saveEnabled);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC17406a getCurrentBottomSheet() {
        return this.currentBottomSheet;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC17407b getCurrentDialogType() {
        return this.currentDialogType;
    }

    /* JADX INFO: renamed from: e */
    public final List<ZoneRow> m49387e() {
        return this.editedZonesValues;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17409d)) {
            return false;
        }
        C17409d c17409d = (C17409d) other;
        return AbstractC22676k.m65745e(this.currentDialogType, c17409d.currentDialogType) && AbstractC22676k.m65745e(this.currentBottomSheet, c17409d.currentBottomSheet) && AbstractC22676k.m65745e(this.successResponse, c17409d.successResponse) && AbstractC22676k.m65745e(this.editedZonesValues, c17409d.editedZonesValues) && AbstractC22676k.m65745e(this.saveEnabled, c17409d.saveEnabled);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Boolean getSaveEnabled() {
        return this.saveEnabled;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final HrSettingsResponse getSuccessResponse() {
        return this.successResponse;
    }

    public int hashCode() {
        InterfaceC17407b interfaceC17407b = this.currentDialogType;
        int iHashCode = (interfaceC17407b == null ? 0 : interfaceC17407b.hashCode()) * 31;
        InterfaceC17406a interfaceC17406a = this.currentBottomSheet;
        int iHashCode2 = (this.successResponse.hashCode() + ((iHashCode + (interfaceC17406a == null ? 0 : interfaceC17406a.hashCode())) * 31)) * 31;
        List<ZoneRow> list = this.editedZonesValues;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.saveEnabled;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        InterfaceC17407b interfaceC17407b = this.currentDialogType;
        InterfaceC17406a interfaceC17406a = this.currentBottomSheet;
        HrSettingsResponse hrSettingsResponse = this.successResponse;
        List<ZoneRow> list = this.editedZonesValues;
        Boolean bool = this.saveEnabled;
        StringBuilder sb4 = new StringBuilder("HrSettingsDomainState(currentDialogType=");
        sb4.append(interfaceC17407b);
        sb4.append(", currentBottomSheet=");
        sb4.append(interfaceC17406a);
        sb4.append(", successResponse=");
        sb4.append(hrSettingsResponse);
        sb4.append(", editedZonesValues=");
        sb4.append(list);
        sb4.append(", saveEnabled=");
        return AbstractC11478a.m30858j(sb4, bool, ")");
    }

    public /* synthetic */ C17409d(InterfaceC17407b interfaceC17407b, InterfaceC17406a interfaceC17406a, HrSettingsResponse hrSettingsResponse, List list, Boolean bool, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : interfaceC17407b, (i13 & 2) != 0 ? null : interfaceC17406a, (i13 & 4) != 0 ? AbstractC17410e.m49390a() : hrSettingsResponse, (i13 & 8) != 0 ? C25271y.f99162w : list, (i13 & 16) != 0 ? Boolean.FALSE : bool);
    }
}
