package com.whoop.whoopaction.domain.models;

import ad3.C0771n;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonElement;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ<\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001f¨\u00062"}, m65681d2 = {"Lcom/whoop/whoopaction/domain/models/Request;", "", "", "path", "method", "Lkotlinx/serialization/json/JsonElement;", "body", "", "timeoutMillis", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Ljava/lang/Long;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whoop_action_release", "(Lcom/whoop/whoopaction/domain/models/Request;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lkotlinx/serialization/json/JsonElement;", "component4", "()Ljava/lang/Long;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Ljava/lang/Long;)Lcom/whoop/whoopaction/domain/models/Request;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPath", "getMethod", "Lkotlinx/serialization/json/JsonElement;", "getBody", "Ljava/lang/Long;", "getTimeoutMillis", "Companion", "$serializer", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class Request {
    private final JsonElement body;
    private final String method;
    private final String path;
    private final Long timeoutMillis;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whoopaction/domain/models/Request$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whoopaction/domain/models/Request;", "serializer", "()Lwc3/c;", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return Request$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Request(int i13, String str, String str2, JsonElement jsonElement, Long l7, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, Request$$serializer.INSTANCE.getDescriptor());
        }
        this.path = str;
        this.method = str2;
        this.body = jsonElement;
        this.timeoutMillis = l7;
    }

    public static /* synthetic */ Request copy$default(Request request, String str, String str2, JsonElement jsonElement, Long l7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = request.path;
        }
        if ((i13 & 2) != 0) {
            str2 = request.method;
        }
        if ((i13 & 4) != 0) {
            jsonElement = request.body;
        }
        if ((i13 & 8) != 0) {
            l7 = request.timeoutMillis;
        }
        return request.copy(str, str2, jsonElement, l7);
    }

    public static final /* synthetic */ void write$Self$whoop_action_release(Request self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.path);
        output.encodeStringElement(serialDesc, 1, self.method);
        output.encodeNullableSerializableElement(serialDesc, 2, C0771n.f2806a, self.body);
        output.encodeNullableSerializableElement(serialDesc, 3, LongSerializer.INSTANCE, self.timeoutMillis);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final JsonElement getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getTimeoutMillis() {
        return this.timeoutMillis;
    }

    public final Request copy(String path, String method, JsonElement body, Long timeoutMillis) {
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(method, "method");
        return new Request(path, method, body, timeoutMillis);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Request)) {
            return false;
        }
        Request request = (Request) other;
        return AbstractC22676k.m65745e(this.path, request.path) && AbstractC22676k.m65745e(this.method, request.method) && AbstractC22676k.m65745e(this.body, request.body) && AbstractC22676k.m65745e(this.timeoutMillis, request.timeoutMillis);
    }

    public final JsonElement getBody() {
        return this.body;
    }

    public final String getMethod() {
        return this.method;
    }

    public final String getPath() {
        return this.path;
    }

    public final Long getTimeoutMillis() {
        return this.timeoutMillis;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.path.hashCode() * 31, 31, this.method);
        JsonElement jsonElement = this.body;
        int iHashCode = (iM30450d + (jsonElement == null ? 0 : jsonElement.hashCode())) * 31;
        Long l7 = this.timeoutMillis;
        return iHashCode + (l7 != null ? l7.hashCode() : 0);
    }

    public String toString() {
        String str = this.path;
        String str2 = this.method;
        JsonElement jsonElement = this.body;
        Long l7 = this.timeoutMillis;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Request(path=", str, ", method=", str2, ", body=");
        sbM32001t.append(jsonElement);
        sbM32001t.append(", timeoutMillis=");
        sbM32001t.append(l7);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public Request(String path, String method, JsonElement jsonElement, Long l7) {
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(method, "method");
        this.path = path;
        this.method = method;
        this.body = jsonElement;
        this.timeoutMillis = l7;
    }
}
