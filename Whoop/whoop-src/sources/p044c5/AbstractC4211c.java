package p044c5;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import bd3.C3143v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p002a0.C0005a0;
import p005a3.C0194e0;
import p513u4.AbstractC34514b;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: c5.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4211c {

    /* JADX INFO: renamed from: a */
    public static final C0005a0 f17078a = new C0005a0(2);

    /* JADX INFO: renamed from: b */
    public static final C0194e0 f17079b = new C0194e0(1);

    /* JADX INFO: renamed from: a */
    public static C3143v m13075a(Context context, List list) {
        Trace.beginSection(AbstractC29125c.m88517Z("FontProvider.getFontFamilyResult"));
        try {
            ArrayList arrayList = new ArrayList();
            for (int i13 = 0; i13 < list.size(); i13++) {
                C4212d c4212d = (C4212d) list.get(i13);
                ProviderInfo providerInfoM13076b = m13076b(context.getPackageManager(), c4212d, context.getResources());
                if (providerInfoM13076b == null) {
                    return new C3143v(1, (byte) 0);
                }
                arrayList.add(m13077c(context, c4212d, providerInfoM13076b.authority));
            }
            return new C3143v(arrayList, 1);
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: b */
    public static ProviderInfo m13076b(PackageManager packageManager, C4212d c4212d, Resources resources) {
        C0194e0 c0194e0 = f17079b;
        C0005a0 c0005a0 = f17078a;
        Trace.beginSection(AbstractC29125c.m88517Z("FontProvider.getProvider"));
        try {
            List listM109075m = c4212d.f17083d;
            String str = c4212d.f17080a;
            String str2 = c4212d.f17081b;
            if (listM109075m == null) {
                listM109075m = AbstractC34514b.m109075m(resources, 0);
            }
            C4210b c4210b = new C4210b();
            c4210b.f17075a = str;
            c4210b.f17076b = str2;
            c4210b.f17077c = listM109075m;
            ProviderInfo providerInfo = (ProviderInfo) c0005a0.m2c(c4210b);
            if (providerInfo != null) {
                Trace.endSection();
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, c0194e0);
            for (int i13 = 0; i13 < listM109075m.size(); i13++) {
                ArrayList arrayList2 = new ArrayList((Collection) listM109075m.get(i13));
                Collections.sort(arrayList2, c0194e0);
                if (arrayList.size() == arrayList2.size()) {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= arrayList.size()) {
                            c0005a0.m3d(c4210b, providerInfoResolveContentProvider);
                            Trace.endSection();
                            return providerInfoResolveContentProvider;
                        }
                        if (!Arrays.equals((byte[]) arrayList.get(i14), (byte[]) arrayList2.get(i14))) {
                            break;
                        }
                        i14++;
                    }
                }
            }
            Trace.endSection();
            return null;
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: c */
    public static C4217i[] m13077c(Context context, C4212d c4212d, String str) {
        Trace.beginSection(AbstractC29125c.m88517Z("FontProvider.query"));
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
            Cursor cursorQuery = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                Trace.beginSection(AbstractC29125c.m88517Z("ContentQueryWrapper.query"));
                try {
                    String[] strArr2 = {c4212d.f17082c};
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        try {
                            cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e5) {
                            Log.w("FontsProvider", "Unable to query the content provider", e5);
                        }
                    }
                    Trace.endSection();
                    if (cursorQuery != null && cursorQuery.getCount() > 0) {
                        int columnIndex = cursorQuery.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursorQuery.getColumnIndex("_id");
                        int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                        int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                        int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                        while (cursorQuery.moveToNext()) {
                            int i13 = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                            arrayList2.add(new C4217i(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, i13));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    C4217i[] c4217iArr = (C4217i[]) arrayList.toArray(new C4217i[0]);
                    Trace.endSection();
                    return c4217iArr;
                } catch (Throwable th3) {
                    Trace.endSection();
                    throw th3;
                }
            } catch (Throwable th4) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                }
                throw th4;
            }
        } catch (Throwable th5) {
            Trace.endSection();
            throw th5;
        }
    }
}
