package oy2;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: oy2.g */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u0019"}, m65681d2 = {"Loy2/g;", "", "", "cta", "dialogTitle", "dialogBody", "dialogPositiveCta", "dialogNegativeCta", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "e", "c", "d", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28481g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String cta;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String dialogTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String dialogBody;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String dialogPositiveCta;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String dialogNegativeCta;

    public C28481g(String cta, String dialogTitle, String dialogBody, String dialogPositiveCta, String dialogNegativeCta) {
        AbstractC22676k.m65750j(cta, "cta");
        AbstractC22676k.m65750j(dialogTitle, "dialogTitle");
        AbstractC22676k.m65750j(dialogBody, "dialogBody");
        AbstractC22676k.m65750j(dialogPositiveCta, "dialogPositiveCta");
        AbstractC22676k.m65750j(dialogNegativeCta, "dialogNegativeCta");
        this.cta = cta;
        this.dialogTitle = dialogTitle;
        this.dialogBody = dialogBody;
        this.dialogPositiveCta = dialogPositiveCta;
        this.dialogNegativeCta = dialogNegativeCta;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDialogBody() {
        return this.dialogBody;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDialogNegativeCta() {
        return this.dialogNegativeCta;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDialogPositiveCta() {
        return this.dialogPositiveCta;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDialogTitle() {
        return this.dialogTitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28481g)) {
            return false;
        }
        C28481g c28481g = (C28481g) other;
        return AbstractC22676k.m65745e(this.cta, c28481g.cta) && AbstractC22676k.m65745e(this.dialogTitle, c28481g.dialogTitle) && AbstractC22676k.m65745e(this.dialogBody, c28481g.dialogBody) && AbstractC22676k.m65745e(this.dialogPositiveCta, c28481g.dialogPositiveCta) && AbstractC22676k.m65745e(this.dialogNegativeCta, c28481g.dialogNegativeCta);
    }

    public int hashCode() {
        return this.dialogNegativeCta.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.cta.hashCode() * 31, 31, this.dialogTitle), 31, this.dialogBody), 31, this.dialogPositiveCta);
    }

    public String toString() {
        String str = this.cta;
        String str2 = this.dialogTitle;
        String str3 = this.dialogBody;
        String str4 = this.dialogPositiveCta;
        String str5 = this.dialogNegativeCta;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CancelStudyDomainState(cta=", str, ", dialogTitle=", str2, ", dialogBody=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", dialogPositiveCta=", str4, ", dialogNegativeCta=");
        return AbstractC25012a.m73376i(str5, ")", sbM32001t);
    }
}
