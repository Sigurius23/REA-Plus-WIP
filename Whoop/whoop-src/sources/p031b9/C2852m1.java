package p031b9;

import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import cd3.C4455g;
import com.stripe.android.paymentelement.confirmation.intent.InvalidClientSecretException;
import com.whoop.android.R;
import e10.C12535b;
import e10.C12537c;
import e10.C12571t;
import e10.InterfaceC12539d;
import java.nio.ByteBuffer;
import java.util.regex.Pattern;
import kr.C22786e;
import n10.C26123d0;
import n10.EnumC26121c0;
import np.AbstractC27007l;
import np.C27000e;
import np.C27004i;
import p014aj.C0928c;
import p073cq.C11040i;
import p309lo.C24561s;
import p479s4.AbstractC32128i;
import p537ux.C35324c;
import p537ux.C35326d;
import p607x8.C38061p;
import p641y8.AbstractC39319n;
import p641y8.C39320o;
import p641y8.C39321p;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import to.InterfaceC33987n;
import u00.C34377e;
import va3.AbstractC35849g;
import y00.C38810d6;
import y00.C38827f3;
import y00.C38840g6;
import y00.C38887l3;
import y00.C38919p;
import y00.InterfaceC38802c8;
import y00.InterfaceC38946s;

/* JADX INFO: renamed from: b9.m1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2852m1 implements InterfaceC33987n {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f11319w;

    /* JADX INFO: renamed from: x */
    public boolean f11320x;

    public /* synthetic */ C2852m1(int i13) {
        this.f11319w = i13;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m8246a() {
        boolean z4 = false;
        while (!this.f11320x) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z4 = true;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // to.InterfaceC33987n
    public void accept(Object obj, Object obj2) {
        boolean z4 = this.f11320x;
        C4455g c4455g = ((C27004i) obj).f107683A;
        C0928c c0928c = (C0928c) c4455g.f17959E;
        ((C27004i) c0928c.f3421x).m111058c();
        C27000e c27000eM2318a0 = c0928c.m2318a0();
        Parcel parcelM80981s = c27000eM2318a0.m80981s();
        AbstractC27007l.m80994a(parcelM80981s, z4);
        c27000eM2318a0.m80980c0(parcelM80981s, 12);
        c4455g.f17961w = z4;
        ((C11040i) obj2).m29687b(null);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    /* JADX WARN: Code duplicated, block: B:12:0x0041  */
    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    /* JADX INFO: renamed from: b */
    public InterfaceC12539d m8247b(String clientSecret, InterfaceC38802c8 intent, C38919p c38919p, boolean z4, Function1 function1) {
        Object c35326d;
        AbstractC22676k.m65750j(clientSecret, "clientSecret");
        AbstractC22676k.m65750j(intent, "intent");
        if (intent instanceof C38887l3) {
            Pattern pattern = C38827f3.f167085c;
            if (C38827f3.f167085c.matcher(clientSecret).matches()) {
                c35326d = new C35324c(clientSecret, (C38887l3) intent, c38919p);
            } else if (intent instanceof C38840g6) {
                Pattern pattern2 = C38810d6.f167030c;
                if (C38810d6.f167030c.matcher(clientSecret).matches()) {
                    c35326d = new C35326d(clientSecret, (C38840g6) intent);
                } else {
                    c35326d = null;
                }
            } else {
                c35326d = null;
            }
        } else if (intent instanceof C38840g6) {
            Pattern pattern3 = C38810d6.f167030c;
            if (C38810d6.f167030c.matcher(clientSecret).matches()) {
                c35326d = new C35326d(clientSecret, (C38840g6) intent);
            } else {
                c35326d = null;
            }
        } else {
            c35326d = null;
        }
        if (c35326d != null) {
            return new C12537c(new C26123d0((InterfaceC38946s) function1.invoke(c35326d)), false, z4 ? EnumC26121c0.Client : null);
        }
        InvalidClientSecretException invalidClientSecretException = new InvalidClientSecretException(clientSecret, intent);
        String message = invalidClientSecretException.f22334F;
        AbstractC22676k.m65750j(message, "message");
        return new C12535b(invalidClientSecretException, this.f11320x ? AbstractC32128i.m100054h(R.string.stripe_internal_error) : AbstractC32128i.m100055i(message), C12571t.f42932a);
    }

    /* JADX INFO: renamed from: c */
    public synchronized boolean m8248c() {
        int i13 = this.f11319w;
        synchronized (this) {
            switch (i13) {
                case 2:
                    if (this.f11320x) {
                        return false;
                    }
                    this.f11320x = true;
                    notifyAll();
                    return true;
                default:
                    if (this.f11320x) {
                        return false;
                    }
                    this.f11320x = true;
                    notifyAll();
                    return true;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m8249d(boolean z4) {
        switch (this.f11319w) {
            case 0:
                if (this.f11320x != z4) {
                    this.f11320x = z4;
                    break;
                }
                break;
            default:
                if (this.f11320x != z4) {
                    this.f11320x = z4;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ C2852m1(boolean z4, int i13) {
        this.f11319w = i13;
        this.f11320x = z4;
    }

    public C2852m1(Context context, Looper looper, C38061p c38061p, int i13) {
        this.f11319w = i13;
        switch (i13) {
            case 1:
                new C22786e(context.getApplicationContext());
                c38061p.m121874a(looper, null);
                break;
            default:
                new C34377e(context.getApplicationContext());
                c38061p.m121874a(looper, null);
                break;
        }
    }

    public C2852m1(AbstractC39319n abstractC39319n, C39321p c39321p) throws C39320o {
        this.f11319w = 8;
        int i13 = c39321p.f169171a;
        ByteBuffer byteBuffer = c39321p.f169172b;
        AbstractC35849g.m113802d(i13 == 6 || i13 == 3);
        int iMin = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        C24561s c24561s = new C24561s(bArr, iMin, 5, (byte) 0);
        abstractC39319n.getClass();
        AbstractC39319n.m125274a(false);
        if (c24561s.m71631h()) {
            this.f11320x = false;
            return;
        }
        int iM71632i = c24561s.m71632i(2);
        boolean zM71631h = c24561s.m71631h();
        AbstractC39319n.m125274a(false);
        if (!zM71631h) {
            this.f11320x = true;
            return;
        }
        boolean zM71631h2 = (iM71632i == 3 || iM71632i == 0) ? true : c24561s.m71631h();
        c24561s.m71642s();
        AbstractC39319n.m125274a(!false);
        if (c24561s.m71631h()) {
            AbstractC39319n.m125274a(!false);
            c24561s.m71642s();
        }
        AbstractC39319n.m125274a(false);
        if (iM71632i != 3) {
            c24561s.m71642s();
        }
        c24561s.m71643t(0);
        if (iM71632i != 2 && iM71632i != 0 && !zM71631h2) {
            c24561s.m71643t(3);
        }
        this.f11320x = ((iM71632i == 3 || iM71632i == 0) ? 255 : c24561s.m71632i(8)) != 0;
    }
}
