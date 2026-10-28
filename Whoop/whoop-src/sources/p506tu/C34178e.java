package p506tu;

import com.google.gson.annotations.SerializedName;
import io.getstream.chat.android.client.api.QueryParams;
import java.util.List;
import l83.InterfaceC23457c;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: tu.e */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Ltu/e;", "", "", "", "a", "Ljava/util/List;", "getLoadingMethod", "()Ljava/util/List;", "loadingMethod", "b", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", QueryParams.URL, "Ltu/g;", "c", "Ltu/g;", "getKind", "()Ltu/g;", "kind", "Ltu/f;", "d", "Ltu/f;", "getPriority", "()Ltu/f;", "priority", "sdk-base_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
@InterfaceC23457c
public final /* data */ class C34178e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("loading-method")
    private final List<String> loadingMethod;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName(QueryParams.URL)
    private final String url;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("kind")
    private final EnumC34180g kind;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("priority")
    private final EnumC34179f priority;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34178e)) {
            return false;
        }
        C34178e c34178e = (C34178e) obj;
        return AbstractC22676k.m65745e(this.loadingMethod, c34178e.loadingMethod) && AbstractC22676k.m65745e(this.url, c34178e.url) && this.kind == c34178e.kind && this.priority == c34178e.priority;
    }

    public final int hashCode() {
        return this.priority.hashCode() + ((this.kind.hashCode() + AbstractC11266d.m30450d(this.loadingMethod.hashCode() * 31, 31, this.url)) * 31);
    }

    public final String toString() {
        return "Request(loadingMethod=" + this.loadingMethod + ", url=" + this.url + ", kind=" + this.kind + ", priority=" + this.priority + ')';
    }
}
