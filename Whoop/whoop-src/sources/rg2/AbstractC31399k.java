package rg2;

import com.whoop.addactivity.network.model.ScoreType;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: rg2.k */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\" \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m65681d2 = {"Lrg2/j;", "", "selectedInternalName", "Lrg2/h;", "a", "(Lrg2/j;Ljava/lang/String;)Lrg2/h;", "", "Ljava/util/List;", "getSamplePreSessionRecentActivityItems", "()Ljava/util/List;", "samplePreSessionRecentActivityItems", "start-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31399k {

    /* JADX INFO: renamed from: a */
    private static final List<C31398j> f129241a;

    static {
        ScoreType scoreType = ScoreType.CARDIO;
        f129241a = AbstractC37056f.m118959K(new C31398j("walking", "Walking", "", false, scoreType), new C31398j("weightlifting", "Weightlifting", "", false, scoreType), new C31398j("running", "Running", "", true, scoreType), new C31398j("functional-fitness", "Functional Fitness", "", false, scoreType), new C31398j("cycling", "Cycling", "", false, scoreType));
    }

    /* JADX INFO: renamed from: a */
    public static final C31396h m96703a(C31398j c31398j, String str) {
        AbstractC22676k.m65750j(c31398j, "<this>");
        return new C31396h(c31398j.getInternalName(), c31398j.getIconUrl(), AbstractC22676k.m65745e(c31398j.getInternalName(), str), c31398j.getDisplayName(), c31398j.getScoreType().name(), c31398j.getHasGps());
    }
}
