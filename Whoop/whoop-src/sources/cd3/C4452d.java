package cd3;

import j93.InterfaceC21461d;
import java.util.List;
import java.util.Map;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37145j;

/* JADX INFO: renamed from: cd3.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C4452d extends AbstractC4454f {

    /* JADX INFO: renamed from: a */
    public final Map f17953a;

    /* JADX INFO: renamed from: b */
    public final Map f17954b;

    /* JADX INFO: renamed from: c */
    public final Map f17955c;

    /* JADX INFO: renamed from: d */
    public final Map f17956d;

    /* JADX INFO: renamed from: e */
    public final Map f17957e;

    /* JADX INFO: renamed from: f */
    public final boolean f17958f;

    public C4452d(Map class2ContextualFactory, Map polyBase2Serializers, Map polyBase2DefaultSerializerProvider, Map polyBase2NamedSerializers, Map polyBase2DefaultDeserializerProvider, boolean z4) {
        AbstractC22676k.m65750j(class2ContextualFactory, "class2ContextualFactory");
        AbstractC22676k.m65750j(polyBase2Serializers, "polyBase2Serializers");
        AbstractC22676k.m65750j(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        AbstractC22676k.m65750j(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        AbstractC22676k.m65750j(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.f17953a = class2ContextualFactory;
        this.f17954b = polyBase2Serializers;
        this.f17955c = polyBase2DefaultSerializerProvider;
        this.f17956d = polyBase2NamedSerializers;
        this.f17957e = polyBase2DefaultDeserializerProvider;
        this.f17958f = z4;
    }

    @Override // cd3.AbstractC4454f
    /* JADX INFO: renamed from: a */
    public final void mo13923a(InterfaceC4456h interfaceC4456h) {
        for (Map.Entry entry : this.f17953a.entrySet()) {
            InterfaceC21461d interfaceC21461d = (InterfaceC21461d) entry.getKey();
            AbstractC4451c abstractC4451c = (AbstractC4451c) entry.getValue();
            if (abstractC4451c instanceof C4449a) {
                AbstractC22676k.m65748h(interfaceC21461d, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                InterfaceC37138c interfaceC37138c = ((C4449a) abstractC4451c).f17951a;
                AbstractC22676k.m65748h(interfaceC37138c, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                interfaceC4456h.mo2325k(interfaceC21461d, interfaceC37138c);
            } else {
                if (!(abstractC4451c instanceof C4450b)) {
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC4456h.mo2326o(interfaceC21461d, ((C4450b) abstractC4451c).f17952a);
            }
        }
        for (Map.Entry entry2 : this.f17954b.entrySet()) {
            InterfaceC21461d interfaceC21461d2 = (InterfaceC21461d) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                InterfaceC21461d interfaceC21461d3 = (InterfaceC21461d) entry3.getKey();
                InterfaceC37138c interfaceC37138c2 = (InterfaceC37138c) entry3.getValue();
                AbstractC22676k.m65748h(interfaceC21461d2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                AbstractC22676k.m65748h(interfaceC21461d3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                AbstractC22676k.m65748h(interfaceC37138c2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                interfaceC4456h.mo2330s(interfaceC21461d2, interfaceC21461d3, interfaceC37138c2);
            }
        }
        for (Map.Entry entry4 : this.f17955c.entrySet()) {
            InterfaceC21461d interfaceC21461d4 = (InterfaceC21461d) entry4.getKey();
            Function1 function1 = (Function1) entry4.getValue();
            AbstractC22676k.m65748h(interfaceC21461d4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            AbstractC22676k.m65748h(function1, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
            AbstractC22681m0.m65774e(1, function1);
            interfaceC4456h.mo2321e(interfaceC21461d4, function1);
        }
        for (Map.Entry entry5 : this.f17957e.entrySet()) {
            InterfaceC21461d interfaceC21461d5 = (InterfaceC21461d) entry5.getKey();
            Function1 function2 = (Function1) entry5.getValue();
            AbstractC22676k.m65748h(interfaceC21461d5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            AbstractC22676k.m65748h(function2, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
            AbstractC22681m0.m65774e(1, function2);
            interfaceC4456h.mo2327p(interfaceC21461d5, function2);
        }
    }

    @Override // cd3.AbstractC4454f
    /* JADX INFO: renamed from: b */
    public final InterfaceC37138c mo13924b(InterfaceC21461d kClass, List typeArgumentsSerializers) {
        AbstractC22676k.m65750j(kClass, "kClass");
        AbstractC22676k.m65750j(typeArgumentsSerializers, "typeArgumentsSerializers");
        AbstractC4451c abstractC4451c = (AbstractC4451c) this.f17953a.get(kClass);
        InterfaceC37138c interfaceC37138cMo13922a = abstractC4451c != null ? abstractC4451c.mo13922a(typeArgumentsSerializers) : null;
        if (interfaceC37138cMo13922a instanceof InterfaceC37138c) {
            return interfaceC37138cMo13922a;
        }
        return null;
    }

    @Override // cd3.AbstractC4454f
    /* JADX INFO: renamed from: c */
    public final InterfaceC37145j mo13925c(InterfaceC21461d baseClass, Object value) {
        InterfaceC37138c interfaceC37138c;
        AbstractC22676k.m65750j(baseClass, "baseClass");
        AbstractC22676k.m65750j(value, "value");
        if (!baseClass.isInstance(value)) {
            return null;
        }
        Map map = (Map) this.f17954b.get(baseClass);
        if (map != null) {
            interfaceC37138c = (InterfaceC37138c) map.get(AbstractC22671h0.f89337a.getOrCreateKotlinClass(value.getClass()));
        } else {
            interfaceC37138c = null;
        }
        InterfaceC37138c interfaceC37138c2 = interfaceC37138c instanceof InterfaceC37145j ? interfaceC37138c : null;
        if (interfaceC37138c2 != null) {
            return interfaceC37138c2;
        }
        Object obj = this.f17955c.get(baseClass);
        Function1 function1 = AbstractC22681m0.m65775f(1, obj) ? (Function1) obj : null;
        if (function1 != null) {
            return (InterfaceC37145j) function1.invoke(value);
        }
        return null;
    }
}
