package io.getstream.chat.android.client.scope.user;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.InterfaceC13075p1;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.client.scope.user.UserIdentifier$awaitFor$2$1", m100430f = "UserIdentifier.kt", m100431l = {58}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Ljava/lang/String;"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class UserIdentifier$awaitFor$2$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ UserIdentifier $this_runCatching;
    final /* synthetic */ String $userId;
    int label;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.scope.user.UserIdentifier$awaitFor$2$1$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.scope.user.UserIdentifier$awaitFor$2$1$1", m100430f = "UserIdentifier.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004H\n"}, m65681d2 = {"<anonymous>", "", "it", "", "Lio/getstream/chat/android/models/UserId;"}, m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C194281 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $userId;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C194281(String str, InterfaceC30057d<? super C194281> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$userId = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C194281 c194281 = new C194281(this.$userId, interfaceC30057d);
            c194281.L$0 = obj;
            return c194281;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return Boolean.valueOf(AbstractC22676k.m65745e(str, this.$userId));
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(String str, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((C194281) create(str, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserIdentifier$awaitFor$2$1(UserIdentifier userIdentifier, String str, InterfaceC30057d<? super UserIdentifier$awaitFor$2$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.$this_runCatching = userIdentifier;
        this.$userId = str;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new UserIdentifier$awaitFor$2$1(this.$this_runCatching, this.$userId, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super String> interfaceC30057d) {
        return ((UserIdentifier$awaitFor$2$1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
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
        InterfaceC13075p1 interfaceC13075p1 = this.$this_runCatching._value;
        C194281 c194281 = new C194281(this.$userId, null);
        this.label = 1;
        Object objM36616z = AbstractC13091v.m36616z(interfaceC13075p1, c194281, this);
        return objM36616z == enumC31071a ? enumC31071a : objM36616z;
    }
}
