package m93;

import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25260n;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: m93.y */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC25357y implements InterfaceC25339g {

    /* JADX INFO: renamed from: a */
    public final Member f99382a;

    /* JADX INFO: renamed from: b */
    public final Type f99383b;

    /* JADX INFO: renamed from: c */
    public final Class f99384c;

    /* JADX INFO: renamed from: d */
    public final List f99385d;

    public AbstractC25357y(Member member, Type type, Class cls, Type[] typeArr) {
        List listM74049W0;
        this.f99382a = member;
        this.f99383b = type;
        this.f99384c = cls;
        if (cls != null) {
            C22677k0 c22677k0 = new C22677k0(2);
            c22677k0.m65760a(cls);
            c22677k0.m65764e(typeArr);
            ArrayList arrayList = c22677k0.f89339a;
            listM74049W0 = AbstractC37056f.m118959K(arrayList.toArray(new Type[arrayList.size()]));
        } else {
            listM74049W0 = AbstractC25260n.m74049W0(typeArr);
        }
        this.f99385d = listM74049W0;
    }

    @Override // m93.InterfaceC25339g
    /* JADX INFO: renamed from: a */
    public final List mo74408a() {
        return this.f99385d;
    }

    @Override // m93.InterfaceC25339g
    /* JADX INFO: renamed from: b */
    public final /* bridge */ boolean mo74409b() {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public void mo74412c(Object[] args) {
        AbstractC22676k.m65750j(args, "args");
        if (AbstractC15751g.m44473z(this) == args.length) {
            return;
        }
        StringBuilder sb4 = new StringBuilder("Callable expects ");
        sb4.append(AbstractC15751g.m44473z(this));
        sb4.append(" arguments, but ");
        throw new IllegalArgumentException(AbstractC18489d0.m53371l(sb4, args.length, " were provided."));
    }

    /* JADX INFO: renamed from: d */
    public final void m74414d(Object obj) {
        if (obj == null || !this.f99382a.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override // m93.InterfaceC25339g
    public final Member getMember() {
        return this.f99382a;
    }

    @Override // m93.InterfaceC25339g
    public final Type getReturnType() {
        return this.f99383b;
    }
}
