package com.whoop.referafriend.utils;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import h62.AbstractC16981a;
import h62.C16982b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.LinkedHashMap;
import java.util.Set;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import nf3.C26669a;
import of3.InterfaceC27903a;
import p479s4.AbstractC32126g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \f2\u00020\u00012\u00020\u0002:\u0001\rB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/referafriend/utils/SharingBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "Lof3/a;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Ll83/a0;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "a", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SharingBroadcastReceiver extends BroadcastReceiver implements InterfaceC27903a {

    /* JADX INFO: renamed from: x */
    public static final int f29366x = 8;

    @Override // of3.InterfaceC27903a
    public /* bridge */ C26669a getKoin() {
        return AbstractC34132o.m107856A(this);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        LinkedHashMap linkedHashMap;
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(intent, "intent");
        String stringExtra = intent.getStringExtra("source");
        if (stringExtra == null) {
            stringExtra = "";
        }
        String stringExtra2 = intent.getStringExtra("checkout_origin");
        Bundle bundleExtra = intent.getBundleExtra("analytics_properties");
        if (bundleExtra != null) {
            Set<String> setKeySet = bundleExtra.keySet();
            AbstractC22676k.m65749i(setKeySet, "keySet(...)");
            Set<String> set = setKeySet;
            int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(set, 10));
            if (iM73988W < 16) {
                iM73988W = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM73988W);
            for (Object obj : set) {
                String string = bundleExtra.getString((String) obj);
                if (string == null) {
                    string = "";
                }
                linkedHashMap2.put(obj, string);
            }
            linkedHashMap = linkedHashMap2;
        } else {
            linkedHashMap = null;
        }
        ComponentName componentName = (ComponentName) AbstractC32126g.m100043h(intent, "android.intent.extra.CHOSEN_COMPONENT", ComponentName.class);
        if (componentName != null) {
            C16982b c16982b = (C16982b) getKoin().f106046a.f159364d.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C16982b.class), null);
            String packageName = componentName.getPackageName();
            AbstractC22676k.m65749i(packageName, "getPackageName(...)");
            c16982b.m47809a(new AbstractC16981a.c(null, packageName, stringExtra2, linkedHashMap, null, 17, null), stringExtra);
        }
    }
}
