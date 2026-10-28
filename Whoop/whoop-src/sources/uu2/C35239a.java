package uu2;

import d13.AbstractC11478a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import y71.C39274g;

/* JADX INFO: renamed from: uu2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0015\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Luu2/a;", "", "Ly71/g;", "dotMenuItem", "Lm91/u;", "editButton", "deleteButton", "Luu2/i0;", "linkedExercise", "<init>", "(Ly71/g;Lm91/u;Lm91/u;Luu2/i0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ly71/g;", "b", "()Ly71/g;", "Lm91/u;", "c", "()Lm91/u;", "d", "Luu2/i0;", "()Luu2/i0;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35239a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C39274g dotMenuItem;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC25312u editButton;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC25312u deleteButton;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C35256i0 linkedExercise;

    public C35239a(C39274g c39274g, InterfaceC25312u editButton, InterfaceC25312u deleteButton, C35256i0 linkedExercise) {
        AbstractC22676k.m65750j(editButton, "editButton");
        AbstractC22676k.m65750j(deleteButton, "deleteButton");
        AbstractC22676k.m65750j(linkedExercise, "linkedExercise");
        this.dotMenuItem = c39274g;
        this.editButton = editButton;
        this.deleteButton = deleteButton;
        this.linkedExercise = linkedExercise;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC25312u getDeleteButton() {
        return this.deleteButton;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C39274g getDotMenuItem() {
        return this.dotMenuItem;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC25312u getEditButton() {
        return this.editButton;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C35256i0 getLinkedExercise() {
        return this.linkedExercise;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35239a)) {
            return false;
        }
        C35239a c35239a = (C35239a) other;
        return AbstractC22676k.m65745e(this.dotMenuItem, c35239a.dotMenuItem) && AbstractC22676k.m65745e(this.editButton, c35239a.editButton) && AbstractC22676k.m65745e(this.deleteButton, c35239a.deleteButton) && AbstractC22676k.m65745e(this.linkedExercise, c35239a.linkedExercise);
    }

    public int hashCode() {
        C39274g c39274g = this.dotMenuItem;
        return this.linkedExercise.hashCode() + AbstractC11478a.m30851c(this.deleteButton, AbstractC11478a.m30851c(this.editButton, (c39274g == null ? 0 : c39274g.hashCode()) * 31, 31), 31);
    }

    public String toString() {
        return "CustomExerciseItems(dotMenuItem=" + this.dotMenuItem + ", editButton=" + this.editButton + ", deleteButton=" + this.deleteButton + ", linkedExercise=" + this.linkedExercise + ")";
    }
}
