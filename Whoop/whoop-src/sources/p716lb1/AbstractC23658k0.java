package p716lb1;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.CommunityFollowerModel;
import com.whoop.design.models.items.CommunityTeamTileModel;
import com.whoop.design.models.items.FollowerRequestButtonModel;
import com.whoop.design.models.items.FollowerRequestModel;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.models.modal.DialogButton;
import com.whoop.design.models.modal.DialogModel;
import com.whoop.design.models.modal.Modal;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.whoopaction.domain.models.Action;
import gy0.AbstractC16272a;
import gz0.AbstractC16315n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kd1.AbstractC22403o;
import l83.C23454a0;
import m83.AbstractC25267u;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import u01.C34383e;
import u01.EnumC34379a;
import v11.C35544b;
import v11.C35552j;
import v11.C35553k;
import v11.EnumC35543a;
import v11.EnumC35545c;
import x01.C37801c;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: lb1.k0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r\"\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\r\"\u001a\u0010\u0016\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"Lcom/whoop/design/models/items/FollowerRequestButtonModel;", "Lv11/b;", "p", "(Lcom/whoop/design/models/items/FollowerRequestButtonModel;)Lv11/b;", "Lv11/k;", "o", "(Lcom/whoop/design/models/items/FollowerRequestButtonModel;)Lv11/k;", "", "Ly81/f;", "n", "(Ljava/lang/String;)Ly81/f;", "Llb1/y0;", "a", "Llb1/y0;", "communityFollowerMapper", "b", "communityFollowerLookupMapper", "c", "communityTeamTileMapper", "d", "m", "()Llb1/y0;", "communityMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23658k0 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93826a;

    /* JADX INFO: renamed from: b */
    private static final C23743y0 f93827b;

    /* JADX INFO: renamed from: c */
    private static final C23743y0 f93828c;

    /* JADX INFO: renamed from: d */
    private static final C23743y0 f93829d;

    /* JADX INFO: renamed from: lb1.k0$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93830w;

        public a(Function1 function1) {
            this.f93830w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93830w.invoke((FollowerRequestModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.k0$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93831w;

        public b(Function1 function1) {
            this.f93831w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93831w.invoke((CommunityFollowerModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.k0$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93832w;

        public c(Function1 function1) {
            this.f93832w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93832w.invoke((CommunityTeamTileModel) it);
        }
    }

    static {
        C23743y0 c23743y0M68251a = Function1.m68251a(new C23644i0(1));
        f93826a = c23743y0M68251a;
        C23743y0 c23743y0M68251a2 = Function1.m68251a(new C23644i0(2));
        f93827b = c23743y0M68251a2;
        C23743y0 c23743y0M68251a3 = Function1.m68251a(new C23644i0(3));
        f93828c = c23743y0M68251a3;
        f93829d = c23743y0M68251a.m69692c(c23743y0M68251a2).m69692c(c23743y0M68251a3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m68953g(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(FollowerRequestModel.class), new a(new C23644i0(5)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C35552j m68954h(FollowerRequestModel model) {
        TextResource textResourceM21267a;
        TextResource textResourceM21267a2;
        AbstractC22676k.m65750j(model, "model");
        String id4 = model.getId();
        String title = model.getTitle();
        if (title == null || (textResourceM21267a = AbstractC8693b.m21278l(title)) == null) {
            textResourceM21267a = AbstractC8693b.m21267a();
        }
        TextResource textResource = textResourceM21267a;
        String subtitle = model.getSubtitle();
        if (subtitle == null || (textResourceM21267a2 = AbstractC8693b.m21278l(subtitle)) == null) {
            textResourceM21267a2 = AbstractC8693b.m21267a();
        }
        TextResource textResource2 = textResourceM21267a2;
        String subtext = model.getSubtext();
        TextResource textResourceM21278l = subtext != null ? AbstractC8693b.m21278l(subtext) : null;
        String avatarUrl = model.getAvatarUrl();
        AbstractC22403o.c cVar = avatarUrl != null ? new AbstractC22403o.c(avatarUrl, 0, 0, 0, 14, null) : null;
        FollowerRequestButtonModel startButton = model.getStartButton();
        C35544b c35544bM68962p = startButton != null ? m68962p(startButton) : null;
        FollowerRequestButtonModel endButton = model.getEndButton();
        return new C35552j(id4, textResource, textResource2, textResourceM21278l, cVar, c35544bM68962p, endButton != null ? m68962p(endButton) : null, model.getDestination());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m68955i(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(CommunityFollowerModel.class), new b(new C23644i0(4)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:89:0x013e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0143  */
    /* JADX WARN: Code duplicated, block: B:93:0x014a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0165 A[LOOP:1: B:95:0x015f->B:97:0x0165, LOOP_END] */
    /* JADX INFO: renamed from: j */
    public static final C34383e m68956j(CommunityFollowerModel model) {
        TextResource textResourceM21267a;
        TextResource textResourceM21267a2;
        TextResource textResourceM21267a3;
        TextResource textResourceM21267a4;
        TextResource textResourceM21267a5;
        TextResource textResourceM21267a6;
        TextResource textResourceM21267a7;
        TextResource textResourceM21267a8;
        EnumC39333f enumC39333fM68960n;
        EnumC39333f enumC39333fM68960n2;
        EnumC39333f enumC39333fM68960n3;
        String str;
        EnumC34379a enumC34379a;
        String avatarRingColor;
        EnumC39333f enumC39333fM68960n4;
        List<String> iconUrls;
        ArrayList arrayList;
        Iterator<T> it;
        EnumC34379a enumC34379a2;
        EnumC34379a enumC34379a3;
        AbstractC22676k.m65750j(model, "model");
        String id4 = model.getId();
        String title = model.getTitle();
        if (title == null || (textResourceM21267a = AbstractC8693b.m21278l(title)) == null) {
            textResourceM21267a = AbstractC8693b.m21267a();
        }
        TextResource textResource = textResourceM21267a;
        String noDataLabel = model.getNoDataLabel();
        TextResource textResourceM21278l = noDataLabel != null ? AbstractC8693b.m21278l(noDataLabel) : null;
        String avatarUrl = model.getAvatarUrl();
        AbstractC22403o.c cVar = avatarUrl != null ? new AbstractC22403o.c(avatarUrl, 0, 0, 0, 14, null) : null;
        String streak = model.getStreak();
        if (streak == null || (textResourceM21267a2 = AbstractC8693b.m21278l(streak)) == null) {
            textResourceM21267a2 = AbstractC8693b.m21267a();
        }
        String streakImageUrl = model.getStreakImageUrl();
        AbstractC22403o.c cVar2 = streakImageUrl != null ? new AbstractC22403o.c(streakImageUrl, 0, 0, 0, 14, null) : null;
        String recoveryScore = model.getRecoveryScore();
        if (recoveryScore == null || (textResourceM21267a3 = AbstractC8693b.m21278l(recoveryScore)) == null) {
            textResourceM21267a3 = AbstractC8693b.m21267a();
        }
        String recoveryLabel = model.getRecoveryLabel();
        if (recoveryLabel == null || (textResourceM21267a4 = AbstractC8693b.m21278l(recoveryLabel)) == null) {
            textResourceM21267a4 = AbstractC8693b.m21267a();
        }
        String dayStrain = model.getDayStrain();
        if (dayStrain == null || (textResourceM21267a5 = AbstractC8693b.m21278l(dayStrain)) == null) {
            textResourceM21267a5 = AbstractC8693b.m21267a();
        }
        String strainLabel = model.getStrainLabel();
        if (strainLabel == null || (textResourceM21267a6 = AbstractC8693b.m21278l(strainLabel)) == null) {
            textResourceM21267a6 = AbstractC8693b.m21267a();
        }
        String sleepScore = model.getSleepScore();
        if (sleepScore == null || (textResourceM21267a7 = AbstractC8693b.m21278l(sleepScore)) == null) {
            textResourceM21267a7 = AbstractC8693b.m21267a();
        }
        String sleepLabel = model.getSleepLabel();
        if (sleepLabel == null || (textResourceM21267a8 = AbstractC8693b.m21278l(sleepLabel)) == null) {
            textResourceM21267a8 = AbstractC8693b.m21267a();
        }
        String recoveryColor = model.getRecoveryColor();
        if (recoveryColor == null || (enumC39333fM68960n = m68960n(recoveryColor)) == null) {
            enumC39333fM68960n = EnumC39333f.WHITE_70;
        }
        String strainColor = model.getStrainColor();
        if (strainColor == null || (enumC39333fM68960n2 = m68960n(strainColor)) == null) {
            enumC39333fM68960n2 = EnumC39333f.WHITE_70;
        }
        String sleepColor = model.getSleepColor();
        if (sleepColor == null || (enumC39333fM68960n3 = m68960n(sleepColor)) == null) {
            enumC39333fM68960n3 = EnumC39333f.WHITE_70;
        }
        String backgroundStyle = model.getBackgroundStyle();
        TextResource textResource2 = textResourceM21278l;
        if (backgroundStyle != null) {
            Locale ROOT = Locale.ROOT;
            AbstractC22676k.m65749i(ROOT, "ROOT");
            String upperCase = backgroundStyle.toUpperCase(ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            enumC34379a2 = EnumC34379a.DEFAULT;
            EnumC34379a[] enumC34379aArrValues = EnumC34379a.values();
            int length = enumC34379aArrValues.length;
            str = id4;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC34379a3 = null;
                    break;
                }
                enumC34379a3 = enumC34379aArrValues[i13];
                int i14 = length;
                if (AbstractC22676k.m65745e(enumC34379a3.name(), upperCase)) {
                    break;
                }
                i13++;
                length = i14;
            }
            if (enumC34379a3 != null) {
                enumC34379a = enumC34379a3;
            }
            if (enumC34379a == null) {
            }
            enumC34379a = enumC34379a2;
            avatarRingColor = model.getAvatarRingColor();
            if (avatarRingColor != null) {
                enumC39333fM68960n4 = m68960n(avatarRingColor);
            } else {
                enumC39333fM68960n4 = null;
            }
            iconUrls = model.getIconUrls();
            if (iconUrls == null) {
                iconUrls = C25271y.f99162w;
            }
            List<String> list = iconUrls;
            EnumC34379a enumC34379a4 = enumC34379a;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new AbstractC22403o.c((String) it.next(), 0, 0, 0, 14, null));
            }
            return new C34383e(str, textResource, textResource2, cVar, textResourceM21267a2, cVar2, textResourceM21267a3, textResourceM21267a4, textResourceM21267a5, textResourceM21267a6, textResourceM21267a7, textResourceM21267a8, enumC39333fM68960n, enumC39333fM68960n2, enumC39333fM68960n3, enumC34379a4, enumC39333fM68960n4, arrayList, model.getNavigation(), model.getInteraction(), model.getTitleInteraction());
        }
        str = id4;
        enumC34379a = enumC34379a2;
        enumC34379a = EnumC34379a.DEFAULT;
        enumC34379a = enumC34379a2;
        avatarRingColor = model.getAvatarRingColor();
        if (avatarRingColor != null) {
            enumC39333fM68960n4 = m68960n(avatarRingColor);
        } else {
            enumC39333fM68960n4 = null;
        }
        iconUrls = model.getIconUrls();
        if (iconUrls == null) {
            iconUrls = C25271y.f99162w;
        }
        List<String> list2 = iconUrls;
        EnumC34379a enumC34379a5 = enumC34379a;
        arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new AbstractC22403o.c((String) it.next(), 0, 0, 0, 14, null));
        }
        return new C34383e(str, textResource, textResource2, cVar, textResourceM21267a2, cVar2, textResourceM21267a3, textResourceM21267a4, textResourceM21267a5, textResourceM21267a6, textResourceM21267a7, textResourceM21267a8, enumC39333fM68960n, enumC39333fM68960n2, enumC39333fM68960n3, enumC34379a5, enumC39333fM68960n4, arrayList, model.getNavigation(), model.getInteraction(), model.getTitleInteraction());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m68957k(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(CommunityTeamTileModel.class), new c(new C23644i0(6)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C37801c m68958l(CommunityTeamTileModel model) {
        TextResource textResourceM21267a;
        TextResource textResourceM21267a2;
        TextResource textResourceM21267a3;
        AbstractC22676k.m65750j(model, "model");
        int i13 = AbstractC16272a.f61957L3;
        String title = model.getTitle();
        if (title == null || (textResourceM21267a = AbstractC8693b.m21278l(title)) == null) {
            textResourceM21267a = AbstractC8693b.m21267a();
        }
        TextResource textResource = textResourceM21267a;
        String iconUrl = model.getIconUrl();
        if (iconUrl == null || AbstractC39414r.m125890i0(iconUrl)) {
            iconUrl = null;
        }
        AbstractC22403o.c cVar = new AbstractC22403o.c(iconUrl, i13, i13, i13);
        String endText = model.getEndText();
        if (endText == null || (textResourceM21267a2 = AbstractC8693b.m21278l(endText)) == null) {
            textResourceM21267a2 = AbstractC8693b.m21267a();
        }
        TextResource textResource2 = textResourceM21267a2;
        String endSubText = model.getEndSubText();
        if (endSubText == null || (textResourceM21267a3 = AbstractC8693b.m21278l(endSubText)) == null) {
            textResourceM21267a3 = AbstractC8693b.m21267a();
        }
        return new C37801c(textResource, cVar, textResource2, textResourceM21267a3, model.getDestination());
    }

    /* JADX INFO: renamed from: m */
    public static final C23743y0 m68959m() {
        return f93829d;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0051 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x0052 A[RETURN] */
    /* JADX INFO: renamed from: n */
    private static final EnumC39333f m68960n(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 26538890) {
            if (iHashCode != 364990303) {
                if (iHashCode == 822580236 && str.equals("RECOVERY_HIGH")) {
                    return EnumC39333f.RECOVERY_HIGH_RECOVERY;
                }
            } else if (str.equals("RECOVERY_MEDIUM")) {
                return EnumC39333f.RECOVERY_MEDIUM_RECOVERY;
            }
        } else if (str.equals("RECOVERY_LOW")) {
            return EnumC39333f.RECOVERY_LOW_RECOVERY;
        }
        EnumC39333f enumC39333f = EnumC39333f.WHITE_70;
        for (EnumC39333f enumC39333f2 : EnumC39333f.values()) {
            if (AbstractC22676k.m65745e(enumC39333f2.name(), str)) {
                if (enumC39333f2 == null) {
                    return enumC39333f;
                }
                return enumC39333f2;
            }
        }
        enumC39333f2 = null;
        if (enumC39333f2 == null) {
            return enumC39333f;
        }
        return enumC39333f2;
    }

    /* JADX INFO: renamed from: o */
    private static final C35553k m68961o(FollowerRequestButtonModel followerRequestButtonModel) {
        DialogButton primaryButton;
        Action action;
        String title;
        AnyModal modal = followerRequestButtonModel.getModal();
        Modal modal2 = modal != null ? modal.getModal() : null;
        DialogModel dialogModel = modal2 instanceof DialogModel ? (DialogModel) modal2 : null;
        if (dialogModel != null && (primaryButton = dialogModel.getPrimaryButton()) != null && (action = primaryButton.getAction()) != null) {
            String title2 = dialogModel.getTitle();
            if (AbstractC39414r.m125890i0(title2)) {
                title2 = null;
            }
            if (title2 != null) {
                TextResource textResourceM21278l = AbstractC8693b.m21278l(title2);
                String description = dialogModel.getDescription();
                TextResource textResourceM21278l2 = description != null ? AbstractC8693b.m21278l(description) : null;
                TextResource textResourceM21278l3 = AbstractC8693b.m21278l(primaryButton.getTitle());
                DialogButton secondaryButton = dialogModel.getSecondaryButton();
                TextResource textResourceM21278l4 = (secondaryButton == null || (title = secondaryButton.getTitle()) == null) ? null : AbstractC8693b.m21278l(title);
                boolean showCloseButton = dialogModel.getShowCloseButton();
                AnalyticEventModel analyticEvent = primaryButton.getAnalyticEvent();
                DialogButton secondaryButton2 = dialogModel.getSecondaryButton();
                return new C35553k(textResourceM21278l, textResourceM21278l2, textResourceM21278l3, action, textResourceM21278l4, showCloseButton, analyticEvent, secondaryButton2 != null ? secondaryButton2.getAnalyticEvent() : null);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    /* JADX INFO: renamed from: p */
    private static final C35544b m68962p(FollowerRequestButtonModel followerRequestButtonModel) {
        EnumC35543a enumC35543a;
        EnumC35545c enumC35545c;
        EnumC35545c enumC35545c2;
        String size = followerRequestButtonModel.getSize();
        if (size != null) {
            EnumC35543a[] enumC35543aArrValues = EnumC35543a.values();
            int length = enumC35543aArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC35543a = null;
                    break;
                }
                enumC35543a = enumC35543aArrValues[i13];
                if (AbstractC22676k.m65745e(enumC35543a.name(), size)) {
                    break;
                }
                i13++;
            }
            if (enumC35543a == null) {
                enumC35543a = EnumC35543a.COMPACT;
            }
        } else {
            enumC35543a = EnumC35543a.COMPACT;
        }
        EnumC35543a enumC35543a2 = enumC35543a;
        C35553k c35553kM68961o = m68961o(followerRequestButtonModel);
        String id4 = followerRequestButtonModel.getId();
        String title = followerRequestButtonModel.getTitle();
        if (title == null) {
            title = "";
        }
        TextResource textResourceM21278l = AbstractC8693b.m21278l(title);
        String style = followerRequestButtonModel.getStyle();
        if (style != null) {
            EnumC35545c[] enumC35545cArrValues = EnumC35545c.values();
            int length2 = enumC35545cArrValues.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length2) {
                    enumC35545c2 = null;
                    break;
                }
                enumC35545c2 = enumC35545cArrValues[i14];
                if (AbstractC22676k.m65745e(enumC35545c2.name(), style)) {
                    break;
                }
                i14++;
            }
            enumC35545c = enumC35545c2;
        } else {
            enumC35545c = null;
        }
        return new C35544b(id4, textResourceM21278l, enumC35545c, AbstractC16315n0.m46377b(followerRequestButtonModel.getIcon()), (followerRequestButtonModel.getAction() == null && followerRequestButtonModel.getModal() == null) ? false : true, followerRequestButtonModel.getAction(), c35553kM68961o == null ? followerRequestButtonModel.getModal() : null, c35553kM68961o, enumC35543a2, followerRequestButtonModel.getAnalyticEvent());
    }
}
