package fv2;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fv2.c */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lfv2/c;", "", "Lfv2/e;", "loaded", "Lfv2/a;", "currentDialogType", "<init>", "(Lfv2/e;Lfv2/a;)V", "a", "(Lfv2/e;Lfv2/a;)Lfv2/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lfv2/e;", "d", "()Lfv2/e;", "b", "Lfv2/a;", "c", "()Lfv2/a;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14818c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C14820e loaded;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC14816a currentDialogType;

    public C14818c(C14820e loaded, InterfaceC14816a interfaceC14816a) {
        AbstractC22676k.m65750j(loaded, "loaded");
        this.loaded = loaded;
        this.currentDialogType = interfaceC14816a;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C14818c m42570b(C14818c c14818c, C14820e c14820e, InterfaceC14816a interfaceC14816a, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c14820e = c14818c.loaded;
        }
        if ((i13 & 2) != 0) {
            interfaceC14816a = c14818c.currentDialogType;
        }
        return c14818c.m42571a(c14820e, interfaceC14816a);
    }

    /* JADX INFO: renamed from: a */
    public final C14818c m42571a(C14820e loaded, InterfaceC14816a currentDialogType) {
        AbstractC22676k.m65750j(loaded, "loaded");
        return new C14818c(loaded, currentDialogType);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC14816a getCurrentDialogType() {
        return this.currentDialogType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C14820e getLoaded() {
        return this.loaded;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14818c)) {
            return false;
        }
        C14818c c14818c = (C14818c) other;
        return AbstractC22676k.m65745e(this.loaded, c14818c.loaded) && AbstractC22676k.m65745e(this.currentDialogType, c14818c.currentDialogType);
    }

    public int hashCode() {
        int iHashCode = this.loaded.hashCode() * 31;
        InterfaceC14816a interfaceC14816a = this.currentDialogType;
        return iHashCode + (interfaceC14816a == null ? 0 : interfaceC14816a.hashCode());
    }

    public String toString() {
        return "CustomExerciseDomainState(loaded=" + this.loaded + ", currentDialogType=" + this.currentDialogType + ")";
    }
}
