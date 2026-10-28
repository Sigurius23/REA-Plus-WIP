package xm2;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: xm2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0013\u0010\t¨\u0006\u0015"}, m65681d2 = {"Lxm2/c;", "", "", "code", "state", "scope", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38462c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String state;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String scope;

    public C38462c(String code, String state, String scope) {
        AbstractC22676k.m65750j(code, "code");
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(scope, "scope");
        this.code = code;
        this.state = state;
        this.scope = scope;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getScope() {
        return this.scope;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38462c)) {
            return false;
        }
        C38462c c38462c = (C38462c) other;
        return AbstractC22676k.m65745e(this.code, c38462c.code) && AbstractC22676k.m65745e(this.state, c38462c.state) && AbstractC22676k.m65745e(this.scope, c38462c.scope);
    }

    public int hashCode() {
        return this.scope.hashCode() + AbstractC11266d.m30450d(this.code.hashCode() * 31, 31, this.state);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.scope, ")", AbstractC11895b.m32001t("StravaAuthParams(code=", this.code, ", state=", this.state, ", scope="));
    }
}
