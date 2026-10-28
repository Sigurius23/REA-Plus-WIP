package d91;

import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.InterfaceC2300f;
import p026b2.InterfaceC2301g;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: d91.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Ld91/c;", "", "a", "b", "Ld91/c$a;", "Ld91/c$b;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC11815c {

    /* JADX INFO: renamed from: d91.c$a */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Ld91/c$a;", "Ld91/c;", "Lb2/g;", "alignment", "Ly3/f;", "spacing", "<init>", "(Lb2/g;Ly3/f;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lb2/g;", "()Lb2/g;", "b", "Ly3/f;", "()Ly3/f;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC11815c {

        /* JADX INFO: renamed from: c */
        public static final int f38406c = 0;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC2301g alignment;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C39174f spacing;

        public /* synthetic */ a(InterfaceC2301g interfaceC2301g, C39174f c39174f, DefaultConstructorMarker defaultConstructorMarker) {
            this(interfaceC2301g, c39174f);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC2301g getAlignment() {
            return this.alignment;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C39174f getSpacing() {
            return this.spacing;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.alignment, aVar.alignment) && AbstractC22676k.m65745e(this.spacing, aVar.spacing);
        }

        public int hashCode() {
            int iHashCode = Float.hashCode(((C2306l) this.alignment).f9120a) * 31;
            C39174f c39174f = this.spacing;
            return iHashCode + (c39174f == null ? 0 : Float.hashCode(c39174f.f168413w));
        }

        public String toString() {
            return "Horizontal(alignment=" + this.alignment + ", spacing=" + this.spacing + ")";
        }

        private a(InterfaceC2301g alignment, C39174f c39174f) {
            AbstractC22676k.m65750j(alignment, "alignment");
            this.alignment = alignment;
            this.spacing = c39174f;
        }

        public /* synthetic */ a(InterfaceC2301g interfaceC2301g, C39174f c39174f, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? C2299e.f9108K : interfaceC2301g, (i13 & 2) != 0 ? null : c39174f, null);
        }
    }

    /* JADX INFO: renamed from: d91.c$b */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Ld91/c$b;", "Ld91/c;", "Lb2/f;", "alignment", "Ly3/f;", "spacing", "<init>", "(Lb2/f;Ly3/f;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lb2/f;", "()Lb2/f;", "b", "Ly3/f;", "()Ly3/f;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC11815c {

        /* JADX INFO: renamed from: c */
        public static final int f38409c = 0;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC2300f alignment;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C39174f spacing;

        public /* synthetic */ b(InterfaceC2300f interfaceC2300f, C39174f c39174f, DefaultConstructorMarker defaultConstructorMarker) {
            this(interfaceC2300f, c39174f);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC2300f getAlignment() {
            return this.alignment;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C39174f getSpacing() {
            return this.spacing;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.alignment, bVar.alignment) && AbstractC22676k.m65745e(this.spacing, bVar.spacing);
        }

        public int hashCode() {
            int iHashCode = this.alignment.hashCode() * 31;
            C39174f c39174f = this.spacing;
            return iHashCode + (c39174f == null ? 0 : Float.hashCode(c39174f.f168413w));
        }

        public String toString() {
            return "Vertical(alignment=" + this.alignment + ", spacing=" + this.spacing + ")";
        }

        private b(InterfaceC2300f alignment, C39174f c39174f) {
            AbstractC22676k.m65750j(alignment, "alignment");
            this.alignment = alignment;
            this.spacing = c39174f;
        }

        public /* synthetic */ b(InterfaceC2300f interfaceC2300f, C39174f c39174f, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? C2299e.f9111N : interfaceC2300f, (i13 & 2) != 0 ? null : c39174f, null);
        }
    }
}
