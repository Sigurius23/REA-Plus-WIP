package io.getstream.chat.android.p226ui.common.feature.channel.info;

import androidx.core.app.NotificationCompat;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ch.C4588i;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13052j1;
import ec3.C13096w1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13075p1;
import ec3.InterfaceC13087t1;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api.state.ChatClientExtensions;
import io.getstream.chat.android.client.channel.ChannelClient;
import io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.C19336c;
import io.getstream.chat.android.client.query.AddMembersParams;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.ChannelData;
import io.getstream.chat.android.models.CommandDefaults;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.MemberData;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.common.state.channel.info.ChannelInfoViewState;
import io.getstream.chat.android.p226ui.common.utils.ExpandableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.C23454a0;
import l83.C23467m;
import l83.C23468n;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import n23.AbstractC26202e;
import n23.AbstractC26205h;
import n23.C26201d;
import n23.C26203f;
import n23.C26204g;
import o23.C27481k;
import o23.C27485o;
import o23.InterfaceC27474d;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\f¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001c\u001a\u00020\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0017H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0017H\u0002¢\u0006\u0004\b(\u0010'J\u0017\u0010*\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020)H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u0002H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\bH\u0002¢\u0006\u0004\b0\u00101J\u0011\u00102\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b2\u00103J\u001b\u00105\u001a\u00020\u00172\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b5\u0010.J\u001b\u00106\u001a\u00020\u00172\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b6\u0010.J\u001b\u00107\u001a\u00020\u00172\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b7\u0010.J\u001b\u00108\u001a\u00020\u00172\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b8\u0010.J\u0019\u0010;\u001a\u00020\u00172\b\u0010:\u001a\u0004\u0018\u000109H\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0017H\u0002¢\u0006\u0004\b=\u0010'J!\u0010A\u001a\u00020\u00172\u0006\u0010>\u001a\u00020\u00022\b\u0010@\u001a\u0004\u0018\u00010?H\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\u00172\u0006\u0010>\u001a\u00020\u0002H\u0002¢\u0006\u0004\bC\u0010.J\u0017\u0010D\u001a\u00020\u00172\u0006\u0010>\u001a\u00020\u0002H\u0002¢\u0006\u0004\bD\u0010.JI\u0010J\u001a\u00020\u00172\u0006\u0010>\u001a\u00020\u00022\b\u0010E\u001a\u0004\u0018\u0001092\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\u00170\u00062\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020\u00170\u0006H\u0002¢\u0006\u0004\bJ\u0010KJ\u001f\u0010N\u001a\b\u0012\u0004\u0012\u00020M0L*\b\u0012\u0004\u0012\u00020M0LH\u0002¢\u0006\u0004\bN\u0010OR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010PR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010QR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010RR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010SR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010TR\u001b\u0010Z\u001a\u00020U8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020\\0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u001d\u0010`\u001a\b\u0012\u0004\u0012\u00020\\0_8\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020e0d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u001d\u0010i\u001a\b\u0012\u0004\u0012\u00020e0h8\u0006¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l¨\u0006m"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;", "", "", "cid", "Lbc3/c0;", "scope", "Lkotlin/Function1;", "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option;", "", "optionFilter", "Lio/getstream/chat/android/client/ChatClient;", "chatClient", "Lec3/l;", "Lio/getstream/chat/android/client/channel/state/ChannelState;", "channelState", "Lio/getstream/chat/android/client/channel/ChannelClient;", "channelClient", "Lio/getstream/chat/android/client/api/state/GlobalState;", "globalState", "<init>", "(Ljava/lang/String;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/ChatClient;Lec3/l;Lio/getstream/chat/android/client/channel/ChannelClient;Lec3/l;)V", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction;", "action", "Ll83/a0;", "onViewAction", "(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction;)V", "", "userIds", "addMembers", "(Ljava/util/Set;)V", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent;", NotificationCompat.CATEGORY_EVENT, "onMemberViewEvent", "(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent;)V", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoData;", "data", "onChannelInfoData", "(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoData;)V", "expandMembers", "()V", "collapseMembers", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$MemberClick;", "memberClick", "(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction$MemberClick;)V", "name", "renameChannel", "(Ljava/lang/String;)V", CommandDefaults.MUTE, "setChannelMute", "(Z)V", "getDmMemberId", "()Ljava/lang/String;", "userId", "muteUser", "unmuteUser", "blockUser", "unblockUser", "Lio/getstream/chat/android/models/Message;", "quitMessage", "leaveChannel", "(Lio/getstream/chat/android/models/Message;)V", "deleteChannel", "memberId", "", "timeout", "banMember", "(Ljava/lang/String;Ljava/lang/Integer;)V", "unbanMember", "removeMember", "systemMessage", "Lio/getstream/chat/android/models/Channel;", "onSuccess", "Ln23/e;", "onError", "removeMemberFromChannel", "(Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", "Lio/getstream/chat/android/models/Member;", "filterNotCurrentUser", "(Ljava/util/List;)Ljava/util/List;", "Ljava/lang/String;", "Lbc3/c0;", "Lkotlin/jvm/functions/Function1;", "Lio/getstream/chat/android/client/ChatClient;", "Lio/getstream/chat/android/client/channel/ChannelClient;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Lec3/p1;", "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState;", "_state", "Lec3/p1;", "Lec3/f2;", "state", "Lec3/f2;", "getState", "()Lec3/f2;", "Lec3/o1;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent;", "_events", "Lec3/o1;", "Lec3/t1;", "events", "Lec3/t1;", "getEvents", "()Lec3/t1;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelInfoViewController {
    public static final int $stable = 8;
    private final InterfaceC13072o1 _events;
    private final InterfaceC13075p1 _state;
    private final ChannelClient channelClient;
    private final ChatClient chatClient;
    private final String cid;
    private final InterfaceC13087t1 events;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final Function1 optionFilter;
    private final InterfaceC2994c0 scope;
    private final InterfaceC13037f2 state;

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoViewController$3 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoViewController$3", m100430f = "ChannelInfoViewController.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoData;", "data", "Ll83/a0;", "<anonymous>", "(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoData;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C194843 extends AbstractC32275i implements InterfaceC4351m {
        /* synthetic */ Object L$0;
        int label;

        public C194843(InterfaceC30057d<? super C194843> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C194843 c194843 = ChannelInfoViewController.this.new C194843(interfaceC30057d);
            c194843.L$0 = obj;
            return c194843;
        }

        public final Object invoke(ChannelInfoData channelInfoData, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C194843 c194843 = (C194843) create(channelInfoData, interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c194843.invokeSuspend(c23454a0);
            return c23454a0;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            ChannelInfoData channelInfoData = (ChannelInfoData) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            ChannelInfoViewController.this.onChannelInfoData(channelInfoData);
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((ChannelInfoData) obj, (InterfaceC30057d<? super C23454a0>) obj2);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoViewController$addMembers$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoViewController$addMembers$2", m100430f = "ChannelInfoViewController.kt", m100431l = {226}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C194862 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ Set<String> $userIds;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C194862(Set<String> set, InterfaceC30057d<? super C194862> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$userIds = set;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return ChannelInfoViewController.this.new C194862(this.$userIds, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C194862) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            Map map = null;
            Object[] objArr = 0;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                ChannelClient channelClient = ChannelInfoViewController.this.channelClient;
                Set<String> set = this.$userIds;
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(set, 10));
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(new MemberData((String) it.next(), map, 2, objArr == true ? 1 : 0));
                }
                InterfaceC27474d interfaceC27474dAddMembers = channelClient.addMembers(new AddMembersParams(arrayList, null, null, null, null, 28, null));
                this.label = 1;
                obj = interfaceC27474dAddMembers.await(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            AbstractC26205h abstractC26205h = (AbstractC26205h) obj;
            ChannelInfoViewController channelInfoViewController = ChannelInfoViewController.this;
            if (!(abstractC26205h instanceof C26204g)) {
                if (!(abstractC26205h instanceof C26203f)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC26202e abstractC26202e = ((C26203f) abstractC26205h).f103918a;
                C2345k logger = channelInfoViewController.getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.ERROR;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[addMembers] error: ", abstractC26202e.mo77807a()), null);
                }
                channelInfoViewController._events.mo36564a(ChannelInfoViewEvent.AddMembersError.INSTANCE);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoViewController$banMember$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoViewController$banMember$2", m100430f = "ChannelInfoViewController.kt", m100431l = {430}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C194872 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $memberId;
        final /* synthetic */ Integer $timeout;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C194872(String str, Integer num, InterfaceC30057d<? super C194872> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$memberId = str;
            this.$timeout = num;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return ChannelInfoViewController.this.new C194872(this.$memberId, this.$timeout, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C194872) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC27474d interfaceC27474dBanUser = ChannelInfoViewController.this.channelClient.banUser(this.$memberId, null, this.$timeout);
                this.label = 1;
                obj = ((C27485o) interfaceC27474dBanUser).await(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            AbstractC26205h abstractC26205h = (AbstractC26205h) obj;
            boolean z4 = abstractC26205h instanceof C26204g;
            if (z4) {
            } else if (!(abstractC26205h instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            ChannelInfoViewController channelInfoViewController = ChannelInfoViewController.this;
            if (!z4) {
                if (!(abstractC26205h instanceof C26203f)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC26202e abstractC26202e = ((C26203f) abstractC26205h).f103918a;
                C2345k logger = channelInfoViewController.getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.ERROR;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[banMember] error: ", abstractC26202e.mo77807a()), null);
                }
                channelInfoViewController._events.mo36564a(ChannelInfoViewEvent.BanMemberError.INSTANCE);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoViewController$blockUser$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoViewController$blockUser$2", m100430f = "ChannelInfoViewController.kt", m100431l = {363}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C194882 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $userId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C194882(String str, InterfaceC30057d<? super C194882> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$userId = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return ChannelInfoViewController.this.new C194882(this.$userId, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C194882) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC27474d interfaceC27474dBlockUser = ChannelInfoViewController.this.chatClient.blockUser(this.$userId);
                this.label = 1;
                obj = ((C27481k) interfaceC27474dBlockUser).await(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            AbstractC26205h abstractC26205h = (AbstractC26205h) obj;
            ChannelInfoViewController channelInfoViewController = ChannelInfoViewController.this;
            if (!(abstractC26205h instanceof C26204g)) {
                if (!(abstractC26205h instanceof C26203f)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC26202e abstractC26202e = ((C26203f) abstractC26205h).f103918a;
                C2345k logger = channelInfoViewController.getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.ERROR;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[blockUser] error: ", abstractC26202e.mo77807a()), null);
                }
                channelInfoViewController._events.mo36564a(ChannelInfoViewEvent.BlockUserError.INSTANCE);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoViewController$deleteChannel$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoViewController$deleteChannel$2", m100430f = "ChannelInfoViewController.kt", m100431l = {411}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C194892 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C194892(InterfaceC30057d<? super C194892> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return ChannelInfoViewController.this.new C194892(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C194892) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC27474d interfaceC27474dDelete = ChannelInfoViewController.this.channelClient.delete();
                this.label = 1;
                obj = ((C27481k) interfaceC27474dDelete).await(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            AbstractC26205h abstractC26205h = (AbstractC26205h) obj;
            ChannelInfoViewController channelInfoViewController = ChannelInfoViewController.this;
            boolean z4 = abstractC26205h instanceof C26204g;
            if (z4) {
                channelInfoViewController._events.mo36564a(new ChannelInfoViewEvent.NavigateUp(ChannelInfoViewEvent.Navigation.Reason.DeleteChannelSuccess.INSTANCE));
            } else if (!(abstractC26205h instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            ChannelInfoViewController channelInfoViewController2 = ChannelInfoViewController.this;
            if (!z4) {
                if (!(abstractC26205h instanceof C26203f)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC26202e abstractC26202e = ((C26203f) abstractC26205h).f103918a;
                C2345k logger = channelInfoViewController2.getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.ERROR;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[deleteChannel] error: ", abstractC26202e.mo77807a()), null);
                }
                channelInfoViewController2._events.mo36564a(ChannelInfoViewEvent.DeleteChannelError.INSTANCE);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoViewController$muteUser$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoViewController$muteUser$2", m100430f = "ChannelInfoViewController.kt", m100431l = {339}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C194902 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $userId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C194902(String str, InterfaceC30057d<? super C194902> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$userId = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return ChannelInfoViewController.this.new C194902(this.$userId, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C194902) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC27474d interfaceC27474dMuteUser$default = ChatClient.muteUser$default(ChannelInfoViewController.this.chatClient, this.$userId, null, 2, null);
                this.label = 1;
                obj = interfaceC27474dMuteUser$default.await(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            AbstractC26205h abstractC26205h = (AbstractC26205h) obj;
            ChannelInfoViewController channelInfoViewController = ChannelInfoViewController.this;
            if (!(abstractC26205h instanceof C26204g)) {
                if (!(abstractC26205h instanceof C26203f)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC26202e abstractC26202e = ((C26203f) abstractC26205h).f103918a;
                C2345k logger = channelInfoViewController.getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.ERROR;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[muteUser] error: ", abstractC26202e.mo77807a()), null);
                }
                channelInfoViewController._events.mo36564a(ChannelInfoViewEvent.MuteUserError.INSTANCE);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoViewController$removeMemberFromChannel$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoViewController$removeMemberFromChannel$1", m100430f = "ChannelInfoViewController.kt", m100431l = {476}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C194911 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $memberId;
        final /* synthetic */ Function1 $onError;
        final /* synthetic */ Function1 $onSuccess;
        final /* synthetic */ Message $systemMessage;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C194911(String str, Message message, Function1 function1, Function1 function2, InterfaceC30057d<? super C194911> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$memberId = str;
            this.$systemMessage = message;
            this.$onSuccess = function1;
            this.$onError = function2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return ChannelInfoViewController.this.new C194911(this.$memberId, this.$systemMessage, this.$onSuccess, this.$onError, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C194911) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC27474d interfaceC27474dRemoveMembers$default = ChannelClient.removeMembers$default(ChannelInfoViewController.this.channelClient, AbstractC37056f.m118958J(this.$memberId), this.$systemMessage, null, 4, null);
                this.label = 1;
                obj = interfaceC27474dRemoveMembers$default.await(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            AbstractC26205h abstractC26205h = (AbstractC26205h) obj;
            Function1 function1 = this.$onSuccess;
            boolean z4 = abstractC26205h instanceof C26204g;
            if (z4) {
                function1.invoke(((C26204g) abstractC26205h).f103919a);
            } else if (!(abstractC26205h instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            Function1 function2 = this.$onError;
            if (!z4) {
                if (!(abstractC26205h instanceof C26203f)) {
                    throw new NoWhenBranchMatchedException();
                }
                function2.invoke(((C26203f) abstractC26205h).f103918a);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoViewController$renameChannel$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoViewController$renameChannel$2", m100430f = "ChannelInfoViewController.kt", m100431l = {301}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C194922 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $name;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C194922(String str, InterfaceC30057d<? super C194922> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$name = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return ChannelInfoViewController.this.new C194922(this.$name, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C194922) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC27474d interfaceC27474dUpdatePartial$default = ChannelClient.updatePartial$default(ChannelInfoViewController.this.channelClient, AbstractC31061c.m95645u("name", this.$name), null, 2, null);
                this.label = 1;
                obj = interfaceC27474dUpdatePartial$default.await(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            AbstractC26205h abstractC26205h = (AbstractC26205h) obj;
            ChannelInfoViewController channelInfoViewController = ChannelInfoViewController.this;
            if (!(abstractC26205h instanceof C26204g)) {
                if (!(abstractC26205h instanceof C26203f)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC26202e abstractC26202e = ((C26203f) abstractC26205h).f103918a;
                C2345k logger = channelInfoViewController.getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.ERROR;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[renameChannel] error: ", abstractC26202e.mo77807a()), null);
                }
                channelInfoViewController._events.mo36564a(ChannelInfoViewEvent.RenameChannelError.INSTANCE);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoViewController$setChannelMute$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoViewController$setChannelMute$2", m100430f = "ChannelInfoViewController.kt", m100431l = {314, 316}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C194932 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ boolean $mute;
        int label;
        final /* synthetic */ ChannelInfoViewController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C194932(boolean z4, ChannelInfoViewController channelInfoViewController, InterfaceC30057d<? super C194932> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$mute = z4;
            this.this$0 = channelInfoViewController;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C194932(this.$mute, this.this$0, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C194932) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        
            if (r8 == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
        
            if (r8 == r0) goto L18;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r7.label
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1d
                if (r1 == r4) goto L19
                if (r1 != r3) goto L11
                p505ts.AbstractC34132o.m107864I(r8)
                goto L4d
            L11:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L19:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L37
            L1d:
                p505ts.AbstractC34132o.m107864I(r8)
                boolean r8 = r7.$mute
                if (r8 == 0) goto L3a
                io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoViewController r8 = r7.this$0
                io.getstream.chat.android.client.channel.ChannelClient r8 = io.getstream.chat.android.p226ui.common.feature.channel.info.ChannelInfoViewController.access$getChannelClient$p(r8)
                o23.d r8 = io.getstream.chat.android.client.channel.ChannelClient.mute$default(r8, r2, r4, r2)
                r7.label = r4
                java.lang.Object r8 = r8.await(r7)
                if (r8 != r0) goto L37
                goto L4c
            L37:
                n23.h r8 = (n23.AbstractC26205h) r8
                goto L4f
            L3a:
                io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoViewController r8 = r7.this$0
                io.getstream.chat.android.client.channel.ChannelClient r8 = io.getstream.chat.android.p226ui.common.feature.channel.info.ChannelInfoViewController.access$getChannelClient$p(r8)
                o23.d r8 = r8.unmute()
                r7.label = r3
                java.lang.Object r8 = r8.await(r7)
                if (r8 != r0) goto L4d
            L4c:
                return r0
            L4d:
                n23.h r8 = (n23.AbstractC26205h) r8
            L4f:
                io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoViewController r0 = r7.this$0
                boolean r1 = r7.$mute
                boolean r3 = r8 instanceof n23.C26204g
                if (r3 != 0) goto L93
                boolean r3 = r8 instanceof n23.C26203f
                if (r3 == 0) goto L8d
                n23.f r8 = (n23.C26203f) r8
                n23.e r8 = r8.f103918a
                b23.k r3 = io.getstream.chat.android.p226ui.common.feature.channel.info.ChannelInfoViewController.access$getLogger(r0)
                b23.e r4 = r3.f9275c
                java.lang.String r5 = r3.f9273a
                b23.g r6 = b23.EnumC2341g.ERROR
                boolean r4 = r4.isLoggable(r6, r5)
                if (r4 == 0) goto L7e
                b23.j r3 = r3.f9274b
                java.lang.String r8 = r8.mo77807a()
                java.lang.String r4 = "[setChannelMute] error: "
                java.lang.String r8 = p000.AbstractC11266d.m30461o(r4, r8)
                r3.log(r6, r5, r8, r2)
            L7e:
                ec3.o1 r8 = io.getstream.chat.android.p226ui.common.feature.channel.info.ChannelInfoViewController.access$get_events$p(r0)
                if (r1 == 0) goto L87
                io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoViewEvent$MuteChannelError r0 = io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoViewEvent.MuteChannelError.INSTANCE
                goto L89
            L87:
                io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoViewEvent$UnmuteChannelError r0 = io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoViewEvent.UnmuteChannelError.INSTANCE
            L89:
                r8.mo36564a(r0)
                goto L93
            L8d:
                kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                r8.<init>()
                throw r8
            L93:
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.p226ui.common.feature.channel.info.ChannelInfoViewController.C194932.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoViewController$unbanMember$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoViewController$unbanMember$2", m100430f = "ChannelInfoViewController.kt", m100431l = {443}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C194942 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $memberId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C194942(String str, InterfaceC30057d<? super C194942> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$memberId = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return ChannelInfoViewController.this.new C194942(this.$memberId, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C194942) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC27474d interfaceC27474dUnbanUser = ChannelInfoViewController.this.channelClient.unbanUser(this.$memberId);
                this.label = 1;
                obj = ((C27485o) interfaceC27474dUnbanUser).await(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            AbstractC26205h abstractC26205h = (AbstractC26205h) obj;
            boolean z4 = abstractC26205h instanceof C26204g;
            if (z4) {
            } else if (!(abstractC26205h instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            ChannelInfoViewController channelInfoViewController = ChannelInfoViewController.this;
            if (!z4) {
                if (!(abstractC26205h instanceof C26203f)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC26202e abstractC26202e = ((C26203f) abstractC26205h).f103918a;
                C2345k logger = channelInfoViewController.getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.ERROR;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[unbanMember] error: ", abstractC26202e.mo77807a()), null);
                }
                channelInfoViewController._events.mo36564a(ChannelInfoViewEvent.UnbanMemberError.INSTANCE);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoViewController$unblockUser$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoViewController$unblockUser$2", m100430f = "ChannelInfoViewController.kt", m100431l = {375}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C194952 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $userId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C194952(String str, InterfaceC30057d<? super C194952> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$userId = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return ChannelInfoViewController.this.new C194952(this.$userId, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C194952) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC27474d interfaceC27474dUnblockUser = ChannelInfoViewController.this.chatClient.unblockUser(this.$userId);
                this.label = 1;
                obj = ((C27481k) interfaceC27474dUnblockUser).await(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            AbstractC26205h abstractC26205h = (AbstractC26205h) obj;
            ChannelInfoViewController channelInfoViewController = ChannelInfoViewController.this;
            if (!(abstractC26205h instanceof C26204g)) {
                if (!(abstractC26205h instanceof C26203f)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC26202e abstractC26202e = ((C26203f) abstractC26205h).f103918a;
                C2345k logger = channelInfoViewController.getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.ERROR;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[unblockUser] error: ", abstractC26202e.mo77807a()), null);
                }
                channelInfoViewController._events.mo36564a(ChannelInfoViewEvent.UnblockUserError.INSTANCE);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoViewController$unmuteUser$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoViewController$unmuteUser$2", m100430f = "ChannelInfoViewController.kt", m100431l = {351}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C194962 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $userId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C194962(String str, InterfaceC30057d<? super C194962> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$userId = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return ChannelInfoViewController.this.new C194962(this.$userId, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C194962) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC27474d interfaceC27474dUnmuteUser = ChannelInfoViewController.this.chatClient.unmuteUser(this.$userId);
                this.label = 1;
                obj = interfaceC27474dUnmuteUser.await(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            AbstractC26205h abstractC26205h = (AbstractC26205h) obj;
            ChannelInfoViewController channelInfoViewController = ChannelInfoViewController.this;
            if (!(abstractC26205h instanceof C26204g)) {
                if (!(abstractC26205h instanceof C26203f)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC26202e abstractC26202e = ((C26203f) abstractC26205h).f103918a;
                C2345k logger = channelInfoViewController.getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.ERROR;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[unmuteUser] error: ", abstractC26202e.mo77807a()), null);
                }
                channelInfoViewController._events.mo36564a(ChannelInfoViewEvent.UnmuteUserError.INSTANCE);
            }
            return C23454a0.f92919a;
        }
    }

    public ChannelInfoViewController(String cid, InterfaceC2994c0 scope, Function1 optionFilter, ChatClient chatClient, InterfaceC13058l channelState, ChannelClient channelClient, InterfaceC13058l globalState) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(optionFilter, "optionFilter");
        AbstractC22676k.m65750j(chatClient, "chatClient");
        AbstractC22676k.m65750j(channelState, "channelState");
        AbstractC22676k.m65750j(channelClient, "channelClient");
        AbstractC22676k.m65750j(globalState, "globalState");
        this.cid = cid;
        this.scope = scope;
        this.optionFilter = optionFilter;
        this.chatClient = chatClient;
        this.channelClient = channelClient;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:ChannelInfoViewController");
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(ChannelInfoViewState.Loading.INSTANCE);
        this._state = c13045h2M36593c;
        this.state = AbstractC13091v.m36598h(c13045h2M36593c);
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 1, null, 5);
        this._events = c13096w1M36592b;
        this.events = AbstractC13091v.m36597g(c13096w1M36592b);
        AbstractC13091v.m36582H(new C13052j1(AbstractC13091v.m36610t(AbstractC13091v.m36590P(globalState, new ChannelInfoViewController$special$$inlined$flatMapLatest$1(null, channelState, this))), new C194843(null), 0), scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(ChannelInfoViewState.Content.Option it) {
        AbstractC22676k.m65750j(it, "it");
        return true;
    }

    public static final /* synthetic */ Object access$lambda$4$lambda$3$lambda$2(ChannelData channelData, List list, boolean z4, InterfaceC30057d interfaceC30057d) {
        return new ChannelBaseData(channelData, list, z4);
    }

    private final void banMember(String memberId, Integer timeout) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[banMember] memberId: ", memberId), null);
        }
        AbstractC3006f0.m8732z(this.scope, null, null, new C194872(memberId, timeout, null), 3);
    }

    private final void blockUser(String userId) {
        if (userId == null) {
            return;
        }
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[blockUser] userId: ".concat(userId), null);
        }
        AbstractC3006f0.m8732z(this.scope, null, null, new C194882(userId, null), 3);
    }

    public static /* synthetic */ void blockUser$default(ChannelInfoViewController channelInfoViewController, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = channelInfoViewController.getDmMemberId();
        }
        channelInfoViewController.blockUser(str);
    }

    private final void collapseMembers() {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[collapseMembers]", null);
        }
        ChannelInfoViewControllerKt.updateContent(this._state, new C19336c(18));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChannelInfoViewState.Content collapseMembers$lambda$15(ChannelInfoViewState.Content content) {
        AbstractC22676k.m65750j(content, "content");
        return ChannelInfoViewState.Content.copy$default(content, null, ExpandableList.copy$default(content.getMembers(), null, 0, true, 3, null), null, 5, null);
    }

    private final void deleteChannel() {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[deleteChannel]", null);
        }
        AbstractC3006f0.m8732z(this.scope, null, null, new C194892(null), 3);
    }

    private final void expandMembers() {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[expandMembers]", null);
        }
        ChannelInfoViewControllerKt.updateContent(this._state, new C19336c(17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChannelInfoViewState.Content expandMembers$lambda$13(ChannelInfoViewState.Content content) {
        AbstractC22676k.m65750j(content, "content");
        return ChannelInfoViewState.Content.copy$default(content, null, ExpandableList.copy$default(content.getMembers(), null, 0, false, 3, null), null, 5, null);
    }

    private final List<Member> filterNotCurrentUser(List<Member> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String id4 = ((Member) obj).getUser().getId();
            User currentUser = this.chatClient.getCurrentUser();
            if (!AbstractC22676k.m65745e(id4, currentUser != null ? currentUser.getId() : null)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final String getDmMemberId() {
        Member member;
        Object value = ((C13045h2) this._state).getValue();
        ChannelInfoViewState.Content content = value instanceof ChannelInfoViewState.Content ? (ChannelInfoViewState.Content) value : null;
        if (content == null || (member = (Member) AbstractC25265s.m74100H0(content.getMembers())) == null) {
            return null;
        }
        return member.getUserId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private static final /* synthetic */ Object lambda$4$lambda$3$lambda$2(ChannelData channelData, List list, boolean z4, InterfaceC30057d interfaceC30057d) {
        return new ChannelBaseData(channelData, list, z4);
    }

    private final void leaveChannel(Message quitMessage) {
        Object objM107888l;
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[leaveChannel] quitMessage: ", quitMessage != null ? quitMessage.getText() : null), null);
        }
        C19497a c19497a = new C19497a(this, 1);
        try {
            User currentUser = this.chatClient.getCurrentUser();
            objM107888l = currentUser != null ? currentUser.getId() : null;
            if (objM107888l == null) {
                throw new IllegalArgumentException("User not connected");
            }
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        if (!(objM107888l instanceof C23467m)) {
            removeMemberFromChannel((String) objM107888l, quitMessage, new C19497a(this, 2), c19497a);
        }
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a != null) {
            String message = thM68037a.getMessage();
            if (message == null) {
                message = "";
            }
            c19497a.invoke(new C26201d(message, thM68037a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 leaveChannel$lambda$25(ChannelInfoViewController channelInfoViewController, AbstractC26202e error) {
        AbstractC22676k.m65750j(error, "error");
        C2345k logger = channelInfoViewController.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[leaveChannel] error: ", error.mo77807a()), null);
        }
        channelInfoViewController._events.mo36564a(ChannelInfoViewEvent.LeaveChannelError.INSTANCE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 leaveChannel$lambda$29$lambda$28(ChannelInfoViewController channelInfoViewController, Channel it) {
        AbstractC22676k.m65750j(it, "it");
        channelInfoViewController._events.mo36564a(new ChannelInfoViewEvent.NavigateUp(ChannelInfoViewEvent.Navigation.Reason.LeaveChannelSuccess.INSTANCE));
        return C23454a0.f92919a;
    }

    private final void memberClick(ChannelInfoViewAction.MemberClick action) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[memberClick] member: " + action.getMember(), null);
        }
        this._events.mo36564a(new ChannelInfoViewEvent.MemberInfoModal(this.cid, action.getMember()));
    }

    private final void muteUser(String userId) {
        if (userId == null) {
            return;
        }
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[muteUser] userId: ".concat(userId), null);
        }
        AbstractC3006f0.m8732z(this.scope, null, null, new C194902(userId, null), 3);
    }

    public static /* synthetic */ void muteUser$default(ChannelInfoViewController channelInfoViewController, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = channelInfoViewController.getDmMemberId();
        }
        channelInfoViewController.muteUser(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onChannelInfoData(ChannelInfoData data) {
        C13045h2 c13045h2;
        Object value;
        ExpandableList expandableListCopy$default;
        User createdBy;
        ArrayList arrayList;
        List<Member> members = data.getMembers();
        List<Member> listFilterNotCurrentUser = (members.size() == 1 || ChannelInfoViewControllerKt.isGroupChannel(data.getChannelData())) ? members : null;
        if (listFilterNotCurrentUser == null) {
            listFilterNotCurrentUser = filterNotCurrentUser(members);
        }
        List<Member> list = listFilterNotCurrentUser;
        InterfaceC13075p1 interfaceC13075p1 = this._state;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            ChannelInfoViewState channelInfoViewState = (ChannelInfoViewState) value;
            if (channelInfoViewState instanceof ChannelInfoViewState.Loading) {
                expandableListCopy$default = new ExpandableList(list, 5, false, 4, null);
            } else {
                if (!(channelInfoViewState instanceof ChannelInfoViewState.Content)) {
                    throw new NoWhenBranchMatchedException();
                }
                expandableListCopy$default = ExpandableList.copy$default(((ChannelInfoViewState.Content) channelInfoViewState).getMembers(), list, 0, false, 6, null);
            }
            Member member = list.size() == 1 ? (Member) AbstractC25265s.m74096F0(list) : null;
            createdBy = data.getChannelData().getCreatedBy();
            List<ChannelInfoViewState.Content.Option> listBuildChannelOptionList = ChannelInfoViewControllerKt.buildChannelOptionList(data.getChannelData(), member, data.isMuted(), data.getMutedUsers(), data.getBlockedUserIds());
            arrayList = new ArrayList();
            for (ChannelInfoViewState.Content.Option option : listBuildChannelOptionList) {
                if (!((Boolean) this.optionFilter.invoke(option)).booleanValue()) {
                    option = null;
                }
                if (option != null) {
                    arrayList.add(option);
                }
            }
        } while (!c13045h2.m36569i(value, new ChannelInfoViewState.Content(createdBy, expandableListCopy$default, arrayList)));
    }

    private final void removeMember(String memberId) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[removeMember] memberId: ", memberId), null);
        }
        removeMemberFromChannel(memberId, null, new C19336c(15), new C19497a(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 removeMember$lambda$35(Channel it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 removeMember$lambda$37(ChannelInfoViewController channelInfoViewController, AbstractC26202e error) {
        AbstractC22676k.m65750j(error, "error");
        C2345k logger = channelInfoViewController.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[removeMember] error: ", error.mo77807a()), null);
        }
        channelInfoViewController._events.mo36564a(ChannelInfoViewEvent.RemoveMemberError.INSTANCE);
        return C23454a0.f92919a;
    }

    private final void removeMemberFromChannel(String memberId, Message systemMessage, Function1 onSuccess, Function1 onError) {
        AbstractC3006f0.m8732z(this.scope, null, null, new C194911(memberId, systemMessage, onSuccess, onError, null), 3);
    }

    private final void renameChannel(String name) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[renameChannel] name: ", name), null);
        }
        AbstractC3006f0.m8732z(this.scope, null, null, new C194922(name, null), 3);
    }

    private final void setChannelMute(boolean mute) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30462p("[setChannelMute] mute: ", mute), null);
        }
        AbstractC3006f0.m8732z(this.scope, null, null, new C194932(mute, this, null), 3);
    }

    private final void unbanMember(String memberId) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[unbanMember] memberId: ", memberId), null);
        }
        AbstractC3006f0.m8732z(this.scope, null, null, new C194942(memberId, null), 3);
    }

    private final void unblockUser(String userId) {
        if (userId == null) {
            return;
        }
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[unblockUser] userId: ".concat(userId), null);
        }
        AbstractC3006f0.m8732z(this.scope, null, null, new C194952(userId, null), 3);
    }

    public static /* synthetic */ void unblockUser$default(ChannelInfoViewController channelInfoViewController, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = channelInfoViewController.getDmMemberId();
        }
        channelInfoViewController.unblockUser(str);
    }

    private final void unmuteUser(String userId) {
        if (userId == null) {
            return;
        }
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[unmuteUser] userId: ".concat(userId), null);
        }
        AbstractC3006f0.m8732z(this.scope, null, null, new C194962(userId, null), 3);
    }

    public static /* synthetic */ void unmuteUser$default(ChannelInfoViewController channelInfoViewController, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = channelInfoViewController.getDmMemberId();
        }
        channelInfoViewController.unmuteUser(str);
    }

    public final void addMembers(Set<String> userIds) {
        AbstractC22676k.m65750j(userIds, "userIds");
        if (userIds.isEmpty()) {
            return;
        }
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[addMembers] userIds: " + userIds, null);
        }
        AbstractC3006f0.m8732z(this.scope, null, null, new C194862(userIds, null), 3);
    }

    public final InterfaceC13087t1 getEvents() {
        return this.events;
    }

    public final InterfaceC13037f2 getState() {
        return this.state;
    }

    public final void onMemberViewEvent(ChannelInfoMemberViewEvent event) {
        AbstractC22676k.m65750j(event, "event");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[onMemberViewEvent] event: " + event, null);
        }
        if (event instanceof ChannelInfoMemberViewEvent.MessageMember) {
            ChannelInfoMemberViewEvent.MessageMember messageMember = (ChannelInfoMemberViewEvent.MessageMember) event;
            if (messageMember.getDistinctCid() != null) {
                this._events.mo36564a(new ChannelInfoViewEvent.NavigateToChannel(messageMember.getDistinctCid()));
                return;
            } else {
                this._events.mo36564a(new ChannelInfoViewEvent.NavigateToDraftChannel(messageMember.getMemberId()));
                return;
            }
        }
        if (event instanceof ChannelInfoMemberViewEvent.MuteUser) {
            muteUser(((ChannelInfoMemberViewEvent.MuteUser) event).getMember().getUserId());
            return;
        }
        if (event instanceof ChannelInfoMemberViewEvent.UnmuteUser) {
            unmuteUser(((ChannelInfoMemberViewEvent.UnmuteUser) event).getMember().getUserId());
            return;
        }
        if (event instanceof ChannelInfoMemberViewEvent.BlockUser) {
            blockUser(((ChannelInfoMemberViewEvent.BlockUser) event).getMember().getUserId());
            return;
        }
        if (event instanceof ChannelInfoMemberViewEvent.UnblockUser) {
            unblockUser(((ChannelInfoMemberViewEvent.UnblockUser) event).getMember().getUserId());
            return;
        }
        if (event instanceof ChannelInfoMemberViewEvent.BanMember) {
            this._events.mo36564a(new ChannelInfoViewEvent.BanMemberModal(((ChannelInfoMemberViewEvent.BanMember) event).getMember()));
        } else if (event instanceof ChannelInfoMemberViewEvent.UnbanMember) {
            unbanMember(((ChannelInfoMemberViewEvent.UnbanMember) event).getMember().getUserId());
        } else {
            if (!(event instanceof ChannelInfoMemberViewEvent.RemoveMember)) {
                throw new NoWhenBranchMatchedException();
            }
            this._events.mo36564a(new ChannelInfoViewEvent.RemoveMemberModal(((ChannelInfoMemberViewEvent.RemoveMember) event).getMember()));
        }
    }

    public final void onViewAction(ChannelInfoViewAction action) {
        AbstractC22676k.m65750j(action, "action");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[onViewAction] action: " + action, null);
        }
        if (action instanceof ChannelInfoViewAction.ExpandMembersClick) {
            expandMembers();
            return;
        }
        if (action instanceof ChannelInfoViewAction.CollapseMembersClick) {
            collapseMembers();
            return;
        }
        if (action instanceof ChannelInfoViewAction.MemberClick) {
            memberClick((ChannelInfoViewAction.MemberClick) action);
            return;
        }
        if (action instanceof ChannelInfoViewAction.RenameChannelClick) {
            renameChannel(((ChannelInfoViewAction.RenameChannelClick) action).getName());
            return;
        }
        if (action instanceof ChannelInfoViewAction.PinnedMessagesClick) {
            this._events.mo36564a(ChannelInfoViewEvent.NavigateToPinnedMessages.INSTANCE);
            return;
        }
        if (action instanceof ChannelInfoViewAction.MediaAttachmentsClick) {
            this._events.mo36564a(ChannelInfoViewEvent.NavigateToMediaAttachments.INSTANCE);
            return;
        }
        if (action instanceof ChannelInfoViewAction.FilesAttachmentsClick) {
            this._events.mo36564a(ChannelInfoViewEvent.NavigateToFilesAttachments.INSTANCE);
            return;
        }
        if (action instanceof ChannelInfoViewAction.MuteChannelClick) {
            setChannelMute(true);
            return;
        }
        if (action instanceof ChannelInfoViewAction.UnmuteChannelClick) {
            setChannelMute(false);
            return;
        }
        if (action instanceof ChannelInfoViewAction.MuteUserClick) {
            muteUser$default(this, null, 1, null);
            return;
        }
        if (action instanceof ChannelInfoViewAction.UnmuteUserClick) {
            unmuteUser$default(this, null, 1, null);
            return;
        }
        if (action instanceof ChannelInfoViewAction.BlockUserClick) {
            blockUser$default(this, null, 1, null);
            return;
        }
        if (action instanceof ChannelInfoViewAction.UnblockUserClick) {
            unblockUser$default(this, null, 1, null);
            return;
        }
        if (action instanceof ChannelInfoViewAction.LeaveChannelClick) {
            this._events.mo36564a(ChannelInfoViewEvent.LeaveChannelModal.INSTANCE);
            return;
        }
        if (action instanceof ChannelInfoViewAction.LeaveChannelConfirmationClick) {
            leaveChannel(((ChannelInfoViewAction.LeaveChannelConfirmationClick) action).getQuitMessage());
            return;
        }
        if (action instanceof ChannelInfoViewAction.DeleteChannelClick) {
            this._events.mo36564a(ChannelInfoViewEvent.DeleteChannelModal.INSTANCE);
            return;
        }
        if (action instanceof ChannelInfoViewAction.DeleteChannelConfirmationClick) {
            deleteChannel();
            return;
        }
        if (action instanceof ChannelInfoViewAction.BanMemberConfirmationClick) {
            ChannelInfoViewAction.BanMemberConfirmationClick banMemberConfirmationClick = (ChannelInfoViewAction.BanMemberConfirmationClick) action;
            banMember(banMemberConfirmationClick.getMemberId(), banMemberConfirmationClick.getTimeoutInMinutes());
        } else {
            if (!(action instanceof ChannelInfoViewAction.RemoveMemberConfirmationClick)) {
                throw new NoWhenBranchMatchedException();
            }
            removeMember(((ChannelInfoViewAction.RemoveMemberConfirmationClick) action).getMemberId());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChannelInfoViewController(String str, InterfaceC2994c0 interfaceC2994c0, Function1 function1, ChatClient chatClient, InterfaceC13058l interfaceC13058l, ChannelClient channelClient, InterfaceC13058l interfaceC13058l2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        Function1 c19336c = (i13 & 4) != 0 ? new C19336c(16) : function1;
        ChatClient chatClientInstance = (i13 & 8) != 0 ? ChatClient.INSTANCE.instance() : chatClient;
        this(str, interfaceC2994c0, c19336c, chatClientInstance, (i13 & 16) != 0 ? new C4588i(ChatClientExtensions.watchChannelAsState(chatClientInstance, str, 0, interfaceC2994c0), 2) : interfaceC13058l, (i13 & 32) != 0 ? chatClientInstance.channel(str) : channelClient, (i13 & 64) != 0 ? ChatClientExtensions.getGlobalStateFlow(chatClientInstance) : interfaceC13058l2);
    }
}
