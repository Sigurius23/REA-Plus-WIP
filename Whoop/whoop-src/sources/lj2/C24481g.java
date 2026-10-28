package lj2;

import android.content.Intent;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import com.squareup.wire.AbstractC5583n;
import com.whoop.data.repositories.FeatureFlagRepository;
import com.whoop.design.models.items.ArticleTileModelEvent;
import com.whoop.video.VideoActivity;
import fj2.C14543a;
import jj2.AbstractC21742b;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p114eb.AbstractC12939a0;
import p114eb.C12991u0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import rj2.C31490b;

/* JADX INFO: renamed from: lj2.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0007\u0018\u0000 02\u00020\u0001:\u0001\u001cB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00061"}, m65681d2 = {"Llj2/g;", "", "", "interventionType", "Lrj2/b;", "viewModel", "Lfj2/a;", "analyticsManager", "Leb/u0;", "navController", "Landroidx/fragment/app/m0;", "fragment", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "featureFlagRepository", "<init>", "(Ljava/lang/String;Lrj2/b;Lfj2/a;Leb/u0;Landroidx/fragment/app/m0;Lcom/whoop/data/repositories/FeatureFlagRepository;)V", "Llj2/f;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "c", "(Llj2/f;)V", "Llj2/e;", "b", "(Llj2/e;)V", "selectedCycle", "selectedSpeed", "d", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "(Ljava/lang/Object;)V", "Ljava/lang/String;", "Lrj2/b;", "getViewModel", "()Lrj2/b;", "Lfj2/a;", "getAnalyticsManager", "()Lfj2/a;", "Leb/u0;", "getNavController", "()Leb/u0;", "e", "Landroidx/fragment/app/m0;", "getFragment", "()Landroidx/fragment/app/m0;", "f", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "getFeatureFlagRepository", "()Lcom/whoop/data/repositories/FeatureFlagRepository;", "g", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24481g {

    /* JADX INFO: renamed from: h */
    public static final int f95503h = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String interventionType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C31490b viewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C14543a analyticsManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C12991u0 navController;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractComponentCallbacksC1320m0 fragment;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final FeatureFlagRepository featureFlagRepository;

    public C24481g(String interventionType, C31490b viewModel, C14543a analyticsManager, C12991u0 navController, AbstractComponentCallbacksC1320m0 fragment, FeatureFlagRepository featureFlagRepository) {
        AbstractC22676k.m65750j(interventionType, "interventionType");
        AbstractC22676k.m65750j(viewModel, "viewModel");
        AbstractC22676k.m65750j(analyticsManager, "analyticsManager");
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(fragment, "fragment");
        AbstractC22676k.m65750j(featureFlagRepository, "featureFlagRepository");
        this.interventionType = interventionType;
        this.viewModel = viewModel;
        this.analyticsManager = analyticsManager;
        this.navController = navController;
        this.fragment = fragment;
        this.featureFlagRepository = featureFlagRepository;
    }

    /* JADX INFO: renamed from: b */
    private final void m71254b(AbstractC24479e event) {
        if (AbstractC22676k.m65745e(event, AbstractC24479e.a.f95495a)) {
            this.navController.m36410z();
        } else {
            if (!(event instanceof AbstractC24479e.b)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC24479e.b bVar = (AbstractC24479e.b) event;
            m71256d(bVar.getSelectedCycle(), bVar.getSelectedSpeed());
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m71255c(AbstractC24480f event) {
        if (AbstractC22676k.m65745e(event, AbstractC24480f.a.f95498a)) {
            this.analyticsManager.m41540g(this.interventionType);
            AbstractC5583n.m16799z(this.fragment).m36410z();
            return;
        }
        if (event instanceof AbstractC24480f.b) {
            this.analyticsManager.m41541h(this.interventionType);
            this.viewModel.m97003p(new AbstractC21742b.a(((AbstractC24480f.b) event).m71253a()));
        } else if (AbstractC22676k.m65745e(event, AbstractC24480f.c.f95500a)) {
            this.analyticsManager.m41547o(this.interventionType);
            AbstractC5583n.m16799z(this.fragment).m36410z();
        } else {
            if (!AbstractC22676k.m65745e(event, AbstractC24480f.d.f95501a)) {
                throw new NoWhenBranchMatchedException();
            }
            this.viewModel.m97003p(AbstractC21742b.c.f83609a);
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m71256d(String selectedCycle, String selectedSpeed) {
        C14543a.m41533q(this.analyticsManager, this.interventionType, null, null, 6, null);
        this.viewModel.m97003p(new AbstractC21742b.d(selectedCycle, selectedSpeed));
        AbstractC12939a0.m36374y(this.navController, "SESSION", null, 6);
    }

    /* JADX INFO: renamed from: a */
    public final void m71257a(Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (!(event instanceof AbstractC24478d.a)) {
            if (event instanceof ArticleTileModelEvent.Url) {
                this.analyticsManager.m41546n(this.interventionType);
                Intent intent = new Intent(this.fragment.requireContext(), (Class<?>) VideoActivity.class);
                intent.putExtra("videoUrl", ((ArticleTileModelEvent.Url) event).getUrl());
                intent.putExtra("INTERVENTION", this.interventionType);
                this.fragment.startActivity(intent);
                return;
            }
            if (event instanceof AbstractC24480f) {
                m71255c((AbstractC24480f) event);
                return;
            } else {
                if (event instanceof AbstractC24479e) {
                    m71254b((AbstractC24479e) event);
                    return;
                }
                return;
            }
        }
        AbstractC24478d.a aVar = (AbstractC24478d.a) event;
        this.analyticsManager.m41548p(this.interventionType, aVar.getSelectedSpeed(), aVar.getSelectedCycle());
        if (!aVar.getHasDisclaimer()) {
            m71256d(aVar.getSelectedCycle(), aVar.getSelectedSpeed());
            return;
        }
        C12991u0 c12991u0 = this.navController;
        String strM30461o = AbstractC11266d.m30461o("/", aVar.getSelectedCycle());
        if (aVar.getSelectedCycle().length() <= 0) {
            strM30461o = null;
        }
        if (strM30461o == null) {
            strM30461o = "";
        }
        String strM30461o2 = AbstractC11266d.m30461o("/", aVar.getSelectedSpeed());
        if (aVar.getSelectedSpeed().length() <= 0) {
            strM30461o2 = null;
        }
        AbstractC12939a0.m36374y(c12991u0, AbstractC11895b.m31996o("DISCLAIMER", strM30461o, strM30461o2 != null ? strM30461o2 : ""), null, 6);
    }
}
