package ah0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: ah0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJN\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b\u001f\u0010\u000f¨\u0006 "}, m65681d2 = {"Lah0/f;", "", "", "optionId", "label", "value", "", "selected", "isUserInput", "userInputText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)Lah0/f;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "c", "g", "Z", "e", "()Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "f", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C0885f {

    /* JADX INFO: renamed from: g */
    public static final int f3215g = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String optionId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String label;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String value;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean selected;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isUserInput;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String userInputText;

    public C0885f(String optionId, String label, String value, boolean z4, boolean z13, String str) {
        AbstractC22676k.m65750j(optionId, "optionId");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(value, "value");
        this.optionId = optionId;
        this.label = label;
        this.value = value;
        this.selected = z4;
        this.isUserInput = z13;
        this.userInputText = str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C0885f m2146b(C0885f c0885f, String str, String str2, String str3, boolean z4, boolean z13, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c0885f.optionId;
        }
        if ((i13 & 2) != 0) {
            str2 = c0885f.label;
        }
        if ((i13 & 4) != 0) {
            str3 = c0885f.value;
        }
        if ((i13 & 8) != 0) {
            z4 = c0885f.selected;
        }
        if ((i13 & 16) != 0) {
            z13 = c0885f.isUserInput;
        }
        if ((i13 & 32) != 0) {
            str4 = c0885f.userInputText;
        }
        boolean z14 = z13;
        String str5 = str4;
        return c0885f.m2147a(str, str2, str3, z4, z14, str5);
    }

    /* JADX INFO: renamed from: a */
    public final C0885f m2147a(String optionId, String label, String value, boolean selected, boolean isUserInput, String userInputText) {
        AbstractC22676k.m65750j(optionId, "optionId");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(value, "value");
        return new C0885f(optionId, label, value, selected, isUserInput, userInputText);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getOptionId() {
        return this.optionId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C0885f)) {
            return false;
        }
        C0885f c0885f = (C0885f) other;
        return AbstractC22676k.m65745e(this.optionId, c0885f.optionId) && AbstractC22676k.m65745e(this.label, c0885f.label) && AbstractC22676k.m65745e(this.value, c0885f.value) && this.selected == c0885f.selected && this.isUserInput == c0885f.isUserInput && AbstractC22676k.m65745e(this.userInputText, c0885f.userInputText);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getUserInputText() {
        return this.userInputText;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsUserInput() {
        return this.isUserInput;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.optionId.hashCode() * 31, 31, this.label), 31, this.value), 31, this.selected), 31, this.isUserInput);
        String str = this.userInputText;
        return iM8289b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.optionId;
        String str2 = this.label;
        String str3 = this.value;
        boolean z4 = this.selected;
        boolean z13 = this.isUserInput;
        String str4 = this.userInputText;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("FormOption(optionId=", str, ", label=", str2, ", value=");
        AbstractC38963t7.m124390t(sbM32001t, str3, ", selected=", z4, ", isUserInput=");
        return AbstractC21702c.m61139j(sbM32001t, z13, ", userInputText=", str4, ")");
    }

    public /* synthetic */ C0885f(String str, String str2, String str3, boolean z4, boolean z13, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, z4, (i13 & 16) != 0 ? false : z13, (i13 & 32) != 0 ? null : str4);
    }
}
