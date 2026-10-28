package l31;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import java.util.List;
import live.hms.video.error.ErrorCodes;
import p497t7.InterfaceC33561b;
import p715kotlin.Metadata;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;
import y01.C39023f;
import y01.C39024g;

/* JADX INFO: renamed from: l31.l */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"", "Ly01/f;", "a", "Ljava/util/List;", "()Ljava/util/List;", "progressBreakdownStates", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23318l {

    /* JADX INFO: renamed from: a */
    private static final List<C39023f> f92443a;

    static {
        EnumC39333f enumC39333f = EnumC39333f.STRAIN;
        EnumC39333f enumC39333f2 = EnumC39333f.BLACK_20;
        TextResource textResourceM21278l = AbstractC8693b.m21278l("1/2 Marathon");
        EnumC39333f enumC39333f3 = EnumC39333f.BRAND_WHITE;
        C39024g c39024g = new C39024g(textResourceM21278l, enumC39333f3);
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l("Marathon");
        EnumC39333f enumC39333f4 = EnumC39333f.WHITE_70;
        C39023f c39023f = new C39023f(ErrorCodes.WebsocketMethodErrors.cServerErrors, 2500, enumC39333f, enumC39333f2, c39024g, new C39024g(textResourceM21278l2, enumC39333f4), null, 64, null);
        C39023f c39023f2 = new C39023f(InterfaceC33561b.INVALID_OWNERSHIP, 7500, EnumC39333f.RECOVERY_HIGH_RECOVERY, enumC39333f2, null, new C39024g(AbstractC8693b.m21278l("10K Run"), enumC39333f4), null, 64, null);
        EnumC39333f enumC39333f5 = EnumC39333f.STRAIN_ZONE_4;
        f92443a = AbstractC37056f.m118959K(c39023f, c39023f2, new C39023f(8000, 4000, enumC39333f5, enumC39333f2, new C39024g(AbstractC8693b.m21278l("Quarter Marathon"), enumC39333f5), null, null, 64, null), new C39023f(8000, 8000, EnumC39333f.STRAIN_ZONE_5, enumC39333f2, null, null, null, 64, null), new C39023f(ErrorCodes.WebsocketMethodErrors.cServerErrors, 2500, enumC39333f, enumC39333f2, new C39024g(AbstractC8693b.m21278l("1/2 Marathon long text to support i18n"), enumC39333f3), new C39024g(AbstractC8693b.m21278l("Marathon long text to support i18n"), enumC39333f4), null, 64, null), new C39023f(ErrorCodes.WebsocketMethodErrors.cServerErrors, 2500, enumC39333f, enumC39333f2, new C39024g(AbstractC8693b.m21278l("1/2 Marathon"), enumC39333f3), new C39024g(AbstractC8693b.m21278l("Marathon long text to support i18n"), enumC39333f4), null, 64, null), new C39023f(4, 3, EnumC39333f.ACCENT_POSITIVE_TREND, EnumC39333f.ACCENT_POSITIVE_TREND_15, null, null, new C39024g(AbstractC8693b.m21278l("3/4 Updates Completed"), enumC39333f3)));
    }

    /* JADX INFO: renamed from: a */
    public static final List<C39023f> m67507a() {
        return f92443a;
    }
}
