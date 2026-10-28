package lo0;

import ny0.C27256h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lo0.i0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u0015\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u0018\u0010\u001e¨\u0006 "}, m65681d2 = {"Llo0/i0;", "", "", "id", "title", "Llo0/f0;", "content", "Lny0/h;", "cancelButton", "confirmButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Llo0/f0;Lny0/h;Lny0/h;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "d", "c", "Llo0/f0;", "()Llo0/f0;", "Lny0/h;", "()Lny0/h;", "e", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24585i0 {

    /* JADX INFO: renamed from: f */
    public static final int f96061f = C27256h.f109055z;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC24579f0 content;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C27256h cancelButton;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C27256h confirmButton;

    public C24585i0(String id4, String title, InterfaceC24579f0 content, C27256h cancelButton, C27256h confirmButton) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(content, "content");
        AbstractC22676k.m65750j(cancelButton, "cancelButton");
        AbstractC22676k.m65750j(confirmButton, "confirmButton");
        this.id = id4;
        this.title = title;
        this.content = content;
        this.cancelButton = cancelButton;
        this.confirmButton = confirmButton;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C27256h getCancelButton() {
        return this.cancelButton;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C27256h getConfirmButton() {
        return this.confirmButton;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC24579f0 getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24585i0)) {
            return false;
        }
        C24585i0 c24585i0 = (C24585i0) other;
        return AbstractC22676k.m65745e(this.id, c24585i0.id) && AbstractC22676k.m65745e(this.title, c24585i0.title) && AbstractC22676k.m65745e(this.content, c24585i0.content) && AbstractC22676k.m65745e(this.cancelButton, c24585i0.cancelButton) && AbstractC22676k.m65745e(this.confirmButton, c24585i0.confirmButton);
    }

    public int hashCode() {
        return this.confirmButton.hashCode() + ((this.cancelButton.hashCode() + ((this.content.hashCode() + AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.title)) * 31)) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        InterfaceC24579f0 interfaceC24579f0 = this.content;
        C27256h c27256h = this.cancelButton;
        C27256h c27256h2 = this.confirmButton;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("FormSheetViewState(id=", str, ", title=", str2, ", content=");
        sbM32001t.append(interfaceC24579f0);
        sbM32001t.append(", cancelButton=");
        sbM32001t.append(c27256h);
        sbM32001t.append(", confirmButton=");
        sbM32001t.append(c27256h2);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
