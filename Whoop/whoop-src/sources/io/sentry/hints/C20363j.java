package io.sentry.hints;

import a13.C0151i;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetFileDescriptor;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1174d0;
import androidx.databinding.C1195y;
import androidx.databinding.C1196z;
import androidx.databinding.InterfaceC1173d;
import androidx.lifecycle.EnumC1635w;
import cd3.C4455g;
import cg.C4568w;
import cg.C4569x;
import com.google.crypto.tink.internal.C5099k0;
import dk.C12100f;
import fk.InterfaceC14544a;
import ge3.C15749e;
import ge3.InterfaceC15756l;
import ge3.InterfaceC15758n;
import gl.InterfaceC15935a0;
import ig3.InterfaceC18476b;
import io.sentry.C20513q6;
import io.sentry.metrics.InterfaceC20427a;
import io.sentry.metrics.InterfaceC20428b;
import java.io.File;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.net.ssl.SSLSocket;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import ne3.C26616h;
import p000.AbstractC11266d;
import p014aj.C0926a;
import p034bl.C3368h;
import p077d0.InterfaceC11345e0;
import p114eb.C12942b0;
import p114eb.C12977n0;
import p114eb.C12982q;
import p148fg.C14445o;
import p148fg.C14451u;
import p173gj.C15903d;
import p173gj.C15906g;
import p223ik.InterfaceC18598b;
import p223ik.InterfaceC18599c;
import p298l8.InterfaceC23419b;
import p437qt.C30582e;
import p526ul.InterfaceC35055a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.EnumC34828m0;
import vg.InterfaceC35960g;
import xg3.InterfaceC38282i;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: io.sentry.hints.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C20363j implements InterfaceC1173d, InterfaceC23419b, InterfaceC35055a, InterfaceC38282i, InterfaceC18599c, InterfaceC35960g, InterfaceC15756l, InterfaceC15935a0, InterfaceC11345e0, InterfaceC18476b, InterfaceC20428b {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f76391w;

    public /* synthetic */ C20363j(int i13) {
        this.f76391w = i13;
    }

    /* JADX INFO: renamed from: i */
    public static final String m56528i(List list, boolean z4) {
        int i13 = C4569x.f18385c;
        return AbstractC25265s.m74110N0(list, "/", list.isEmpty() ? "" : "/", z4 ? "/" : "", C4568w.f18384w, 24);
    }

    /* JADX INFO: renamed from: j */
    public static ArrayList m56529j(List protocols) {
        AbstractC22676k.m65750j(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((EnumC34828m0) obj) != EnumC34828m0.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((EnumC34828m0) it.next()).f146686w);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: n */
    public static byte[] m56530n(List protocols) {
        AbstractC22676k.m65750j(protocols, "protocols");
        C26616h c26616h = new C26616h();
        for (String str : m56529j(protocols)) {
            c26616h.m79219m1(str.length());
            c26616h.m79232u1(str);
        }
        return c26616h.m79201b0(c26616h.f105866x);
    }

    /* JADX INFO: renamed from: o */
    public static C12982q m56531o(Context context, C12977n0 destination, Bundle bundle, EnumC1635w hostLifecycleState, C12942b0 c12942b0) {
        String string = UUID.randomUUID().toString();
        AbstractC22676k.m65749i(string, "randomUUID().toString()");
        AbstractC22676k.m65750j(destination, "destination");
        AbstractC22676k.m65750j(hostLifecycleState, "hostLifecycleState");
        return new C12982q(context, destination, bundle, hostLifecycleState, c12942b0, string, null);
    }

    /* JADX INFO: renamed from: p */
    public static C0926a m56532p(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new C0926a(httpURLConnection, 0);
    }

    @Override // ge3.InterfaceC15756l
    /* JADX INFO: renamed from: a */
    public boolean mo44419a(SSLSocket sSLSocket) {
        return AbstractC39421y.m125930O(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // io.sentry.metrics.InterfaceC20428b
    /* JADX INFO: renamed from: b */
    public InterfaceC20427a mo56059b(C20513q6 c20513q6, C4455g c4455g) {
        return new C5099k0(c20513q6, c4455g);
    }

    @Override // ig3.InterfaceC18476b
    /* JADX INFO: renamed from: c */
    public void mo11165c(String str, String str2) {
    }

    @Override // ig3.InterfaceC18476b
    public void clear() {
    }

    @Override // p526ul.InterfaceC35055a
    public Object create() {
        try {
            return new C3368h(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // p077d0.InterfaceC11345e0
    /* JADX INFO: renamed from: d */
    public float mo11166d(float f13, long j7) {
        return 0.0f;
    }

    @Override // gl.InterfaceC15935a0
    /* JADX INFO: renamed from: e */
    public void mo44991e(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // ig3.InterfaceC18476b
    /* JADX INFO: renamed from: f */
    public Map mo11168f() {
        return null;
    }

    @Override // vg.InterfaceC35960g
    /* JADX INFO: renamed from: g */
    public Object mo56533g(Function1 function1) {
        function1.invoke(new C14445o());
        return new C14451u(new C30582e(19));
    }

    @Override // ge3.InterfaceC15756l
    /* JADX INFO: renamed from: h */
    public InterfaceC15758n mo44420h(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError(AbstractC11266d.m30459m(cls, "No OpenSSLSocketImpl superclass of socket of type "));
            }
        }
        return new C15749e(superclass);
    }

    @Override // p077d0.InterfaceC11345e0
    /* JADX INFO: renamed from: k */
    public float mo11172k() {
        return 0.0f;
    }

    @Override // p223ik.InterfaceC18599c
    /* JADX INFO: renamed from: l */
    public InterfaceC18598b mo53816l(C15903d c15903d) {
        C15906g c15906g = c15903d.f60128a;
        SharedPreferences sharedPreferences = c15906g.f60153b.getSharedPreferences("amplitude-identify-intercept-" + c15906g.f60156e, 0);
        String str = c15906g.f60156e;
        InterfaceC14544a interfaceC14544aM11156E = c15906g.f60158g.m11156E(c15903d);
        AbstractC22676k.m65749i(sharedPreferences, "sharedPreferences");
        return new C12100f(str, interfaceC14544aM11156E, sharedPreferences, new File(c15906g.m44888a(), "identify-intercept"), c15903d.f60141n);
    }

    @Override // androidx.databinding.InterfaceC1173d
    /* JADX INFO: renamed from: m */
    public C1174d0 mo3728m(AbstractC1168a0 abstractC1168a0, int i13, ReferenceQueue referenceQueue) {
        switch (this.f76391w) {
            case 4:
                return new C1196z(abstractC1168a0, i13, referenceQueue).m3742d();
            default:
                return new C1195y(abstractC1168a0, i13, referenceQueue, 1).m3741d();
        }
    }

    /* JADX INFO: renamed from: q */
    public C0151i m56534q(Application application) {
        C0151i c0151i;
        C0151i c0151i2 = C0151i.f469F;
        if (c0151i2 != null) {
            return c0151i2;
        }
        synchronized (this) {
            c0151i = C0151i.f469F;
            if (c0151i == null) {
                c0151i = new C0151i();
                C0151i.f469F = c0151i;
                application.registerActivityLifecycleCallbacks(c0151i);
            }
        }
        return c0151i;
    }

    @Override // xg3.InterfaceC38282i
    public void request(long j7) {
    }

    @Override // p077d0.InterfaceC11345e0
    /* JADX INFO: renamed from: u */
    public float mo11173u(float f13, long j7, float f14) {
        return 0.0f;
    }

    @Override // ig3.InterfaceC18476b
    /* JADX INFO: renamed from: v */
    public void mo11174v(Map map) {
    }

    @Override // p077d0.InterfaceC11345e0
    /* JADX INFO: renamed from: w */
    public long mo11175w(float f13) {
        return 0L;
    }

    @Override // p077d0.InterfaceC11345e0
    /* JADX INFO: renamed from: x */
    public float mo11176x(float f13, float f14) {
        return 0.0f;
    }
}
