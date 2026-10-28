package rc0;

import com.whoop.advancedlabs.feature.marketingconsent.domain.models.ConsentButton;
import com.whoop.advancedlabs.feature.marketingconsent.domain.models.ConsentToggle;
import com.whoop.advancedlabs.feature.marketingconsent.domain.models.MarketingConsentScreenResponse;
import com.whoop.design.models.DesignSystemModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import m83.C25271y;
import md0.AbstractC25448c;
import nc0.C26565c;
import nc0.EnumC26568f;
import nc0.InterfaceC26563a;
import oc0.EnumC27816a;
import p41.C28839j;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p736sz0.C33205o0;
import qc0.C30216c;
import qc0.InterfaceC30214a;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: rc0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\u0005*\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000b*\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0014\u001a\u00020\u0013*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\n¨\u0006\u0018"}, m65681d2 = {"Lrc0/a;", "", "<init>", "()V", "Lnc0/a$a;", "Lqc0/c;", "c", "(Lnc0/a$a;)Lqc0/c;", "Lnc0/c;", "e", "(Lnc0/c;)Lqc0/c;", "", "Lcom/whoop/design/models/DesignSystemModel;", "Lqc0/c$a;", "b", "(Ljava/util/List;)Ljava/util/List;", "Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle;", "", "isEnabled", "Lp41/j;", "d", "(Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle;Z)Lp41/j;", "domainResult", "a", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31232a {

    /* JADX INFO: renamed from: rc0.a$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f128615a;

        static {
            int[] iArr = new int[EnumC26568f.values().length];
            try {
                iArr[EnumC26568f.CONSENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC26568f.OPTED_IN_CONFIRMATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC26568f.SKIPPED_CONFIRMATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f128615a = iArr;
        }
    }

    /* JADX INFO: renamed from: b */
    private final List<C30216c.a> m96168b(List<? extends DesignSystemModel> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            InterfaceC25312u interfaceC25312uM60544l = AbstractC25448c.m74680C0().m60544l((DesignSystemModel) it.next());
            C30216c.a aVar = interfaceC25312uM60544l != null ? new C30216c.a(AbstractC37056f.m118958J(interfaceC25312uM60544l)) : null;
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    private final C30216c m96169c(InterfaceC26563a.a aVar) {
        if (aVar instanceof InterfaceC26563a.b) {
            return new C30216c(null, new C30216c.b(C33205o0.f138451a.m105288b(), null, null, null, 14, null), null, 5, null);
        }
        if (aVar instanceof InterfaceC26563a.c) {
            return new C30216c(null, new C30216c.b(C33205o0.f138451a.m105289c(), InterfaceC30214a.i.f123682a, null, InterfaceC30214a.d.f123676a, 4, null), null, 5, null);
        }
        if (aVar instanceof InterfaceC26563a.d) {
            return new C30216c(null, new C30216c.b(C33205o0.f138451a.m105291e(), InterfaceC30214a.i.f123682a, null, InterfaceC30214a.d.f123676a, 4, null), null, 5, null);
        }
        if (aVar instanceof InterfaceC26563a.e) {
            return new C30216c(null, new C30216c.b(C33205o0.f138451a.m105293g(), null, null, null, 14, null), null, 5, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: d */
    private final C28839j m96170d(ConsentToggle consentToggle, boolean z4) {
        return new C28839j(consentToggle.getLabel(), z4, false, null, null, null, 60, null);
    }

    /* JADX INFO: renamed from: e */
    private final C30216c m96171e(C26565c c26565c) {
        List<C30216c.a> listM96168b;
        List<C30216c.a> listM96168b2;
        C28839j c28839jM96170d;
        ConsentButton cta;
        AbstractC22403o abstractC22403o;
        MarketingConsentScreenResponse response = c26565c.getResponse();
        if (response == null) {
            return new C30216c(c26565c.getModal(), null, new C30216c.c(AbstractC22403o.b.f87641b, null, null, null, null, null, !c26565c.getManualRefresh() && c26565c.getDisplayRefreshingSpinner(), null, 190, null), 2, null);
        }
        int i13 = a.f128615a[c26565c.getCurrentStep().ordinal()];
        if (i13 != 1) {
            c28839jM96170d = null;
            listM96168b2 = C25271y.f99162w;
            if (i13 == 2) {
                listM96168b = m96168b(response.getOptedInConfirmation().getItems());
                cta = response.getOptedInConfirmation().getCta();
                abstractC22403o = AbstractC22403o.b.f87641b;
            } else {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                listM96168b = m96168b(response.getSkippedConfirmation().getItems());
                cta = response.getSkippedConfirmation().getCta();
                abstractC22403o = AbstractC22403o.b.f87641b;
            }
        } else {
            listM96168b = m96168b(response.getConsentStep().getItemsAboveToggle());
            listM96168b2 = m96168b(response.getConsentStep().getItemsBelowToggle());
            c28839jM96170d = m96170d(response.getConsentStep().getToggle(), c26565c.getToggleEnabled());
            ConsentButton ctaWhenToggleOn = c26565c.getToggleEnabled() ? response.getConsentStep().getCtaWhenToggleOn() : response.getConsentStep().getCtaWhenToggleOff();
            AbstractC22403o.c cVar = new AbstractC22403o.c(response.getHeaderImageUrl(), 0, 0, 0, 14, null);
            cta = ctaWhenToggleOn;
            abstractC22403o = cVar;
        }
        return new C30216c(c26565c.getModal(), null, new C30216c.c(abstractC22403o, listM96168b, listM96168b2, c28839jM96170d, AbstractC31233b.m96173a(cta), EnumC27816a.INSTANCE.m83893a(cta.getClickAction()), !c26565c.getManualRefresh() && c26565c.getDisplayRefreshingSpinner(), AbstractC31061c.m95645u("step", c26565c.getCurrentStep().name())), 2, null);
    }

    /* JADX INFO: renamed from: a */
    public final C30216c m96172a(C26565c domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        return domainResult.getCurrentDialogType() instanceof InterfaceC26563a.a ? m96169c((InterfaceC26563a.a) domainResult.getCurrentDialogType()) : m96171e(domainResult);
    }
}
