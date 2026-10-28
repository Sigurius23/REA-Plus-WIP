package mo0;

import c31.C3927k;
import c41.C4092p2;
import com.whoop.clinicianintheloop.api.HeightWeightScreen;
import com.whoop.clinicianintheloop.api.InformationScreen;
import com.whoop.clinicianintheloop.api.IntakeCheckbox;
import com.whoop.clinicianintheloop.api.MultiSelectScreen;
import com.whoop.clinicianintheloop.api.PersonalIntakeForm;
import com.whoop.clinicianintheloop.api.PersonalIntakeScreen;
import com.whoop.clinicianintheloop.api.StateSelectScreen;
import com.whoop.clinicianintheloop.api.TextEntryScreen;
import com.whoop.clinicianintheloop.api.VideoSchedulingIntakeMultiSelectResponseBody;
import com.whoop.clinicianintheloop.api.VideoSchedulingIntakeResponse;
import com.whoop.clinicianintheloop.api.VideoSchedulingIntakeScreen;
import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.items.ImageUrlModel;
import com.whoop.design.models.items.SelectableCellModel;
import com.whoop.design.models.items.TextAreaModel;
import com.whoop.design.models.items.form.FormTextFieldModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import go0.C16012b;
import go0.EnumC16011a;
import go0.InterfaceC16013c;
import hy0.C17749h0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io0.AbstractC20730q;
import io0.C20731r;
import io0.C20732s;
import io0.C20734u;
import io0.C20736w;
import io0.C20738y;
import io0.EnumC20735v;
import io0.InterfaceC20737x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jb1.C21535a;
import live.hms.video.media.tracks.HMSTrackSource;
import lo0.C24571b0;
import lo0.C24587j0;
import lo0.C24589k0;
import lo0.C24593m0;
import lo0.C24609u0;
import lo0.EnumC24591l0;
import lo0.InterfaceC24615z;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25235a0;
import n01.C26088e;
import no.nordicsemi.android.dfu.DfuBaseService;
import o71.C27638h;
import p291l0.AbstractC22977m;
import p291l0.C22957g;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.AbstractC23618e2;
import p716lb1.AbstractC23653j2;
import p716lb1.AbstractC23711s4;
import p716lb1.AbstractC23716t3;
import p720m91.InterfaceC25312u;
import p736sz0.C33205o0;
import ry0.C31909d;
import t11.C33308h;
import t83.InterfaceC33616a;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: mo0.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u000f*\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u001a\u001a\u00020\u000f*\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001d\u001a\u00020\u000f*\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010 \u001a\u00020\u000f*\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J#\u0010'\u001a\u00020&*\u00020\"2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0004H\u0002¢\u0006\u0004\b'\u0010(J+\u0010*\u001a\u00020\u000f*\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020)H\u0002¢\u0006\u0004\b*\u0010+J+\u0010-\u001a\u00020\u000f*\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.J+\u00100\u001a\u00020\u000f*\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020/H\u0002¢\u0006\u0004\b0\u00101J%\u00106\u001a\u000205*\u0002022\u0006\u0010\u0003\u001a\u00020\u00022\b\u00104\u001a\u0004\u0018\u000103H\u0002¢\u0006\u0004\b6\u00107J\u0015\u00109\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\b¢\u0006\u0004\b9\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010;¨\u0006<"}, m65681d2 = {"Lmo0/e;", "", "Ljb1/a;", "designItemReducer", "Lio0/s;", "fieldValidator", "<init>", "(Ljb1/a;Lio0/s;)V", "Lio0/y;", "Llo0/l0;", "a", "(Lio0/y;)Llo0/l0;", "Lio0/x$a;", "", "appointmentType", "Llo0/b0;", "k", "(Lio0/x$a;Ljava/lang/String;)Llo0/b0;", "j", "(Lio0/y;)Llo0/b0;", "Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;", HMSTrackSource.SCREEN, "Lcom/whoop/design/util/TextResource;", "toolbarTitle", "Lcom/whoop/clinicianintheloop/api/InformationScreen;", "content", "e", "(Lio0/y;Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;Lcom/whoop/design/util/TextResource;Lcom/whoop/clinicianintheloop/api/InformationScreen;)Llo0/b0;", "Lcom/whoop/clinicianintheloop/api/StateSelectScreen;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lio0/y;Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;Lcom/whoop/design/util/TextResource;Lcom/whoop/clinicianintheloop/api/StateSelectScreen;)Llo0/b0;", "Lcom/whoop/clinicianintheloop/api/PersonalIntakeScreen;", "g", "(Lio0/y;Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;Lcom/whoop/design/util/TextResource;Lcom/whoop/clinicianintheloop/api/PersonalIntakeScreen;)Llo0/b0;", "Lio0/u;", "Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;", "form", "validator", "", "b", "(Lio0/u;Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;Lio0/s;)Z", "Lcom/whoop/clinicianintheloop/api/MultiSelectScreen;", "f", "(Lio0/y;Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;Lcom/whoop/design/util/TextResource;Lcom/whoop/clinicianintheloop/api/MultiSelectScreen;)Llo0/b0;", "Lcom/whoop/clinicianintheloop/api/TextEntryScreen;", "i", "(Lio0/y;Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;Lcom/whoop/design/util/TextResource;Lcom/whoop/clinicianintheloop/api/TextEntryScreen;)Llo0/b0;", "Lcom/whoop/clinicianintheloop/api/HeightWeightScreen;", "d", "(Lio0/y;Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;Lcom/whoop/design/util/TextResource;Lcom/whoop/clinicianintheloop/api/HeightWeightScreen;)Llo0/b0;", "Lcom/whoop/design/models/items/form/FormTextFieldModel;", "Lio0/r;", "fieldValue", "Llo0/j0;", "l", "(Lcom/whoop/design/models/items/form/FormTextFieldModel;Ljb1/a;Lio0/r;)Llo0/j0;", "domainResult", "c", "Ljb1/a;", "Lio0/s;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25742e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a designItemReducer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C20732s fieldValidator;

    /* JADX INFO: renamed from: mo0.e$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f101451a;

        static {
            int[] iArr = new int[EnumC16011a.values().length];
            try {
                iArr[EnumC16011a.BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC16011a.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f101451a = iArr;
        }
    }

    public C25742e(C21535a designItemReducer, C20732s fieldValidator) {
        AbstractC22676k.m65750j(designItemReducer, "designItemReducer");
        AbstractC22676k.m65750j(fieldValidator, "fieldValidator");
        this.designItemReducer = designItemReducer;
        this.fieldValidator = fieldValidator;
    }

    /* JADX INFO: renamed from: a */
    private final EnumC24591l0 m75934a(C20738y c20738y) {
        if (c20738y.getCurrentScreenIndex() < 0 || c20738y.getLastScreenIndex() < 0) {
            return EnumC24591l0.None;
        }
        if (c20738y.getCurrentScreenIndex() > c20738y.getLastScreenIndex()) {
            return EnumC24591l0.Forward;
        }
        return c20738y.getCurrentScreenIndex() < c20738y.getLastScreenIndex() ? EnumC24591l0.Back : EnumC24591l0.None;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX INFO: renamed from: b */
    private final boolean m75935b(C20734u c20734u, PersonalIntakeForm personalIntakeForm, C20732s c20732s) {
        String text;
        boolean zM57014a;
        InterfaceC33616a<EnumC20735v> entries = EnumC20735v.getEntries();
        if (entries != null && entries.isEmpty()) {
            return true;
        }
        for (EnumC20735v enumC20735v : entries) {
            FormTextFieldModel formTextFieldModelM57008a = AbstractC20730q.m57008a(personalIntakeForm, enumC20735v);
            C20731r c20731rM57022c = c20734u.m57022c(enumC20735v);
            if ((c20731rM57022c == null || (text = c20731rM57022c.getText()) == null) && (text = formTextFieldModelM57008a.getText()) == null) {
                text = "";
            }
            if (c20731rM57022c != null && !c20731rM57022c.getIsValid()) {
                zM57014a = false;
            } else if (!AbstractC39414r.m125890i0(text)) {
                zM57014a = c20732s.m57014a(text, formTextFieldModelM57008a.getValidRegex());
            } else if (formTextFieldModelM57008a.isRequired()) {
                zM57014a = false;
            } else {
                zM57014a = true;
            }
            if (!zM57014a) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    private final C24571b0 m75936d(C20738y c20738y, VideoSchedulingIntakeScreen videoSchedulingIntakeScreen, TextResource textResource, HeightWeightScreen heightWeightScreen) {
        String id4 = videoSchedulingIntakeScreen.getId();
        String title = heightWeightScreen.getTitle();
        String subtitle = heightWeightScreen.getSubtitle();
        ImageUrlModel image = heightWeightScreen.getImage();
        C17749h0 c17749h0M68697h = image != null ? AbstractC23618e2.m68697h(image) : null;
        InterfaceC25312u interfaceC25312uM60544l = this.designItemReducer.m60544l(heightWeightScreen.getHeightWeightPicker());
        return new C24571b0(null, new C24571b0.b.a(id4, textResource, title, subtitle, c17749h0M68697h, interfaceC25312uM60544l instanceof C27638h ? (C27638h) interfaceC25312uM60544l : null, C3927k.m11937b(AbstractC23716t3.m69429g(videoSchedulingIntakeScreen.getProgressButton()), null, null, null, null, null, null, 0, 0, null, true, false, null, null, null, null, null, null, 130559, null)), null, null, 13, null);
    }

    /* JADX INFO: renamed from: e */
    private final C24571b0 m75937e(C20738y c20738y, VideoSchedulingIntakeScreen videoSchedulingIntakeScreen, TextResource textResource, InformationScreen informationScreen) {
        C22957g c22957g;
        String id4 = videoSchedulingIntakeScreen.getId();
        String navigationSkipTitle = videoSchedulingIntakeScreen.getNavigationSkipTitle();
        TextResource textResourceM21278l = navigationSkipTitle != null ? AbstractC8693b.m21278l(navigationSkipTitle) : null;
        int i13 = a.f101451a[videoSchedulingIntakeScreen.getContentAlignment().ordinal()];
        if (i13 == 1) {
            c22957g = AbstractC22977m.f90653d;
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            c22957g = AbstractC22977m.f90652c;
        }
        C22957g c22957g2 = c22957g;
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(informationScreen.getTitle());
        String subtitle = informationScreen.getSubtitle();
        return new C24571b0(null, new C24571b0.b.C41960b(id4, textResource, textResourceM21278l, c22957g2, textResourceM21278l2, subtitle != null ? AbstractC8693b.m21278l(subtitle) : null, this.designItemReducer.m60545m(informationScreen.getItems()), AbstractC23716t3.m69429g(videoSchedulingIntakeScreen.getProgressButton())), null, null, 13, null);
    }

    /* JADX INFO: renamed from: f */
    private final C24571b0 m75938f(C20738y c20738y, VideoSchedulingIntakeScreen videoSchedulingIntakeScreen, TextResource textResource, MultiSelectScreen multiSelectScreen) {
        Object next;
        C22957g c22957g;
        C33308h c33308hM69413f;
        List<String> selectedOptionIds;
        InterfaceC25312u interfaceC25312uM60544l = this.designItemReducer.m60544l(multiSelectScreen.getSelectableCellList());
        C33308h c33308hM105666a = null;
        C26088e c26088e = interfaceC25312uM60544l instanceof C26088e ? (C26088e) interfaceC25312uM60544l : null;
        if (c26088e == null) {
            return new C24571b0(new C24571b0.a(C33205o0.f138451a.m105290d(), null, null, null, 14, null), null, null, null, 14, null);
        }
        Iterator<T> it = multiSelectScreen.getSelectableCellList().getCells().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC39421y.m125921F(((SelectableCellModel) next).getId(), "OTHER", true));
        SelectableCellModel selectableCellModel = (SelectableCellModel) next;
        String id4 = selectableCellModel != null ? selectableCellModel.getId() : null;
        VideoSchedulingIntakeMultiSelectResponseBody videoSchedulingIntakeMultiSelectResponseBody = c20738y.m57049i().get(videoSchedulingIntakeScreen.getId());
        Set setM74103I1 = (videoSchedulingIntakeMultiSelectResponseBody == null || (selectedOptionIds = videoSchedulingIntakeMultiSelectResponseBody.getSelectedOptionIds()) == null) ? null : AbstractC25265s.m74103I1(selectedOptionIds);
        if (setM74103I1 == null) {
            setM74103I1 = C25235a0.f99113w;
        }
        VideoSchedulingIntakeMultiSelectResponseBody videoSchedulingIntakeMultiSelectResponseBody2 = c20738y.m57049i().get(videoSchedulingIntakeScreen.getId());
        String text = videoSchedulingIntakeMultiSelectResponseBody2 != null ? videoSchedulingIntakeMultiSelectResponseBody2.getText() : null;
        if (text == null) {
            text = "";
        }
        String str = text;
        String id5 = videoSchedulingIntakeScreen.getId();
        String navigationSkipTitle = videoSchedulingIntakeScreen.getNavigationSkipTitle();
        TextResource textResourceM21278l = navigationSkipTitle != null ? AbstractC8693b.m21278l(navigationSkipTitle) : null;
        int i13 = a.f101451a[videoSchedulingIntakeScreen.getContentAlignment().ordinal()];
        if (i13 == 1) {
            c22957g = AbstractC22977m.f90653d;
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            c22957g = AbstractC22977m.f90652c;
        }
        C22957g c22957g2 = c22957g;
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(multiSelectScreen.getTitle());
        String subtitle = multiSelectScreen.getSubtitle();
        TextResource textResourceM21278l3 = subtitle != null ? AbstractC8693b.m21278l(subtitle) : null;
        List<C31909d> listM77603c = c26088e.m77603c();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM77603c, 10));
        for (C31909d c31909d : listM77603c) {
            arrayList.add(c31909d.m99205a((32639 & 1) != 0 ? c31909d.id : null, (32639 & 2) != 0 ? c31909d.title : null, (32639 & 4) != 0 ? c31909d.subtitle : null, (32639 & 8) != 0 ? c31909d.leftIcon : null, (32639 & 16) != 0 ? c31909d.leftImage : null, (32639 & 32) != 0 ? c31909d.shouldTintLeftImage : false, (32639 & 64) != 0 ? c31909d.selectionStyle : null, (32639 & 128) != 0 ? c31909d.selected : setM74103I1.contains(c31909d.getId()), (32639 & 256) != 0 ? c31909d.showCheckbox : false, (32639 & 512) != 0 ? c31909d.actionArgument : null, (32639 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c31909d.deselectArgument : null, (32639 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c31909d.selectionDisabled : false, (32639 & 4096) != 0 ? c31909d.isDisabled : false, (32639 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c31909d.fixedHeightInSizeDp : null, (32639 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c31909d.sectionTitle : null));
        }
        C26088e c26088eM77601b = C26088e.m77601b(c26088e, null, 0, 0, arrayList, null, null, false, 119, null);
        TextAreaModel textInput = multiSelectScreen.getTextInput();
        if (textInput != null) {
            if (id4 == null) {
                textInput = null;
            }
            if (textInput != null && (c33308hM69413f = AbstractC23711s4.m69413f(textInput)) != null) {
                c33308hM105666a = c33308hM69413f.m105666a((16379 & 1) != 0 ? c33308hM69413f.id : null, (16379 & 2) != 0 ? c33308hM69413f.label : null, (16379 & 4) != 0 ? c33308hM69413f.text : AbstractC8693b.m21278l(str), (16379 & 8) != 0 ? c33308hM69413f.hintText : null, (16379 & 16) != 0 ? c33308hM69413f.errorMessage : null, (16379 & 32) != 0 ? c33308hM69413f.maxCharacterCount : 0, (16379 & 64) != 0 ? c33308hM69413f.maxLines : 0, (16379 & 128) != 0 ? c33308hM69413f.height : 0.0f, (16379 & 256) != 0 ? c33308hM69413f.isError : false, (16379 & 512) != 0 ? c33308hM69413f.isEnabled : false, (16379 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33308hM69413f.readOnly : false, (16379 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33308hM69413f.errorTextStyle : null, (16379 & 4096) != 0 ? c33308hM69413f.refreshText : false, (16379 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33308hM69413f.cornerRadius : 0.0f);
            }
        }
        return new C24571b0(null, new C24571b0.b.c(id5, textResource, textResourceM21278l, c22957g2, textResourceM21278l2, textResourceM21278l3, c26088eM77601b, c33308hM105666a, id4 != null && setM74103I1.contains(id4), C3927k.m11937b(AbstractC23716t3.m69429g(videoSchedulingIntakeScreen.getProgressButton()), null, null, null, null, null, null, 0, 0, null, !setM74103I1.isEmpty() && (id4 == null || !setM74103I1.contains(id4) || multiSelectScreen.getTextInput() == null || !AbstractC39414r.m125890i0(str)), false, null, null, null, null, null, null, 130559, null)), null, null, 13, null);
    }

    /* JADX INFO: renamed from: g */
    private final C24571b0 m75939g(C20738y c20738y, VideoSchedulingIntakeScreen videoSchedulingIntakeScreen, TextResource textResource, PersonalIntakeScreen personalIntakeScreen) {
        PersonalIntakeForm personalIntakeForm = personalIntakeScreen.getPersonalIntakeForm();
        C20734u personalIntakeResponses = c20738y.getPersonalIntakeResponses();
        C20734u c20734uM57023d = personalIntakeResponses.m57023d(personalIntakeForm);
        String id4 = videoSchedulingIntakeScreen.getId();
        String navigationSkipTitle = videoSchedulingIntakeScreen.getNavigationSkipTitle();
        TextResource textResourceM21278l = navigationSkipTitle != null ? AbstractC8693b.m21278l(navigationSkipTitle) : null;
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(personalIntakeScreen.getTitle());
        String subtitle = personalIntakeScreen.getSubtitle();
        return new C24571b0(null, new C24571b0.b.d(id4, textResource, textResourceM21278l, textResourceM21278l2, subtitle != null ? AbstractC8693b.m21278l(subtitle) : null, new C24593m0(m75944l(personalIntakeForm.getFirstName(), this.designItemReducer, personalIntakeResponses.getFirstName()), m75944l(personalIntakeForm.getLastName(), this.designItemReducer, personalIntakeResponses.getLastName()), AbstractC25743f.m75947b(personalIntakeForm.getDateOfBirth(), personalIntakeResponses.getDateOfBirth()), m75944l(personalIntakeForm.getAddressLine1(), this.designItemReducer, personalIntakeResponses.getAddressLine1()), m75944l(personalIntakeForm.getAddressLine2(), this.designItemReducer, personalIntakeResponses.getAddressLine2()), m75944l(personalIntakeForm.getCity(), this.designItemReducer, personalIntakeResponses.getCity()), m75944l(personalIntakeForm.getState(), this.designItemReducer, personalIntakeResponses.getState()), m75944l(personalIntakeForm.getZipCode(), this.designItemReducer, personalIntakeResponses.getZipCode()), m75944l(personalIntakeForm.getCountry(), this.designItemReducer, personalIntakeResponses.getCountry()), m75944l(personalIntakeForm.getPhoneNumber(), this.designItemReducer, personalIntakeResponses.getPhoneNumber())), C3927k.m11937b(AbstractC23716t3.m69429g(videoSchedulingIntakeScreen.getProgressButton()), null, null, null, null, null, null, 0, 0, null, m75935b(personalIntakeResponses, personalIntakeForm, this.fieldValidator), false, null, null, null, null, null, null, 130559, null), c20738y.getAppointmentType(), c20734uM57023d), null, null, 13, null);
    }

    /* JADX INFO: renamed from: h */
    private final C24571b0 m75940h(C20738y c20738y, VideoSchedulingIntakeScreen videoSchedulingIntakeScreen, TextResource textResource, StateSelectScreen stateSelectScreen) {
        C22957g c22957g;
        InterfaceC25312u interfaceC25312uM60544l = this.designItemReducer.m60544l(stateSelectScreen.getStateSelector().getStates());
        C26088e c26088e = interfaceC25312uM60544l instanceof C26088e ? (C26088e) interfaceC25312uM60544l : null;
        if (c26088e == null) {
            return new C24571b0(new C24571b0.a(C33205o0.f138451a.m105290d(), null, null, null, 14, null), null, null, null, 14, null);
        }
        String id4 = videoSchedulingIntakeScreen.getId();
        String navigationSkipTitle = videoSchedulingIntakeScreen.getNavigationSkipTitle();
        TextResource textResourceM21278l = navigationSkipTitle != null ? AbstractC8693b.m21278l(navigationSkipTitle) : null;
        int i13 = a.f101451a[videoSchedulingIntakeScreen.getContentAlignment().ordinal()];
        if (i13 == 1) {
            c22957g = AbstractC22977m.f90653d;
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            c22957g = AbstractC22977m.f90652c;
        }
        C22957g c22957g2 = c22957g;
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(stateSelectScreen.getTitle());
        String subtitle = stateSelectScreen.getSubtitle();
        TextResource textResourceM21278l3 = subtitle != null ? AbstractC8693b.m21278l(subtitle) : null;
        ImageUrlModel image = stateSelectScreen.getImage();
        C17749h0 c17749h0M68697h = image != null ? AbstractC23618e2.m68697h(image) : null;
        InfoCalloutTileModel disclaimer = stateSelectScreen.getDisclaimer();
        C4092p2 c4092p2M68922b = disclaimer != null ? AbstractC23653j2.m68922b(disclaimer) : null;
        C24609u0 c24609u0 = new C24609u0(stateSelectScreen.getStateSelector().getSearchField().getText(), stateSelectScreen.getStateSelector().getSearchField().getPlaceholder());
        String stateSelectSelectedId = c20738y.getStateSelectSelectedId();
        if (stateSelectSelectedId != null) {
            List<C31909d> listM77603c = c26088e.m77603c();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM77603c, 10));
            for (C31909d c31909d : listM77603c) {
                arrayList.add(c31909d.m99205a((32639 & 1) != 0 ? c31909d.id : null, (32639 & 2) != 0 ? c31909d.title : null, (32639 & 4) != 0 ? c31909d.subtitle : null, (32639 & 8) != 0 ? c31909d.leftIcon : null, (32639 & 16) != 0 ? c31909d.leftImage : null, (32639 & 32) != 0 ? c31909d.shouldTintLeftImage : false, (32639 & 64) != 0 ? c31909d.selectionStyle : null, (32639 & 128) != 0 ? c31909d.selected : AbstractC22676k.m65745e(c31909d.getId(), stateSelectSelectedId), (32639 & 256) != 0 ? c31909d.showCheckbox : false, (32639 & 512) != 0 ? c31909d.actionArgument : null, (32639 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c31909d.deselectArgument : null, (32639 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c31909d.selectionDisabled : false, (32639 & 4096) != 0 ? c31909d.isDisabled : false, (32639 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c31909d.fixedHeightInSizeDp : null, (32639 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c31909d.sectionTitle : null));
            }
            C26088e c26088eM77601b = C26088e.m77601b(c26088e, null, 0, 0, arrayList, null, null, false, 119, null);
            if (c26088eM77601b != null) {
                c26088e = c26088eM77601b;
            }
        }
        return new C24571b0(null, new C24571b0.b.e(id4, textResource, textResourceM21278l, c22957g2, textResourceM21278l2, textResourceM21278l3, c17749h0M68697h, c4092p2M68922b, c24609u0, c26088e, C3927k.m11937b(AbstractC23716t3.m69429g(videoSchedulingIntakeScreen.getProgressButton()), null, null, null, null, null, null, 0, 0, null, c20738y.getStateSelectSelectedId() != null, false, null, null, null, null, null, null, 130559, null)), null, null, 13, null);
    }

    /* JADX INFO: renamed from: i */
    private final C24571b0 m75941i(C20738y c20738y, VideoSchedulingIntakeScreen videoSchedulingIntakeScreen, TextResource textResource, TextEntryScreen textEntryScreen) {
        boolean z4;
        Map<String, String> mapM57040d;
        Boolean checkboxSelected;
        C20736w c20736w = c20738y.m57057q().get(videoSchedulingIntakeScreen.getId());
        IntakeCheckbox checkbox = textEntryScreen.getCheckbox();
        C24589k0 c24589k0 = checkbox != null ? new C24589k0(checkbox.getLabel(), (c20736w == null || (checkboxSelected = c20736w.getCheckboxSelected()) == null) ? checkbox.isSelected() : checkboxSelected.booleanValue()) : null;
        boolean z13 = c24589k0 != null && c24589k0.getIsSelected();
        Map<String, String> mapM57040d2 = c20736w != null ? c20736w.m57040d() : null;
        if (textEntryScreen.getTextAreas().isEmpty()) {
            z4 = false;
        } else {
            List<TextAreaModel> textAreas = textEntryScreen.getTextAreas();
            if (!(textAreas instanceof Collection) || !textAreas.isEmpty()) {
                Iterator<T> it = textAreas.iterator();
                while (true) {
                    if (it.hasNext()) {
                        TextAreaModel textAreaModel = (TextAreaModel) it.next();
                        String id4 = textAreaModel.getId();
                        if (id4 != null) {
                            if (mapM57040d2 == null || !mapM57040d2.containsKey(id4)) {
                                String text = textAreaModel.getText();
                                if (text == null || !(!AbstractC39414r.m125890i0(text))) {
                                }
                            } else if (!AbstractC39414r.m125890i0((CharSequence) AbstractC25247g0.m73986U(id4, mapM57040d2))) {
                            }
                        }
                        z4 = false;
                    }
                }
            }
            z4 = true;
        }
        String id5 = videoSchedulingIntakeScreen.getId();
        String navigationSkipTitle = videoSchedulingIntakeScreen.getNavigationSkipTitle();
        C17749h0 c17749h0M68697h = AbstractC23618e2.m68697h(textEntryScreen.getImage());
        String title = textEntryScreen.getTitle();
        String subtitle = textEntryScreen.getSubtitle();
        List<TextAreaModel> textAreas2 = textEntryScreen.getTextAreas();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(textAreas2, 10));
        for (TextAreaModel textAreaModel2 : textAreas2) {
            C33308h c33308hM69413f = AbstractC23711s4.m69413f(textAreaModel2);
            String id6 = textAreaModel2.getId();
            String str = (id6 == null || c20736w == null || (mapM57040d = c20736w.m57040d()) == null) ? null : mapM57040d.get(id6);
            if (str != null) {
                c33308hM69413f = c33308hM69413f.m105666a((16379 & 1) != 0 ? c33308hM69413f.id : null, (16379 & 2) != 0 ? c33308hM69413f.label : null, (16379 & 4) != 0 ? c33308hM69413f.text : AbstractC8693b.m21278l(str), (16379 & 8) != 0 ? c33308hM69413f.hintText : null, (16379 & 16) != 0 ? c33308hM69413f.errorMessage : null, (16379 & 32) != 0 ? c33308hM69413f.maxCharacterCount : 0, (16379 & 64) != 0 ? c33308hM69413f.maxLines : 0, (16379 & 128) != 0 ? c33308hM69413f.height : 0.0f, (16379 & 256) != 0 ? c33308hM69413f.isError : false, (16379 & 512) != 0 ? c33308hM69413f.isEnabled : false, (16379 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33308hM69413f.readOnly : false, (16379 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33308hM69413f.errorTextStyle : null, (16379 & 4096) != 0 ? c33308hM69413f.refreshText : false, (16379 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33308hM69413f.cornerRadius : 0.0f);
            }
            C33308h c33308hM105666a = c33308hM69413f;
            if (z13) {
                c33308hM105666a = c33308hM105666a.m105666a((16379 & 1) != 0 ? c33308hM105666a.id : null, (16379 & 2) != 0 ? c33308hM105666a.label : null, (16379 & 4) != 0 ? c33308hM105666a.text : null, (16379 & 8) != 0 ? c33308hM105666a.hintText : null, (16379 & 16) != 0 ? c33308hM105666a.errorMessage : null, (16379 & 32) != 0 ? c33308hM105666a.maxCharacterCount : 0, (16379 & 64) != 0 ? c33308hM105666a.maxLines : 0, (16379 & 128) != 0 ? c33308hM105666a.height : 0.0f, (16379 & 256) != 0 ? c33308hM105666a.isError : false, (16379 & 512) != 0 ? c33308hM105666a.isEnabled : false, (16379 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33308hM105666a.readOnly : false, (16379 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33308hM105666a.errorTextStyle : null, (16379 & 4096) != 0 ? c33308hM105666a.refreshText : false, (16379 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33308hM105666a.cornerRadius : 0.0f);
            }
            arrayList.add(c33308hM105666a);
        }
        return new C24571b0(null, new C24571b0.b.f(id5, textResource, navigationSkipTitle, c17749h0M68697h, title, subtitle, arrayList, c24589k0, C3927k.m11937b(AbstractC23716t3.m69429g(videoSchedulingIntakeScreen.getProgressButton()), null, null, null, null, null, null, 0, 0, null, z13 || z4, false, null, null, null, null, null, null, 130559, null)), null, null, 13, null);
    }

    /* JADX INFO: renamed from: j */
    private final C24571b0 m75942j(C20738y c20738y) {
        Object next;
        VideoSchedulingIntakeResponse response = c20738y.getResponse();
        if (response == null) {
            return new C24571b0(new C24571b0.a(C33205o0.f138451a.m105290d(), null, null, null, 14, null), null, null, null, 14, null);
        }
        Iterator<T> it = response.getIntakeScreens().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((VideoSchedulingIntakeScreen) next).getId(), c20738y.getCurrentScreenId()));
        VideoSchedulingIntakeScreen videoSchedulingIntakeScreen = (VideoSchedulingIntakeScreen) next;
        if (videoSchedulingIntakeScreen == null && (videoSchedulingIntakeScreen = (VideoSchedulingIntakeScreen) AbstractC25265s.m74100H0(response.getIntakeScreens())) == null) {
            return new C24571b0(new C24571b0.a(C33205o0.f138451a.m105290d(), null, null, null, 14, null), null, null, null, 14, null);
        }
        TextResource textResourceM21278l = AbstractC8693b.m21278l(videoSchedulingIntakeScreen.getNavigationTitle());
        InterfaceC16013c content = videoSchedulingIntakeScreen.getContent();
        if (content instanceof InformationScreen) {
            return m75937e(c20738y, videoSchedulingIntakeScreen, textResourceM21278l, (InformationScreen) content);
        }
        if (content instanceof StateSelectScreen) {
            return m75940h(c20738y, videoSchedulingIntakeScreen, textResourceM21278l, (StateSelectScreen) content);
        }
        if (content instanceof MultiSelectScreen) {
            return m75938f(c20738y, videoSchedulingIntakeScreen, textResourceM21278l, (MultiSelectScreen) content);
        }
        if (content instanceof PersonalIntakeScreen) {
            return m75939g(c20738y, videoSchedulingIntakeScreen, textResourceM21278l, (PersonalIntakeScreen) content);
        }
        if (content instanceof TextEntryScreen) {
            return m75941i(c20738y, videoSchedulingIntakeScreen, textResourceM21278l, (TextEntryScreen) content);
        }
        if (content instanceof HeightWeightScreen) {
            return m75936d(c20738y, videoSchedulingIntakeScreen, textResourceM21278l, (HeightWeightScreen) content);
        }
        if (AbstractC22676k.m65745e(content, C16012b.f60608a)) {
            return new C24571b0(new C24571b0.a(C33205o0.f138451a.m105290d(), null, null, null, 14, null), null, null, null, 14, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: k */
    private final C24571b0 m75943k(InterfaceC20737x.a aVar, String str) {
        if (AbstractC22676k.m65745e(aVar, InterfaceC20737x.b.f77813a) || AbstractC22676k.m65745e(aVar, InterfaceC20737x.f.f77817a)) {
            return new C24571b0(new C24571b0.a(C33205o0.f138451a.m105288b(), null, null, null, 14, null), null, null, null, 14, null);
        }
        if (AbstractC22676k.m65745e(aVar, InterfaceC20737x.c.f77814a)) {
            return new C24571b0(new C24571b0.a(C33205o0.f138451a.m105289c(), new InterfaceC24615z.d(str, null, null, 6, null), null, InterfaceC24615z.b.f96222a, 4, null), null, null, null, 14, null);
        }
        if (AbstractC22676k.m65745e(aVar, InterfaceC20737x.e.f77816a)) {
            return new C24571b0(new C24571b0.a(C33205o0.f138451a.m105289c(), InterfaceC24615z.o.f96242a, null, InterfaceC24615z.b.f96222a, 4, null), null, null, null, 14, null);
        }
        if (AbstractC22676k.m65745e(aVar, InterfaceC20737x.d.f77815a)) {
            return new C24571b0(new C24571b0.a(C33205o0.f138451a.m105291e(), new InterfaceC24615z.d(str, null, null, 6, null), null, InterfaceC24615z.b.f96222a, 4, null), null, null, null, 14, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: l */
    private final C24587j0 m75944l(FormTextFieldModel formTextFieldModel, C21535a c21535a, C20731r c20731r) {
        return AbstractC25745h.m75953a(formTextFieldModel, c21535a, c20731r != null ? c20731r.getText() : null, c20731r != null ? !c20731r.getIsValid() : false, c20731r != null ? c20731r.getServerErrorMessage() : null);
    }

    /* JADX INFO: renamed from: c */
    public final C24571b0 m75945c(C20738y domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        C24571b0 c24571b0M75943k = domainResult.getCurrentDialogType() instanceof InterfaceC20737x.a ? m75943k((InterfaceC20737x.a) domainResult.getCurrentDialogType(), domainResult.getAppointmentType()) : m75942j(domainResult);
        EnumC24591l0 enumC24591l0M75934a = m75934a(domainResult);
        InterfaceC24615z interfaceC24615z = domainResult.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        return C24571b0.m71708c(c24571b0M75943k, null, null, enumC24591l0M75934a, interfaceC24615z instanceof InterfaceC24615z.v ? (InterfaceC24615z.v) interfaceC24615z : null, 3, null);
    }
}
