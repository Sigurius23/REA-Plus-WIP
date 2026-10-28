package p702ch0;

import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ch0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Lch0/b;", "", "", "enabled", "showStopGenerating", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4605b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean showStopGenerating;

    public C4605b(boolean z4, boolean z13) {
        this.enabled = z4;
        this.showStopGenerating = z13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getShowStopGenerating() {
        return this.showStopGenerating;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4605b)) {
            return false;
        }
        C4605b c4605b = (C4605b) other;
        return this.enabled == c4605b.enabled && this.showStopGenerating == c4605b.showStopGenerating;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showStopGenerating) + (Boolean.hashCode(this.enabled) * 31);
    }

    public String toString() {
        return AbstractC30802r.m94762k("AiChatDrawerInputState(enabled=", ", showStopGenerating=", ")", this.enabled, this.showStopGenerating);
    }

    public /* synthetic */ C4605b(boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? false : z13);
    }
}
