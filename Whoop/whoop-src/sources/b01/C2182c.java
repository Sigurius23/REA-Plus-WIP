package b01;

import gz0.EnumC16313m0;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: b01.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0015\u0010\u001f¨\u0006 "}, m65681d2 = {"Lb01/c;", "Lb01/j;", "Lm91/u;", "", "id", "text", "Lgz0/m0;", "trailingIcon", "", "modal", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/Object;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "getText", "c", "Lgz0/m0;", "()Lgz0/m0;", "d", "Ljava/lang/Object;", "()Ljava/lang/Object;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C2182c implements InterfaceC2189j, InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String text;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC16313m0 trailingIcon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Object modal;

    public C2182c(String id4, String text, EnumC16313m0 enumC16313m0, Object obj) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(text, "text");
        this.id = id4;
        this.text = text;
        this.trailingIcon = enumC16313m0;
        this.modal = obj;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Object getModal() {
        return this.modal;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC16313m0 getTrailingIcon() {
        return this.trailingIcon;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C2182c)) {
            return false;
        }
        C2182c c2182c = (C2182c) other;
        return AbstractC22676k.m65745e(this.id, c2182c.id) && AbstractC22676k.m65745e(this.text, c2182c.text) && this.trailingIcon == c2182c.trailingIcon && AbstractC22676k.m65745e(this.modal, c2182c.modal);
    }

    @Override // b01.InterfaceC2189j
    public String getId() {
        return this.id;
    }

    @Override // b01.InterfaceC2189j
    public String getText() {
        return this.text;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.text);
        EnumC16313m0 enumC16313m0 = this.trailingIcon;
        int iHashCode = (iM30450d + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        Object obj = this.modal;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.text;
        EnumC16313m0 enumC16313m0 = this.trailingIcon;
        Object obj = this.modal;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("BiomarkerItemViewState(id=", str, ", text=", str2, ", trailingIcon=");
        sbM32001t.append(enumC16313m0);
        sbM32001t.append(", modal=");
        sbM32001t.append(obj);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ C2182c(String str, String str2, EnumC16313m0 enumC16313m0, Object obj, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? null : enumC16313m0, (i13 & 8) != 0 ? null : obj);
    }
}
