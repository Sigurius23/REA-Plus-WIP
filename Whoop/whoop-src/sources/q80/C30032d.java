package q80;

import com.whoop.activation.view.navigation.ActivationFlowDestination;
import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: q80.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R%\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001f¨\u0006 "}, m65681d2 = {"Lq80/d;", "", "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "destination", "Lkotlin/Function1;", "", "Lj80/a;", "fetchEvent", "screenTag", "", "includeSourceArgument", "<init>", "(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "()Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "b", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "c", "Ljava/lang/String;", "d", "Z", "()Z", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30032d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ActivationFlowDestination destination;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function1 fetchEvent;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String screenTag;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean includeSourceArgument;

    public C30032d(ActivationFlowDestination destination, Function1 fetchEvent, String screenTag, boolean z4) {
        AbstractC22676k.m65750j(destination, "destination");
        AbstractC22676k.m65750j(fetchEvent, "fetchEvent");
        AbstractC22676k.m65750j(screenTag, "screenTag");
        this.destination = destination;
        this.fetchEvent = fetchEvent;
        this.screenTag = screenTag;
        this.includeSourceArgument = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ActivationFlowDestination getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Function1 getFetchEvent() {
        return this.fetchEvent;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIncludeSourceArgument() {
        return this.includeSourceArgument;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getScreenTag() {
        return this.screenTag;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C30032d)) {
            return false;
        }
        C30032d c30032d = (C30032d) other;
        return this.destination == c30032d.destination && AbstractC22676k.m65745e(this.fetchEvent, c30032d.fetchEvent) && AbstractC22676k.m65745e(this.screenTag, c30032d.screenTag) && this.includeSourceArgument == c30032d.includeSourceArgument;
    }

    public int hashCode() {
        return Boolean.hashCode(this.includeSourceArgument) + AbstractC11266d.m30450d(AbstractC30802r.m94756e(this.fetchEvent, this.destination.hashCode() * 31, 31), 31, this.screenTag);
    }

    public String toString() {
        ActivationFlowDestination activationFlowDestination = this.destination;
        Function1 function1 = this.fetchEvent;
        String str = this.screenTag;
        boolean z4 = this.includeSourceArgument;
        StringBuilder sb4 = new StringBuilder("ActivationBffFlowDescriptor(destination=");
        sb4.append(activationFlowDestination);
        sb4.append(", fetchEvent=");
        sb4.append(function1);
        sb4.append(", screenTag=");
        return AbstractC21702c.m61137h(sb4, str, ", includeSourceArgument=", z4, ")");
    }

    public /* synthetic */ C30032d(ActivationFlowDestination activationFlowDestination, Function1 function1, String str, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(activationFlowDestination, function1, str, (i13 & 8) != 0 ? false : z4);
    }
}
