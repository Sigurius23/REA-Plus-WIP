package com.whoop.firmwareUpdateService.strategy;

import android.app.Activity;
import android.content.ComponentCallbacks;
import c93.InterfaceC4339a;
import hj0.InterfaceC17362u;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/firmwareUpdateService/strategy/NewDfuService;", "Lno/nordicsemi/android/dfu/DfuBaseService;", "<init>", "()V", "Ljava/lang/Class;", "Landroid/app/Activity;", "getNotificationTarget", "()Ljava/lang/Class;", "", "isDebug", "()Z", "Lhj0/u;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "i", "()Lhj0/u;", "whoopConfig", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class NewDfuService extends DfuBaseService {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h whoopConfig = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C8746a(this, null, null));

    /* JADX INFO: renamed from: com.whoop.firmwareUpdateService.strategy.NewDfuService$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8746a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26020w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26021x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26022y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8746a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26020w = componentCallbacks;
            this.f26021x = interfaceC35951a;
            this.f26022y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hj0.u, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC17362u invoke() {
            ComponentCallbacks componentCallbacks = this.f26020w;
            InterfaceC35951a interfaceC35951a = this.f26021x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26022y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC17362u.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: i */
    private final InterfaceC17362u m21434i() {
        return (InterfaceC17362u) this.whoopConfig.getValue();
    }

    @Override // no.nordicsemi.android.dfu.DfuBaseService
    public Class<? extends Activity> getNotificationTarget() {
        return m21434i().mo49165a();
    }

    @Override // no.nordicsemi.android.dfu.DfuBaseService
    public boolean isDebug() {
        return false;
    }
}
