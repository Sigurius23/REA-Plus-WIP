package al0;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.stripe.android.view.CardNumberEditText;
import fq0.C14683b;
import io.getstream.chat.android.p226ui.common.images.StreamImageLoaderFactory;
import java.io.File;
import java.io.IOException;
import lu.C24741c;
import ne3.C26611e0;
import p249jc.C21567b;
import p425qh.AbstractC30358d;
import p537ux.C35362x;
import p537ux.C35363y;
import p715kotlin.jvm.internal.AbstractC22676k;
import p748zc1.AbstractC40275b;
import p748zc1.AbstractC40398m1;
import p748zc1.AbstractC40448r0;
import sr2.C32919a0;
import sv2.AbstractC33042e;
import ui1.C35018a;
import v63.AbstractC35750h;

/* JADX INFO: renamed from: al0.f */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C0971f implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f3583w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Context f3584x;

    public /* synthetic */ C0971f(Context context, int i13) {
        this.f3583w = i13;
        this.f3584x = context;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        C35363y c35363y;
        int i13 = this.f3583w;
        Context context = this.f3584x;
        switch (i13) {
            case 0:
                return C0975j.m2662y2(context);
            case 1:
                AbstractC22676k.m65750j(context, "context");
                C35363y c35363y2 = C35363y.f150632y;
                if (c35363y2 == null) {
                    SharedPreferences sharedPreferences = new C35362x(context).f150631a;
                    String string = sharedPreferences.getString("key_publishable_key", null);
                    c35363y = string != null ? new C35363y(string, sharedPreferences.getString("key_account_id", null)) : null;
                    if (c35363y == null) {
                        throw new IllegalStateException("PaymentConfiguration was not initialized. Call PaymentConfiguration.init().");
                    }
                    C35363y.f150632y = c35363y;
                    c35363y2 = c35363y;
                }
                return c35363y2.f150633w;
            case 2:
                Bitmap.Config[] configArr = AbstractC30358d.f124548a;
                File cacheDir = context.getCacheDir();
                if (cacheDir == null) {
                    throw new IllegalStateException("cacheDir == null");
                }
                cacheDir.mkdirs();
                return cacheDir;
            case 3:
                Bitmap.Config[] configArr2 = AbstractC30358d.f124548a;
                File cacheDir2 = context.getCacheDir();
                if (cacheDir2 == null) {
                    throw new IllegalStateException("cacheDir == null");
                }
                cacheDir2.mkdirs();
                return cacheDir2;
            case 4:
                return C14683b.m41996A(context);
            case 5:
                return context.getSharedPreferences("app_info", 0);
            case 6:
                try {
                    String path = context.getCacheDir().getPath();
                    AbstractC22676k.m65749i(path, "getPath(...)");
                    return C24741c.m72437s(new File(path + File.separator + "stripe_image_cache"));
                } catch (IOException e5) {
                    Log.e("stripe_image_disk_cache", "error opening cache", e5);
                    return null;
                }
            case 7:
                return StreamImageLoaderFactory.m55074c(context);
            case 8:
                AbstractC22676k.m65750j(context, "context");
                C35363y c35363y3 = C35363y.f150632y;
                if (c35363y3 == null) {
                    SharedPreferences sharedPreferences2 = new C35362x(context).f150631a;
                    String string2 = sharedPreferences2.getString("key_publishable_key", null);
                    c35363y = string2 != null ? new C35363y(string2, sharedPreferences2.getString("key_account_id", null)) : null;
                    if (c35363y == null) {
                        throw new IllegalStateException("PaymentConfiguration was not initialized. Call PaymentConfiguration.init().");
                    }
                    C35363y.f150632y = c35363y;
                    c35363y3 = c35363y;
                }
                return c35363y3.f150633w;
            case 9:
                int i14 = CardNumberEditText.f22507p0;
                AbstractC22676k.m65750j(context, "context");
                C35363y c35363y4 = C35363y.f150632y;
                if (c35363y4 == null) {
                    SharedPreferences sharedPreferences3 = new C35362x(context).f150631a;
                    String string3 = sharedPreferences3.getString("key_publishable_key", null);
                    c35363y = string3 != null ? new C35363y(string3, sharedPreferences3.getString("key_account_id", null)) : null;
                    if (c35363y == null) {
                        throw new IllegalStateException("PaymentConfiguration was not initialized. Call PaymentConfiguration.init().");
                    }
                    C35363y.f150632y = c35363y;
                    c35363y4 = c35363y;
                }
                return c35363y4.f150633w;
            case 10:
                return C32919a0.m103425l0(context);
            case 11:
                return C32919a0.m103409d0(context);
            case 12:
                return C32919a0.m103403a0(context);
            case 13:
                return C32919a0.m103429n0(context);
            case 14:
                return AbstractC33042e.m104480V0(context);
            case 15:
                return context.getSharedPreferences("FraudDetectionDataStore", 0);
            case 16:
                return C35018a.m110670q(context);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return context.getSharedPreferences("PaymentSheet_LinkStore", 0);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                AbstractC22676k.m65750j(context, "context");
                C35363y c35363y5 = C35363y.f150632y;
                if (c35363y5 == null) {
                    SharedPreferences sharedPreferences4 = new C35362x(context).f150631a;
                    String string4 = sharedPreferences4.getString("key_publishable_key", null);
                    c35363y = string4 != null ? new C35363y(string4, sharedPreferences4.getString("key_account_id", null)) : null;
                    if (c35363y == null) {
                        throw new IllegalStateException("PaymentConfiguration was not initialized. Call PaymentConfiguration.init().");
                    }
                    C35363y.f150632y = c35363y;
                    c35363y5 = c35363y;
                }
                return c35363y5.f150633w;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                String str = C26611e0.f105848x;
                AbstractC22676k.m65747g(context);
                String absolutePath = AbstractC35750h.m113273b(context, "stream-device-token-storage.pb").getAbsolutePath();
                AbstractC22676k.m65749i(absolutePath, "getAbsolutePath(...)");
                return C21567b.m60606o(absolutePath, false);
            case 20:
                return AbstractC40275b.m129336d(context);
            case 21:
                return AbstractC40448r0.m130736f(context);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC40448r0.m130737g(context);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC40448r0.m130738h(context);
            case 24:
                return AbstractC40398m1.m130276q(context);
            case 25:
                return AbstractC40398m1.m130255A(context);
            case 26:
                return AbstractC40398m1.m130257C(context);
            case 27:
                return AbstractC40398m1.m130278s(context);
            case 28:
                return AbstractC40398m1.m130280u(context);
            default:
                return AbstractC40398m1.m130282w(context);
        }
    }

    public /* synthetic */ C0971f(Object obj, Context context, int i13) {
        this.f3583w = i13;
        this.f3584x = context;
    }
}
