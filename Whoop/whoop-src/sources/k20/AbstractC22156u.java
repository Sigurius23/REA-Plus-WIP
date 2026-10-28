package k20;

import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29835t;
import q20.AbstractC29840y;
import q20.C29818g;
import q20.C29822i;
import q20.C29824j;
import q20.C29828m;
import q20.C29833r;
import q20.C29834s;
import q20.C29838w;
import q20.C29839x;
import y00.EnumC38828f4;
import y00.EnumC38922p2;

/* JADX INFO: renamed from: k20.u */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC22156u {
    /* JADX INFO: renamed from: a */
    public static final String m63411a(AbstractC29840y abstractC29840y) {
        String str;
        AbstractC22676k.m65750j(abstractC29840y, "<this>");
        if (abstractC29840y instanceof C29824j) {
            return "google_pay";
        }
        if (abstractC29840y instanceof C29828m) {
            return "link";
        }
        if (abstractC29840y instanceof C29839x) {
            return "shop_pay";
        }
        if (abstractC29840y instanceof AbstractC29835t) {
            return ((AbstractC29835t) abstractC29840y).mo91330i().f167026w;
        }
        if (abstractC29840y instanceof C29838w) {
            EnumC38828f4 enumC38828f4 = ((C29838w) abstractC29840y).f121955x.f167511E;
            return (enumC38828f4 == null || (str = enumC38828f4.f167132w) == null) ? "saved" : str;
        }
        if (abstractC29840y instanceof C29822i) {
            return ((C29822i) abstractC29840y).f121901x;
        }
        if (abstractC29840y instanceof C29818g) {
            return ((C29818g) abstractC29840y).f121888x;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    public static final String m63412b(AbstractC29840y abstractC29840y) {
        AbstractC22676k.m65750j(abstractC29840y, "<this>");
        if (abstractC29840y instanceof C29828m) {
            return "wallet";
        }
        if (abstractC29840y instanceof C29834s) {
            C29833r c29833r = ((C29834s) abstractC29840y).f121943F;
            if (c29833r != null) {
                return c29833r.f121941x == EnumC38922p2.LinkCardBrand ? "link_card_brand" : "instant_debits";
            }
            return null;
        }
        if ((abstractC29840y instanceof C29824j) || (abstractC29840y instanceof AbstractC29835t) || (abstractC29840y instanceof C29838w) || (abstractC29840y instanceof C29818g) || (abstractC29840y instanceof C29822i) || (abstractC29840y instanceof C29839x)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
