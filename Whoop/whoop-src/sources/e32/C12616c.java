package e32;

import androidx.core.app.NotificationCompat;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: e32.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Le32/c;", "", "Le32/b;", NotificationCompat.CATEGORY_EVENT, "Le32/a;", "overlayState", "<init>", "(Le32/b;Le32/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Le32/b;", "()Le32/b;", "b", "Le32/a;", "()Le32/a;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12616c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC12615b event;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC12614a overlayState;

    public C12616c(InterfaceC12615b event, AbstractC12614a overlayState) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(overlayState, "overlayState");
        this.event = event;
        this.overlayState = overlayState;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC12615b getEvent() {
        return this.event;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC12614a getOverlayState() {
        return this.overlayState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12616c)) {
            return false;
        }
        C12616c c12616c = (C12616c) other;
        return AbstractC22676k.m65745e(this.event, c12616c.event) && AbstractC22676k.m65745e(this.overlayState, c12616c.overlayState);
    }

    public int hashCode() {
        return this.overlayState.hashCode() + (this.event.hashCode() * 31);
    }

    public String toString() {
        return "StripeBottomSheetTilePaymentViewState(event=" + this.event + ", overlayState=" + this.overlayState + ")";
    }

    public /* synthetic */ C12616c(InterfaceC12615b interfaceC12615b, AbstractC12614a abstractC12614a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? InterfaceC12615b.d.f43072a : interfaceC12615b, (i13 & 2) != 0 ? AbstractC12614a.c.f43067a : abstractC12614a);
    }
}
