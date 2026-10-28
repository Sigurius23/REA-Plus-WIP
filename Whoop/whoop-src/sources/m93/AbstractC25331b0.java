package m93;

import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m93.b0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC25331b0 implements InterfaceC25339g {

    /* JADX INFO: renamed from: a */
    public final Method f99341a;

    /* JADX INFO: renamed from: b */
    public final List f99342b;

    /* JADX INFO: renamed from: c */
    public final Class f99343c;

    public AbstractC25331b0(Method method, List list) {
        this.f99341a = method;
        this.f99342b = list;
        Class<?> returnType = method.getReturnType();
        AbstractC22676k.m65749i(returnType, "getReturnType(...)");
        this.f99343c = returnType;
    }

    @Override // m93.InterfaceC25339g
    /* JADX INFO: renamed from: a */
    public final List mo74408a() {
        return this.f99342b;
    }

    @Override // m93.InterfaceC25339g
    /* JADX INFO: renamed from: b */
    public final /* bridge */ boolean mo74409b() {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final void m74410c(Object[] args) {
        AbstractC22676k.m65750j(args, "args");
        if (AbstractC15751g.m44473z(this) == args.length) {
            return;
        }
        StringBuilder sb4 = new StringBuilder("Callable expects ");
        sb4.append(AbstractC15751g.m44473z(this));
        sb4.append(" arguments, but ");
        throw new IllegalArgumentException(AbstractC18489d0.m53371l(sb4, args.length, " were provided."));
    }

    @Override // m93.InterfaceC25339g
    public final /* bridge */ /* synthetic */ Member getMember() {
        return null;
    }

    @Override // m93.InterfaceC25339g
    public final Type getReturnType() {
        return this.f99343c;
    }
}
