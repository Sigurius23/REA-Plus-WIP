package io.getstream.chat.android.client.helpers;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.C23454a0;
import n23.AbstractC26205h;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.client.helpers.CallPostponeHelper$postponeCall$1", m100430f = "CallPostponeHelper.kt", m100431l = {54, 58}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"", "T", "Lbc3/c0;", "Ln23/h;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class CallPostponeHelper$postponeCall$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ InterfaceC4339a $call;
    int label;
    final /* synthetic */ CallPostponeHelper this$0;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.helpers.CallPostponeHelper$postponeCall$1$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.helpers.CallPostponeHelper$postponeCall$1$2", m100430f = "CallPostponeHelper.kt", m100431l = {55}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C190912 extends AbstractC32275i implements InterfaceC4351m {
        int label;
        final /* synthetic */ CallPostponeHelper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190912(CallPostponeHelper callPostponeHelper, InterfaceC30057d<? super C190912> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.this$0 = callPostponeHelper;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C190912(this.this$0, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C190912) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                Function1 function1 = this.this$0.awaitConnection;
                this.label = 1;
                if (function1.invoke(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallPostponeHelper$postponeCall$1(CallPostponeHelper callPostponeHelper, InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super CallPostponeHelper$postponeCall$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = callPostponeHelper;
        this.$call = interfaceC4339a;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new CallPostponeHelper$postponeCall$1(this.this$0, this.$call, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return ((CallPostponeHelper$postponeCall$1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
    
        if (r8 == r0) goto L26;
     */
    @Override // s83.AbstractC32267a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r7.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L13
            p505ts.AbstractC34132o.m107864I(r8)     // Catch: java.lang.Throwable -> L11
            goto L7b
        L11:
            r8 = move-exception
            goto L7e
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            p505ts.AbstractC34132o.m107864I(r8)     // Catch: java.lang.Throwable -> L11
            goto L51
        L1f:
            p505ts.AbstractC34132o.m107864I(r8)
            io.getstream.chat.android.client.helpers.CallPostponeHelper r8 = r7.this$0     // Catch: java.lang.Throwable -> L11
            b23.k r8 = io.getstream.chat.android.client.helpers.CallPostponeHelper.access$getLogger(r8)     // Catch: java.lang.Throwable -> L11
            b23.e r1 = r8.f9275c     // Catch: java.lang.Throwable -> L11
            java.lang.String r5 = r8.f9273a     // Catch: java.lang.Throwable -> L11
            b23.g r6 = b23.EnumC2341g.DEBUG     // Catch: java.lang.Throwable -> L11
            boolean r1 = r1.isLoggable(r6, r5)     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L3b
            b23.j r8 = r8.f9274b     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = "[postponeCall] no args"
            r8.log(r6, r5, r1, r2)     // Catch: java.lang.Throwable -> L11
        L3b:
            io.getstream.chat.android.client.helpers.CallPostponeHelper r8 = r7.this$0     // Catch: java.lang.Throwable -> L11
            long r5 = io.getstream.chat.android.client.helpers.CallPostponeHelper.access$getTimeoutInMillis$p(r8)     // Catch: java.lang.Throwable -> L11
            io.getstream.chat.android.client.helpers.CallPostponeHelper$postponeCall$1$2 r8 = new io.getstream.chat.android.client.helpers.CallPostponeHelper$postponeCall$1$2     // Catch: java.lang.Throwable -> L11
            io.getstream.chat.android.client.helpers.CallPostponeHelper r1 = r7.this$0     // Catch: java.lang.Throwable -> L11
            r8.<init>(r1, r2)     // Catch: java.lang.Throwable -> L11
            r7.label = r4     // Catch: java.lang.Throwable -> L11
            java.lang.Object r8 = bc3.AbstractC3028k2.m8748b(r5, r8, r7)     // Catch: java.lang.Throwable -> L11
            if (r8 != r0) goto L51
            goto L7a
        L51:
            io.getstream.chat.android.client.helpers.CallPostponeHelper r8 = r7.this$0     // Catch: java.lang.Throwable -> L11
            b23.k r8 = io.getstream.chat.android.client.helpers.CallPostponeHelper.access$getLogger(r8)     // Catch: java.lang.Throwable -> L11
            b23.e r1 = r8.f9275c     // Catch: java.lang.Throwable -> L11
            java.lang.String r4 = r8.f9273a     // Catch: java.lang.Throwable -> L11
            b23.g r5 = b23.EnumC2341g.VERBOSE     // Catch: java.lang.Throwable -> L11
            boolean r1 = r1.isLoggable(r5, r4)     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L6a
            b23.j r8 = r8.f9274b     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = "[postponeCall] wait completed"
            r8.log(r5, r4, r1, r2)     // Catch: java.lang.Throwable -> L11
        L6a:
            c93.a r8 = r7.$call     // Catch: java.lang.Throwable -> L11
            java.lang.Object r8 = r8.invoke()     // Catch: java.lang.Throwable -> L11
            o23.d r8 = (o23.InterfaceC27474d) r8     // Catch: java.lang.Throwable -> L11
            r7.label = r3     // Catch: java.lang.Throwable -> L11
            java.lang.Object r8 = r8.await(r7)     // Catch: java.lang.Throwable -> L11
            if (r8 != r0) goto L7b
        L7a:
            return r0
        L7b:
            n23.h r8 = (n23.AbstractC26205h) r8     // Catch: java.lang.Throwable -> L11
            return r8
        L7e:
            io.getstream.chat.android.client.helpers.CallPostponeHelper r0 = r7.this$0
            b23.k r0 = io.getstream.chat.android.client.helpers.CallPostponeHelper.access$getLogger(r0)
            b23.e r1 = r0.f9275c
            java.lang.String r3 = r0.f9273a
            b23.g r4 = b23.EnumC2341g.ERROR
            boolean r1 = r1.isLoggable(r4, r3)
            if (r1 == 0) goto L9b
            b23.j r0 = r0.f9274b
            java.lang.String r1 = "[postponeCall] failed: "
            java.lang.String r8 = p031b9.AbstractC2875y.m8301n(r1, r8)
            r0.log(r4, r3, r8, r2)
        L9b:
            n23.f r8 = new n23.f
            n23.a r0 = new n23.a
            java.lang.String r1 = "Failed to perform call. Waiting for WS connection was too long."
            r0.<init>(r1)
            r8.<init>(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.helpers.CallPostponeHelper$postponeCall$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
