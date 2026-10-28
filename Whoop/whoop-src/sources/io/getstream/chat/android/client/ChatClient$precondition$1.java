package io.getstream.chat.android.client;

import c93.InterfaceC4351m;
import java.util.List;
import l83.C23454a0;
import n23.AbstractC26205h;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient$precondition$1", m100430f = "ChatClient.kt", m100431l = {4606}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Ln23/h;", "Ll83/a0;", "<anonymous>", "()Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class ChatClient$precondition$1 extends AbstractC32275i implements Function1 {
    final /* synthetic */ List<R> $pluginsList;
    final /* synthetic */ InterfaceC4351m $preconditionCheck;
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
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatClient$precondition$1(List<? extends R> list, InterfaceC4351m interfaceC4351m, InterfaceC30057d<? super ChatClient$precondition$1> interfaceC30057d) {
        super(1, interfaceC30057d);
        this.$pluginsList = list;
        this.$preconditionCheck = interfaceC4351m;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
        return new ChatClient$precondition$1(this.$pluginsList, this.$preconditionCheck, interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0056  */
    /* JADX WARN: Code duplicated, block: B:13:0x0078 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0079  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0079 -> B:15:0x007a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r10.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            int r1 = r10.I$1
            int r4 = r10.I$0
            java.lang.Object r5 = r10.L$7
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.Object r6 = r10.L$4
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r7 = r10.L$3
            java.util.Collection r7 = (java.util.Collection) r7
            java.lang.Object r8 = r10.L$2
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.lang.Object r8 = r10.L$1
            c93.m r8 = (c93.InterfaceC4351m) r8
            java.lang.Object r9 = r10.L$0
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            p505ts.AbstractC34132o.m107864I(r11)
            goto L7a
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L32:
            p505ts.AbstractC34132o.m107864I(r11)
            java.util.List<R> r11 = r10.$pluginsList
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            c93.m r1 = r10.$preconditionCheck
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = m83.AbstractC25267u.m74163i0(r11, r5)
            r4.<init>(r5)
            java.util.Iterator r11 = r11.iterator()
            r6 = r11
            r8 = r1
            r1 = r3
            r5 = r4
            r4 = r1
        L4f:
            boolean r11 = r6.hasNext()
            r7 = 0
            if (r11 == 0) goto L81
            java.lang.Object r11 = r6.next()
            r10.L$0 = r7
            r10.L$1 = r8
            r10.L$2 = r7
            r10.L$3 = r5
            r10.L$4 = r6
            r10.L$5 = r7
            r10.L$6 = r7
            r10.L$7 = r5
            r10.I$0 = r4
            r10.I$1 = r1
            r10.I$2 = r3
            r10.label = r2
            java.lang.Object r11 = r8.invoke(r11, r10)
            if (r11 != r0) goto L79
            return r0
        L79:
            r7 = r5
        L7a:
            n23.h r11 = (n23.AbstractC26205h) r11
            r5.add(r11)
            r5 = r7
            goto L4f
        L81:
            java.util.List r5 = (java.util.List) r5
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r11 = r5.iterator()
        L89:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L9b
            java.lang.Object r0 = r11.next()
            r1 = r0
            n23.h r1 = (n23.AbstractC26205h) r1
            boolean r1 = r1 instanceof n23.C26203f
            if (r1 == 0) goto L89
            r7 = r0
        L9b:
            n23.h r7 = (n23.AbstractC26205h) r7
            if (r7 != 0) goto La7
            n23.g r11 = new n23.g
            l83.a0 r0 = l83.C23454a0.f92919a
            r11.<init>(r0)
            return r11
        La7:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.ChatClient$precondition$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return ((ChatClient$precondition$1) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }
}
