package m03;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.runtime.Composer;
import c51.C4237n;
import c93.InterfaceC4351m;
import com.whoop.widget.p071ui.healthspan.HealthspanWidgetViewState;
import d03.AbstractC11447b;
import kl2.C22571f;
import l03.C23051a;
import l03.C23052b;
import l03.C23053c;
import l83.C23454a0;
import l83.C23465k;
import no.nordicsemi.android.dfu.DfuBaseService;
import o73.C27648a;
import p335n6.C26389f;
import p335n6.C26396m;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p477s2.AbstractC32072d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m03.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;", "viewState", "Landroid/content/Context;", "context", "Ll83/a0;", "e", "(Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Landroid/content/Context;Landroidx/compose/runtime/Composer;I)V", "", "seed", "", "paceOfAgingScore", "yearsDifferenceScore", "", "contentDescription", "c", "(JFFLjava/lang/String;Landroidx/compose/runtime/Composer;I)V", "widget_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24886b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static final void m72978c(final long j7, final float f13, final float f14, final String contentDescription, Composer composer, final int i13) {
        int i14;
        Object objM67002a;
        AbstractC22676k.m65750j(contentDescription, "contentDescription");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1683101099);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87151f(j7) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87147d(f13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87147d(f14) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87153g(contentDescription) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i15 = 1;
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C23051a(null, i15, 0 == true ? 1 : 0);
                c28655q.m87172p0(objM87133R);
            }
            C23051a c23051a = (C23051a) objM87133R;
            int i16 = i14 & 896;
            boolean z4 = i16 == 256;
            Object objM87133R2 = c28655q.m87133R();
            if (z4 || objM87133R2 == c28676v0) {
                objM67002a = C23053c.f90915a.m67002a(f14, (2 & 2) != 0 ? new C4237n(0.0f, 0.0f, null, null, null, null, null, null, 0.0f, null, null, 2047, null) : null);
                c28655q.m87172p0(objM67002a);
            } else {
                objM67002a = objM87133R2;
            }
            C23465k c23465k = (C23465k) objM67002a;
            int iIntValue = ((Number) c23465k.f92937w).intValue();
            int iIntValue2 = ((Number) c23465k.f92938x).intValue();
            boolean z13 = ((i14 & 14) == 4) | ((i14 & 112) == 32) | (i16 == 256);
            Object objM87133R3 = c28655q.m87133R();
            if (z13 || objM87133R3 == c28676v0) {
                objM87133R3 = c23051a.m66995e(new C23052b(200, j7, f13, f14, iIntValue, iIntValue2));
                c28655q.m87172p0(objM87133R3);
            }
            C27648a.m83581d(new C26389f((Bitmap) objM87133R3), contentDescription, AbstractC32072d.m99702k(C26396m.f104850a), 1, c28655q, (i14 >> 6) & 112, 16);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: m03.a
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue3 = ((Integer) obj2).intValue();
                    return AbstractC24886b.m72979d(j7, f13, f14, contentDescription, i13, (Composer) obj, iIntValue3);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m72979d(long j7, float f13, float f14, String str, int i13, Composer composer, int i14) {
        m72978c(j7, f13, f14, str, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    public static final void m72980e(HealthspanWidgetViewState viewState, Context context, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(context, "context");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-631956279);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(context) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Long amoebaSeed = viewState.getAmoebaSeed();
            Float paceOfAgingScore = viewState.getPaceOfAgingScore();
            Float yearsDifferenceScore = viewState.getYearsDifferenceScore();
            if (amoebaSeed == null || paceOfAgingScore == null || yearsDifferenceScore == null) {
                c28655q.m87150e0(-1767527756);
                AbstractC24889e.m72988b(context, c28655q, (i14 >> 3) & 14);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1767478373);
                long jLongValue = amoebaSeed.longValue();
                float fFloatValue = paceOfAgingScore.floatValue();
                float fFloatValue2 = yearsDifferenceScore.floatValue();
                String string = context.getString(AbstractC11447b.f36720c);
                AbstractC22676k.m65749i(string, "getString(...)");
                m72978c(jLongValue, fFloatValue, fFloatValue2, string, c28655q, 0);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22571f(viewState, context, i13, 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m72981f(HealthspanWidgetViewState healthspanWidgetViewState, Context context, int i13, Composer composer, int i14) {
        m72980e(healthspanWidgetViewState, context, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
