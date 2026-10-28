package k32;

import c32.AbstractC3933a;
import com.whoop.payments.stripebottomsheettile.model.PaymentMethodMenuTileModel;
import com.whoop.payments.stripebottomsheettile.model.StripeBottomSheetTileModel;
import i32.C18055b;
import j32.AbstractC21296k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: k32.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lk32/a;", "", "<init>", "()V", "Li32/b;", "state", "Lj32/k;", "a", "(Li32/b;)Lj32/k;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22175a {
    /* JADX INFO: renamed from: a */
    public final AbstractC21296k m63484a(C18055b state) {
        StripeBottomSheetTileModel stripeBottomSheetTileModelCopy$default;
        AbstractC22676k.m65750j(state, "state");
        String error = state.getError();
        if (error != null) {
            return new AbstractC21296k.a(error);
        }
        if (state.getIsLoading()) {
            return AbstractC21296k.c.f81374a;
        }
        StripeBottomSheetTileModel tileModel = state.getTileModel();
        if (tileModel == null) {
            return new AbstractC21296k.a("StripePaymentSheetTile not loaded");
        }
        PaymentMethodMenuTileModel overridePaymentMethodTile = state.getOverridePaymentMethodTile();
        if (overridePaymentMethodTile != null && (stripeBottomSheetTileModelCopy$default = StripeBottomSheetTileModel.copy$default(tileModel, null, overridePaymentMethodTile, null, null, false, 29, null)) != null) {
            tileModel = stripeBottomSheetTileModelCopy$default;
        }
        return new AbstractC21296k.b(AbstractC3933a.m11976d(tileModel, state.getScreenName()), state.getHasSelectedPaymentMethod());
    }
}
