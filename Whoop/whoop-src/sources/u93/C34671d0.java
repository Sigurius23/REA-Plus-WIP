package u93;

import ae3.C0803k;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import io.sentry.android.core.util.C20162a;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p088dc.AbstractC11895b;
import p474s.C31983m2;
import p479s4.AbstractC32122c;
import p518ub.InterfaceC34733f;
import p518ub.InterfaceC34734g;
import p526ul.InterfaceC35055a;
import p578wb.C37028e;
import p684zk.RunnableC40784i;
import p715kotlin.jvm.internal.AbstractC22676k;
import wd3.ThreadFactoryC37173g;

/* JADX INFO: renamed from: u93.d0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34671d0 implements InterfaceC34734g, InterfaceC35055a {

    /* JADX INFO: renamed from: w */
    public final Object f146043w;

    public /* synthetic */ C34671d0(Object obj) {
        this.f146043w = obj;
    }

    /* JADX INFO: renamed from: a */
    public static String m109559a(String str, String str2) {
        return AbstractC11895b.m31997p(str, "|T|", str2, "|*");
    }

    @Override // p518ub.InterfaceC34734g
    /* JADX INFO: renamed from: b */
    public int mo5445b() {
        return ((C37028e) this.f146043w).f158414z.length;
    }

    @Override // p526ul.InterfaceC35055a
    public Object create() {
        C0803k c0803k = (C0803k) this.f146043w;
        return new RunnableC40784i((C20162a) c0803k.f2965c, (C31983m2) c0803k.f2966d);
    }

    @Override // p518ub.InterfaceC34734g
    /* JADX INFO: renamed from: h */
    public String mo5446h() {
        return ((C37028e) this.f146043w).f158416x;
    }

    @Override // p518ub.InterfaceC34734g
    /* JADX INFO: renamed from: i */
    public void mo5447i(InterfaceC34733f interfaceC34733f) {
        C37028e c37028e = (C37028e) this.f146043w;
        int length = c37028e.f158414z.length;
        for (int i13 = 1; i13 < length; i13++) {
            int i14 = c37028e.f158414z[i13];
            if (i14 == 1) {
                interfaceC34733f.mo5433p(i13, c37028e.f158409E[i13]);
            } else if (i14 == 2) {
                interfaceC34733f.mo5435t(c37028e.f158410F[i13], i13);
            } else if (i14 == 3) {
                String str = c37028e.f158411G[i13];
                AbstractC22676k.m65747g(str);
                interfaceC34733f.mo5432n0(i13, str);
            } else if (i14 == 4) {
                byte[] bArr = c37028e.f158412H[i13];
                AbstractC22676k.m65747g(bArr);
                interfaceC34733f.mo5434q(i13, bArr);
            } else if (i14 == 5) {
                interfaceC34733f.mo5436u(i13);
            }
        }
    }

    public C34671d0(Context context) {
        boolean zIsEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f146043w = sharedPreferences;
        File file = new File(AbstractC32122c.getNoBackupFilesDir(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e5) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e5.getMessage());
            }
        }
    }

    public C34671d0(ThreadFactoryC37173g threadFactoryC37173g) {
        this.f146043w = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactoryC37173g);
    }
}
