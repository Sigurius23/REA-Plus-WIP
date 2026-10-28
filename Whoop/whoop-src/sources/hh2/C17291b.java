package hh2;

import eh2.EnumC13196a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hh2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lhh2/b;", "", "Leh2/a;", "type", "", "isEnabled", "<init>", "(Leh2/a;Z)V", "a", "(Leh2/a;Z)Lhh2/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Leh2/a;", "c", "()Leh2/a;", "b", "Z", "d", "()Z", "stealth-mode_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17291b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC13196a type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isEnabled;

    public C17291b(EnumC13196a type, boolean z4) {
        AbstractC22676k.m65750j(type, "type");
        this.type = type;
        this.isEnabled = z4;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C17291b m48972b(C17291b c17291b, EnumC13196a enumC13196a, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            enumC13196a = c17291b.type;
        }
        if ((i13 & 2) != 0) {
            z4 = c17291b.isEnabled;
        }
        return c17291b.m48973a(enumC13196a, z4);
    }

    /* JADX INFO: renamed from: a */
    public final C17291b m48973a(EnumC13196a type, boolean isEnabled) {
        AbstractC22676k.m65750j(type, "type");
        return new C17291b(type, isEnabled);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC13196a getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17291b)) {
            return false;
        }
        C17291b c17291b = (C17291b) other;
        return this.type == c17291b.type && this.isEnabled == c17291b.isEnabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isEnabled) + (this.type.hashCode() * 31);
    }

    public String toString() {
        return "HiddenMetricViewState(type=" + this.type + ", isEnabled=" + this.isEnabled + ")";
    }
}
