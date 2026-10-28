package p031b9;

import android.content.Context;
import g73.C15556d;
import io.C20033m;
import io.sentry.internal.debugmeta.C20378c;
import java.util.HashMap;
import p284ko.C22633q;
import p299l9.C23519p;
import p309lo.C24562t;
import p361o9.C27677q;
import p398p9.C28982f;
import p412q3.C29875i;
import p499t9.C33640l;
import p547v8.AbstractC35785b;
import p588wm.C37365g;
import p607x8.C38058m;
import p658yr.InterfaceC39722i;
import p690zr.C41060w0;
import pg3.C29203o;
import sn.C32739j;

/* JADX INFO: renamed from: b9.d */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C2823d implements InterfaceC39722i {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f11065w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Context f11066x;

    public /* synthetic */ C2823d(Context context, int i13) {
        this.f11065w = i13;
        this.f11066x = context;
    }

    @Override // p658yr.InterfaceC39722i
    public final Object get() {
        C28982f c28982f;
        C22633q c22633q;
        int i13 = 4;
        switch (this.f11065w) {
            case 0:
                return AbstractC35785b.m113423r(this.f11066x);
            case 1:
                return new C20378c(this.f11066x);
            case 2:
                return new C23519p(new C29203o(this.f11066x, 10), new C33640l());
            case 3:
                return new C27677q(this.f11066x);
            case 4:
                Context context = this.f11066x;
                C41060w0 c41060w0 = C28982f.f117223p;
                synchronized (C28982f.class) {
                    try {
                        if (C28982f.f117229v == null) {
                            Context applicationContext = context == null ? null : context.getApplicationContext();
                            HashMap map = new HashMap(8);
                            map.put(0, 1000000L);
                            map.put(2, -9223372036854775807L);
                            map.put(3, -9223372036854775807L);
                            map.put(4, -9223372036854775807L);
                            map.put(5, -9223372036854775807L);
                            map.put(10, -9223372036854775807L);
                            map.put(9, -9223372036854775807L);
                            map.put(7, -9223372036854775807L);
                            C28982f.f117229v = new C28982f(applicationContext, map);
                        }
                        c28982f = C28982f.f117229v;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return c28982f;
            case 5:
                Context context2 = this.f11066x;
                C29875i c29875i = new C29875i();
                c29875i.f122095w = context2;
                c29875i.f122096x = new C15556d(i13);
                return c29875i;
            case 6:
                return new C32739j(this.f11066x, new C37365g());
            case 7:
                return new C20033m(this.f11066x);
            default:
                Context context3 = this.f11066x;
                C41060w0 c41060w1 = C22633q.f89034n;
                synchronized (C22633q.class) {
                    try {
                        if (C22633q.f89040t == null) {
                            C38058m c38058m = new C38058m(context3, 1);
                            C22633q.f89040t = new C22633q((Context) c38058m.f163011c, (HashMap) c38058m.f163012d, c38058m.f163009a, (C24562t) c38058m.f163013e, c38058m.f163010b);
                        }
                        c22633q = C22633q.f89040t;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return c22633q;
        }
    }
}
