package ny0;

import androidx.compose.foundation.layout.AbstractC1099a;
import b91.AbstractC2890e;
import b91.C2886a;
import p291l0.C22976l1;
import p291l0.InterfaceC22973k1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ny0.v0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\r\n\f\bB%\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u000f\u0082\u0001\u0004\u0011\u0012\u0013\u0014¨\u0006\u0015"}, m65681d2 = {"Lny0/v0;", "", "Lb91/a;", "settingStyle", "settingLabelStyle", "supportStyle", "<init>", "(Lb91/a;Lb91/a;Lb91/a;)V", "a", "Lb91/a;", "c", "()Lb91/a;", "b", "d", "Ll0/k1;", "()Ll0/k1;", "padding", "Lny0/v0$a;", "Lny0/v0$b;", "Lny0/v0$c;", "Lny0/v0$d;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27285v0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C2886a settingStyle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C2886a settingLabelStyle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C2886a supportStyle;

    /* JADX INFO: renamed from: ny0.v0$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lny0/v0$a;", "Lny0/v0;", "Ll0/k1;", "padding", "<init>", "(Ll0/k1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ll0/k1;", "a", "()Ll0/k1;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC27285v0 {

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final InterfaceC22973k1 padding;

        public a(InterfaceC22973k1 interfaceC22973k1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? AbstractC1099a.m3379a(((float) 1.5d) * 8, 0.0f, 2) : interfaceC22973k1);
        }

        @Override // ny0.AbstractC27285v0
        /* JADX INFO: renamed from: a, reason: from getter */
        public InterfaceC22973k1 getPadding() {
            return this.padding;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.padding, ((a) other).padding);
        }

        public int hashCode() {
            return this.padding.hashCode();
        }

        public String toString() {
            return "MediumNumberState(padding=" + this.padding + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC22973k1 padding) {
            super(AbstractC2890e.m8450e().getN7(), null, null, 6, null);
            AbstractC22676k.m65750j(padding, "padding");
            this.padding = padding;
        }
    }

    /* JADX INFO: renamed from: ny0.v0$b */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lny0/v0$b;", "Lny0/v0;", "<init>", "()V", "Ll0/k1;", "e", "Ll0/k1;", "a", "()Ll0/k1;", "padding", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC27285v0 {

        /* JADX INFO: renamed from: d */
        public static final b f109204d = new b();

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private static final InterfaceC22973k1 padding = AbstractC1099a.m3379a(((float) 1.5d) * 8, 0.0f, 2);

        private b() {
            super(AbstractC2890e.m8450e().getH4(), null, null, 6, null);
        }

        @Override // ny0.AbstractC27285v0
        /* JADX INFO: renamed from: a */
        public InterfaceC22973k1 getPadding() {
            return padding;
        }
    }

    public /* synthetic */ AbstractC27285v0(C2886a c2886a, C2886a c2886a2, C2886a c2886a3, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2886a, c2886a2, c2886a3);
    }

    /* JADX INFO: renamed from: a */
    public abstract InterfaceC22973k1 getPadding();

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C2886a getSettingLabelStyle() {
        return this.settingLabelStyle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C2886a getSettingStyle() {
        return this.settingStyle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C2886a getSupportStyle() {
        return this.supportStyle;
    }

    private AbstractC27285v0(C2886a c2886a, C2886a c2886a2, C2886a c2886a3) {
        this.settingStyle = c2886a;
        this.settingLabelStyle = c2886a2;
        this.supportStyle = c2886a3;
    }

    /* JADX INFO: renamed from: ny0.v0$c */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lny0/v0$c;", "Lny0/v0;", "Lny0/e1;", "widthType", "Ll0/k1;", "padding", "<init>", "(Lny0/e1;Ll0/k1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Lny0/e1;", "e", "()Lny0/e1;", "Ll0/k1;", "a", "()Ll0/k1;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC27285v0 {

        /* JADX INFO: renamed from: f */
        public static final int f109206f = 0;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final EnumC27251e1 widthType;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final InterfaceC22973k1 padding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(EnumC27251e1 widthType, InterfaceC22973k1 padding) {
            super(AbstractC2890e.m8450e().getN8(), null, null, 6, null);
            AbstractC22676k.m65750j(widthType, "widthType");
            AbstractC22676k.m65750j(padding, "padding");
            this.widthType = widthType;
            this.padding = padding;
        }

        @Override // ny0.AbstractC27285v0
        /* JADX INFO: renamed from: a, reason: from getter */
        public InterfaceC22973k1 getPadding() {
            return this.padding;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final EnumC27251e1 getWidthType() {
            return this.widthType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return this.widthType == cVar.widthType && AbstractC22676k.m65745e(this.padding, cVar.padding);
        }

        public int hashCode() {
            return this.padding.hashCode() + (this.widthType.hashCode() * 31);
        }

        public String toString() {
            return "SmallNumberState(widthType=" + this.widthType + ", padding=" + this.padding + ")";
        }

        public c(EnumC27251e1 enumC27251e1, InterfaceC22973k1 interfaceC22973k1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i13 & 2) != 0) {
                float f13 = 8;
                float f14 = 1 * f13;
                float f15 = ((float) 0.5d) * f13;
                interfaceC22973k1 = new C22976l1(f14, f15, f14, f15);
            }
            this(enumC27251e1, interfaceC22973k1);
        }
    }

    /* JADX INFO: renamed from: ny0.v0$d */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lny0/v0$d;", "Lny0/v0;", "Lny0/e1;", "widthType", "Ll0/k1;", "padding", "<init>", "(Lny0/e1;Ll0/k1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Lny0/e1;", "e", "()Lny0/e1;", "Ll0/k1;", "a", "()Ll0/k1;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC27285v0 {

        /* JADX INFO: renamed from: f */
        public static final int f109209f = 0;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final EnumC27251e1 widthType;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final InterfaceC22973k1 padding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(EnumC27251e1 widthType, InterfaceC22973k1 padding) {
            super(AbstractC2890e.m8450e().getB2(), null, null, 6, null);
            AbstractC22676k.m65750j(widthType, "widthType");
            AbstractC22676k.m65750j(padding, "padding");
            this.widthType = widthType;
            this.padding = padding;
        }

        @Override // ny0.AbstractC27285v0
        /* JADX INFO: renamed from: a, reason: from getter */
        public InterfaceC22973k1 getPadding() {
            return this.padding;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final EnumC27251e1 getWidthType() {
            return this.widthType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return this.widthType == dVar.widthType && AbstractC22676k.m65745e(this.padding, dVar.padding);
        }

        public int hashCode() {
            return this.padding.hashCode() + (this.widthType.hashCode() * 31);
        }

        public String toString() {
            return "SmallTextState(widthType=" + this.widthType + ", padding=" + this.padding + ")";
        }

        public d(EnumC27251e1 enumC27251e1, InterfaceC22973k1 interfaceC22973k1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i13 & 2) != 0) {
                float f13 = 8;
                float f14 = 1 * f13;
                float f15 = ((float) 0.5d) * f13;
                interfaceC22973k1 = new C22976l1(f14, f15, f14, f15);
            }
            this(enumC27251e1, interfaceC22973k1);
        }
    }

    public /* synthetic */ AbstractC27285v0(C2886a c2886a, C2886a c2886a2, C2886a c2886a3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2886a, (i13 & 2) != 0 ? AbstractC2890e.m8450e().getH5() : c2886a2, (i13 & 4) != 0 ? AbstractC2890e.m8450e().getB4() : c2886a3, null);
    }
}
