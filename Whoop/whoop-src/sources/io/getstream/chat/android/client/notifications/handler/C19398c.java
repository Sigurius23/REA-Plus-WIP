package io.getstream.chat.android.client.notifications.handler;

import android.content.Context;
import c93.InterfaceC4339a;
import or2.C28205u0;

/* JADX INFO: renamed from: io.getstream.chat.android.client.notifications.handler.c */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19398c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73942w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Context f73943x;

    public /* synthetic */ C19398c(Context context, int i13) {
        this.f73942w = i13;
        this.f73943x = context;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f73942w) {
            case 0:
                return NotificationHandlerFactory.getDefaultNotificationChannel$lambda$7(this.f73943x);
            default:
                return Boolean.valueOf(C28205u0.m85374c(this.f73943x));
        }
    }
}
