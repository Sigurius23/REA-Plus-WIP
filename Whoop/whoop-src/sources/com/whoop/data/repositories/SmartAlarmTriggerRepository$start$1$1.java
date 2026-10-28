package com.whoop.data.repositories;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;
import qf2.AbstractC30325d;
import qf2.C30324c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes8.dex */
@InterfaceC32271e(m100429c = "com.whoop.data.repositories.SmartAlarmTriggerRepository$start$1$1", m100430f = "SmartAlarmTriggerRepository.kt", m100431l = {113}, m100432m = "invokeSuspend", m100433v = 2)
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
public final class SmartAlarmTriggerRepository$start$1$1 extends AbstractC32275i implements InterfaceC4351m {
    int label;
    final /* synthetic */ SmartAlarmTriggerRepository this$0;

    /* JADX INFO: renamed from: com.whoop.data.repositories.SmartAlarmTriggerRepository$start$1$1$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.SmartAlarmTriggerRepository$start$1$1$1", m100430f = "SmartAlarmTriggerRepository.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m65681d2 = {"Lqf2/d;", "<unused var>", "Lkotlin/Function1;", "Ll83/a0;", "Lcom/whoop/smart/alarm/data/repository/SetLwtTo;", "setLwtTo", "<anonymous>", "(Lqf2/d;Lkotlin/jvm/functions/Function1;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C66341 extends AbstractC32275i implements Function3 {
        /* synthetic */ Object L$0;
        int label;

        public C66341(InterfaceC30057d<? super C66341> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Function1 function1 = (Function1) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            function1.invoke(null);
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final Object invoke(AbstractC30325d abstractC30325d, Function1 function1, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C66341 c66341 = new C66341(interfaceC30057d);
            c66341.L$0 = function1;
            return c66341.invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartAlarmTriggerRepository$start$1$1(SmartAlarmTriggerRepository smartAlarmTriggerRepository, InterfaceC30057d<? super SmartAlarmTriggerRepository$start$1$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = smartAlarmTriggerRepository;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new SmartAlarmTriggerRepository$start$1$1(this.this$0, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((SmartAlarmTriggerRepository$start$1$1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            C30324c c30324c = this.this$0.lwtResetRepository;
            C66341 c66341 = new C66341(null);
            this.label = 1;
            if (c30324c.m92669g(c66341, this) == enumC31071a) {
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
