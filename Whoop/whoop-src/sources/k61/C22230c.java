package k61;

import i91.AbstractC18247a;
import i91.AbstractC18249c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p208i2.C17919x;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: k61.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJL\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b\u001f\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, m65681d2 = {"Lk61/c;", "", "Ly3/f;", "width", "cap", "join", "Li91/a;", "background", "Li2/x;", "scrubbedBackground", "", "isDashed", "<init>", "(FIILi91/a;JZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(FIILi91/a;JZ)Lk61/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "F", "g", "()F", "b", "I", "d", "c", "e", "Li91/a;", "()Li91/a;", "J", "f", "()J", "Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22230c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float width;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int cap;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int join;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC18247a background;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final long scrubbedBackground;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean isDashed;

    public /* synthetic */ C22230c(float f13, int i13, int i14, AbstractC18247a abstractC18247a, long j7, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f13, i13, i14, abstractC18247a, j7, z4);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C22230c m63731b(C22230c c22230c, float f13, int i13, int i14, AbstractC18247a abstractC18247a, long j7, boolean z4, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            f13 = c22230c.width;
        }
        if ((i15 & 2) != 0) {
            i13 = c22230c.cap;
        }
        if ((i15 & 4) != 0) {
            i14 = c22230c.join;
        }
        if ((i15 & 8) != 0) {
            abstractC18247a = c22230c.background;
        }
        if ((i15 & 16) != 0) {
            j7 = c22230c.scrubbedBackground;
        }
        if ((i15 & 32) != 0) {
            z4 = c22230c.isDashed;
        }
        boolean z13 = z4;
        long j13 = j7;
        return c22230c.m63732a(f13, i13, i14, abstractC18247a, j13, z13);
    }

    /* JADX INFO: renamed from: a */
    public final C22230c m63732a(float width, int cap, int join, AbstractC18247a background, long scrubbedBackground, boolean isDashed) {
        AbstractC22676k.m65750j(background, "background");
        return new C22230c(width, cap, join, background, scrubbedBackground, isDashed, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC18247a getBackground() {
        return this.background;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getCap() {
        return this.cap;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getJoin() {
        return this.join;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22230c)) {
            return false;
        }
        C22230c c22230c = (C22230c) other;
        return C39174f.m124782b(this.width, c22230c.width) && this.cap == c22230c.cap && this.join == c22230c.join && AbstractC22676k.m65745e(this.background, c22230c.background) && C17919x.m51542d(this.scrubbedBackground, c22230c.scrubbedBackground) && this.isDashed == c22230c.isDashed;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getScrubbedBackground() {
        return this.scrubbedBackground;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsDashed() {
        return this.isDashed;
    }

    public int hashCode() {
        int iHashCode = (this.background.hashCode() + AbstractC11266d.m30448b(this.join, AbstractC11266d.m30448b(this.cap, Float.hashCode(this.width) * 31, 31), 31)) * 31;
        long j7 = this.scrubbedBackground;
        int i13 = C17919x.f69638o;
        return Boolean.hashCode(this.isDashed) + AbstractC11266d.m30451e(iHashCode, j7, 31);
    }

    public String toString() {
        String str;
        String strM124783c = C39174f.m124783c(this.width);
        int i13 = this.cap;
        String str2 = "Unknown";
        if (i13 == 0) {
            str = "Butt";
        } else if (i13 == 1) {
            str = "Round";
        } else {
            str = i13 == 2 ? "Square" : "Unknown";
        }
        int i14 = this.join;
        if (i14 == 0) {
            str2 = "Miter";
        } else if (i14 == 1) {
            str2 = "Round";
        } else if (i14 == 2) {
            str2 = "Bevel";
        }
        AbstractC18247a abstractC18247a = this.background;
        String strM51548j = C17919x.m51548j(this.scrubbedBackground);
        boolean z4 = this.isDashed;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("StrokeState(width=", strM124783c, ", cap=", str, ", join=");
        sbM32001t.append(str2);
        sbM32001t.append(", background=");
        sbM32001t.append(abstractC18247a);
        sbM32001t.append(", scrubbedBackground=");
        return AbstractC21702c.m61137h(sbM32001t, strM51548j, ", isDashed=", z4, ")");
    }

    private C22230c(float f13, int i13, int i14, AbstractC18247a background, long j7, boolean z4) {
        AbstractC22676k.m65750j(background, "background");
        this.width = f13;
        this.cap = i13;
        this.join = i14;
        this.background = background;
        this.scrubbedBackground = j7;
        this.isDashed = z4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C22230c(float f13, int i13, int i14, AbstractC18247a abstractC18247a, long j7, boolean z4, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        AbstractC18247a abstractC18247aM52577o;
        long j13;
        float f14 = (i15 & 1) != 0 ? 2 : f13;
        int i16 = (i15 & 2) != 0 ? 1 : i13;
        int i17 = (i15 & 4) == 0 ? i14 : 1;
        if ((i15 & 8) != 0) {
            int i18 = C17919x.f69638o;
            abstractC18247aM52577o = AbstractC18249c.m52577o(C17919x.f69629f);
        } else {
            abstractC18247aM52577o = abstractC18247a;
        }
        if ((i15 & 16) != 0) {
            int i19 = C17919x.f69638o;
            j13 = C17919x.f69629f;
        } else {
            j13 = j7;
        }
        this(f14, i16, i17, abstractC18247aM52577o, j13, (i15 & 32) != 0 ? false : z4, null);
    }
}
