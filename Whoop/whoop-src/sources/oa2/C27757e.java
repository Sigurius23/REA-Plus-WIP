package oa2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.settings.accountheader.model.MyAccountHeaderCtaModel;
import com.whoop.settings.accountheader.model.MyAccountHeaderModel;
import gz0.EnumC16313m0;
import ja2.C21498a;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import la2.AbstractC23555c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import vc2.AbstractC35881d;

/* JADX INFO: renamed from: oa2.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Loa2/e;", "", "<init>", "()V", "Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;", "Loa2/b;", "c", "(Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;)Loa2/b;", "Lja2/a;", "result", "Loa2/d;", "a", "(Lja2/a;)Loa2/d;", "Lla2/c;", "Loa2/a;", "b", "(Lla2/c;)Loa2/a;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27757e {
    /* JADX INFO: renamed from: c */
    private final C27754b m83855c(MyAccountHeaderCtaModel myAccountHeaderCtaModel) {
        return new C27754b(AbstractC8693b.m21278l(myAccountHeaderCtaModel.getText()), myAccountHeaderCtaModel.getDestination(), myAccountHeaderCtaModel.getTracking());
    }

    /* JADX INFO: renamed from: a */
    public final C27756d m83856a(C21498a result) {
        AbstractC22676k.m65750j(result, "result");
        return new C27756d(m83857b(result.getMyAccountHeaderResult()), AbstractC35881d.m113935a(result.getSwitchBillingPlanModalResult()));
    }

    /* JADX INFO: renamed from: b */
    public final C27753a m83857b(AbstractC23555c result) {
        EnumC16313m0 enumC16313m0;
        AbstractC22676k.m65750j(result, "result");
        if (result.equals(AbstractC23555c.a.f93425a)) {
            return null;
        }
        if (!(result instanceof AbstractC23555c.b)) {
            throw new NoWhenBranchMatchedException();
        }
        MyAccountHeaderModel result2 = ((AbstractC23555c.b) result).getResult();
        String icon = result2.getIcon();
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC16313m0 = null;
                break;
            }
            enumC16313m0 = enumC16313m0ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC16313m0.name(), icon)) {
                break;
            }
            i13++;
        }
        AbstractC22403o abstractC22403oM64502k = enumC16313m0 != null ? AbstractC22404p.m64502k(enumC16313m0.toWhoopIcon()) : null;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(result2.getTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(result2.getSubtitle());
        C27754b c27754bM83855c = m83855c(result2.getJoinCta());
        MyAccountHeaderCtaModel switchCta = result2.getSwitchCta();
        return new C27753a(abstractC22403oM64502k, textResourceM21278l, textResourceM21278l2, c27754bM83855c, switchCta != null ? m83855c(switchCta) : null, m83855c(result2.getCancelCta()));
    }
}
