package so1;

import com.whoop.design.util.TextResource;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.JournalToggleType;
import jh3.AbstractC21702c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: so1.t */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u001b\u0010 ¨\u0006!"}, m65681d2 = {"Lso1/t;", "", "Lcom/whoop/design/util/TextResource;", "toggleDisplay", "Ly81/f;", "selectedStyle", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;", "type", "", "toggled", "<init>", "(Lcom/whoop/design/util/TextResource;Ly81/f;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "Ly81/f;", "()Ly81/f;", "c", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;", "d", "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;", "Z", "()Z", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32836t {

    /* JADX INFO: renamed from: e */
    public static final int f136820e = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource toggleDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC39333f selectedStyle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final JournalToggleType type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean toggled;

    public C32836t(TextResource toggleDisplay, EnumC39333f selectedStyle, JournalToggleType type, boolean z4) {
        AbstractC22676k.m65750j(toggleDisplay, "toggleDisplay");
        AbstractC22676k.m65750j(selectedStyle, "selectedStyle");
        AbstractC22676k.m65750j(type, "type");
        this.toggleDisplay = toggleDisplay;
        this.selectedStyle = selectedStyle;
        this.type = type;
        this.toggled = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC39333f getSelectedStyle() {
        return this.selectedStyle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getToggleDisplay() {
        return this.toggleDisplay;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getToggled() {
        return this.toggled;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final JournalToggleType getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32836t)) {
            return false;
        }
        C32836t c32836t = (C32836t) other;
        return AbstractC22676k.m65745e(this.toggleDisplay, c32836t.toggleDisplay) && this.selectedStyle == c32836t.selectedStyle && this.type == c32836t.type && this.toggled == c32836t.toggled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.toggled) + ((this.type.hashCode() + AbstractC21702c.m61132c(this.selectedStyle, this.toggleDisplay.hashCode() * 31, 31)) * 31);
    }

    public String toString() {
        return "LogPeriodToggleViewState(toggleDisplay=" + this.toggleDisplay + ", selectedStyle=" + this.selectedStyle + ", type=" + this.type + ", toggled=" + this.toggled + ")";
    }
}
