package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.InfoCalloutStyle;
import com.whoop.design.models.items.MiniCalloutModel;
import com.whoop.design.util.TextResource;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import v21.C35585c;

/* JADX INFO: renamed from: lb1.e3 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/design/models/items/InfoCalloutStyle;", "Llb1/f3;", "f", "(Lcom/whoop/design/models/items/InfoCalloutStyle;)Llb1/f3;", "Llb1/y0;", "a", "Llb1/y0;", "c", "()Llb1/y0;", "miniCalloutMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23619e3 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93737a = Function1.m68251a(new C23715t2(24));

    /* JADX INFO: renamed from: lb1.e3$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93738a;

        static {
            int[] iArr = new int[InfoCalloutStyle.values().length];
            try {
                iArr[InfoCalloutStyle.IMPACT_DETAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InfoCalloutStyle.NEUTRAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InfoCalloutStyle.CONCERNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InfoCalloutStyle.ALERTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InfoCalloutStyle.POSITIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InfoCalloutStyle.SUBTLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[InfoCalloutStyle.MUTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[InfoCalloutStyle.AI.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f93738a = iArr;
        }
    }

    /* JADX INFO: renamed from: lb1.e3$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93739w;

        public b(Function1 function1) {
            this.f93739w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93739w.invoke((MiniCalloutModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C23743y0 m68703c() {
        return f93737a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m68704d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(MiniCalloutModel.class), new b(new C23715t2(25)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C35585c m68705e(MiniCalloutModel model) {
        AbstractC22676k.m65750j(model, "model");
        C23626f3 c23626f3M68706f = m68706f(model.getStyle());
        TextResource.C8691e c8691e = new TextResource.C8691e(model.getDescription());
        String cta = model.getCta();
        return new C35585c(c8691e, cta != null ? new TextResource.C8691e(cta) : null, model.getDestination(), c23626f3M68706f.getForegroundColor(), c23626f3M68706f.getBackgroundColor(), model.getModal());
    }

    /* JADX INFO: renamed from: f */
    public static final C23626f3 m68706f(InfoCalloutStyle infoCalloutStyle) {
        switch (infoCalloutStyle == null ? -1 : a.f93738a[infoCalloutStyle.ordinal()]) {
            case -1:
            case 1:
            case 2:
                return new C23626f3(EnumC39333f.RECOVERY, EnumC39333f.NEUTRAL_15);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 3:
                return new C23626f3(EnumC39333f.ACCENT_NEGATIVE_TREND, EnumC39333f.ACCENT_NEGATIVE_TREND_15);
            case 4:
                return new C23626f3(EnumC39333f.ACCENT_ALERT, EnumC39333f.ACCENT_ALERT_TREND_15);
            case 5:
                return new C23626f3(EnumC39333f.ACCENT_POSITIVE_TREND, EnumC39333f.ACCENT_POSITIVE_TREND_15);
            case 6:
                return new C23626f3(EnumC39333f.WHITE_70, EnumC39333f.WHITE_5);
            case 7:
                return new C23626f3(EnumC39333f.BLACK_70, EnumC39333f.BLACK_10);
            case 8:
                return new C23626f3(EnumC39333f.WHITE_70, EnumC39333f.WHITE_10);
        }
    }
}
