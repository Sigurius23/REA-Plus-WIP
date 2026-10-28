package hd0;

import com.whoop.advancedlabs.domain.models.ButtonModel;
import com.whoop.advancedlabs.domain.models.ConsentResponse;
import com.whoop.advancedlabs.domain.models.NavigationButtonModel;
import com.whoop.advancedlabs.multiconsentscreen.domain.models.MultiConsentRequest;
import dd0.AbstractC11945b;
import e93.AbstractC12889b;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import gd0.AbstractC15713c;
import i93.C18283i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kd0.C22383c;
import l83.C23454a0;
import m83.AbstractC25243e0;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25272z;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import pb0.AbstractC29053d;
import pb0.C29050a;
import pb0.C29051b;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: hd0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lhd0/a;", "", "<init>", "()V", "Ldd0/b$f;", "domainResult", "Lgd0/c$e;", "c", "(Ldd0/b$f;)Lgd0/c$e;", "currentState", "Ldd0/b$a;", "f", "(Lgd0/c$e;Ldd0/b$a;)Lgd0/c$e;", "Lcom/whoop/advancedlabs/domain/models/ConsentResponse;", "consentResponse", "Lpb0/d$a;", "d", "(Lcom/whoop/advancedlabs/domain/models/ConsentResponse;)Lpb0/d$a;", "Lec3/l;", "Ldd0/b;", "upstream", "Lgd0/c;", "e", "(Lec3/l;)Lec3/l;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17196a {

    /* JADX INFO: renamed from: hd0.a$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.multiconsentscreen.presentation.reducers.MultiConsentViewStateReducer$reduce$1", m100430f = "MultiConsentViewStateReducer.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lgd0/c;", "currentState", "Ldd0/b;", "domainResult", "<anonymous>", "(Lgd0/c;Ldd0/b;)Lgd0/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f66020w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f66021x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f66022y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC15713c abstractC15713c, AbstractC11945b abstractC11945b, InterfaceC30057d<? super AbstractC15713c> interfaceC30057d) {
            a aVar = C17196a.this.new a(interfaceC30057d);
            aVar.f66021x = abstractC15713c;
            aVar.f66022y = abstractC11945b;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC15713c abstractC15713c = (AbstractC15713c) this.f66021x;
            AbstractC11945b abstractC11945b = (AbstractC11945b) this.f66022y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f66020w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC11945b instanceof AbstractC11945b.c) {
                return AbstractC15713c.b.f59204b;
            }
            if (abstractC11945b instanceof AbstractC11945b.d) {
                return AbstractC15713c.a.f59203b;
            }
            if (abstractC11945b instanceof AbstractC11945b.f) {
                return C17196a.this.m48548c((AbstractC11945b.f) abstractC11945b);
            }
            if (abstractC11945b instanceof AbstractC11945b.b) {
                return new AbstractC15713c.d(((AbstractC11945b.b) abstractC11945b).getFinalNavigationAction());
            }
            if (abstractC11945b instanceof AbstractC11945b.a) {
                if (abstractC15713c instanceof AbstractC15713c.e) {
                    return C17196a.this.m48550f((AbstractC15713c.e) abstractC15713c, (AbstractC11945b.a) abstractC11945b);
                }
            } else {
                if (!(abstractC11945b instanceof AbstractC11945b.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (abstractC15713c instanceof AbstractC15713c.e) {
                    AbstractC15713c.e eVar = (AbstractC15713c.e) abstractC15713c;
                    return AbstractC15713c.e.m44289c(eVar, null, null, null, AbstractC12889b.m36284n(((AbstractC11945b.e) abstractC11945b).getDirection() + eVar.getCurrentPageIndex(), 0, eVar.m44292e().size() - 1), null, 23, null);
                }
            }
            return abstractC15713c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final AbstractC15713c.e m48548c(AbstractC11945b.f domainResult) {
        ButtonModel button;
        List<ConsentResponse> consentModels = domainResult.getResponse().getConsentModels();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(consentModels, 10));
        Iterator<T> it = consentModels.iterator();
        while (it.hasNext()) {
            arrayList.add(m48549d((ConsentResponse) it.next()));
        }
        MultiConsentRequest multiConsentRequest = new MultiConsentRequest(domainResult.getResponse().getConsentVersions());
        ConsentResponse consentResponse = (ConsentResponse) AbstractC25265s.m74114R0(domainResult.getResponse().getConsentModels());
        return new AbstractC15713c.e(arrayList, multiConsentRequest, (consentResponse == null || (button = consentResponse.getButton()) == null) ? null : button.getDestination(), 0, C25272z.f99163w);
    }

    /* JADX INFO: renamed from: d */
    private final AbstractC29053d.a m48549d(ConsentResponse consentResponse) {
        String navigationTitle = consentResponse.getNavigationBar().getNavigationTitle();
        NavigationButtonModel navigationRightButton = consentResponse.getNavigationBar().getNavigationRightButton();
        C22383c.e eVar = new C22383c.e(navigationTitle, navigationRightButton != null ? new C22383c.f(null, navigationRightButton.getDestination()) : null);
        String title = consentResponse.getTitle();
        String description = consentResponse.getDescription();
        List<String> checkboxes = consentResponse.getCheckboxes();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(checkboxes, 10));
        Iterator<T> it = checkboxes.iterator();
        while (it.hasNext()) {
            arrayList.add(new C29051b((String) it.next(), false));
        }
        return new AbstractC29053d.a(eVar, title, description, arrayList, consentResponse.getButtonLabel(), new C29050a(consentResponse.getButton().getTextDisplay(), consentResponse.getButton().getDestination()), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final AbstractC15713c.e m48550f(AbstractC15713c.e currentState, AbstractC11945b.a domainResult) {
        boolean z4;
        LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0(currentState.m44291d());
        Map map = (Map) linkedHashMapM74003l0.get(Integer.valueOf(domainResult.getPageIndex()));
        LinkedHashMap linkedHashMapM74003l1 = map != null ? AbstractC25247g0.m74003l0(map) : new LinkedHashMap();
        linkedHashMapM74003l1.put(Integer.valueOf(domainResult.getCheckboxIndex()), Boolean.valueOf(domainResult.getIsChecked()));
        linkedHashMapM74003l0.put(Integer.valueOf(domainResult.getPageIndex()), linkedHashMapM74003l1);
        List<AbstractC29053d.a> listM44292e = currentState.m44292e();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM44292e, 10));
        int i13 = 0;
        for (Object obj : listM44292e) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            AbstractC29053d.a aVarM88304c = (AbstractC29053d.a) obj;
            if (i13 == domainResult.getPageIndex()) {
                Map map2 = (Map) linkedHashMapM74003l0.get(Integer.valueOf(i13));
                if (map2 == null) {
                    map2 = C25272z.f99163w;
                }
                List<C29051b> listM88308f = aVarM88304c.m88308f();
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM88308f, 10));
                int i15 = 0;
                for (Object obj2 : listM88308f) {
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    C29051b c29051b = (C29051b) obj2;
                    Boolean bool = (Boolean) map2.get(Integer.valueOf(i15));
                    arrayList2.add(C29051b.m88298b(c29051b, null, bool != null ? bool.booleanValue() : false, 1, null));
                    i15 = i16;
                }
                Iterable iterableM118950B = AbstractC37056f.m118950B(aVarM88304c.m88308f());
                if (!(iterableM118950B instanceof Collection) || !((Collection) iterableM118950B).isEmpty()) {
                    Iterator it = iterableM118950B.iterator();
                    while (true) {
                        if (!((C18283i) it).f71138y) {
                            z4 = true;
                            break;
                        }
                        if (!AbstractC22676k.m65745e(map2.get(Integer.valueOf(((AbstractC25243e0) it).nextInt())), Boolean.TRUE)) {
                            z4 = false;
                            break;
                        }
                    }
                } else {
                    z4 = true;
                    break;
                }
                aVarM88304c = AbstractC29053d.a.m88304c(aVarM88304c, null, null, null, arrayList2, null, null, z4, 55, null);
            }
            arrayList.add(aVarM88304c);
            i13 = i14;
        }
        return AbstractC15713c.e.m44289c(currentState, arrayList, null, null, 0, linkedHashMapM74003l0, 14, null);
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC13058l m48551e(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        AbstractC15713c.c cVar = AbstractC15713c.c.f59205b;
        AbstractC22676k.m65748h(cVar, "null cannot be cast to non-null type com.whoop.advancedlabs.multiconsentscreen.presentation.MultiConsentViewState");
        return new C13060l1(cVar, upstream, new a(null));
    }
}
