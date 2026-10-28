package hv1;

import com.whoop.design.util.TextResource;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: hv1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0013\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lhv1/a;", "", "Lcom/whoop/design/util/TextResource;", "text", "", "isEnabled", "Lhv1/b;", "dialogState", "<init>", "(Lcom/whoop/design/util/TextResource;ZLhv1/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "Z", "c", "()Z", "Lhv1/b;", "()Lhv1/b;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17671a {

    /* JADX INFO: renamed from: d */
    public static final int f68535d = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isEnabled;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C17672b dialogState;

    public C17671a(TextResource text, boolean z4, C17672b dialogState) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(dialogState, "dialogState");
        this.text = text;
        this.isEnabled = z4;
        this.dialogState = dialogState;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C17672b getDialogState() {
        return this.dialogState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17671a)) {
            return false;
        }
        C17671a c17671a = (C17671a) other;
        return AbstractC22676k.m65745e(this.text, c17671a.text) && this.isEnabled == c17671a.isEnabled && AbstractC22676k.m65745e(this.dialogState, c17671a.dialogState);
    }

    public int hashCode() {
        return this.dialogState.hashCode() + AbstractC2875y.m8289b(this.text.hashCode() * 31, 31, this.isEnabled);
    }

    public String toString() {
        TextResource textResource = this.text;
        boolean z4 = this.isEnabled;
        C17672b c17672b = this.dialogState;
        StringBuilder sbM91846p = AbstractC30007c.m91846p("BottomSheetButtonState(text=", textResource, ", isEnabled=", z4, ", dialogState=");
        sbM91846p.append(c17672b);
        sbM91846p.append(")");
        return sbM91846p.toString();
    }
}
