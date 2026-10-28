package sp0;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import org.joda.time.LocalDateTime;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: sp0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0015\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018¨\u0006\u001e"}, m65681d2 = {"Lsp0/d;", "", "Lcom/whoop/design/util/TextResource;", "formattedDateDisplay", "formattedTimeDisplay", "Lorg/joda/time/LocalDateTime;", "initialValue", "currentValue", "selectedTimeTitleDisplay", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "c", "Lorg/joda/time/LocalDateTime;", "d", "()Lorg/joda/time/LocalDateTime;", "e", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32864d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource formattedDateDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource formattedTimeDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final LocalDateTime initialValue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final LocalDateTime currentValue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource selectedTimeTitleDisplay;

    public C32864d(TextResource formattedDateDisplay, TextResource formattedTimeDisplay, LocalDateTime initialValue, LocalDateTime currentValue, TextResource selectedTimeTitleDisplay) {
        AbstractC22676k.m65750j(formattedDateDisplay, "formattedDateDisplay");
        AbstractC22676k.m65750j(formattedTimeDisplay, "formattedTimeDisplay");
        AbstractC22676k.m65750j(initialValue, "initialValue");
        AbstractC22676k.m65750j(currentValue, "currentValue");
        AbstractC22676k.m65750j(selectedTimeTitleDisplay, "selectedTimeTitleDisplay");
        this.formattedDateDisplay = formattedDateDisplay;
        this.formattedTimeDisplay = formattedTimeDisplay;
        this.initialValue = initialValue;
        this.currentValue = currentValue;
        this.selectedTimeTitleDisplay = selectedTimeTitleDisplay;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDateTime getCurrentValue() {
        return this.currentValue;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getFormattedDateDisplay() {
        return this.formattedDateDisplay;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getFormattedTimeDisplay() {
        return this.formattedTimeDisplay;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final LocalDateTime getInitialValue() {
        return this.initialValue;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getSelectedTimeTitleDisplay() {
        return this.selectedTimeTitleDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32864d)) {
            return false;
        }
        C32864d c32864d = (C32864d) other;
        return AbstractC22676k.m65745e(this.formattedDateDisplay, c32864d.formattedDateDisplay) && AbstractC22676k.m65745e(this.formattedTimeDisplay, c32864d.formattedTimeDisplay) && AbstractC22676k.m65745e(this.initialValue, c32864d.initialValue) && AbstractC22676k.m65745e(this.currentValue, c32864d.currentValue) && AbstractC22676k.m65745e(this.selectedTimeTitleDisplay, c32864d.selectedTimeTitleDisplay);
    }

    public int hashCode() {
        return this.selectedTimeTitleDisplay.hashCode() + ((this.currentValue.hashCode() + ((this.initialValue.hashCode() + AbstractC31061c.m95625a(this.formattedDateDisplay.hashCode() * 31, this.formattedTimeDisplay, 31)) * 31)) * 31);
    }

    public String toString() {
        TextResource textResource = this.formattedDateDisplay;
        TextResource textResource2 = this.formattedTimeDisplay;
        LocalDateTime localDateTime = this.initialValue;
        LocalDateTime localDateTime2 = this.currentValue;
        TextResource textResource3 = this.selectedTimeTitleDisplay;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("DateTimePickerState(formattedDateDisplay=", textResource, ", formattedTimeDisplay=", textResource2, ", initialValue=");
        sbM106658q.append(localDateTime);
        sbM106658q.append(", currentValue=");
        sbM106658q.append(localDateTime2);
        sbM106658q.append(", selectedTimeTitleDisplay=");
        return AbstractC30007c.m91841k(sbM106658q, textResource3, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C32864d(TextResource textResource, TextResource textResource2, LocalDateTime localDateTime, LocalDateTime localDateTime2, TextResource textResource3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        textResource = (i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource;
        textResource2 = (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource2;
        if ((i13 & 4) != 0) {
            localDateTime = LocalDateTime.now();
            AbstractC22676k.m65749i(localDateTime, "now(...)");
        }
        if ((i13 & 8) != 0) {
            localDateTime2 = LocalDateTime.now();
            AbstractC22676k.m65749i(localDateTime2, "now(...)");
        }
        this(textResource, textResource2, localDateTime, localDateTime2, (i13 & 16) != 0 ? AbstractC8693b.m21267a() : textResource3);
    }
}
