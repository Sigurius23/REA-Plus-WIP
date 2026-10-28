package rb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.collapsiblerow.CollapsibleRowModel;
import com.whoop.design.models.items.collapsiblerow.CollapsibleStatus;
import com.whoop.design.models.items.collapsiblerow.EndItem;
import com.whoop.design.models.items.collapsiblerow.EndItemFormat;
import gz0.AbstractC16315n0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Arrays;
import java.util.Locale;
import jb1.AbstractC21537c;
import jb1.C21535a;
import l83.C23454a0;
import l83.C23465k;
import l83.InterfaceC23462h;
import m83.C25271y;
import org.joda.time.DateTimeConstants;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23743y0;
import p716lb1.C23749z0;
import p716lb1.Function1;
import p720m91.C25292c0;
import p720m91.InterfaceC25312u;
import q83.AbstractC30060g;
import r61.C30985h;
import r70.C31050b;
import t01.C33257c;
import t01.C33265k;
import t01.EnumC33264j;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: rb1.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\t\u001a\u00020\b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0019\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a#\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001a\"\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u001a\u0010&\u001a\u00020!8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, m65681d2 = {"Lcom/whoop/design/models/items/collapsiblerow/CollapsibleRowModel;", "Lt01/c;", "n", "(Lcom/whoop/design/models/items/collapsiblerow/CollapsibleRowModel;)Lt01/c;", "Lcom/whoop/design/models/items/collapsiblerow/EndItem;", "", "isExpanded", "hasCollapsibleContent", "Lt01/k;", "m", "(Lcom/whoop/design/models/items/collapsiblerow/EndItem;ZZ)Lt01/k;", "", "formatted", "Ll83/k;", "l", "(Ljava/lang/String;)Ll83/k;", "", "seconds", "i", "(Ljava/lang/Float;)Ljava/lang/String;", "value", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(F)Ljava/lang/String;", "sliderValue", "unit", "g", "(Ljava/lang/Float;Ljava/lang/String;)Ljava/lang/String;", "Ljb1/a;", "a", "Ll83/h;", "k", "()Ljb1/a;", "collapsibleRowNestedReducer", "Llb1/y0;", "b", "Llb1/y0;", "j", "()Llb1/y0;", "collapsibleRowModelMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31191a {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC23462h f128512a = AbstractC30060g.m92088H(new C31050b(28));

    /* JADX INFO: renamed from: b */
    private static final C23743y0 f128513b = Function1.m68251a(new C30985h(7));

    /* JADX INFO: renamed from: rb1.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f128514a;

        static {
            int[] iArr = new int[EndItemFormat.values().length];
            try {
                iArr[EndItemFormat.TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EndItemFormat.STRAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EndItemFormat.DISTANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EndItemFormat.TEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f128514a = iArr;
        }
    }

    /* JADX INFO: renamed from: rb1.a$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f128515w;

        public b(p715kotlin.jvm.functions.Function1 function1) {
            this.f128515w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f128515w.invoke((CollapsibleRowModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m96129d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(CollapsibleRowModel.class), new b(new C30985h(8)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C33257c m96130e(CollapsibleRowModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m96139n(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C21535a m96131f() {
        return AbstractC21537c.m60555e(null, 1, null);
    }

    /* JADX INFO: renamed from: g */
    private static final String m96132g(Float f13, String str) {
        if (f13 == null) {
            return "--";
        }
        String str2 = String.format(Locale.ROOT, "%.1f", Arrays.copyOf(new Object[]{f13}, 1));
        if (str == null) {
            str = "";
        }
        return str2.concat(str);
    }

    /* JADX INFO: renamed from: h */
    private static final String m96133h(float f13) {
        return String.format(Locale.ROOT, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f13)}, 1));
    }

    /* JADX INFO: renamed from: i */
    public static final String m96134i(Float f13) {
        if (f13 == null) {
            return "--";
        }
        int iFloatValue = (int) f13.floatValue();
        int i13 = iFloatValue / DateTimeConstants.SECONDS_PER_HOUR;
        int i14 = (iFloatValue % DateTimeConstants.SECONDS_PER_HOUR) / 60;
        Locale locale = Locale.ROOT;
        return i13 + ":" + String.format(locale, "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i14)}, 1)) + ":" + String.format(locale, "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iFloatValue % 60)}, 1));
    }

    /* JADX INFO: renamed from: j */
    public static final C23743y0 m96135j() {
        return f128513b;
    }

    /* JADX INFO: renamed from: k */
    private static final C21535a m96136k() {
        return (C21535a) f128512a.getValue();
    }

    /* JADX INFO: renamed from: l */
    public static final C23465k m96137l(String formatted) {
        AbstractC22676k.m65750j(formatted, "formatted");
        if (formatted.equals("--")) {
            return new C23465k(formatted, null);
        }
        return (formatted.length() < 4 || formatted.charAt(formatted.length() - 3) != ':') ? new C23465k(formatted, null) : new C23465k(AbstractC39414r.m125879X(3, formatted), AbstractC39414r.m125867M0(3, formatted));
    }

    /* JADX INFO: renamed from: m */
    public static final C33265k m96138m(EndItem endItem, boolean z4, boolean z13) {
        String strM96133h;
        AbstractC22676k.m65750j(endItem, "<this>");
        EnumC33264j enumC33264j = z4 ? EnumC33264j.FILLED_LIGHT : EnumC33264j.MUTED;
        boolean z14 = !z4 && z13;
        int i13 = a.f128514a[endItem.getFormat().ordinal()];
        if (i13 == 1) {
            C23465k c23465kM96137l = m96137l(m96134i(endItem.getSliderValue()));
            return new C33265k((String) c23465kM96137l.f92937w, null, enumC33264j, z14, false, (String) c23465kM96137l.f92938x, 16, null);
        }
        if (i13 == 2) {
            Float sliderValue = endItem.getSliderValue();
            if (sliderValue == null || (strM96133h = m96133h(sliderValue.floatValue())) == null) {
                strM96133h = "--";
            }
            return new C33265k(strM96133h, null, enumC33264j, z14, false, null, 48, null);
        }
        if (i13 == 3) {
            return new C33265k(m96132g(endItem.getSliderValue(), endItem.getUnit()), null, enumC33264j, z14, false, null, 48, null);
        }
        if (i13 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        String value = endItem.getValue();
        if (value == null) {
            value = "";
        }
        return new C33265k(value, AbstractC16315n0.m46377b(endItem.getIcon()), EnumC33264j.MUTED, true, true, null, 32, null);
    }

    /* JADX INFO: renamed from: n */
    private static final C33257c m96139n(CollapsibleRowModel collapsibleRowModel) {
        InterfaceC25312u interfaceC25312u;
        DesignSystemModel body;
        boolean z4 = collapsibleRowModel.getStatus() == CollapsibleStatus.EXPANDED;
        boolean z13 = !collapsibleRowModel.getCollapsibleContent().isEmpty();
        String title = collapsibleRowModel.getTitle();
        DesignSystemModel leadingItem = collapsibleRowModel.getLeadingItem();
        InterfaceC25312u interfaceC25312uM60544l = null;
        if (leadingItem != null) {
            InterfaceC25312u interfaceC25312uM60544l2 = m96136k().m60544l(leadingItem);
            if (interfaceC25312uM60544l2 == null) {
                interfaceC25312uM60544l2 = new C25292c0(0.0f, 0.0f, 3, null);
            }
            interfaceC25312u = interfaceC25312uM60544l2;
        } else {
            interfaceC25312u = null;
        }
        if (!z4 && (body = collapsibleRowModel.getBody()) != null) {
            interfaceC25312uM60544l = m96136k().m60544l(body);
        }
        return new C33257c(title, z4, interfaceC25312u, interfaceC25312uM60544l, z4 ? m96136k().m60545m(collapsibleRowModel.getCollapsibleContent()) : C25271y.f99162w, m96138m(collapsibleRowModel.getEndItem(), z4, z13), collapsibleRowModel.getEndItem().getFormat() == EndItemFormat.TEXT, z13);
    }
}
