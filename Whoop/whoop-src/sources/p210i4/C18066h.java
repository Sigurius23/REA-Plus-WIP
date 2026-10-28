package p210i4;

/* JADX INFO: renamed from: i4.h */
/* JADX INFO: loaded from: classes.dex */
public final class C18066h extends AbstractC18061c {
    /* JADX INFO: renamed from: j */
    public static C18066h m51912j(String str) {
        C18066h c18066h = new C18066h(str.toCharArray());
        c18066h.f70147x = 0L;
        c18066h.m51910g(str.length() - 1);
        return c18066h;
    }

    @Override // p210i4.AbstractC18061c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C18066h) && m51906c().equals(((C18066h) obj).m51906c())) {
            return true;
        }
        return super.equals(obj);
    }
}
