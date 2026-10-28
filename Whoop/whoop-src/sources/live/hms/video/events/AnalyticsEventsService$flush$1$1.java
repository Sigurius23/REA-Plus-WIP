package live.hms.video.events;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import live.hms.video.database.entity.AnalyticsEntityModel;
import live.hms.video.viewModels.OfflineAnalyticsManager;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "live.hms.video.events.AnalyticsEventsService$flush$1$1", m100430f = "AnalyticsEventsService.kt", m100431l = {137}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
public final class AnalyticsEventsService$flush$1$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ AnalyticsEvent $event;
    final /* synthetic */ AnalyticsEntityModel $logEntityModel;
    int label;
    final /* synthetic */ AnalyticsEventsService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsEventsService$flush$1$1(AnalyticsEventsService analyticsEventsService, AnalyticsEntityModel analyticsEntityModel, AnalyticsEvent analyticsEvent, InterfaceC30057d<? super AnalyticsEventsService$flush$1$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = analyticsEventsService;
        this.$logEntityModel = analyticsEntityModel;
        this.$event = analyticsEvent;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new AnalyticsEventsService$flush$1$1(this.this$0, this.$logEntityModel, this.$event, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((AnalyticsEventsService$flush$1$1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            OfflineAnalyticsManager offlineAnalyticsManager = this.this$0.offlineAnalyticsManager;
            AnalyticsEntityModel analyticsEntityModel = this.$logEntityModel;
            this.label = 1;
            obj = offlineAnalyticsManager.flushLog(analyticsEntityModel, this);
            if (obj == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            this.this$0.pendingEvents.remove(this.$event);
        } else {
            this.this$0.offlineAnalyticsManager.persistLog(this.$logEntityModel);
        }
        return C23454a0.f92919a;
    }
}
