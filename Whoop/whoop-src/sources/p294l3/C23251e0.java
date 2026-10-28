package p294l3;

import ih0.AbstractC18489d0;

/* JADX INFO: renamed from: l3.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C23251e0 {

    /* JADX INFO: renamed from: b */
    public static final C23251e0 f92129b = new C23251e0(false, 0);

    /* JADX INFO: renamed from: a */
    public final boolean f92130a;

    public C23251e0(boolean z4) {
        this.f92130a = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C23251e0) {
            return this.f92130a == ((C23251e0) obj).f92130a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Boolean.hashCode(this.f92130a) * 31);
    }

    public final String toString() {
        return AbstractC18489d0.m53372m(new StringBuilder("PlatformParagraphStyle(includeFontPadding="), this.f92130a, ", emojiSupportMatch=EmojiSupportMatch.Default)");
    }

    public C23251e0(boolean z4, int i13) {
        this.f92130a = z4;
    }
}
