package live.hms.video.sdk.managers.local.muteonphonecall.helpers;

import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13052j1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import live.hms.video.sdk.managers.local.muteonphonecall.PeersMuteState;
import live.hms.video.sdk.models.enums.HMSRoomUpdate;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JS\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;", "", "<init>", "()V", "Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/ILocalMediaControl;", "localMc", "Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/IPeerMediaControl;", "peerMc", "Lkotlin/Function0;", "", "enabled", "Lec3/l;", "Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneCallEvents;", "audioFocusFlow", "Lkotlin/Function1;", "Llive/hms/video/sdk/models/enums/HMSRoomUpdate;", "Ll83/a0;", "fireRoomMuteUpdate", "execute", "(Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/ILocalMediaControl;Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/IPeerMediaControl;Lc93/a;Lec3/l;Lkotlin/jvm/functions/Function1;)Lec3/l;", "prevLocalAudioState", "Ljava/lang/Boolean;", "prevLocalVideoState", "Llive/hms/video/sdk/managers/local/muteonphonecall/PeersMuteState;", "prevPeerAudioState", "Llive/hms/video/sdk/managers/local/muteonphonecall/PeersMuteState;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class PhoneMutingUseCase {
    private Boolean prevLocalAudioState;
    private Boolean prevLocalVideoState;
    private PeersMuteState prevPeerAudioState;

    /* JADX INFO: renamed from: live.hms.video.sdk.managers.local.muteonphonecall.helpers.PhoneMutingUseCase$execute$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.managers.local.muteonphonecall.helpers.PhoneMutingUseCase$execute$2", m100430f = "PhoneMutingUseCase.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneCallEvents;", "phoneInterruptEvents", "Ll83/a0;", "<anonymous>", "(Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneCallEvents;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C242722 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ Function1 $fireRoomMuteUpdate;
        final /* synthetic */ ILocalMediaControl $localMc;
        final /* synthetic */ IPeerMediaControl $peerMc;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242722(ILocalMediaControl iLocalMediaControl, IPeerMediaControl iPeerMediaControl, Function1 function1, InterfaceC30057d<? super C242722> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$localMc = iLocalMediaControl;
            this.$peerMc = iPeerMediaControl;
            this.$fireRoomMuteUpdate = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C242722 c242722 = PhoneMutingUseCase.this.new C242722(this.$localMc, this.$peerMc, this.$fireRoomMuteUpdate, interfaceC30057d);
            c242722.L$0 = obj;
            return c242722;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            PhoneCallEvents phoneCallEvents = (PhoneCallEvents) this.L$0;
            if (AbstractC22676k.m65745e(phoneCallEvents, PhoneCallEvents.MUTE_ALL.INSTANCE)) {
                PhoneMutingUseCase.this.prevLocalAudioState = this.$localMc.isLocalAudioEnabled();
                PhoneMutingUseCase.this.prevLocalVideoState = this.$localMc.isLocalVideoEnabled();
                PhoneMutingUseCase.this.prevPeerAudioState = this.$peerMc.peerAudioState();
                this.$localMc.setLocalAudioEnabled(false);
                this.$localMc.setLocalVideoEnabled(false);
                this.$peerMc.setPeerAudioState(PeersMuteState.PEERS_MUTE, false);
                this.$fireRoomMuteUpdate.invoke(HMSRoomUpdate.ROOM_MUTED);
            } else {
                if (!AbstractC22676k.m65745e(phoneCallEvents, PhoneCallEvents.UNMUTE_ALL.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                Boolean bool = PhoneMutingUseCase.this.prevLocalAudioState;
                if (bool != null) {
                    this.$localMc.setLocalAudioEnabled(bool.booleanValue());
                }
                Boolean bool2 = PhoneMutingUseCase.this.prevLocalVideoState;
                if (bool2 != null) {
                    this.$localMc.setLocalVideoEnabled(bool2.booleanValue());
                }
                PeersMuteState peersMuteState = PhoneMutingUseCase.this.prevPeerAudioState;
                if (peersMuteState != null) {
                    this.$peerMc.setPeerAudioState(peersMuteState, true);
                }
                this.$fireRoomMuteUpdate.invoke(HMSRoomUpdate.ROOM_UNMUTED);
            }
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(PhoneCallEvents phoneCallEvents, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C242722) create(phoneCallEvents, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public final InterfaceC13058l execute(ILocalMediaControl localMc, IPeerMediaControl peerMc, final InterfaceC4339a enabled, InterfaceC13058l audioFocusFlow, Function1 fireRoomMuteUpdate) {
        AbstractC22676k.m65750j(localMc, "localMc");
        AbstractC22676k.m65750j(peerMc, "peerMc");
        AbstractC22676k.m65750j(enabled, "enabled");
        AbstractC22676k.m65750j(audioFocusFlow, "audioFocusFlow");
        AbstractC22676k.m65750j(fireRoomMuteUpdate, "fireRoomMuteUpdate");
        final InterfaceC13058l interfaceC13058lM36610t = AbstractC13091v.m36610t(audioFocusFlow);
        return new C13052j1(new InterfaceC13058l() { // from class: live.hms.video.sdk.managers.local.muteonphonecall.helpers.PhoneMutingUseCase$execute$$inlined$filter$1

            /* JADX INFO: renamed from: live.hms.video.sdk.managers.local.muteonphonecall.helpers.PhoneMutingUseCase$execute$$inlined$filter$1$2 */
            @Metadata(m65680d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"T", "R", "value", "Ll83/a0;", "emit", "(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 0, 0})
            public static final class C242712<T> implements InterfaceC13062m {
                final /* synthetic */ InterfaceC4339a $enabled$inlined;
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;

                /* JADX INFO: renamed from: live.hms.video.sdk.managers.local.muteonphonecall.helpers.PhoneMutingUseCase$execute$$inlined$filter$1$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "live.hms.video.sdk.managers.local.muteonphonecall.helpers.PhoneMutingUseCase$execute$$inlined$filter$1$2", m100430f = "PhoneMutingUseCase.kt", m100431l = {223}, m100432m = "emit")
                @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
                public static final class AnonymousClass1 extends AbstractC32269c {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C242712.this.emit(null, this);
                    }
                }

                public C242712(InterfaceC13062m interfaceC13062m, InterfaceC4339a interfaceC4339a) {
                    this.$this_unsafeFlow = interfaceC13062m;
                    this.$enabled$inlined = interfaceC4339a;
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
                        if (((Boolean) this.$enabled$inlined.invoke()).booleanValue()) {
                            anonymousClass1.label = 1;
                            if (interfaceC13062m.emit(obj, anonymousClass1) == enumC31071a) {
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
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = interfaceC13058lM36610t.collect(new C242712(interfaceC13062m, enabled), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }, new C242722(localMc, peerMc, fireRoomMuteUpdate, null), 0);
    }
}
