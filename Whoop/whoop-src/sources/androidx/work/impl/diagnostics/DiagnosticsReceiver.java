package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import p218ic.C18347a0;
import p218ic.C18389w;
import p218ic.C18392z;
import p249jc.C21596v;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final String f7358a = C18389w.m52887f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        C18389w c18389wM52886d = C18389w.m52886d();
        String str = f7358a;
        c18389wM52886d.m52888a(str, "Requesting diagnostics");
        try {
            AbstractC22676k.m65750j(context, "context");
            C21596v.m60637g(context).m52874c((C18347a0) new C18392z(DiagnosticsWorker.class).m52878b());
        } catch (IllegalStateException e5) {
            C18389w.m52886d().m52890c(str, "WorkManager is not initialized", e5);
        }
    }
}
