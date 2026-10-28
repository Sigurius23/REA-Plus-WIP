package kotlinx.serialization.internal;

import j93.InterfaceC21461d;
import kotlinx.serialization.SerializationException;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\u001a%\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0005\u001a\u00020\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\b¨\u0006\t"}, m65681d2 = {"", "subClassName", "Lj93/d;", "baseClass", "", "throwSubtypeNotRegistered", "(Ljava/lang/String;Lj93/d;)Ljava/lang/Void;", "subClass", "(Lj93/d;Lj93/d;)Ljava/lang/Void;", "kotlinx-serialization-core"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AbstractPolymorphicSerializerKt {
    public static final Void throwSubtypeNotRegistered(String str, InterfaceC21461d baseClass) {
        String string;
        AbstractC22676k.m65750j(baseClass, "baseClass");
        String str2 = "in the polymorphic scope of '" + baseClass.getSimpleName() + '\'';
        if (str == null) {
            string = AbstractC31061c.m95633i('.', "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder sbM32001t = AbstractC11895b.m32001t("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            AbstractC11266d.m30444B(sbM32001t, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbM32001t.append(baseClass.getSimpleName());
            sbM32001t.append("' has to be sealed and '@Serializable'.");
            string = sbM32001t.toString();
        }
        throw new SerializationException(string);
    }

    public static final Void throwSubtypeNotRegistered(InterfaceC21461d subClass, InterfaceC21461d baseClass) {
        AbstractC22676k.m65750j(subClass, "subClass");
        AbstractC22676k.m65750j(baseClass, "baseClass");
        String simpleName = subClass.getSimpleName();
        if (simpleName == null) {
            simpleName = String.valueOf(subClass);
        }
        throwSubtypeNotRegistered(simpleName, baseClass);
        throw new KotlinNothingValueException();
    }
}
