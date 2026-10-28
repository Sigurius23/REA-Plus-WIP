package com.whoop.healthconnect;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import c93.InterfaceC4339a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.C28216y;
import p314m.AbstractActivityC24852m;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/healthconnect/HealthConnectRationaleActivity;", "Lm/m;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Lor2/y;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "o", "()Lor2/y;", "externalLinkNavigator", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class HealthConnectRationaleActivity extends AbstractActivityC24852m {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h externalLinkNavigator = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C8781a(this, null, null));

    /* JADX INFO: renamed from: com.whoop.healthconnect.HealthConnectRationaleActivity$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8781a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26178w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26179x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26180y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8781a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26178w = componentCallbacks;
            this.f26179x = interfaceC35951a;
            this.f26180y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.y] */
        @Override // c93.InterfaceC4339a
        public final C28216y invoke() {
            ComponentCallbacks componentCallbacks = this.f26178w;
            InterfaceC35951a interfaceC35951a = this.f26179x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26180y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28216y.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: o */
    private final C28216y m21521o() {
        return (C28216y) this.externalLinkNavigator.getValue();
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C28216y.m85414y(m21521o(), this, "https://www.whoop.com/privacy/full-privacy-policy", false, 4, null);
    }
}
