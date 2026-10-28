package p390p1;

import c93.InterfaceC4339a;
import ma1.C25371a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: p1.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C28596b0 extends AbstractC28669t1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f115709b = 1;

    /* JADX INFO: renamed from: c */
    public final Object f115710c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28596b0(InterfaceC4339a interfaceC4339a) {
        super(interfaceC4339a);
        C28676v0 c28676v0 = C28676v0.f115974F;
        this.f115710c = c28676v0;
    }

    @Override // p390p1.AbstractC28669t1
    /* JADX INFO: renamed from: a */
    public final C28673u1 mo86977a(Object obj) {
        switch (this.f115709b) {
            case 0:
                return new C28673u1(this, obj, obj == null, null, true);
            default:
                return new C28673u1(this, obj, obj == null, (InterfaceC28650o2) this.f115710c, true);
        }
    }

    @Override // p390p1.AbstractC28669t1
    /* JADX INFO: renamed from: b */
    public InterfaceC28682w2 mo86978b() {
        switch (this.f115709b) {
            case 0:
                return (C28600c0) this.f115710c;
            default:
                return super.mo86978b();
        }
    }

    public C28596b0(Function1 function1) {
        super(new C25371a(14));
        this.f115710c = new C28600c0(function1);
    }
}
