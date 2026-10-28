package live.hms.video.sdk.managers.local.muteonphonecall;

import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import l80.C23434k;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.media.tracks.HMSLocalAudioTrack;
import live.hms.video.media.tracks.HMSLocalVideoTrack;
import live.hms.video.media.tracks.HMSRemoteAudioTrack;
import live.hms.video.sdk.SDKStore;
import live.hms.video.sdk.managers.local.muteonphonecall.helpers.ILocalMediaControl;
import live.hms.video.sdk.managers.local.muteonphonecall.helpers.IPeerMediaControl;
import live.hms.video.sdk.managers.local.muteonphonecall.helpers.PhoneMutingUseCase;
import live.hms.video.sdk.models.HMSLocalPeer;
import live.hms.video.sdk.models.SDKUpdate;
import live.hms.video.sdk.models.enums.HMSRoomUpdate;
import live.hms.video.sdk.models.enums.HMSTrackUpdate;
import live.hms.video.utils.HMSLogger;
import m83.AbstractC25267u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22691v;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0015\u001a\u00020\u000f2\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f2\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, m65681d2 = {"Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;", "Ljava/io/Closeable;", "Llive/hms/video/sdk/SDKStore;", "store", "Lec3/l;", "Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneCallEvents;", "audioFocusFlow", "<init>", "(Llive/hms/video/sdk/SDKStore;Lec3/l;)V", "Llive/hms/video/sdk/managers/local/muteonphonecall/PeersMuteState;", "peerAudioState", "()Llive/hms/video/sdk/managers/local/muteonphonecall/PeersMuteState;", "Lkotlin/Function1;", "", "Llive/hms/video/sdk/models/SDKUpdate;", "Ll83/a0;", "fireUpdates", "onPhoneCallManager", "(Lkotlin/jvm/functions/Function1;)Lec3/l;", "Lbc3/c0;", "scope", "initPhoneCallManager", "(Lkotlin/jvm/functions/Function1;Lbc3/c0;)V", "close", "()V", "Llive/hms/video/sdk/SDKStore;", "Lec3/l;", "", "TAG", "Ljava/lang/String;", "Lbc3/k1;", "phoneCallManagerJob", "Lbc3/k1;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class MuteOnPhoneCallManager implements Closeable {
    private final String TAG;
    private final InterfaceC13058l audioFocusFlow;
    private InterfaceC3027k1 phoneCallManagerJob;
    private final SDKStore store;

    /* JADX INFO: renamed from: live.hms.video.sdk.managers.local.muteonphonecall.MuteOnPhoneCallManager$onPhoneCallManager$3 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.managers.local.muteonphonecall.MuteOnPhoneCallManager$onPhoneCallManager$3", m100430f = "MuteOnPhoneCallManager.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lec3/m;", "Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneCallEvents;", "", "exception", "Ll83/a0;", "<anonymous>", "(Lec3/m;Ljava/lang/Throwable;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C242673 extends AbstractC32275i implements Function3 {
        /* synthetic */ Object L$0;
        int label;

        public C242673(InterfaceC30057d<? super C242673> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC13062m interfaceC13062m, Throwable th3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C242673 c242673 = MuteOnPhoneCallManager.this.new C242673(interfaceC30057d);
            c242673.L$0 = th3;
            return c242673.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            Throwable th3 = (Throwable) this.L$0;
            HMSLogger.m71137e(MuteOnPhoneCallManager.this.TAG, "Got coroutine exception " + th3);
            throw th3;
        }
    }

    public MuteOnPhoneCallManager(SDKStore store, InterfaceC13058l audioFocusFlow) {
        AbstractC22676k.m65750j(store, "store");
        AbstractC22676k.m65750j(audioFocusFlow, "audioFocusFlow");
        this.store = store;
        this.audioFocusFlow = audioFocusFlow;
        this.TAG = "MuteOnPhoneCallManager";
    }

    public static void initPhoneCallManager$default(MuteOnPhoneCallManager muteOnPhoneCallManager, Function1 function1, InterfaceC2994c0 interfaceC2994c0, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            interfaceC2994c0 = AbstractC3006f0.m8708b(AbstractC3050q0.f12077a);
        }
        muteOnPhoneCallManager.initPhoneCallManager(function1, interfaceC2994c0);
    }

    private final InterfaceC13058l onPhoneCallManager(final Function1 fireUpdates) {
        return new C13015a0(new PhoneMutingUseCase().execute(new ILocalMediaControl() { // from class: live.hms.video.sdk.managers.local.muteonphonecall.MuteOnPhoneCallManager$onPhoneCallManager$localMc$1
            @Override // live.hms.video.sdk.managers.local.muteonphonecall.helpers.ILocalMediaControl
            public Boolean isLocalAudioEnabled() {
                HMSLocalAudioTrack audioTrack;
                HMSLocalPeer localPeer = this.this$0.store.getLocalPeer();
                if (localPeer == null || (audioTrack = localPeer.getAudioTrack()) == null) {
                    return null;
                }
                return Boolean.valueOf(!audioTrack.getIsMute());
            }

            @Override // live.hms.video.sdk.managers.local.muteonphonecall.helpers.ILocalMediaControl
            public Boolean isLocalVideoEnabled() {
                HMSLocalVideoTrack videoTrack;
                HMSLocalPeer localPeer = this.this$0.store.getLocalPeer();
                if (localPeer == null || (videoTrack = localPeer.getVideoTrack()) == null) {
                    return null;
                }
                return Boolean.valueOf(!videoTrack.getIsMute());
            }

            @Override // live.hms.video.sdk.managers.local.muteonphonecall.helpers.ILocalMediaControl
            public void setLocalAudioEnabled(boolean enabled) {
                HMSLocalPeer localPeer = this.this$0.store.getLocalPeer();
                if (localPeer != null) {
                    Function1 function1 = fireUpdates;
                    HMSLocalAudioTrack audioTrack = localPeer.getAudioTrack();
                    if (audioTrack != null) {
                        audioTrack.setMute(!enabled);
                        function1.invoke(AbstractC37056f.m118958J(new SDKUpdate.Track(enabled ? HMSTrackUpdate.TRACK_UNMUTED : HMSTrackUpdate.TRACK_MUTED, audioTrack, localPeer)));
                    }
                }
            }

            @Override // live.hms.video.sdk.managers.local.muteonphonecall.helpers.ILocalMediaControl
            public void setLocalVideoEnabled(boolean enabled) {
                HMSLocalPeer localPeer = this.this$0.store.getLocalPeer();
                if (localPeer != null) {
                    Function1 function1 = fireUpdates;
                    HMSLocalVideoTrack videoTrack = localPeer.getVideoTrack();
                    if (videoTrack != null) {
                        videoTrack.setMute(!enabled);
                        function1.invoke(AbstractC37056f.m118958J(new SDKUpdate.Track(enabled ? HMSTrackUpdate.TRACK_UNMUTED : HMSTrackUpdate.TRACK_MUTED, videoTrack, localPeer)));
                    }
                }
            }
        }, new IPeerMediaControl() { // from class: live.hms.video.sdk.managers.local.muteonphonecall.MuteOnPhoneCallManager$onPhoneCallManager$peerMc$1

            @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[PeersMuteState.values().length];
                    try {
                        iArr[PeersMuteState.NO_PEERS.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PeersMuteState.PEERS_MUTE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[PeersMuteState.PEERS_UNMUTED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // live.hms.video.sdk.managers.local.muteonphonecall.helpers.IPeerMediaControl
            public PeersMuteState peerAudioState() {
                return this.this$0.peerAudioState();
            }

            @Override // live.hms.video.sdk.managers.local.muteonphonecall.helpers.IPeerMediaControl
            public void setPeerAudioState(PeersMuteState setMuteState, boolean hasCallEnded) {
                AbstractC22676k.m65750j(setMuteState, "setMuteState");
                HMSLogger hMSLogger = HMSLogger.INSTANCE;
                hMSLogger.m71140v(this.this$0.TAG, "Audio mute/unmute of all remote tracks? " + setMuteState);
                int i13 = WhenMappings.$EnumSwitchMapping$0[setMuteState.ordinal()];
                if (i13 == 1) {
                    this.this$0.store.setLocalTracksMute(false);
                    this.this$0.store.muteAllRemoteTracks(false);
                } else if (i13 == 2) {
                    this.this$0.store.setLocalTracksMute(!hasCallEnded);
                    this.this$0.store.muteAllRemoteTracks(true);
                } else {
                    if (i13 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.this$0.store.setLocalTracksMute(false);
                    this.this$0.store.muteAllRemoteTracks(false);
                }
                hMSLogger.m71140v(this.this$0.TAG, "Completed Audio mute/unmute of all remote tracks? " + setMuteState);
            }
        }, new AbstractC22691v(this.store) { // from class: live.hms.video.sdk.managers.local.muteonphonecall.MuteOnPhoneCallManager.onPhoneCallManager.1
            @Override // j93.InterfaceC21488u
            public Object get() {
                return Boolean.valueOf(((SDKStore) this.receiver).getHasLocalPeer());
            }
        }, this.audioFocusFlow, new C23434k(fireUpdates, 10)), new C242673(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 onPhoneCallManager$lambda$2(Function1 fireUpdates, HMSRoomUpdate it) {
        AbstractC22676k.m65750j(fireUpdates, "$fireUpdates");
        AbstractC22676k.m65750j(it, "it");
        fireUpdates.invoke(AbstractC37056f.m118958J(new SDKUpdate.Room(it)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PeersMuteState peerAudioState() {
        Object next;
        HMSLogger.INSTANCE.m71140v(this.TAG, "Checking if peers are muted");
        List<C23465k> remoteTrackCopy = this.store.getRemoteTrackCopy();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(remoteTrackCopy, 10));
        Iterator<T> it = remoteTrackCopy.iterator();
        while (it.hasNext()) {
            arrayList.add(((SDKStore.TrackTimePair) ((C23465k) it.next()).f92938x).getTrack());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof HMSRemoteAudioTrack) {
                arrayList2.add(obj);
            }
        }
        HMSLogger.INSTANCE.m71140v(this.TAG, "Received " + arrayList2.size() + " to check");
        Iterator it3 = arrayList2.iterator();
        do {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
        } while (((HMSRemoteAudioTrack) next).getVolume() == 0.0d);
        PeersMuteState peersMuteState = next != null ? PeersMuteState.PEERS_UNMUTED : arrayList2.isEmpty() ? PeersMuteState.NO_PEERS : PeersMuteState.PEERS_MUTE;
        HMSLogger.INSTANCE.m71140v(this.TAG, "Done checking if peers are muted");
        return peersMuteState;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InterfaceC3027k1 interfaceC3027k1 = this.phoneCallManagerJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
    }

    public final void initPhoneCallManager(Function1 fireUpdates, InterfaceC2994c0 scope) {
        AbstractC22676k.m65750j(fireUpdates, "fireUpdates");
        AbstractC22676k.m65750j(scope, "scope");
        this.phoneCallManagerJob = AbstractC13091v.m36582H(onPhoneCallManager(fireUpdates), scope);
    }
}
