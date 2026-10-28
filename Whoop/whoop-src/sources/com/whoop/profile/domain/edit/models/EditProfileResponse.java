package com.whoop.profile.domain.edit.models;

import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.mapbox.common.HttpHeaders;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.profile.domain.models.Gender;
import com.whoop.profile.domain.models.PhysiologicalBaseline;
import hc3.AbstractC17176i;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import live.hms.video.utils.AndroidSDKConstants;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import qv1.C30654e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bJ\b\u0087\b\u0018\u0000 ¨\u00012\u00020\u0001:\u0004©\u0001¨\u0001B§\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u000e\u0012\u0006\u0010\u0019\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u001c\u001a\u00020\u000e\u0012\u0006\u0010\u001d\u001a\u00020\u000e\u0012\u0006\u0010\u001e\u001a\u00020\u000e\u0012\u0006\u0010\u001f\u001a\u00020\u000e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$\u0012\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020$¢\u0006\u0004\b(\u0010)B³\u0002\b\u0010\u0012\u0006\u0010*\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u000e\u0012\u0006\u0010\u0019\u001a\u00020\u000e\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u001c\u001a\u00020\u000e\u0012\u0006\u0010\u001d\u001a\u00020\u000e\u0012\u0006\u0010\u001e\u001a\u00020\u000e\u0012\u0006\u0010\u001f\u001a\u00020\u000e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$\u0012\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$\u0012\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b(\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010/J\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u0010/J\u0010\u00102\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b2\u0010/J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010/J\u0010\u00104\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b4\u0010/J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u0010/J\u0010\u00106\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b6\u0010/J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u0010/J\u0010\u00108\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b>\u0010;J\u0010\u0010?\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\bA\u0010@J\u0012\u0010B\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bB\u0010/J\u0010\u0010C\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bC\u0010/J\u0010\u0010D\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\bD\u0010;J\u0010\u0010E\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\bE\u0010;J\u0012\u0010F\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0012\u0010H\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bH\u0010GJ\u0010\u0010I\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\bI\u0010;J\u0010\u0010J\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\bJ\u0010;J\u0010\u0010K\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\bK\u0010;J\u0010\u0010L\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\bL\u0010;J\u0012\u0010M\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\bM\u0010NJ\u0012\u0010O\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0004\bO\u0010PJ\u0016\u0010Q\u001a\b\u0012\u0004\u0012\u00020%0$HÆ\u0003¢\u0006\u0004\bQ\u0010RJ\u0016\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00020$HÆ\u0003¢\u0006\u0004\bS\u0010RJÔ\u0002\u0010T\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u000e2\b\b\u0002\u0010\u0019\u001a\u00020\u000e2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u001c\u001a\u00020\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\u000e2\b\b\u0002\u0010\u001e\u001a\u00020\u000e2\b\b\u0002\u0010\u001f\u001a\u00020\u000e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$2\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020$HÆ\u0001¢\u0006\u0004\bT\u0010UJ\u0010\u0010V\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bV\u0010/J\u0010\u0010W\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\bW\u0010;J\u001a\u0010Y\u001a\u00020\u00102\b\u0010X\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bY\u0010ZJ'\u0010c\u001a\u00020`2\u0006\u0010[\u001a\u00020\u00002\u0006\u0010]\u001a\u00020\\2\u0006\u0010_\u001a\u00020^H\u0001¢\u0006\u0004\ba\u0010bR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010d\u0012\u0004\bf\u0010g\u001a\u0004\be\u0010/R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010d\u0012\u0004\bi\u0010g\u001a\u0004\bh\u0010/R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010d\u0012\u0004\bk\u0010g\u001a\u0004\bj\u0010/R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010d\u0012\u0004\bm\u0010g\u001a\u0004\bl\u0010/R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010d\u0012\u0004\bo\u0010g\u001a\u0004\bn\u0010/R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010d\u0012\u0004\bq\u0010g\u001a\u0004\bp\u0010/R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010d\u0012\u0004\bs\u0010g\u001a\u0004\br\u0010/R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010d\u0012\u0004\bu\u0010g\u001a\u0004\bt\u0010/R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010d\u0012\u0004\bw\u0010g\u001a\u0004\bv\u0010/R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010x\u0012\u0004\bz\u0010g\u001a\u0004\by\u00109R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010{\u0012\u0004\b}\u0010g\u001a\u0004\b|\u0010;R#\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0013\n\u0004\b\u0011\u0010~\u0012\u0005\b\u0080\u0001\u0010g\u001a\u0004\b\u007f\u0010=R\"\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u0012\u0010{\u0012\u0005\b\u0082\u0001\u0010g\u001a\u0005\b\u0081\u0001\u0010;R#\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0014\u0010\u0083\u0001\u0012\u0005\b\u0085\u0001\u0010g\u001a\u0005\b\u0084\u0001\u0010@R#\u0010\u0015\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0015\u0010\u0083\u0001\u0012\u0005\b\u0087\u0001\u0010g\u001a\u0005\b\u0086\u0001\u0010@R$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u0016\u0010d\u0012\u0005\b\u0089\u0001\u0010g\u001a\u0005\b\u0088\u0001\u0010/R\"\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u0017\u0010d\u0012\u0005\b\u008b\u0001\u0010g\u001a\u0005\b\u008a\u0001\u0010/R\"\u0010\u0018\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u0018\u0010{\u0012\u0005\b\u008d\u0001\u0010g\u001a\u0005\b\u008c\u0001\u0010;R\"\u0010\u0019\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u0019\u0010{\u0012\u0005\b\u008f\u0001\u0010g\u001a\u0005\b\u008e\u0001\u0010;R%\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u001a\u0010\u0090\u0001\u0012\u0005\b\u0092\u0001\u0010g\u001a\u0005\b\u0091\u0001\u0010GR%\u0010\u001b\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u001b\u0010\u0090\u0001\u0012\u0005\b\u0094\u0001\u0010g\u001a\u0005\b\u0093\u0001\u0010GR\"\u0010\u001c\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u001c\u0010{\u0012\u0005\b\u0096\u0001\u0010g\u001a\u0005\b\u0095\u0001\u0010;R\"\u0010\u001d\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u001d\u0010{\u0012\u0005\b\u0098\u0001\u0010g\u001a\u0005\b\u0097\u0001\u0010;R\"\u0010\u001e\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u001e\u0010{\u0012\u0005\b\u009a\u0001\u0010g\u001a\u0005\b\u0099\u0001\u0010;R\"\u0010\u001f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u001f\u0010{\u0012\u0005\b\u009c\u0001\u0010g\u001a\u0005\b\u009b\u0001\u0010;R%\u0010!\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b!\u0010\u009d\u0001\u0012\u0005\b\u009f\u0001\u0010g\u001a\u0005\b\u009e\u0001\u0010NR%\u0010#\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b#\u0010 \u0001\u0012\u0005\b¢\u0001\u0010g\u001a\u0005\b¡\u0001\u0010PR)\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b&\u0010£\u0001\u0012\u0005\b¥\u0001\u0010g\u001a\u0005\b¤\u0001\u0010RR)\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020$8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b'\u0010£\u0001\u0012\u0005\b§\u0001\u0010g\u001a\u0005\b¦\u0001\u0010R¨\u0006ª\u0001"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/models/EditProfileResponse;", "", "", "title", "avatarUrl", "firstName", "lastName", "username", NotificationCompat.CATEGORY_EMAIL, "city", "country", "state", "", "memberSince", "", HttpHeaders.AGE, "", "foundingMember", "userId", "", "height", "weight", "birthday", "unitSystem", "heightFeetMinValue", "heightFeetMaxValue", "heightMetersMinValue", "heightMetersMaxValue", "weightPoundsMinValue", "weightPoundsMaxValue", "weightKilogramsMinValue", "weightKilogramsMaxValue", "Lcom/whoop/profile/domain/models/Gender;", "gender", "Lcom/whoop/profile/domain/models/PhysiologicalBaseline;", "physiologicalBaseline", "", "Lcom/whoop/profile/domain/edit/models/CountryOption;", "countries", "lockedFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DILjava/lang/Boolean;IFFLjava/lang/String;Ljava/lang/String;IILjava/lang/Float;Ljava/lang/Float;IIIILcom/whoop/profile/domain/models/Gender;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;Ljava/util/List;Ljava/util/List;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DILjava/lang/Boolean;IFFLjava/lang/String;Ljava/lang/String;IILjava/lang/Float;Ljava/lang/Float;IIIILcom/whoop/profile/domain/models/Gender;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "()D", "component11", "()I", "component12", "()Ljava/lang/Boolean;", "component13", "component14", "()F", "component15", "component16", "component17", "component18", "component19", "component20", "()Ljava/lang/Float;", "component21", "component22", "component23", "component24", "component25", "component26", "()Lcom/whoop/profile/domain/models/Gender;", "component27", "()Lcom/whoop/profile/domain/models/PhysiologicalBaseline;", "component28", "()Ljava/util/List;", "component29", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DILjava/lang/Boolean;IFFLjava/lang/String;Ljava/lang/String;IILjava/lang/Float;Ljava/lang/Float;IIIILcom/whoop/profile/domain/models/Gender;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;Ljava/util/List;Ljava/util/List;)Lcom/whoop/profile/domain/edit/models/EditProfileResponse;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$profile_release", "(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getAvatarUrl", "getAvatarUrl$annotations", "getFirstName", "getFirstName$annotations", "getLastName", "getLastName$annotations", "getUsername", "getUsername$annotations", "getEmail", "getEmail$annotations", "getCity", "getCity$annotations", "getCountry", "getCountry$annotations", "getState", "getState$annotations", "D", "getMemberSince", "getMemberSince$annotations", "I", "getAge", "getAge$annotations", "Ljava/lang/Boolean;", "getFoundingMember", "getFoundingMember$annotations", "getUserId", "getUserId$annotations", "F", "getHeight", "getHeight$annotations", "getWeight", "getWeight$annotations", "getBirthday", "getBirthday$annotations", "getUnitSystem", "getUnitSystem$annotations", "getHeightFeetMinValue", "getHeightFeetMinValue$annotations", "getHeightFeetMaxValue", "getHeightFeetMaxValue$annotations", "Ljava/lang/Float;", "getHeightMetersMinValue", "getHeightMetersMinValue$annotations", "getHeightMetersMaxValue", "getHeightMetersMaxValue$annotations", "getWeightPoundsMinValue", "getWeightPoundsMinValue$annotations", "getWeightPoundsMaxValue", "getWeightPoundsMaxValue$annotations", "getWeightKilogramsMinValue", "getWeightKilogramsMinValue$annotations", "getWeightKilogramsMaxValue", "getWeightKilogramsMaxValue$annotations", "Lcom/whoop/profile/domain/models/Gender;", "getGender", "getGender$annotations", "Lcom/whoop/profile/domain/models/PhysiologicalBaseline;", "getPhysiologicalBaseline", "getPhysiologicalBaseline$annotations", "Ljava/util/List;", "getCountries", "getCountries$annotations", "getLockedFields", "getLockedFields$annotations", "Companion", "$serializer", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class EditProfileResponse {
    private static final InterfaceC23462h[] $childSerializers;
    private final int age;
    private final String avatarUrl;
    private final String birthday;
    private final String city;
    private final List<CountryOption> countries;
    private final String country;
    private final String email;
    private final String firstName;
    private final Boolean foundingMember;
    private final Gender gender;
    private final float height;
    private final int heightFeetMaxValue;
    private final int heightFeetMinValue;
    private final Float heightMetersMaxValue;
    private final Float heightMetersMinValue;
    private final String lastName;
    private final List<String> lockedFields;
    private final double memberSince;
    private final PhysiologicalBaseline physiologicalBaseline;
    private final String state;
    private final String title;
    private final String unitSystem;
    private final int userId;
    private final String username;
    private final float weight;
    private final int weightKilogramsMaxValue;
    private final int weightKilogramsMinValue;
    private final int weightPoundsMaxValue;
    private final int weightPoundsMinValue;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/models/EditProfileResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/profile/domain/edit/models/EditProfileResponse;", "serializer", "()Lwc3/c;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return EditProfileResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C30654e(9)), AbstractC30060g.m92087G(enumC23463i, new C30654e(10)), AbstractC30060g.m92087G(enumC23463i, new C30654e(11)), AbstractC30060g.m92087G(enumC23463i, new C30654e(12))};
    }

    public /* synthetic */ EditProfileResponse(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, double d3, int i14, Boolean bool, int i15, float f13, float f14, String str10, String str11, int i16, int i17, Float f15, Float f16, int i18, int i19, int i24, int i25, Gender gender, PhysiologicalBaseline physiologicalBaseline, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (233273004 != (i13 & 233273004)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 233273004, EditProfileResponse$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i13 & 2) == 0) {
            this.avatarUrl = null;
        } else {
            this.avatarUrl = str2;
        }
        this.firstName = str3;
        this.lastName = str4;
        if ((i13 & 16) == 0) {
            this.username = null;
        } else {
            this.username = str5;
        }
        this.email = str6;
        if ((i13 & 64) == 0) {
            this.city = null;
        } else {
            this.city = str7;
        }
        this.country = str8;
        if ((i13 & 256) == 0) {
            this.state = null;
        } else {
            this.state = str9;
        }
        this.memberSince = d3;
        this.age = i14;
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.foundingMember = null;
        } else {
            this.foundingMember = bool;
        }
        this.userId = i15;
        this.height = f13;
        this.weight = f14;
        if ((32768 & i13) == 0) {
            this.birthday = null;
        } else {
            this.birthday = str10;
        }
        this.unitSystem = str11;
        this.heightFeetMinValue = i16;
        this.heightFeetMaxValue = i17;
        if ((524288 & i13) == 0) {
            this.heightMetersMinValue = null;
        } else {
            this.heightMetersMinValue = f15;
        }
        if ((1048576 & i13) == 0) {
            this.heightMetersMaxValue = null;
        } else {
            this.heightMetersMaxValue = f16;
        }
        this.weightPoundsMinValue = i18;
        this.weightPoundsMaxValue = i19;
        this.weightKilogramsMinValue = i24;
        this.weightKilogramsMaxValue = i25;
        if ((33554432 & i13) == 0) {
            this.gender = null;
        } else {
            this.gender = gender;
        }
        this.physiologicalBaseline = physiologicalBaseline;
        this.countries = list;
        this.lockedFields = (i13 & 268435456) == 0 ? C25271y.f99162w : list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return Gender.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return PhysiologicalBaseline.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new ArrayListSerializer(CountryOption$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$2() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditProfileResponse copy$default(EditProfileResponse editProfileResponse, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, double d3, int i13, Boolean bool, int i14, float f13, float f14, String str10, String str11, int i15, int i16, Float f15, Float f16, int i17, int i18, int i19, int i24, Gender gender, PhysiologicalBaseline physiologicalBaseline, List list, List list2, int i25, Object obj) {
        List list3;
        List list4;
        String str12 = (i25 & 1) != 0 ? editProfileResponse.title : str;
        String str13 = (i25 & 2) != 0 ? editProfileResponse.avatarUrl : str2;
        String str14 = (i25 & 4) != 0 ? editProfileResponse.firstName : str3;
        String str15 = (i25 & 8) != 0 ? editProfileResponse.lastName : str4;
        String str16 = (i25 & 16) != 0 ? editProfileResponse.username : str5;
        String str17 = (i25 & 32) != 0 ? editProfileResponse.email : str6;
        String str18 = (i25 & 64) != 0 ? editProfileResponse.city : str7;
        String str19 = (i25 & 128) != 0 ? editProfileResponse.country : str8;
        String str20 = (i25 & 256) != 0 ? editProfileResponse.state : str9;
        double d14 = (i25 & 512) != 0 ? editProfileResponse.memberSince : d3;
        int i26 = (i25 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? editProfileResponse.age : i13;
        Boolean bool2 = (i25 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? editProfileResponse.foundingMember : bool;
        int i27 = (i25 & 4096) != 0 ? editProfileResponse.userId : i14;
        String str21 = str12;
        float f17 = (i25 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? editProfileResponse.height : f13;
        float f18 = (i25 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? editProfileResponse.weight : f14;
        String str22 = (i25 & 32768) != 0 ? editProfileResponse.birthday : str10;
        String str23 = (i25 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? editProfileResponse.unitSystem : str11;
        int i28 = (i25 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? editProfileResponse.heightFeetMinValue : i15;
        int i29 = (i25 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? editProfileResponse.heightFeetMaxValue : i16;
        Float f19 = (i25 & 524288) != 0 ? editProfileResponse.heightMetersMinValue : f15;
        Float f24 = (i25 & 1048576) != 0 ? editProfileResponse.heightMetersMaxValue : f16;
        int i34 = (i25 & 2097152) != 0 ? editProfileResponse.weightPoundsMinValue : i17;
        int i35 = (i25 & 4194304) != 0 ? editProfileResponse.weightPoundsMaxValue : i18;
        int i36 = (i25 & 8388608) != 0 ? editProfileResponse.weightKilogramsMinValue : i19;
        int i37 = (i25 & 16777216) != 0 ? editProfileResponse.weightKilogramsMaxValue : i24;
        Gender gender2 = (i25 & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? editProfileResponse.gender : gender;
        PhysiologicalBaseline physiologicalBaseline2 = (i25 & 67108864) != 0 ? editProfileResponse.physiologicalBaseline : physiologicalBaseline;
        List list5 = (i25 & 134217728) != 0 ? editProfileResponse.countries : list;
        if ((i25 & 268435456) != 0) {
            list4 = list5;
            list3 = editProfileResponse.lockedFields;
        } else {
            list3 = list2;
            list4 = list5;
        }
        return editProfileResponse.copy(str21, str13, str14, str15, str16, str17, str18, str19, str20, d14, i26, bool2, i27, f17, f18, str22, str23, i28, i29, f19, f24, i34, i35, i36, i37, gender2, physiologicalBaseline2, list4, list3);
    }

    @InterfaceC37143h(HttpHeaders.AGE)
    public static /* synthetic */ void getAge$annotations() {
    }

    @InterfaceC37143h("avatar_url")
    public static /* synthetic */ void getAvatarUrl$annotations() {
    }

    @InterfaceC37143h("birthday")
    public static /* synthetic */ void getBirthday$annotations() {
    }

    @InterfaceC37143h("city")
    public static /* synthetic */ void getCity$annotations() {
    }

    @InterfaceC37143h("countries")
    public static /* synthetic */ void getCountries$annotations() {
    }

    @InterfaceC37143h("country")
    public static /* synthetic */ void getCountry$annotations() {
    }

    @InterfaceC37143h(NotificationCompat.CATEGORY_EMAIL)
    public static /* synthetic */ void getEmail$annotations() {
    }

    @InterfaceC37143h("first_name")
    public static /* synthetic */ void getFirstName$annotations() {
    }

    @InterfaceC37143h("founding_member")
    public static /* synthetic */ void getFoundingMember$annotations() {
    }

    @InterfaceC37143h("gender")
    public static /* synthetic */ void getGender$annotations() {
    }

    @InterfaceC37143h("height")
    public static /* synthetic */ void getHeight$annotations() {
    }

    @InterfaceC37143h("height_feet_max_value")
    public static /* synthetic */ void getHeightFeetMaxValue$annotations() {
    }

    @InterfaceC37143h("height_feet_min_value")
    public static /* synthetic */ void getHeightFeetMinValue$annotations() {
    }

    @InterfaceC37143h("height_meters_max_value")
    public static /* synthetic */ void getHeightMetersMaxValue$annotations() {
    }

    @InterfaceC37143h("height_meters_min_value")
    public static /* synthetic */ void getHeightMetersMinValue$annotations() {
    }

    @InterfaceC37143h("last_name")
    public static /* synthetic */ void getLastName$annotations() {
    }

    @InterfaceC37143h("locked_fields")
    public static /* synthetic */ void getLockedFields$annotations() {
    }

    @InterfaceC37143h("member_since")
    public static /* synthetic */ void getMemberSince$annotations() {
    }

    @InterfaceC37143h("physiological_baseline")
    public static /* synthetic */ void getPhysiologicalBaseline$annotations() {
    }

    @InterfaceC37143h("state")
    public static /* synthetic */ void getState$annotations() {
    }

    @InterfaceC37143h("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @InterfaceC37143h("unit_system")
    public static /* synthetic */ void getUnitSystem$annotations() {
    }

    @InterfaceC37143h("user_id")
    public static /* synthetic */ void getUserId$annotations() {
    }

    @InterfaceC37143h("username")
    public static /* synthetic */ void getUsername$annotations() {
    }

    @InterfaceC37143h("weight")
    public static /* synthetic */ void getWeight$annotations() {
    }

    @InterfaceC37143h("weight_kilograms_max_value")
    public static /* synthetic */ void getWeightKilogramsMaxValue$annotations() {
    }

    @InterfaceC37143h("weight_kilograms_min_value")
    public static /* synthetic */ void getWeightKilogramsMinValue$annotations() {
    }

    @InterfaceC37143h("weight_pounds_max_value")
    public static /* synthetic */ void getWeightPoundsMaxValue$annotations() {
    }

    @InterfaceC37143h("weight_pounds_min_value")
    public static /* synthetic */ void getWeightPoundsMinValue$annotations() {
    }

    public static final /* synthetic */ void write$Self$profile_release(EditProfileResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.title != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.avatarUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.avatarUrl);
        }
        output.encodeStringElement(serialDesc, 2, self.firstName);
        output.encodeStringElement(serialDesc, 3, self.lastName);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.username != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.username);
        }
        output.encodeStringElement(serialDesc, 5, self.email);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.city != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.city);
        }
        output.encodeStringElement(serialDesc, 7, self.country);
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.state != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.state);
        }
        output.encodeDoubleElement(serialDesc, 9, self.memberSince);
        output.encodeIntElement(serialDesc, 10, self.age);
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.foundingMember != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, BooleanSerializer.INSTANCE, self.foundingMember);
        }
        output.encodeIntElement(serialDesc, 12, self.userId);
        output.encodeFloatElement(serialDesc, 13, self.height);
        output.encodeFloatElement(serialDesc, 14, self.weight);
        if (output.shouldEncodeElementDefault(serialDesc, 15) || self.birthday != null) {
            output.encodeNullableSerializableElement(serialDesc, 15, StringSerializer.INSTANCE, self.birthday);
        }
        output.encodeStringElement(serialDesc, 16, self.unitSystem);
        output.encodeIntElement(serialDesc, 17, self.heightFeetMinValue);
        output.encodeIntElement(serialDesc, 18, self.heightFeetMaxValue);
        if (output.shouldEncodeElementDefault(serialDesc, 19) || self.heightMetersMinValue != null) {
            output.encodeNullableSerializableElement(serialDesc, 19, FloatSerializer.INSTANCE, self.heightMetersMinValue);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 20) || self.heightMetersMaxValue != null) {
            output.encodeNullableSerializableElement(serialDesc, 20, FloatSerializer.INSTANCE, self.heightMetersMaxValue);
        }
        output.encodeIntElement(serialDesc, 21, self.weightPoundsMinValue);
        output.encodeIntElement(serialDesc, 22, self.weightPoundsMaxValue);
        output.encodeIntElement(serialDesc, 23, self.weightKilogramsMinValue);
        output.encodeIntElement(serialDesc, 24, self.weightKilogramsMaxValue);
        if (output.shouldEncodeElementDefault(serialDesc, 25) || self.gender != null) {
            output.encodeNullableSerializableElement(serialDesc, 25, (InterfaceC37145j) interfaceC23462hArr[25].getValue(), self.gender);
        }
        output.encodeNullableSerializableElement(serialDesc, 26, (InterfaceC37145j) interfaceC23462hArr[26].getValue(), self.physiologicalBaseline);
        output.encodeSerializableElement(serialDesc, 27, (InterfaceC37145j) interfaceC23462hArr[27].getValue(), self.countries);
        if (!output.shouldEncodeElementDefault(serialDesc, 28) && AbstractC22676k.m65745e(self.lockedFields, C25271y.f99162w)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 28, (InterfaceC37145j) interfaceC23462hArr[28].getValue(), self.lockedFields);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final double getMemberSince() {
        return this.memberSince;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getAge() {
        return this.age;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getFoundingMember() {
        return this.foundingMember;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final float getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getBirthday() {
        return this.birthday;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getUnitSystem() {
        return this.unitSystem;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getHeightFeetMinValue() {
        return this.heightFeetMinValue;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getHeightFeetMaxValue() {
        return this.heightFeetMaxValue;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Float getHeightMetersMinValue() {
        return this.heightMetersMinValue;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Float getHeightMetersMaxValue() {
        return this.heightMetersMaxValue;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final int getWeightPoundsMinValue() {
        return this.weightPoundsMinValue;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final int getWeightPoundsMaxValue() {
        return this.weightPoundsMaxValue;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final int getWeightKilogramsMinValue() {
        return this.weightKilogramsMinValue;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final int getWeightKilogramsMaxValue() {
        return this.weightKilogramsMaxValue;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Gender getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final PhysiologicalBaseline getPhysiologicalBaseline() {
        return this.physiologicalBaseline;
    }

    public final List<CountryOption> component28() {
        return this.countries;
    }

    public final List<String> component29() {
        return this.lockedFields;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final EditProfileResponse copy(String title, String avatarUrl, String firstName, String lastName, String username, String email, String city, String country, String state, double memberSince, int age, Boolean foundingMember, int userId, float height, float weight, String birthday, String unitSystem, int heightFeetMinValue, int heightFeetMaxValue, Float heightMetersMinValue, Float heightMetersMaxValue, int weightPoundsMinValue, int weightPoundsMaxValue, int weightKilogramsMinValue, int weightKilogramsMaxValue, Gender gender, PhysiologicalBaseline physiologicalBaseline, List<CountryOption> countries, List<String> lockedFields) {
        AbstractC22676k.m65750j(firstName, "firstName");
        AbstractC22676k.m65750j(lastName, "lastName");
        AbstractC22676k.m65750j(email, "email");
        AbstractC22676k.m65750j(country, "country");
        AbstractC22676k.m65750j(unitSystem, "unitSystem");
        AbstractC22676k.m65750j(countries, "countries");
        AbstractC22676k.m65750j(lockedFields, "lockedFields");
        return new EditProfileResponse(title, avatarUrl, firstName, lastName, username, email, city, country, state, memberSince, age, foundingMember, userId, height, weight, birthday, unitSystem, heightFeetMinValue, heightFeetMaxValue, heightMetersMinValue, heightMetersMaxValue, weightPoundsMinValue, weightPoundsMaxValue, weightKilogramsMinValue, weightKilogramsMaxValue, gender, physiologicalBaseline, countries, lockedFields);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditProfileResponse)) {
            return false;
        }
        EditProfileResponse editProfileResponse = (EditProfileResponse) other;
        return AbstractC22676k.m65745e(this.title, editProfileResponse.title) && AbstractC22676k.m65745e(this.avatarUrl, editProfileResponse.avatarUrl) && AbstractC22676k.m65745e(this.firstName, editProfileResponse.firstName) && AbstractC22676k.m65745e(this.lastName, editProfileResponse.lastName) && AbstractC22676k.m65745e(this.username, editProfileResponse.username) && AbstractC22676k.m65745e(this.email, editProfileResponse.email) && AbstractC22676k.m65745e(this.city, editProfileResponse.city) && AbstractC22676k.m65745e(this.country, editProfileResponse.country) && AbstractC22676k.m65745e(this.state, editProfileResponse.state) && Double.compare(this.memberSince, editProfileResponse.memberSince) == 0 && this.age == editProfileResponse.age && AbstractC22676k.m65745e(this.foundingMember, editProfileResponse.foundingMember) && this.userId == editProfileResponse.userId && Float.compare(this.height, editProfileResponse.height) == 0 && Float.compare(this.weight, editProfileResponse.weight) == 0 && AbstractC22676k.m65745e(this.birthday, editProfileResponse.birthday) && AbstractC22676k.m65745e(this.unitSystem, editProfileResponse.unitSystem) && this.heightFeetMinValue == editProfileResponse.heightFeetMinValue && this.heightFeetMaxValue == editProfileResponse.heightFeetMaxValue && AbstractC22676k.m65745e(this.heightMetersMinValue, editProfileResponse.heightMetersMinValue) && AbstractC22676k.m65745e(this.heightMetersMaxValue, editProfileResponse.heightMetersMaxValue) && this.weightPoundsMinValue == editProfileResponse.weightPoundsMinValue && this.weightPoundsMaxValue == editProfileResponse.weightPoundsMaxValue && this.weightKilogramsMinValue == editProfileResponse.weightKilogramsMinValue && this.weightKilogramsMaxValue == editProfileResponse.weightKilogramsMaxValue && this.gender == editProfileResponse.gender && this.physiologicalBaseline == editProfileResponse.physiologicalBaseline && AbstractC22676k.m65745e(this.countries, editProfileResponse.countries) && AbstractC22676k.m65745e(this.lockedFields, editProfileResponse.lockedFields);
    }

    public final int getAge() {
        return this.age;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getBirthday() {
        return this.birthday;
    }

    public final String getCity() {
        return this.city;
    }

    public final List<CountryOption> getCountries() {
        return this.countries;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final Boolean getFoundingMember() {
        return this.foundingMember;
    }

    public final Gender getGender() {
        return this.gender;
    }

    public final float getHeight() {
        return this.height;
    }

    public final int getHeightFeetMaxValue() {
        return this.heightFeetMaxValue;
    }

    public final int getHeightFeetMinValue() {
        return this.heightFeetMinValue;
    }

    public final Float getHeightMetersMaxValue() {
        return this.heightMetersMaxValue;
    }

    public final Float getHeightMetersMinValue() {
        return this.heightMetersMinValue;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final List<String> getLockedFields() {
        return this.lockedFields;
    }

    public final double getMemberSince() {
        return this.memberSince;
    }

    public final PhysiologicalBaseline getPhysiologicalBaseline() {
        return this.physiologicalBaseline;
    }

    public final String getState() {
        return this.state;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUnitSystem() {
        return this.unitSystem;
    }

    public final int getUserId() {
        return this.userId;
    }

    public final String getUsername() {
        return this.username;
    }

    public final float getWeight() {
        return this.weight;
    }

    public final int getWeightKilogramsMaxValue() {
        return this.weightKilogramsMaxValue;
    }

    public final int getWeightKilogramsMinValue() {
        return this.weightKilogramsMinValue;
    }

    public final int getWeightPoundsMaxValue() {
        return this.weightPoundsMaxValue;
    }

    public final int getWeightPoundsMinValue() {
        return this.weightPoundsMinValue;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.avatarUrl;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.firstName), 31, this.lastName);
        String str3 = this.username;
        int iM30450d2 = AbstractC11266d.m30450d((iM30450d + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.email);
        String str4 = this.city;
        int iM30450d3 = AbstractC11266d.m30450d((iM30450d2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.country);
        String str5 = this.state;
        int iM30448b = AbstractC11266d.m30448b(this.age, AbstractC17176i.m48499a((iM30450d3 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.memberSince), 31);
        Boolean bool = this.foundingMember;
        int iM30447a = AbstractC11266d.m30447a(this.weight, AbstractC11266d.m30447a(this.height, AbstractC11266d.m30448b(this.userId, (iM30448b + (bool == null ? 0 : bool.hashCode())) * 31, 31), 31), 31);
        String str6 = this.birthday;
        int iM30448b2 = AbstractC11266d.m30448b(this.heightFeetMaxValue, AbstractC11266d.m30448b(this.heightFeetMinValue, AbstractC11266d.m30450d((iM30447a + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.unitSystem), 31), 31);
        Float f13 = this.heightMetersMinValue;
        int iHashCode2 = (iM30448b2 + (f13 == null ? 0 : f13.hashCode())) * 31;
        Float f14 = this.heightMetersMaxValue;
        int iM30448b3 = AbstractC11266d.m30448b(this.weightKilogramsMaxValue, AbstractC11266d.m30448b(this.weightKilogramsMinValue, AbstractC11266d.m30448b(this.weightPoundsMaxValue, AbstractC11266d.m30448b(this.weightPoundsMinValue, (iHashCode2 + (f14 == null ? 0 : f14.hashCode())) * 31, 31), 31), 31), 31);
        Gender gender = this.gender;
        int iHashCode3 = (iM30448b3 + (gender == null ? 0 : gender.hashCode())) * 31;
        PhysiologicalBaseline physiologicalBaseline = this.physiologicalBaseline;
        return this.lockedFields.hashCode() + AbstractC11895b.m31983b((iHashCode3 + (physiologicalBaseline != null ? physiologicalBaseline.hashCode() : 0)) * 31, 31, this.countries);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.avatarUrl;
        String str3 = this.firstName;
        String str4 = this.lastName;
        String str5 = this.username;
        String str6 = this.email;
        String str7 = this.city;
        String str8 = this.country;
        String str9 = this.state;
        double d3 = this.memberSince;
        int i13 = this.age;
        Boolean bool = this.foundingMember;
        int i14 = this.userId;
        float f13 = this.height;
        float f14 = this.weight;
        String str10 = this.birthday;
        String str11 = this.unitSystem;
        int i15 = this.heightFeetMinValue;
        int i16 = this.heightFeetMaxValue;
        Float f15 = this.heightMetersMinValue;
        Float f16 = this.heightMetersMaxValue;
        int i17 = this.weightPoundsMinValue;
        int i18 = this.weightPoundsMaxValue;
        int i19 = this.weightKilogramsMinValue;
        int i24 = this.weightKilogramsMaxValue;
        Gender gender = this.gender;
        PhysiologicalBaseline physiologicalBaseline = this.physiologicalBaseline;
        List<CountryOption> list = this.countries;
        List<String> list2 = this.lockedFields;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("EditProfileResponse(title=", str, ", avatarUrl=", str2, ", firstName=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", lastName=", str4, ", username=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", email=", str6, ", city=");
        AbstractC11266d.m30444B(sbM32001t, str7, ", country=", str8, ", state=");
        sbM32001t.append(str9);
        sbM32001t.append(", memberSince=");
        sbM32001t.append(d3);
        sbM32001t.append(", age=");
        sbM32001t.append(i13);
        sbM32001t.append(", foundingMember=");
        sbM32001t.append(bool);
        sbM32001t.append(", userId=");
        sbM32001t.append(i14);
        sbM32001t.append(", height=");
        sbM32001t.append(f13);
        sbM32001t.append(", weight=");
        sbM32001t.append(f14);
        sbM32001t.append(", birthday=");
        sbM32001t.append(str10);
        sbM32001t.append(", unitSystem=");
        sbM32001t.append(str11);
        sbM32001t.append(", heightFeetMinValue=");
        sbM32001t.append(i15);
        sbM32001t.append(", heightFeetMaxValue=");
        sbM32001t.append(i16);
        sbM32001t.append(", heightMetersMinValue=");
        sbM32001t.append(f15);
        sbM32001t.append(", heightMetersMaxValue=");
        sbM32001t.append(f16);
        sbM32001t.append(", weightPoundsMinValue=");
        sbM32001t.append(i17);
        sbM32001t.append(", weightPoundsMaxValue=");
        sbM32001t.append(i18);
        sbM32001t.append(", weightKilogramsMinValue=");
        sbM32001t.append(i19);
        sbM32001t.append(", weightKilogramsMaxValue=");
        sbM32001t.append(i24);
        sbM32001t.append(", gender=");
        sbM32001t.append(gender);
        sbM32001t.append(", physiologicalBaseline=");
        sbM32001t.append(physiologicalBaseline);
        sbM32001t.append(", countries=");
        sbM32001t.append(list);
        sbM32001t.append(", lockedFields=");
        sbM32001t.append(list2);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public EditProfileResponse(String str, String str2, String firstName, String lastName, String str3, String email, String str4, String country, String str5, double d3, int i13, Boolean bool, int i14, float f13, float f14, String str6, String unitSystem, int i15, int i16, Float f15, Float f16, int i17, int i18, int i19, int i24, Gender gender, PhysiologicalBaseline physiologicalBaseline, List<CountryOption> countries, List<String> lockedFields) {
        AbstractC22676k.m65750j(firstName, "firstName");
        AbstractC22676k.m65750j(lastName, "lastName");
        AbstractC22676k.m65750j(email, "email");
        AbstractC22676k.m65750j(country, "country");
        AbstractC22676k.m65750j(unitSystem, "unitSystem");
        AbstractC22676k.m65750j(countries, "countries");
        AbstractC22676k.m65750j(lockedFields, "lockedFields");
        this.title = str;
        this.avatarUrl = str2;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = str3;
        this.email = email;
        this.city = str4;
        this.country = country;
        this.state = str5;
        this.memberSince = d3;
        this.age = i13;
        this.foundingMember = bool;
        this.userId = i14;
        this.height = f13;
        this.weight = f14;
        this.birthday = str6;
        this.unitSystem = unitSystem;
        this.heightFeetMinValue = i15;
        this.heightFeetMaxValue = i16;
        this.heightMetersMinValue = f15;
        this.heightMetersMaxValue = f16;
        this.weightPoundsMinValue = i17;
        this.weightPoundsMaxValue = i18;
        this.weightKilogramsMinValue = i19;
        this.weightKilogramsMaxValue = i24;
        this.gender = gender;
        this.physiologicalBaseline = physiologicalBaseline;
        this.countries = countries;
        this.lockedFields = lockedFields;
    }

    public /* synthetic */ EditProfileResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, double d3, int i13, Boolean bool, int i14, float f13, float f14, String str10, String str11, int i15, int i16, Float f15, Float f16, int i17, int i18, int i19, int i24, Gender gender, PhysiologicalBaseline physiologicalBaseline, List list, List list2, int i25, DefaultConstructorMarker defaultConstructorMarker) {
        this((i25 & 1) != 0 ? null : str, (i25 & 2) != 0 ? null : str2, str3, str4, (i25 & 16) != 0 ? null : str5, str6, (i25 & 64) != 0 ? null : str7, str8, (i25 & 256) != 0 ? null : str9, d3, i13, (i25 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : bool, i14, f13, f14, (32768 & i25) != 0 ? null : str10, str11, i15, i16, (524288 & i25) != 0 ? null : f15, (1048576 & i25) != 0 ? null : f16, i17, i18, i19, i24, (33554432 & i25) != 0 ? null : gender, physiologicalBaseline, list, (i25 & 268435456) != 0 ? C25271y.f99162w : list2);
    }
}
