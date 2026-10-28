package g40;

import bi.AbstractC3269g;
import com.stripe.android.uicore.elements.IdentifierSpec;
import ec3.AbstractC13091v;
import ec3.InterfaceC13037f2;
import eg.C13161j;
import java.util.List;
import java.util.Map;
import m83.C25271y;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: g40.b3 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC15327b3 implements InterfaceC15450y2 {

    /* JADX INFO: renamed from: a */
    public final IdentifierSpec f57596a;

    public AbstractC15327b3(IdentifierSpec identifier) {
        AbstractC22676k.m65750j(identifier, "identifier");
        this.f57596a = identifier;
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: a */
    public IdentifierSpec mo43531a() {
        return this.f57596a;
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: b */
    public final void mo43537b(boolean z4) {
        mo43534k().mo43558b(z4);
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: e */
    public InterfaceC13037f2 mo43535e() {
        return AbstractC3269g.m9484M(mo43534k().mo43564j(), new C13161j(this, 24));
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: f */
    public InterfaceC13037f2 mo43538f() {
        List listM118958J = AbstractC37056f.m118958J(mo43531a());
        if (!(mo43534k() instanceof InterfaceC15391m3)) {
            listM118958J = null;
        }
        if (listM118958J == null) {
            listM118958J = C25271y.f99162w;
        }
        return AbstractC13091v.m36593c(listM118958J);
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: h */
    public void mo43539h(Map rawValuesMap) {
        AbstractC22676k.m65750j(rawValuesMap, "rawValuesMap");
        String str = (String) rawValuesMap.get(mo43531a());
        if (str != null) {
            mo43534k().mo43573s(str);
        }
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: i */
    public final InterfaceC15455z2 mo43540i() {
        return mo43534k();
    }

    /* JADX INFO: renamed from: k */
    public abstract InterfaceC15379k1 mo43534k();
}
