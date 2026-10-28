package io.getstream.chat.android.client.internal.state.event.handler.internal;

import c93.InterfaceC4351m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential$updateGlobalState$hasReadEventsCapability$1 */
/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential$updateGlobalState$hasReadEventsCapability$1", m100430f = "EventHandlerSequential.kt", m100431l = {378}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m65681d2 = {"<anonymous>", "", "cid", ""}, m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class C19273xf8e6e07a extends AbstractC32275i implements InterfaceC4351m {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EventHandlerSequential this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19273xf8e6e07a(EventHandlerSequential eventHandlerSequential, InterfaceC30057d<? super C19273xf8e6e07a> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = eventHandlerSequential;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        C19273xf8e6e07a c19273xf8e6e07a = new C19273xf8e6e07a(this.this$0, interfaceC30057d);
        c19273xf8e6e07a.L$0 = obj;
        return c19273xf8e6e07a;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        if (i13 != 0) {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        AbstractC34132o.m107864I(obj);
        EventHandlerSequential eventHandlerSequential = this.this$0;
        this.L$0 = null;
        this.label = 1;
        Object objCheckReadEventsCapability = eventHandlerSequential.checkReadEventsCapability(str, this);
        return objCheckReadEventsCapability == enumC31071a ? enumC31071a : objCheckReadEventsCapability;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(String str, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return ((C19273xf8e6e07a) create(str, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }
}
