package io.getstream.chat.android.p226ui.common.feature.threads;

import a63.C0493j;
import ec3.AbstractC13091v;
import ec3.C13068n1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fc3.AbstractC14371b;
import io.getstream.chat.android.client.api.state.QueryThreadsState;
import l83.C23454a0;
import l83.InterfaceC23459e;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.threads.ThreadListController$3$invokeSuspend$$inlined$flatMapLatest$1", m100430f = "ThreadListController.kt", m100431l = {189}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class ThreadListController$3$invokeSuspend$$inlined$flatMapLatest$1 extends AbstractC32275i implements Function3 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public ThreadListController$3$invokeSuspend$$inlined$flatMapLatest$1(InterfaceC30057d interfaceC30057d) {
        super(3, interfaceC30057d);
    }

    public final Object invoke(InterfaceC13062m interfaceC13062m, QueryThreadsState queryThreadsState, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        ThreadListController$3$invokeSuspend$$inlined$flatMapLatest$1 threadListController$3$invokeSuspend$$inlined$flatMapLatest$1 = new ThreadListController$3$invokeSuspend$$inlined$flatMapLatest$1(3, interfaceC30057d);
        threadListController$3$invokeSuspend$$inlined$flatMapLatest$1.L$0 = interfaceC13062m;
        threadListController$3$invokeSuspend$$inlined$flatMapLatest$1.L$1 = queryThreadsState;
        return threadListController$3$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.L$0;
            QueryThreadsState queryThreadsState = (QueryThreadsState) this.L$1;
            InterfaceC13037f2 threads = queryThreadsState.getThreads();
            InterfaceC13037f2 loading = queryThreadsState.getLoading();
            InterfaceC13037f2 loadingMore = queryThreadsState.getLoadingMore();
            InterfaceC13037f2 unseenThreadIds = queryThreadsState.getUnseenThreadIds();
            InterfaceC13037f2 loadingError = queryThreadsState.getLoadingError();
            ThreadListController$3$1$1 threadListController$3$1$1 = new ThreadListController$3$1$1(null);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            AbstractC13091v.m36615y(interfaceC13062m);
            Object objM41038a = AbstractC14371b.m41038a(C13068n1.f45159w, interfaceC13062m, new C0493j((InterfaceC30057d) null, (InterfaceC23459e) threadListController$3$1$1, 7), this, new InterfaceC13058l[]{threads, loading, loadingMore, unseenThreadIds, loadingError});
            if (objM41038a != EnumC31071a.f128113w) {
                objM41038a = c23454a0;
            }
            if (objM41038a != EnumC31071a.f128113w) {
                objM41038a = c23454a0;
            }
            if (objM41038a == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        return c23454a0;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((InterfaceC13062m) obj, (QueryThreadsState) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
    }
}
