package k31;

import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import jp2.C21875f;
import l83.C23454a0;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: k31.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJN\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\n0\tHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(¨\u0006)"}, m65681d2 = {"Lk31/d;", "", "Lcom/whoop/design/util/TextResource;", "primaryText", "Lgz0/m0;", "primaryIcon", "", "isExpanded", "shouldAnimateReplayButton", "Lkotlin/Function1;", "Ll83/a0;", "onEvent", "<init>", "(Lcom/whoop/design/util/TextResource;Lgz0/m0;ZZLkotlin/jvm/functions/Function1;)V", "c", "(Lcom/whoop/design/util/TextResource;Lgz0/m0;ZZLkotlin/jvm/functions/Function1;)Lk31/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "b", "Lgz0/m0;", "f", "()Lgz0/m0;", "Z", "i", "()Z", "d", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "e", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22174d {

    /* JADX INFO: renamed from: f */
    public static final int f85992f = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource primaryText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC16313m0 primaryIcon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isExpanded;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean shouldAnimateReplayButton;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Function1 onEvent;

    public C22174d(TextResource primaryText, EnumC16313m0 primaryIcon, boolean z4, boolean z13, Function1 onEvent) {
        AbstractC22676k.m65750j(primaryText, "primaryText");
        AbstractC22676k.m65750j(primaryIcon, "primaryIcon");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        this.primaryText = primaryText;
        this.primaryIcon = primaryIcon;
        this.isExpanded = z4;
        this.shouldAnimateReplayButton = z13;
        this.onEvent = onEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C23454a0 m63476b(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C22174d m63477d(C22174d c22174d, TextResource textResource, EnumC16313m0 enumC16313m0, boolean z4, boolean z13, Function1 function1, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = c22174d.primaryText;
        }
        if ((i13 & 2) != 0) {
            enumC16313m0 = c22174d.primaryIcon;
        }
        if ((i13 & 4) != 0) {
            z4 = c22174d.isExpanded;
        }
        if ((i13 & 8) != 0) {
            z13 = c22174d.shouldAnimateReplayButton;
        }
        if ((i13 & 16) != 0) {
            function1 = c22174d.onEvent;
        }
        Function1 function2 = function1;
        boolean z14 = z4;
        return c22174d.m63478c(textResource, enumC16313m0, z14, z13, function2);
    }

    /* JADX INFO: renamed from: c */
    public final C22174d m63478c(TextResource primaryText, EnumC16313m0 primaryIcon, boolean isExpanded, boolean shouldAnimateReplayButton, Function1 onEvent) {
        AbstractC22676k.m65750j(primaryText, "primaryText");
        AbstractC22676k.m65750j(primaryIcon, "primaryIcon");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        return new C22174d(primaryText, primaryIcon, isExpanded, shouldAnimateReplayButton, onEvent);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Function1 getOnEvent() {
        return this.onEvent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22174d)) {
            return false;
        }
        C22174d c22174d = (C22174d) other;
        return AbstractC22676k.m65745e(this.primaryText, c22174d.primaryText) && this.primaryIcon == c22174d.primaryIcon && this.isExpanded == c22174d.isExpanded && this.shouldAnimateReplayButton == c22174d.shouldAnimateReplayButton && AbstractC22676k.m65745e(this.onEvent, c22174d.onEvent);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC16313m0 getPrimaryIcon() {
        return this.primaryIcon;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getPrimaryText() {
        return this.primaryText;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getShouldAnimateReplayButton() {
        return this.shouldAnimateReplayButton;
    }

    public int hashCode() {
        return this.onEvent.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC17176i.m48500b(this.primaryIcon, this.primaryText.hashCode() * 31, 31), 31, this.isExpanded), 31, this.shouldAnimateReplayButton);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    public String toString() {
        TextResource textResource = this.primaryText;
        EnumC16313m0 enumC16313m0 = this.primaryIcon;
        boolean z4 = this.isExpanded;
        boolean z13 = this.shouldAnimateReplayButton;
        Function1 function1 = this.onEvent;
        StringBuilder sbM61140k = AbstractC21702c.m61140k("ReplayViewState(primaryText=", textResource, ", primaryIcon=", enumC16313m0, ", isExpanded=");
        AbstractC38963t7.m124392v(sbM61140k, z4, ", shouldAnimateReplayButton=", z13, ", onEvent=");
        sbM61140k.append(function1);
        sbM61140k.append(")");
        return sbM61140k.toString();
    }

    public /* synthetic */ C22174d(TextResource textResource, EnumC16313m0 enumC16313m0, boolean z4, boolean z13, Function1 function1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, enumC16313m0, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? false : z13, (i13 & 16) != 0 ? new C21875f(19) : function1);
    }
}
