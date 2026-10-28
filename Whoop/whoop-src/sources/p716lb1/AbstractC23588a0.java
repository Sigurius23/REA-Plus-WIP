package p716lb1;

import b91.EnumC2888c;
import com.whoop.design.models.ContentType;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.celebration.AnimationModeModel;
import com.whoop.design.models.celebration.CelebrationMediaModel;
import com.whoop.design.models.celebration.CelebrationMediaWithCaptionModel;
import com.whoop.design.models.celebration.CelebrationOverlayModel;
import com.whoop.design.models.celebration.DynamicLottieModel;
import com.whoop.design.models.celebration.SlotConfigModel;
import com.whoop.design.models.celebration.TextOverlayStyle;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import gz0.AbstractC16315n0;
import gz0.AbstractC16319p0;
import i51.AbstractC18111h;
import i51.AbstractC18125v;
import i51.C18106c;
import i51.C18112i;
import i51.C18115l;
import i51.C18118o;
import i51.C18122s;
import i51.EnumC18104a;
import i51.EnumC18105b;
import i51.EnumC18107d;
import i51.EnumC18110g;
import i51.EnumC18116m;
import i51.EnumC18119p;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jb1.AbstractC21537c;
import kd1.AbstractC22403o;
import l83.C23454a0;
import m83.AbstractC25267u;
import m83.C25271y;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.C27273p0;
import p208i2.AbstractC17918w0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: lb1.a0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u001e\u001a\u00020\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m65681d2 = {"Lcom/whoop/design/models/celebration/CelebrationMediaModel;", "Li51/i;", "e", "(Lcom/whoop/design/models/celebration/CelebrationMediaModel;)Li51/i;", "Lcom/whoop/design/models/celebration/TextOverlayStyle;", "Li51/p;", "n", "(Lcom/whoop/design/models/celebration/TextOverlayStyle;)Li51/p;", "Lcom/whoop/design/models/celebration/CelebrationOverlayModel;", "Li51/o;", "g", "(Lcom/whoop/design/models/celebration/CelebrationOverlayModel;)Li51/o;", "Li51/d;", "confettiStyle", "", "Ly81/e;", "m", "(Li51/d;)Ljava/util/List;", "Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;", "Li51/l;", "f", "(Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;)Li51/l;", "Li51/h;", "o", "(Lcom/whoop/design/models/celebration/CelebrationMediaModel;)Li51/h;", "Llb1/y0;", "a", "Llb1/y0;", "l", "()Llb1/y0;", "celebrationOverlayMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23588a0 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93562a = Function1.m68251a(new C23724v(14));

    /* JADX INFO: renamed from: lb1.a0$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93563a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f93564b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f93565c;

        static {
            int[] iArr = new int[TextOverlayStyle.values().length];
            try {
                iArr[TextOverlayStyle.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextOverlayStyle.STREAK_FROZEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextOverlayStyle.EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f93563a = iArr;
            int[] iArr2 = new int[EnumC18107d.values().length];
            try {
                iArr2[EnumC18107d.ACTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC18107d.HEALTHSPAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC18107d.RECOVERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC18107d.SLEEP.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC18107d.STRAIN.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EnumC18107d.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EnumC18107d.NONE.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            f93564b = iArr2;
            int[] iArr3 = new int[ContentType.values().length];
            try {
                iArr3[ContentType.DYNAMIC_LOTTIE.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[ContentType.LOTTIE.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[ContentType.ICON.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[ContentType.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[ContentType.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            f93565c = iArr3;
        }
    }

    /* JADX INFO: renamed from: lb1.a0$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93566w;

        public b(Function1 function1) {
            this.f93566w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93566w.invoke((CelebrationMediaModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a0$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93567w;

        public c(Function1 function1) {
            this.f93567w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93567w.invoke((CelebrationMediaWithCaptionModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.a0$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93568w;

        public d(Function1 function1) {
            this.f93568w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93568w.invoke((CelebrationOverlayModel) it);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final C18112i m68237e(CelebrationMediaModel celebrationMediaModel) {
        EnumC18110g enumC18110g;
        AbstractC22676k.m65750j(celebrationMediaModel, "<this>");
        AbstractC18111h abstractC18111hM68247o = m68247o(celebrationMediaModel);
        TextResource textOverlay = celebrationMediaModel.getTextOverlay();
        TextResource textOverlaySuffix = celebrationMediaModel.getTextOverlaySuffix();
        String size = celebrationMediaModel.getSize();
        EnumC18110g enumC18110g2 = EnumC18110g.MEDIUM;
        EnumC18110g[] enumC18110gArrValues = EnumC18110g.values();
        int length = enumC18110gArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC18110g = null;
                break;
            }
            enumC18110g = enumC18110gArrValues[i13];
            if (AbstractC22676k.m65745e(enumC18110g.name(), size)) {
                break;
            }
            i13++;
        }
        EnumC18110g enumC18110g3 = enumC18110g == null ? enumC18110g2 : enumC18110g;
        TextOverlayStyle textOverlayStyle = celebrationMediaModel.getTextOverlayStyle();
        if (textOverlayStyle == null) {
            textOverlayStyle = TextOverlayStyle.DEFAULT;
        }
        return new C18112i(abstractC18111hM68247o, enumC18110g3, textOverlay, textOverlaySuffix, m68246n(textOverlayStyle), false, 32, null);
    }

    /* JADX INFO: renamed from: f */
    private static final C18115l m68238f(CelebrationMediaWithCaptionModel celebrationMediaWithCaptionModel) {
        EnumC2888c enumC2888c;
        C18112i c18112iM68237e = m68237e(celebrationMediaWithCaptionModel.getMedia());
        TextResource captionText = celebrationMediaWithCaptionModel.getCaptionText();
        String captionTypography = celebrationMediaWithCaptionModel.getCaptionTypography();
        EnumC2888c enumC2888c2 = null;
        if (captionTypography == null) {
            enumC2888c = null;
            break;
        }
        EnumC2888c[] enumC2888cArrValues = EnumC2888c.values();
        int length = enumC2888cArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC2888c = null;
                break;
            }
            enumC2888c = enumC2888cArrValues[i13];
            if (AbstractC22676k.m65745e(enumC2888c.name(), captionTypography)) {
                break;
            }
            i13++;
        }
        C9598e destination = celebrationMediaWithCaptionModel.getDestination();
        TextResource subCaptionText = celebrationMediaWithCaptionModel.getSubCaptionText();
        String subCaptionLeadingImage = celebrationMediaWithCaptionModel.getSubCaptionLeadingImage();
        AbstractC22403o.c cVar = subCaptionLeadingImage != null ? new AbstractC22403o.c(subCaptionLeadingImage, 0, 0, 0, 14, null) : null;
        String subCaptionTypography = celebrationMediaWithCaptionModel.getSubCaptionTypography();
        if (subCaptionTypography != null) {
            for (EnumC2888c enumC2888c3 : EnumC2888c.values()) {
                if (AbstractC22676k.m65745e(enumC2888c3.name(), subCaptionTypography)) {
                    enumC2888c2 = enumC2888c3;
                    break;
                }
            }
        }
        return new C18115l(c18112iM68237e, captionText, enumC2888c, destination, subCaptionText, cVar, enumC2888c2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r33v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v6, types: [m83.z] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.AbstractMap, java.util.LinkedHashMap] */
    /* JADX INFO: renamed from: g */
    private static final C18118o m68239g(CelebrationOverlayModel celebrationOverlayModel) {
        EnumC18107d enumC18107d;
        EnumC18107d enumC18107d2;
        EnumC18105b enumC18105b;
        ?? linkedHashMap;
        EnumC18107d enumC18107d3;
        EnumC18107d enumC18107d4;
        String celebrationId = celebrationOverlayModel.getCelebrationId();
        String confettiStyle = celebrationOverlayModel.getConfettiStyle();
        EnumC18116m enumC18116m = null;
        if (confettiStyle != null) {
            enumC18107d = EnumC18107d.NONE;
            EnumC18107d[] enumC18107dArrValues = EnumC18107d.values();
            int length = enumC18107dArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC18107d4 = null;
                    break;
                }
                enumC18107d4 = enumC18107dArrValues[i13];
                if (AbstractC22676k.m65745e(enumC18107d4.name(), confettiStyle)) {
                    break;
                }
                i13++;
            }
            if (enumC18107d4 != null) {
                enumC18107d = enumC18107d4;
            }
        } else {
            enumC18107d = null;
        }
        String confettiStyle2 = celebrationOverlayModel.getConfettiStyle();
        if (confettiStyle2 != null) {
            enumC18107d2 = EnumC18107d.NONE;
            EnumC18107d[] enumC18107dArrValues2 = EnumC18107d.values();
            int length2 = enumC18107dArrValues2.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length2) {
                    enumC18107d3 = null;
                    break;
                }
                enumC18107d3 = enumC18107dArrValues2[i14];
                if (AbstractC22676k.m65745e(enumC18107d3.name(), confettiStyle2)) {
                    break;
                }
                i14++;
            }
            if (enumC18107d3 != null) {
                enumC18107d2 = enumC18107d3;
            }
        } else {
            enumC18107d2 = null;
        }
        List<InterfaceC39332e> listM68245m = m68245m(enumC18107d2);
        List<InterfaceC25312u> listM60540g = AbstractC21537c.m60555e(null, 1, null).m60540g(celebrationOverlayModel.getItems());
        List<InterfaceC25312u> listM60540g2 = AbstractC21537c.m60555e(null, 1, null).m60540g(celebrationOverlayModel.getTopItems());
        EnumC18107d enumC18107d5 = enumC18107d;
        TextResource title = celebrationOverlayModel.getTitle();
        TextResource subtitle = celebrationOverlayModel.getSubtitle();
        String configuration = celebrationOverlayModel.getButtons().getConfiguration();
        EnumC18105b enumC18105b2 = EnumC18105b.VERTICAL;
        EnumC18105b[] enumC18105bArrValues = EnumC18105b.values();
        int length3 = enumC18105bArrValues.length;
        int i15 = 0;
        while (true) {
            if (i15 >= length3) {
                enumC18105b = null;
                break;
            }
            enumC18105b = enumC18105bArrValues[i15];
            if (AbstractC22676k.m65745e(enumC18105b.name(), configuration)) {
                break;
            }
            i15++;
        }
        if (enumC18105b != null) {
            enumC18105b2 = enumC18105b;
        }
        List<InterfaceC25312u> listM60540g3 = AbstractC21537c.m60555e(null, 1, null).m60540g(celebrationOverlayModel.getButtons().getButtons());
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM60540g3, 10));
        for (Object objM82257a : listM60540g3) {
            if (objM82257a instanceof C27273p0) {
                C27273p0 c27273p0 = (C27273p0) objM82257a;
                objM82257a = c27273p0.m82257a((15359 & 1) != 0 ? c27273p0.text : null, (15359 & 2) != 0 ? c27273p0.navigationAction : null, (15359 & 4) != 0 ? c27273p0.leftIcon : null, (15359 & 8) != 0 ? c27273p0.rightIcon : new C39274g(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward(), null, 2, null), (15359 & 16) != 0 ? c27273p0.tint : null, (15359 & 32) != 0 ? c27273p0.tintGradient : null, (15359 & 64) != 0 ? c27273p0.useTextPadding : false, (15359 & 128) != 0 ? c27273p0.actionArgument : null, (15359 & 256) != 0 ? c27273p0.analyticEvent : null, (15359 & 512) != 0 ? c27273p0.dismissEvent : null, (15359 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c27273p0.alignment : null, (15359 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c27273p0.trimStartGutter : false, (15359 & 4096) != 0 ? c27273p0.style : null, (15359 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c27273p0.enabled : false);
            }
            arrayList.add(objM82257a);
        }
        C18106c c18106c = new C18106c(enumC18105b2, arrayList);
        String alignment = celebrationOverlayModel.getAlignment();
        EnumC18116m enumC18116m2 = EnumC18116m.LEFT;
        for (EnumC18116m enumC18116m3 : EnumC18116m.values()) {
            if (AbstractC22676k.m65745e(enumC18116m3.name(), alignment)) {
                enumC18116m = enumC18116m3;
                break;
            }
        }
        if (enumC18116m != null) {
            enumC18116m2 = enumC18116m;
        }
        Map<String, String> analyticProperties = celebrationOverlayModel.getAnalyticProperties();
        if (analyticProperties != null) {
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, String> entry : analyticProperties.entrySet()) {
                if (entry.getValue().length() > 0) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        } else {
            linkedHashMap = C25272z.f99163w;
        }
        return new C18118o(celebrationId, enumC18107d5, listM68245m, listM60540g, listM60540g2, title, subtitle, c18106c, enumC18116m2, linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m68240h(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        C23724v c23724v = new C23724v(15);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(CelebrationMediaModel.class), new b(c23724v));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(CelebrationMediaWithCaptionModel.class), new c(new C23724v(16)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(CelebrationOverlayModel.class), new d(new C23724v(17)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C18112i m68241i(CelebrationMediaModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68237e(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C18115l m68242j(CelebrationMediaWithCaptionModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68238f(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C18118o m68243k(CelebrationOverlayModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68239g(model);
    }

    /* JADX INFO: renamed from: l */
    public static final C23743y0 m68244l() {
        return f93562a;
    }

    /* JADX INFO: renamed from: m */
    public static final List<InterfaceC39332e> m68245m(EnumC18107d enumC18107d) {
        switch (enumC18107d == null ? -1 : a.f93564b[enumC18107d.ordinal()]) {
            case -1:
            case 7:
                return C25271y.f99162w;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return AbstractC37056f.m118959K(p745y81.Function1.m125324b(AbstractC17918w0.m51517e(4294886107L)), p745y81.Function1.m125324b(AbstractC17918w0.m51517e(4284985062L)), p745y81.Function1.m125324b(AbstractC17918w0.m51517e(4286447081L)));
            case 2:
                return AbstractC37056f.m118959K(EnumC39333f.ACCENT_POSITIVE_TREND, EnumC39333f.RECOVERY);
            case 3:
                return AbstractC37056f.m118959K(EnumC39333f.RECOVERY, EnumC39333f.RECOVERY_HIGH_RECOVERY);
            case 4:
                return AbstractC37056f.m118959K(EnumC39333f.SLEEP, EnumC39333f.SLEEP_LIGHT_SLEEP);
            case 5:
                return AbstractC37056f.m118959K(EnumC39333f.STRAIN, EnumC39333f.RECOVERY);
            case 6:
                return AbstractC37056f.m118959K(EnumC39333f.BRAND_WHITE, EnumC39333f.STRAIN_ZONE_1);
        }
    }

    /* JADX INFO: renamed from: n */
    private static final EnumC18119p m68246n(TextOverlayStyle textOverlayStyle) {
        int i13 = a.f93563a[textOverlayStyle.ordinal()];
        if (i13 == 1) {
            return EnumC18119p.DEFAULT;
        }
        if (i13 == 2) {
            return EnumC18119p.STREAK_FROZEN;
        }
        if (i13 == 3) {
            return EnumC18119p.EMPTY;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: o */
    private static final AbstractC18111h m68247o(CelebrationMediaModel celebrationMediaModel) {
        EnumC18104a enumC18104aM68827a;
        int i13 = a.f93565c[celebrationMediaModel.getContentType().ordinal()];
        if (i13 != 1) {
            if (i13 == 2) {
                InterfaceC35689r0.e eVarM113134a = InterfaceC35689r0.e.m113134a(InterfaceC35689r0.e.m113135b(celebrationMediaModel.getContentUrl()));
                Boolean showLoadingShimmer = celebrationMediaModel.getShowLoadingShimmer();
                return new AbstractC18111h.a(new C18122s(eVarM113134a, null, C25271y.f99162w, null, null, showLoadingShimmer != null ? showLoadingShimmer.booleanValue() : true, 26, null));
            }
            if (i13 == 3) {
                Integer numM46376a = AbstractC16315n0.m46376a(celebrationMediaModel.getContentUrl());
                return new AbstractC18111h.b(new AbstractC22403o.a(numM46376a != null ? numM46376a.intValue() : AbstractC18489d0.m53359E(C38072d.f163053a)));
            }
            if (i13 == 4 || i13 == 5) {
                return new AbstractC18111h.c(new AbstractC22403o.c(celebrationMediaModel.getContentUrl(), 0, 0, 0, 14, null));
            }
            throw new NoWhenBranchMatchedException();
        }
        DynamicLottieModel dynamicLottieProperties = celebrationMediaModel.getDynamicLottieProperties();
        if (dynamicLottieProperties == null) {
            return new AbstractC18111h.d(InterfaceC35689r0.e.m113134a(InterfaceC35689r0.e.m113135b(celebrationMediaModel.getContentUrl())));
        }
        InterfaceC35689r0.e eVarM113134a2 = InterfaceC35689r0.e.m113134a(InterfaceC35689r0.e.m113135b(celebrationMediaModel.getContentUrl()));
        String overlayUrl = dynamicLottieProperties.getOverlayUrl();
        List<SlotConfigModel> slots = dynamicLottieProperties.getSlots();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = slots.iterator();
        while (it.hasNext()) {
            AbstractC18125v abstractC18125vM68828b = AbstractC23638h1.m68828b((SlotConfigModel) it.next());
            if (abstractC18125vM68828b != null) {
                arrayList.add(abstractC18125vM68828b);
            }
        }
        AnimationModeModel animationMode = dynamicLottieProperties.getAnimationMode();
        if (animationMode == null || (enumC18104aM68827a = AbstractC23638h1.m68827a(animationMode)) == null) {
            enumC18104aM68827a = !AbstractC22676k.m65745e(dynamicLottieProperties.getAnimated(), Boolean.FALSE) ? EnumC18104a.LOOP : EnumC18104a.OFF;
        }
        EnumC18104a enumC18104a = enumC18104aM68827a;
        List<String> highlightGradient = dynamicLottieProperties.getHighlightGradient();
        Boolean showLoadingShimmer2 = celebrationMediaModel.getShowLoadingShimmer();
        return new AbstractC18111h.a(new C18122s(eVarM113134a2, overlayUrl, arrayList, enumC18104a, highlightGradient, showLoadingShimmer2 != null ? showLoadingShimmer2.booleanValue() : true));
    }
}
