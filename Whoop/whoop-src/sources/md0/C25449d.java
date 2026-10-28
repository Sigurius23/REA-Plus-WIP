package md0;

import com.whoop.advancedlabs.domain.models.AdvanceLabsStickyModel;
import com.whoop.advancedlabs.domain.models.AdvancedLabsAnalyticsDomainModel;
import com.whoop.advancedlabs.domain.models.AdvancedLabsResponse;
import com.whoop.advancedlabs.domain.models.AdvancedLabsSectionModel;
import com.whoop.advancedlabs.domain.models.AttendedAppointmentDialogModel;
import com.whoop.advancedlabs.domain.models.MetaData;
import com.whoop.advancedlabs.domain.models.NavigationButtonModel;
import com.whoop.coacheverywherecommon.models.AbstractC6219a;
import com.whoop.coacheverywherecommon.models.AiContextMetadata;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import e81.C12827f0;
import ep0.C13404j;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jb1.C21535a;
import kd0.C22383c;
import kd0.InterfaceC22381a;
import kf0.C22436k;
import lf0.C23972t1;
import m83.AbstractC25267u;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.C33205o0;
import q31.C29943a;
import q31.C29948f;
import sb0.C32342c;
import sb0.InterfaceC32340a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: md0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\u0007*\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010!¨\u0006\""}, m65681d2 = {"Lmd0/d;", "", "Ljb1/a;", "reducer", "<init>", "(Ljb1/a;)V", "Lsb0/a$a;", "Lkd0/c;", "e", "(Lsb0/a$a;)Lkd0/c;", "Lsb0/c;", "Lkd0/c$a;", "dialog", "f", "(Lsb0/c;Lkd0/c$a;)Lkd0/c;", "Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;", "Lkd0/c$b;", "d", "(Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;)Lkd0/c$b;", "Lq31/f;", "item", "", "selectedSegmentId", "a", "(Lq31/f;Ljava/lang/String;)Lq31/f;", "", "Lm91/u;", "items", "b", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "domainResult", "c", "(Lsb0/c;)Lkd0/c;", "Ljb1/a;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25449d {

    /* JADX INFO: renamed from: b */
    public static final int f99683b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a reducer;

    public C25449d(C21535a reducer) {
        AbstractC22676k.m65750j(reducer, "reducer");
        this.reducer = reducer;
    }

    /* JADX INFO: renamed from: a */
    private final C29948f m74797a(C29948f item, String selectedSegmentId) {
        Iterator<C29943a> it = item.m91612e().iterator();
        int initiallySelectedSegmentIndex = 0;
        while (true) {
            if (!it.hasNext()) {
                initiallySelectedSegmentIndex = -1;
                break;
            }
            if (AbstractC22676k.m65745e(it.next().getId(), selectedSegmentId)) {
                break;
            }
            initiallySelectedSegmentIndex++;
        }
        if (initiallySelectedSegmentIndex < 0) {
            initiallySelectedSegmentIndex = item.getInitiallySelectedSegmentIndex();
        }
        return C29948f.m91609b(item, null, null, initiallySelectedSegmentIndex, null, false, 27, null);
    }

    /* JADX INFO: renamed from: b */
    private final List<InterfaceC25312u> m74798b(List<? extends InterfaceC25312u> items, String selectedSegmentId) {
        List<? extends InterfaceC25312u> list = items;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (Object objM64731b : list) {
            if (objM64731b instanceof C22436k) {
                C22436k c22436k = (C22436k) objM64731b;
                List<InterfaceC25312u> listM64734e = c22436k.m64734e();
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM64734e, 10));
                for (Object objM74797a : listM64734e) {
                    if ((objM74797a instanceof C29948f) && selectedSegmentId != null) {
                        objM74797a = m74797a((C29948f) objM74797a, selectedSegmentId);
                    }
                    arrayList2.add(objM74797a);
                }
                objM64731b = C22436k.m64731b(c22436k, null, null, null, arrayList2, 7, null);
            }
            arrayList.add(objM64731b);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    private final C22383c.b m74799d(AttendedAppointmentDialogModel attendedAppointmentDialogModel) {
        TextResource textResourceM21278l = AbstractC8693b.m21278l(attendedAppointmentDialogModel.getTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(attendedAppointmentDialogModel.getDescription());
        InterfaceC25312u interfaceC25312uM60541h = this.reducer.m60541h(attendedAppointmentDialogModel.getPrimaryButton());
        AbstractC22676k.m65748h(interfaceC25312uM60541h, "null cannot be cast to non-null type com.whoop.design.atomic.atom.button.CardButtonState");
        InterfaceC25312u interfaceC25312uM60541h2 = this.reducer.m60541h(attendedAppointmentDialogModel.getSecondaryButton());
        AbstractC22676k.m65748h(interfaceC25312uM60541h2, "null cannot be cast to non-null type com.whoop.design.atomic.atom.button.CardButtonState");
        return new C22383c.b(textResourceM21278l, textResourceM21278l2, (C27256h) interfaceC25312uM60541h, (C27256h) interfaceC25312uM60541h2);
    }

    /* JADX INFO: renamed from: e */
    private final C22383c m74800e(InterfaceC32340a.a aVar) {
        if (aVar instanceof InterfaceC32340a.b) {
            return new C22383c(null, new C22383c.d(C33205o0.f138451a.m105288b(), null, null, null, 14, null), null, 5, null);
        }
        if (aVar instanceof InterfaceC32340a.c) {
            return new C22383c(null, new C22383c.d(C33205o0.f138451a.m105289c(), InterfaceC22381a.k0.f87421a, null, InterfaceC22381a.t.f87445a, 4, null), null, 5, null);
        }
        if (aVar instanceof InterfaceC32340a.d) {
            return new C22383c(null, new C22383c.d(C33205o0.f138451a.m105291e(), InterfaceC22381a.k0.f87421a, null, InterfaceC22381a.t.f87445a, 4, null), null, 5, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: f */
    private final C22383c m74801f(C32342c c32342c, C22383c.a aVar) {
        C22383c.g gVar;
        C22383c.f fVar;
        EnumC16313m0 enumC16313m0;
        AiContextMetadata aiContextMetadata;
        Map<String, AdvanceLabsStickyModel> bottomStickyItems;
        AdvancedLabsResponse response = c32342c.getResponse();
        AdvanceLabsStickyModel advanceLabsStickyModel = (response == null || (bottomStickyItems = response.getBottomStickyItems()) == null) ? null : bottomStickyItems.get(c32342c.getSelectedSegmentId());
        C22383c.h hVar = advanceLabsStickyModel != null ? new C22383c.h(advanceLabsStickyModel.getText(), m74798b(this.reducer.m60540g(advanceLabsStickyModel.getItems()), c32342c.getSelectedSegmentId())) : null;
        AdvancedLabsResponse response2 = c32342c.getResponse();
        if (response2 != null) {
            MetaData metadata = response2.getMetadata();
            C13404j c13404jM18523a = (metadata == null || (aiContextMetadata = metadata.getAiContextMetadata()) == null) ? null : AbstractC6219a.m18523a(aiContextMetadata);
            String navigationTitle = response2.getNavigationBar().getNavigationTitle();
            NavigationButtonModel navigationRightButton = response2.getNavigationBar().getNavigationRightButton();
            if (navigationRightButton != null) {
                String icon = navigationRightButton.getIcon();
                EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
                int length = enumC16313m0ArrValues.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        enumC16313m0 = null;
                        break;
                    }
                    enumC16313m0 = enumC16313m0ArrValues[i13];
                    if (AbstractC22676k.m65745e(enumC16313m0.name(), icon)) {
                        break;
                    }
                    i13++;
                }
                fVar = new C22383c.f(enumC16313m0, navigationRightButton.getDestination());
            } else {
                fVar = null;
            }
            C22383c.e eVar = new C22383c.e(navigationTitle, fVar);
            List<AdvancedLabsSectionModel> sections = response2.getSections();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(sections, 10));
            Iterator<T> it = sections.iterator();
            while (it.hasNext()) {
                InterfaceC25312u interfaceC25312uM60541h = this.reducer.m60541h((AdvancedLabsSectionModel) it.next());
                if (interfaceC25312uM60541h instanceof C22436k) {
                    C22436k c22436k = (C22436k) interfaceC25312uM60541h;
                    List<InterfaceC25312u> listM64734e = c22436k.m64734e();
                    ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM64734e, 10));
                    for (Object objM70709b : listM64734e) {
                        if (objM70709b instanceof C23972t1) {
                            C23972t1 c23972t1 = (C23972t1) objM70709b;
                            objM70709b = C23972t1.m70709b(c23972t1, null, C12827f0.m35961b(c23972t1.getPieChart(), null, true, null, 5, null), null, null, null, null, 61, null);
                        }
                        arrayList2.add(objM70709b);
                    }
                    interfaceC25312uM60541h = C22436k.m64731b(c22436k, null, null, null, arrayList2, 7, null);
                }
                arrayList.add(new C22383c.c(m74798b(AbstractC37056f.m118958J(interfaceC25312uM60541h), c32342c.getSelectedSegmentId())));
            }
            AdvancedLabsAnalyticsDomainModel analytics = response2.getAnalytics();
            boolean displayRefreshingSpinner = c32342c.getDisplayRefreshingSpinner();
            String selectedSegmentId = c32342c.getSelectedSegmentId();
            AttendedAppointmentDialogModel attendedAppointmentDialog = response2.getAttendedAppointmentDialog();
            gVar = new C22383c.g(c13404jM18523a, eVar, arrayList, analytics, displayRefreshingSpinner, hVar, selectedSegmentId, attendedAppointmentDialog != null ? m74799d(attendedAppointmentDialog) : null, null, 256, null);
        } else {
            gVar = null;
        }
        return new C22383c(aVar, null, gVar, 2, null);
    }

    /* JADX INFO: renamed from: c */
    public final C22383c m74802c(C32342c domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        return domainResult.getCurrentDialogType() instanceof InterfaceC32340a.a ? m74800e((InterfaceC32340a.a) domainResult.getCurrentDialogType()) : m74801f(domainResult, null);
    }

    public /* synthetic */ C25449d(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC25448c.m74762z0() : c21535a);
    }
}
