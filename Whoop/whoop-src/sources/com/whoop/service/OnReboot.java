package com.whoop.service;

import android.content.Context;
import android.content.Intent;
import c92.C4335g;
import e50.C12723b;
import ge3.AbstractC15751g;
import p214i8.AbstractC18209a;
import qr2.AbstractC30556a;

/* JADX INFO: loaded from: classes4.dex */
public class OnReboot extends AbstractC18209a {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        C12723b.m35566a().m35569d().mo85220k("Reboot", "Handling boot", new AbstractC30556a.a[0]);
        ((C4335g) AbstractC15751g.m44472y(C4335g.class, null, null)).m13716g0();
    }
}
