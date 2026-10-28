package na3;

import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25267u;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: na3.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C26526m {

    /* JADX INFO: renamed from: a */
    public final C26530q f105452a;

    /* JADX INFO: renamed from: b */
    public final List f105453b;

    /* JADX INFO: renamed from: c */
    public final String f105454c;

    /* JADX INFO: renamed from: d */
    public final C26526m f105455d;

    public C26526m(C26530q c26530q, List parametersInfo, String str) {
        AbstractC22676k.m65750j(parametersInfo, "parametersInfo");
        this.f105452a = c26530q;
        this.f105453b = parametersInfo;
        this.f105454c = str;
        C26526m c26526m = null;
        if (str != null) {
            C26530q c26530qM78604a = c26530q != null ? c26530q.m78604a() : null;
            List<C26530q> list = parametersInfo;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            for (C26530q c26530q2 : list) {
                arrayList.add(c26530q2 != null ? c26530q2.m78604a() : null);
            }
            c26526m = new C26526m(c26530qM78604a, arrayList, null);
        }
        this.f105455d = c26526m;
    }

    /* JADX INFO: renamed from: a */
    public final String m78597a() {
        return this.f105454c;
    }

    /* JADX INFO: renamed from: b */
    public final List m78598b() {
        return this.f105453b;
    }

    /* JADX INFO: renamed from: c */
    public final C26530q m78599c() {
        return this.f105452a;
    }

    /* JADX INFO: renamed from: d */
    public final C26526m m78600d() {
        return this.f105455d;
    }
}
