package cy;

import androidx.health.platform.client.proto.C1533u;
import bc3.AbstractC3050q0;
import bz.C3702a;
import com.stripe.android.paymentsheet.analytics.EventReporter$Mode;
import g10.C15215a;
import j10.C21196a;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l20.C23236a;
import n40.C26267g;
import p098dt.AbstractC12350b;
import p160fz.AbstractC14884b;
import p442qy.C30766e;
import p537ux.C35358t;
import q30.C29924p0;
import s93.AbstractC32309k;
import u00.C34377e;
import v03.InterfaceC35517d;
import v20.C35582v;
import w20.C36709a0;

/* JADX INFO: renamed from: cy.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C11181b implements InterfaceC35517d {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f35800w;

    public /* synthetic */ C11181b(int i13) {
        this.f35800w = i13;
    }

    @Override // k83.InterfaceC22297a
    public final Object get() {
        switch (this.f35800w) {
            case 0:
                return Boolean.FALSE;
            case 1:
                C3702a c3702a = C3702a.f15142b;
                AbstractC32309k.m100574c(c3702a);
                return c3702a;
            case 2:
                return Boolean.FALSE;
            case 3:
                C3702a c3702a2 = C3702a.f15142b;
                AbstractC32309k.m100574c(c3702a2);
                return c3702a2;
            case 4:
                C35358t c35358t = C35358t.f150625b;
                AbstractC32309k.m100574c(c35358t);
                return c35358t;
            case 5:
                return new C29924p0();
            case 6:
                C22365e c22365e = AbstractC3050q0.f12077a;
                ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
                AbstractC32309k.m100574c(executorC22364d);
                return executorC22364d;
            case 7:
                C3702a c3702a3 = C3702a.f15142b;
                AbstractC32309k.m100574c(c3702a3);
                return c3702a3;
            case 8:
                AbstractC14884b.f55543d.get();
                return Boolean.FALSE.booleanValue() ? C30766e.f126696a : C30766e.f126697b;
            case 9:
                return AbstractC12350b.m34570S("CustomerSheet");
            case 10:
                return Boolean.FALSE;
            case 11:
                return new C15215a(C35582v.f151330a);
            case 12:
                return Boolean.FALSE;
            case 13:
                return new C21196a(new C23236a(), C36709a0.f157189b);
            case 14:
                return new C23236a();
            case 15:
                return Boolean.TRUE;
            case 16:
                return EventReporter$Mode.Custom;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC12350b.m34570S("PaymentSheet.FlowController");
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C26267g();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return Boolean.FALSE;
            case 20:
                return AbstractC12350b.m34570S("PaymentElement.Autocomplete");
            case 21:
                C3702a c3702a4 = C3702a.f15142b;
                AbstractC32309k.m100574c(c3702a4);
                return c3702a4;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return Boolean.FALSE;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return Boolean.FALSE;
            case 24:
                return new C23236a();
            case 25:
                return EventReporter$Mode.Complete;
            case 26:
                return AbstractC12350b.m34570S("PaymentSheet");
            case 27:
                C22365e c22365e2 = AbstractC3050q0.f12077a;
                ExecutorC22364d executorC22364d2 = ExecutorC22364d.f87316w;
                AbstractC32309k.m100574c(executorC22364d2);
                return executorC22364d2;
            case 28:
                return Boolean.TRUE;
            default:
                C3702a c3702a5 = C3702a.f15142b;
                AbstractC32309k.m100574c(c3702a5);
                return c3702a5;
        }
    }

    public C11181b(C34377e c34377e) {
        this.f35800w = 3;
    }
}
