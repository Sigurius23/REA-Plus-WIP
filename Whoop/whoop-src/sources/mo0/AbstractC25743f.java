package mo0;

import com.whoop.design.models.items.form.FormSheetContent;
import com.whoop.design.models.items.form.FormSheetDateContent;
import com.whoop.design.models.items.form.FormSheetModel;
import com.whoop.design.models.items.form.FormTextFieldModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import i93.C18284j;
import io0.C20731r;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import lo0.C24573c0;
import lo0.C24575d0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.AbstractC23613d4;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: mo0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\b\u001a\u00020\u0007*\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0006*\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019¨\u0006\u001b"}, m65681d2 = {"Lcom/whoop/design/models/items/form/FormTextFieldModel;", "Lio0/r;", "fieldValue", "Llo0/c0;", "b", "(Lcom/whoop/design/models/items/form/FormTextFieldModel;Lio0/r;)Llo0/c0;", "", "Lcom/whoop/design/util/TextResource;", "d", "(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;", "Lcom/whoop/design/models/items/form/FormSheetModel;", "currentValue", "Llo0/d0;", "c", "(Lcom/whoop/design/models/items/form/FormSheetModel;Ljava/lang/String;)Llo0/d0;", "iso", "Ljava/time/LocalDate;", "a", "(Ljava/lang/String;)Ljava/time/LocalDate;", "", "f", "(Ljava/time/LocalDate;)J", "e", "(Ljava/time/LocalDate;)Ljava/lang/String;", "Ltr2/n;", "Ltr2/n;", "logger", "clinician-in-the-loop_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25743f {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC34116n f101452a = InterfaceC34116n.INSTANCE.m107848a("DateFormTextFieldMapper");

    /* JADX INFO: renamed from: a */
    private static final LocalDate m75946a(String str) {
        try {
            try {
                return OffsetDateTime.parse(str).toLocalDate();
            } catch (DateTimeParseException e5) {
                f101452a.mo85213c(AbstractC11266d.m30461o("Failed to parse ISO date string: ", str), e5, new AbstractC30556a.a[0]);
                return null;
            }
        } catch (DateTimeParseException unused) {
            return LocalDate.parse(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C24573c0 m75947b(FormTextFieldModel formTextFieldModel, C20731r c20731r) {
        String text;
        String errorMessage;
        AbstractC22676k.m65750j(formTextFieldModel, "<this>");
        if (c20731r == null || (text = c20731r.getText()) == null) {
            text = formTextFieldModel.getText();
        }
        boolean z4 = c20731r != null ? !c20731r.getIsValid() : false;
        if (c20731r == null || (errorMessage = c20731r.getServerErrorMessage()) == null) {
            errorMessage = formTextFieldModel.getErrorMessage();
        }
        TextResource textResourceM21278l = AbstractC8693b.m21278l(errorMessage);
        String id4 = formTextFieldModel.getId();
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(formTextFieldModel.getLabel());
        TextResource textResourceM75949d = m75949d(text);
        boolean disabled = formTextFieldModel.getDisabled();
        FormSheetModel selectionSheet = formTextFieldModel.getSelectionSheet();
        return new C24573c0(id4, textResourceM21278l2, textResourceM75949d, textResourceM21278l, z4, disabled, selectionSheet != null ? m75948c(selectionSheet, text) : null);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX INFO: renamed from: c */
    private static final C24575d0 m75948c(FormSheetModel formSheetModel, String str) {
        Long l7;
        Long lValueOf;
        C18284j c18284j;
        LocalDate localDateM75946a;
        FormSheetContent content = formSheetModel.getContent();
        FormSheetDateContent formSheetDateContent = content instanceof FormSheetDateContent ? (FormSheetDateContent) content : null;
        if (formSheetDateContent == null) {
            return null;
        }
        LocalDate localDateM75946a2 = m75946a(formSheetDateContent.getDateLowerBound());
        Long lValueOf2 = localDateM75946a2 != null ? Long.valueOf(m75951f(localDateM75946a2)) : null;
        LocalDate localDateM75946a3 = m75946a(formSheetDateContent.getDateUpperBound());
        Long lValueOf3 = localDateM75946a3 != null ? Long.valueOf(m75951f(localDateM75946a3)) : null;
        if (str == null || (localDateM75946a = m75946a(str)) == null) {
            LocalDate localDateM75946a4 = m75946a(formSheetDateContent.getStartingDate());
            if (localDateM75946a4 != null) {
                lValueOf = Long.valueOf(m75951f(localDateM75946a4));
            } else {
                l7 = null;
            }
            if (lValueOf2 != null || lValueOf3 == null) {
                c18284j = null;
            } else {
                Instant instantOfEpochMilli = Instant.ofEpochMilli(lValueOf2.longValue());
                ZoneOffset zoneOffset = ZoneOffset.UTC;
                c18284j = new C18284j(instantOfEpochMilli.atZone(zoneOffset).getYear(), Instant.ofEpochMilli(lValueOf3.longValue()).atZone(zoneOffset).getYear(), 1);
            }
            return new C24575d0(AbstractC23613d4.m68662l(formSheetModel.getCancelButton(), null, 1, null), AbstractC23613d4.m68662l(formSheetModel.getConfirmButton(), null, 1, null), l7, l7, c18284j, lValueOf2, lValueOf3);
        }
        lValueOf = Long.valueOf(m75951f(localDateM75946a));
        l7 = lValueOf;
        if (lValueOf2 != null) {
            c18284j = null;
        } else {
            c18284j = null;
        }
        return new C24575d0(AbstractC23613d4.m68662l(formSheetModel.getCancelButton(), null, 1, null), AbstractC23613d4.m68662l(formSheetModel.getConfirmButton(), null, 1, null), l7, l7, c18284j, lValueOf2, lValueOf3);
    }

    /* JADX INFO: renamed from: d */
    private static final TextResource m75949d(String str) {
        String strM75950e;
        if (str != null) {
            if (AbstractC39414r.m125890i0(str)) {
                str = null;
            }
            if (str != null) {
                LocalDate localDateM75946a = m75946a(str);
                if (localDateM75946a != null && (strM75950e = m75950e(localDateM75946a)) != null) {
                    str = strM75950e;
                }
                TextResource textResourceM21278l = AbstractC8693b.m21278l(str);
                if (textResourceM21278l != null) {
                    return textResourceM21278l;
                }
            }
        }
        return AbstractC8693b.m21267a();
    }

    /* JADX INFO: renamed from: e */
    private static final String m75950e(LocalDate localDate) {
        try {
            return localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        } catch (DateTimeException e5) {
            f101452a.mo85213c("Failed to format LocalDate for display: " + localDate, e5, new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    private static final long m75951f(LocalDate localDate) {
        return localDate.atStartOfDay(ZoneOffset.UTC).toInstant().toEpochMilli();
    }
}
