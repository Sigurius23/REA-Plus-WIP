package com.whoop.archv2.model.template;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.ScreenAnalyticEventModel;
import com.whoop.design.models.modal.LifecycleInteractions;
import j93.InterfaceC21461d;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.ObjectSerializer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import wc3.C37142g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \r2\u00020\u0001:\u0001\u000eJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00078VX\u0097\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/archv2/model/template/ScreenTemplate;", "", "Lcom/whoop/analytics/ScreenAnalyticEventModel;", "screenAnalytics", "Lcom/whoop/analytics/AnalyticEventModel;", "failureAnalyticEvent", "(Lcom/whoop/analytics/ScreenAnalyticEventModel;)Lcom/whoop/analytics/AnalyticEventModel;", "Lcom/whoop/design/models/modal/LifecycleInteractions;", "getLifecycleInteractions", "()Lcom/whoop/design/models/modal/LifecycleInteractions;", "getLifecycleInteractions$annotations", "()V", "lifecycleInteractions", "Companion", "a", "Lcom/whoop/archv2/model/template/FlowTemplate;", "Lcom/whoop/archv2/model/template/ListTemplate;", "Lcom/whoop/archv2/model/template/NavigationTemplate;", "Lcom/whoop/archv2/model/template/SingleItemTemplate;", "Lcom/whoop/archv2/model/template/UnknownTemplate;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public interface ScreenTemplate {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f24064a;

    /* JADX INFO: renamed from: com.whoop.archv2.model.template.ScreenTemplate$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/archv2/model/template/ScreenTemplate$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/archv2/model/template/ScreenTemplate;", "serializer", "()Lwc3/c;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ Companion f24064a = new Companion();

        private Companion() {
        }

        public final InterfaceC37138c serializer() {
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            return new C37142g("com.whoop.archv2.model.template.ScreenTemplate", c22673i0.getOrCreateKotlinClass(ScreenTemplate.class), new InterfaceC21461d[]{c22673i0.getOrCreateKotlinClass(FlowTemplate.class), c22673i0.getOrCreateKotlinClass(ListTemplate.class), c22673i0.getOrCreateKotlinClass(NavigationTemplate.class), c22673i0.getOrCreateKotlinClass(SingleItemTemplate.class), c22673i0.getOrCreateKotlinClass(UnknownTemplate.class)}, new InterfaceC37138c[]{FlowTemplate$$serializer.INSTANCE, ListTemplate$$serializer.INSTANCE, NavigationTemplate$$serializer.INSTANCE, SingleItemTemplate$$serializer.INSTANCE, new ObjectSerializer("com.whoop.archv2.model.template.UnknownTemplate", UnknownTemplate.INSTANCE, new Annotation[0])}, new Annotation[0]);
        }
    }

    default AnalyticEventModel failureAnalyticEvent(ScreenAnalyticEventModel screenAnalytics) {
        AbstractC22676k.m65750j(screenAnalytics, "screenAnalytics");
        return screenAnalytics.getScreenFailed();
    }

    default LifecycleInteractions getLifecycleInteractions() {
        return null;
    }
}
