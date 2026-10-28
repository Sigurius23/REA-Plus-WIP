package io.getstream.android.video.generated.models;

import androidx.core.app.NotificationCompat;
import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import jg3.C21682i;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0014Jl\u0010\u001e\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\u00042\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\r\u001a\u00020\f2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b+\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b,\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b-\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b.\u0010\u0014R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u0010\u001aR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b2\u0010\u001cR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b3\u0010\u0014¨\u00064"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CallClosedCaption;", "", "Ljg3/i;", "endTime", "", "id", "language", "speakerId", "startTime", "text", "", "translated", "Lio/getstream/android/video/generated/models/UserResponse;", UserState.Sources.USER, NotificationCompat.CATEGORY_SERVICE, "<init>", "(Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/String;ZLio/getstream/android/video/generated/models/UserResponse;Ljava/lang/String;)V", "component1", "()Ljg3/i;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "()Z", "component8", "()Lio/getstream/android/video/generated/models/UserResponse;", "component9", "copy", "(Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/String;ZLio/getstream/android/video/generated/models/UserResponse;Ljava/lang/String;)Lio/getstream/android/video/generated/models/CallClosedCaption;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljg3/i;", "getEndTime", "Ljava/lang/String;", "getId", "getLanguage", "getSpeakerId", "getStartTime", "getText", "Z", "getTranslated", "Lio/getstream/android/video/generated/models/UserResponse;", "getUser", "getService", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class CallClosedCaption {
    private final C21682i endTime;
    private final String id;
    private final String language;
    private final String service;
    private final String speakerId;
    private final C21682i startTime;
    private final String text;
    private final boolean translated;
    private final UserResponse user;

    public CallClosedCaption(@InterfaceC30731q(name = "end_time") C21682i endTime, @InterfaceC30731q(name = "id") String id4, @InterfaceC30731q(name = "language") String language, @InterfaceC30731q(name = "speaker_id") String speakerId, @InterfaceC30731q(name = "start_time") C21682i startTime, @InterfaceC30731q(name = "text") String text, @InterfaceC30731q(name = "translated") boolean z4, @InterfaceC30731q(name = UserState.Sources.USER) UserResponse user, @InterfaceC30731q(name = NotificationCompat.CATEGORY_SERVICE) String str) {
        AbstractC22676k.m65750j(endTime, "endTime");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(language, "language");
        AbstractC22676k.m65750j(speakerId, "speakerId");
        AbstractC22676k.m65750j(startTime, "startTime");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(user, "user");
        this.endTime = endTime;
        this.id = id4;
        this.language = language;
        this.speakerId = speakerId;
        this.startTime = startTime;
        this.text = text;
        this.translated = z4;
        this.user = user;
        this.service = str;
    }

    public static /* synthetic */ CallClosedCaption copy$default(CallClosedCaption callClosedCaption, C21682i c21682i, String str, String str2, String str3, C21682i c21682i2, String str4, boolean z4, UserResponse userResponse, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c21682i = callClosedCaption.endTime;
        }
        if ((i13 & 2) != 0) {
            str = callClosedCaption.id;
        }
        if ((i13 & 4) != 0) {
            str2 = callClosedCaption.language;
        }
        if ((i13 & 8) != 0) {
            str3 = callClosedCaption.speakerId;
        }
        if ((i13 & 16) != 0) {
            c21682i2 = callClosedCaption.startTime;
        }
        if ((i13 & 32) != 0) {
            str4 = callClosedCaption.text;
        }
        if ((i13 & 64) != 0) {
            z4 = callClosedCaption.translated;
        }
        if ((i13 & 128) != 0) {
            userResponse = callClosedCaption.user;
        }
        if ((i13 & 256) != 0) {
            str5 = callClosedCaption.service;
        }
        UserResponse userResponse2 = userResponse;
        String str6 = str5;
        String str7 = str4;
        boolean z13 = z4;
        C21682i c21682i3 = c21682i2;
        String str8 = str2;
        return callClosedCaption.copy(c21682i, str, str8, str3, c21682i3, str7, z13, userResponse2, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final C21682i getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSpeakerId() {
        return this.speakerId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final C21682i getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getTranslated() {
        return this.translated;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final UserResponse getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getService() {
        return this.service;
    }

    public final CallClosedCaption copy(@InterfaceC30731q(name = "end_time") C21682i endTime, @InterfaceC30731q(name = "id") String id4, @InterfaceC30731q(name = "language") String language, @InterfaceC30731q(name = "speaker_id") String speakerId, @InterfaceC30731q(name = "start_time") C21682i startTime, @InterfaceC30731q(name = "text") String text, @InterfaceC30731q(name = "translated") boolean translated, @InterfaceC30731q(name = UserState.Sources.USER) UserResponse user, @InterfaceC30731q(name = NotificationCompat.CATEGORY_SERVICE) String service) {
        AbstractC22676k.m65750j(endTime, "endTime");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(language, "language");
        AbstractC22676k.m65750j(speakerId, "speakerId");
        AbstractC22676k.m65750j(startTime, "startTime");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(user, "user");
        return new CallClosedCaption(endTime, id4, language, speakerId, startTime, text, translated, user, service);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallClosedCaption)) {
            return false;
        }
        CallClosedCaption callClosedCaption = (CallClosedCaption) other;
        return AbstractC22676k.m65745e(this.endTime, callClosedCaption.endTime) && AbstractC22676k.m65745e(this.id, callClosedCaption.id) && AbstractC22676k.m65745e(this.language, callClosedCaption.language) && AbstractC22676k.m65745e(this.speakerId, callClosedCaption.speakerId) && AbstractC22676k.m65745e(this.startTime, callClosedCaption.startTime) && AbstractC22676k.m65745e(this.text, callClosedCaption.text) && this.translated == callClosedCaption.translated && AbstractC22676k.m65745e(this.user, callClosedCaption.user) && AbstractC22676k.m65745e(this.service, callClosedCaption.service);
    }

    public final C21682i getEndTime() {
        return this.endTime;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getService() {
        return this.service;
    }

    public final String getSpeakerId() {
        return this.speakerId;
    }

    public final C21682i getStartTime() {
        return this.startTime;
    }

    public final String getText() {
        return this.text;
    }

    public final boolean getTranslated() {
        return this.translated;
    }

    public final UserResponse getUser() {
        return this.user;
    }

    public int hashCode() {
        int iHashCode = (this.user.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC3855a.m11822f(this.startTime, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.endTime.hashCode() * 31, 31, this.id), 31, this.language), 31, this.speakerId), 31), 31, this.text), 31, this.translated)) * 31;
        String str = this.service;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        C21682i c21682i = this.endTime;
        String str = this.id;
        String str2 = this.language;
        String str3 = this.speakerId;
        C21682i c21682i2 = this.startTime;
        String str4 = this.text;
        boolean z4 = this.translated;
        UserResponse userResponse = this.user;
        String str5 = this.service;
        StringBuilder sb4 = new StringBuilder("CallClosedCaption(endTime=");
        sb4.append(c21682i);
        sb4.append(", id=");
        sb4.append(str);
        sb4.append(", language=");
        AbstractC11266d.m30444B(sb4, str2, ", speakerId=", str3, ", startTime=");
        sb4.append(c21682i2);
        sb4.append(", text=");
        sb4.append(str4);
        sb4.append(", translated=");
        sb4.append(z4);
        sb4.append(", user=");
        sb4.append(userResponse);
        sb4.append(", service=");
        return AbstractC25012a.m73376i(str5, ")", sb4);
    }

    public /* synthetic */ CallClosedCaption(C21682i c21682i, String str, String str2, String str3, C21682i c21682i2, String str4, boolean z4, UserResponse userResponse, String str5, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c21682i, str, str2, str3, c21682i2, str4, z4, userResponse, (i13 & 256) != 0 ? null : str5);
    }
}
