package no0;

import com.whoop.archv2.feature.domain.C6010p;
import com.whoop.settings.language.LanguagePrefsFragment;
import fc2.InterfaceC14369c;
import gv1.InterfaceC16239m;
import l83.InterfaceC23462h;
import lo0.InterfaceC24588k;
import lo0.InterfaceC24610v;
import o52.AbstractC27550e0;
import o52.C27551f;
import p236j.C21062a;
import p715kotlin.jvm.functions.Function1;
import p728ql2.Function0;
import p739ui0.AbstractC35012n;
import su2.InterfaceC33022b;
import tu2.AbstractC34197b;
import w60.AbstractC36858f;

/* JADX INFO: renamed from: no0.q */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C26967q implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f107586w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC23462h f107587x;

    public /* synthetic */ C26967q(InterfaceC23462h interfaceC23462h, int i13) {
        this.f107586w = i13;
        this.f107587x = interfaceC23462h;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f107586w) {
            case 0:
                return AbstractC26971s.m80792p(this.f107587x, (InterfaceC24588k) obj);
            case 1:
                return AbstractC26979w.m80834B(this.f107587x, (InterfaceC24610v) obj);
            case 2:
                return AbstractC27550e0.m83150h(this.f107587x, (C27551f) obj);
            case 3:
                return Function0.m93272s(this.f107587x, ((Boolean) obj).booleanValue());
            case 4:
                return Function0.m93273t(this.f107587x, (C21062a) obj);
            case 5:
                return AbstractC34197b.m108092r(this.f107587x, (InterfaceC33022b) obj);
            case 6:
                return AbstractC35012n.m110570F(this.f107587x, (C6010p) obj);
            case 7:
                return AbstractC36858f.m118198l(this.f107587x, (InterfaceC16239m) obj);
            default:
                return LanguagePrefsFragment.m25518F(this.f107587x, (InterfaceC14369c) obj);
        }
    }
}
