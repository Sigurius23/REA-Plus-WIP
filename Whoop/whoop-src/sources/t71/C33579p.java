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

/* JADX INFO: renamed from: t71.p */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014JJ\u0010\u0015\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b\"\u0010!R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, m65681d2 = {"Lt71/p;", "Lm91/u;", "Lkotlin/Function1;", "Li21/a;", "", NotificationCompat.CATEGORY_EVENT, "Lcom/whoop/design/util/TextResource;", "headerText", "subText", "", "Li21/j;", "impactCardStates", "<init>", "(Lkotlin/jvm/functions/Function1;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "c", "(Lkotlin/jvm/functions/Function1;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;)Lt71/p;", "", "toString", "()Ljava/lang/String;", "a", "Lkotlin/jvm/functions/Function1;", "f", "()Lkotlin/jvm/functions/Function1;", "b", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "i", "d", "Ljava/util/List;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33579p implements InterfaceC25312u {

    /* JADX INFO: renamed from: e */
    public static final int f140093e = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function1 event;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource headerText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource subText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C18000j> impactCardStates;

    public C33579p(Function1 event, TextResource headerText, TextResource subText, List<C18000j> impactCardStates) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(headerText, "headerText");
        AbstractC22676k.m65750j(subText, "subText");
        AbstractC22676k.m65750j(impactCardStates, "impactCardStates");
        this.event = event;
        this.headerText = headerText;
        this.subText = subText;
        this.impactCardStates = impactCardStates;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C23454a0 m106060b(C17991a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C33579p m106061e(C33579p c33579p, Function1 function1, TextResource textResource, TextResource textResource2, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            function1 = c33579p.event;
        }
        if ((i13 & 2) != 0) {
            textResource = c33579p.headerText;
        }
        if ((i13 & 4) != 0) {
            textResource2 = c33579p.subText;
        }
        if ((i13 & 8) != 0) {
            list = c33579p.impactCardStates;
        }
        return c33579p.m106062c(function1, textResource, textResource2, list);
    }

    /* JADX INFO: renamed from: c */
    public final C33579p m106062c(Function1 event, TextResource headerText, TextResource subText, List<C18000j> impactCardStates) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(headerText, "headerText");
        AbstractC22676k.m65750j(subText, "subText");
        AbstractC22676k.m65750j(impactCardStates, "impactCardStates");
        return new C33579p(event, headerText, subText, impactCardStates);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!C33579p.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        AbstractC22676k.m65748h(other, "null cannot be cast to non-null type com.whoop.design.atomic.organism.impacttile.InsufficientImpactTileState");
        C33579p c33579p = (C33579p) other;
        return AbstractC22676k.m65745e(this.headerText, c33579p.headerText) && AbstractC22676k.m65745e(this.impactCardStates, c33579p.impactCardStates);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public Function1 getEvent() {
        return this.event;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getHeaderText() {
        return this.headerText;
    }

    /* JADX INFO: renamed from: h */
    public final List<C18000j> m106065h() {
        return this.impactCardStates;
    }

    public int hashCode() {
        return this.impactCardStates.hashCode() + (this.headerText.hashCode() * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getSubText() {
        return this.subText;
    }

    public String toString() {
        return "InsufficientImpactTileState(event=" + this.event + ", headerText=" + this.headerText + ", subText=" + this.subText + ", impactCardStates=" + this.impactCardStates + ")";
    }

    public /* synthetic */ C33579p(Function1 function1, TextResource textResource, TextResource textResource2, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C33572i(3) : function1, textResource, textResource2, list);
    }
}
