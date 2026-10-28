package be;

import cg.C4559n;
import cg.C4560o;
import ge3.AbstractC15751g;
import p116ef.C13140a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'y' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: be.b */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC3149b {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ EnumC3149b[] f12326E;

    /* JADX INFO: renamed from: x */
    public static final C3148a f12327x;

    /* JADX INFO: renamed from: y */
    public static final EnumC3149b f12328y;

    /* JADX INFO: renamed from: z */
    public static final EnumC3149b f12329z;

    /* JADX INFO: renamed from: w */
    public final C13140a f12330w;

    static {
        C4559n c4559n = C4560o.f18367i;
        EnumC3149b enumC3149b = new EnumC3149b("IPv4", 0, new C13140a(C4559n.m14242a(c4559n, "http://169.254.169.254")));
        f12328y = enumC3149b;
        EnumC3149b enumC3149b2 = new EnumC3149b("IPv6", 1, new C13140a(C4559n.m14242a(c4559n, "http://[fd00:ec2::254]")));
        f12329z = enumC3149b2;
        EnumC3149b[] enumC3149bArr = {enumC3149b, enumC3149b2};
        f12326E = enumC3149bArr;
        AbstractC15751g.m44468u(enumC3149bArr);
        f12327x = new C3148a();
    }

    public EnumC3149b(String str, int i13, C13140a c13140a) {
        super(str, i13);
        this.f12330w = c13140a;
    }

    public static EnumC3149b valueOf(String str) {
        return (EnumC3149b) Enum.valueOf(EnumC3149b.class, str);
    }

    public static EnumC3149b[] values() {
        return (EnumC3149b[]) f12326E.clone();
    }
}
