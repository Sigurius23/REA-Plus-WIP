package com.whoop.hormonalinsights.pregnancyinsights.domain.models;

import androidx.profileinstaller.ProfileVerifier;
import c13.AbstractC3855a;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.DateSelectorModel;
import com.whoop.design.models.items.DateSelectorModel$$serializer;
import com.whoop.design.models.items.WhoopCoachVowModel;
import com.whoop.design.models.items.WhoopCoachVowModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lj1.C24474b;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\b\u0018\u0000 w2\u00020\u0001:\u0002xwBë\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0015\u0012\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0015\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\r\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%B\u0091\u0002\b\u0010\u0012\u0006\u0010'\u001a\u00020&\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0015\u0012\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0015\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\r\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b$\u0010*J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010,J\u0012\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b4\u00105J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003¢\u0006\u0004\b6\u00107J\u0018\u00108\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b8\u00107J\u0010\u00109\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b9\u0010,J\u0010\u0010:\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b:\u0010;J\u001c\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00160\u0015HÆ\u0003¢\u0006\u0004\b<\u0010=J\u001c\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00160\u0015HÆ\u0003¢\u0006\u0004\b>\u0010=J\u001e\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b?\u0010=J\u001e\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b@\u0010=J\u0016\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001c0\rHÆ\u0003¢\u0006\u0004\bA\u00107J\u0012\u0010B\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020 HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0098\u0002\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00160\u00152\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00160\u00152\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00152\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00152\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\r2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010!\u001a\u00020 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"HÆ\u0001¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bJ\u0010,J\u0010\u0010K\u001a\u00020&HÖ\u0001¢\u0006\u0004\bK\u0010LJ\u001a\u0010O\u001a\u00020N2\b\u0010M\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bO\u0010PJ'\u0010Y\u001a\u00020V2\u0006\u0010Q\u001a\u00020\u00002\u0006\u0010S\u001a\u00020R2\u0006\u0010U\u001a\u00020TH\u0001¢\u0006\u0004\bW\u0010XR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010Z\u001a\u0004\b[\u0010,R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010Z\u001a\u0004\b\\\u0010,R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010]\u001a\u0004\b^\u0010/R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010_\u001a\u0004\b`\u00101R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010a\u001a\u0004\bb\u00103R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010c\u001a\u0004\bd\u00105R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010e\u001a\u0004\bf\u00107R\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0011\u0010e\u001a\u0004\bg\u00107R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010Z\u001a\u0004\bh\u0010,R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010i\u001a\u0004\bj\u0010;R#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010k\u001a\u0004\bl\u0010=R#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\b\u0018\u0010k\u001a\u0004\bm\u0010=R%\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u001a\u0010k\u001a\u0004\bn\u0010=R%\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u001b\u0010k\u001a\u0004\bo\u0010=R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\r8\u0006¢\u0006\f\n\u0004\b\u001d\u0010e\u001a\u0004\bp\u00107R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010q\u001a\u0004\br\u0010CR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010s\u001a\u0004\bt\u0010ER\u0019\u0010#\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b#\u0010u\u001a\u0004\bv\u0010G¨\u0006y"}, m65681d2 = {"Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;", "", "", "pregnancyId", "navigationTitle", "Lcom/whoop/design/models/items/DateSelectorModel;", "datePicker", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;", "header", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;", "congratulationsHeader", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/TrimesterStyle;", "style", "", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/Button;", "buttons", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/SegmentControlDisplay;", "segmentedControlDisplays", "selectedButtonId", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GraphType;", "segmentedControlDisplayId", "", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;", "currentTrimesterGraphs", "overviewGraphs", "Lcom/whoop/design/models/items/WhoopCoachVowModel;", "currentTrimesterVows", "overviewVows", "Lcom/whoop/design/models/DesignSystemModel;", "belowGraphContent", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;", "bottomSheet", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;", "haveYouDeliveredDialog", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog;", "deletePregnancyDialog", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/TrimesterStyle;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GraphType;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/TrimesterStyle;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GraphType;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/design/models/items/DateSelectorModel;", "component4", "()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;", "component5", "()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;", "component6", "()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/TrimesterStyle;", "component7", "()Ljava/util/List;", "component8", "component9", "component10", "()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GraphType;", "component11", "()Ljava/util/Map;", "component12", "component13", "component14", "component15", "component16", "()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;", "component17", "()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;", "component18", "()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/TrimesterStyle;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GraphType;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog;)Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getPregnancyId", "getNavigationTitle", "Lcom/whoop/design/models/items/DateSelectorModel;", "getDatePicker", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;", "getHeader", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;", "getCongratulationsHeader", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/TrimesterStyle;", "getStyle", "Ljava/util/List;", "getButtons", "getSegmentedControlDisplays", "getSelectedButtonId", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GraphType;", "getSegmentedControlDisplayId", "Ljava/util/Map;", "getCurrentTrimesterGraphs", "getOverviewGraphs", "getCurrentTrimesterVows", "getOverviewVows", "getBelowGraphContent", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;", "getBottomSheet", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;", "getHaveYouDeliveredDialog", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog;", "getDeletePregnancyDialog", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PregnancyInsightsResponse {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<DesignSystemModel> belowGraphContent;
    private final BottomSheet bottomSheet;
    private final List<Button> buttons;
    private final PregnancyCongratulationsHeader congratulationsHeader;
    private final Map<String, PregnancyInsightsGraphModel> currentTrimesterGraphs;
    private final Map<String, WhoopCoachVowModel> currentTrimesterVows;
    private final DateSelectorModel datePicker;
    private final DeletePregnancyDialog deletePregnancyDialog;
    private final PregnancyInsightsDialogModel haveYouDeliveredDialog;
    private final PregnancyHeader header;
    private final String navigationTitle;
    private final Map<String, PregnancyInsightsGraphModel> overviewGraphs;
    private final Map<String, WhoopCoachVowModel> overviewVows;
    private final String pregnancyId;
    private final GraphType segmentedControlDisplayId;
    private final List<SegmentControlDisplay> segmentedControlDisplays;
    private final String selectedButtonId;
    private final TrimesterStyle style;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PregnancyInsightsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C24474b(18)), AbstractC30060g.m92087G(enumC23463i, new C24474b(19)), AbstractC30060g.m92087G(enumC23463i, new C24474b(20)), null, AbstractC30060g.m92087G(enumC23463i, new C24474b(21)), AbstractC30060g.m92087G(enumC23463i, new C24474b(22)), AbstractC30060g.m92087G(enumC23463i, new C24474b(23)), AbstractC30060g.m92087G(enumC23463i, new C24474b(24)), AbstractC30060g.m92087G(enumC23463i, new C24474b(25)), AbstractC30060g.m92087G(enumC23463i, new C24474b(26)), null, null, null};
    }

    public /* synthetic */ PregnancyInsightsResponse(int i13, String str, String str2, DateSelectorModel dateSelectorModel, PregnancyHeader pregnancyHeader, PregnancyCongratulationsHeader pregnancyCongratulationsHeader, TrimesterStyle trimesterStyle, List list, List list2, String str3, GraphType graphType, Map map, Map map2, Map map3, Map map4, List list3, BottomSheet bottomSheet, PregnancyInsightsDialogModel pregnancyInsightsDialogModel, DeletePregnancyDialog deletePregnancyDialog, SerializationConstructorMarker serializationConstructorMarker) {
        if (262143 != (i13 & 262143)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 262143, PregnancyInsightsResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.pregnancyId = str;
        this.navigationTitle = str2;
        this.datePicker = dateSelectorModel;
        this.header = pregnancyHeader;
        this.congratulationsHeader = pregnancyCongratulationsHeader;
        this.style = trimesterStyle;
        this.buttons = list;
        this.segmentedControlDisplays = list2;
        this.selectedButtonId = str3;
        this.segmentedControlDisplayId = graphType;
        this.currentTrimesterGraphs = map;
        this.overviewGraphs = map2;
        this.currentTrimesterVows = map3;
        this.overviewVows = map4;
        this.belowGraphContent = list3;
        this.bottomSheet = bottomSheet;
        this.haveYouDeliveredDialog = pregnancyInsightsDialogModel;
        this.deletePregnancyDialog = deletePregnancyDialog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.hormonalinsights.pregnancyinsights.domain.models.TrimesterStyle", TrimesterStyle.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(Button$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new ArrayListSerializer(SegmentControlDisplay$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$2() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.hormonalinsights.pregnancyinsights.domain.models.GraphType", GraphType.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$3() {
        return new LinkedHashMapSerializer(StringSerializer.INSTANCE, PregnancyInsightsGraphModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$4() {
        return new LinkedHashMapSerializer(StringSerializer.INSTANCE, PregnancyInsightsGraphModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$5() {
        return new LinkedHashMapSerializer(StringSerializer.INSTANCE, WhoopCoachVowModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$6() {
        return new LinkedHashMapSerializer(StringSerializer.INSTANCE, WhoopCoachVowModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$7() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PregnancyInsightsResponse copy$default(PregnancyInsightsResponse pregnancyInsightsResponse, String str, String str2, DateSelectorModel dateSelectorModel, PregnancyHeader pregnancyHeader, PregnancyCongratulationsHeader pregnancyCongratulationsHeader, TrimesterStyle trimesterStyle, List list, List list2, String str3, GraphType graphType, Map map, Map map2, Map map3, Map map4, List list3, BottomSheet bottomSheet, PregnancyInsightsDialogModel pregnancyInsightsDialogModel, DeletePregnancyDialog deletePregnancyDialog, int i13, Object obj) {
        DeletePregnancyDialog deletePregnancyDialog2;
        PregnancyInsightsDialogModel pregnancyInsightsDialogModel2;
        String str4 = (i13 & 1) != 0 ? pregnancyInsightsResponse.pregnancyId : str;
        String str5 = (i13 & 2) != 0 ? pregnancyInsightsResponse.navigationTitle : str2;
        DateSelectorModel dateSelectorModel2 = (i13 & 4) != 0 ? pregnancyInsightsResponse.datePicker : dateSelectorModel;
        PregnancyHeader pregnancyHeader2 = (i13 & 8) != 0 ? pregnancyInsightsResponse.header : pregnancyHeader;
        PregnancyCongratulationsHeader pregnancyCongratulationsHeader2 = (i13 & 16) != 0 ? pregnancyInsightsResponse.congratulationsHeader : pregnancyCongratulationsHeader;
        TrimesterStyle trimesterStyle2 = (i13 & 32) != 0 ? pregnancyInsightsResponse.style : trimesterStyle;
        List list4 = (i13 & 64) != 0 ? pregnancyInsightsResponse.buttons : list;
        List list5 = (i13 & 128) != 0 ? pregnancyInsightsResponse.segmentedControlDisplays : list2;
        String str6 = (i13 & 256) != 0 ? pregnancyInsightsResponse.selectedButtonId : str3;
        GraphType graphType2 = (i13 & 512) != 0 ? pregnancyInsightsResponse.segmentedControlDisplayId : graphType;
        Map map5 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? pregnancyInsightsResponse.currentTrimesterGraphs : map;
        Map map6 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? pregnancyInsightsResponse.overviewGraphs : map2;
        Map map7 = (i13 & 4096) != 0 ? pregnancyInsightsResponse.currentTrimesterVows : map3;
        Map map8 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? pregnancyInsightsResponse.overviewVows : map4;
        String str7 = str4;
        List list6 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? pregnancyInsightsResponse.belowGraphContent : list3;
        BottomSheet bottomSheet2 = (i13 & 32768) != 0 ? pregnancyInsightsResponse.bottomSheet : bottomSheet;
        PregnancyInsightsDialogModel pregnancyInsightsDialogModel3 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? pregnancyInsightsResponse.haveYouDeliveredDialog : pregnancyInsightsDialogModel;
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0) {
            pregnancyInsightsDialogModel2 = pregnancyInsightsDialogModel3;
            deletePregnancyDialog2 = pregnancyInsightsResponse.deletePregnancyDialog;
        } else {
            deletePregnancyDialog2 = deletePregnancyDialog;
            pregnancyInsightsDialogModel2 = pregnancyInsightsDialogModel3;
        }
        return pregnancyInsightsResponse.copy(str7, str5, dateSelectorModel2, pregnancyHeader2, pregnancyCongratulationsHeader2, trimesterStyle2, list4, list5, str6, graphType2, map5, map6, map7, map8, list6, bottomSheet2, pregnancyInsightsDialogModel2, deletePregnancyDialog2);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(PregnancyInsightsResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.pregnancyId);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.navigationTitle);
        output.encodeNullableSerializableElement(serialDesc, 2, DateSelectorModel$$serializer.INSTANCE, self.datePicker);
        output.encodeNullableSerializableElement(serialDesc, 3, PregnancyHeader$$serializer.INSTANCE, self.header);
        output.encodeNullableSerializableElement(serialDesc, 4, PregnancyCongratulationsHeader$$serializer.INSTANCE, self.congratulationsHeader);
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.style);
        output.encodeSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.buttons);
        output.encodeNullableSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.segmentedControlDisplays);
        output.encodeStringElement(serialDesc, 8, self.selectedButtonId);
        output.encodeSerializableElement(serialDesc, 9, (InterfaceC37145j) interfaceC23462hArr[9].getValue(), self.segmentedControlDisplayId);
        output.encodeSerializableElement(serialDesc, 10, (InterfaceC37145j) interfaceC23462hArr[10].getValue(), self.currentTrimesterGraphs);
        output.encodeSerializableElement(serialDesc, 11, (InterfaceC37145j) interfaceC23462hArr[11].getValue(), self.overviewGraphs);
        output.encodeNullableSerializableElement(serialDesc, 12, (InterfaceC37145j) interfaceC23462hArr[12].getValue(), self.currentTrimesterVows);
        output.encodeNullableSerializableElement(serialDesc, 13, (InterfaceC37145j) interfaceC23462hArr[13].getValue(), self.overviewVows);
        output.encodeSerializableElement(serialDesc, 14, (InterfaceC37145j) interfaceC23462hArr[14].getValue(), self.belowGraphContent);
        output.encodeNullableSerializableElement(serialDesc, 15, BottomSheet$$serializer.INSTANCE, self.bottomSheet);
        output.encodeSerializableElement(serialDesc, 16, PregnancyInsightsDialogModel$$serializer.INSTANCE, self.haveYouDeliveredDialog);
        output.encodeNullableSerializableElement(serialDesc, 17, DeletePregnancyDialog$$serializer.INSTANCE, self.deletePregnancyDialog);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPregnancyId() {
        return this.pregnancyId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final GraphType getSegmentedControlDisplayId() {
        return this.segmentedControlDisplayId;
    }

    public final Map<String, PregnancyInsightsGraphModel> component11() {
        return this.currentTrimesterGraphs;
    }

    public final Map<String, PregnancyInsightsGraphModel> component12() {
        return this.overviewGraphs;
    }

    public final Map<String, WhoopCoachVowModel> component13() {
        return this.currentTrimesterVows;
    }

    public final Map<String, WhoopCoachVowModel> component14() {
        return this.overviewVows;
    }

    public final List<DesignSystemModel> component15() {
        return this.belowGraphContent;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final BottomSheet getBottomSheet() {
        return this.bottomSheet;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final PregnancyInsightsDialogModel getHaveYouDeliveredDialog() {
        return this.haveYouDeliveredDialog;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final DeletePregnancyDialog getDeletePregnancyDialog() {
        return this.deletePregnancyDialog;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DateSelectorModel getDatePicker() {
        return this.datePicker;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PregnancyHeader getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final PregnancyCongratulationsHeader getCongratulationsHeader() {
        return this.congratulationsHeader;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TrimesterStyle getStyle() {
        return this.style;
    }

    public final List<Button> component7() {
        return this.buttons;
    }

    public final List<SegmentControlDisplay> component8() {
        return this.segmentedControlDisplays;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSelectedButtonId() {
        return this.selectedButtonId;
    }

    public final PregnancyInsightsResponse copy(String pregnancyId, String navigationTitle, DateSelectorModel datePicker, PregnancyHeader header, PregnancyCongratulationsHeader congratulationsHeader, TrimesterStyle style, List<Button> buttons, List<SegmentControlDisplay> segmentedControlDisplays, String selectedButtonId, GraphType segmentedControlDisplayId, Map<String, PregnancyInsightsGraphModel> currentTrimesterGraphs, Map<String, PregnancyInsightsGraphModel> overviewGraphs, Map<String, WhoopCoachVowModel> currentTrimesterVows, Map<String, WhoopCoachVowModel> overviewVows, List<? extends DesignSystemModel> belowGraphContent, BottomSheet bottomSheet, PregnancyInsightsDialogModel haveYouDeliveredDialog, DeletePregnancyDialog deletePregnancyDialog) {
        AbstractC22676k.m65750j(pregnancyId, "pregnancyId");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(buttons, "buttons");
        AbstractC22676k.m65750j(selectedButtonId, "selectedButtonId");
        AbstractC22676k.m65750j(segmentedControlDisplayId, "segmentedControlDisplayId");
        AbstractC22676k.m65750j(currentTrimesterGraphs, "currentTrimesterGraphs");
        AbstractC22676k.m65750j(overviewGraphs, "overviewGraphs");
        AbstractC22676k.m65750j(belowGraphContent, "belowGraphContent");
        AbstractC22676k.m65750j(haveYouDeliveredDialog, "haveYouDeliveredDialog");
        return new PregnancyInsightsResponse(pregnancyId, navigationTitle, datePicker, header, congratulationsHeader, style, buttons, segmentedControlDisplays, selectedButtonId, segmentedControlDisplayId, currentTrimesterGraphs, overviewGraphs, currentTrimesterVows, overviewVows, belowGraphContent, bottomSheet, haveYouDeliveredDialog, deletePregnancyDialog);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PregnancyInsightsResponse)) {
            return false;
        }
        PregnancyInsightsResponse pregnancyInsightsResponse = (PregnancyInsightsResponse) other;
        return AbstractC22676k.m65745e(this.pregnancyId, pregnancyInsightsResponse.pregnancyId) && AbstractC22676k.m65745e(this.navigationTitle, pregnancyInsightsResponse.navigationTitle) && AbstractC22676k.m65745e(this.datePicker, pregnancyInsightsResponse.datePicker) && AbstractC22676k.m65745e(this.header, pregnancyInsightsResponse.header) && AbstractC22676k.m65745e(this.congratulationsHeader, pregnancyInsightsResponse.congratulationsHeader) && this.style == pregnancyInsightsResponse.style && AbstractC22676k.m65745e(this.buttons, pregnancyInsightsResponse.buttons) && AbstractC22676k.m65745e(this.segmentedControlDisplays, pregnancyInsightsResponse.segmentedControlDisplays) && AbstractC22676k.m65745e(this.selectedButtonId, pregnancyInsightsResponse.selectedButtonId) && this.segmentedControlDisplayId == pregnancyInsightsResponse.segmentedControlDisplayId && AbstractC22676k.m65745e(this.currentTrimesterGraphs, pregnancyInsightsResponse.currentTrimesterGraphs) && AbstractC22676k.m65745e(this.overviewGraphs, pregnancyInsightsResponse.overviewGraphs) && AbstractC22676k.m65745e(this.currentTrimesterVows, pregnancyInsightsResponse.currentTrimesterVows) && AbstractC22676k.m65745e(this.overviewVows, pregnancyInsightsResponse.overviewVows) && AbstractC22676k.m65745e(this.belowGraphContent, pregnancyInsightsResponse.belowGraphContent) && AbstractC22676k.m65745e(this.bottomSheet, pregnancyInsightsResponse.bottomSheet) && AbstractC22676k.m65745e(this.haveYouDeliveredDialog, pregnancyInsightsResponse.haveYouDeliveredDialog) && AbstractC22676k.m65745e(this.deletePregnancyDialog, pregnancyInsightsResponse.deletePregnancyDialog);
    }

    public final List<DesignSystemModel> getBelowGraphContent() {
        return this.belowGraphContent;
    }

    public final BottomSheet getBottomSheet() {
        return this.bottomSheet;
    }

    public final List<Button> getButtons() {
        return this.buttons;
    }

    public final PregnancyCongratulationsHeader getCongratulationsHeader() {
        return this.congratulationsHeader;
    }

    public final Map<String, PregnancyInsightsGraphModel> getCurrentTrimesterGraphs() {
        return this.currentTrimesterGraphs;
    }

    public final Map<String, WhoopCoachVowModel> getCurrentTrimesterVows() {
        return this.currentTrimesterVows;
    }

    public final DateSelectorModel getDatePicker() {
        return this.datePicker;
    }

    public final DeletePregnancyDialog getDeletePregnancyDialog() {
        return this.deletePregnancyDialog;
    }

    public final PregnancyInsightsDialogModel getHaveYouDeliveredDialog() {
        return this.haveYouDeliveredDialog;
    }

    public final PregnancyHeader getHeader() {
        return this.header;
    }

    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    public final Map<String, PregnancyInsightsGraphModel> getOverviewGraphs() {
        return this.overviewGraphs;
    }

    public final Map<String, WhoopCoachVowModel> getOverviewVows() {
        return this.overviewVows;
    }

    public final String getPregnancyId() {
        return this.pregnancyId;
    }

    public final GraphType getSegmentedControlDisplayId() {
        return this.segmentedControlDisplayId;
    }

    public final List<SegmentControlDisplay> getSegmentedControlDisplays() {
        return this.segmentedControlDisplays;
    }

    public final String getSelectedButtonId() {
        return this.selectedButtonId;
    }

    public final TrimesterStyle getStyle() {
        return this.style;
    }

    public int hashCode() {
        int iHashCode = this.pregnancyId.hashCode() * 31;
        String str = this.navigationTitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DateSelectorModel dateSelectorModel = this.datePicker;
        int iHashCode3 = (iHashCode2 + (dateSelectorModel == null ? 0 : dateSelectorModel.hashCode())) * 31;
        PregnancyHeader pregnancyHeader = this.header;
        int iHashCode4 = (iHashCode3 + (pregnancyHeader == null ? 0 : pregnancyHeader.hashCode())) * 31;
        PregnancyCongratulationsHeader pregnancyCongratulationsHeader = this.congratulationsHeader;
        int iM31983b = AbstractC11895b.m31983b((this.style.hashCode() + ((iHashCode4 + (pregnancyCongratulationsHeader == null ? 0 : pregnancyCongratulationsHeader.hashCode())) * 31)) * 31, 31, this.buttons);
        List<SegmentControlDisplay> list = this.segmentedControlDisplays;
        int iM11821e = AbstractC3855a.m11821e(this.overviewGraphs, AbstractC3855a.m11821e(this.currentTrimesterGraphs, (this.segmentedControlDisplayId.hashCode() + AbstractC11266d.m30450d((iM31983b + (list == null ? 0 : list.hashCode())) * 31, 31, this.selectedButtonId)) * 31, 31), 31);
        Map<String, WhoopCoachVowModel> map = this.currentTrimesterVows;
        int iHashCode5 = (iM11821e + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, WhoopCoachVowModel> map2 = this.overviewVows;
        int iM31983b2 = AbstractC11895b.m31983b((iHashCode5 + (map2 == null ? 0 : map2.hashCode())) * 31, 31, this.belowGraphContent);
        BottomSheet bottomSheet = this.bottomSheet;
        int iHashCode6 = (this.haveYouDeliveredDialog.hashCode() + ((iM31983b2 + (bottomSheet == null ? 0 : bottomSheet.hashCode())) * 31)) * 31;
        DeletePregnancyDialog deletePregnancyDialog = this.deletePregnancyDialog;
        return iHashCode6 + (deletePregnancyDialog != null ? deletePregnancyDialog.hashCode() : 0);
    }

    public String toString() {
        String str = this.pregnancyId;
        String str2 = this.navigationTitle;
        DateSelectorModel dateSelectorModel = this.datePicker;
        PregnancyHeader pregnancyHeader = this.header;
        PregnancyCongratulationsHeader pregnancyCongratulationsHeader = this.congratulationsHeader;
        TrimesterStyle trimesterStyle = this.style;
        List<Button> list = this.buttons;
        List<SegmentControlDisplay> list2 = this.segmentedControlDisplays;
        String str3 = this.selectedButtonId;
        GraphType graphType = this.segmentedControlDisplayId;
        Map<String, PregnancyInsightsGraphModel> map = this.currentTrimesterGraphs;
        Map<String, PregnancyInsightsGraphModel> map2 = this.overviewGraphs;
        Map<String, WhoopCoachVowModel> map3 = this.currentTrimesterVows;
        Map<String, WhoopCoachVowModel> map4 = this.overviewVows;
        List<DesignSystemModel> list3 = this.belowGraphContent;
        BottomSheet bottomSheet = this.bottomSheet;
        PregnancyInsightsDialogModel pregnancyInsightsDialogModel = this.haveYouDeliveredDialog;
        DeletePregnancyDialog deletePregnancyDialog = this.deletePregnancyDialog;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("PregnancyInsightsResponse(pregnancyId=", str, ", navigationTitle=", str2, ", datePicker=");
        sbM32001t.append(dateSelectorModel);
        sbM32001t.append(", header=");
        sbM32001t.append(pregnancyHeader);
        sbM32001t.append(", congratulationsHeader=");
        sbM32001t.append(pregnancyCongratulationsHeader);
        sbM32001t.append(", style=");
        sbM32001t.append(trimesterStyle);
        sbM32001t.append(", buttons=");
        AbstractC21702c.m61148s(sbM32001t, list, ", segmentedControlDisplays=", list2, ", selectedButtonId=");
        sbM32001t.append(str3);
        sbM32001t.append(", segmentedControlDisplayId=");
        sbM32001t.append(graphType);
        sbM32001t.append(", currentTrimesterGraphs=");
        AbstractC3855a.m11840x(sbM32001t, map, ", overviewGraphs=", map2, ", currentTrimesterVows=");
        AbstractC3855a.m11840x(sbM32001t, map3, ", overviewVows=", map4, ", belowGraphContent=");
        sbM32001t.append(list3);
        sbM32001t.append(", bottomSheet=");
        sbM32001t.append(bottomSheet);
        sbM32001t.append(", haveYouDeliveredDialog=");
        sbM32001t.append(pregnancyInsightsDialogModel);
        sbM32001t.append(", deletePregnancyDialog=");
        sbM32001t.append(deletePregnancyDialog);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PregnancyInsightsResponse(String pregnancyId, String str, DateSelectorModel dateSelectorModel, PregnancyHeader pregnancyHeader, PregnancyCongratulationsHeader pregnancyCongratulationsHeader, TrimesterStyle style, List<Button> buttons, List<SegmentControlDisplay> list, String selectedButtonId, GraphType segmentedControlDisplayId, Map<String, PregnancyInsightsGraphModel> currentTrimesterGraphs, Map<String, PregnancyInsightsGraphModel> overviewGraphs, Map<String, WhoopCoachVowModel> map, Map<String, WhoopCoachVowModel> map2, List<? extends DesignSystemModel> belowGraphContent, BottomSheet bottomSheet, PregnancyInsightsDialogModel haveYouDeliveredDialog, DeletePregnancyDialog deletePregnancyDialog) {
        AbstractC22676k.m65750j(pregnancyId, "pregnancyId");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(buttons, "buttons");
        AbstractC22676k.m65750j(selectedButtonId, "selectedButtonId");
        AbstractC22676k.m65750j(segmentedControlDisplayId, "segmentedControlDisplayId");
        AbstractC22676k.m65750j(currentTrimesterGraphs, "currentTrimesterGraphs");
        AbstractC22676k.m65750j(overviewGraphs, "overviewGraphs");
        AbstractC22676k.m65750j(belowGraphContent, "belowGraphContent");
        AbstractC22676k.m65750j(haveYouDeliveredDialog, "haveYouDeliveredDialog");
        this.pregnancyId = pregnancyId;
        this.navigationTitle = str;
        this.datePicker = dateSelectorModel;
        this.header = pregnancyHeader;
        this.congratulationsHeader = pregnancyCongratulationsHeader;
        this.style = style;
        this.buttons = buttons;
        this.segmentedControlDisplays = list;
        this.selectedButtonId = selectedButtonId;
        this.segmentedControlDisplayId = segmentedControlDisplayId;
        this.currentTrimesterGraphs = currentTrimesterGraphs;
        this.overviewGraphs = overviewGraphs;
        this.currentTrimesterVows = map;
        this.overviewVows = map2;
        this.belowGraphContent = belowGraphContent;
        this.bottomSheet = bottomSheet;
        this.haveYouDeliveredDialog = haveYouDeliveredDialog;
        this.deletePregnancyDialog = deletePregnancyDialog;
    }
}
