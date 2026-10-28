package mo0;

import com.whoop.design.models.items.SearchFieldModel;
import com.whoop.design.models.items.form.FormSheetContent;
import com.whoop.design.models.items.form.FormSheetDateContent;
import com.whoop.design.models.items.form.FormSheetModel;
import com.whoop.design.models.items.form.FormSheetSelectableOptionsContent;
import com.whoop.design.models.items.form.UnknownFormSheetContent;
import jb1.C21535a;
import lo0.C24581g0;
import lo0.C24583h0;
import lo0.C24585i0;
import lo0.C24609u0;
import lo0.InterfaceC24579f0;
import n01.C26088e;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.AbstractC23613d4;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: mo0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lcom/whoop/design/models/items/form/FormSheetModel;", "Ljb1/a;", "designItemReducer", "Llo0/i0;", "a", "(Lcom/whoop/design/models/items/form/FormSheetModel;Ljb1/a;)Llo0/i0;", "clinician-in-the-loop_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25744g {
    /* JADX INFO: renamed from: a */
    public static final C24585i0 m75952a(FormSheetModel formSheetModel, C21535a designItemReducer) {
        InterfaceC24579f0 c24581g0;
        AbstractC22676k.m65750j(formSheetModel, "<this>");
        AbstractC22676k.m65750j(designItemReducer, "designItemReducer");
        FormSheetContent content = formSheetModel.getContent();
        if (!(content instanceof FormSheetSelectableOptionsContent)) {
            if (content instanceof FormSheetDateContent) {
                FormSheetDateContent formSheetDateContent = (FormSheetDateContent) content;
                c24581g0 = new C24581g0(formSheetDateContent.getDateLowerBound(), formSheetDateContent.getDateUpperBound(), formSheetDateContent.getStartingDate());
                return new C24585i0(formSheetModel.getId(), formSheetModel.getTitle(), c24581g0, AbstractC23613d4.m68662l(formSheetModel.getCancelButton(), null, 1, null), AbstractC23613d4.m68662l(formSheetModel.getConfirmButton(), null, 1, null));
            }
            if (!AbstractC22676k.m65745e(content, UnknownFormSheetContent.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            return null;
        }
        FormSheetSelectableOptionsContent formSheetSelectableOptionsContent = (FormSheetSelectableOptionsContent) content;
        InterfaceC25312u interfaceC25312uM60544l = designItemReducer.m60544l(formSheetSelectableOptionsContent.getItems());
        C26088e c26088e = interfaceC25312uM60544l instanceof C26088e ? (C26088e) interfaceC25312uM60544l : null;
        if (c26088e != null) {
            SearchFieldModel searchField = formSheetSelectableOptionsContent.getSearchField();
            c24581g0 = new C24583h0(searchField != null ? new C24609u0(searchField.getText(), searchField.getPlaceholder()) : null, c26088e);
            return new C24585i0(formSheetModel.getId(), formSheetModel.getTitle(), c24581g0, AbstractC23613d4.m68662l(formSheetModel.getCancelButton(), null, 1, null), AbstractC23613d4.m68662l(formSheetModel.getConfirmButton(), null, 1, null));
        }
        return null;
    }
}
