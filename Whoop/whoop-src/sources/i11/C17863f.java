package i11;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.models.GenericInteraction;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p291l0.AbstractC22977m;
import p291l0.InterfaceC22965i;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: i11.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J|\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b,\u0010(R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010*\u001a\u0004\b-\u0010\u0017R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b,\u0010/\u001a\u0004\b2\u00101R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b-\u0010/\u001a\u0004\b3\u00101R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b.\u00105¨\u00066"}, m65681d2 = {"Li11/f;", "Lm91/u;", "Ll0/i;", "arrangement", "Lcom/whoop/design/util/TextResource;", "text", "", "backButtonEnabled", "", "backDate", "forwardButtonEnabled", "forwardDate", "Lcom/whoop/navigation/models/GenericInteraction;", "previousInteraction", "nextInteraction", "labelInteraction", "Li11/g;", "dateStrip", "<init>", "(Ll0/i;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;ZLjava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Li11/g;)V", "a", "(Ll0/i;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;ZLjava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Li11/g;)Li11/f;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ll0/i;", "c", "()Ll0/i;", "b", "Lcom/whoop/design/util/TextResource;", "m", "()Lcom/whoop/design/util/TextResource;", "Z", "e", "()Z", "d", "Ljava/lang/String;", "f", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "g", "Lcom/whoop/navigation/models/GenericInteraction;", "l", "()Lcom/whoop/navigation/models/GenericInteraction;", "k", "j", "Li11/g;", "()Li11/g;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17863f implements InterfaceC25312u {

    /* JADX INFO: renamed from: k */
    public static final int f69516k = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC22965i arrangement;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource text;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean backButtonEnabled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String backDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean forwardButtonEnabled;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String forwardDate;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final GenericInteraction previousInteraction;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final GenericInteraction nextInteraction;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final GenericInteraction labelInteraction;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C17864g dateStrip;

    public C17863f(InterfaceC22965i interfaceC22965i, TextResource textResource, boolean z4, String str, boolean z13, String str2, GenericInteraction genericInteraction, GenericInteraction genericInteraction2, GenericInteraction genericInteraction3, C17864g c17864g, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC22977m.f90656g : interfaceC22965i, textResource, z4, str, z13, str2, (i13 & 64) != 0 ? null : genericInteraction, (i13 & 128) != 0 ? null : genericInteraction2, (i13 & 256) != 0 ? null : genericInteraction3, (i13 & 512) != 0 ? null : c17864g);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C17863f m51362b(C17863f c17863f, InterfaceC22965i interfaceC22965i, TextResource textResource, boolean z4, String str, boolean z13, String str2, GenericInteraction genericInteraction, GenericInteraction genericInteraction2, GenericInteraction genericInteraction3, C17864g c17864g, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC22965i = c17863f.arrangement;
        }
        if ((i13 & 2) != 0) {
            textResource = c17863f.text;
        }
        if ((i13 & 4) != 0) {
            z4 = c17863f.backButtonEnabled;
        }
        if ((i13 & 8) != 0) {
            str = c17863f.backDate;
        }
        if ((i13 & 16) != 0) {
            z13 = c17863f.forwardButtonEnabled;
        }
        if ((i13 & 32) != 0) {
            str2 = c17863f.forwardDate;
        }
        if ((i13 & 64) != 0) {
            genericInteraction = c17863f.previousInteraction;
        }
        if ((i13 & 128) != 0) {
            genericInteraction2 = c17863f.nextInteraction;
        }
        if ((i13 & 256) != 0) {
            genericInteraction3 = c17863f.labelInteraction;
        }
        if ((i13 & 512) != 0) {
            c17864g = c17863f.dateStrip;
        }
        GenericInteraction genericInteraction4 = genericInteraction3;
        C17864g c17864g2 = c17864g;
        GenericInteraction genericInteraction5 = genericInteraction;
        GenericInteraction genericInteraction6 = genericInteraction2;
        boolean z14 = z13;
        String str3 = str2;
        return c17863f.m51363a(interfaceC22965i, textResource, z4, str, z14, str3, genericInteraction5, genericInteraction6, genericInteraction4, c17864g2);
    }

    /* JADX INFO: renamed from: a */
    public final C17863f m51363a(InterfaceC22965i arrangement, TextResource text, boolean backButtonEnabled, String backDate, boolean forwardButtonEnabled, String forwardDate, GenericInteraction previousInteraction, GenericInteraction nextInteraction, GenericInteraction labelInteraction, C17864g dateStrip) {
        AbstractC22676k.m65750j(arrangement, "arrangement");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(backDate, "backDate");
        AbstractC22676k.m65750j(forwardDate, "forwardDate");
        return new C17863f(arrangement, text, backButtonEnabled, backDate, forwardButtonEnabled, forwardDate, previousInteraction, nextInteraction, labelInteraction, dateStrip);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC22965i getArrangement() {
        return this.arrangement;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getBackButtonEnabled() {
        return this.backButtonEnabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17863f)) {
            return false;
        }
        C17863f c17863f = (C17863f) other;
        return AbstractC22676k.m65745e(this.arrangement, c17863f.arrangement) && AbstractC22676k.m65745e(this.text, c17863f.text) && this.backButtonEnabled == c17863f.backButtonEnabled && AbstractC22676k.m65745e(this.backDate, c17863f.backDate) && this.forwardButtonEnabled == c17863f.forwardButtonEnabled && AbstractC22676k.m65745e(this.forwardDate, c17863f.forwardDate) && AbstractC22676k.m65745e(this.previousInteraction, c17863f.previousInteraction) && AbstractC22676k.m65745e(this.nextInteraction, c17863f.nextInteraction) && AbstractC22676k.m65745e(this.labelInteraction, c17863f.labelInteraction) && AbstractC22676k.m65745e(this.dateStrip, c17863f.dateStrip);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getBackDate() {
        return this.backDate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C17864g getDateStrip() {
        return this.dateStrip;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getForwardButtonEnabled() {
        return this.forwardButtonEnabled;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC31061c.m95625a(this.arrangement.hashCode() * 31, this.text, 31), 31, this.backButtonEnabled), 31, this.backDate), 31, this.forwardButtonEnabled), 31, this.forwardDate);
        GenericInteraction genericInteraction = this.previousInteraction;
        int iHashCode = (iM30450d + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
        GenericInteraction genericInteraction2 = this.nextInteraction;
        int iHashCode2 = (iHashCode + (genericInteraction2 == null ? 0 : genericInteraction2.hashCode())) * 31;
        GenericInteraction genericInteraction3 = this.labelInteraction;
        int iHashCode3 = (iHashCode2 + (genericInteraction3 == null ? 0 : genericInteraction3.hashCode())) * 31;
        C17864g c17864g = this.dateStrip;
        return iHashCode3 + (c17864g != null ? c17864g.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getForwardDate() {
        return this.forwardDate;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final GenericInteraction getLabelInteraction() {
        return this.labelInteraction;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final GenericInteraction getNextInteraction() {
        return this.nextInteraction;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final GenericInteraction getPreviousInteraction() {
        return this.previousInteraction;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final TextResource getText() {
        return this.text;
    }

    public String toString() {
        InterfaceC22965i interfaceC22965i = this.arrangement;
        TextResource textResource = this.text;
        boolean z4 = this.backButtonEnabled;
        String str = this.backDate;
        boolean z13 = this.forwardButtonEnabled;
        String str2 = this.forwardDate;
        GenericInteraction genericInteraction = this.previousInteraction;
        GenericInteraction genericInteraction2 = this.nextInteraction;
        GenericInteraction genericInteraction3 = this.labelInteraction;
        C17864g c17864g = this.dateStrip;
        StringBuilder sb4 = new StringBuilder("DateSelectorState(arrangement=");
        sb4.append(interfaceC22965i);
        sb4.append(", text=");
        sb4.append(textResource);
        sb4.append(", backButtonEnabled=");
        AbstractC38963t7.m124391u(sb4, z4, ", backDate=", str, ", forwardButtonEnabled=");
        AbstractC38963t7.m124391u(sb4, z13, ", forwardDate=", str2, ", previousInteraction=");
        sb4.append(genericInteraction);
        sb4.append(", nextInteraction=");
        sb4.append(genericInteraction2);
        sb4.append(", labelInteraction=");
        sb4.append(genericInteraction3);
        sb4.append(", dateStrip=");
        sb4.append(c17864g);
        sb4.append(")");
        return sb4.toString();
    }

    public C17863f(InterfaceC22965i arrangement, TextResource text, boolean z4, String backDate, boolean z13, String forwardDate, GenericInteraction genericInteraction, GenericInteraction genericInteraction2, GenericInteraction genericInteraction3, C17864g c17864g) {
        AbstractC22676k.m65750j(arrangement, "arrangement");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(backDate, "backDate");
        AbstractC22676k.m65750j(forwardDate, "forwardDate");
        this.arrangement = arrangement;
        this.text = text;
        this.backButtonEnabled = z4;
        this.backDate = backDate;
        this.forwardButtonEnabled = z13;
        this.forwardDate = forwardDate;
        this.previousInteraction = genericInteraction;
        this.nextInteraction = genericInteraction2;
        this.labelInteraction = genericInteraction3;
        this.dateStrip = c17864g;
    }
}
