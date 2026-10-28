package ry0;

import com.whoop.design.models.DesignSystemEnum;
import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import t83.InterfaceC33616a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'MCI_FLOW' uses external variables
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
/* JADX INFO: renamed from: ry0.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B+\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, m65681d2 = {"Lry0/c;", "Lcom/whoop/design/models/DesignSystemEnum;", "", "Ly81/f;", "backgroundColor", "borderColor", "iconColor", "Ly3/f;", "minContentHeight", "<init>", "(Ljava/lang/String;ILy81/f;Ly81/f;Ly81/f;F)V", "Ly81/f;", "getBackgroundColor", "()Ly81/f;", "getBorderColor", "getIconColor", "F", "getMinContentHeight-D9Ej5fM", "()F", "MCI_FLOW", "CERVICAL_MUCUS", "BLUE_OUTLINED", "DEFAULT", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EnumC31908c implements DesignSystemEnum {
    private static final /* synthetic */ InterfaceC33616a $ENTRIES;
    private static final /* synthetic */ EnumC31908c[] $VALUES;
    public static final EnumC31908c BLUE_OUTLINED;
    public static final EnumC31908c CERVICAL_MUCUS;
    public static final EnumC31908c DEFAULT;
    public static final EnumC31908c MCI_FLOW;
    private final EnumC39333f backgroundColor;
    private final EnumC39333f borderColor;
    private final EnumC39333f iconColor;
    private final float minContentHeight;

    private static final /* synthetic */ EnumC31908c[] $values() {
        return new EnumC31908c[]{MCI_FLOW, CERVICAL_MUCUS, BLUE_OUTLINED, DEFAULT};
    }

    static {
        EnumC39333f enumC39333f = EnumC39333f.SURFACE_MCI_MENSTRUAL_DIM;
        EnumC39333f enumC39333f2 = EnumC39333f.SURFACE_MCI_MENSTRUAL;
        MCI_FLOW = new EnumC31908c("MCI_FLOW", 0, enumC39333f, enumC39333f2, enumC39333f2, 0.0f, 8, null);
        EnumC39333f enumC39333f3 = EnumC39333f.SURFACE_MCI_OVULATORY_DIM;
        EnumC39333f enumC39333f4 = EnumC39333f.SURFACE_MCI_OVULATORY;
        CERVICAL_MUCUS = new EnumC31908c("CERVICAL_MUCUS", 1, enumC39333f3, enumC39333f4, enumC39333f4, 0.0f, 8, null);
        EnumC39333f enumC39333f5 = EnumC39333f.NEUTRAL_15;
        EnumC39333f enumC39333f6 = EnumC39333f.RECOVERY;
        BLUE_OUTLINED = new EnumC31908c("BLUE_OUTLINED", 2, enumC39333f5, enumC39333f6, enumC39333f6, 0 * 4);
        EnumC39333f enumC39333f7 = EnumC39333f.WHITE_10;
        EnumC39333f enumC39333f8 = EnumC39333f.BRAND_WHITE;
        DEFAULT = new EnumC31908c("DEFAULT", 3, enumC39333f7, enumC39333f8, enumC39333f8, 0.0f, 8, null);
        EnumC31908c[] enumC31908cArr$values = $values();
        $VALUES = enumC31908cArr$values;
        $ENTRIES = AbstractC15751g.m44468u(enumC31908cArr$values);
    }

    private EnumC31908c(String str, int i13, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, EnumC39333f enumC39333f3, float f13) {
        super(str, i13);
        this.backgroundColor = enumC39333f;
        this.borderColor = enumC39333f2;
        this.iconColor = enumC39333f3;
        this.minContentHeight = f13;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static EnumC31908c valueOf(String str) {
        return (EnumC31908c) Enum.valueOf(EnumC31908c.class, str);
    }

    public static EnumC31908c[] values() {
        return (EnumC31908c[]) $VALUES.clone();
    }

    public final EnumC39333f getBackgroundColor() {
        return this.backgroundColor;
    }

    public final EnumC39333f getBorderColor() {
        return this.borderColor;
    }

    public final EnumC39333f getIconColor() {
        return this.iconColor;
    }

    /* JADX INFO: renamed from: getMinContentHeight-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMinContentHeight() {
        return this.minContentHeight;
    }

    public EnumC31908c(String str, int i13, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, EnumC39333f enumC39333f3, float f13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, enumC39333f, enumC39333f2, enumC39333f3, (i14 & 8) != 0 ? 8 * 4 : f13);
    }
}
