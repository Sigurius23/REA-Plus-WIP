package is1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.journal.interactors.p062v2.datepicker.DateDisplay;
import com.whoop.journal.interactors.p062v2.datepicker.JournalDatePickerEntry;
import com.whoop.journalhometile.domain.model.JournalHomeTileModel;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.InterdayJournalScreenModel;
import com.whoop.navigation.NavigationScreenModel;
import ds1.AbstractC12339i;
import ds1.EnumC12338h;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import h11.C16606a;
import h11.C16613h;
import h11.EnumC16612g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import js1.C21917h;
import l83.C23454a0;
import m83.AbstractC25267u;
import ny0.C27256h;
import p088dc.AbstractC11895b;
import p710im1.C18689p0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import x81.C38072d;

/* JADX INFO: renamed from: is1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\f\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;", "entry", "Lcom/whoop/navigation/e;", "tileDestination", "Lh11/h;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;Lcom/whoop/navigation/e;)Lh11/h;", "Ljb1/a;", "a", "Ljb1/a;", "d", "()Ljb1/a;", "journalHomeTileDesignItemReducer", "journal-home-tile-mini-arch_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC20922a {

    /* JADX INFO: renamed from: a */
    private static final C21535a f78846a = AbstractC21537c.m60554d(new C18689p0(16));

    /* JADX INFO: renamed from: is1.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f78847w;

        public a(Function1 function1) {
            this.f78847w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f78847w.invoke((JournalHomeTileModel) it);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C21535a m58040d() {
        return f78846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m58041e(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C18689p0(17));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m58042f(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(JournalHomeTileModel.class), new a(new C18689p0(18)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C21917h m58043g(JournalHomeTileModel model) {
        Integer numValueOf;
        C27256h c27256h;
        AbstractC22676k.m65750j(model, "model");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitle());
        String rightIcon = model.getRightIcon();
        if (rightIcon != null) {
            Integer numM46376a = AbstractC16315n0.m46376a(rightIcon);
            numValueOf = Integer.valueOf(numM46376a != null ? numM46376a.intValue() : AbstractC11895b.m31981D(C38072d.f163053a));
        } else {
            numValueOf = null;
        }
        CardButtonModel cardButton = model.getCardButton();
        if (cardButton != null) {
            TextResource title = cardButton.getTitle();
            EnumC16313m0 enumC16313m0M46377b = AbstractC16315n0.m46377b(cardButton.getIcon());
            C9598e destination = cardButton.getDestination();
            c27256h = new C27256h(title, enumC16313m0M46377b, null, null, null, null, null, destination == null ? new C9598e(null, null, null, 7, null) : destination, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, 33554300, null);
        } else {
            c27256h = null;
        }
        List<JournalDatePickerEntry> datePickerItems = model.getDatePickerItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(datePickerItems, 10));
        Iterator<T> it = datePickerItems.iterator();
        while (it.hasNext()) {
            arrayList.add(m58044h((JournalDatePickerEntry) it.next(), model.getDestination()));
        }
        return new C21917h(textResourceM21278l, numValueOf, c27256h, arrayList, model.getDestination());
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a3  */
    /* JADX INFO: renamed from: h */
    private static final C16613h m58044h(JournalDatePickerEntry journalDatePickerEntry, C9598e c9598e) {
        EnumC12338h enumC12338h;
        Long cycleId;
        C16606a c16606a = new C16606a(journalDatePickerEntry.getDateDisplay().getDay(), String.valueOf(journalDatePickerEntry.getDateDisplay().getDate()));
        DateDisplay multiDayCycleDateDisplay = journalDatePickerEntry.getMultiDayCycleDateDisplay();
        C9598e c9598eM23127b = null;
        C16606a c16606a2 = multiDayCycleDateDisplay != null ? new C16606a(multiDayCycleDateDisplay.getDay(), String.valueOf(multiDayCycleDateDisplay.getDate())) : null;
        boolean zIsSelected = journalDatePickerEntry.isSelected();
        String upperCase = journalDatePickerEntry.getJournalEntryStatus().toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        EnumC12338h enumC12338h2 = EnumC12338h.INVALID;
        EnumC12338h[] enumC12338hArrValues = EnumC12338h.values();
        int length = enumC12338hArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC12338h = null;
                break;
            }
            enumC12338h = enumC12338hArrValues[i13];
            if (AbstractC22676k.m65745e(enumC12338h.name(), upperCase)) {
                break;
            }
            i13++;
        }
        if (enumC12338h != null) {
            enumC12338h2 = enumC12338h;
        }
        EnumC16612g enumC16612gM34476a = AbstractC12339i.m34476a(enumC12338h2);
        String date = journalDatePickerEntry.getDate();
        Long cycleId2 = journalDatePickerEntry.getCycleId();
        if (c9598e != null) {
            NavigationScreenModel parameters = c9598e.getParameters();
            if (!(parameters instanceof InterdayJournalScreenModel) || (cycleId = journalDatePickerEntry.getCycleId()) == null) {
                c9598eM23127b = c9598e;
            } else {
                c9598eM23127b = C9598e.m23127b(c9598e, null, InterdayJournalScreenModel.copy$default((InterdayJournalScreenModel) parameters, journalDatePickerEntry.getDate(), cycleId.longValue(), null, 4, null), null, 5, null);
                if (c9598eM23127b == null) {
                    c9598eM23127b = c9598e;
                }
            }
        }
        return new C16613h(c16606a, c16606a2, zIsSelected, enumC16612gM34476a, date, cycleId2, null, false, false, null, c9598eM23127b, null, false, null, 15040, null);
    }
}
