package live.hms.video.sdk.managers.local.muteonphonecall.helpers;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import live.hms.video.events.AnalyticsEventFactory;
import live.hms.video.events.AnalyticsEventsService;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: live.hms.video.sdk.managers.local.muteonphonecall.helpers.HmsAudioMangerFlowHelperKt$audioFocusFlow$1$focusChangeTransformer$1$onAudioFocusChange$1 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "live.hms.video.sdk.managers.local.muteonphonecall.helpers.HmsAudioMangerFlowHelperKt$audioFocusFlow$1$focusChangeTransformer$1$onAudioFocusChange$1", m100430f = "HmsAudioMangerFlowHelper.kt", m100431l = {}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
public final class C24270xb7f08f5a extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ AnalyticsEventsService $analyticsEventsService;
    final /* synthetic */ Boolean $focusOwned;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24270xb7f08f5a(Boolean bool, AnalyticsEventsService analyticsEventsService, InterfaceC30057d<? super C24270xb7f08f5a> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.$focusOwned = bool;
        this.$analyticsEventsService = analyticsEventsService;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new C24270xb7f08f5a(this.$focusOwned, this.$analyticsEventsService, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((C24270xb7f08f5a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        Boolean bool = this.$focusOwned;
        if (bool != null) {
            this.$analyticsEventsService.queue(AnalyticsEventFactory.interruptionState$default(AnalyticsEventFactory.INSTANCE, bool.booleanValue(), null, 2, null)).flush();
        }
        return C23454a0.f92919a;
    }
}
