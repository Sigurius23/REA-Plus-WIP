package com.whoop.whooplabs.data.remote.domain.dto.bff;

import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.InfoCalloutTileModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import dq2.C12293a;
import hc3.AbstractC17176i;
import ih0.AbstractC18489d0;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b7\b\u0087\b\u0018\u0000 \u0095\u00012\u00020\u0001:\u0004\u0096\u0001\u0095\u0001B»\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u000e\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*B×\u0002\b\u0010\u0012\u0006\u0010+\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000e\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u000e\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b)\u0010.J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b3\u00102J\u0012\u00104\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b4\u00102J\u0012\u00105\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b5\u00102J\u0012\u00106\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b6\u00102J\u0012\u00107\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b7\u00102J\u0012\u00108\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b8\u00102J\u0012\u00109\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b9\u00102J\u0012\u0010:\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b:\u00102J\u0016\u0010;\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b=\u00102J\u0012\u0010>\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b>\u00102J\u0012\u0010?\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b?\u00102J\u0012\u0010@\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b@\u00102J\u0012\u0010A\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bA\u00102J\u0012\u0010B\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bB\u00102J\u0016\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00170\u000eHÆ\u0003¢\u0006\u0004\bC\u0010<J\u0012\u0010D\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bD\u00102J\u0012\u0010E\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bE\u00102J\u0012\u0010F\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bF\u00102J\u0012\u0010G\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bG\u00102J\u0012\u0010H\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bH\u00102J\u0012\u0010I\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bI\u00102J\u0012\u0010J\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bJ\u00102J\u0012\u0010K\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\bK\u0010LJ\u0018\u0010M\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\bM\u0010<J\u0012\u0010N\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bN\u00102J\u0012\u0010O\u001a\u0004\u0018\u00010%HÆ\u0003¢\u0006\u0004\bO\u0010PJ\u0012\u0010Q\u001a\u0004\u0018\u00010'HÆ\u0003¢\u0006\u0004\bQ\u0010RJ\u0080\u0003\u0010S\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u000e2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'HÆ\u0001¢\u0006\u0004\bS\u0010TJ\u0010\u0010U\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bU\u00102J\u0010\u0010V\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bV\u00100J\u001a\u0010Y\u001a\u00020X2\b\u0010W\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bY\u0010ZJ'\u0010c\u001a\u00020`2\u0006\u0010[\u001a\u00020\u00002\u0006\u0010]\u001a\u00020\\2\u0006\u0010_\u001a\u00020^H\u0001¢\u0006\u0004\ba\u0010bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010d\u001a\u0004\be\u00100R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010f\u0012\u0004\bh\u0010i\u001a\u0004\bg\u00102R \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010f\u0012\u0004\bk\u0010i\u001a\u0004\bj\u00102R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010f\u0012\u0004\bm\u0010i\u001a\u0004\bl\u00102R\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010f\u0012\u0004\bo\u0010i\u001a\u0004\bn\u00102R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010f\u001a\u0004\bp\u00102R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010f\u001a\u0004\bq\u00102R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010f\u001a\u0004\br\u00102R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010f\u001a\u0004\bs\u00102R\"\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010f\u0012\u0004\bu\u0010i\u001a\u0004\bt\u00102R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010v\u001a\u0004\bw\u0010<R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010f\u0012\u0004\by\u0010i\u001a\u0004\bx\u00102R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010f\u001a\u0004\bz\u00102R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010f\u001a\u0004\b{\u00102R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010f\u0012\u0004\b}\u0010i\u001a\u0004\b|\u00102R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010f\u001a\u0004\b~\u00102R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010f\u001a\u0004\b\u007f\u00102R(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u0018\u0010v\u0012\u0005\b\u0081\u0001\u0010i\u001a\u0005\b\u0080\u0001\u0010<R$\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u0019\u0010f\u0012\u0005\b\u0083\u0001\u0010i\u001a\u0005\b\u0082\u0001\u00102R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\r\n\u0004\b\u001a\u0010f\u001a\u0005\b\u0084\u0001\u00102R$\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u001b\u0010f\u0012\u0005\b\u0086\u0001\u0010i\u001a\u0005\b\u0085\u0001\u00102R$\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u001c\u0010f\u0012\u0005\b\u0088\u0001\u0010i\u001a\u0005\b\u0087\u0001\u00102R\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\r\n\u0004\b\u001d\u0010f\u001a\u0005\b\u0089\u0001\u00102R$\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u001e\u0010f\u0012\u0005\b\u008b\u0001\u0010i\u001a\u0005\b\u008a\u0001\u00102R\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\r\n\u0004\b\u001f\u0010f\u001a\u0005\b\u008c\u0001\u00102R\u001b\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\u000e\n\u0005\b!\u0010\u008d\u0001\u001a\u0005\b\u008e\u0001\u0010LR \u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u000e8\u0006¢\u0006\r\n\u0004\b#\u0010v\u001a\u0005\b\u008f\u0001\u0010<R\u001a\u0010$\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\r\n\u0004\b$\u0010f\u001a\u0005\b\u0090\u0001\u00102R\u001b\u0010&\u001a\u0004\u0018\u00010%8\u0006¢\u0006\u000e\n\u0005\b&\u0010\u0091\u0001\u001a\u0005\b\u0092\u0001\u0010PR\u001b\u0010(\u001a\u0004\u0018\u00010'8\u0006¢\u0006\u000e\n\u0005\b(\u0010\u0093\u0001\u001a\u0005\b\u0094\u0001\u0010R¨\u0006\u0097\u0001"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;", "", "", "campaignId", "", "toolbarTitle", "title", "headerSubtitle", "headerIcon", "badge", "badgeText", "badgeType", "badgeTextSubtitle", "headerImage", "", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ContentBlockResponse;", "contentBlocks", "scheduleText", "scheduleCta", "statusBadgeType", "statusBadgeIcon", "statusTitle", "statusBody", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/TaskResponse;", "nextTasks", "description", "descriptionCta", "subDescription", "alertTitle", "alertDisplay", "fullDescription", "cta", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;", "optionsConfig", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/LegalDocumentResponse;", "documents", "documentDisplay", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;", "connectedDeviceDisplay", "Lcom/whoop/design/models/InfoCalloutTileModel;", "dataSubmittedCallout", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Ljava/util/List;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;Lcom/whoop/design/models/InfoCalloutTileModel;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Ljava/util/List;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;Lcom/whoop/design/models/InfoCalloutTileModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "()Ljava/util/List;", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;", "component27", "component28", "component29", "()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;", "component30", "()Lcom/whoop/design/models/InfoCalloutTileModel;", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;Ljava/util/List;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;Lcom/whoop/design/models/InfoCalloutTileModel;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whooplabs_release", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "I", "getCampaignId", "Ljava/lang/String;", "getToolbarTitle", "getToolbarTitle$annotations", "()V", "getTitle", "getTitle$annotations", "getHeaderSubtitle", "getHeaderSubtitle$annotations", "getHeaderIcon", "getHeaderIcon$annotations", "getBadge", "getBadgeText", "getBadgeType", "getBadgeTextSubtitle", "getHeaderImage", "getHeaderImage$annotations", "Ljava/util/List;", "getContentBlocks", "getScheduleText", "getScheduleText$annotations", "getScheduleCta", "getStatusBadgeType", "getStatusBadgeIcon", "getStatusBadgeIcon$annotations", "getStatusTitle", "getStatusBody", "getNextTasks", "getNextTasks$annotations", "getDescription", "getDescription$annotations", "getDescriptionCta", "getSubDescription", "getSubDescription$annotations", "getAlertTitle", "getAlertTitle$annotations", "getAlertDisplay", "getFullDescription", "getFullDescription$annotations", "getCta", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/OptionsConfigResponse;", "getOptionsConfig", "getDocuments", "getDocumentDisplay", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;", "getConnectedDeviceDisplay", "Lcom/whoop/design/models/InfoCalloutTileModel;", "getDataSubmittedCallout", "Companion", "$serializer", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CampaignDetailsScreenResponse {
    private static final InterfaceC23462h[] $childSerializers;
    private final String alertDisplay;
    private final String alertTitle;
    private final String badge;
    private final String badgeText;
    private final String badgeTextSubtitle;
    private final String badgeType;
    private final int campaignId;
    private final ConnectedDeviceDisplay connectedDeviceDisplay;
    private final List<ContentBlockResponse> contentBlocks;
    private final String cta;
    private final InfoCalloutTileModel dataSubmittedCallout;
    private final String description;
    private final String descriptionCta;
    private final String documentDisplay;
    private final List<LegalDocumentResponse> documents;
    private final String fullDescription;
    private final String headerIcon;
    private final String headerImage;
    private final String headerSubtitle;
    private final List<TaskResponse> nextTasks;
    private final OptionsConfigResponse optionsConfig;
    private final String scheduleCta;
    private final String scheduleText;
    private final String statusBadgeIcon;
    private final String statusBadgeType;
    private final String statusBody;
    private final String statusTitle;
    private final String subDescription;
    private final String title;
    private final String toolbarTitle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;", "serializer", "()Lwc3/c;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CampaignDetailsScreenResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C12293a(15)), null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C12293a(16)), null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C12293a(17)), null, null, null};
    }

    public /* synthetic */ CampaignDetailsScreenResponse(int i13, int i14, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, String str10, String str11, String str12, String str13, String str14, String str15, List list2, String str16, String str17, String str18, String str19, String str20, String str21, String str22, OptionsConfigResponse optionsConfigResponse, List list3, String str23, ConnectedDeviceDisplay connectedDeviceDisplay, InfoCalloutTileModel infoCalloutTileModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (1073741823 != (i13 & 1073741823)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1073741823, CampaignDetailsScreenResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.campaignId = i14;
        this.toolbarTitle = str;
        this.title = str2;
        this.headerSubtitle = str3;
        this.headerIcon = str4;
        this.badge = str5;
        this.badgeText = str6;
        this.badgeType = str7;
        this.badgeTextSubtitle = str8;
        this.headerImage = str9;
        this.contentBlocks = list;
        this.scheduleText = str10;
        this.scheduleCta = str11;
        this.statusBadgeType = str12;
        this.statusBadgeIcon = str13;
        this.statusTitle = str14;
        this.statusBody = str15;
        this.nextTasks = list2;
        this.description = str16;
        this.descriptionCta = str17;
        this.subDescription = str18;
        this.alertTitle = str19;
        this.alertDisplay = str20;
        this.fullDescription = str21;
        this.cta = str22;
        this.optionsConfig = optionsConfigResponse;
        this.documents = list3;
        this.documentDisplay = str23;
        this.connectedDeviceDisplay = connectedDeviceDisplay;
        this.dataSubmittedCallout = infoCalloutTileModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ContentBlockResponse$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(TaskResponse$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new ArrayListSerializer(LegalDocumentResponse$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CampaignDetailsScreenResponse copy$default(CampaignDetailsScreenResponse campaignDetailsScreenResponse, int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, String str10, String str11, String str12, String str13, String str14, String str15, List list2, String str16, String str17, String str18, String str19, String str20, String str21, String str22, OptionsConfigResponse optionsConfigResponse, List list3, String str23, ConnectedDeviceDisplay connectedDeviceDisplay, InfoCalloutTileModel infoCalloutTileModel, int i14, Object obj) {
        InfoCalloutTileModel infoCalloutTileModel2;
        ConnectedDeviceDisplay connectedDeviceDisplay2;
        int i15 = (i14 & 1) != 0 ? campaignDetailsScreenResponse.campaignId : i13;
        String str24 = (i14 & 2) != 0 ? campaignDetailsScreenResponse.toolbarTitle : str;
        String str25 = (i14 & 4) != 0 ? campaignDetailsScreenResponse.title : str2;
        String str26 = (i14 & 8) != 0 ? campaignDetailsScreenResponse.headerSubtitle : str3;
        String str27 = (i14 & 16) != 0 ? campaignDetailsScreenResponse.headerIcon : str4;
        String str28 = (i14 & 32) != 0 ? campaignDetailsScreenResponse.badge : str5;
        String str29 = (i14 & 64) != 0 ? campaignDetailsScreenResponse.badgeText : str6;
        String str30 = (i14 & 128) != 0 ? campaignDetailsScreenResponse.badgeType : str7;
        String str31 = (i14 & 256) != 0 ? campaignDetailsScreenResponse.badgeTextSubtitle : str8;
        String str32 = (i14 & 512) != 0 ? campaignDetailsScreenResponse.headerImage : str9;
        List list4 = (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? campaignDetailsScreenResponse.contentBlocks : list;
        String str33 = (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? campaignDetailsScreenResponse.scheduleText : str10;
        String str34 = (i14 & 4096) != 0 ? campaignDetailsScreenResponse.scheduleCta : str11;
        String str35 = (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? campaignDetailsScreenResponse.statusBadgeType : str12;
        int i16 = i15;
        String str36 = (i14 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? campaignDetailsScreenResponse.statusBadgeIcon : str13;
        String str37 = (i14 & 32768) != 0 ? campaignDetailsScreenResponse.statusTitle : str14;
        String str38 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? campaignDetailsScreenResponse.statusBody : str15;
        List list5 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? campaignDetailsScreenResponse.nextTasks : list2;
        String str39 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? campaignDetailsScreenResponse.description : str16;
        String str40 = (i14 & 524288) != 0 ? campaignDetailsScreenResponse.descriptionCta : str17;
        String str41 = (i14 & 1048576) != 0 ? campaignDetailsScreenResponse.subDescription : str18;
        String str42 = (i14 & 2097152) != 0 ? campaignDetailsScreenResponse.alertTitle : str19;
        String str43 = (i14 & 4194304) != 0 ? campaignDetailsScreenResponse.alertDisplay : str20;
        String str44 = (i14 & 8388608) != 0 ? campaignDetailsScreenResponse.fullDescription : str21;
        String str45 = (i14 & 16777216) != 0 ? campaignDetailsScreenResponse.cta : str22;
        OptionsConfigResponse optionsConfigResponse2 = (i14 & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? campaignDetailsScreenResponse.optionsConfig : optionsConfigResponse;
        List list6 = (i14 & 67108864) != 0 ? campaignDetailsScreenResponse.documents : list3;
        String str46 = (i14 & 134217728) != 0 ? campaignDetailsScreenResponse.documentDisplay : str23;
        ConnectedDeviceDisplay connectedDeviceDisplay3 = (i14 & 268435456) != 0 ? campaignDetailsScreenResponse.connectedDeviceDisplay : connectedDeviceDisplay;
        if ((i14 & 536870912) != 0) {
            connectedDeviceDisplay2 = connectedDeviceDisplay3;
            infoCalloutTileModel2 = campaignDetailsScreenResponse.dataSubmittedCallout;
        } else {
            infoCalloutTileModel2 = infoCalloutTileModel;
            connectedDeviceDisplay2 = connectedDeviceDisplay3;
        }
        return campaignDetailsScreenResponse.copy(i16, str24, str25, str26, str27, str28, str29, str30, str31, str32, list4, str33, str34, str35, str36, str37, str38, list5, str39, str40, str41, str42, str43, str44, str45, optionsConfigResponse2, list6, str46, connectedDeviceDisplay2, infoCalloutTileModel2);
    }

    @InterfaceC37143h("alert_title_display")
    public static /* synthetic */ void getAlertTitle$annotations() {
    }

    @InterfaceC37143h("description_display")
    public static /* synthetic */ void getDescription$annotations() {
    }

    @InterfaceC37143h("full_description_display")
    public static /* synthetic */ void getFullDescription$annotations() {
    }

    @InterfaceC37143h("icon")
    public static /* synthetic */ void getHeaderIcon$annotations() {
    }

    @InterfaceC37143h("background_image")
    public static /* synthetic */ void getHeaderImage$annotations() {
    }

    @InterfaceC37143h("subtitle_display")
    public static /* synthetic */ void getHeaderSubtitle$annotations() {
    }

    @InterfaceC37143h("tasks")
    public static /* synthetic */ void getNextTasks$annotations() {
    }

    @InterfaceC37143h("schedule_title_display")
    public static /* synthetic */ void getScheduleText$annotations() {
    }

    @InterfaceC37143h("status_badge")
    public static /* synthetic */ void getStatusBadgeIcon$annotations() {
    }

    @InterfaceC37143h("sub_description_display")
    public static /* synthetic */ void getSubDescription$annotations() {
    }

    @InterfaceC37143h("title_display")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @InterfaceC37143h("page_title_display")
    public static /* synthetic */ void getToolbarTitle$annotations() {
    }

    public static final /* synthetic */ void write$Self$whooplabs_release(CampaignDetailsScreenResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeIntElement(serialDesc, 0, self.campaignId);
        output.encodeStringElement(serialDesc, 1, self.toolbarTitle);
        output.encodeStringElement(serialDesc, 2, self.title);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.headerSubtitle);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.headerIcon);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.badge);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.badgeText);
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.badgeType);
        output.encodeNullableSerializableElement(serialDesc, 8, stringSerializer, self.badgeTextSubtitle);
        output.encodeNullableSerializableElement(serialDesc, 9, stringSerializer, self.headerImage);
        output.encodeSerializableElement(serialDesc, 10, (InterfaceC37145j) interfaceC23462hArr[10].getValue(), self.contentBlocks);
        output.encodeNullableSerializableElement(serialDesc, 11, stringSerializer, self.scheduleText);
        output.encodeNullableSerializableElement(serialDesc, 12, stringSerializer, self.scheduleCta);
        output.encodeNullableSerializableElement(serialDesc, 13, stringSerializer, self.statusBadgeType);
        output.encodeNullableSerializableElement(serialDesc, 14, stringSerializer, self.statusBadgeIcon);
        output.encodeNullableSerializableElement(serialDesc, 15, stringSerializer, self.statusTitle);
        output.encodeNullableSerializableElement(serialDesc, 16, stringSerializer, self.statusBody);
        output.encodeSerializableElement(serialDesc, 17, (InterfaceC37145j) interfaceC23462hArr[17].getValue(), self.nextTasks);
        output.encodeNullableSerializableElement(serialDesc, 18, stringSerializer, self.description);
        output.encodeNullableSerializableElement(serialDesc, 19, stringSerializer, self.descriptionCta);
        output.encodeNullableSerializableElement(serialDesc, 20, stringSerializer, self.subDescription);
        output.encodeNullableSerializableElement(serialDesc, 21, stringSerializer, self.alertTitle);
        output.encodeNullableSerializableElement(serialDesc, 22, stringSerializer, self.alertDisplay);
        output.encodeNullableSerializableElement(serialDesc, 23, stringSerializer, self.fullDescription);
        output.encodeNullableSerializableElement(serialDesc, 24, stringSerializer, self.cta);
        output.encodeNullableSerializableElement(serialDesc, 25, OptionsConfigResponse$$serializer.INSTANCE, self.optionsConfig);
        output.encodeNullableSerializableElement(serialDesc, 26, (InterfaceC37145j) interfaceC23462hArr[26].getValue(), self.documents);
        output.encodeNullableSerializableElement(serialDesc, 27, stringSerializer, self.documentDisplay);
        output.encodeNullableSerializableElement(serialDesc, 28, ConnectedDeviceDisplay$$serializer.INSTANCE, self.connectedDeviceDisplay);
        output.encodeNullableSerializableElement(serialDesc, 29, InfoCalloutTileModel$$serializer.INSTANCE, self.dataSubmittedCallout);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCampaignId() {
        return this.campaignId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getHeaderImage() {
        return this.headerImage;
    }

    public final List<ContentBlockResponse> component11() {
        return this.contentBlocks;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getScheduleText() {
        return this.scheduleText;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getScheduleCta() {
        return this.scheduleCta;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getStatusBadgeType() {
        return this.statusBadgeType;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getStatusBadgeIcon() {
        return this.statusBadgeIcon;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getStatusTitle() {
        return this.statusTitle;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getStatusBody() {
        return this.statusBody;
    }

    public final List<TaskResponse> component18() {
        return this.nextTasks;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getToolbarTitle() {
        return this.toolbarTitle;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getDescriptionCta() {
        return this.descriptionCta;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getSubDescription() {
        return this.subDescription;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getAlertTitle() {
        return this.alertTitle;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getAlertDisplay() {
        return this.alertDisplay;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getFullDescription() {
        return this.fullDescription;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final OptionsConfigResponse getOptionsConfig() {
        return this.optionsConfig;
    }

    public final List<LegalDocumentResponse> component27() {
        return this.documents;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getDocumentDisplay() {
        return this.documentDisplay;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final ConnectedDeviceDisplay getConnectedDeviceDisplay() {
        return this.connectedDeviceDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final InfoCalloutTileModel getDataSubmittedCallout() {
        return this.dataSubmittedCallout;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHeaderSubtitle() {
        return this.headerSubtitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getHeaderIcon() {
        return this.headerIcon;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBadge() {
        return this.badge;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getBadgeText() {
        return this.badgeText;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getBadgeType() {
        return this.badgeType;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getBadgeTextSubtitle() {
        return this.badgeTextSubtitle;
    }

    public final CampaignDetailsScreenResponse copy(int campaignId, String toolbarTitle, String title, String headerSubtitle, String headerIcon, String badge, String badgeText, String badgeType, String badgeTextSubtitle, String headerImage, List<ContentBlockResponse> contentBlocks, String scheduleText, String scheduleCta, String statusBadgeType, String statusBadgeIcon, String statusTitle, String statusBody, List<TaskResponse> nextTasks, String description, String descriptionCta, String subDescription, String alertTitle, String alertDisplay, String fullDescription, String cta, OptionsConfigResponse optionsConfig, List<LegalDocumentResponse> documents, String documentDisplay, ConnectedDeviceDisplay connectedDeviceDisplay, InfoCalloutTileModel dataSubmittedCallout) {
        AbstractC22676k.m65750j(toolbarTitle, "toolbarTitle");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(contentBlocks, "contentBlocks");
        AbstractC22676k.m65750j(nextTasks, "nextTasks");
        return new CampaignDetailsScreenResponse(campaignId, toolbarTitle, title, headerSubtitle, headerIcon, badge, badgeText, badgeType, badgeTextSubtitle, headerImage, contentBlocks, scheduleText, scheduleCta, statusBadgeType, statusBadgeIcon, statusTitle, statusBody, nextTasks, description, descriptionCta, subDescription, alertTitle, alertDisplay, fullDescription, cta, optionsConfig, documents, documentDisplay, connectedDeviceDisplay, dataSubmittedCallout);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CampaignDetailsScreenResponse)) {
            return false;
        }
        CampaignDetailsScreenResponse campaignDetailsScreenResponse = (CampaignDetailsScreenResponse) other;
        return this.campaignId == campaignDetailsScreenResponse.campaignId && AbstractC22676k.m65745e(this.toolbarTitle, campaignDetailsScreenResponse.toolbarTitle) && AbstractC22676k.m65745e(this.title, campaignDetailsScreenResponse.title) && AbstractC22676k.m65745e(this.headerSubtitle, campaignDetailsScreenResponse.headerSubtitle) && AbstractC22676k.m65745e(this.headerIcon, campaignDetailsScreenResponse.headerIcon) && AbstractC22676k.m65745e(this.badge, campaignDetailsScreenResponse.badge) && AbstractC22676k.m65745e(this.badgeText, campaignDetailsScreenResponse.badgeText) && AbstractC22676k.m65745e(this.badgeType, campaignDetailsScreenResponse.badgeType) && AbstractC22676k.m65745e(this.badgeTextSubtitle, campaignDetailsScreenResponse.badgeTextSubtitle) && AbstractC22676k.m65745e(this.headerImage, campaignDetailsScreenResponse.headerImage) && AbstractC22676k.m65745e(this.contentBlocks, campaignDetailsScreenResponse.contentBlocks) && AbstractC22676k.m65745e(this.scheduleText, campaignDetailsScreenResponse.scheduleText) && AbstractC22676k.m65745e(this.scheduleCta, campaignDetailsScreenResponse.scheduleCta) && AbstractC22676k.m65745e(this.statusBadgeType, campaignDetailsScreenResponse.statusBadgeType) && AbstractC22676k.m65745e(this.statusBadgeIcon, campaignDetailsScreenResponse.statusBadgeIcon) && AbstractC22676k.m65745e(this.statusTitle, campaignDetailsScreenResponse.statusTitle) && AbstractC22676k.m65745e(this.statusBody, campaignDetailsScreenResponse.statusBody) && AbstractC22676k.m65745e(this.nextTasks, campaignDetailsScreenResponse.nextTasks) && AbstractC22676k.m65745e(this.description, campaignDetailsScreenResponse.description) && AbstractC22676k.m65745e(this.descriptionCta, campaignDetailsScreenResponse.descriptionCta) && AbstractC22676k.m65745e(this.subDescription, campaignDetailsScreenResponse.subDescription) && AbstractC22676k.m65745e(this.alertTitle, campaignDetailsScreenResponse.alertTitle) && AbstractC22676k.m65745e(this.alertDisplay, campaignDetailsScreenResponse.alertDisplay) && AbstractC22676k.m65745e(this.fullDescription, campaignDetailsScreenResponse.fullDescription) && AbstractC22676k.m65745e(this.cta, campaignDetailsScreenResponse.cta) && AbstractC22676k.m65745e(this.optionsConfig, campaignDetailsScreenResponse.optionsConfig) && AbstractC22676k.m65745e(this.documents, campaignDetailsScreenResponse.documents) && AbstractC22676k.m65745e(this.documentDisplay, campaignDetailsScreenResponse.documentDisplay) && AbstractC22676k.m65745e(this.connectedDeviceDisplay, campaignDetailsScreenResponse.connectedDeviceDisplay) && AbstractC22676k.m65745e(this.dataSubmittedCallout, campaignDetailsScreenResponse.dataSubmittedCallout);
    }

    public final String getAlertDisplay() {
        return this.alertDisplay;
    }

    public final String getAlertTitle() {
        return this.alertTitle;
    }

    public final String getBadge() {
        return this.badge;
    }

    public final String getBadgeText() {
        return this.badgeText;
    }

    public final String getBadgeTextSubtitle() {
        return this.badgeTextSubtitle;
    }

    public final String getBadgeType() {
        return this.badgeType;
    }

    public final int getCampaignId() {
        return this.campaignId;
    }

    public final ConnectedDeviceDisplay getConnectedDeviceDisplay() {
        return this.connectedDeviceDisplay;
    }

    public final List<ContentBlockResponse> getContentBlocks() {
        return this.contentBlocks;
    }

    public final String getCta() {
        return this.cta;
    }

    public final InfoCalloutTileModel getDataSubmittedCallout() {
        return this.dataSubmittedCallout;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDescriptionCta() {
        return this.descriptionCta;
    }

    public final String getDocumentDisplay() {
        return this.documentDisplay;
    }

    public final List<LegalDocumentResponse> getDocuments() {
        return this.documents;
    }

    public final String getFullDescription() {
        return this.fullDescription;
    }

    public final String getHeaderIcon() {
        return this.headerIcon;
    }

    public final String getHeaderImage() {
        return this.headerImage;
    }

    public final String getHeaderSubtitle() {
        return this.headerSubtitle;
    }

    public final List<TaskResponse> getNextTasks() {
        return this.nextTasks;
    }

    public final OptionsConfigResponse getOptionsConfig() {
        return this.optionsConfig;
    }

    public final String getScheduleCta() {
        return this.scheduleCta;
    }

    public final String getScheduleText() {
        return this.scheduleText;
    }

    public final String getStatusBadgeIcon() {
        return this.statusBadgeIcon;
    }

    public final String getStatusBadgeType() {
        return this.statusBadgeType;
    }

    public final String getStatusBody() {
        return this.statusBody;
    }

    public final String getStatusTitle() {
        return this.statusTitle;
    }

    public final String getSubDescription() {
        return this.subDescription;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getToolbarTitle() {
        return this.toolbarTitle;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(Integer.hashCode(this.campaignId) * 31, 31, this.toolbarTitle), 31, this.title);
        String str = this.headerSubtitle;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.headerIcon;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.badge;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.badgeText;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.badgeType;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.badgeTextSubtitle;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.headerImage;
        int iM31983b = AbstractC11895b.m31983b((iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.contentBlocks);
        String str8 = this.scheduleText;
        int iHashCode7 = (iM31983b + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.scheduleCta;
        int iHashCode8 = (iHashCode7 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.statusBadgeType;
        int iHashCode9 = (iHashCode8 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.statusBadgeIcon;
        int iHashCode10 = (iHashCode9 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.statusTitle;
        int iHashCode11 = (iHashCode10 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.statusBody;
        int iM31983b2 = AbstractC11895b.m31983b((iHashCode11 + (str13 == null ? 0 : str13.hashCode())) * 31, 31, this.nextTasks);
        String str14 = this.description;
        int iHashCode12 = (iM31983b2 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.descriptionCta;
        int iHashCode13 = (iHashCode12 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.subDescription;
        int iHashCode14 = (iHashCode13 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.alertTitle;
        int iHashCode15 = (iHashCode14 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.alertDisplay;
        int iHashCode16 = (iHashCode15 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.fullDescription;
        int iHashCode17 = (iHashCode16 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.cta;
        int iHashCode18 = (iHashCode17 + (str20 == null ? 0 : str20.hashCode())) * 31;
        OptionsConfigResponse optionsConfigResponse = this.optionsConfig;
        int iHashCode19 = (iHashCode18 + (optionsConfigResponse == null ? 0 : optionsConfigResponse.hashCode())) * 31;
        List<LegalDocumentResponse> list = this.documents;
        int iHashCode20 = (iHashCode19 + (list == null ? 0 : list.hashCode())) * 31;
        String str21 = this.documentDisplay;
        int iHashCode21 = (iHashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
        ConnectedDeviceDisplay connectedDeviceDisplay = this.connectedDeviceDisplay;
        int iHashCode22 = (iHashCode21 + (connectedDeviceDisplay == null ? 0 : connectedDeviceDisplay.hashCode())) * 31;
        InfoCalloutTileModel infoCalloutTileModel = this.dataSubmittedCallout;
        return iHashCode22 + (infoCalloutTileModel != null ? infoCalloutTileModel.hashCode() : 0);
    }

    public String toString() {
        int i13 = this.campaignId;
        String str = this.toolbarTitle;
        String str2 = this.title;
        String str3 = this.headerSubtitle;
        String str4 = this.headerIcon;
        String str5 = this.badge;
        String str6 = this.badgeText;
        String str7 = this.badgeType;
        String str8 = this.badgeTextSubtitle;
        String str9 = this.headerImage;
        List<ContentBlockResponse> list = this.contentBlocks;
        String str10 = this.scheduleText;
        String str11 = this.scheduleCta;
        String str12 = this.statusBadgeType;
        String str13 = this.statusBadgeIcon;
        String str14 = this.statusTitle;
        String str15 = this.statusBody;
        List<TaskResponse> list2 = this.nextTasks;
        String str16 = this.description;
        String str17 = this.descriptionCta;
        String str18 = this.subDescription;
        String str19 = this.alertTitle;
        String str20 = this.alertDisplay;
        String str21 = this.fullDescription;
        String str22 = this.cta;
        OptionsConfigResponse optionsConfigResponse = this.optionsConfig;
        List<LegalDocumentResponse> list3 = this.documents;
        String str23 = this.documentDisplay;
        ConnectedDeviceDisplay connectedDeviceDisplay = this.connectedDeviceDisplay;
        InfoCalloutTileModel infoCalloutTileModel = this.dataSubmittedCallout;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "CampaignDetailsScreenResponse(campaignId=", ", toolbarTitle=", str, ", title=");
        AbstractC11266d.m30444B(sbM53373n, str2, ", headerSubtitle=", str3, ", headerIcon=");
        AbstractC11266d.m30444B(sbM53373n, str4, ", badge=", str5, ", badgeText=");
        AbstractC11266d.m30444B(sbM53373n, str6, ", badgeType=", str7, ", badgeTextSubtitle=");
        AbstractC11266d.m30444B(sbM53373n, str8, ", headerImage=", str9, ", contentBlocks=");
        AbstractC17176i.m48511m(", scheduleText=", str10, ", scheduleCta=", sbM53373n, list);
        AbstractC11266d.m30444B(sbM53373n, str11, ", statusBadgeType=", str12, ", statusBadgeIcon=");
        AbstractC11266d.m30444B(sbM53373n, str13, ", statusTitle=", str14, ", statusBody=");
        AbstractC36095b.m114694v(str15, ", nextTasks=", ", description=", sbM53373n, list2);
        AbstractC11266d.m30444B(sbM53373n, str16, ", descriptionCta=", str17, ", subDescription=");
        AbstractC11266d.m30444B(sbM53373n, str18, ", alertTitle=", str19, ", alertDisplay=");
        AbstractC11266d.m30444B(sbM53373n, str20, ", fullDescription=", str21, ", cta=");
        sbM53373n.append(str22);
        sbM53373n.append(", optionsConfig=");
        sbM53373n.append(optionsConfigResponse);
        sbM53373n.append(", documents=");
        AbstractC17176i.m48511m(", documentDisplay=", str23, ", connectedDeviceDisplay=", sbM53373n, list3);
        sbM53373n.append(connectedDeviceDisplay);
        sbM53373n.append(", dataSubmittedCallout=");
        sbM53373n.append(infoCalloutTileModel);
        sbM53373n.append(")");
        return sbM53373n.toString();
    }

    public CampaignDetailsScreenResponse(int i13, String toolbarTitle, String title, String str, String str2, String str3, String str4, String str5, String str6, String str7, List<ContentBlockResponse> contentBlocks, String str8, String str9, String str10, String str11, String str12, String str13, List<TaskResponse> nextTasks, String str14, String str15, String str16, String str17, String str18, String str19, String str20, OptionsConfigResponse optionsConfigResponse, List<LegalDocumentResponse> list, String str21, ConnectedDeviceDisplay connectedDeviceDisplay, InfoCalloutTileModel infoCalloutTileModel) {
        AbstractC22676k.m65750j(toolbarTitle, "toolbarTitle");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(contentBlocks, "contentBlocks");
        AbstractC22676k.m65750j(nextTasks, "nextTasks");
        this.campaignId = i13;
        this.toolbarTitle = toolbarTitle;
        this.title = title;
        this.headerSubtitle = str;
        this.headerIcon = str2;
        this.badge = str3;
        this.badgeText = str4;
        this.badgeType = str5;
        this.badgeTextSubtitle = str6;
        this.headerImage = str7;
        this.contentBlocks = contentBlocks;
        this.scheduleText = str8;
        this.scheduleCta = str9;
        this.statusBadgeType = str10;
        this.statusBadgeIcon = str11;
        this.statusTitle = str12;
        this.statusBody = str13;
        this.nextTasks = nextTasks;
        this.description = str14;
        this.descriptionCta = str15;
        this.subDescription = str16;
        this.alertTitle = str17;
        this.alertDisplay = str18;
        this.fullDescription = str19;
        this.cta = str20;
        this.optionsConfig = optionsConfigResponse;
        this.documents = list;
        this.documentDisplay = str21;
        this.connectedDeviceDisplay = connectedDeviceDisplay;
        this.dataSubmittedCallout = infoCalloutTileModel;
    }
}
