package p700bd1;

import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: bd1.w */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Lbd1/w;", "Lm91/u;", "", "checked", "enabled", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "design-showcase_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3105w implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean checked;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean enabled;

    public C3105w(boolean z4, boolean z13) {
        this.checked = z4;
        this.enabled = z13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getChecked() {
        return this.checked;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3105w)) {
            return false;
        }
        C3105w c3105w = (C3105w) other;
        return this.checked == c3105w.checked && this.enabled == c3105w.enabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.enabled) + (Boolean.hashCode(this.checked) * 31);
    }

    public String toString() {
        return AbstractC30802r.m94762k("GallerySwitchState(checked=", ", enabled=", ")", this.checked, this.enabled);
    }
}
