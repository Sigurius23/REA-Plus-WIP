package xd1;

import androidx.profileinstaller.ProfileVerifier;
import hc3.AbstractC17176i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.joda.time.LocalDateTime;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import sp0.C32870j;
import sp0.EnumC32861a;
import sp0.EnumC32863c;
import sp0.InterfaceC32865e;
import tp0.EnumC34058c;
import zd1.InterfaceC40553h;

/* JADX INFO: renamed from: xd1.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u0001BË\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJÔ\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e2\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001cHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u001c2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010*\u001a\u0004\b+\u0010#R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010#R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010*\u001a\u0004\b3\u0010#R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010*\u001a\u0004\b2\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b3\u00106\u001a\u0004\b9\u00108R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e8\u0006¢\u0006\f\n\u0004\b-\u0010>\u001a\u0004\b5\u0010?R\u0017\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b9\u0010/\u001a\u0004\b:\u00101R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\b4\u0010FR\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u0010*\u001a\u0004\b.\u0010#R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bB\u0010H\u001a\u0004\bD\u0010IR\u001f\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bJ\u0010>\u001a\u0004\bG\u0010?R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010*\u001a\u0004\b@\u0010#R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b7\u0010K\u001a\u0004\bJ\u0010LR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b<\u0010M\u001a\u0004\bN\u0010O¨\u0006P"}, m65681d2 = {"Lxd1/b;", "", "", "startTime", "endTime", "Lsp0/c;", "currentEditState", "callToActionDisplay", "activityInternalName", "Lorg/joda/time/LocalDateTime;", "startTimeValue", "endTimeValue", "Lsp0/j;", "strapLocation", "", "allowedStrapLocations", "dataState", "Lzd1/h;", "screenState", "Lsp0/a;", "activityType", "activityId", "Lsp0/e;", "invalidDateWarning", "overlappingActivities", "flow", "Ltp0/c;", "selectedScreenSection", "", "isDeletable", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lsp0/c;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;Lsp0/j;Ljava/util/List;Lsp0/c;Lzd1/h;Lsp0/a;Ljava/lang/String;Lsp0/e;Ljava/util/List;Ljava/lang/String;Ltp0/c;Z)V", "a", "(Ljava/lang/String;Ljava/lang/String;Lsp0/c;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;Lsp0/j;Ljava/util/List;Lsp0/c;Lzd1/h;Lsp0/a;Ljava/lang/String;Lsp0/e;Ljava/util/List;Ljava/lang/String;Ltp0/c;Z)Lxd1/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "p", "b", "i", "c", "Lsp0/c;", "getCurrentEditState", "()Lsp0/c;", "d", "g", "e", "f", "Lorg/joda/time/LocalDateTime;", "q", "()Lorg/joda/time/LocalDateTime;", "j", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lsp0/j;", "r", "()Lsp0/j;", "Ljava/util/List;", "()Ljava/util/List;", "k", "Lzd1/h;", "n", "()Lzd1/h;", "l", "Lsp0/a;", "()Lsp0/a;", "m", "Lsp0/e;", "()Lsp0/e;", "o", "Ltp0/c;", "()Ltp0/c;", "Z", "s", "()Z", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38203b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String startTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String endTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC32863c currentEditState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String callToActionDisplay;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String activityInternalName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final LocalDateTime startTimeValue;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final LocalDateTime endTimeValue;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C32870j strapLocation;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final List<C32870j> allowedStrapLocations;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final EnumC32863c dataState;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final InterfaceC40553h screenState;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final EnumC32861a activityType;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final String activityId;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final InterfaceC32865e invalidDateWarning;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final List<String> overlappingActivities;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final String flow;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final EnumC34058c selectedScreenSection;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final boolean isDeletable;

    public C38203b(String startTime, String endTime, EnumC32863c currentEditState, String callToActionDisplay, String activityInternalName, LocalDateTime startTimeValue, LocalDateTime endTimeValue, C32870j c32870j, List<C32870j> allowedStrapLocations, EnumC32863c dataState, InterfaceC40553h screenState, EnumC32861a activityType, String activityId, InterfaceC32865e invalidDateWarning, List<String> list, String flow, EnumC34058c selectedScreenSection, boolean z4) {
        AbstractC22676k.m65750j(startTime, "startTime");
        AbstractC22676k.m65750j(endTime, "endTime");
        AbstractC22676k.m65750j(currentEditState, "currentEditState");
        AbstractC22676k.m65750j(callToActionDisplay, "callToActionDisplay");
        AbstractC22676k.m65750j(activityInternalName, "activityInternalName");
        AbstractC22676k.m65750j(startTimeValue, "startTimeValue");
        AbstractC22676k.m65750j(endTimeValue, "endTimeValue");
        AbstractC22676k.m65750j(allowedStrapLocations, "allowedStrapLocations");
        AbstractC22676k.m65750j(dataState, "dataState");
        AbstractC22676k.m65750j(screenState, "screenState");
        AbstractC22676k.m65750j(activityType, "activityType");
        AbstractC22676k.m65750j(activityId, "activityId");
        AbstractC22676k.m65750j(invalidDateWarning, "invalidDateWarning");
        AbstractC22676k.m65750j(flow, "flow");
        AbstractC22676k.m65750j(selectedScreenSection, "selectedScreenSection");
        this.startTime = startTime;
        this.endTime = endTime;
        this.currentEditState = currentEditState;
        this.callToActionDisplay = callToActionDisplay;
        this.activityInternalName = activityInternalName;
        this.startTimeValue = startTimeValue;
        this.endTimeValue = endTimeValue;
        this.strapLocation = c32870j;
        this.allowedStrapLocations = allowedStrapLocations;
        this.dataState = dataState;
        this.screenState = screenState;
        this.activityType = activityType;
        this.activityId = activityId;
        this.invalidDateWarning = invalidDateWarning;
        this.overlappingActivities = list;
        this.flow = flow;
        this.selectedScreenSection = selectedScreenSection;
        this.isDeletable = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C38203b m122366b(C38203b c38203b, String str, String str2, EnumC32863c enumC32863c, String str3, String str4, LocalDateTime localDateTime, LocalDateTime localDateTime2, C32870j c32870j, List list, EnumC32863c enumC32863c2, InterfaceC40553h interfaceC40553h, EnumC32861a enumC32861a, String str5, InterfaceC32865e interfaceC32865e, List list2, String str6, EnumC34058c enumC34058c, boolean z4, int i13, Object obj) {
        boolean z13;
        EnumC34058c enumC34058c2;
        String str7 = (i13 & 1) != 0 ? c38203b.startTime : str;
        String str8 = (i13 & 2) != 0 ? c38203b.endTime : str2;
        EnumC32863c enumC32863c3 = (i13 & 4) != 0 ? c38203b.currentEditState : enumC32863c;
        String str9 = (i13 & 8) != 0 ? c38203b.callToActionDisplay : str3;
        String str10 = (i13 & 16) != 0 ? c38203b.activityInternalName : str4;
        LocalDateTime localDateTime3 = (i13 & 32) != 0 ? c38203b.startTimeValue : localDateTime;
        LocalDateTime localDateTime4 = (i13 & 64) != 0 ? c38203b.endTimeValue : localDateTime2;
        C32870j c32870j2 = (i13 & 128) != 0 ? c38203b.strapLocation : c32870j;
        List list3 = (i13 & 256) != 0 ? c38203b.allowedStrapLocations : list;
        EnumC32863c enumC32863c4 = (i13 & 512) != 0 ? c38203b.dataState : enumC32863c2;
        InterfaceC40553h interfaceC40553h2 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c38203b.screenState : interfaceC40553h;
        EnumC32861a enumC32861a2 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c38203b.activityType : enumC32861a;
        String str11 = (i13 & 4096) != 0 ? c38203b.activityId : str5;
        InterfaceC32865e interfaceC32865e2 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c38203b.invalidDateWarning : interfaceC32865e;
        String str12 = str7;
        List list4 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c38203b.overlappingActivities : list2;
        String str13 = (i13 & 32768) != 0 ? c38203b.flow : str6;
        EnumC34058c enumC34058c3 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? c38203b.selectedScreenSection : enumC34058c;
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0) {
            enumC34058c2 = enumC34058c3;
            z13 = c38203b.isDeletable;
        } else {
            z13 = z4;
            enumC34058c2 = enumC34058c3;
        }
        return c38203b.m122367a(str12, str8, enumC32863c3, str9, str10, localDateTime3, localDateTime4, c32870j2, list3, enumC32863c4, interfaceC40553h2, enumC32861a2, str11, interfaceC32865e2, list4, str13, enumC34058c2, z13);
    }

    /* JADX INFO: renamed from: a */
    public final C38203b m122367a(String startTime, String endTime, EnumC32863c currentEditState, String callToActionDisplay, String activityInternalName, LocalDateTime startTimeValue, LocalDateTime endTimeValue, C32870j strapLocation, List<C32870j> allowedStrapLocations, EnumC32863c dataState, InterfaceC40553h screenState, EnumC32861a activityType, String activityId, InterfaceC32865e invalidDateWarning, List<String> overlappingActivities, String flow, EnumC34058c selectedScreenSection, boolean isDeletable) {
        AbstractC22676k.m65750j(startTime, "startTime");
        AbstractC22676k.m65750j(endTime, "endTime");
        AbstractC22676k.m65750j(currentEditState, "currentEditState");
        AbstractC22676k.m65750j(callToActionDisplay, "callToActionDisplay");
        AbstractC22676k.m65750j(activityInternalName, "activityInternalName");
        AbstractC22676k.m65750j(startTimeValue, "startTimeValue");
        AbstractC22676k.m65750j(endTimeValue, "endTimeValue");
        AbstractC22676k.m65750j(allowedStrapLocations, "allowedStrapLocations");
        AbstractC22676k.m65750j(dataState, "dataState");
        AbstractC22676k.m65750j(screenState, "screenState");
        AbstractC22676k.m65750j(activityType, "activityType");
        AbstractC22676k.m65750j(activityId, "activityId");
        AbstractC22676k.m65750j(invalidDateWarning, "invalidDateWarning");
        AbstractC22676k.m65750j(flow, "flow");
        AbstractC22676k.m65750j(selectedScreenSection, "selectedScreenSection");
        return new C38203b(startTime, endTime, currentEditState, callToActionDisplay, activityInternalName, startTimeValue, endTimeValue, strapLocation, allowedStrapLocations, dataState, screenState, activityType, activityId, invalidDateWarning, overlappingActivities, flow, selectedScreenSection, isDeletable);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getActivityId() {
        return this.activityId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getActivityInternalName() {
        return this.activityInternalName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC32861a getActivityType() {
        return this.activityType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38203b)) {
            return false;
        }
        C38203b c38203b = (C38203b) other;
        return AbstractC22676k.m65745e(this.startTime, c38203b.startTime) && AbstractC22676k.m65745e(this.endTime, c38203b.endTime) && this.currentEditState == c38203b.currentEditState && AbstractC22676k.m65745e(this.callToActionDisplay, c38203b.callToActionDisplay) && AbstractC22676k.m65745e(this.activityInternalName, c38203b.activityInternalName) && AbstractC22676k.m65745e(this.startTimeValue, c38203b.startTimeValue) && AbstractC22676k.m65745e(this.endTimeValue, c38203b.endTimeValue) && AbstractC22676k.m65745e(this.strapLocation, c38203b.strapLocation) && AbstractC22676k.m65745e(this.allowedStrapLocations, c38203b.allowedStrapLocations) && this.dataState == c38203b.dataState && AbstractC22676k.m65745e(this.screenState, c38203b.screenState) && this.activityType == c38203b.activityType && AbstractC22676k.m65745e(this.activityId, c38203b.activityId) && AbstractC22676k.m65745e(this.invalidDateWarning, c38203b.invalidDateWarning) && AbstractC22676k.m65745e(this.overlappingActivities, c38203b.overlappingActivities) && AbstractC22676k.m65745e(this.flow, c38203b.flow) && this.selectedScreenSection == c38203b.selectedScreenSection && this.isDeletable == c38203b.isDeletable;
    }

    /* JADX INFO: renamed from: f */
    public final List<C32870j> m122371f() {
        return this.allowedStrapLocations;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getCallToActionDisplay() {
        return this.callToActionDisplay;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final EnumC32863c getDataState() {
        return this.dataState;
    }

    public int hashCode() {
        int iHashCode = (this.endTimeValue.hashCode() + ((this.startTimeValue.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d((this.currentEditState.hashCode() + AbstractC11266d.m30450d(this.startTime.hashCode() * 31, 31, this.endTime)) * 31, 31, this.callToActionDisplay), 31, this.activityInternalName)) * 31)) * 31;
        C32870j c32870j = this.strapLocation;
        int iHashCode2 = (this.invalidDateWarning.hashCode() + AbstractC11266d.m30450d((this.activityType.hashCode() + ((this.screenState.hashCode() + ((this.dataState.hashCode() + AbstractC11895b.m31983b((iHashCode + (c32870j == null ? 0 : c32870j.hashCode())) * 31, 31, this.allowedStrapLocations)) * 31)) * 31)) * 31, 31, this.activityId)) * 31;
        List<String> list = this.overlappingActivities;
        return Boolean.hashCode(this.isDeletable) + ((this.selectedScreenSection.hashCode() + AbstractC11266d.m30450d((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31, 31, this.flow)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final LocalDateTime getEndTimeValue() {
        return this.endTimeValue;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getFlow() {
        return this.flow;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final InterfaceC32865e getInvalidDateWarning() {
        return this.invalidDateWarning;
    }

    /* JADX INFO: renamed from: m */
    public final List<String> m122378m() {
        return this.overlappingActivities;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final InterfaceC40553h getScreenState() {
        return this.screenState;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final EnumC34058c getSelectedScreenSection() {
        return this.selectedScreenSection;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final LocalDateTime getStartTimeValue() {
        return this.startTimeValue;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final C32870j getStrapLocation() {
        return this.strapLocation;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getIsDeletable() {
        return this.isDeletable;
    }

    public String toString() {
        String str = this.startTime;
        String str2 = this.endTime;
        EnumC32863c enumC32863c = this.currentEditState;
        String str3 = this.callToActionDisplay;
        String str4 = this.activityInternalName;
        LocalDateTime localDateTime = this.startTimeValue;
        LocalDateTime localDateTime2 = this.endTimeValue;
        C32870j c32870j = this.strapLocation;
        List<C32870j> list = this.allowedStrapLocations;
        EnumC32863c enumC32863c2 = this.dataState;
        InterfaceC40553h interfaceC40553h = this.screenState;
        EnumC32861a enumC32861a = this.activityType;
        String str5 = this.activityId;
        InterfaceC32865e interfaceC32865e = this.invalidDateWarning;
        List<String> list2 = this.overlappingActivities;
        String str6 = this.flow;
        EnumC34058c enumC34058c = this.selectedScreenSection;
        boolean z4 = this.isDeletable;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("EditActivityDomainState(startTime=", str, ", endTime=", str2, ", currentEditState=");
        sbM32001t.append(enumC32863c);
        sbM32001t.append(", callToActionDisplay=");
        sbM32001t.append(str3);
        sbM32001t.append(", activityInternalName=");
        sbM32001t.append(str4);
        sbM32001t.append(", startTimeValue=");
        sbM32001t.append(localDateTime);
        sbM32001t.append(", endTimeValue=");
        sbM32001t.append(localDateTime2);
        sbM32001t.append(", strapLocation=");
        sbM32001t.append(c32870j);
        sbM32001t.append(", allowedStrapLocations=");
        sbM32001t.append(list);
        sbM32001t.append(", dataState=");
        sbM32001t.append(enumC32863c2);
        sbM32001t.append(", screenState=");
        sbM32001t.append(interfaceC40553h);
        sbM32001t.append(", activityType=");
        sbM32001t.append(enumC32861a);
        sbM32001t.append(", activityId=");
        sbM32001t.append(str5);
        sbM32001t.append(", invalidDateWarning=");
        sbM32001t.append(interfaceC32865e);
        sbM32001t.append(", overlappingActivities=");
        AbstractC17176i.m48511m(", flow=", str6, ", selectedScreenSection=", sbM32001t, list2);
        sbM32001t.append(enumC34058c);
        sbM32001t.append(", isDeletable=");
        sbM32001t.append(z4);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C38203b(String str, String str2, EnumC32863c enumC32863c, String str3, String str4, LocalDateTime localDateTime, LocalDateTime localDateTime2, C32870j c32870j, List list, EnumC32863c enumC32863c2, InterfaceC40553h interfaceC40553h, EnumC32861a enumC32861a, String str5, InterfaceC32865e interfaceC32865e, List list2, String str6, EnumC34058c enumC34058c, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        LocalDateTime localDateTimeNow;
        LocalDateTime localDateTimeNow2;
        String str7 = (i13 & 1) != 0 ? "" : str;
        String str8 = (i13 & 2) != 0 ? "" : str2;
        EnumC32863c enumC32863c3 = (i13 & 4) != 0 ? EnumC32863c.COLLAPSED : enumC32863c;
        String str9 = (i13 & 8) != 0 ? "" : str3;
        String str10 = (i13 & 16) != 0 ? "" : str4;
        if ((i13 & 32) != 0) {
            localDateTimeNow = LocalDateTime.now();
            AbstractC22676k.m65749i(localDateTimeNow, "now(...)");
        } else {
            localDateTimeNow = localDateTime;
        }
        if ((i13 & 64) != 0) {
            localDateTimeNow2 = LocalDateTime.now();
            AbstractC22676k.m65749i(localDateTimeNow2, "now(...)");
        } else {
            localDateTimeNow2 = localDateTime2;
        }
        C32870j c32870j2 = (i13 & 128) != 0 ? new C32870j(0, null, 3, null) : c32870j;
        int i14 = i13 & 256;
        List list3 = C25271y.f99162w;
        this(str7, str8, enumC32863c3, str9, str10, localDateTimeNow, localDateTimeNow2, c32870j2, i14 != 0 ? list3 : list, (i13 & 512) != 0 ? EnumC32863c.EDIT_ACTIVITY : enumC32863c2, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? InterfaceC40553h.a.f174615a : interfaceC40553h, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? EnumC32861a.SLEEP : enumC32861a, (i13 & 4096) != 0 ? "" : str5, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? InterfaceC32865e.c.f136904a : interfaceC32865e, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) == 0 ? list2 : list3, (32768 & i13) == 0 ? str6 : "", (65536 & i13) != 0 ? EnumC34058c.NONE : enumC34058c, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? false : z4);
    }
}
