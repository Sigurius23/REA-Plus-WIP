package com.whoop.data.repositories;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC32271e(m100429c = "com.whoop.data.repositories.SmartAlarmTriggerRepository$start$3$1", m100430f = "SmartAlarmTriggerRepository.kt", m100431l = {134, 138, 142}, m100432m = "invokeSuspend", m100433v = 2)
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
public final class SmartAlarmTriggerRepository$start$3$1 extends AbstractC32275i implements InterfaceC4351m {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SmartAlarmTriggerRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartAlarmTriggerRepository$start$3$1(SmartAlarmTriggerRepository smartAlarmTriggerRepository, InterfaceC30057d<? super SmartAlarmTriggerRepository$start$3$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = smartAlarmTriggerRepository;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new SmartAlarmTriggerRepository$start$3$1(this.this$0, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((SmartAlarmTriggerRepository$start$3$1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00aa, code lost:
    
        if (r13 == r0) goto L40;
     */
    @Override // s83.AbstractC32267a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r12.label
            r2 = 3
            r3 = 1
            r4 = 2
            r5 = 0
            if (r1 == 0) goto L33
            if (r1 == r3) goto L2f
            if (r1 == r4) goto L22
            if (r1 != r2) goto L1a
            java.lang.Object r0 = r12.L$0
            com.whoop.data.local.room.entity.SmartAlarmUserInfo r0 = (com.whoop.data.local.room.entity.SmartAlarmUserInfo) r0
            p505ts.AbstractC34132o.m107864I(r13)
            r9 = r12
            goto Lad
        L1a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L22:
            java.lang.Object r1 = r12.L$1
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r1 = r12.L$0
            com.whoop.data.local.room.entity.SmartAlarmUserInfo r1 = (com.whoop.data.local.room.entity.SmartAlarmUserInfo) r1
            p505ts.AbstractC34132o.m107864I(r13)
            goto L98
        L2f:
            p505ts.AbstractC34132o.m107864I(r13)
            goto L43
        L33:
            p505ts.AbstractC34132o.m107864I(r13)
            com.whoop.data.repositories.SmartAlarmTriggerRepository r13 = r12.this$0
            r12.label = r3
            java.lang.Object r13 = com.whoop.data.repositories.SmartAlarmTriggerRepository.access$getSmartAlarmUserInfo(r13, r12)
            if (r13 != r0) goto L43
        L40:
            r9 = r12
            goto Lac
        L43:
            com.whoop.data.local.room.entity.SmartAlarmUserInfo r13 = (com.whoop.data.local.room.entity.SmartAlarmUserInfo) r13
            if (r13 == 0) goto L98
            com.whoop.data.repositories.SmartAlarmTriggerRepository r1 = r12.this$0
            td1.b r1 = com.whoop.data.repositories.SmartAlarmTriggerRepository.access$getWhoopStrap$p(r1)
            com.whoop.domain.model.WhoopStrapInfo r1 = r1.mo106493f()
            if (r1 == 0) goto L64
            oh2.c r1 = r1.getHardwareVersion()
            if (r1 == 0) goto L64
            long r6 = r1.getHardwareFamily()
            int r1 = (int) r6
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r1)
            goto L65
        L64:
            r3 = r5
        L65:
            if (r3 != 0) goto L68
            goto L6f
        L68:
            int r1 = r3.intValue()
            r6 = 6
            if (r1 == r6) goto L7a
        L6f:
            if (r3 != 0) goto L72
            goto L8f
        L72:
            int r1 = r3.intValue()
            r6 = 13
            if (r1 != r6) goto L8f
        L7a:
            boolean r13 = r13.getSmartAlarmEnabled()
            if (r13 != 0) goto L8f
            com.whoop.data.repositories.SmartAlarmTriggerRepository r13 = r12.this$0
            r12.L$0 = r5
            r12.L$1 = r5
            r12.label = r4
            java.lang.Object r13 = com.whoop.data.repositories.SmartAlarmTriggerRepository.access$disableAlarmOnStrapWhenAlarmWasDisabled(r13, r12)
            if (r13 != r0) goto L98
            goto L40
        L8f:
            if (r3 != 0) goto L98
            com.whoop.data.repositories.SmartAlarmTriggerRepository r13 = r12.this$0
            java.lang.String r1 = "failed to get strap generation upon connection"
            com.whoop.data.repositories.SmartAlarmTriggerRepository.handledException$default(r13, r1, r5, r4, r5)
        L98:
            com.whoop.data.repositories.SmartAlarmTriggerRepository r6 = r12.this$0
            r12.L$0 = r5
            r12.L$1 = r5
            r12.label = r2
            java.lang.String r7 = "connection"
            r8 = 0
            r10 = 2
            r11 = 0
            r9 = r12
            java.lang.Object r13 = com.whoop.data.repositories.SmartAlarmTriggerRepository.resetLwt$default(r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto Lad
        Lac:
            return r0
        Lad:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            com.whoop.data.repositories.SmartAlarmTriggerRepository r0 = r9.this$0
            tr2.n r0 = com.whoop.data.repositories.SmartAlarmTriggerRepository.access$getLogger(r0)
            java.lang.String r1 = "reset lwt on strap connect: "
            java.lang.String r13 = p000.AbstractC11266d.m30462p(r1, r13)
            r1 = 0
            qr2.a$a[] r1 = new qr2.AbstractC30556a.a[r1]
            r0.mo85228t(r13, r1)
            l83.a0 r13 = l83.C23454a0.f92919a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.data.repositories.SmartAlarmTriggerRepository$start$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
