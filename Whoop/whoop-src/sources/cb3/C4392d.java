package cb3;

import java.io.Serializable;
import p108e4.AbstractC12667a;
import p484s9.AbstractC32281f;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import q93.C30095s;
import q93.EnumC30090n;
import r93.InterfaceC31111c;
import r93.InterfaceC31117e;

/* JADX INFO: renamed from: cb3.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C4392d extends AbstractC32281f {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f17734w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Serializable f17735x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f17736y;

    public /* synthetic */ C4392d(Object obj, Serializable serializable, int i13) {
        this.f17734w = i13;
        this.f17736y = obj;
        this.f17735x = serializable;
    }

    @Override // p484s9.AbstractC32281f
    /* JADX INFO: renamed from: p */
    public void mo13800p(Object obj) {
        switch (this.f17734w) {
            case 0:
                InterfaceC31111c current = (InterfaceC31111c) obj;
                AbstractC22676k.m65750j(current, "current");
                C22669g0 c22669g0 = (C22669g0) this.f17735x;
                if (c22669g0.f89336w == null && ((Boolean) ((Function1) this.f17736y).invoke(current)).booleanValue()) {
                    c22669g0.f89336w = current;
                    break;
                }
                break;
        }
    }

    @Override // p484s9.AbstractC32281f
    /* JADX INFO: renamed from: q */
    public final boolean mo13801q(Object obj) {
        switch (this.f17734w) {
            case 0:
                InterfaceC31111c current = (InterfaceC31111c) obj;
                AbstractC22676k.m65750j(current, "current");
                return ((C22669g0) this.f17735x).f89336w == null;
            case 1:
                InterfaceC31117e javaClassDescriptor = (InterfaceC31117e) obj;
                C22669g0 c22669g0 = (C22669g0) this.f17735x;
                AbstractC22676k.m65750j(javaClassDescriptor, "javaClassDescriptor");
                String strM35446R = AbstractC12667a.m35446R(javaClassDescriptor, (String) this.f17736y);
                if (C30095s.f122812b.contains(strM35446R)) {
                    c22669g0.f89336w = EnumC30090n.f122793w;
                } else if (C30095s.f122814d.contains(strM35446R)) {
                    c22669g0.f89336w = EnumC30090n.f122794x;
                } else if (C30095s.f122813c.contains(strM35446R)) {
                    c22669g0.f89336w = EnumC30090n.f122795y;
                } else if (C30095s.f122811a.contains(strM35446R)) {
                    c22669g0.f89336w = EnumC30090n.f122791E;
                }
                return c22669g0.f89336w == null;
            default:
                boolean[] zArr = (boolean[]) this.f17735x;
                if (((Boolean) ((Function1) this.f17736y).invoke(obj)).booleanValue()) {
                    zArr[0] = true;
                }
                return !zArr[0];
        }
    }

    @Override // p484s9.AbstractC32281f
    /* JADX INFO: renamed from: y */
    public final Object mo13802y() {
        switch (this.f17734w) {
            case 0:
                return (InterfaceC31111c) ((C22669g0) this.f17735x).f89336w;
            case 1:
                EnumC30090n enumC30090n = (EnumC30090n) ((C22669g0) this.f17735x).f89336w;
                return enumC30090n == null ? EnumC30090n.f122796z : enumC30090n;
            default:
                return Boolean.valueOf(((boolean[]) this.f17735x)[0]);
        }
    }

    public C4392d(Function1 function1, C22669g0 c22669g0) {
        this.f17734w = 0;
        this.f17735x = c22669g0;
        this.f17736y = function1;
    }
}
