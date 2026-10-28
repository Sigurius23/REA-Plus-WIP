package qy2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.WhoopLabsScreenModel;
import com.whoop.whooplabs.data.domain.OptionSelection;
import com.whoop.whooplabs.data.domain.SurveyProvider;
import com.whoop.whooplabs.data.room.entity.ProtocolStepMysticReading;
import gz0.EnumC16313m0;
import i93.C18284j;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import lz2.C24826b;
import m83.AbstractC25267u;
import my2.AbstractC26034a;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import oy2.C28481g;
import oy2.C28488n;
import oy2.C28489o;
import oy2.InterfaceC28476b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import ty2.AbstractC34268a;
import ty2.C34270c;
import ty2.C34271d;
import ty2.C34272e;
import ty2.C34273f;
import yb3.AbstractC39421y;
import yw2.AbstractC39833e;
import yw2.C39830b;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: qy2.c */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\u0005*\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u0005*\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000f\u001a\u00020\u0005*\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0011\u0010\u0013\u001a\u00020\u0012*\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0015\u0010\u001f\u001a\u00020\u001e*\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u0013\u0010#\u001a\u00020\"*\u00020!H\u0002¢\u0006\u0004\b#\u0010$\u001a\u0013\u0010&\u001a\u00020\u0005*\u00020%H\u0002¢\u0006\u0004\b&\u0010'\u001a\u0011\u0010*\u001a\u00020)*\u00020(¢\u0006\u0004\b*\u0010+\u001a\u0013\u0010-\u001a\u00020\u0005*\u00020,H\u0002¢\u0006\u0004\b-\u0010.\u001a\u0013\u00100\u001a\u00020\u0005*\u00020/H\u0002¢\u0006\u0004\b0\u00101\u001a\u0013\u00103\u001a\u00020\u0005*\u000202H\u0002¢\u0006\u0004\b3\u00104\u001a\u0015\u00107\u001a\u000206*\u0004\u0018\u000105H\u0002¢\u0006\u0004\b7\u00108\u001a#\u0010>\u001a\u00020\u0005*\u0002092\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b>\u0010?¨\u0006@"}, m65681d2 = {"Loy2/b$m;", "Lty2/a$c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Loy2/b$m;)Lty2/a$c;", "Loy2/b$g;", "Lty2/a$a;", "s", "(Loy2/b$g;)Lty2/a$a;", "Loy2/b$i;", "u", "(Loy2/b$i;)Lty2/a$a;", "Loy2/b$c;", "p", "(Loy2/b$c;)Lty2/a$a;", "Loy2/b$a;", "n", "(Loy2/b$a;)Lty2/a$a;", "Lyw2/b;", "Llz2/b;", "m", "(Lyw2/b;)Llz2/b;", "Loy2/o;", "Lty2/f;", "C", "(Loy2/o;)Lty2/f;", "Loy2/b$s;", "Lty2/a$i;", "y", "(Loy2/b$s;)Lty2/a$i;", "Loy2/g;", "Lty2/c;", "z", "(Loy2/g;)Lty2/c;", "Loy2/b$n;", "Lty2/a$d;", "x", "(Loy2/b$n;)Lty2/a$d;", "Loy2/b$e;", "r", "(Loy2/b$e;)Lty2/a$a;", "Lcom/whoop/whooplabs/data/domain/OptionSelection;", "Lty2/d;", "A", "(Lcom/whoop/whooplabs/data/domain/OptionSelection;)Lty2/d;", "Loy2/b$d;", "q", "(Loy2/b$d;)Lty2/a$a;", "Loy2/b$h;", "t", "(Loy2/b$h;)Lty2/a$a;", "Loy2/b$j;", "v", "(Loy2/b$j;)Lty2/a$a;", "Loy2/n;", "Lty2/e;", "B", "(Loy2/n;)Lty2/e;", "Loy2/b$b;", "Lzr2/a;", "dateAndTimeProvider", "", "isUsing24HourTime", "o", "(Loy2/b$b;Lzr2/a;Z)Lty2/a$a;", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30779c {
    /* JADX INFO: renamed from: A */
    public static final C34271d m94619A(OptionSelection optionSelection) {
        AbstractC22676k.m65750j(optionSelection, "<this>");
        return new C34271d(optionSelection.getKey(), AbstractC8693b.m21278l(optionSelection.getValue()));
    }

    /* JADX INFO: renamed from: B */
    private static final C34272e m94620B(C28488n c28488n) {
        return new C34272e(AbstractC8693b.m21278l(c28488n != null ? c28488n.getTitle() : null), AbstractC8693b.m21278l(c28488n != null ? c28488n.getBody() : null), AbstractC8693b.m21278l(c28488n != null ? c28488n.getPositiveCta() : null), AbstractC8693b.m21278l(c28488n != null ? c28488n.getNegativeCta() : null));
    }

    /* JADX INFO: renamed from: C */
    private static final C34273f m94621C(C28489o c28489o) {
        return new C34273f(c28489o.getTimerState().getSeconds(), AbstractC8693b.m21278l(c28489o.getTitle()), AbstractC8693b.m21278l(c28489o.getSubtitle()), c28489o.getTimerState().getIsCountDown());
    }

    /* JADX INFO: renamed from: m */
    public static final C24826b m94634m(C39830b c39830b) {
        AbstractC22676k.m65750j(c39830b, "<this>");
        return new C24826b(c39830b.getIsConnecting() ? new TextResource.C8688b(AbstractC39833e.f171720e, new TextResource.AbstractC8690d.a(c39830b.getName())) : AbstractC8693b.m21278l(c39830b.getName()), c39830b.getAddress(), c39830b.getIsConnected(), c39830b.getIsConnecting());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    /* JADX WARN: Code duplicated, block: B:14:0x004e  */
    /* JADX WARN: Code duplicated, block: B:16:0x0051  */
    /* JADX INFO: renamed from: n */
    public static final AbstractC34268a.a m94635n(InterfaceC28476b.a aVar) {
        boolean z4;
        Object next;
        C34273f c34273fM94621C = m94621C(aVar.getToolbarState());
        C34270c c34270cM94647z = m94647z(aVar.getCancelStudyState());
        String content = aVar.getContent();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(aVar.getPrimaryButtonText());
        if (aVar.getIsRequired()) {
            Iterator<T> it = aVar.m86425m().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((C39830b) next).getIsConnected());
            if (next == null) {
                z4 = false;
            } else if (aVar.getToolbarState().m86783f()) {
                z4 = false;
            } else {
                z4 = true;
            }
        } else if (aVar.getToolbarState().m86783f()) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z13 = z4;
        String secondaryButtonText = aVar.getSecondaryButtonText();
        TextResource textResourceM21278l2 = secondaryButtonText != null ? AbstractC8693b.m21278l(secondaryButtonText) : null;
        boolean isAddNoteShowing = aVar.getIsAddNoteShowing();
        boolean isCancelStudyShowing = aVar.getIsCancelStudyShowing();
        List<C39830b> listM86425m = aVar.m86425m();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM86425m, 10));
        Iterator<T> it3 = listM86425m.iterator();
        while (it3.hasNext()) {
            arrayList.add(m94634m((C39830b) it3.next()));
        }
        return new AbstractC34268a.a.C42429a(c34273fM94621C, c34270cM94647z, z13, content, textResourceM21278l, textResourceM21278l2, isAddNoteShowing, isCancelStudyShowing, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final AbstractC34268a.a m94636o(InterfaceC28476b.b bVar, InterfaceC41070a interfaceC41070a, boolean z4) {
        C34273f c34273fM94621C = m94621C(bVar.getToolbarState());
        C34270c c34270cM94647z = m94647z(bVar.getCancelStudyState());
        String content = bVar.getContent();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(bVar.getPrimaryButtonText());
        boolean z13 = (bVar.getUserHasPickedDateTime() && bVar.getIsRequired()) || !bVar.getIsRequired();
        String secondaryButtonText = bVar.getSecondaryButtonText();
        TextResource textResourceM21278l2 = secondaryButtonText != null ? AbstractC8693b.m21278l(secondaryButtonText) : null;
        boolean isAddNoteShowing = bVar.getIsAddNoteShowing();
        boolean isCancelStudyShowing = bVar.getIsCancelStudyShowing();
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(bVar.getInputConfig().getInputLabel());
        LocalDateTime localDateTimeWithYear = new LocalDateTime().withHourOfDay(bVar.getHour()).withMinuteOfHour(bVar.getMinutes()).withDayOfMonth(bVar.getDayOfMonth()).withMonthOfYear(bVar.getMonth()).withYear(bVar.getYear());
        AbstractC22676k.m65749i(localDateTimeWithYear, "withYear(...)");
        return new AbstractC34268a.a.b(c34273fM94621C, c34270cM94647z, z13, content, textResourceM21278l, textResourceM21278l2, isAddNoteShowing, isCancelStudyShowing, textResourceM21278l3, interfaceC41070a, localDateTimeWithYear, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final AbstractC34268a.a m94637p(InterfaceC28476b.c cVar) {
        String strM94613a;
        String strM94613a2;
        String strM94613a3;
        ProtocolStepMysticReading mysticReading = cVar.getProtocolStepResult().getMysticReading();
        TextResource textResourceM21278l = null;
        Integer systolic = mysticReading != null ? mysticReading.getSystolic() : null;
        ProtocolStepMysticReading mysticReading2 = cVar.getProtocolStepResult().getMysticReading();
        Integer diastolic = mysticReading2 != null ? mysticReading2.getDiastolic() : null;
        ProtocolStepMysticReading mysticReading3 = cVar.getProtocolStepResult().getMysticReading();
        Integer heartRate = mysticReading3 != null ? mysticReading3.getHeartRate() : null;
        C30777a c30777a = new C30777a(systolic, cVar.getSystolicMin(), cVar.getSystolicMax(), cVar.getSystolicTooLowText(), cVar.getSystolicTooHighText(), cVar.getIsSystolicRequired(), cVar.getSystolicRequiredText());
        C30777a c30777a2 = new C30777a(diastolic, cVar.getDiastolicMin(), cVar.getDiastolicMax(), cVar.getDiastolicTooLowText(), cVar.getDiastolicTooHighText(), cVar.getIsDiastolicRequired(), cVar.getDiastolicRequiredText());
        C30777a c30777a3 = new C30777a(heartRate, cVar.getHrMin(), cVar.getHrMax(), cVar.getHrTooLowText(), cVar.getHrTooHighText(), cVar.getIsHrRequired(), cVar.getHrRequiredText());
        boolean z4 = c30777a.m94614b() && c30777a2.m94614b() && c30777a3.m94614b();
        C34273f c34273fM94621C = m94621C(cVar.getToolbarState());
        C34270c c34270cM94647z = m94647z(cVar.getCancelStudyState());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(cVar.getPrimaryButtonText());
        String secondaryButtonText = cVar.getSecondaryButtonText();
        TextResource textResourceM21278l3 = secondaryButtonText != null ? AbstractC8693b.m21278l(secondaryButtonText) : null;
        String content = cVar.getContent();
        String imageUrl = cVar.getImageUrl();
        Integer num = systolic;
        String imageAlt = cVar.getImageAlt();
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(cVar.getSystolicLabel());
        TextResource textResourceM21278l5 = AbstractC8693b.m21278l(cVar.getSystolicSuffix());
        TextResource textResourceM21278l6 = (!cVar.getSystolicHasBeenInteracted() || (strM94613a3 = c30777a.m94613a()) == null) ? null : AbstractC8693b.m21278l(strM94613a3);
        TextResource textResourceM21278l7 = AbstractC8693b.m21278l(cVar.getDiastolicLabel());
        TextResource textResourceM21278l8 = AbstractC8693b.m21278l(cVar.getDiastolicSuffix());
        TextResource textResourceM21278l9 = (!cVar.getDiastolicHasBeenInteracted() || (strM94613a2 = c30777a2.m94613a()) == null) ? null : AbstractC8693b.m21278l(strM94613a2);
        TextResource textResourceM21278l10 = AbstractC8693b.m21278l(cVar.getHrLabel());
        TextResource textResourceM21278l11 = AbstractC8693b.m21278l(cVar.getHrSuffix());
        if (cVar.getHrHasBeenInteracted() && (strM94613a = c30777a3.m94613a()) != null) {
            textResourceM21278l = AbstractC8693b.m21278l(strM94613a);
        }
        return new AbstractC34268a.a.c(c34273fM94621C, c34270cM94647z, z4 && !cVar.getToolbarState().m86783f(), content, imageUrl, imageAlt, num, textResourceM21278l4, textResourceM21278l5, textResourceM21278l6, diastolic, textResourceM21278l7, textResourceM21278l8, textResourceM21278l9, heartRate, textResourceM21278l10, textResourceM21278l11, textResourceM21278l, textResourceM21278l2, textResourceM21278l3, cVar.getIsAddNoteShowing(), cVar.getIsCancelStudyShowing());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:24:0x0067  */
    /* JADX INFO: renamed from: q */
    public static final AbstractC34268a.a m94638q(InterfaceC28476b.d dVar) {
        boolean z4;
        boolean z13;
        TextResource textResourceM21267a;
        String value;
        String value2 = dVar.getValue();
        Integer numM125932Q = value2 != null ? AbstractC39421y.m125932Q(value2) : null;
        try {
            if (!AbstractC22676k.m65745e(dVar.getValue(), "") && (value = dVar.getValue()) != null) {
                Integer.parseInt(value);
            }
            z4 = false;
        } catch (NumberFormatException unused) {
            z4 = true;
        }
        if (dVar.getInputConfig().getMin() == null || dVar.getInputConfig().getMax() == null) {
            z13 = false;
        } else {
            C18284j c18284j = new C18284j(dVar.getInputConfig().getMin().intValue(), dVar.getInputConfig().getMax().intValue(), 1);
            if (numM125932Q == null || !c18284j.m52655e(numM125932Q.intValue())) {
                z13 = false;
            } else {
                z13 = true;
            }
        }
        if (z4) {
            textResourceM21267a = AbstractC8693b.m21278l(dVar.getInputConfig().getMaxErrorText());
        } else if (dVar.getInputConfig().getMin() == null || numM125932Q == null || numM125932Q.intValue() >= dVar.getInputConfig().getMin().intValue()) {
            textResourceM21267a = (dVar.getInputConfig().getMax() == null || numM125932Q == null || numM125932Q.intValue() <= dVar.getInputConfig().getMax().intValue()) ? AbstractC8693b.m21267a() : AbstractC8693b.m21278l(dVar.getInputConfig().getMaxErrorText());
        } else {
            textResourceM21267a = AbstractC8693b.m21278l(dVar.getInputConfig().getMinErrorText());
        }
        TextResource textResource = textResourceM21267a;
        C34273f c34273fM94621C = m94621C(dVar.getToolbarState());
        C34270c c34270cM94647z = m94647z(dVar.getCancelStudyState());
        String content = dVar.getContent();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(dVar.getPrimaryButtonText());
        boolean z14 = !dVar.getIsRequired() || z13;
        String secondaryButtonText = dVar.getSecondaryButtonText();
        TextResource textResourceM21278l2 = secondaryButtonText != null ? AbstractC8693b.m21278l(secondaryButtonText) : null;
        boolean isAddNoteShowing = dVar.getIsAddNoteShowing();
        boolean isCancelStudyShowing = dVar.getIsCancelStudyShowing();
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(dVar.getInputConfig().getInputLabel());
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(dVar.getValue());
        String hint = dVar.getHint();
        return new AbstractC34268a.a.d(c34273fM94621C, c34270cM94647z, z14, content, textResourceM21278l, textResourceM21278l2, isAddNoteShowing, isCancelStudyShowing, textResourceM21278l3, textResource, textResourceM21278l4, hint == null ? "" : hint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final AbstractC34268a.a m94639r(InterfaceC28476b.e eVar) {
        C34273f c34273fM94621C = m94621C(eVar.getToolbarState());
        C34270c c34270cM94647z = m94647z(eVar.getCancelStudyState());
        String content = eVar.getContent();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(eVar.getPrimaryButtonText());
        boolean z4 = (eVar.getIsRequired() && eVar.getSelected() == null) ? false : true;
        String secondaryButtonText = eVar.getSecondaryButtonText();
        TextResource textResourceM21278l2 = secondaryButtonText != null ? AbstractC8693b.m21278l(secondaryButtonText) : null;
        boolean isAddNoteShowing = eVar.getIsAddNoteShowing();
        boolean isCancelStudyShowing = eVar.getIsCancelStudyShowing();
        List<OptionSelection> listM86502l = eVar.m86502l();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM86502l, 10));
        Iterator<T> it = listM86502l.iterator();
        while (it.hasNext()) {
            arrayList.add(m94619A((OptionSelection) it.next()));
        }
        return new AbstractC34268a.a.e(c34273fM94621C, c34270cM94647z, z4, content, textResourceM21278l, textResourceM21278l2, isAddNoteShowing, isCancelStudyShowing, arrayList, eVar.getSelected());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final AbstractC34268a.a m94640s(InterfaceC28476b.g gVar) {
        C34273f c34273fM94621C = m94621C(gVar.getToolbarState());
        C34270c c34270cM94647z = m94647z(gVar.getCancelStudyState());
        int stepId = gVar.getStepId();
        String content = gVar.getContent();
        String typeformUrl = gVar.getTypeformUrl();
        int retryAttempt = gVar.getRetryAttempt();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(gVar.getTypeformTitle());
        String imageUrl = gVar.getImageUrl();
        String imageAlt = gVar.getImageAlt();
        boolean typeformSubmitted = gVar.getTypeformSubmitted();
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(gVar.getPrimaryButtonText());
        String secondaryButtonText = gVar.getSecondaryButtonText();
        TextResource textResourceM21278l3 = secondaryButtonText != null ? AbstractC8693b.m21278l(secondaryButtonText) : null;
        boolean isAddNoteShowing = gVar.getIsAddNoteShowing();
        boolean isCancelStudyShowing = gVar.getIsCancelStudyShowing();
        boolean isErrorLoading = gVar.getIsErrorLoading();
        C34272e c34272eM94620B = m94620B(gVar.getRetryState());
        SurveyProvider surveyProvider = gVar.getSurveyProvider();
        if (surveyProvider == null) {
            surveyProvider = SurveyProvider.UNKNOWN;
        }
        return new AbstractC34268a.a.i(c34273fM94621C, c34270cM94647z, false, stepId, content, imageUrl, imageAlt, typeformUrl, retryAttempt, textResourceM21278l, Boolean.valueOf(typeformSubmitted), textResourceM21278l2, textResourceM21278l3, isAddNoteShowing, isCancelStudyShowing, isErrorLoading, c34272eM94620B, surveyProvider, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final AbstractC34268a.a m94641t(InterfaceC28476b.h hVar) {
        boolean zM65745e;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(AbstractC26034a.m77454c(hVar, hVar.getTextInput()));
        C34273f c34273fM94621C = m94621C(hVar.getToolbarState());
        C34270c c34270cM94647z = m94647z(hVar.getCancelStudyState());
        String content = hVar.getContent();
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(hVar.getPrimaryButtonText());
        if (hVar.getIsRequired()) {
            zM65745e = hVar.getTextInput().length() > 0 && AbstractC22676k.m65745e(textResourceM21278l, AbstractC8693b.m21267a());
        } else {
            zM65745e = AbstractC22676k.m65745e(textResourceM21278l, AbstractC8693b.m21267a());
        }
        boolean z4 = zM65745e;
        String secondaryButtonText = hVar.getSecondaryButtonText();
        TextResource textResourceM21278l3 = secondaryButtonText != null ? AbstractC8693b.m21278l(secondaryButtonText) : null;
        boolean isAddNoteShowing = hVar.getIsAddNoteShowing();
        boolean isCancelStudyShowing = hVar.getIsCancelStudyShowing();
        int stepId = hVar.getStepId();
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(hVar.getInputConfig().getInputLabel());
        TextResource textResourceM21278l5 = AbstractC8693b.m21278l(hVar.getInputConfig().getHint());
        int rowCount = hVar.getInputConfig().getRowCount();
        String textInput = hVar.getTextInput();
        Integer max = hVar.getInputConfig().getMax();
        return new AbstractC34268a.a.f(c34273fM94621C, c34270cM94647z, z4, content, textResourceM21278l2, textResourceM21278l3, isAddNoteShowing, isCancelStudyShowing, rowCount, textResourceM21278l4, textResourceM21278l5, textInput, textResourceM21278l, max != null ? max.intValue() : Integer.MAX_VALUE, stepId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final AbstractC34268a.a m94642u(InterfaceC28476b.i iVar) {
        C34273f c34273fM94621C = m94621C(iVar.getToolbarState());
        C34270c c34270cM94647z = m94647z(iVar.getCancelStudyState());
        String content = iVar.getContent();
        String imageUrl = iVar.getImageUrl();
        String imageAlt = iVar.getImageAlt();
        String typeformUrl = iVar.getTypeformUrl();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(iVar.getPrimaryButtonText());
        String secondaryButtonText = iVar.getSecondaryButtonText();
        return new AbstractC34268a.a.g(c34273fM94621C, c34270cM94647z, !iVar.getToolbarState().m86783f(), content, imageUrl, imageAlt, typeformUrl, textResourceM21278l, secondaryButtonText != null ? AbstractC8693b.m21278l(secondaryButtonText) : null, iVar.getIsAddNoteShowing(), iVar.getIsCancelStudyShowing());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final AbstractC34268a.a m94643v(InterfaceC28476b.j jVar) {
        C34273f c34273fM94621C = m94621C(jVar.getToolbarState());
        C34270c c34270cM94647z = m94647z(jVar.getCancelStudyState());
        String content = jVar.getContent();
        LocalTime localTimeWithSecondOfMinute = LocalTime.now().withMinuteOfHour(jVar.getHour()).withSecondOfMinute(jVar.getMinutes());
        AbstractC22676k.m65749i(localTimeWithSecondOfMinute, "withSecondOfMinute(...)");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(jVar.getPrimaryButtonText());
        String secondaryButtonText = jVar.getSecondaryButtonText();
        return new AbstractC34268a.a.h(c34273fM94621C, c34270cM94647z, true, content, localTimeWithSecondOfMinute, textResourceM21278l, secondaryButtonText != null ? AbstractC8693b.m21278l(secondaryButtonText) : null, jVar.getIsAddNoteShowing(), jVar.getIsCancelStudyShowing());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final AbstractC34268a.c m94644w(InterfaceC28476b.m mVar) {
        TextResource c8688b;
        TextResource c8688b2;
        TextResource c8688b3;
        TextResource c8688b4;
        int campaignId = mVar.getCampaignId();
        Integer sessionId = mVar.getSessionId();
        String title = mVar.getTitle();
        if (title == null || (c8688b = AbstractC8693b.m21278l(title)) == null) {
            c8688b = new TextResource.C8688b(AbstractC39833e.f171727l, null, 2, null);
        }
        String body = mVar.getBody();
        if (body == null || (c8688b2 = AbstractC8693b.m21278l(body)) == null) {
            c8688b2 = new TextResource.C8688b(AbstractC39833e.f171729n, null, 2, null);
        }
        String positiveCta = mVar.getPositiveCta();
        if (positiveCta == null || (c8688b3 = AbstractC8693b.m21278l(positiveCta)) == null) {
            c8688b3 = new TextResource.C8688b(AbstractC39833e.f171715B, null, 2, null);
        }
        String negativeCta = mVar.getNegativeCta();
        if (negativeCta == null || (c8688b4 = AbstractC8693b.m21278l(negativeCta)) == null) {
            c8688b4 = new TextResource.C8688b(AbstractC39833e.f171716a, null, 2, null);
        }
        return new AbstractC34268a.c(campaignId, sessionId, c8688b, c8688b2, c8688b3, c8688b4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final AbstractC34268a.d m94645x(InterfaceC28476b.n nVar) {
        TextResource c8688b;
        TextResource c8688b2;
        TextResource c8688b3;
        TextResource c8688b4;
        int campaignId = nVar.getCampaignId();
        String deviceAddress = nVar.getDeviceAddress();
        String title = nVar.getTitle();
        if (title == null || (c8688b = AbstractC8693b.m21278l(title)) == null) {
            c8688b = new TextResource.C8688b(AbstractC39833e.f171727l, null, 2, null);
        }
        String body = nVar.getBody();
        if (body == null || (c8688b2 = AbstractC8693b.m21278l(body)) == null) {
            c8688b2 = new TextResource.C8688b(AbstractC39833e.f171728m, null, 2, null);
        }
        String positiveCta = nVar.getPositiveCta();
        if (positiveCta == null || (c8688b3 = AbstractC8693b.m21278l(positiveCta)) == null) {
            c8688b3 = new TextResource.C8688b(AbstractC39833e.f171715B, null, 2, null);
        }
        String negativeCta = nVar.getNegativeCta();
        if (negativeCta == null || (c8688b4 = AbstractC8693b.m21278l(negativeCta)) == null) {
            c8688b4 = new TextResource.C8688b(AbstractC39833e.f171716a, null, 2, null);
        }
        return new AbstractC34268a.d(campaignId, deviceAddress, c8688b, c8688b2, c8688b3, c8688b4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final AbstractC34268a.i m94646y(InterfaceC28476b.s sVar) {
        EnumC16313m0 enumC16313m0;
        int campaignId = sVar.getCampaignId();
        String icon = sVar.getIcon();
        EnumC16313m0 enumC16313m1 = EnumC16313m0.CHECKMARK;
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
        int whoopIcon = enumC16313m1.toWhoopIcon();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(sVar.getText());
        AbstractC22403o abstractC22403oM64503l = AbstractC22404p.m64503l(sVar.getBackgroundUrl());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(sVar.getCta());
        C9598e navigationAction = sVar.getNavigationAction();
        return new AbstractC34268a.i(campaignId, whoopIcon, textResourceM21278l, textResourceM21278l2, abstractC22403oM64503l, navigationAction == null ? new C9598e(AppScreen.C9414s6.f27926w, new WhoopLabsScreenModel(Integer.valueOf(sVar.getCampaignId()), (Integer) null, (String) null, 6, (DefaultConstructorMarker) null), null, 4, null) : navigationAction);
    }

    /* JADX INFO: renamed from: z */
    private static final C34270c m94647z(C28481g c28481g) {
        return new C34270c(AbstractC8693b.m21278l(c28481g != null ? c28481g.getCta() : null), AbstractC8693b.m21278l(c28481g != null ? c28481g.getDialogTitle() : null), AbstractC8693b.m21278l(c28481g != null ? c28481g.getDialogBody() : null), AbstractC8693b.m21278l(c28481g != null ? c28481g.getDialogPositiveCta() : null), AbstractC8693b.m21278l(c28481g != null ? c28481g.getDialogNegativeCta() : null));
    }
}
