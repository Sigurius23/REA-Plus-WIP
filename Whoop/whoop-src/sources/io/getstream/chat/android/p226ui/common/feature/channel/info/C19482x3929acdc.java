package io.getstream.chat.android.p226ui.common.feature.channel.info;

import a63.C0493j;
import ec3.AbstractC13091v;
import ec3.C13052j1;
import ec3.C13068n1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fc3.AbstractC14371b;
import io.getstream.chat.android.client.api.state.GlobalState;
import io.getstream.chat.android.client.channel.state.ChannelState;
import io.getstream.chat.android.models.Member;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoMemberViewController$state$lambda$4$$inlined$flatMapLatest$1 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoMemberViewController$state$lambda$4$$inlined$flatMapLatest$1", m100430f = "ChannelInfoMemberViewController.kt", m100431l = {189}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class C19482x3929acdc extends AbstractC32275i implements Function3 {
    final /* synthetic */ GlobalState $global$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ ChannelInfoMemberViewController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19482x3929acdc(InterfaceC30057d interfaceC30057d, ChannelInfoMemberViewController channelInfoMemberViewController, GlobalState globalState) {
        super(3, interfaceC30057d);
        this.this$0 = channelInfoMemberViewController;
        this.$global$inlined = globalState;
    }

    public final Object invoke(InterfaceC13062m interfaceC13062m, ChannelState channelState, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C19482x3929acdc c19482x3929acdc = new C19482x3929acdc(interfaceC30057d, this.this$0, this.$global$inlined);
        c19482x3929acdc.L$0 = interfaceC13062m;
        c19482x3929acdc.L$1 = channelState;
        return c19482x3929acdc.invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.L$0;
            ChannelState channelState = (ChannelState) this.L$1;
            InterfaceC13037f2 channelData = channelState.getChannelData();
            final InterfaceC13037f2 members = channelState.getMembers();
            final ChannelInfoMemberViewController channelInfoMemberViewController = this.this$0;
            C13052j1 c13052j1 = new C13052j1(new InterfaceC13058l() { // from class: io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoMemberViewController$state$lambda$4$lambda$3$$inlined$mapNotNull$1

                /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoMemberViewController$state$lambda$4$lambda$3$$inlined$mapNotNull$1$2, reason: invalid class name */
                @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
                public static final class AnonymousClass2<T> implements InterfaceC13062m {
                    final /* synthetic */ InterfaceC13062m $this_unsafeFlow;
                    final /* synthetic */ ChannelInfoMemberViewController this$0;

                    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoMemberViewController$state$lambda$4$lambda$3$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoMemberViewController$state$lambda$4$lambda$3$$inlined$mapNotNull$1$2", m100430f = "ChannelInfoMemberViewController.kt", m100431l = {54}, m100432m = "emit")
                    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
                    public static final class AnonymousClass1 extends AbstractC32269c {
                        int I$0;
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        Object L$4;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(InterfaceC30057d interfaceC30057d) {
                            super(interfaceC30057d);
                        }

                        @Override // s83.AbstractC32267a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(InterfaceC13062m interfaceC13062m, ChannelInfoMemberViewController channelInfoMemberViewController) {
                        this.$this_unsafeFlow = interfaceC13062m;
                        this.this$0 = channelInfoMemberViewController;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // ec3.InterfaceC13062m
                    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                        AnonymousClass1 anonymousClass1;
                        Object next;
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
                            Iterator<T> it = ((List) obj).iterator();
                            do {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (!AbstractC22676k.m65745e(((Member) next).getUserId(), this.this$0.memberId));
                            if (next != null) {
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.L$4 = null;
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                if (interfaceC13062m.emit(next, anonymousClass1) == enumC31071a) {
                                    return enumC31071a;
                                }
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
                public final Object collect(InterfaceC13062m interfaceC13062m2, InterfaceC30057d interfaceC30057d) {
                    Object objCollect = members.collect(new AnonymousClass2(interfaceC13062m2, channelInfoMemberViewController), interfaceC30057d);
                    return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
                }
            }, new ChannelInfoMemberViewController$state$1$1$2(channelInfoMemberViewController, null), 0);
            InterfaceC13058l interfaceC13058lQueryDistinctChannel = this.this$0.queryDistinctChannel();
            InterfaceC13037f2 muted = this.$global$inlined.getMuted();
            InterfaceC13037f2 blockedUserIds = this.$global$inlined.getBlockedUserIds();
            ChannelInfoMemberViewController$state$1$1$5 channelInfoMemberViewController$state$1$1$5 = ChannelInfoMemberViewController$state$1$1$5.INSTANCE;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            AbstractC13091v.m36615y(interfaceC13062m);
            Object objM41038a = AbstractC14371b.m41038a(C13068n1.f45159w, interfaceC13062m, new C0493j((InterfaceC30057d) null, channelInfoMemberViewController$state$1$1$5, 7), this, new InterfaceC13058l[]{channelData, c13052j1, interfaceC13058lQueryDistinctChannel, muted, blockedUserIds});
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
        return invoke((InterfaceC13062m) obj, (ChannelState) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
    }
}
