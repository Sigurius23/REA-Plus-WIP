package h53;

import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import c93.InterfaceC4351m;
import i53.AbstractC18138j;
import i53.AbstractC18147s;
import i53.C18130b;
import i53.C18131c;
import i53.C18134f;
import i53.C18139k;
import i53.C18141m;
import i53.C18143o;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import qg3.C30352d;

/* JADX INFO: renamed from: h53.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C16943h extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f65024w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C30352d f65025x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16943h(C30352d c30352d, int i13) {
        super(2);
        this.f65024w = i13;
        this.f65025x = c30352d;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f65024w) {
            case 0:
                AbstractC18138j state = (AbstractC18138j) obj;
                AbstractC18147s event = (AbstractC18147s) obj2;
                AbstractC22676k.m65750j(state, "state");
                AbstractC22676k.m65750j(event, "event");
                C30352d c30352d = this.f65025x;
                C2345k c2345kM92818r = c30352d.m92818r();
                InterfaceC2339e interfaceC2339e = c2345kM92818r.f9275c;
                EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                String str = c2345kM92818r.f9273a;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    c2345kM92818r.f9274b.log(enumC2341g, str, "current state: " + state + ", event " + event, null);
                }
                if (!(event instanceof C18139k)) {
                    return state;
                }
                C2345k c2345kM92818r2 = c30352d.m92818r();
                InterfaceC2339e interfaceC2339e2 = c2345kM92818r2.f9275c;
                String str2 = c2345kM92818r2.f9273a;
                if (interfaceC2339e2.isLoggable(enumC2341g, str2)) {
                    c2345kM92818r2.f9274b.log(enumC2341g, str2, "SfuSocketStateEvent.Connect", null);
                }
                C18139k c18139k = (C18139k) event;
                return new C18130b(c18139k.f70434a, c18139k.f70435b);
            case 1:
                C18134f onEvent = (C18134f) obj;
                C18141m it = (C18141m) obj2;
                AbstractC22676k.m65750j(onEvent, "$this$onEvent");
                AbstractC22676k.m65750j(it, "it");
                return (AbstractC18138j) this.f65025x.m92819s().f168689d.getValue();
            default:
                C18131c onEvent2 = (C18131c) obj;
                C18143o it3 = (C18143o) obj2;
                AbstractC22676k.m65750j(onEvent2, "$this$onEvent");
                AbstractC22676k.m65750j(it3, "it");
                return (AbstractC18138j) this.f65025x.m92819s().f168689d.getValue();
        }
    }
}
