package io.getstream.chat.android.p226ui.viewmodel.pinned;

import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1637w1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13087t1;
import io.getstream.chat.android.client.api.state.Event;
import io.getstream.chat.android.p226ui.common.feature.pinned.PinnedMessageListController;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00100\n8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/pinned/PinnedMessageListViewModel;", "Landroidx/lifecycle/w1;", "Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;", "controller", "<init>", "(Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;)V", "Ll83/a0;", "loadMore", "()V", "Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;", "Landroidx/lifecycle/p0;", "Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;", "state", "Landroidx/lifecycle/p0;", "getState", "()Landroidx/lifecycle/p0;", "Lio/getstream/chat/android/client/api/state/Event;", "errorEvents", "getErrorEvents", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PinnedMessageListViewModel extends AbstractC1637w1 {
    private final PinnedMessageListController controller;
    private final AbstractC1615p0 errorEvents;
    private final AbstractC1615p0 state;

    public PinnedMessageListViewModel(PinnedMessageListController controller) {
        AbstractC22676k.m65750j(controller, "controller");
        this.controller = controller;
        this.state = AbstractC1613o1.m5012b(controller.getState(), null, 3);
        final InterfaceC13087t1 errorEvents = controller.getErrorEvents();
        this.errorEvents = AbstractC1613o1.m5012b(new InterfaceC13058l() { // from class: io.getstream.chat.android.ui.viewmodel.pinned.PinnedMessageListViewModel$special$$inlined$map$1

            /* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.pinned.PinnedMessageListViewModel$special$$inlined$map$1$2 */
            @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final class C199542<T> implements InterfaceC13062m {
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;

                /* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.pinned.PinnedMessageListViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.viewmodel.pinned.PinnedMessageListViewModel$special$$inlined$map$1$2", m100430f = "PinnedMessageListViewModel.kt", m100431l = {50}, m100432m = "emit")
                @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
                public static final class AnonymousClass1 extends AbstractC32269c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C199542.this.emit(null, this);
                    }
                }

                public C199542(InterfaceC13062m interfaceC13062m) {
                    this.$this_unsafeFlow = interfaceC13062m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC30057d instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC30057d;
                        int i13 = anonymousClass1.label;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i13 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                    }
                    Object obj2 = anonymousClass1.result;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = anonymousClass1.label;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.$this_unsafeFlow;
                        Event event = new Event((C23454a0) obj);
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC13062m.emit(event, anonymousClass1) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj2);
                    }
                    return C23454a0.f92919a;
                }
            }

            @Override // ec3.InterfaceC13058l
            public final Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = errorEvents.collect(new C199542(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }, null, 3);
        controller.load();
    }

    public final AbstractC1615p0 getErrorEvents() {
        return this.errorEvents;
    }

    public final AbstractC1615p0 getState() {
        return this.state;
    }

    public final void loadMore() {
        this.controller.loadMore();
    }
}
