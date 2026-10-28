package com.whoop.design.models.items;

import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import k01.EnumC22089a;
import k01.EnumC22094f;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import un1.C35100f;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 i2\u00020\u0001:\u0002jiBÁ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001b\u0010\u001cBÙ\u0001\b\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001b\u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0010\u0010'\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b'\u0010%J\u0010\u0010(\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b(\u0010%J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010#J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010#J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010#J\u0010\u0010,\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b,\u0010%J\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010#J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010#J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010#J\u0012\u00100\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010#J\u0012\u00103\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b9\u0010%J\u0012\u0010:\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b:\u0010%Jâ\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b=\u0010%J\u0010\u0010>\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b>\u0010?J\u001a\u0010C\u001a\u00020B2\b\u0010A\u001a\u0004\u0018\u00010@HÖ\u0003¢\u0006\u0004\bC\u0010DJ'\u0010M\u001a\u00020J2\u0006\u0010E\u001a\u00020\u00002\u0006\u0010G\u001a\u00020F2\u0006\u0010I\u001a\u00020HH\u0001¢\u0006\u0004\bK\u0010LR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010N\u001a\u0004\bO\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010P\u001a\u0004\bQ\u0010%R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010P\u001a\u0004\bR\u0010%R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010P\u001a\u0004\bS\u0010%R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010P\u001a\u0004\bT\u0010%R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010N\u001a\u0004\bU\u0010#R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010N\u001a\u0004\bV\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010N\u001a\u0004\bW\u0010#R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010P\u001a\u0004\bX\u0010%R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010N\u001a\u0004\bY\u0010#R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010N\u001a\u0004\bZ\u0010#R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010N\u001a\u0004\b[\u0010#R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\\\u001a\u0004\b]\u00101R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010N\u001a\u0004\b^\u0010#R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010_\u001a\u0004\b`\u00104R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010a\u001a\u0004\bb\u00106R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010c\u0012\u0004\be\u0010f\u001a\u0004\bd\u00108R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010P\u001a\u0004\bg\u0010%R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010P\u001a\u0004\bh\u0010%¨\u0006k"}, m65681d2 = {"Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/util/TextResource;", "title", "", "leftIcon", "rightIcon", "backgroundStyle", "bedtimeIcon", "bedtimeDisplay", "bedtimeTitle", "bedtimePeriodDisplay", "waketimeIcon", "waketimeDisplay", "waketimeTitle", "waketimeSubtitle", "Lk01/f;", "waketimeLabelStyle", "waketimePeriodDisplay", "Lk01/a;", "heightStyle", "Lcom/whoop/design/models/items/SleepPlannerAlarmCardStatus;", "ctaText", "Lcom/whoop/navigation/e;", "destination", "ctaButtonText", "ctaButtonIcon", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lk01/f;Lcom/whoop/design/util/TextResource;Lk01/a;Lcom/whoop/design/models/items/SleepPlannerAlarmCardStatus;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lk01/f;Lcom/whoop/design/util/TextResource;Lk01/a;Lcom/whoop/design/models/items/SleepPlannerAlarmCardStatus;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "()Lk01/f;", "component14", "component15", "()Lk01/a;", "component16", "()Lcom/whoop/design/models/items/SleepPlannerAlarmCardStatus;", "component17", "()Lcom/whoop/navigation/e;", "component18", "component19", "copy", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lk01/f;Lcom/whoop/design/util/TextResource;Lk01/a;Lcom/whoop/design/models/items/SleepPlannerAlarmCardStatus;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/design/util/TextResource;", "getTitle", "Ljava/lang/String;", "getLeftIcon", "getRightIcon", "getBackgroundStyle", "getBedtimeIcon", "getBedtimeDisplay", "getBedtimeTitle", "getBedtimePeriodDisplay", "getWaketimeIcon", "getWaketimeDisplay", "getWaketimeTitle", "getWaketimeSubtitle", "Lk01/f;", "getWaketimeLabelStyle", "getWaketimePeriodDisplay", "Lk01/a;", "getHeightStyle", "Lcom/whoop/design/models/items/SleepPlannerAlarmCardStatus;", "getCtaText", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "()V", "getCtaButtonText", "getCtaButtonIcon", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SleepPlannerAlarmCardModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    public static final int $stable;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String backgroundStyle;
    private final TextResource bedtimeDisplay;
    private final String bedtimeIcon;
    private final TextResource bedtimePeriodDisplay;
    private final TextResource bedtimeTitle;
    private final String ctaButtonIcon;
    private final String ctaButtonText;
    private final SleepPlannerAlarmCardStatus ctaText;
    private final C9598e destination;
    private final EnumC22089a heightStyle;
    private final String leftIcon;
    private final String rightIcon;
    private final TextResource title;
    private final TextResource waketimeDisplay;
    private final String waketimeIcon;
    private final EnumC22094f waketimeLabelStyle;
    private final TextResource waketimePeriodDisplay;
    private final TextResource waketimeSubtitle;
    private final TextResource waketimeTitle;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/SleepPlannerAlarmCardModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SleepPlannerAlarmCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        int i13 = C9598e.f28134d;
        int i14 = TextResource.$stable;
        $stable = i13 | i14 | i14 | i14 | i14 | i14 | i14 | i14 | i14;
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C35100f(25)), null, AbstractC30060g.m92087G(enumC23463i, new C35100f(26)), null, AbstractC30060g.m92087G(enumC23463i, new C35100f(27)), null, null};
    }

    public /* synthetic */ SleepPlannerAlarmCardModel(int i13, TextResource textResource, String str, String str2, String str3, String str4, TextResource textResource2, TextResource textResource3, TextResource textResource4, String str5, TextResource textResource5, TextResource textResource6, TextResource textResource7, EnumC22094f enumC22094f, TextResource textResource8, EnumC22089a enumC22089a, SleepPlannerAlarmCardStatus sleepPlannerAlarmCardStatus, C9598e c9598e, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (100223 != (i13 & 100223)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 100223, SleepPlannerAlarmCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = textResource;
        this.leftIcon = str;
        this.rightIcon = str2;
        this.backgroundStyle = str3;
        this.bedtimeIcon = str4;
        this.bedtimeDisplay = textResource2;
        this.bedtimeTitle = textResource3;
        if ((i13 & 128) == 0) {
            this.bedtimePeriodDisplay = null;
        } else {
            this.bedtimePeriodDisplay = textResource4;
        }
        this.waketimeIcon = str5;
        this.waketimeDisplay = textResource5;
        this.waketimeTitle = textResource6;
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.waketimeSubtitle = null;
        } else {
            this.waketimeSubtitle = textResource7;
        }
        if ((i13 & 4096) == 0) {
            this.waketimeLabelStyle = null;
        } else {
            this.waketimeLabelStyle = enumC22094f;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
            this.waketimePeriodDisplay = null;
        } else {
            this.waketimePeriodDisplay = textResource8;
        }
        this.heightStyle = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) == 0 ? EnumC22089a.DEFAULT : enumC22089a;
        this.ctaText = sleepPlannerAlarmCardStatus;
        this.destination = c9598e;
        if ((131072 & i13) == 0) {
            this.ctaButtonText = null;
        } else {
            this.ctaButtonText = str6;
        }
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
            this.ctaButtonIcon = null;
        } else {
            this.ctaButtonIcon = str7;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.molecule.card.sleepplanner.alarm.WakeTimeLabelStyle", EnumC22094f.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.molecule.card.sleepplanner.alarm.HeightStyle", EnumC22089a.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ SleepPlannerAlarmCardModel copy$default(SleepPlannerAlarmCardModel sleepPlannerAlarmCardModel, TextResource textResource, String str, String str2, String str3, String str4, TextResource textResource2, TextResource textResource3, TextResource textResource4, String str5, TextResource textResource5, TextResource textResource6, TextResource textResource7, EnumC22094f enumC22094f, TextResource textResource8, EnumC22089a enumC22089a, SleepPlannerAlarmCardStatus sleepPlannerAlarmCardStatus, C9598e c9598e, String str6, String str7, int i13, Object obj) {
        String str8;
        String str9;
        TextResource textResource9 = (i13 & 1) != 0 ? sleepPlannerAlarmCardModel.title : textResource;
        String str10 = (i13 & 2) != 0 ? sleepPlannerAlarmCardModel.leftIcon : str;
        String str11 = (i13 & 4) != 0 ? sleepPlannerAlarmCardModel.rightIcon : str2;
        String str12 = (i13 & 8) != 0 ? sleepPlannerAlarmCardModel.backgroundStyle : str3;
        String str13 = (i13 & 16) != 0 ? sleepPlannerAlarmCardModel.bedtimeIcon : str4;
        TextResource textResource10 = (i13 & 32) != 0 ? sleepPlannerAlarmCardModel.bedtimeDisplay : textResource2;
        TextResource textResource11 = (i13 & 64) != 0 ? sleepPlannerAlarmCardModel.bedtimeTitle : textResource3;
        TextResource textResource12 = (i13 & 128) != 0 ? sleepPlannerAlarmCardModel.bedtimePeriodDisplay : textResource4;
        String str14 = (i13 & 256) != 0 ? sleepPlannerAlarmCardModel.waketimeIcon : str5;
        TextResource textResource13 = (i13 & 512) != 0 ? sleepPlannerAlarmCardModel.waketimeDisplay : textResource5;
        TextResource textResource14 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? sleepPlannerAlarmCardModel.waketimeTitle : textResource6;
        TextResource textResource15 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? sleepPlannerAlarmCardModel.waketimeSubtitle : textResource7;
        EnumC22094f enumC22094f2 = (i13 & 4096) != 0 ? sleepPlannerAlarmCardModel.waketimeLabelStyle : enumC22094f;
        TextResource textResource16 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? sleepPlannerAlarmCardModel.waketimePeriodDisplay : textResource8;
        TextResource textResource17 = textResource9;
        EnumC22089a enumC22089a2 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? sleepPlannerAlarmCardModel.heightStyle : enumC22089a;
        SleepPlannerAlarmCardStatus sleepPlannerAlarmCardStatus2 = (i13 & 32768) != 0 ? sleepPlannerAlarmCardModel.ctaText : sleepPlannerAlarmCardStatus;
        C9598e c9598e2 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? sleepPlannerAlarmCardModel.destination : c9598e;
        String str15 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? sleepPlannerAlarmCardModel.ctaButtonText : str6;
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
            str9 = str15;
            str8 = sleepPlannerAlarmCardModel.ctaButtonIcon;
        } else {
            str8 = str7;
            str9 = str15;
        }
        return sleepPlannerAlarmCardModel.copy(textResource17, str10, str11, str12, str13, textResource10, textResource11, textResource12, str14, textResource13, textResource14, textResource15, enumC22094f2, textResource16, enumC22089a2, sleepPlannerAlarmCardStatus2, c9598e2, str9, str8);
    }

    public static /* synthetic */ void getDestination$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(SleepPlannerAlarmCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 0, c25452a, self.title);
        output.encodeStringElement(serialDesc, 1, self.leftIcon);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.rightIcon);
        output.encodeStringElement(serialDesc, 3, self.backgroundStyle);
        output.encodeStringElement(serialDesc, 4, self.bedtimeIcon);
        output.encodeSerializableElement(serialDesc, 5, c25452a, self.bedtimeDisplay);
        output.encodeSerializableElement(serialDesc, 6, c25452a, self.bedtimeTitle);
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.bedtimePeriodDisplay != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, c25452a, self.bedtimePeriodDisplay);
        }
        output.encodeStringElement(serialDesc, 8, self.waketimeIcon);
        output.encodeSerializableElement(serialDesc, 9, c25452a, self.waketimeDisplay);
        output.encodeSerializableElement(serialDesc, 10, c25452a, self.waketimeTitle);
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.waketimeSubtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, c25452a, self.waketimeSubtitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.waketimeLabelStyle != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, (InterfaceC37145j) interfaceC23462hArr[12].getValue(), self.waketimeLabelStyle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.waketimePeriodDisplay != null) {
            output.encodeNullableSerializableElement(serialDesc, 13, c25452a, self.waketimePeriodDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.heightStyle != EnumC22089a.DEFAULT) {
            output.encodeNullableSerializableElement(serialDesc, 14, (InterfaceC37145j) interfaceC23462hArr[14].getValue(), self.heightStyle);
        }
        output.encodeNullableSerializableElement(serialDesc, 15, SleepPlannerAlarmCardStatus$$serializer.INSTANCE, self.ctaText);
        output.encodeNullableSerializableElement(serialDesc, 16, (InterfaceC37145j) interfaceC23462hArr[16].getValue(), self.destination);
        if (output.shouldEncodeElementDefault(serialDesc, 17) || self.ctaButtonText != null) {
            output.encodeNullableSerializableElement(serialDesc, 17, stringSerializer, self.ctaButtonText);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 18) && self.ctaButtonIcon == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 18, stringSerializer, self.ctaButtonIcon);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final TextResource getWaketimeDisplay() {
        return this.waketimeDisplay;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final TextResource getWaketimeTitle() {
        return this.waketimeTitle;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final TextResource getWaketimeSubtitle() {
        return this.waketimeSubtitle;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final EnumC22094f getWaketimeLabelStyle() {
        return this.waketimeLabelStyle;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final TextResource getWaketimePeriodDisplay() {
        return this.waketimePeriodDisplay;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final EnumC22089a getHeightStyle() {
        return this.heightStyle;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final SleepPlannerAlarmCardStatus getCtaText() {
        return this.ctaText;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getCtaButtonText() {
        return this.ctaButtonText;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getCtaButtonIcon() {
        return this.ctaButtonIcon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLeftIcon() {
        return this.leftIcon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRightIcon() {
        return this.rightIcon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBackgroundStyle() {
        return this.backgroundStyle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBedtimeIcon() {
        return this.bedtimeIcon;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TextResource getBedtimeDisplay() {
        return this.bedtimeDisplay;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final TextResource getBedtimeTitle() {
        return this.bedtimeTitle;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final TextResource getBedtimePeriodDisplay() {
        return this.bedtimePeriodDisplay;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getWaketimeIcon() {
        return this.waketimeIcon;
    }

    public final SleepPlannerAlarmCardModel copy(TextResource title, String leftIcon, String rightIcon, String backgroundStyle, String bedtimeIcon, TextResource bedtimeDisplay, TextResource bedtimeTitle, TextResource bedtimePeriodDisplay, String waketimeIcon, TextResource waketimeDisplay, TextResource waketimeTitle, TextResource waketimeSubtitle, EnumC22094f waketimeLabelStyle, TextResource waketimePeriodDisplay, EnumC22089a heightStyle, SleepPlannerAlarmCardStatus ctaText, C9598e destination, String ctaButtonText, String ctaButtonIcon) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(leftIcon, "leftIcon");
        AbstractC22676k.m65750j(backgroundStyle, "backgroundStyle");
        AbstractC22676k.m65750j(bedtimeIcon, "bedtimeIcon");
        AbstractC22676k.m65750j(bedtimeDisplay, "bedtimeDisplay");
        AbstractC22676k.m65750j(bedtimeTitle, "bedtimeTitle");
        AbstractC22676k.m65750j(waketimeIcon, "waketimeIcon");
        AbstractC22676k.m65750j(waketimeDisplay, "waketimeDisplay");
        AbstractC22676k.m65750j(waketimeTitle, "waketimeTitle");
        return new SleepPlannerAlarmCardModel(title, leftIcon, rightIcon, backgroundStyle, bedtimeIcon, bedtimeDisplay, bedtimeTitle, bedtimePeriodDisplay, waketimeIcon, waketimeDisplay, waketimeTitle, waketimeSubtitle, waketimeLabelStyle, waketimePeriodDisplay, heightStyle, ctaText, destination, ctaButtonText, ctaButtonIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepPlannerAlarmCardModel)) {
            return false;
        }
        SleepPlannerAlarmCardModel sleepPlannerAlarmCardModel = (SleepPlannerAlarmCardModel) other;
        return AbstractC22676k.m65745e(this.title, sleepPlannerAlarmCardModel.title) && AbstractC22676k.m65745e(this.leftIcon, sleepPlannerAlarmCardModel.leftIcon) && AbstractC22676k.m65745e(this.rightIcon, sleepPlannerAlarmCardModel.rightIcon) && AbstractC22676k.m65745e(this.backgroundStyle, sleepPlannerAlarmCardModel.backgroundStyle) && AbstractC22676k.m65745e(this.bedtimeIcon, sleepPlannerAlarmCardModel.bedtimeIcon) && AbstractC22676k.m65745e(this.bedtimeDisplay, sleepPlannerAlarmCardModel.bedtimeDisplay) && AbstractC22676k.m65745e(this.bedtimeTitle, sleepPlannerAlarmCardModel.bedtimeTitle) && AbstractC22676k.m65745e(this.bedtimePeriodDisplay, sleepPlannerAlarmCardModel.bedtimePeriodDisplay) && AbstractC22676k.m65745e(this.waketimeIcon, sleepPlannerAlarmCardModel.waketimeIcon) && AbstractC22676k.m65745e(this.waketimeDisplay, sleepPlannerAlarmCardModel.waketimeDisplay) && AbstractC22676k.m65745e(this.waketimeTitle, sleepPlannerAlarmCardModel.waketimeTitle) && AbstractC22676k.m65745e(this.waketimeSubtitle, sleepPlannerAlarmCardModel.waketimeSubtitle) && this.waketimeLabelStyle == sleepPlannerAlarmCardModel.waketimeLabelStyle && AbstractC22676k.m65745e(this.waketimePeriodDisplay, sleepPlannerAlarmCardModel.waketimePeriodDisplay) && this.heightStyle == sleepPlannerAlarmCardModel.heightStyle && AbstractC22676k.m65745e(this.ctaText, sleepPlannerAlarmCardModel.ctaText) && AbstractC22676k.m65745e(this.destination, sleepPlannerAlarmCardModel.destination) && AbstractC22676k.m65745e(this.ctaButtonText, sleepPlannerAlarmCardModel.ctaButtonText) && AbstractC22676k.m65745e(this.ctaButtonIcon, sleepPlannerAlarmCardModel.ctaButtonIcon);
    }

    public final String getBackgroundStyle() {
        return this.backgroundStyle;
    }

    public final TextResource getBedtimeDisplay() {
        return this.bedtimeDisplay;
    }

    public final String getBedtimeIcon() {
        return this.bedtimeIcon;
    }

    public final TextResource getBedtimePeriodDisplay() {
        return this.bedtimePeriodDisplay;
    }

    public final TextResource getBedtimeTitle() {
        return this.bedtimeTitle;
    }

    public final String getCtaButtonIcon() {
        return this.ctaButtonIcon;
    }

    public final String getCtaButtonText() {
        return this.ctaButtonText;
    }

    public final SleepPlannerAlarmCardStatus getCtaText() {
        return this.ctaText;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final EnumC22089a getHeightStyle() {
        return this.heightStyle;
    }

    public final String getLeftIcon() {
        return this.leftIcon;
    }

    public final String getRightIcon() {
        return this.rightIcon;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public final TextResource getWaketimeDisplay() {
        return this.waketimeDisplay;
    }

    public final String getWaketimeIcon() {
        return this.waketimeIcon;
    }

    public final EnumC22094f getWaketimeLabelStyle() {
        return this.waketimeLabelStyle;
    }

    public final TextResource getWaketimePeriodDisplay() {
        return this.waketimePeriodDisplay;
    }

    public final TextResource getWaketimeSubtitle() {
        return this.waketimeSubtitle;
    }

    public final TextResource getWaketimeTitle() {
        return this.waketimeTitle;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.leftIcon);
        String str = this.rightIcon;
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.backgroundStyle), 31, this.bedtimeIcon), this.bedtimeDisplay, 31), this.bedtimeTitle, 31);
        TextResource textResource = this.bedtimePeriodDisplay;
        int iM95625a2 = AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11266d.m30450d((iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31, 31, this.waketimeIcon), this.waketimeDisplay, 31), this.waketimeTitle, 31);
        TextResource textResource2 = this.waketimeSubtitle;
        int iHashCode = (iM95625a2 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
        EnumC22094f enumC22094f = this.waketimeLabelStyle;
        int iHashCode2 = (iHashCode + (enumC22094f == null ? 0 : enumC22094f.hashCode())) * 31;
        TextResource textResource3 = this.waketimePeriodDisplay;
        int iHashCode3 = (iHashCode2 + (textResource3 == null ? 0 : textResource3.hashCode())) * 31;
        EnumC22089a enumC22089a = this.heightStyle;
        int iHashCode4 = (iHashCode3 + (enumC22089a == null ? 0 : enumC22089a.hashCode())) * 31;
        SleepPlannerAlarmCardStatus sleepPlannerAlarmCardStatus = this.ctaText;
        int iHashCode5 = (iHashCode4 + (sleepPlannerAlarmCardStatus == null ? 0 : sleepPlannerAlarmCardStatus.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iHashCode6 = (iHashCode5 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        String str2 = this.ctaButtonText;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ctaButtonIcon;
        return iHashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.title;
        String str = this.leftIcon;
        String str2 = this.rightIcon;
        String str3 = this.backgroundStyle;
        String str4 = this.bedtimeIcon;
        TextResource textResource2 = this.bedtimeDisplay;
        TextResource textResource3 = this.bedtimeTitle;
        TextResource textResource4 = this.bedtimePeriodDisplay;
        String str5 = this.waketimeIcon;
        TextResource textResource5 = this.waketimeDisplay;
        TextResource textResource6 = this.waketimeTitle;
        TextResource textResource7 = this.waketimeSubtitle;
        EnumC22094f enumC22094f = this.waketimeLabelStyle;
        TextResource textResource8 = this.waketimePeriodDisplay;
        EnumC22089a enumC22089a = this.heightStyle;
        SleepPlannerAlarmCardStatus sleepPlannerAlarmCardStatus = this.ctaText;
        C9598e c9598e = this.destination;
        String str6 = this.ctaButtonText;
        String str7 = this.ctaButtonIcon;
        StringBuilder sbM91845o = AbstractC30007c.m91845o("SleepPlannerAlarmCardModel(title=", textResource, ", leftIcon=", str, ", rightIcon=");
        AbstractC11266d.m30444B(sbM91845o, str2, ", backgroundStyle=", str3, ", bedtimeIcon=");
        AbstractC30007c.m91826A(sbM91845o, str4, ", bedtimeDisplay=", textResource2, ", bedtimeTitle=");
        AbstractC30007c.m91855y(sbM91845o, textResource3, ", bedtimePeriodDisplay=", textResource4, ", waketimeIcon=");
        AbstractC30007c.m91826A(sbM91845o, str5, ", waketimeDisplay=", textResource5, ", waketimeTitle=");
        AbstractC30007c.m91855y(sbM91845o, textResource6, ", waketimeSubtitle=", textResource7, ", waketimeLabelStyle=");
        sbM91845o.append(enumC22094f);
        sbM91845o.append(", waketimePeriodDisplay=");
        sbM91845o.append(textResource8);
        sbM91845o.append(", heightStyle=");
        sbM91845o.append(enumC22089a);
        sbM91845o.append(", ctaText=");
        sbM91845o.append(sleepPlannerAlarmCardStatus);
        sbM91845o.append(", destination=");
        sbM91845o.append(c9598e);
        sbM91845o.append(", ctaButtonText=");
        sbM91845o.append(str6);
        sbM91845o.append(", ctaButtonIcon=");
        return AbstractC25012a.m73376i(str7, ")", sbM91845o);
    }

    public SleepPlannerAlarmCardModel(TextResource title, String leftIcon, String str, String backgroundStyle, String bedtimeIcon, TextResource bedtimeDisplay, TextResource bedtimeTitle, TextResource textResource, String waketimeIcon, TextResource waketimeDisplay, TextResource waketimeTitle, TextResource textResource2, EnumC22094f enumC22094f, TextResource textResource3, EnumC22089a enumC22089a, SleepPlannerAlarmCardStatus sleepPlannerAlarmCardStatus, C9598e c9598e, String str2, String str3) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(leftIcon, "leftIcon");
        AbstractC22676k.m65750j(backgroundStyle, "backgroundStyle");
        AbstractC22676k.m65750j(bedtimeIcon, "bedtimeIcon");
        AbstractC22676k.m65750j(bedtimeDisplay, "bedtimeDisplay");
        AbstractC22676k.m65750j(bedtimeTitle, "bedtimeTitle");
        AbstractC22676k.m65750j(waketimeIcon, "waketimeIcon");
        AbstractC22676k.m65750j(waketimeDisplay, "waketimeDisplay");
        AbstractC22676k.m65750j(waketimeTitle, "waketimeTitle");
        this.title = title;
        this.leftIcon = leftIcon;
        this.rightIcon = str;
        this.backgroundStyle = backgroundStyle;
        this.bedtimeIcon = bedtimeIcon;
        this.bedtimeDisplay = bedtimeDisplay;
        this.bedtimeTitle = bedtimeTitle;
        this.bedtimePeriodDisplay = textResource;
        this.waketimeIcon = waketimeIcon;
        this.waketimeDisplay = waketimeDisplay;
        this.waketimeTitle = waketimeTitle;
        this.waketimeSubtitle = textResource2;
        this.waketimeLabelStyle = enumC22094f;
        this.waketimePeriodDisplay = textResource3;
        this.heightStyle = enumC22089a;
        this.ctaText = sleepPlannerAlarmCardStatus;
        this.destination = c9598e;
        this.ctaButtonText = str2;
        this.ctaButtonIcon = str3;
    }

    public /* synthetic */ SleepPlannerAlarmCardModel(TextResource textResource, String str, String str2, String str3, String str4, TextResource textResource2, TextResource textResource3, TextResource textResource4, String str5, TextResource textResource5, TextResource textResource6, TextResource textResource7, EnumC22094f enumC22094f, TextResource textResource8, EnumC22089a enumC22089a, SleepPlannerAlarmCardStatus sleepPlannerAlarmCardStatus, C9598e c9598e, String str6, String str7, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, str, str2, str3, str4, textResource2, textResource3, (i13 & 128) != 0 ? null : textResource4, str5, textResource5, textResource6, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : textResource7, (i13 & 4096) != 0 ? null : enumC22094f, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : textResource8, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? EnumC22089a.DEFAULT : enumC22089a, sleepPlannerAlarmCardStatus, c9598e, (131072 & i13) != 0 ? null : str6, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? null : str7);
    }
}
