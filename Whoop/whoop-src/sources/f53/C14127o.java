package f53;

import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import c93.InterfaceC4351m;
import g53.AbstractC15508m;
import g53.AbstractC15519x;
import g53.C15500e;
import g53.C15514s;
import io.sentry.internal.debugmeta.C20378c;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: f53.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C14127o extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f50809w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C20378c f50810x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14127o(C20378c c20378c, int i13) {
        super(2);
        this.f50809w = i13;
        this.f50810x = c20378c;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f50809w) {
            case 0:
                AbstractC15508m state = (AbstractC15508m) obj;
                AbstractC15519x event = (AbstractC15519x) obj2;
                AbstractC22676k.m65750j(state, "state");
                AbstractC22676k.m65750j(event, "event");
                C2345k c2345kM56591t = this.f50810x.m56591t();
                InterfaceC2339e interfaceC2339e = c2345kM56591t.f9275c;
                EnumC2341g enumC2341g = EnumC2341g.ERROR;
                String str = c2345kM56591t.f9273a;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    c2345kM56591t.f9274b.log(enumC2341g, str, "Cannot handle event " + event + " while being in inappropriate state " + state, null);
                }
                return state;
            default:
                C15500e onEvent = (C15500e) obj;
                C15514s it = (C15514s) obj2;
                AbstractC22676k.m65750j(onEvent, "$this$onEvent");
                AbstractC22676k.m65750j(it, "it");
                return (AbstractC15508m) this.f50810x.m56594w().f168689d.getValue();
        }
    }
}
