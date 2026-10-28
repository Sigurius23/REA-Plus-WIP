package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.VerticalSpacerModel;
import java.util.Locale;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.C25292c0;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lb1.i5 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u001a\u0010\n\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m65681d2 = {"", "size", "", "d", "(Ljava/lang/String;)I", "Llb1/y0;", "a", "Llb1/y0;", "c", "()Llb1/y0;", "verticalSpacerMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23649i5 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93807a = Function1.m68251a(new C23753z4(14));

    /* JADX INFO: renamed from: lb1.i5$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93808w;

        public a(Function1 function1) {
            this.f93808w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93808w.invoke((VerticalSpacerModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C23743y0 m68890c() {
        return f93807a;
    }

    /* JADX INFO: renamed from: d */
    public static final int m68891d(String size) {
        AbstractC22676k.m65750j(size, "size");
        String upperCase = size.toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        switch (upperCase.hashCode()) {
            case -2024701067:
                return !upperCase.equals("MEDIUM") ? 2 : 3;
            case 72205083:
                return !upperCase.equals("LARGE") ? 2 : 4;
            case 79011047:
                upperCase.equals("SMALL");
                return 2;
            case 482273240:
                return !upperCase.equals("EXTRA_SMALL") ? 2 : 1;
            default:
                return 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m68892e(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(VerticalSpacerModel.class), new a(new C23753z4(15)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX INFO: renamed from: f */
    public static final C25292c0 m68893f(VerticalSpacerModel model) {
        float fM68891d;
        AbstractC22676k.m65750j(model, "model");
        float f13 = 1 * 4;
        Double minLength = model.getMinLength();
        if (minLength == null) {
            fM68891d = m68891d(model.getSize()) * 8;
        } else {
            if (minLength.doubleValue() < 0.0d) {
                minLength = null;
            }
            if (minLength != null) {
                fM68891d = (float) minLength.doubleValue();
            } else {
                fM68891d = m68891d(model.getSize()) * 8;
            }
        }
        return new C25292c0(f13, fM68891d, null);
    }
}
