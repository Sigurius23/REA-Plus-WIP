package x43;

import io.getstream.video.android.model.User;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import rb3.AbstractC31199g;

/* JADX INFO: renamed from: x43.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C37970b extends AbstractC31199g {

    /* JADX INFO: renamed from: b */
    public final String f162608b;

    /* JADX INFO: renamed from: c */
    public final String f162609c;

    /* JADX INFO: renamed from: d */
    public final User f162610d;

    public C37970b(String endpoint, String apiKey, User user) {
        AbstractC22676k.m65750j(endpoint, "endpoint");
        AbstractC22676k.m65750j(apiKey, "apiKey");
        AbstractC22676k.m65750j(user, "user");
        this.f162608b = endpoint;
        this.f162609c = apiKey;
        this.f162610d = user;
    }

    @Override // rb3.AbstractC31199g
    /* JADX INFO: renamed from: a */
    public final String mo96150a() {
        return this.f162608b;
    }

    @Override // rb3.AbstractC31199g
    /* JADX INFO: renamed from: b */
    public final User mo96151b() {
        return this.f162610d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37970b)) {
            return false;
        }
        C37970b c37970b = (C37970b) obj;
        return AbstractC22676k.m65745e(this.f162608b, c37970b.f162608b) && AbstractC22676k.m65745e(this.f162609c, c37970b.f162609c) && AbstractC22676k.m65745e(this.f162610d, c37970b.f162610d);
    }

    public final int hashCode() {
        return this.f162610d.hashCode() + AbstractC11266d.m30450d(this.f162608b.hashCode() * 31, 31, this.f162609c);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("AnonymousConnectionConf(endpoint=", this.f162608b, ", apiKey=", this.f162609c, ", user=");
        sbM32001t.append(this.f162610d);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
