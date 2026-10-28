package p715kotlin.reflect.jvm.internal;

import c93.InterfaceC4339a;
import j93.EnumC21464e0;
import j93.InterfaceC21456a0;
import j93.InterfaceC21458b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lb3.AbstractC23811y;
import lb3.EnumC23776g1;
import m83.AbstractC25267u;
import ob3.InterfaceC27802l;
import ob3.InterfaceC27803m;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31165x0;
import wb3.C37058h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BE\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u001b\b\u0016\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0013B)\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u001c\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\u001dR\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010%\u001a\u0004\b\u000f\u0010&R\u0016\u0010'\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R(\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0014\u0010\u0012\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00065"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "Lj93/b0;", "Lob3/m;", "Lob3/l;", "Lr93/x0;", "descriptor", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "_container", "Lkotlin/Function0;", "computeContainer", "", "name", "Lj93/e0;", "variance", "", "isReified", "<init>", "(Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;Lc93/a;Ljava/lang/String;Lj93/e0;Z)V", "container", "(Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;)V", "(Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;Ljava/lang/String;Lj93/e0;Z)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "Lc93/a;", "Ljava/lang/String;", "getName", "Lj93/e0;", "getVariance", "()Lj93/e0;", "Z", "()Z", "_descriptor", "Lr93/x0;", "", "Lj93/a0;", "upperBounds", "Ljava/util/List;", "getUpperBounds", "()Ljava/util/List;", "setUpperBounds", "(Ljava/util/List;)V", "getContainer", "()Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class KTypeParameterImpl implements InterfaceC21458b0, InterfaceC27802l, InterfaceC27803m {
    private final KTypeParameterOwnerImpl _container;
    private final InterfaceC31165x0 _descriptor;
    private final InterfaceC4339a computeContainer;
    private final boolean isReified;
    private final String name;
    public volatile List<? extends InterfaceC21456a0> upperBounds;
    private final EnumC21464e0 variance;

    private KTypeParameterImpl(InterfaceC31165x0 interfaceC31165x0, KTypeParameterOwnerImpl kTypeParameterOwnerImpl, InterfaceC4339a interfaceC4339a, String str, EnumC21464e0 enumC21464e0, boolean z4) {
        this._container = kTypeParameterOwnerImpl;
        this.computeContainer = interfaceC4339a;
        this.name = str;
        this.variance = enumC21464e0;
        this.isReified = z4;
        this._descriptor = interfaceC31165x0;
    }

    private final KTypeParameterOwnerImpl getContainer() {
        KTypeParameterOwnerImpl kTypeParameterOwnerImpl = this._container;
        if (kTypeParameterOwnerImpl != null) {
            return kTypeParameterOwnerImpl;
        }
        InterfaceC4339a interfaceC4339a = this.computeContainer;
        AbstractC22676k.m65747g(interfaceC4339a);
        return (KTypeParameterOwnerImpl) interfaceC4339a.invoke();
    }

    public boolean equals(Object other) {
        if (!(other instanceof KTypeParameterImpl)) {
            return false;
        }
        KTypeParameterImpl kTypeParameterImpl = (KTypeParameterImpl) other;
        return AbstractC22676k.m65745e(getContainer(), kTypeParameterImpl.getContainer()) && AbstractC22676k.m65745e(getName(), kTypeParameterImpl.getName());
    }

    public final InterfaceC31165x0 getDescriptor() {
        InterfaceC31165x0 interfaceC31165x0 = this._descriptor;
        if (interfaceC31165x0 != null) {
            return interfaceC31165x0;
        }
        throw new IllegalStateException(("Descriptor-less type parameter: " + this).toString());
    }

    @Override // j93.InterfaceC21458b0
    public String getName() {
        return this.name;
    }

    @Override // j93.InterfaceC21458b0
    public List<InterfaceC21456a0> getUpperBounds() {
        List list = this.upperBounds;
        if (list != null) {
            return list;
        }
        AbstractC22676k.m65757q("upperBounds");
        throw null;
    }

    @Override // j93.InterfaceC21458b0
    public EnumC21464e0 getVariance() {
        return this.variance;
    }

    public int hashCode() {
        return getName().hashCode() + (getContainer().hashCode() * 31);
    }

    /* JADX INFO: renamed from: isReified, reason: from getter */
    public boolean getIsReified() {
        return this.isReified;
    }

    public void setUpperBounds(List<? extends InterfaceC21456a0> list) {
        AbstractC22676k.m65750j(list, "<set-?>");
        this.upperBounds = list;
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder();
        int iOrdinal = getVariance().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                sb4.append("in ");
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                sb4.append("out ");
            }
        }
        sb4.append(getName());
        return sb4.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KTypeParameterImpl(KTypeParameterOwnerImpl container, String name, EnumC21464e0 variance, boolean z4) {
        this(null, container, null, name, variance, z4);
        AbstractC22676k.m65750j(container, "container");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(variance, "variance");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public KTypeParameterImpl(KTypeParameterOwnerImpl kTypeParameterOwnerImpl, final InterfaceC31165x0 descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        ReflectProperties.LazySoftVal lazySoftValLazySoft = ReflectProperties.lazySoft(new InterfaceC4339a(descriptor) { // from class: kotlin.reflect.jvm.internal.KTypeParameterImpl$$Lambda$0
            private final InterfaceC31165x0 arg$0;

            {
                this.arg$0 = descriptor;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return KTypeParameterImplKt.toContainer(this.arg$0);
            }
        });
        String strM113817b = descriptor.getName().m113817b();
        AbstractC22676k.m65749i(strM113817b, "asString(...)");
        EnumC23776g1 variance = descriptor.getVariance();
        AbstractC22676k.m65749i(variance, "getVariance(...)");
        this(descriptor, kTypeParameterOwnerImpl, lazySoftValLazySoft, strM113817b, KTypeParameterImplKt.toKVariance(variance), descriptor.isReified());
        List upperBounds = descriptor.getUpperBounds();
        AbstractC22676k.m65749i(upperBounds, "getUpperBounds(...)");
        List list = upperBounds;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C37058h((AbstractC23811y) it.next(), null));
        }
        setUpperBounds(arrayList);
    }
}
