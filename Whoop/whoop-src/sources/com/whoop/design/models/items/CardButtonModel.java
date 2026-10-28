package com.whoop.design.models.items;

import androidx.profileinstaller.ProfileVerifier;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.AnalyticEventModel$$serializer;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.DismissEventModel;
import com.whoop.navigation.DismissEventModel$$serializer;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.whoopaction.domain.models.Action;
import java.lang.annotation.Annotation;
import java.util.Map;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import un1.C35100f;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\b\u0087\b\u0018\u0000 \u0087\u00012\u00020\u00012\u00020\u0002:\u0004\u0088\u0001\u0087\u0001B \u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001e\u0012+\b\u0002\u0010%\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020 \u0018\u00010\u001ej\u0004\u0018\u0001`!¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\t0$¢\u0006\u0004\b&\u0010'Bû\u0001\b\u0010\u0012\u0006\u0010)\u001a\u00020(\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001e\u0012\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020 \u0018\u00010\u001e\u0012\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b&\u0010,J#\u0010/\u001a\u00020\u00022\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020-0\u001eH\u0016¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b5\u00102J\u0012\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b6\u00102J\u0012\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b7\u00102J\u0010\u00108\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b8\u00102J\u0012\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b9\u00102J\u0012\u0010:\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bB\u00102J\u0012\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bC\u00102J\u0012\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bD\u00102J\u0012\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bE\u00102J\u0012\u0010F\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0012\u0010H\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0012\u0010J\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u001e\u0010L\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bL\u0010MJ3\u0010N\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020 \u0018\u00010\u001ej\u0004\u0018\u0001`!¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\t0$HÆ\u0003¢\u0006\u0004\bN\u0010MJ©\u0002\u0010O\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001e2+\b\u0002\u0010%\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020 \u0018\u00010\u001ej\u0004\u0018\u0001`!¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\t0$HÆ\u0001¢\u0006\u0004\bO\u0010PJ\u0010\u0010Q\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\bQ\u00102J\u0010\u0010R\u001a\u00020(HÖ\u0001¢\u0006\u0004\bR\u0010SJ\u001a\u0010U\u001a\u00020\u001a2\b\u0010T\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\bU\u0010VJ'\u0010_\u001a\u00020\\2\u0006\u0010W\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020X2\u0006\u0010[\u001a\u00020ZH\u0001¢\u0006\u0004\b]\u0010^R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010`\u001a\u0004\ba\u00102R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010b\u001a\u0004\bc\u00104R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010`\u001a\u0004\bd\u00102R\"\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010`\u0012\u0004\bf\u0010g\u001a\u0004\be\u00102R\"\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010`\u0012\u0004\bi\u0010g\u001a\u0004\bh\u00102R\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010`\u001a\u0004\bj\u00102R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010`\u001a\u0004\bk\u00102R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010l\u0012\u0004\bn\u0010g\u001a\u0004\bm\u0010;R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010o\u0012\u0004\bq\u0010g\u001a\u0004\bp\u0010=R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010r\u001a\u0004\bs\u0010?R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010t\u001a\u0004\bu\u0010AR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010`\u001a\u0004\bv\u00102R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010`\u001a\u0004\bw\u00102R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010`\u001a\u0004\bx\u00102R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010`\u001a\u0004\by\u00102R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010z\u0012\u0004\b|\u0010g\u001a\u0004\b{\u0010GR\"\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010}\u0012\u0004\b~\u0010g\u001a\u0004\b\u001b\u0010IR\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\r\n\u0004\b\u001d\u0010\u007f\u001a\u0005\b\u0080\u0001\u0010KR4\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001e8\u0016@\u0016X\u0096\u000e¢\u0006\u0016\n\u0005\b\u001f\u0010\u0081\u0001\u001a\u0005\b\u0082\u0001\u0010M\"\u0006\b\u0083\u0001\u0010\u0084\u0001RI\u0010%\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020 \u0018\u00010\u001ej\u0004\u0018\u0001`!¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\t0$8\u0016@\u0016X\u0096\u000e¢\u0006\u0016\n\u0005\b%\u0010\u0081\u0001\u001a\u0005\b\u0085\u0001\u0010M\"\u0006\b\u0086\u0001\u0010\u0084\u0001¨\u0006\u0089\u0001"}, m65681d2 = {"Lcom/whoop/design/models/items/CardButtonModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "", "id", "Lcom/whoop/design/util/TextResource;", "title", "icon", "cardName", "featureType", "style", "backgroundStyle", "Lcom/whoop/navigation/e;", "destination", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "Lcom/whoop/design/models/modal/AnyModal;", "modal", "size", "textStyle", "cornerRadius", "iconConfiguration", "Lcom/whoop/navigation/DismissEventModel;", "dismissEvent", "", "isEnabled", "Lcom/whoop/navigation/models/GenericInteraction;", "genericInteraction", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "aggregateBindings", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/models/modal/AnyModal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/DismissEventModel;Ljava/lang/Boolean;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/models/modal/AnyModal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/DismissEventModel;Ljava/lang/Boolean;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/util/TextResource;", "component3", "component4", "component5", "component6", "component7", "component8", "()Lcom/whoop/navigation/e;", "component9", "()Lcom/whoop/whoopaction/domain/models/Action;", "component10", "()Lcom/whoop/analytics/AnalyticEventModel;", "component11", "()Lcom/whoop/design/models/modal/AnyModal;", "component12", "component13", "component14", "component15", "component16", "()Lcom/whoop/navigation/DismissEventModel;", "component17", "()Ljava/lang/Boolean;", "component18", "()Lcom/whoop/navigation/models/GenericInteraction;", "component19", "()Ljava/util/Map;", "component20", "copy", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/models/modal/AnyModal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/DismissEventModel;Ljava/lang/Boolean;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/CardButtonModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/CardButtonModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "Lcom/whoop/design/util/TextResource;", "getTitle", "getIcon", "getCardName", "getCardName$annotations", "()V", "getFeatureType", "getFeatureType$annotations", "getStyle", "getBackgroundStyle", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "Lcom/whoop/whoopaction/domain/models/Action;", "getAction", "getAction$annotations", "Lcom/whoop/analytics/AnalyticEventModel;", "getAnalyticEvent", "Lcom/whoop/design/models/modal/AnyModal;", "getModal", "getSize", "getTextStyle", "getCornerRadius", "getIconConfiguration", "Lcom/whoop/navigation/DismissEventModel;", "getDismissEvent", "getDismissEvent$annotations", "Ljava/lang/Boolean;", "isEnabled$annotations", "Lcom/whoop/navigation/models/GenericInteraction;", "getGenericInteraction", "Ljava/util/Map;", "getBindings", "setBindings", "(Ljava/util/Map;)V", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CardButtonModel implements DesignSystemModel, WithGeneratedBindings {
    private static final InterfaceC23462h[] $childSerializers;
    private final Action action;
    private Map<String, AggregateBinding> aggregateBindings;
    private final AnalyticEventModel analyticEvent;
    private final String backgroundStyle;
    private Map<String, String> bindings;
    private final String cardName;
    private final String cornerRadius;
    private final C9598e destination;
    private final DismissEventModel dismissEvent;
    private final String featureType;
    private final GenericInteraction genericInteraction;
    private final String icon;
    private final String iconConfiguration;
    private final String id;
    private final Boolean isEnabled;
    private final AnyModal modal;
    private final String size;
    private final String style;
    private final String textStyle;
    private final TextResource title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/CardButtonModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/CardButtonModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CardButtonModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C35100f(10)), AbstractC30060g.m92087G(enumC23463i, new C35100f(11)), null, AbstractC30060g.m92087G(enumC23463i, new C35100f(12)), null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C35100f(13)), null};
    }

    public CardButtonModel() {
        this((String) null, (TextResource) null, (String) null, (String) null, (String) null, (String) null, (String) null, (C9598e) null, (Action) null, (AnalyticEventModel) null, (AnyModal) null, (String) null, (String) null, (String) null, (String) null, (DismissEventModel) null, (Boolean) null, (GenericInteraction) null, (Map) null, (Map) null, 1048575, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(Action.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(Action.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return AnyModal.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$2() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardButtonModel copy$default(CardButtonModel cardButtonModel, String str, TextResource textResource, String str2, String str3, String str4, String str5, String str6, C9598e c9598e, Action action, AnalyticEventModel analyticEventModel, AnyModal anyModal, String str7, String str8, String str9, String str10, DismissEventModel dismissEventModel, Boolean bool, GenericInteraction genericInteraction, Map map, Map map2, int i13, Object obj) {
        Map map3;
        Map map4;
        String str11 = (i13 & 1) != 0 ? cardButtonModel.id : str;
        TextResource textResource2 = (i13 & 2) != 0 ? cardButtonModel.title : textResource;
        String str12 = (i13 & 4) != 0 ? cardButtonModel.icon : str2;
        String str13 = (i13 & 8) != 0 ? cardButtonModel.cardName : str3;
        String str14 = (i13 & 16) != 0 ? cardButtonModel.featureType : str4;
        String str15 = (i13 & 32) != 0 ? cardButtonModel.style : str5;
        String str16 = (i13 & 64) != 0 ? cardButtonModel.backgroundStyle : str6;
        C9598e c9598e2 = (i13 & 128) != 0 ? cardButtonModel.destination : c9598e;
        Action action2 = (i13 & 256) != 0 ? cardButtonModel.action : action;
        AnalyticEventModel analyticEventModel2 = (i13 & 512) != 0 ? cardButtonModel.analyticEvent : analyticEventModel;
        AnyModal anyModal2 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? cardButtonModel.modal : anyModal;
        String str17 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? cardButtonModel.size : str7;
        String str18 = (i13 & 4096) != 0 ? cardButtonModel.textStyle : str8;
        String str19 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? cardButtonModel.cornerRadius : str9;
        String str20 = str11;
        String str21 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? cardButtonModel.iconConfiguration : str10;
        DismissEventModel dismissEventModel2 = (i13 & 32768) != 0 ? cardButtonModel.dismissEvent : dismissEventModel;
        Boolean bool2 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? cardButtonModel.isEnabled : bool;
        GenericInteraction genericInteraction2 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? cardButtonModel.genericInteraction : genericInteraction;
        Map map5 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? cardButtonModel.bindings : map;
        if ((i13 & 524288) != 0) {
            map4 = map5;
            map3 = cardButtonModel.aggregateBindings;
        } else {
            map3 = map2;
            map4 = map5;
        }
        return cardButtonModel.copy(str20, textResource2, str12, str13, str14, str15, str16, c9598e2, action2, analyticEventModel2, anyModal2, str17, str18, str19, str21, dismissEventModel2, bool2, genericInteraction2, map4, map3);
    }

    public static /* synthetic */ void getAction$annotations() {
    }

    @InterfaceC37143h("card_name")
    public static /* synthetic */ void getCardName$annotations() {
    }

    public static /* synthetic */ void getDestination$annotations() {
    }

    @InterfaceC37143h("dismiss_event")
    public static /* synthetic */ void getDismissEvent$annotations() {
    }

    @InterfaceC37143h("feature_type")
    public static /* synthetic */ void getFeatureType$annotations() {
    }

    @InterfaceC37143h("is_enabled")
    public static /* synthetic */ void isEnabled$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(CardButtonModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.id != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.title, AbstractC8693b.m21267a())) {
            output.encodeSerializableElement(serialDesc, 1, C25452a.f99689a, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.icon != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.icon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.cardName != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.cardName);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.featureType != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.featureType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !AbstractC22676k.m65745e(self.style, "")) {
            output.encodeStringElement(serialDesc, 5, self.style);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.backgroundStyle != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.backgroundStyle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.destination != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.destination);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.action != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.action);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.analyticEvent != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, AnalyticEventModel$$serializer.INSTANCE, self.analyticEvent);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.modal != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, (InterfaceC37145j) interfaceC23462hArr[10].getValue(), self.modal);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.size != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, StringSerializer.INSTANCE, self.size);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.textStyle != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, StringSerializer.INSTANCE, self.textStyle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.cornerRadius != null) {
            output.encodeNullableSerializableElement(serialDesc, 13, StringSerializer.INSTANCE, self.cornerRadius);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.iconConfiguration != null) {
            output.encodeNullableSerializableElement(serialDesc, 14, StringSerializer.INSTANCE, self.iconConfiguration);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 15) || self.dismissEvent != null) {
            output.encodeNullableSerializableElement(serialDesc, 15, DismissEventModel$$serializer.INSTANCE, self.dismissEvent);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 16) || self.isEnabled != null) {
            output.encodeNullableSerializableElement(serialDesc, 16, BooleanSerializer.INSTANCE, self.isEnabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 17) || self.genericInteraction != null) {
            output.encodeNullableSerializableElement(serialDesc, 17, GenericInteraction$$serializer.INSTANCE, self.genericInteraction);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 18) || self.getBindings() != null) {
            output.encodeNullableSerializableElement(serialDesc, 18, (InterfaceC37145j) interfaceC23462hArr[18].getValue(), self.getBindings());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 19) && self.getAggregateBindings() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 19, LenientAggregateBindingsSerializer.INSTANCE, self.getAggregateBindings());
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public WithGeneratedBindings bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        return CardButtonModelStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final AnyModal getModal() {
        return this.modal;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getTextStyle() {
        return this.textStyle;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getCornerRadius() {
        return this.cornerRadius;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getIconConfiguration() {
        return this.iconConfiguration;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final DismissEventModel getDismissEvent() {
        return this.dismissEvent;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final GenericInteraction getGenericInteraction() {
        return this.genericInteraction;
    }

    public final Map<String, String> component19() {
        return this.bindings;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public final Map<String, AggregateBinding> component20() {
        return this.aggregateBindings;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCardName() {
        return this.cardName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFeatureType() {
        return this.featureType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getBackgroundStyle() {
        return this.backgroundStyle;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    public final CardButtonModel copy(String id4, TextResource title, String icon, String cardName, String featureType, String style, String backgroundStyle, C9598e destination, Action action, AnalyticEventModel analyticEvent, AnyModal modal, String size, String textStyle, String cornerRadius, String iconConfiguration, DismissEventModel dismissEvent, Boolean isEnabled, GenericInteraction genericInteraction, Map<String, String> bindings, Map<String, AggregateBinding> aggregateBindings) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(style, "style");
        return new CardButtonModel(id4, title, icon, cardName, featureType, style, backgroundStyle, destination, action, analyticEvent, modal, size, textStyle, cornerRadius, iconConfiguration, dismissEvent, isEnabled, genericInteraction, bindings, aggregateBindings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardButtonModel)) {
            return false;
        }
        CardButtonModel cardButtonModel = (CardButtonModel) other;
        return AbstractC22676k.m65745e(this.id, cardButtonModel.id) && AbstractC22676k.m65745e(this.title, cardButtonModel.title) && AbstractC22676k.m65745e(this.icon, cardButtonModel.icon) && AbstractC22676k.m65745e(this.cardName, cardButtonModel.cardName) && AbstractC22676k.m65745e(this.featureType, cardButtonModel.featureType) && AbstractC22676k.m65745e(this.style, cardButtonModel.style) && AbstractC22676k.m65745e(this.backgroundStyle, cardButtonModel.backgroundStyle) && AbstractC22676k.m65745e(this.destination, cardButtonModel.destination) && AbstractC22676k.m65745e(this.action, cardButtonModel.action) && AbstractC22676k.m65745e(this.analyticEvent, cardButtonModel.analyticEvent) && AbstractC22676k.m65745e(this.modal, cardButtonModel.modal) && AbstractC22676k.m65745e(this.size, cardButtonModel.size) && AbstractC22676k.m65745e(this.textStyle, cardButtonModel.textStyle) && AbstractC22676k.m65745e(this.cornerRadius, cardButtonModel.cornerRadius) && AbstractC22676k.m65745e(this.iconConfiguration, cardButtonModel.iconConfiguration) && AbstractC22676k.m65745e(this.dismissEvent, cardButtonModel.dismissEvent) && AbstractC22676k.m65745e(this.isEnabled, cardButtonModel.isEnabled) && AbstractC22676k.m65745e(this.genericInteraction, cardButtonModel.genericInteraction) && AbstractC22676k.m65745e(this.bindings, cardButtonModel.bindings) && AbstractC22676k.m65745e(this.aggregateBindings, cardButtonModel.aggregateBindings);
    }

    public final Action getAction() {
        return this.action;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    public final String getBackgroundStyle() {
        return this.backgroundStyle;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final String getCardName() {
        return this.cardName;
    }

    public final String getCornerRadius() {
        return this.cornerRadius;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final DismissEventModel getDismissEvent() {
        return this.dismissEvent;
    }

    public final String getFeatureType() {
        return this.featureType;
    }

    public final GenericInteraction getGenericInteraction() {
        return this.genericInteraction;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getIconConfiguration() {
        return this.iconConfiguration;
    }

    public final String getId() {
        return this.id;
    }

    public final AnyModal getModal() {
        return this.modal;
    }

    public final String getSize() {
        return this.size;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getTextStyle() {
        return this.textStyle;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.id;
        int iM95625a = AbstractC31061c.m95625a((str == null ? 0 : str.hashCode()) * 31, this.title, 31);
        String str2 = this.icon;
        int iHashCode = (iM95625a + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cardName;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.featureType;
        int iM30450d = AbstractC11266d.m30450d((iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.style);
        String str5 = this.backgroundStyle;
        int iHashCode3 = (iM30450d + (str5 == null ? 0 : str5.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iHashCode4 = (iHashCode3 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        Action action = this.action;
        int iHashCode5 = (iHashCode4 + (action == null ? 0 : action.hashCode())) * 31;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        int iHashCode6 = (iHashCode5 + (analyticEventModel == null ? 0 : analyticEventModel.hashCode())) * 31;
        AnyModal anyModal = this.modal;
        int iHashCode7 = (iHashCode6 + (anyModal == null ? 0 : anyModal.hashCode())) * 31;
        String str6 = this.size;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.textStyle;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.cornerRadius;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.iconConfiguration;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        DismissEventModel dismissEventModel = this.dismissEvent;
        int iHashCode12 = (iHashCode11 + (dismissEventModel == null ? 0 : dismissEventModel.hashCode())) * 31;
        Boolean bool = this.isEnabled;
        int iHashCode13 = (iHashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        GenericInteraction genericInteraction = this.genericInteraction;
        int iHashCode14 = (iHashCode13 + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
        Map<String, String> map = this.bindings;
        int iHashCode15 = (iHashCode14 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        return iHashCode15 + (map2 != null ? map2.hashCode() : 0);
    }

    public final Boolean isEnabled() {
        return this.isEnabled;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public void setAggregateBindings(Map<String, AggregateBinding> map) {
        this.aggregateBindings = map;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public void setBindings(Map<String, String> map) {
        this.bindings = map;
    }

    public String toString() {
        String str = this.id;
        TextResource textResource = this.title;
        String str2 = this.icon;
        String str3 = this.cardName;
        String str4 = this.featureType;
        String str5 = this.style;
        String str6 = this.backgroundStyle;
        C9598e c9598e = this.destination;
        Action action = this.action;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        AnyModal anyModal = this.modal;
        String str7 = this.size;
        String str8 = this.textStyle;
        String str9 = this.cornerRadius;
        String str10 = this.iconConfiguration;
        DismissEventModel dismissEventModel = this.dismissEvent;
        Boolean bool = this.isEnabled;
        GenericInteraction genericInteraction = this.genericInteraction;
        Map<String, String> map = this.bindings;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("CardButtonModel(id=", str, ", title=", textResource, ", icon=");
        AbstractC11266d.m30444B(sbM91847q, str2, ", cardName=", str3, ", featureType=");
        AbstractC11266d.m30444B(sbM91847q, str4, ", style=", str5, ", backgroundStyle=");
        AbstractC30007c.m91827B(sbM91847q, str6, ", destination=", c9598e, ", action=");
        sbM91847q.append(action);
        sbM91847q.append(", analyticEvent=");
        sbM91847q.append(analyticEventModel);
        sbM91847q.append(", modal=");
        sbM91847q.append(anyModal);
        sbM91847q.append(", size=");
        sbM91847q.append(str7);
        sbM91847q.append(", textStyle=");
        AbstractC11266d.m30444B(sbM91847q, str8, ", cornerRadius=", str9, ", iconConfiguration=");
        sbM91847q.append(str10);
        sbM91847q.append(", dismissEvent=");
        sbM91847q.append(dismissEventModel);
        sbM91847q.append(", isEnabled=");
        sbM91847q.append(bool);
        sbM91847q.append(", genericInteraction=");
        sbM91847q.append(genericInteraction);
        sbM91847q.append(", bindings=");
        return AbstractC30802r.m94765n(sbM91847q, map, ", aggregateBindings=", map2, ")");
    }

    public /* synthetic */ CardButtonModel(int i13, String str, TextResource textResource, String str2, String str3, String str4, String str5, String str6, C9598e c9598e, Action action, AnalyticEventModel analyticEventModel, AnyModal anyModal, String str7, String str8, String str9, String str10, DismissEventModel dismissEventModel, Boolean bool, GenericInteraction genericInteraction, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i13 & 2) == 0) {
            this.title = AbstractC8693b.m21267a();
        } else {
            this.title = textResource;
        }
        if ((i13 & 4) == 0) {
            this.icon = null;
        } else {
            this.icon = str2;
        }
        if ((i13 & 8) == 0) {
            this.cardName = null;
        } else {
            this.cardName = str3;
        }
        if ((i13 & 16) == 0) {
            this.featureType = null;
        } else {
            this.featureType = str4;
        }
        if ((i13 & 32) == 0) {
            this.style = "";
        } else {
            this.style = str5;
        }
        if ((i13 & 64) == 0) {
            this.backgroundStyle = null;
        } else {
            this.backgroundStyle = str6;
        }
        if ((i13 & 128) == 0) {
            this.destination = null;
        } else {
            this.destination = c9598e;
        }
        if ((i13 & 256) == 0) {
            this.action = null;
        } else {
            this.action = action;
        }
        if ((i13 & 512) == 0) {
            this.analyticEvent = null;
        } else {
            this.analyticEvent = analyticEventModel;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.modal = null;
        } else {
            this.modal = anyModal;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.size = null;
        } else {
            this.size = str7;
        }
        if ((i13 & 4096) == 0) {
            this.textStyle = null;
        } else {
            this.textStyle = str8;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
            this.cornerRadius = null;
        } else {
            this.cornerRadius = str9;
        }
        if ((i13 & DfuBaseService.ERROR_CONNECTION_MASK) == 0) {
            this.iconConfiguration = null;
        } else {
            this.iconConfiguration = str10;
        }
        if ((32768 & i13) == 0) {
            this.dismissEvent = null;
        } else {
            this.dismissEvent = dismissEventModel;
        }
        if ((65536 & i13) == 0) {
            this.isEnabled = null;
        } else {
            this.isEnabled = bool;
        }
        if ((131072 & i13) == 0) {
            this.genericInteraction = null;
        } else {
            this.genericInteraction = genericInteraction;
        }
        if ((262144 & i13) == 0) {
            this.bindings = null;
        } else {
            this.bindings = map;
        }
        if ((i13 & 524288) == 0) {
            this.aggregateBindings = null;
        } else {
            this.aggregateBindings = map2;
        }
    }

    public CardButtonModel(String str, TextResource title, String str2, String str3, String str4, String style, String str5, C9598e c9598e, Action action, AnalyticEventModel analyticEventModel, AnyModal anyModal, String str6, String str7, String str8, String str9, DismissEventModel dismissEventModel, Boolean bool, GenericInteraction genericInteraction, Map<String, String> map, Map<String, AggregateBinding> map2) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(style, "style");
        this.id = str;
        this.title = title;
        this.icon = str2;
        this.cardName = str3;
        this.featureType = str4;
        this.style = style;
        this.backgroundStyle = str5;
        this.destination = c9598e;
        this.action = action;
        this.analyticEvent = analyticEventModel;
        this.modal = anyModal;
        this.size = str6;
        this.textStyle = str7;
        this.cornerRadius = str8;
        this.iconConfiguration = str9;
        this.dismissEvent = dismissEventModel;
        this.isEnabled = bool;
        this.genericInteraction = genericInteraction;
        this.bindings = map;
        this.aggregateBindings = map2;
    }

    public /* synthetic */ CardButtonModel(String str, TextResource textResource, String str2, String str3, String str4, String str5, String str6, C9598e c9598e, Action action, AnalyticEventModel analyticEventModel, AnyModal anyModal, String str7, String str8, String str9, String str10, DismissEventModel dismissEventModel, Boolean bool, GenericInteraction genericInteraction, Map map, Map map2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : str4, (i13 & 32) != 0 ? "" : str5, (i13 & 64) != 0 ? null : str6, (i13 & 128) != 0 ? null : c9598e, (i13 & 256) != 0 ? null : action, (i13 & 512) != 0 ? null : analyticEventModel, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : anyModal, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : str7, (i13 & 4096) != 0 ? null : str8, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : str9, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : str10, (i13 & 32768) != 0 ? null : dismissEventModel, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? null : bool, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? null : genericInteraction, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? null : map, (i13 & 524288) != 0 ? null : map2);
    }
}
