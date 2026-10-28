package io.getstream.chat.android.p226ui.common.feature.threads;

import c93.InterfaceC4354p;
import io.getstream.chat.android.models.Thread;
import io.getstream.chat.android.p226ui.common.state.threads.ThreadListState;
import java.util.List;
import java.util.Set;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.threads.ThreadListController$3$1$1", m100430f = "ThreadListController.kt", m100431l = {}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\u0006H\n"}, m65681d2 = {"<anonymous>", "Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;", "threads", "", "Lio/getstream/chat/android/models/Thread;", "loading", "", "loadingMore", "unseenThreadIds", "", "", "loadingError"}, m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ThreadListController$3$1$1 extends AbstractC32275i implements InterfaceC4354p {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    /* synthetic */ boolean Z$2;
    int label;

    public ThreadListController$3$1$1(InterfaceC30057d<? super ThreadListController$3$1$1> interfaceC30057d) {
        super(6, interfaceC30057d);
    }

    @Override // c93.InterfaceC4354p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return invoke((List<Thread>) obj, ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), (Set<String>) obj4, ((Boolean) obj5).booleanValue(), (InterfaceC30057d<? super ThreadListState>) obj6);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        boolean z4 = this.Z$0;
        boolean z13 = this.Z$1;
        Set set = (Set) this.L$1;
        boolean z14 = this.Z$2;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        return new ThreadListState(list, z4, z13, set.size(), z14);
    }

    public final Object invoke(List<Thread> list, boolean z4, boolean z13, Set<String> set, boolean z14, InterfaceC30057d<? super ThreadListState> interfaceC30057d) {
        ThreadListController$3$1$1 threadListController$3$1$1 = new ThreadListController$3$1$1(interfaceC30057d);
        threadListController$3$1$1.L$0 = list;
        threadListController$3$1$1.Z$0 = z4;
        threadListController$3$1$1.Z$1 = z13;
        threadListController$3$1$1.L$1 = set;
        threadListController$3$1$1.Z$2 = z14;
        return threadListController$3$1$1.invokeSuspend(C23454a0.f92919a);
    }
}
