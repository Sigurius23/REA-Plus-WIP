package f01;

import ny0.C27256h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: f01.a0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lf01/a0;", "Lm91/u;", "", "id", "titleDisplay", "descriptionDisplay", "Lny0/h;", "button", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lny0/h;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "c", "d", "Lny0/h;", "()Lny0/h;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C13843a0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String titleDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String descriptionDisplay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C27256h button;

    public C13843a0(String id4, String titleDisplay, String descriptionDisplay, C27256h button) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(button, "button");
        this.id = id4;
        this.titleDisplay = titleDisplay;
        this.descriptionDisplay = descriptionDisplay;
        this.button = button;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C27256h getButton() {
        return this.button;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C13843a0)) {
            return false;
        }
        C13843a0 c13843a0 = (C13843a0) other;
        return AbstractC22676k.m65745e(this.id, c13843a0.id) && AbstractC22676k.m65745e(this.titleDisplay, c13843a0.titleDisplay) && AbstractC22676k.m65745e(this.descriptionDisplay, c13843a0.descriptionDisplay) && AbstractC22676k.m65745e(this.button, c13843a0.button);
    }

    public int hashCode() {
        return this.button.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.titleDisplay), 31, this.descriptionDisplay);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.titleDisplay;
        String str3 = this.descriptionDisplay;
        C27256h c27256h = this.button;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CompactButtonCardViewState(id=", str, ", titleDisplay=", str2, ", descriptionDisplay=");
        sbM32001t.append(str3);
        sbM32001t.append(", button=");
        sbM32001t.append(c27256h);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
