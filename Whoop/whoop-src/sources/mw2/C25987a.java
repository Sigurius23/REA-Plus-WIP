package mw2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.whattoexpect.domain.models.DailyProgress;
import com.whoop.whattoexpect.domain.models.ProgressIndicator;
import com.whoop.whattoexpect.domain.models.WhatToExpectResponse;
import gb1.AbstractC15673b0;
import iw2.InterfaceC21007b;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import lw2.C24778c;
import lw2.C24779d;
import mm1.C25694h;
import p01.C28582b;
import p01.EnumC28588h;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import s21.C32085h;

/* JADX INFO: renamed from: mw2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lmw2/a;", "", "<init>", "()V", "Lcom/whoop/whattoexpect/domain/models/ProgressIndicator;", "progressIndicator", "Llw2/d;", "d", "(Lcom/whoop/whattoexpect/domain/models/ProgressIndicator;)Llw2/d;", "Liw2/b;", "domainResult", "Llw2/c;", "b", "(Liw2/b;)Llw2/c;", "what-to-expect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25987a {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m77087c(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d */
    private final C24779d m77088d(ProgressIndicator progressIndicator) {
        return new C24779d(new C28582b(progressIndicator.getCircularProgressIndicator().getCurrentProgressSteps().getTotalSteps(), progressIndicator.getCircularProgressIndicator().getCurrentProgressSteps().getCurrentStep(), 0.0f, "", null, null, null, null, null, null, AbstractC15673b0.m43985G0(), AbstractC15673b0.m43985G0(), 80, 18.0f, 14.0f, false, false, 0L, EnumC28588h.STEPS, null, 754676, null), AbstractC8693b.m21278l(progressIndicator.getText()), progressIndicator.getCircularProgressIndicator().getCurrentProgressSteps().getTotalSteps() == progressIndicator.getCircularProgressIndicator().getCurrentProgressSteps().getCurrentStep(), String.valueOf(progressIndicator.getCircularProgressIndicator().getCurrentProgressSteps().getCurrentStep()), AbstractC2875y.m8295h(progressIndicator.getCircularProgressIndicator().getCurrentProgressSteps().getTotalSteps(), "/"));
    }

    /* JADX INFO: renamed from: b */
    public final C24778c m77089b(InterfaceC21007b domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        if (domainResult.equals(InterfaceC21007b.b.f79500a)) {
            return new C24778c(true, false, null, null, null, null, null, null, null, 508, null);
        }
        if (domainResult.equals(InterfaceC21007b.a.f79499a)) {
            return new C24778c(false, true, null, null, null, null, null, null, null, 508, null);
        }
        if (!(domainResult instanceof InterfaceC21007b.c)) {
            throw new NoWhenBranchMatchedException();
        }
        C21535a c21535aM60554d = AbstractC21537c.m60554d(new C25694h(28));
        InterfaceC21007b.c cVar = (InterfaceC21007b.c) domainResult;
        WhatToExpectResponse bffData = cVar.getBffData();
        TextResource toolbarTitle = bffData.getToolbarTitle();
        TextResource title = bffData.getTitle();
        TextResource subtitle = bffData.getSubtitle();
        DailyProgress dailyProgress = bffData.getDailyProgress();
        DailyProgress dailyProgress2 = dailyProgress == null ? new DailyProgress((TextResource) null, 0, 0, 7, (DefaultConstructorMarker) null) : dailyProgress;
        List<InterfaceC25312u> listM60540g = c21535aM60554d.m60540g(bffData.getItems());
        C32085h selectedMilestone = cVar.getSelectedMilestone();
        ProgressIndicator progressIndicator = bffData.getProgressIndicator();
        return new C24778c(false, false, toolbarTitle, title, subtitle, dailyProgress2, listM60540g, selectedMilestone, progressIndicator != null ? m77088d(progressIndicator) : null);
    }
}
