package p715kotlin.reflect.jvm.internal;

import androidx.room.AbstractC1772c1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import db3.C11890b;
import hb3.C17122k;
import hb3.C17135x;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import j93.AbstractC21478l0;
import j93.InterfaceC21459c;
import j93.InterfaceC21493z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import jb3.C21558r;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.C25271y;
import oa3.C27763f;
import p014aj.C0929d;
import p097ds.AbstractC12313p;
import p098dt.AbstractC12350b;
import p474s.C31983m2;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22693x;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22711n;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;
import pa3.C29039b;
import pa3.EnumC29038a;
import q83.AbstractC30060g;
import qa3.C30123c1;
import qa3.C30134g0;
import qa3.C30146k0;
import r80.AbstractC31061c;
import r93.InterfaceC31111c;
import r93.InterfaceC31132j;
import r93.InterfaceC31135k;
import r93.InterfaceC31145n0;
import r93.InterfaceC31162w;
import sa3.C32331e;
import sa3.C32334h;
import sa3.InterfaceC32332f;
import ta3.AbstractC33686l;
import u93.C34696q;
import va3.AbstractC35849g;
import va3.C35845c;
import va3.C35847e;
import va3.C35850h;
import w93.C36969b;
import wa3.C37010o;
import wb3.AbstractC37056f;
import x93.AbstractC38109c;
import yb3.AbstractC39421y;
import z93.EnumC40212c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u00010B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010!\u001a\f\u0012\b\u0012\u00060 R\u00020\u00000\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0006\u0012\u0002\b\u00030\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001eR\u001e\u0010(\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030%0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020)0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010'R\u0014\u0010/\u001a\u00020,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00061"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/KPackageImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Ljava/lang/Class;", "jClass", "<init>", "(Ljava/lang/Class;)V", "Lva3/h;", "name", "", "Lr93/n0;", "getProperties", "(Lva3/h;)Ljava/util/Collection;", "Lr93/w;", "getFunctions", "", "index", "getLocalProperty", "(I)Lr93/n0;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Class;", "getJClass", "()Ljava/lang/Class;", "Ll83/h;", "Lkotlin/reflect/jvm/internal/KPackageImpl$Data;", "data", "Ll83/h;", "getMethodOwner", "methodOwner", "Lj93/c;", "getMembers", "()Ljava/util/Collection;", QueryChannelRequest.KEY_MEMBERS, "Lr93/j;", "getConstructorDescriptors", "constructorDescriptors", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "scope", "Data", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class KPackageImpl extends KDeclarationContainerImpl {
    private final InterfaceC23462h data;
    private final Class<?> jClass;

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001d\u0010\n\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\u000eR!\u0010\u0015\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R%\u0010\u001b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0007\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/KPackageImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "<init>", "(Lkotlin/reflect/jvm/internal/KPackageImpl;)V", "Lw93/b;", "kotlinClass$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getKotlinClass", "()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", "kotlinClass", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;", "scope$delegate", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "scope", "Ljava/lang/Class;", "multifileFacade$delegate", "Ll83/h;", "getMultifileFacade", "()Ljava/lang/Class;", "multifileFacade", "", "Lkotlin/reflect/jvm/internal/DescriptorKCallable;", "members$delegate", "getMembers", "()Ljava/util/Collection;", QueryChannelRequest.KEY_MEMBERS, "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public final class Data extends KDeclarationContainerImpl.Data {
        static final /* synthetic */ InterfaceC21493z[] $$delegatedProperties;

        /* JADX INFO: renamed from: kotlinClass$delegate, reason: from kotlin metadata */
        private final ReflectProperties.LazySoftVal kotlinClass;

        /* JADX INFO: renamed from: members$delegate, reason: from kotlin metadata */
        private final ReflectProperties.LazySoftVal members;

        /* JADX INFO: renamed from: multifileFacade$delegate, reason: from kotlin metadata */
        private final InterfaceC23462h multifileFacade;

        /* JADX INFO: renamed from: scope$delegate, reason: from kotlin metadata */
        private final ReflectProperties.LazySoftVal scope;

        static {
            C22693x c22693x = new C22693x(Data.class, "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", 0);
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            $$delegatedProperties = new InterfaceC21493z[]{c22673i0.property1(c22693x), AbstractC31061c.m95632h(Data.class, "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0, c22673i0), AbstractC31061c.m95632h(Data.class, QueryChannelRequest.KEY_MEMBERS, "getMembers()Ljava/util/Collection;", 0, c22673i0)};
        }

        public Data() {
            super();
            this.kotlinClass = ReflectProperties.lazySoft(new InterfaceC4339a(KPackageImpl.this) { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$$Lambda$0
                private final KPackageImpl arg$0;

                {
                    this.arg$0 = kPackageImpl;
                }

                @Override // c93.InterfaceC4339a
                public Object invoke() {
                    return KPackageImpl.Data.kotlinClass_delegate$lambda$0(this.arg$0);
                }
            });
            this.scope = ReflectProperties.lazySoft(new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$$Lambda$1
                private final KPackageImpl.Data arg$0;

                {
                    this.arg$0 = this;
                }

                @Override // c93.InterfaceC4339a
                public Object invoke() {
                    return KPackageImpl.Data.scope_delegate$lambda$0(this.arg$0);
                }
            });
            this.multifileFacade = AbstractC30060g.m92087G(EnumC23463i.f92934x, new InterfaceC4339a(this, KPackageImpl.this) { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$$Lambda$2
                private final KPackageImpl.Data arg$0;
                private final KPackageImpl arg$1;

                {
                    this.arg$0 = this;
                    this.arg$1 = kPackageImpl;
                }

                @Override // c93.InterfaceC4339a
                public Object invoke() {
                    return KPackageImpl.Data.multifileFacade_delegate$lambda$0(this.arg$0, this.arg$1);
                }
            });
            this.members = ReflectProperties.lazySoft(new InterfaceC4339a(this, KPackageImpl.this) { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$$Lambda$3
                private final KPackageImpl.Data arg$0;
                private final KPackageImpl arg$1;

                {
                    this.arg$0 = this;
                    this.arg$1 = kPackageImpl;
                }

                @Override // c93.InterfaceC4339a
                public Object invoke() {
                    return KPackageImpl.Data.members_delegate$lambda$0(this.arg$0, this.arg$1);
                }
            });
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final C36969b getKotlinClass() {
            return (C36969b) this.kotlinClass.getValue(this, $$delegatedProperties[0]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C36969b kotlinClass_delegate$lambda$0(KPackageImpl kPackageImpl) {
            return AbstractC35849g.m113810l(kPackageImpl.getJClass());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List members_delegate$lambda$0(Data data, final KPackageImpl kPackageImpl) {
            CreateKCallableVisitor createKCallableVisitor = new CreateKCallableVisitor(kPackageImpl) { // from class: kotlin.reflect.jvm.internal.KPackageImpl$Data$members$2$visitor$1
                @Override // u93.AbstractC34694p, r93.InterfaceC31141m
                public DescriptorKCallable<?> visitConstructorDescriptor(InterfaceC31132j descriptor, C23454a0 data2) {
                    AbstractC22676k.m65750j(descriptor, "descriptor");
                    AbstractC22676k.m65750j(data2, "data");
                    throw new IllegalStateException("No constructors should appear here: " + descriptor);
                }
            };
            Collection<InterfaceC31135k> collectionM34599t = AbstractC12350b.m34599t(data.getScope(), null, 3);
            ArrayList arrayList = new ArrayList();
            for (InterfaceC31135k interfaceC31135k : collectionM34599t) {
                DescriptorKCallable descriptorKCallable = interfaceC31135k instanceof InterfaceC31111c ? (DescriptorKCallable) interfaceC31135k.mo78659T(createKCallableVisitor, C23454a0.f92919a) : null;
                if (descriptorKCallable != null) {
                    arrayList.add(descriptorKCallable);
                }
            }
            return AbstractC25265s.m74093D1(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        public static final Class multifileFacade_delegate$lambda$0(Data data, KPackageImpl kPackageImpl) {
            String str;
            C36969b kotlinClass = data.getKotlinClass();
            if (kotlinClass != null) {
                C29039b c29039b = kotlinClass.f158228b;
                str = c29039b.f117523b;
                if (((EnumC29038a) c29039b.f117525d) != EnumC29038a.MULTIFILE_CLASS_PART) {
                    str = null;
                }
            } else {
                str = null;
            }
            if (str == null || str.length() <= 0) {
                return null;
            }
            return kPackageImpl.getJClass().getClassLoader().loadClass(AbstractC39421y.m125927L(str, '/', '.'));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v14, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r5v5 */
        public static final InterfaceC22712o scope_delegate$lambda$0(Data data) {
            ?? M118958J;
            C36969b kotlinClass = data.getKotlinClass();
            if (kotlinClass == null) {
                return C22711n.f89378b;
            }
            C31983m2 c31983m2 = data.getModuleData().f158233b;
            C27763f c27763f = (C27763f) c31983m2.f132768w;
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c31983m2.f132770y;
            Class cls = kotlinClass.f158227a;
            C35845c c35845cM122089a = AbstractC38109c.m122089a(cls);
            Object obj = concurrentHashMap.get(c35845cM122089a);
            if (obj == null) {
                C35847e c35847e = AbstractC38109c.m122089a(cls).f152609a;
                C29039b c29039b = kotlinClass.f158228b;
                EnumC29038a enumC29038a = (EnumC29038a) c29039b.f117525d;
                EnumC29038a enumC29038a2 = EnumC29038a.MULTIFILE_CLASS;
                if (enumC29038a == enumC29038a2) {
                    String[] strArr = (String[]) c29039b.f117527f;
                    if (enumC29038a != enumC29038a2) {
                        strArr = null;
                    }
                    List listM74048W = strArr != null ? AbstractC25260n.m74048W(strArr) : null;
                    if (listM74048W == null) {
                        listM74048W = C25271y.f99162w;
                    }
                    M118958J = new ArrayList();
                    Iterator it = listM74048W.iterator();
                    while (it.hasNext()) {
                        C35847e c35847e2 = new C35847e(C11890b.m31926c((String) it.next()).f38861a.replace('/', '.'));
                        C35845c c35845c = new C35845c(c35847e2.m113789b(), c35847e2.f152613a.m113796g());
                        C0929d c0929d = (C0929d) c31983m2.f132769x;
                        c27763f.m83862c().f65737c.getClass();
                        C36969b c36969bM34252D = AbstractC12313p.m34252D(c0929d, c35845c, C32331e.f133827g);
                        if (c36969bM34252D != null) {
                            M118958J.add(c36969bM34252D);
                        }
                    }
                } else {
                    M118958J = AbstractC37056f.m118958J(kotlinClass);
                }
                C34696q c34696q = new C34696q(c27763f.m83862c().f65736b, c35847e);
                ArrayList arrayList = new ArrayList();
                Iterator it3 = ((Iterable) M118958J).iterator();
                while (it3.hasNext()) {
                    C21558r c21558rM83860a = c27763f.m83860a(c34696q, (C36969b) it3.next());
                    if (c21558rM83860a != null) {
                        arrayList.add(c21558rM83860a);
                    }
                }
                InterfaceC22712o interfaceC22712oM5395m = AbstractC1772c1.m5395m("package " + c35847e + " (" + kotlinClass + ')', AbstractC25265s.m74093D1(arrayList));
                Object objPutIfAbsent = concurrentHashMap.putIfAbsent(c35845cM122089a, interfaceC22712oM5395m);
                obj = objPutIfAbsent == null ? interfaceC22712oM5395m : objPutIfAbsent;
            }
            AbstractC22676k.m65749i(obj, "getOrPut(...)");
            return (InterfaceC22712o) obj;
        }

        public final Collection<DescriptorKCallable<?>> getMembers() {
            T value = this.members.getValue(this, $$delegatedProperties[2]);
            AbstractC22676k.m65749i(value, "getValue(...)");
            return (Collection) value;
        }

        public final Class<?> getMultifileFacade() {
            return (Class) this.multifileFacade.getValue();
        }

        public final InterfaceC22712o getScope() {
            T value = this.scope.getValue(this, $$delegatedProperties[1]);
            AbstractC22676k.m65749i(value, "getValue(...)");
            return (InterfaceC22712o) value;
        }
    }

    public KPackageImpl(Class<?> jClass) {
        AbstractC22676k.m65750j(jClass, "jClass");
        this.jClass = jClass;
        this.data = AbstractC30060g.m92087G(EnumC23463i.f92934x, new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.KPackageImpl$$Lambda$0
            private final KPackageImpl arg$0;

            {
                this.arg$0 = this;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return KPackageImpl.data$lambda$0(this.arg$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Data data$lambda$0(KPackageImpl kPackageImpl) {
        return kPackageImpl.new Data();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC31145n0 getLocalProperty$lambda$0$0(C17135x deserializeToDescriptor, C30146k0 proto) {
        AbstractC22676k.m65750j(deserializeToDescriptor, "$this$deserializeToDescriptor");
        AbstractC22676k.m65750j(proto, "proto");
        return deserializeToDescriptor.m48379g(proto, true);
    }

    private final InterfaceC22712o getScope() {
        return ((Data) this.data.getValue()).getScope();
    }

    public boolean equals(Object other) {
        return (other instanceof KPackageImpl) && AbstractC22676k.m65745e(getJClass(), ((KPackageImpl) other).getJClass());
    }

    @Override // p715kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public Collection<InterfaceC31132j> getConstructorDescriptors() {
        return C25271y.f99162w;
    }

    @Override // p715kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public Collection<InterfaceC31162w> getFunctions(C35850h name) {
        AbstractC22676k.m65750j(name, "name");
        return getScope().getContributedFunctions(name, EnumC40212c.f173638x);
    }

    @Override // p715kotlin.reflect.jvm.internal.KDeclarationContainerImpl, p715kotlin.jvm.internal.InterfaceC22662d
    public Class<?> getJClass() {
        return this.jClass;
    }

    @Override // p715kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public InterfaceC31145n0 getLocalProperty(int index) {
        InterfaceC22712o scope = getScope();
        C21558r c21558r = scope instanceof C21558r ? (C21558r) scope : null;
        if (c21558r == null) {
            return null;
        }
        C17122k c17122k = c21558r.f82672b;
        C30134g0 c30134g0 = c21558r.f82677h;
        C37010o packageLocalVariable = AbstractC33686l.f140746l;
        AbstractC22676k.m65749i(packageLocalVariable, "packageLocalVariable");
        C30146k0 c30146k0 = (C30146k0) AbstractC21478l0.m60454y(c30134g0, packageLocalVariable, index);
        if (c30146k0 == null) {
            return null;
        }
        Class<?> jClass = getJClass();
        InterfaceC32332f interfaceC32332f = c17122k.f65761b;
        C30123c1 c30123c1 = c30134g0.f123155G;
        AbstractC22676k.m65749i(c30123c1, "getTypeTable(...)");
        return (InterfaceC31145n0) UtilKt.deserializeToDescriptor(jClass, c30146k0, interfaceC32332f, new C32334h(c30123c1), c17122k.f65765f, new InterfaceC4351m() { // from class: kotlin.reflect.jvm.internal.KPackageImpl$$Lambda$1
            @Override // c93.InterfaceC4351m
            public Object invoke(Object obj, Object obj2) {
                return KPackageImpl.getLocalProperty$lambda$0$0((C17135x) obj, (C30146k0) obj2);
            }
        });
    }

    @Override // p715kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public Collection<InterfaceC21459c> getMembers() {
        return ((Data) this.data.getValue()).getMembers();
    }

    @Override // p715kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public Class<?> getMethodOwner() {
        Class<?> multifileFacade = ((Data) this.data.getValue()).getMultifileFacade();
        return multifileFacade == null ? getJClass() : multifileFacade;
    }

    @Override // p715kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public Collection<InterfaceC31145n0> getProperties(C35850h name) {
        AbstractC22676k.m65750j(name, "name");
        return getScope().getContributedVariables(name, EnumC40212c.f173638x);
    }

    public int hashCode() {
        return getJClass().hashCode();
    }

    public String toString() {
        return "file class " + AbstractC38109c.m122089a(getJClass()).m113773a();
    }
}
