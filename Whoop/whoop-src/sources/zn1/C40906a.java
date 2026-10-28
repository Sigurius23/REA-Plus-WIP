package zn1;

import ad3.AbstractC0757c;
import ad3.AbstractC0770m;
import ad3.InterfaceC0768k;
import com.whoop.hormonalinsights.onboarding.domain.models.FeatureToggleScreen;
import com.whoop.hormonalinsights.onboarding.domain.models.InformationScreen;
import com.whoop.hormonalinsights.onboarding.domain.models.MciDateInputScreen;
import com.whoop.hormonalinsights.onboarding.domain.models.MciIntegrationScreen;
import com.whoop.hormonalinsights.onboarding.domain.models.MciSaveScreen;
import com.whoop.hormonalinsights.onboarding.domain.models.TextNumberPickerScreen;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalDateInputScreen;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalMultiSelectScreen;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalNameScreen;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalNumberPickerScreen;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalSaveScreen;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreen;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenContent;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenType;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalTextInputScreen;
import com.whoop.hormonalinsights.postpartum.domain.models.UnknownScreen;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import l83.C23454a0;
import m83.AbstractC25260n;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import yb3.AbstractC39414r;
import yc3.C39437a;
import yc3.C39444h;
import yc3.C39448l;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: zn1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Lzn1/a;", "Lwc3/c;", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;", "<init>", "()V", "Lzc3/d;", "decoder", "b", "(Lzc3/d;)Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "c", "(Lzc3/e;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;)V", "Lyc3/g;", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "descriptor", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40906a implements InterfaceC37138c {

    /* JADX INFO: renamed from: a */
    public static final C40906a f176311a = new C40906a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final InterfaceC39443g descriptor;

    /* JADX INFO: renamed from: c */
    public static final int f176313c;

    /* JADX INFO: renamed from: zn1.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f176314a;

        static {
            int[] iArr = new int[HormonalScreenType.values().length];
            try {
                iArr[HormonalScreenType.DATE_INPUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HormonalScreenType.DATE_INPUT_MENSTRUAL_CYCLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HormonalScreenType.FEATURE_TOGGLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HormonalScreenType.INFORMATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HormonalScreenType.INTEGRATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HormonalScreenType.MULTI_SELECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HormonalScreenType.NUMBER_PICKER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[HormonalScreenType.PREGNANCY_NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[HormonalScreenType.SAVE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[HormonalScreenType.MENSTRUAL_CYCLE_SAVE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[HormonalScreenType.TEXT_INPUT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[HormonalScreenType.TEXT_NUMBER_PICKER.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[HormonalScreenType.UNKNOWN.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f176314a = iArr;
        }
    }

    static {
        InterfaceC39443g[] interfaceC39443gArr = new InterfaceC39443g[0];
        if (AbstractC39414r.m125890i0("HormonalScreen")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        C39437a c39437a = new C39437a("HormonalScreen");
        m132587a(c39437a);
        descriptor = new C39444h("HormonalScreen", C39448l.f169713a, c39437a.f169680c.size(), AbstractC25260n.m74049W0(interfaceC39443gArr), c39437a);
        f176313c = 8;
    }

    private C40906a() {
    }

    /* JADX INFO: renamed from: a */
    private static final C23454a0 m132587a(C39437a buildClassSerialDescriptor) {
        AbstractC22676k.m65750j(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        buildClassSerialDescriptor.m125993a("id", stringSerializer.getDescriptor(), false);
        buildClassSerialDescriptor.m125993a("type", stringSerializer.getDescriptor(), false);
        buildClassSerialDescriptor.m125993a("content", JsonElement.Companion.serializer().getDescriptor(), false);
        buildClassSerialDescriptor.m125993a("navigation_title", stringSerializer.getDescriptor(), false);
        buildClassSerialDescriptor.m125993a("navigation_subtitle", stringSerializer.getDescriptor(), false);
        return C23454a0.f92919a;
    }

    @Override // wc3.InterfaceC37137b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public HormonalScreen deserialize(InterfaceC40541d decoder) {
        String strM1844f;
        HormonalScreenId hormonalScreenId;
        String strM1844f2;
        HormonalScreenType hormonalScreenType;
        HormonalScreenContent hormonalScreenContent;
        String strM1844f3;
        AbstractC22676k.m65750j(decoder, "decoder");
        String strM1844f4 = null;
        InterfaceC0768k interfaceC0768k = decoder instanceof InterfaceC0768k ? (InterfaceC0768k) decoder : null;
        if (interfaceC0768k == null) {
            throw new IllegalStateException("HormonalScreenSerializer can only be used with JSON");
        }
        JsonObject jsonObjectM1847i = AbstractC0770m.m1847i(interfaceC0768k.mo1838b());
        JsonElement jsonElement = (JsonElement) jsonObjectM1847i.get((Object) "id");
        if (jsonElement == null || (strM1844f = AbstractC0770m.m1844f(AbstractC0770m.m1848j(jsonElement))) == null) {
            strM1844f = "";
        }
        HormonalScreenId hormonalScreenId2 = HormonalScreenId.UNKNOWN;
        HormonalScreenId[] hormonalScreenIdArrValues = HormonalScreenId.values();
        int length = hormonalScreenIdArrValues.length;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                hormonalScreenId = null;
                break;
            }
            hormonalScreenId = hormonalScreenIdArrValues[i14];
            if (AbstractC22676k.m65745e(hormonalScreenId.name(), strM1844f)) {
                break;
            }
            i14++;
        }
        HormonalScreenId hormonalScreenId3 = hormonalScreenId == null ? hormonalScreenId2 : hormonalScreenId;
        JsonElement jsonElement2 = (JsonElement) jsonObjectM1847i.get((Object) "type");
        if (jsonElement2 == null || (strM1844f2 = AbstractC0770m.m1844f(AbstractC0770m.m1848j(jsonElement2))) == null) {
            strM1844f2 = "";
        }
        HormonalScreenType hormonalScreenType2 = HormonalScreenType.UNKNOWN;
        HormonalScreenType[] hormonalScreenTypeArrValues = HormonalScreenType.values();
        int length2 = hormonalScreenTypeArrValues.length;
        while (true) {
            if (i13 >= length2) {
                hormonalScreenType = null;
                break;
            }
            hormonalScreenType = hormonalScreenTypeArrValues[i13];
            if (AbstractC22676k.m65745e(hormonalScreenType.name(), strM1844f2)) {
                break;
            }
            i13++;
        }
        HormonalScreenType hormonalScreenType3 = hormonalScreenType == null ? hormonalScreenType2 : hormonalScreenType;
        JsonElement jsonElement3 = (JsonElement) jsonObjectM1847i.get((Object) "navigation_title");
        String str = (jsonElement3 == null || (strM1844f3 = AbstractC0770m.m1844f(AbstractC0770m.m1848j(jsonElement3))) == null) ? "" : strM1844f3;
        JsonElement jsonElement4 = (JsonElement) jsonObjectM1847i.get((Object) "navigation_subtitle");
        if (jsonElement4 != null && AbstractC0770m.m1848j(jsonElement4).isString()) {
            strM1844f4 = AbstractC0770m.m1844f(AbstractC0770m.m1848j(jsonElement4));
        }
        String str2 = strM1844f4;
        JsonElement jsonObject = (JsonElement) jsonObjectM1847i.get((Object) "content");
        if (jsonObject == null) {
            jsonObject = new JsonObject(C25272z.f99163w);
        }
        switch (a.f176314a[hormonalScreenType3.ordinal()]) {
            case 1:
                AbstractC0757c abstractC0757cMo1837a = interfaceC0768k.mo1837a();
                abstractC0757cMo1837a.getClass();
                hormonalScreenContent = (HormonalScreenContent) abstractC0757cMo1837a.m1830a(HormonalDateInputScreen.INSTANCE.serializer(), jsonObject);
                break;
            case 2:
                AbstractC0757c abstractC0757cMo1837a2 = interfaceC0768k.mo1837a();
                abstractC0757cMo1837a2.getClass();
                hormonalScreenContent = (HormonalScreenContent) abstractC0757cMo1837a2.m1830a(MciDateInputScreen.INSTANCE.serializer(), jsonObject);
                break;
            case 3:
                AbstractC0757c abstractC0757cMo1837a3 = interfaceC0768k.mo1837a();
                abstractC0757cMo1837a3.getClass();
                hormonalScreenContent = (HormonalScreenContent) abstractC0757cMo1837a3.m1830a(FeatureToggleScreen.INSTANCE.serializer(), jsonObject);
                break;
            case 4:
                AbstractC0757c abstractC0757cMo1837a4 = interfaceC0768k.mo1837a();
                abstractC0757cMo1837a4.getClass();
                hormonalScreenContent = (HormonalScreenContent) abstractC0757cMo1837a4.m1830a(InformationScreen.INSTANCE.serializer(), jsonObject);
                break;
            case 5:
                AbstractC0757c abstractC0757cMo1837a5 = interfaceC0768k.mo1837a();
                abstractC0757cMo1837a5.getClass();
                hormonalScreenContent = (HormonalScreenContent) abstractC0757cMo1837a5.m1830a(MciIntegrationScreen.INSTANCE.serializer(), jsonObject);
                break;
            case 6:
                AbstractC0757c abstractC0757cMo1837a6 = interfaceC0768k.mo1837a();
                abstractC0757cMo1837a6.getClass();
                hormonalScreenContent = (HormonalScreenContent) abstractC0757cMo1837a6.m1830a(HormonalMultiSelectScreen.INSTANCE.serializer(), jsonObject);
                break;
            case 7:
                AbstractC0757c abstractC0757cMo1837a7 = interfaceC0768k.mo1837a();
                abstractC0757cMo1837a7.getClass();
                hormonalScreenContent = (HormonalScreenContent) abstractC0757cMo1837a7.m1830a(HormonalNumberPickerScreen.INSTANCE.serializer(), jsonObject);
                break;
            case 8:
                AbstractC0757c abstractC0757cMo1837a8 = interfaceC0768k.mo1837a();
                abstractC0757cMo1837a8.getClass();
                hormonalScreenContent = (HormonalScreenContent) abstractC0757cMo1837a8.m1830a(HormonalNameScreen.INSTANCE.serializer(), jsonObject);
                break;
            case 9:
                AbstractC0757c abstractC0757cMo1837a9 = interfaceC0768k.mo1837a();
                abstractC0757cMo1837a9.getClass();
                hormonalScreenContent = (HormonalScreenContent) abstractC0757cMo1837a9.m1830a(HormonalSaveScreen.INSTANCE.serializer(), jsonObject);
                break;
            case 10:
                AbstractC0757c abstractC0757cMo1837a10 = interfaceC0768k.mo1837a();
                abstractC0757cMo1837a10.getClass();
                hormonalScreenContent = (HormonalScreenContent) abstractC0757cMo1837a10.m1830a(MciSaveScreen.INSTANCE.serializer(), jsonObject);
                break;
            case 11:
                AbstractC0757c abstractC0757cMo1837a11 = interfaceC0768k.mo1837a();
                abstractC0757cMo1837a11.getClass();
                hormonalScreenContent = (HormonalScreenContent) abstractC0757cMo1837a11.m1830a(HormonalTextInputScreen.INSTANCE.serializer(), jsonObject);
                break;
            case 12:
                AbstractC0757c abstractC0757cMo1837a12 = interfaceC0768k.mo1837a();
                abstractC0757cMo1837a12.getClass();
                hormonalScreenContent = (HormonalScreenContent) abstractC0757cMo1837a12.m1830a(TextNumberPickerScreen.INSTANCE.serializer(), jsonObject);
                break;
            case 13:
                hormonalScreenContent = UnknownScreen.INSTANCE;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new HormonalScreen(hormonalScreenId3, hormonalScreenType3, hormonalScreenContent, str, str2);
    }

    @Override // wc3.InterfaceC37145j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC40542e encoder, HormonalScreen value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        throw new UnsupportedOperationException("Serialization of HormonalScreen is not supported. Avoid calling this method.");
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return descriptor;
    }
}
