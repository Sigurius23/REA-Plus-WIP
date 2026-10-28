package p034bl;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import p014aj.C0928c;

/* JADX INFO: renamed from: bl.g */
/* JADX INFO: loaded from: classes.dex */
public final class C3367g {

    /* JADX INFO: renamed from: a */
    public final int f13114a;

    /* JADX INFO: renamed from: b */
    public final int f13115b;

    /* JADX INFO: renamed from: c */
    public final int f13116c;

    public C3367g(C3366f c3366f) {
        Context context = (Context) c3366f.f13111x;
        float f13 = c3366f.f13110w;
        ActivityManager activityManager = (ActivityManager) c3366f.f13112y;
        int i13 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        this.f13116c = i13;
        int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = (DisplayMetrics) ((C0928c) c3366f.f13113z).f3421x;
        float f14 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        int iRound2 = Math.round(f14 * f13);
        int iRound3 = Math.round(f14 * 2.0f);
        int i14 = iRound - i13;
        int i15 = iRound3 + iRound2;
        if (i15 <= i14) {
            this.f13115b = iRound3;
            this.f13114a = iRound2;
        } else {
            float f15 = i14 / (f13 + 2.0f);
            this.f13115b = Math.round(2.0f * f15);
            this.f13114a = Math.round(f15 * f13);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb4 = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            sb4.append(Formatter.formatFileSize(context, this.f13115b));
            sb4.append(", pool size: ");
            sb4.append(Formatter.formatFileSize(context, this.f13114a));
            sb4.append(", byte array size: ");
            sb4.append(Formatter.formatFileSize(context, i13));
            sb4.append(", memory class limited? ");
            sb4.append(i15 > iRound);
            sb4.append(", max size: ");
            sb4.append(Formatter.formatFileSize(context, iRound));
            sb4.append(", memoryClass: ");
            sb4.append(activityManager.getMemoryClass());
            sb4.append(", isLowMemoryDevice: ");
            sb4.append(activityManager.isLowRamDevice());
            Log.d("MemorySizeCalculator", sb4.toString());
        }
    }
}
