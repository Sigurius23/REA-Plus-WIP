package p52;

import android.content.Context;
import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.AbstractC1354v1;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import com.whoop.domain.model.StrainRecoveryMapping;
import com.whoop.realtime.presentation.adapter.WhoopViewPager;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import k52.AbstractC22210f;
import lm2.C24518d;
import o52.C27548d0;
import o52.C27563l;
import o52.C27585w;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p52.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010,R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, m65681d2 = {"Lp52/b;", "Landroidx/fragment/app/v1;", "Landroidx/fragment/app/o1;", "fragmentManager", "Lcom/whoop/realtime/presentation/adapter/WhoopViewPager;", "pager", "Lcom/whoop/domain/model/StrainRecoveryMapping;", "strainMapping", "", "strainGoal", "", "hasSportFromIntent", "Llm2/d;", "sportFromIntent", "useGps", "Landroid/content/Context;", "context", "<init>", "(Landroidx/fragment/app/o1;Lcom/whoop/realtime/presentation/adapter/WhoopViewPager;Lcom/whoop/domain/model/StrainRecoveryMapping;Ljava/lang/Double;ZLlm2/d;ZLandroid/content/Context;)V", "", "position", "", "v", "(I)Ljava/lang/String;", "Landroidx/fragment/app/m0;", "t", "(I)Landroidx/fragment/app/m0;", "d", "()I", "", "f", "(I)Ljava/lang/CharSequence;", "", "u", "(I)J", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Landroidx/fragment/app/o1;", "i", "Lcom/whoop/realtime/presentation/adapter/WhoopViewPager;", "j", "Lcom/whoop/domain/model/StrainRecoveryMapping;", "k", "Ljava/lang/Double;", "l", "Z", "m", "Llm2/d;", "n", "o", "Landroid/content/Context;", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28859b extends AbstractC1354v1 {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final AbstractC1329o1 fragmentManager;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final WhoopViewPager pager;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final StrainRecoveryMapping strainMapping;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final Double strainGoal;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final boolean hasSportFromIntent;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final C24518d sportFromIntent;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final boolean useGps;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28859b(AbstractC1329o1 fragmentManager, WhoopViewPager pager, StrainRecoveryMapping strainRecoveryMapping, Double d3, boolean z4, C24518d sportFromIntent, boolean z13, Context context) {
        super(fragmentManager);
        AbstractC22676k.m65750j(fragmentManager, "fragmentManager");
        AbstractC22676k.m65750j(pager, "pager");
        AbstractC22676k.m65750j(sportFromIntent, "sportFromIntent");
        AbstractC22676k.m65750j(context, "context");
        this.fragmentManager = fragmentManager;
        this.pager = pager;
        this.strainMapping = strainRecoveryMapping;
        this.strainGoal = d3;
        this.hasSportFromIntent = z4;
        this.sportFromIntent = sportFromIntent;
        this.useGps = z13;
        this.context = context;
    }

    /* JADX INFO: renamed from: v */
    private final String m87781v(int position) {
        return AbstractC25012a.m73374g(position, "android:switcher:", String.valueOf(this.pager.getId()), ":");
    }

    @Override // p144fc.AbstractC14345a
    /* JADX INFO: renamed from: d */
    public int mo28901d() {
        return (this.useGps ? 1 : 0) + 2;
    }

    @Override // p144fc.AbstractC14345a
    /* JADX INFO: renamed from: f */
    public CharSequence mo40966f(int position) {
        if (position == 0) {
            String string = this.context.getString(AbstractC22210f.f86428K);
            AbstractC22676k.m65749i(string, "getString(...)");
            return string;
        }
        if (position == 1) {
            String string2 = this.context.getString(AbstractC22210f.f86424I);
            AbstractC22676k.m65749i(string2, "getString(...)");
            return string2;
        }
        if (position != 2) {
            throw new IllegalArgumentException();
        }
        String string3 = this.context.getString(AbstractC22210f.f86426J);
        AbstractC22676k.m65749i(string3, "getString(...)");
        return string3;
    }

    @Override // androidx.fragment.app.AbstractC1354v1
    /* JADX INFO: renamed from: t */
    public AbstractComponentCallbacksC1320m0 mo4240t(int position) {
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0M4140E = this.fragmentManager.m4140E(m87781v(position));
        if (abstractComponentCallbacksC1320m0M4140E != null) {
            return abstractComponentCallbacksC1320m0M4140E;
        }
        if (position == 0) {
            C27548d0.Companion companion = C27548d0.INSTANCE;
            StrainRecoveryMapping strainRecoveryMapping = this.strainMapping;
            Double d3 = this.strainGoal;
            return companion.m83140a(strainRecoveryMapping, d3 != null ? d3.doubleValue() : 0.0d);
        }
        if (position == 1) {
            return C27563l.INSTANCE.m83182a();
        }
        if (position == 2) {
            return this.hasSportFromIntent ? C27585w.INSTANCE.m83341a(this.sportFromIntent.m71421k()) : C27585w.INSTANCE.m83341a(null);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.fragment.app.AbstractC1354v1
    /* JADX INFO: renamed from: u */
    public long mo4241u(int position) {
        return position;
    }
}
