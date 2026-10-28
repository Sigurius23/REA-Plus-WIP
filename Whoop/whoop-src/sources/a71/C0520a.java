package a71;

import c41.C4092p2;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import hy0.C17750h1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import n21.C26191e;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.AbstractC2875y;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: a71.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010%R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b,\u0010%R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b.\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b/\u00101R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b.\u00102\u001a\u0004\b3\u0010\u001bR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b4\u00106R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b,\u00107\u001a\u0004\b*\u00108R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b(\u00109\u001a\u0004\b-\u0010:R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b+\u0010;\u001a\u0004\b&\u0010<R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b\"\u0010?¨\u0006@"}, m65681d2 = {"La71/a;", "", "Lcom/whoop/design/util/TextResource;", "primaryContextualDisplay", "", "value", "valueDisplay", "unitDisplay", "secondaryContextualDisplay", "Ly81/e;", "scrubberColor", "", "dataContext", "", "skip", "Lhy0/h1;", "phaseTag", "La71/c;", "sageScrubberDetails", "", "Ln21/e;", "legendStates", "Lc41/p2;", "infoCalloutTile", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/lang/Float;", "j", "()Ljava/lang/Float;", "c", "k", "i", "e", "g", "f", "Ly81/e;", "()Ly81/e;", "Ljava/lang/String;", "getDataContext", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Z", "()Z", "Lhy0/h1;", "()Lhy0/h1;", "La71/c;", "()La71/c;", "Ljava/util/List;", "()Ljava/util/List;", "l", "Lc41/p2;", "()Lc41/p2;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C0520a {

    /* JADX INFO: renamed from: m */
    public static final int f1767m = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource primaryContextualDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Float value;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource valueDisplay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource unitDisplay;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource secondaryContextualDisplay;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC39332e scrubberColor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String dataContext;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean skip;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C17750h1 phaseTag;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C0522c sageScrubberDetails;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final List<C26191e> legendStates;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C4092p2 infoCalloutTile;

    /* JADX INFO: renamed from: a71.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f1780w = new a();

        /* JADX INFO: renamed from: a */
        public final long m1232a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m1232a((C39336i) obj));
        }
    }

    public C0520a(TextResource primaryContextualDisplay, Float f13, TextResource valueDisplay, TextResource unitDisplay, TextResource secondaryContextualDisplay, InterfaceC39332e scrubberColor, String str, boolean z4, C17750h1 c17750h1, C0522c c0522c, List<C26191e> list, C4092p2 c4092p2) {
        AbstractC22676k.m65750j(primaryContextualDisplay, "primaryContextualDisplay");
        AbstractC22676k.m65750j(valueDisplay, "valueDisplay");
        AbstractC22676k.m65750j(unitDisplay, "unitDisplay");
        AbstractC22676k.m65750j(secondaryContextualDisplay, "secondaryContextualDisplay");
        AbstractC22676k.m65750j(scrubberColor, "scrubberColor");
        this.primaryContextualDisplay = primaryContextualDisplay;
        this.value = f13;
        this.valueDisplay = valueDisplay;
        this.unitDisplay = unitDisplay;
        this.secondaryContextualDisplay = secondaryContextualDisplay;
        this.scrubberColor = scrubberColor;
        this.dataContext = str;
        this.skip = z4;
        this.phaseTag = c17750h1;
        this.sageScrubberDetails = c0522c;
        this.legendStates = list;
        this.infoCalloutTile = c4092p2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C4092p2 getInfoCalloutTile() {
        return this.infoCalloutTile;
    }

    /* JADX INFO: renamed from: b */
    public final List<C26191e> m1222b() {
        return this.legendStates;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C17750h1 getPhaseTag() {
        return this.phaseTag;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getPrimaryContextualDisplay() {
        return this.primaryContextualDisplay;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C0522c getSageScrubberDetails() {
        return this.sageScrubberDetails;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C0520a)) {
            return false;
        }
        C0520a c0520a = (C0520a) other;
        return AbstractC22676k.m65745e(this.primaryContextualDisplay, c0520a.primaryContextualDisplay) && AbstractC22676k.m65745e(this.value, c0520a.value) && AbstractC22676k.m65745e(this.valueDisplay, c0520a.valueDisplay) && AbstractC22676k.m65745e(this.unitDisplay, c0520a.unitDisplay) && AbstractC22676k.m65745e(this.secondaryContextualDisplay, c0520a.secondaryContextualDisplay) && AbstractC22676k.m65745e(this.scrubberColor, c0520a.scrubberColor) && AbstractC22676k.m65745e(this.dataContext, c0520a.dataContext) && this.skip == c0520a.skip && AbstractC22676k.m65745e(this.phaseTag, c0520a.phaseTag) && AbstractC22676k.m65745e(this.sageScrubberDetails, c0520a.sageScrubberDetails) && AbstractC22676k.m65745e(this.legendStates, c0520a.legendStates) && AbstractC22676k.m65745e(this.infoCalloutTile, c0520a.infoCalloutTile);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final InterfaceC39332e getScrubberColor() {
        return this.scrubberColor;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getSecondaryContextualDisplay() {
        return this.secondaryContextualDisplay;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getSkip() {
        return this.skip;
    }

    public int hashCode() {
        int iHashCode = this.primaryContextualDisplay.hashCode() * 31;
        Float f13 = this.value;
        int iM106648g = AbstractC33745d.m106648g(this.scrubberColor, AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a((iHashCode + (f13 == null ? 0 : f13.hashCode())) * 31, this.valueDisplay, 31), this.unitDisplay, 31), this.secondaryContextualDisplay, 31), 31);
        String str = this.dataContext;
        int iM8289b = AbstractC2875y.m8289b((iM106648g + (str == null ? 0 : str.hashCode())) * 31, 31, this.skip);
        C17750h1 c17750h1 = this.phaseTag;
        int iHashCode2 = (iM8289b + (c17750h1 == null ? 0 : c17750h1.hashCode())) * 31;
        C0522c c0522c = this.sageScrubberDetails;
        int iHashCode3 = (iHashCode2 + (c0522c == null ? 0 : c0522c.hashCode())) * 31;
        List<C26191e> list = this.legendStates;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        C4092p2 c4092p2 = this.infoCalloutTile;
        return iHashCode4 + (c4092p2 != null ? c4092p2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getUnitDisplay() {
        return this.unitDisplay;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Float getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final TextResource getValueDisplay() {
        return this.valueDisplay;
    }

    public String toString() {
        TextResource textResource = this.primaryContextualDisplay;
        Float f13 = this.value;
        TextResource textResource2 = this.valueDisplay;
        TextResource textResource3 = this.unitDisplay;
        TextResource textResource4 = this.secondaryContextualDisplay;
        InterfaceC39332e interfaceC39332e = this.scrubberColor;
        String str = this.dataContext;
        boolean z4 = this.skip;
        C17750h1 c17750h1 = this.phaseTag;
        C0522c c0522c = this.sageScrubberDetails;
        List<C26191e> list = this.legendStates;
        C4092p2 c4092p2 = this.infoCalloutTile;
        StringBuilder sb4 = new StringBuilder("DataScrubberDetailsState(primaryContextualDisplay=");
        sb4.append(textResource);
        sb4.append(", value=");
        sb4.append(f13);
        sb4.append(", valueDisplay=");
        AbstractC30007c.m91855y(sb4, textResource2, ", unitDisplay=", textResource3, ", secondaryContextualDisplay=");
        sb4.append(textResource4);
        sb4.append(", scrubberColor=");
        sb4.append(interfaceC39332e);
        sb4.append(", dataContext=");
        AbstractC38963t7.m124390t(sb4, str, ", skip=", z4, ", phaseTag=");
        sb4.append(c17750h1);
        sb4.append(", sageScrubberDetails=");
        sb4.append(c0522c);
        sb4.append(", legendStates=");
        sb4.append(list);
        sb4.append(", infoCalloutTile=");
        sb4.append(c4092p2);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C0520a(TextResource textResource, Float f13, TextResource textResource2, TextResource textResource3, TextResource textResource4, InterfaceC39332e interfaceC39332e, String str, boolean z4, C17750h1 c17750h1, C0522c c0522c, List list, C4092p2 c4092p2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? null : f13, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 8) != 0 ? AbstractC8693b.m21267a() : textResource3, (i13 & 16) != 0 ? AbstractC8693b.m21267a() : textResource4, (i13 & 32) != 0 ? p745y81.Function1.m125323a(a.f1780w) : interfaceC39332e, (i13 & 64) != 0 ? null : str, (i13 & 128) != 0 ? false : z4, (i13 & 256) != 0 ? null : c17750h1, (i13 & 512) != 0 ? null : c0522c, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : list, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : c4092p2);
    }
}
