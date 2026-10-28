package ah0;

import com.whoop.bot.models.conversation.AnswerDisplayStyle;
import com.whoop.bot.models.conversation.FormAnswerOptionModel;
import com.whoop.bot.models.conversation.FormQuestionModel;
import com.whoop.bot.models.conversation.FormWidgetModel;
import com.whoop.p057ai.chat.domain.formwidget.C5940h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: ah0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aG\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/FormWidgetModel;", "", "currentQuestionIndex", "", "", "", "Lcom/whoop/ai/chat/domain/formwidget/h;", "savedAnswers", "moderationError", "Lah0/c;", "a", "(Lcom/whoop/bot/models/conversation/FormWidgetModel;ILjava/util/Map;Ljava/lang/String;)Lah0/c;", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC0883d {
    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    /* JADX INFO: renamed from: a */
    public static final C0882c m2144a(FormWidgetModel formWidgetModel, int i13, Map<String, ? extends List<C5940h>> savedAnswers, String str) {
        String str2;
        List list;
        C5940h c5940h;
        boolean selected;
        String userInputText;
        Object next;
        String userInputText2;
        C5940h c5940h2;
        AbstractC22676k.m65750j(formWidgetModel, "<this>");
        AbstractC22676k.m65750j(savedAnswers, "savedAnswers");
        int i14 = i13 < 0 ? 0 : i13;
        FormQuestionModel formQuestionModel = (FormQuestionModel) AbstractC25265s.m74102I0(i14, formWidgetModel.getQuestions());
        if (formQuestionModel == null) {
            return null;
        }
        EnumC0890k enumC0890kM2184a = EnumC0890k.INSTANCE.m2184a(formQuestionModel.getType());
        List<C5940h> list2 = savedAnswers.get(formQuestionModel.getId());
        boolean zIsFreeText = enumC0890kM2184a.isFreeText();
        if (zIsFreeText) {
            if (list2 == null || (c5940h2 = (C5940h) AbstractC25265s.m74100H0(list2)) == null || (userInputText2 = c5940h2.getUserInputText()) == null) {
                FormAnswerOptionModel formAnswerOptionModel = (FormAnswerOptionModel) AbstractC25265s.m74100H0(formQuestionModel.getAnswers());
                if (formAnswerOptionModel != null) {
                    userInputText2 = formAnswerOptionModel.getUserInputText();
                } else {
                    str2 = null;
                }
            }
            str2 = userInputText2;
        } else {
            str2 = null;
        }
        String authoritativeFormId = formWidgetModel.getAuthoritativeFormId();
        String userFormId = formWidgetModel.getUserFormId();
        String key = formWidgetModel.getKey();
        Integer version = formWidgetModel.getVersion();
        String id4 = formQuestionModel.getId();
        String prompt = formQuestionModel.getPrompt();
        if (zIsFreeText) {
            list = C25271y.f99162w;
        } else {
            List<FormAnswerOptionModel> answers = formQuestionModel.getAnswers();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(answers, 10));
            for (FormAnswerOptionModel formAnswerOptionModel2 : answers) {
                if (list2 != null) {
                    Iterator<T> it = list2.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!AbstractC22676k.m65745e(((C5940h) next).getOptionId(), formAnswerOptionModel2.getOptionId()));
                    c5940h = (C5940h) next;
                } else {
                    c5940h = null;
                }
                String optionId = formAnswerOptionModel2.getOptionId();
                String label = formAnswerOptionModel2.getLabel();
                String value = formAnswerOptionModel2.getValue();
                if (list2 != null) {
                    List<C5940h> list3 = list2;
                    if ((list3 instanceof Collection) && list3.isEmpty()) {
                        selected = false;
                        break;
                    }
                    Iterator it3 = list3.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            selected = false;
                            break;
                        }
                        Iterator it4 = it3;
                        if (AbstractC22676k.m65745e(((C5940h) it3.next()).getOptionId(), formAnswerOptionModel2.getOptionId())) {
                            selected = true;
                            break;
                        }
                        it3 = it4;
                    }
                } else {
                    selected = formAnswerOptionModel2.getSelected();
                }
                boolean z4 = selected;
                boolean zIsUserInput = EnumC0880a.INSTANCE.m2113a(formAnswerOptionModel2.getType()).isUserInput();
                if (c5940h == null || (userInputText = c5940h.getUserInputText()) == null) {
                    userInputText = formAnswerOptionModel2.getUserInputText();
                }
                arrayList.add(new C0885f(optionId, label, value, z4, zIsUserInput, userInputText));
            }
            list = arrayList;
        }
        boolean zM125921F = AbstractC39421y.m125921F(formWidgetModel.getStatus(), "COMPLETE", true);
        boolean zIsMultiSelect = enumC0890kM2184a.isMultiSelect();
        boolean z13 = formQuestionModel.getAnswerDisplayStyle() == AnswerDisplayStyle.CHECKBOX;
        EnumC0881b enumC0881bM2114a = EnumC0881b.INSTANCE.m2114a(formWidgetModel.getCompletedAnswerDisplay());
        int maxSelections = formQuestionModel.getMaxSelections();
        if (maxSelections < 1) {
            maxSelections = 1;
        }
        return new C0882c(authoritativeFormId, userFormId, key, version, id4, prompt, list, zM125921F, zIsMultiSelect, maxSelections, i14, formWidgetModel.getQuestions().size(), i14 > 0, i14, zIsFreeText, str2, formQuestionModel.isRequired(), savedAnswers.containsKey(formQuestionModel.getId()), formQuestionModel.getUserVisibleProgressIndicator(), formQuestionModel.getUserVisibleSubmitButtonText(), formQuestionModel.getUserVisibleCompletedButtonText(), formQuestionModel.getPlaceholder(), formQuestionModel.getUserInputTextMaxLength(), str, formQuestionModel.getOnAnswer(), formWidgetModel.getOnComplete(), z13, enumC0881bM2114a);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C0882c m2145b(FormWidgetModel formWidgetModel, int i13, Map map, String str, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = 0;
        }
        if ((i14 & 2) != 0) {
            map = C25272z.f99163w;
        }
        if ((i14 & 4) != 0) {
            str = null;
        }
        return m2144a(formWidgetModel, i13, map, str);
    }
}
