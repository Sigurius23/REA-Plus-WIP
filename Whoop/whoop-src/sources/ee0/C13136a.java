package ee0;

import ae0.AbstractC0789b;
import c31.C3927k;
import ce0.AbstractC4489d;
import ce0.C4486a;
import com.whoop.advancedlabs.domain.models.FormContent;
import com.whoop.advancedlabs.domain.models.SchedulingDatePickerModel;
import com.whoop.advancedlabs.domain.models.TestTileModel;
import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.tiles.EmptyTileModel;
import com.whoop.design.util.TextResource;
import de0.C11980a;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ge0.C15726a;
import ge0.C15731f;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.ArrayList;
import java.util.List;
import jb1.C21535a;
import l83.C23454a0;
import lf0.C23897a2;
import m83.AbstractC25267u;
import md0.AbstractC25448c;
import nd0.C26574a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33208p0;
import p736sz0.C33211q0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uv0.AbstractC35283c;

/* JADX INFO: renamed from: ee0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001c\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u001e¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010$¨\u0006%"}, m65681d2 = {"Lee0/a;", "", "Ljb1/a;", "reducer", "Lnd0/a;", "schedulingButtonStateFactory", "<init>", "(Ljb1/a;Lnd0/a;)V", "Lae0/b;", "domainResult", "Lce0/d;", "currentViewState", "b", "(Lae0/b;Lce0/d;)Lce0/d;", "Lae0/b$j;", "Lce0/d$c;", "d", "(Lae0/b$j;)Lce0/d$c;", "Lc31/k;", "currentButton", "", "isAppointmentSelected", "e", "(Lc31/k;Z)Lc31/k;", "Lce0/a;", "formContent", "Lde0/a;", "selectedAppointment", "f", "(Lce0/a;Lde0/a;)Lce0/a;", "Lec3/l;", "domainResults", "c", "(Lec3/l;)Lec3/l;", "a", "Ljb1/a;", "Lnd0/a;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13136a {

    /* JADX INFO: renamed from: c */
    public static final int f45437c = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a reducer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C26574a schedulingButtonStateFactory;

    /* JADX INFO: renamed from: ee0.a$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.schedulingform.presentation.reducers.SchedulingFormViewStateReducer$reduce$1", m100430f = "SchedulingFormViewStateReducer.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lce0/d;", "accumulator", "Lae0/b;", "domainResult", "<anonymous>", "(Lce0/d;Lae0/b;)Lce0/d;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f45440w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f45441x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f45442y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC4489d abstractC4489d, AbstractC0789b abstractC0789b, InterfaceC30057d<? super AbstractC4489d> interfaceC30057d) {
            a aVar = C13136a.this.new a(interfaceC30057d);
            aVar.f45441x = abstractC4489d;
            aVar.f45442y = abstractC0789b;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC4489d abstractC4489d = (AbstractC4489d) this.f45441x;
            AbstractC0789b abstractC0789b = (AbstractC0789b) this.f45442y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f45440w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return C13136a.this.m36761b(abstractC0789b, abstractC4489d);
        }
    }

    public C13136a(C21535a reducer, C26574a schedulingButtonStateFactory) {
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(schedulingButtonStateFactory, "schedulingButtonStateFactory");
        this.reducer = reducer;
        this.schedulingButtonStateFactory = schedulingButtonStateFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public final AbstractC4489d m36761b(AbstractC0789b domainResult, AbstractC4489d currentViewState) {
        if (domainResult instanceof AbstractC0789b.j) {
            return m36762d((AbstractC0789b.j) domainResult);
        }
        if (domainResult instanceof AbstractC0789b.d) {
            return AbstractC4489d.a.f18068b;
        }
        if (!(domainResult instanceof AbstractC0789b.b)) {
            if (domainResult instanceof AbstractC0789b.a) {
                if (currentViewState instanceof AbstractC4489d.c) {
                    AbstractC4489d.c cVar = (AbstractC4489d.c) currentViewState;
                    return AbstractC4489d.c.m14041c(cVar, null, null, null, null, m36764f(cVar.getFormContent(), null), m36763e(cVar.getButton(), false), null, null, null, false, null, null, null, 8015, null);
                }
            } else if (domainResult instanceof AbstractC0789b.f) {
                if (currentViewState instanceof AbstractC4489d.c) {
                    return AbstractC4489d.c.m14041c((AbstractC4489d.c) currentViewState, null, null, null, null, null, null, null, null, new C33211q0(null, AbstractC33208p0.f.f138478e, null, null, null, false, false, null, false, false, 1021, null), false, null, null, null, 7935, null);
                }
            } else if (domainResult instanceof AbstractC0789b.e) {
                if (currentViewState instanceof AbstractC4489d.c) {
                    return AbstractC4489d.c.m14041c((AbstractC4489d.c) currentViewState, null, null, null, null, null, null, null, null, ((AbstractC0789b.e) domainResult).getSuccess() ? new C33211q0(null, new AbstractC33208p0.h(null, 0L, null, 7, null), null, null, null, false, false, null, false, false, 1021, null) : new C33211q0(null, new AbstractC33208p0.b(new TextResource.C8688b(AbstractC35283c.f150170H, null, 2, null), false, null, 6, null), null, null, new TextResource.C8688b(AbstractC35283c.f150167E, null, 2, null), false, false, null, false, false, MessageListItemViewType.LOADING_INDICATOR, null), false, null, null, null, 7935, null);
                }
            } else if (domainResult instanceof AbstractC0789b.c) {
                if (currentViewState instanceof AbstractC4489d.c) {
                    return AbstractC4489d.c.m14041c((AbstractC4489d.c) currentViewState, null, null, null, null, null, null, null, null, null, false, null, null, null, 7935, null);
                }
            } else {
                if (domainResult instanceof AbstractC0789b.h) {
                    if (!(currentViewState instanceof AbstractC4489d.c)) {
                        return AbstractC4489d.b.f18069b;
                    }
                    AbstractC4489d.c cVar2 = (AbstractC4489d.c) currentViewState;
                    AbstractC0789b.h hVar = (AbstractC0789b.h) domainResult;
                    InfoCalloutTileModel headerInfoCallout = hVar.getFormContent().getHeaderInfoCallout();
                    InterfaceC25312u interfaceC25312uM60541h = headerInfoCallout != null ? this.reducer.m60541h(headerInfoCallout) : null;
                    SchedulingDatePickerModel schedulingDatePicker = hVar.getFormContent().getSchedulingDatePicker();
                    InterfaceC25312u interfaceC25312uM60541h2 = schedulingDatePicker != null ? this.reducer.m60541h(schedulingDatePicker) : null;
                    EmptyTileModel errorCard = hVar.getFormContent().getErrorCard();
                    return AbstractC4489d.c.m14041c(cVar2, null, null, null, null, new C4486a(interfaceC25312uM60541h, interfaceC25312uM60541h2, errorCard != null ? this.reducer.m60541h(errorCard) : null), null, null, null, null, false, null, null, null, 7663, null);
                }
                if (domainResult instanceof AbstractC0789b.g) {
                    return currentViewState instanceof AbstractC4489d.c ? AbstractC4489d.c.m14041c((AbstractC4489d.c) currentViewState, null, null, null, null, null, null, null, null, null, false, null, null, null, 7679, null) : AbstractC4489d.a.f18068b;
                }
                if (!(domainResult instanceof AbstractC0789b.i)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (currentViewState instanceof AbstractC4489d.c) {
                    return AbstractC4489d.c.m14041c((AbstractC4489d.c) currentViewState, null, null, null, null, null, null, null, null, null, ((AbstractC0789b.i) domainResult).getIsSearching(), null, null, null, 7679, null);
                }
            }
        } else if (currentViewState instanceof AbstractC4489d.c) {
            AbstractC0789b.b bVar = (AbstractC0789b.b) domainResult;
            C11980a c11980a = new C11980a(bVar.getSiteCode(), bVar.getCom.mapbox.common.HttpHeaders.DATE java.lang.String());
            AbstractC4489d.c cVar3 = (AbstractC4489d.c) currentViewState;
            return AbstractC4489d.c.m14041c(cVar3, null, null, null, null, m36764f(cVar3.getFormContent(), c11980a), m36763e(cVar3.getButton(), true), null, c11980a, null, false, null, null, null, 8015, null);
        }
        return currentViewState;
    }

    /* JADX INFO: renamed from: d */
    private final AbstractC4489d.c m36762d(AbstractC0789b.j jVar) {
        C4486a c4486a;
        String title = jVar.getResponse().getTitle();
        String subtitle = jVar.getResponse().getSubtitle();
        String searchHeaderDisplay = jVar.getResponse().getSearchHeaderDisplay();
        TestTileModel testTile = jVar.getResponse().getTestTile();
        InterfaceC25312u interfaceC25312uM60541h = testTile != null ? this.reducer.m60541h(testTile) : null;
        FormContent formContent = jVar.getResponse().getFormContent();
        if (formContent != null) {
            InfoCalloutTileModel headerInfoCallout = formContent.getHeaderInfoCallout();
            InterfaceC25312u interfaceC25312uM60541h2 = headerInfoCallout != null ? this.reducer.m60541h(headerInfoCallout) : null;
            SchedulingDatePickerModel schedulingDatePicker = formContent.getSchedulingDatePicker();
            InterfaceC25312u interfaceC25312uM60541h3 = schedulingDatePicker != null ? this.reducer.m60541h(schedulingDatePicker) : null;
            EmptyTileModel errorCard = formContent.getErrorCard();
            c4486a = new C4486a(interfaceC25312uM60541h2, interfaceC25312uM60541h3, errorCard != null ? this.reducer.m60541h(errorCard) : null);
        } else {
            c4486a = null;
        }
        return new AbstractC4489d.c(title, subtitle, searchHeaderDisplay, interfaceC25312uM60541h, c4486a, this.schedulingButtonStateFactory.m78748a(jVar.getResponse().getButton().getTextDisplay(), jVar.getResponse().getButton().getProgress(), false), jVar.getResponse().getButton().getDestination(), null, null, false, jVar.getEpisodeId(), jVar.getBiomarkerTestId(), jVar.getTestType(), 384, null);
    }

    /* JADX INFO: renamed from: e */
    private final C3927k m36763e(C3927k currentButton, boolean isAppointmentSelected) {
        return C3927k.m11937b(currentButton, null, null, null, null, null, null, 0, 0, null, isAppointmentSelected, false, null, null, null, null, null, null, 130559, null);
    }

    /* JADX INFO: renamed from: f */
    private final C4486a m36764f(C4486a formContent, C11980a selectedAppointment) {
        InterfaceC25312u schedulingDatePicker = null;
        if (formContent == null) {
            return null;
        }
        InterfaceC25312u schedulingDatePicker2 = formContent.getSchedulingDatePicker();
        C15731f c15731f = schedulingDatePicker2 instanceof C15731f ? (C15731f) schedulingDatePicker2 : null;
        if (c15731f != null) {
            List<C15726a> listM44340e = c15731f.m44340e();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM44340e, 10));
            for (C15726a c15726a : listM44340e) {
                List<InterfaceC25312u> listM44307e = c15726a.m44307e();
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM44307e, 10));
                for (Object objM70182b : listM44307e) {
                    if (objM70182b instanceof C23897a2) {
                        objM70182b = C23897a2.m70182b((C23897a2) objM70182b, null, null, null, null, null, null, null, null, null, false, 0, selectedAppointment, 2047, null);
                    }
                    arrayList2.add(objM70182b);
                }
                arrayList.add(C15726a.m44303b(c15726a, null, arrayList2, null, null, 13, null));
            }
            schedulingDatePicker = C15731f.m44337b(c15731f, null, arrayList, null, selectedAppointment, 5, null);
        }
        if (schedulingDatePicker == null) {
            schedulingDatePicker = formContent.getSchedulingDatePicker();
        }
        return C4486a.m14020b(formContent, null, schedulingDatePicker, null, 5, null);
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC13058l m36765c(InterfaceC13058l domainResults) {
        AbstractC22676k.m65750j(domainResults, "domainResults");
        AbstractC4489d.b bVar = AbstractC4489d.b.f18069b;
        AbstractC22676k.m65748h(bVar, "null cannot be cast to non-null type com.whoop.advancedlabs.schedulingform.presentation.SchedulingFormViewState");
        return new C13060l1(bVar, domainResults, new a(null));
    }

    public /* synthetic */ C13136a(C21535a c21535a, C26574a c26574a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC25448c.m74762z0() : c21535a, c26574a);
    }
}
