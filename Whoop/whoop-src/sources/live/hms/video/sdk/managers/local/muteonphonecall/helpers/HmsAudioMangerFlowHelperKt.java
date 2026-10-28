package live.hms.video.sdk.managers.local.muteonphonecall.helpers;

import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import dc3.InterfaceC11936u;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import java.util.concurrent.atomic.AtomicBoolean;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import live.hms.video.audio.AudioChangeEvent;
import live.hms.video.audio.AudioManagerFocusChangeCallbacks;
import live.hms.video.audio.HMSAudioManager;
import live.hms.video.events.AnalyticsEventsService;
import live.hms.video.media.settings.HMSAudioTrackSettings;
import live.hms.video.media.settings.PhoneCallState;
import p505ts.AbstractC34132o;
import p550vd.AbstractC35903f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Llive/hms/video/audio/HMSAudioManager;", "Llive/hms/video/events/AnalyticsEventsService;", "analyticsEventsService", "Llive/hms/video/media/settings/HMSAudioTrackSettings;", "audioSettings", "Lec3/l;", "Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneCallEvents;", "audioFocusFlow", "(Llive/hms/video/audio/HMSAudioManager;Llive/hms/video/events/AnalyticsEventsService;Llive/hms/video/media/settings/HMSAudioTrackSettings;)Lec3/l;", "lib_release"}, m65682k = 2, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HmsAudioMangerFlowHelperKt {

    /* JADX INFO: renamed from: live.hms.video.sdk.managers.local.muteonphonecall.helpers.HmsAudioMangerFlowHelperKt$audioFocusFlow$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.managers.local.muteonphonecall.helpers.HmsAudioMangerFlowHelperKt$audioFocusFlow$1", m100430f = "HmsAudioMangerFlowHelper.kt", m100431l = {69}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Ldc3/u;", "Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneCallEvents;", "Ll83/a0;", "<anonymous>", "(Ldc3/u;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C242681 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ AnalyticsEventsService $analyticsEventsService;
        final /* synthetic */ HMSAudioTrackSettings $audioSettings;
        final /* synthetic */ HMSAudioManager $this_audioFocusFlow;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242681(HMSAudioManager hMSAudioManager, HMSAudioTrackSettings hMSAudioTrackSettings, AnalyticsEventsService analyticsEventsService, InterfaceC30057d<? super C242681> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$this_audioFocusFlow = hMSAudioManager;
            this.$audioSettings = hMSAudioTrackSettings;
            this.$analyticsEventsService = analyticsEventsService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C23454a0 invokeSuspend$lambda$0(HMSAudioManager hMSAudioManager, C24269x21336908 c24269x21336908) {
            hMSAudioManager.removeAudioFocusChangeCallback(c24269x21336908);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C242681 c242681 = new C242681(this.$this_audioFocusFlow, this.$audioSettings, this.$analyticsEventsService, interfaceC30057d);
            c242681.L$0 = obj;
            return c242681;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC11936u interfaceC11936u, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C242681) create(interfaceC11936u, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [live.hms.video.audio.AudioManagerFocusChangeCallbacks, live.hms.video.sdk.managers.local.muteonphonecall.helpers.HmsAudioMangerFlowHelperKt$audioFocusFlow$1$focusChangeTransformer$1] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                final InterfaceC11936u interfaceC11936u = (InterfaceC11936u) this.L$0;
                final HMSAudioTrackSettings hMSAudioTrackSettings = this.$audioSettings;
                final AnalyticsEventsService analyticsEventsService = this.$analyticsEventsService;
                final ?? r10 = new AudioManagerFocusChangeCallbacks() { // from class: live.hms.video.sdk.managers.local.muteonphonecall.helpers.HmsAudioMangerFlowHelperKt$audioFocusFlow$1$focusChangeTransformer$1
                    private final AtomicBoolean interruptStarted = new AtomicBoolean(false);

                    /* JADX INFO: renamed from: live.hms.video.sdk.managers.local.muteonphonecall.helpers.HmsAudioMangerFlowHelperKt$audioFocusFlow$1$focusChangeTransformer$1$WhenMappings */
                    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[AudioChangeEvent.values().length];
                            try {
                                iArr[AudioChangeEvent.AUDIOFOCUS_GAIN.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[AudioChangeEvent.PHONE_RINGING.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[AudioChangeEvent.AUDIOFOCUS_LOSS_TRANSIENT.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    public final AtomicBoolean getInterruptStarted() {
                        return this.interruptStarted;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                    @Override // live.hms.video.audio.AudioManagerFocusChangeCallbacks
                    public void onAudioFocusChange(AudioChangeEvent event) {
                        Boolean bool;
                        AbstractC22676k.m65750j(event, "event");
                        int i14 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
                        if (i14 == 1) {
                            AbstractC35903f.m114004X(interfaceC11936u, PhoneCallEvents.UNMUTE_ALL.INSTANCE);
                            if (this.interruptStarted.get()) {
                                this.interruptStarted.set(false);
                                bool = Boolean.FALSE;
                            } else {
                                bool = null;
                            }
                        } else if (i14 == 2) {
                            HMSAudioTrackSettings hMSAudioTrackSettings2 = hMSAudioTrackSettings;
                            if ((hMSAudioTrackSettings2 != null ? hMSAudioTrackSettings2.getPhoneCallState() : null) == PhoneCallState.DISABLE_MUTE_ON_VOIP_PHONE_CALL_RING) {
                                AbstractC35903f.m114004X(interfaceC11936u, PhoneCallEvents.MUTE_ALL.INSTANCE);
                            }
                            if (this.interruptStarted.get()) {
                                bool = null;
                            } else {
                                this.interruptStarted.set(true);
                                bool = Boolean.TRUE;
                            }
                        } else if (i14 == 3) {
                            HMSAudioTrackSettings hMSAudioTrackSettings3 = hMSAudioTrackSettings;
                            if ((hMSAudioTrackSettings3 != null ? hMSAudioTrackSettings3.getPhoneCallState() : null) == PhoneCallState.ENABLE_MUTE_ON_PHONE_CALL_RING) {
                                AbstractC35903f.m114004X(interfaceC11936u, PhoneCallEvents.MUTE_ALL.INSTANCE);
                            }
                            if (this.interruptStarted.get()) {
                                bool = null;
                            } else {
                                this.interruptStarted.set(true);
                                bool = Boolean.TRUE;
                            }
                        } else {
                            bool = null;
                        }
                        C22365e c22365e = AbstractC3050q0.f12077a;
                        AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(ExecutorC22364d.f87316w), null, null, new C24270xb7f08f5a(bool, analyticsEventsService, null), 3);
                    }
                };
                this.$this_audioFocusFlow.addAudioFocusChangeCallback(r10);
                final HMSAudioManager hMSAudioManager = this.$this_audioFocusFlow;
                InterfaceC4339a interfaceC4339a = new InterfaceC4339a() { // from class: live.hms.video.sdk.managers.local.muteonphonecall.helpers.a
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        return HmsAudioMangerFlowHelperKt.C242681.invokeSuspend$lambda$0(hMSAudioManager, r10);
                    }
                };
                this.label = 1;
                if (AbstractC37056f.m118984h(interfaceC11936u, interfaceC4339a, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    public static final InterfaceC13058l audioFocusFlow(HMSAudioManager hMSAudioManager, AnalyticsEventsService analyticsEventsService, HMSAudioTrackSettings hMSAudioTrackSettings) {
        AbstractC22676k.m65750j(hMSAudioManager, "<this>");
        AbstractC22676k.m65750j(analyticsEventsService, "analyticsEventsService");
        return AbstractC13091v.m36600j(new C242681(hMSAudioManager, hMSAudioTrackSettings, analyticsEventsService, null));
    }
}
