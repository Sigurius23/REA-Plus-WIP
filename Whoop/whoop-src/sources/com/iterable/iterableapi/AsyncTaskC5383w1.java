package com.iterable.iterableapi;

import android.app.NotificationManager;
import android.content.Context;
import android.os.AsyncTask;

/* JADX INFO: renamed from: com.iterable.iterableapi.w1 */
/* JADX INFO: loaded from: classes6.dex */
public final class AsyncTaskC5383w1 extends AsyncTask {
    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        C5371s1 c5371s1;
        C5371s1[] c5371s1Arr = (C5371s1[]) objArr;
        if (c5371s1Arr == null || (c5371s1 = c5371s1Arr[0]) == null) {
            return null;
        }
        Context context = c5371s1.f21825a;
        if (c5371s1.f21826b) {
            return null;
        }
        ((NotificationManager) context.getSystemService("notification")).notify(c5371s1.f21829e, c5371s1.build());
        return null;
    }
}
