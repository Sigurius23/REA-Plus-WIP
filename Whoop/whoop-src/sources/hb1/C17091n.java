package hb1;

import com.whoop.navigation.models.GenericHttpMethod;
import java.util.Map;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: hb1.n */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001b\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b\u0018\u0010'¨\u0006("}, m65681d2 = {"Lhb1/n;", "Lm91/u;", "", "id", "path", "Lcom/whoop/navigation/models/GenericHttpMethod;", "method", "", "metadata", "", "showLoading", "Lhb1/a;", "fallbackBehavior", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericHttpMethod;Ljava/util/Map;ZLhb1/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "e", "c", "Lcom/whoop/navigation/models/GenericHttpMethod;", "()Lcom/whoop/navigation/models/GenericHttpMethod;", "d", "Ljava/util/Map;", "()Ljava/util/Map;", "Z", "f", "()Z", "Lhb1/a;", "()Lhb1/a;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17091n implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String path;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final GenericHttpMethod method;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Map<String, String> metadata;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean showLoading;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC17078a fallbackBehavior;

    public C17091n(String id4, String path, GenericHttpMethod method, Map<String, String> map, boolean z4, EnumC17078a fallbackBehavior) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(method, "method");
        AbstractC22676k.m65750j(fallbackBehavior, "fallbackBehavior");
        this.id = id4;
        this.path = path;
        this.method = method;
        this.metadata = map;
        this.showLoading = z4;
        this.fallbackBehavior = fallbackBehavior;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC17078a getFallbackBehavior() {
        return this.fallbackBehavior;
    }

    /* JADX INFO: renamed from: b */
    public final Map<String, String> m48255b() {
        return this.metadata;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final GenericHttpMethod getMethod() {
        return this.method;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17091n)) {
            return false;
        }
        C17091n c17091n = (C17091n) other;
        return AbstractC22676k.m65745e(this.id, c17091n.id) && AbstractC22676k.m65745e(this.path, c17091n.path) && this.method == c17091n.method && AbstractC22676k.m65745e(this.metadata, c17091n.metadata) && this.showLoading == c17091n.showLoading && this.fallbackBehavior == c17091n.fallbackBehavior;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getShowLoading() {
        return this.showLoading;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        int iHashCode = (this.method.hashCode() + AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.path)) * 31;
        Map<String, String> map = this.metadata;
        return this.fallbackBehavior.hashCode() + AbstractC2875y.m8289b((iHashCode + (map == null ? 0 : map.hashCode())) * 31, 31, this.showLoading);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.path;
        GenericHttpMethod genericHttpMethod = this.method;
        Map<String, String> map = this.metadata;
        boolean z4 = this.showLoading;
        EnumC17078a enumC17078a = this.fallbackBehavior;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("NestedBFFWrapperViewState(id=", str, ", path=", str2, ", method=");
        sbM32001t.append(genericHttpMethod);
        sbM32001t.append(", metadata=");
        sbM32001t.append(map);
        sbM32001t.append(", showLoading=");
        sbM32001t.append(z4);
        sbM32001t.append(", fallbackBehavior=");
        sbM32001t.append(enumC17078a);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
