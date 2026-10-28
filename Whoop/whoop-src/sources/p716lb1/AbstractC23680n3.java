package p716lb1;

import b31.C2674c;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.OptionCommitPanelModel;
import com.whoop.design.util.AbstractC8693b;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.C27273p0;
import ny0.EnumC27267m0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.InterfaceC25312u;
import ry0.C31909d;

/* JADX INFO: renamed from: lb1.n3 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/design/models/items/OptionCommitPanelModel;", "Lb31/c;", "g", "(Lcom/whoop/design/models/items/OptionCommitPanelModel;)Lb31/c;", "Llb1/y0;", "a", "Llb1/y0;", "d", "()Llb1/y0;", "optionCommitPanelMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23680n3 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93888a = Function1.m68251a(new C23654j3(9));

    /* JADX INFO: renamed from: lb1.n3$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93889w;

        public a(Function1 function1) {
            this.f93889w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93889w.invoke((OptionCommitPanelModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.n3$b */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            C31909d c31909d = (C31909d) it;
            return c31909d.m99205a((32639 & 1) != 0 ? c31909d.id : null, (32639 & 2) != 0 ? c31909d.title : null, (32639 & 4) != 0 ? c31909d.subtitle : null, (32639 & 8) != 0 ? c31909d.leftIcon : null, (32639 & 16) != 0 ? c31909d.leftImage : null, (32639 & 32) != 0 ? c31909d.shouldTintLeftImage : false, (32639 & 64) != 0 ? c31909d.selectionStyle : null, (32639 & 128) != 0 ? c31909d.selected : false, (32639 & 256) != 0 ? c31909d.showCheckbox : false, (32639 & 512) != 0 ? c31909d.actionArgument : null, (32639 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c31909d.deselectArgument : null, (32639 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c31909d.selectionDisabled : true, (32639 & 4096) != 0 ? c31909d.isDisabled : false, (32639 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c31909d.fixedHeightInSizeDp : null, (32639 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c31909d.sectionTitle : null);
        }
    }

    /* JADX INFO: renamed from: lb1.n3$c */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            C27273p0 c27273p0 = (C27273p0) it;
            return c27273p0.getStyle() == EnumC27267m0.HIGHLIGHTED ? c27273p0.m82257a((15359 & 1) != 0 ? c27273p0.text : null, (15359 & 2) != 0 ? c27273p0.navigationAction : null, (15359 & 4) != 0 ? c27273p0.leftIcon : null, (15359 & 8) != 0 ? c27273p0.rightIcon : null, (15359 & 16) != 0 ? c27273p0.tint : null, (15359 & 32) != 0 ? c27273p0.tintGradient : null, (15359 & 64) != 0 ? c27273p0.useTextPadding : false, (15359 & 128) != 0 ? c27273p0.actionArgument : null, (15359 & 256) != 0 ? c27273p0.analyticEvent : null, (15359 & 512) != 0 ? c27273p0.dismissEvent : null, (15359 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c27273p0.alignment : null, (15359 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c27273p0.trimStartGutter : false, (15359 & 4096) != 0 ? c27273p0.style : null, (15359 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c27273p0.enabled : false) : c27273p0;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C23743y0 m69155d() {
        return f93888a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m69156e(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(OptionCommitPanelModel.class), new a(new C23654j3(10)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C2674c m69157f(OptionCommitPanelModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69158g(model);
    }

    /* JADX INFO: renamed from: g */
    private static final C2674c m69158g(OptionCommitPanelModel optionCommitPanelModel) {
        return new C2674c(optionCommitPanelModel.getId(), AbstractC8693b.m21279m(optionCommitPanelModel.getTitle()), AbstractC8693b.m21279m(optionCommitPanelModel.getSubtitle()), optionCommitPanelModel.getSubtitleSupportsMarkdown(), C21535a.m60536k(AbstractC21537c.m60554d(new C23751z2(8)), optionCommitPanelModel.getOptions(), null, 2, null), AbstractC23613d4.m68662l(optionCommitPanelModel.getPrimaryButton(), null, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m69159h(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        designItemReducer.m60546a(c22673i0.getOrCreateKotlinClass(C31909d.class), new b());
        designItemReducer.m60546a(c22673i0.getOrCreateKotlinClass(C27273p0.class), new c());
        return C23454a0.f92919a;
    }
}
