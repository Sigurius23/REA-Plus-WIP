package ik1;

import c51.C4242s;
import com.whoop.design.models.items.DateSelectorModel;
import com.whoop.healthspan.domain.models.FeaturedHighlight;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: ik1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0084\u0001\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u0005\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n8\u0006¢\u0006\f\n\u0004\b\"\u0010.\u001a\u0004\b1\u00100R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u0010%\u001a\u0004\b3\u0010&R\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010%\u001a\u0004\b2\u0010&R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b/\u00105\u001a\u0004\b-\u00106R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u0010%\u001a\u0004\b4\u0010&¨\u00068"}, m65681d2 = {"Lik1/d;", "", "Lcom/whoop/design/models/items/DateSelectorModel;", "datePicker", "", "isCalibrating", "Lc51/s;", "amoeba", "Lik1/a;", "amoebaHeader", "", "Lm91/u;", "items", "Lcom/whoop/healthspan/domain/models/FeaturedHighlight;", "featuredHighlights", "hasBeenSeenByUser", "hasOnboarded", "Lik1/c;", "amoebaOnboarding", "healthspanLabsIntroEnabled", "<init>", "(Lcom/whoop/design/models/items/DateSelectorModel;ZLc51/s;Lik1/a;Ljava/util/List;Ljava/util/List;ZZLik1/c;Z)V", "a", "(Lcom/whoop/design/models/items/DateSelectorModel;ZLc51/s;Lik1/a;Ljava/util/List;Ljava/util/List;ZZLik1/c;Z)Lik1/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/DateSelectorModel;", "f", "()Lcom/whoop/design/models/items/DateSelectorModel;", "b", "Z", "()Z", "c", "Lc51/s;", "()Lc51/s;", "d", "Lik1/a;", "()Lik1/a;", "e", "Ljava/util/List;", "i", "()Ljava/util/List;", "getFeaturedHighlights", "g", "getHasBeenSeenByUser", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lik1/c;", "()Lik1/c;", "j", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C18607d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final DateSelectorModel datePicker;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isCalibrating;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C4242s amoeba;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C18604a amoebaHeader;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<InterfaceC25312u> items;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<FeaturedHighlight> featuredHighlights;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean hasBeenSeenByUser;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean hasOnboarded;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C18606c amoebaOnboarding;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean healthspanLabsIntroEnabled;

    /* JADX WARN: Multi-variable type inference failed */
    public C18607d(DateSelectorModel dateSelectorModel, boolean z4, C4242s amoeba, C18604a amoebaHeader, List<? extends InterfaceC25312u> items, List<FeaturedHighlight> featuredHighlights, boolean z13, boolean z14, C18606c c18606c, boolean z15) {
        AbstractC22676k.m65750j(amoeba, "amoeba");
        AbstractC22676k.m65750j(amoebaHeader, "amoebaHeader");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(featuredHighlights, "featuredHighlights");
        this.datePicker = dateSelectorModel;
        this.isCalibrating = z4;
        this.amoeba = amoeba;
        this.amoebaHeader = amoebaHeader;
        this.items = items;
        this.featuredHighlights = featuredHighlights;
        this.hasBeenSeenByUser = z13;
        this.hasOnboarded = z14;
        this.amoebaOnboarding = c18606c;
        this.healthspanLabsIntroEnabled = z15;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C18607d m53839b(C18607d c18607d, DateSelectorModel dateSelectorModel, boolean z4, C4242s c4242s, C18604a c18604a, List list, List list2, boolean z13, boolean z14, C18606c c18606c, boolean z15, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            dateSelectorModel = c18607d.datePicker;
        }
        if ((i13 & 2) != 0) {
            z4 = c18607d.isCalibrating;
        }
        if ((i13 & 4) != 0) {
            c4242s = c18607d.amoeba;
        }
        if ((i13 & 8) != 0) {
            c18604a = c18607d.amoebaHeader;
        }
        if ((i13 & 16) != 0) {
            list = c18607d.items;
        }
        if ((i13 & 32) != 0) {
            list2 = c18607d.featuredHighlights;
        }
        if ((i13 & 64) != 0) {
            z13 = c18607d.hasBeenSeenByUser;
        }
        if ((i13 & 128) != 0) {
            z14 = c18607d.hasOnboarded;
        }
        if ((i13 & 256) != 0) {
            c18606c = c18607d.amoebaOnboarding;
        }
        if ((i13 & 512) != 0) {
            z15 = c18607d.healthspanLabsIntroEnabled;
        }
        C18606c c18606c2 = c18606c;
        boolean z16 = z15;
        boolean z17 = z13;
        boolean z18 = z14;
        List list3 = list;
        List list4 = list2;
        return c18607d.m53840a(dateSelectorModel, z4, c4242s, c18604a, list3, list4, z17, z18, c18606c2, z16);
    }

    /* JADX INFO: renamed from: a */
    public final C18607d m53840a(DateSelectorModel datePicker, boolean isCalibrating, C4242s amoeba, C18604a amoebaHeader, List<? extends InterfaceC25312u> items, List<FeaturedHighlight> featuredHighlights, boolean hasBeenSeenByUser, boolean hasOnboarded, C18606c amoebaOnboarding, boolean healthspanLabsIntroEnabled) {
        AbstractC22676k.m65750j(amoeba, "amoeba");
        AbstractC22676k.m65750j(amoebaHeader, "amoebaHeader");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(featuredHighlights, "featuredHighlights");
        return new C18607d(datePicker, isCalibrating, amoeba, amoebaHeader, items, featuredHighlights, hasBeenSeenByUser, hasOnboarded, amoebaOnboarding, healthspanLabsIntroEnabled);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C4242s getAmoeba() {
        return this.amoeba;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C18604a getAmoebaHeader() {
        return this.amoebaHeader;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C18606c getAmoebaOnboarding() {
        return this.amoebaOnboarding;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C18607d)) {
            return false;
        }
        C18607d c18607d = (C18607d) other;
        return AbstractC22676k.m65745e(this.datePicker, c18607d.datePicker) && this.isCalibrating == c18607d.isCalibrating && AbstractC22676k.m65745e(this.amoeba, c18607d.amoeba) && AbstractC22676k.m65745e(this.amoebaHeader, c18607d.amoebaHeader) && AbstractC22676k.m65745e(this.items, c18607d.items) && AbstractC22676k.m65745e(this.featuredHighlights, c18607d.featuredHighlights) && this.hasBeenSeenByUser == c18607d.hasBeenSeenByUser && this.hasOnboarded == c18607d.hasOnboarded && AbstractC22676k.m65745e(this.amoebaOnboarding, c18607d.amoebaOnboarding) && this.healthspanLabsIntroEnabled == c18607d.healthspanLabsIntroEnabled;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final DateSelectorModel getDatePicker() {
        return this.datePicker;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getHasOnboarded() {
        return this.hasOnboarded;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getHealthspanLabsIntroEnabled() {
        return this.healthspanLabsIntroEnabled;
    }

    public int hashCode() {
        DateSelectorModel dateSelectorModel = this.datePicker;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11895b.m31983b(AbstractC11895b.m31983b((this.amoebaHeader.hashCode() + ((this.amoeba.hashCode() + AbstractC2875y.m8289b((dateSelectorModel == null ? 0 : dateSelectorModel.hashCode()) * 31, 31, this.isCalibrating)) * 31)) * 31, 31, this.items), 31, this.featuredHighlights), 31, this.hasBeenSeenByUser), 31, this.hasOnboarded);
        C18606c c18606c = this.amoebaOnboarding;
        return Boolean.hashCode(this.healthspanLabsIntroEnabled) + ((iM8289b + (c18606c != null ? c18606c.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i */
    public final List<InterfaceC25312u> m53847i() {
        return this.items;
    }

    public String toString() {
        DateSelectorModel dateSelectorModel = this.datePicker;
        boolean z4 = this.isCalibrating;
        C4242s c4242s = this.amoeba;
        C18604a c18604a = this.amoebaHeader;
        List<InterfaceC25312u> list = this.items;
        List<FeaturedHighlight> list2 = this.featuredHighlights;
        boolean z13 = this.hasBeenSeenByUser;
        boolean z14 = this.hasOnboarded;
        C18606c c18606c = this.amoebaOnboarding;
        boolean z15 = this.healthspanLabsIntroEnabled;
        StringBuilder sb4 = new StringBuilder("Content(datePicker=");
        sb4.append(dateSelectorModel);
        sb4.append(", isCalibrating=");
        sb4.append(z4);
        sb4.append(", amoeba=");
        sb4.append(c4242s);
        sb4.append(", amoebaHeader=");
        sb4.append(c18604a);
        sb4.append(", items=");
        AbstractC21702c.m61148s(sb4, list, ", featuredHighlights=", list2, ", hasBeenSeenByUser=");
        AbstractC38963t7.m124392v(sb4, z13, ", hasOnboarded=", z14, ", amoebaOnboarding=");
        sb4.append(c18606c);
        sb4.append(", healthspanLabsIntroEnabled=");
        sb4.append(z15);
        sb4.append(")");
        return sb4.toString();
    }
}
