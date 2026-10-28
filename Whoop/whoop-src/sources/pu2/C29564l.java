package pu2;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: pu2.l */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lpu2/l;", "", "Lm91/u;", "slotContent", "", "slotContentIsNew", "<init>", "(Lm91/u;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lm91/u;", "()Lm91/u;", "b", "Z", "()Z", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29564l {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC25312u slotContent;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean slotContentIsNew;

    public C29564l(InterfaceC25312u slotContent, boolean z4) {
        AbstractC22676k.m65750j(slotContent, "slotContent");
        this.slotContent = slotContent;
        this.slotContentIsNew = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC25312u getSlotContent() {
        return this.slotContent;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getSlotContentIsNew() {
        return this.slotContentIsNew;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29564l)) {
            return false;
        }
        C29564l c29564l = (C29564l) other;
        return AbstractC22676k.m65745e(this.slotContent, c29564l.slotContent) && this.slotContentIsNew == c29564l.slotContentIsNew;
    }

    public int hashCode() {
        return Boolean.hashCode(this.slotContentIsNew) + (this.slotContent.hashCode() * 31);
    }

    public String toString() {
        return "LiveSessionBottomSlotState(slotContent=" + this.slotContent + ", slotContentIsNew=" + this.slotContentIsNew + ")";
    }
}
