package s93;

import bg.C3215j;
import java.util.Map;
import l83.EnumC23463i;
import lb3.AbstractC23811y;
import o93.AbstractC27736h;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import r93.InterfaceC31155s0;
import va3.C35847e;

/* JADX INFO: renamed from: s93.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C32310l implements InterfaceC32300b {

    /* JADX INFO: renamed from: a */
    public final AbstractC27736h f133687a;

    /* JADX INFO: renamed from: b */
    public final C35847e f133688b;

    /* JADX INFO: renamed from: c */
    public final Map f133689c;

    /* JADX INFO: renamed from: d */
    public final Object f133690d;

    public C32310l(AbstractC27736h builtIns, C35847e fqName, Map map) {
        AbstractC22676k.m65750j(builtIns, "builtIns");
        AbstractC22676k.m65750j(fqName, "fqName");
        this.f133687a = builtIns;
        this.f133688b = fqName;
        this.f133689c = map;
        this.f133690d = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C3215j(this, 12));
    }

    @Override // s93.InterfaceC32300b
    /* JADX INFO: renamed from: a */
    public final Map mo43952a() {
        return this.f133689c;
    }

    @Override // s93.InterfaceC32300b
    /* JADX INFO: renamed from: b */
    public final C35847e mo43953b() {
        return this.f133688b;
    }

    @Override // s93.InterfaceC32300b
    public final InterfaceC31155s0 getSource() {
        return InterfaceC31155s0.f128370q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l83.h] */
    @Override // s93.InterfaceC32300b
    public final AbstractC23811y getType() {
        Object value = this.f133690d.getValue();
        AbstractC22676k.m65749i(value, "getValue(...)");
        return (AbstractC23811y) value;
    }
}
