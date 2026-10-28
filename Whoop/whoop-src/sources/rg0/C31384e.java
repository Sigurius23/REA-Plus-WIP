package rg0;

import fi0.InterfaceC14515a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: rg0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lrg0/e;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "", "action", "behaviorName", "customBehaviorId", "Ll83/a0;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "d", "(Ljava/lang/String;Ljava/lang/String;)V", "c", "b", "Lfi0/a;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31384e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    public C31384e(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    private final void m96642a(String action, String behaviorName, String customBehaviorId) {
        this.analytics.mo41422d("journal", action, "ai_custom_behavior", "AI Coach", behaviorName, AbstractC31061c.m95645u("custom_behavior_id", customBehaviorId));
    }

    /* JADX INFO: renamed from: b */
    public final void m96643b(String behaviorName, String customBehaviorId) {
        AbstractC22676k.m65750j(behaviorName, "behaviorName");
        AbstractC22676k.m65750j(customBehaviorId, "customBehaviorId");
        m96642a("ai_journal_widget_submit_succeeded", behaviorName, customBehaviorId);
    }

    /* JADX INFO: renamed from: c */
    public final void m96644c(String behaviorName, String customBehaviorId) {
        AbstractC22676k.m65750j(behaviorName, "behaviorName");
        AbstractC22676k.m65750j(customBehaviorId, "customBehaviorId");
        m96642a("ai_journal_widget_submit_tapped", behaviorName, customBehaviorId);
    }

    /* JADX INFO: renamed from: d */
    public final void m96645d(String behaviorName, String customBehaviorId) {
        AbstractC22676k.m65750j(behaviorName, "behaviorName");
        AbstractC22676k.m65750j(customBehaviorId, "customBehaviorId");
        m96642a("ai_journal_widget_viewed", behaviorName, customBehaviorId);
    }
}
