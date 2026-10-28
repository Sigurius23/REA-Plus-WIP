package q81;

import ge3.AbstractC15751g;
import java.util.List;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import p745y81.Function1;
import p745y81.InterfaceC39332e;
import t83.InterfaceC33616a;
import wb3.AbstractC37056f;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'WARMUP' uses external variables
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
/* JADX INFO: renamed from: q81.i */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B3\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, m65681d2 = {"Lq81/i;", "", "Ly81/e;", "primaryColor", "", "borderOpacity", "borderShadowOpacity", "", "Li2/x;", "borderColors", "<init>", "(Ljava/lang/String;ILy81/e;FFLjava/util/List;)V", "Ly81/e;", "getPrimaryColor", "()Ly81/e;", "F", "getBorderOpacity", "()F", "getBorderShadowOpacity", "Ljava/util/List;", "getBorderColors", "()Ljava/util/List;", "ACTIVE", "REST", "WARMUP", "COOLDOWN", "TARGET_TIME_ELAPSED", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EnumC30051i {
    private static final /* synthetic */ InterfaceC33616a $ENTRIES;
    private static final /* synthetic */ EnumC30051i[] $VALUES;
    public static final EnumC30051i TARGET_TIME_ELAPSED;
    public static final EnumC30051i WARMUP;
    private final List<C17919x> borderColors;
    private final float borderOpacity;
    private final float borderShadowOpacity;
    private final InterfaceC39332e primaryColor;
    public static final EnumC30051i ACTIVE = new EnumC30051i("ACTIVE", 0, EnumC39333f.ACCENT_ACTION, 0.0f, 0.0f, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4278227943L)), new C17919x(AbstractC17918w0.m51517e(4278251935L)), new C17919x(AbstractC17918w0.m51517e(4279318382L))), 6, null);
    public static final EnumC30051i REST = new EnumC30051i("REST", 1, EnumC39333f.BRAND_WHITE, 0.5f, 0.0f, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4294967295L)), new C17919x(AbstractC17918w0.m51517e(2164260863L)), new C17919x(AbstractC17918w0.m51515c(872415231))), 4, null);
    public static final EnumC30051i COOLDOWN = new EnumC30051i("COOLDOWN", 3, Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: q81.i.b
        /* JADX INFO: renamed from: a */
        public final long m92070a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getSleep();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m92070a((C39336i) obj));
        }
    }), 0.0f, 0.0f, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4284985062L)), new C17919x(AbstractC17918w0.m51517e(4289577677L)), new C17919x(AbstractC17918w0.m51517e(4282882754L))), 6, null);

    private static final /* synthetic */ EnumC30051i[] $values() {
        return new EnumC30051i[]{ACTIVE, REST, WARMUP, COOLDOWN, TARGET_TIME_ELAPSED};
    }

    static {
        int i13 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        float f13 = 0.0f;
        WARMUP = new EnumC30051i("WARMUP", 2, Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: q81.i.a
            /* JADX INFO: renamed from: a */
            public final long m92069a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return AbstractC17918w0.m51517e(4294807642L);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m92069a((C39336i) obj));
            }
        }), 0.0f, f13, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4294010764L)), new C17919x(AbstractC17918w0.m51517e(4294749277L)), new C17919x(AbstractC17918w0.m51517e(4294927394L))), i13, defaultConstructorMarker);
        TARGET_TIME_ELAPSED = new EnumC30051i("TARGET_TIME_ELAPSED", 4, Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: q81.i.c
            /* JADX INFO: renamed from: a */
            public final long m92071a(C39336i whoopColor) {
                AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                return AbstractC17918w0.m51517e(4294944546L);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                return new C17919x(m92071a((C39336i) obj));
            }
        }), 0.0f, f13, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4294749277L)), new C17919x(AbstractC17918w0.m51517e(4294944546L)), new C17919x(AbstractC17918w0.m51517e(4294927394L))), i13, defaultConstructorMarker);
        EnumC30051i[] enumC30051iArr$values = $values();
        $VALUES = enumC30051iArr$values;
        $ENTRIES = AbstractC15751g.m44468u(enumC30051iArr$values);
    }

    private EnumC30051i(String str, int i13, InterfaceC39332e interfaceC39332e, float f13, float f14, List list) {
        super(str, i13);
        this.primaryColor = interfaceC39332e;
        this.borderOpacity = f13;
        this.borderShadowOpacity = f14;
        this.borderColors = list;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static EnumC30051i valueOf(String str) {
        return (EnumC30051i) Enum.valueOf(EnumC30051i.class, str);
    }

    public static EnumC30051i[] values() {
        return (EnumC30051i[]) $VALUES.clone();
    }

    public final List<C17919x> getBorderColors() {
        return this.borderColors;
    }

    public final float getBorderOpacity() {
        return this.borderOpacity;
    }

    public final float getBorderShadowOpacity() {
        return this.borderShadowOpacity;
    }

    public final InterfaceC39332e getPrimaryColor() {
        return this.primaryColor;
    }

    public /* synthetic */ EnumC30051i(String str, int i13, InterfaceC39332e interfaceC39332e, float f13, float f14, List list, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, interfaceC39332e, (i14 & 2) != 0 ? 1.0f : f13, (i14 & 4) != 0 ? 0.2f : f14, list);
    }
}
