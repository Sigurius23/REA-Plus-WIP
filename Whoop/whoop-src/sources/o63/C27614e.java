package o63;

import java.util.Locale;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: o63.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C27614e {

    /* JADX INFO: renamed from: a */
    public final String f111143a;

    /* JADX INFO: renamed from: b */
    public final int f111144b;

    public C27614e(String content) {
        AbstractC22676k.m65750j(content, "content");
        this.f111143a = content;
        String lowerCase = content.toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        this.f111144b = lowerCase.hashCode();
    }

    public final boolean equals(Object obj) {
        String str;
        C27614e c27614e = obj instanceof C27614e ? (C27614e) obj : null;
        return (c27614e == null || (str = c27614e.f111143a) == null || !str.equalsIgnoreCase(this.f111143a)) ? false : true;
    }

    public final int hashCode() {
        return this.f111144b;
    }

    public final String toString() {
        return this.f111143a;
    }
}
