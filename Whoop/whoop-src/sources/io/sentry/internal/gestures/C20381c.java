package io.sentry.internal.gestures;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.internal.gestures.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C20381c {

    /* JADX INFO: renamed from: a */
    public final WeakReference f76424a;

    /* JADX INFO: renamed from: b */
    public final String f76425b;

    /* JADX INFO: renamed from: c */
    public final String f76426c;

    /* JADX INFO: renamed from: d */
    public final String f76427d;

    /* JADX INFO: renamed from: e */
    public final String f76428e;

    public C20381c(View view, String str, String str2, String str3, String str4) {
        this.f76424a = new WeakReference(view);
        this.f76425b = str;
        this.f76426c = str2;
        this.f76427d = str3;
        this.f76428e = str4;
    }

    /* JADX INFO: renamed from: a */
    public final String m56596a() {
        return this.f76425b;
    }

    /* JADX INFO: renamed from: b */
    public final String m56597b() {
        String str = this.f76426c;
        if (str != null) {
            return str;
        }
        String str2 = this.f76427d;
        AbstractC29125c.m88510S(str2, "UiElement.tag can't be null");
        return str2;
    }

    /* JADX INFO: renamed from: c */
    public final String m56598c() {
        return this.f76428e;
    }

    /* JADX INFO: renamed from: d */
    public final String m56599d() {
        return this.f76426c;
    }

    /* JADX INFO: renamed from: e */
    public final String m56600e() {
        return this.f76427d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C20381c.class == obj.getClass()) {
            C20381c c20381c = (C20381c) obj;
            if (AbstractC29125c.m88542s(this.f76425b, c20381c.f76425b) && AbstractC29125c.m88542s(this.f76426c, c20381c.f76426c) && AbstractC29125c.m88542s(this.f76427d, c20381c.f76427d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final Object m56601f() {
        return this.f76424a.get();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f76424a, this.f76426c, this.f76427d});
    }
}
