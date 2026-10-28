package p048ce;

import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ce.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C4467h {

    /* JADX INFO: renamed from: a */
    public final String f17988a;

    /* JADX INFO: renamed from: b */
    public final String f17989b;

    /* JADX INFO: renamed from: c */
    public final String f17990c;

    public C4467h(String str, String configPath, String credentialsPath) {
        AbstractC22676k.m65750j(configPath, "configPath");
        AbstractC22676k.m65750j(credentialsPath, "credentialsPath");
        this.f17988a = str;
        this.f17989b = configPath;
        this.f17990c = credentialsPath;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4467h)) {
            return false;
        }
        C4467h c4467h = (C4467h) obj;
        return AbstractC22676k.m65745e(this.f17988a, c4467h.f17988a) && AbstractC22676k.m65745e(this.f17989b, c4467h.f17989b) && AbstractC22676k.m65745e(this.f17990c, c4467h.f17990c);
    }

    public final int hashCode() {
        return this.f17990c.hashCode() + AbstractC11266d.m30450d(this.f17988a.hashCode() * 31, 31, this.f17989b);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("AwsConfigurationSource(profile=");
        sb4.append(this.f17988a);
        sb4.append(", configPath=");
        sb4.append(this.f17989b);
        sb4.append(", credentialsPath=");
        return AbstractC25012a.m73377j(sb4, this.f17990c, ')');
    }
}
