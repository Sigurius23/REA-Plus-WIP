package p343nk;

import io.sentry.AbstractC20601v;
import java.io.File;
import java.io.FilenameFilter;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: nk.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C26781b implements FilenameFilter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f106665a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f106666b;

    public /* synthetic */ C26781b(Object obj, int i13) {
        this.f106665a = i13;
        this.f106666b = obj;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String name) {
        switch (this.f106665a) {
            case 0:
                C26788i this$0 = (C26788i) this.f106666b;
                AbstractC22676k.m65750j(this$0, "this$0");
                AbstractC22676k.m65749i(name, "name");
                return (!AbstractC39414r.m125876U(name, this$0.f106694b, false) || AbstractC39421y.m125920E(name, ".tmp", false) || AbstractC39421y.m125920E(name, ".properties", false)) ? false : true;
            case 1:
                C26788i c26788i = (C26788i) this.f106666b;
                AbstractC22676k.m65749i(name, "name");
                return AbstractC39414r.m125876U(name, c26788i.f106694b, false) && AbstractC39421y.m125920E(name, ".tmp", false);
            case 2:
                C26788i c26788i2 = (C26788i) this.f106666b;
                AbstractC22676k.m65749i(name, "name");
                return AbstractC39414r.m125876U(name, c26788i2.f106694b, false) && !AbstractC39421y.m125920E(name, ".properties", false);
            default:
                return ((AbstractC20601v) this.f106666b).mo55887a(name);
        }
    }
}
