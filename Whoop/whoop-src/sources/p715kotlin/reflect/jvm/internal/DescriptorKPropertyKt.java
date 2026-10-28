package p715kotlin.reflect.jvm.internal;

import hg3.AbstractC17269i;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import jb3.C21559s;
import lb3.AbstractC23767d1;
import m93.AbstractC25357y;
import m93.C25329a0;
import m93.C25333c0;
import m93.C25343k;
import m93.C25344l;
import m93.C25345m;
import m93.C25347o;
import m93.C25348p;
import m93.C25349q;
import m93.C25351s;
import m93.C25352t;
import m93.C25353u;
import m93.C25355w;
import m93.C25358z;
import m93.InterfaceC25339g;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.AbstractC31150q;
import r93.EnumC31120f;
import r93.InterfaceC31135k;
import r93.InterfaceC31145n0;
import ta3.C33678d;
import ta3.C33680f;
import ua3.C34727g;
import wb3.AbstractC37056f;
import ya3.AbstractC39363f;
import ya3.AbstractC39365h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0001*\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b\"\"\u0010\f\u001a\u0004\u0018\u00010\t*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;", "", "isGetter", "Lm93/g;", "computeCallerForAccessor", "(Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;Z)Lm93/g;", "Lr93/n0;", "isJvmFieldPropertyInCompanionObject", "(Lr93/n0;)Z", "", "getBoundReceiver", "(Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;)Ljava/lang/Object;", "boundReceiver", "kotlin-reflection"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DescriptorKPropertyKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    public static final InterfaceC25339g computeCallerForAccessor(DescriptorKProperty.Accessor<?, ?> accessor, boolean z4) {
        JvmFunctionSignature.KotlinFunction setterSignature;
        Method setterMethod;
        InterfaceC25339g c25351s;
        C33678d c33678d;
        InterfaceC25339g c25353u;
        if (KDeclarationContainerImpl.INSTANCE.getLOCAL_PROPERTY_SIGNATURE$kotlin_reflection().m125851e(accessor.getProperty().getSignature())) {
            return C25333c0.f99351a;
        }
        JvmPropertySignature jvmPropertySignatureMapPropertySignature = RuntimeTypeMapper.INSTANCE.mapPropertySignature(accessor.getProperty().getDescriptor());
        if (jvmPropertySignatureMapPropertySignature instanceof JvmPropertySignature.KotlinProperty) {
            JvmPropertySignature.KotlinProperty kotlinProperty = (JvmPropertySignature.KotlinProperty) jvmPropertySignatureMapPropertySignature;
            C33680f signature = kotlinProperty.getSignature();
            if (z4) {
                if (signature.m106427i()) {
                    c33678d = signature.f140689E;
                } else {
                    c33678d = null;
                }
            } else if ((signature.f140695x & 8) == 8) {
                c33678d = signature.f140690F;
            } else {
                c33678d = null;
            }
            Method methodFindMethodBySignature = c33678d != null ? accessor.getProperty().getContainer().findMethodBySignature(kotlinProperty.getNameResolver().getString(c33678d.f140679y), kotlinProperty.getNameResolver().getString(c33678d.f140680z)) : null;
            if (methodFindMethodBySignature != null) {
                if (!Modifier.isStatic(methodFindMethodBySignature.getModifiers())) {
                    c25353u = ReflectKCallableKt.isBound(accessor) ? new C25351s(methodFindMethodBySignature, getBoundReceiver(accessor)) : new C25355w(methodFindMethodBySignature, 0);
                } else if (computeCallerForAccessor$isJvmStaticProperty(accessor)) {
                    c25353u = ReflectKCallableKt.isBound(accessor) ? new C25352t(methodFindMethodBySignature) : new C25355w(methodFindMethodBySignature, 1);
                } else {
                    c25353u = ReflectKCallableKt.isBound(accessor) ? new C25353u(methodFindMethodBySignature, false, getBoundReceiver(accessor)) : new C25355w(methodFindMethodBySignature, 2);
                }
                c25351s = c25353u;
            } else if (AbstractC39365h.m125540d(accessor.getProperty().getDescriptor()) && AbstractC22676k.m65745e(accessor.getProperty().getDescriptor().getVisibility(), AbstractC31150q.f128352d)) {
                Class clsM48909p0 = AbstractC17269i.m48909p0(accessor.getProperty().getDescriptor().mo60581g());
                if (clsM48909p0 == null) {
                    throw new KotlinReflectionInternalError("Underlying property of inline class " + accessor.getProperty() + " should have a field");
                }
                Method methodM48871R = AbstractC17269i.m48871R(clsM48909p0, accessor.getProperty().getDescriptor());
                c25351s = ReflectKCallableKt.isBound(accessor) ? new C25358z(methodM48871R, getBoundReceiver(accessor)) : new C25329a0(methodM48871R, AbstractC37056f.m118958J(methodM48871R.getDeclaringClass()));
            } else {
                Field javaField = accessor.getProperty().getJavaField();
                if (javaField == null) {
                    throw new KotlinReflectionInternalError("No accessors or field is found for property " + accessor.getProperty());
                }
                c25351s = computeCallerForAccessor$computeFieldCaller(accessor, z4, javaField);
            }
        } else if (jvmPropertySignatureMapPropertySignature instanceof JvmPropertySignature.JavaField) {
            c25351s = computeCallerForAccessor$computeFieldCaller(accessor, z4, ((JvmPropertySignature.JavaField) jvmPropertySignatureMapPropertySignature).getField());
        } else {
            if (!(jvmPropertySignatureMapPropertySignature instanceof JvmPropertySignature.JavaMethodProperty)) {
                if (!(jvmPropertySignatureMapPropertySignature instanceof JvmPropertySignature.MappedKotlinProperty)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (z4) {
                    setterSignature = ((JvmPropertySignature.MappedKotlinProperty) jvmPropertySignatureMapPropertySignature).getGetterSignature();
                } else {
                    setterSignature = ((JvmPropertySignature.MappedKotlinProperty) jvmPropertySignatureMapPropertySignature).getSetterSignature();
                    if (setterSignature == null) {
                        throw new KotlinReflectionInternalError("No setter found for property " + accessor.getProperty());
                    }
                }
                Method methodFindMethodBySignature2 = accessor.getProperty().getContainer().findMethodBySignature(setterSignature.getMethodName(), setterSignature.getMethodDesc());
                if (methodFindMethodBySignature2 != null) {
                    Modifier.isStatic(methodFindMethodBySignature2.getModifiers());
                    return ReflectKCallableKt.isBound(accessor) ? new C25351s(methodFindMethodBySignature2, getBoundReceiver(accessor)) : new C25355w(methodFindMethodBySignature2, 0);
                }
                throw new KotlinReflectionInternalError("No accessor found for property " + accessor.getProperty());
            }
            if (z4) {
                setterMethod = ((JvmPropertySignature.JavaMethodProperty) jvmPropertySignatureMapPropertySignature).getGetterMethod();
            } else {
                JvmPropertySignature.JavaMethodProperty javaMethodProperty = (JvmPropertySignature.JavaMethodProperty) jvmPropertySignatureMapPropertySignature;
                setterMethod = javaMethodProperty.getSetterMethod();
                if (setterMethod == null) {
                    throw new KotlinReflectionInternalError("No source found for setter of Java method property: " + javaMethodProperty.getGetterMethod());
                }
            }
            c25351s = ReflectKCallableKt.isBound(accessor) ? new C25351s(setterMethod, getBoundReceiver(accessor)) : new C25355w(setterMethod, 0);
        }
        return AbstractC17269i.m48857B(c25351s, accessor.getDescriptor(), false);
    }

    private static final AbstractC25357y computeCallerForAccessor$computeFieldCaller(DescriptorKProperty.Accessor<?, ?> accessor, boolean z4, Field field) {
        if (!isJvmFieldPropertyInCompanionObject(accessor.getProperty().getDescriptor()) && Modifier.isStatic(field.getModifiers())) {
            if (!computeCallerForAccessor$isJvmStaticProperty(accessor)) {
                return z4 ? new C25345m(field, false, 2) : new C25349q(field, computeCallerForAccessor$isNotNullProperty(accessor), false, 2);
            }
            if (z4) {
                return ReflectKCallableKt.isBound(accessor) ? new C25344l(field, false) : new C25345m(field, true, 1);
            }
            return ReflectKCallableKt.isBound(accessor) ? new C25348p(field, computeCallerForAccessor$isNotNullProperty(accessor), false) : new C25349q(field, computeCallerForAccessor$isNotNullProperty(accessor), true, 1);
        }
        if (z4) {
            if (ReflectKCallableKt.isBound(accessor)) {
                return new C25343k(field, getBoundReceiver(accessor));
            }
            AbstractC22676k.m65750j(field, "field");
            return new C25345m(field, true, 0);
        }
        if (ReflectKCallableKt.isBound(accessor)) {
            return new C25347o(field, computeCallerForAccessor$isNotNullProperty(accessor), getBoundReceiver(accessor));
        }
        boolean zComputeCallerForAccessor$isNotNullProperty = computeCallerForAccessor$isNotNullProperty(accessor);
        AbstractC22676k.m65750j(field, "field");
        return new C25349q(field, zComputeCallerForAccessor$isNotNullProperty, true, 0);
    }

    private static final boolean computeCallerForAccessor$isJvmStaticProperty(DescriptorKProperty.Accessor<?, ?> accessor) {
        return accessor.getProperty().getDescriptor().getAnnotations().mo52688J(UtilKt.getJVM_STATIC());
    }

    private static final boolean computeCallerForAccessor$isNotNullProperty(DescriptorKProperty.Accessor<?, ?> accessor) {
        return !AbstractC23767d1.m69849e(accessor.getProperty().getDescriptor().getType());
    }

    public static final Object getBoundReceiver(DescriptorKProperty.Accessor<?, ?> accessor) {
        AbstractC22676k.m65750j(accessor, "<this>");
        return accessor.getProperty().getBoundReceiver();
    }

    private static final boolean isJvmFieldPropertyInCompanionObject(InterfaceC31145n0 interfaceC31145n0) {
        InterfaceC31135k interfaceC31135kMo60581g = interfaceC31145n0.mo60581g();
        AbstractC22676k.m65749i(interfaceC31135kMo60581g, "getContainingDeclaration(...)");
        if (!AbstractC39363f.m125529k(interfaceC31135kMo60581g)) {
            return false;
        }
        InterfaceC31135k interfaceC31135kMo60581g2 = interfaceC31135kMo60581g.mo60581g();
        if (AbstractC39363f.m125530l(interfaceC31135kMo60581g2, EnumC31120f.f128329x) || AbstractC39363f.m125530l(interfaceC31135kMo60581g2, EnumC31120f.f128325E)) {
            return (interfaceC31145n0 instanceof C21559s) && C34727g.m109652d(((C21559s) interfaceC31145n0).f82680b0);
        }
        return true;
    }
}
