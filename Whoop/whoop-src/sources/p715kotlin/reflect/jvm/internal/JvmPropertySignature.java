package p715kotlin.reflect.jvm.internal;

import fa3.AbstractC14330w;
import j93.AbstractC21478l0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import jb3.C21548h;
import jb3.C21559s;
import jb3.InterfaceC21550j;
import oa3.C27765h;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qa3.C30145k;
import qa3.C30146k0;
import r93.AbstractC31150q;
import r93.InterfaceC31124g0;
import r93.InterfaceC31135k;
import r93.InterfaceC31145n0;
import sa3.C32334h;
import sa3.InterfaceC32332f;
import ta3.AbstractC33686l;
import ta3.C33680f;
import ua3.C34724d;
import ua3.C34727g;
import va3.AbstractC35851i;
import wa3.C37010o;
import x93.AbstractC38109c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "", "<init>", "()V", "asString", "", "KotlinProperty", "JavaMethodProperty", "JavaField", "MappedKotlinProperty", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$MappedKotlinProperty;", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class JvmPropertySignature {

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "field", "Ljava/lang/reflect/Field;", "<init>", "(Ljava/lang/reflect/Field;)V", "getField", "()Ljava/lang/reflect/Field;", "asString", "", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class JavaField extends JvmPropertySignature {
        private final Field field;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JavaField(Field field) {
            super(null);
            AbstractC22676k.m65750j(field, "field");
            this.field = field;
        }

        @Override // p715kotlin.reflect.jvm.internal.JvmPropertySignature
        /* JADX INFO: renamed from: asString */
        public String getString() {
            StringBuilder sb4 = new StringBuilder();
            String name = this.field.getName();
            AbstractC22676k.m65749i(name, "getName(...)");
            sb4.append(AbstractC14330w.m40936a(name));
            sb4.append("()");
            Class<?> type = this.field.getType();
            AbstractC22676k.m65749i(type, "getType(...)");
            sb4.append(AbstractC38109c.m122090b(type));
            return sb4.toString();
        }

        public final Field getField() {
            return this.field;
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\f"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "getterMethod", "Ljava/lang/reflect/Method;", "setterMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "getGetterMethod", "()Ljava/lang/reflect/Method;", "getSetterMethod", "asString", "", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class JavaMethodProperty extends JvmPropertySignature {
        private final Method getterMethod;
        private final Method setterMethod;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JavaMethodProperty(Method getterMethod, Method method) {
            super(null);
            AbstractC22676k.m65750j(getterMethod, "getterMethod");
            this.getterMethod = getterMethod;
            this.setterMethod = method;
        }

        @Override // p715kotlin.reflect.jvm.internal.JvmPropertySignature
        /* JADX INFO: renamed from: asString */
        public String getString() {
            return RuntimeTypeMapperKt.getSignature(this.getterMethod);
        }

        public final Method getGetterMethod() {
            return this.getterMethod;
        }

        public final Method getSetterMethod() {
            return this.setterMethod;
        }
    }

    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0015\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "Lr93/n0;", "descriptor", "Lqa3/k0;", "proto", "Lta3/f;", "signature", "Lsa3/f;", "nameResolver", "Lsa3/h;", "typeTable", "<init>", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;)V", "", "getManglingSuffix", "()Ljava/lang/String;", "asString", "Lr93/n0;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "Lqa3/k0;", "getProto", "()Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;", "Lta3/f;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", "Lsa3/f;", "getNameResolver", "()Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;", "Lsa3/h;", "getTypeTable", "()Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;", "string", "Ljava/lang/String;", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class KotlinProperty extends JvmPropertySignature {
        private final InterfaceC31145n0 descriptor;
        private final InterfaceC32332f nameResolver;
        private final C30146k0 proto;
        private final C33680f signature;
        private final String string;
        private final C32334h typeTable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KotlinProperty(InterfaceC31145n0 descriptor, C30146k0 proto, C33680f signature, InterfaceC32332f nameResolver, C32334h typeTable) {
            String strM8304q;
            super(null);
            AbstractC22676k.m65750j(descriptor, "descriptor");
            AbstractC22676k.m65750j(proto, "proto");
            AbstractC22676k.m65750j(signature, "signature");
            AbstractC22676k.m65750j(nameResolver, "nameResolver");
            AbstractC22676k.m65750j(typeTable, "typeTable");
            this.descriptor = descriptor;
            this.proto = proto;
            this.signature = signature;
            this.nameResolver = nameResolver;
            this.typeTable = typeTable;
            if (signature.m106427i()) {
                strM8304q = nameResolver.getString(signature.f140689E.f140679y).concat(nameResolver.getString(signature.f140689E.f140680z));
            } else {
                C34724d c34724dM109650b = C34727g.m109650b(proto, nameResolver, typeTable, true);
                if (c34724dM109650b == null) {
                    throw new KotlinReflectionInternalError("No field signature for property: " + descriptor);
                }
                String str = c34724dM109650b.f146261x;
                String str2 = c34724dM109650b.f146262y;
                StringBuilder sb4 = new StringBuilder();
                sb4.append(AbstractC14330w.m40936a(str));
                strM8304q = AbstractC2875y.m8304q(sb4, getManglingSuffix(), "()", str2);
            }
            this.string = strM8304q;
        }

        private final String getManglingSuffix() {
            InterfaceC31135k interfaceC31135kMo60581g = this.descriptor.mo60581g();
            AbstractC22676k.m65749i(interfaceC31135kMo60581g, "getContainingDeclaration(...)");
            if (AbstractC22676k.m65745e(this.descriptor.getVisibility(), AbstractC31150q.f128352d) && (interfaceC31135kMo60581g instanceof C21548h)) {
                C30145k c30145k = ((C21548h) interfaceC31135kMo60581g).f82629E;
                C37010o classModuleName = AbstractC33686l.f140741g;
                AbstractC22676k.m65749i(classModuleName, "classModuleName");
                Integer num = (Integer) AbstractC21478l0.m60453x(c30145k, classModuleName);
                return "$".concat(AbstractC35851i.m113820b(num != null ? this.nameResolver.getString(num.intValue()) : "main"));
            }
            if (!AbstractC22676k.m65745e(this.descriptor.getVisibility(), AbstractC31150q.f128349a) || !(interfaceC31135kMo60581g instanceof InterfaceC31124g0)) {
                return "";
            }
            InterfaceC31145n0 interfaceC31145n0 = this.descriptor;
            AbstractC22676k.m65748h(interfaceC31145n0, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor");
            InterfaceC21550j interfaceC21550j = ((C21559s) interfaceC31145n0).f82684f0;
            if (!(interfaceC21550j instanceof C27765h)) {
                return "";
            }
            C27765h c27765h = (C27765h) interfaceC21550j;
            if (c27765h.m83872b() == null) {
                return "";
            }
            return "$" + c27765h.m83874d().m113817b();
        }

        @Override // p715kotlin.reflect.jvm.internal.JvmPropertySignature
        /* JADX INFO: renamed from: asString, reason: from getter */
        public String getString() {
            return this.string;
        }

        public final InterfaceC31145n0 getDescriptor() {
            return this.descriptor;
        }

        public final InterfaceC32332f getNameResolver() {
            return this.nameResolver;
        }

        public final C30146k0 getProto() {
            return this.proto;
        }

        public final C33680f getSignature() {
            return this.signature;
        }

        public final C32334h getTypeTable() {
            return this.typeTable;
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\f"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$MappedKotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "getterSignature", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "setterSignature", "<init>", "(Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;)V", "getGetterSignature", "()Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "getSetterSignature", "asString", "", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class MappedKotlinProperty extends JvmPropertySignature {
        private final JvmFunctionSignature.KotlinFunction getterSignature;
        private final JvmFunctionSignature.KotlinFunction setterSignature;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MappedKotlinProperty(JvmFunctionSignature.KotlinFunction getterSignature, JvmFunctionSignature.KotlinFunction kotlinFunction) {
            super(null);
            AbstractC22676k.m65750j(getterSignature, "getterSignature");
            this.getterSignature = getterSignature;
            this.setterSignature = kotlinFunction;
        }

        @Override // p715kotlin.reflect.jvm.internal.JvmPropertySignature
        /* JADX INFO: renamed from: asString */
        public String getString() {
            return this.getterSignature.get_signature();
        }

        public final JvmFunctionSignature.KotlinFunction getGetterSignature() {
            return this.getterSignature;
        }

        public final JvmFunctionSignature.KotlinFunction getSetterSignature() {
            return this.setterSignature;
        }
    }

    public /* synthetic */ JvmPropertySignature(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: asString */
    public abstract String getString();

    private JvmPropertySignature() {
    }
}
