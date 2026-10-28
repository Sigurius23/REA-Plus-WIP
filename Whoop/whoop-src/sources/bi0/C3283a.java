package bi0;

import ai0.AbstractC0908c;
import c51.C4237n;
import c51.C4242s;
import c51.EnumC4239p;
import com.whoop.design.models.items.amoeba.AmoebaDomainResult;
import com.whoop.design.models.items.amoeba.WhoopAgeAmoeba;
import com.whoop.design.models.items.amoeba.WhoopAgeAmoebaStyleValues;
import com.whoop.design.models.items.amoeba.reducers.AmoebaViewStateReducer;
import d51.AbstractC11717e;
import l83.C23465k;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import yh0.AbstractC39536b;
import yh0.C39537c;
import yh0.C39538d;
import yh0.C39539e;

/* JADX INFO: renamed from: bi0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lbi0/a;", "", "Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;", "amoebaViewStateReducer", "<init>", "(Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;)V", "Lyh0/e;", "healthspanState", "Lyh0/d;", "whoopAgeAmoeba", "Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;", "a", "(Lyh0/e;Lyh0/d;)Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;", "Ll83/k;", "", "b", "(Lyh0/e;)Ll83/k;", "yearsDifference", "c", "(F)F", "Lyh0/b;", "domainResult", "Lai0/c;", "d", "(Lyh0/b;)Lai0/c;", "Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;", "amoeba_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3283a {

    /* JADX INFO: renamed from: b */
    public static final int f12817b = AmoebaViewStateReducer.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AmoebaViewStateReducer amoebaViewStateReducer;

    public C3283a(AmoebaViewStateReducer amoebaViewStateReducer) {
        AbstractC22676k.m65750j(amoebaViewStateReducer, "amoebaViewStateReducer");
        this.amoebaViewStateReducer = amoebaViewStateReducer;
    }

    /* JADX INFO: renamed from: a */
    private final WhoopAgeAmoeba m9551a(C39539e healthspanState, C39538d whoopAgeAmoeba) {
        C23465k c23465kM9552b = m9552b(healthspanState);
        return new WhoopAgeAmoeba(new WhoopAgeAmoebaStyleValues(C39537c.INSTANCE.m126295a(), healthspanState.getPaceOfAging(), healthspanState.getYearsDifference(), ((Number) c23465kM9552b.f92938x).floatValue(), ((Number) c23465kM9552b.f92937w).floatValue()), whoopAgeAmoeba.getAgeValueDisplay(), whoopAgeAmoeba.getAgeTitleDisplay(), whoopAgeAmoeba.getAgeSubtitleDisplay(), "YOUNGER", String.valueOf(healthspanState.getYearsDifference()), "YOUNGER", "YEARS YOUNGER", String.valueOf(healthspanState.getPaceOfAging()), "PACE OF AGING", false);
    }

    /* JADX INFO: renamed from: b */
    private final C23465k m9552b(C39539e healthspanState) {
        return new C23465k(Float.valueOf(AbstractC11717e.m31312a(C4237n.INSTANCE.m13214b(), healthspanState.getPaceOfAging())), Float.valueOf(m9553c(healthspanState.getYearsDifference())));
    }

    /* JADX INFO: renamed from: c */
    private final float m9553c(float yearsDifference) {
        float f13 = 1;
        return f13 / (((float) Math.exp(yearsDifference * (-0.6f))) + f13);
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC0908c m9554d(AbstractC39536b domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        if (!(domainResult instanceof AbstractC39536b.c)) {
            if (domainResult instanceof AbstractC39536b.a) {
                return AbstractC0908c.a.f3325a;
            }
            if (domainResult instanceof AbstractC39536b.b) {
                return AbstractC0908c.b.f3326a;
            }
            throw new NoWhenBranchMatchedException();
        }
        AbstractC39536b.c cVar = (AbstractC39536b.c) domainResult;
        EnumC4239p enumC4239p = (!cVar.getTransitionAnimationEnabled() || cVar.getPreviousHealthspanState() == null) ? null : EnumC4239p.PULSE_YEARS_DIFFERENCE;
        WhoopAgeAmoeba whoopAgeAmoebaM9551a = m9551a(cVar.getHealthspanState(), cVar.getWhoopAgeAmoeba());
        C39539e previousHealthspanState = cVar.getPreviousHealthspanState();
        C4242s c4242sReduce = this.amoebaViewStateReducer.reduce(new AmoebaDomainResult.Result(whoopAgeAmoebaM9551a, enumC4239p, previousHealthspanState != null ? m9551a(previousHealthspanState, cVar.getWhoopAgeAmoeba()) : null, cVar.getHealthspanState().getIsOnboarding()));
        C4237n.Companion companion = C4237n.INSTANCE;
        return new AbstractC0908c.c(c4242sReduce, AbstractC11717e.m31312a(companion.m13214b(), cVar.getHealthspanState().getPaceOfAging()), AbstractC11717e.m31312a(companion.m13213a(), cVar.getHealthspanState().getYearsDifference()));
    }
}
