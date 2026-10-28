package io.getstream.chat.android.client.internal.offline.extensions;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import l83.C23454a0;
import mc3.InterfaceC25435a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a:\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0080@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lbc3/c0;", "Lmc3/a;", "mutex", "Lkotlin/Function1;", "Lq83/d;", "Ll83/a0;", "", "block", "Lbc3/k1;", "launchWithMutex", "(Lbc3/c0;Lmc3/a;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class CoroutineScopeExtensionsKt {

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.extensions.CoroutineScopeExtensionsKt$launchWithMutex$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.extensions.CoroutineScopeExtensionsKt$launchWithMutex$2", m100430f = "CoroutineScopeExtensions.kt", m100431l = {33, 25}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C191002 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ Function1 $block;
        final /* synthetic */ InterfaceC25435a $mutex;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C191002(InterfaceC25435a interfaceC25435a, Function1 function1, InterfaceC30057d<? super C191002> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$mutex = interfaceC25435a;
            this.$block = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C191002(this.$mutex, this.$block, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C191002) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC25435a interfaceC25435a;
            Function1 function1;
            int i13;
            InterfaceC25435a interfaceC25435a2;
            Throwable th3;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.label;
            try {
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    interfaceC25435a = this.$mutex;
                    Function1 function2 = this.$block;
                    this.L$0 = interfaceC25435a;
                    this.L$1 = function2;
                    this.I$0 = 0;
                    this.label = 1;
                    if (interfaceC25435a.mo68211b(this) != enumC31071a) {
                        function1 = function2;
                        i13 = 0;
                    }
                    return enumC31071a;
                }
                if (i14 != 1) {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC25435a2 = (InterfaceC25435a) this.L$0;
                    try {
                        AbstractC34132o.m107864I(obj);
                        interfaceC25435a2.mo68214i(null);
                        return C23454a0.f92919a;
                    } catch (Throwable th4) {
                        th3 = th4;
                        interfaceC25435a2.mo68214i(null);
                        throw th3;
                    }
                }
                i13 = this.I$0;
                function1 = (Function1) this.L$1;
                InterfaceC25435a interfaceC25435a3 = (InterfaceC25435a) this.L$0;
                AbstractC34132o.m107864I(obj);
                interfaceC25435a = interfaceC25435a3;
                this.L$0 = interfaceC25435a;
                this.L$1 = null;
                this.I$0 = i13;
                this.I$1 = 0;
                this.label = 2;
                if (function1.invoke(this) != enumC31071a) {
                    interfaceC25435a2 = interfaceC25435a;
                    interfaceC25435a2.mo68214i(null);
                    return C23454a0.f92919a;
                }
                return enumC31071a;
            } catch (Throwable th5) {
                interfaceC25435a2 = interfaceC25435a;
                th3 = th5;
                interfaceC25435a2.mo68214i(null);
                throw th3;
            }
        }
    }

    public static final Object launchWithMutex(InterfaceC2994c0 interfaceC2994c0, InterfaceC25435a interfaceC25435a, Function1 function1, InterfaceC30057d<? super InterfaceC3027k1> interfaceC30057d) {
        return AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C191002(interfaceC25435a, function1, null), 3);
    }
}
