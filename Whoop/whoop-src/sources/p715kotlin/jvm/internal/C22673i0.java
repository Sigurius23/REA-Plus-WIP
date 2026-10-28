package p715kotlin.jvm.internal;

import j93.InterfaceC21456a0;
import j93.InterfaceC21461d;
import j93.InterfaceC21463e;
import j93.InterfaceC21465f;
import j93.InterfaceC21467g;
import j93.InterfaceC21473j;
import j93.InterfaceC21477l;
import j93.InterfaceC21488u;
import j93.InterfaceC21490w;
import j93.InterfaceC21492y;
import java.util.List;

/* JADX INFO: renamed from: kotlin.jvm.internal.i0 */
/* JADX INFO: loaded from: classes5.dex */
public class C22673i0 {
    private static final String KOTLIN_JVM_FUNCTIONS = "kotlin.jvm.functions.";

    public InterfaceC21461d createKotlinClass(Class cls) {
        return new C22664e(cls);
    }

    public InterfaceC21467g function(AbstractC22670h abstractC22670h) {
        return abstractC22670h;
    }

    public InterfaceC21461d getOrCreateKotlinClass(Class cls) {
        return new C22664e(cls);
    }

    public InterfaceC21465f getOrCreateKotlinPackage(Class cls, String str) {
        return new C22689t(cls, str);
    }

    public InterfaceC21456a0 mutableCollectionType(InterfaceC21456a0 interfaceC21456a0) {
        C22683n0 c22683n0 = (C22683n0) interfaceC21456a0;
        return new C22683n0(interfaceC21456a0.getClassifier(), interfaceC21456a0.getArguments(), c22683n0.m65781c(), c22683n0.m65780b() | 2);
    }

    public InterfaceC21473j mutableProperty0(AbstractC22682n abstractC22682n) {
        return abstractC22682n;
    }

    public InterfaceC21477l mutableProperty1(AbstractC22685p abstractC22685p) {
        return abstractC22685p;
    }

    public InterfaceC21488u property0(AbstractC22690u abstractC22690u) {
        return abstractC22690u;
    }

    public InterfaceC21490w property1(AbstractC22692w abstractC22692w) {
        return abstractC22692w;
    }

    public InterfaceC21492y property2(AbstractC22694y abstractC22694y) {
        return abstractC22694y;
    }

    public String renderLambdaToString(AbstractC22680m abstractC22680m) {
        return renderLambdaToString((InterfaceC22668g) abstractC22680m);
    }

    public InterfaceC21456a0 typeOf(InterfaceC21463e interfaceC21463e, List list, boolean z4) {
        return new C22683n0(interfaceC21463e, list, z4);
    }

    public String renderLambdaToString(InterfaceC22668g interfaceC22668g) {
        String string = interfaceC22668g.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith(KOTLIN_JVM_FUNCTIONS) ? string.substring(21) : string;
    }
}
