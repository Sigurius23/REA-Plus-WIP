package c43;

import java.io.Serializable;
import java.util.List;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: c43.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C4189e implements Serializable {

    /* JADX INFO: renamed from: w */
    public final List f17044w;

    /* JADX INFO: renamed from: x */
    public final String f17045x;

    /* JADX INFO: renamed from: y */
    public final String f17046y;

    public C4189e(List urls, String username, String password) {
        AbstractC22676k.m65750j(urls, "urls");
        AbstractC22676k.m65750j(username, "username");
        AbstractC22676k.m65750j(password, "password");
        this.f17044w = urls;
        this.f17045x = username;
        this.f17046y = password;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4189e)) {
            return false;
        }
        C4189e c4189e = (C4189e) obj;
        return AbstractC22676k.m65745e(this.f17044w, c4189e.f17044w) && AbstractC22676k.m65745e(this.f17045x, c4189e.f17045x) && AbstractC22676k.m65745e(this.f17046y, c4189e.f17046y);
    }

    public final int hashCode() {
        return this.f17046y.hashCode() + AbstractC11266d.m30450d(this.f17044w.hashCode() * 31, 31, this.f17045x);
    }

    public final String toString() {
        return AbstractC25012a.m73376i(this.f17046y, ")", AbstractC26725a.m79507k("IceServer(urls=", ", username=", this.f17045x, ", password=", this.f17044w));
    }
}
