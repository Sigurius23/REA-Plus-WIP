package fz0;

import ge3.AbstractC15751g;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'Left' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: fz0.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m65681d2 = {"Lfz0/e;", "", "Lt0/i;", "shape", "<init>", "(Ljava/lang/String;ILt0/i;)V", "Lt0/i;", "getShape", "()Lt0/i;", "Left", "Middle", "Right", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EnumC14890e {
    private static final /* synthetic */ InterfaceC33616a $ENTRIES;
    private static final /* synthetic */ EnumC14890e[] $VALUES;
    public static final EnumC14890e Left;
    public static final EnumC14890e Middle = new EnumC14890e("Middle", 1, AbstractC33253j.m105489e(0 * 8));
    public static final EnumC14890e Right;
    private final C33252i shape;

    private static final /* synthetic */ EnumC14890e[] $values() {
        return new EnumC14890e[]{Left, Middle, Right};
    }

    static {
        float f13 = 1 * 4;
        Left = new EnumC14890e("Left", 0, AbstractC33253j.m105491g(f13, 0.0f, 0.0f, f13, 6));
        Right = new EnumC14890e("Right", 2, AbstractC33253j.m105491g(0.0f, f13, f13, 0.0f, 9));
        EnumC14890e[] enumC14890eArr$values = $values();
        $VALUES = enumC14890eArr$values;
        $ENTRIES = AbstractC15751g.m44468u(enumC14890eArr$values);
    }

    private EnumC14890e(String str, int i13, C33252i c33252i) {
        super(str, i13);
        this.shape = c33252i;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static EnumC14890e valueOf(String str) {
        return (EnumC14890e) Enum.valueOf(EnumC14890e.class, str);
    }

    public static EnumC14890e[] values() {
        return (EnumC14890e[]) $VALUES.clone();
    }

    public final C33252i getShape() {
        return this.shape;
    }
}
