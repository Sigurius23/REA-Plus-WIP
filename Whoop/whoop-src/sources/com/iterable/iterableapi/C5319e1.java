package com.iterable.iterableapi;

import android.graphics.Rect;
import java.util.Objects;

/* JADX INFO: renamed from: com.iterable.iterableapi.e1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5319e1 {

    /* JADX INFO: renamed from: a */
    public String f21677a;

    /* JADX INFO: renamed from: b */
    public final Rect f21678b;

    /* JADX INFO: renamed from: c */
    public final double f21679c;

    /* JADX INFO: renamed from: d */
    public final C5327g1 f21680d;

    public C5319e1(String str, Rect rect, double d3, C5327g1 c5327g1) {
        this.f21677a = str;
        this.f21678b = rect;
        this.f21679c = d3;
        this.f21680d = c5327g1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5319e1)) {
            return false;
        }
        C5319e1 c5319e1 = (C5319e1) obj;
        return Objects.equals(this.f21677a, c5319e1.f21677a) && Objects.equals(this.f21678b, c5319e1.f21678b) && this.f21679c == c5319e1.f21679c;
    }

    public final int hashCode() {
        return Objects.hash(this.f21677a, this.f21678b, Double.valueOf(this.f21679c));
    }
}
