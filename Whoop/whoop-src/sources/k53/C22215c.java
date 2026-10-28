package k53;

import p078d1.C11457j;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: k53.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C22215c {

    /* JADX INFO: renamed from: a */
    public final C11457j f86569a;

    public C22215c(C11457j c11457j) {
        this.f86569a = c11457j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C22215c) && AbstractC22676k.m65745e(this.f86569a, ((C22215c) obj).f86569a);
    }

    public final int hashCode() {
        return this.f86569a.hashCode() * 31;
    }

    public final String toString() {
        return "Sounds(ringingConfig=" + this.f86569a + ", mutedRingingConfig=null)";
    }
}
