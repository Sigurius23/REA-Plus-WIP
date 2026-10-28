package ux1;

import androidx.lifecycle.AbstractC1637w1;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.membership.reactivationmodal.domain.models.MemberStatisticsModel;
import com.whoop.membership.reactivationmodal.domain.models.ReactivationModalCtaModel;
import com.whoop.membership.reactivationmodal.domain.models.ReactivationModalModel;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import sx1.C33067c;
import sx1.C33069e;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: ux1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"Lux1/c;", "Landroidx/lifecycle/w1;", "Lsx1/c;", "coordinator", "<init>", "(Lsx1/c;)V", "Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalModel;", "Lux1/d;", "n", "(Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalModel;)Lux1/d;", "Lcom/whoop/membership/reactivationmodal/domain/models/MemberStatisticsModel;", "Lux1/a;", "l", "(Lcom/whoop/membership/reactivationmodal/domain/models/MemberStatisticsModel;)Lux1/a;", "Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalCtaModel;", "Lux1/b;", "j", "(Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalCtaModel;)Lux1/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lux1/d;", "g", "()Lux1/d;", "viewState", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35369c extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C35370d viewState;

    public C35369c(C33067c coordinator) {
        AbstractC22676k.m65750j(coordinator, "coordinator");
        ReactivationModalModel model = ((C33069e) coordinator.getReactivationModalFlow().getValue()).getModel();
        this.viewState = model != null ? m112225n(model) : null;
    }

    /* JADX INFO: renamed from: j */
    private final C35368b m112223j(ReactivationModalCtaModel reactivationModalCtaModel) {
        EnumC16313m0 enumC16313m0;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(reactivationModalCtaModel.getText());
        String trackingLabel = reactivationModalCtaModel.getTrackingLabel();
        C39274g c39274g = null;
        if (reactivationModalCtaModel.getIcon() != null) {
            String icon = reactivationModalCtaModel.getIcon();
            EnumC16313m0 enumC16313m1 = EnumC16313m0.REPORT;
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
            if (enumC16313m0 != null) {
                enumC16313m1 = enumC16313m0;
            }
            c39274g = new C39274g(enumC16313m1.toWhoopIcon(), null, 2, null);
        }
        return new C35368b(textResourceM21278l, trackingLabel, c39274g, reactivationModalCtaModel.getDestination());
    }

    /* JADX INFO: renamed from: l */
    private final C35367a m112224l(MemberStatisticsModel memberStatisticsModel) {
        return new C35367a(AbstractC8693b.m21278l(memberStatisticsModel.getValue()), AbstractC8693b.m21278l(memberStatisticsModel.getTitle()), null, 4, null);
    }

    /* JADX INFO: renamed from: n */
    private final C35370d m112225n(ReactivationModalModel reactivationModalModel) {
        EnumC16313m0 enumC16313m0;
        String mediaUrl = reactivationModalModel.getMediaUrl();
        String imageUrl = reactivationModalModel.getImageUrl();
        AbstractC22403o.c cVar = imageUrl != null ? new AbstractC22403o.c(imageUrl, C38072d.f163053a.m121951d().getLogo().getWhoopText(), 0, 0, 12, null) : null;
        String icon = reactivationModalModel.getIcon();
        EnumC16313m0 enumC16313m1 = EnumC16313m0.REPORT;
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
        if (enumC16313m0 != null) {
            enumC16313m1 = enumC16313m0;
        }
        C39274g c39274g = new C39274g(enumC16313m1.toWhoopIcon(), null, 2, null);
        TextResource textResourceM21278l = AbstractC8693b.m21278l(reactivationModalModel.getTagText());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(reactivationModalModel.getTitle());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(reactivationModalModel.getSubtitle());
        List<MemberStatisticsModel> memberStatistics = reactivationModalModel.getMemberStatistics();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(memberStatistics, 10));
        Iterator<T> it = memberStatistics.iterator();
        while (it.hasNext()) {
            arrayList.add(m112224l((MemberStatisticsModel) it.next()));
        }
        C35368b c35368bM112223j = m112223j(reactivationModalModel.getCta());
        ReactivationModalCtaModel secondaryCta = reactivationModalModel.getSecondaryCta();
        return new C35370d(mediaUrl, cVar, c39274g, textResourceM21278l, textResourceM21278l2, textResourceM21278l3, arrayList, c35368bM112223j, secondaryCta != null ? m112223j(secondaryCta) : null);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C35370d getViewState() {
        return this.viewState;
    }
}
