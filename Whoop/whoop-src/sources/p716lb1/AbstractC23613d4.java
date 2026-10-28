package p716lb1;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.CardIconButtonModel;
import com.whoop.design.models.items.SecondaryButtonModel;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.DismissEventModel;
import com.whoop.whoopaction.domain.models.Action;
import gb1.AbstractC15673b0;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import j02.AbstractC21170u;
import j02.C21166s;
import k81.EnumC22291a;
import l83.C23454a0;
import ny0.AbstractC27249e;
import ny0.C27256h;
import ny0.C27264l;
import ny0.C27273p0;
import ny0.EnumC27240b;
import ny0.EnumC27243c;
import ny0.EnumC27254g;
import ny0.EnumC27267m0;
import ny0.EnumC27272p;
import p636y3.C39174f;
import p712j91.InterfaceC21430b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import y71.C39274g;

/* JADX INFO: renamed from: lb1.d4 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u0010\u001a\u00020\u000f*\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0011\u0010\u0014\u001a\u00020\u0013*\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0016*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0016*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0019\u0010\u0018\u001a\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0015\u0010\u001d\u001a\u0004\u0018\u00010\n*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u001d\u0010\u001e\"\u001a\u0010$\u001a\u00020\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, m65681d2 = {"", "Lny0/c;", "r", "(Ljava/lang/String;)Lny0/c;", "Lcom/whoop/design/models/items/SecondaryButtonModel;", "model", "Lny0/p0;", "p", "(Lcom/whoop/design/models/items/SecondaryButtonModel;)Lny0/p0;", "Lny0/m0;", "Ly81/f;", "s", "(Lny0/m0;)Ly81/f;", "Lcom/whoop/design/models/items/CardButtonModel;", "backgroundStyle", "Lny0/h;", "k", "(Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;)Lny0/h;", "Lcom/whoop/design/models/items/CardIconButtonModel;", "Lny0/l;", "m", "(Lcom/whoop/design/models/items/CardIconButtonModel;)Lny0/l;", "Li91/a;", "e", "(Ljava/lang/String;)Li91/a;", "o", "Lj91/b;", "f", "(Ljava/lang/String;)Lj91/b;", "q", "(Ljava/lang/String;)Ly81/f;", "Llb1/y0;", "a", "Llb1/y0;", "n", "()Llb1/y0;", "buttonMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23613d4 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93719a = Function1.m68251a(new C23740x3(11));

    /* JADX INFO: renamed from: lb1.d4$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93720a;

        static {
            int[] iArr = new int[EnumC27267m0.values().length];
            try {
                iArr[EnumC27267m0.HIGHLIGHTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC27267m0.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC27267m0.FILLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f93720a = iArr;
        }
    }

    /* JADX INFO: renamed from: lb1.d4$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93721w;

        public b(Function1 function1) {
            this.f93721w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93721w.invoke((SecondaryButtonModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.d4$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93722w;

        public c(Function1 function1) {
            this.f93722w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93722w.invoke((CardButtonModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.d4$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93723w;

        public d(Function1 function1) {
            this.f93723w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93723w.invoke((CardIconButtonModel) it);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: e */
    public static final AbstractC18247a m68655e(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1104367997:
                if (!str.equals("ADVANCED_LABS")) {
                    return null;
                }
                break;
            case -649588961:
                if (!str.equals("CITL_NEW")) {
                    return null;
                }
                break;
            case 78406:
                if (!str.equals("ONE")) {
                    return null;
                }
                break;
            case 79068:
                if (!str.equals("PDP")) {
                    return null;
                }
                break;
            case 2068830:
                if (!str.equals("CITL")) {
                    return null;
                }
                break;
            case 2336508:
                if (str.equals("LIFE")) {
                    return AbstractC18249c.m52570h(AbstractC15673b0.m43989I0());
                }
                return null;
            case 2451679:
                if (str.equals("PEAK")) {
                    return AbstractC18249c.m52575m(EnumC39333f.STRAIN_ZONE_1);
                }
                return null;
            case 465877411:
                if (str.equals("AI_COACH")) {
                    return AbstractC18249c.m52570h(AbstractC15673b0.m43976C());
                }
                return null;
            default:
                return null;
        }
        return AbstractC18249c.m52575m(EnumC39333f.BRAND_WHITE);
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC21430b m68656f(String str) {
        if (AbstractC22676k.m65745e(str, "AI_COACH")) {
            return p712j91.Function1.m60318a(AbstractC15673b0.m43976C());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m68657g(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        C23740x3 c23740x3 = new C23740x3(12);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(SecondaryButtonModel.class), new b(c23740x3));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(CardButtonModel.class), new c(new C23740x3(13)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(CardIconButtonModel.class), new d(new C23740x3(14)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C27273p0 m68658h(SecondaryButtonModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68666p(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C27256h m68659i(CardButtonModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68662l(model, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C27264l m68660j(CardIconButtonModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68663m(model);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0096  */
    /* JADX INFO: renamed from: k */
    public static final C27256h m68661k(CardButtonModel cardButtonModel, String str) {
        EnumC27272p enumC27272p;
        C9598e c9598e;
        EnumC27254g enumC27254g;
        C39174f c39174f;
        EnumC27240b enumC27240b;
        EnumC27254g enumC27254g2;
        AbstractC22676k.m65750j(cardButtonModel, "<this>");
        String id4 = cardButtonModel.getId();
        TextResource title = cardButtonModel.getTitle();
        EnumC16313m0 enumC16313m0M46377b = AbstractC16315n0.m46377b(cardButtonModel.getIcon());
        AbstractC18247a abstractC18247aM68655e = m68655e(str);
        String cardName = cardButtonModel.getCardName();
        String featureType = cardButtonModel.getFeatureType();
        String style = cardButtonModel.getStyle();
        EnumC27272p enumC27272p2 = EnumC27272p.DEFAULT;
        EnumC27272p[] enumC27272pArrValues = EnumC27272p.values();
        int length = enumC27272pArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC27272p = null;
                break;
            }
            enumC27272p = enumC27272pArrValues[i13];
            if (AbstractC22676k.m65745e(enumC27272p.name(), style)) {
                break;
            }
            i13++;
        }
        EnumC27272p enumC27272p3 = enumC27272p == null ? enumC27272p2 : enumC27272p;
        C9598e destination = cardButtonModel.getDestination();
        if (destination == null) {
            c9598e = new C9598e(null, null, null, 7, null);
        } else {
            c9598e = destination;
        }
        int i14 = 0;
        Action action = cardButtonModel.getAction();
        AnalyticEventModel analyticEvent = cardButtonModel.getAnalyticEvent();
        String size = cardButtonModel.getSize();
        if (size != null) {
            enumC27254g = EnumC27254g.COMPACT;
            EnumC27254g[] enumC27254gArrValues = EnumC27254g.values();
            int length2 = enumC27254gArrValues.length;
            while (true) {
                if (i14 >= length2) {
                    enumC27254g2 = null;
                    break;
                }
                enumC27254g2 = enumC27254gArrValues[i14];
                if (AbstractC22676k.m65745e(enumC27254g2.name(), size)) {
                    break;
                }
                i14++;
            }
            if (enumC27254g2 != null) {
                enumC27254g = enumC27254g2;
            }
            if (enumC27254g == null) {
                enumC27254g = EnumC27254g.COMPACT;
            }
        } else {
            enumC27254g = EnumC27254g.COMPACT;
        }
        EnumC27254g enumC27254g3 = enumC27254g;
        String cornerRadius = cardButtonModel.getCornerRadius();
        if (cornerRadius != null) {
            EnumC27240b enumC27240b2 = EnumC27240b.MEDIUM;
            EnumC27240b[] enumC27240bArrValues = EnumC27240b.values();
            int length3 = enumC27240bArrValues.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length3) {
                    enumC27240b = null;
                    break;
                }
                enumC27240b = enumC27240bArrValues[i15];
                if (AbstractC22676k.m65745e(enumC27240b.name(), cornerRadius)) {
                    break;
                }
                i15++;
            }
            if (enumC27240b != null) {
                enumC27240b2 = enumC27240b;
            }
            c39174f = new C39174f(AbstractC27249e.m82129l(enumC27240b2));
        } else {
            c39174f = null;
        }
        EnumC27243c enumC27243cM68668r = m68668r(cardButtonModel.getIconConfiguration());
        AnyModal modal = cardButtonModel.getModal();
        DismissEventModel dismissEvent = cardButtonModel.getDismissEvent();
        C21166s c21166sM59413a = dismissEvent != null ? AbstractC21170u.m59413a(dismissEvent) : null;
        Boolean boolIsEnabled = cardButtonModel.isEnabled();
        return new C27256h(title, enumC16313m0M46377b, abstractC18247aM68655e, m68667q(str), cardName, featureType, enumC27272p3, c9598e, action, analyticEvent, enumC27254g3, null, c39174f, false, false, id4, boolIsEnabled != null ? boolIsEnabled.booleanValue() : true, false, null, modal, c21166sM59413a, enumC27243cM68668r, cardButtonModel.getGenericInteraction(), m68656f(str), m68665o(str), 419840, null);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ C27256h m68662l(CardButtonModel cardButtonModel, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = cardButtonModel.getBackgroundStyle();
        }
        return m68661k(cardButtonModel, str);
    }

    /* JADX INFO: renamed from: m */
    public static final C27264l m68663m(CardIconButtonModel cardIconButtonModel) {
        C9598e c9598e;
        AbstractC22676k.m65750j(cardIconButtonModel, "<this>");
        String id4 = cardIconButtonModel.getId();
        EnumC16313m0 enumC16313m0M46377b = AbstractC16315n0.m46377b(cardIconButtonModel.getIcon());
        if (enumC16313m0M46377b == null) {
            enumC16313m0M46377b = EnumC16313m0.ADD;
        }
        EnumC16313m0 enumC16313m0 = enumC16313m0M46377b;
        C9598e destination = cardIconButtonModel.getDestination();
        if (destination == null) {
            c9598e = new C9598e(null, null, null, 7, null);
        } else {
            c9598e = destination;
        }
        Boolean boolIsEnabled = cardIconButtonModel.isEnabled();
        return new C27264l(id4, enumC16313m0, c9598e, boolIsEnabled != null ? boolIsEnabled.booleanValue() : true, null, null, 48, null);
    }

    /* JADX INFO: renamed from: n */
    public static final C23743y0 m68664n() {
        return f93719a;
    }

    /* JADX INFO: renamed from: o */
    public static final AbstractC18247a m68665o(String str) {
        if (AbstractC22676k.m65745e(str, "AI_COACH")) {
            return AbstractC18249c.m52571i(p712j91.Function1.m60318a(AbstractC15673b0.m43976C()), 0.9f);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static final C27273p0 m68666p(SecondaryButtonModel model) {
        EnumC22291a enumC22291a;
        Integer numM46376a;
        AbstractC22676k.m65750j(model, "model");
        String alignment = model.getAlignment();
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (alignment == null) {
            enumC22291a = null;
            break;
        }
        EnumC22291a[] enumC22291aArrValues = EnumC22291a.values();
        int length = enumC22291aArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC22291a = null;
                break;
            }
            enumC22291a = enumC22291aArrValues[i13];
            if (AbstractC22676k.m65745e(enumC22291a.name(), alignment)) {
                break;
            }
            i13++;
        }
        TextResource text = model.getText();
        C9598e action = model.getAction();
        String icon = model.getIcon();
        C39274g c39274g = (icon == null || (numM46376a = AbstractC16315n0.m46376a(icon)) == null) ? null : new C39274g(numM46376a.intValue(), objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0);
        EnumC39333f enumC39333fM68669s = m68669s(model.getStyle());
        AnyModal modal = model.getModal();
        AnalyticEventModel analyticEvent = model.getAnalyticEvent();
        DismissEventModel dismissEvent = model.getDismissEvent();
        C21166s c21166sM59413a = dismissEvent != null ? AbstractC21170u.m59413a(dismissEvent) : null;
        EnumC22291a enumC22291a2 = enumC22291a == null ? EnumC22291a.LEADING : enumC22291a;
        boolean z4 = enumC22291a == EnumC22291a.LEADING;
        EnumC27267m0 style = model.getStyle();
        Boolean boolIsEnabled = model.isEnabled();
        return new C27273p0(text, action, null, c39274g, enumC39333fM68669s, null, false, modal, analyticEvent, c21166sM59413a, enumC22291a2, z4, style, boolIsEnabled != null ? boolIsEnabled.booleanValue() : true, 100, null);
    }

    /* JADX INFO: renamed from: q */
    public static final EnumC39333f m68667q(String str) {
        if (AbstractC22676k.m65745e(str, "AI_COACH")) {
            return EnumC39333f.BRAND_WHITE;
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x005b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x005c A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        if (r0.equals("TRAILING_ICON") == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        return ny0.EnumC27243c.TRAILING_ICON;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0.equals("LEADING") == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        if (r0.equals("LEADING_ICON") == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        return ny0.EnumC27243c.LEADING_ICON;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (r0.equals("TRAILING") == false) goto L21;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final ny0.EnumC27243c m68668r(java.lang.String r6) {
        /*
            if (r6 != 0) goto L5
            ny0.c r6 = ny0.EnumC27243c.LEADING_ICON
            return r6
        L5:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r6.toUpperCase(r0)
            java.lang.String r1 = "toUpperCase(...)"
            p715kotlin.jvm.internal.AbstractC22676k.m65749i(r0, r1)
            int r1 = r0.hashCode()
            switch(r1) {
                case 253056562: goto L36;
                case 768341734: goto L2d;
                case 1897500348: goto L21;
                case 2058686492: goto L18;
                default: goto L17;
            }
        L17:
            goto L3e
        L18:
            java.lang.String r1 = "TRAILING"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2a
            goto L3e
        L21:
            java.lang.String r1 = "TRAILING_ICON"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2a
            goto L3e
        L2a:
            ny0.c r6 = ny0.EnumC27243c.TRAILING_ICON
            return r6
        L2d:
            java.lang.String r1 = "LEADING"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5d
            goto L3e
        L36:
            java.lang.String r1 = "LEADING_ICON"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5d
        L3e:
            ny0.c r0 = ny0.EnumC27243c.LEADING_ICON
            ny0.c[] r1 = ny0.EnumC27243c.values()
            int r2 = r1.length
            r3 = 0
        L46:
            if (r3 >= r2) goto L58
            r4 = r1[r3]
            java.lang.String r5 = r4.name()
            boolean r5 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r5, r6)
            if (r5 == 0) goto L55
            goto L59
        L55:
            int r3 = r3 + 1
            goto L46
        L58:
            r4 = 0
        L59:
            if (r4 != 0) goto L5c
            return r0
        L5c:
            return r4
        L5d:
            ny0.c r6 = ny0.EnumC27243c.LEADING_ICON
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p716lb1.AbstractC23613d4.m68668r(java.lang.String):ny0.c");
    }

    /* JADX INFO: renamed from: s */
    public static final EnumC39333f m68669s(EnumC27267m0 enumC27267m0) {
        AbstractC22676k.m65750j(enumC27267m0, "<this>");
        int i13 = a.f93720a[enumC27267m0.ordinal()];
        if (i13 == 1) {
            return EnumC39333f.COACH_BLUE;
        }
        if (i13 != 2 && i13 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return EnumC39333f.BRAND_WHITE;
    }
}
