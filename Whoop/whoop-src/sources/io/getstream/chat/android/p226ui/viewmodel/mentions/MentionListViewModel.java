package io.getstream.chat.android.p226ui.viewmodel.mentions;

import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13087t1;
import i01.C17841d;
import io.getstream.chat.android.client.api.state.Event;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.querysort.QuerySorter;
import io.getstream.chat.android.p226ui.common.feature.mentions.MentionListController;
import l83.C23454a0;
import l83.InterfaceC23462h;
import p505ts.AbstractC34132o;
import p708hb2.C17095c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B/\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0011\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R#\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00180\u00128\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001b"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/mentions/MentionListViewModel;", "Landroidx/lifecycle/w1;", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "Lio/getstream/chat/android/models/Message;", "sort", "Lkotlin/Function1;", "Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;", "controllerProvider", "<init>", "(Lio/getstream/chat/android/models/querysort/QuerySorter;Lkotlin/jvm/functions/Function1;)V", "Ll83/a0;", "loadMore", "()V", "controller$delegate", "Ll83/h;", "getController", "()Lio/getstream/chat/android/ui/common/feature/mentions/MentionListController;", "controller", "Landroidx/lifecycle/p0;", "Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;", "state", "Landroidx/lifecycle/p0;", "getState", "()Landroidx/lifecycle/p0;", "Lio/getstream/chat/android/client/api/state/Event;", "errorEvents", "getErrorEvents", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MentionListViewModel extends AbstractC1637w1 {

    /* JADX INFO: renamed from: controller$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h controller;
    private final AbstractC1615p0 errorEvents;
    private final AbstractC1615p0 state;

    /* JADX WARN: Multi-variable type inference failed */
    public MentionListViewModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MentionListController _init_$lambda$0(QuerySorter querySorter, AbstractC1637w1 abstractC1637w1) {
        AbstractC22676k.m65750j(abstractC1637w1, "<this>");
        return new MentionListController(AbstractC1640x1.m5043b(abstractC1637w1), querySorter, null, 4, null);
    }

    private static final MentionListController controller_delegate$lambda$1(Function1 function1, MentionListViewModel mentionListViewModel) {
        return (MentionListController) function1.invoke(mentionListViewModel);
    }

    private final MentionListController getController() {
        return (MentionListController) this.controller.getValue();
    }

    public final AbstractC1615p0 getErrorEvents() {
        return this.errorEvents;
    }

    public final AbstractC1615p0 getState() {
        return this.state;
    }

    public final void loadMore() {
        getController().loadMore();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MentionListViewModel(QuerySorter querySorter, Function1 function1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        querySorter = (i13 & 1) != 0 ? null : querySorter;
        this(querySorter, (i13 & 2) != 0 ? new C17095c(querySorter, 28) : function1);
    }

    public MentionListViewModel(QuerySorter<Message> querySorter, Function1 controllerProvider) {
        AbstractC22676k.m65750j(controllerProvider, "controllerProvider");
        this.controller = AbstractC30060g.m92088H(new C17841d(controllerProvider, this, 20));
        this.state = AbstractC1613o1.m5012b(getController().getState(), null, 3);
        final InterfaceC13087t1 events = getController().getEvents();
        this.errorEvents = AbstractC1613o1.m5012b(new InterfaceC13058l() { // from class: io.getstream.chat.android.ui.viewmodel.mentions.MentionListViewModel$special$$inlined$map$1

            /* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.mentions.MentionListViewModel$special$$inlined$map$1$2 */
            @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final class C199222<T> implements InterfaceC13062m {
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;

                /* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.mentions.MentionListViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.viewmodel.mentions.MentionListViewModel$special$$inlined$map$1$2", m100430f = "MentionListViewModel.kt", m100431l = {50}, m100432m = "emit")
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
                        return C199222.this.emit(null, this);
                    }
                }

                public C199222(InterfaceC13062m interfaceC13062m) {
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
                    C23454a0 c23454a0 = C23454a0.f92919a;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.$this_unsafeFlow;
                        Event event = new Event(c23454a0);
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
                    return c23454a0;
                }
            }

            @Override // ec3.InterfaceC13058l
            public final Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = events.collect(new C199222(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }, null, 3);
    }
}
