package p716lb1;

import ad3.AbstractC0757c;
import com.whoop.design.atomic.organism.dynamicinformationalimagecard.DynamicInformationalImageCardLayoutState;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.DynamicInformationalImageCardModel;
import com.whoop.design.models.modal.DecodedGenericInteraction;
import com.whoop.design.models.modal.GenericInteractionDecoderKt;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import kd1.AbstractC22403o;
import l72.C23399f;
import l83.C23454a0;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q83.AbstractC30060g;
import u51.C34545d;

/* JADX INFO: renamed from: lb1.g1 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001b\u0010\u0005\u001a\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m65681d2 = {"Lad3/c;", "a", "Ll83/h;", "g", "()Lad3/c;", "interactionJson", "Llb1/y0;", "b", "Llb1/y0;", "f", "()Llb1/y0;", "dynamicInformationalImageCardMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23631g1 {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC23462h f93766a = AbstractC30060g.m92088H(new C23399f(8));

    /* JADX INFO: renamed from: b */
    private static final C23743y0 f93767b = Function1.m68251a(new C23670m(14));

    /* JADX INFO: renamed from: lb1.g1$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93768w;

        public a(Function1 function1) {
            this.f93768w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93768w.invoke((DynamicInformationalImageCardModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m68782d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(DynamicInformationalImageCardModel.class), new a(new C23670m(15)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C34545d m68783e(DynamicInformationalImageCardModel model) {
        DecodedGenericInteraction decodedGenericInteraction;
        AbstractC22676k.m65750j(model, "model");
        DynamicInformationalImageCardLayoutState layoutState = model.getLayoutState();
        String backgroundImageUrl = model.getBackgroundImageUrl();
        C9598e navigation = null;
        AbstractC22403o.c cVar = backgroundImageUrl != null ? new AbstractC22403o.c(backgroundImageUrl, 0, 0, 0, 14, null) : null;
        String iconImageUrl = model.getIconImageUrl();
        AbstractC22403o.c cVar2 = iconImageUrl != null ? new AbstractC22403o.c(iconImageUrl, 0, 0, 0, 14, null) : null;
        String title = model.getTitle();
        TextResource textResourceM21278l = title != null ? AbstractC8693b.m21278l(title) : null;
        String description = model.getDescription();
        TextResource textResourceM21278l2 = description != null ? AbstractC8693b.m21278l(description) : null;
        String tagTitle = model.getTagTitle();
        TextResource textResourceM21278l3 = tagTitle != null ? AbstractC8693b.m21278l(tagTitle) : null;
        GenericInteraction interaction = model.getInteraction();
        if (interaction != null && (decodedGenericInteraction = GenericInteractionDecoderKt.toDecodedGenericInteraction(interaction, m68785g())) != null) {
            navigation = decodedGenericInteraction.getNavigation();
        }
        return new C34545d(layoutState, cVar, cVar2, textResourceM21278l, textResourceM21278l2, textResourceM21278l3, navigation);
    }

    /* JADX INFO: renamed from: f */
    public static final C23743y0 m68784f() {
        return f93767b;
    }

    /* JADX INFO: renamed from: g */
    private static final AbstractC0757c m68785g() {
        return (AbstractC0757c) f93766a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final AbstractC0757c m68786h() {
        return AbstractC6728b.m20379d(null, null, null, null, null, 31, null);
    }
}
