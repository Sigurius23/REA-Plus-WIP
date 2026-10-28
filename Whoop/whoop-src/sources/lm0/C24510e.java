package lm0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lm0.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Llm0/e;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/BroadcastReceiver;", "receiver", "Landroid/content/IntentFilter;", "filter", "", "flags", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24510e {
    /* JADX INFO: renamed from: a */
    public final Intent m71374a(Context context, BroadcastReceiver receiver, IntentFilter filter, int flags) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(receiver, "receiver");
        AbstractC22676k.m65750j(filter, "filter");
        return AbstractC32122c.registerReceiver(context, receiver, filter, flags);
    }
}
