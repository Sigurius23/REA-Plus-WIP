package io.getstream.chat.android.p226ui.common.feature.channel.info;

import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ch.C4588i;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import fc3.C14380k;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api.state.ChatClientExtensions;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.ChannelData;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.Mute;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.common.state.channel.info.ChannelInfoMemberViewState;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l83.C23454a0;
import l83.InterfaceC23462h;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR#\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0006¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020*0-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00105\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010\u0018¨\u00066"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;", "", "", "cid", "memberId", "Lbc3/c0;", "scope", "Lio/getstream/chat/android/client/ChatClient;", "chatClient", "Lec3/l;", "Lio/getstream/chat/android/client/channel/state/ChannelState;", "channelState", "Lio/getstream/chat/android/client/api/state/GlobalState;", "globalState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lbc3/c0;Lio/getstream/chat/android/client/ChatClient;Lec3/l;Lec3/l;)V", "Lio/getstream/chat/android/models/Channel;", "queryDistinctChannel", "()Lec3/l;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction;", "action", "Ll83/a0;", "onViewAction", "(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction;)V", "Ljava/lang/String;", "Lbc3/c0;", "Lio/getstream/chat/android/client/ChatClient;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Lec3/f2;", "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoMemberViewState;", "state", "Lec3/f2;", "getState", "()Lec3/f2;", "getState$annotations", "()V", "Lec3/o1;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent;", "_events", "Lec3/o1;", "Lec3/t1;", "events", "Lec3/t1;", "getEvents", "()Lec3/t1;", "Lio/getstream/chat/android/models/Member;", "member", "Lio/getstream/chat/android/models/Member;", "distinctCid", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelInfoMemberViewController {
    public static final int $stable = 8;
    private final InterfaceC13072o1 _events;
    private final ChatClient chatClient;
    private String distinctCid;
    private final InterfaceC13087t1 events;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private Member member;
    private final String memberId;
    private final InterfaceC2994c0 scope;
    private final InterfaceC13037f2 state;

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoMemberViewController$queryDistinctChannel$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoMemberViewController$queryDistinctChannel$1", m100430f = "ChannelInfoMemberViewController.kt", m100431l = {131, 135, 139, 144}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lio/getstream/chat/android/models/Channel;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C194801 extends AbstractC32275i implements InterfaceC4351m {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;

        public C194801(InterfaceC30057d<? super C194801> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C194801 c194801 = ChannelInfoMemberViewController.this.new C194801(interfaceC30057d);
            c194801.L$0 = obj;
            return c194801;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C194801) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0118  */
        /* JADX WARN: Code duplicated, block: B:30:0x0125  */
        /* JADX WARN: Code duplicated, block: B:32:0x0135  */
        /* JADX WARN: Code duplicated, block: B:38:0x016f  */
        /* JADX WARN: Code duplicated, block: B:40:0x0185  */
        /* JADX WARN: Code duplicated, block: B:44:0x01b9  */
        /* JADX WARN: Code duplicated, block: B:48:0x01c1  */
        /* JADX WARN: Code duplicated, block: B:50:0x01c5  */
        /* JADX WARN: Code duplicated, block: B:52:0x01d5  */
        /* JADX WARN: Code duplicated, block: B:56:0x020a  */
        /* JADX WARN: Code duplicated, block: B:58:0x0210  */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0164, code lost:
        
            if (r1.emit(null, r28) == r2) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0168, code lost:
        
            r5 = r3;
            r3 = r4;
            r6 = r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x01b6, code lost:
        
            if (r1.emit(r6, r28) == r2) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0207, code lost:
        
            if (r1.emit(null, r28) == r2) goto L55;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r29) {
            /*
                Method dump skipped, instruction units count: 537
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.p226ui.common.feature.channel.info.ChannelInfoMemberViewController.C194801.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public ChannelInfoMemberViewController(String cid, String memberId, InterfaceC2994c0 scope, ChatClient chatClient, InterfaceC13058l channelState, InterfaceC13058l globalState) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(memberId, "memberId");
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(chatClient, "chatClient");
        AbstractC22676k.m65750j(channelState, "channelState");
        AbstractC22676k.m65750j(globalState, "globalState");
        this.memberId = memberId;
        this.scope = scope;
        this.chatClient = chatClient;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:ChannelInfoMemberViewController");
        final C14380k c14380kM36590P = AbstractC13091v.m36590P(globalState, new ChannelInfoMemberViewController$special$$inlined$flatMapLatest$1(null, channelState, this));
        this.state = AbstractC13091v.m36587M(new InterfaceC13058l() { // from class: io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoMemberViewController$special$$inlined$map$1

            /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoMemberViewController$special$$inlined$map$1$2 */
            @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final class C194812<T> implements InterfaceC13062m {
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;
                final /* synthetic */ ChannelInfoMemberViewController this$0;

                /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoMemberViewController$special$$inlined$map$1$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoMemberViewController$special$$inlined$map$1$2", m100430f = "ChannelInfoMemberViewController.kt", m100431l = {50}, m100432m = "emit")
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
                        return C194812.this.emit(null, this);
                    }
                }

                public C194812(InterfaceC13062m interfaceC13062m, ChannelInfoMemberViewController channelInfoMemberViewController) {
                    this.$this_unsafeFlow = interfaceC13062m;
                    this.this$0 = channelInfoMemberViewController;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    AnonymousClass1 anonymousClass1;
                    boolean z4;
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
                        ChannelInfoMemberData channelInfoMemberData = (ChannelInfoMemberData) obj;
                        this.this$0.member = channelInfoMemberData.getMember();
                        ChannelInfoMemberViewController channelInfoMemberViewController = this.this$0;
                        Channel distinctChannel = channelInfoMemberData.getDistinctChannel();
                        channelInfoMemberViewController.distinctCid = distinctChannel != null ? distinctChannel.getCid() : null;
                        Member member = channelInfoMemberData.getMember();
                        Set<String> ownCapabilities = channelInfoMemberData.getChannelData().getOwnCapabilities();
                        List<Mute> mutedUsers = channelInfoMemberData.getMutedUsers();
                        if (!(mutedUsers instanceof Collection) || !mutedUsers.isEmpty()) {
                            Iterator<T> it = mutedUsers.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z4 = false;
                                    break;
                                }
                                User target = ((Mute) it.next()).getTarget();
                                if (AbstractC22676k.m65745e(target != null ? target.getId() : null, this.this$0.memberId)) {
                                    z4 = true;
                                    break;
                                }
                            }
                        } else {
                            z4 = false;
                            break;
                        }
                        ChannelInfoMemberViewState.Content content = new ChannelInfoMemberViewState.Content(member, ownCapabilities, z4, channelInfoMemberData.getBlockedUserIds().contains(this.this$0.memberId));
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC13062m.emit(content, anonymousClass1) == enumC31071a) {
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
                Object objCollect = c14380kM36590P.collect(new C194812(interfaceC13062m, this), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }, scope, C13105z1.m36630a(2, 5000L), ChannelInfoMemberViewState.Loading.INSTANCE);
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 1, null, 5);
        this._events = c13096w1M36592b;
        this.events = AbstractC13091v.m36597g(c13096w1M36592b);
    }

    public static final /* synthetic */ Object access$state$lambda$4$lambda$3$lambda$2(ChannelData channelData, Member member, Channel channel, List list, List list2, InterfaceC30057d interfaceC30057d) {
        return new ChannelInfoMemberData(channelData, member, channel, list, list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    public static /* synthetic */ void getState$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC13058l queryDistinctChannel() {
        return new C13084s1(new C194801(null));
    }

    private static final /* synthetic */ Object state$lambda$4$lambda$3$lambda$2(ChannelData channelData, Member member, Channel channel, List list, List list2, InterfaceC30057d interfaceC30057d) {
        return new ChannelInfoMemberData(channelData, member, channel, list, list2);
    }

    public final InterfaceC13087t1 getEvents() {
        return this.events;
    }

    public final InterfaceC13037f2 getState() {
        return this.state;
    }

    public final void onViewAction(ChannelInfoMemberViewAction action) {
        AbstractC22676k.m65750j(action, "action");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[onViewAction] action: " + action, null);
        }
        if (action instanceof ChannelInfoMemberViewAction.MessageMemberClick) {
            this._events.mo36564a(new ChannelInfoMemberViewEvent.MessageMember(this.memberId, this.distinctCid));
            return;
        }
        if (action instanceof ChannelInfoMemberViewAction.MuteUserClick) {
            InterfaceC13072o1 interfaceC13072o1 = this._events;
            Member member = this.member;
            if (member != null) {
                interfaceC13072o1.mo36564a(new ChannelInfoMemberViewEvent.MuteUser(member));
                return;
            } else {
                AbstractC22676k.m65757q("member");
                throw null;
            }
        }
        if (action instanceof ChannelInfoMemberViewAction.UnmuteUserClick) {
            InterfaceC13072o1 interfaceC13072o2 = this._events;
            Member member2 = this.member;
            if (member2 != null) {
                interfaceC13072o2.mo36564a(new ChannelInfoMemberViewEvent.UnmuteUser(member2));
                return;
            } else {
                AbstractC22676k.m65757q("member");
                throw null;
            }
        }
        if (action instanceof ChannelInfoMemberViewAction.BlockUserClick) {
            InterfaceC13072o1 interfaceC13072o3 = this._events;
            Member member3 = this.member;
            if (member3 != null) {
                interfaceC13072o3.mo36564a(new ChannelInfoMemberViewEvent.BlockUser(member3));
                return;
            } else {
                AbstractC22676k.m65757q("member");
                throw null;
            }
        }
        if (action instanceof ChannelInfoMemberViewAction.UnblockUserClick) {
            InterfaceC13072o1 interfaceC13072o4 = this._events;
            Member member4 = this.member;
            if (member4 != null) {
                interfaceC13072o4.mo36564a(new ChannelInfoMemberViewEvent.UnblockUser(member4));
                return;
            } else {
                AbstractC22676k.m65757q("member");
                throw null;
            }
        }
        if (action instanceof ChannelInfoMemberViewAction.BanMemberClick) {
            InterfaceC13072o1 interfaceC13072o5 = this._events;
            Member member5 = this.member;
            if (member5 != null) {
                interfaceC13072o5.mo36564a(new ChannelInfoMemberViewEvent.BanMember(member5));
                return;
            } else {
                AbstractC22676k.m65757q("member");
                throw null;
            }
        }
        if (action instanceof ChannelInfoMemberViewAction.UnbanMemberClick) {
            InterfaceC13072o1 interfaceC13072o6 = this._events;
            Member member6 = this.member;
            if (member6 != null) {
                interfaceC13072o6.mo36564a(new ChannelInfoMemberViewEvent.UnbanMember(member6));
                return;
            } else {
                AbstractC22676k.m65757q("member");
                throw null;
            }
        }
        if (!(action instanceof ChannelInfoMemberViewAction.RemoveMemberClick)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC13072o1 interfaceC13072o7 = this._events;
        Member member7 = this.member;
        if (member7 != null) {
            interfaceC13072o7.mo36564a(new ChannelInfoMemberViewEvent.RemoveMember(member7));
        } else {
            AbstractC22676k.m65757q("member");
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChannelInfoMemberViewController(String str, String str2, InterfaceC2994c0 interfaceC2994c0, ChatClient chatClient, InterfaceC13058l interfaceC13058l, InterfaceC13058l interfaceC13058l2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        ChatClient chatClientInstance = (i13 & 8) != 0 ? ChatClient.INSTANCE.instance() : chatClient;
        this(str, str2, interfaceC2994c0, chatClientInstance, (i13 & 16) != 0 ? new C4588i(ChatClientExtensions.watchChannelAsState(chatClientInstance, str, 0, interfaceC2994c0), 2) : interfaceC13058l, (i13 & 32) != 0 ? ChatClientExtensions.getGlobalStateFlow(chatClientInstance) : interfaceC13058l2);
    }
}
