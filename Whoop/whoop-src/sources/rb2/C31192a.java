package rb2;

import com.whoop.settings.gifthub.domain.models.GiftHubItemModel;
import com.whoop.settings.gifthub.domain.models.GiftHubResponseKt;
import com.whoop.settings.gifthub.domain.models.GiftHubSectionModel;
import com.whoop.settings.gifthub.domain.models.GiftHubStyle;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25267u;
import nb2.AbstractC26540b;
import nb2.C26541c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import qb2.C30182a;
import qb2.C30183b;
import qb2.EnumC30184c;
import qb2.InterfaceC30186e;
import y71.C39274g;

/* JADX INFO: renamed from: rb2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lrb2/a;", "", "<init>", "()V", "Lcom/whoop/settings/gifthub/domain/models/GiftHubSectionModel;", "Lqb2/b;", "c", "(Lcom/whoop/settings/gifthub/domain/models/GiftHubSectionModel;)Lqb2/b;", "Lcom/whoop/settings/gifthub/domain/models/GiftHubItemModel;", "Lqb2/a;", "b", "(Lcom/whoop/settings/gifthub/domain/models/GiftHubItemModel;)Lqb2/a;", "Lcom/whoop/settings/gifthub/domain/models/GiftHubStyle;", "Lqb2/c;", "d", "(Lcom/whoop/settings/gifthub/domain/models/GiftHubStyle;)Lqb2/c;", "Lnb2/c;", "result", "Lqb2/e;", "a", "(Lnb2/c;)Lqb2/e;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31192a {

    /* JADX INFO: renamed from: rb2.a$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f128516a;

        static {
            int[] iArr = new int[GiftHubStyle.values().length];
            try {
                iArr[GiftHubStyle.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GiftHubStyle.HOLIDAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f128516a = iArr;
        }
    }

    /* JADX INFO: renamed from: b */
    private final C30182a m96141b(GiftHubItemModel giftHubItemModel) {
        EnumC16313m0 enumC16313m0M46377b = AbstractC16315n0.m46377b(giftHubItemModel.getIcon());
        AbstractC22676k.m65747g(enumC16313m0M46377b);
        return new C30182a(new C39274g(enumC16313m0M46377b.toWhoopIcon(), null, 2, null), giftHubItemModel.getTitle(), giftHubItemModel.getSubtitle(), giftHubItemModel.getTrackingId(), giftHubItemModel.getDestination());
    }

    /* JADX INFO: renamed from: c */
    private final C30183b m96142c(GiftHubSectionModel giftHubSectionModel) {
        String header = giftHubSectionModel.getHeader();
        List<GiftHubItemModel> items = giftHubSectionModel.getItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(m96141b((GiftHubItemModel) it.next()));
        }
        return new C30183b(header, arrayList);
    }

    /* JADX INFO: renamed from: d */
    private final EnumC30184c m96143d(GiftHubStyle giftHubStyle) {
        int i13 = a.f128516a[giftHubStyle.ordinal()];
        if (i13 == 1) {
            return EnumC30184c.DEFAULT;
        }
        if (i13 == 2) {
            return EnumC30184c.HOLIDAY;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC30186e m96144a(C26541c result) {
        AbstractC22676k.m65750j(result, "result");
        AbstractC26540b state = result.getState();
        if (AbstractC22676k.m65745e(state, AbstractC26540b.c.f105487a)) {
            return InterfaceC30186e.c.f123578a;
        }
        if (!(state instanceof AbstractC26540b.b)) {
            if (AbstractC22676k.m65745e(state, AbstractC26540b.a.f105485a)) {
                return InterfaceC30186e.a.f123572a;
            }
            throw new NoWhenBranchMatchedException();
        }
        String header = ((AbstractC26540b.b) result.getState()).getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getHeader();
        String title = ((AbstractC26540b.b) result.getState()).getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getTitle();
        String subtitle = ((AbstractC26540b.b) result.getState()).getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getSubtitle();
        List<GiftHubSectionModel> sections = ((AbstractC26540b.b) result.getState()).getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getSections();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(sections, 10));
        Iterator<T> it = sections.iterator();
        while (it.hasNext()) {
            arrayList.add(m96142c((GiftHubSectionModel) it.next()));
        }
        return new InterfaceC30186e.b(header, title, subtitle, arrayList, m96143d(GiftHubResponseKt.toGiftHubStyle(((AbstractC26540b.b) result.getState()).getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getStyle())));
    }
}
