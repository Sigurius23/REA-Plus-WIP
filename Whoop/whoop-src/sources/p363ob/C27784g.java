package p363ob;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ob.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C27784g implements Comparable {

    /* JADX INFO: renamed from: w */
    public final int f112016w;

    /* JADX INFO: renamed from: x */
    public final int f112017x;

    /* JADX INFO: renamed from: y */
    public final String f112018y;

    /* JADX INFO: renamed from: z */
    public final String f112019z;

    public C27784g(int i13, int i14, String from, String to3) {
        AbstractC22676k.m65750j(from, "from");
        AbstractC22676k.m65750j(to3, "to");
        this.f112016w = i13;
        this.f112017x = i14;
        this.f112018y = from;
        this.f112019z = to3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C27784g other = (C27784g) obj;
        AbstractC22676k.m65750j(other, "other");
        int i13 = this.f112016w - other.f112016w;
        return i13 == 0 ? this.f112017x - other.f112017x : i13;
    }
}
