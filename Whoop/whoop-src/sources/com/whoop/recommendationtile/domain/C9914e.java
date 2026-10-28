package com.whoop.recommendationtile.domain;

import d13.AbstractC11478a;
import i31.C18052g;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.whoop.recommendationtile.domain.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lcom/whoop/recommendationtile/domain/e;", "", "Li31/g;", "header", "", "showCompletionError", "checkboxValueBeforeCompletion", "<init>", "(Li31/g;ZLjava/lang/Boolean;)V", "a", "(Li31/g;ZLjava/lang/Boolean;)Lcom/whoop/recommendationtile/domain/e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Li31/g;", "d", "()Li31/g;", "b", "Z", "e", "()Z", "c", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "recommendation-tile-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C9914e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C18052g header;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean showCompletionError;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Boolean checkboxValueBeforeCompletion;

    public C9914e(C18052g header, boolean z4, Boolean bool) {
        AbstractC22676k.m65750j(header, "header");
        this.header = header;
        this.showCompletionError = z4;
        this.checkboxValueBeforeCompletion = bool;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C9914e m24312b(C9914e c9914e, C18052g c18052g, boolean z4, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c18052g = c9914e.header;
        }
        if ((i13 & 2) != 0) {
            z4 = c9914e.showCompletionError;
        }
        if ((i13 & 4) != 0) {
            bool = c9914e.checkboxValueBeforeCompletion;
        }
        return c9914e.m24313a(c18052g, z4, bool);
    }

    /* JADX INFO: renamed from: a */
    public final C9914e m24313a(C18052g header, boolean showCompletionError, Boolean checkboxValueBeforeCompletion) {
        AbstractC22676k.m65750j(header, "header");
        return new C9914e(header, showCompletionError, checkboxValueBeforeCompletion);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getCheckboxValueBeforeCompletion() {
        return this.checkboxValueBeforeCompletion;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C18052g getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getShowCompletionError() {
        return this.showCompletionError;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C9914e)) {
            return false;
        }
        C9914e c9914e = (C9914e) other;
        return AbstractC22676k.m65745e(this.header, c9914e.header) && this.showCompletionError == c9914e.showCompletionError && AbstractC22676k.m65745e(this.checkboxValueBeforeCompletion, c9914e.checkboxValueBeforeCompletion);
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(this.header.hashCode() * 31, 31, this.showCompletionError);
        Boolean bool = this.checkboxValueBeforeCompletion;
        return iM8289b + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        C18052g c18052g = this.header;
        boolean z4 = this.showCompletionError;
        Boolean bool = this.checkboxValueBeforeCompletion;
        StringBuilder sb4 = new StringBuilder("RecommendationTileHeaderDomainState(header=");
        sb4.append(c18052g);
        sb4.append(", showCompletionError=");
        sb4.append(z4);
        sb4.append(", checkboxValueBeforeCompletion=");
        return AbstractC11478a.m30858j(sb4, bool, ")");
    }

    public /* synthetic */ C9914e(C18052g c18052g, boolean z4, Boolean bool, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c18052g, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? null : bool);
    }
}
