package p716lb1;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.GoalSettingsTileTagModel;
import com.whoop.design.models.items.IconSize;
import com.whoop.design.models.items.TagBackgroundStyle;
import com.whoop.design.models.items.TagModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.Action;
import gb1.AbstractC15673b0;
import gz0.AbstractC16315n0;
import hy0.AbstractC17746g1;
import hy0.C17730c1;
import hy0.C17750h1;
import hy0.EnumC17775o1;
import i91.C18250d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd1.AbstractC22403o;
import l83.C23454a0;
import p208i2.AbstractC17911t;
import p208i2.InterfaceC17869a1;
import p490t0.AbstractC33253j;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import y71.C39274g;

/* JADX INFO: renamed from: lb1.q4 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\u000b\u001a\u00020\b*\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\n\u001a\u0015\u0010\u000e\u001a\u00020\r*\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0015\u0010\u0014\u001a\u00020\u0011*\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0017\u001a\u00020\u0016*\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u0019*\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0015\u0010\u001c\u001a\u00020\u0011*\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u001c\u0010\u0015\u001a\u0015\u0010\u001d\u001a\u00020\u0011*\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u001d\u0010\u0015\"\u0017\u0010#\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, m65681d2 = {"Lcom/whoop/design/models/items/GoalSettingsTileTagModel;", "Lhy0/h1;", "m", "(Lcom/whoop/design/models/items/GoalSettingsTileTagModel;)Lhy0/h1;", "Lcom/whoop/design/models/items/TagModel;", "model", "d", "(Lcom/whoop/design/models/items/TagModel;)Lhy0/h1;", "Ly81/f;", "g", "(Lcom/whoop/design/models/items/TagModel;)Ly81/f;", "n", "Lcom/whoop/design/models/items/TagBackgroundStyle;", "Lhy0/o1;", "o", "(Lcom/whoop/design/models/items/TagBackgroundStyle;)Lhy0/o1;", "Lcom/whoop/design/models/items/IconSize;", "Ly3/f;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/design/models/items/IconSize;)F", "j", "(Lcom/whoop/design/models/items/TagBackgroundStyle;)F", "Li2/a1;", "k", "(Lcom/whoop/design/models/items/TagBackgroundStyle;)Li2/a1;", "Lhy0/c1;", "l", "(Lcom/whoop/design/models/items/TagBackgroundStyle;)Lhy0/c1;", "p", "i", "Llb1/y0;", "a", "Llb1/y0;", "c", "()Llb1/y0;", "tagMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23699q4 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93934a = Function1.m68251a(new C23675m4(5));

    /* JADX INFO: renamed from: lb1.q4$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93935a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f93936b;

        static {
            int[] iArr = new int[TagBackgroundStyle.values().length];
            try {
                iArr[TagBackgroundStyle.AI_COACH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TagBackgroundStyle.AI_COACH_PERSONALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TagBackgroundStyle.COACH_RECOMMENDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TagBackgroundStyle.CONTEXT_ACTIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TagBackgroundStyle.CHROMATIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TagBackgroundStyle.CONTEXT_DEFAULT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TagBackgroundStyle.CONTEXT_INACTIVE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TagBackgroundStyle.OVULATION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TagBackgroundStyle.PERIOD.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[TagBackgroundStyle.SYMPTOMS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[TagBackgroundStyle.PHASE_UNKNOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[TagBackgroundStyle.HORMONAL_BIRTH_CONTROL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[TagBackgroundStyle.POSTMENOPAUSE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[TagBackgroundStyle.POSTPARTUM_WITHOUT_PERIOD.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[TagBackgroundStyle.PREGNANT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[TagBackgroundStyle.OVULATORY_PHASE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[TagBackgroundStyle.LUTEAL_PHASE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[TagBackgroundStyle.MENSTRUAL_PHASE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[TagBackgroundStyle.FOLLICULAR_PHASE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[TagBackgroundStyle.STATUS_POSITIVE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[TagBackgroundStyle.STATUS_ALERT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[TagBackgroundStyle.STATUS_WARNING.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[TagBackgroundStyle.DEFAULT.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[TagBackgroundStyle.SELECTED.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[TagBackgroundStyle.BLUE.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[TagBackgroundStyle.BADGE_SMALL_PRIMARY_ACCENT.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[TagBackgroundStyle.BADGE_SMALL_ACCENT.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[TagBackgroundStyle.BADGE_SMALL_SECONDARY_NEUTRAL.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[TagBackgroundStyle.FEATURE_TRANSPARENT.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[TagBackgroundStyle.BADGE_SMALL_SECONDARY_NEGATIVE.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[TagBackgroundStyle.BADGE_SMALL_SECONDARY_ACCENT.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[TagBackgroundStyle.WEARABLE_UPSELL.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            f93935a = iArr;
            int[] iArr2 = new int[IconSize.values().length];
            try {
                iArr2[IconSize.EXTRA_SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr2[IconSize.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr2[IconSize.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr2[IconSize.LARGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr2[IconSize.EXTRA_LARGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused37) {
            }
            f93936b = iArr2;
        }
    }

    /* JADX INFO: renamed from: lb1.q4$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93937w;

        public b(Function1 function1) {
            this.f93937w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93937w.invoke((TagModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C23743y0 m69313c() {
        return f93934a;
    }

    /* JADX INFO: renamed from: d */
    public static final C17750h1 m69314d(TagModel model) {
        C18250d c18250d;
        Integer numM46376a;
        AbstractC22676k.m65750j(model, "model");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitle());
        Integer numM46376a2 = AbstractC16315n0.m46376a(model.getLeftIcon());
        C39274g c39274g = numM46376a2 != null ? new C39274g(numM46376a2.intValue(), null, 2, null) : null;
        TagBackgroundStyle tagStyle = model.getTagStyle();
        int i13 = tagStyle == null ? -1 : a.f93935a[tagStyle.ordinal()];
        if (i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4) {
            c18250d = new C18250d(p712j91.Function1.m60318a(AbstractC15673b0.m43978D()), 0.0f, 2, null);
        } else {
            c18250d = i13 != 5 ? null : new C18250d(p712j91.Function1.m60318a(AbstractC15673b0.m43989I0()), 0.0f, 2, null);
        }
        EnumC39333f enumC39333fM69317g = m69317g(model);
        int i14 = -1;
        EnumC39333f enumC39333fM69324n = m69324n(model);
        TagBackgroundStyle tagStyle2 = model.getTagStyle();
        if (tagStyle2 != null) {
            i14 = a.f93935a[tagStyle2.ordinal()];
        }
        AbstractC17911t abstractC17911tM43972A = (i14 == 2 || i14 == 4) ? AbstractC15673b0.m43972A() : null;
        AbstractC17911t abstractC17911tM43972A2 = model.getTagStyle() == TagBackgroundStyle.AI_COACH_PERSONALIZED ? AbstractC15673b0.m43972A() : null;
        EnumC17775o1 enumC17775o1M69325o = m69325o(model.getTagStyle());
        InterfaceC17869a1 interfaceC17869a1M69321k = m69321k(model.getTagStyle());
        IconSize iconSize = model.getIconSize();
        float fM69318h = iconSize != null ? m69318h(iconSize) : m69320j(model.getTagStyle());
        float fM69326p = m69326p(model.getTagStyle());
        float fM69319i = m69319i(model.getTagStyle());
        String rightIcon = model.getRightIcon();
        C39274g c39274g2 = (rightIcon == null || (numM46376a = AbstractC16315n0.m46376a(rightIcon)) == null) ? null : new C39274g(numM46376a.intValue(), null, 2, null);
        IconSize iconSize2 = model.getIconSize();
        float fM69318h2 = iconSize2 != null ? m69318h(iconSize2) : AbstractC17746g1.m50886v();
        C9598e destination = model.getDestination();
        Action action = model.getAction();
        C17730c1 c17730c1M69322l = m69322l(model.getTagStyle());
        String imageUrl = model.getImageUrl();
        return new C17750h1(textResourceM21278l, c39274g, enumC39333fM69317g, c18250d, enumC39333fM69324n, abstractC17911tM43972A, abstractC17911tM43972A2, enumC17775o1M69325o, false, interfaceC17869a1M69321k, fM69326p, fM69319i, fM69318h, c39274g2, fM69318h2, null, destination, action, c17730c1M69322l, imageUrl != null ? new AbstractC22403o.c(imageUrl, 0, 0, 0, 14, null) : null, AbstractC23688p.m69209d(model.getAvatars(), 0, 1, null), model.getInteraction(), 33024, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m69315e(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(TagModel.class), new b(new C23675m4(6)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C17750h1 m69316f(TagModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69314d(model);
    }

    /* JADX INFO: renamed from: g */
    private static final EnumC39333f m69317g(TagModel tagModel) {
        EnumC39333f enumC39333f;
        TagBackgroundStyle tagStyle = tagModel.getTagStyle();
        switch (tagStyle == null ? -1 : a.f93935a[tagStyle.ordinal()]) {
            case 4:
            case 6:
                return EnumC39333f.TRANSPARENT;
            case 5:
            default:
                String backgroundColor = tagModel.getBackgroundColor();
                if (backgroundColor != null) {
                    EnumC39333f enumC39333f2 = EnumC39333f.WHITE_10;
                    EnumC39333f[] enumC39333fArrValues = EnumC39333f.values();
                    int length = enumC39333fArrValues.length;
                    int i13 = 0;
                    while (true) {
                        if (i13 < length) {
                            enumC39333f = enumC39333fArrValues[i13];
                            if (!AbstractC22676k.m65745e(enumC39333f.name(), backgroundColor)) {
                                i13++;
                            }
                        } else {
                            enumC39333f = null;
                        }
                    }
                    if (enumC39333f != null) {
                        enumC39333f2 = enumC39333f;
                    }
                    if (enumC39333f2 != null) {
                        return enumC39333f2;
                    }
                }
                return EnumC39333f.WHITE_10;
            case 7:
                return EnumC39333f.WHITE_10;
            case 8:
                return EnumC39333f.TRANSPARENT;
            case 9:
                return EnumC39333f.TRANSPARENT;
            case 10:
                return EnumC39333f.TRANSPARENT;
            case 11:
            case 12:
            case 13:
                return EnumC39333f.WHITE_10;
            case 14:
                return EnumC39333f.SURFACE_PREGNANCY_TRIMESTER_4_DIM;
            case 15:
                return EnumC39333f.SURFACE_PREGNANCY_TRIMESTER_3_DIM;
            case 16:
                return EnumC39333f.SURFACE_MCI_OVULATORY_DIM;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return EnumC39333f.SURFACE_MCI_LUTEAL_DIM;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return EnumC39333f.SURFACE_MCI_MENSTRUAL_DIM;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return EnumC39333f.SURFACE_MCI_FOLLICULAR_DIM;
            case 20:
                return EnumC39333f.ACCENT_POSITIVE_TREND_15;
            case 21:
                return EnumC39333f.ACCENT_ALERT_TREND_15;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return EnumC39333f.ACCENT_NEGATIVE_TREND_15;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return EnumC39333f.WHITE_10;
            case 24:
                return EnumC39333f.BRAND_WHITE;
            case 25:
                return EnumC39333f.RECOVERY;
            case 26:
                return EnumC39333f.RECOVERY;
            case 27:
                return EnumC39333f.NEUTRAL_15;
            case 28:
            case 29:
                return EnumC39333f.TRANSPARENT;
            case 30:
                return EnumC39333f.TRANSPARENT;
            case 31:
                return EnumC39333f.TRANSPARENT;
            case 32:
                return EnumC39333f.WHITE_70;
        }
    }

    /* JADX INFO: renamed from: h */
    private static final float m69318h(IconSize iconSize) {
        int i13 = a.f93936b[iconSize.ordinal()];
        if (i13 == 1) {
            return 2 * 4;
        }
        if (i13 == 2) {
            return 3 * 4;
        }
        if (i13 == 3) {
            float f13 = 4;
            return f13 * f13;
        }
        if (i13 == 4) {
            return 6 * 4;
        }
        if (i13 == 5) {
            return 8 * 4;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: i */
    private static final float m69319i(TagBackgroundStyle tagBackgroundStyle) {
        int i13 = tagBackgroundStyle == null ? -1 : a.f93935a[tagBackgroundStyle.ordinal()];
        return ((i13 == 23 || i13 == 24) ? (float) 1.5d : 1) * 8;
    }

    /* JADX INFO: renamed from: j */
    private static final float m69320j(TagBackgroundStyle tagBackgroundStyle) {
        int i13 = tagBackgroundStyle == null ? -1 : a.f93935a[tagBackgroundStyle.ordinal()];
        if (i13 == 4 || i13 == 6 || i13 == 7) {
            return 3 * 4;
        }
        float f13 = 4;
        return f13 * f13;
    }

    /* JADX INFO: renamed from: k */
    private static final InterfaceC17869a1 m69321k(TagBackgroundStyle tagBackgroundStyle) {
        switch (tagBackgroundStyle == null ? -1 : a.f93935a[tagBackgroundStyle.ordinal()]) {
            case 3:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 20:
            case 21:
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
                return AbstractC33253j.m105489e(2 * 4);
            case 4:
            case 6:
            case 7:
                return AbstractC33253j.m105489e(2 * 4);
            case 5:
            case 25:
            default:
                return AbstractC33253j.m105489e(1 * 4);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 24:
                return AbstractC33253j.m105489e(3 * 4);
            case 32:
                return AbstractC33253j.m105489e(2 * 4);
        }
    }

    /* JADX INFO: renamed from: l */
    private static final C17730c1 m69322l(TagBackgroundStyle tagBackgroundStyle) {
        switch (tagBackgroundStyle == null ? -1 : a.f93935a[tagBackgroundStyle.ordinal()]) {
            case 6:
                return new C17730c1(EnumC39333f.WHITE_20, 0.0f, 2, null);
            case 7:
            case 25:
            case 26:
            case 27:
            default:
                return null;
            case 8:
                return new C17730c1(EnumC39333f.SURFACE_MCI_OVULATORY, 0.0f, 2, null);
            case 9:
                return new C17730c1(EnumC39333f.SURFACE_MCI_MENSTRUAL, 0.0f, 2, null);
            case 10:
                return new C17730c1(EnumC39333f.WHITE_20, 0.0f, 2, null);
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 20:
            case 21:
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 24:
                return null;
            case 28:
            case 29:
                return new C17730c1(EnumC39333f.WHITE_20, 0.0f, 2, null);
            case 30:
                return new C17730c1(EnumC39333f.ACCENT_NEGATIVE_TREND_15, 0.0f, 2, null);
            case 31:
                return new C17730c1(EnumC39333f.NEUTRAL_15, 0.0f, 2, null);
            case 32:
                return new C17730c1(EnumC39333f.WHITE_20, 0.0f, 2, null);
        }
    }

    /* JADX INFO: renamed from: m */
    public static final C17750h1 m69323m(GoalSettingsTileTagModel goalSettingsTileTagModel) {
        AbstractC22676k.m65750j(goalSettingsTileTagModel, "<this>");
        String title = goalSettingsTileTagModel.getTitle();
        if (title == null) {
            title = "";
        }
        String str = title;
        String iconSlug = goalSettingsTileTagModel.getIconSlug();
        String style = goalSettingsTileTagModel.getStyle();
        TagBackgroundStyle tagBackgroundStyle = null;
        if (style != null) {
            TagBackgroundStyle tagBackgroundStyle2 = TagBackgroundStyle.DEFAULT;
            for (TagBackgroundStyle tagBackgroundStyle3 : TagBackgroundStyle.values()) {
                if (AbstractC22676k.m65745e(tagBackgroundStyle3.name(), style)) {
                    tagBackgroundStyle = tagBackgroundStyle3;
                    break;
                }
            }
            if (tagBackgroundStyle == null) {
                tagBackgroundStyle = tagBackgroundStyle2;
            }
        }
        return m69314d(new TagModel(iconSlug, str, (String) null, tagBackgroundStyle, (String) null, (String) null, (C9598e) null, (Action) null, (String) null, (String) null, (List) null, (IconSize) null, (GenericInteraction) null, 8180, (DefaultConstructorMarker) null));
    }

    /* JADX INFO: renamed from: n */
    private static final EnumC39333f m69324n(TagModel tagModel) {
        EnumC39333f enumC39333f;
        TagBackgroundStyle tagStyle = tagModel.getTagStyle();
        switch (tagStyle == null ? -1 : a.f93935a[tagStyle.ordinal()]) {
            case 4:
                return EnumC39333f.BRAND_WHITE;
            case 5:
            default:
                String textColor = tagModel.getTextColor();
                if (textColor != null) {
                    EnumC39333f enumC39333f2 = EnumC39333f.BRAND_WHITE;
                    EnumC39333f[] enumC39333fArrValues = EnumC39333f.values();
                    int length = enumC39333fArrValues.length;
                    int i13 = 0;
                    while (true) {
                        if (i13 < length) {
                            enumC39333f = enumC39333fArrValues[i13];
                            if (!AbstractC22676k.m65745e(enumC39333f.name(), textColor)) {
                                i13++;
                            }
                        } else {
                            enumC39333f = null;
                        }
                    }
                    if (enumC39333f != null) {
                        enumC39333f2 = enumC39333f;
                    }
                    if (enumC39333f2 != null) {
                        return enumC39333f2;
                    }
                }
                return EnumC39333f.BRAND_WHITE;
            case 6:
            case 7:
                return EnumC39333f.WHITE_70;
            case 8:
                return EnumC39333f.TEXT_MCI_OVULATORY;
            case 9:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return EnumC39333f.TEXT_MCI_MENSTRUAL;
            case 10:
                return EnumC39333f.WHITE_70;
            case 11:
                return EnumC39333f.TEXT_BASE_SECONDARY;
            case 12:
            case 13:
                return EnumC39333f.BRAND_WHITE;
            case 14:
                return EnumC39333f.TEXT_PREGNANCY_TRIMESTER_4;
            case 15:
                return EnumC39333f.TEXT_PREGNANCY_TRIMESTER_3;
            case 16:
                return EnumC39333f.TEXT_MCI_OVULATORY;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return EnumC39333f.TEXT_MCI_LUTEAL;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return EnumC39333f.TEXT_MCI_FOLLICULAR;
            case 20:
                return EnumC39333f.ACCENT_POSITIVE_TREND;
            case 21:
                return EnumC39333f.ACCENT_ALERT;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return EnumC39333f.ACCENT_NEGATIVE_TREND;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return EnumC39333f.BRAND_WHITE;
            case 24:
                return EnumC39333f.BRAND_BLACK;
            case 25:
                return EnumC39333f.BRAND_BLACK;
            case 26:
                return EnumC39333f.BRAND_BLACK;
            case 27:
                return EnumC39333f.RECOVERY;
            case 28:
            case 29:
                return EnumC39333f.WHITE_70;
            case 30:
                return EnumC39333f.ACCENT_NEGATIVE_TREND;
            case 31:
                return EnumC39333f.RECOVERY;
            case 32:
                return EnumC39333f.BRAND_BLACK;
        }
    }

    /* JADX INFO: renamed from: o */
    private static final EnumC17775o1 m69325o(TagBackgroundStyle tagBackgroundStyle) {
        switch (tagBackgroundStyle == null ? -1 : a.f93935a[tagBackgroundStyle.ordinal()]) {
            case 3:
                return EnumC17775o1.COACH_RECOMMENDED;
            case 4:
            case 6:
            case 7:
                return EnumC17775o1.CONTEXT_CARD;
            case 5:
            case 25:
            default:
                return EnumC17775o1.NONE;
            case 8:
                return EnumC17775o1.OVULATION;
            case 9:
                return EnumC17775o1.PERIOD;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 20:
            case 21:
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return EnumC17775o1.SYMPTOMS;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 24:
                return EnumC17775o1.JOURNAL;
            case 26:
                return EnumC17775o1.BADGE_SMALL_PRIMARY_ACCENT;
            case 27:
                return EnumC17775o1.BADGE_SMALL_ACCENT;
            case 28:
            case 29:
                return EnumC17775o1.BADGE_SMALL_SECONDARY_NEUTRAL;
            case 30:
                return EnumC17775o1.BADGE_SMALL_SECONDARY_NEGATIVE;
            case 31:
                return EnumC17775o1.BADGE_SMALL_SECONDARY_ACCENT;
            case 32:
                return EnumC17775o1.WEARABLE_UPSELL;
        }
    }

    /* JADX INFO: renamed from: p */
    private static final float m69326p(TagBackgroundStyle tagBackgroundStyle) {
        int i13 = tagBackgroundStyle == null ? -1 : a.f93935a[tagBackgroundStyle.ordinal()];
        return ((i13 == 23 || i13 == 24) ? 1 : (float) 0.5d) * 8;
    }
}
