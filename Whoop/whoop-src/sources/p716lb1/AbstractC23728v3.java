package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.ProgressMeterModel;
import com.whoop.design.models.ProgressMeterStyle;
import f81.C14249c;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: lb1.v3 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\"\u001a\u0010\u000e\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/design/models/ProgressMeterModel;", "model", "Lf81/c;", "d", "(Lcom/whoop/design/models/ProgressMeterModel;)Lf81/c;", "Lcom/whoop/design/models/ProgressMeterStyle;", "Ly81/f;", "e", "(Lcom/whoop/design/models/ProgressMeterStyle;)Ly81/f;", "Llb1/y0;", "a", "Llb1/y0;", "c", "()Llb1/y0;", "progressMeterMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23728v3 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f94029a = Function1.m68251a(new C23654j3(25));

    /* JADX INFO: renamed from: lb1.v3$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f94030a;

        static {
            int[] iArr = new int[ProgressMeterStyle.values().length];
            try {
                iArr[ProgressMeterStyle.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProgressMeterStyle.RECOVERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProgressMeterStyle.POSITIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f94030a = iArr;
        }
    }

    /* JADX INFO: renamed from: lb1.v3$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f94031w;

        public b(Function1 function1) {
            this.f94031w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f94031w.invoke((ProgressMeterModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C23743y0 m69587c() {
        return f94029a;
    }

    /* JADX INFO: renamed from: d */
    public static final C14249c m69588d(ProgressMeterModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C14249c(model.getTitle(), model.getSubtitle(), model.getProgress(), m69589e(model.getStyle()));
    }

    /* JADX INFO: renamed from: e */
    public static final EnumC39333f m69589e(ProgressMeterStyle progressMeterStyle) {
        AbstractC22676k.m65750j(progressMeterStyle, "<this>");
        int i13 = a.f94030a[progressMeterStyle.ordinal()];
        if (i13 == 1) {
            return EnumC39333f.ACCENT_ONBOARDING_ACTION;
        }
        if (i13 == 2) {
            return EnumC39333f.RECOVERY;
        }
        if (i13 == 3) {
            return EnumC39333f.ACCENT_POSITIVE_TREND;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m69590f(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ProgressMeterModel.class), new b(new C23654j3(26)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C14249c m69591g(ProgressMeterModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69588d(model);
    }
}
