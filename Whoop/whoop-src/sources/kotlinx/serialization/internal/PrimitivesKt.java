package kotlinx.serialization.internal;

import ih0.AbstractC18489d0;
import j93.InterfaceC21461d;
import java.util.Map;
import p484s9.AbstractC32281f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import yb3.AbstractC39415s;
import yc3.AbstractC39442f;
import yc3.InterfaceC39443g;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000f\"\b\b\u0000\u0010\r*\u00020\f*\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\"(\u0010\u0013\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"", "serialName", "Lyc3/f;", "kind", "Lyc3/g;", "PrimitiveDescriptorSafe", "(Ljava/lang/String;Lyc3/f;)Lyc3/g;", "Ll83/a0;", "checkNameIsNotAPrimitive", "(Ljava/lang/String;)V", "capitalize", "(Ljava/lang/String;)Ljava/lang/String;", "", "T", "Lj93/d;", "Lwc3/c;", "builtinSerializerOrNull", "(Lj93/d;)Lwc3/c;", "", "BUILTIN_SERIALIZERS", "Ljava/util/Map;", "kotlinx-serialization-core"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PrimitivesKt {
    private static final Map<InterfaceC21461d, InterfaceC37138c> BUILTIN_SERIALIZERS = PlatformKt.initBuiltins();

    public static final InterfaceC39443g PrimitiveDescriptorSafe(String serialName, AbstractC39442f kind) {
        AbstractC22676k.m65750j(serialName, "serialName");
        AbstractC22676k.m65750j(kind, "kind");
        checkNameIsNotAPrimitive(serialName);
        return new PrimitiveSerialDescriptor(serialName, kind);
    }

    public static final <T> InterfaceC37138c builtinSerializerOrNull(InterfaceC21461d interfaceC21461d) {
        AbstractC22676k.m65750j(interfaceC21461d, "<this>");
        return BUILTIN_SERIALIZERS.get(interfaceC21461d);
    }

    private static final String capitalize(String str) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb4 = new StringBuilder();
        char cCharAt = str.charAt(0);
        sb4.append((Object) (Character.isLowerCase(cCharAt) ? AbstractC32281f.m100435A(cCharAt) : String.valueOf(cCharAt)));
        String strSubstring = str.substring(1);
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        sb4.append(strSubstring);
        return sb4.toString();
    }

    public static final void checkNameIsNotAPrimitive(String serialName) {
        AbstractC22676k.m65750j(serialName, "serialName");
        for (InterfaceC37138c interfaceC37138c : BUILTIN_SERIALIZERS.values()) {
            if (serialName.equals(interfaceC37138c.getDescriptor().getSerialName())) {
                StringBuilder sbM53375p = AbstractC18489d0.m53375p("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", serialName, " there already exists ");
                sbM53375p.append(AbstractC22671h0.f89337a.getOrCreateKotlinClass(interfaceC37138c.getClass()).getSimpleName());
                sbM53375p.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                throw new IllegalArgumentException(AbstractC39415s.m125909s(sbM53375p.toString()));
            }
        }
    }
}
