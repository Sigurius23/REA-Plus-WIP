package p715kotlin.reflect.jvm.internal;

import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import j93.C21462d0;
import j93.EnumC21483p;
import j93.InterfaceC21456a0;
import j93.InterfaceC21458b0;
import j93.InterfaceC21459c;
import j93.InterfaceC21461d;
import j93.InterfaceC21463e;
import j93.InterfaceC21467g;
import j93.InterfaceC21482o;
import j93.InterfaceC21484q;
import j93.InterfaceC21493z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25265s;
import o93.AbstractC27741m;
import o93.AbstractC27742n;
import p088dc.AbstractC11895b;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p530up.AbstractC35148d;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p93.C29028g;
import v63.AbstractC35744b;
import va3.C35848f;
import va3.C35850h;
import wb3.AbstractC37051a;
import xa3.C38146g;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00062\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\t¢\u0006\u0004\b\u000e\u0010\fJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001c\u001a\u00060\u0019j\u0002`\u001a*\u00060\u0019j\u0002`\u001a2\u0006\u0010\u001b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010!\u001a\u00020 *\u00060\u0019j\u0002`\u001a2\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001eH\u0002¢\u0006\u0004\b!\u0010\"J#\u0010#\u001a\u00020 *\u00060\u0019j\u0002`\u001a2\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001eH\u0002¢\u0006\u0004\b#\u0010\"J\u001f\u0010%\u001a\u00020 *\u00060\u0019j\u0002`\u001a2\u0006\u0010$\u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010&J\u001b\u0010'\u001a\u00020\u00062\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001eH\u0002¢\u0006\u0004\b'\u0010(J%\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010\u0014\u001a\u00020)2\n\u0010+\u001a\u0006\u0012\u0002\b\u00030*H\u0002¢\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\u00020 *\u00060\u0019j\u0002`\u001a2\u0006\u0010\u0014\u001a\u00020)H\u0002¢\u0006\u0004\b/\u00100JI\u00106\u001a\u00020 *\u00060\u0019j\u0002`\u001a2\n\u0010+\u001a\u0006\u0012\u0002\b\u00030*2\u0006\u00101\u001a\u00020,2\f\u00104\u001a\b\u0012\u0004\u0012\u000203022\u0006\u00105\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b6\u00107J5\u00109\u001a\u00020 *\u00060\u0019j\u0002`\u001a2\f\u00108\u001a\b\u0012\u0004\u0012\u000203022\u0006\u00105\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b9\u0010:J\u001f\u0010=\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u0006H\u0002¢\u0006\u0004\b=\u0010>¨\u0006?"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/ReflectionObjectRenderer;", "", "<init>", "()V", "Lj93/z;", "property", "", "renderProperty", "(Lj93/z;)Ljava/lang/String;", "Lj93/g;", "function", "renderFunction", "(Lj93/g;)Ljava/lang/String;", "lambda", "renderLambda", "Lj93/q;", "parameter", "renderParameter", "(Lj93/q;)Ljava/lang/String;", "Lj93/a0;", "type", "", "renderRawArgumentPrefix", "renderType", "(Lj93/a0;Z)Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "receiver", "appendReceiverType", "(Ljava/lang/StringBuilder;Lj93/q;)Ljava/lang/StringBuilder;", "Lj93/c;", "callable", "Ll83/a0;", "appendReceivers", "(Ljava/lang/StringBuilder;Lj93/c;)V", "appendContexts", "name", "appendName", "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", "renderCallable", "(Lj93/c;)Ljava/lang/String;", "Lwb3/a;", "Lj93/d;", "klass", "Lva3/f;", "getTypeClassFqName", "(Lwb3/a;Lj93/d;)Lva3/f;", "renderFunctionType", "(Ljava/lang/StringBuilder;Lwb3/a;)V", "classFqName", "", "Lj93/d0;", "allArguments", "isMarkedNullable", "renderSimpleType", "(Ljava/lang/StringBuilder;Lj93/d;Lva3/f;Ljava/util/List;ZZ)V", "typeArguments", "renderTypeArgumentsAndNullability", "(Ljava/lang/StringBuilder;Ljava/util/List;ZZ)V", "lowerRendered", "upperRendered", "renderFlexibleType", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ReflectionObjectRenderer {
    public static final ReflectionObjectRenderer INSTANCE = new ReflectionObjectRenderer();

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC21483p.values().length];
            try {
                EnumC21483p enumC21483p = EnumC21483p.f82446w;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EnumC21483p enumC21483p2 = EnumC21483p.f82446w;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EnumC21483p enumC21483p3 = EnumC21483p.f82446w;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                EnumC21483p enumC21483p4 = EnumC21483p.f82446w;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private ReflectionObjectRenderer() {
    }

    private final void appendContexts(StringBuilder sb4, InterfaceC21459c interfaceC21459c) throws IOException {
        AbstractC22676k.m65750j(interfaceC21459c, "<this>");
        List parameters = interfaceC21459c.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((InterfaceC21484q) obj).getKind() == EnumC21483p.f82447x) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        AbstractC25265s.m74109M0(arrayList, sb4, null, "context(", ") ", new Function1() { // from class: kotlin.reflect.jvm.internal.ReflectionObjectRenderer$$Lambda$0
            @Override // p715kotlin.jvm.functions.Function1
            public Object invoke(Object obj2) {
                return ReflectionObjectRenderer.appendContexts$lambda$0((InterfaceC21484q) obj2);
            }
        }, 50);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence appendContexts$lambda$0(InterfaceC21484q parameter) {
        AbstractC22676k.m65750j(parameter, "parameter");
        StringBuilder sb4 = new StringBuilder();
        String name = parameter.getName();
        if (name == null) {
            name = "_";
        }
        sb4.append(name);
        sb4.append(": ");
        sb4.append(parameter.getType());
        return sb4.toString();
    }

    private final void appendName(StringBuilder sb4, String str) {
        sb4.append(AbstractC35744b.m113235h(C35850h.m113814e(str)));
    }

    private final StringBuilder appendReceiverType(StringBuilder sb4, InterfaceC21484q interfaceC21484q) {
        sb4.append(renderType$default(this, interfaceC21484q.getType(), false, 2, null));
        sb4.append(".");
        return sb4;
    }

    private final void appendReceivers(StringBuilder sb4, InterfaceC21459c interfaceC21459c) {
        AbstractC22676k.m65748h(interfaceC21459c, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.ReflectKCallable<*>");
        List<InterfaceC21484q> receiverParameters = ((ReflectKCallable) interfaceC21459c).getReceiverParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : receiverParameters) {
            InterfaceC21484q interfaceC21484q = (InterfaceC21484q) obj;
            if (interfaceC21484q.getKind() == EnumC21483p.f82446w || interfaceC21484q.getKind() == EnumC21483p.f82448y) {
                arrayList.add(obj);
            }
        }
        InterfaceC21484q interfaceC21484q2 = (InterfaceC21484q) AbstractC25265s.m74102I0(0, arrayList);
        if (interfaceC21484q2 != null) {
            INSTANCE.appendReceiverType(sb4, interfaceC21484q2);
        }
        InterfaceC21484q interfaceC21484q3 = (InterfaceC21484q) AbstractC25265s.m74102I0(1, arrayList);
        if (interfaceC21484q3 != null) {
            ReflectionObjectRenderer reflectionObjectRenderer = INSTANCE;
            sb4.append("(");
            reflectionObjectRenderer.appendReceiverType(sb4, interfaceC21484q3).append(")");
        }
    }

    private final C35848f getTypeClassFqName(AbstractC37051a type, InterfaceC21461d klass) {
        if (type.mo118943d()) {
            return AbstractC27741m.f111845b;
        }
        InterfaceC21461d interfaceC21461dMo118941b = type.mo118941b();
        if (interfaceC21461dMo118941b != null) {
            klass = interfaceC21461dMo118941b;
        }
        String qualifiedName = klass.getQualifiedName();
        if (qualifiedName != null) {
            return new C35848f(qualifiedName);
        }
        return null;
    }

    private final String renderCallable(InterfaceC21459c callable) {
        if (callable instanceof InterfaceC21493z) {
            return renderProperty((InterfaceC21493z) callable);
        }
        if (callable instanceof InterfaceC21467g) {
            return renderFunction((InterfaceC21467g) callable);
        }
        throw new IllegalStateException(("Illegal callable: " + callable).toString());
    }

    private final String renderFlexibleType(final String lowerRendered, String upperRendered) {
        if (AbstractC22676k.m65745e(lowerRendered, AbstractC39421y.m125926K(upperRendered, "?", "", false))) {
            return AbstractC39421y.m125926K(upperRendered, "?", "!", false);
        }
        if (AbstractC39421y.m125920E(upperRendered, "?", false)) {
            if (AbstractC22676k.m65745e(lowerRendered + '?', upperRendered)) {
                return lowerRendered + '!';
            }
        }
        if (AbstractC22676k.m65745e("(" + lowerRendered + ")?", upperRendered)) {
            return AbstractC11895b.m31996o("(", lowerRendered, ")!");
        }
        String strM113236i = AbstractC35744b.m113236i(lowerRendered, upperRendered, new InterfaceC4339a(lowerRendered) { // from class: kotlin.reflect.jvm.internal.ReflectionObjectRenderer$$Lambda$5
            private final String arg$0;

            {
                this.arg$0 = lowerRendered;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return ReflectionObjectRenderer.renderFlexibleType$lambda$0(this.arg$0);
            }
        }, new InterfaceC4339a(lowerRendered) { // from class: kotlin.reflect.jvm.internal.ReflectionObjectRenderer$$Lambda$6
            private final String arg$0;

            {
                this.arg$0 = lowerRendered;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return ReflectionObjectRenderer.renderFlexibleType$lambda$1(this.arg$0);
            }
        }, C38146g.f163311E);
        if (strM113236i != null) {
            return strM113236i;
        }
        return "(" + lowerRendered + ".." + upperRendered + ')';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderFlexibleType$lambda$0(String str) {
        String strM73377j = AbstractC25012a.m73377j(new StringBuilder(), AbstractC27742n.f111888m.f152613a.f152616a, '.');
        if (!AbstractC39421y.m125930O(str, strM73377j, false)) {
            strM73377j = null;
        }
        return strM73377j == null ? "" : strM73377j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderFlexibleType$lambda$1(String str) {
        String strM73377j = AbstractC25012a.m73377j(new StringBuilder(), AbstractC27742n.f111886k.f152613a.f152616a, '.');
        if (!AbstractC39421y.m125930O(str, strM73377j, false)) {
            strM73377j = null;
        }
        return strM73377j == null ? "" : strM73377j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence renderFunction$lambda$0$0(InterfaceC21484q it) {
        AbstractC22676k.m65750j(it, "it");
        return renderType$default(INSTANCE, it.getType(), false, 2, null);
    }

    private final void renderFunctionType(StringBuilder sb4, AbstractC37051a abstractC37051a) throws IOException {
        if (abstractC37051a.isMarkedNullable()) {
            sb4.append("(");
        }
        if (abstractC37051a.mo118945f()) {
            sb4.append("suspend ");
        }
        AbstractC25265s.m74109M0(AbstractC25265s.m74086A0(1, abstractC37051a.getArguments()), sb4, null, "(", ") -> ", null, 114);
        sb4.append(AbstractC25265s.m74112P0(abstractC37051a.getArguments()));
        if (abstractC37051a.isMarkedNullable()) {
            sb4.append(")?");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence renderLambda$lambda$0$1(InterfaceC21484q it) {
        AbstractC22676k.m65750j(it, "it");
        return renderType$default(INSTANCE, it.getType(), false, 2, null);
    }

    private final void renderSimpleType(StringBuilder sb4, InterfaceC21461d interfaceC21461d, C35848f c35848f, List<C21462d0> list, boolean z4, boolean z13) throws IOException {
        StringBuilder sb5;
        boolean z14;
        if (interfaceC21461d.getTypeParameters().size() >= list.size() || AbstractC21598x.m60663S(interfaceC21461d).getDeclaringClass() == null) {
            sb5 = sb4;
            z14 = z13;
            AbstractC22676k.m65750j(c35848f, "<this>");
            sb5.append(AbstractC35744b.m113237j(C35848f.m113790f(c35848f)));
        } else {
            Class<?> declaringClass = AbstractC21598x.m60663S(interfaceC21461d).getDeclaringClass();
            AbstractC22676k.m65749i(declaringClass, "getDeclaringClass(...)");
            sb5 = sb4;
            z14 = z13;
            renderSimpleType(sb5, AbstractC21598x.m60666V(declaringClass), c35848f.m113795e(), AbstractC25265s.m74161z0(list, interfaceC21461d.getTypeParameters().size()), false, z14);
            sb5.append(".");
            sb5.append(AbstractC35744b.m113235h(c35848f.m113796g()));
        }
        renderTypeArgumentsAndNullability(sb5, AbstractC25265s.m74156w1(list, interfaceC21461d.getTypeParameters().size()), z4, z14);
    }

    public static /* synthetic */ String renderType$default(ReflectionObjectRenderer reflectionObjectRenderer, InterfaceC21456a0 interfaceC21456a0, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        return reflectionObjectRenderer.renderType(interfaceC21456a0, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence renderType$lambda$0$1(C35850h it) {
        AbstractC22676k.m65750j(it, "it");
        return AbstractC35744b.m113235h(it);
    }

    private final void renderTypeArgumentsAndNullability(StringBuilder sb4, List<C21462d0> list, boolean z4, final boolean z13) throws IOException {
        StringBuilder sb5;
        if (list.isEmpty()) {
            sb5 = sb4;
        } else {
            sb5 = sb4;
            AbstractC25265s.m74109M0(list, sb5, null, "<", ">", new Function1(z13) { // from class: kotlin.reflect.jvm.internal.ReflectionObjectRenderer$$Lambda$4
                private final boolean arg$0;

                {
                    this.arg$0 = z13;
                }

                @Override // p715kotlin.jvm.functions.Function1
                public Object invoke(Object obj) {
                    return ReflectionObjectRenderer.renderTypeArgumentsAndNullability$lambda$0(this.arg$0, (C21462d0) obj);
                }
            }, 50);
        }
        if (z4) {
            sb5.append("?");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence renderTypeArgumentsAndNullability$lambda$0(boolean z4, C21462d0 it) {
        AbstractC22676k.m65750j(it, "it");
        StringBuilder sb4 = new StringBuilder();
        sb4.append(z4 ? "(raw) " : "");
        sb4.append(it);
        return sb4.toString();
    }

    public final String renderFunction(InterfaceC21467g function) throws IOException {
        AbstractC22676k.m65750j(function, "function");
        StringBuilder sb4 = new StringBuilder();
        ReflectionObjectRenderer reflectionObjectRenderer = INSTANCE;
        reflectionObjectRenderer.appendContexts(sb4, function);
        sb4.append("fun ");
        reflectionObjectRenderer.appendReceivers(sb4, function);
        reflectionObjectRenderer.appendName(sb4, function.getName());
        AbstractC25265s.m74109M0(AbstractC35148d.m111150A(function), sb4, ", ", "(", ")", new Function1() { // from class: kotlin.reflect.jvm.internal.ReflectionObjectRenderer$$Lambda$1
            @Override // p715kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return ReflectionObjectRenderer.renderFunction$lambda$0$0((InterfaceC21484q) obj);
            }
        }, 48);
        sb4.append(": ");
        sb4.append(renderType$default(reflectionObjectRenderer, function.getReturnType(), false, 2, null));
        return sb4.toString();
    }

    public final String renderLambda(InterfaceC21467g lambda) throws IOException {
        AbstractC22676k.m65750j(lambda, "lambda");
        StringBuilder sb4 = new StringBuilder();
        Iterator it = lambda.getParameters().iterator();
        Object obj = null;
        boolean z4 = false;
        while (true) {
            if (!it.hasNext()) {
                if (!z4) {
                    break;
                }
                break;
            }
            Object next = it.next();
            if (((InterfaceC21484q) next).getKind() == EnumC21483p.f82448y) {
                if (!z4) {
                    z4 = true;
                    obj = next;
                }
            }
            obj = null;
            break;
        }
        InterfaceC21484q interfaceC21484q = (InterfaceC21484q) obj;
        if (interfaceC21484q != null) {
            sb4.append(renderType$default(INSTANCE, interfaceC21484q.getType(), false, 2, null));
            sb4.append(".");
        }
        AbstractC25265s.m74109M0(AbstractC35148d.m111150A(lambda), sb4, ", ", "(", ")", new Function1() { // from class: kotlin.reflect.jvm.internal.ReflectionObjectRenderer$$Lambda$2
            @Override // p715kotlin.jvm.functions.Function1
            public Object invoke(Object obj2) {
                return ReflectionObjectRenderer.renderLambda$lambda$0$1((InterfaceC21484q) obj2);
            }
        }, 48);
        sb4.append(" -> ");
        sb4.append(renderType$default(INSTANCE, lambda.getReturnType(), false, 2, null));
        return sb4.toString();
    }

    public final String renderParameter(InterfaceC21484q parameter) {
        AbstractC22676k.m65750j(parameter, "parameter");
        StringBuilder sb4 = new StringBuilder();
        int i13 = WhenMappings.$EnumSwitchMapping$0[parameter.getKind().ordinal()];
        if (i13 == 1) {
            sb4.append("instance parameter");
        } else if (i13 == 2) {
            sb4.append("context parameter " + parameter.getName());
        } else if (i13 == 3) {
            sb4.append("extension receiver parameter");
        } else {
            if (i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            sb4.append("parameter #" + parameter.getIndex() + ' ' + parameter.getName());
        }
        sb4.append(" of ");
        sb4.append(INSTANCE.renderCallable(((ReflectKParameter) parameter).getCallable()));
        return sb4.toString();
    }

    public final String renderProperty(InterfaceC21493z property) throws IOException {
        AbstractC22676k.m65750j(property, "property");
        StringBuilder sb4 = new StringBuilder();
        ReflectionObjectRenderer reflectionObjectRenderer = INSTANCE;
        reflectionObjectRenderer.appendContexts(sb4, property);
        sb4.append(property instanceof InterfaceC21482o ? "var " : "val ");
        reflectionObjectRenderer.appendReceivers(sb4, property);
        reflectionObjectRenderer.appendName(sb4, property.getName());
        sb4.append(": ");
        sb4.append(renderType$default(reflectionObjectRenderer, property.getReturnType(), false, 2, null));
        return sb4.toString();
    }

    public final String renderType(InterfaceC21456a0 type, boolean renderRawArgumentPrefix) throws IOException {
        AbstractC22676k.m65750j(type, "type");
        AbstractC37051a abstractC37051a = (AbstractC37051a) type;
        if (abstractC37051a.mo118944e()) {
            AbstractC37051a abstractC37051aMo118946g = abstractC37051a.mo118946g();
            AbstractC22676k.m65747g(abstractC37051aMo118946g);
            return renderType(abstractC37051aMo118946g, true);
        }
        AbstractC37051a abstractC37051aMo118946g2 = abstractC37051a.mo118946g();
        AbstractC37051a abstractC37051aMo118949j = abstractC37051a.mo118949j();
        if (abstractC37051aMo118946g2 != null && abstractC37051aMo118949j != null) {
            return renderFlexibleType(renderType$default(this, abstractC37051aMo118946g2, false, 2, null), renderType$default(this, abstractC37051aMo118949j, false, 2, null));
        }
        StringBuilder sb4 = new StringBuilder();
        InterfaceC21456a0 interfaceC21456a0Mo118940a = abstractC37051a.mo118940a();
        if (interfaceC21456a0Mo118940a != null) {
            sb4.append(interfaceC21456a0Mo118940a);
            sb4.append(" /* = ");
        }
        InterfaceC21463e classifier = type.getClassifier();
        if (classifier instanceof InterfaceC21458b0) {
            INSTANCE.appendName(sb4, ((InterfaceC21458b0) classifier).getName());
            if (type.isMarkedNullable()) {
                sb4.append("?");
            } else if (abstractC37051a.mo118942c()) {
                sb4.append(" & Any");
            }
        } else if (classifier instanceof InterfaceC21461d) {
            ReflectionObjectRenderer reflectionObjectRenderer = INSTANCE;
            InterfaceC21461d interfaceC21461d = (InterfaceC21461d) classifier;
            C35848f typeClassFqName = reflectionObjectRenderer.getTypeClassFqName(abstractC37051a, interfaceC21461d);
            if (typeClassFqName == null) {
                typeClassFqName = new C35848f(((KClassImpl) interfaceC21461d).getJClass().getName());
            }
            if (typeClassFqName.m113797h(AbstractC27742n.f111885j) && AbstractC22676k.m65745e(AbstractC5583n.m16748G(typeClassFqName), C29028g.f117498c) && !type.getArguments().contains(C21462d0.f82423c)) {
                reflectionObjectRenderer.renderFunctionType(sb4, abstractC37051a);
            } else {
                reflectionObjectRenderer.renderSimpleType(sb4, interfaceC21461d, typeClassFqName, type.getArguments(), type.isMarkedNullable(), renderRawArgumentPrefix);
            }
        } else if (classifier instanceof KTypeAliasImpl) {
            C35848f c35848f = ((KTypeAliasImpl) classifier).getFqName().f152613a;
            c35848f.getClass();
            AbstractC25265s.m74109M0(C35848f.m113790f(c35848f), sb4, ".", null, null, new Function1() { // from class: kotlin.reflect.jvm.internal.ReflectionObjectRenderer$$Lambda$3
                @Override // p715kotlin.jvm.functions.Function1
                public Object invoke(Object obj) {
                    return ReflectionObjectRenderer.renderType$lambda$0$1((C35850h) obj);
                }
            }, 60);
            INSTANCE.renderTypeArgumentsAndNullability(sb4, type.getArguments(), type.isMarkedNullable(), renderRawArgumentPrefix);
        } else {
            sb4.append("???");
        }
        if (abstractC37051a.mo118940a() != null) {
            sb4.append(" */");
        }
        return sb4.toString();
    }
}
