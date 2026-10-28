package com.whoop.startactivity.targetscard.domain;

import com.whoop.network.request.HttpTimeoutConfig;
import i63.C18181t;
import java.util.Map;
import l83.C23454a0;
import m83.C25272z;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import sr2.AbstractC32943y;
import z02.InterfaceC39944a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0081\b\u0018\u0000 ,2\u000e\u0012\n\u0012\b\u0018\u00010\u0002j\u0002`\u00030\u0001:\u0001-B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010\"\u001a\b\u0018\u00010\u0002j\u0002`\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u00168\u0016X\u0096D¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b*\u0010\u0019\u001a\u0004\b+\u0010\u000b¨\u0006."}, m65681d2 = {"Lcom/whoop/startactivity/targetscard/domain/TargetsCardFetchRequest;", "Lz02/a;", "Ll83/a0;", "Lcom/whoop/network/request/NoRequestBody;", "", "path", "", "parameters", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/util/Map;)Lcom/whoop/startactivity/targetscard/domain/TargetsCardFetchRequest;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPath", "Ljava/util/Map;", "getParameters", "Li63/t;", "method", "Li63/t;", "getMethod", "()Li63/t;", "body", "Ll83/a0;", "getBody", "()Ll83/a0;", "hasBody", "Z", "getHasBody", "()Z", "tag", "getTag", "Companion", "a", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class TargetsCardFetchRequest implements InterfaceC39944a<C23454a0> {
    private static final String TAG = "TargetsCardFetchRequest";
    private final C23454a0 body;
    private final boolean hasBody;
    private final C18181t method;
    private final Map<String, String> parameters;
    private final String path;
    private final String tag;
    public static final int $stable = 8;

    public TargetsCardFetchRequest(String path, Map<String, String> parameters) {
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(parameters, "parameters");
        this.path = path;
        this.parameters = parameters;
        C18181t c18181t = C18181t.f70508b;
        this.method = C18181t.f70508b;
        this.tag = TAG;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TargetsCardFetchRequest copy$default(TargetsCardFetchRequest targetsCardFetchRequest, String str, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = targetsCardFetchRequest.path;
        }
        if ((i13 & 2) != 0) {
            map = targetsCardFetchRequest.parameters;
        }
        return targetsCardFetchRequest.copy(str, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    public final Map<String, String> component2() {
        return this.parameters;
    }

    public final TargetsCardFetchRequest copy(String path, Map<String, String> parameters) {
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(parameters, "parameters");
        return new TargetsCardFetchRequest(path, parameters);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TargetsCardFetchRequest)) {
            return false;
        }
        TargetsCardFetchRequest targetsCardFetchRequest = (TargetsCardFetchRequest) other;
        return AbstractC22676k.m65745e(this.path, targetsCardFetchRequest.path) && AbstractC22676k.m65745e(this.parameters, targetsCardFetchRequest.parameters);
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
        return this.parameters.hashCode() + (this.path.hashCode() * 31);
    }

    public String toString() {
        return AbstractC36095b.m114680h("TargetsCardFetchRequest(path=", this.path, ", parameters=", ")", this.parameters);
    }

    @Override // z02.InterfaceC39944a
    public /* bridge */ String url(AbstractC32943y abstractC32943y) {
        return super.url(abstractC32943y);
    }

    @Override // z02.InterfaceC39944a
    public C23454a0 getBody() {
        return this.body;
    }

    public /* synthetic */ TargetsCardFetchRequest(String str, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? C25272z.f99163w : map);
    }
}
