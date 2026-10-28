package com.whoop.data.repositories;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes8.dex */
@InterfaceC32271e(m100429c = "com.whoop.data.repositories.SmartAlarmTriggerRepository$start$1$2", m100430f = "SmartAlarmTriggerRepository.kt", m100431l = {121, 122}, m100432m = "invokeSuspend", m100433v = 2)
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
public final class SmartAlarmTriggerRepository$start$1$2 extends AbstractC32275i implements InterfaceC4351m {
    int label;
    final /* synthetic */ SmartAlarmTriggerRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartAlarmTriggerRepository$start$1$2(SmartAlarmTriggerRepository smartAlarmTriggerRepository, InterfaceC30057d<? super SmartAlarmTriggerRepository$start$1$2> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = smartAlarmTriggerRepository;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new SmartAlarmTriggerRepository$start$1$2(this.this$0, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((SmartAlarmTriggerRepository$start$1$2) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r10 == r0) goto L15;
     */
    @Override // s83.AbstractC32267a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r9.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            p505ts.AbstractC34132o.m107864I(r10)
            r6 = r9
            goto L3d
        L11:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L19:
            p505ts.AbstractC34132o.m107864I(r10)
            goto L2c
        L1d:
            p505ts.AbstractC34132o.m107864I(r10)
            com.whoop.data.repositories.SmartAlarmTriggerRepository r10 = r9.this$0
            r9.label = r3
            java.lang.Object r10 = com.whoop.data.repositories.SmartAlarmTriggerRepository.access$fetchAndCacheSmartAlarmUserInfo(r10, r9)
            if (r10 != r0) goto L2c
            r6 = r9
            goto L3c
        L2c:
            com.whoop.data.repositories.SmartAlarmTriggerRepository r3 = r9.this$0
            r9.label = r2
            java.lang.String r4 = "login"
            r5 = 0
            r7 = 2
            r8 = 0
            r6 = r9
            java.lang.Object r10 = com.whoop.data.repositories.SmartAlarmTriggerRepository.resetLwt$default(r3, r4, r5, r6, r7, r8)
            if (r10 != r0) goto L3d
        L3c:
            return r0
        L3d:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            com.whoop.data.repositories.SmartAlarmTriggerRepository r0 = r6.this$0
            tr2.n r0 = com.whoop.data.repositories.SmartAlarmTriggerRepository.access$getLogger(r0)
            java.lang.String r1 = "reset lwt on user login: "
            java.lang.String r10 = p000.AbstractC11266d.m30462p(r1, r10)
            r1 = 0
            qr2.a$a[] r1 = new qr2.AbstractC30556a.a[r1]
            r0.mo85228t(r10, r1)
            l83.a0 r10 = l83.C23454a0.f92919a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.data.repositories.SmartAlarmTriggerRepository$start$1$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
