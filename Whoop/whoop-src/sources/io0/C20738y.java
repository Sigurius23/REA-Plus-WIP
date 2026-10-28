package io0;

import androidx.core.app.NotificationCompat;
import c13.AbstractC3855a;
import com.whoop.clinicianintheloop.api.VideoSchedulingIntakeMultiSelectResponseBody;
import com.whoop.clinicianintheloop.api.VideoSchedulingIntakeResponse;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Map;
import java.util.Set;
import lo0.InterfaceC24615z;
import m83.C25235a0;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: io0.y */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001BÕ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00120\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u0011\u0012\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00180\u0011\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001a¢\u0006\u0004\b\u001c\u0010\u001dJÞ\u0001\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u00112\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00180\u00112\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001aHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b)\u00106\u001a\u0004\b7\u0010#R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b1\u00106\u001a\u0004\b8\u0010#R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b8\u00100\u001a\u0004\b2\u0010!R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b9\u0010!R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b:\u00100\u001a\u0004\b/\u0010!R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b9\u00100\u001a\u0004\b;\u0010!R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b7\u0010<\u001a\u0004\b:\u0010=R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b>\u0010@R#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u00118\u0006¢\u0006\f\n\u0004\bA\u0010<\u001a\u0004\bB\u0010=R#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00180\u00118\u0006¢\u0006\f\n\u0004\b-\u0010<\u001a\u0004\bA\u0010=R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001a8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bC\u0010E¨\u0006F"}, m65681d2 = {"Lio0/y;", "", "Lio0/x;", "currentDialogType", "Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeResponse;", "response", "", "currentScreenId", "Llo0/z;", NotificationCompat.CATEGORY_EVENT, "", "lastScreenIndex", "currentScreenIndex", "appointmentType", "intakeType", "appointmentId", "stateSelectSelectedId", "", "Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeMultiSelectResponseBody;", "intakeResponsesByScreenId", "Lio0/u;", "personalIntakeResponses", "Lio0/w;", "textEntryResponsesByScreenId", "Lio0/t;", "pickerEntryResponseByScreenId", "", "skippedScreenIds", "<init>", "(Lio0/x;Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeResponse;Ljava/lang/String;Llo0/z;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lio0/u;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;)V", "a", "(Lio0/x;Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeResponse;Ljava/lang/String;Llo0/z;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lio0/u;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;)Lio0/y;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio0/x;", "e", "()Lio0/x;", "b", "Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeResponse;", "n", "()Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeResponse;", "c", "Ljava/lang/String;", "f", "d", "Llo0/z;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Llo0/z;", "I", "k", "g", "j", "i", "p", "Ljava/util/Map;", "()Ljava/util/Map;", "l", "Lio0/u;", "()Lio0/u;", "m", "q", "o", "Ljava/util/Set;", "()Ljava/util/Set;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C20738y {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC20737x currentDialogType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final VideoSchedulingIntakeResponse response;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String currentScreenId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC24615z event;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int lastScreenIndex;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int currentScreenIndex;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String appointmentType;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String intakeType;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String appointmentId;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final String stateSelectSelectedId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final Map<String, VideoSchedulingIntakeMultiSelectResponseBody> intakeResponsesByScreenId;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C20734u personalIntakeResponses;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final Map<String, C20736w> textEntryResponsesByScreenId;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final Map<String, C20733t> pickerEntryResponseByScreenId;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final Set<String> skippedScreenIds;

    public C20738y(InterfaceC20737x interfaceC20737x, VideoSchedulingIntakeResponse videoSchedulingIntakeResponse, String str, InterfaceC24615z interfaceC24615z, int i13, int i14, String appointmentType, String str2, String str3, String str4, Map<String, VideoSchedulingIntakeMultiSelectResponseBody> intakeResponsesByScreenId, C20734u personalIntakeResponses, Map<String, C20736w> textEntryResponsesByScreenId, Map<String, C20733t> pickerEntryResponseByScreenId, Set<String> skippedScreenIds) {
        AbstractC22676k.m65750j(appointmentType, "appointmentType");
        AbstractC22676k.m65750j(intakeResponsesByScreenId, "intakeResponsesByScreenId");
        AbstractC22676k.m65750j(personalIntakeResponses, "personalIntakeResponses");
        AbstractC22676k.m65750j(textEntryResponsesByScreenId, "textEntryResponsesByScreenId");
        AbstractC22676k.m65750j(pickerEntryResponseByScreenId, "pickerEntryResponseByScreenId");
        AbstractC22676k.m65750j(skippedScreenIds, "skippedScreenIds");
        this.currentDialogType = interfaceC20737x;
        this.response = videoSchedulingIntakeResponse;
        this.currentScreenId = str;
        this.event = interfaceC24615z;
        this.lastScreenIndex = i13;
        this.currentScreenIndex = i14;
        this.appointmentType = appointmentType;
        this.intakeType = str2;
        this.appointmentId = str3;
        this.stateSelectSelectedId = str4;
        this.intakeResponsesByScreenId = intakeResponsesByScreenId;
        this.personalIntakeResponses = personalIntakeResponses;
        this.textEntryResponsesByScreenId = textEntryResponsesByScreenId;
        this.pickerEntryResponseByScreenId = pickerEntryResponseByScreenId;
        this.skippedScreenIds = skippedScreenIds;
    }

    /* JADX INFO: renamed from: a */
    public final C20738y m57042a(InterfaceC20737x currentDialogType, VideoSchedulingIntakeResponse response, String currentScreenId, InterfaceC24615z event, int lastScreenIndex, int currentScreenIndex, String appointmentType, String intakeType, String appointmentId, String stateSelectSelectedId, Map<String, VideoSchedulingIntakeMultiSelectResponseBody> intakeResponsesByScreenId, C20734u personalIntakeResponses, Map<String, C20736w> textEntryResponsesByScreenId, Map<String, C20733t> pickerEntryResponseByScreenId, Set<String> skippedScreenIds) {
        AbstractC22676k.m65750j(appointmentType, "appointmentType");
        AbstractC22676k.m65750j(intakeResponsesByScreenId, "intakeResponsesByScreenId");
        AbstractC22676k.m65750j(personalIntakeResponses, "personalIntakeResponses");
        AbstractC22676k.m65750j(textEntryResponsesByScreenId, "textEntryResponsesByScreenId");
        AbstractC22676k.m65750j(pickerEntryResponseByScreenId, "pickerEntryResponseByScreenId");
        AbstractC22676k.m65750j(skippedScreenIds, "skippedScreenIds");
        return new C20738y(currentDialogType, response, currentScreenId, event, lastScreenIndex, currentScreenIndex, appointmentType, intakeType, appointmentId, stateSelectSelectedId, intakeResponsesByScreenId, personalIntakeResponses, textEntryResponsesByScreenId, pickerEntryResponseByScreenId, skippedScreenIds);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAppointmentId() {
        return this.appointmentId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getAppointmentType() {
        return this.appointmentType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC20737x getCurrentDialogType() {
        return this.currentDialogType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20738y)) {
            return false;
        }
        C20738y c20738y = (C20738y) other;
        return AbstractC22676k.m65745e(this.currentDialogType, c20738y.currentDialogType) && AbstractC22676k.m65745e(this.response, c20738y.response) && AbstractC22676k.m65745e(this.currentScreenId, c20738y.currentScreenId) && AbstractC22676k.m65745e(this.event, c20738y.event) && this.lastScreenIndex == c20738y.lastScreenIndex && this.currentScreenIndex == c20738y.currentScreenIndex && AbstractC22676k.m65745e(this.appointmentType, c20738y.appointmentType) && AbstractC22676k.m65745e(this.intakeType, c20738y.intakeType) && AbstractC22676k.m65745e(this.appointmentId, c20738y.appointmentId) && AbstractC22676k.m65745e(this.stateSelectSelectedId, c20738y.stateSelectSelectedId) && AbstractC22676k.m65745e(this.intakeResponsesByScreenId, c20738y.intakeResponsesByScreenId) && AbstractC22676k.m65745e(this.personalIntakeResponses, c20738y.personalIntakeResponses) && AbstractC22676k.m65745e(this.textEntryResponsesByScreenId, c20738y.textEntryResponsesByScreenId) && AbstractC22676k.m65745e(this.pickerEntryResponseByScreenId, c20738y.pickerEntryResponseByScreenId) && AbstractC22676k.m65745e(this.skippedScreenIds, c20738y.skippedScreenIds);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCurrentScreenId() {
        return this.currentScreenId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getCurrentScreenIndex() {
        return this.currentScreenIndex;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final InterfaceC24615z getEvent() {
        return this.event;
    }

    public int hashCode() {
        InterfaceC20737x interfaceC20737x = this.currentDialogType;
        int iHashCode = (interfaceC20737x == null ? 0 : interfaceC20737x.hashCode()) * 31;
        VideoSchedulingIntakeResponse videoSchedulingIntakeResponse = this.response;
        int iHashCode2 = (iHashCode + (videoSchedulingIntakeResponse == null ? 0 : videoSchedulingIntakeResponse.hashCode())) * 31;
        String str = this.currentScreenId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        InterfaceC24615z interfaceC24615z = this.event;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.currentScreenIndex, AbstractC11266d.m30448b(this.lastScreenIndex, (iHashCode3 + (interfaceC24615z == null ? 0 : interfaceC24615z.hashCode())) * 31, 31), 31), 31, this.appointmentType);
        String str2 = this.intakeType;
        int iHashCode4 = (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.appointmentId;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.stateSelectSelectedId;
        return this.skippedScreenIds.hashCode() + AbstractC3855a.m11821e(this.pickerEntryResponseByScreenId, AbstractC3855a.m11821e(this.textEntryResponsesByScreenId, (this.personalIntakeResponses.hashCode() + AbstractC3855a.m11821e(this.intakeResponsesByScreenId, (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31, 31)) * 31, 31), 31);
    }

    /* JADX INFO: renamed from: i */
    public final Map<String, VideoSchedulingIntakeMultiSelectResponseBody> m57049i() {
        return this.intakeResponsesByScreenId;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getIntakeType() {
        return this.intakeType;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getLastScreenIndex() {
        return this.lastScreenIndex;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final C20734u getPersonalIntakeResponses() {
        return this.personalIntakeResponses;
    }

    /* JADX INFO: renamed from: m */
    public final Map<String, C20733t> m57053m() {
        return this.pickerEntryResponseByScreenId;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final VideoSchedulingIntakeResponse getResponse() {
        return this.response;
    }

    /* JADX INFO: renamed from: o */
    public final Set<String> m57055o() {
        return this.skippedScreenIds;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getStateSelectSelectedId() {
        return this.stateSelectSelectedId;
    }

    /* JADX INFO: renamed from: q */
    public final Map<String, C20736w> m57057q() {
        return this.textEntryResponsesByScreenId;
    }

    public String toString() {
        InterfaceC20737x interfaceC20737x = this.currentDialogType;
        VideoSchedulingIntakeResponse videoSchedulingIntakeResponse = this.response;
        String str = this.currentScreenId;
        InterfaceC24615z interfaceC24615z = this.event;
        int i13 = this.lastScreenIndex;
        int i14 = this.currentScreenIndex;
        String str2 = this.appointmentType;
        String str3 = this.intakeType;
        String str4 = this.appointmentId;
        String str5 = this.stateSelectSelectedId;
        Map<String, VideoSchedulingIntakeMultiSelectResponseBody> map = this.intakeResponsesByScreenId;
        C20734u c20734u = this.personalIntakeResponses;
        Map<String, C20736w> map2 = this.textEntryResponsesByScreenId;
        Map<String, C20733t> map3 = this.pickerEntryResponseByScreenId;
        Set<String> set = this.skippedScreenIds;
        StringBuilder sb4 = new StringBuilder("VideoSchedulingIntakeDomainState(currentDialogType=");
        sb4.append(interfaceC20737x);
        sb4.append(", response=");
        sb4.append(videoSchedulingIntakeResponse);
        sb4.append(", currentScreenId=");
        sb4.append(str);
        sb4.append(", event=");
        sb4.append(interfaceC24615z);
        sb4.append(", lastScreenIndex=");
        AbstractC30802r.m94773v(sb4, i13, ", currentScreenIndex=", i14, ", appointmentType=");
        AbstractC11266d.m30444B(sb4, str2, ", intakeType=", str3, ", appointmentId=");
        AbstractC11266d.m30444B(sb4, str4, ", stateSelectSelectedId=", str5, ", intakeResponsesByScreenId=");
        sb4.append(map);
        sb4.append(", personalIntakeResponses=");
        sb4.append(c20734u);
        sb4.append(", textEntryResponsesByScreenId=");
        AbstractC3855a.m11840x(sb4, map2, ", pickerEntryResponseByScreenId=", map3, ", skippedScreenIds=");
        sb4.append(set);
        sb4.append(")");
        return sb4.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C20738y(InterfaceC20737x interfaceC20737x, VideoSchedulingIntakeResponse videoSchedulingIntakeResponse, String str, InterfaceC24615z interfaceC24615z, int i13, int i14, String str2, String str3, String str4, String str5, Map map, C20734u c20734u, Map map2, Map map3, Set set, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        InterfaceC20737x interfaceC20737x2 = (i15 & 1) != 0 ? null : interfaceC20737x;
        VideoSchedulingIntakeResponse videoSchedulingIntakeResponse2 = (i15 & 2) != 0 ? null : videoSchedulingIntakeResponse;
        String str6 = (i15 & 4) != 0 ? null : str;
        InterfaceC24615z interfaceC24615z2 = (i15 & 8) != 0 ? null : interfaceC24615z;
        int i16 = (i15 & 16) != 0 ? -1 : i13;
        int i17 = (i15 & 32) == 0 ? i14 : -1;
        String str7 = (i15 & 64) != 0 ? "" : str2;
        String str8 = (i15 & 128) != 0 ? null : str3;
        String str9 = (i15 & 256) != 0 ? null : str4;
        String str10 = (i15 & 512) == 0 ? str5 : null;
        int i18 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        Map map4 = C25272z.f99163w;
        this(interfaceC20737x2, videoSchedulingIntakeResponse2, str6, interfaceC24615z2, i16, i17, str7, str8, str9, str10, i18 != 0 ? map4 : map, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? new C20734u(null, null, null, null, null, null, null, null, null, null, 1023, null) : c20734u, (i15 & 4096) != 0 ? map4 : map2, (i15 & DfuBaseService.ERROR_REMOTE_MASK) == 0 ? map3 : map4, (i15 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? C25235a0.f99113w : set);
    }
}
