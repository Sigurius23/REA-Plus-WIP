package com.whoop.p057ai.chat.models;

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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!JF\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010!¨\u00066"}, m65681d2 = {"Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;", "", "", "path", "method", "contentType", "Lkotlinx/serialization/json/JsonElement;", "body", "", "timeoutMillis", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Ljava/lang/Long;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lkotlinx/serialization/json/JsonElement;", "component5", "()Ljava/lang/Long;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Ljava/lang/Long;)Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPath", "getMethod", "getContentType", "Lkotlinx/serialization/json/JsonElement;", "getBody", "Ljava/lang/Long;", "getTimeoutMillis", "Companion", "$serializer", "a", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ContextStatusToggleRequestModel {
    private final JsonElement body;
    private final String contentType;
    private final String method;
    private final String path;
    private final Long timeoutMillis;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.ai.chat.models.ContextStatusToggleRequestModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ContextStatusToggleRequestModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ContextStatusToggleRequestModel(int i13, String str, String str2, String str3, JsonElement jsonElement, Long l7, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, ContextStatusToggleRequestModel$$serializer.INSTANCE.getDescriptor());
        }
        this.path = str;
        this.method = str2;
        this.contentType = str3;
        if ((i13 & 8) == 0) {
            this.body = null;
        } else {
            this.body = jsonElement;
        }
        if ((i13 & 16) == 0) {
            this.timeoutMillis = null;
        } else {
            this.timeoutMillis = l7;
        }
    }

    public static /* synthetic */ ContextStatusToggleRequestModel copy$default(ContextStatusToggleRequestModel contextStatusToggleRequestModel, String str, String str2, String str3, JsonElement jsonElement, Long l7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = contextStatusToggleRequestModel.path;
        }
        if ((i13 & 2) != 0) {
            str2 = contextStatusToggleRequestModel.method;
        }
        if ((i13 & 4) != 0) {
            str3 = contextStatusToggleRequestModel.contentType;
        }
        if ((i13 & 8) != 0) {
            jsonElement = contextStatusToggleRequestModel.body;
        }
        if ((i13 & 16) != 0) {
            l7 = contextStatusToggleRequestModel.timeoutMillis;
        }
        Long l12 = l7;
        String str4 = str3;
        return contextStatusToggleRequestModel.copy(str, str2, str4, jsonElement, l12);
    }

    public static final /* synthetic */ void write$Self$bot_release(ContextStatusToggleRequestModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.path);
        output.encodeStringElement(serialDesc, 1, self.method);
        output.encodeStringElement(serialDesc, 2, self.contentType);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.body != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, C0771n.f2806a, self.body);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.timeoutMillis == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, LongSerializer.INSTANCE, self.timeoutMillis);
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
    public final String getContentType() {
        return this.contentType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final JsonElement getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getTimeoutMillis() {
        return this.timeoutMillis;
    }

    public final ContextStatusToggleRequestModel copy(String path, String method, String contentType, JsonElement body, Long timeoutMillis) {
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(method, "method");
        AbstractC22676k.m65750j(contentType, "contentType");
        return new ContextStatusToggleRequestModel(path, method, contentType, body, timeoutMillis);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContextStatusToggleRequestModel)) {
            return false;
        }
        ContextStatusToggleRequestModel contextStatusToggleRequestModel = (ContextStatusToggleRequestModel) other;
        return AbstractC22676k.m65745e(this.path, contextStatusToggleRequestModel.path) && AbstractC22676k.m65745e(this.method, contextStatusToggleRequestModel.method) && AbstractC22676k.m65745e(this.contentType, contextStatusToggleRequestModel.contentType) && AbstractC22676k.m65745e(this.body, contextStatusToggleRequestModel.body) && AbstractC22676k.m65745e(this.timeoutMillis, contextStatusToggleRequestModel.timeoutMillis);
    }

    public final JsonElement getBody() {
        return this.body;
    }

    public final String getContentType() {
        return this.contentType;
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
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.path.hashCode() * 31, 31, this.method), 31, this.contentType);
        JsonElement jsonElement = this.body;
        int iHashCode = (iM30450d + (jsonElement == null ? 0 : jsonElement.hashCode())) * 31;
        Long l7 = this.timeoutMillis;
        return iHashCode + (l7 != null ? l7.hashCode() : 0);
    }

    public String toString() {
        String str = this.path;
        String str2 = this.method;
        String str3 = this.contentType;
        JsonElement jsonElement = this.body;
        Long l7 = this.timeoutMillis;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ContextStatusToggleRequestModel(path=", str, ", method=", str2, ", contentType=");
        sbM32001t.append(str3);
        sbM32001t.append(", body=");
        sbM32001t.append(jsonElement);
        sbM32001t.append(", timeoutMillis=");
        sbM32001t.append(l7);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public ContextStatusToggleRequestModel(String path, String method, String contentType, JsonElement jsonElement, Long l7) {
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(method, "method");
        AbstractC22676k.m65750j(contentType, "contentType");
        this.path = path;
        this.method = method;
        this.contentType = contentType;
        this.body = jsonElement;
        this.timeoutMillis = l7;
    }

    public /* synthetic */ ContextStatusToggleRequestModel(String str, String str2, String str3, JsonElement jsonElement, Long l7, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i13 & 8) != 0 ? null : jsonElement, (i13 & 16) != 0 ? null : l7);
    }
}
