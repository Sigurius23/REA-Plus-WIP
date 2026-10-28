package io.getstream.chat.android.client;

import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$2", m100430f = "ChatClient.kt", m100431l = {5229, 463}, m100432m = "onEvent")
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChatClient$2$onEvent$1 extends AbstractC32269c {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatClient.C188912<EventT> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatClient$2$onEvent$1(ChatClient.C188912<EventT> c188912, InterfaceC30057d<? super ChatClient$2$onEvent$1> interfaceC30057d) {
        super(interfaceC30057d);
        this.this$0 = c188912;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type q83.d to io.getstream.chat.android.client.ChatClient$2$onEvent$1 for r1v1 'this'  q83.d
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r2) {
        /*
            r1 = this;
            r1.result = r2
            int r2 = r1.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.label = r2
            io.getstream.chat.android.client.ChatClient$2<EventT> r2 = r1.this$0
            r0 = 0
            java.lang.Object r2 = r2.onEvent(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.ChatClient$2$onEvent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
