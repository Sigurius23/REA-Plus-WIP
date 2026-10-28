package o12;

import com.whoop.educationModels.FeatureEducationDto;
import java.util.ArrayList;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import sw0.C33050g;

/* JADX INFO: renamed from: o12.h */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJL\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010&\u001a\u0004\b\u001f\u0010'¨\u0006("}, m65681d2 = {"Lo12/h;", "", "Lo12/b;", "domainState", "", "pageNumber", "Lcom/whoop/educationModels/FeatureEducationDto;", "story", "", "", "selectedCustomBehaviors", "Lsw0/g;", "customizeBottomSheetDomainState", "<init>", "(Lo12/b;ILcom/whoop/educationModels/FeatureEducationDto;Ljava/util/List;Lsw0/g;)V", "a", "(Lo12/b;ILcom/whoop/educationModels/FeatureEducationDto;Ljava/util/List;Lsw0/g;)Lo12/h;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lo12/b;", "d", "()Lo12/b;", "b", "I", "e", "c", "Lcom/whoop/educationModels/FeatureEducationDto;", "g", "()Lcom/whoop/educationModels/FeatureEducationDto;", "Ljava/util/List;", "f", "()Ljava/util/List;", "Lsw0/g;", "()Lsw0/g;", "onboarding-story_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27421h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC27415b domainState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int pageNumber;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final FeatureEducationDto story;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<String> selectedCustomBehaviors;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C33050g customizeBottomSheetDomainState;

    public C27421h(AbstractC27415b domainState, int i13, FeatureEducationDto featureEducationDto, List<String> selectedCustomBehaviors, C33050g c33050g) {
        AbstractC22676k.m65750j(domainState, "domainState");
        AbstractC22676k.m65750j(selectedCustomBehaviors, "selectedCustomBehaviors");
        this.domainState = domainState;
        this.pageNumber = i13;
        this.story = featureEducationDto;
        this.selectedCustomBehaviors = selectedCustomBehaviors;
        this.customizeBottomSheetDomainState = c33050g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C27421h m82840b(C27421h c27421h, AbstractC27415b abstractC27415b, int i13, FeatureEducationDto featureEducationDto, List list, C33050g c33050g, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            abstractC27415b = c27421h.domainState;
        }
        if ((i14 & 2) != 0) {
            i13 = c27421h.pageNumber;
        }
        if ((i14 & 4) != 0) {
            featureEducationDto = c27421h.story;
        }
        if ((i14 & 8) != 0) {
            list = c27421h.selectedCustomBehaviors;
        }
        if ((i14 & 16) != 0) {
            c33050g = c27421h.customizeBottomSheetDomainState;
        }
        C33050g c33050g2 = c33050g;
        FeatureEducationDto featureEducationDto2 = featureEducationDto;
        return c27421h.m82841a(abstractC27415b, i13, featureEducationDto2, list, c33050g2);
    }

    /* JADX INFO: renamed from: a */
    public final C27421h m82841a(AbstractC27415b domainState, int pageNumber, FeatureEducationDto story, List<String> selectedCustomBehaviors, C33050g customizeBottomSheetDomainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        AbstractC22676k.m65750j(selectedCustomBehaviors, "selectedCustomBehaviors");
        return new C27421h(domainState, pageNumber, story, selectedCustomBehaviors, customizeBottomSheetDomainState);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C33050g getCustomizeBottomSheetDomainState() {
        return this.customizeBottomSheetDomainState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final AbstractC27415b getDomainState() {
        return this.domainState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getPageNumber() {
        return this.pageNumber;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27421h)) {
            return false;
        }
        C27421h c27421h = (C27421h) other;
        return AbstractC22676k.m65745e(this.domainState, c27421h.domainState) && this.pageNumber == c27421h.pageNumber && AbstractC22676k.m65745e(this.story, c27421h.story) && AbstractC22676k.m65745e(this.selectedCustomBehaviors, c27421h.selectedCustomBehaviors) && AbstractC22676k.m65745e(this.customizeBottomSheetDomainState, c27421h.customizeBottomSheetDomainState);
    }

    /* JADX INFO: renamed from: f */
    public final List<String> m82845f() {
        return this.selectedCustomBehaviors;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final FeatureEducationDto getStory() {
        return this.story;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.pageNumber, this.domainState.hashCode() * 31, 31);
        FeatureEducationDto featureEducationDto = this.story;
        int iM31983b = AbstractC11895b.m31983b((iM30448b + (featureEducationDto == null ? 0 : featureEducationDto.hashCode())) * 31, 31, this.selectedCustomBehaviors);
        C33050g c33050g = this.customizeBottomSheetDomainState;
        return iM31983b + (c33050g != null ? c33050g.hashCode() : 0);
    }

    public String toString() {
        return "StoryAccumulator(domainState=" + this.domainState + ", pageNumber=" + this.pageNumber + ", story=" + this.story + ", selectedCustomBehaviors=" + this.selectedCustomBehaviors + ", customizeBottomSheetDomainState=" + this.customizeBottomSheetDomainState + ")";
    }

    public /* synthetic */ C27421h(AbstractC27415b abstractC27415b, int i13, FeatureEducationDto featureEducationDto, List list, C33050g c33050g, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC27415b, (i14 & 2) != 0 ? 0 : i13, (i14 & 4) != 0 ? null : featureEducationDto, (i14 & 8) != 0 ? new ArrayList() : list, (i14 & 16) != 0 ? null : c33050g);
    }
}
