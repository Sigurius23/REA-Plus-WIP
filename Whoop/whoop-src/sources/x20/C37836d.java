package x20;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.android.R;
import l83.C23454a0;
import ou1.C28376a;
import p390p1.C28635l;
import p390p1.C28655q;
import p484s9.AbstractC32281f;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;

/* JADX INFO: renamed from: x20.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C37836d implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public static final C37836d f161997w = new C37836d();

    /* JADX WARN: Code duplicated, block: B:10:0x0041  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C28655q c28655q;
        Object objM87133R;
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            C28655q c28655q2 = (C28655q) composer;
            if (c28655q2.m87121F()) {
                c28655q2.m87138X();
            } else {
                Duration.Companion companion = Duration.INSTANCE;
                C37848p c37848p = new C37848p(DurationKt.toDuration(83, DurationUnit.SECONDS), R.string.stripe_upi_polling_message, EnumC37847o.f162021y, false);
                c28655q = (C28655q) composer;
                c28655q.m87150e0(1313320842);
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C28376a(7);
                    c28655q.m87172p0(objM87133R);
                }
                c28655q.m87173q(false);
                AbstractC32281f.m100445j(c37848p, (InterfaceC4339a) objM87133R, null, c28655q, 48, 4);
            }
        } else {
            Duration.Companion companion2 = Duration.INSTANCE;
            C37848p c37848p2 = new C37848p(DurationKt.toDuration(83, DurationUnit.SECONDS), R.string.stripe_upi_polling_message, EnumC37847o.f162021y, false);
            c28655q = (C28655q) composer;
            c28655q.m87150e0(1313320842);
            objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C28376a(7);
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            AbstractC32281f.m100445j(c37848p2, (InterfaceC4339a) objM87133R, null, c28655q, 48, 4);
        }
        return C23454a0.f92919a;
    }
}
