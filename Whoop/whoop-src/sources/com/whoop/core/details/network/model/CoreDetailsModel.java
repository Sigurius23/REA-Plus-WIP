package com.whoop.core.details.network.model;

import androidx.profileinstaller.ProfileVerifier;
import cj0.C4744f;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.AchievementProgressCardModel;
import com.whoop.design.models.items.AchievementProgressCardModel$$serializer;
import com.whoop.design.models.items.AdditionalInfoTextModel;
import com.whoop.design.models.items.AdditionalInfoTextModel$$serializer;
import com.whoop.design.models.items.BarGraphContainerModel;
import com.whoop.design.models.items.BarGraphContainerModel$$serializer;
import com.whoop.design.models.items.CtaTileModel;
import com.whoop.design.models.items.CtaTileModel$$serializer;
import com.whoop.design.models.items.HorizontalStatModel;
import com.whoop.design.models.items.HorizontalStatModel$$serializer;
import com.whoop.design.models.items.KeyMetricCarouselModel;
import com.whoop.design.models.items.KeyMetricCarouselModel$$serializer;
import com.whoop.design.models.items.MapModel;
import com.whoop.design.models.items.MapModel$$serializer;
import com.whoop.design.models.items.StrainBreakDownModel;
import com.whoop.design.models.items.StrainBreakDownModel$$serializer;
import com.whoop.design.models.items.WhoopCoachVowModel;
import com.whoop.design.models.items.WhoopCoachVowModel$$serializer;
import com.whoop.design.models.items.graph.GraphModel;
import com.whoop.design.models.items.graph.GraphModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import live.hms.video.utils.AndroidSDKConstants;
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
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b=\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b>\b\u0087\b\u0018\u0000 ¹\u00012\u00020\u0001:\u0004º\u0001¹\u0001BÓ\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010#\u001a\u00020\"\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\b\u0010*\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u0006\u0012\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010\u0006\u0012\b\u00100\u001a\u0004\u0018\u00010/\u0012\u000e\u00102\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u0006\u0012\b\u00104\u001a\u0004\u0018\u000103\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u001b\u0012\u0010\b\u0002\u00106\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0006¢\u0006\u0004\b7\u00108Bë\u0002\b\u0010\u0012\u0006\u0010:\u001a\u000209\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\b\u0010*\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u0006\u0012\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010\u0006\u0012\b\u00100\u001a\u0004\u0018\u00010/\u0012\u000e\u00102\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u0006\u0012\b\u00104\u001a\u0004\u0018\u000103\u0012\b\u00105\u001a\u0004\u0018\u00010\u001b\u0012\u000e\u00106\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0006\u0012\b\u0010<\u001a\u0004\u0018\u00010;¢\u0006\u0004\b7\u0010=J\u0010\u0010>\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0018\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\rHÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0016\u0010J\u001a\b\u0012\u0004\u0012\u00020\r0\u0006HÆ\u0003¢\u0006\u0004\bJ\u0010CJ\u0010\u0010K\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bK\u0010LJ\u0010\u0010M\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\bM\u0010NJ\u0012\u0010O\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bO\u0010PJ\u0012\u0010Q\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bQ\u0010RJ\u0012\u0010S\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\bS\u0010TJ\u0012\u0010U\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\bU\u0010VJ\u0012\u0010W\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bW\u0010XJ\u0012\u0010Y\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bY\u0010XJ\u0012\u0010Z\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bZ\u0010[J\u0012\u0010\\\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\b\\\u0010]J\u0010\u0010^\u001a\u00020\"HÆ\u0003¢\u0006\u0004\b^\u0010_J\u0012\u0010`\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b`\u0010PJ\u0012\u0010a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\ba\u0010PJ\u0012\u0010b\u001a\u0004\u0018\u00010&HÆ\u0003¢\u0006\u0004\bb\u0010cJ\u0012\u0010d\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0004\bd\u0010eJ\u0012\u0010f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bf\u0010GJ\u0016\u0010g\u001a\b\u0012\u0004\u0012\u00020+0\u0006HÆ\u0003¢\u0006\u0004\bg\u0010CJ\u0018\u0010h\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bh\u0010CJ\u0012\u0010i\u001a\u0004\u0018\u00010/HÆ\u0003¢\u0006\u0004\bi\u0010jJ\u0018\u0010k\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bk\u0010CJ\u0012\u0010l\u001a\u0004\u0018\u000103HÆ\u0003¢\u0006\u0004\bl\u0010mJ\u0012\u0010n\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bn\u0010XJ\u0018\u0010o\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bo\u0010CJ\u008e\u0003\u0010p\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010#\u001a\u00020\"2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00062\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010\u00062\n\b\u0002\u00100\u001a\u0004\u0018\u00010/2\u0010\b\u0002\u00102\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u00062\n\b\u0002\u00104\u001a\u0004\u0018\u0001032\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u001b2\u0010\b\u0002\u00106\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\bp\u0010qJ\u0010\u0010r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\br\u0010PJ\u0010\u0010s\u001a\u000209HÖ\u0001¢\u0006\u0004\bs\u0010tJ\u001a\u0010v\u001a\u00020\u000b2\b\u0010u\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bv\u0010wJ(\u0010\u0080\u0001\u001a\u00020}2\u0006\u0010x\u001a\u00020\u00002\u0006\u0010z\u001a\u00020y2\u0006\u0010|\u001a\u00020{H\u0001¢\u0006\u0004\b~\u0010\u007fR\u0019\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0003\u0010\u0081\u0001\u001a\u0005\b\u0082\u0001\u0010?R\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u000e\n\u0005\b\u0005\u0010\u0083\u0001\u001a\u0005\b\u0084\u0001\u0010AR!\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\u000e\n\u0005\b\b\u0010\u0085\u0001\u001a\u0005\b\u0086\u0001\u0010CR&\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\n\u0010\u0087\u0001\u0012\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0005\b\u0088\u0001\u0010ER\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\u000e\n\u0005\b\f\u0010\u008b\u0001\u001a\u0005\b\u008c\u0001\u0010GR\u0019\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\u000e\n\u0005\b\u000e\u0010\u008d\u0001\u001a\u0005\b\u008e\u0001\u0010IR\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00068\u0006¢\u0006\u000e\n\u0005\b\u000f\u0010\u0085\u0001\u001a\u0005\b\u008f\u0001\u0010CR\u0019\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b\u0011\u0010\u0090\u0001\u001a\u0005\b\u0091\u0001\u0010LR\u0019\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\u000e\n\u0005\b\u0013\u0010\u0092\u0001\u001a\u0005\b\u0093\u0001\u0010NR\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\b\u0014\u0010\u0094\u0001\u001a\u0005\b\u0095\u0001\u0010PR\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\u000e\n\u0005\b\u0016\u0010\u0096\u0001\u001a\u0005\b\u0097\u0001\u0010RR&\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0018\u0010\u0098\u0001\u0012\u0006\b\u009a\u0001\u0010\u008a\u0001\u001a\u0005\b\u0099\u0001\u0010TR\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\u000e\n\u0005\b\u001a\u0010\u009b\u0001\u001a\u0005\b\u009c\u0001\u0010VR\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\u000e\n\u0005\b\u001c\u0010\u009d\u0001\u001a\u0005\b\u009e\u0001\u0010XR\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\u000e\n\u0005\b\u001d\u0010\u009d\u0001\u001a\u0005\b\u009f\u0001\u0010XR\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\u000e\n\u0005\b\u001f\u0010 \u0001\u001a\u0005\b¡\u0001\u0010[R\u001b\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\u000e\n\u0005\b!\u0010¢\u0001\u001a\u0005\b£\u0001\u0010]R\u0019\u0010#\u001a\u00020\"8\u0006¢\u0006\u000e\n\u0005\b#\u0010¤\u0001\u001a\u0005\b¥\u0001\u0010_R\u001b\u0010$\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\b$\u0010\u0094\u0001\u001a\u0005\b¦\u0001\u0010PR\u001b\u0010%\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\b%\u0010\u0094\u0001\u001a\u0005\b§\u0001\u0010PR\u001b\u0010'\u001a\u0004\u0018\u00010&8\u0006¢\u0006\u000e\n\u0005\b'\u0010¨\u0001\u001a\u0005\b©\u0001\u0010cR\u001b\u0010)\u001a\u0004\u0018\u00010(8\u0006¢\u0006\u000e\n\u0005\b)\u0010ª\u0001\u001a\u0005\b«\u0001\u0010eR\u001b\u0010*\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\u000e\n\u0005\b*\u0010\u008b\u0001\u001a\u0005\b¬\u0001\u0010GR*\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00068\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b,\u0010\u0085\u0001\u0012\u0006\b®\u0001\u0010\u008a\u0001\u001a\u0005\b\u00ad\u0001\u0010CR!\u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010\u00068\u0006¢\u0006\u000e\n\u0005\b.\u0010\u0085\u0001\u001a\u0005\b¯\u0001\u0010CR\u001b\u00100\u001a\u0004\u0018\u00010/8\u0006¢\u0006\u000e\n\u0005\b0\u0010°\u0001\u001a\u0005\b±\u0001\u0010jR!\u00102\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u00068\u0006¢\u0006\u000e\n\u0005\b2\u0010\u0085\u0001\u001a\u0005\b²\u0001\u0010CR\u001b\u00104\u001a\u0004\u0018\u0001038\u0006¢\u0006\u000e\n\u0005\b4\u0010³\u0001\u001a\u0005\b´\u0001\u0010mR&\u00105\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b5\u0010\u009d\u0001\u0012\u0006\b¶\u0001\u0010\u008a\u0001\u001a\u0005\bµ\u0001\u0010XR,\u00106\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b6\u0010\u0085\u0001\u0012\u0006\b¸\u0001\u0010\u008a\u0001\u001a\u0005\b·\u0001\u0010C¨\u0006»\u0001"}, m65681d2 = {"Lcom/whoop/core/details/network/model/CoreDetailsModel;", "", "Lcom/whoop/core/details/network/model/TitleBarModel;", "titleBar", "Lcom/whoop/design/models/items/CtaTileModel;", "linkWorkoutCtaTile", "", "", "onboardingOverlays", "Lcom/whoop/design/models/items/StrainBreakDownModel;", "strainBreakdownModel", "", "linkWorkoutOptionEnabled", "Lcom/whoop/design/models/items/HorizontalStatModel;", "horizontalStat", "horizontalStats", "Lcom/whoop/design/models/items/KeyMetricCarouselModel;", "keyMetricCarousel", "Lcom/whoop/design/models/items/graph/GraphModel;", "graphResponse", "vowResponseString", "Lcom/whoop/design/models/items/WhoopCoachVowModel;", "whoopCoachVow", "Lcom/whoop/design/models/items/BarGraphContainerModel;", "heartRateZoneContainer", "Lcom/whoop/design/models/items/AchievementProgressCardModel;", "achievementProgressCard", "Lcom/whoop/design/models/DesignSystemModel;", "integrationPromoCard", "momentEntryPointTile", "Lcom/whoop/design/models/items/AdditionalInfoTextModel;", "additionalInfoText", "Lcom/whoop/design/models/items/MapModel;", "map", "Lcom/whoop/core/details/network/model/DetailsEditComponent;", "detailsEditComponents", "graphId", "initialGraphId", "Lcom/whoop/core/details/network/model/GraphTitleBar;", "graphTitleBar", "Lcom/whoop/core/details/network/model/SupplementalData;", "supplementalData", "editable", "Lcom/whoop/core/details/network/model/TagModel;", "tags", "Lcom/whoop/design/models/items/TagModel;", "tagsV2", "Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;", "weightliftingCardioDetails", "Lcom/whoop/core/details/network/model/MenuOptionsItem;", "menuOptions", "Lcom/whoop/core/details/network/model/MetaData;", "metadata", "activityTargetsMiniArch", "designItems", "<init>", "(Lcom/whoop/core/details/network/model/TitleBarModel;Lcom/whoop/design/models/items/CtaTileModel;Ljava/util/List;Lcom/whoop/design/models/items/StrainBreakDownModel;Ljava/lang/Boolean;Lcom/whoop/design/models/items/HorizontalStatModel;Ljava/util/List;Lcom/whoop/design/models/items/KeyMetricCarouselModel;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/design/models/items/AchievementProgressCardModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Lcom/whoop/design/models/items/MapModel;Lcom/whoop/core/details/network/model/DetailsEditComponent;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/GraphTitleBar;Lcom/whoop/core/details/network/model/SupplementalData;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;Ljava/util/List;Lcom/whoop/core/details/network/model/MetaData;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/core/details/network/model/TitleBarModel;Lcom/whoop/design/models/items/CtaTileModel;Ljava/util/List;Lcom/whoop/design/models/items/StrainBreakDownModel;Ljava/lang/Boolean;Lcom/whoop/design/models/items/HorizontalStatModel;Ljava/util/List;Lcom/whoop/design/models/items/KeyMetricCarouselModel;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/design/models/items/AchievementProgressCardModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Lcom/whoop/design/models/items/MapModel;Lcom/whoop/core/details/network/model/DetailsEditComponent;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/GraphTitleBar;Lcom/whoop/core/details/network/model/SupplementalData;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;Ljava/util/List;Lcom/whoop/core/details/network/model/MetaData;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/core/details/network/model/TitleBarModel;", "component2", "()Lcom/whoop/design/models/items/CtaTileModel;", "component3", "()Ljava/util/List;", "component4", "()Lcom/whoop/design/models/items/StrainBreakDownModel;", "component5", "()Ljava/lang/Boolean;", "component6", "()Lcom/whoop/design/models/items/HorizontalStatModel;", "component7", "component8", "()Lcom/whoop/design/models/items/KeyMetricCarouselModel;", "component9", "()Lcom/whoop/design/models/items/graph/GraphModel;", "component10", "()Ljava/lang/String;", "component11", "()Lcom/whoop/design/models/items/WhoopCoachVowModel;", "component12", "()Lcom/whoop/design/models/items/BarGraphContainerModel;", "component13", "()Lcom/whoop/design/models/items/AchievementProgressCardModel;", "component14", "()Lcom/whoop/design/models/DesignSystemModel;", "component15", "component16", "()Lcom/whoop/design/models/items/AdditionalInfoTextModel;", "component17", "()Lcom/whoop/design/models/items/MapModel;", "component18", "()Lcom/whoop/core/details/network/model/DetailsEditComponent;", "component19", "component20", "component21", "()Lcom/whoop/core/details/network/model/GraphTitleBar;", "component22", "()Lcom/whoop/core/details/network/model/SupplementalData;", "component23", "component24", "component25", "component26", "()Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;", "component27", "component28", "()Lcom/whoop/core/details/network/model/MetaData;", "component29", "component30", "copy", "(Lcom/whoop/core/details/network/model/TitleBarModel;Lcom/whoop/design/models/items/CtaTileModel;Ljava/util/List;Lcom/whoop/design/models/items/StrainBreakDownModel;Ljava/lang/Boolean;Lcom/whoop/design/models/items/HorizontalStatModel;Ljava/util/List;Lcom/whoop/design/models/items/KeyMetricCarouselModel;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/design/models/items/AchievementProgressCardModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Lcom/whoop/design/models/items/MapModel;Lcom/whoop/core/details/network/model/DetailsEditComponent;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/GraphTitleBar;Lcom/whoop/core/details/network/model/SupplementalData;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;Ljava/util/List;Lcom/whoop/core/details/network/model/MetaData;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;)Lcom/whoop/core/details/network/model/CoreDetailsModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_details_release", "(Lcom/whoop/core/details/network/model/CoreDetailsModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/core/details/network/model/TitleBarModel;", "getTitleBar", "Lcom/whoop/design/models/items/CtaTileModel;", "getLinkWorkoutCtaTile", "Ljava/util/List;", "getOnboardingOverlays", "Lcom/whoop/design/models/items/StrainBreakDownModel;", "getStrainBreakdownModel", "getStrainBreakdownModel$annotations", "()V", "Ljava/lang/Boolean;", "getLinkWorkoutOptionEnabled", "Lcom/whoop/design/models/items/HorizontalStatModel;", "getHorizontalStat", "getHorizontalStats", "Lcom/whoop/design/models/items/KeyMetricCarouselModel;", "getKeyMetricCarousel", "Lcom/whoop/design/models/items/graph/GraphModel;", "getGraphResponse", "Ljava/lang/String;", "getVowResponseString", "Lcom/whoop/design/models/items/WhoopCoachVowModel;", "getWhoopCoachVow", "Lcom/whoop/design/models/items/BarGraphContainerModel;", "getHeartRateZoneContainer", "getHeartRateZoneContainer$annotations", "Lcom/whoop/design/models/items/AchievementProgressCardModel;", "getAchievementProgressCard", "Lcom/whoop/design/models/DesignSystemModel;", "getIntegrationPromoCard", "getMomentEntryPointTile", "Lcom/whoop/design/models/items/AdditionalInfoTextModel;", "getAdditionalInfoText", "Lcom/whoop/design/models/items/MapModel;", "getMap", "Lcom/whoop/core/details/network/model/DetailsEditComponent;", "getDetailsEditComponents", "getGraphId", "getInitialGraphId", "Lcom/whoop/core/details/network/model/GraphTitleBar;", "getGraphTitleBar", "Lcom/whoop/core/details/network/model/SupplementalData;", "getSupplementalData", "getEditable", "getTags", "getTags$annotations", "getTagsV2", "Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;", "getWeightliftingCardioDetails", "getMenuOptions", "Lcom/whoop/core/details/network/model/MetaData;", "getMetadata", "getActivityTargetsMiniArch", "getActivityTargetsMiniArch$annotations", "getDesignItems", "getDesignItems$annotations", "Companion", "$serializer", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CoreDetailsModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final AchievementProgressCardModel achievementProgressCard;
    private final DesignSystemModel activityTargetsMiniArch;
    private final AdditionalInfoTextModel additionalInfoText;
    private final List<DesignSystemModel> designItems;
    private final DetailsEditComponent detailsEditComponents;
    private final Boolean editable;
    private final String graphId;
    private final GraphModel graphResponse;
    private final GraphTitleBar graphTitleBar;
    private final BarGraphContainerModel heartRateZoneContainer;
    private final HorizontalStatModel horizontalStat;
    private final List<HorizontalStatModel> horizontalStats;
    private final String initialGraphId;
    private final DesignSystemModel integrationPromoCard;
    private final KeyMetricCarouselModel keyMetricCarousel;
    private final CtaTileModel linkWorkoutCtaTile;
    private final Boolean linkWorkoutOptionEnabled;
    private final MapModel map;
    private final List<MenuOptionsItem> menuOptions;
    private final MetaData metadata;
    private final DesignSystemModel momentEntryPointTile;
    private final List<String> onboardingOverlays;
    private final StrainBreakDownModel strainBreakdownModel;
    private final SupplementalData supplementalData;
    private final List<TagModel> tags;
    private final List<com.whoop.design.models.items.TagModel> tagsV2;
    private final TitleBarModel titleBar;
    private final String vowResponseString;
    private final WeightliftingCardioDetails weightliftingCardioDetails;
    private final WhoopCoachVowModel whoopCoachVow;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/core/details/network/model/CoreDetailsModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/core/details/network/model/CoreDetailsModel;", "serializer", "()Lwc3/c;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CoreDetailsModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C4744f(27)), null, null, null, AbstractC30060g.m92087G(enumC23463i, new C4744f(28)), null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C4744f(29)), AbstractC30060g.m92087G(enumC23463i, new C6451a(0)), null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C6451a(1)), AbstractC30060g.m92087G(enumC23463i, new C6451a(2)), null, AbstractC30060g.m92087G(enumC23463i, new C6451a(3)), null, AbstractC30060g.m92087G(enumC23463i, new C6451a(4)), AbstractC30060g.m92087G(enumC23463i, new C6451a(5))};
    }

    public /* synthetic */ CoreDetailsModel(int i13, TitleBarModel titleBarModel, CtaTileModel ctaTileModel, List list, StrainBreakDownModel strainBreakDownModel, Boolean bool, HorizontalStatModel horizontalStatModel, List list2, KeyMetricCarouselModel keyMetricCarouselModel, GraphModel graphModel, String str, WhoopCoachVowModel whoopCoachVowModel, BarGraphContainerModel barGraphContainerModel, AchievementProgressCardModel achievementProgressCardModel, DesignSystemModel designSystemModel, DesignSystemModel designSystemModel2, AdditionalInfoTextModel additionalInfoTextModel, MapModel mapModel, DetailsEditComponent detailsEditComponent, String str2, String str3, GraphTitleBar graphTitleBar, SupplementalData supplementalData, Boolean bool2, List list3, List list4, WeightliftingCardioDetails weightliftingCardioDetails, List list5, MetaData metaData, DesignSystemModel designSystemModel3, List list6, SerializationConstructorMarker serializationConstructorMarker) {
        if (268406783 != (i13 & 268406783)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 268406783, CoreDetailsModel$$serializer.INSTANCE.getDescriptor());
        }
        this.titleBar = titleBarModel;
        this.linkWorkoutCtaTile = ctaTileModel;
        this.onboardingOverlays = list;
        this.strainBreakdownModel = strainBreakDownModel;
        this.linkWorkoutOptionEnabled = bool;
        this.horizontalStat = horizontalStatModel;
        this.horizontalStats = list2;
        this.keyMetricCarousel = keyMetricCarouselModel;
        this.graphResponse = graphModel;
        this.vowResponseString = str;
        this.whoopCoachVow = whoopCoachVowModel;
        this.heartRateZoneContainer = barGraphContainerModel;
        if ((i13 & 4096) == 0) {
            this.achievementProgressCard = null;
        } else {
            this.achievementProgressCard = achievementProgressCardModel;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
            this.integrationPromoCard = null;
        } else {
            this.integrationPromoCard = designSystemModel;
        }
        if ((i13 & DfuBaseService.ERROR_CONNECTION_MASK) == 0) {
            this.momentEntryPointTile = null;
        } else {
            this.momentEntryPointTile = designSystemModel2;
        }
        this.additionalInfoText = additionalInfoTextModel;
        this.map = mapModel;
        this.detailsEditComponents = detailsEditComponent;
        this.graphId = str2;
        this.initialGraphId = str3;
        this.graphTitleBar = graphTitleBar;
        this.supplementalData = supplementalData;
        this.editable = bool2;
        this.tags = list3;
        this.tagsV2 = list4;
        this.weightliftingCardioDetails = weightliftingCardioDetails;
        this.menuOptions = list5;
        this.metadata = metaData;
        if ((268435456 & i13) == 0) {
            this.activityTargetsMiniArch = null;
        } else {
            this.activityTargetsMiniArch = designSystemModel3;
        }
        if ((i13 & 536870912) == 0) {
            this.designItems = null;
        } else {
            this.designItems = list6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(HorizontalStatModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$1() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$2() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$3() {
        return new ArrayListSerializer(TagModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$4() {
        return new ArrayListSerializer(com.whoop.design.models.items.TagModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$5() {
        return new ArrayListSerializer(MenuOptionsItem$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$6() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$7() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CoreDetailsModel copy$default(CoreDetailsModel coreDetailsModel, TitleBarModel titleBarModel, CtaTileModel ctaTileModel, List list, StrainBreakDownModel strainBreakDownModel, Boolean bool, HorizontalStatModel horizontalStatModel, List list2, KeyMetricCarouselModel keyMetricCarouselModel, GraphModel graphModel, String str, WhoopCoachVowModel whoopCoachVowModel, BarGraphContainerModel barGraphContainerModel, AchievementProgressCardModel achievementProgressCardModel, DesignSystemModel designSystemModel, DesignSystemModel designSystemModel2, AdditionalInfoTextModel additionalInfoTextModel, MapModel mapModel, DetailsEditComponent detailsEditComponent, String str2, String str3, GraphTitleBar graphTitleBar, SupplementalData supplementalData, Boolean bool2, List list3, List list4, WeightliftingCardioDetails weightliftingCardioDetails, List list5, MetaData metaData, DesignSystemModel designSystemModel3, List list6, int i13, Object obj) {
        List list7;
        DesignSystemModel designSystemModel4;
        TitleBarModel titleBarModel2 = (i13 & 1) != 0 ? coreDetailsModel.titleBar : titleBarModel;
        CtaTileModel ctaTileModel2 = (i13 & 2) != 0 ? coreDetailsModel.linkWorkoutCtaTile : ctaTileModel;
        List list8 = (i13 & 4) != 0 ? coreDetailsModel.onboardingOverlays : list;
        StrainBreakDownModel strainBreakDownModel2 = (i13 & 8) != 0 ? coreDetailsModel.strainBreakdownModel : strainBreakDownModel;
        Boolean bool3 = (i13 & 16) != 0 ? coreDetailsModel.linkWorkoutOptionEnabled : bool;
        HorizontalStatModel horizontalStatModel2 = (i13 & 32) != 0 ? coreDetailsModel.horizontalStat : horizontalStatModel;
        List list9 = (i13 & 64) != 0 ? coreDetailsModel.horizontalStats : list2;
        KeyMetricCarouselModel keyMetricCarouselModel2 = (i13 & 128) != 0 ? coreDetailsModel.keyMetricCarousel : keyMetricCarouselModel;
        GraphModel graphModel2 = (i13 & 256) != 0 ? coreDetailsModel.graphResponse : graphModel;
        String str4 = (i13 & 512) != 0 ? coreDetailsModel.vowResponseString : str;
        WhoopCoachVowModel whoopCoachVowModel2 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? coreDetailsModel.whoopCoachVow : whoopCoachVowModel;
        BarGraphContainerModel barGraphContainerModel2 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? coreDetailsModel.heartRateZoneContainer : barGraphContainerModel;
        AchievementProgressCardModel achievementProgressCardModel2 = (i13 & 4096) != 0 ? coreDetailsModel.achievementProgressCard : achievementProgressCardModel;
        DesignSystemModel designSystemModel5 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? coreDetailsModel.integrationPromoCard : designSystemModel;
        TitleBarModel titleBarModel3 = titleBarModel2;
        DesignSystemModel designSystemModel6 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? coreDetailsModel.momentEntryPointTile : designSystemModel2;
        AdditionalInfoTextModel additionalInfoTextModel2 = (i13 & 32768) != 0 ? coreDetailsModel.additionalInfoText : additionalInfoTextModel;
        MapModel mapModel2 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? coreDetailsModel.map : mapModel;
        DetailsEditComponent detailsEditComponent2 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? coreDetailsModel.detailsEditComponents : detailsEditComponent;
        String str5 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? coreDetailsModel.graphId : str2;
        String str6 = (i13 & 524288) != 0 ? coreDetailsModel.initialGraphId : str3;
        GraphTitleBar graphTitleBar2 = (i13 & 1048576) != 0 ? coreDetailsModel.graphTitleBar : graphTitleBar;
        SupplementalData supplementalData2 = (i13 & 2097152) != 0 ? coreDetailsModel.supplementalData : supplementalData;
        Boolean bool4 = (i13 & 4194304) != 0 ? coreDetailsModel.editable : bool2;
        List list10 = (i13 & 8388608) != 0 ? coreDetailsModel.tags : list3;
        List list11 = (i13 & 16777216) != 0 ? coreDetailsModel.tagsV2 : list4;
        WeightliftingCardioDetails weightliftingCardioDetails2 = (i13 & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? coreDetailsModel.weightliftingCardioDetails : weightliftingCardioDetails;
        List list12 = (i13 & 67108864) != 0 ? coreDetailsModel.menuOptions : list5;
        MetaData metaData2 = (i13 & 134217728) != 0 ? coreDetailsModel.metadata : metaData;
        DesignSystemModel designSystemModel7 = (i13 & 268435456) != 0 ? coreDetailsModel.activityTargetsMiniArch : designSystemModel3;
        if ((i13 & 536870912) != 0) {
            designSystemModel4 = designSystemModel7;
            list7 = coreDetailsModel.designItems;
        } else {
            list7 = list6;
            designSystemModel4 = designSystemModel7;
        }
        return coreDetailsModel.copy(titleBarModel3, ctaTileModel2, list8, strainBreakDownModel2, bool3, horizontalStatModel2, list9, keyMetricCarouselModel2, graphModel2, str4, whoopCoachVowModel2, barGraphContainerModel2, achievementProgressCardModel2, designSystemModel5, designSystemModel6, additionalInfoTextModel2, mapModel2, detailsEditComponent2, str5, str6, graphTitleBar2, supplementalData2, bool4, list10, list11, weightliftingCardioDetails2, list12, metaData2, designSystemModel4, list7);
    }

    @InterfaceC37143h("activity_targets_mini_arch")
    public static /* synthetic */ void getActivityTargetsMiniArch$annotations() {
    }

    @InterfaceC37143h("design_items")
    public static /* synthetic */ void getDesignItems$annotations() {
    }

    @InterfaceC37143h("bar_graph_container")
    public static /* synthetic */ void getHeartRateZoneContainer$annotations() {
    }

    @InterfaceC37143h("strain_breakdown")
    public static /* synthetic */ void getStrainBreakdownModel$annotations() {
    }

    @InterfaceC23457c
    public static /* synthetic */ void getTags$annotations() {
    }

    public static final /* synthetic */ void write$Self$core_details_release(CoreDetailsModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, TitleBarModel$$serializer.INSTANCE, self.titleBar);
        output.encodeNullableSerializableElement(serialDesc, 1, CtaTileModel$$serializer.INSTANCE, self.linkWorkoutCtaTile);
        output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.onboardingOverlays);
        output.encodeNullableSerializableElement(serialDesc, 3, StrainBreakDownModel$$serializer.INSTANCE, self.strainBreakdownModel);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 4, booleanSerializer, self.linkWorkoutOptionEnabled);
        output.encodeSerializableElement(serialDesc, 5, HorizontalStatModel$$serializer.INSTANCE, self.horizontalStat);
        output.encodeSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.horizontalStats);
        output.encodeSerializableElement(serialDesc, 7, KeyMetricCarouselModel$$serializer.INSTANCE, self.keyMetricCarousel);
        output.encodeSerializableElement(serialDesc, 8, GraphModel$$serializer.INSTANCE, self.graphResponse);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 9, stringSerializer, self.vowResponseString);
        output.encodeNullableSerializableElement(serialDesc, 10, WhoopCoachVowModel$$serializer.INSTANCE, self.whoopCoachVow);
        output.encodeNullableSerializableElement(serialDesc, 11, BarGraphContainerModel$$serializer.INSTANCE, self.heartRateZoneContainer);
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.achievementProgressCard != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, AchievementProgressCardModel$$serializer.INSTANCE, self.achievementProgressCard);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.integrationPromoCard != null) {
            output.encodeNullableSerializableElement(serialDesc, 13, (InterfaceC37145j) interfaceC23462hArr[13].getValue(), self.integrationPromoCard);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.momentEntryPointTile != null) {
            output.encodeNullableSerializableElement(serialDesc, 14, (InterfaceC37145j) interfaceC23462hArr[14].getValue(), self.momentEntryPointTile);
        }
        output.encodeNullableSerializableElement(serialDesc, 15, AdditionalInfoTextModel$$serializer.INSTANCE, self.additionalInfoText);
        output.encodeNullableSerializableElement(serialDesc, 16, MapModel$$serializer.INSTANCE, self.map);
        output.encodeSerializableElement(serialDesc, 17, DetailsEditComponent$$serializer.INSTANCE, self.detailsEditComponents);
        output.encodeNullableSerializableElement(serialDesc, 18, stringSerializer, self.graphId);
        output.encodeNullableSerializableElement(serialDesc, 19, stringSerializer, self.initialGraphId);
        output.encodeNullableSerializableElement(serialDesc, 20, GraphTitleBar$$serializer.INSTANCE, self.graphTitleBar);
        output.encodeNullableSerializableElement(serialDesc, 21, SupplementalData$$serializer.INSTANCE, self.supplementalData);
        output.encodeNullableSerializableElement(serialDesc, 22, booleanSerializer, self.editable);
        output.encodeSerializableElement(serialDesc, 23, (InterfaceC37145j) interfaceC23462hArr[23].getValue(), self.tags);
        output.encodeNullableSerializableElement(serialDesc, 24, (InterfaceC37145j) interfaceC23462hArr[24].getValue(), self.tagsV2);
        output.encodeNullableSerializableElement(serialDesc, 25, WeightliftingCardioDetails$$serializer.INSTANCE, self.weightliftingCardioDetails);
        output.encodeNullableSerializableElement(serialDesc, 26, (InterfaceC37145j) interfaceC23462hArr[26].getValue(), self.menuOptions);
        output.encodeNullableSerializableElement(serialDesc, 27, MetaData$$serializer.INSTANCE, self.metadata);
        if (output.shouldEncodeElementDefault(serialDesc, 28) || self.activityTargetsMiniArch != null) {
            output.encodeNullableSerializableElement(serialDesc, 28, (InterfaceC37145j) interfaceC23462hArr[28].getValue(), self.activityTargetsMiniArch);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 29) && self.designItems == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 29, (InterfaceC37145j) interfaceC23462hArr[29].getValue(), self.designItems);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TitleBarModel getTitleBar() {
        return this.titleBar;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getVowResponseString() {
        return this.vowResponseString;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final WhoopCoachVowModel getWhoopCoachVow() {
        return this.whoopCoachVow;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final BarGraphContainerModel getHeartRateZoneContainer() {
        return this.heartRateZoneContainer;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final AchievementProgressCardModel getAchievementProgressCard() {
        return this.achievementProgressCard;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final DesignSystemModel getIntegrationPromoCard() {
        return this.integrationPromoCard;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final DesignSystemModel getMomentEntryPointTile() {
        return this.momentEntryPointTile;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final AdditionalInfoTextModel getAdditionalInfoText() {
        return this.additionalInfoText;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final MapModel getMap() {
        return this.map;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final DetailsEditComponent getDetailsEditComponents() {
        return this.detailsEditComponents;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getGraphId() {
        return this.graphId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CtaTileModel getLinkWorkoutCtaTile() {
        return this.linkWorkoutCtaTile;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getInitialGraphId() {
        return this.initialGraphId;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final GraphTitleBar getGraphTitleBar() {
        return this.graphTitleBar;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final SupplementalData getSupplementalData() {
        return this.supplementalData;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Boolean getEditable() {
        return this.editable;
    }

    public final List<TagModel> component24() {
        return this.tags;
    }

    public final List<com.whoop.design.models.items.TagModel> component25() {
        return this.tagsV2;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final WeightliftingCardioDetails getWeightliftingCardioDetails() {
        return this.weightliftingCardioDetails;
    }

    public final List<MenuOptionsItem> component27() {
        return this.menuOptions;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final MetaData getMetadata() {
        return this.metadata;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final DesignSystemModel getActivityTargetsMiniArch() {
        return this.activityTargetsMiniArch;
    }

    public final List<String> component3() {
        return this.onboardingOverlays;
    }

    public final List<DesignSystemModel> component30() {
        return this.designItems;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final StrainBreakDownModel getStrainBreakdownModel() {
        return this.strainBreakdownModel;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getLinkWorkoutOptionEnabled() {
        return this.linkWorkoutOptionEnabled;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final HorizontalStatModel getHorizontalStat() {
        return this.horizontalStat;
    }

    public final List<HorizontalStatModel> component7() {
        return this.horizontalStats;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final KeyMetricCarouselModel getKeyMetricCarousel() {
        return this.keyMetricCarousel;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final GraphModel getGraphResponse() {
        return this.graphResponse;
    }

    public final CoreDetailsModel copy(TitleBarModel titleBar, CtaTileModel linkWorkoutCtaTile, List<String> onboardingOverlays, StrainBreakDownModel strainBreakdownModel, Boolean linkWorkoutOptionEnabled, HorizontalStatModel horizontalStat, List<HorizontalStatModel> horizontalStats, KeyMetricCarouselModel keyMetricCarousel, GraphModel graphResponse, String vowResponseString, WhoopCoachVowModel whoopCoachVow, BarGraphContainerModel heartRateZoneContainer, AchievementProgressCardModel achievementProgressCard, DesignSystemModel integrationPromoCard, DesignSystemModel momentEntryPointTile, AdditionalInfoTextModel additionalInfoText, MapModel map, DetailsEditComponent detailsEditComponents, String graphId, String initialGraphId, GraphTitleBar graphTitleBar, SupplementalData supplementalData, Boolean editable, List<TagModel> tags, List<com.whoop.design.models.items.TagModel> tagsV2, WeightliftingCardioDetails weightliftingCardioDetails, List<MenuOptionsItem> menuOptions, MetaData metadata, DesignSystemModel activityTargetsMiniArch, List<? extends DesignSystemModel> designItems) {
        AbstractC22676k.m65750j(titleBar, "titleBar");
        AbstractC22676k.m65750j(horizontalStat, "horizontalStat");
        AbstractC22676k.m65750j(horizontalStats, "horizontalStats");
        AbstractC22676k.m65750j(keyMetricCarousel, "keyMetricCarousel");
        AbstractC22676k.m65750j(graphResponse, "graphResponse");
        AbstractC22676k.m65750j(detailsEditComponents, "detailsEditComponents");
        AbstractC22676k.m65750j(tags, "tags");
        return new CoreDetailsModel(titleBar, linkWorkoutCtaTile, onboardingOverlays, strainBreakdownModel, linkWorkoutOptionEnabled, horizontalStat, horizontalStats, keyMetricCarousel, graphResponse, vowResponseString, whoopCoachVow, heartRateZoneContainer, achievementProgressCard, integrationPromoCard, momentEntryPointTile, additionalInfoText, map, detailsEditComponents, graphId, initialGraphId, graphTitleBar, supplementalData, editable, tags, tagsV2, weightliftingCardioDetails, menuOptions, metadata, activityTargetsMiniArch, designItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoreDetailsModel)) {
            return false;
        }
        CoreDetailsModel coreDetailsModel = (CoreDetailsModel) other;
        return AbstractC22676k.m65745e(this.titleBar, coreDetailsModel.titleBar) && AbstractC22676k.m65745e(this.linkWorkoutCtaTile, coreDetailsModel.linkWorkoutCtaTile) && AbstractC22676k.m65745e(this.onboardingOverlays, coreDetailsModel.onboardingOverlays) && AbstractC22676k.m65745e(this.strainBreakdownModel, coreDetailsModel.strainBreakdownModel) && AbstractC22676k.m65745e(this.linkWorkoutOptionEnabled, coreDetailsModel.linkWorkoutOptionEnabled) && AbstractC22676k.m65745e(this.horizontalStat, coreDetailsModel.horizontalStat) && AbstractC22676k.m65745e(this.horizontalStats, coreDetailsModel.horizontalStats) && AbstractC22676k.m65745e(this.keyMetricCarousel, coreDetailsModel.keyMetricCarousel) && AbstractC22676k.m65745e(this.graphResponse, coreDetailsModel.graphResponse) && AbstractC22676k.m65745e(this.vowResponseString, coreDetailsModel.vowResponseString) && AbstractC22676k.m65745e(this.whoopCoachVow, coreDetailsModel.whoopCoachVow) && AbstractC22676k.m65745e(this.heartRateZoneContainer, coreDetailsModel.heartRateZoneContainer) && AbstractC22676k.m65745e(this.achievementProgressCard, coreDetailsModel.achievementProgressCard) && AbstractC22676k.m65745e(this.integrationPromoCard, coreDetailsModel.integrationPromoCard) && AbstractC22676k.m65745e(this.momentEntryPointTile, coreDetailsModel.momentEntryPointTile) && AbstractC22676k.m65745e(this.additionalInfoText, coreDetailsModel.additionalInfoText) && AbstractC22676k.m65745e(this.map, coreDetailsModel.map) && AbstractC22676k.m65745e(this.detailsEditComponents, coreDetailsModel.detailsEditComponents) && AbstractC22676k.m65745e(this.graphId, coreDetailsModel.graphId) && AbstractC22676k.m65745e(this.initialGraphId, coreDetailsModel.initialGraphId) && AbstractC22676k.m65745e(this.graphTitleBar, coreDetailsModel.graphTitleBar) && AbstractC22676k.m65745e(this.supplementalData, coreDetailsModel.supplementalData) && AbstractC22676k.m65745e(this.editable, coreDetailsModel.editable) && AbstractC22676k.m65745e(this.tags, coreDetailsModel.tags) && AbstractC22676k.m65745e(this.tagsV2, coreDetailsModel.tagsV2) && AbstractC22676k.m65745e(this.weightliftingCardioDetails, coreDetailsModel.weightliftingCardioDetails) && AbstractC22676k.m65745e(this.menuOptions, coreDetailsModel.menuOptions) && AbstractC22676k.m65745e(this.metadata, coreDetailsModel.metadata) && AbstractC22676k.m65745e(this.activityTargetsMiniArch, coreDetailsModel.activityTargetsMiniArch) && AbstractC22676k.m65745e(this.designItems, coreDetailsModel.designItems);
    }

    public final AchievementProgressCardModel getAchievementProgressCard() {
        return this.achievementProgressCard;
    }

    public final DesignSystemModel getActivityTargetsMiniArch() {
        return this.activityTargetsMiniArch;
    }

    public final AdditionalInfoTextModel getAdditionalInfoText() {
        return this.additionalInfoText;
    }

    public final List<DesignSystemModel> getDesignItems() {
        return this.designItems;
    }

    public final DetailsEditComponent getDetailsEditComponents() {
        return this.detailsEditComponents;
    }

    public final Boolean getEditable() {
        return this.editable;
    }

    public final String getGraphId() {
        return this.graphId;
    }

    public final GraphModel getGraphResponse() {
        return this.graphResponse;
    }

    public final GraphTitleBar getGraphTitleBar() {
        return this.graphTitleBar;
    }

    public final BarGraphContainerModel getHeartRateZoneContainer() {
        return this.heartRateZoneContainer;
    }

    public final HorizontalStatModel getHorizontalStat() {
        return this.horizontalStat;
    }

    public final List<HorizontalStatModel> getHorizontalStats() {
        return this.horizontalStats;
    }

    public final String getInitialGraphId() {
        return this.initialGraphId;
    }

    public final DesignSystemModel getIntegrationPromoCard() {
        return this.integrationPromoCard;
    }

    public final KeyMetricCarouselModel getKeyMetricCarousel() {
        return this.keyMetricCarousel;
    }

    public final CtaTileModel getLinkWorkoutCtaTile() {
        return this.linkWorkoutCtaTile;
    }

    public final Boolean getLinkWorkoutOptionEnabled() {
        return this.linkWorkoutOptionEnabled;
    }

    public final MapModel getMap() {
        return this.map;
    }

    public final List<MenuOptionsItem> getMenuOptions() {
        return this.menuOptions;
    }

    public final MetaData getMetadata() {
        return this.metadata;
    }

    public final DesignSystemModel getMomentEntryPointTile() {
        return this.momentEntryPointTile;
    }

    public final List<String> getOnboardingOverlays() {
        return this.onboardingOverlays;
    }

    public final StrainBreakDownModel getStrainBreakdownModel() {
        return this.strainBreakdownModel;
    }

    public final SupplementalData getSupplementalData() {
        return this.supplementalData;
    }

    public final List<TagModel> getTags() {
        return this.tags;
    }

    public final List<com.whoop.design.models.items.TagModel> getTagsV2() {
        return this.tagsV2;
    }

    public final TitleBarModel getTitleBar() {
        return this.titleBar;
    }

    public final String getVowResponseString() {
        return this.vowResponseString;
    }

    public final WeightliftingCardioDetails getWeightliftingCardioDetails() {
        return this.weightliftingCardioDetails;
    }

    public final WhoopCoachVowModel getWhoopCoachVow() {
        return this.whoopCoachVow;
    }

    public int hashCode() {
        int iHashCode = this.titleBar.hashCode() * 31;
        CtaTileModel ctaTileModel = this.linkWorkoutCtaTile;
        int iHashCode2 = (iHashCode + (ctaTileModel == null ? 0 : ctaTileModel.hashCode())) * 31;
        List<String> list = this.onboardingOverlays;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        StrainBreakDownModel strainBreakDownModel = this.strainBreakdownModel;
        int iHashCode4 = (iHashCode3 + (strainBreakDownModel == null ? 0 : strainBreakDownModel.hashCode())) * 31;
        Boolean bool = this.linkWorkoutOptionEnabled;
        int iHashCode5 = (this.graphResponse.hashCode() + ((this.keyMetricCarousel.hashCode() + AbstractC11895b.m31983b((this.horizontalStat.hashCode() + ((iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31)) * 31, 31, this.horizontalStats)) * 31)) * 31;
        String str = this.vowResponseString;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        WhoopCoachVowModel whoopCoachVowModel = this.whoopCoachVow;
        int iHashCode7 = (iHashCode6 + (whoopCoachVowModel == null ? 0 : whoopCoachVowModel.hashCode())) * 31;
        BarGraphContainerModel barGraphContainerModel = this.heartRateZoneContainer;
        int iHashCode8 = (iHashCode7 + (barGraphContainerModel == null ? 0 : barGraphContainerModel.hashCode())) * 31;
        AchievementProgressCardModel achievementProgressCardModel = this.achievementProgressCard;
        int iHashCode9 = (iHashCode8 + (achievementProgressCardModel == null ? 0 : achievementProgressCardModel.hashCode())) * 31;
        DesignSystemModel designSystemModel = this.integrationPromoCard;
        int iHashCode10 = (iHashCode9 + (designSystemModel == null ? 0 : designSystemModel.hashCode())) * 31;
        DesignSystemModel designSystemModel2 = this.momentEntryPointTile;
        int iHashCode11 = (iHashCode10 + (designSystemModel2 == null ? 0 : designSystemModel2.hashCode())) * 31;
        AdditionalInfoTextModel additionalInfoTextModel = this.additionalInfoText;
        int iHashCode12 = (iHashCode11 + (additionalInfoTextModel == null ? 0 : additionalInfoTextModel.hashCode())) * 31;
        MapModel mapModel = this.map;
        int iHashCode13 = (this.detailsEditComponents.hashCode() + ((iHashCode12 + (mapModel == null ? 0 : mapModel.hashCode())) * 31)) * 31;
        String str2 = this.graphId;
        int iHashCode14 = (iHashCode13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.initialGraphId;
        int iHashCode15 = (iHashCode14 + (str3 == null ? 0 : str3.hashCode())) * 31;
        GraphTitleBar graphTitleBar = this.graphTitleBar;
        int iHashCode16 = (iHashCode15 + (graphTitleBar == null ? 0 : graphTitleBar.hashCode())) * 31;
        SupplementalData supplementalData = this.supplementalData;
        int iHashCode17 = (iHashCode16 + (supplementalData == null ? 0 : supplementalData.hashCode())) * 31;
        Boolean bool2 = this.editable;
        int iM31983b = AbstractC11895b.m31983b((iHashCode17 + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.tags);
        List<com.whoop.design.models.items.TagModel> list2 = this.tagsV2;
        int iHashCode18 = (iM31983b + (list2 == null ? 0 : list2.hashCode())) * 31;
        WeightliftingCardioDetails weightliftingCardioDetails = this.weightliftingCardioDetails;
        int iHashCode19 = (iHashCode18 + (weightliftingCardioDetails == null ? 0 : weightliftingCardioDetails.hashCode())) * 31;
        List<MenuOptionsItem> list3 = this.menuOptions;
        int iHashCode20 = (iHashCode19 + (list3 == null ? 0 : list3.hashCode())) * 31;
        MetaData metaData = this.metadata;
        int iHashCode21 = (iHashCode20 + (metaData == null ? 0 : metaData.hashCode())) * 31;
        DesignSystemModel designSystemModel3 = this.activityTargetsMiniArch;
        int iHashCode22 = (iHashCode21 + (designSystemModel3 == null ? 0 : designSystemModel3.hashCode())) * 31;
        List<DesignSystemModel> list4 = this.designItems;
        return iHashCode22 + (list4 != null ? list4.hashCode() : 0);
    }

    public String toString() {
        TitleBarModel titleBarModel = this.titleBar;
        CtaTileModel ctaTileModel = this.linkWorkoutCtaTile;
        List<String> list = this.onboardingOverlays;
        StrainBreakDownModel strainBreakDownModel = this.strainBreakdownModel;
        Boolean bool = this.linkWorkoutOptionEnabled;
        HorizontalStatModel horizontalStatModel = this.horizontalStat;
        List<HorizontalStatModel> list2 = this.horizontalStats;
        KeyMetricCarouselModel keyMetricCarouselModel = this.keyMetricCarousel;
        GraphModel graphModel = this.graphResponse;
        String str = this.vowResponseString;
        WhoopCoachVowModel whoopCoachVowModel = this.whoopCoachVow;
        BarGraphContainerModel barGraphContainerModel = this.heartRateZoneContainer;
        AchievementProgressCardModel achievementProgressCardModel = this.achievementProgressCard;
        DesignSystemModel designSystemModel = this.integrationPromoCard;
        DesignSystemModel designSystemModel2 = this.momentEntryPointTile;
        AdditionalInfoTextModel additionalInfoTextModel = this.additionalInfoText;
        MapModel mapModel = this.map;
        DetailsEditComponent detailsEditComponent = this.detailsEditComponents;
        String str2 = this.graphId;
        String str3 = this.initialGraphId;
        GraphTitleBar graphTitleBar = this.graphTitleBar;
        SupplementalData supplementalData = this.supplementalData;
        Boolean bool2 = this.editable;
        List<TagModel> list3 = this.tags;
        List<com.whoop.design.models.items.TagModel> list4 = this.tagsV2;
        WeightliftingCardioDetails weightliftingCardioDetails = this.weightliftingCardioDetails;
        List<MenuOptionsItem> list5 = this.menuOptions;
        MetaData metaData = this.metadata;
        DesignSystemModel designSystemModel3 = this.activityTargetsMiniArch;
        List<DesignSystemModel> list6 = this.designItems;
        StringBuilder sb4 = new StringBuilder("CoreDetailsModel(titleBar=");
        sb4.append(titleBarModel);
        sb4.append(", linkWorkoutCtaTile=");
        sb4.append(ctaTileModel);
        sb4.append(", onboardingOverlays=");
        sb4.append(list);
        sb4.append(", strainBreakdownModel=");
        sb4.append(strainBreakDownModel);
        sb4.append(", linkWorkoutOptionEnabled=");
        sb4.append(bool);
        sb4.append(", horizontalStat=");
        sb4.append(horizontalStatModel);
        sb4.append(", horizontalStats=");
        sb4.append(list2);
        sb4.append(", keyMetricCarousel=");
        sb4.append(keyMetricCarouselModel);
        sb4.append(", graphResponse=");
        sb4.append(graphModel);
        sb4.append(", vowResponseString=");
        sb4.append(str);
        sb4.append(", whoopCoachVow=");
        sb4.append(whoopCoachVowModel);
        sb4.append(", heartRateZoneContainer=");
        sb4.append(barGraphContainerModel);
        sb4.append(", achievementProgressCard=");
        sb4.append(achievementProgressCardModel);
        sb4.append(", integrationPromoCard=");
        sb4.append(designSystemModel);
        sb4.append(", momentEntryPointTile=");
        sb4.append(designSystemModel2);
        sb4.append(", additionalInfoText=");
        sb4.append(additionalInfoTextModel);
        sb4.append(", map=");
        sb4.append(mapModel);
        sb4.append(", detailsEditComponents=");
        sb4.append(detailsEditComponent);
        sb4.append(", graphId=");
        AbstractC11266d.m30444B(sb4, str2, ", initialGraphId=", str3, ", graphTitleBar=");
        sb4.append(graphTitleBar);
        sb4.append(", supplementalData=");
        sb4.append(supplementalData);
        sb4.append(", editable=");
        sb4.append(bool2);
        sb4.append(", tags=");
        sb4.append(list3);
        sb4.append(", tagsV2=");
        sb4.append(list4);
        sb4.append(", weightliftingCardioDetails=");
        sb4.append(weightliftingCardioDetails);
        sb4.append(", menuOptions=");
        sb4.append(list5);
        sb4.append(", metadata=");
        sb4.append(metaData);
        sb4.append(", activityTargetsMiniArch=");
        sb4.append(designSystemModel3);
        sb4.append(", designItems=");
        sb4.append(list6);
        sb4.append(")");
        return sb4.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CoreDetailsModel(TitleBarModel titleBar, CtaTileModel ctaTileModel, List<String> list, StrainBreakDownModel strainBreakDownModel, Boolean bool, HorizontalStatModel horizontalStat, List<HorizontalStatModel> horizontalStats, KeyMetricCarouselModel keyMetricCarousel, GraphModel graphResponse, String str, WhoopCoachVowModel whoopCoachVowModel, BarGraphContainerModel barGraphContainerModel, AchievementProgressCardModel achievementProgressCardModel, DesignSystemModel designSystemModel, DesignSystemModel designSystemModel2, AdditionalInfoTextModel additionalInfoTextModel, MapModel mapModel, DetailsEditComponent detailsEditComponents, String str2, String str3, GraphTitleBar graphTitleBar, SupplementalData supplementalData, Boolean bool2, List<TagModel> tags, List<com.whoop.design.models.items.TagModel> list2, WeightliftingCardioDetails weightliftingCardioDetails, List<MenuOptionsItem> list3, MetaData metaData, DesignSystemModel designSystemModel3, List<? extends DesignSystemModel> list4) {
        AbstractC22676k.m65750j(titleBar, "titleBar");
        AbstractC22676k.m65750j(horizontalStat, "horizontalStat");
        AbstractC22676k.m65750j(horizontalStats, "horizontalStats");
        AbstractC22676k.m65750j(keyMetricCarousel, "keyMetricCarousel");
        AbstractC22676k.m65750j(graphResponse, "graphResponse");
        AbstractC22676k.m65750j(detailsEditComponents, "detailsEditComponents");
        AbstractC22676k.m65750j(tags, "tags");
        this.titleBar = titleBar;
        this.linkWorkoutCtaTile = ctaTileModel;
        this.onboardingOverlays = list;
        this.strainBreakdownModel = strainBreakDownModel;
        this.linkWorkoutOptionEnabled = bool;
        this.horizontalStat = horizontalStat;
        this.horizontalStats = horizontalStats;
        this.keyMetricCarousel = keyMetricCarousel;
        this.graphResponse = graphResponse;
        this.vowResponseString = str;
        this.whoopCoachVow = whoopCoachVowModel;
        this.heartRateZoneContainer = barGraphContainerModel;
        this.achievementProgressCard = achievementProgressCardModel;
        this.integrationPromoCard = designSystemModel;
        this.momentEntryPointTile = designSystemModel2;
        this.additionalInfoText = additionalInfoTextModel;
        this.map = mapModel;
        this.detailsEditComponents = detailsEditComponents;
        this.graphId = str2;
        this.initialGraphId = str3;
        this.graphTitleBar = graphTitleBar;
        this.supplementalData = supplementalData;
        this.editable = bool2;
        this.tags = tags;
        this.tagsV2 = list2;
        this.weightliftingCardioDetails = weightliftingCardioDetails;
        this.menuOptions = list3;
        this.metadata = metaData;
        this.activityTargetsMiniArch = designSystemModel3;
        this.designItems = list4;
    }

    public /* synthetic */ CoreDetailsModel(TitleBarModel titleBarModel, CtaTileModel ctaTileModel, List list, StrainBreakDownModel strainBreakDownModel, Boolean bool, HorizontalStatModel horizontalStatModel, List list2, KeyMetricCarouselModel keyMetricCarouselModel, GraphModel graphModel, String str, WhoopCoachVowModel whoopCoachVowModel, BarGraphContainerModel barGraphContainerModel, AchievementProgressCardModel achievementProgressCardModel, DesignSystemModel designSystemModel, DesignSystemModel designSystemModel2, AdditionalInfoTextModel additionalInfoTextModel, MapModel mapModel, DetailsEditComponent detailsEditComponent, String str2, String str3, GraphTitleBar graphTitleBar, SupplementalData supplementalData, Boolean bool2, List list3, List list4, WeightliftingCardioDetails weightliftingCardioDetails, List list5, MetaData metaData, DesignSystemModel designSystemModel3, List list6, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(titleBarModel, ctaTileModel, list, strainBreakDownModel, bool, horizontalStatModel, list2, keyMetricCarouselModel, graphModel, str, whoopCoachVowModel, barGraphContainerModel, (i13 & 4096) != 0 ? null : achievementProgressCardModel, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : designSystemModel, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : designSystemModel2, additionalInfoTextModel, mapModel, detailsEditComponent, str2, str3, graphTitleBar, supplementalData, bool2, list3, list4, weightliftingCardioDetails, list5, metaData, (268435456 & i13) != 0 ? null : designSystemModel3, (i13 & 536870912) != 0 ? null : list6);
    }
}
