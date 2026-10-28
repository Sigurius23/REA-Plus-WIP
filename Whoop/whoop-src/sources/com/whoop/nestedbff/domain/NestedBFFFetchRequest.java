package com.whoop.nestedbff.domain;

import com.whoop.navigation.models.GenericHttpMethod;
import com.whoop.network.request.HttpTimeoutConfig;
import i63.C18181t;
import java.util.Map;
import l83.C23454a0;
import m83.C25272z;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q02.AbstractC29749c;
import sr2.AbstractC32943y;
import z02.InterfaceC39944a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0081\b\u0018\u0000 52\u000e\u0012\n\u0012\b\u0018\u00010\u0002j\u0002`\u00030\u0001:\u00016BC\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012JR\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0010R%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010\u0012R&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b%\u0010\u0012R\u001a\u0010'\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R \u0010+\u001a\b\u0018\u00010\u0002j\u0002`\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010/\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001c\u00103\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010\u001f\u001a\u0004\b4\u0010\u000e¨\u00067"}, m65681d2 = {"Lcom/whoop/nestedbff/domain/NestedBFFFetchRequest;", "Lz02/a;", "Ll83/a0;", "Lcom/whoop/network/request/NoRequestBody;", "", "path", "Lcom/whoop/navigation/models/GenericHttpMethod;", "genericMethod", "", "metadata", "parameters", "<init>", "(Ljava/lang/String;Lcom/whoop/navigation/models/GenericHttpMethod;Ljava/util/Map;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/navigation/models/GenericHttpMethod;", "component3", "()Ljava/util/Map;", "component4", "copy", "(Ljava/lang/String;Lcom/whoop/navigation/models/GenericHttpMethod;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/nestedbff/domain/NestedBFFFetchRequest;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPath", "Lcom/whoop/navigation/models/GenericHttpMethod;", "getGenericMethod", "Ljava/util/Map;", "getMetadata", "getParameters", "Li63/t;", "method", "Li63/t;", "getMethod", "()Li63/t;", "body", "Ll83/a0;", "getBody", "()Ll83/a0;", "hasBody", "Z", "getHasBody", "()Z", "tag", "getTag", "Companion", "a", "nested-bff-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class NestedBFFFetchRequest implements InterfaceC39944a<C23454a0> {
    private static final String DEFAULT_TAG = "NestedBFFFetchRequest";
    public static final String METADATA_REQUEST_NAME = "request_name";
    private final C23454a0 body;
    private final GenericHttpMethod genericMethod;
    private final boolean hasBody;
    private final Map<String, String> metadata;
    private final C18181t method;
    private final Map<String, String> parameters;
    private final String path;
    private final String tag;
    public static final int $stable = 8;

    public NestedBFFFetchRequest(String path, GenericHttpMethod genericMethod, Map<String, String> map, Map<String, String> parameters) {
        String str;
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(genericMethod, "genericMethod");
        AbstractC22676k.m65750j(parameters, "parameters");
        this.path = path;
        this.genericMethod = genericMethod;
        this.metadata = map;
        this.parameters = parameters;
        this.method = AbstractC29749c.m91207b(genericMethod);
        C18181t method = getMethod();
        C18181t c18181t = C18181t.f70508b;
        this.hasBody = !AbstractC22676k.m65745e(method, C18181t.f70508b);
        this.tag = (map == null || (str = map.get(METADATA_REQUEST_NAME)) == null) ? DEFAULT_TAG : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NestedBFFFetchRequest copy$default(NestedBFFFetchRequest nestedBFFFetchRequest, String str, GenericHttpMethod genericHttpMethod, Map map, Map map2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = nestedBFFFetchRequest.path;
        }
        if ((i13 & 2) != 0) {
            genericHttpMethod = nestedBFFFetchRequest.genericMethod;
        }
        if ((i13 & 4) != 0) {
            map = nestedBFFFetchRequest.metadata;
        }
        if ((i13 & 8) != 0) {
            map2 = nestedBFFFetchRequest.parameters;
        }
        return nestedBFFFetchRequest.copy(str, genericHttpMethod, map, map2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final GenericHttpMethod getGenericMethod() {
        return this.genericMethod;
    }

    public final Map<String, String> component3() {
        return this.metadata;
    }

    public final Map<String, String> component4() {
        return this.parameters;
    }

    public final NestedBFFFetchRequest copy(String path, GenericHttpMethod genericMethod, Map<String, String> metadata, Map<String, String> parameters) {
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(genericMethod, "genericMethod");
        AbstractC22676k.m65750j(parameters, "parameters");
        return new NestedBFFFetchRequest(path, genericMethod, metadata, parameters);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NestedBFFFetchRequest)) {
            return false;
        }
        NestedBFFFetchRequest nestedBFFFetchRequest = (NestedBFFFetchRequest) other;
        return AbstractC22676k.m65745e(this.path, nestedBFFFetchRequest.path) && this.genericMethod == nestedBFFFetchRequest.genericMethod && AbstractC22676k.m65745e(this.metadata, nestedBFFFetchRequest.metadata) && AbstractC22676k.m65745e(this.parameters, nestedBFFFetchRequest.parameters);
    }

    public final GenericHttpMethod getGenericMethod() {
        return this.genericMethod;
    }

    @Override // z02.InterfaceC39944a
    public boolean getHasBody() {
        return this.hasBody;
    }

    @Override // z02.InterfaceC39944a
    public /* bridge */ Map<String, String> getHeaders() {
        return super.getHeaders();
    }

    @Override // z02.InterfaceC39944a
    public /* bridge */ HttpTimeoutConfig getHttpTimeoutConfig() {
        return super.getHttpTimeoutConfig();
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    @Override // z02.InterfaceC39944a
    public C18181t getMethod() {
        return this.method;
    }

    @Override // z02.InterfaceC39944a
    public Map<String, String> getParameters() {
        return this.parameters;
    }

    @Override // z02.InterfaceC39944a
    public String getPath() {
        return this.path;
    }

    @Override // z02.InterfaceC39944a
    public String getTag() {
        return this.tag;
    }

    public int hashCode() {
        int iHashCode = (this.genericMethod.hashCode() + (this.path.hashCode() * 31)) * 31;
        Map<String, String> map = this.metadata;
        return this.parameters.hashCode() + ((iHashCode + (map == null ? 0 : map.hashCode())) * 31);
    }

    public String toString() {
        String str = this.path;
        GenericHttpMethod genericHttpMethod = this.genericMethod;
        Map<String, String> map = this.metadata;
        Map<String, String> map2 = this.parameters;
        StringBuilder sb4 = new StringBuilder("NestedBFFFetchRequest(path=");
        sb4.append(str);
        sb4.append(", genericMethod=");
        sb4.append(genericHttpMethod);
        sb4.append(", metadata=");
        return AbstractC30802r.m94765n(sb4, map, ", parameters=", map2, ")");
    }

    @Override // z02.InterfaceC39944a
    public /* bridge */ String url(AbstractC32943y abstractC32943y) {
        return super.url(abstractC32943y);
    }

    @Override // z02.InterfaceC39944a
    public C23454a0 getBody() {
        return this.body;
    }

    public /* synthetic */ NestedBFFFetchRequest(String str, GenericHttpMethod genericHttpMethod, Map map, Map map2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, genericHttpMethod, map, (i13 & 8) != 0 ? C25272z.f99163w : map2);
    }
}
