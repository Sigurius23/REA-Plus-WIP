package mo0;

import com.whoop.design.models.items.form.FormSheetModel;
import com.whoop.design.models.items.form.FormTextFieldKeyboardType;
import com.whoop.design.models.items.form.FormTextFieldModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import jb1.C21535a;
import lo0.C24587j0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: mo0.h */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/design/models/items/form/FormTextFieldModel;", "Ljb1/a;", "designItemReducer", "", "textOverride", "", "isError", "errorMessageOverride", "Llo0/j0;", "a", "(Lcom/whoop/design/models/items/form/FormTextFieldModel;Ljb1/a;Ljava/lang/String;ZLjava/lang/String;)Llo0/j0;", "clinician-in-the-loop_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25745h {
    /* JADX INFO: renamed from: a */
    public static final C24587j0 m75953a(FormTextFieldModel formTextFieldModel, C21535a designItemReducer, String str, boolean z4, String str2) {
        AbstractC22676k.m65750j(formTextFieldModel, "<this>");
        AbstractC22676k.m65750j(designItemReducer, "designItemReducer");
        String id4 = formTextFieldModel.getId();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(formTextFieldModel.getLabel());
        FormTextFieldKeyboardType keyboardType = formTextFieldModel.getKeyboardType();
        String hintText = formTextFieldModel.getHintText();
        String text = str == null ? formTextFieldModel.getText() : str;
        String validRegex = formTextFieldModel.getValidRegex();
        String errorMessage = str2 == null ? formTextFieldModel.getErrorMessage() : str2;
        boolean disabled = formTextFieldModel.getDisabled();
        FormSheetModel selectionSheet = formTextFieldModel.getSelectionSheet();
        return new C24587j0(id4, textResourceM21278l, keyboardType, hintText, text, validRegex, errorMessage, disabled, selectionSheet != null ? AbstractC25744g.m75952a(selectionSheet, designItemReducer) : null, formTextFieldModel.isRequired(), z4);
    }
}
