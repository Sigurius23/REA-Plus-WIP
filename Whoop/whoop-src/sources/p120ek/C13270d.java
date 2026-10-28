package p120ek;

import bc3.AbstractC3006f0;
import c93.InterfaceC4351m;
import h20.C16686k4;
import java.util.Map;
import l83.C23454a0;
import p173gj.C15903d;
import p180h0.C16453s2;
import p180h0.C16473w2;
import p599wz.AbstractC37713e1;
import p599wz.C37770y;
import p636y3.C39185q;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22656a;
import q20.C29838w;
import w20.C36714d;
import w20.C36715e;
import w20.InterfaceC36716f;
import y00.C38889l5;

/* JADX INFO: renamed from: ek.d */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C13270d extends C22656a implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f45953w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13270d(int i13, Object obj, Class cls, String str, String str2, int i14, int i15) {
        super(i13, i14, cls, obj, str, str2);
        this.f45953w = i15;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C38889l5 c38889l5;
        switch (this.f45953w) {
            case 0:
                String p13 = (String) obj;
                AbstractC22676k.m65750j(p13, "p0");
                C15903d.m44880j((C15903d) this.receiver, p13, (Map) obj2, 4);
                return C23454a0.f92919a;
            case 1:
                String p14 = (String) obj;
                AbstractC22676k.m65750j(p14, "p0");
                C15903d.m44880j((C15903d) this.receiver, p14, (Map) obj2, 4);
                return C23454a0.f92919a;
            case 2:
                long j7 = ((C39185q) obj).f168431a;
                C16473w2 c16473w2 = (C16473w2) this.receiver;
                AbstractC3006f0.m8732z(c16473w2.f63295b0.m105692c(), null, null, new C16453s2(c16473w2, j7, null, 2), 3);
                return C23454a0.f92919a;
            case 3:
                InterfaceC36716f interfaceC36716f = (InterfaceC36716f) obj;
                C16686k4 c16686k4 = (C16686k4) this.receiver;
                Object value = c16686k4.f43012P.f45200w.getValue();
                C29838w c29838w = value instanceof C29838w ? (C29838w) value : null;
                if (c29838w != null) {
                    if (interfaceC36716f instanceof C36714d) {
                        c38889l5 = new C38889l5(6, ((C36714d) interfaceC36716f).f157197a, null);
                    } else {
                        if (!AbstractC22676k.m65745e(interfaceC36716f, C36715e.f157198a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c38889l5 = new C38889l5(6, "", null);
                    }
                    c16686k4.m35340z(new C29838w(c29838w.f121955x, c29838w.f121956y, c38889l5));
                }
                return C23454a0.f92919a;
            default:
                AbstractC37713e1 p15 = (AbstractC37713e1) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                AbstractC22676k.m65750j(p15, "p0");
                C37770y.m121167q((C37770y) this.receiver, p15, zBooleanValue);
                return C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13270d(C16473w2 c16473w2) {
        super(2, 4, C16473w2.class, c16473w2, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V");
        this.f45953w = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13270d(Object obj, int i13) {
        super(2, 8, C15903d.class, obj, "track", "track(Ljava/lang/String;Ljava/util/Map;Lcom/amplitude/core/events/EventOptions;)Lcom/amplitude/core/Amplitude;");
        this.f45953w = i13;
        switch (i13) {
            case 1:
                super(2, 8, C15903d.class, obj, "track", "track(Ljava/lang/String;Ljava/util/Map;Lcom/amplitude/core/events/EventOptions;)Lcom/amplitude/core/Amplitude;");
                break;
            default:
                break;
        }
    }
}
