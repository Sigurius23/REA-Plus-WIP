package sj2;

import bc3.InterfaceC3018i0;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: sj2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Je\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u001c\u0010\t\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\u001e\b\u0002\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, m65681d2 = {"Lsj2/b;", "R", "", "", "tag", "Lsj2/a;", "priority", "Lkotlin/Function1;", "Lq83/d;", "action", "Ll83/a0;", "onCancel", "Lbc3/i0;", "c", "(Ljava/lang/String;Lsj2/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lbc3/i0;", "", "a", "(Lsj2/a;)I", "essentials_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC32565b<R> {

    /* JADX INFO: renamed from: sj2.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.taskexecutor.PriorityInterruptibleExecutionService$submit$1", m100430f = "PriorityInterruptibleExecutionService.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f134910w;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return new a(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f134910w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ InterfaceC3018i0 m101601b(InterfaceC32565b interfaceC32565b, String str, InterfaceC32564a interfaceC32564a, Function1 function1, Function1 function2, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submit");
        }
        if ((i13 & 2) != 0) {
            interfaceC32564a = InterfaceC32564a.c.f134908a;
        }
        if ((i13 & 8) != 0) {
            function2 = new a(null);
        }
        return interfaceC32565b.mo101603c(str, interfaceC32564a, function1, function2);
    }

    /* JADX INFO: renamed from: a */
    int mo101602a(InterfaceC32564a priority);

    /* JADX INFO: renamed from: c */
    InterfaceC3018i0 mo101603c(String tag, InterfaceC32564a priority, Function1 action, Function1 onCancel);
}
