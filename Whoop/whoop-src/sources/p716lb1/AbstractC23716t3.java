package p716lb1;

import c31.C3927k;
import c31.EnumC3920d;
import com.whoop.design.atomic.atom.icon.GlowStyle;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.ProgressButtonModel;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import l83.C23454a0;
import l83.C23465k;
import p208i2.AbstractC17911t;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;

/* JADX INFO: renamed from: lb1.t3 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\t\"\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/design/models/ProgressButtonModel;", "Lc31/k;", "g", "(Lcom/whoop/design/models/ProgressButtonModel;)Lc31/k;", "Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;", "Ll83/k;", "Ly81/e;", "Li2/t;", "f", "(Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;)Ll83/k;", "Llb1/y0;", "a", "Llb1/y0;", "c", "()Llb1/y0;", "progressButtonMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23716t3 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93973a = Function1.m68251a(new C23654j3(19));

    /* JADX INFO: renamed from: lb1.t3$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93974a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f93975b;

        static {
            int[] iArr = new int[ProgressButtonModel.ButtonType.values().length];
            try {
                iArr[ProgressButtonModel.ButtonType.FILLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProgressButtonModel.ButtonType.PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f93974a = iArr;
            int[] iArr2 = new int[ProgressButtonModel.ButtonStyle.values().length];
            try {
                iArr2[ProgressButtonModel.ButtonStyle.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ProgressButtonModel.ButtonStyle.IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ProgressButtonModel.ButtonStyle.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ProgressButtonModel.ButtonStyle.RECOVERY.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ProgressButtonModel.ButtonStyle.ONBOARDING.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            f93975b = iArr2;
        }
    }

    /* JADX INFO: renamed from: lb1.t3$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93976w;

        public b(Function1 function1) {
            this.f93976w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93976w.invoke((ProgressButtonModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C23743y0 m69425c() {
        return f93973a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m69426d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ProgressButtonModel.class), new b(new C23654j3(20)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C3927k m69427e(ProgressButtonModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69429g(model);
    }

    /* JADX INFO: renamed from: f */
    private static final C23465k m69428f(ProgressButtonModel.ButtonStyle buttonStyle) {
        int i13 = a.f93975b[buttonStyle.ordinal()];
        if (i13 == 1) {
            return new C23465k(EnumC39333f.ACCENT_ACTION, null);
        }
        if (i13 == 2) {
            return new C23465k(EnumC39333f.STRAIN, null);
        }
        if (i13 == 3) {
            return new C23465k(EnumC39333f.ACCENT_NEGATIVE_TREND, null);
        }
        if (i13 == 4) {
            return new C23465k(EnumC39333f.RECOVERY, null);
        }
        if (i13 == 5) {
            return new C23465k(null, AbstractC15673b0.m43983F0());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: g */
    public static final C3927k m69429g(ProgressButtonModel progressButtonModel) {
        EnumC3920d enumC3920d;
        AbstractC22676k.m65750j(progressButtonModel, "<this>");
        int i13 = a.f93974a[progressButtonModel.getButtonType().ordinal()];
        if (i13 == 1) {
            enumC3920d = EnumC3920d.FILLED;
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            enumC3920d = EnumC3920d.PROGRESS;
        }
        EnumC3920d enumC3920d2 = enumC3920d;
        C23465k c23465kM69428f = m69428f(progressButtonModel.getStyle());
        InterfaceC39332e interfaceC39332e = (InterfaceC39332e) c23465kM69428f.f92937w;
        AbstractC17911t abstractC17911t = (AbstractC17911t) c23465kM69428f.f92938x;
        TextResource text = progressButtonModel.getText();
        EnumC16313m0 enumC16313m0M46378c = AbstractC16315n0.m46378c(progressButtonModel.getIcon(), EnumC16313m0.ARROW_FORWARD);
        EnumC39333f iconColor = progressButtonModel.getIconColor();
        GlowStyle glowStyle = progressButtonModel.getGlowStyle();
        EnumC39333f color = glowStyle != null ? glowStyle.getColor() : null;
        Float fillPercentage = progressButtonModel.getFillPercentage();
        Boolean boolIsEnabled = progressButtonModel.isEnabled();
        return new C3927k(enumC3920d2, text, null, null, null, enumC16313m0M46378c, 0, 0, fillPercentage, boolIsEnabled != null ? boolIsEnabled.booleanValue() : true, false, interfaceC39332e, abstractC17911t, iconColor, color, progressButtonModel.getInteraction(), null, 66780, null);
    }
}
