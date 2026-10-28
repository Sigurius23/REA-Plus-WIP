package u80;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: u80.a */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0013\u0010\f¨\u0006\u001b"}, m65681d2 = {"Lu80/a;", "", "", "name", "code", "flag", "", "selected", "ageLimit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "Z", "e", "()Z", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34631a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String code;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String flag;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean selected;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String ageLimit;

    public C34631a(String name, String code, String str, boolean z4, String str2) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(code, "code");
        this.name = name;
        this.code = code;
        this.flag = str;
        this.selected = z4;
        this.ageLimit = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAgeLimit() {
        return this.ageLimit;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFlag() {
        return this.flag;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34631a)) {
            return false;
        }
        C34631a c34631a = (C34631a) other;
        return AbstractC22676k.m65745e(this.name, c34631a.name) && AbstractC22676k.m65745e(this.code, c34631a.code) && AbstractC22676k.m65745e(this.flag, c34631a.flag) && this.selected == c34631a.selected && AbstractC22676k.m65745e(this.ageLimit, c34631a.ageLimit);
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.name.hashCode() * 31, 31, this.code);
        String str = this.flag;
        int iM8289b = AbstractC2875y.m8289b((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.selected);
        String str2 = this.ageLimit;
        return iM8289b + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.code;
        String str3 = this.flag;
        boolean z4 = this.selected;
        String str4 = this.ageLimit;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CountriesItemState(name=", str, ", code=", str2, ", flag=");
        AbstractC38963t7.m124390t(sbM32001t, str3, ", selected=", z4, ", ageLimit=");
        return AbstractC25012a.m73376i(str4, ")", sbM32001t);
    }

    public /* synthetic */ C34631a(String str, String str2, String str3, boolean z4, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? false : z4, (i13 & 16) != 0 ? null : str4);
    }
}
