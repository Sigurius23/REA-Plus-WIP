package c41;

import com.whoop.design.util.TextResource;
import i91.AbstractC18247a;
import jh3.AbstractC21702c;
import l83.C23454a0;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: c41.x */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\t\n\u0006B\u0013\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Lc41/x;", "", "", "clickable", "<init>", "(Z)V", "a", "Z", "()Z", "b", "c", "Lc41/x$a;", "Lc41/x$b;", "Lc41/x$c;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4145x {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean clickable;

    /* JADX INFO: renamed from: c41.x$c */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lc41/x$c;", "Lc41/x;", "Lcom/whoop/design/util/TextResource;", "startTime", "endTime", "Ly81/f;", "rangeColor", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "c", "Ly81/f;", "()Ly81/f;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC4145x {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource startTime;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource endTime;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final EnumC39333f rangeColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(TextResource startTime, TextResource endTime, EnumC39333f rangeColor) {
            super(false, 1, null);
            AbstractC22676k.m65750j(startTime, "startTime");
            AbstractC22676k.m65750j(endTime, "endTime");
            AbstractC22676k.m65750j(rangeColor, "rangeColor");
            this.startTime = startTime;
            this.endTime = endTime;
            this.rangeColor = rangeColor;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getEndTime() {
            return this.endTime;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final EnumC39333f getRangeColor() {
            return this.rangeColor;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextResource getStartTime() {
            return this.startTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.startTime, cVar.startTime) && AbstractC22676k.m65745e(this.endTime, cVar.endTime) && this.rangeColor == cVar.rangeColor;
        }

        public int hashCode() {
            return this.rangeColor.hashCode() + AbstractC31061c.m95625a(this.startTime.hashCode() * 31, this.endTime, 31);
        }

        public String toString() {
            TextResource textResource = this.startTime;
            TextResource textResource2 = this.endTime;
            return AbstractC21702c.m61138i(AbstractC33745d.m106658q("TimeRange(startTime=", textResource, ", endTime=", textResource2, ", rangeColor="), this.rangeColor, ")");
        }
    }

    public /* synthetic */ AbstractC4145x(boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getClickable() {
        return this.clickable;
    }

    private AbstractC4145x(boolean z4) {
        this.clickable = z4;
    }

    /* JADX INFO: renamed from: c41.x$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lc41/x$b;", "Lc41/x;", "Lcom/whoop/design/util/TextResource;", "text", "", "isClickable", "<init>", "(Lcom/whoop/design/util/TextResource;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "c", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC4145x {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource text;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean isClickable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(TextResource text, boolean z4) {
            super(z4, null);
            AbstractC22676k.m65750j(text, "text");
            this.text = text;
            this.isClickable = z4;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getText() {
            return this.text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.text, bVar.text) && this.isClickable == bVar.isClickable;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isClickable) + (this.text.hashCode() * 31);
        }

        public String toString() {
            return "Text(text=" + this.text + ", isClickable=" + this.isClickable + ")";
        }

        public /* synthetic */ b(TextResource textResource, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(textResource, (i13 & 2) != 0 ? true : z4);
        }
    }

    public /* synthetic */ AbstractC4145x(boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? true : z4, null);
    }

    /* JADX INFO: renamed from: c41.x$a */
    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b\t\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u0017\u0010%¨\u0006&"}, m65681d2 = {"Lc41/x$a;", "Lc41/x;", "Lcom/whoop/design/util/TextResource;", "text", "", "clickEvent", "Lc41/i;", "buttonType", "", "isTileClickable", "Li91/a;", "background", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/Object;Lc41/i;ZLi91/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "c", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "Lc41/i;", "()Lc41/i;", "Z", "()Z", "f", "Li91/a;", "()Li91/a;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC4145x {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource text;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Object clickEvent;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final EnumC4040i buttonType;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean isTileClickable;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final AbstractC18247a background;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TextResource text, Object clickEvent, EnumC4040i buttonType, boolean z4, AbstractC18247a abstractC18247a) {
            super(z4, null);
            AbstractC22676k.m65750j(text, "text");
            AbstractC22676k.m65750j(clickEvent, "clickEvent");
            AbstractC22676k.m65750j(buttonType, "buttonType");
            this.text = text;
            this.clickEvent = clickEvent;
            this.buttonType = buttonType;
            this.isTileClickable = z4;
            this.background = abstractC18247a;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final AbstractC18247a getBackground() {
            return this.background;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final EnumC4040i getButtonType() {
            return this.buttonType;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Object getClickEvent() {
            return this.clickEvent;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final TextResource getText() {
            return this.text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.text, aVar.text) && AbstractC22676k.m65745e(this.clickEvent, aVar.clickEvent) && this.buttonType == aVar.buttonType && this.isTileClickable == aVar.isTileClickable && AbstractC22676k.m65745e(this.background, aVar.background);
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b((this.buttonType.hashCode() + AbstractC33745d.m106644c(this.text.hashCode() * 31, 31, this.clickEvent)) * 31, 31, this.isTileClickable);
            AbstractC18247a abstractC18247a = this.background;
            return iM8289b + (abstractC18247a == null ? 0 : abstractC18247a.hashCode());
        }

        public String toString() {
            return "Button(text=" + this.text + ", clickEvent=" + this.clickEvent + ", buttonType=" + this.buttonType + ", isTileClickable=" + this.isTileClickable + ", background=" + this.background + ")";
        }

        public /* synthetic */ a(TextResource textResource, Object obj, EnumC4040i enumC4040i, boolean z4, AbstractC18247a abstractC18247a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(textResource, (i13 & 2) != 0 ? C23454a0.f92919a : obj, enumC4040i, (i13 & 8) != 0 ? false : z4, (i13 & 16) != 0 ? null : abstractC18247a);
        }
    }
}
