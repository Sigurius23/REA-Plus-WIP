package io.getstream.chat.android.p226ui.common.utils.extensions;

import c93.InterfaceC4351m;
import ec3.C13052j1;
import ec3.InterfaceC13058l;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22659b0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"T", "Lec3/l;", "Lkotlin/Function1;", "Ll83/a0;", "onFirst", "(Lec3/l;Lkotlin/jvm/functions/Function1;)Lec3/l;", "stream-chat-android-ui-common_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class FlowKt {

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.utils.extensions.FlowKt$onFirst$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.utils.extensions.FlowKt$onFirst$1", m100430f = "Flow.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, m65681d2 = {"T", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C196151 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ Function1 $onFirst;
        final /* synthetic */ C22659b0 $wasFirstEmission;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C196151(C22659b0 c22659b0, Function1 function1, InterfaceC30057d<? super C196151> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$wasFirstEmission = c22659b0;
            this.$onFirst = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C196151 c196151 = new C196151(this.$wasFirstEmission, this.$onFirst, interfaceC30057d);
            c196151.L$0 = obj;
            return c196151;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C22659b0 c22659b0 = this.$wasFirstEmission;
            boolean z4 = c22659b0.f89329w;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (z4) {
                return c23454a0;
            }
            c22659b0.f89329w = true;
            this.$onFirst.invoke(obj2);
            return c23454a0;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(T t14, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C196151) create(t14, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public static final <T> InterfaceC13058l onFirst(InterfaceC13058l interfaceC13058l, Function1 onFirst) {
        AbstractC22676k.m65750j(interfaceC13058l, "<this>");
        AbstractC22676k.m65750j(onFirst, "onFirst");
        return new C13052j1(interfaceC13058l, new C196151(new C22659b0(), onFirst, null), 0);
    }
}
