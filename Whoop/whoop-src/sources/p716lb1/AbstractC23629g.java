package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.AiChatTalkTextButtonModel;
import com.whoop.design.models.items.AiChatTalkTextEmptyStateModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l83.C23454a0;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import wb3.AbstractC37056f;
import y31.C39192a;
import y31.C39196e;

/* JADX INFO: renamed from: lb1.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"Llb1/y0;", "a", "Llb1/y0;", "e", "()Llb1/y0;", "aiChatTalkTextEmptyStateMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23629g {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93760a = Function1.m68251a(new C23587a(8));

    /* JADX INFO: renamed from: lb1.g$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93761w;

        public a(Function1 function1) {
            this.f93761w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93761w.invoke((AiChatTalkTextEmptyStateModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m68765c(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(AiChatTalkTextEmptyStateModel.class), new a(new C23587a(9)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C39196e m68766d(AiChatTalkTextEmptyStateModel model) {
        C39192a c39192a;
        EnumC16313m0 enumC16313m0;
        String upperCase;
        Iterator it;
        EnumC16313m0 enumC16313m1;
        String upperCase2;
        EnumC16313m0 enumC16313m2;
        AbstractC22676k.m65750j(model, "model");
        AiChatTalkTextButtonModel smallButton = model.getSmallButton();
        if (smallButton != null) {
            String title = smallButton.getTitle();
            TextResource textResourceM21278l = title != null ? AbstractC8693b.m21278l(title) : null;
            String icon = smallButton.getIcon();
            if (icon != null) {
                upperCase2 = icon.toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
            } else {
                upperCase2 = "";
            }
            EnumC16313m0 enumC16313m3 = EnumC16313m0.KEYBOARD;
            EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
            int length = enumC16313m0ArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC16313m2 = null;
                    break;
                }
                enumC16313m2 = enumC16313m0ArrValues[i13];
                if (AbstractC22676k.m65745e(enumC16313m2.name(), upperCase2)) {
                    break;
                }
                i13++;
            }
            c39192a = new C39192a(textResourceM21278l, enumC16313m2 == null ? enumC16313m3 : enumC16313m2, smallButton.getVoiceoverText(), smallButton.getAiAction(), smallButton.isEmphasized(), null, 32, null);
        } else {
            c39192a = null;
        }
        List listM118960L = AbstractC37056f.m118960L(c39192a);
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(model.getTitle());
        String titleIcon = model.getTitleIcon();
        if (titleIcon == null) {
            enumC16313m0 = null;
            break;
        }
        EnumC16313m0[] enumC16313m0ArrValues2 = EnumC16313m0.values();
        int length2 = enumC16313m0ArrValues2.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length2) {
                enumC16313m0 = null;
                break;
            }
            enumC16313m0 = enumC16313m0ArrValues2[i14];
            if (AbstractC22676k.m65745e(enumC16313m0.name(), titleIcon)) {
                break;
            }
            i14++;
        }
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(model.getSubtitle());
        List<AiChatTalkTextButtonModel> largeButtons = model.getLargeButtons();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(largeButtons, 10));
        Iterator it3 = largeButtons.iterator();
        while (it3.hasNext()) {
            AiChatTalkTextButtonModel aiChatTalkTextButtonModel = (AiChatTalkTextButtonModel) it3.next();
            String title2 = aiChatTalkTextButtonModel.getTitle();
            TextResource textResourceM21278l4 = title2 != null ? AbstractC8693b.m21278l(title2) : null;
            String icon2 = aiChatTalkTextButtonModel.getIcon();
            if (icon2 != null) {
                upperCase = icon2.toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            } else {
                upperCase = "";
            }
            EnumC16313m0 enumC16313m4 = EnumC16313m0.MICROPHONE;
            EnumC16313m0[] enumC16313m0ArrValues3 = EnumC16313m0.values();
            int length3 = enumC16313m0ArrValues3.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length3) {
                    it = it3;
                    enumC16313m1 = null;
                    break;
                }
                enumC16313m1 = enumC16313m0ArrValues3[i15];
                it = it3;
                if (AbstractC22676k.m65745e(enumC16313m1.name(), upperCase)) {
                    break;
                }
                i15++;
                it3 = it;
            }
            if (enumC16313m1 == null) {
                enumC16313m1 = enumC16313m4;
            }
            arrayList.add(new C39192a(textResourceM21278l4, enumC16313m1, aiChatTalkTextButtonModel.getVoiceoverText(), aiChatTalkTextButtonModel.getAiAction(), aiChatTalkTextButtonModel.isEmphasized(), null, 32, null));
            it3 = it;
        }
        String imageUrl = model.getImageUrl();
        String bottomNavText = model.getBottomNavText();
        return new C39196e(textResourceM21278l2, enumC16313m0, textResourceM21278l3, listM118960L, arrayList, imageUrl, true, bottomNavText != null ? AbstractC8693b.m21278l(bottomNavText) : null, model.getBottomNavDestination());
    }

    /* JADX INFO: renamed from: e */
    public static final C23743y0 m68767e() {
        return f93760a;
    }
}
