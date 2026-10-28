package p736sz0;

import com.whoop.navigation.models.GenericInteraction;
import ih0.AbstractC18489d0;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: sz0.h */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lsz0/h;", "", "", "selectedIconRes", "", "selectedContentDescription", "unselectedIconRes", "unselectedContentDescription", "Lcom/whoop/navigation/models/GenericInteraction;", "unselectedInteraction", "<init>", "(ILjava/lang/String;ILjava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "c", "d", "e", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33183h {

    /* JADX INFO: renamed from: f */
    public static final int f138364f = GenericInteraction.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int selectedIconRes;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String selectedContentDescription;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int unselectedIconRes;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String unselectedContentDescription;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final GenericInteraction unselectedInteraction;

    public C33183h(int i13, String selectedContentDescription, int i14, String unselectedContentDescription, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(selectedContentDescription, "selectedContentDescription");
        AbstractC22676k.m65750j(unselectedContentDescription, "unselectedContentDescription");
        this.selectedIconRes = i13;
        this.selectedContentDescription = selectedContentDescription;
        this.unselectedIconRes = i14;
        this.unselectedContentDescription = unselectedContentDescription;
        this.unselectedInteraction = genericInteraction;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getSelectedContentDescription() {
        return this.selectedContentDescription;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getSelectedIconRes() {
        return this.selectedIconRes;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getUnselectedContentDescription() {
        return this.unselectedContentDescription;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getUnselectedIconRes() {
        return this.unselectedIconRes;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final GenericInteraction getUnselectedInteraction() {
        return this.unselectedInteraction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33183h)) {
            return false;
        }
        C33183h c33183h = (C33183h) other;
        return this.selectedIconRes == c33183h.selectedIconRes && AbstractC22676k.m65745e(this.selectedContentDescription, c33183h.selectedContentDescription) && this.unselectedIconRes == c33183h.unselectedIconRes && AbstractC22676k.m65745e(this.unselectedContentDescription, c33183h.unselectedContentDescription) && AbstractC22676k.m65745e(this.unselectedInteraction, c33183h.unselectedInteraction);
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.unselectedIconRes, AbstractC11266d.m30450d(Integer.hashCode(this.selectedIconRes) * 31, 31, this.selectedContentDescription), 31), 31, this.unselectedContentDescription);
        GenericInteraction genericInteraction = this.unselectedInteraction;
        return iM30450d + (genericInteraction == null ? 0 : genericInteraction.hashCode());
    }

    public String toString() {
        int i13 = this.selectedIconRes;
        String str = this.selectedContentDescription;
        int i14 = this.unselectedIconRes;
        String str2 = this.unselectedContentDescription;
        GenericInteraction genericInteraction = this.unselectedInteraction;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "BinaryIconState(selectedIconRes=", ", selectedContentDescription=", str, ", unselectedIconRes=");
        AbstractC11895b.m31979B(i14, ", unselectedContentDescription=", str2, ", unselectedInteraction=", sbM53373n);
        return AbstractC26725a.m79506j(sbM53373n, genericInteraction, ")");
    }

    public /* synthetic */ C33183h(int i13, String str, int i14, String str2, GenericInteraction genericInteraction, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, str, i14, str2, (i15 & 16) != 0 ? null : genericInteraction);
    }
}
