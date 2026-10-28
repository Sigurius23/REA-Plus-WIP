package xf3;

import ag3.AbstractC0865a;
import c93.InterfaceC4339a;
import j93.InterfaceC21461d;
import p715kotlin.jvm.internal.AbstractC22680m;
import vf3.InterfaceC35951a;

/* JADX INFO: renamed from: xf3.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C38265b extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f164055w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC21461d f164056x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC35951a f164057y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38265b(InterfaceC21461d interfaceC21461d, InterfaceC35951a interfaceC35951a, int i13) {
        super(0);
        this.f164055w = i13;
        this.f164056x = interfaceC21461d;
        this.f164057y = interfaceC35951a;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f164055w) {
            case 0:
                return "- lookup? t:'" + AbstractC0865a.m2111a(this.f164056x) + "' - q:'" + this.f164057y + "' look in injected parameters";
            case 1:
                return "- lookup? t:'" + AbstractC0865a.m2111a(this.f164056x) + "' - q:'" + this.f164057y + "' look at scope source";
            default:
                return "- lookup? t:'" + AbstractC0865a.m2111a(this.f164056x) + "' - q:'" + this.f164057y + "' look in other scopes";
        }
    }
}
