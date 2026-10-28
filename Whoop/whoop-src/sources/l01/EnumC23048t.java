package l01;

import gb1.AbstractC15673b0;
import ge3.AbstractC15751g;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.List;
import l83.C23465k;
import m83.C25271y;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;
import wb3.AbstractC37056f;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'PEAK' uses external variables
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
/* JADX INFO: renamed from: l01.t */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B{\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b \u0010\u001cR\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b!\u0010\u001cR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010#\u001a\u0004\b$\u0010%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-¨\u0006."}, m65681d2 = {"Ll01/t;", "", "Li2/t;", "smallCardGradient", "", "Li2/x;", "backgroundRadialGradientColors", "", "radiusFactor", "borderColors", "backgroundLinearGradient", "Ly3/f;", "bottomPadding", "tierImageMinHeight", "tierImageMaxHeight", "imageOverlayGradient", "", "fullBleedImage", "<init>", "(Ljava/lang/String;ILi2/t;Ljava/util/List;FLjava/util/List;Li2/t;FFFLi2/t;Z)V", "Li2/t;", "getSmallCardGradient", "()Li2/t;", "Ljava/util/List;", "getBackgroundRadialGradientColors", "()Ljava/util/List;", "F", "getRadiusFactor", "()F", "getBorderColors", "getBackgroundLinearGradient", "getBottomPadding-D9Ej5fM", "getTierImageMinHeight-D9Ej5fM", "getTierImageMaxHeight-D9Ej5fM", "getImageOverlayGradient", "Z", "getFullBleedImage", "()Z", "ONE", "PEAK", "LIFE", "ADVANCED_LABS", "CITL", "CITL_NEW", "PDP", "DEVICE", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EnumC23048t {
    private static final /* synthetic */ InterfaceC33616a $ENTRIES;
    private static final /* synthetic */ EnumC23048t[] $VALUES;
    public static final EnumC23048t ADVANCED_LABS;
    public static final EnumC23048t CITL;
    public static final EnumC23048t CITL_NEW;
    public static final EnumC23048t DEVICE;
    public static final EnumC23048t LIFE;
    public static final EnumC23048t ONE = new EnumC23048t("ONE", 0, AbstractC15673b0.m44013U0(), AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4294967295L)), new C17919x(AbstractC17918w0.m51515c(16777215))), 0.0f, null, null, 0.0f, 0.0f, 0.0f, null, false, 1020, null);
    public static final EnumC23048t PDP;
    public static final EnumC23048t PEAK;
    private final AbstractC17911t backgroundLinearGradient;
    private final List<C17919x> backgroundRadialGradientColors;
    private final List<C17919x> borderColors;
    private final float bottomPadding;
    private final boolean fullBleedImage;
    private final AbstractC17911t imageOverlayGradient;
    private final float radiusFactor;
    private final AbstractC17911t smallCardGradient;
    private final float tierImageMaxHeight;
    private final float tierImageMinHeight;

    private static final /* synthetic */ EnumC23048t[] $values() {
        return new EnumC23048t[]{ONE, PEAK, LIFE, ADVANCED_LABS, CITL, CITL_NEW, PDP, DEVICE};
    }

    static {
        AbstractC17911t abstractC17911tM44015V0 = AbstractC15673b0.m44015V0();
        C17919x c17919x = new C17919x(AbstractC17918w0.m51517e(4289577677L));
        C17919x c17919x2 = new C17919x(AbstractC17918w0.m51515c(1296538306));
        long j7 = C17919x.f69636m;
        PEAK = new EnumC23048t("PEAK", 1, abstractC17911tM44015V0, AbstractC37056f.m118959K(c17919x, c17919x2, new C17919x(j7)), 0.0f, null, null, 0.0f, 0.0f, 0.0f, null, false, 1020, null);
        LIFE = new EnumC23048t("LIFE", 2, AbstractC15673b0.m44003P0(), AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4290429613L)), new C17919x(AbstractC17918w0.m51517e(4291157977L)), new C17919x(j7)), 0.0f, null, null, 0.0f, 0.0f, 0.0f, null, false, 1020, null);
        ADVANCED_LABS = new EnumC23048t("ADVANCED_LABS", 3, AbstractC15673b0.m44040h0(), AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4278251935L)), new C17919x(AbstractC17918w0.m51515c(6794982)), new C17919x(j7)), 1.3f, null, null, 0.0f, 0.0f, 0.0f, null, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
        CITL = new EnumC23048t("CITL", 4, AbstractC15673b0.m44015V0(), AbstractC23049u.f90901a, 0.0f, null, null, 0.0f, 0.0f, 0.0f, null, false, 1020, null);
        float f13 = 16;
        CITL_NEW = new EnumC23048t("CITL_NEW", 5, AbstractC15673b0.m44015V0(), AbstractC23049u.f90902b, 0.0f, AbstractC15673b0.m44057q(), AbstractC15673b0.m43992K(), 24, f13, 20, null, false, 772, null);
        AbstractC17911t abstractC17911tM44013U0 = AbstractC15673b0.m44013U0();
        C25271y c25271y = C25271y.f99162w;
        PDP = new EnumC23048t("PDP", 6, abstractC17911tM44013U0, c25271y, 0.0f, null, null, 0.0f, 0.0f, 0.0f, null, false, 1020, null);
        DEVICE = new EnumC23048t("DEVICE", 7, AbstractC15673b0.m44013U0(), c25271y, 0.0f, null, null, f13, 0.0f, 0.0f, C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(j7)), new C23465k(Float.valueOf(0.25f), new C17919x(AbstractC17918w0.m51517e(2566914048L))), new C23465k(Float.valueOf(1.0f), new C17919x(AbstractC17918w0.m51517e(4278190080L)))}, 0.0f, 0.0f, 14), true, 220, null);
        EnumC23048t[] enumC23048tArr$values = $values();
        $VALUES = enumC23048tArr$values;
        $ENTRIES = AbstractC15751g.m44468u(enumC23048tArr$values);
    }

    private EnumC23048t(String str, int i13, AbstractC17911t abstractC17911t, List list, float f13, List list2, AbstractC17911t abstractC17911t2, float f14, float f15, float f16, AbstractC17911t abstractC17911t3, boolean z4) {
        super(str, i13);
        this.smallCardGradient = abstractC17911t;
        this.backgroundRadialGradientColors = list;
        this.radiusFactor = f13;
        this.borderColors = list2;
        this.backgroundLinearGradient = abstractC17911t2;
        this.bottomPadding = f14;
        this.tierImageMinHeight = f15;
        this.tierImageMaxHeight = f16;
        this.imageOverlayGradient = abstractC17911t3;
        this.fullBleedImage = z4;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static EnumC23048t valueOf(String str) {
        return (EnumC23048t) Enum.valueOf(EnumC23048t.class, str);
    }

    public static EnumC23048t[] values() {
        return (EnumC23048t[]) $VALUES.clone();
    }

    public final AbstractC17911t getBackgroundLinearGradient() {
        return this.backgroundLinearGradient;
    }

    public final List<C17919x> getBackgroundRadialGradientColors() {
        return this.backgroundRadialGradientColors;
    }

    public final List<C17919x> getBorderColors() {
        return this.borderColors;
    }

    /* JADX INFO: renamed from: getBottomPadding-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBottomPadding() {
        return this.bottomPadding;
    }

    public final boolean getFullBleedImage() {
        return this.fullBleedImage;
    }

    public final AbstractC17911t getImageOverlayGradient() {
        return this.imageOverlayGradient;
    }

    public final float getRadiusFactor() {
        return this.radiusFactor;
    }

    public final AbstractC17911t getSmallCardGradient() {
        return this.smallCardGradient;
    }

    /* JADX INFO: renamed from: getTierImageMaxHeight-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTierImageMaxHeight() {
        return this.tierImageMaxHeight;
    }

    /* JADX INFO: renamed from: getTierImageMinHeight-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTierImageMinHeight() {
        return this.tierImageMinHeight;
    }

    public EnumC23048t(String str, int i13, AbstractC17911t abstractC17911t, List list, float f13, List list2, AbstractC17911t abstractC17911t2, float f14, float f15, float f16, AbstractC17911t abstractC17911t3, boolean z4, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, abstractC17911t, list, (i14 & 4) != 0 ? 0.8f : f13, (i14 & 8) != 0 ? null : list2, (i14 & 16) != 0 ? null : abstractC17911t2, (i14 & 32) != 0 ? 0 : f14, (i14 & 64) != 0 ? 8 : f15, (i14 & 128) != 0 ? 12 : f16, (i14 & 256) != 0 ? null : abstractC17911t3, (i14 & 512) != 0 ? false : z4);
    }
}
