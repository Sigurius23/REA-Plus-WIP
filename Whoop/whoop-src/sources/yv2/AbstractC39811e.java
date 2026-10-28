package yv2;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.weightlifting.feature.onerepmax.manualentry.models.OneRepMaxConfirmDialog;
import com.whoop.weightlifting.feature.onerepmax.manualentry.models.OneRepMaxMeasurementModel;
import e93.AbstractC12889b;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.Function1;
import p720m91.InterfaceC25312u;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import yb3.AbstractC39414r;
import yv0.C39805h;
import zv2.C41166b;
import zv2.C41167c;
import zv2.C41170f;

/* JADX INFO: renamed from: yv2.e */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u001a\u0010\u0016\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u001a\u0010\u001c\u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;", "Ljava/time/LocalDate;", "today", "Lzv2/f;", "m", "(Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;Ljava/time/LocalDate;)Lzv2/f;", "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxConfirmDialog;", "Lzv2/b;", "k", "(Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxConfirmDialog;)Lzv2/b;", "", "l", "(Ljava/lang/String;)Ljava/time/LocalDate;", "Ltr2/n;", "a", "Ltr2/n;", "logger", "Ljb1/a;", "b", "Ljb1/a;", "e", "()Ljb1/a;", "oneRepMaxMeasurementDesignItemReducer", "Lm91/p;", "c", "Lm91/p;", "f", "()Lm91/p;", "oneRepMaxMeasurementDesignItemViewFactory", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39811e {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC34116n f171571a = InterfaceC34116n.INSTANCE.m107848a("OneRepMaxMeasurementReducer");

    /* JADX INFO: renamed from: b */
    private static final C21535a f171572b = AbstractC21537c.m60554d(new C39805h(1));

    /* JADX INFO: renamed from: c */
    private static final C25307p f171573c = Function1.m74306g(new C39805h(2));

    /* JADX INFO: renamed from: yv2.e$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f171574w;

        public a(p715kotlin.jvm.functions.Function1 function1) {
            this.f171574w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f171574w.invoke((OneRepMaxMeasurementModel) it);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final C21535a m127634e() {
        return f171572b;
    }

    /* JADX INFO: renamed from: f */
    public static final C25307p m127635f() {
        return f171573c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m127636g(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C39805h(3));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m127637h(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(OneRepMaxMeasurementModel.class), new a(new C39805h(4)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C41170f m127638i(OneRepMaxMeasurementModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m127643n(model, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m127639j(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        designItemViewFactory.m74324c().put(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C41170f.class), new C41167c());
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    private static final C41166b m127640k(OneRepMaxConfirmDialog oneRepMaxConfirmDialog) {
        return new C41166b(oneRepMaxConfirmDialog.getTitle(), oneRepMaxConfirmDialog.getDescription(), oneRepMaxConfirmDialog.getPrimaryButton(), oneRepMaxConfirmDialog.getSecondaryButton(), oneRepMaxConfirmDialog.getValuePrompt());
    }

    /* JADX INFO: renamed from: l */
    private static final LocalDate m127641l(String str) {
        if (str != null && !AbstractC39414r.m125890i0(str)) {
            try {
                return LocalDate.parse(str);
            } catch (DateTimeParseException e5) {
                f171571a.mo85230v("Unparseable one rep max date string", e5, new AbstractC30556a.a[0]);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b1  */
    /* JADX INFO: renamed from: m */
    public static final C41170f m127642m(OneRepMaxMeasurementModel oneRepMaxMeasurementModel, LocalDate today) {
        C41166b c41166bM127640k;
        AbstractC22676k.m65750j(oneRepMaxMeasurementModel, "<this>");
        AbstractC22676k.m65750j(today, "today");
        LocalDate localDateM127641l = m127641l(oneRepMaxMeasurementModel.getDateSection().getMinimumDate());
        String date = oneRepMaxMeasurementModel.getDateSection().getDate();
        LocalDate localDateM127641l2 = date != null ? m127641l(date) : null;
        if (localDateM127641l == null) {
            f171571a.mo85222m(AbstractC11266d.m30461o("Unparseable one rep max minimum_date: ", oneRepMaxMeasurementModel.getDateSection().getMinimumDate()), new AbstractC30556a.a[0]);
        }
        if (oneRepMaxMeasurementModel.getDateSection().getDate() != null && localDateM127641l2 == null) {
            f171571a.mo85222m(AbstractC11266d.m30461o("Unparseable one rep max date: ", oneRepMaxMeasurementModel.getDateSection().getDate()), new AbstractC30556a.a[0]);
        }
        if (localDateM127641l == null) {
            localDateM127641l = today;
        }
        LocalDate localDate = (LocalDate) AbstractC25265s.m74120X0(AbstractC25260n.m74077r0(new LocalDate[]{localDateM127641l, localDateM127641l2}));
        if (localDate == null) {
            localDate = today;
        }
        if (localDate.isAfter(today)) {
            localDate = today;
        }
        if (localDateM127641l2 == null) {
            localDateM127641l2 = today;
        }
        LocalDate localDate2 = (LocalDate) AbstractC12889b.m36289s(localDateM127641l2, localDate, today);
        String deleteButtonTitle = oneRepMaxMeasurementModel.getFooter().getDeleteButtonTitle();
        if (deleteButtonTitle == null || AbstractC39414r.m125890i0(deleteButtonTitle)) {
            deleteButtonTitle = null;
        }
        OneRepMaxConfirmDialog deleteConfirmDialog = oneRepMaxMeasurementModel.getFooter().getDeleteConfirmDialog();
        if (deleteConfirmDialog == null) {
            c41166bM127640k = null;
        } else {
            if (deleteButtonTitle == null) {
                deleteConfirmDialog = null;
            }
            if (deleteConfirmDialog != null) {
                c41166bM127640k = m127640k(deleteConfirmDialog);
            } else {
                c41166bM127640k = null;
            }
        }
        String titleDisplay = oneRepMaxMeasurementModel.getExerciseSummary().getTitleDisplay();
        String name = oneRepMaxMeasurementModel.getExerciseSummary().getName();
        String title = oneRepMaxMeasurementModel.getDateSection().getTitle();
        String datePrompt = oneRepMaxMeasurementModel.getDateSection().getDatePrompt();
        String string = localDate.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        String string2 = today.toString();
        AbstractC22676k.m65749i(string2, "toString(...)");
        String string3 = localDate2.toString();
        AbstractC22676k.m65749i(string3, "toString(...)");
        String title2 = oneRepMaxMeasurementModel.getValueSection().getTitle();
        String valueTitle = oneRepMaxMeasurementModel.getValueSection().getValueTitle();
        Integer value = oneRepMaxMeasurementModel.getValueSection().getValue();
        String strValueOf = value != null ? String.valueOf(value.intValue()) : null;
        if (strValueOf == null) {
            strValueOf = "";
        }
        String unit = oneRepMaxMeasurementModel.getValueSection().getUnit();
        int minValue = oneRepMaxMeasurementModel.getValueSection().getMinValue();
        int maxValue = oneRepMaxMeasurementModel.getValueSection().getMaxValue();
        String errorMessage = oneRepMaxMeasurementModel.getValueSection().getErrorMessage();
        String caption = oneRepMaxMeasurementModel.getFooter().getCaption();
        if (caption == null || AbstractC39414r.m125890i0(caption)) {
            caption = null;
        }
        return new C41170f(titleDisplay, name, title, datePrompt, string, string2, string3, title2, valueTitle, strValueOf, unit, minValue, maxValue, errorMessage, caption, oneRepMaxMeasurementModel.getFooter().getSaveButtonTitle(), c41166bM127640k != null ? deleteButtonTitle : null, m127640k(oneRepMaxMeasurementModel.getFooter().getSaveConfirmDialog()), c41166bM127640k, oneRepMaxMeasurementModel);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ C41170f m127643n(OneRepMaxMeasurementModel oneRepMaxMeasurementModel, LocalDate localDate, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            localDate = LocalDate.now();
            AbstractC22676k.m65749i(localDate, "now(...)");
        }
        return m127642m(oneRepMaxMeasurementModel, localDate);
    }
}
