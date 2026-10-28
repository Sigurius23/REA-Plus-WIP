package t23;

import bc3.AbstractC3006f0;
import bc3.C2996c2;
import c93.InterfaceC4339a;
import ec3.C13045h2;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import org.webrtc.EglBase;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import q83.InterfaceC30057d;
import stream.video.sfu.models.AudioBitrateProfile;
import z33.C40053b;

/* JADX INFO: renamed from: t23.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C33414l extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f139516w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C33368c0 f139517x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C33414l(C33368c0 c33368c0, int i13) {
        super(0);
        this.f139516w = i13;
        this.f139517x = c33368c0;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [c93.a, kotlin.jvm.internal.m] */
    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f139516w) {
            case 0:
                return this.f139517x.m105817h().f139757e;
            case 1:
                C33368c0 c33368c0 = this.f139517x;
                return Integer.valueOf(c33368c0.f139293g.f139238K.m9548b(c33368c0.f139288b).f81522b);
            case 2:
                return this.f139517x.m105817h().f139758f;
            case 3:
                return (C40053b) this.f139517x.f139293g.f139232E.f168480h.getValue();
            case 4:
                C33368c0 c33368c1 = this.f139517x;
                return Integer.valueOf(c33368c1.f139293g.f139238K.m9548b(c33368c1.f139288b).f81522b);
            case 5:
                return (AudioBitrateProfile) this.f139517x.m105817h().f139758f.f139207r.getValue();
            case 6:
                Object value = this.f139517x.f139274I.getValue();
                AbstractC22676k.m65749i(value, "getValue(...)");
                return (EglBase) value;
            case 7:
                return this.f139517x.m105817h().f139760h;
            case 8:
                C33368c0 c33368c2 = this.f139517x;
                if (!((Boolean) ((AbstractC22680m) c33368c2.m105818i().f139201l.f104635y).invoke()).booleanValue()) {
                    C33450s0 c33450s0 = c33368c2.f139302p;
                    C13045h2 c13045h2 = c33450s0.f139688z;
                    Boolean bool = Boolean.TRUE;
                    c13045h2.getClass();
                    InterfaceC30057d interfaceC30057d = null;
                    c13045h2.m36571k(null, bool);
                    C2996c2 c2996c2 = c33450s0.f139671q0;
                    if (c2996c2 != null) {
                        c2996c2.cancel((CancellationException) null);
                    }
                    c33450s0.f139671q0 = AbstractC3006f0.m8732z(c33450s0.f139644d, null, null, new C33435p0(c33450s0, interfaceC30057d, 2), 3);
                }
                return C23454a0.f92919a;
            default:
                return this.f139517x.m105817h().f139759g;
        }
    }
}
