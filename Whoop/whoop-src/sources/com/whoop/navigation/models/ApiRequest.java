package com.whoop.navigation.models;

import ad3.C0771n;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonElement;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import mq2.C25888a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ0\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d¨\u0006/"}, m65681d2 = {"Lcom/whoop/navigation/models/ApiRequest;", "", "", "path", "Lcom/whoop/navigation/models/GenericHttpMethod;", "method", "Lkotlinx/serialization/json/JsonElement;", "body", "<init>", "(Ljava/lang/String;Lcom/whoop/navigation/models/GenericHttpMethod;Lkotlinx/serialization/json/JsonElement;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/navigation/models/GenericHttpMethod;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/models/ApiRequest;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/navigation/models/GenericHttpMethod;", "component3", "()Lkotlinx/serialization/json/JsonElement;", "copy", "(Ljava/lang/String;Lcom/whoop/navigation/models/GenericHttpMethod;Lkotlinx/serialization/json/JsonElement;)Lcom/whoop/navigation/models/ApiRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPath", "Lcom/whoop/navigation/models/GenericHttpMethod;", "getMethod", "Lkotlinx/serialization/json/JsonElement;", "getBody", "Companion", "$serializer", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ApiRequest {
    private final JsonElement body;
    private final GenericHttpMethod method;
    private final String path;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C25888a(18)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/models/ApiRequest$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/models/ApiRequest;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ApiRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ApiRequest(int i13, String str, GenericHttpMethod genericHttpMethod, JsonElement jsonElement, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, ApiRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.path = str;
        if ((i13 & 2) == 0) {
            this.method = GenericHttpMethod.GET;
        } else {
            this.method = genericHttpMethod;
        }
        if ((i13 & 4) == 0) {
            this.body = null;
        } else {
            this.body = jsonElement;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return GenericHttpMethod.INSTANCE.serializer();
    }

    public static /* synthetic */ ApiRequest copy$default(ApiRequest apiRequest, String str, GenericHttpMethod genericHttpMethod, JsonElement jsonElement, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = apiRequest.path;
        }
        if ((i13 & 2) != 0) {
            genericHttpMethod = apiRequest.method;
        }
        if ((i13 & 4) != 0) {
            jsonElement = apiRequest.body;
        }
        return apiRequest.copy(str, genericHttpMethod, jsonElement);
    }

    public static final /* synthetic */ void write$Self$navigation_release(ApiRequest self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.path);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.method != GenericHttpMethod.GET) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.method);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.body == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, C0771n.f2806a, self.body);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final GenericHttpMethod getMethod() {
        return this.method;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final JsonElement getBody() {
        return this.body;
    }

    public final ApiRequest copy(String path, GenericHttpMethod method, JsonElement body) {
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(method, "method");
        return new ApiRequest(path, method, body);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiRequest)) {
            return false;
        }
        ApiRequest apiRequest = (ApiRequest) other;
        return AbstractC22676k.m65745e(this.path, apiRequest.path) && this.method == apiRequest.method && AbstractC22676k.m65745e(this.body, apiRequest.body);
    }

    public final JsonElement getBody() {
        return this.body;
    }

    public final GenericHttpMethod getMethod() {
        return this.method;
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        int iHashCode = (this.method.hashCode() + (this.path.hashCode() * 31)) * 31;
        JsonElement jsonElement = this.body;
        return iHashCode + (jsonElement == null ? 0 : jsonElement.hashCode());
    }

    public String toString() {
        return "ApiRequest(path=" + this.path + ", method=" + this.method + ", body=" + this.body + ")";
    }

    public ApiRequest(String path, GenericHttpMethod method, JsonElement jsonElement) {
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(method, "method");
        this.path = path;
        this.method = method;
        this.body = jsonElement;
    }

    public /* synthetic */ ApiRequest(String str, GenericHttpMethod genericHttpMethod, JsonElement jsonElement, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? GenericHttpMethod.GET : genericHttpMethod, (i13 & 4) != 0 ? null : jsonElement);
    }
}
