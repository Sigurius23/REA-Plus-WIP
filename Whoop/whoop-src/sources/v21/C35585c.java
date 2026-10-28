package v21;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.InterfaceC39332e;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: v21.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b\u001c\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010%\u001a\u0004\b\u0018\u0010&¨\u0006'"}, m65681d2 = {"Lv21/c;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "description", "ctaText", "Lcom/whoop/navigation/e;", "destination", "Ly81/e;", "foregroundColor", "backgroundColor", "", "actionArgument", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ly81/e;Ly81/e;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", "c", "Lcom/whoop/navigation/e;", "f", "()Lcom/whoop/navigation/e;", "d", "Ly81/e;", "g", "()Ly81/e;", "Ljava/lang/Object;", "()Ljava/lang/Object;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35585c implements InterfaceC25312u {

    /* JADX INFO: renamed from: g */
    public static final int f151331g = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource description;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource ctaText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC39332e foregroundColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC39332e backgroundColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Object actionArgument;

    public C35585c(TextResource description, TextResource textResource, C9598e c9598e, InterfaceC39332e foregroundColor, InterfaceC39332e backgroundColor, Object obj) {
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(foregroundColor, "foregroundColor");
        AbstractC22676k.m65750j(backgroundColor, "backgroundColor");
        this.description = description;
        this.ctaText = textResource;
        this.destination = c9598e;
        this.foregroundColor = foregroundColor;
        this.backgroundColor = backgroundColor;
        this.actionArgument = obj;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Object getActionArgument() {
        return this.actionArgument;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC39332e getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getCtaText() {
        return this.ctaText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getDescription() {
        return this.description;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35585c)) {
            return false;
        }
        C35585c c35585c = (C35585c) other;
        return AbstractC22676k.m65745e(this.description, c35585c.description) && AbstractC22676k.m65745e(this.ctaText, c35585c.ctaText) && AbstractC22676k.m65745e(this.destination, c35585c.destination) && AbstractC22676k.m65745e(this.foregroundColor, c35585c.foregroundColor) && AbstractC22676k.m65745e(this.backgroundColor, c35585c.backgroundColor) && AbstractC22676k.m65745e(this.actionArgument, c35585c.actionArgument);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final InterfaceC39332e getForegroundColor() {
        return this.foregroundColor;
    }

    public int hashCode() {
        int iHashCode = this.description.hashCode() * 31;
        TextResource textResource = this.ctaText;
        int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iM106648g = AbstractC33745d.m106648g(this.backgroundColor, AbstractC33745d.m106648g(this.foregroundColor, (iHashCode2 + (c9598e == null ? 0 : c9598e.hashCode())) * 31, 31), 31);
        Object obj = this.actionArgument;
        return iM106648g + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.description;
        TextResource textResource2 = this.ctaText;
        C9598e c9598e = this.destination;
        InterfaceC39332e interfaceC39332e = this.foregroundColor;
        InterfaceC39332e interfaceC39332e2 = this.backgroundColor;
        Object obj = this.actionArgument;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("MiniCalloutViewState(description=", textResource, ", ctaText=", textResource2, ", destination=");
        sbM106658q.append(c9598e);
        sbM106658q.append(", foregroundColor=");
        sbM106658q.append(interfaceC39332e);
        sbM106658q.append(", backgroundColor=");
        sbM106658q.append(interfaceC39332e2);
        sbM106658q.append(", actionArgument=");
        sbM106658q.append(obj);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }

    public /* synthetic */ C35585c(TextResource textResource, TextResource textResource2, C9598e c9598e, InterfaceC39332e interfaceC39332e, InterfaceC39332e interfaceC39332e2, Object obj, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, (i13 & 2) != 0 ? null : textResource2, (i13 & 4) != 0 ? null : c9598e, interfaceC39332e, interfaceC39332e2, (i13 & 32) != 0 ? null : obj);
    }
}
