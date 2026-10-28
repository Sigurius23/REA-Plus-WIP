package p715kotlin.reflect.jvm.internal;

import al.AbstractC0954a;
import androidx.core.app.NotificationCompat;
import c93.InterfaceC4339a;
import ha3.InterfaceC17058a;
import hg3.AbstractC17269i;
import j93.EnumC21466f0;
import j93.EnumC21483p;
import j93.InterfaceC21456a0;
import j93.InterfaceC21458b0;
import j93.InterfaceC21484q;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jb3.C21559s;
import jb3.C21560t;
import l83.C23465k;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lb3.AbstractC23811y;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.AbstractC25269w;
import m83.C25271y;
import m93.InterfaceC25339g;
import o73.C27648a;
import p249jc.AbstractC21598x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.full.IllegalCallableAccessException;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qa3.C30129e1;
import r93.AbstractC31152r;
import r93.EnumC31106a0;
import r93.InterfaceC31107a1;
import r93.InterfaceC31111c;
import r93.InterfaceC31139l0;
import r93.InterfaceC31142m0;
import r93.InterfaceC31145n0;
import r93.InterfaceC31151q0;
import r93.InterfaceC31155s0;
import r93.InterfaceC31165x0;
import sa3.InterfaceC32332f;
import se.AbstractC32410a;
import u93.AbstractC34670d;
import u93.AbstractC34685k0;
import u93.C34709w0;
import va3.C35850h;
import wb3.AbstractC37056f;
import wb3.C37058h;
import x43.AbstractC37978j;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\t\u001a\u00028\u00002\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ%\u0010\r\u001a\u00028\u00002\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0011\u001a\u00028\u00002\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b2\f\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001e\u001a\u00028\u00002\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u000eJ\u0017\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0011\u0010$\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b$\u0010%R.\u0010)\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020' (*\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00140\u00140&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*RD\u0010-\u001a2\u0012.\u0012,\u0012\u0004\u0012\u00020\f (*\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010+j\n\u0012\u0004\u0012\u00020\f\u0018\u0001`,0+j\b\u0012\u0004\u0012\u00020\f`,0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010*RD\u0010.\u001a2\u0012.\u0012,\u0012\u0004\u0012\u00020\f (*\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010+j\n\u0012\u0004\u0012\u00020\f\u0018\u0001`,0+j\b\u0012\u0004\u0012\u00020\f`,0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010*R\"\u00100\u001a\u0010\u0012\f\u0012\n (*\u0004\u0018\u00010/0/0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010*R.\u00102\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000201 (*\n\u0012\u0004\u0012\u000201\u0018\u00010\u00140\u00140&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010*R2\u00103\u001a \u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007 (*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00060&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010*R\u001a\u00106\u001a\b\u0012\u0004\u0012\u000205048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020'0\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\f0\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u00109R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\f0\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u00109R\u0014\u0010A\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020B0\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u00109R\u0016\u0010H\u001a\u0004\u0018\u00010E8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010I\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010K\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010JR\u0014\u0010L\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010JR\u0014\u0010M\u001a\u0002058DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bM\u0010JR\u0014\u0010P\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006Q"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKCallable;", "R", "Lkotlin/reflect/jvm/internal/ReflectKCallable;", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "<init>", "()V", "", "", "args", NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "", "Lj93/q;", "callBy", "(Ljava/util/Map;)Ljava/lang/Object;", "Lq83/d;", "continuationArgument", "callDefaultMethod", "(Ljava/util/Map;Lq83/d;)Ljava/lang/Object;", "Lr93/c;", "", "Lr93/a1;", "computeContextParameters", "(Lr93/c;)Ljava/util/List;", "getAbsentArguments", "()[Ljava/lang/Object;", "parameter", "", "getParameterTypeSize", "(Lj93/q;)I", "callAnnotationConstructor", "Lj93/a0;", "type", "defaultEmptyArray", "(Lj93/a0;)Ljava/lang/Object;", "Ljava/lang/reflect/Type;", "extractContinuationArgument", "()Ljava/lang/reflect/Type;", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "", "kotlin.jvm.PlatformType", "_annotations", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "_receiverParameters", "_parameters", "Lwb3/h;", "_returnType", "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "_typeParameters", "_absentArguments", "Ll83/h;", "", "parametersNeedMFVCFlattening", "Ll83/h;", "getAnnotations", "()Ljava/util/List;", "annotations", "getReceiverParameters", "receiverParameters", "getParameters", "parameters", "getReturnType", "()Lj93/a0;", "returnType", "Lj93/b0;", "getTypeParameters", "typeParameters", "Lj93/f0;", "getVisibility", "()Lj93/f0;", "visibility", "isFinal", "()Z", "isOpen", "isAbstract", "isAnnotationConstructor", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;", "descriptor", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class DescriptorKCallable<R> implements KTypeParameterOwnerImpl, ReflectKCallable<R> {
    private final ReflectProperties.LazySoftVal<Object[]> _absentArguments;
    private final ReflectProperties.LazySoftVal<List<Annotation>> _annotations;
    private final ReflectProperties.LazySoftVal<ArrayList<InterfaceC21484q>> _parameters;
    private final ReflectProperties.LazySoftVal<ArrayList<InterfaceC21484q>> _receiverParameters;
    private final ReflectProperties.LazySoftVal<C37058h> _returnType;
    private final ReflectProperties.LazySoftVal<List<KTypeParameterImpl>> _typeParameters;
    private final InterfaceC23462h parametersNeedMFVCFlattening;

    public DescriptorKCallable() {
        ReflectProperties.LazySoftVal<List<Annotation>> lazySoftValLazySoft = ReflectProperties.lazySoft(new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKCallable$$Lambda$0
            private final DescriptorKCallable arg$0;

            {
                this.arg$0 = this;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return DescriptorKCallable._annotations$lambda$0(this.arg$0);
            }
        });
        AbstractC22676k.m65749i(lazySoftValLazySoft, "lazySoft(...)");
        this._annotations = lazySoftValLazySoft;
        ReflectProperties.LazySoftVal<ArrayList<InterfaceC21484q>> lazySoftValLazySoft2 = ReflectProperties.lazySoft(new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKCallable$$Lambda$1
            private final DescriptorKCallable arg$0;

            {
                this.arg$0 = this;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return DescriptorKCallable._receiverParameters$lambda$0(this.arg$0);
            }
        });
        AbstractC22676k.m65749i(lazySoftValLazySoft2, "lazySoft(...)");
        this._receiverParameters = lazySoftValLazySoft2;
        ReflectProperties.LazySoftVal<ArrayList<InterfaceC21484q>> lazySoftValLazySoft3 = ReflectProperties.lazySoft(new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKCallable$$Lambda$2
            private final DescriptorKCallable arg$0;

            {
                this.arg$0 = this;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return DescriptorKCallable._parameters$lambda$0(this.arg$0);
            }
        });
        AbstractC22676k.m65749i(lazySoftValLazySoft3, "lazySoft(...)");
        this._parameters = lazySoftValLazySoft3;
        ReflectProperties.LazySoftVal<C37058h> lazySoftValLazySoft4 = ReflectProperties.lazySoft(new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKCallable$$Lambda$3
            private final DescriptorKCallable arg$0;

            {
                this.arg$0 = this;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return DescriptorKCallable._returnType$lambda$0(this.arg$0);
            }
        });
        AbstractC22676k.m65749i(lazySoftValLazySoft4, "lazySoft(...)");
        this._returnType = lazySoftValLazySoft4;
        ReflectProperties.LazySoftVal<List<KTypeParameterImpl>> lazySoftValLazySoft5 = ReflectProperties.lazySoft(new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKCallable$$Lambda$4
            private final DescriptorKCallable arg$0;

            {
                this.arg$0 = this;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return DescriptorKCallable._typeParameters$lambda$0(this.arg$0);
            }
        });
        AbstractC22676k.m65749i(lazySoftValLazySoft5, "lazySoft(...)");
        this._typeParameters = lazySoftValLazySoft5;
        ReflectProperties.LazySoftVal<Object[]> lazySoftValLazySoft6 = ReflectProperties.lazySoft(new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKCallable$$Lambda$5
            private final DescriptorKCallable arg$0;

            {
                this.arg$0 = this;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return DescriptorKCallable._absentArguments$lambda$0(this.arg$0);
            }
        });
        AbstractC22676k.m65749i(lazySoftValLazySoft6, "lazySoft(...)");
        this._absentArguments = lazySoftValLazySoft6;
        this.parametersNeedMFVCFlattening = AbstractC30060g.m92087G(EnumC23463i.f92934x, new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKCallable$$Lambda$6
            private final DescriptorKCallable arg$0;

            {
                this.arg$0 = this;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return Boolean.valueOf(DescriptorKCallable.parametersNeedMFVCFlattening$lambda$0(this.arg$0));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] _absentArguments$lambda$0(DescriptorKCallable descriptorKCallable) {
        int parameterTypeSize;
        List<InterfaceC21484q> parameters = descriptorKCallable.getParameters();
        int size = (descriptorKCallable.isSuspend() ? 1 : 0) + parameters.size();
        if (((Boolean) descriptorKCallable.parametersNeedMFVCFlattening.getValue()).booleanValue()) {
            parameterTypeSize = 0;
            for (InterfaceC21484q interfaceC21484q : parameters) {
                parameterTypeSize += interfaceC21484q.getKind() == EnumC21483p.f82449z ? descriptorKCallable.getParameterTypeSize(interfaceC21484q) : 0;
            }
        } else {
            List<InterfaceC21484q> list = parameters;
            if ((list instanceof Collection) && list.isEmpty()) {
                parameterTypeSize = 0;
            } else {
                Iterator<T> it = list.iterator();
                parameterTypeSize = 0;
                while (it.hasNext()) {
                    if (((InterfaceC21484q) it.next()).getKind() == EnumC21483p.f82449z && (parameterTypeSize = parameterTypeSize + 1) < 0) {
                        AbstractC37056f.m118976c0();
                        throw null;
                    }
                }
            }
        }
        int i13 = (parameterTypeSize + 31) / 32;
        Object[] objArr = new Object[size + i13 + 1];
        for (InterfaceC21484q interfaceC21484q2 : parameters) {
            if (interfaceC21484q2.isOptional() && !UtilKt.isInlineClassType(interfaceC21484q2.getType())) {
                objArr[interfaceC21484q2.getIndex()] = UtilKt.defaultPrimitiveValue(C27648a.m83558I(interfaceC21484q2.getType()));
            } else if (interfaceC21484q2.isVararg()) {
                objArr[interfaceC21484q2.getIndex()] = descriptorKCallable.defaultEmptyArray(interfaceC21484q2.getType());
            }
        }
        for (int i14 = 0; i14 < i13; i14++) {
            objArr[size + i14] = 0;
        }
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List _annotations$lambda$0(DescriptorKCallable descriptorKCallable) {
        return UtilKt.computeAnnotations(descriptorKCallable.getDescriptor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList _parameters$lambda$0(DescriptorKCallable descriptorKCallable) {
        final InterfaceC31111c descriptor = descriptorKCallable.getDescriptor();
        ArrayList arrayList = new ArrayList();
        if (!ReflectKCallableKt.isBound(descriptorKCallable)) {
            arrayList.addAll(descriptorKCallable.getReceiverParameters());
        }
        int size = descriptor.mo78676v().size();
        for (final int i13 = 0; i13 < size; i13++) {
            arrayList.add(new DescriptorKParameter(descriptorKCallable, arrayList.size(), EnumC21483p.f82449z, new InterfaceC4339a(descriptor, i13) { // from class: kotlin.reflect.jvm.internal.DescriptorKCallable$$Lambda$10
                private final InterfaceC31111c arg$0;
                private final int arg$1;

                {
                    this.arg$0 = descriptor;
                    this.arg$1 = i13;
                }

                @Override // c93.InterfaceC4339a
                public Object invoke() {
                    return DescriptorKCallable._parameters$lambda$0$0(this.arg$0, this.arg$1);
                }
            }));
        }
        if (descriptorKCallable.isAnnotationConstructor() && (descriptor instanceof InterfaceC17058a) && arrayList.size() > 1) {
            AbstractC25269w.m74166l0(arrayList, new Comparator() { // from class: kotlin.reflect.jvm.internal.DescriptorKCallable$_parameters$lambda$0$$inlined$sortBy$1
                @Override // java.util.Comparator
                public final int compare(T t14, T t15) {
                    return AbstractC30060g.m92127q(((InterfaceC21484q) t14).getName(), ((InterfaceC21484q) t15).getName());
                }
            });
        }
        arrayList.trimToSize();
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC31139l0 _parameters$lambda$0$0(InterfaceC31111c interfaceC31111c, int i13) {
        Object obj = interfaceC31111c.mo78676v().get(i13);
        AbstractC22676k.m65749i(obj, "get(...)");
        return (InterfaceC31139l0) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList _receiverParameters$lambda$0(DescriptorKCallable descriptorKCallable) {
        ArrayList arrayList = new ArrayList();
        final InterfaceC31151q0 instanceReceiverParameter = UtilKt.getInstanceReceiverParameter(descriptorKCallable.getDescriptor());
        if (instanceReceiverParameter != null) {
            arrayList.add(new DescriptorKParameter(descriptorKCallable, arrayList.size(), EnumC21483p.f82446w, new InterfaceC4339a(instanceReceiverParameter) { // from class: kotlin.reflect.jvm.internal.DescriptorKCallable$$Lambda$7
                private final InterfaceC31151q0 arg$0;

                {
                    this.arg$0 = instanceReceiverParameter;
                }

                @Override // c93.InterfaceC4339a
                public Object invoke() {
                    return DescriptorKCallable._receiverParameters$lambda$0$0(this.arg$0);
                }
            }));
        }
        final List<InterfaceC31107a1> listComputeContextParameters = descriptorKCallable.computeContextParameters(descriptorKCallable.getDescriptor());
        int size = listComputeContextParameters.size();
        for (final int i13 = 0; i13 < size; i13++) {
            arrayList.add(new DescriptorKParameter(descriptorKCallable, arrayList.size(), EnumC21483p.f82447x, new InterfaceC4339a(listComputeContextParameters, i13) { // from class: kotlin.reflect.jvm.internal.DescriptorKCallable$$Lambda$8
                private final List arg$0;
                private final int arg$1;

                {
                    this.arg$0 = listComputeContextParameters;
                    this.arg$1 = i13;
                }

                @Override // c93.InterfaceC4339a
                public Object invoke() {
                    return DescriptorKCallable._receiverParameters$lambda$0$1(this.arg$0, this.arg$1);
                }
            }));
        }
        final InterfaceC31151q0 interfaceC31151q0Mo78667B = descriptorKCallable.getDescriptor().mo78667B();
        if (interfaceC31151q0Mo78667B != null) {
            arrayList.add(new DescriptorKParameter(descriptorKCallable, arrayList.size(), EnumC21483p.f82448y, new InterfaceC4339a(interfaceC31151q0Mo78667B) { // from class: kotlin.reflect.jvm.internal.DescriptorKCallable$$Lambda$9
                private final InterfaceC31151q0 arg$0;

                {
                    this.arg$0 = interfaceC31151q0Mo78667B;
                }

                @Override // c93.InterfaceC4339a
                public Object invoke() {
                    return DescriptorKCallable._receiverParameters$lambda$0$2(this.arg$0);
                }
            }));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC31139l0 _receiverParameters$lambda$0$0(InterfaceC31151q0 interfaceC31151q0) {
        return interfaceC31151q0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC31139l0 _receiverParameters$lambda$0$1(List list, int i13) {
        return (InterfaceC31139l0) list.get(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC31139l0 _receiverParameters$lambda$0$2(InterfaceC31151q0 interfaceC31151q0) {
        return interfaceC31151q0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C37058h _returnType$lambda$0(final DescriptorKCallable descriptorKCallable) {
        AbstractC23811y returnType = descriptorKCallable.getDescriptor().getReturnType();
        AbstractC22676k.m65747g(returnType);
        return new C37058h(returnType, new InterfaceC4339a(descriptorKCallable) { // from class: kotlin.reflect.jvm.internal.DescriptorKCallable$$Lambda$11
            private final DescriptorKCallable arg$0;

            {
                this.arg$0 = descriptorKCallable;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return DescriptorKCallable._returnType$lambda$0$0(this.arg$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type _returnType$lambda$0$0(DescriptorKCallable descriptorKCallable) {
        Type typeExtractContinuationArgument = descriptorKCallable.extractContinuationArgument();
        return typeExtractContinuationArgument == null ? descriptorKCallable.getCaller().getReturnType() : typeExtractContinuationArgument;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List _typeParameters$lambda$0(DescriptorKCallable descriptorKCallable) {
        List typeParameters = descriptorKCallable.getDescriptor().getTypeParameters();
        AbstractC22676k.m65749i(typeParameters, "getTypeParameters(...)");
        List<InterfaceC31165x0> list = typeParameters;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (InterfaceC31165x0 interfaceC31165x0 : list) {
            AbstractC22676k.m65747g(interfaceC31165x0);
            arrayList.add(new KTypeParameterImpl(descriptorKCallable, interfaceC31165x0));
        }
        return arrayList;
    }

    private final R callAnnotationConstructor(Map<InterfaceC21484q, ? extends Object> args) throws IllegalCallableAccessException {
        Object objDefaultEmptyArray;
        List<InterfaceC21484q> parameters = getParameters();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(parameters, 10));
        for (InterfaceC21484q interfaceC21484q : parameters) {
            if (args.containsKey(interfaceC21484q)) {
                objDefaultEmptyArray = args.get(interfaceC21484q);
                if (objDefaultEmptyArray == null) {
                    throw new IllegalArgumentException("Annotation argument value cannot be null (" + interfaceC21484q + ')');
                }
            } else if (interfaceC21484q.isOptional()) {
                objDefaultEmptyArray = null;
            } else {
                if (!interfaceC21484q.isVararg()) {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + interfaceC21484q);
                }
                objDefaultEmptyArray = defaultEmptyArray(interfaceC21484q.getType());
            }
            arrayList.add(objDefaultEmptyArray);
        }
        InterfaceC25339g defaultCaller = getDefaultCaller();
        if (defaultCaller != null) {
            try {
                return (R) defaultCaller.call(arrayList.toArray(new Object[0]));
            } catch (IllegalAccessException e5) {
                throw new IllegalCallableAccessException(e5);
            }
        }
        throw new KotlinReflectionInternalError("This callable does not support a default call: " + getDescriptor());
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    private final List<InterfaceC31107a1> computeContextParameters(InterfaceC31111c interfaceC31111c) {
        C23465k c23465k;
        InterfaceC31111c interfaceC31111c2 = interfaceC31111c;
        if (interfaceC31111c2 instanceof C21560t) {
            C21560t c21560t = (C21560t) interfaceC31111c2;
            c23465k = new C23465k(c21560t.f82686f0, c21560t.f82685e0.f123046O);
        } else if (interfaceC31111c2 instanceof C21559s) {
            C21559s c21559s = (C21559s) interfaceC31111c2;
            c23465k = new C23465k(c21559s.f82681c0, c21559s.f82680b0.f123314O);
        } else if (interfaceC31111c2 instanceof InterfaceC31142m0) {
            InterfaceC31145n0 interfaceC31145n0M109573J0 = ((AbstractC34685k0) ((InterfaceC31142m0) interfaceC31111c2)).m109573J0();
            C21559s c21559s2 = interfaceC31145n0M109573J0 instanceof C21559s ? (C21559s) interfaceC31145n0M109573J0 : null;
            if (c21559s2 != null) {
                c23465k = new C23465k(c21559s2.f82681c0, c21559s2.f82680b0.f123314O);
            } else {
                c23465k = null;
            }
        } else {
            c23465k = null;
        }
        if (c23465k == null) {
            return C25271y.f99162w;
        }
        InterfaceC32332f interfaceC32332f = (InterfaceC32332f) c23465k.f92937w;
        List list = (List) c23465k.f92938x;
        List listMo78671c0 = interfaceC31111c2.mo78671c0();
        AbstractC22676k.m65749i(listMo78671c0, "getContextReceiverParameters(...)");
        List list2 = listMo78671c0;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        int i13 = 0;
        for (Object obj : list2) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            Object obj2 = (InterfaceC31151q0) obj;
            arrayList.add(new C34709w0(interfaceC31111c2, null, i13, ((AbstractC0954a) obj2).getAnnotations(), C35850h.m113813d(interfaceC32332f.getString(((C30129e1) list.get(i13)).f123114E)), ((AbstractC34670d) obj2).getType(), false, false, false, null, InterfaceC31155s0.f128370q));
            interfaceC31111c2 = interfaceC31111c;
            i13 = i14;
        }
        return arrayList;
    }

    private final Object defaultEmptyArray(InterfaceC21456a0 type) {
        Class clsM60663S = AbstractC21598x.m60663S(AbstractC37978j.m121622E(type));
        if (clsM60663S.isArray()) {
            Object objNewInstance = Array.newInstance(clsM60663S.getComponentType(), 0);
            AbstractC22676k.m65749i(objNewInstance, "run(...)");
            return objNewInstance;
        }
        throw new KotlinReflectionInternalError("Cannot instantiate the default empty array of type " + clsM60663S.getSimpleName() + ", because it is not an array type");
    }

    private final Type extractContinuationArgument() {
        Type[] lowerBounds;
        if (isSuspend()) {
            Object objM74114R0 = AbstractC25265s.m74114R0(getCaller().mo74408a());
            ParameterizedType parameterizedType = objM74114R0 instanceof ParameterizedType ? (ParameterizedType) objM74114R0 : null;
            if (AbstractC22676k.m65745e(parameterizedType != null ? parameterizedType.getRawType() : null, InterfaceC30057d.class)) {
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                AbstractC22676k.m65749i(actualTypeArguments, "getActualTypeArguments(...)");
                Object objM74037M0 = AbstractC25260n.m74037M0(actualTypeArguments);
                WildcardType wildcardType = objM74037M0 instanceof WildcardType ? (WildcardType) objM74037M0 : null;
                if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                    return (Type) AbstractC25260n.m74078s0(lowerBounds);
                }
            }
        }
        return null;
    }

    private final Object[] getAbsentArguments() {
        return (Object[]) this._absentArguments.invoke().clone();
    }

    private final int getParameterTypeSize(InterfaceC21484q parameter) {
        if (!((Boolean) this.parametersNeedMFVCFlattening.getValue()).booleanValue()) {
            throw new IllegalArgumentException("Check if parametersNeedMFVCFlattening is true before");
        }
        if (!UtilKt.getNeedsMultiFieldValueClassFlattening(parameter.getType())) {
            return 1;
        }
        InterfaceC21456a0 type = parameter.getType();
        AbstractC22676k.m65748h(type, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.types.DescriptorKType");
        ArrayList arrayListM48872S = AbstractC17269i.m48872S(AbstractC32410a.m101050t(((C37058h) type).m119004l()));
        AbstractC22676k.m65747g(arrayListM48872S);
        return arrayListM48872S.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean parametersNeedMFVCFlattening$lambda$0(DescriptorKCallable descriptorKCallable) {
        List<InterfaceC21484q> parameters = descriptorKCallable.getParameters();
        if ((parameters instanceof Collection) && parameters.isEmpty()) {
            return false;
        }
        Iterator<T> it = parameters.iterator();
        while (it.hasNext()) {
            if (UtilKt.getNeedsMultiFieldValueClassFlattening(((InterfaceC21484q) it.next()).getType())) {
                return true;
            }
        }
        return false;
    }

    @Override // p715kotlin.reflect.jvm.internal.ReflectKCallable, j93.InterfaceC21459c
    public R call(Object... args) throws IllegalCallableAccessException {
        AbstractC22676k.m65750j(args, "args");
        try {
            return (R) getCaller().call(args);
        } catch (IllegalAccessException e5) {
            throw new IllegalCallableAccessException(e5);
        }
    }

    @Override // p715kotlin.reflect.jvm.internal.ReflectKCallable, j93.InterfaceC21459c
    public R callBy(Map<InterfaceC21484q, ? extends Object> args) {
        AbstractC22676k.m65750j(args, "args");
        return isAnnotationConstructor() ? callAnnotationConstructor(args) : callDefaultMethod(args, null);
    }

    @Override // p715kotlin.reflect.jvm.internal.ReflectKCallable
    public R callDefaultMethod(Map<InterfaceC21484q, ? extends Object> args, InterfaceC30057d<?> continuationArgument) throws IllegalCallableAccessException {
        AbstractC22676k.m65750j(args, "args");
        List<InterfaceC21484q> parameters = getParameters();
        boolean z4 = false;
        if (parameters.isEmpty()) {
            try {
                return (R) getCaller().call(isSuspend() ? new InterfaceC30057d[]{continuationArgument} : new InterfaceC30057d[0]);
            } catch (IllegalAccessException e5) {
                throw new IllegalCallableAccessException(e5);
            }
        }
        int size = (isSuspend() ? 1 : 0) + parameters.size();
        Object[] absentArguments = getAbsentArguments();
        if (isSuspend()) {
            absentArguments[parameters.size()] = continuationArgument;
        }
        boolean zBooleanValue = ((Boolean) this.parametersNeedMFVCFlattening.getValue()).booleanValue();
        int i13 = 0;
        for (InterfaceC21484q interfaceC21484q : parameters) {
            int parameterTypeSize = zBooleanValue ? getParameterTypeSize(interfaceC21484q) : 1;
            if (args.containsKey(interfaceC21484q)) {
                absentArguments[interfaceC21484q.getIndex()] = args.get(interfaceC21484q);
            } else if (interfaceC21484q.isOptional()) {
                if (zBooleanValue) {
                    int i14 = i13 + parameterTypeSize;
                    for (int i15 = i13; i15 < i14; i15++) {
                        int i16 = (i15 / 32) + size;
                        Object obj = absentArguments[i16];
                        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.Int");
                        absentArguments[i16] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i15 % 32)));
                    }
                } else {
                    int i17 = (i13 / 32) + size;
                    Object obj2 = absentArguments[i17];
                    AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type kotlin.Int");
                    absentArguments[i17] = Integer.valueOf(((Integer) obj2).intValue() | (1 << (i13 % 32)));
                }
                z4 = true;
            } else if (!interfaceC21484q.isVararg()) {
                throw new IllegalArgumentException("No argument provided for a required parameter: " + interfaceC21484q);
            }
            if (interfaceC21484q.getKind() == EnumC21483p.f82449z) {
                i13 += parameterTypeSize;
            }
        }
        if (!z4) {
            try {
                InterfaceC25339g caller = getCaller();
                Object[] objArrCopyOf = Arrays.copyOf(absentArguments, size);
                AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
                return (R) caller.call(objArrCopyOf);
            } catch (IllegalAccessException e13) {
                throw new IllegalCallableAccessException(e13);
            }
        }
        InterfaceC25339g defaultCaller = getDefaultCaller();
        if (defaultCaller != null) {
            try {
                return (R) defaultCaller.call(absentArguments);
            } catch (IllegalAccessException e14) {
                throw new IllegalCallableAccessException(e14);
            }
        }
        throw new KotlinReflectionInternalError("This callable does not support a default call: " + getDescriptor());
    }

    @Override // p715kotlin.reflect.jvm.internal.ReflectKCallable, j93.InterfaceC21457b
    public List<Annotation> getAnnotations() {
        List<Annotation> listInvoke = this._annotations.invoke();
        AbstractC22676k.m65749i(listInvoke, "invoke(...)");
        return listInvoke;
    }

    public abstract InterfaceC31111c getDescriptor();

    @Override // p715kotlin.reflect.jvm.internal.ReflectKCallable, j93.InterfaceC21459c
    public abstract /* synthetic */ String getName();

    @Override // p715kotlin.reflect.jvm.internal.ReflectKCallable, j93.InterfaceC21459c
    public List<InterfaceC21484q> getParameters() {
        ArrayList<InterfaceC21484q> arrayListInvoke = this._parameters.invoke();
        AbstractC22676k.m65749i(arrayListInvoke, "invoke(...)");
        return arrayListInvoke;
    }

    @Override // p715kotlin.reflect.jvm.internal.ReflectKCallable
    public List<InterfaceC21484q> getReceiverParameters() {
        ArrayList<InterfaceC21484q> arrayListInvoke = this._receiverParameters.invoke();
        AbstractC22676k.m65749i(arrayListInvoke, "invoke(...)");
        return arrayListInvoke;
    }

    @Override // p715kotlin.reflect.jvm.internal.ReflectKCallable, j93.InterfaceC21459c
    public InterfaceC21456a0 getReturnType() {
        C37058h c37058hInvoke = this._returnType.invoke();
        AbstractC22676k.m65749i(c37058hInvoke, "invoke(...)");
        return c37058hInvoke;
    }

    @Override // p715kotlin.reflect.jvm.internal.KTypeParameterOwnerImpl, p715kotlin.reflect.jvm.internal.ReflectKCallable, j93.InterfaceC21459c
    public List<InterfaceC21458b0> getTypeParameters() {
        List<KTypeParameterImpl> listInvoke = this._typeParameters.invoke();
        AbstractC22676k.m65749i(listInvoke, "invoke(...)");
        return listInvoke;
    }

    @Override // p715kotlin.reflect.jvm.internal.ReflectKCallable, j93.InterfaceC21459c
    public EnumC21466f0 getVisibility() {
        AbstractC31152r visibility = getDescriptor().getVisibility();
        AbstractC22676k.m65749i(visibility, "getVisibility(...)");
        return UtilKt.toKVisibility(visibility);
    }

    @Override // p715kotlin.reflect.jvm.internal.ReflectKCallable, j93.InterfaceC21459c
    public boolean isAbstract() {
        return getDescriptor().mo60498k() == EnumC31106a0.f128307E;
    }

    public final boolean isAnnotationConstructor() {
        return AbstractC22676k.m65745e(getName(), "<init>") && getContainer().getJClass().isAnnotation();
    }

    @Override // p715kotlin.reflect.jvm.internal.ReflectKCallable, j93.InterfaceC21459c
    public boolean isFinal() {
        return getDescriptor().mo60498k() == EnumC31106a0.f128310x;
    }

    @Override // p715kotlin.reflect.jvm.internal.ReflectKCallable, j93.InterfaceC21459c
    public boolean isOpen() {
        return getDescriptor().mo60498k() == EnumC31106a0.f128312z;
    }

    @Override // p715kotlin.reflect.jvm.internal.ReflectKCallable, j93.InterfaceC21459c
    public abstract /* synthetic */ boolean isSuspend();
}
