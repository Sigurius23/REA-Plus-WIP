package a12;

import java.util.Map;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a12.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\nR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"La12/a;", "", "", "path", "basePath", "", "parameters", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "network_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C0141a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String path;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String basePath;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Map<String, String> parameters;

    public C0141a(String path, String basePath, Map<String, String> parameters) {
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(basePath, "basePath");
        AbstractC22676k.m65750j(parameters, "parameters");
        this.path = path;
        this.basePath = basePath;
        this.parameters = parameters;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBasePath() {
        return this.basePath;
    }

    /* JADX INFO: renamed from: b */
    public final Map<String, String> m354b() {
        return this.parameters;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C0141a)) {
            return false;
        }
        C0141a c0141a = (C0141a) other;
        return AbstractC22676k.m65745e(this.path, c0141a.path) && AbstractC22676k.m65745e(this.basePath, c0141a.basePath) && AbstractC22676k.m65745e(this.parameters, c0141a.parameters);
    }

    public int hashCode() {
        return this.parameters.hashCode() + AbstractC11266d.m30450d(this.path.hashCode() * 31, 31, this.basePath);
    }

    public String toString() {
        String str = this.path;
        String str2 = this.basePath;
        return AbstractC13673n.m38565l(AbstractC11895b.m32001t("PathParserResult(path=", str, ", basePath=", str2, ", parameters="), this.parameters, ")");
    }
}
