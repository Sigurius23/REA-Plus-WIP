package gr1;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gr1.s */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lgr1/s;", "", "Lgr1/r;", "automaticImportControl", "automaticExportControl", "<init>", "(Lgr1/r;Lgr1/r;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgr1/r;", "b", "()Lgr1/r;", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16112s {

    /* JADX INFO: renamed from: c */
    public static final int f61213c = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C16111r automaticImportControl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C16111r automaticExportControl;

    public C16112s(C16111r c16111r, C16111r c16111r2) {
        this.automaticImportControl = c16111r;
        this.automaticExportControl = c16111r2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C16111r getAutomaticExportControl() {
        return this.automaticExportControl;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C16111r getAutomaticImportControl() {
        return this.automaticImportControl;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16112s)) {
            return false;
        }
        C16112s c16112s = (C16112s) other;
        return AbstractC22676k.m65745e(this.automaticImportControl, c16112s.automaticImportControl) && AbstractC22676k.m65745e(this.automaticExportControl, c16112s.automaticExportControl);
    }

    public int hashCode() {
        C16111r c16111r = this.automaticImportControl;
        int iHashCode = (c16111r == null ? 0 : c16111r.hashCode()) * 31;
        C16111r c16111r2 = this.automaticExportControl;
        return iHashCode + (c16111r2 != null ? c16111r2.hashCode() : 0);
    }

    public String toString() {
        return "PrivacyControls(automaticImportControl=" + this.automaticImportControl + ", automaticExportControl=" + this.automaticExportControl + ")";
    }
}
