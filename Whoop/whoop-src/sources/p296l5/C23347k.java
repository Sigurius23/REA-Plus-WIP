package p296l5;

import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import android.util.Base64;
import android.util.Log;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.core.widget.RemoteViewsCompatService;
import com.whoop.android.R;
import e73.C12803b;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l5.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C23347k implements RemoteViewsService.RemoteViewsFactory {

    /* JADX INFO: renamed from: e */
    public static final C12803b f92559e = new C12803b(new long[0], new RemoteViews[0]);

    /* JADX INFO: renamed from: a */
    public final RemoteViewsCompatService f92560a;

    /* JADX INFO: renamed from: b */
    public final int f92561b;

    /* JADX INFO: renamed from: c */
    public final int f92562c;

    /* JADX INFO: renamed from: d */
    public C12803b f92563d = f92559e;

    public C23347k(RemoteViewsCompatService remoteViewsCompatService, int i13, int i14) {
        this.f92560a = remoteViewsCompatService;
        this.f92561b = i13;
        this.f92562c = i14;
    }

    /* JADX INFO: renamed from: a */
    public final void m67595a() {
        Long lValueOf;
        RemoteViewsCompatService remoteViewsCompatService = this.f92560a;
        SharedPreferences sharedPreferences = remoteViewsCompatService.getSharedPreferences("androidx.core.widget.prefs.RemoteViewsCompat", 0);
        AbstractC22676k.m65749i(sharedPreferences, "context.getSharedPrefere…S_FILENAME, MODE_PRIVATE)");
        StringBuilder sb4 = new StringBuilder();
        int i13 = this.f92561b;
        sb4.append(i13);
        sb4.append(':');
        sb4.append(this.f92562c);
        C12803b c12803b = null;
        String string = sharedPreferences.getString(sb4.toString(), null);
        if (string == null) {
            AbstractC2875y.m8313z(i13, "No collection items were stored for widget ", "RemoteViewsCompatServic");
        } else {
            byte[] bArrDecode = Base64.decode(string, 0);
            AbstractC22676k.m65749i(bArrDecode, "decode(hexString, Base64.DEFAULT)");
            Parcel parcelObtain = Parcel.obtain();
            AbstractC22676k.m65749i(parcelObtain, "obtain()");
            try {
                parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
                parcelObtain.setDataPosition(0);
                C23346j c23346j = new C23346j(parcelObtain);
                parcelObtain.recycle();
                if (AbstractC22676k.m65745e(Build.VERSION.INCREMENTAL, c23346j.f92557b)) {
                    try {
                        lValueOf = Long.valueOf(remoteViewsCompatService.getPackageManager().getPackageInfo(remoteViewsCompatService.getPackageName(), 0).getLongVersionCode());
                    } catch (PackageManager.NameNotFoundException e5) {
                        Log.e("RemoteViewsCompatServic", "Couldn't retrieve version code for " + remoteViewsCompatService.getPackageManager(), e5);
                        lValueOf = null;
                    }
                    if (lValueOf == null) {
                        AbstractC2875y.m8313z(i13, "Couldn't get version code, not using stored collection items for widget ", "RemoteViewsCompatServic");
                    } else {
                        if (lValueOf.longValue() != c23346j.f92558c) {
                            AbstractC2875y.m8313z(i13, "App version code has changed, not using stored collection items for widget ", "RemoteViewsCompatServic");
                        } else {
                            try {
                                byte[] bytes = c23346j.f92556a;
                                AbstractC22676k.m65750j(bytes, "bytes");
                                Parcel parcelObtain2 = Parcel.obtain();
                                AbstractC22676k.m65749i(parcelObtain2, "obtain()");
                                try {
                                    parcelObtain2.unmarshall(bytes, 0, bytes.length);
                                    parcelObtain2.setDataPosition(0);
                                    C12803b c12803b2 = new C12803b(parcelObtain2);
                                    parcelObtain2.recycle();
                                    c12803b = c12803b2;
                                } catch (Throwable th3) {
                                    parcelObtain2.recycle();
                                    throw th3;
                                }
                            } catch (Throwable th4) {
                                Log.e("RemoteViewsCompatServic", "Unable to deserialize stored collection items for widget " + i13, th4);
                            }
                        }
                    }
                } else {
                    AbstractC2875y.m8313z(i13, "Android version code has changed, not using stored collection items for widget ", "RemoteViewsCompatServic");
                }
            } catch (Throwable th5) {
                parcelObtain.recycle();
                throw th5;
            }
        }
        if (c12803b == null) {
            c12803b = f92559e;
        }
        this.f92563d = c12803b;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        return ((long[]) this.f92563d.f43827e).length;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i13) {
        try {
            return ((long[]) this.f92563d.f43827e)[i13];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return -1L;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final /* bridge */ /* synthetic */ RemoteViews getLoadingView() {
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i13) {
        try {
            return ((RemoteViews[]) this.f92563d.f43825c)[i13];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return new RemoteViews(this.f92560a.getPackageName(), R.layout.invalid_list_item);
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return this.f92563d.f43826d;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        return this.f92563d.f43824b;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
        m67595a();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        m67595a();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
    }
}
