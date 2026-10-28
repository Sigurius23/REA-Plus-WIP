package w71;

import com.whoop.navigation.C9598e;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p01.C28582b;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import v41.EnumC35665f0;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: w71.y */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014Jx\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b \u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b$\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010(\u001a\u0004\b+\u0010*R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b%\u00100\u001a\u0004\b,\u00101R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b'\u00104R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b.\u00105\u001a\u0004\b2\u00106¨\u00067"}, m65681d2 = {"Lw71/y;", "Lm91/u;", "", "id", "", "bottomSheetTitle", "question", "context", "", "isSubQuestion", "isEnabled", "Lw71/f0;", "type", "Lp01/b;", "indicatorItemState", "Lcom/whoop/navigation/e;", "destination", "Lv41/f0;", "sectionItemSurface", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLw71/f0;Lp01/b;Lcom/whoop/navigation/e;Lv41/f0;)V", "a", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLw71/f0;Lp01/b;Lcom/whoop/navigation/e;Lv41/f0;)Lw71/y;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "f", "b", "Ljava/lang/String;", "getBottomSheetTitle", "c", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "d", "e", "Z", "l", "()Z", "k", "g", "Lw71/f0;", "j", "()Lw71/f0;", "Lp01/b;", "()Lp01/b;", "i", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "Lv41/f0;", "()Lv41/f0;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36906y implements InterfaceC25312u {

    /* JADX INFO: renamed from: k */
    public static final int f157885k = C9598e.f28134d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String bottomSheetTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String question;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String context;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isSubQuestion;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean isEnabled;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final AbstractC36882f0 type;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C28582b indicatorItemState;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final EnumC35665f0 sectionItemSurface;

    public C36906y(int i13, String bottomSheetTitle, String question, String context, boolean z4, boolean z13, AbstractC36882f0 type, C28582b c28582b, C9598e c9598e, EnumC35665f0 sectionItemSurface) {
        AbstractC22676k.m65750j(bottomSheetTitle, "bottomSheetTitle");
        AbstractC22676k.m65750j(question, "question");
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(sectionItemSurface, "sectionItemSurface");
        this.id = i13;
        this.bottomSheetTitle = bottomSheetTitle;
        this.question = question;
        this.context = context;
        this.isSubQuestion = z4;
        this.isEnabled = z13;
        this.type = type;
        this.indicatorItemState = c28582b;
        this.destination = c9598e;
        this.sectionItemSurface = sectionItemSurface;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C36906y m118507b(C36906y c36906y, int i13, String str, String str2, String str3, boolean z4, boolean z13, AbstractC36882f0 abstractC36882f0, C28582b c28582b, C9598e c9598e, EnumC35665f0 enumC35665f0, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = c36906y.id;
        }
        if ((i14 & 2) != 0) {
            str = c36906y.bottomSheetTitle;
        }
        if ((i14 & 4) != 0) {
            str2 = c36906y.question;
        }
        if ((i14 & 8) != 0) {
            str3 = c36906y.context;
        }
        if ((i14 & 16) != 0) {
            z4 = c36906y.isSubQuestion;
        }
        if ((i14 & 32) != 0) {
            z13 = c36906y.isEnabled;
        }
        if ((i14 & 64) != 0) {
            abstractC36882f0 = c36906y.type;
        }
        if ((i14 & 128) != 0) {
            c28582b = c36906y.indicatorItemState;
        }
        if ((i14 & 256) != 0) {
            c9598e = c36906y.destination;
        }
        if ((i14 & 512) != 0) {
            enumC35665f0 = c36906y.sectionItemSurface;
        }
        C9598e c9598e2 = c9598e;
        EnumC35665f0 enumC35665f1 = enumC35665f0;
        AbstractC36882f0 abstractC36882f1 = abstractC36882f0;
        C28582b c28582b2 = c28582b;
        boolean z14 = z4;
        boolean z15 = z13;
        return c36906y.m118508a(i13, str, str2, str3, z14, z15, abstractC36882f1, c28582b2, c9598e2, enumC35665f1);
    }

    /* JADX INFO: renamed from: a */
    public final C36906y m118508a(int id4, String bottomSheetTitle, String question, String context, boolean isSubQuestion, boolean isEnabled, AbstractC36882f0 type, C28582b indicatorItemState, C9598e destination, EnumC35665f0 sectionItemSurface) {
        AbstractC22676k.m65750j(bottomSheetTitle, "bottomSheetTitle");
        AbstractC22676k.m65750j(question, "question");
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(sectionItemSurface, "sectionItemSurface");
        return new C36906y(id4, bottomSheetTitle, question, context, isSubQuestion, isEnabled, type, indicatorItemState, destination, sectionItemSurface);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36906y)) {
            return false;
        }
        C36906y c36906y = (C36906y) other;
        return this.id == c36906y.id && AbstractC22676k.m65745e(this.bottomSheetTitle, c36906y.bottomSheetTitle) && AbstractC22676k.m65745e(this.question, c36906y.question) && AbstractC22676k.m65745e(this.context, c36906y.context) && this.isSubQuestion == c36906y.isSubQuestion && this.isEnabled == c36906y.isEnabled && AbstractC22676k.m65745e(this.type, c36906y.type) && AbstractC22676k.m65745e(this.indicatorItemState, c36906y.indicatorItemState) && AbstractC22676k.m65745e(this.destination, c36906y.destination) && this.sectionItemSurface == c36906y.sectionItemSurface;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C28582b getIndicatorItemState() {
        return this.indicatorItemState;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getQuestion() {
        return this.question;
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(Integer.hashCode(this.id) * 31, 31, this.bottomSheetTitle), 31, this.question), 31, this.context), 31, this.isSubQuestion), 31, this.isEnabled)) * 31;
        C28582b c28582b = this.indicatorItemState;
        int iHashCode2 = (iHashCode + (c28582b == null ? 0 : c28582b.hashCode())) * 31;
        C9598e c9598e = this.destination;
        return this.sectionItemSurface.hashCode() + ((iHashCode2 + (c9598e != null ? c9598e.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final EnumC35665f0 getSectionItemSurface() {
        return this.sectionItemSurface;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final AbstractC36882f0 getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIsSubQuestion() {
        return this.isSubQuestion;
    }

    public String toString() {
        int i13 = this.id;
        String str = this.bottomSheetTitle;
        String str2 = this.question;
        String str3 = this.context;
        boolean z4 = this.isSubQuestion;
        boolean z13 = this.isEnabled;
        AbstractC36882f0 abstractC36882f0 = this.type;
        C28582b c28582b = this.indicatorItemState;
        C9598e c9598e = this.destination;
        EnumC35665f0 enumC35665f0 = this.sectionItemSurface;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "JournalQuestionState(id=", ", bottomSheetTitle=", str, ", question=");
        AbstractC11266d.m30444B(sbM53373n, str2, ", context=", str3, ", isSubQuestion=");
        AbstractC38963t7.m124392v(sbM53373n, z4, ", isEnabled=", z13, ", type=");
        sbM53373n.append(abstractC36882f0);
        sbM53373n.append(", indicatorItemState=");
        sbM53373n.append(c28582b);
        sbM53373n.append(", destination=");
        sbM53373n.append(c9598e);
        sbM53373n.append(", sectionItemSurface=");
        sbM53373n.append(enumC35665f0);
        sbM53373n.append(")");
        return sbM53373n.toString();
    }

    public /* synthetic */ C36906y(int i13, String str, String str2, String str3, boolean z4, boolean z13, AbstractC36882f0 abstractC36882f0, C28582b c28582b, C9598e c9598e, EnumC35665f0 enumC35665f0, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, (i14 & 2) != 0 ? "" : str, (i14 & 4) != 0 ? "" : str2, (i14 & 8) != 0 ? "" : str3, (i14 & 16) != 0 ? false : z4, (i14 & 32) != 0 ? true : z13, abstractC36882f0, (i14 & 128) != 0 ? null : c28582b, (i14 & 256) != 0 ? null : c9598e, (i14 & 512) != 0 ? EnumC35665f0.Default : enumC35665f0);
    }
}
