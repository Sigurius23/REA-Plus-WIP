package w71;

import hy0.C17736e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import m83.AbstractC25265s;
import m83.C25271y;
import n91.InterfaceC26476a;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import v41.EnumC35665f0;
import wb3.AbstractC37056f;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: w71.t */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J^\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010#\u001a\u0004\b$\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010&R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b!\u0010.\u001a\u0004\b/\u00100R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0012¨\u00062"}, m65681d2 = {"Lw71/t;", "Lm91/u;", "Ln91/a;", "Lw71/y;", "question", "", "subQuestions", "", "expanded", "isCompact", "hasDivider", "Lv41/f0;", "sectionItemSurface", "Lw71/k0;", "stateWrite", "<init>", "(Lw71/y;Ljava/util/List;ZZZLv41/f0;Lw71/k0;)V", "e", "()Ljava/util/List;", "b", "(Lw71/y;Ljava/util/List;ZZZLv41/f0;Lw71/k0;)Lw71/t;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lw71/y;", "g", "()Lw71/y;", "Ljava/util/List;", "j", "c", "Z", "f", "()Z", "d", "k", "Lv41/f0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lv41/f0;", "Lw71/k0;", "i", "()Lw71/k0;", "items", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36901t implements InterfaceC25312u, InterfaceC26476a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C36906y question;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C36906y> subQuestions;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean expanded;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isCompact;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean hasDivider;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC35665f0 sectionItemSurface;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C36892k0 stateWrite;

    public C36901t(C36906y question, List<C36906y> subQuestions, boolean z4, boolean z13, boolean z14, EnumC35665f0 sectionItemSurface, C36892k0 c36892k0) {
        AbstractC22676k.m65750j(question, "question");
        AbstractC22676k.m65750j(subQuestions, "subQuestions");
        AbstractC22676k.m65750j(sectionItemSurface, "sectionItemSurface");
        this.question = question;
        this.subQuestions = subQuestions;
        this.expanded = z4;
        this.isCompact = z13;
        this.hasDivider = z14;
        this.sectionItemSurface = sectionItemSurface;
        this.stateWrite = c36892k0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C36901t m118482c(C36901t c36901t, C36906y c36906y, List list, boolean z4, boolean z13, boolean z14, EnumC35665f0 enumC35665f0, C36892k0 c36892k0, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c36906y = c36901t.question;
        }
        if ((i13 & 2) != 0) {
            list = c36901t.subQuestions;
        }
        if ((i13 & 4) != 0) {
            z4 = c36901t.expanded;
        }
        if ((i13 & 8) != 0) {
            z13 = c36901t.isCompact;
        }
        if ((i13 & 16) != 0) {
            z14 = c36901t.hasDivider;
        }
        if ((i13 & 32) != 0) {
            enumC35665f0 = c36901t.sectionItemSurface;
        }
        if ((i13 & 64) != 0) {
            c36892k0 = c36901t.stateWrite;
        }
        EnumC35665f0 enumC35665f1 = enumC35665f0;
        C36892k0 c36892k1 = c36892k0;
        boolean z15 = z14;
        boolean z16 = z4;
        return c36901t.m118484b(c36906y, list, z16, z13, z15, enumC35665f1, c36892k1);
    }

    /* JADX INFO: renamed from: e */
    private final List<InterfaceC25312u> m118483e() {
        if (!this.hasDivider) {
            return C25271y.f99162w;
        }
        return AbstractC37056f.m118958J(new C17736e(null, null, null, 7, null));
    }

    @Override // n91.InterfaceC26476a
    /* JADX INFO: renamed from: a */
    public List<InterfaceC25312u> mo78412a() {
        return this.expanded ? AbstractC25265s.m74129g1(AbstractC25265s.m74129g1(m118483e(), AbstractC37056f.m118958J(this.question)), this.subQuestions) : AbstractC25265s.m74129g1(m118483e(), AbstractC37056f.m118958J(this.question));
    }

    /* JADX INFO: renamed from: b */
    public final C36901t m118484b(C36906y question, List<C36906y> subQuestions, boolean expanded, boolean isCompact, boolean hasDivider, EnumC35665f0 sectionItemSurface, C36892k0 stateWrite) {
        AbstractC22676k.m65750j(question, "question");
        AbstractC22676k.m65750j(subQuestions, "subQuestions");
        AbstractC22676k.m65750j(sectionItemSurface, "sectionItemSurface");
        return new C36901t(question, subQuestions, expanded, isCompact, hasDivider, sectionItemSurface, stateWrite);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36901t)) {
            return false;
        }
        C36901t c36901t = (C36901t) other;
        return AbstractC22676k.m65745e(this.question, c36901t.question) && AbstractC22676k.m65745e(this.subQuestions, c36901t.subQuestions) && this.expanded == c36901t.expanded && this.isCompact == c36901t.isCompact && this.hasDivider == c36901t.hasDivider && this.sectionItemSurface == c36901t.sectionItemSurface && AbstractC22676k.m65745e(this.stateWrite, c36901t.stateWrite);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getExpanded() {
        return this.expanded;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C36906y getQuestion() {
        return this.question;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final EnumC35665f0 getSectionItemSurface() {
        return this.sectionItemSurface;
    }

    public int hashCode() {
        int iHashCode = (this.sectionItemSurface.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11895b.m31983b(this.question.hashCode() * 31, 31, this.subQuestions), 31, this.expanded), 31, this.isCompact), 31, this.hasDivider)) * 31;
        C36892k0 c36892k0 = this.stateWrite;
        return iHashCode + (c36892k0 == null ? 0 : c36892k0.hashCode());
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final C36892k0 getStateWrite() {
        return this.stateWrite;
    }

    /* JADX INFO: renamed from: j */
    public final List<C36906y> m118489j() {
        return this.subQuestions;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsCompact() {
        return this.isCompact;
    }

    public String toString() {
        C36906y c36906y = this.question;
        List<C36906y> list = this.subQuestions;
        boolean z4 = this.expanded;
        boolean z13 = this.isCompact;
        boolean z14 = this.hasDivider;
        EnumC35665f0 enumC35665f0 = this.sectionItemSurface;
        C36892k0 c36892k0 = this.stateWrite;
        StringBuilder sb4 = new StringBuilder("JournalQuestionSection(question=");
        sb4.append(c36906y);
        sb4.append(", subQuestions=");
        sb4.append(list);
        sb4.append(", expanded=");
        AbstractC38963t7.m124392v(sb4, z4, ", isCompact=", z13, ", hasDivider=");
        sb4.append(z14);
        sb4.append(", sectionItemSurface=");
        sb4.append(enumC35665f0);
        sb4.append(", stateWrite=");
        sb4.append(c36892k0);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C36901t(C36906y c36906y, List list, boolean z4, boolean z13, boolean z14, EnumC35665f0 enumC35665f0, C36892k0 c36892k0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c36906y, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? false : z13, (i13 & 16) == 0 ? z14 : false, (i13 & 32) != 0 ? EnumC35665f0.Default : enumC35665f0, (i13 & 64) != 0 ? null : c36892k0);
    }
}
