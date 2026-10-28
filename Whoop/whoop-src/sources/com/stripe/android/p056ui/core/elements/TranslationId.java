package com.stripe.android.p056ui.core.elements;

import com.whoop.android.R;
import ge3.AbstractC15751g;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.EnumsKt;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import q83.AbstractC30060g;
import t83.InterfaceC33616a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wr1.C37572f;
import x30.C37927s1;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m65681d2 = {"Lcom/stripe/android/ui/core/elements/TranslationId;", "", "", "resourceId", "<init>", "(Ljava/lang/String;II)V", "I", "getResourceId", "()I", "Companion", "x30/s1", "IdealBank", "P24Bank", "EpsBank", "FpxBank", "AddressName", "AuBecsAccountName", "payments-ui-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public enum TranslationId {
    IdealBank(R.string.stripe_ideal_bank),
    P24Bank(R.string.stripe_p24_bank),
    EpsBank(R.string.stripe_eps_bank),
    FpxBank(R.string.stripe_fpx_bank),
    AddressName(R.string.stripe_address_label_full_name),
    AuBecsAccountName(R.string.stripe_au_becs_account_name);

    private final int resourceId;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    public static final C37927s1 Companion = new C37927s1();
    private static final InterfaceC23462h $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C37572f(23));

    TranslationId(int i13) {
        this.resourceId = i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.stripe.android.ui.core.elements.TranslationId", values(), new String[]{"upe.labels.ideal.bank", "upe.labels.p24.bank", "upe.labels.eps.bank", "upe.labels.fpx.bank", "address.label.name", "upe.labels.name.onAccount"}, new Annotation[][]{null, null, null, null, null, null}, null);
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final int getResourceId() {
        return this.resourceId;
    }
}
