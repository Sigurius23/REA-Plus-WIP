package n42;

import j02.EnumC21171u0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: n42.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Ln42/f;", "", "Lj02/u0;", "mode", "<init>", "(Lj02/u0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lj02/u0;", "()Lj02/u0;", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26282f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC21171u0 mode;

    public C26282f(EnumC21171u0 mode) {
        AbstractC22676k.m65750j(mode, "mode");
        this.mode = mode;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC21171u0 getMode() {
        return this.mode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C26282f) && this.mode == ((C26282f) other).mode;
    }

    public int hashCode() {
        return this.mode.hashCode();
    }

    public String toString() {
        return "PrivacyConsentScreenArgs(mode=" + this.mode + ")";
    }

    public /* synthetic */ C26282f(EnumC21171u0 enumC21171u0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? EnumC21171u0.FULL : enumC21171u0);
    }
}
