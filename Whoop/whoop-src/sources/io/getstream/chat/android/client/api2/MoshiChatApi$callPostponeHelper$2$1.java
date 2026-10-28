package io.getstream.chat.android.client.api2;

import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.InterfaceC13075p1;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.client.api2.MoshiChatApi$callPostponeHelper$2$1", m100430f = "MoshiChatApi.kt", m100431l = {203}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class MoshiChatApi$callPostponeHelper$2$1 extends AbstractC32275i implements Function1 {
    int label;
    final /* synthetic */ MoshiChatApi this$0;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.api2.MoshiChatApi$callPostponeHelper$2$1$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.api2.MoshiChatApi$callPostponeHelper$2$1$1", m100430f = "MoshiChatApi.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m65681d2 = {"<anonymous>", "", "id", ""}, m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C190341 extends AbstractC32275i implements InterfaceC4351m {
        /* synthetic */ Object L$0;
        int label;

        public C190341(InterfaceC30057d<? super C190341> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C190341 c190341 = new C190341(2, interfaceC30057d);
            c190341.L$0 = obj;
            return c190341;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return Boolean.valueOf(str.length() > 0);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(String str, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((C190341) create(str, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoshiChatApi$callPostponeHelper$2$1(MoshiChatApi moshiChatApi, InterfaceC30057d<? super MoshiChatApi$callPostponeHelper$2$1> interfaceC30057d) {
        super(1, interfaceC30057d);
        this.this$0 = moshiChatApi;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
        return new MoshiChatApi$callPostponeHelper$2$1(this.this$0, interfaceC30057d);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC13075p1 interfaceC13075p1 = this.this$0._connectionId;
            C190341 c190341 = new C190341(2, null);
            this.label = 1;
            if (AbstractC13091v.m36616z(interfaceC13075p1, c190341, this) == enumC31071a) {
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

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((MoshiChatApi$callPostponeHelper$2$1) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }
}
