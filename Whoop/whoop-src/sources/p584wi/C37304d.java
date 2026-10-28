package p584wi;

import java.util.ArrayList;
import p000.AbstractC11266d;

/* JADX INFO: renamed from: wi.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C37304d {

    /* JADX INFO: renamed from: a */
    public final ArrayList f159512a;

    /* JADX INFO: renamed from: b */
    public final char f159513b;

    /* JADX INFO: renamed from: c */
    public final double f159514c;

    /* JADX INFO: renamed from: d */
    public final String f159515d;

    /* JADX INFO: renamed from: e */
    public final String f159516e;

    public C37304d(ArrayList arrayList, char c3, double d3, String str, String str2) {
        this.f159512a = arrayList;
        this.f159513b = c3;
        this.f159514c = d3;
        this.f159515d = str;
        this.f159516e = str2;
    }

    /* JADX INFO: renamed from: a */
    public static int m119476a(char c3, String str, String str2) {
        return str2.hashCode() + AbstractC11266d.m30450d(c3 * 31, 31, str);
    }

    public final int hashCode() {
        return m119476a(this.f159513b, this.f159516e, this.f159515d);
    }
}
