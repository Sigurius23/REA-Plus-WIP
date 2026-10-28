package wh0;

import com.whoop.aiinsights.domain.models.AiInsightsResponse;
import com.whoop.aiinsights.domain.models.PrimaryButton;
import com.whoop.aiinsights.domain.models.SecondaryButton;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23596b1;
import p720m91.InterfaceC25312u;
import ph0.C29234b;
import vh0.AbstractC36042c;
import vh0.C36044e;
import wd3.C37168b;

/* JADX INFO: renamed from: wh0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\u0005*\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Lwh0/a;", "", "<init>", "()V", "Lcom/whoop/aiinsights/domain/models/PrimaryButton;", "Lvh0/e;", "d", "(Lcom/whoop/aiinsights/domain/models/PrimaryButton;)Lvh0/e;", "Lcom/whoop/aiinsights/domain/models/SecondaryButton;", "e", "(Lcom/whoop/aiinsights/domain/models/SecondaryButton;)Lvh0/e;", "Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;", "response", "Lph0/b;", "screenArgs", "Lvh0/c$f;", "c", "(Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;Lph0/b;)Lvh0/c$f;", "Ljb1/a;", "a", "Ljb1/a;", "itemReducer", "ai-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37298a {

    /* JADX INFO: renamed from: b */
    public static final int f159457b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a itemReducer = AbstractC21537c.m60554d(new C37168b(12));

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C23454a0 m119439b(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60548c(C23596b1.f93677a.m68522a());
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d */
    private final C36044e m119440d(PrimaryButton primaryButton) {
        TextResource textResourceM21267a;
        String text = primaryButton.getText();
        if (text == null || (textResourceM21267a = AbstractC8693b.m21278l(text)) == null) {
            textResourceM21267a = AbstractC8693b.m21267a();
        }
        return new C36044e(textResourceM21267a, null, primaryButton.getDestination(), 2, null);
    }

    /* JADX INFO: renamed from: e */
    private final C36044e m119441e(SecondaryButton secondaryButton) {
        TextResource textResourceM21267a;
        String text = secondaryButton.getText();
        if (text == null || (textResourceM21267a = AbstractC8693b.m21278l(text)) == null) {
            textResourceM21267a = AbstractC8693b.m21267a();
        }
        String icon = secondaryButton.getIcon();
        return new C36044e(textResourceM21267a, icon != null ? AbstractC16315n0.m46377b(icon) : null, secondaryButton.getAction());
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC36042c.f m119442c(AiInsightsResponse response, C29234b screenArgs) {
        List<InterfaceC25312u> listM60540g;
        AbstractC22676k.m65750j(response, "response");
        AbstractC22676k.m65750j(screenArgs, "screenArgs");
        String header = response.getHeader();
        TextResource textResourceM21278l = header != null ? AbstractC8693b.m21278l(header) : null;
        String title = response.getTitle();
        TextResource textResourceM21278l2 = title != null ? AbstractC8693b.m21278l(title) : null;
        String rightIcon = response.getRightIcon();
        EnumC16313m0 enumC16313m0M46377b = rightIcon != null ? AbstractC16315n0.m46377b(rightIcon) : null;
        String message = response.getMessage();
        TextResource textResourceM21278l3 = message != null ? AbstractC8693b.m21278l(message) : null;
        List<DesignSystemModel> content = response.getContent();
        if (content == null || (listM60540g = this.itemReducer.m60540g(content)) == null) {
            listM60540g = C25271y.f99162w;
        }
        List<InterfaceC25312u> list = listM60540g;
        SecondaryButton contentActionButton = response.getContentActionButton();
        C36044e c36044eM119441e = contentActionButton != null ? m119441e(contentActionButton) : null;
        PrimaryButton leftButton = response.getLeftButton();
        C36044e c36044eM119440d = leftButton != null ? m119440d(leftButton) : null;
        PrimaryButton rightButton = response.getRightButton();
        return new AbstractC36042c.f(textResourceM21278l, enumC16313m0M46377b, textResourceM21278l2, textResourceM21278l3, list, c36044eM119441e, c36044eM119440d, rightButton != null ? m119440d(rightButton) : null, screenArgs.getActivityType());
    }
}
