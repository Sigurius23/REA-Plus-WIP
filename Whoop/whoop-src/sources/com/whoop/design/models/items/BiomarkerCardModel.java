package com.whoop.design.models.items;

import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.graph.GraphModel;
import com.whoop.design.models.items.graph.GraphModel$$serializer;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36954a;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u0000 p2\u00020\u0001:\u0002qpB³\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fBÉ\u0001\b\u0010\u0012\u0006\u0010 \u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001e\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010%J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010%J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010%J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010%J\u0012\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010%J\u0012\u0010.\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b0\u00101J\u0018\u00102\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u001aHÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\b>\u0010?JØ\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÆ\u0001¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bB\u0010%J\u0010\u0010C\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\bC\u0010DJ\u001a\u0010G\u001a\u00020\u001a2\b\u0010F\u001a\u0004\u0018\u00010EHÖ\u0003¢\u0006\u0004\bG\u0010HJ'\u0010Q\u001a\u00020N2\u0006\u0010I\u001a\u00020\u00002\u0006\u0010K\u001a\u00020J2\u0006\u0010M\u001a\u00020LH\u0001¢\u0006\u0004\bO\u0010PR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010R\u001a\u0004\bS\u0010%R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010R\u001a\u0004\bT\u0010%R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010R\u001a\u0004\bU\u0010%R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010R\u001a\u0004\bV\u0010%R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010R\u001a\u0004\bW\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010R\u001a\u0004\bX\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010Y\u001a\u0004\bZ\u0010,R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010R\u001a\u0004\b[\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\\\u001a\u0004\b]\u0010/R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010^\u0012\u0004\b`\u0010a\u001a\u0004\b_\u00101R\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010b\u001a\u0004\bc\u00103R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010d\u001a\u0004\be\u00105R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010f\u001a\u0004\bg\u00107R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010h\u001a\u0004\bi\u00109R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010j\u001a\u0004\bk\u0010;R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010l\u001a\u0004\bm\u0010=R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010n\u001a\u0004\bo\u0010?¨\u0006r"}, m65681d2 = {"Lcom/whoop/design/models/items/BiomarkerCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "title", "icon", "value", "valueText", "unit", "Lcom/whoop/design/models/items/ImpactModel;", "trend", "statusType", "Lcom/whoop/design/models/items/BiomarkerCardDisclaimerModel;", "disclaimer", "Lcom/whoop/navigation/e;", "destination", "", "categoryIds", "Lcom/whoop/design/models/items/RangeMeterModel;", "rangeMeter", "", "lastRecording", "Lcom/whoop/design/models/items/MiniCalloutModel;", "miniCallout", "Lcom/whoop/design/models/items/graph/GraphModel;", "graph", "", "useTileBackground", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/String;Lcom/whoop/design/models/items/BiomarkerCardDisclaimerModel;Lcom/whoop/navigation/e;Ljava/util/List;Lcom/whoop/design/models/items/RangeMeterModel;Ljava/lang/Integer;Lcom/whoop/design/models/items/MiniCalloutModel;Lcom/whoop/design/models/items/graph/GraphModel;ZLcom/whoop/navigation/models/GenericInteraction;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/String;Lcom/whoop/design/models/items/BiomarkerCardDisclaimerModel;Lcom/whoop/navigation/e;Ljava/util/List;Lcom/whoop/design/models/items/RangeMeterModel;Ljava/lang/Integer;Lcom/whoop/design/models/items/MiniCalloutModel;Lcom/whoop/design/models/items/graph/GraphModel;ZLcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Lcom/whoop/design/models/items/ImpactModel;", "component8", "component9", "()Lcom/whoop/design/models/items/BiomarkerCardDisclaimerModel;", "component10", "()Lcom/whoop/navigation/e;", "component11", "()Ljava/util/List;", "component12", "()Lcom/whoop/design/models/items/RangeMeterModel;", "component13", "()Ljava/lang/Integer;", "component14", "()Lcom/whoop/design/models/items/MiniCalloutModel;", "component15", "()Lcom/whoop/design/models/items/graph/GraphModel;", "component16", "()Z", "component17", "()Lcom/whoop/navigation/models/GenericInteraction;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/String;Lcom/whoop/design/models/items/BiomarkerCardDisclaimerModel;Lcom/whoop/navigation/e;Ljava/util/List;Lcom/whoop/design/models/items/RangeMeterModel;Ljava/lang/Integer;Lcom/whoop/design/models/items/MiniCalloutModel;Lcom/whoop/design/models/items/graph/GraphModel;ZLcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/design/models/items/BiomarkerCardModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/BiomarkerCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getTitle", "getIcon", "getValue", "getValueText", "getUnit", "Lcom/whoop/design/models/items/ImpactModel;", "getTrend", "getStatusType", "Lcom/whoop/design/models/items/BiomarkerCardDisclaimerModel;", "getDisclaimer", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "()V", "Ljava/util/List;", "getCategoryIds", "Lcom/whoop/design/models/items/RangeMeterModel;", "getRangeMeter", "Ljava/lang/Integer;", "getLastRecording", "Lcom/whoop/design/models/items/MiniCalloutModel;", "getMiniCallout", "Lcom/whoop/design/models/items/graph/GraphModel;", "getGraph", "Z", "getUseTileBackground", "Lcom/whoop/navigation/models/GenericInteraction;", "getInteraction", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BiomarkerCardModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<String> categoryIds;
    private final C9598e destination;
    private final BiomarkerCardDisclaimerModel disclaimer;
    private final GraphModel graph;
    private final String icon;
    private final String id;
    private final GenericInteraction interaction;
    private final Integer lastRecording;
    private final MiniCalloutModel miniCallout;
    private final RangeMeterModel rangeMeter;
    private final String statusType;
    private final String title;
    private final ImpactModel trend;
    private final String unit;
    private final boolean useTileBackground;
    private final String value;
    private final String valueText;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/BiomarkerCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/BiomarkerCardModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BiomarkerCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36954a(11)), AbstractC30060g.m92087G(enumC23463i, new C36954a(12)), null, null, null, null, null, null};
    }

    public /* synthetic */ BiomarkerCardModel(int i13, String str, String str2, String str3, String str4, String str5, String str6, ImpactModel impactModel, String str7, BiomarkerCardDisclaimerModel biomarkerCardDisclaimerModel, C9598e c9598e, List list, RangeMeterModel rangeMeterModel, Integer num, MiniCalloutModel miniCalloutModel, GraphModel graphModel, boolean z4, GenericInteraction genericInteraction, SerializationConstructorMarker serializationConstructorMarker) {
        if (16383 != (i13 & 16383)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 16383, BiomarkerCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.title = str2;
        this.icon = str3;
        this.value = str4;
        this.valueText = str5;
        this.unit = str6;
        this.trend = impactModel;
        this.statusType = str7;
        this.disclaimer = biomarkerCardDisclaimerModel;
        this.destination = c9598e;
        this.categoryIds = list;
        this.rangeMeter = rangeMeterModel;
        this.lastRecording = num;
        this.miniCallout = miniCalloutModel;
        if ((i13 & DfuBaseService.ERROR_CONNECTION_MASK) == 0) {
            this.graph = null;
        } else {
            this.graph = graphModel;
        }
        this.useTileBackground = (32768 & i13) == 0 ? true : z4;
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) == 0) {
            this.interaction = null;
        } else {
            this.interaction = genericInteraction;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BiomarkerCardModel copy$default(BiomarkerCardModel biomarkerCardModel, String str, String str2, String str3, String str4, String str5, String str6, ImpactModel impactModel, String str7, BiomarkerCardDisclaimerModel biomarkerCardDisclaimerModel, C9598e c9598e, List list, RangeMeterModel rangeMeterModel, Integer num, MiniCalloutModel miniCalloutModel, GraphModel graphModel, boolean z4, GenericInteraction genericInteraction, int i13, Object obj) {
        GenericInteraction genericInteraction2;
        boolean z13;
        String str8 = (i13 & 1) != 0 ? biomarkerCardModel.id : str;
        String str9 = (i13 & 2) != 0 ? biomarkerCardModel.title : str2;
        String str10 = (i13 & 4) != 0 ? biomarkerCardModel.icon : str3;
        String str11 = (i13 & 8) != 0 ? biomarkerCardModel.value : str4;
        String str12 = (i13 & 16) != 0 ? biomarkerCardModel.valueText : str5;
        String str13 = (i13 & 32) != 0 ? biomarkerCardModel.unit : str6;
        ImpactModel impactModel2 = (i13 & 64) != 0 ? biomarkerCardModel.trend : impactModel;
        String str14 = (i13 & 128) != 0 ? biomarkerCardModel.statusType : str7;
        BiomarkerCardDisclaimerModel biomarkerCardDisclaimerModel2 = (i13 & 256) != 0 ? biomarkerCardModel.disclaimer : biomarkerCardDisclaimerModel;
        C9598e c9598e2 = (i13 & 512) != 0 ? biomarkerCardModel.destination : c9598e;
        List list2 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? biomarkerCardModel.categoryIds : list;
        RangeMeterModel rangeMeterModel2 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? biomarkerCardModel.rangeMeter : rangeMeterModel;
        Integer num2 = (i13 & 4096) != 0 ? biomarkerCardModel.lastRecording : num;
        MiniCalloutModel miniCalloutModel2 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? biomarkerCardModel.miniCallout : miniCalloutModel;
        String str15 = str8;
        GraphModel graphModel2 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? biomarkerCardModel.graph : graphModel;
        boolean z14 = (i13 & 32768) != 0 ? biomarkerCardModel.useTileBackground : z4;
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0) {
            z13 = z14;
            genericInteraction2 = biomarkerCardModel.interaction;
        } else {
            genericInteraction2 = genericInteraction;
            z13 = z14;
        }
        return biomarkerCardModel.copy(str15, str9, str10, str11, str12, str13, impactModel2, str14, biomarkerCardDisclaimerModel2, c9598e2, list2, rangeMeterModel2, num2, miniCalloutModel2, graphModel2, z13, genericInteraction2);
    }

    public static /* synthetic */ void getDestination$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(BiomarkerCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.title);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.icon);
        output.encodeStringElement(serialDesc, 3, self.value);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.valueText);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.unit);
        output.encodeNullableSerializableElement(serialDesc, 6, ImpactModel$$serializer.INSTANCE, self.trend);
        output.encodeStringElement(serialDesc, 7, self.statusType);
        output.encodeNullableSerializableElement(serialDesc, 8, BiomarkerCardDisclaimerModel$$serializer.INSTANCE, self.disclaimer);
        output.encodeNullableSerializableElement(serialDesc, 9, (InterfaceC37145j) interfaceC23462hArr[9].getValue(), self.destination);
        output.encodeNullableSerializableElement(serialDesc, 10, (InterfaceC37145j) interfaceC23462hArr[10].getValue(), self.categoryIds);
        output.encodeNullableSerializableElement(serialDesc, 11, RangeMeterModel$$serializer.INSTANCE, self.rangeMeter);
        output.encodeNullableSerializableElement(serialDesc, 12, IntSerializer.INSTANCE, self.lastRecording);
        output.encodeNullableSerializableElement(serialDesc, 13, MiniCalloutModel$$serializer.INSTANCE, self.miniCallout);
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.graph != null) {
            output.encodeNullableSerializableElement(serialDesc, 14, GraphModel$$serializer.INSTANCE, self.graph);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 15) || !self.useTileBackground) {
            output.encodeBooleanElement(serialDesc, 15, self.useTileBackground);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 16) && self.interaction == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 16, GenericInteraction$$serializer.INSTANCE, self.interaction);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public final List<String> component11() {
        return this.categoryIds;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final RangeMeterModel getRangeMeter() {
        return this.rangeMeter;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getLastRecording() {
        return this.lastRecording;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final MiniCalloutModel getMiniCallout() {
        return this.miniCallout;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final GraphModel getGraph() {
        return this.graph;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getUseTileBackground() {
        return this.useTileBackground;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getValueText() {
        return this.valueText;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ImpactModel getTrend() {
        return this.trend;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStatusType() {
        return this.statusType;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BiomarkerCardDisclaimerModel getDisclaimer() {
        return this.disclaimer;
    }

    public final BiomarkerCardModel copy(String id4, String title, String icon, String value, String valueText, String unit, ImpactModel trend, String statusType, BiomarkerCardDisclaimerModel disclaimer, C9598e destination, List<String> categoryIds, RangeMeterModel rangeMeter, Integer lastRecording, MiniCalloutModel miniCallout, GraphModel graph, boolean useTileBackground, GenericInteraction interaction) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(statusType, "statusType");
        return new BiomarkerCardModel(id4, title, icon, value, valueText, unit, trend, statusType, disclaimer, destination, categoryIds, rangeMeter, lastRecording, miniCallout, graph, useTileBackground, interaction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BiomarkerCardModel)) {
            return false;
        }
        BiomarkerCardModel biomarkerCardModel = (BiomarkerCardModel) other;
        return AbstractC22676k.m65745e(this.id, biomarkerCardModel.id) && AbstractC22676k.m65745e(this.title, biomarkerCardModel.title) && AbstractC22676k.m65745e(this.icon, biomarkerCardModel.icon) && AbstractC22676k.m65745e(this.value, biomarkerCardModel.value) && AbstractC22676k.m65745e(this.valueText, biomarkerCardModel.valueText) && AbstractC22676k.m65745e(this.unit, biomarkerCardModel.unit) && AbstractC22676k.m65745e(this.trend, biomarkerCardModel.trend) && AbstractC22676k.m65745e(this.statusType, biomarkerCardModel.statusType) && AbstractC22676k.m65745e(this.disclaimer, biomarkerCardModel.disclaimer) && AbstractC22676k.m65745e(this.destination, biomarkerCardModel.destination) && AbstractC22676k.m65745e(this.categoryIds, biomarkerCardModel.categoryIds) && AbstractC22676k.m65745e(this.rangeMeter, biomarkerCardModel.rangeMeter) && AbstractC22676k.m65745e(this.lastRecording, biomarkerCardModel.lastRecording) && AbstractC22676k.m65745e(this.miniCallout, biomarkerCardModel.miniCallout) && AbstractC22676k.m65745e(this.graph, biomarkerCardModel.graph) && this.useTileBackground == biomarkerCardModel.useTileBackground && AbstractC22676k.m65745e(this.interaction, biomarkerCardModel.interaction);
    }

    public final List<String> getCategoryIds() {
        return this.categoryIds;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final BiomarkerCardDisclaimerModel getDisclaimer() {
        return this.disclaimer;
    }

    public final GraphModel getGraph() {
        return this.graph;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.id;
    }

    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    public final Integer getLastRecording() {
        return this.lastRecording;
    }

    public final MiniCalloutModel getMiniCallout() {
        return this.miniCallout;
    }

    public final RangeMeterModel getRangeMeter() {
        return this.rangeMeter;
    }

    public final String getStatusType() {
        return this.statusType;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ImpactModel getTrend() {
        return this.trend;
    }

    public final String getUnit() {
        return this.unit;
    }

    public final boolean getUseTileBackground() {
        return this.useTileBackground;
    }

    public final String getValue() {
        return this.value;
    }

    public final String getValueText() {
        return this.valueText;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.title);
        String str = this.icon;
        int iM30450d2 = AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.value);
        String str2 = this.valueText;
        int iHashCode = (iM30450d2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.unit;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        ImpactModel impactModel = this.trend;
        int iM30450d3 = AbstractC11266d.m30450d((iHashCode2 + (impactModel == null ? 0 : impactModel.hashCode())) * 31, 31, this.statusType);
        BiomarkerCardDisclaimerModel biomarkerCardDisclaimerModel = this.disclaimer;
        int iHashCode3 = (iM30450d3 + (biomarkerCardDisclaimerModel == null ? 0 : biomarkerCardDisclaimerModel.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iHashCode4 = (iHashCode3 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        List<String> list = this.categoryIds;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        RangeMeterModel rangeMeterModel = this.rangeMeter;
        int iHashCode6 = (iHashCode5 + (rangeMeterModel == null ? 0 : rangeMeterModel.hashCode())) * 31;
        Integer num = this.lastRecording;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        MiniCalloutModel miniCalloutModel = this.miniCallout;
        int iHashCode8 = (iHashCode7 + (miniCalloutModel == null ? 0 : miniCalloutModel.hashCode())) * 31;
        GraphModel graphModel = this.graph;
        int iM8289b = AbstractC2875y.m8289b((iHashCode8 + (graphModel == null ? 0 : graphModel.hashCode())) * 31, 31, this.useTileBackground);
        GenericInteraction genericInteraction = this.interaction;
        return iM8289b + (genericInteraction != null ? genericInteraction.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.icon;
        String str4 = this.value;
        String str5 = this.valueText;
        String str6 = this.unit;
        ImpactModel impactModel = this.trend;
        String str7 = this.statusType;
        BiomarkerCardDisclaimerModel biomarkerCardDisclaimerModel = this.disclaimer;
        C9598e c9598e = this.destination;
        List<String> list = this.categoryIds;
        RangeMeterModel rangeMeterModel = this.rangeMeter;
        Integer num = this.lastRecording;
        MiniCalloutModel miniCalloutModel = this.miniCallout;
        GraphModel graphModel = this.graph;
        boolean z4 = this.useTileBackground;
        GenericInteraction genericInteraction = this.interaction;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("BiomarkerCardModel(id=", str, ", title=", str2, ", icon=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", value=", str4, ", valueText=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", unit=", str6, ", trend=");
        sbM32001t.append(impactModel);
        sbM32001t.append(", statusType=");
        sbM32001t.append(str7);
        sbM32001t.append(", disclaimer=");
        sbM32001t.append(biomarkerCardDisclaimerModel);
        sbM32001t.append(", destination=");
        sbM32001t.append(c9598e);
        sbM32001t.append(", categoryIds=");
        sbM32001t.append(list);
        sbM32001t.append(", rangeMeter=");
        sbM32001t.append(rangeMeterModel);
        sbM32001t.append(", lastRecording=");
        sbM32001t.append(num);
        sbM32001t.append(", miniCallout=");
        sbM32001t.append(miniCalloutModel);
        sbM32001t.append(", graph=");
        sbM32001t.append(graphModel);
        sbM32001t.append(", useTileBackground=");
        sbM32001t.append(z4);
        sbM32001t.append(", interaction=");
        return AbstractC26725a.m79506j(sbM32001t, genericInteraction, ")");
    }

    public BiomarkerCardModel(String id4, String title, String str, String value, String str2, String str3, ImpactModel impactModel, String statusType, BiomarkerCardDisclaimerModel biomarkerCardDisclaimerModel, C9598e c9598e, List<String> list, RangeMeterModel rangeMeterModel, Integer num, MiniCalloutModel miniCalloutModel, GraphModel graphModel, boolean z4, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(statusType, "statusType");
        this.id = id4;
        this.title = title;
        this.icon = str;
        this.value = value;
        this.valueText = str2;
        this.unit = str3;
        this.trend = impactModel;
        this.statusType = statusType;
        this.disclaimer = biomarkerCardDisclaimerModel;
        this.destination = c9598e;
        this.categoryIds = list;
        this.rangeMeter = rangeMeterModel;
        this.lastRecording = num;
        this.miniCallout = miniCalloutModel;
        this.graph = graphModel;
        this.useTileBackground = z4;
        this.interaction = genericInteraction;
    }

    public /* synthetic */ BiomarkerCardModel(String str, String str2, String str3, String str4, String str5, String str6, ImpactModel impactModel, String str7, BiomarkerCardDisclaimerModel biomarkerCardDisclaimerModel, C9598e c9598e, List list, RangeMeterModel rangeMeterModel, Integer num, MiniCalloutModel miniCalloutModel, GraphModel graphModel, boolean z4, GenericInteraction genericInteraction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, impactModel, str7, biomarkerCardDisclaimerModel, c9598e, list, rangeMeterModel, num, miniCalloutModel, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : graphModel, (32768 & i13) != 0 ? true : z4, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? null : genericInteraction);
    }
}
