package va3;

import i93.C18284j;
import kotlinx.serialization.SerializationException;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.C34832o0;
import ud3.C34850x0;
import vf3.C35953c;
import wc3.InterfaceC37137b;
import wf3.C37247a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40541d;

/* JADX INFO: renamed from: va3.d */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC35846d implements InterfaceC40541d, InterfaceC40539b {
    /* JADX INFO: renamed from: c */
    public static void m113779c(int i13) {
        if (2 > i13 || i13 >= 37) {
            StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "radix ", " was not in valid range ");
            sbM30466t.append(new C18284j(2, 36, 1));
            throw new IllegalArgumentException(sbM30466t.toString());
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m113780e(char c3) {
        m113779c(16);
        int iDigit = Character.digit((int) c3, 16);
        Integer numValueOf = Integer.valueOf(iDigit);
        if (iDigit < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        throw new IllegalArgumentException("Char " + c3 + " is not a digit in the given radix=16");
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m113781f(char c3, char c7, boolean z4) {
        if (c3 == c7) {
            return true;
        }
        if (!z4) {
            return false;
        }
        char upperCase = Character.toUpperCase(c3);
        char upperCase2 = Character.toUpperCase(c7);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* JADX INFO: renamed from: g */
    public static C35953c m113782g() {
        return C37247a.f159360e;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0033  */
    /* JADX WARN: Code duplicated, block: B:26:0x003d  */
    /* JADX INFO: renamed from: h */
    public static boolean m113783h(C34850x0 c34850x0, C34832o0 request) {
        String strM109863a;
        AbstractC22676k.m65750j(request, "request");
        int i13 = c34850x0.f146792z;
        if (i13 != 200 && i13 != 410 && i13 != 414 && i13 != 501 && i13 != 203 && i13 != 204) {
            if (i13 == 307) {
                strM109863a = c34850x0.f146777F.m109863a("Expires");
                if (strM109863a == null) {
                    strM109863a = null;
                }
                if (strM109863a == null && c34850x0.m109932b().f146578c == -1 && !c34850x0.m109932b().f146581f && !c34850x0.m109932b().f146580e) {
                    return false;
                }
            } else if (i13 != 308 && i13 != 404 && i13 != 405) {
                switch (i13) {
                    case 300:
                    case 301:
                        break;
                    case 302:
                        strM109863a = c34850x0.f146777F.m109863a("Expires");
                        if (strM109863a == null) {
                            strM109863a = null;
                        }
                        if (strM109863a == null) {
                            return false;
                        }
                        break;
                    default:
                        return false;
                }
            }
        }
        return (c34850x0.m109932b().f146577b || request.m109906a().f146577b) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m113784i(char c3) {
        return Character.isWhitespace(c3) || Character.isSpaceChar(c3);
    }

    /* JADX INFO: renamed from: j */
    public static C35847e m113785j(C35850h shortName) {
        AbstractC22676k.m65750j(shortName, "shortName");
        String strM113817b = shortName.m113817b();
        AbstractC22676k.m65749i(strM113817b, "asString(...)");
        return new C35847e(new C35848f(strM113817b, C35847e.f152612c.f152613a, shortName));
    }

    /* JADX INFO: renamed from: k */
    public static final Class m113786k(ClassLoader classLoader, String fqName) {
        AbstractC22676k.m65750j(classLoader, "<this>");
        AbstractC22676k.m65750j(fqName, "fqName");
        try {
            return Class.forName(fqName, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @Override // zc3.InterfaceC40541d
    public InterfaceC40539b beginStructure(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return this;
    }

    /* JADX INFO: renamed from: d */
    public void m113787d() {
        throw new SerializationException(AbstractC22671h0.f89337a.getOrCreateKotlinClass(getClass()) + " can't retrieve untyped values");
    }

    @Override // zc3.InterfaceC40541d
    public boolean decodeBoolean() {
        m113787d();
        throw null;
    }

    @Override // zc3.InterfaceC40539b
    public boolean decodeBooleanElement(InterfaceC39443g descriptor, int i13) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return decodeBoolean();
    }

    @Override // zc3.InterfaceC40541d
    public abstract byte decodeByte();

    @Override // zc3.InterfaceC40539b
    public byte decodeByteElement(InterfaceC39443g descriptor, int i13) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return decodeByte();
    }

    @Override // zc3.InterfaceC40541d
    public char decodeChar() {
        m113787d();
        throw null;
    }

    @Override // zc3.InterfaceC40539b
    public char decodeCharElement(InterfaceC39443g descriptor, int i13) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return decodeChar();
    }

    @Override // zc3.InterfaceC40539b
    public int decodeCollectionSize(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return -1;
    }

    @Override // zc3.InterfaceC40541d
    public double decodeDouble() {
        m113787d();
        throw null;
    }

    @Override // zc3.InterfaceC40539b
    public double decodeDoubleElement(InterfaceC39443g descriptor, int i13) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return decodeDouble();
    }

    @Override // zc3.InterfaceC40541d
    public int decodeEnum(InterfaceC39443g enumDescriptor) {
        AbstractC22676k.m65750j(enumDescriptor, "enumDescriptor");
        m113787d();
        throw null;
    }

    @Override // zc3.InterfaceC40541d
    public float decodeFloat() {
        m113787d();
        throw null;
    }

    @Override // zc3.InterfaceC40539b
    public float decodeFloatElement(InterfaceC39443g descriptor, int i13) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return decodeFloat();
    }

    @Override // zc3.InterfaceC40541d
    public InterfaceC40541d decodeInline(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return this;
    }

    @Override // zc3.InterfaceC40539b
    public InterfaceC40541d decodeInlineElement(InterfaceC39443g descriptor, int i13) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return decodeInline(descriptor.getElementDescriptor(i13));
    }

    @Override // zc3.InterfaceC40541d
    public abstract int decodeInt();

    @Override // zc3.InterfaceC40539b
    public int decodeIntElement(InterfaceC39443g descriptor, int i13) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return decodeInt();
    }

    @Override // zc3.InterfaceC40541d
    public abstract long decodeLong();

    @Override // zc3.InterfaceC40539b
    public long decodeLongElement(InterfaceC39443g descriptor, int i13) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return decodeLong();
    }

    @Override // zc3.InterfaceC40541d
    public boolean decodeNotNullMark() {
        return true;
    }

    @Override // zc3.InterfaceC40541d
    public Void decodeNull() {
        return null;
    }

    @Override // zc3.InterfaceC40539b
    public Object decodeNullableSerializableElement(InterfaceC39443g descriptor, int i13, InterfaceC37137b deserializer, Object obj) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        AbstractC22676k.m65750j(deserializer, "deserializer");
        return (deserializer.getDescriptor().isNullable() || decodeNotNullMark()) ? decodeSerializableValue(deserializer) : decodeNull();
    }

    @Override // zc3.InterfaceC40539b
    public boolean decodeSequentially() {
        return false;
    }

    public Object decodeSerializableElement(InterfaceC39443g descriptor, int i13, InterfaceC37137b deserializer, Object obj) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        AbstractC22676k.m65750j(deserializer, "deserializer");
        return decodeSerializableValue(deserializer);
    }

    @Override // zc3.InterfaceC40541d
    public Object decodeSerializableValue(InterfaceC37137b deserializer) {
        AbstractC22676k.m65750j(deserializer, "deserializer");
        return deserializer.deserialize(this);
    }

    @Override // zc3.InterfaceC40541d
    public abstract short decodeShort();

    @Override // zc3.InterfaceC40539b
    public short decodeShortElement(InterfaceC39443g descriptor, int i13) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return decodeShort();
    }

    @Override // zc3.InterfaceC40541d
    public String decodeString() {
        m113787d();
        throw null;
    }

    @Override // zc3.InterfaceC40539b
    public String decodeStringElement(InterfaceC39443g descriptor, int i13) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return decodeString();
    }

    public void endStructure(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
    }
}
