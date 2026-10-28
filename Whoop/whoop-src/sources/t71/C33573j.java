package t71;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import i21.C17991a;
import i21.C18000j;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: t71.j */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016JT\u0010\u0017\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*¨\u0006-"}, m65681d2 = {"Lt71/j;", "Lm91/u;", "Lkotlin/Function1;", "Li21/a;", "", NotificationCompat.CATEGORY_EVENT, "", "Li21/j;", "impactCardStates", "Lcom/whoop/design/util/TextResource;", "middleText", "Lt71/b;", "leftHeaderState", "rightHeaderState", "<init>", "(Lkotlin/jvm/functions/Function1;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lt71/b;Lt71/b;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "c", "(Lkotlin/jvm/functions/Function1;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lt71/b;Lt71/b;)Lt71/j;", "", "toString", "()Ljava/lang/String;", "a", "Lkotlin/jvm/functions/Function1;", "f", "()Lkotlin/jvm/functions/Function1;", "b", "Ljava/util/List;", "g", "()Ljava/util/List;", "Lcom/whoop/design/util/TextResource;", "i", "()Lcom/whoop/design/util/TextResource;", "d", "Lt71/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lt71/b;", "e", "j", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33573j implements InterfaceC25312u {

    /* JADX INFO: renamed from: f */
    public static final int f140074f = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function1 event;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C18000j> impactCardStates;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource middleText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C33565b leftHeaderState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C33565b rightHeaderState;

    public C33573j(Function1 event, List<C18000j> impactCardStates, TextResource middleText, C33565b leftHeaderState, C33565b rightHeaderState) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(impactCardStates, "impactCardStates");
        AbstractC22676k.m65750j(middleText, "middleText");
        AbstractC22676k.m65750j(leftHeaderState, "leftHeaderState");
        AbstractC22676k.m65750j(rightHeaderState, "rightHeaderState");
        this.event = event;
        this.impactCardStates = impactCardStates;
        this.middleText = middleText;
        this.leftHeaderState = leftHeaderState;
        this.rightHeaderState = rightHeaderState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C23454a0 m106023b(C17991a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C33573j m106024e(C33573j c33573j, Function1 function1, List list, TextResource textResource, C33565b c33565b, C33565b c33565b2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            function1 = c33573j.event;
        }
        if ((i13 & 2) != 0) {
            list = c33573j.impactCardStates;
        }
        if ((i13 & 4) != 0) {
            textResource = c33573j.middleText;
        }
        if ((i13 & 8) != 0) {
            c33565b = c33573j.leftHeaderState;
        }
        if ((i13 & 16) != 0) {
            c33565b2 = c33573j.rightHeaderState;
        }
        C33565b c33565b3 = c33565b2;
        TextResource textResource2 = textResource;
        return c33573j.m106025c(function1, list, textResource2, c33565b, c33565b3);
    }

    /* JADX INFO: renamed from: c */
    public final C33573j m106025c(Function1 event, List<C18000j> impactCardStates, TextResource middleText, C33565b leftHeaderState, C33565b rightHeaderState) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(impactCardStates, "impactCardStates");
        AbstractC22676k.m65750j(middleText, "middleText");
        AbstractC22676k.m65750j(leftHeaderState, "leftHeaderState");
        AbstractC22676k.m65750j(rightHeaderState, "rightHeaderState");
        return new C33573j(event, impactCardStates, middleText, leftHeaderState, rightHeaderState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!C33573j.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        AbstractC22676k.m65748h(other, "null cannot be cast to non-null type com.whoop.design.atomic.organism.impacttile.ImpactTileState");
        C33573j c33573j = (C33573j) other;
        return AbstractC22676k.m65745e(this.impactCardStates, c33573j.impactCardStates) && AbstractC22676k.m65745e(this.middleText, c33573j.middleText) && AbstractC22676k.m65745e(this.leftHeaderState, c33573j.leftHeaderState) && AbstractC22676k.m65745e(this.rightHeaderState, c33573j.rightHeaderState);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public Function1 getEvent() {
        return this.event;
    }

    /* JADX INFO: renamed from: g */
    public final List<C18000j> m106027g() {
        return this.impactCardStates;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C33565b getLeftHeaderState() {
        return this.leftHeaderState;
    }

    public int hashCode() {
        return this.rightHeaderState.hashCode() + ((this.leftHeaderState.hashCode() + AbstractC31061c.m95625a(this.impactCardStates.hashCode() * 31, this.middleText, 31)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getMiddleText() {
        return this.middleText;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final C33565b getRightHeaderState() {
        return this.rightHeaderState;
    }

    public String toString() {
        return "ImpactTileState(event=" + this.event + ", impactCardStates=" + this.impactCardStates + ", middleText=" + this.middleText + ", leftHeaderState=" + this.leftHeaderState + ", rightHeaderState=" + this.rightHeaderState + ")";
    }

    public /* synthetic */ C33573j(Function1 function1, List list, TextResource textResource, C33565b c33565b, C33565b c33565b2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C33572i(0) : function1, list, textResource, c33565b, c33565b2);
    }
}
