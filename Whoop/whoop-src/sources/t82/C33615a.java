package t82;

import i92.C18258c;
import j93.InterfaceC21461d;
import java.util.List;
import l83.C23454a0;
import nd1.C26583i;
import nd1.C26587m;
import nd1.InterfaceC26584j;
import p088dc.AbstractC11895b;
import p249jc.AbstractC21598x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qf3.C30330b;
import s82.C32266a;
import sv1.C33036b;
import tf3.C33768a;
import uf3.C34911a;
import vf3.C35953c;
import wb3.AbstractC37056f;
import wf3.C37247a;
import xf3.C38266c;

/* JADX INFO: renamed from: t82.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lt82/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "seon_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33615a implements InterfaceC26584j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C26583i(), new C26587m());

    /* JADX INFO: renamed from: b */
    private static final C23454a0 m106207b(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C33036b c33036b = new C33036b(13);
        InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C32266a.class);
        C35953c c35953c = C37247a.f159360e;
        AbstractC11895b.m31980C(new C30330b(c35953c, orCreateKotlinClass, null, c33036b, 1), module, AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C32266a m106208c(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C32266a(AbstractC29125c.m88532i(single), (C18258c) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C18258c.class), null), null, null, 12, null);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m106207b(c33768a);
        return c33768a;
    }

    @Override // nd1.InterfaceC26584j
    public List<InterfaceC26584j> getDependencies() {
        return this.dependencies;
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ Object getKey() {
        return super.getKey();
    }
}
