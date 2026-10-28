package m62;

import f62.AbstractC14151a;
import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;
import x81.C38072d;
import y00.AbstractC38963t7;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'STANDARD' uses external variables
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
/* JADX INFO: renamed from: m62.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B;\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, m65681d2 = {"Lm62/a;", "", "", "backgroundImage", "leftIcon", "rightIcon", "Ly3/f;", "paddingBottom", "", "addBottomSpacer", "<init>", "(Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;FZ)V", "I", "getBackgroundImage", "()I", "Ljava/lang/Integer;", "getLeftIcon", "()Ljava/lang/Integer;", "getRightIcon", "F", "getPaddingBottom-D9Ej5fM", "()F", "Z", "getAddBottomSpacer", "()Z", "STANDARD", "YEAR_IN_REVIEW", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EnumC25110a {
    private static final /* synthetic */ InterfaceC33616a $ENTRIES;
    private static final /* synthetic */ EnumC25110a[] $VALUES;
    public static final EnumC25110a STANDARD;
    public static final EnumC25110a YEAR_IN_REVIEW;
    private final boolean addBottomSpacer;
    private final int backgroundImage;
    private final Integer leftIcon;
    private final float paddingBottom;
    private final Integer rightIcon;

    private static final /* synthetic */ EnumC25110a[] $values() {
        return new EnumC25110a[]{STANDARD, YEAR_IN_REVIEW};
    }

    static {
        int i13 = AbstractC14151a.f50975b;
        C38072d c38072d = C38072d.f163053a;
        float f13 = 8;
        STANDARD = new EnumC25110a("STANDARD", 0, i13, AbstractC38963t7.m124375e(c38072d), null, 2 * f13, true);
        YEAR_IN_REVIEW = new EnumC25110a("YEAR_IN_REVIEW", 1, AbstractC14151a.f50977d, null, AbstractC38963t7.m124375e(c38072d), ((float) 10.75d) * f13, false);
        EnumC25110a[] enumC25110aArr$values = $values();
        $VALUES = enumC25110aArr$values;
        $ENTRIES = AbstractC15751g.m44468u(enumC25110aArr$values);
    }

    private EnumC25110a(String str, int i13, int i14, Integer num, Integer num2, float f13, boolean z4) {
        super(str, i13);
        this.backgroundImage = i14;
        this.leftIcon = num;
        this.rightIcon = num2;
        this.paddingBottom = f13;
        this.addBottomSpacer = z4;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static EnumC25110a valueOf(String str) {
        return (EnumC25110a) Enum.valueOf(EnumC25110a.class, str);
    }

    public static EnumC25110a[] values() {
        return (EnumC25110a[]) $VALUES.clone();
    }

    public final boolean getAddBottomSpacer() {
        return this.addBottomSpacer;
    }

    public final int getBackgroundImage() {
        return this.backgroundImage;
    }

    public final Integer getLeftIcon() {
        return this.leftIcon;
    }

    /* JADX INFO: renamed from: getPaddingBottom-D9Ej5fM, reason: not valid java name and from getter */
    public final float getPaddingBottom() {
        return this.paddingBottom;
    }

    public final Integer getRightIcon() {
        return this.rightIcon;
    }
}
