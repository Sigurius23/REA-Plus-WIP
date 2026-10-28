package zo0;

import ep0.C13404j;
import live.hms.video.utils.HMSConstantsKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: zo0.i */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, m65681d2 = {"Lzo0/i;", "", "Lep0/j;", HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY, "override", "<init>", "(Lep0/j;Lep0/j;)V", "a", "(Lep0/j;Lep0/j;)Lzo0/i;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lep0/j;", "c", "()Lep0/j;", "b", "d", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40921i {

    /* JADX INFO: renamed from: c */
    public static final int f176495c = C13404j.f46947x;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C13404j default;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C13404j override;

    public C40921i(C13404j c13404j, C13404j c13404j2) {
        this.default = c13404j;
        this.override = c13404j2;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C40921i m132716b(C40921i c40921i, C13404j c13404j, C13404j c13404j2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c13404j = c40921i.default;
        }
        if ((i13 & 2) != 0) {
            c13404j2 = c40921i.override;
        }
        return c40921i.m132717a(c13404j, c13404j2);
    }

    /* JADX INFO: renamed from: a */
    public final C40921i m132717a(C13404j c13404j, C13404j override) {
        return new C40921i(c13404j, override);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C13404j getDefault() {
        return this.default;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C13404j getOverride() {
        return this.override;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40921i)) {
            return false;
        }
        C40921i c40921i = (C40921i) other;
        return AbstractC22676k.m65745e(this.default, c40921i.default) && AbstractC22676k.m65745e(this.override, c40921i.override);
    }

    public int hashCode() {
        C13404j c13404j = this.default;
        int iHashCode = (c13404j == null ? 0 : c13404j.hashCode()) * 31;
        C13404j c13404j2 = this.override;
        return iHashCode + (c13404j2 != null ? c13404j2.hashCode() : 0);
    }

    public String toString() {
        return "ScreenCoachContext(default=" + this.default + ", override=" + this.override + ")";
    }

    public /* synthetic */ C40921i(C13404j c13404j, C13404j c13404j2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : c13404j, (i13 & 2) != 0 ? null : c13404j2);
    }
}
