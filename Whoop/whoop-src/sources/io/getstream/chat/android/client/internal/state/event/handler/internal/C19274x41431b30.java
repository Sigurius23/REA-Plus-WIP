package io.getstream.chat.android.client.internal.state.event.handler.internal;

import c93.InterfaceC4351m;
import io.getstream.chat.android.client.events.HasUnreadThreadCounts;
import io.getstream.chat.android.client.events.NotificationMarkReadEvent;
import io.getstream.chat.android.client.events.NotificationMarkUnreadEvent;
import io.getstream.chat.android.client.events.NotificationThreadMessageNewEvent;
import io.getstream.chat.android.core.internal.lazy.ParameterizedLazy;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.C22665e0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential$updateGlobalState$modifyUnreadThreadsCount$1 */
/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential$updateGlobalState$modifyUnreadThreadsCount$1", m100430f = "EventHandlerSequential.kt", m100431l = {412}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lio/getstream/chat/android/client/events/HasUnreadThreadCounts;", "it", "Ll83/a0;", "<anonymous>", "(Lio/getstream/chat/android/client/events/HasUnreadThreadCounts;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class C19274x41431b30 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ ParameterizedLazy<String, Boolean> $hasReadEventsCapability;
    final /* synthetic */ C22665e0 $unreadThreadsCount;
    int I$0;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19274x41431b30(ParameterizedLazy<String, Boolean> parameterizedLazy, C22665e0 c22665e0, InterfaceC30057d<? super C19274x41431b30> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.$hasReadEventsCapability = parameterizedLazy;
        this.$unreadThreadsCount = c22665e0;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        C19274x41431b30 c19274x41431b30 = new C19274x41431b30(this.$hasReadEventsCapability, this.$unreadThreadsCount, interfaceC30057d);
        c19274x41431b30.L$0 = obj;
        return c19274x41431b30;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(HasUnreadThreadCounts hasUnreadThreadCounts, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((C19274x41431b30) create(hasUnreadThreadCounts, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C22665e0 c22665e0;
        Integer unreadThreads;
        int iIntValue;
        HasUnreadThreadCounts hasUnreadThreadCounts = (HasUnreadThreadCounts) this.L$0;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            if (hasUnreadThreadCounts instanceof NotificationThreadMessageNewEvent) {
                ParameterizedLazy<String, Boolean> parameterizedLazy = this.$hasReadEventsCapability;
                String cid = ((NotificationThreadMessageNewEvent) hasUnreadThreadCounts).getCid();
                this.L$0 = null;
                this.L$1 = hasUnreadThreadCounts;
                this.L$2 = null;
                this.I$0 = 0;
                this.label = 1;
                obj = parameterizedLazy.invoke(cid, (InterfaceC30057d<? super Boolean>) this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else if (!(hasUnreadThreadCounts instanceof NotificationMarkReadEvent) && !(hasUnreadThreadCounts instanceof NotificationMarkUnreadEvent)) {
                throw new NoWhenBranchMatchedException();
            }
            if (hasUnreadThreadCounts != null) {
                c22665e0 = this.$unreadThreadsCount;
                unreadThreads = hasUnreadThreadCounts.getUnreadThreads();
                if (unreadThreads != null) {
                    iIntValue = unreadThreads.intValue();
                } else {
                    iIntValue = c22665e0.f89334w;
                }
                c22665e0.f89334w = iIntValue;
            }
            return C23454a0.f92919a;
        }
        if (i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        hasUnreadThreadCounts = (HasUnreadThreadCounts) this.L$1;
        AbstractC34132o.m107864I(obj);
        if (!((Boolean) obj).booleanValue()) {
            hasUnreadThreadCounts = null;
        }
        if (hasUnreadThreadCounts != null) {
            c22665e0 = this.$unreadThreadsCount;
            unreadThreads = hasUnreadThreadCounts.getUnreadThreads();
            if (unreadThreads != null) {
                iIntValue = unreadThreads.intValue();
            } else {
                iIntValue = c22665e0.f89334w;
            }
            c22665e0.f89334w = iIntValue;
        }
        return C23454a0.f92919a;
    }
}
