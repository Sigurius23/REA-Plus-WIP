package com.stripe.android.uicore.image;

import m40.AbstractC25048y;
import p331n2.AbstractC26165a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"com/stripe/android/uicore/image/StripeImageState$Success", "Lm40/y;", "Ln2/a;", "painter", "Ln2/a;", "a", "()Ln2/a;", "stripe-ui-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final /* data */ class StripeImageState$Success extends AbstractC25048y {
    private final AbstractC26165a painter;

    public StripeImageState$Success(AbstractC26165a painter) {
        AbstractC22676k.m65750j(painter, "painter");
        this.painter = painter;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC26165a getPainter() {
        return this.painter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StripeImageState$Success) && AbstractC22676k.m65745e(this.painter, ((StripeImageState$Success) obj).painter);
    }

    public final int hashCode() {
        return this.painter.hashCode();
    }

    public final String toString() {
        return "Success(painter=" + this.painter + ")";
    }
}
