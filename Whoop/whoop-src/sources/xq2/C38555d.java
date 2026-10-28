package xq2;

import com.whoop.design.util.TextResource;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: xq2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, m65681d2 = {"Lxq2/d;", "Lm91/u;", "Lxq2/e;", "animatableText", "", "whoopIcon", "", "alignment", "<init>", "(Lxq2/e;Ljava/lang/Integer;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxq2/e;", "()Lxq2/e;", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "c", "Ljava/lang/String;", "getAlignment", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38555d implements InterfaceC25312u {

    /* JADX INFO: renamed from: d */
    public static final int f165942d = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C38558e animatableText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Integer whoopIcon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String alignment;

    public C38555d(C38558e animatableText, Integer num, String alignment) {
        AbstractC22676k.m65750j(animatableText, "animatableText");
        AbstractC22676k.m65750j(alignment, "alignment");
        this.animatableText = animatableText;
        this.whoopIcon = num;
        this.alignment = alignment;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C38558e getAnimatableText() {
        return this.animatableText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getWhoopIcon() {
        return this.whoopIcon;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38555d)) {
            return false;
        }
        C38555d c38555d = (C38555d) other;
        return AbstractC22676k.m65745e(this.animatableText, c38555d.animatableText) && AbstractC22676k.m65745e(this.whoopIcon, c38555d.whoopIcon) && AbstractC22676k.m65745e(this.alignment, c38555d.alignment);
    }

    public int hashCode() {
        int iHashCode = this.animatableText.hashCode() * 31;
        Integer num = this.whoopIcon;
        return this.alignment.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public String toString() {
        C38558e c38558e = this.animatableText;
        Integer num = this.whoopIcon;
        String str = this.alignment;
        StringBuilder sb4 = new StringBuilder("AnimatableTextScreenState(animatableText=");
        sb4.append(c38558e);
        sb4.append(", whoopIcon=");
        sb4.append(num);
        sb4.append(", alignment=");
        return AbstractC25012a.m73376i(str, ")", sb4);
    }
}
