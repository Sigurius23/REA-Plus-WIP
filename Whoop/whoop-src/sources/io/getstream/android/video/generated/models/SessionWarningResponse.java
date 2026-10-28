package io.getstream.android.video.generated.models;

import jg3.C21682i;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r¨\u0006\u001d"}, m65681d2 = {"Lio/getstream/android/video/generated/models/SessionWarningResponse;", "", "", "code", "warning", "Ljg3/i;", "time", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljg3/i;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljg3/i;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljg3/i;)Lio/getstream/android/video/generated/models/SessionWarningResponse;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCode", "getWarning", "Ljg3/i;", "getTime", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class SessionWarningResponse {
    private final String code;
    private final C21682i time;
    private final String warning;

    public SessionWarningResponse(@InterfaceC30731q(name = "code") String code, @InterfaceC30731q(name = "warning") String warning, @InterfaceC30731q(name = "time") C21682i c21682i) {
        AbstractC22676k.m65750j(code, "code");
        AbstractC22676k.m65750j(warning, "warning");
        this.code = code;
        this.warning = warning;
        this.time = c21682i;
    }

    public static /* synthetic */ SessionWarningResponse copy$default(SessionWarningResponse sessionWarningResponse, String str, String str2, C21682i c21682i, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sessionWarningResponse.code;
        }
        if ((i13 & 2) != 0) {
            str2 = sessionWarningResponse.warning;
        }
        if ((i13 & 4) != 0) {
            c21682i = sessionWarningResponse.time;
        }
        return sessionWarningResponse.copy(str, str2, c21682i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getWarning() {
        return this.warning;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final C21682i getTime() {
        return this.time;
    }

    public final SessionWarningResponse copy(@InterfaceC30731q(name = "code") String code, @InterfaceC30731q(name = "warning") String warning, @InterfaceC30731q(name = "time") C21682i time) {
        AbstractC22676k.m65750j(code, "code");
        AbstractC22676k.m65750j(warning, "warning");
        return new SessionWarningResponse(code, warning, time);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionWarningResponse)) {
            return false;
        }
        SessionWarningResponse sessionWarningResponse = (SessionWarningResponse) other;
        return AbstractC22676k.m65745e(this.code, sessionWarningResponse.code) && AbstractC22676k.m65745e(this.warning, sessionWarningResponse.warning) && AbstractC22676k.m65745e(this.time, sessionWarningResponse.time);
    }

    public final String getCode() {
        return this.code;
    }

    public final C21682i getTime() {
        return this.time;
    }

    public final String getWarning() {
        return this.warning;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.code.hashCode() * 31, 31, this.warning);
        C21682i c21682i = this.time;
        return iM30450d + (c21682i == null ? 0 : c21682i.hashCode());
    }

    public String toString() {
        String str = this.code;
        String str2 = this.warning;
        C21682i c21682i = this.time;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SessionWarningResponse(code=", str, ", warning=", str2, ", time=");
        sbM32001t.append(c21682i);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ SessionWarningResponse(String str, String str2, C21682i c21682i, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? null : c21682i);
    }
}
