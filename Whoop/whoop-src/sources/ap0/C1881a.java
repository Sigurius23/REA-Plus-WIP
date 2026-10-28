package ap0;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.domain.model.User;
import ep0.C13404j;
import or2.InterfaceC28215x1;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import z92.InterfaceC40205a;

/* JADX INFO: renamed from: ap0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lap0/a;", "", "Lor2/x1;", "uuidGenerator", "Lz92/a;", "userInfoAccessor", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lor2/x1;Lz92/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "", "conversationSeedId", "Lep0/j;", "context", "a", "(Ljava/lang/String;Lep0/j;)Ljava/lang/String;", "Lor2/x1;", "b", "Lz92/a;", "c", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C1881a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC28215x1 uuidGenerator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC40205a userInfoAccessor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    public C1881a(InterfaceC28215x1 uuidGenerator, InterfaceC40205a userInfoAccessor, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(uuidGenerator, "uuidGenerator");
        AbstractC22676k.m65750j(userInfoAccessor, "userInfoAccessor");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.uuidGenerator = uuidGenerator;
        this.userInfoAccessor = userInfoAccessor;
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: renamed from: a */
    public final String m5658a(String conversationSeedId, C13404j context) {
        AbstractC22676k.m65750j(conversationSeedId, "conversationSeedId");
        AbstractC22676k.m65750j(context, "context");
        User userMo129090d = this.userInfoAccessor.mo129090d();
        int id4 = userMo129090d != null ? userMo129090d.getId() : 0;
        String sourceType = context.getSourceType();
        if (sourceType == null) {
            sourceType = context.getScreenName();
        }
        String presetQuestion = context.getPresetQuestion();
        String strM73373f = presetQuestion != null ? AbstractC25012a.m73373f(id4, presetQuestion, conversationSeedId) : AbstractC25012a.m73373f(id4, sourceType, conversationSeedId);
        if (this.featureFlagChecker.isFeatureEnabled("hal-uuid-string-strong")) {
            String string = this.uuidGenerator.mo85407e(strM73373f).toString();
            AbstractC22676k.m65747g(string);
            return string;
        }
        String string2 = this.uuidGenerator.mo85406d(strM73373f).toString();
        AbstractC22676k.m65747g(string2);
        return string2;
    }
}
