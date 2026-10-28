package x43;

import io.getstream.video.android.model.User;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import rb3.AbstractC31199g;
import stream.video.sfu.event.JoinRequest;

/* JADX INFO: renamed from: x43.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C37971c extends AbstractC31199g {

    /* JADX INFO: renamed from: b */
    public final String f162611b;

    /* JADX INFO: renamed from: c */
    public final String f162612c;

    /* JADX INFO: renamed from: d */
    public final User f162613d;

    /* JADX INFO: renamed from: e */
    public final JoinRequest f162614e;

    /* JADX INFO: renamed from: f */
    public final String f162615f;

    public C37971c(String endpoint, String apiKey, User user, JoinRequest joinRequest, String token) {
        AbstractC22676k.m65750j(endpoint, "endpoint");
        AbstractC22676k.m65750j(apiKey, "apiKey");
        AbstractC22676k.m65750j(joinRequest, "joinRequest");
        AbstractC22676k.m65750j(token, "token");
        this.f162611b = endpoint;
        this.f162612c = apiKey;
        this.f162613d = user;
        this.f162614e = joinRequest;
        this.f162615f = token;
    }

    @Override // rb3.AbstractC31199g
    /* JADX INFO: renamed from: a */
    public final String mo96150a() {
        return this.f162611b;
    }

    @Override // rb3.AbstractC31199g
    /* JADX INFO: renamed from: b */
    public final User mo96151b() {
        return this.f162613d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37971c)) {
            return false;
        }
        C37971c c37971c = (C37971c) obj;
        return AbstractC22676k.m65745e(this.f162611b, c37971c.f162611b) && AbstractC22676k.m65745e(this.f162612c, c37971c.f162612c) && AbstractC22676k.m65745e(this.f162613d, c37971c.f162613d) && AbstractC22676k.m65745e(this.f162614e, c37971c.f162614e) && AbstractC22676k.m65745e(this.f162615f, c37971c.f162615f);
    }

    public final int hashCode() {
        return this.f162615f.hashCode() + ((this.f162614e.hashCode() + ((this.f162613d.hashCode() + AbstractC11266d.m30450d(this.f162611b.hashCode() * 31, 31, this.f162612c)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SfuConnectionConf(endpoint=", this.f162611b, ", apiKey=", this.f162612c, ", user=");
        sbM32001t.append(this.f162613d);
        sbM32001t.append(", joinRequest=");
        sbM32001t.append(this.f162614e);
        sbM32001t.append(", token=");
        return AbstractC25012a.m73376i(this.f162615f, ")", sbM32001t);
    }
}
