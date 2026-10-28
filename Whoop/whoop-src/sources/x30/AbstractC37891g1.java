package x30;

import androidx.compose.runtime.Composer;
import bi.AbstractC3269g;
import com.stripe.android.uicore.elements.IdentifierSpec;
import ec3.InterfaceC13037f2;
import g40.InterfaceC15367i1;
import java.util.Set;
import m83.C25271y;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: x30.g1 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC37891g1 implements InterfaceC15367i1 {

    /* JADX INFO: renamed from: a */
    public final IdentifierSpec f162243a;

    /* JADX INFO: renamed from: b */
    public final boolean f162244b;

    public AbstractC37891g1(IdentifierSpec identifier, boolean z4) {
        AbstractC22676k.m65750j(identifier, "identifier");
        this.f162243a = identifier;
        this.f162244b = z4;
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: a */
    public final IdentifierSpec mo43547a() {
        return this.f162243a;
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: b */
    public final void mo43548b(boolean z4) {
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: c */
    public final InterfaceC41211c mo43549c() {
        return null;
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: d */
    public final boolean mo43550d() {
        return this.f162244b;
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: f */
    public final InterfaceC13037f2 mo43552f() {
        return AbstractC3269g.m9493Z(C25271y.f99162w);
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo82070g(boolean z4, Set set, IdentifierSpec identifierSpec, Composer composer, int i13);
}
