package w11;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import f41.C14063a;
import hy0.C17791u;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd1.AbstractC22403o;
import p01.C28582b;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: w11.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b0\u00102\u001a\u0004\b(\u00103R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b)\u00104\u001a\u0004\b.\u00105R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b&\u00106\u001a\u0004\b \u00107R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\"\u00108\u001a\u0004\b$\u00109R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010\u0019¨\u0006="}, m65681d2 = {"Lw11/c;", "Lm91/u;", "", "isAccomplished", "Lcom/whoop/design/util/TextResource;", "title", "subText", "", "goalDays", "Lkd1/o;", "image", "", "Lhy0/u;", "days", "Lcom/whoop/navigation/e;", "destination", "Lf41/a;", "bottomSheetInfo", "Lp01/b;", "circularProgress", "", "id", "<init>", "(ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/e;Lf41/a;Lp01/b;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "i", "()Z", "b", "Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/design/util/TextResource;", "c", "g", "d", "Ljava/lang/Integer;", "getGoalDays", "()Ljava/lang/Integer;", "e", "Lkd1/o;", "f", "()Lkd1/o;", "Ljava/util/List;", "()Ljava/util/List;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "Lf41/a;", "()Lf41/a;", "Lp01/b;", "()Lp01/b;", "j", "Ljava/lang/String;", "getId", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36696c implements InterfaceC25312u {

    /* JADX INFO: renamed from: k */
    public static final int f157143k = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isAccomplished;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource subText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Integer goalDays;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<C17791u> days;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C14063a bottomSheetInfo;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C28582b circularProgress;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final String id;

    public C36696c(boolean z4, TextResource title, TextResource subText, Integer num, AbstractC22403o abstractC22403o, List<C17791u> days, C9598e c9598e, C14063a c14063a, C28582b c28582b, String str) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subText, "subText");
        AbstractC22676k.m65750j(days, "days");
        this.isAccomplished = z4;
        this.title = title;
        this.subText = subText;
        this.goalDays = num;
        this.image = abstractC22403o;
        this.days = days;
        this.destination = c9598e;
        this.bottomSheetInfo = c14063a;
        this.circularProgress = c28582b;
        this.id = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C14063a getBottomSheetInfo() {
        return this.bottomSheetInfo;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C28582b getCircularProgress() {
        return this.circularProgress;
    }

    /* JADX INFO: renamed from: c */
    public final List<C17791u> m117796c() {
        return this.days;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36696c)) {
            return false;
        }
        C36696c c36696c = (C36696c) other;
        return this.isAccomplished == c36696c.isAccomplished && AbstractC22676k.m65745e(this.title, c36696c.title) && AbstractC22676k.m65745e(this.subText, c36696c.subText) && AbstractC22676k.m65745e(this.goalDays, c36696c.goalDays) && AbstractC22676k.m65745e(this.image, c36696c.image) && AbstractC22676k.m65745e(this.days, c36696c.days) && AbstractC22676k.m65745e(this.destination, c36696c.destination) && AbstractC22676k.m65745e(this.bottomSheetInfo, c36696c.bottomSheetInfo) && AbstractC22676k.m65745e(this.circularProgress, c36696c.circularProgress) && AbstractC22676k.m65745e(this.id, c36696c.id);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getSubText() {
        return this.subText;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(Boolean.hashCode(this.isAccomplished) * 31, this.title, 31), this.subText, 31);
        Integer num = this.goalDays;
        int iHashCode = (iM95625a + (num == null ? 0 : num.hashCode())) * 31;
        AbstractC22403o abstractC22403o = this.image;
        int iM31983b = AbstractC11895b.m31983b((iHashCode + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31, 31, this.days);
        C9598e c9598e = this.destination;
        int iHashCode2 = (iM31983b + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        C14063a c14063a = this.bottomSheetInfo;
        int iHashCode3 = (iHashCode2 + (c14063a == null ? 0 : c14063a.hashCode())) * 31;
        C28582b c28582b = this.circularProgress;
        int iHashCode4 = (iHashCode3 + (c28582b == null ? 0 : c28582b.hashCode())) * 31;
        String str = this.id;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsAccomplished() {
        return this.isAccomplished;
    }

    public String toString() {
        return "GoalTileState(isAccomplished=" + this.isAccomplished + ", title=" + this.title + ", subText=" + this.subText + ", goalDays=" + this.goalDays + ", image=" + this.image + ", days=" + this.days + ", destination=" + this.destination + ", bottomSheetInfo=" + this.bottomSheetInfo + ", circularProgress=" + this.circularProgress + ", id=" + this.id + ")";
    }

    public /* synthetic */ C36696c(boolean z4, TextResource textResource, TextResource textResource2, Integer num, AbstractC22403o abstractC22403o, List list, C9598e c9598e, C14063a c14063a, C28582b c28582b, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4, textResource, textResource2, num, abstractC22403o, list, c9598e, (i13 & 128) != 0 ? null : c14063a, (i13 & 256) != 0 ? null : c28582b, (i13 & 512) != 0 ? null : str);
    }
}
