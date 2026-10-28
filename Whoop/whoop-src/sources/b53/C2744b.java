package b53;

import androidx.room.AbstractC1772c1;
import io.sentry.internal.debugmeta.C20378c;
import j93.InterfaceC21493z;
import java.util.concurrent.atomic.AtomicInteger;
import l83.C23470p;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22693x;
import q83.AbstractC30060g;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: b53.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2744b {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ InterfaceC21493z[] f10782e;

    /* JADX INFO: renamed from: a */
    public final C20378c f10783a;

    /* JADX INFO: renamed from: b */
    public final C23470p f10784b;

    /* JADX INFO: renamed from: c */
    public final AtomicInteger f10785c;

    /* JADX INFO: renamed from: d */
    public final AtomicInteger f10786d;

    static {
        C22693x c22693x = new C22693x(C2744b.class, "dateFormat", "getDateFormat()Ljava/text/SimpleDateFormat;", 0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        f10782e = new InterfaceC21493z[]{c22673i0.property1(c22693x), AbstractC31061c.m95632h(C2744b.class, "dateFormatWithoutNanoseconds", "getDateFormatWithoutNanoseconds()Ljava/text/SimpleDateFormat;", 0, c22673i0)};
    }

    public C2744b() {
        AbstractC1772c1.m5382S(this, "StreamDateFormatter");
        new C20378c(C2743a.f10779y);
        this.f10783a = new C20378c(C2743a.f10780z);
        this.f10784b = AbstractC30060g.m92088H(C2743a.f10778x);
        this.f10785c = new AtomicInteger();
        this.f10786d = new AtomicInteger();
    }
}
