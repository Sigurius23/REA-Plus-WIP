package androidx.glance.appwidget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import bc3.AbstractC3050q0;
import ov2.C28402f;
import p279kd.C22379f;
import p558vp.AbstractC36259c;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import x43.AbstractC37978j;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Landroidx/glance/appwidget/MyPackageReplacedReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "glance-appwidget"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public class MyPackageReplacedReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f5858a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (context == null) {
            throw new IllegalStateException("onReceive context is null");
        }
        if (intent == null) {
            throw new IllegalStateException("onReceive intent is null");
        }
        if (AbstractC37978j.m121631O(context, new C28402f(27))) {
            return;
        }
        AbstractC36259c.m115680a0(this, AbstractC3050q0.f12077a, new C22379f(context, (InterfaceC30057d) null, 26));
    }
}
