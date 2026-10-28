package p518ub;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;
import p549vb.C35858c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ub.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC34729b {

    /* JADX INFO: renamed from: a */
    public final int f146270a;

    public AbstractC34729b(int i13) {
        this.f146270a = i13;
    }

    /* JADX INFO: renamed from: a */
    public static void m109674a(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i13 = 0;
        boolean z4 = false;
        while (i13 <= length) {
            boolean z13 = AbstractC22676k.m65751k(str.charAt(!z4 ? i13 : length), 32) <= 0;
            if (z4) {
                if (!z13) {
                    break;
                } else {
                    length--;
                }
            } else if (z13) {
                i13++;
            } else {
                z4 = true;
            }
        }
        if (str.subSequence(i13, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e5) {
            Log.w("SupportSQLite", "delete failed: ", e5);
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo5427b(C35858c c35858c) {
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo5428c(C35858c c35858c);

    /* JADX INFO: renamed from: d */
    public abstract void mo5429d(C35858c c35858c, int i13, int i14);

    /* JADX INFO: renamed from: e */
    public abstract void mo5430e(C35858c c35858c);

    /* JADX INFO: renamed from: f */
    public abstract void mo5431f(C35858c c35858c, int i13, int i14);
}
