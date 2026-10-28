package pb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.behaviordetails.ImpactCalloutModel;
import com.whoop.design.models.items.behaviordetails.ImpactCalloutStyle;
import com.whoop.design.util.AbstractC8693b;
import f51.C14097h;
import l83.C23454a0;
import l83.C23465k;
import nm1.C26842g;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23743y0;
import p716lb1.C23749z0;
import p716lb1.Function1;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: pb1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\"\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m65681d2 = {"Lcom/whoop/design/models/items/behaviordetails/ImpactCalloutStyle;", "style", "Ll83/k;", "Ly81/f;", "f", "(Lcom/whoop/design/models/items/behaviordetails/ImpactCalloutStyle;)Ll83/k;", "Llb1/y0;", "a", "Llb1/y0;", "c", "()Llb1/y0;", "impactCalloutMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29056c {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f117570a = Function1.m68251a(new C26842g(18));

    /* JADX INFO: renamed from: pb1.c$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f117571a;

        static {
            int[] iArr = new int[ImpactCalloutStyle.values().length];
            try {
                iArr[ImpactCalloutStyle.RECOVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImpactCalloutStyle.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f117571a = iArr;
        }
    }

    /* JADX INFO: renamed from: pb1.c$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f117572w;

        public b(p715kotlin.jvm.functions.Function1 function1) {
            this.f117572w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f117572w.invoke((ImpactCalloutModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C23743y0 m88323c() {
        return f117570a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m88324d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ImpactCalloutModel.class), new b(new C26842g(19)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C14097h m88325e(ImpactCalloutModel model) {
        ImpactCalloutStyle impactCalloutStyle;
        AbstractC22676k.m65750j(model, "model");
        String style = model.getStyle();
        ImpactCalloutStyle impactCalloutStyle2 = ImpactCalloutStyle.DEFAULT;
        ImpactCalloutStyle[] impactCalloutStyleArrValues = ImpactCalloutStyle.values();
        int length = impactCalloutStyleArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                impactCalloutStyle = null;
                break;
            }
            impactCalloutStyle = impactCalloutStyleArrValues[i13];
            if (AbstractC22676k.m65745e(impactCalloutStyle.name(), style)) {
                break;
            }
            i13++;
        }
        if (impactCalloutStyle != null) {
            impactCalloutStyle2 = impactCalloutStyle;
        }
        C23465k c23465kM88326f = m88326f(impactCalloutStyle2);
        return new C14097h(AbstractC8693b.m21278l(model.getText()), (EnumC39333f) c23465kM88326f.f92937w, (EnumC39333f) c23465kM88326f.f92938x);
    }

    /* JADX INFO: renamed from: f */
    private static final C23465k m88326f(ImpactCalloutStyle impactCalloutStyle) {
        int i13 = a.f117571a[impactCalloutStyle.ordinal()];
        if (i13 == 1) {
            return new C23465k(EnumC39333f.NEUTRAL_15, EnumC39333f.RECOVERY);
        }
        if (i13 == 2) {
            return new C23465k(EnumC39333f.NEUTRAL_15, EnumC39333f.WHITE_70);
        }
        throw new NoWhenBranchMatchedException();
    }
}
