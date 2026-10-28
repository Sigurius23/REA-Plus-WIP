package zv2;

import com.whoop.weightlifting.feature.onerepmax.manualentry.models.OneRepMaxMeasurementModel;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: zv2.f */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b*\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b-\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010&\u001a\u0004\b/\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010&\u001a\u0004\b1\u0010\u001dR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010&\u001a\u0004\b3\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b4\u0010\u001dR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b5\u0010\u001dR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010&\u001a\u0004\b6\u0010\u001dR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010\u001fR\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b/\u00108\u001a\u0004\b7\u0010\u001fR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u0010&\u001a\u0004\b2\u0010\u001dR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b(\u0010\u001dR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010&\u001a\u0004\b:\u0010\u001dR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b;\u0010&\u001a\u0004\b.\u0010\u001dR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b1\u0010<\u001a\u0004\b;\u0010=R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b6\u0010<\u001a\u0004\b0\u0010=R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b3\u0010>\u001a\u0004\b%\u0010?¨\u0006@"}, m65681d2 = {"Lzv2/f;", "Lm91/u;", "", "exerciseTitle", "exerciseName", "dateSectionTitle", "datePrompt", "minimumDate", "maximumDate", "selectedDate", "valueSectionTitle", "valueTitle", "initialValue", "unit", "", "minValue", "maxValue", "errorMessage", "caption", "saveButtonTitle", "deleteButtonTitle", "Lzv2/b;", "saveConfirmDialog", "deleteConfirmDialog", "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;", "bindableSource", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzv2/b;Lzv2/b;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "j", "b", "i", "c", "e", "d", "o", "f", "m", "g", "r", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "t", "u", "k", "s", "l", "I", "n", "p", "q", "Lzv2/b;", "()Lzv2/b;", "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;", "()Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C41170f implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String exerciseTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String exerciseName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String dateSectionTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String datePrompt;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String minimumDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String maximumDate;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String selectedDate;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String valueSectionTitle;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String valueTitle;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final String initialValue;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final String unit;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final int minValue;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final int maxValue;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final String errorMessage;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final String caption;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final String saveButtonTitle;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final String deleteButtonTitle;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final C41166b saveConfirmDialog;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final C41166b deleteConfirmDialog;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final OneRepMaxMeasurementModel bindableSource;

    public C41170f(String exerciseTitle, String exerciseName, String dateSectionTitle, String datePrompt, String minimumDate, String maximumDate, String selectedDate, String valueSectionTitle, String valueTitle, String initialValue, String unit, int i13, int i14, String errorMessage, String str, String saveButtonTitle, String str2, C41166b saveConfirmDialog, C41166b c41166b, OneRepMaxMeasurementModel bindableSource) {
        AbstractC22676k.m65750j(exerciseTitle, "exerciseTitle");
        AbstractC22676k.m65750j(exerciseName, "exerciseName");
        AbstractC22676k.m65750j(dateSectionTitle, "dateSectionTitle");
        AbstractC22676k.m65750j(datePrompt, "datePrompt");
        AbstractC22676k.m65750j(minimumDate, "minimumDate");
        AbstractC22676k.m65750j(maximumDate, "maximumDate");
        AbstractC22676k.m65750j(selectedDate, "selectedDate");
        AbstractC22676k.m65750j(valueSectionTitle, "valueSectionTitle");
        AbstractC22676k.m65750j(valueTitle, "valueTitle");
        AbstractC22676k.m65750j(initialValue, "initialValue");
        AbstractC22676k.m65750j(unit, "unit");
        AbstractC22676k.m65750j(errorMessage, "errorMessage");
        AbstractC22676k.m65750j(saveButtonTitle, "saveButtonTitle");
        AbstractC22676k.m65750j(saveConfirmDialog, "saveConfirmDialog");
        AbstractC22676k.m65750j(bindableSource, "bindableSource");
        this.exerciseTitle = exerciseTitle;
        this.exerciseName = exerciseName;
        this.dateSectionTitle = dateSectionTitle;
        this.datePrompt = datePrompt;
        this.minimumDate = minimumDate;
        this.maximumDate = maximumDate;
        this.selectedDate = selectedDate;
        this.valueSectionTitle = valueSectionTitle;
        this.valueTitle = valueTitle;
        this.initialValue = initialValue;
        this.unit = unit;
        this.minValue = i13;
        this.maxValue = i14;
        this.errorMessage = errorMessage;
        this.caption = str;
        this.saveButtonTitle = saveButtonTitle;
        this.deleteButtonTitle = str2;
        this.saveConfirmDialog = saveConfirmDialog;
        this.deleteConfirmDialog = c41166b;
        this.bindableSource = bindableSource;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final OneRepMaxMeasurementModel getBindableSource() {
        return this.bindableSource;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCaption() {
        return this.caption;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDatePrompt() {
        return this.datePrompt;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDateSectionTitle() {
        return this.dateSectionTitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C41170f)) {
            return false;
        }
        C41170f c41170f = (C41170f) other;
        return AbstractC22676k.m65745e(this.exerciseTitle, c41170f.exerciseTitle) && AbstractC22676k.m65745e(this.exerciseName, c41170f.exerciseName) && AbstractC22676k.m65745e(this.dateSectionTitle, c41170f.dateSectionTitle) && AbstractC22676k.m65745e(this.datePrompt, c41170f.datePrompt) && AbstractC22676k.m65745e(this.minimumDate, c41170f.minimumDate) && AbstractC22676k.m65745e(this.maximumDate, c41170f.maximumDate) && AbstractC22676k.m65745e(this.selectedDate, c41170f.selectedDate) && AbstractC22676k.m65745e(this.valueSectionTitle, c41170f.valueSectionTitle) && AbstractC22676k.m65745e(this.valueTitle, c41170f.valueTitle) && AbstractC22676k.m65745e(this.initialValue, c41170f.initialValue) && AbstractC22676k.m65745e(this.unit, c41170f.unit) && this.minValue == c41170f.minValue && this.maxValue == c41170f.maxValue && AbstractC22676k.m65745e(this.errorMessage, c41170f.errorMessage) && AbstractC22676k.m65745e(this.caption, c41170f.caption) && AbstractC22676k.m65745e(this.saveButtonTitle, c41170f.saveButtonTitle) && AbstractC22676k.m65745e(this.deleteButtonTitle, c41170f.deleteButtonTitle) && AbstractC22676k.m65745e(this.saveConfirmDialog, c41170f.saveConfirmDialog) && AbstractC22676k.m65745e(this.deleteConfirmDialog, c41170f.deleteConfirmDialog) && AbstractC22676k.m65745e(this.bindableSource, c41170f.bindableSource);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDeleteButtonTitle() {
        return this.deleteButtonTitle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C41166b getDeleteConfirmDialog() {
        return this.deleteConfirmDialog;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.maxValue, AbstractC11266d.m30448b(this.minValue, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.exerciseTitle.hashCode() * 31, 31, this.exerciseName), 31, this.dateSectionTitle), 31, this.datePrompt), 31, this.minimumDate), 31, this.maximumDate), 31, this.selectedDate), 31, this.valueSectionTitle), 31, this.valueTitle), 31, this.initialValue), 31, this.unit), 31), 31), 31, this.errorMessage);
        String str = this.caption;
        int iM30450d2 = AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.saveButtonTitle);
        String str2 = this.deleteButtonTitle;
        int iHashCode = (this.saveConfirmDialog.hashCode() + ((iM30450d2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        C41166b c41166b = this.deleteConfirmDialog;
        return this.bindableSource.hashCode() + ((iHashCode + (c41166b != null ? c41166b.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getExerciseName() {
        return this.exerciseName;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getExerciseTitle() {
        return this.exerciseTitle;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getInitialValue() {
        return this.initialValue;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getMaxValue() {
        return this.maxValue;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getMaximumDate() {
        return this.maximumDate;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getMinValue() {
        return this.minValue;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getMinimumDate() {
        return this.minimumDate;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getSaveButtonTitle() {
        return this.saveButtonTitle;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final C41166b getSaveConfirmDialog() {
        return this.saveConfirmDialog;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getSelectedDate() {
        return this.selectedDate;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getValueSectionTitle() {
        return this.valueSectionTitle;
    }

    public String toString() {
        String str = this.exerciseTitle;
        String str2 = this.exerciseName;
        String str3 = this.dateSectionTitle;
        String str4 = this.datePrompt;
        String str5 = this.minimumDate;
        String str6 = this.maximumDate;
        String str7 = this.selectedDate;
        String str8 = this.valueSectionTitle;
        String str9 = this.valueTitle;
        String str10 = this.initialValue;
        String str11 = this.unit;
        int i13 = this.minValue;
        int i14 = this.maxValue;
        String str12 = this.errorMessage;
        String str13 = this.caption;
        String str14 = this.saveButtonTitle;
        String str15 = this.deleteButtonTitle;
        C41166b c41166b = this.saveConfirmDialog;
        C41166b c41166b2 = this.deleteConfirmDialog;
        OneRepMaxMeasurementModel oneRepMaxMeasurementModel = this.bindableSource;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("OneRepMaxMeasurementItemViewState(exerciseTitle=", str, ", exerciseName=", str2, ", dateSectionTitle=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", datePrompt=", str4, ", minimumDate=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", maximumDate=", str6, ", selectedDate=");
        AbstractC11266d.m30444B(sbM32001t, str7, ", valueSectionTitle=", str8, ", valueTitle=");
        AbstractC11266d.m30444B(sbM32001t, str9, ", initialValue=", str10, ", unit=");
        AbstractC11266d.m30470x(i13, str11, ", minValue=", ", maxValue=", sbM32001t);
        AbstractC11895b.m31979B(i14, ", errorMessage=", str12, ", caption=", sbM32001t);
        AbstractC11266d.m30444B(sbM32001t, str13, ", saveButtonTitle=", str14, ", deleteButtonTitle=");
        sbM32001t.append(str15);
        sbM32001t.append(", saveConfirmDialog=");
        sbM32001t.append(c41166b);
        sbM32001t.append(", deleteConfirmDialog=");
        sbM32001t.append(c41166b2);
        sbM32001t.append(", bindableSource=");
        sbM32001t.append(oneRepMaxMeasurementModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getValueTitle() {
        return this.valueTitle;
    }
}
