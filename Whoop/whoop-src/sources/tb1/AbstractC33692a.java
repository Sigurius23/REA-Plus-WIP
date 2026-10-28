package tb1;

import ad3.AbstractC0770m;
import android.text.format.DateFormat;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.datepicker.DatePickerModel;
import com.whoop.design.models.items.datepicker.DateStateUpdateFormat;
import com.whoop.design.models.items.datepicker.ValidDateRange;
import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.models.StateUpdateAction;
import e93.AbstractC12889b;
import g11.C15220d;
import g11.C15221e;
import g11.C15222f;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Map;
import l83.C23454a0;
import l83.C23465k;
import n83.C26463f;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p716lb1.C23743y0;
import p716lb1.C23749z0;
import p716lb1.Function1;
import p720m91.InterfaceC25312u;
import q83.AbstractC30060g;
import qr2.AbstractC30556a;
import rq0.C31703x;
import t71.C33572i;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: tb1.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u0004*\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"Lcom/whoop/design/models/items/datepicker/DatePickerModel;", "Lg11/d;", "i", "(Lcom/whoop/design/models/items/datepicker/DatePickerModel;)Lg11/d;", "", "value", "Ljava/time/LocalDate;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;)Ljava/time/LocalDate;", "Lcom/whoop/design/models/items/datepicker/DateStateUpdateFormat;", "stateDateFormat", "f", "(Ljava/time/LocalDate;Lcom/whoop/design/models/items/datepicker/DateStateUpdateFormat;)Ljava/lang/String;", "Ltr2/n;", "a", "Ltr2/n;", "logger", "Llb1/y0;", "b", "Llb1/y0;", "g", "()Llb1/y0;", "datePickerMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33692a {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC34116n f140749a = InterfaceC34116n.INSTANCE.m107848a("DatePickerMapper");

    /* JADX INFO: renamed from: b */
    private static final C23743y0 f140750b = Function1.m68251a(new C33572i(5));

    /* JADX INFO: renamed from: tb1.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f140751w;

        public a(p715kotlin.jvm.functions.Function1 function1) {
            this.f140751w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f140751w.invoke((DatePickerModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m106437d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(DatePickerModel.class), new a(new C33572i(6)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C15220d m106438e(DatePickerModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m106442i(model);
    }

    /* JADX INFO: renamed from: f */
    private static final String m106439f(LocalDate localDate, DateStateUpdateFormat dateStateUpdateFormat) {
        try {
            Locale locale = Locale.getDefault();
            return localDate.format(DateTimeFormatter.ofPattern(DateFormat.getBestDateTimePattern(locale, dateStateUpdateFormat.getFormat()), locale));
        } catch (IllegalArgumentException e5) {
            f140749a.mo85213c(AbstractC11266d.m30461o("Invalid date picker state date format: ", dateStateUpdateFormat.getFormat()), e5, new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final C23743y0 m106440g() {
        return f140750b;
    }

    /* JADX INFO: renamed from: h */
    private static final LocalDate m106441h(String str) {
        try {
            return LocalDate.parse(str);
        } catch (DateTimeParseException e5) {
            f140749a.mo85226q(AbstractC2875y.m8295h(e5.getErrorIndex(), "Failed to parse date picker date at index "), new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    private static final C15220d m106442i(DatePickerModel datePickerModel) {
        C23465k c23465k;
        LocalDate localDateM106441h;
        C15221e c15221e;
        LocalDate localDateM106441h2 = m106441h(datePickerModel.getMinimumDate());
        LocalDate localDateM106441h3 = m106441h(datePickerModel.getMaximumDate());
        if (localDateM106441h2 == null || localDateM106441h3 == null) {
            c23465k = new C23465k(localDateM106441h2, localDateM106441h3);
        } else {
            c23465k = new C23465k(localDateM106441h2.compareTo((Object) localDateM106441h3) <= 0 ? localDateM106441h2 : localDateM106441h3, AbstractC30060g.m92091M(localDateM106441h2, localDateM106441h3));
        }
        LocalDate localDate = (LocalDate) c23465k.f92937w;
        LocalDate localDate2 = (LocalDate) c23465k.f92938x;
        String stateSelectedDate = datePickerModel.getStateSelectedDate();
        if ((stateSelectedDate == null || (localDateM106441h = m106441h(stateSelectedDate)) == null) && (localDateM106441h = m106441h(datePickerModel.getSelectedDate())) == null) {
            localDateM106441h = LocalDate.now();
        }
        String id4 = datePickerModel.getId();
        if (id4 == null && (id4 = datePickerModel.getStateUpdateValueKey()) == null) {
            id4 = "date_picker";
        }
        String str = id4;
        AbstractC22676k.m65747g(localDateM106441h);
        LocalDate localDate3 = (LocalDate) AbstractC12889b.m36289s(localDateM106441h, localDate, localDate2);
        ValidDateRange validDateRange = datePickerModel.getValidDateRange();
        if (validDateRange != null) {
            String minDate = validDateRange.getMinDate();
            LocalDate localDateM106441h4 = minDate != null ? m106441h(minDate) : null;
            String maxDate = validDateRange.getMaxDate();
            c15221e = new C15221e(localDateM106441h4, maxDate != null ? m106441h(maxDate) : null, validDateRange.getValidRangeAction(), validDateRange.getInvalidRangeAction());
        } else {
            c15221e = null;
        }
        return new C15220d(str, localDate3, localDate, localDate2, c15221e, !AbstractC22676k.m65745e(datePickerModel.isDisabled(), Boolean.TRUE), datePickerModel.getStateDateFormat() != null, new C15222f(new C31703x(datePickerModel, 18)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final Action m106443j(DatePickerModel datePickerModel, LocalDate date) {
        String strM106439f;
        AbstractC22676k.m65750j(date, "date");
        String stateUpdateValueKey = datePickerModel.getStateUpdateValueKey();
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (stateUpdateValueKey == null) {
            return null;
        }
        C26463f c26463f = new C26463f();
        c26463f.put(stateUpdateValueKey, AbstractC0770m.m1841c(date.toString()));
        DateStateUpdateFormat stateDateFormat = datePickerModel.getStateDateFormat();
        if (stateDateFormat != null && (strM106439f = m106439f(date, stateDateFormat)) != null) {
            c26463f.put(stateDateFormat.getKey(), AbstractC0770m.m1841c(strM106439f));
        }
        return new StateUpdateAction((Map) c26463f.m78380b(), false, 2, defaultConstructorMarker);
    }
}
