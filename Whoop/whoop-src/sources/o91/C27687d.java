package o91;

import ad3.AbstractC0757c;
import ad3.AbstractC0770m;
import ad3.C0769l;
import ad3.InterfaceC0768k;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.form.FormSheetContent;
import com.whoop.design.models.items.form.FormSheetDateContent;
import com.whoop.design.models.items.form.FormSheetModel;
import com.whoop.design.models.items.form.FormSheetSelectableOptionsContent;
import com.whoop.design.models.items.form.FormSheetType;
import com.whoop.design.models.items.form.UnknownFormSheetContent;
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

/* JADX INFO: renamed from: o91.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Lo91/d;", "Lwc3/c;", "Lcom/whoop/design/models/items/form/FormSheetModel;", "<init>", "()V", "Lzc3/d;", "decoder", "b", "(Lzc3/d;)Lcom/whoop/design/models/items/form/FormSheetModel;", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "c", "(Lzc3/e;Lcom/whoop/design/models/items/form/FormSheetModel;)V", "Lyc3/g;", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "descriptor", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27687d implements InterfaceC37138c {

    /* JADX INFO: renamed from: a */
    public static final C27687d f111455a = new C27687d();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final InterfaceC39443g descriptor;

    /* JADX INFO: renamed from: c */
    public static final int f111457c;

    /* JADX INFO: renamed from: o91.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f111458a;

        static {
            int[] iArr = new int[FormSheetType.values().length];
            try {
                iArr[FormSheetType.SELECTABLE_OPTIONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FormSheetType.DATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FormSheetType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f111458a = iArr;
        }
    }

    static {
        InterfaceC39443g[] interfaceC39443gArr = new InterfaceC39443g[0];
        if (AbstractC39414r.m125890i0("FormSheetModel")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        C39437a c39437a = new C39437a("FormSheetModel");
        m83697a(c39437a);
        descriptor = new C39444h("FormSheetModel", C39448l.f169713a, c39437a.f169680c.size(), AbstractC25260n.m74049W0(interfaceC39443gArr), c39437a);
        f111457c = 8;
    }

    private C27687d() {
    }

    /* JADX INFO: renamed from: a */
    private static final C23454a0 m83697a(C39437a buildClassSerialDescriptor) {
        AbstractC22676k.m65750j(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        buildClassSerialDescriptor.m125993a("id", stringSerializer.getDescriptor(), false);
        buildClassSerialDescriptor.m125993a("type", stringSerializer.getDescriptor(), false);
        buildClassSerialDescriptor.m125993a("title", stringSerializer.getDescriptor(), false);
        C0769l c0769l = JsonElement.Companion;
        buildClassSerialDescriptor.m125993a("content", c0769l.serializer().getDescriptor(), false);
        buildClassSerialDescriptor.m125993a("cancel_button", c0769l.serializer().getDescriptor(), false);
        buildClassSerialDescriptor.m125993a("confirm_button", c0769l.serializer().getDescriptor(), false);
        return C23454a0.f92919a;
    }

    @Override // wc3.InterfaceC37137b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FormSheetModel deserialize(InterfaceC40541d decoder) {
        FormSheetContent formSheetContent;
        String strM1844f;
        String strM1844f2;
        String strM1844f3;
        AbstractC22676k.m65750j(decoder, "decoder");
        FormSheetType formSheetType = null;
        InterfaceC0768k interfaceC0768k = decoder instanceof InterfaceC0768k ? (InterfaceC0768k) decoder : null;
        if (interfaceC0768k == null) {
            throw new IllegalStateException("FormSheetSerializer can only be used with JSON");
        }
        JsonObject jsonObjectM1847i = AbstractC0770m.m1847i(interfaceC0768k.mo1838b());
        JsonElement jsonElement = (JsonElement) jsonObjectM1847i.get((Object) "id");
        String str = "";
        String str2 = (jsonElement == null || (strM1844f3 = AbstractC0770m.m1844f(AbstractC0770m.m1848j(jsonElement))) == null) ? "" : strM1844f3;
        JsonElement jsonElement2 = (JsonElement) jsonObjectM1847i.get((Object) "title");
        String str3 = (jsonElement2 == null || (strM1844f2 = AbstractC0770m.m1844f(AbstractC0770m.m1848j(jsonElement2))) == null) ? "" : strM1844f2;
        JsonElement jsonElement3 = (JsonElement) jsonObjectM1847i.get((Object) "type");
        if (jsonElement3 != null && (strM1844f = AbstractC0770m.m1844f(AbstractC0770m.m1848j(jsonElement3))) != null) {
            str = strM1844f;
        }
        FormSheetType formSheetType2 = FormSheetType.UNKNOWN;
        for (FormSheetType formSheetType3 : FormSheetType.values()) {
            if (AbstractC22676k.m65745e(formSheetType3.name(), str)) {
                formSheetType = formSheetType3;
                break;
            }
        }
        FormSheetType formSheetType4 = formSheetType == null ? formSheetType2 : formSheetType;
        JsonElement jsonObject = (JsonElement) jsonObjectM1847i.get((Object) "content");
        if (jsonObject == null) {
            jsonObject = new JsonObject(C25272z.f99163w);
        }
        JsonElement jsonElement4 = (JsonElement) jsonObjectM1847i.get((Object) "cancel_button");
        if (jsonElement4 == null) {
            throw new IllegalArgumentException("Missing required field: cancel_button");
        }
        JsonElement jsonElement5 = (JsonElement) jsonObjectM1847i.get((Object) "confirm_button");
        if (jsonElement5 == null) {
            throw new IllegalArgumentException("Missing required field: confirm_button");
        }
        int i13 = a.f111458a[formSheetType4.ordinal()];
        if (i13 == 1) {
            AbstractC0757c abstractC0757cMo1837a = interfaceC0768k.mo1837a();
            abstractC0757cMo1837a.getClass();
            formSheetContent = (FormSheetContent) abstractC0757cMo1837a.m1830a(FormSheetSelectableOptionsContent.INSTANCE.serializer(), jsonObject);
        } else if (i13 == 2) {
            AbstractC0757c abstractC0757cMo1837a2 = interfaceC0768k.mo1837a();
            abstractC0757cMo1837a2.getClass();
            formSheetContent = (FormSheetContent) abstractC0757cMo1837a2.m1830a(FormSheetDateContent.INSTANCE.serializer(), jsonObject);
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            formSheetContent = UnknownFormSheetContent.INSTANCE;
        }
        FormSheetContent formSheetContent2 = formSheetContent;
        AbstractC0757c abstractC0757cMo1837a3 = interfaceC0768k.mo1837a();
        abstractC0757cMo1837a3.getClass();
        CardButtonModel.Companion companion = CardButtonModel.INSTANCE;
        CardButtonModel cardButtonModel = (CardButtonModel) abstractC0757cMo1837a3.m1830a(companion.serializer(), jsonElement4);
        AbstractC0757c abstractC0757cMo1837a4 = interfaceC0768k.mo1837a();
        abstractC0757cMo1837a4.getClass();
        return new FormSheetModel(str2, formSheetType4, str3, formSheetContent2, cardButtonModel, (CardButtonModel) abstractC0757cMo1837a4.m1830a(companion.serializer(), jsonElement5));
    }

    @Override // wc3.InterfaceC37145j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC40542e encoder, FormSheetModel value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        throw new UnsupportedOperationException("Serialization of FormSheetModel is not supported. Avoid calling this method.");
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return descriptor;
    }
}
