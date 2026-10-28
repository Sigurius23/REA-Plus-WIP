package e01;

import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: e01.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Le01/c;", "Lm91/u;", "", "iconButtons", "primaryButton", "<init>", "(Ljava/util/List;Lm91/u;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Lm91/u;", "()Lm91/u;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12504c implements InterfaceC25312u {

    /* JADX INFO: renamed from: c */
    public static final int f42704c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC25312u> iconButtons;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC25312u primaryButton;

    /* JADX WARN: Multi-variable type inference failed */
    public C12504c(List<? extends InterfaceC25312u> iconButtons, InterfaceC25312u primaryButton) {
        AbstractC22676k.m65750j(iconButtons, "iconButtons");
        AbstractC22676k.m65750j(primaryButton, "primaryButton");
        this.iconButtons = iconButtons;
        this.primaryButton = primaryButton;
    }

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC25312u> m35145a() {
        return this.iconButtons;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC25312u getPrimaryButton() {
        return this.primaryButton;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12504c)) {
            return false;
        }
        C12504c c12504c = (C12504c) other;
        return AbstractC22676k.m65745e(this.iconButtons, c12504c.iconButtons) && AbstractC22676k.m65745e(this.primaryButton, c12504c.primaryButton);
    }

    public int hashCode() {
        return this.primaryButton.hashCode() + (this.iconButtons.hashCode() * 31);
    }

    public String toString() {
        return "MultipleButtonContainerState(iconButtons=" + this.iconButtons + ", primaryButton=" + this.primaryButton + ")";
    }
}
