package p93;

import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.C35847e;
import va3.C35850h;

/* JADX INFO: renamed from: p93.k */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC29032k {

    /* JADX INFO: renamed from: a */
    public final C35847e f117502a;

    /* JADX INFO: renamed from: b */
    public final String f117503b;

    public AbstractC29032k(String str, C35847e packageFqName) {
        AbstractC22676k.m65750j(packageFqName, "packageFqName");
        this.f117502a = packageFqName;
        this.f117503b = str;
    }

    /* JADX INFO: renamed from: a */
    public final C35850h m88263a(int i13) {
        return C35850h.m113814e(this.f117503b + i13);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f117502a);
        sb4.append('.');
        return AbstractC25012a.m73377j(sb4, this.f117503b, 'N');
    }
}
