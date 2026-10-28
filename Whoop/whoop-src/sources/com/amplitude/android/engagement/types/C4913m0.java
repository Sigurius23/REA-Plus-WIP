package com.amplitude.android.engagement.types;

import c93.InterfaceC4339a;
import j93.InterfaceC21461d;
import java.lang.annotation.Annotation;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22673i0;
import wc3.C37142g;
import wc3.InterfaceC37138c;

/* JADX INFO: renamed from: com.amplitude.android.engagement.types.m0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C4913m0 extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public static final C4913m0 f20284w = new C4913m0(0);

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37142g("com.amplitude.android.engagement.types.Marker", c22673i0.getOrCreateKotlinClass(Marker.class), new InterfaceC21461d[]{c22673i0.getOrCreateKotlinClass(BeaconMarker.class), c22673i0.getOrCreateKotlinClass(IconMarker.class), c22673i0.getOrCreateKotlinClass(ImageMarker.class)}, new InterfaceC37138c[]{BeaconMarker$$serializer.INSTANCE, IconMarker$$serializer.INSTANCE, ImageMarker$$serializer.INSTANCE}, new Annotation[0]);
    }
}
