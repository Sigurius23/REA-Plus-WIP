package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.DateSelectorModel;
import com.whoop.design.models.items.DateStripEntryStatus;
import com.whoop.design.models.items.DateStripItemModel;
import com.whoop.design.models.items.DateStripModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.models.GenericInteraction;
import h11.C16606a;
import h11.C16613h;
import h11.EnumC16612g;
import i11.C17863f;
import i11.C17864g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import p291l0.AbstractC22977m;
import p291l0.C22961h;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lb1.w0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\r\u001a\u00020\f*\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\"\u001a\u0010\u0018\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m65681d2 = {"Lcom/whoop/design/models/items/DateSelectorModel;", "dateSelectorModel", "Li11/f;", "f", "(Lcom/whoop/design/models/items/DateSelectorModel;)Li11/f;", "Lcom/whoop/design/models/items/DateStripModel;", "Li11/g;", "i", "(Lcom/whoop/design/models/items/DateStripModel;)Li11/g;", "Lcom/whoop/design/models/items/DateStripItemModel;", "", "todayDate", "Lh11/h;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/design/models/items/DateStripItemModel;Ljava/lang/String;)Lh11/h;", "Lcom/whoop/design/models/items/DateStripEntryStatus;", "Lh11/g;", "g", "(Lcom/whoop/design/models/items/DateStripEntryStatus;)Lh11/g;", "Llb1/y0;", "a", "Llb1/y0;", "e", "()Llb1/y0;", "dateSelectorMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23731w0 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f94037a = Function1.m68251a(new C23644i0(21));

    /* JADX INFO: renamed from: lb1.w0$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f94038a;

        static {
            int[] iArr = new int[DateStripEntryStatus.values().length];
            try {
                iArr[DateStripEntryStatus.YES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DateStripEntryStatus.NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DateStripEntryStatus.INVALID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f94038a = iArr;
        }
    }

    /* JADX INFO: renamed from: lb1.w0$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f94039w;

        public b(Function1 function1) {
            this.f94039w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f94039w.invoke((DateSelectorModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m69610c(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(DateSelectorModel.class), new b(new C23644i0(22)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C17863f m69611d(DateSelectorModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69613f(model);
    }

    /* JADX INFO: renamed from: e */
    public static final C23743y0 m69612e() {
        return f94037a;
    }

    /* JADX INFO: renamed from: f */
    public static final C17863f m69613f(DateSelectorModel dateSelectorModel) {
        String nextDateTime;
        String prevDateTime;
        AbstractC22676k.m65750j(dateSelectorModel, "dateSelectorModel");
        C22961h c22961h = AbstractC22977m.f90654e;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(dateSelectorModel.getCurrentDateRange());
        boolean z4 = false;
        if (dateSelectorModel.getPreviousInteraction() != null || ((prevDateTime = dateSelectorModel.getPrevDateTime()) != null && prevDateTime.length() > 0)) {
            z4 = true;
        }
        boolean z13 = dateSelectorModel.getNextInteraction() != null || ((nextDateTime = dateSelectorModel.getNextDateTime()) != null && nextDateTime.length() > 0);
        String prevDateTime2 = dateSelectorModel.getPrevDateTime();
        String str = prevDateTime2 == null ? "" : prevDateTime2;
        String nextDateTime2 = dateSelectorModel.getNextDateTime();
        String str2 = nextDateTime2 == null ? "" : nextDateTime2;
        GenericInteraction previousInteraction = dateSelectorModel.getPreviousInteraction();
        GenericInteraction nextInteraction = dateSelectorModel.getNextInteraction();
        GenericInteraction labelInteraction = dateSelectorModel.getLabelInteraction();
        DateStripModel dateStrip = dateSelectorModel.getDateStrip();
        return new C17863f(c22961h, textResourceM21278l, z4, str, z13, str2, previousInteraction, nextInteraction, labelInteraction, dateStrip != null ? m69616i(dateStrip) : null);
    }

    /* JADX INFO: renamed from: g */
    private static final EnumC16612g m69614g(DateStripEntryStatus dateStripEntryStatus) {
        int i13 = a.f94038a[dateStripEntryStatus.ordinal()];
        if (i13 == 1) {
            return EnumC16612g.COMPLETED_JOURNAL;
        }
        if (i13 == 2) {
            return EnumC16612g.INCOMPLETE_JOURNAL;
        }
        if (i13 == 3) {
            return EnumC16612g.INVALID;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: h */
    private static final C16613h m69615h(DateStripItemModel dateStripItemModel, String str) {
        C16606a c16606a = new C16606a(dateStripItemModel.getDateDisplay().getDayOfWeek(), dateStripItemModel.getDateDisplay().getDayOfMonth());
        boolean zIsSelected = dateStripItemModel.isSelected();
        EnumC16612g enumC16612gM69614g = m69614g(dateStripItemModel.getEntryStatus());
        String date = dateStripItemModel.getDate();
        boolean z4 = true;
        if (dateStripItemModel.getEntryStatus() != DateStripEntryStatus.YES) {
            z4 = false;
        }
        return new C16613h(c16606a, null, zIsSelected, enumC16612gM69614g, date, null, null, z4, AbstractC22676k.m65745e(dateStripItemModel.getDate(), str), null, null, dateStripItemModel.getInteraction(), dateStripItemModel.getInteraction() != null, null, 9826, null);
    }

    /* JADX INFO: renamed from: i */
    private static final C17864g m69616i(DateStripModel dateStripModel) {
        List<DateStripItemModel> items = dateStripModel.getItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(m69615h((DateStripItemModel) it.next(), dateStripModel.getTodayDate()));
        }
        return new C17864g(arrayList, dateStripModel.getLeftCalendarIcon(), dateStripModel.getRightCalendarIcon(), dateStripModel.getCalendarIconInteraction());
    }
}
