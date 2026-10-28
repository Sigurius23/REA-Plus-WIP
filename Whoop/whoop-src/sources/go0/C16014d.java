package go0;

import ad3.AbstractC0757c;
import ad3.AbstractC0770m;
import ad3.InterfaceC0768k;
import com.whoop.clinicianintheloop.api.HeightWeightScreen;
import com.whoop.clinicianintheloop.api.InformationScreen;
import com.whoop.clinicianintheloop.api.MultiSelectScreen;
import com.whoop.clinicianintheloop.api.PersonalIntakeScreen;
import com.whoop.clinicianintheloop.api.StateSelectScreen;
import com.whoop.clinicianintheloop.api.TextEntryScreen;
import com.whoop.clinicianintheloop.api.VideoSchedulingIntakeScreen;
import com.whoop.design.models.ProgressButtonModel;
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

/* JADX INFO: renamed from: go0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Lgo0/d;", "Lwc3/c;", "Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;", "<init>", "()V", "Lzc3/d;", "decoder", "b", "(Lzc3/d;)Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "c", "(Lzc3/e;Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;)V", "Lyc3/g;", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "descriptor", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C16014d implements InterfaceC37138c {

    /* JADX INFO: renamed from: a */
    public static final C16014d f60609a = new C16014d();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final InterfaceC39443g descriptor;

    /* JADX INFO: renamed from: c */
    public static final int f60611c;

    /* JADX INFO: renamed from: go0.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f60612a;

        static {
            int[] iArr = new int[EnumC16015e.values().length];
            try {
                iArr[EnumC16015e.INFORMATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC16015e.STATE_SELECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC16015e.MULTI_SELECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC16015e.PERSONAL_INTAKE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC16015e.TEXT_ENTRY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC16015e.HEIGHT_WEIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC16015e.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f60612a = iArr;
        }
    }

    static {
        InterfaceC39443g[] interfaceC39443gArr = new InterfaceC39443g[0];
        if (AbstractC39414r.m125890i0("VideoSchedulingIntakeScreen")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        C39437a c39437a = new C39437a("VideoSchedulingIntakeScreen");
        m45324a(c39437a);
        descriptor = new C39444h("VideoSchedulingIntakeScreen", C39448l.f169713a, c39437a.f169680c.size(), AbstractC25260n.m74049W0(interfaceC39443gArr), c39437a);
        f60611c = 8;
    }

    private C16014d() {
    }

    /* JADX INFO: renamed from: a */
    private static final C23454a0 m45324a(C39437a buildClassSerialDescriptor) {
        AbstractC22676k.m65750j(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        buildClassSerialDescriptor.m125993a("id", stringSerializer.getDescriptor(), false);
        buildClassSerialDescriptor.m125993a("type", stringSerializer.getDescriptor(), false);
        buildClassSerialDescriptor.m125993a("content", JsonElement.Companion.serializer().getDescriptor(), false);
        buildClassSerialDescriptor.m125993a("navigation_title", stringSerializer.getDescriptor(), false);
        buildClassSerialDescriptor.m125993a("navigation_skip_title", stringSerializer.getDescriptor(), false);
        buildClassSerialDescriptor.m125993a("content_alignment", stringSerializer.getDescriptor(), false);
        return C23454a0.f92919a;
    }

    @Override // wc3.InterfaceC37137b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public VideoSchedulingIntakeScreen deserialize(InterfaceC40541d decoder) {
        String strM1844f;
        EnumC16015e enumC16015e;
        String strM1844f2;
        InterfaceC16013c interfaceC16013c;
        String strM1844f3;
        String strM1844f4;
        AbstractC22676k.m65750j(decoder, "decoder");
        EnumC16011a enumC16011a = null;
        InterfaceC0768k interfaceC0768k = decoder instanceof InterfaceC0768k ? (InterfaceC0768k) decoder : null;
        if (interfaceC0768k == null) {
            throw new IllegalStateException("VideoSchedulingIntakeScreenSerializer can only be used with JSON");
        }
        JsonObject jsonObjectM1847i = AbstractC0770m.m1847i(interfaceC0768k.mo1838b());
        JsonElement jsonElement = (JsonElement) jsonObjectM1847i.get((Object) "id");
        String str = (jsonElement == null || (strM1844f4 = AbstractC0770m.m1844f(AbstractC0770m.m1848j(jsonElement))) == null) ? "" : strM1844f4;
        JsonElement jsonElement2 = (JsonElement) jsonObjectM1847i.get((Object) "type");
        if (jsonElement2 == null || (strM1844f = AbstractC0770m.m1844f(AbstractC0770m.m1848j(jsonElement2))) == null) {
            strM1844f = "";
        }
        EnumC16015e enumC16015e2 = EnumC16015e.UNKNOWN;
        EnumC16015e[] enumC16015eArrValues = EnumC16015e.values();
        int length = enumC16015eArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC16015e = null;
                break;
            }
            enumC16015e = enumC16015eArrValues[i13];
            if (AbstractC22676k.m65745e(enumC16015e.name(), strM1844f)) {
                break;
            }
            i13++;
        }
        EnumC16015e enumC16015e3 = enumC16015e == null ? enumC16015e2 : enumC16015e;
        JsonElement jsonObject = (JsonElement) jsonObjectM1847i.get((Object) "content");
        if (jsonObject == null) {
            jsonObject = new JsonObject(C25272z.f99163w);
        }
        JsonElement jsonElement3 = (JsonElement) jsonObjectM1847i.get((Object) "navigation_title");
        String str2 = (jsonElement3 == null || (strM1844f3 = AbstractC0770m.m1844f(AbstractC0770m.m1848j(jsonElement3))) == null) ? "" : strM1844f3;
        JsonElement jsonElement4 = (JsonElement) jsonObjectM1847i.get((Object) "navigation_skip_title");
        String strM1844f5 = jsonElement4 != null ? AbstractC0770m.m1848j(jsonElement4).isString() ? AbstractC0770m.m1844f(AbstractC0770m.m1848j(jsonElement4)) : null : null;
        JsonElement jsonElement5 = (JsonElement) jsonObjectM1847i.get((Object) "content_alignment");
        if (jsonElement5 == null || (strM1844f2 = AbstractC0770m.m1844f(AbstractC0770m.m1848j(jsonElement5))) == null) {
            strM1844f2 = "TOP";
        }
        EnumC16011a enumC16011a2 = EnumC16011a.TOP;
        for (EnumC16011a enumC16011a3 : EnumC16011a.values()) {
            if (AbstractC22676k.m65745e(enumC16011a3.name(), strM1844f2)) {
                enumC16011a = enumC16011a3;
                break;
            }
        }
        EnumC16011a enumC16011a4 = enumC16011a == null ? enumC16011a2 : enumC16011a;
        JsonElement jsonElement6 = (JsonElement) jsonObjectM1847i.get((Object) "progress_button");
        if (jsonElement6 == null) {
            throw new IllegalArgumentException("Missing required field: progress_button");
        }
        AbstractC0757c abstractC0757cMo1837a = interfaceC0768k.mo1837a();
        abstractC0757cMo1837a.getClass();
        ProgressButtonModel progressButtonModel = (ProgressButtonModel) abstractC0757cMo1837a.m1830a(ProgressButtonModel.INSTANCE.serializer(), jsonElement6);
        switch (a.f60612a[enumC16015e3.ordinal()]) {
            case 1:
                AbstractC0757c abstractC0757cMo1837a2 = interfaceC0768k.mo1837a();
                abstractC0757cMo1837a2.getClass();
                interfaceC16013c = (InterfaceC16013c) abstractC0757cMo1837a2.m1830a(InformationScreen.INSTANCE.serializer(), jsonObject);
                break;
            case 2:
                AbstractC0757c abstractC0757cMo1837a3 = interfaceC0768k.mo1837a();
                abstractC0757cMo1837a3.getClass();
                interfaceC16013c = (InterfaceC16013c) abstractC0757cMo1837a3.m1830a(StateSelectScreen.INSTANCE.serializer(), jsonObject);
                break;
            case 3:
                AbstractC0757c abstractC0757cMo1837a4 = interfaceC0768k.mo1837a();
                abstractC0757cMo1837a4.getClass();
                interfaceC16013c = (InterfaceC16013c) abstractC0757cMo1837a4.m1830a(MultiSelectScreen.INSTANCE.serializer(), jsonObject);
                break;
            case 4:
                AbstractC0757c abstractC0757cMo1837a5 = interfaceC0768k.mo1837a();
                abstractC0757cMo1837a5.getClass();
                interfaceC16013c = (InterfaceC16013c) abstractC0757cMo1837a5.m1830a(PersonalIntakeScreen.INSTANCE.serializer(), jsonObject);
                break;
            case 5:
                AbstractC0757c abstractC0757cMo1837a6 = interfaceC0768k.mo1837a();
                abstractC0757cMo1837a6.getClass();
                interfaceC16013c = (InterfaceC16013c) abstractC0757cMo1837a6.m1830a(TextEntryScreen.INSTANCE.serializer(), jsonObject);
                break;
            case 6:
                AbstractC0757c abstractC0757cMo1837a7 = interfaceC0768k.mo1837a();
                abstractC0757cMo1837a7.getClass();
                interfaceC16013c = (InterfaceC16013c) abstractC0757cMo1837a7.m1830a(HeightWeightScreen.INSTANCE.serializer(), jsonObject);
                break;
            case 7:
                interfaceC16013c = C16012b.f60608a;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new VideoSchedulingIntakeScreen(str, str2, strM1844f5, enumC16011a4, enumC16015e3, interfaceC16013c, progressButtonModel);
    }

    @Override // wc3.InterfaceC37145j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC40542e encoder, VideoSchedulingIntakeScreen value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        throw new UnsupportedOperationException("Serialization of VideoSchedulingIntakeScreen is not supported. Avoid calling this method.");
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return descriptor;
    }
}
