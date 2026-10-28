package x43;

import io.getstream.video.android.model.User;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import rb3.AbstractC31199g;

/* JADX INFO: renamed from: x43.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C37972d extends AbstractC31199g {

    /* JADX INFO: renamed from: b */
    public final String f162616b;

    /* JADX INFO: renamed from: c */
    public final String f162617c;

    /* JADX INFO: renamed from: d */
    public final User f162618d;

    public C37972d(String endpoint, String apiKey, User user) {
        AbstractC22676k.m65750j(endpoint, "endpoint");
        AbstractC22676k.m65750j(apiKey, "apiKey");
        AbstractC22676k.m65750j(user, "user");
        this.f162616b = endpoint;
        this.f162617c = apiKey;
        this.f162618d = user;
    }

    @Override // rb3.AbstractC31199g
    /* JADX INFO: renamed from: a */
    public final String mo96150a() {
        return this.f162616b;
    }

    @Override // rb3.AbstractC31199g
    /* JADX INFO: renamed from: b */
    public final User mo96151b() {
        return this.f162618d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37972d)) {
            return false;
        }
        C37972d c37972d = (C37972d) obj;
        return AbstractC22676k.m65745e(this.f162616b, c37972d.f162616b) && AbstractC22676k.m65745e(this.f162617c, c37972d.f162617c) && AbstractC22676k.m65745e(this.f162618d, c37972d.f162618d);
    }

    public final int hashCode() {
        return this.f162618d.hashCode() + AbstractC11266d.m30450d(this.f162616b.hashCode() * 31, 31, this.f162617c);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("UserConnectionConf(endpoint=", this.f162616b, ", apiKey=", this.f162617c, ", user=");
        sbM32001t.append(this.f162618d);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
