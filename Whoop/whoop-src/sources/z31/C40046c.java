package z31;

import com.whoop.navigation.models.GenericInteraction;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: z31.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, m65681d2 = {"Lz31/c;", "", "Lz31/b;", "type", "", "title", "Lz31/a;", "style", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "<init>", "(Lz31/b;Ljava/lang/String;Lz31/a;Lcom/whoop/navigation/models/GenericInteraction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lz31/b;", "getType", "()Lz31/b;", "b", "Ljava/lang/String;", "getTitle", "c", "Lz31/a;", "getStyle", "()Lz31/a;", "d", "Lcom/whoop/navigation/models/GenericInteraction;", "getInteraction", "()Lcom/whoop/navigation/models/GenericInteraction;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40046c {

    /* JADX INFO: renamed from: e */
    public static final int f172768e = GenericInteraction.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC40045b type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC40044a style;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final GenericInteraction interaction;

    public C40046c(EnumC40045b type, String title, EnumC40044a style, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(style, "style");
        this.type = type;
        this.title = title;
        this.style = style;
        this.interaction = genericInteraction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40046c)) {
            return false;
        }
        C40046c c40046c = (C40046c) other;
        return this.type == c40046c.type && AbstractC22676k.m65745e(this.title, c40046c.title) && this.style == c40046c.style && AbstractC22676k.m65745e(this.interaction, c40046c.interaction);
    }

    public int hashCode() {
        int iHashCode = (this.style.hashCode() + AbstractC11266d.m30450d(this.type.hashCode() * 31, 31, this.title)) * 31;
        GenericInteraction genericInteraction = this.interaction;
        return iHashCode + (genericInteraction == null ? 0 : genericInteraction.hashCode());
    }

    public String toString() {
        return "TargetRecommendationFooterButtonViewState(type=" + this.type + ", title=" + this.title + ", style=" + this.style + ", interaction=" + this.interaction + ")";
    }
}
