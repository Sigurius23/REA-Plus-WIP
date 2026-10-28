package mo0;

import com.whoop.clinicianintheloop.domain.models.AppointmentButtonModel;
import com.whoop.clinicianintheloop.domain.models.AppointmentConfirmationCardModel;
import com.whoop.clinicianintheloop.domain.models.AppointmentSummaryFieldModel;
import com.whoop.clinicianintheloop.domain.models.AppointmentTimeInfoModel;
import com.whoop.clinicianintheloop.domain.models.ClinicianHeaderModel;
import com.whoop.clinicianintheloop.domain.models.ExpandableClinicianNoteModel;
import com.whoop.clinicianintheloop.domain.models.SchedulingOverviewCardModel;
import com.whoop.clinicianintheloop.domain.models.SchedulingOverviewStepModel;
import com.whoop.clinicianintheloop.domain.models.TappableIconModel;
import com.whoop.clinicianintheloop.domain.models.VisitDetailItemModel;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.ImageUrlModel;
import com.whoop.design.models.items.TagModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gy0.AbstractC16272a;
import gz0.AbstractC16315n0;
import hy0.C17749h0;
import hy0.C17750h1;
import hy0.EnumC17729c0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import kd1.AbstractC22403o;
import l83.C23454a0;
import lo0.C24568a;
import lo0.C24570b;
import lo0.C24572c;
import lo0.C24574d;
import lo0.C24576e;
import lo0.C24577e0;
import lo0.C24578f;
import lo0.C24595n0;
import lo0.C24597o0;
import lo0.C24599p0;
import lo0.C24611v0;
import m83.AbstractC25267u;
import md0.C25447b;
import no0.C26932a;
import no0.C26937b1;
import no0.C26938c;
import no0.C26945f;
import no0.C26953j;
import no0.C26959m;
import no0.C26976u0;
import no0.C26982x0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p716lb1.AbstractC23613d4;
import p716lb1.C23749z0;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.Function1;
import p720m91.InterfaceC25297f;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: mo0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001d\u001a\u00020\u001c*\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0013\u0010!\u001a\u00020 *\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"\u001a\u0013\u0010%\u001a\u00020$*\u00020#H\u0002¢\u0006\u0004\b%\u0010&\"\u001a\u0010,\u001a\u00020'8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0014\u0010.\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010)\"\u001a\u00104\u001a\u00020/8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00065"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;", "Llo0/e;", "B", "(Lcom/whoop/clinicianintheloop/domain/models/AppointmentTimeInfoModel;)Llo0/e;", "Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;", "Llo0/f;", "C", "(Lcom/whoop/clinicianintheloop/domain/models/ClinicianHeaderModel;)Llo0/f;", "Lhy0/h0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "()Lhy0/h0;", "Lcom/whoop/clinicianintheloop/domain/models/TappableIconModel;", "Llo0/p0;", "G", "(Lcom/whoop/clinicianintheloop/domain/models/TappableIconModel;)Llo0/p0;", "Lcom/whoop/clinicianintheloop/domain/models/AppointmentSummaryFieldModel;", "Llo0/d;", "A", "(Lcom/whoop/clinicianintheloop/domain/models/AppointmentSummaryFieldModel;)Llo0/d;", "Lcom/whoop/clinicianintheloop/domain/models/AppointmentConfirmationCardModel;", "Llo0/b;", "z", "(Lcom/whoop/clinicianintheloop/domain/models/AppointmentConfirmationCardModel;)Llo0/b;", "Lcom/whoop/clinicianintheloop/domain/models/SchedulingOverviewCardModel;", "Llo0/n0;", "E", "(Lcom/whoop/clinicianintheloop/domain/models/SchedulingOverviewCardModel;)Llo0/n0;", "Lcom/whoop/clinicianintheloop/domain/models/SchedulingOverviewStepModel;", "Llo0/o0;", "F", "(Lcom/whoop/clinicianintheloop/domain/models/SchedulingOverviewStepModel;)Llo0/o0;", "Lcom/whoop/clinicianintheloop/domain/models/VisitDetailItemModel;", "Llo0/v0;", "H", "(Lcom/whoop/clinicianintheloop/domain/models/VisitDetailItemModel;)Llo0/v0;", "Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;", "Llo0/e0;", "D", "(Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;)Llo0/e0;", "Ljb1/a;", "a", "Ljb1/a;", "x", "()Ljb1/a;", "clinicianIntakeDesignItemReducer", "b", "baseDesignItemReducer", "Lm91/p;", "c", "Lm91/p;", "y", "()Lm91/p;", "clinicianIntakeDesignItemViewFactory", "clinician-in-the-loop_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25739b {

    /* JADX INFO: renamed from: a */
    private static final C21535a f101433a = AbstractC21537c.m60554d(new C25447b(8));

    /* JADX INFO: renamed from: b */
    private static final C21535a f101434b = AbstractC21537c.m60555e(null, 1, null);

    /* JADX INFO: renamed from: c */
    private static final C25307p f101435c = Function1.m74306g(new C25447b(10));

    /* JADX INFO: renamed from: mo0.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f101436w;

        public a(p715kotlin.jvm.functions.Function1 function1) {
            this.f101436w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f101436w.invoke((ClinicianHeaderModel) it);
        }
    }

    /* JADX INFO: renamed from: mo0.b$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f101437w;

        public b(p715kotlin.jvm.functions.Function1 function1) {
            this.f101437w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f101437w.invoke((AppointmentTimeInfoModel) it);
        }
    }

    /* JADX INFO: renamed from: mo0.b$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f101438w;

        public c(p715kotlin.jvm.functions.Function1 function1) {
            this.f101438w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f101438w.invoke((AppointmentSummaryFieldModel) it);
        }
    }

    /* JADX INFO: renamed from: mo0.b$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f101439w;

        public d(p715kotlin.jvm.functions.Function1 function1) {
            this.f101439w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f101439w.invoke((AppointmentConfirmationCardModel) it);
        }
    }

    /* JADX INFO: renamed from: mo0.b$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f101440w;

        public e(p715kotlin.jvm.functions.Function1 function1) {
            this.f101440w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f101440w.invoke((SchedulingOverviewCardModel) it);
        }
    }

    /* JADX INFO: renamed from: mo0.b$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f101441w;

        public f(p715kotlin.jvm.functions.Function1 function1) {
            this.f101441w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f101441w.invoke((VisitDetailItemModel) it);
        }
    }

    /* JADX INFO: renamed from: mo0.b$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f101442w;

        public g(p715kotlin.jvm.functions.Function1 function1) {
            this.f101442w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f101442w.invoke((ExpandableClinicianNoteModel) it);
        }
    }

    /* JADX INFO: renamed from: mo0.b$h */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f101443w;

        public h(p715kotlin.jvm.functions.Function1 function1) {
            this.f101443w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f101443w.invoke((AppointmentButtonModel) it);
        }
    }

    /* JADX INFO: renamed from: A */
    private static final C24574d m75879A(AppointmentSummaryFieldModel appointmentSummaryFieldModel) {
        return new C24574d(appointmentSummaryFieldModel.getId(), AbstractC8693b.m21278l(appointmentSummaryFieldModel.getTitle()), AbstractC8693b.m21278l(appointmentSummaryFieldModel.getDescription()), appointmentSummaryFieldModel.getCta());
    }

    /* JADX INFO: renamed from: B */
    private static final C24576e m75880B(AppointmentTimeInfoModel appointmentTimeInfoModel) {
        String id4 = appointmentTimeInfoModel.getId();
        C24572c c24572c = new C24572c(AbstractC8693b.m21278l(appointmentTimeInfoModel.getDate().getMonth()), AbstractC8693b.m21278l(appointmentTimeInfoModel.getDate().getDay()));
        TextResource textResourceM21278l = AbstractC8693b.m21278l(appointmentTimeInfoModel.getTime());
        InterfaceC25312u interfaceC25312uM60544l = f101434b.m60544l(appointmentTimeInfoModel.getConfirmationTag());
        AbstractC22676k.m65748h(interfaceC25312uM60544l, "null cannot be cast to non-null type com.whoop.design.atomic.atom.TagState");
        return new C24576e(id4, c24572c, textResourceM21278l, (C17750h1) interfaceC25312uM60544l);
    }

    /* JADX INFO: renamed from: C */
    private static final C24578f m75881C(ClinicianHeaderModel clinicianHeaderModel) {
        C17749h0 c17749h0M75909w;
        C17750h1 c17750h1;
        String id4 = clinicianHeaderModel.getId();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(clinicianHeaderModel.getTitle());
        String subtitle = clinicianHeaderModel.getSubtitle();
        TextResource textResourceM21278l2 = subtitle != null ? AbstractC8693b.m21278l(subtitle) : null;
        ImageUrlModel headshot = clinicianHeaderModel.getHeadshot();
        if (headshot != null) {
            InterfaceC25312u interfaceC25312uM60544l = f101434b.m60544l(headshot);
            AbstractC22676k.m65748h(interfaceC25312uM60544l, "null cannot be cast to non-null type com.whoop.design.atomic.atom.ImageUrlViewState");
            c17749h0M75909w = (C17749h0) interfaceC25312uM60544l;
        } else {
            c17749h0M75909w = m75909w();
        }
        TagModel tag = clinicianHeaderModel.getTag();
        if (tag != null) {
            InterfaceC25312u interfaceC25312uM60544l2 = f101434b.m60544l(tag);
            AbstractC22676k.m65748h(interfaceC25312uM60544l2, "null cannot be cast to non-null type com.whoop.design.atomic.atom.TagState");
            c17750h1 = (C17750h1) interfaceC25312uM60544l2;
        } else {
            c17750h1 = null;
        }
        TappableIconModel icon = clinicianHeaderModel.getIcon();
        return new C24578f(id4, textResourceM21278l, textResourceM21278l2, c17749h0M75909w, c17750h1, icon != null ? m75885G(icon) : null, clinicianHeaderModel.getUseTileBackground());
    }

    /* JADX INFO: renamed from: D */
    private static final C24577e0 m75882D(ExpandableClinicianNoteModel expandableClinicianNoteModel) {
        String id4 = expandableClinicianNoteModel.getId();
        C21535a c21535a = f101433a;
        return new C24577e0(id4, c21535a.m60540g(expandableClinicianNoteModel.getStickyItems()), c21535a.m60540g(expandableClinicianNoteModel.getExpandableItems()), expandableClinicianNoteModel.isExpanded(), (float) Math.max(0.0d, expandableClinicianNoteModel.getCollapsedHeight()), AbstractC23613d4.m68666p(expandableClinicianNoteModel.getExpandButton()), AbstractC23613d4.m68666p(expandableClinicianNoteModel.getCollapseButton()), null);
    }

    /* JADX INFO: renamed from: E */
    private static final C24595n0 m75883E(SchedulingOverviewCardModel schedulingOverviewCardModel) {
        List<SchedulingOverviewStepModel> steps = schedulingOverviewCardModel.getSteps();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(steps, 10));
        Iterator<T> it = steps.iterator();
        while (it.hasNext()) {
            arrayList.add(m75884F((SchedulingOverviewStepModel) it.next()));
        }
        return new C24595n0(arrayList);
    }

    /* JADX INFO: renamed from: F */
    private static final C24597o0 m75884F(SchedulingOverviewStepModel schedulingOverviewStepModel) {
        return new C24597o0(schedulingOverviewStepModel.getId(), AbstractC16315n0.m46379d(schedulingOverviewStepModel.getIcon(), null, 1, null), AbstractC8693b.m21278l(schedulingOverviewStepModel.getText()));
    }

    /* JADX INFO: renamed from: G */
    private static final C24599p0 m75885G(TappableIconModel tappableIconModel) {
        return new C24599p0(AbstractC16315n0.m46379d(tappableIconModel.getIcon(), null, 1, null), tappableIconModel.getModal(), null, 4, null);
    }

    /* JADX INFO: renamed from: H */
    private static final C24611v0 m75886H(VisitDetailItemModel visitDetailItemModel) {
        C17750h1 c17750h1;
        String title = visitDetailItemModel.getTitle();
        String subtitle = visitDetailItemModel.getSubtitle();
        String imageUrl = visitDetailItemModel.getImageUrl();
        AbstractC22403o.c cVar = imageUrl != null ? new AbstractC22403o.c(imageUrl, 0, 0, 0, 14, null) : null;
        TagModel endTag = visitDetailItemModel.getEndTag();
        if (endTag != null) {
            InterfaceC25312u interfaceC25312uM60544l = f101434b.m60544l(endTag);
            AbstractC22676k.m65748h(interfaceC25312uM60544l, "null cannot be cast to non-null type com.whoop.design.atomic.atom.TagState");
            c17750h1 = (C17750h1) interfaceC25312uM60544l;
        } else {
            c17750h1 = null;
        }
        String endIcon = visitDetailItemModel.getEndIcon();
        return new C24611v0(title, subtitle, cVar, c17750h1, endIcon != null ? AbstractC16315n0.m46379d(endIcon, null, 1, null) : null, visitDetailItemModel.getDestination(), f101433a.m60540g(visitDetailItemModel.getItems()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m75898l(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C25447b(11));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m75899m(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        C25447b c25447b = new C25447b(12);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ClinicianHeaderModel.class), new a(c25447b));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(AppointmentTimeInfoModel.class), new b(new C25447b(13)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(AppointmentSummaryFieldModel.class), new c(new C25447b(14)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(AppointmentConfirmationCardModel.class), new d(new C25447b(15)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(SchedulingOverviewCardModel.class), new e(new C25447b(16)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(VisitDetailItemModel.class), new f(new C25447b(17)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ExpandableClinicianNoteModel.class), new g(new C25447b(18)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(AppointmentButtonModel.class), new h(new C25447b(9)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C24578f m75900n(ClinicianHeaderModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m75881C(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C24576e m75901o(AppointmentTimeInfoModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m75880B(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C24574d m75902p(AppointmentSummaryFieldModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m75879A(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C24570b m75903q(AppointmentConfirmationCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m75912z(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C24595n0 m75904r(SchedulingOverviewCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m75883E(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C24611v0 m75905s(VisitDetailItemModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m75886H(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C24577e0 m75906t(ExpandableClinicianNoteModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m75882D(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C24568a m75907u(AppointmentButtonModel model) {
        AbstractC22676k.m65750j(model, "model");
        return AbstractC25738a.m75878a(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m75908v(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        Map<InterfaceC21461d, InterfaceC25297f<?>> mapM74324c = designItemViewFactory.m74324c();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        mapM74324c.put(c22673i0.getOrCreateKotlinClass(C24568a.class), new C26932a());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C24570b.class), new C26938c());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C24574d.class), new C26945f());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C24576e.class), new C26953j());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C24578f.class), new C26959m());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C24577e0.class), new C26976u0());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C24595n0.class), new C26982x0());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C24611v0.class), new C26937b1());
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    private static final C17749h0 m75909w() {
        return new C17749h0(new AbstractC22403o.a(AbstractC16272a.f61896B2), null, EnumC17729c0.CENTER, null, null, null, false, 122, null);
    }

    /* JADX INFO: renamed from: x */
    public static final C21535a m75910x() {
        return f101433a;
    }

    /* JADX INFO: renamed from: y */
    public static final C25307p m75911y() {
        return f101435c;
    }

    /* JADX INFO: renamed from: z */
    private static final C24570b m75912z(AppointmentConfirmationCardModel appointmentConfirmationCardModel) {
        return new C24570b(appointmentConfirmationCardModel.getId(), f101433a.m60540g(appointmentConfirmationCardModel.getItems()));
    }
}
