package com.iterable.iterableapi;

import java.util.Objects;

/* JADX INFO: renamed from: com.iterable.iterableapi.h1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5331h1 {

    /* JADX INFO: renamed from: a */
    public final String f21703a;

    /* JADX INFO: renamed from: b */
    public final String f21704b;

    /* JADX INFO: renamed from: c */
    public final String f21705c;

    public C5331h1(String str, String str2, String str3) {
        this.f21703a = str;
        this.f21704b = str2;
        this.f21705c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5331h1)) {
            return false;
        }
        C5331h1 c5331h1 = (C5331h1) obj;
        return Objects.equals(this.f21703a, c5331h1.f21703a) && Objects.equals(this.f21704b, c5331h1.f21704b) && Objects.equals(this.f21705c, c5331h1.f21705c);
    }

    public final int hashCode() {
        return Objects.hash(this.f21703a, this.f21704b, this.f21705c);
    }
}
