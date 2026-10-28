package p716lb1;

import b91.EnumC2888c;
import c41.C4092p2;
import c41.EnumC4078n2;
import c41.EnumC4085o2;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.IconGradient;
import com.whoop.design.models.IconSize;
import com.whoop.design.models.InfoCalloutTileAnalyticEvents;
import com.whoop.design.models.InfoCalloutTileItemsAlignment;
import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.items.InfoCalloutStyle;
import com.whoop.design.util.TextResource;
import com.whoop.whoopaction.domain.models.Action;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import m83.AbstractC25267u;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.C27273p0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.C25306o;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import rz0.EnumC31927f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: lb1.j2 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0007\u001a\u00020\u0006*\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\u000b\u001a\u00020\n*\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/design/models/InfoCalloutTileModel;", "model", "Lc41/p2;", "b", "(Lcom/whoop/design/models/InfoCalloutTileModel;)Lc41/p2;", "Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;", "Lc41/o2;", "d", "(Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;)Lc41/o2;", "Lcom/whoop/design/models/IconGradient;", "Lc41/n2;", "c", "(Lcom/whoop/design/models/IconGradient;)Lc41/n2;", "Llb1/i2;", "a", "(Lcom/whoop/design/models/InfoCalloutTileModel;)Llb1/i2;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23653j2 {

    /* JADX INFO: renamed from: lb1.j2$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93815a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f93816b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f93817c;

        static {
            int[] iArr = new int[InfoCalloutTileItemsAlignment.values().length];
            try {
                iArr[InfoCalloutTileItemsAlignment.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InfoCalloutTileItemsAlignment.LEADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f93815a = iArr;
            int[] iArr2 = new int[IconGradient.values().length];
            try {
                iArr2[IconGradient.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[IconGradient.AI_COACH.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f93816b = iArr2;
            int[] iArr3 = new int[InfoCalloutStyle.values().length];
            try {
                iArr3[InfoCalloutStyle.IMPACT_DETAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[InfoCalloutStyle.NEUTRAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[InfoCalloutStyle.CONCERNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[InfoCalloutStyle.ALERTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[InfoCalloutStyle.POSITIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[InfoCalloutStyle.SUBTLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[InfoCalloutStyle.MUTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[InfoCalloutStyle.AI.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            f93817c = iArr3;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final C23646i2 m68921a(InfoCalloutTileModel model) {
        EnumC16313m0 enumC16313m0;
        EnumC16313m0 enumC16313m1;
        EnumC16313m0 enumC16313m2;
        EnumC16313m0 enumC16313m3;
        EnumC16313m0 enumC16313m4;
        AbstractC22676k.m65750j(model, "model");
        boolean zM65745e = AbstractC22676k.m65745e(model.getUseFallbackIcon(), Boolean.FALSE);
        switch (a.f93817c[model.getStyle().ordinal()]) {
            case 1:
            case 2:
                EnumC16313m0 icon = model.getIcon();
                if (icon == null) {
                    enumC16313m0 = !zM65745e ? EnumC16313m0.TINY_INFORMATION : null;
                } else {
                    enumC16313m0 = icon;
                }
                return new C23646i2(enumC16313m0, EnumC39333f.NEUTRAL_15, EnumC39333f.RECOVERY, null, null, 24, null);
            case 3:
                EnumC16313m0 icon2 = model.getIcon();
                if (icon2 == null) {
                    enumC16313m1 = !zM65745e ? EnumC16313m0.TINY_ATTENTION : null;
                } else {
                    enumC16313m1 = icon2;
                }
                return new C23646i2(enumC16313m1, EnumC39333f.ACCENT_NEGATIVE_TREND_15, EnumC39333f.ACCENT_NEGATIVE_TREND, null, null, 24, null);
            case 4:
                EnumC16313m0 icon3 = model.getIcon();
                if (icon3 == null) {
                    enumC16313m2 = !zM65745e ? EnumC16313m0.TINY_ATTENTION : null;
                } else {
                    enumC16313m2 = icon3;
                }
                return new C23646i2(enumC16313m2, EnumC39333f.ACCENT_ALERT_TREND_15, EnumC39333f.ACCENT_ALERT, null, null, 24, null);
            case 5:
                EnumC16313m0 icon4 = model.getIcon();
                if (icon4 == null) {
                    enumC16313m3 = !zM65745e ? EnumC16313m0.TINY_CHECKMARK : null;
                } else {
                    enumC16313m3 = icon4;
                }
                return new C23646i2(enumC16313m3, EnumC39333f.ACCENT_POSITIVE_TREND_15, EnumC39333f.ACCENT_POSITIVE_TREND, null, null, 24, null);
            case 6:
                EnumC16313m0 icon5 = model.getIcon();
                if (icon5 != null) {
                    enumC16313m4 = icon5;
                } else if (zM65745e) {
                    enumC16313m4 = null;
                } else {
                    icon5 = EnumC16313m0.TINY_INFORMATION;
                    enumC16313m4 = icon5;
                }
                return new C23646i2(enumC16313m4, EnumC39333f.WHITE_5, EnumC39333f.WHITE_70, null, null, 24, null);
            case 7:
                return new C23646i2(model.getIcon(), EnumC39333f.BLACK_10, EnumC39333f.BLACK_70, null, null, 24, null);
            case 8:
                return new C23646i2(model.getIcon(), EnumC39333f.WHITE_10, EnumC39333f.WHITE_70, EnumC31927f.AI_GRADIENT, EnumC39333f.BRAND_WHITE);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C4092p2 m68922b(InfoCalloutTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        C23646i2 c23646i2M68921a = m68921a(model);
        boolean z4 = true;
        C21535a c21535aM60555e = AbstractC21537c.m60555e(null, 1, null);
        EnumC16313m0 icon = c23646i2M68921a.getIcon();
        IconSize iconSize = model.getIconSize();
        if (iconSize == null) {
            iconSize = IconSize.MEDIUM;
        }
        float fM68642a = AbstractC23611d2.m68642a(iconSize);
        EnumC4078n2 enumC4078n2M68923c = m68923c(model.getIconGradient());
        TextResource title = model.getTitle();
        TextResource description = model.getDescription();
        EnumC2888c descriptionTypography = model.getDescriptionTypography();
        if (descriptionTypography == null) {
            descriptionTypography = EnumC2888c.B2;
        }
        EnumC2888c enumC2888c = descriptionTypography;
        EnumC39333f backgroundColor = c23646i2M68921a.getBackgroundColor();
        EnumC39333f contentColor = c23646i2M68921a.getContentColor();
        EnumC31927f tileStyle = c23646i2M68921a.getTileStyle();
        EnumC39333f dismissIconColor = c23646i2M68921a.getDismissIconColor();
        String componentDismissalId = model.getComponentDismissalId();
        Action dismissAction = model.getDismissAction();
        InfoCalloutTileAnalyticEvents analyticEvents = model.getAnalyticEvents();
        AnalyticEventModel dismiss = analyticEvents != null ? analyticEvents.getDismiss() : null;
        String componentDismissalId2 = model.getComponentDismissalId();
        if ((componentDismissalId2 == null || AbstractC39414r.m125890i0(componentDismissalId2)) && model.getDismissAction() == null) {
            z4 = false;
        }
        boolean z13 = z4;
        List<DesignSystemModel> items = model.getItems();
        if (items == null) {
            items = C25271y.f99162w;
        }
        List<C25306o> listM60536k = C21535a.m60536k(c21535aM60555e, items, null, 2, null);
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM60536k, 10));
        for (C25306o c25306oM74314b : listM60536k) {
            if (c25306oM74314b.getState() instanceof C27273p0) {
                InterfaceC25312u state = c25306oM74314b.getState();
                AbstractC22676k.m65748h(state, "null cannot be cast to non-null type com.whoop.design.atomic.atom.button.SecondaryButtonViewState");
                C27273p0 c27273p0 = (C27273p0) state;
                c25306oM74314b = C25306o.m74314b(c25306oM74314b, c27273p0.m82257a((15359 & 1) != 0 ? c27273p0.text : null, (15359 & 2) != 0 ? c27273p0.navigationAction : null, (15359 & 4) != 0 ? c27273p0.leftIcon : null, (15359 & 8) != 0 ? c27273p0.rightIcon : null, (15359 & 16) != 0 ? c27273p0.tint : null, (15359 & 32) != 0 ? c27273p0.tintGradient : null, (15359 & 64) != 0 ? c27273p0.useTextPadding : false, (15359 & 128) != 0 ? c27273p0.actionArgument : null, (15359 & 256) != 0 ? c27273p0.analyticEvent : null, (15359 & 512) != 0 ? c27273p0.dismissEvent : null, (15359 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c27273p0.alignment : null, (15359 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c27273p0.trimStartGutter : false, (15359 & 4096) != 0 ? c27273p0.style : null, (15359 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c27273p0.enabled : false), null, 2, null);
            }
            arrayList.add(c25306oM74314b);
        }
        return new C4092p2(icon, fM68642a, enumC4078n2M68923c, title, description, enumC2888c, backgroundColor, null, contentColor, null, null, tileStyle, dismissIconColor, z13, componentDismissalId, dismissAction, dismiss, arrayList, m68924d(model.getItemsAlignment()), model.getAnalyticsProperties(), 1664, null);
    }

    /* JADX INFO: renamed from: c */
    private static final EnumC4078n2 m68923c(IconGradient iconGradient) {
        int i13 = iconGradient == null ? -1 : a.f93816b[iconGradient.ordinal()];
        if (i13 == -1 || i13 == 1) {
            return EnumC4078n2.NONE;
        }
        if (i13 == 2) {
            return EnumC4078n2.AI_COACH;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: d */
    private static final EnumC4085o2 m68924d(InfoCalloutTileItemsAlignment infoCalloutTileItemsAlignment) {
        int i13 = infoCalloutTileItemsAlignment == null ? -1 : a.f93815a[infoCalloutTileItemsAlignment.ordinal()];
        if (i13 == -1 || i13 == 1) {
            return EnumC4085o2.TEXT;
        }
        if (i13 == 2) {
            return EnumC4085o2.LEADING;
        }
        throw new NoWhenBranchMatchedException();
    }
}
