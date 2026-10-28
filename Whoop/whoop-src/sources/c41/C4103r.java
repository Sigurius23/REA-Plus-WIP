package c41;

import com.whoop.design.models.ActivityTileSelectionState;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.service.network.model.cycles.Period;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: c41.r */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0015\u0010\u0016J\u009c\u0001\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b*\u0010/\u001a\u0004\b'\u0010\u001aR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b-\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b&\u0010/\u001a\u0004\b7\u0010\u001aR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b8\u0010/\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b7\u00109\u001a\u0004\b8\u0010:R\u0017\u0010\u0013\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b(\u00100\u001a\u0004\b;\u00102R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b#\u0010/\u001a\u0004\b3\u0010\u001a¨\u0006<"}, m65681d2 = {"Lc41/r;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "scoreDisplay", "startTimeText", "endTimeText", "Lkd1/o;", "icon", "", "activityV2Id", "", "isGpsEnabled", "Lcom/whoop/service/network/model/cycles/Period;", "during", "startTimeIso", "endTimeIso", "Lcom/whoop/design/models/ActivityTileSelectionState;", "selectableState", "isSelected", "internalName", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/lang/String;ZLcom/whoop/service/network/model/cycles/Period;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ActivityTileSelectionState;ZLjava/lang/String;)V", "a", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/lang/String;ZLcom/whoop/service/network/model/cycles/Period;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ActivityTileSelectionState;ZLjava/lang/String;)Lc41/r;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "m", "()Lcom/whoop/design/util/TextResource;", "b", "i", "c", "l", "d", "f", "e", "Lkd1/o;", "g", "()Lkd1/o;", "Ljava/lang/String;", "Z", "n", "()Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lcom/whoop/service/network/model/cycles/Period;", "getDuring", "()Lcom/whoop/service/network/model/cycles/Period;", "k", "j", "Lcom/whoop/design/models/ActivityTileSelectionState;", "()Lcom/whoop/design/models/ActivityTileSelectionState;", "o", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4103r implements InterfaceC25312u {

    /* JADX INFO: renamed from: n */
    public static final int f16646n = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource scoreDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource startTimeText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource endTimeText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC22403o icon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String activityV2Id;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean isGpsEnabled;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Period during;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String startTimeIso;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final String endTimeIso;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final ActivityTileSelectionState selectableState;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final boolean isSelected;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final String internalName;

    public C4103r(TextResource title, TextResource scoreDisplay, TextResource startTimeText, TextResource endTimeText, AbstractC22403o abstractC22403o, String activityV2Id, boolean z4, Period period, String str, String str2, ActivityTileSelectionState selectableState, boolean z13, String str3) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(scoreDisplay, "scoreDisplay");
        AbstractC22676k.m65750j(startTimeText, "startTimeText");
        AbstractC22676k.m65750j(endTimeText, "endTimeText");
        AbstractC22676k.m65750j(activityV2Id, "activityV2Id");
        AbstractC22676k.m65750j(selectableState, "selectableState");
        this.title = title;
        this.scoreDisplay = scoreDisplay;
        this.startTimeText = startTimeText;
        this.endTimeText = endTimeText;
        this.icon = abstractC22403o;
        this.activityV2Id = activityV2Id;
        this.isGpsEnabled = z4;
        this.during = period;
        this.startTimeIso = str;
        this.endTimeIso = str2;
        this.selectableState = selectableState;
        this.isSelected = z13;
        this.internalName = str3;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C4103r m12622b(C4103r c4103r, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, AbstractC22403o abstractC22403o, String str, boolean z4, Period period, String str2, String str3, ActivityTileSelectionState activityTileSelectionState, boolean z13, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = c4103r.title;
        }
        return c4103r.m12623a(textResource, (i13 & 2) != 0 ? c4103r.scoreDisplay : textResource2, (i13 & 4) != 0 ? c4103r.startTimeText : textResource3, (i13 & 8) != 0 ? c4103r.endTimeText : textResource4, (i13 & 16) != 0 ? c4103r.icon : abstractC22403o, (i13 & 32) != 0 ? c4103r.activityV2Id : str, (i13 & 64) != 0 ? c4103r.isGpsEnabled : z4, (i13 & 128) != 0 ? c4103r.during : period, (i13 & 256) != 0 ? c4103r.startTimeIso : str2, (i13 & 512) != 0 ? c4103r.endTimeIso : str3, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c4103r.selectableState : activityTileSelectionState, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c4103r.isSelected : z13, (i13 & 4096) != 0 ? c4103r.internalName : str4);
    }

    /* JADX INFO: renamed from: a */
    public final C4103r m12623a(TextResource title, TextResource scoreDisplay, TextResource startTimeText, TextResource endTimeText, AbstractC22403o icon, String activityV2Id, boolean isGpsEnabled, Period during, String startTimeIso, String endTimeIso, ActivityTileSelectionState selectableState, boolean isSelected, String internalName) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(scoreDisplay, "scoreDisplay");
        AbstractC22676k.m65750j(startTimeText, "startTimeText");
        AbstractC22676k.m65750j(endTimeText, "endTimeText");
        AbstractC22676k.m65750j(activityV2Id, "activityV2Id");
        AbstractC22676k.m65750j(selectableState, "selectableState");
        return new C4103r(title, scoreDisplay, startTimeText, endTimeText, icon, activityV2Id, isGpsEnabled, during, startTimeIso, endTimeIso, selectableState, isSelected, internalName);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getActivityV2Id() {
        return this.activityV2Id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getEndTimeIso() {
        return this.endTimeIso;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4103r)) {
            return false;
        }
        C4103r c4103r = (C4103r) other;
        return AbstractC22676k.m65745e(this.title, c4103r.title) && AbstractC22676k.m65745e(this.scoreDisplay, c4103r.scoreDisplay) && AbstractC22676k.m65745e(this.startTimeText, c4103r.startTimeText) && AbstractC22676k.m65745e(this.endTimeText, c4103r.endTimeText) && AbstractC22676k.m65745e(this.icon, c4103r.icon) && AbstractC22676k.m65745e(this.activityV2Id, c4103r.activityV2Id) && this.isGpsEnabled == c4103r.isGpsEnabled && AbstractC22676k.m65745e(this.during, c4103r.during) && AbstractC22676k.m65745e(this.startTimeIso, c4103r.startTimeIso) && AbstractC22676k.m65745e(this.endTimeIso, c4103r.endTimeIso) && this.selectableState == c4103r.selectableState && this.isSelected == c4103r.isSelected && AbstractC22676k.m65745e(this.internalName, c4103r.internalName);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getEndTimeText() {
        return this.endTimeText;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final AbstractC22403o getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getInternalName() {
        return this.internalName;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.title.hashCode() * 31, this.scoreDisplay, 31), this.startTimeText, 31), this.endTimeText, 31);
        AbstractC22403o abstractC22403o = this.icon;
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30450d((iM95625a + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31, 31, this.activityV2Id), 31, this.isGpsEnabled);
        Period period = this.during;
        int iHashCode = (iM8289b + (period == null ? 0 : period.hashCode())) * 31;
        String str = this.startTimeIso;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.endTimeIso;
        int iM8289b2 = AbstractC2875y.m8289b((this.selectableState.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.isSelected);
        String str3 = this.internalName;
        return iM8289b2 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getScoreDisplay() {
        return this.scoreDisplay;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final ActivityTileSelectionState getSelectableState() {
        return this.selectableState;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getStartTimeIso() {
        return this.startTimeIso;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final TextResource getStartTimeText() {
        return this.startTimeText;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getIsGpsEnabled() {
        return this.isGpsEnabled;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.scoreDisplay;
        TextResource textResource3 = this.startTimeText;
        TextResource textResource4 = this.endTimeText;
        AbstractC22403o abstractC22403o = this.icon;
        String str = this.activityV2Id;
        boolean z4 = this.isGpsEnabled;
        Period period = this.during;
        String str2 = this.startTimeIso;
        String str3 = this.endTimeIso;
        ActivityTileSelectionState activityTileSelectionState = this.selectableState;
        boolean z13 = this.isSelected;
        String str4 = this.internalName;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("ActivityTileSelectionItemState(title=", textResource, ", scoreDisplay=", textResource2, ", startTimeText=");
        AbstractC30007c.m91855y(sbM106658q, textResource3, ", endTimeText=", textResource4, ", icon=");
        sbM106658q.append(abstractC22403o);
        sbM106658q.append(", activityV2Id=");
        sbM106658q.append(str);
        sbM106658q.append(", isGpsEnabled=");
        sbM106658q.append(z4);
        sbM106658q.append(", during=");
        sbM106658q.append(period);
        sbM106658q.append(", startTimeIso=");
        AbstractC11266d.m30444B(sbM106658q, str2, ", endTimeIso=", str3, ", selectableState=");
        sbM106658q.append(activityTileSelectionState);
        sbM106658q.append(", isSelected=");
        sbM106658q.append(z13);
        sbM106658q.append(", internalName=");
        return AbstractC25012a.m73376i(str4, ")", sbM106658q);
    }

    public /* synthetic */ C4103r(TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, AbstractC22403o abstractC22403o, String str, boolean z4, Period period, String str2, String str3, ActivityTileSelectionState activityTileSelectionState, boolean z13, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource3, (i13 & 8) != 0 ? AbstractC8693b.m21267a() : textResource4, (i13 & 16) != 0 ? null : abstractC22403o, (i13 & 32) != 0 ? "" : str, (i13 & 64) != 0 ? false : z4, (i13 & 128) != 0 ? null : period, (i13 & 256) != 0 ? null : str2, (i13 & 512) != 0 ? null : str3, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? ActivityTileSelectionState.NOT_SELECTABLE : activityTileSelectionState, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0 ? z13 : false, (i13 & 4096) != 0 ? null : str4);
    }
}
