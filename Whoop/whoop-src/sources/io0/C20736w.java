package io0;

import java.util.Map;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: io0.w */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\t\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lio0/w;", "", "", "", "entries", "", "checkboxSelected", "<init>", "(Ljava/util/Map;Ljava/lang/Boolean;)V", "a", "(Ljava/util/Map;Ljava/lang/Boolean;)Lio0/w;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "b", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C20736w {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Map<String, String> entries;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Boolean checkboxSelected;

    public C20736w(Map<String, String> entries, Boolean bool) {
        AbstractC22676k.m65750j(entries, "entries");
        this.entries = entries;
        this.checkboxSelected = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C20736w m57037b(C20736w c20736w, Map map, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            map = c20736w.entries;
        }
        if ((i13 & 2) != 0) {
            bool = c20736w.checkboxSelected;
        }
        return c20736w.m57038a(map, bool);
    }

    /* JADX INFO: renamed from: a */
    public final C20736w m57038a(Map<String, String> entries, Boolean checkboxSelected) {
        AbstractC22676k.m65750j(entries, "entries");
        return new C20736w(entries, checkboxSelected);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getCheckboxSelected() {
        return this.checkboxSelected;
    }

    /* JADX INFO: renamed from: d */
    public final Map<String, String> m57040d() {
        return this.entries;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20736w)) {
            return false;
        }
        C20736w c20736w = (C20736w) other;
        return AbstractC22676k.m65745e(this.entries, c20736w.entries) && AbstractC22676k.m65745e(this.checkboxSelected, c20736w.checkboxSelected);
    }

    public int hashCode() {
        int iHashCode = this.entries.hashCode() * 31;
        Boolean bool = this.checkboxSelected;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        return "TextEntryResponseBody(entries=" + this.entries + ", checkboxSelected=" + this.checkboxSelected + ")";
    }

    public /* synthetic */ C20736w(Map map, Boolean bool, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25272z.f99163w : map, (i13 & 2) != 0 ? null : bool);
    }
}
