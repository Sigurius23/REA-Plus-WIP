package v00;

import ge3.AbstractC15751g;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38793c;
import y00.C38867j3;
import y00.C38887l3;
import y00.InterfaceC38802c8;

/* JADX WARN: Enum visitor error
java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
	at jadx.core.dex.visitors.EnumVisitor.searchEnumSuperCtrInsn(EnumVisitor.java:495)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:473)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: v00.i */
/* JADX INFO: loaded from: classes6.dex */
public abstract class EnumC35470i {

    /* JADX INFO: renamed from: E */
    public static final C35456b f151006E;

    /* JADX INFO: renamed from: F */
    public static final C35458c f151007F;

    /* JADX INFO: renamed from: G */
    public static final /* synthetic */ EnumC35470i[] f151008G;

    /* JADX INFO: renamed from: w */
    public static final C35466g f151009w;

    /* JADX INFO: renamed from: x */
    public static final C35460d f151010x;

    /* JADX INFO: renamed from: y */
    public static final C35454a f151011y;

    /* JADX INFO: renamed from: z */
    public static final C35468h f151012z;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC35470i EF0;

    static {
        EnumC35470i enumC35470i = new EnumC35470i() { // from class: v00.f
            @Override // v00.EnumC35470i
            /* JADX INFO: renamed from: a */
            public final boolean mo112525a(C35459c0 c35459c0, String code) {
                AbstractC22676k.m65750j(code, "code");
                return false;
            }
        };
        C35466g c35466g = new C35466g();
        f151009w = c35466g;
        EnumC35470i enumC35470i2 = new EnumC35470i() { // from class: v00.e
            @Override // v00.EnumC35470i
            /* JADX INFO: renamed from: a */
            public final boolean mo112525a(C35459c0 c35459c0, String code) {
                AbstractC22676k.m65750j(code, "code");
                if (c35459c0.f150999z) {
                    return true;
                }
                InterfaceC38802c8 interfaceC38802c8 = c35459c0.f150996w;
                C38887l3 c38887l3 = interfaceC38802c8 instanceof C38887l3 ? (C38887l3) interfaceC38802c8 : null;
                C38867j3 c38867j3 = c38887l3 != null ? c38887l3.f167385T : null;
                if ((c38867j3 != null ? c38867j3.f167306y : null) == null) {
                    return false;
                }
                C38793c c38793c = c38867j3.f167304w;
                return (c38793c.f166962y == null || c38793c.f166961x == null || c38793c.f166958E == null) ? false : true;
            }
        };
        C35460d c35460d = new C35460d();
        f151010x = c35460d;
        C35454a c35454a = new C35454a();
        f151011y = c35454a;
        C35468h c35468h = new C35468h();
        f151012z = c35468h;
        C35456b c35456b = new C35456b();
        f151006E = c35456b;
        C35458c c35458c = new C35458c();
        f151007F = c35458c;
        EnumC35470i[] enumC35470iArr = {enumC35470i, c35466g, enumC35470i2, c35460d, c35454a, c35468h, c35456b, c35458c};
        f151008G = enumC35470iArr;
        AbstractC15751g.m44468u(enumC35470iArr);
    }

    public static EnumC35470i valueOf(String str) {
        return (EnumC35470i) Enum.valueOf(EnumC35470i.class, str);
    }

    public static EnumC35470i[] values() {
        return (EnumC35470i[]) f151008G.clone();
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo112525a(C35459c0 c35459c0, String str);
}
