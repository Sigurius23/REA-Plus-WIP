package com.mapbox.common.location;

import ax.InterfaceC2118c;
import com.mapbox.common.module.cronet.LazyEngine;
import com.mapbox.common.movement.GoogleActivityRecognition;
import io.getstream.chat.android.p226ui.common.feature.messages.composer.MessageComposerController;
import io.getstream.chat.android.p226ui.utils.PermissionChecker;
import io.sentry.InterfaceC20259b1;
import io.sentry.InterfaceC20320e4;
import java.util.ArrayList;
import n23.AbstractC26205h;
import o23.InterfaceC27471a;
import p073cq.InterfaceC11036e;
import p073cq.InterfaceC11037f;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import rr2.C31776m;

/* JADX INFO: renamed from: com.mapbox.common.location.a */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C5432a implements InterfaceC11037f, InterfaceC27471a, InterfaceC2118c, InterfaceC20320e4, InterfaceC11036e {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f21917w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f21918x;

    public /* synthetic */ C5432a(Function1 function1, int i13) {
        this.f21917w = i13;
        this.f21918x = function1;
    }

    @Override // ax.InterfaceC2118c
    /* JADX INFO: renamed from: a */
    public void mo6684a(boolean z4, ArrayList arrayList, ArrayList arrayList2) {
        PermissionChecker.checkStoragePermissions$lambda$4(this.f21918x, z4, arrayList, arrayList2);
    }

    @Override // io.sentry.InterfaceC20320e4
    /* JADX INFO: renamed from: h */
    public void mo11182h(InterfaceC20259b1 interfaceC20259b1) {
        C31776m.m98666m(this.f21918x, interfaceC20259b1);
    }

    @Override // p073cq.InterfaceC11036e
    /* JADX INFO: renamed from: n */
    public void mo1681n(Exception e5) {
        AbstractC22676k.m65750j(e5, "e");
        this.f21918x.invoke(e5);
    }

    @Override // o23.InterfaceC27471a
    public void onResult(AbstractC26205h abstractC26205h) {
        MessageComposerController.createPoll$lambda$38(this.f21918x, abstractC26205h);
    }

    @Override // p073cq.InterfaceC11037f
    public void onSuccess(Object obj) {
        switch (this.f21917w) {
            case 0:
                GoogleDeviceLocationProvider.removeLocationUpdates$lambda$9(this.f21918x, obj);
                break;
            case 1:
                GoogleDeviceLocationProvider.doStop$lambda$2(this.f21918x, obj);
                break;
            case 2:
                GoogleDeviceLocationProvider.doStart$lambda$0(this.f21918x, obj);
                break;
            case 3:
                GoogleDeviceLocationProvider.requestLocationUpdates$lambda$7(this.f21918x, obj);
                break;
            case 4:
                LazyEngine.tryInstallFromGooglePlay$lambda$1(this.f21918x, obj);
                break;
            default:
                GoogleActivityRecognition.Companion.withLogs$lambda$6(this.f21918x, obj);
                break;
        }
    }
}
