package aa3;

import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: aa3.e0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0614e0 extends AbstractC0638m0 {
    /* JADX INFO: renamed from: a */
    public abstract Object mo1614a();

    public final String toString() {
        String string;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(getClass().getSimpleName());
        sb4.append('(');
        if (this instanceof C0623h0) {
            string = "\"" + ((Object) ((C0623h0) this).f2188a) + '\"';
        } else {
            string = mo1614a().toString();
        }
        return AbstractC25012a.m73377j(sb4, string, ')');
    }
}
