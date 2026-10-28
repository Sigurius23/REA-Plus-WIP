package lg3;

import com.squareup.wire.AbstractC5583n;
import hc3.AbstractC17176i;
import java.util.HashMap;
import jg3.AbstractC21688o;
import jg3.C21684k;
import ng3.AbstractC26703p;
import ng3.InterfaceC26700m;
import ng3.InterfaceC26704q;
import org.threeten.p379bp.temporal.UnsupportedTemporalTypeException;
import p048ce.AbstractC4482w;

/* JADX INFO: renamed from: lg3.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C24054p extends AbstractC4482w {

    /* JADX INFO: renamed from: H */
    public boolean f95064H;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ C24055q f95066J;

    /* JADX INFO: renamed from: F */
    public AbstractC21688o f95062F = null;

    /* JADX INFO: renamed from: G */
    public final HashMap f95063G = new HashMap();

    /* JADX INFO: renamed from: I */
    public final C21684k f95065I = C21684k.f83267x;

    public C24054p(C24055q c24055q) {
        this.f95066J = c24055q;
    }

    @Override // ng3.InterfaceC26698k
    /* JADX INFO: renamed from: a */
    public final boolean mo60986a(InterfaceC26700m interfaceC26700m) {
        return this.f95063G.containsKey(interfaceC26700m);
    }

    @Override // p048ce.AbstractC4482w, ng3.InterfaceC26698k
    /* JADX INFO: renamed from: f */
    public final int mo14018f(InterfaceC26700m interfaceC26700m) {
        HashMap map = this.f95063G;
        if (map.containsKey(interfaceC26700m)) {
            return AbstractC5583n.m16770b0(((Long) map.get(interfaceC26700m)).longValue());
        }
        throw new UnsupportedTemporalTypeException(AbstractC17176i.m48504f("Unsupported field: ", interfaceC26700m));
    }

    @Override // p048ce.AbstractC4482w, ng3.InterfaceC26698k
    /* JADX INFO: renamed from: g */
    public final Object mo14019g(InterfaceC26704q interfaceC26704q) {
        if (interfaceC26704q == AbstractC26703p.f106195b) {
            return null;
        }
        return (interfaceC26704q == AbstractC26703p.f106194a || interfaceC26704q == AbstractC26703p.f106197d) ? this.f95062F : super.mo14019g(interfaceC26704q);
    }

    @Override // ng3.InterfaceC26698k
    /* JADX INFO: renamed from: h */
    public final long mo60987h(InterfaceC26700m interfaceC26700m) {
        HashMap map = this.f95063G;
        if (map.containsKey(interfaceC26700m)) {
            return ((Long) map.get(interfaceC26700m)).longValue();
        }
        throw new UnsupportedTemporalTypeException(AbstractC17176i.m48504f("Unsupported field: ", interfaceC26700m));
    }

    public final String toString() {
        return this.f95063G.toString() + ",null," + this.f95062F;
    }
}
