package com.whoop.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.format.DateFormat;
import l83.InterfaceC23462h;
import org.joda.time.DateTimeZone;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import wr1.C37572f;
import x82.C38074a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/service/TimeZoneReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Ll83/a0;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Lx82/a;", "a", "Ll83/h;", "b", "()Lx82/a;", "koinHelper", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class TimeZoneReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC23462h koinHelper = AbstractC30060g.m92088H(new C37572f(27));

    /* JADX INFO: renamed from: b */
    private final C38074a m24481b() {
        return (C38074a) this.koinHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C38074a m24482c() {
        return new C38074a();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(intent, "intent");
        if (AbstractC22676k.m65745e(intent.getAction(), "android.intent.action.TIMEZONE_CHANGED")) {
            m24481b().m121978c(DateFormat.is24HourFormat(context));
            InterfaceC34116n.INSTANCE.m107848a("TimeZoneReceiver").mo85228t("Time zone change detected, updated user info to " + DateTimeZone.getDefault(), new AbstractC30556a.a[0]);
        }
    }
}
