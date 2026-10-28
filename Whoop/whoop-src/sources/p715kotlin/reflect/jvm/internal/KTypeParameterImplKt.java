package p715kotlin.reflect.jvm.internal;

import j93.EnumC21464e0;
import j93.InterfaceC21461d;
import jb3.InterfaceC21550j;
import jb3.InterfaceC21551k;
import l83.C23454a0;
import lb3.EnumC23776g1;
import oa3.C27765h;
import p249jc.AbstractC21598x;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31111c;
import r93.InterfaceC31117e;
import r93.InterfaceC31135k;
import r93.InterfaceC31165x0;
import w93.C36969b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Llb3/g1;", "Lj93/e0;", "toKVariance", "(Llb3/g1;)Lj93/e0;", "Lr93/x0;", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "toContainer", "(Lr93/x0;)Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "Lr93/e;", "Lkotlin/reflect/jvm/internal/KClassImpl;", "toKClassImpl", "(Lr93/e;)Lkotlin/reflect/jvm/internal/KClassImpl;", "Ljb3/k;", "Ljava/lang/Class;", "getContainerClass", "(Ljb3/k;)Ljava/lang/Class;", "kotlin-reflection"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class KTypeParameterImplKt {

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC23776g1.values().length];
            try {
                EnumC23776g1 enumC23776g1 = EnumC23776g1.INVARIANT;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EnumC23776g1 enumC23776g2 = EnumC23776g1.INVARIANT;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EnumC23776g1 enumC23776g3 = EnumC23776g1.INVARIANT;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final Class<?> getContainerClass(InterfaceC21551k interfaceC21551k) {
        Class<?> cls;
        InterfaceC21550j interfaceC21550jMo60569x = interfaceC21551k.mo60569x();
        C27765h c27765h = interfaceC21550jMo60569x instanceof C27765h ? (C27765h) interfaceC21550jMo60569x : null;
        C36969b c36969b = c27765h != null ? c27765h.f111958y : null;
        C36969b c36969b2 = c36969b instanceof C36969b ? c36969b : null;
        if (c36969b2 != null && (cls = c36969b2.f158227a) != null) {
            return cls;
        }
        throw new KotlinReflectionInternalError("Container of deserialized member is not resolved: " + interfaceC21551k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KTypeParameterOwnerImpl toContainer(InterfaceC31165x0 interfaceC31165x0) {
        KClassImpl<?> kClassImpl;
        InterfaceC31135k interfaceC31135kMo60581g = interfaceC31165x0.mo60581g();
        AbstractC22676k.m65749i(interfaceC31135kMo60581g, "getContainingDeclaration(...)");
        if (interfaceC31135kMo60581g instanceof InterfaceC31117e) {
            return toKClassImpl((InterfaceC31117e) interfaceC31135kMo60581g);
        }
        if (!(interfaceC31135kMo60581g instanceof InterfaceC31111c)) {
            throw new KotlinReflectionInternalError("Unknown type parameter container: " + interfaceC31135kMo60581g);
        }
        InterfaceC31135k interfaceC31135kMo60581g2 = ((InterfaceC31111c) interfaceC31135kMo60581g).mo60581g();
        AbstractC22676k.m65749i(interfaceC31135kMo60581g2, "getContainingDeclaration(...)");
        if (interfaceC31135kMo60581g2 instanceof InterfaceC31117e) {
            kClassImpl = toKClassImpl((InterfaceC31117e) interfaceC31135kMo60581g2);
        } else {
            InterfaceC21551k interfaceC21551k = interfaceC31135kMo60581g instanceof InterfaceC21551k ? (InterfaceC21551k) interfaceC31135kMo60581g : null;
            if (interfaceC21551k == null) {
                throw new KotlinReflectionInternalError("Non-class callable descriptor must be deserialized: " + interfaceC31135kMo60581g);
            }
            InterfaceC21461d interfaceC21461dM60666V = AbstractC21598x.m60666V(getContainerClass(interfaceC21551k));
            AbstractC22676k.m65748h(interfaceC21461dM60666V, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
            kClassImpl = (KClassImpl) interfaceC21461dM60666V;
        }
        Object objMo78659T = interfaceC31135kMo60581g.mo78659T(new CreateKCallableVisitor(kClassImpl), C23454a0.f92919a);
        AbstractC22676k.m65747g(objMo78659T);
        return (KTypeParameterOwnerImpl) objMo78659T;
    }

    private static final KClassImpl<?> toKClassImpl(InterfaceC31117e interfaceC31117e) {
        Class<?> javaClass = UtilKt.toJavaClass(interfaceC31117e);
        KClassImpl<?> kClassImpl = (KClassImpl) (javaClass != null ? AbstractC21598x.m60666V(javaClass) : null);
        if (kClassImpl != null) {
            return kClassImpl;
        }
        throw new KotlinReflectionInternalError("Type parameter container is not resolved: " + interfaceC31117e.mo60581g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnumC21464e0 toKVariance(EnumC23776g1 enumC23776g1) {
        int iOrdinal = enumC23776g1.ordinal();
        if (iOrdinal == 0) {
            return EnumC21464e0.f82426w;
        }
        if (iOrdinal == 1) {
            return EnumC21464e0.f82427x;
        }
        if (iOrdinal == 2) {
            return EnumC21464e0.f82428y;
        }
        throw new NoWhenBranchMatchedException();
    }
}
