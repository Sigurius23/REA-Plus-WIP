package p209i3;

import java.util.Comparator;
import l83.C23465k;
import p181h2.C16618c;

/* JADX INFO: renamed from: i3.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C18025g implements Comparator {

    /* JADX INFO: renamed from: x */
    public static final C18025g f69941x = new C18025g(0);

    /* JADX INFO: renamed from: y */
    public static final C18025g f69942y = new C18025g(1);

    /* JADX INFO: renamed from: z */
    public static final C18025g f69943z = new C18025g(2);

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f69944w;

    public /* synthetic */ C18025g(int i13) {
        this.f69944w = i13;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f69944w) {
            case 0:
                C16618c c16618cM51784h = ((C18034p) obj).m51784h();
                C16618c c16618cM51784h2 = ((C18034p) obj2).m51784h();
                int iCompare = Float.compare(c16618cM51784h.f63939a, c16618cM51784h2.f63939a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(c16618cM51784h.f63940b, c16618cM51784h2.f63940b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(c16618cM51784h.f63942d, c16618cM51784h2.f63942d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(c16618cM51784h.f63941c, c16618cM51784h2.f63941c);
            case 1:
                C16618c c16618cM51784h3 = ((C18034p) obj).m51784h();
                C16618c c16618cM51784h4 = ((C18034p) obj2).m51784h();
                int iCompare4 = Float.compare(c16618cM51784h4.f63941c, c16618cM51784h3.f63941c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(c16618cM51784h3.f63940b, c16618cM51784h4.f63940b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(c16618cM51784h3.f63942d, c16618cM51784h4.f63942d);
                return iCompare6 != 0 ? iCompare6 : Float.compare(c16618cM51784h4.f63939a, c16618cM51784h3.f63939a);
            default:
                C23465k c23465k = (C23465k) obj;
                C23465k c23465k2 = (C23465k) obj2;
                int iCompare7 = Float.compare(((C16618c) c23465k.f92937w).f63940b, ((C16618c) c23465k2.f92937w).f63940b);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((C16618c) c23465k.f92937w).f63942d, ((C16618c) c23465k2.f92937w).f63942d);
        }
    }
}
