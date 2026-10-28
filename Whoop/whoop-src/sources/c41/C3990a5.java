package c41;

import c31.C3929m;
import c93.InterfaceC4339a;
import com.whoop.design.util.TextResource;
import hy0.C17750h1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import l83.C23454a0;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: c41.a5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010-\u001a\u0004\b0\u0010/R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b5\u0010)\u001a\u0004\b6\u0010+R\u0017\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b6\u0010)\u001a\u0004\b1\u0010+R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00128\u0006¢\u0006\f\n\u0004\b3\u0010;\u001a\u0004\b7\u0010<R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00128\u0006¢\u0006\f\n\u0004\b9\u0010;\u001a\u0004\b5\u0010<¨\u0006="}, m65681d2 = {"Lc41/a5;", "Lm91/u;", "Ly81/f;", "backgroundColor", "", "Lcom/whoop/design/util/TextResource;", "dayLabelList", "title", "", "isTileExpanded", "isTagVisible", "Lhy0/h1;", "tagState", "editActionText", "deleteActionText", "Lkotlin/Function1;", "Ll83/a0;", "tileExpandedListener", "Lkotlin/Function0;", "editButtonClicked", "deleteButtonClicked", "<init>", "(Ly81/f;Ljava/util/List;Lcom/whoop/design/util/TextResource;ZZLhy0/h1;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ly81/f;", "c", "()Ly81/f;", "b", "Ljava/util/List;", "e", "()Ljava/util/List;", "Lcom/whoop/design/util/TextResource;", "l", "()Lcom/whoop/design/util/TextResource;", "d", "Z", "n", "()Z", "m", "f", "Lhy0/h1;", "j", "()Lhy0/h1;", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "Lkotlin/jvm/functions/Function1;", "k", "()Lkotlin/jvm/functions/Function1;", "Lc93/a;", "()Lc93/a;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3990a5 implements InterfaceC25312u {

    /* JADX INFO: renamed from: l */
    public static final int f16237l = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC39333f backgroundColor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<TextResource> dayLabelList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isTileExpanded;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isTagVisible;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C17750h1 tagState;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource editActionText;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final TextResource deleteActionText;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Function1 tileExpandedListener;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC4339a editButtonClicked;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final InterfaceC4339a deleteButtonClicked;

    /* JADX WARN: Multi-variable type inference failed */
    public C3990a5(EnumC39333f backgroundColor, List<? extends TextResource> dayLabelList, TextResource title, boolean z4, boolean z13, C17750h1 c17750h1, TextResource editActionText, TextResource deleteActionText, Function1 tileExpandedListener, InterfaceC4339a editButtonClicked, InterfaceC4339a deleteButtonClicked) {
        AbstractC22676k.m65750j(backgroundColor, "backgroundColor");
        AbstractC22676k.m65750j(dayLabelList, "dayLabelList");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(editActionText, "editActionText");
        AbstractC22676k.m65750j(deleteActionText, "deleteActionText");
        AbstractC22676k.m65750j(tileExpandedListener, "tileExpandedListener");
        AbstractC22676k.m65750j(editButtonClicked, "editButtonClicked");
        AbstractC22676k.m65750j(deleteButtonClicked, "deleteButtonClicked");
        this.backgroundColor = backgroundColor;
        this.dayLabelList = dayLabelList;
        this.title = title;
        this.isTileExpanded = z4;
        this.isTagVisible = z13;
        this.tagState = c17750h1;
        this.editActionText = editActionText;
        this.deleteActionText = deleteActionText;
        this.tileExpandedListener = tileExpandedListener;
        this.editButtonClicked = editButtonClicked;
        this.deleteButtonClicked = deleteButtonClicked;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C23454a0 m12050b(boolean z4) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC39333f getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: e */
    public final List<TextResource> m12052e() {
        return this.dayLabelList;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3990a5)) {
            return false;
        }
        C3990a5 c3990a5 = (C3990a5) other;
        return this.backgroundColor == c3990a5.backgroundColor && AbstractC22676k.m65745e(this.dayLabelList, c3990a5.dayLabelList) && AbstractC22676k.m65745e(this.title, c3990a5.title) && this.isTileExpanded == c3990a5.isTileExpanded && this.isTagVisible == c3990a5.isTagVisible && AbstractC22676k.m65745e(this.tagState, c3990a5.tagState) && AbstractC22676k.m65745e(this.editActionText, c3990a5.editActionText) && AbstractC22676k.m65745e(this.deleteActionText, c3990a5.deleteActionText) && AbstractC22676k.m65745e(this.tileExpandedListener, c3990a5.tileExpandedListener) && AbstractC22676k.m65745e(this.editButtonClicked, c3990a5.editButtonClicked) && AbstractC22676k.m65745e(this.deleteButtonClicked, c3990a5.deleteButtonClicked);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getDeleteActionText() {
        return this.deleteActionText;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final InterfaceC4339a getDeleteButtonClicked() {
        return this.deleteButtonClicked;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getEditActionText() {
        return this.editActionText;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC31061c.m95625a(AbstractC11895b.m31983b(this.backgroundColor.hashCode() * 31, 31, this.dayLabelList), this.title, 31), 31, this.isTileExpanded), 31, this.isTagVisible);
        C17750h1 c17750h1 = this.tagState;
        return this.deleteButtonClicked.hashCode() + AbstractC30802r.m94755d(AbstractC30802r.m94756e(this.tileExpandedListener, AbstractC31061c.m95625a(AbstractC31061c.m95625a((iM8289b + (c17750h1 == null ? 0 : c17750h1.hashCode())) * 31, this.editActionText, 31), this.deleteActionText, 31), 31), 31, this.editButtonClicked);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final InterfaceC4339a getEditButtonClicked() {
        return this.editButtonClicked;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final C17750h1 getTagState() {
        return this.tagState;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Function1 getTileExpandedListener() {
        return this.tileExpandedListener;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getIsTagVisible() {
        return this.isTagVisible;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getIsTileExpanded() {
        return this.isTileExpanded;
    }

    public String toString() {
        EnumC39333f enumC39333f = this.backgroundColor;
        List<TextResource> list = this.dayLabelList;
        TextResource textResource = this.title;
        boolean z4 = this.isTileExpanded;
        boolean z13 = this.isTagVisible;
        C17750h1 c17750h1 = this.tagState;
        TextResource textResource2 = this.editActionText;
        TextResource textResource3 = this.deleteActionText;
        Function1 function1 = this.tileExpandedListener;
        InterfaceC4339a interfaceC4339a = this.editButtonClicked;
        InterfaceC4339a interfaceC4339a2 = this.deleteButtonClicked;
        StringBuilder sb4 = new StringBuilder("ScheduleTileState(backgroundColor=");
        sb4.append(enumC39333f);
        sb4.append(", dayLabelList=");
        sb4.append(list);
        sb4.append(", title=");
        AbstractC33745d.m106664w(textResource, ", isTileExpanded=", ", isTagVisible=", sb4, z4);
        sb4.append(z13);
        sb4.append(", tagState=");
        sb4.append(c17750h1);
        sb4.append(", editActionText=");
        AbstractC30007c.m91855y(sb4, textResource2, ", deleteActionText=", textResource3, ", tileExpandedListener=");
        sb4.append(function1);
        sb4.append(", editButtonClicked=");
        sb4.append(interfaceC4339a);
        sb4.append(", deleteButtonClicked=");
        sb4.append(interfaceC4339a2);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C3990a5(EnumC39333f enumC39333f, List list, TextResource textResource, boolean z4, boolean z13, C17750h1 c17750h1, TextResource textResource2, TextResource textResource3, Function1 function1, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? EnumC39333f.WHITE_10 : enumC39333f, list, textResource, (i13 & 8) != 0 ? false : z4, (i13 & 16) != 0 ? false : z13, (i13 & 32) != 0 ? null : c17750h1, textResource2, textResource3, (i13 & 256) != 0 ? new C3929m(24) : function1, interfaceC4339a, interfaceC4339a2);
    }
}
