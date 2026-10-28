package com.whoop.strava.domain.models;

import androidx.annotation.Keep;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J.\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u0017¨\u0006*"}, m65681d2 = {"Lcom/whoop/strava/domain/models/StravaAuthorizeRequest;", "", "", "code", "state", "scope", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$strava_release", "(Lcom/whoop/strava/domain/models/StravaAuthorizeRequest;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/strava/domain/models/StravaAuthorizeRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCode", "getState", "getScope", "Companion", "$serializer", "a", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StravaAuthorizeRequest {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String code;
    private final String scope;
    private final String state;

    /* JADX INFO: renamed from: com.whoop.strava.domain.models.StravaAuthorizeRequest$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/strava/domain/models/StravaAuthorizeRequest$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/strava/domain/models/StravaAuthorizeRequest;", "serializer", "()Lwc3/c;", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StravaAuthorizeRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StravaAuthorizeRequest(int i13, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, StravaAuthorizeRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.code = str;
        this.state = str2;
        this.scope = str3;
    }

    public static /* synthetic */ StravaAuthorizeRequest copy$default(StravaAuthorizeRequest stravaAuthorizeRequest, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = stravaAuthorizeRequest.code;
        }
        if ((i13 & 2) != 0) {
            str2 = stravaAuthorizeRequest.state;
        }
        if ((i13 & 4) != 0) {
            str3 = stravaAuthorizeRequest.scope;
        }
        return stravaAuthorizeRequest.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$strava_release(StravaAuthorizeRequest self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.code);
        output.encodeStringElement(serialDesc, 1, self.state);
        output.encodeStringElement(serialDesc, 2, self.scope);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getScope() {
        return this.scope;
    }

    public final StravaAuthorizeRequest copy(String code, String state, String scope) {
        AbstractC22676k.m65750j(code, "code");
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(scope, "scope");
        return new StravaAuthorizeRequest(code, state, scope);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StravaAuthorizeRequest)) {
            return false;
        }
        StravaAuthorizeRequest stravaAuthorizeRequest = (StravaAuthorizeRequest) other;
        return AbstractC22676k.m65745e(this.code, stravaAuthorizeRequest.code) && AbstractC22676k.m65745e(this.state, stravaAuthorizeRequest.state) && AbstractC22676k.m65745e(this.scope, stravaAuthorizeRequest.scope);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getScope() {
        return this.scope;
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        return this.scope.hashCode() + AbstractC11266d.m30450d(this.code.hashCode() * 31, 31, this.state);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.scope, ")", AbstractC11895b.m32001t("StravaAuthorizeRequest(code=", this.code, ", state=", this.state, ", scope="));
    }

    public StravaAuthorizeRequest(String code, String state, String scope) {
        AbstractC22676k.m65750j(code, "code");
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(scope, "scope");
        this.code = code;
        this.state = state;
        this.scope = scope;
    }
}
