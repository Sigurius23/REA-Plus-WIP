package io.sentry.android.core;

import ad3.C0783z;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: renamed from: io.sentry.android.core.o0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20133o0 extends ContentProvider {

    /* JADX INFO: renamed from: w */
    public final C0783z f75627w = new C0783z(17);

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        this.f75627w.m1864h(this);
        return 0;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        this.f75627w.m1864h(this);
        return null;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        this.f75627w.m1864h(this);
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        this.f75627w.m1864h(this);
        return 0;
    }
}
