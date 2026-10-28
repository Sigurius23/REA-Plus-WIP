package p716lb1;

import b91.EnumC2888c;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.MarkdownTextModel;
import com.whoop.design.models.items.ChallengeProgressGaugeCenterModel;
import com.whoop.design.models.items.ChallengeProgressGaugeFooterModel;
import com.whoop.design.models.items.ChallengeProgressGaugeModel;
import e93.AbstractC12889b;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import j51.C21333a;
import j51.C21334b;
import j51.C21339g;
import java.util.Locale;
import kd1.AbstractC22403o;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p736sz0.C33169c0;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: lb1.b0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u001a\u0010\u0014\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;", "Lj51/g;", "i", "(Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;)Lj51/g;", "Lcom/whoop/design/models/MarkdownTextModel;", "Lsz0/c0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/design/models/MarkdownTextModel;)Lsz0/c0;", "c", "()Lsz0/c0;", "", "color", "Ly81/f;", "f", "(Ljava/lang/String;)Ly81/f;", "Llb1/y0;", "a", "Llb1/y0;", "g", "()Llb1/y0;", "challengeProgressGaugeMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23595b0 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93675a = Function1.m68251a(new C23724v(18));

    /* JADX INFO: renamed from: lb1.b0$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93676w;

        public a(Function1 function1) {
            this.f93676w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93676w.invoke((ChallengeProgressGaugeModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    private static final C33169c0 m68514c() {
        return new C33169c0("", EnumC2888c.B1, EnumC39333f.WHITE_70, 5, null, null, null, null, false, null, MessageListItemViewType.GIPHY, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m68515d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ChallengeProgressGaugeModel.class), new a(new C23724v(19)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C21339g m68516e(ChallengeProgressGaugeModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68520i(model);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0059 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x005a A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r0.equals("GREY") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        if (r0.equals("GRAY") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        return p745y81.EnumC39333f.WHITE_70;
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final p745y81.EnumC39333f m68517f(java.lang.String r6) {
        /*
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r6.toUpperCase(r0)
            java.lang.String r1 = "toUpperCase(...)"
            p715kotlin.jvm.internal.AbstractC22676k.m65749i(r0, r1)
            int r1 = r0.hashCode()
            r2 = 2196067(0x218263, float:3.077345E-39)
            if (r1 == r2) goto L34
            r2 = 2196191(0x2182df, float:3.077519E-39)
            if (r1 == r2) goto L2b
            r2 = 82564105(0x4ebd409, float:5.5442958E-36)
            if (r1 == r2) goto L1f
            goto L3c
        L1f:
            java.lang.String r1 = "WHITE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L28
            goto L3c
        L28:
            y81.f r6 = p745y81.EnumC39333f.BRAND_WHITE
            return r6
        L2b:
            java.lang.String r1 = "GREY"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3c
            goto L5b
        L34:
            java.lang.String r1 = "GRAY"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5b
        L3c:
            y81.f r0 = p745y81.EnumC39333f.WHITE_70
            y81.f[] r1 = p745y81.EnumC39333f.values()
            int r2 = r1.length
            r3 = 0
        L44:
            if (r3 >= r2) goto L56
            r4 = r1[r3]
            java.lang.String r5 = r4.name()
            boolean r5 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r5, r6)
            if (r5 == 0) goto L53
            goto L57
        L53:
            int r3 = r3 + 1
            goto L44
        L56:
            r4 = 0
        L57:
            if (r4 != 0) goto L5a
            return r0
        L5a:
            return r4
        L5b:
            y81.f r6 = p745y81.EnumC39333f.WHITE_70
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p716lb1.AbstractC23595b0.m68517f(java.lang.String):y81.f");
    }

    /* JADX INFO: renamed from: g */
    public static final C23743y0 m68518g() {
        return f93675a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0071  */
    /* JADX INFO: renamed from: h */
    private static final C33169c0 m68519h(MarkdownTextModel markdownTextModel) {
        EnumC2888c enumC2888c;
        int i13;
        String text = markdownTextModel.getText();
        String style = markdownTextModel.getStyle();
        EnumC2888c enumC2888c2 = EnumC2888c.B1;
        EnumC2888c[] enumC2888cArrValues = EnumC2888c.values();
        int length = enumC2888cArrValues.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                enumC2888c = null;
                break;
            }
            enumC2888c = enumC2888cArrValues[i14];
            if (AbstractC22676k.m65745e(enumC2888c.name(), style)) {
                break;
            }
            i14++;
        }
        if (enumC2888c != null) {
            enumC2888c2 = enumC2888c;
        }
        EnumC39333f enumC39333fM68517f = m68517f(markdownTextModel.getColor());
        String upperCase = markdownTextModel.getAlignment().toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        int iHashCode = upperCase.hashCode();
        if (iHashCode != 68795) {
            if (iHashCode != 1984282709) {
                if (iHashCode == 2058686492 && upperCase.equals("TRAILING")) {
                    i13 = 6;
                }
            } else if (upperCase.equals("CENTER")) {
                i13 = 3;
            }
            i13 = 5;
        } else if (upperCase.equals("END")) {
            i13 = 6;
        } else {
            i13 = 5;
        }
        return new C33169c0(text, enumC2888c2, enumC39333fM68517f, i13, AbstractC16315n0.m46377b(markdownTextModel.getIcon()), null, null, null, false, null, 992, null);
    }

    /* JADX INFO: renamed from: i */
    public static final C21339g m68520i(ChallengeProgressGaugeModel challengeProgressGaugeModel) {
        C21334b c21334b;
        C33169c0 c33169c0M68514c;
        AbstractC22676k.m65750j(challengeProgressGaugeModel, "<this>");
        float fM36283m = AbstractC12889b.m36283m(challengeProgressGaugeModel.getPercentValue(), 0.0f, 100.0f);
        String centerSubtitle = challengeProgressGaugeModel.getCenterSubtitle();
        boolean zIsPreview = challengeProgressGaugeModel.isPreview();
        ChallengeProgressGaugeCenterModel center = challengeProgressGaugeModel.getCenter();
        EnumC16313m0 enumC16313m0 = null;
        C21333a c21333a = center != null ? new C21333a(center.getPrimaryText(), center.getSecondaryText()) : null;
        String centerImageUrl = challengeProgressGaugeModel.getCenterImageUrl();
        AbstractC22403o.c cVar = centerImageUrl != null ? new AbstractC22403o.c(centerImageUrl, 0, 0, 0, 14, null) : null;
        ChallengeProgressGaugeFooterModel footer = challengeProgressGaugeModel.getFooter();
        if (footer != null) {
            String icon = footer.getIcon();
            if (icon != null) {
                EnumC16313m0 enumC16313m1 = EnumC16313m0.TIME;
                for (EnumC16313m0 enumC16313m2 : EnumC16313m0.values()) {
                    if (AbstractC22676k.m65745e(enumC16313m2.name(), icon)) {
                        enumC16313m0 = enumC16313m2;
                        break;
                    }
                }
                if (enumC16313m0 == null) {
                    enumC16313m0 = enumC16313m1;
                }
            }
            C33169c0 c33169c0M68519h = m68519h(footer.getPrimaryText());
            MarkdownTextModel secondaryText = footer.getSecondaryText();
            if (secondaryText == null || (c33169c0M68514c = m68519h(secondaryText)) == null) {
                c33169c0M68514c = m68514c();
            }
            c21334b = new C21334b(enumC16313m0, c33169c0M68519h, c33169c0M68514c);
        } else {
            c21334b = null;
        }
        return new C21339g(fM36283m, centerSubtitle, c21333a, cVar, c21334b, 0, 0.0f, 0.0f, 0L, 0L, 0L, 0L, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0.0f, 0, 0, 0L, 0.0f, 0.0f, zIsPreview, 8388576, null);
    }
}
