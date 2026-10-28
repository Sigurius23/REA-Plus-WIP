package p617xj;

import android.view.View;
import java.lang.ref.WeakReference;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: xj.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C38330b {

    /* JADX INFO: renamed from: a */
    public final Object f164242a;

    /* JADX INFO: renamed from: b */
    public final String f164243b;

    /* JADX INFO: renamed from: c */
    public final String f164244c;

    /* JADX INFO: renamed from: d */
    public final String f164245d;

    /* JADX INFO: renamed from: e */
    public final String f164246e;

    /* JADX INFO: renamed from: f */
    public final String f164247f;

    /* JADX INFO: renamed from: g */
    public final String f164248g;

    public C38330b(View view, String str, String str2, String str3, String str4, String str5, String str6) {
        this.f164242a = view;
        this.f164243b = str;
        this.f164244c = str2;
        this.f164245d = str3;
        this.f164246e = str4;
        this.f164247f = str5;
        this.f164248g = str6;
        new WeakReference(view);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38330b)) {
            return false;
        }
        C38330b c38330b = (C38330b) obj;
        return AbstractC22676k.m65745e(this.f164242a, c38330b.f164242a) && AbstractC22676k.m65745e(this.f164243b, c38330b.f164243b) && AbstractC22676k.m65745e(this.f164244c, c38330b.f164244c) && AbstractC22676k.m65745e(this.f164245d, c38330b.f164245d) && AbstractC22676k.m65745e(this.f164246e, c38330b.f164246e) && AbstractC22676k.m65745e(this.f164247f, c38330b.f164247f) && AbstractC22676k.m65745e(this.f164248g, c38330b.f164248g);
    }

    public final int hashCode() {
        Object obj = this.f164242a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        String str = this.f164243b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f164244c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f164245d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f164246e;
        int iM30450d = AbstractC11266d.m30450d((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f164247f);
        String str5 = this.f164248g;
        return iM30450d + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ViewTarget(_view=");
        sb4.append(this.f164242a);
        sb4.append(", className=");
        sb4.append(this.f164243b);
        sb4.append(", resourceName=");
        sb4.append(this.f164244c);
        sb4.append(", tag=");
        sb4.append(this.f164245d);
        sb4.append(", text=");
        sb4.append(this.f164246e);
        sb4.append(", source=");
        sb4.append(this.f164247f);
        sb4.append(", hierarchy=");
        return AbstractC25012a.m73377j(sb4, this.f164248g, ')');
    }
}
