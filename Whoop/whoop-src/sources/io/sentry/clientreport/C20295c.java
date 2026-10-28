package io.sentry.clientreport;

import java.util.Arrays;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.clientreport.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C20295c {

    /* JADX INFO: renamed from: a */
    public final String f76192a;

    /* JADX INFO: renamed from: b */
    public final String f76193b;

    public C20295c(String str, String str2) {
        this.f76192a = str;
        this.f76193b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20295c)) {
            return false;
        }
        C20295c c20295c = (C20295c) obj;
        return AbstractC29125c.m88542s(this.f76192a, c20295c.f76192a) && AbstractC29125c.m88542s(this.f76193b, c20295c.f76193b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f76192a, this.f76193b});
    }
}
