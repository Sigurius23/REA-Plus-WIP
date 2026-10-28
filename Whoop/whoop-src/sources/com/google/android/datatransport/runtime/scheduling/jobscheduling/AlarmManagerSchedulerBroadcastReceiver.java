package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import a33.C0352d;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.iterable.iterableapi.RunnableC5343k1;
import gm.C15981i;
import gm.C15989q;
import java.util.concurrent.Executor;
import p127ev.C13668i;
import p254jj.RunnableC21737c;
import p430qm.AbstractC30477a;

/* JADX INFO: loaded from: classes6.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f20363a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i13 = intent.getExtras().getInt("attemptNumber");
        C15989q.m45133b(context);
        C0352d c0352dM45125a = C15981i.m45125a();
        c0352dM45125a.m928Q(queryParameter);
        c0352dM45125a.f1239z = AbstractC30477a.m93286b(iIntValue);
        if (queryParameter2 != null) {
            c0352dM45125a.f1238y = Base64.decode(queryParameter2, 0);
        }
        C13668i c13668i = C15989q.m45132a().f60509d;
        ((Executor) c13668i.f48458e).execute(new RunnableC21737c(c13668i, c0352dM45125a.m932d(), i13, new RunnableC5343k1(2), 1));
    }
}
