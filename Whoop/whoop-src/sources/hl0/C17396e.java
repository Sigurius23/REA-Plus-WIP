package hl0;

import com.whoop.bot.models.feedback.AiMessageFeedback;
import java.util.LinkedHashMap;
import java.util.Map;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hl0.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0004\b\f\u0010\rR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Lhl0/e;", "", "<init>", "()V", "", "messageId", "Lcom/whoop/bot/models/feedback/AiMessageFeedback;", "feedback", "Ll83/a0;", "a", "(Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiMessageFeedback;)V", "", "b", "()Ljava/util/Map;", "", "Ljava/util/Map;", "messageStatus", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17396e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Map<String, AiMessageFeedback> messageStatus = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final void m49236a(String messageId, AiMessageFeedback feedback) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(feedback, "feedback");
        this.messageStatus.put(messageId, feedback);
    }

    /* JADX INFO: renamed from: b */
    public final Map<String, AiMessageFeedback> m49237b() {
        return AbstractC25247g0.m74001j0(this.messageStatus);
    }
}
