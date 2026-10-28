package cj0;

import com.whoop.archv2.model.template.FlowTemplate;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: cj0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/archv2/model/template/FlowTemplate;", "", "a", "(Lcom/whoop/archv2/model/template/FlowTemplate;)Ljava/lang/String;", "arch-v2_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4741c {
    /* JADX INFO: renamed from: a */
    public static final String m14894a(FlowTemplate flowTemplate) {
        AbstractC22676k.m65750j(flowTemplate, "<this>");
        Map<String, String> bindings = flowTemplate.getBindings();
        if (bindings != null) {
            return bindings.get("current_step_list");
        }
        return null;
    }
}
