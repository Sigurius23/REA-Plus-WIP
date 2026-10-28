package ej1;

import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import hy0.EnumC17727b2;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ej1.z */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001d\u0010\"¨\u0006#"}, m65681d2 = {"Lej1/z;", "", "Lcom/whoop/design/util/TextResource;", "description", "Lej1/g0;", "feature", "Lgz0/m0;", "icon", "Lhy0/b2;", "style", "<init>", "(Lcom/whoop/design/util/TextResource;Lej1/g0;Lgz0/m0;Lhy0/b2;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "b", "Lej1/g0;", "getFeature", "()Lej1/g0;", "c", "Lgz0/m0;", "()Lgz0/m0;", "d", "Lhy0/b2;", "()Lhy0/b2;", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C13263z {

    /* JADX INFO: renamed from: e */
    public static final int f45921e = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource description;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC13241g0 feature;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC17727b2 style;

    public C13263z(TextResource description, EnumC13241g0 feature, EnumC16313m0 icon, EnumC17727b2 style) {
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(feature, "feature");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(style, "style");
        this.description = description;
        this.feature = feature;
        this.icon = icon;
        this.style = style;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC17727b2 getStyle() {
        return this.style;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C13263z)) {
            return false;
        }
        C13263z c13263z = (C13263z) other;
        return AbstractC22676k.m65745e(this.description, c13263z.description) && this.feature == c13263z.feature && this.icon == c13263z.icon && this.style == c13263z.style;
    }

    public int hashCode() {
        return this.style.hashCode() + AbstractC17176i.m48500b(this.icon, (this.feature.hashCode() + (this.description.hashCode() * 31)) * 31, 31);
    }

    public String toString() {
        return "HeartScreenerStatusViewState(description=" + this.description + ", feature=" + this.feature + ", icon=" + this.icon + ", style=" + this.style + ")";
    }
}
