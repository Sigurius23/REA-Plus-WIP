package j22;

import androidx.core.app.NotificationCompat;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import com.whoop.data.repositories.LanguageRepository;
import com.whoop.data.repositories.TroubleConnectingSupportArticleUrl;
import j93.InterfaceC21461d;
import java.util.Locale;
import js0.AbstractC21909c;
import js0.C21908b;
import or2.C28216y;
import p114eb.AbstractC12939a0;
import p114eb.C12977n0;
import p114eb.C12991u0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: j22.h */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, m65681d2 = {"Lj22/h;", "", "Landroidx/fragment/app/m0;", "fragment", "Leb/u0;", "navHostController", "Leb/a0;", "navController", "Lor2/y;", "externalLinkNavigator", "Ljs0/c;", "configurationRepository", "Lcom/whoop/data/repositories/LanguageRepository;", "languageRepository", "<init>", "(Landroidx/fragment/app/m0;Leb/u0;Leb/a0;Lor2/y;Ljs0/c;Lcom/whoop/data/repositories/LanguageRepository;)V", "Lj22/f;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Lj22/f;)V", "Landroidx/fragment/app/m0;", "b", "Leb/u0;", "c", "Leb/a0;", "d", "Lor2/y;", "e", "Ljs0/c;", "f", "Lcom/whoop/data/repositories/LanguageRepository;", "pairing-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21259h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractComponentCallbacksC1320m0 fragment;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C12991u0 navHostController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C28216y externalLinkNavigator;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final LanguageRepository languageRepository;

    public C21259h(AbstractComponentCallbacksC1320m0 fragment, C12991u0 navHostController, AbstractC12939a0 navController, C28216y externalLinkNavigator, AbstractC21909c configurationRepository, LanguageRepository languageRepository) {
        AbstractC22676k.m65750j(fragment, "fragment");
        AbstractC22676k.m65750j(navHostController, "navHostController");
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(externalLinkNavigator, "externalLinkNavigator");
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        AbstractC22676k.m65750j(languageRepository, "languageRepository");
        this.fragment = fragment;
        this.navHostController = navHostController;
        this.navController = navController;
        this.externalLinkNavigator = externalLinkNavigator;
        this.configurationRepository = configurationRepository;
        this.languageRepository = languageRepository;
    }

    /* JADX INFO: renamed from: a */
    public final void m59661a(AbstractC21257f event) {
        AbstractC22676k.m65750j(event, "event");
        Object objM125868N0 = null;
        if (event instanceof AbstractC21257f.b) {
            C12977n0 c12977n0M36394i = this.navHostController.m36394i();
            AbstractC21257f.b bVar = (AbstractC21257f.b) event;
            if (AbstractC22676k.m65745e(c12977n0M36394i != null ? c12977n0M36394i.f44820I : null, bVar.getRoute())) {
                return;
            }
            AbstractC12939a0.m36374y(this.navHostController, bVar.getRoute(), null, 6);
            return;
        }
        if (event instanceof AbstractC21257f.a) {
            if (this.navHostController.m36410z()) {
                return;
            }
            this.navController.m36410z();
            return;
        }
        if (!(event instanceof AbstractC21257f.d)) {
            if (event.equals(AbstractC21257f.c.f81139a)) {
                AbstractC21260i.m59663b(this.navController.f44680a);
                return;
            } else {
                if (!event.equals(AbstractC21257f.e.f81141a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        Locale allowedLanguage = this.languageRepository.getAllowedLanguage();
        C28216y c28216y = this.externalLinkNavigator;
        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = this.fragment.requireActivity();
        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
        AbstractC21909c abstractC21909c = this.configurationRepository;
        TroubleConnectingSupportArticleUrl troubleConnectingSupportArticleUrl = new TroubleConnectingSupportArticleUrl(allowedLanguage);
        C21908b configurations = abstractC21909c.getConfigurations();
        String name = troubleConnectingSupportArticleUrl.getName();
        Object defaultValue = troubleConnectingSupportArticleUrl.getDefaultValue();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(String.class);
        if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
            String str = (String) configurations.get(name);
            if (str != null) {
                objM125868N0 = AbstractC39421y.m125932Q(str);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
            String str2 = (String) configurations.get(name);
            if (str2 != null) {
                objM125868N0 = AbstractC39421y.m125933R(str2);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
            String str3 = (String) configurations.get(name);
            if (str3 != null) {
                objM125868N0 = AbstractC39420x.m125915y(str3);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
            String str4 = (String) configurations.get(name);
            if (str4 != null) {
                objM125868N0 = AbstractC39420x.m125914x(str4);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Boolean.TYPE))) {
            String str5 = (String) configurations.get(name);
            if (str5 != null) {
                objM125868N0 = AbstractC39414r.m125868N0(str5);
            }
        } else {
            objM125868N0 = AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations.get(name) : defaultValue;
        }
        if (objM125868N0 != null) {
            defaultValue = objM125868N0;
        }
        if (defaultValue == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        C28216y.m85414y(c28216y, abstractActivityC1340r0RequireActivity, (String) defaultValue, false, 4, null);
    }
}
