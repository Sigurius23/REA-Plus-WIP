package c41;

import c13.AbstractC3855a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.ActivityDetailType;
import gz0.AbstractC16319p0;
import gz0.EnumC16313m0;
import java.util.List;
import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: c41.p */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"", "Lc41/w;", "a", "Ljava/util/List;", "()Ljava/util/List;", "activityTileStates", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4089p {

    /* JADX INFO: renamed from: a */
    private static final List<C4138w> f16583a;

    static {
        TextResource textResourceM21278l = AbstractC8693b.m21278l("TITLE");
        C4082o c4082o = new C4082o(true, null, new AbstractC22403o.a(AbstractC16319p0.m46430a().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String()), null, null, 26, null);
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l("PROCESS");
        EnumC4040i enumC4040i = EnumC4040i.PROCESS_NOW;
        AbstractC4145x.a aVar = new AbstractC4145x.a(textResourceM21278l2, null, enumC4040i, false, null, 26, null);
        ActivityDetailType activityDetailType = ActivityDetailType.SLEEP;
        C4138w c4138w = new C4138w(null, textResourceM21278l, c4082o, aVar, activityDetailType, null, null, null, null, null, null, false, null, null, 16353, null);
        C4138w c4138w2 = new C4138w(null, AbstractC8693b.m21278l("TITLE"), new C4082o(false, null, new AbstractC22403o.a(AbstractC16319p0.m46430a().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String()), null, null, 26, null), new AbstractC4145x.a(AbstractC8693b.m21278l("PROCESS"), null, enumC4040i, false, AbstractC4075n.m12513r(), 10, null), activityDetailType, null, null, null, null, null, null, false, EnumC4029g2.SHOW_ONBOARDING, null, 12257, null);
        C4138w c4138w3 = new C4138w(null, AbstractC8693b.m21278l("TITLE"), new C4082o(true, null, new AbstractC22403o.a(AbstractC3855a.m11817a()), null, null, 26, null), new AbstractC4145x.b(AbstractC8693b.m21278l("Pending"), false, 2, null), activityDetailType, null, null, null, null, null, null, false, null, null, 16353, null);
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l("TITLE");
        EnumC39333f enumC39333f = EnumC39333f.STRAIN;
        C4082o c4082o2 = new C4082o(false, enumC39333f, new AbstractC22403o.a(AbstractC3855a.m11817a()), AbstractC8693b.m21278l("12.1"), null, 17, null);
        AbstractC4145x.c cVar = new AbstractC4145x.c(AbstractC8693b.m21278l("8:00am"), AbstractC8693b.m21278l("9:00am"), enumC39333f);
        ActivityDetailType activityDetailType2 = ActivityDetailType.CARDIO;
        C4138w c4138w4 = new C4138w(null, textResourceM21278l3, c4082o2, cVar, activityDetailType2, null, null, null, null, null, null, false, null, null, 16353, null);
        C4138w c4138w5 = new C4138w(null, AbstractC8693b.m21278l("TITLE"), new C4082o(false, enumC39333f, new AbstractC22403o.a(AbstractC3855a.m11817a()), AbstractC8693b.m21278l("12.1"), null, 17, null), new AbstractC4145x.c(AbstractC8693b.m21278l("8:00am"), AbstractC8693b.m21278l("9:00am"), enumC39333f), activityDetailType2, null, null, null, null, null, null, true, null, null, 14305, null);
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l("TITLE");
        EnumC39333f enumC39333f2 = EnumC39333f.SLEEP;
        AbstractC22403o.a aVar2 = new AbstractC22403o.a(AbstractC16319p0.m46430a().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String().getNap());
        EnumC16313m0 enumC16313m0 = EnumC16313m0.NO_INTERNET;
        f16583a = AbstractC37056f.m118959K(c4138w, c4138w2, c4138w3, c4138w4, c4138w5, new C4138w(null, textResourceM21278l4, new C4082o(false, enumC39333f2, aVar2, null, enumC16313m0, 9, null), new AbstractC4145x.c(AbstractC8693b.m21278l("Start"), AbstractC8693b.m21278l("End"), enumC39333f2), activityDetailType, null, null, null, null, null, null, false, null, null, 16353, null), new C4138w(null, AbstractC8693b.m21278l("DIFF COLOR"), new C4082o(false, enumC39333f2, new AbstractC22403o.a(AbstractC16319p0.m46430a().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String().getNap()), null, enumC16313m0, 9, null), new AbstractC4145x.c(AbstractC8693b.m21278l("Start"), AbstractC8693b.m21278l("End"), enumC39333f2), activityDetailType, null, EnumC39333f.ACCENT_ALERT_TREND_15, null, null, null, null, false, null, null, 16289, null), new C4138w(null, AbstractC8693b.m21278l("EXTREMELY LONG TITLE LET'S SEE WHAT'S GOING TO HAPPEN WISH ME LUCK"), new C4082o(false, enumC39333f2, new AbstractC22403o.a(AbstractC16319p0.m46430a().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String().getNap()), null, enumC16313m0, 9, null), new AbstractC4145x.c(AbstractC8693b.m21278l("Start"), AbstractC8693b.m21278l("End"), enumC39333f2), activityDetailType, null, null, null, null, null, null, false, null, null, 16353, null));
    }

    /* JADX INFO: renamed from: a */
    public static final List<C4138w> m12550a() {
        return f16583a;
    }
}
