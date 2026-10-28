package px2;

import ge3.AbstractC15751g;
import java.util.Locale;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.C39336i;
import p745y81.Function1;
import p745y81.InterfaceC39332e;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: px2.d */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\tj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m65681d2 = {"Lpx2/d;", "", "Ly81/e;", "iconColor", "iconBackgroundColor", "<init>", "(Ljava/lang/String;ILy81/e;Ly81/e;)V", "Ly81/e;", "getIconColor", "()Ly81/e;", "getIconBackgroundColor", "Companion", "g", "NEUTRAL", "POSITIVE", "NEGATIVE", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC29601d {
    NEUTRAL(Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: px2.d.a
        /* JADX INFO: renamed from: a */
        public final long m90802a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m90802a((C39336i) obj));
        }
    }), Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: px2.d.b
        /* JADX INFO: renamed from: a */
        public final long m90803a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getNeutral15();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m90803a((C39336i) obj));
        }
    })),
    POSITIVE(Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: px2.d.c
        /* JADX INFO: renamed from: a */
        public final long m90804a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentPositiveTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m90804a((C39336i) obj));
        }
    }), Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: px2.d.d
        /* JADX INFO: renamed from: a */
        public final long m90805a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentPositiveTrend15();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m90805a((C39336i) obj));
        }
    })),
    NEGATIVE(Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: px2.d.e
        /* JADX INFO: renamed from: a */
        public final long m90806a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m90806a((C39336i) obj));
        }
    }), Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: px2.d.f
        /* JADX INFO: renamed from: a */
        public final long m90807a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend15();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m90807a((C39336i) obj));
        }
    }));

    private final InterfaceC39332e iconBackgroundColor;
    private final InterfaceC39332e iconColor;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: px2.d$g, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lpx2/d$g;", "", "<init>", "()V", "", "value", "Lpx2/d;", "a", "(Ljava/lang/String;)Lpx2/d;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final EnumC29601d m90808a(String value) {
            AbstractC22676k.m65750j(value, "value");
            String upperCase = value.toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            if (upperCase.equals("POSITIVE")) {
                return EnumC29601d.POSITIVE;
            }
            return upperCase.equals("NEGATIVE") ? EnumC29601d.NEGATIVE : EnumC29601d.NEUTRAL;
        }

        private Companion() {
        }
    }

    EnumC29601d(InterfaceC39332e interfaceC39332e, InterfaceC39332e interfaceC39332e2) {
        this.iconColor = interfaceC39332e;
        this.iconBackgroundColor = interfaceC39332e2;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final InterfaceC39332e getIconBackgroundColor() {
        return this.iconBackgroundColor;
    }

    public final InterfaceC39332e getIconColor() {
        return this.iconColor;
    }
}
