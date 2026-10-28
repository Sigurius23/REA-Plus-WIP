package z10;

import android.os.Parcelable;
import f20.EnumC14023b;
import w10.InterfaceC36692d;

/* JADX INFO: renamed from: z10.e */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC39982e implements Parcelable {

    /* JADX INFO: renamed from: w */
    public final String f172548w;

    /* JADX INFO: renamed from: x */
    public final boolean f172549x;

    public AbstractC39982e(String str, boolean z4) {
        this.f172548w = str;
        this.f172549x = z4;
    }

    /* JADX INFO: renamed from: b */
    public boolean mo128211b() {
        return this.f172549x;
    }

    /* JADX INFO: renamed from: f */
    public abstract InterfaceC36692d mo128207f();

    public String getClientSecret() {
        return this.f172548w;
    }

    /* JADX INFO: renamed from: h */
    public abstract EnumC14023b mo128208h();

    /* JADX INFO: renamed from: i */
    public abstract String mo128209i();

    /* JADX INFO: renamed from: k */
    public abstract String mo128210k();
}
