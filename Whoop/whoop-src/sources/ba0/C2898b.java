package ba0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import m83.C25271y;
import n82.EnumC26455a;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.joda.time.LocalDateTime;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import sp0.C32870j;
import sp0.EnumC32863c;
import sp0.InterfaceC32865e;
import sp0.InterfaceC32869i;

/* JADX INFO: renamed from: ba0.b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u009a\u0001\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00142\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b%\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b+\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b*\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b,\u00107R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u0010'\u001a\u0004\b0\u0010)R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b9\u0010;R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b.\u0010<\u001a\u0004\b8\u0010=R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b3\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b?\u0010A\u001a\u0004\b5\u0010B¨\u0006C"}, m65681d2 = {"Lba0/b;", "", "", "startTime", "Lsp0/c;", "currentEditState", "callToActionDisplay", "activityInternalName", "Lorg/joda/time/LocalDateTime;", "startTimeValue", "endTimeValue", "Lsp0/j;", "strapLocation", "", "allowedStrapLocations", "dataState", "Lsp0/i;", "screenState", "Ln82/a;", "pageType", "", "isGdcFlow", "Lsp0/e;", "invalidDateWarning", "<init>", "(Ljava/lang/String;Lsp0/c;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;Lsp0/j;Ljava/util/List;Lsp0/c;Lsp0/i;Ln82/a;ZLsp0/e;)V", "a", "(Ljava/lang/String;Lsp0/c;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;Lsp0/j;Ljava/util/List;Lsp0/c;Lsp0/i;Ln82/a;ZLsp0/e;)Lba0/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStartTime", "b", "Lsp0/c;", "getCurrentEditState", "()Lsp0/c;", "c", "e", "d", "Lorg/joda/time/LocalDateTime;", "k", "()Lorg/joda/time/LocalDateTime;", "f", "g", "Lsp0/j;", "l", "()Lsp0/j;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/util/List;", "()Ljava/util/List;", "i", "j", "Lsp0/i;", "()Lsp0/i;", "Ln82/a;", "()Ln82/a;", "Z", "m", "()Z", "Lsp0/e;", "()Lsp0/e;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C2898b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String startTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC32863c currentEditState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String callToActionDisplay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String activityInternalName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final LocalDateTime startTimeValue;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final LocalDateTime endTimeValue;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C32870j strapLocation;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final List<C32870j> allowedStrapLocations;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final EnumC32863c dataState;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC32869i screenState;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final EnumC26455a pageType;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final boolean isGdcFlow;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final InterfaceC32865e invalidDateWarning;

    public C2898b(String startTime, EnumC32863c currentEditState, String callToActionDisplay, String activityInternalName, LocalDateTime startTimeValue, LocalDateTime endTimeValue, C32870j c32870j, List<C32870j> allowedStrapLocations, EnumC32863c dataState, InterfaceC32869i screenState, EnumC26455a pageType, boolean z4, InterfaceC32865e invalidDateWarning) {
        AbstractC22676k.m65750j(startTime, "startTime");
        AbstractC22676k.m65750j(currentEditState, "currentEditState");
        AbstractC22676k.m65750j(callToActionDisplay, "callToActionDisplay");
        AbstractC22676k.m65750j(activityInternalName, "activityInternalName");
        AbstractC22676k.m65750j(startTimeValue, "startTimeValue");
        AbstractC22676k.m65750j(endTimeValue, "endTimeValue");
        AbstractC22676k.m65750j(allowedStrapLocations, "allowedStrapLocations");
        AbstractC22676k.m65750j(dataState, "dataState");
        AbstractC22676k.m65750j(screenState, "screenState");
        AbstractC22676k.m65750j(pageType, "pageType");
        AbstractC22676k.m65750j(invalidDateWarning, "invalidDateWarning");
        this.startTime = startTime;
        this.currentEditState = currentEditState;
        this.callToActionDisplay = callToActionDisplay;
        this.activityInternalName = activityInternalName;
        this.startTimeValue = startTimeValue;
        this.endTimeValue = endTimeValue;
        this.strapLocation = c32870j;
        this.allowedStrapLocations = allowedStrapLocations;
        this.dataState = dataState;
        this.screenState = screenState;
        this.pageType = pageType;
        this.isGdcFlow = z4;
        this.invalidDateWarning = invalidDateWarning;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C2898b m8470b(C2898b c2898b, String str, EnumC32863c enumC32863c, String str2, String str3, LocalDateTime localDateTime, LocalDateTime localDateTime2, C32870j c32870j, List list, EnumC32863c enumC32863c2, InterfaceC32869i interfaceC32869i, EnumC26455a enumC26455a, boolean z4, InterfaceC32865e interfaceC32865e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c2898b.startTime;
        }
        return c2898b.m8471a(str, (i13 & 2) != 0 ? c2898b.currentEditState : enumC32863c, (i13 & 4) != 0 ? c2898b.callToActionDisplay : str2, (i13 & 8) != 0 ? c2898b.activityInternalName : str3, (i13 & 16) != 0 ? c2898b.startTimeValue : localDateTime, (i13 & 32) != 0 ? c2898b.endTimeValue : localDateTime2, (i13 & 64) != 0 ? c2898b.strapLocation : c32870j, (i13 & 128) != 0 ? c2898b.allowedStrapLocations : list, (i13 & 256) != 0 ? c2898b.dataState : enumC32863c2, (i13 & 512) != 0 ? c2898b.screenState : interfaceC32869i, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c2898b.pageType : enumC26455a, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c2898b.isGdcFlow : z4, (i13 & 4096) != 0 ? c2898b.invalidDateWarning : interfaceC32865e);
    }

    /* JADX INFO: renamed from: a */
    public final C2898b m8471a(String startTime, EnumC32863c currentEditState, String callToActionDisplay, String activityInternalName, LocalDateTime startTimeValue, LocalDateTime endTimeValue, C32870j strapLocation, List<C32870j> allowedStrapLocations, EnumC32863c dataState, InterfaceC32869i screenState, EnumC26455a pageType, boolean isGdcFlow, InterfaceC32865e invalidDateWarning) {
        AbstractC22676k.m65750j(startTime, "startTime");
        AbstractC22676k.m65750j(currentEditState, "currentEditState");
        AbstractC22676k.m65750j(callToActionDisplay, "callToActionDisplay");
        AbstractC22676k.m65750j(activityInternalName, "activityInternalName");
        AbstractC22676k.m65750j(startTimeValue, "startTimeValue");
        AbstractC22676k.m65750j(endTimeValue, "endTimeValue");
        AbstractC22676k.m65750j(allowedStrapLocations, "allowedStrapLocations");
        AbstractC22676k.m65750j(dataState, "dataState");
        AbstractC22676k.m65750j(screenState, "screenState");
        AbstractC22676k.m65750j(pageType, "pageType");
        AbstractC22676k.m65750j(invalidDateWarning, "invalidDateWarning");
        return new C2898b(startTime, currentEditState, callToActionDisplay, activityInternalName, startTimeValue, endTimeValue, strapLocation, allowedStrapLocations, dataState, screenState, pageType, isGdcFlow, invalidDateWarning);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getActivityInternalName() {
        return this.activityInternalName;
    }

    /* JADX INFO: renamed from: d */
    public final List<C32870j> m8473d() {
        return this.allowedStrapLocations;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCallToActionDisplay() {
        return this.callToActionDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C2898b)) {
            return false;
        }
        C2898b c2898b = (C2898b) other;
        return AbstractC22676k.m65745e(this.startTime, c2898b.startTime) && this.currentEditState == c2898b.currentEditState && AbstractC22676k.m65745e(this.callToActionDisplay, c2898b.callToActionDisplay) && AbstractC22676k.m65745e(this.activityInternalName, c2898b.activityInternalName) && AbstractC22676k.m65745e(this.startTimeValue, c2898b.startTimeValue) && AbstractC22676k.m65745e(this.endTimeValue, c2898b.endTimeValue) && AbstractC22676k.m65745e(this.strapLocation, c2898b.strapLocation) && AbstractC22676k.m65745e(this.allowedStrapLocations, c2898b.allowedStrapLocations) && this.dataState == c2898b.dataState && AbstractC22676k.m65745e(this.screenState, c2898b.screenState) && this.pageType == c2898b.pageType && this.isGdcFlow == c2898b.isGdcFlow && AbstractC22676k.m65745e(this.invalidDateWarning, c2898b.invalidDateWarning);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC32863c getDataState() {
        return this.dataState;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final LocalDateTime getEndTimeValue() {
        return this.endTimeValue;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final InterfaceC32865e getInvalidDateWarning() {
        return this.invalidDateWarning;
    }

    public int hashCode() {
        int iHashCode = (this.endTimeValue.hashCode() + ((this.startTimeValue.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d((this.currentEditState.hashCode() + (this.startTime.hashCode() * 31)) * 31, 31, this.callToActionDisplay), 31, this.activityInternalName)) * 31)) * 31;
        C32870j c32870j = this.strapLocation;
        return this.invalidDateWarning.hashCode() + AbstractC2875y.m8289b((this.pageType.hashCode() + ((this.screenState.hashCode() + ((this.dataState.hashCode() + AbstractC11895b.m31983b((iHashCode + (c32870j == null ? 0 : c32870j.hashCode())) * 31, 31, this.allowedStrapLocations)) * 31)) * 31)) * 31, 31, this.isGdcFlow);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final EnumC26455a getPageType() {
        return this.pageType;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final InterfaceC32869i getScreenState() {
        return this.screenState;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final LocalDateTime getStartTimeValue() {
        return this.startTimeValue;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final C32870j getStrapLocation() {
        return this.strapLocation;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getIsGdcFlow() {
        return this.isGdcFlow;
    }

    public String toString() {
        String str = this.startTime;
        EnumC32863c enumC32863c = this.currentEditState;
        String str2 = this.callToActionDisplay;
        String str3 = this.activityInternalName;
        LocalDateTime localDateTime = this.startTimeValue;
        LocalDateTime localDateTime2 = this.endTimeValue;
        C32870j c32870j = this.strapLocation;
        List<C32870j> list = this.allowedStrapLocations;
        EnumC32863c enumC32863c2 = this.dataState;
        InterfaceC32869i interfaceC32869i = this.screenState;
        EnumC26455a enumC26455a = this.pageType;
        boolean z4 = this.isGdcFlow;
        InterfaceC32865e interfaceC32865e = this.invalidDateWarning;
        StringBuilder sb4 = new StringBuilder("AddActivityDomainState(startTime=");
        sb4.append(str);
        sb4.append(", currentEditState=");
        sb4.append(enumC32863c);
        sb4.append(", callToActionDisplay=");
        AbstractC11266d.m30444B(sb4, str2, ", activityInternalName=", str3, ", startTimeValue=");
        sb4.append(localDateTime);
        sb4.append(", endTimeValue=");
        sb4.append(localDateTime2);
        sb4.append(", strapLocation=");
        sb4.append(c32870j);
        sb4.append(", allowedStrapLocations=");
        sb4.append(list);
        sb4.append(", dataState=");
        sb4.append(enumC32863c2);
        sb4.append(", screenState=");
        sb4.append(interfaceC32869i);
        sb4.append(", pageType=");
        sb4.append(enumC26455a);
        sb4.append(", isGdcFlow=");
        sb4.append(z4);
        sb4.append(", invalidDateWarning=");
        sb4.append(interfaceC32865e);
        sb4.append(")");
        return sb4.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C2898b(String str, EnumC32863c enumC32863c, String str2, String str3, LocalDateTime localDateTime, LocalDateTime localDateTime2, C32870j c32870j, List list, EnumC32863c enumC32863c2, InterfaceC32869i interfaceC32869i, EnumC26455a enumC26455a, boolean z4, InterfaceC32865e interfaceC32865e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        LocalDateTime localDateTimeNow;
        LocalDateTime localDateTimeNow2;
        str = (i13 & 1) != 0 ? "" : str;
        EnumC32863c enumC32863c3 = (i13 & 2) != 0 ? EnumC32863c.COLLAPSED : enumC32863c;
        String str4 = (i13 & 4) != 0 ? "" : str2;
        String str5 = (i13 & 8) == 0 ? str3 : "";
        if ((i13 & 16) != 0) {
            localDateTimeNow = LocalDateTime.now();
            AbstractC22676k.m65749i(localDateTimeNow, "now(...)");
        } else {
            localDateTimeNow = localDateTime;
        }
        if ((i13 & 32) != 0) {
            localDateTimeNow2 = LocalDateTime.now();
            AbstractC22676k.m65749i(localDateTimeNow2, "now(...)");
        } else {
            localDateTimeNow2 = localDateTime2;
        }
        this(str, enumC32863c3, str4, str5, localDateTimeNow, localDateTimeNow2, (i13 & 64) != 0 ? new C32870j(0, null, 3, null) : c32870j, (i13 & 128) != 0 ? C25271y.f99162w : list, (i13 & 256) != 0 ? EnumC32863c.EDIT_ACTIVITY : enumC32863c2, (i13 & 512) != 0 ? InterfaceC32869i.b.f136908a : interfaceC32869i, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? EnumC26455a.ALL : enumC26455a, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0 ? z4 : false, (i13 & 4096) != 0 ? InterfaceC32865e.c.f136904a : interfaceC32865e);
    }
}
