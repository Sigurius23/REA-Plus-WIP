package com.whoop.profile.view.memberlevels;

import android.content.ComponentCallbacks;
import c93.InterfaceC4339a;
import or2.C28216y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
public final class MemberLevelsFragment$special$$inlined$inject$default$1 extends AbstractC22680m implements InterfaceC4339a {
    final /* synthetic */ InterfaceC4339a $parameters;
    final /* synthetic */ InterfaceC35951a $qualifier;
    final /* synthetic */ ComponentCallbacks $this_inject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemberLevelsFragment$special$$inlined$inject$default$1(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
        super(0);
        this.$this_inject = componentCallbacks;
        this.$qualifier = interfaceC35951a;
        this.$parameters = interfaceC4339a;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.y] */
    @Override // c93.InterfaceC4339a
    public final C28216y invoke() {
        ComponentCallbacks componentCallbacks = this.$this_inject;
        InterfaceC35951a interfaceC35951a = this.$qualifier;
        return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.$parameters, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28216y.class), interfaceC35951a);
    }
}
