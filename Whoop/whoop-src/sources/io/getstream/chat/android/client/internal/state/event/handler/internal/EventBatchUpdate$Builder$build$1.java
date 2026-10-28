package io.getstream.chat.android.client.internal.state.event.handler.internal;

import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.event.handler.internal.EventBatchUpdate$Builder", m100430f = "EventBatchUpdate.kt", m100431l = {196, 198, 201, 202, 206, 208}, m100432m = "build")
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class EventBatchUpdate$Builder$build$1 extends AbstractC32269c {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EventBatchUpdate.Builder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventBatchUpdate$Builder$build$1(EventBatchUpdate.Builder builder, InterfaceC30057d<? super EventBatchUpdate$Builder$build$1> interfaceC30057d) {
        super(interfaceC30057d);
        this.this$0 = builder;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.build(null, null, null, this);
    }
}
