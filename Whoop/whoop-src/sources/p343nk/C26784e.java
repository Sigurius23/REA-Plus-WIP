package p343nk;

import java.io.File;
import java.util.Comparator;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import x83.AbstractC38093j;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: nk.e */
/* JADX INFO: loaded from: classes.dex */
public final class C26784e implements Comparator {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C26788i f106678w;

    public C26784e(C26788i c26788i) {
        this.f106678w = c26788i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String strM125895n0;
        String strM125895n1;
        File file = (File) obj;
        AbstractC22676k.m65749i(file, "file");
        String strM122040n = AbstractC38093j.m122040n(file);
        StringBuilder sb4 = new StringBuilder();
        C26788i c26788i = this.f106678w;
        String strM125926K = AbstractC39421y.m125926K(strM122040n, AbstractC25012a.m73377j(sb4, c26788i.f106694b, '-'), "", false);
        int iM125887f0 = AbstractC39414r.m125887f0(strM125926K, '-', 0, false, 6);
        if (iM125887f0 >= 0) {
            StringBuilder sb5 = new StringBuilder();
            String strSubstring = strM125926K.substring(0, iM125887f0);
            AbstractC22676k.m65749i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb5.append(AbstractC39414r.m125895n0(10, strSubstring));
            String strSubstring2 = strM125926K.substring(iM125887f0);
            AbstractC22676k.m65749i(strSubstring2, "this as java.lang.String).substring(startIndex)");
            sb5.append(strSubstring2);
            strM125895n0 = sb5.toString();
        } else {
            strM125895n0 = AbstractC39414r.m125895n0(10, strM125926K);
        }
        File file2 = (File) obj2;
        AbstractC22676k.m65749i(file2, "file");
        String strM125926K2 = AbstractC39421y.m125926K(AbstractC38093j.m122040n(file2), AbstractC25012a.m73377j(new StringBuilder(), c26788i.f106694b, '-'), "", false);
        int iM125887f1 = AbstractC39414r.m125887f0(strM125926K2, '-', 0, false, 6);
        if (iM125887f1 >= 0) {
            StringBuilder sb6 = new StringBuilder();
            String strSubstring3 = strM125926K2.substring(0, iM125887f1);
            AbstractC22676k.m65749i(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
            sb6.append(AbstractC39414r.m125895n0(10, strSubstring3));
            String strSubstring4 = strM125926K2.substring(iM125887f1);
            AbstractC22676k.m65749i(strSubstring4, "this as java.lang.String).substring(startIndex)");
            sb6.append(strSubstring4);
            strM125895n1 = sb6.toString();
        } else {
            strM125895n1 = AbstractC39414r.m125895n0(10, strM125926K2);
        }
        return AbstractC30060g.m92127q(strM125895n0, strM125895n1);
    }
}
