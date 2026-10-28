package ah0;

import com.whoop.bot.models.conversation.FormWidgetModel;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.p057ai.chat.domain.formwidget.C5936d;
import com.whoop.p057ai.chat.domain.formwidget.InterfaceC5934b;
import com.whoop.p057ai.chat.domain.formwidget.InterfaceC5942j;
import e31.C12612d;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ah0.j */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lah0/j;", "", "<init>", "()V", "Lcom/whoop/ai/chat/domain/formwidget/b;", "Lah0/i;", "b", "(Lcom/whoop/ai/chat/domain/formwidget/b;)Lah0/i;", "Lcom/whoop/ai/chat/domain/formwidget/d;", "domainState", "a", "(Lcom/whoop/ai/chat/domain/formwidget/d;)Lah0/i;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0889j {
    /* JADX INFO: renamed from: b */
    private final C0888i m2182b(InterfaceC5934b interfaceC5934b) {
        if (interfaceC5934b instanceof InterfaceC5934b.a) {
            return new C0888i(new C0888i.a(C12612d.f43056a.m35366a(), null, null, 6, null), null, false, false, null, null, 62, null);
        }
        if (interfaceC5934b instanceof InterfaceC5934b.b) {
            return new C0888i(new C0888i.a(C12612d.f43056a.m35367b(), null, EnumC0884e.NETWORK, 2, null), null, false, false, null, null, 62, null);
        }
        if (interfaceC5934b instanceof InterfaceC5934b.c) {
            return new C0888i(new C0888i.a(C12612d.f43056a.m35368c(), new InterfaceC0886g.e(((InterfaceC5934b.c) interfaceC5934b).getFormKey()), EnumC0884e.SERVER), null, false, false, null, null, 62, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: a */
    public final C0888i m2183a(C5936d domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        if (domainState.getCurrentDialogType() != null) {
            return m2182b(domainState.getCurrentDialogType());
        }
        DesignSystemModel designSystemModelM17759i = domainState.getWidget();
        FormWidgetModel formWidgetModel = designSystemModelM17759i instanceof FormWidgetModel ? (FormWidgetModel) designSystemModelM17759i : null;
        return new C0888i(null, formWidgetModel != null ? AbstractC0883d.m2144a(formWidgetModel, domainState.getCurrentQuestionIndex(), domainState.m17757g(), domainState.getModerationError()) : null, AbstractC22676k.m65745e(domainState.getSubmitState(), InterfaceC5942j.d.f23435a), AbstractC22676k.m65745e(domainState.getSubmitState(), InterfaceC5942j.a.f23432a), domainState.getPendingResult(), domainState.getModerationError(), 1, null);
    }
}
