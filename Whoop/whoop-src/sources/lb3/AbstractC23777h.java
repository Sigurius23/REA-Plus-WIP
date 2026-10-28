package lb3;

import j93.InterfaceC21461d;
import j93.InterfaceC21493z;
import p077d0.C11387o2;
import p581we.C37199o;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22693x;
import s93.C32305g;
import s93.InterfaceC32307i;

/* JADX INFO: renamed from: lb3.h */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC23777h {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC21493z[] f94156a;

    /* JADX INFO: renamed from: b */
    public static final C11387o2 f94157b;

    static {
        C22693x c22693x = new C22693x(AbstractC23777h.class, "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;", 1);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        f94156a = new InterfaceC21493z[]{c22673i0.property1(c22693x)};
        C37199o c37199o = C23784k0.f94165x;
        InterfaceC21461d kClass = c22673i0.getOrCreateKotlinClass(C23774g.class);
        c37199o.getClass();
        AbstractC22676k.m65750j(kClass, "kClass");
        String qualifiedName = kClass.getQualifiedName();
        AbstractC22676k.m65747g(qualifiedName);
        f94157b = new C11387o2(c37199o.m119206I(qualifiedName), 5);
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC32307i m69871a(C23784k0 c23784k0) {
        InterfaceC32307i interfaceC32307i;
        AbstractC22676k.m65750j(c23784k0, "<this>");
        C23774g c23774g = (C23774g) f94157b.getValue(c23784k0, f94156a[0]);
        return (c23774g == null || (interfaceC32307i = c23774g.f94148a) == null) ? C32305g.f133684a : interfaceC32307i;
    }
}
