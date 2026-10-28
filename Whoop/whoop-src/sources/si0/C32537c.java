package si0;

import c93.InterfaceC4351m;
import cj0.AbstractC4741c;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.archv2.model.template.BackBehavior;
import com.whoop.archv2.model.template.BackgroundModel;
import com.whoop.archv2.model.template.FlowStep;
import com.whoop.archv2.model.template.FlowStepTransition;
import com.whoop.archv2.model.template.FlowTemplate;
import com.whoop.archv2.model.template.ScreenTemplate;
import com.whoop.archv2.model.template.SingleItemTemplate;
import com.whoop.archv2.model.template.TemplateBackgroundTheme;
import com.whoop.design.models.ProgressButtonModel;
import com.whoop.design.models.modal.LifecycleInteractions;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonNull;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import ti0.C33836a;
import ti0.C33838c;
import ti0.C33839d;
import ti0.C33845j;
import ti0.EnumC33847l;
import ti0.InterfaceC33848m;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: si0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Ja\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b2(\u0010\u000e\u001a$\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016JW\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b2*\b\u0002\u0010\u000e\u001a$\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lsi0/c;", "", "<init>", "()V", "Lcom/whoop/archv2/model/template/FlowStep;", "activeStep", "Lcom/whoop/archv2/model/template/BackgroundModel;", "hoistedBackground", "", "", "accumulatedState", "Lkotlin/Function2;", "Lcom/whoop/archv2/model/template/ScreenTemplate;", "Lti0/a;", "reduceStep", "c", "(Lcom/whoop/archv2/model/template/FlowStep;Lcom/whoop/archv2/model/template/BackgroundModel;Ljava/util/Map;Lc93/m;)Lti0/a;", "step", "d", "(Lcom/whoop/archv2/model/template/FlowStep;)Lcom/whoop/archv2/model/template/BackgroundModel;", "", "a", "(Lcom/whoop/archv2/model/template/FlowStep;Ljava/util/Map;)Z", "Lcom/whoop/archv2/model/template/FlowTemplate;", "template", "Lti0/d;", "b", "(Lcom/whoop/archv2/model/template/FlowTemplate;Ljava/util/Map;Lc93/m;)Lti0/d;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32537c {
    /* JADX INFO: renamed from: a */
    private final boolean m101548a(FlowStep step, Map<String, ? extends Object> accumulatedState) {
        List<String> requiredKeys = step.getRequiredKeys();
        if ((requiredKeys instanceof Collection) && requiredKeys.isEmpty()) {
            return true;
        }
        Iterator<T> it = requiredKeys.iterator();
        while (it.hasNext()) {
            Object obj = accumulatedState.get((String) it.next());
            if (obj == null || (obj instanceof JsonNull)) {
                return false;
            }
            if ((obj instanceof JsonArray) && ((JsonArray) obj).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    private final C33836a m101549c(FlowStep activeStep, BackgroundModel hoistedBackground, Map<String, ? extends Object> accumulatedState, InterfaceC4351m reduceStep) {
        Object template;
        String url;
        boolean z4 = (hoistedBackground == null || (url = hoistedBackground.getUrl()) == null || !(AbstractC39414r.m125890i0(url) ^ true)) ? false : true;
        boolean z13 = (hoistedBackground != null ? hoistedBackground.getTheme() : null) != null;
        if (!z4 && !z13) {
            return (C33836a) reduceStep.invoke(activeStep.getTemplate().getTemplate(), accumulatedState);
        }
        ScreenTemplate template2 = activeStep.getTemplate().getTemplate();
        SingleItemTemplate singleItemTemplate = template2 instanceof SingleItemTemplate ? (SingleItemTemplate) template2 : null;
        if (singleItemTemplate == null || (template = SingleItemTemplate.copy$default(singleItemTemplate, null, null, null, null, null, null, null, null, null, null, 255, null)) == null) {
            template = activeStep.getTemplate().getTemplate();
        }
        C33836a c33836a = (C33836a) reduceStep.invoke(template, accumulatedState);
        if (c33836a == null) {
            return null;
        }
        InterfaceC33848m contentState = c33836a.getContentState();
        return contentState instanceof C33845j ? c33836a.m107004a(C33845j.m107038b((C33845j) contentState, null, null, null, null, null, null, null, null, new C33838c(null, EnumC33847l.NONE, 1, null), 255, null)) : c33836a;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0027  */
    /* JADX WARN: Code duplicated, block: B:21:0x0036  */
    /* JADX INFO: renamed from: d */
    private final BackgroundModel m101550d(FlowStep step) {
        String url;
        BackgroundModel background;
        TemplateBackgroundTheme theme;
        BackgroundModel background2;
        ScreenTemplate template = step.getTemplate().getTemplate();
        SingleItemTemplate singleItemTemplate = template instanceof SingleItemTemplate ? (SingleItemTemplate) template : null;
        BackgroundModel background3 = step.getBackground();
        if (background3 == null || (url = background3.getUrl()) == null) {
            if (singleItemTemplate != null || (url = singleItemTemplate.getBackgroundImageUrl()) == null || AbstractC39414r.m125890i0(url)) {
                url = null;
            }
            if (url == null && (singleItemTemplate == null || (background = singleItemTemplate.getBackground()) == null || (url = background.getUrl()) == null || AbstractC39414r.m125890i0(url))) {
                url = null;
            }
        } else {
            if (AbstractC39414r.m125890i0(url)) {
                url = null;
            }
            if (url == null) {
                if (singleItemTemplate != null) {
                    url = null;
                } else {
                    url = null;
                }
                if (url == null) {
                    url = null;
                }
            }
        }
        BackgroundModel background4 = step.getBackground();
        if (background4 == null || (theme = background4.getTheme()) == null) {
            theme = (singleItemTemplate == null || (background2 = singleItemTemplate.getBackground()) == null) ? null : background2.getTheme();
        }
        if (theme == null || theme == TemplateBackgroundTheme.DEFAULT) {
            theme = null;
        }
        if (url == null && theme == null) {
            return null;
        }
        return new BackgroundModel(url, theme);
    }

    /* JADX INFO: renamed from: b */
    public final C33839d m101551b(FlowTemplate template, Map<String, ? extends Object> accumulatedState, InterfaceC4351m reduceStep) {
        ProgressButtonModel progressButtonModel;
        AbstractC22676k.m65750j(template, "template");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        AbstractC22676k.m65750j(reduceStep, "reduceStep");
        String str = (String) AbstractC25265s.m74114R0(template.getCurrentStepList());
        FlowStep flowStep = str != null ? template.getSteps().get(str) : null;
        if (str == null || flowStep == null) {
            return new C33839d(null, null, null, null, null, template.getCurrentStepList().size(), null, null, null, null, 991, null);
        }
        BackgroundModel backgroundModelM101550d = m101550d(flowStep);
        C33836a c33836aM101549c = m101549c(flowStep, backgroundModelM101550d, accumulatedState, reduceStep);
        ProgressButtonModel progressButton = flowStep.getProgressButton();
        if (progressButton != null) {
            if (progressButton.isEnabled() == null) {
                progressButton = ProgressButtonModel.copy$default(progressButton, null, null, null, null, null, null, null, Boolean.valueOf(m101548a(flowStep, accumulatedState)), null, null, null, 1919, null);
            }
            progressButtonModel = progressButton;
        } else {
            progressButtonModel = null;
        }
        BackBehavior backBehavior = flowStep.getBackBehavior();
        FlowStepTransition stepTransition = flowStep.getStepTransition();
        String strM14894a = AbstractC4741c.m14894a(template);
        int size = template.getCurrentStepList().size();
        Map<String, AnalyticEventModel> analyticEvents = flowStep.getAnalyticEvents();
        LifecycleInteractions lifecycleInteractions = flowStep.getTemplate().getLifecycleInteractions();
        return new C33839d(c33836aM101549c, str, backBehavior, stepTransition, strM14894a, size, progressButtonModel, analyticEvents, lifecycleInteractions != null ? lifecycleInteractions.getOnStart() : null, backgroundModelM101550d);
    }
}
