package x21;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import e93.AbstractC12889b;
import i93.C18284j;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: x21.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001\u0015B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001b\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018¨\u0006!"}, m65681d2 = {"Lx21/a;", "", "Lcom/whoop/design/util/TextResource;", "textResource", "", "currentValue", "minimumValue", "maximumValue", "", "isButtonEnabled", "trailingText", "<init>", "(Lcom/whoop/design/util/TextResource;IIIZLcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "b", "I", "c", "e", "Z", "f", "()Z", "g", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37858a {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h */
    public static final int f162062h = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource textResource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int currentValue;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int minimumValue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int maximumValue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isButtonEnabled;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource trailingText;

    /* JADX INFO: renamed from: x21.a$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u000e\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lx21/a$a;", "", "<init>", "()V", "Lcom/whoop/design/util/TextResource;", "textResource", "", "currentValue", "minimumValue", "maximumValue", "", "isButtonEnabled", "trailingText", "Lx21/a;", "a", "(Lcom/whoop/design/util/TextResource;IIIZLcom/whoop/design/util/TextResource;)Lx21/a;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C37858a m121387a(TextResource textResource, int currentValue, int minimumValue, int maximumValue, boolean isButtonEnabled, TextResource trailingText) {
            AbstractC22676k.m65750j(trailingText, "trailingText");
            return new C37858a(textResource, AbstractC12889b.m36285o(currentValue, minimumValue <= maximumValue ? new C18284j(minimumValue, maximumValue, 1) : new C18284j(0, 0, 1)), minimumValue, maximumValue, isButtonEnabled, trailingText);
        }

        private Companion() {
        }
    }

    public C37858a(TextResource textResource, int i13, int i14, int i15, boolean z4, TextResource trailingText) {
        AbstractC22676k.m65750j(trailingText, "trailingText");
        this.textResource = textResource;
        this.currentValue = i13;
        this.minimumValue = i14;
        this.maximumValue = i15;
        this.isButtonEnabled = z4;
        this.trailingText = trailingText;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCurrentValue() {
        return this.currentValue;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getMaximumValue() {
        return this.maximumValue;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getMinimumValue() {
        return this.minimumValue;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getTextResource() {
        return this.textResource;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getTrailingText() {
        return this.trailingText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37858a)) {
            return false;
        }
        C37858a c37858a = (C37858a) other;
        return AbstractC22676k.m65745e(this.textResource, c37858a.textResource) && this.currentValue == c37858a.currentValue && this.minimumValue == c37858a.minimumValue && this.maximumValue == c37858a.maximumValue && this.isButtonEnabled == c37858a.isButtonEnabled && AbstractC22676k.m65745e(this.trailingText, c37858a.trailingText);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsButtonEnabled() {
        return this.isButtonEnabled;
    }

    public int hashCode() {
        TextResource textResource = this.textResource;
        return this.trailingText.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.maximumValue, AbstractC11266d.m30448b(this.minimumValue, AbstractC11266d.m30448b(this.currentValue, (textResource == null ? 0 : textResource.hashCode()) * 31, 31), 31), 31), 31, this.isButtonEnabled);
    }

    public String toString() {
        TextResource textResource = this.textResource;
        int i13 = this.currentValue;
        int i14 = this.minimumValue;
        int i15 = this.maximumValue;
        boolean z4 = this.isButtonEnabled;
        TextResource textResource2 = this.trailingText;
        StringBuilder sb4 = new StringBuilder("NumberPickerState(textResource=");
        sb4.append(textResource);
        sb4.append(", currentValue=");
        sb4.append(i13);
        sb4.append(", minimumValue=");
        AbstractC30802r.m94773v(sb4, i14, ", maximumValue=", i15, ", isButtonEnabled=");
        sb4.append(z4);
        sb4.append(", trailingText=");
        sb4.append(textResource2);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C37858a(TextResource textResource, int i13, int i14, int i15, boolean z4, TextResource textResource2, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, i13, i14, i15, z4, (i16 & 32) != 0 ? AbstractC8693b.m21267a() : textResource2);
    }
}
