package sc3;

import java.util.List;
import m83.C25271y;
import p715kotlin.jvm.internal.AbstractC22676k;
import tc3.C33699a;
import uc3.C34763a;
import uc3.C34768f;
import uc3.C34774l;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: sc3.i */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC32395i implements InterfaceC32396j {

    /* JADX INFO: renamed from: a */
    public final AbstractC32387a f134139a;

    public AbstractC32395i(AbstractC32387a field, List list) {
        AbstractC22676k.m65750j(field, "field");
        this.f134139a = field;
    }

    @Override // sc3.InterfaceC32396j
    /* JADX INFO: renamed from: a */
    public final C33699a mo92507a() {
        this.f134139a.mo100962a();
        return new C33699a();
    }

    @Override // sc3.InterfaceC32396j
    /* JADX INFO: renamed from: b */
    public final C34774l mo92508b() {
        AbstractC32387a abstractC32387a = this.f134139a;
        return new C34774l(AbstractC37056f.m118958J(new C34768f(AbstractC37056f.m118958J(new C34763a(abstractC32387a.mo100962a(), abstractC32387a.mo100964c())))), C25271y.f99162w);
    }

    @Override // sc3.InterfaceC32396j
    /* JADX INFO: renamed from: c */
    public final AbstractC32387a mo92509c() {
        return this.f134139a;
    }
}
