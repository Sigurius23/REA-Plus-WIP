package h72;

import ad3.AbstractC0757c;
import ad3.AbstractC0770m;
import ad3.InterfaceC0768k;
import com.whoop.sage.onboarding.domain.models.SageManualReadingInputScreen;
import com.whoop.sage.onboarding.domain.models.SageOnboardingContent;
import com.whoop.sage.onboarding.domain.models.SageOnboardingGuidelinesAcknowledgeScreen;
import com.whoop.sage.onboarding.domain.models.SageOnboardingInfoCheckboxScreen;
import com.whoop.sage.onboarding.domain.models.SageOnboardingInformationScreen;
import com.whoop.sage.onboarding.domain.models.SageOnboardingScreen;
import com.whoop.sage.onboarding.domain.models.SageOnboardingSelectionScreen;
import j72.EnumC21402g;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import l83.C23454a0;
import l83.C23464j;
import m83.AbstractC25260n;
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

/* JADX INFO: renamed from: h72.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Lh72/b;", "Lwc3/c;", "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "c", "(Lzc3/e;Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;)V", "Lzc3/d;", "decoder", "b", "(Lzc3/d;)Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;", "Lyc3/g;", "a", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "descriptor", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C16997b implements InterfaceC37138c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC39443g descriptor;

    /* JADX INFO: renamed from: h72.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f65305a;

        static {
            int[] iArr = new int[EnumC16996a.values().length];
            try {
                iArr[EnumC16996a.SELECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC16996a.INFO_CHECKBOX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC16996a.INFORMATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC16996a.GUIDELINES_ACKNOWLEDGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC16996a.MANUAL_READING_INPUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC16996a.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f65305a = iArr;
        }
    }

    public C16997b() {
        InterfaceC39443g[] interfaceC39443gArr = new InterfaceC39443g[0];
        if (AbstractC39414r.m125890i0("SageOnboardingScreen")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        C39437a c39437a = new C39437a("SageOnboardingScreen");
        m47871a(c39437a);
        this.descriptor = new C39444h("SageOnboardingScreen", C39448l.f169713a, c39437a.f169680c.size(), AbstractC25260n.m74049W0(interfaceC39443gArr), c39437a);
    }

    /* JADX INFO: renamed from: a */
    private static final C23454a0 m47871a(C39437a buildClassSerialDescriptor) {
        AbstractC22676k.m65750j(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        buildClassSerialDescriptor.m125993a("id", stringSerializer.getDescriptor(), false);
        buildClassSerialDescriptor.m125993a("type", stringSerializer.getDescriptor(), false);
        buildClassSerialDescriptor.m125993a("content", JsonElement.Companion.serializer().getDescriptor(), false);
        return C23454a0.f92919a;
    }

    @Override // wc3.InterfaceC37137b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SageOnboardingScreen deserialize(InterfaceC40541d decoder) {
        String content;
        EnumC21402g enumC21402g;
        SageOnboardingContent sageOnboardingContent;
        String content2;
        AbstractC22676k.m65750j(decoder, "decoder");
        EnumC16996a enumC16996a = null;
        InterfaceC0768k interfaceC0768k = decoder instanceof InterfaceC0768k ? (InterfaceC0768k) decoder : null;
        if (interfaceC0768k == null) {
            throw new IllegalArgumentException("SageOnboardingSerializer can only be used with JSON");
        }
        JsonObject jsonObjectM1847i = AbstractC0770m.m1847i(interfaceC0768k.mo1838b());
        JsonElement jsonElement = (JsonElement) jsonObjectM1847i.get((Object) "id");
        String str = "";
        if (jsonElement == null || (content = AbstractC0770m.m1848j(jsonElement).getContent()) == null) {
            content = "";
        }
        JsonElement jsonElement2 = (JsonElement) jsonObjectM1847i.get((Object) "type");
        if (jsonElement2 != null && (content2 = AbstractC0770m.m1848j(jsonElement2).getContent()) != null) {
            str = content2;
        }
        EnumC21402g enumC21402g2 = EnumC21402g.UNKNOWN;
        EnumC21402g[] enumC21402gArrValues = EnumC21402g.values();
        int length = enumC21402gArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC21402g = null;
                break;
            }
            enumC21402g = enumC21402gArrValues[i13];
            if (AbstractC22676k.m65745e(enumC21402g.name(), content)) {
                break;
            }
            i13++;
        }
        if (enumC21402g != null) {
            enumC21402g2 = enumC21402g;
        }
        EnumC16996a enumC16996a2 = EnumC16996a.UNKNOWN;
        for (EnumC16996a enumC16996a3 : EnumC16996a.values()) {
            if (AbstractC22676k.m65745e(enumC16996a3.name(), str)) {
                enumC16996a = enumC16996a3;
                break;
            }
        }
        if (enumC16996a != null) {
            enumC16996a2 = enumC16996a;
        }
        JsonElement jsonElement3 = (JsonElement) jsonObjectM1847i.get((Object) "content");
        if (jsonElement3 == null || (jsonElement3 instanceof JsonNull)) {
            return new SageOnboardingScreen(enumC21402g2, enumC16996a2, C16998c.f65306a);
        }
        switch (a.f65305a[enumC16996a2.ordinal()]) {
            case 1:
                AbstractC0757c abstractC0757cMo1837a = interfaceC0768k.mo1837a();
                abstractC0757cMo1837a.getClass();
                sageOnboardingContent = (SageOnboardingContent) abstractC0757cMo1837a.m1830a(SageOnboardingSelectionScreen.INSTANCE.serializer(), jsonElement3);
                break;
            case 2:
                AbstractC0757c abstractC0757cMo1837a2 = interfaceC0768k.mo1837a();
                abstractC0757cMo1837a2.getClass();
                sageOnboardingContent = (SageOnboardingContent) abstractC0757cMo1837a2.m1830a(SageOnboardingInfoCheckboxScreen.INSTANCE.serializer(), jsonElement3);
                break;
            case 3:
                AbstractC0757c abstractC0757cMo1837a3 = interfaceC0768k.mo1837a();
                abstractC0757cMo1837a3.getClass();
                sageOnboardingContent = (SageOnboardingContent) abstractC0757cMo1837a3.m1830a(SageOnboardingInformationScreen.INSTANCE.serializer(), jsonElement3);
                break;
            case 4:
                AbstractC0757c abstractC0757cMo1837a4 = interfaceC0768k.mo1837a();
                abstractC0757cMo1837a4.getClass();
                sageOnboardingContent = (SageOnboardingContent) abstractC0757cMo1837a4.m1830a(SageOnboardingGuidelinesAcknowledgeScreen.INSTANCE.serializer(), jsonElement3);
                break;
            case 5:
                AbstractC0757c abstractC0757cMo1837a5 = interfaceC0768k.mo1837a();
                abstractC0757cMo1837a5.getClass();
                sageOnboardingContent = (SageOnboardingContent) abstractC0757cMo1837a5.m1830a(SageManualReadingInputScreen.INSTANCE.serializer(), jsonElement3);
                break;
            case 6:
                sageOnboardingContent = C16998c.f65306a;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new SageOnboardingScreen(enumC21402g2, enumC16996a2, sageOnboardingContent);
    }

    @Override // wc3.InterfaceC37145j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC40542e encoder, SageOnboardingScreen value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        throw new C23464j("Serialization is not implemented");
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return this.descriptor;
    }
}
