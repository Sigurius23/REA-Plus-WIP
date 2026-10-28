package uc1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.AxisSize;
import com.whoop.design.models.items.AxisSizeType;
import com.whoop.design.models.items.CrossAxisAlignment;
import com.whoop.design.models.items.MainAxisAlignment;
import com.whoop.design.models.items.Spacing;
import com.whoop.design.models.items.SpacingInsets;
import com.whoop.design.models.items.whooprow.WhoopRowItemModel;
import com.whoop.design.models.items.whooprow.WhoopRowModel;
import java.util.ArrayList;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import l83.C23454a0;
import l83.InterfaceC23462h;
import p026b2.C2299e;
import p026b2.C2305k;
import p291l0.C22976l1;
import p291l0.InterfaceC22973k1;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.AbstractC23630g0;
import p716lb1.C23743y0;
import p716lb1.C23749z0;
import p716lb1.Function1;
import p720m91.InterfaceC25312u;
import q83.AbstractC30060g;
import s81.C32261d;
import s81.C32265h;
import s81.EnumC32258a;
import s81.EnumC32259b;
import s81.InterfaceC32262e;
import u71.C34569c;
import u91.C34656a;

/* JADX INFO: renamed from: uc1.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\"\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/design/models/items/AxisSize;", "Ls81/e;", "f", "(Lcom/whoop/design/models/items/AxisSize;)Ls81/e;", "Lcom/whoop/design/models/items/SpacingInsets;", "Ll0/k1;", "g", "(Lcom/whoop/design/models/items/SpacingInsets;)Ll0/k1;", "Ljb1/a;", "a", "Ll83/h;", "e", "()Ljb1/a;", "whoopRowNestedReducer", "Llb1/y0;", "b", "Llb1/y0;", "d", "()Llb1/y0;", "whoopRowMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34760a {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC23462h f146420a = AbstractC30060g.m92088H(new C34656a(6));

    /* JADX INFO: renamed from: b */
    private static final C23743y0 f146421b = Function1.m68251a(new C34569c(11));

    /* JADX INFO: renamed from: uc1.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f146422a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f146423b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f146424c;

        static {
            int[] iArr = new int[AxisSizeType.values().length];
            try {
                iArr[AxisSizeType.HUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AxisSizeType.FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f146422a = iArr;
            int[] iArr2 = new int[MainAxisAlignment.values().length];
            try {
                iArr2[MainAxisAlignment.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[MainAxisAlignment.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[MainAxisAlignment.START.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f146423b = iArr2;
            int[] iArr3 = new int[CrossAxisAlignment.values().length];
            try {
                iArr3[CrossAxisAlignment.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[CrossAxisAlignment.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[CrossAxisAlignment.STRETCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[CrossAxisAlignment.CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            f146424c = iArr3;
        }
    }

    /* JADX INFO: renamed from: uc1.a$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f146425w;

        public b(p715kotlin.jvm.functions.Function1 function1) {
            this.f146425w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f146425w.invoke((WhoopRowModel) it);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C23743y0 m109761d() {
        return f146421b;
    }

    /* JADX INFO: renamed from: e */
    private static final C21535a m109762e() {
        return (C21535a) f146420a.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX INFO: renamed from: f */
    private static final InterfaceC32262e m109763f(AxisSize axisSize) {
        float fFloatValue;
        Double weight;
        Float f13 = null;
        AxisSizeType type = axisSize != null ? axisSize.getType() : null;
        int i13 = type == null ? -1 : a.f146422a[type.ordinal()];
        if (i13 != -1) {
            if (i13 == 1) {
                return InterfaceC32262e.b.f133522a;
            }
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        if (axisSize == null || (weight = axisSize.getWeight()) == null) {
            fFloatValue = 1.0f;
        } else {
            Float fValueOf = Float.valueOf((float) weight.doubleValue());
            float fFloatValue2 = fValueOf.floatValue();
            if (Math.abs(fFloatValue2) <= Float.MAX_VALUE && fFloatValue2 > 0.0f) {
                f13 = fValueOf;
            }
            if (f13 != null) {
                fFloatValue = f13.floatValue();
            } else {
                fFloatValue = 1.0f;
            }
        }
        return new InterfaceC32262e.a(fFloatValue);
    }

    /* JADX INFO: renamed from: g */
    private static final InterfaceC22973k1 m109764g(SpacingInsets spacingInsets) {
        Spacing bottom;
        Spacing trailing;
        Spacing top;
        Spacing leading;
        return new C22976l1((spacingInsets == null || (leading = spacingInsets.getLeading()) == null) ? 0 : AbstractC23630g0.m68777i(leading), (spacingInsets == null || (top = spacingInsets.getTop()) == null) ? 0 : AbstractC23630g0.m68777i(top), (spacingInsets == null || (trailing = spacingInsets.getTrailing()) == null) ? 0 : AbstractC23630g0.m68777i(trailing), (spacingInsets == null || (bottom = spacingInsets.getBottom()) == null) ? 0 : AbstractC23630g0.m68777i(bottom));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m109765h(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(WhoopRowModel.class), new b(new C34569c(12)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C32265h m109766i(WhoopRowModel model) {
        EnumC32258a enumC32258a;
        C2305k c2305k;
        EnumC32258a enumC32258a2;
        EnumC32259b enumC32259b;
        InterfaceC25312u interfaceC25312uM60544l;
        AbstractC22676k.m65750j(model, "model");
        String id4 = model.getId();
        List<WhoopRowItemModel> items = model.getItems();
        ArrayList arrayList = new ArrayList();
        for (WhoopRowItemModel whoopRowItemModel : items) {
            DesignSystemModel item = whoopRowItemModel.getItem();
            C32261d c32261d = (item == null || (interfaceC25312uM60544l = m109762e().m60544l(item)) == null) ? null : new C32261d(interfaceC25312uM60544l, m109763f(whoopRowItemModel.getWidth()));
            if (c32261d != null) {
                arrayList.add(c32261d);
            }
        }
        Spacing spacing = model.getSpacing();
        float fM68777i = spacing != null ? AbstractC23630g0.m68777i(spacing) : 0;
        AxisSizeType mainAxisSize = model.getMainAxisSize();
        int i13 = mainAxisSize == null ? -1 : a.f146422a[mainAxisSize.ordinal()];
        if (i13 == -1) {
            enumC32258a = EnumC32258a.FILL;
        } else if (i13 != 1) {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            enumC32258a = EnumC32258a.FILL;
        } else {
            enumC32258a = EnumC32258a.HUG;
        }
        MainAxisAlignment mainAxisAlignment = model.getMainAxisAlignment();
        int i14 = mainAxisAlignment == null ? -1 : a.f146423b[mainAxisAlignment.ordinal()];
        if (i14 == -1) {
            c2305k = C2299e.f9110M;
        } else if (i14 == 1) {
            c2305k = C2299e.f9111N;
        } else if (i14 != 2) {
            if (i14 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            c2305k = C2299e.f9110M;
        } else {
            c2305k = C2299e.f9112O;
        }
        AxisSizeType crossAxisSize = model.getCrossAxisSize();
        int i15 = crossAxisSize == null ? -1 : a.f146422a[crossAxisSize.ordinal()];
        if (i15 == -1 || i15 == 1) {
            enumC32258a2 = EnumC32258a.HUG;
        } else {
            if (i15 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            enumC32258a2 = EnumC32258a.FILL;
        }
        CrossAxisAlignment crossAxisAlignment = model.getCrossAxisAlignment();
        int i16 = crossAxisAlignment == null ? -1 : a.f146424c[crossAxisAlignment.ordinal()];
        if (i16 == -1) {
            enumC32259b = EnumC32259b.CENTER;
        } else if (i16 == 1) {
            enumC32259b = EnumC32259b.START;
        } else if (i16 == 2) {
            enumC32259b = EnumC32259b.END;
        } else if (i16 != 3) {
            if (i16 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            enumC32259b = EnumC32259b.CENTER;
        } else {
            enumC32259b = EnumC32259b.STRETCH;
        }
        return new C32265h(id4, arrayList, fM68777i, enumC32258a, c2305k, enumC32258a2, enumC32259b, m109764g(model.getPadding()), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C21535a m109767j() {
        return AbstractC21537c.m60555e(null, 1, null);
    }
}
