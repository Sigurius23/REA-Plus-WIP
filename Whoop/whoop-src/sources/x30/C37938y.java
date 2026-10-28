package x30;

import com.whoop.android.R;
import m83.C25271y;
import p479s4.AbstractC32128i;
import p537ux.InterfaceC35320a;
import p537ux.InterfaceC35322b;
import p696zy.C41210b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: x30.y */
/* JADX INFO: loaded from: classes6.dex */
public final class C37938y {

    /* JADX INFO: renamed from: a */
    public final boolean f162410a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC35320a f162411b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC35322b f162412c;

    /* JADX INFO: renamed from: d */
    public final C41210b f162413d;

    /* JADX INFO: renamed from: e */
    public final int f162414e;

    /* JADX INFO: renamed from: f */
    public final int f162415f;

    /* JADX INFO: renamed from: g */
    public final int f162416g;

    public C37938y(boolean z4, InterfaceC35320a cardBrandFilter, InterfaceC35322b cardFundingFilter) {
        AbstractC22676k.m65750j(cardBrandFilter, "cardBrandFilter");
        AbstractC22676k.m65750j(cardFundingFilter, "cardFundingFilter");
        this.f162410a = z4;
        this.f162411b = cardBrandFilter;
        this.f162412c = cardFundingFilter;
        this.f162413d = AbstractC32128i.m100064s(R.string.stripe_acc_label_card_number, new Object[0], C25271y.f99162w);
        this.f162414e = 8;
        this.f162415f = 9;
        this.f162416g = 6;
    }
}
