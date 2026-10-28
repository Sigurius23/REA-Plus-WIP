package com.amplitude.android.engagement.types;

import c93.InterfaceC4339a;
import j93.InterfaceC21461d;
import java.lang.annotation.Annotation;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22673i0;
import wc3.C37142g;
import wc3.InterfaceC37138c;

/* JADX INFO: renamed from: com.amplitude.android.engagement.types.a0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C4865a0 extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public static final C4865a0 f20282w = new C4865a0(0);

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37142g("com.amplitude.android.engagement.types.Goal", c22673i0.getOrCreateKotlinClass(Goal.class), new InterfaceC21461d[]{c22673i0.getOrCreateKotlinClass(CTAClickedGoal.class), c22673i0.getOrCreateKotlinClass(ElementClickedGoal.class), c22673i0.getOrCreateKotlinClass(EventTrackedGoal.class), c22673i0.getOrCreateKotlinClass(PageVisitedGoal.class)}, new InterfaceC37138c[]{CTAClickedGoal$$serializer.INSTANCE, ElementClickedGoal$$serializer.INSTANCE, EventTrackedGoal$$serializer.INSTANCE, PageVisitedGoal$$serializer.INSTANCE}, new Annotation[0]);
    }
}
