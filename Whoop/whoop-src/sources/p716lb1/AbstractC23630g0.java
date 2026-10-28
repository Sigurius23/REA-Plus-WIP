package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.ColumnItemEntrance;
import com.whoop.design.models.items.ColumnModel;
import com.whoop.design.models.items.Spacing;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.C21174w;
import java.util.List;
import java.util.Locale;
import jb1.AbstractC21537c;
import jb1.C21535a;
import l83.C23454a0;
import l83.InterfaceC23462h;
import n51.C26294a;
import n51.C26301h;
import n51.EnumC26295b;
import n51.EnumC26296c;
import p026b2.C2299e;
import p026b2.C2305k;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: lb1.g0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/design/models/items/Spacing;", "Ly3/f;", "i", "(Lcom/whoop/design/models/items/Spacing;)F", "Ljb1/a;", "a", "Ll83/h;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ljb1/a;", "columnNestedReducer", "Llb1/y0;", "b", "Llb1/y0;", "g", "()Llb1/y0;", "columnMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23630g0 {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC23462h f93762a = AbstractC30060g.m92088H(new C21174w(18));

    /* JADX INFO: renamed from: b */
    private static final C23743y0 f93763b = Function1.m68251a(new C23724v(25));

    /* JADX INFO: renamed from: lb1.g0$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93764a;

        static {
            int[] iArr = new int[Spacing.values().length];
            try {
                iArr[Spacing.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Spacing.EXTRA_SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Spacing.SMALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Spacing.MEDIUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Spacing.LARGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f93764a = iArr;
        }
    }

    /* JADX INFO: renamed from: lb1.g0$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93765w;

        public b(Function1 function1) {
            this.f93765w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93765w.invoke((ColumnModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m68772d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ColumnModel.class), new b(new C23724v(26)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a5  */
    /* JADX INFO: renamed from: e */
    public static final C26301h m68773e(ColumnModel model) {
        String upperCase;
        C26294a c26294a;
        EnumC26296c enumC26296c;
        AbstractC22676k.m65750j(model, "model");
        String id4 = model.getId();
        List<InterfaceC25312u> listM60545m = m68776h().m60545m(model.getItems());
        float fM68777i = m68777i(model.getSpacing());
        String horizontalAlignment = model.getHorizontalAlignment();
        EnumC26295b enumC26295b = null;
        if (horizontalAlignment != null) {
            upperCase = horizontalAlignment.toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        } else {
            upperCase = null;
        }
        C2305k c2305k = AbstractC22676k.m65745e(upperCase, "LEADING") ? C2299e.f9110M : AbstractC22676k.m65745e(upperCase, "TRAILING") ? C2299e.f9112O : C2299e.f9111N;
        ColumnItemEntrance itemEntrance = model.getItemEntrance();
        if (itemEntrance != null) {
            String type = itemEntrance.getType();
            if (type != null) {
                String upperCase2 = type.toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
                EnumC26296c[] enumC26296cArrValues = EnumC26296c.values();
                int length = enumC26296cArrValues.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        enumC26296c = null;
                        break;
                    }
                    enumC26296c = enumC26296cArrValues[i13];
                    if (AbstractC22676k.m65745e(enumC26296c.name(), upperCase2)) {
                        break;
                    }
                    i13++;
                }
                if (enumC26296c == null) {
                    enumC26296c = EnumC26296c.STAGGERED;
                }
            } else {
                enumC26296c = EnumC26296c.STAGGERED;
            }
            String animation = itemEntrance.getAnimation();
            if (animation != null) {
                String upperCase3 = animation.toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase3, "toUpperCase(...)");
                for (EnumC26295b enumC26295b2 : EnumC26295b.values()) {
                    if (AbstractC22676k.m65745e(enumC26295b2.name(), upperCase3)) {
                        enumC26295b = enumC26295b2;
                        break;
                    }
                }
                if (enumC26295b == null) {
                    enumC26295b = EnumC26295b.APPEAR_FROM_TOP;
                }
            } else {
                enumC26295b = EnumC26295b.APPEAR_FROM_TOP;
            }
            c26294a = new C26294a(enumC26296c, enumC26295b);
        } else {
            c26294a = null;
        }
        return new C26301h(id4, listM60545m, fM68777i, c2305k, c26294a, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C21535a m68774f() {
        return AbstractC21537c.m60555e(null, 1, null);
    }

    /* JADX INFO: renamed from: g */
    public static final C23743y0 m68775g() {
        return f93763b;
    }

    /* JADX INFO: renamed from: h */
    private static final C21535a m68776h() {
        return (C21535a) f93762a.getValue();
    }

    /* JADX INFO: renamed from: i */
    public static final float m68777i(Spacing spacing) {
        AbstractC22676k.m65750j(spacing, "<this>");
        int i13 = a.f93764a[spacing.ordinal()];
        if (i13 == 1) {
            return 0;
        }
        if (i13 == 2) {
            return 1 * 8;
        }
        if (i13 == 3) {
            return 2 * 8;
        }
        if (i13 == 4) {
            return 3 * 8;
        }
        if (i13 == 5) {
            return 4 * 8;
        }
        throw new NoWhenBranchMatchedException();
    }
}
