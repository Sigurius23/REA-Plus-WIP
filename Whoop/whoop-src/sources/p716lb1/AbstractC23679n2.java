package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.DesignSystemModelKt;
import com.whoop.design.models.items.JournalEntryStatus;
import com.whoop.design.models.items.JournalEntryWidgetModel;
import com.whoop.design.models.items.JournalQuestionChoice;
import com.whoop.design.models.items.JournalQuestionNumericInputModel;
import com.whoop.design.models.items.JournalQuestionSliderModel;
import com.whoop.design.models.items.JournalQuestionStepperModel;
import com.whoop.design.models.items.JournalQuestionTimeInputModel;
import com.whoop.design.models.items.JournalQuestionTimeSliderModel;
import com.whoop.design.models.items.JournalQuestionYesNoModel;
import com.whoop.design.util.AbstractC8693b;
import e93.AbstractC12889b;
import hy0.C17736e;
import i93.InterfaceC18280f;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.common.helper.DefaultDateFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jb1.AbstractC21537c;
import l21.C23239c;
import l83.C23454a0;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25272z;
import n83.C26460c;
import org.joda.time.DateTime;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import w71.AbstractC36882f0;
import w71.C36906y;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: lb1.n2 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0003\u001a!\u0010\n\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\f*\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0003\u001a\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0013*\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u001a\u0010!\u001a\u00020\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m65681d2 = {"Lcom/whoop/design/models/DesignSystemModel;", "Lw71/y;", "m", "(Lcom/whoop/design/models/DesignSystemModel;)Lw71/y;", "j", "", "Lcom/whoop/design/models/items/JournalQuestionChoice;", "", "value", "", "f", "(Ljava/util/List;I)Ljava/lang/String;", "", "i", "(Ljava/util/List;)Ljava/util/Map;", "Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;", "g", "(Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;)Lw71/y;", "l", "", "k", "(Lcom/whoop/design/models/DesignSystemModel;)Ljava/lang/Long;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;)Ljava/lang/Long;", "Ltr2/n;", "a", "Ltr2/n;", "logger", "Llb1/y0;", "b", "Llb1/y0;", "c", "()Llb1/y0;", "journalEntryWidgetMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23679n2 {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC34116n f93885a = InterfaceC34116n.INSTANCE.m107848a("JournalEntryWidgetMapper");

    /* JADX INFO: renamed from: b */
    private static final C23743y0 f93886b = Function1.m68251a(new C23670m(24));

    /* JADX INFO: renamed from: lb1.n2$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93887w;

        public a(Function1 function1) {
            this.f93887w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93887w.invoke((JournalEntryWidgetModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C23743y0 m69140c() {
        return f93886b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m69141d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(JournalEntryWidgetModel.class), new a(new C23670m(25)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23239c m69142e(JournalEntryWidgetModel model) {
        List<JournalQuestionChoice> choices;
        DesignSystemModel designSystemModelUnwrap;
        AbstractC22676k.m65750j(model, "model");
        Map<Integer, String> mapM69146i = null;
        InterfaceC25312u interfaceC25312uM60544l = AbstractC21537c.m60555e(null, 1, null).m60544l(model.getButton());
        DesignSystemModel timeQuestion = model.getTimeQuestion();
        DesignSystemModel designSystemModelUnwrap2 = timeQuestion != null ? DesignSystemModelKt.unwrap(timeQuestion) : null;
        C36906y c36906yM69149l = designSystemModelUnwrap2 != null ? m69149l(designSystemModelUnwrap2) : null;
        DesignSystemModel magnitudeQuestion = model.getMagnitudeQuestion();
        DesignSystemModel designSystemModelUnwrap3 = magnitudeQuestion != null ? DesignSystemModelKt.unwrap(magnitudeQuestion) : null;
        DesignSystemModel answeredYesQuestion = model.getAnsweredYesQuestion();
        List listM74077r0 = AbstractC25260n.m74077r0(new C36906y[]{(answeredYesQuestion == null || (designSystemModelUnwrap = DesignSystemModelKt.unwrap(answeredYesQuestion)) == null) ? null : m69150m(designSystemModelUnwrap), designSystemModelUnwrap3 != null ? m69147j(designSystemModelUnwrap3) : null, c36906yM69149l});
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        C36906y c36906y = (C36906y) AbstractC25265s.m74100H0(listM74077r0);
        if (c36906y != null) {
            c26460cM119000x.add(c36906y);
        }
        if (((ArrayList) listM74077r0).size() > 1) {
            c26460cM119000x.add(new C17736e(null, null, null, 7, null));
        }
        c26460cM119000x.addAll(AbstractC25265s.m74161z0(listM74077r0, 1));
        C26460c c26460cM118988k = AbstractC37056f.m118988k(c26460cM119000x);
        String id4 = model.getId();
        String title = model.getTitle();
        boolean z4 = model.getStatus() == JournalEntryStatus.COMPLETED;
        Long lM69148k = c36906yM69149l != null ? m69148k(designSystemModelUnwrap2) : null;
        JournalQuestionSliderModel journalQuestionSliderModel = designSystemModelUnwrap3 instanceof JournalQuestionSliderModel ? (JournalQuestionSliderModel) designSystemModelUnwrap3 : null;
        if (journalQuestionSliderModel != null && (choices = journalQuestionSliderModel.getChoices()) != null) {
            mapM69146i = m69146i(choices);
        }
        if (mapM69146i == null) {
            mapM69146i = C25272z.f99163w;
        }
        return new C23239c(id4, title, c26460cM118988k, interfaceC25312uM60544l, z4, lM69148k, mapM69146i);
    }

    /* JADX INFO: renamed from: f */
    private static final String m69143f(List<JournalQuestionChoice> list, int i13) {
        Object next;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((int) ((JournalQuestionChoice) next).getValue()) != i13);
        JournalQuestionChoice journalQuestionChoice = (JournalQuestionChoice) next;
        String label = journalQuestionChoice != null ? journalQuestionChoice.getLabel() : null;
        return label == null ? "" : label;
    }

    /* JADX INFO: renamed from: g */
    private static final C36906y m69144g(JournalQuestionNumericInputModel journalQuestionNumericInputModel) {
        Double minimumInclusive = journalQuestionNumericInputModel.getMinimumInclusive();
        if (minimumInclusive != null) {
            double dDoubleValue = minimumInclusive.doubleValue();
            Double maximumInclusive = journalQuestionNumericInputModel.getMaximumInclusive();
            if (maximumInclusive != null) {
                double dDoubleValue2 = maximumInclusive.doubleValue();
                if (Math.abs(dDoubleValue) <= Double.MAX_VALUE && Math.abs(dDoubleValue2) <= Double.MAX_VALUE && dDoubleValue >= 0.0d && dDoubleValue <= dDoubleValue2 && journalQuestionNumericInputModel.getDecimalPlaces() >= 0) {
                    InterfaceC18280f interfaceC18280fM69581a = AbstractC23727v2.m69581a(dDoubleValue, dDoubleValue2, journalQuestionNumericInputModel.getDecimalPlaces());
                    if (interfaceC18280fM69581a == null) {
                        InterfaceC34116n interfaceC34116n = f93885a;
                        int decimalPlaces = journalQuestionNumericInputModel.getDecimalPlaces();
                        StringBuilder sbM8306s = AbstractC2875y.m8306s("Numeric-input range collapses once aligned: min=", dDoubleValue, " max=");
                        sbM8306s.append(dDoubleValue2);
                        sbM8306s.append(" decimalPlaces=");
                        sbM8306s.append(decimalPlaces);
                        interfaceC34116n.mo85222m(sbM8306s.toString(), new AbstractC30556a.a[0]);
                        return null;
                    }
                    if (journalQuestionNumericInputModel.getInitial() != null && (!interfaceC18280fM69581a.mo52654c(journalQuestionNumericInputModel.getInitial()) || !AbstractC23727v2.m69582b(journalQuestionNumericInputModel.getInitial().doubleValue(), journalQuestionNumericInputModel.getDecimalPlaces()))) {
                        f93885a.mo85222m("Numeric-input initial " + journalQuestionNumericInputModel.getInitial() + " is outside or off the grid of " + interfaceC18280fM69581a, new AbstractC30556a.a[0]);
                        return null;
                    }
                    String label = journalQuestionNumericInputModel.getLabel();
                    String units = journalQuestionNumericInputModel.getUnits();
                    String str = units == null ? "" : units;
                    Double initial = journalQuestionNumericInputModel.getInitial();
                    Double d3 = (Double) interfaceC18280fM69581a.getStart();
                    Double d14 = (Double) interfaceC18280fM69581a.mo52651d();
                    int decimalPlaces2 = journalQuestionNumericInputModel.getDecimalPlaces();
                    String units2 = journalQuestionNumericInputModel.getUnits();
                    return new C36906y(1, null, label, str, false, false, new AbstractC36882f0.b(initial, d3, d14, decimalPlaces2, units2 == null ? "" : units2), null, null, null, 946, null);
                }
                InterfaceC34116n interfaceC34116n2 = f93885a;
                int decimalPlaces3 = journalQuestionNumericInputModel.getDecimalPlaces();
                StringBuilder sbM8306s2 = AbstractC2875y.m8306s("Unusable numeric-input bounds in journal entry widget: min=", dDoubleValue, " max=");
                sbM8306s2.append(dDoubleValue2);
                sbM8306s2.append(" decimalPlaces=");
                sbM8306s2.append(decimalPlaces3);
                interfaceC34116n2.mo85222m(sbM8306s2.toString(), new AbstractC30556a.a[0]);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    private static final Long m69145h(String str) {
        try {
            return Long.valueOf(DateTime.parse(str).getMillis());
        } catch (IllegalArgumentException e5) {
            f93885a.mo85230v(AbstractC11266d.m30461o("Unparseable ISO-8601 instant in journal entry widget: ", str), e5, new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    private static final Map<Integer, String> m69146i(List<JournalQuestionChoice> list) {
        List<JournalQuestionChoice> list2 = list;
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list2, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (JournalQuestionChoice journalQuestionChoice : list2) {
            linkedHashMap.put(Integer.valueOf((int) journalQuestionChoice.getValue()), journalQuestionChoice.getLabel());
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: j */
    private static final C36906y m69147j(DesignSystemModel designSystemModel) {
        if (designSystemModel instanceof JournalQuestionStepperModel) {
            JournalQuestionStepperModel journalQuestionStepperModel = (JournalQuestionStepperModel) designSystemModel;
            String label = journalQuestionStepperModel.getLabel();
            Double initial = journalQuestionStepperModel.getInitial();
            return new C36906y(1, null, label, null, false, false, new AbstractC36882f0.d(initial != null ? Integer.valueOf((int) initial.doubleValue()) : null, (int) journalQuestionStepperModel.getMinimumInclusive(), (int) journalQuestionStepperModel.getMaximumInclusive()), null, null, null, 954, null);
        }
        if (designSystemModel instanceof JournalQuestionNumericInputModel) {
            return m69144g((JournalQuestionNumericInputModel) designSystemModel);
        }
        if (!(designSystemModel instanceof JournalQuestionSliderModel)) {
            return null;
        }
        JournalQuestionSliderModel journalQuestionSliderModel = (JournalQuestionSliderModel) designSystemModel;
        List<JournalQuestionChoice> choices = journalQuestionSliderModel.getChoices();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(choices, 10));
        Iterator<T> it = choices.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf((int) ((JournalQuestionChoice) it.next()).getValue()));
        }
        Double initial2 = journalQuestionSliderModel.getInitial();
        Integer numValueOf = initial2 != null ? Integer.valueOf((int) initial2.doubleValue()) : (Integer) AbstractC25265s.m74120X0(arrayList);
        String label2 = journalQuestionSliderModel.getLabel();
        Integer num = (Integer) AbstractC25265s.m74120X0(arrayList);
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = (Integer) AbstractC25265s.m74115S0(arrayList);
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        String strM69143f = numValueOf != null ? m69143f(journalQuestionSliderModel.getChoices(), numValueOf.intValue()) : null;
        if (strM69143f == null) {
            strM69143f = "";
        }
        return new C36906y(1, null, label2, null, false, false, new AbstractC36882f0.e(numValueOf, iIntValue, iIntValue2, 0, strM69143f, 8, null), null, null, null, 954, null);
    }

    /* JADX INFO: renamed from: k */
    private static final Long m69148k(DesignSystemModel designSystemModel) {
        String initial;
        String initial2;
        Long lM69145h;
        if (!(designSystemModel instanceof JournalQuestionTimeSliderModel)) {
            if (!(designSystemModel instanceof JournalQuestionTimeInputModel) || (initial = ((JournalQuestionTimeInputModel) designSystemModel).getInitial()) == null) {
                return null;
            }
            return m69145h(initial);
        }
        JournalQuestionTimeSliderModel journalQuestionTimeSliderModel = (JournalQuestionTimeSliderModel) designSystemModel;
        Long lM69145h2 = m69145h(journalQuestionTimeSliderModel.getLowerBound());
        Long lM69145h3 = m69145h(journalQuestionTimeSliderModel.getUpperBound());
        if (lM69145h2 == null || lM69145h3 == null || (initial2 = journalQuestionTimeSliderModel.getInitial()) == null || (lM69145h = m69145h(initial2)) == null) {
            return null;
        }
        return Long.valueOf(AbstractC12889b.m36286p(lM69145h.longValue(), Math.min(lM69145h2.longValue(), lM69145h3.longValue()), Math.max(lM69145h2.longValue(), lM69145h3.longValue())));
    }

    /* JADX INFO: renamed from: l */
    private static final C36906y m69149l(DesignSystemModel designSystemModel) {
        Long lM69145h;
        Long lM69145h2;
        String string = null;
        if (designSystemModel instanceof JournalQuestionTimeSliderModel) {
            JournalQuestionTimeSliderModel journalQuestionTimeSliderModel = (JournalQuestionTimeSliderModel) designSystemModel;
            Long lM69145h3 = m69145h(journalQuestionTimeSliderModel.getLowerBound());
            Long lM69145h4 = m69145h(journalQuestionTimeSliderModel.getUpperBound());
            if (lM69145h3 == null || lM69145h4 == null) {
                return null;
            }
            String initial = journalQuestionTimeSliderModel.getInitial();
            long jLongValue = (initial == null || (lM69145h2 = m69145h(initial)) == null) ? lM69145h3.longValue() : lM69145h2.longValue();
            return new C36906y(2, null, journalQuestionTimeSliderModel.getLabel(), null, false, false, new AbstractC36882f0.g(AbstractC8693b.m21278l(new DateTime(jLongValue).toString(DefaultDateFormatter.TIME_FORMAT_12H)), lM69145h3.longValue(), lM69145h4.longValue(), jLongValue), null, null, null, 954, null);
        }
        if (!(designSystemModel instanceof JournalQuestionTimeInputModel)) {
            return null;
        }
        JournalQuestionTimeInputModel journalQuestionTimeInputModel = (JournalQuestionTimeInputModel) designSystemModel;
        String label = journalQuestionTimeInputModel.getLabel();
        String initial2 = journalQuestionTimeInputModel.getInitial();
        if (initial2 != null && (lM69145h = m69145h(initial2)) != null) {
            string = new DateTime(lM69145h.longValue()).toString(DefaultDateFormatter.TIME_FORMAT_12H);
        }
        if (string == null) {
            string = "";
        }
        return new C36906y(2, null, label, null, false, false, new AbstractC36882f0.f(string), null, null, null, 954, null);
    }

    /* JADX INFO: renamed from: m */
    private static final C36906y m69150m(DesignSystemModel designSystemModel) {
        JournalQuestionYesNoModel journalQuestionYesNoModel = designSystemModel instanceof JournalQuestionYesNoModel ? (JournalQuestionYesNoModel) designSystemModel : null;
        if (journalQuestionYesNoModel == null) {
            return null;
        }
        return new C36906y(0, null, journalQuestionYesNoModel.getLabel(), null, false, false, new AbstractC36882f0.i(journalQuestionYesNoModel.getInitial()), null, null, null, 954, null);
    }
}
