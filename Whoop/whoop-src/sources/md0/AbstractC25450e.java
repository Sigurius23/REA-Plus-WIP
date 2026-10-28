package md0;

import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.models.modal.DialogButton;
import com.whoop.design.models.modal.DialogModel;
import com.whoop.design.models.modal.Modal;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import kd0.C22383c;
import ny0.C27256h;
import ny0.EnumC27254g;
import ny0.EnumC27272p;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: md0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0002*\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lny0/h;", "button", "Lkd0/c$b;", "responseDialog", "Lmd0/f;", "b", "(Lny0/h;Lkd0/c$b;)Lmd0/f;", "Lcom/whoop/design/models/modal/DialogButton;", "a", "(Lcom/whoop/design/models/modal/DialogButton;)Lny0/h;", "Lcom/whoop/design/models/modal/DialogModel;", "c", "(Lcom/whoop/design/models/modal/DialogModel;)Lkd0/c$b;", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25450e {
    /* JADX INFO: renamed from: a */
    public static final C27256h m74803a(DialogButton button) {
        AbstractC22676k.m65750j(button, "button");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(button.getTitle());
        EnumC27272p enumC27272p = EnumC27272p.DEFAULT;
        C9598e destination = button.getDestination();
        return new C27256h(textResourceM21278l, null, null, null, null, null, enumC27272p, destination == null ? new C9598e(null, null, null, 7, null) : destination, button.getAction(), null, EnumC27254g.COMPACT, null, null, true, false, null, true, false, null, null, null, null, null, null, null, 32905740, null);
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC25451f m74804b(C27256h button, C22383c.b bVar) {
        AbstractC22676k.m65750j(button, "button");
        Object actionArgument = button.getActionArgument();
        AnyModal anyModal = actionArgument instanceof AnyModal ? (AnyModal) actionArgument : null;
        if (anyModal == null) {
            return bVar != null ? AbstractC25451f.c.f99688a : AbstractC25451f.a.f99685a;
        }
        Modal modal = anyModal.getModal();
        DialogModel dialogModel = modal instanceof DialogModel ? (DialogModel) modal : null;
        if (dialogModel == null) {
            return bVar != null ? AbstractC25451f.c.f99688a : AbstractC25451f.a.f99685a;
        }
        if (dialogModel.getPrimaryButton() == null || dialogModel.getSecondaryButton() == null) {
            return bVar != null ? AbstractC25451f.c.f99688a : AbstractC25451f.a.f99685a;
        }
        return new AbstractC25451f.b(anyModal);
    }

    /* JADX INFO: renamed from: c */
    public static final C22383c.b m74805c(DialogModel dialogModel) {
        C27256h c27256hM74803a;
        DialogButton secondaryButton;
        C27256h c27256hM74803a2;
        TextResource textResourceM21267a;
        AbstractC22676k.m65750j(dialogModel, "<this>");
        DialogButton primaryButton = dialogModel.getPrimaryButton();
        C22383c.b bVar = null;
        if (primaryButton != null && (c27256hM74803a = m74803a(primaryButton)) != null && (secondaryButton = dialogModel.getSecondaryButton()) != null && (c27256hM74803a2 = m74803a(secondaryButton)) != null) {
            TextResource textResourceM21278l = AbstractC8693b.m21278l(dialogModel.getTitle());
            String description = dialogModel.getDescription();
            if (description == null || (textResourceM21267a = AbstractC8693b.m21278l(description)) == null) {
                textResourceM21267a = AbstractC8693b.m21267a();
            }
            bVar = new C22383c.b(textResourceM21278l, textResourceM21267a, c27256hM74803a, c27256hM74803a2);
        }
        return bVar;
    }
}
