package mo0;

import c31.C3927k;
import com.whoop.clinicianintheloop.api.VideoSchedulePillModel;
import com.whoop.clinicianintheloop.api.VideoScheduleSection;
import com.whoop.clinicianintheloop.api.VideoSchedulingDatePicker;
import com.whoop.clinicianintheloop.api.VideoSchedulingFormContent;
import com.whoop.clinicianintheloop.api.VideoSchedulingFormResponse;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import h11.C16606a;
import h11.C16613h;
import h11.EnumC16612g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io0.C20722i;
import io0.C20723j;
import io0.C20724k;
import io0.C20726m;
import io0.InterfaceC20721h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import lo0.AbstractC24614y;
import lo0.C24601q0;
import lo0.C24603r0;
import lo0.C24605s0;
import lo0.C24607t0;
import lo0.C24612w;
import m83.AbstractC25267u;
import m83.C25271y;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.AbstractC23653j2;
import p716lb1.AbstractC23716t3;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: mo0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0012\u001a\u00020\u0011*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0016\u001a\u00020\u0015*\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001a\u001a\u00020\u0019*\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\"\u001a\u00020!*\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#J\u0013\u0010&\u001a\u00020%*\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b(\u0010\fR\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010*¨\u0006,"}, m65681d2 = {"Lmo0/d;", "", "<init>", "()V", "Lio0/m;", "domainState", "Lio0/h;", "modal", "Llo0/y;", "b", "(Lio0/m;Lio0/h;)Llo0/y;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lio0/m;)Llo0/y;", "Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;", "", "selectedDatePill", "selectedTimeSlot", "Llo0/w;", "c", "(Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;Ljava/lang/String;Ljava/lang/String;)Llo0/w;", "Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormContent;", "Llo0/t0;", "g", "(Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormContent;Ljava/lang/String;Ljava/lang/String;)Llo0/t0;", "Lcom/whoop/clinicianintheloop/api/VideoSchedulingDatePicker;", "Llo0/s0;", "f", "(Lcom/whoop/clinicianintheloop/api/VideoSchedulingDatePicker;Ljava/lang/String;Ljava/lang/String;)Llo0/s0;", "Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;", "", "isSelected", "", "pillIndex", "Llo0/q0;", "d", "(Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;ZI)Llo0/q0;", "Lcom/whoop/clinicianintheloop/api/VideoScheduleSection;", "Llo0/r0;", "e", "(Lcom/whoop/clinicianintheloop/api/VideoScheduleSection;)Llo0/r0;", "a", "Ljb1/a;", "Ljb1/a;", "designItemReducer", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25741d {

    /* JADX INFO: renamed from: b */
    public static final int f101446b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a designItemReducer = AbstractC21537c.m60555e(null, 1, null);

    /* JADX INFO: renamed from: mo0.d$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f101448w = new a();

        /* JADX INFO: renamed from: a */
        public final long m75933a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m75933a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: b */
    private final AbstractC24614y m75925b(C20726m domainState, InterfaceC20721h modal) {
        if (AbstractC22676k.m65745e(modal, C20722i.f77618a)) {
            return AbstractC24614y.b.f96213b;
        }
        if (AbstractC22676k.m65745e(modal, C20723j.f77619a)) {
            return AbstractC24614y.a.f96212b;
        }
        if (!AbstractC22676k.m65745e(modal, C20724k.f77620a)) {
            throw new NoWhenBranchMatchedException();
        }
        VideoSchedulingFormResponse response = domainState.getResponse();
        return response == null ? AbstractC24614y.b.f96213b : new AbstractC24614y.c(AbstractC8693b.m21278l(response.getSavingTitle()), AbstractC8693b.m21278l(response.getSavingSubtitle()), domainState.getSaveSuccessDestination());
    }

    /* JADX INFO: renamed from: c */
    private final C24612w m75926c(VideoSchedulingFormResponse videoSchedulingFormResponse, String str, String str2) {
        TextResource textResourceM21278l = AbstractC8693b.m21278l(videoSchedulingFormResponse.getNavigationTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(videoSchedulingFormResponse.getTitle());
        TextResource.C8691e c8691eM21279m = AbstractC8693b.m21279m(videoSchedulingFormResponse.getSubtitle());
        C24607t0 c24607t0M75930g = m75930g(videoSchedulingFormResponse.getFormContent(), str, str2);
        C3927k c3927kM11937b = C3927k.m11937b(AbstractC23716t3.m69429g(videoSchedulingFormResponse.getNextButton()), null, null, null, null, null, null, 0, 0, null, str2 != null, false, null, null, null, null, null, null, 130559, null);
        TextResource.C8691e c8691eM21279m2 = AbstractC8693b.m21279m(videoSchedulingFormResponse.getSavingTitle());
        TextResource.C8691e c8691eM21279m3 = AbstractC8693b.m21279m(videoSchedulingFormResponse.getSavingSubtitle());
        InfoCalloutTileModel callout = videoSchedulingFormResponse.getCallout();
        return new C24612w(textResourceM21278l, textResourceM21278l2, c8691eM21279m, c24607t0M75930g, c3927kM11937b, c8691eM21279m2, c8691eM21279m3, callout != null ? AbstractC23653j2.m68922b(callout) : null);
    }

    /* JADX INFO: renamed from: d */
    private final C24601q0 m75927d(VideoSchedulePillModel videoSchedulePillModel, boolean z4, int i13) {
        TextResource textResourceM21278l = AbstractC8693b.m21278l(videoSchedulePillModel.getSelectionDisplay());
        C16613h c16613h = new C16613h(new C16606a(videoSchedulePillModel.getDateDisplay().getDay(), String.valueOf(videoSchedulePillModel.getDateDisplay().getDate())), null, z4, videoSchedulePillModel.getStyle(), videoSchedulePillModel.getSelectionDisplay(), Long.valueOf(i13), null, true, false, videoSchedulePillModel.getStyle() == EnumC16612g.HAS_APPOINTMENT ? p745y81.Function1.m125323a(a.f101448w) : null, null, null, false, null, 15682, null);
        C21535a c21535a = this.designItemReducer;
        List<DesignSystemModel> topItems = videoSchedulePillModel.getTopItems();
        if (topItems == null) {
            topItems = C25271y.f99162w;
        }
        List<InterfaceC25312u> listM60545m = c21535a.m60545m(topItems);
        List<VideoScheduleSection> scheduleSections = videoSchedulePillModel.getScheduleSections();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(scheduleSections, 10));
        Iterator<T> it = scheduleSections.iterator();
        while (it.hasNext()) {
            arrayList.add(m75928e((VideoScheduleSection) it.next()));
        }
        return new C24601q0(textResourceM21278l, c16613h, listM60545m, arrayList);
    }

    /* JADX INFO: renamed from: e */
    private final C24603r0 m75928e(VideoScheduleSection videoScheduleSection) {
        return new C24603r0(videoScheduleSection.getId(), AbstractC8693b.m21278l(videoScheduleSection.getTitle()), videoScheduleSection.getAppointmentButtons());
    }

    /* JADX INFO: renamed from: f */
    private final C24605s0 m75929f(VideoSchedulingDatePicker videoSchedulingDatePicker, String str, String str2) {
        TextResource textResourceM21278l = AbstractC8693b.m21278l(str);
        List<VideoSchedulePillModel> schedulingDatePickerItems = videoSchedulingDatePicker.getSchedulingDatePickerItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(schedulingDatePickerItems, 10));
        int i13 = 0;
        for (Object obj : schedulingDatePickerItems) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            VideoSchedulePillModel videoSchedulePillModel = (VideoSchedulePillModel) obj;
            arrayList.add(m75927d(videoSchedulePillModel, AbstractC22676k.m65745e(videoSchedulePillModel.getSelectionDisplay(), str), i13));
            i13 = i14;
        }
        return new C24605s0(textResourceM21278l, arrayList, str2);
    }

    /* JADX INFO: renamed from: g */
    private final C24607t0 m75930g(VideoSchedulingFormContent videoSchedulingFormContent, String str, String str2) {
        return new C24607t0(m75929f(videoSchedulingFormContent.getSchedulingDatePicker(), str, str2));
    }

    /* JADX INFO: renamed from: h */
    private final AbstractC24614y m75931h(C20726m domainState) {
        VideoSchedulingFormResponse response = domainState.getResponse();
        if (response == null) {
            return AbstractC24614y.b.f96213b;
        }
        String selectedDatePill = domainState.getSelectedDatePill();
        if (selectedDatePill == null) {
            selectedDatePill = response.getFormContent().getSchedulingDatePicker().getDateDisplay();
        }
        return new AbstractC24614y.d(m75926c(response, selectedDatePill, domainState.getSelectedTimeSlot()), response.getAnalyticEvent());
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC24614y m75932a(C20726m domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        InterfaceC20721h fullScreenModal = domainState.getFullScreenModal();
        return fullScreenModal == null ? m75931h(domainState) : m75925b(domainState, fullScreenModal);
    }
}
