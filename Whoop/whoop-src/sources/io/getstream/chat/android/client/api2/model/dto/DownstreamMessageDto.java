package io.getstream.chat.android.client.api2.model.dto;

import androidx.core.app.NotificationCompat;
import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import hc3.AbstractC17176i;
import io.getstream.chat.android.core.internal.StreamHandsOff;
import java.util.Date;
import java.util.List;
import java.util.Map;
import jh3.AbstractC21702c;
import live.hms.video.utils.HMSFieldTrials;
import m83.C25271y;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p441qx.InterfaceC30737t;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@StreamHandsOff(reason = "Field names can't be changed because [CustomObjectDtoAdapter] class uses reflections to add/remove content of [extraData] map")
@Metadata(m65680d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\bl\b\u0081\b\u0018\u00002\u00020\u0001Bç\u0003\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000f\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020 \u0018\u00010\u000f\u0012\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020 \u0018\u00010\u000f\u0012\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020#\u0018\u00010\u000f\u0012\u0006\u0010$\u001a\u00020 \u0012\u0006\u0010%\u001a\u00020 \u0012\b\b\u0002\u0010&\u001a\u00020\u0019\u0012\b\b\u0002\u0010'\u001a\u00020\u0019\u0012\u0006\u0010(\u001a\u00020\u0019\u0012\u0006\u0010)\u001a\u00020\b\u0012\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003\u0012\u0006\u0010+\u001a\u00020\b\u0012\u0006\u0010,\u001a\u00020\u000b\u0012\u0006\u0010-\u001a\u00020\u0014\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u000101\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000103\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000105\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000107\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000109\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0019\u0012\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020<0\u000f¢\u0006\u0004\b=\u0010>J\u000f\u0010y\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010{\u001a\u00020\bHÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010}\u001a\u00020\u000bHÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010\u007f\u001a\u00020\bHÆ\u0003J\u0016\u0010\u0080\u0001\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000fHÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020\bHÆ\u0003J\u0010\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003HÆ\u0003J\u0010\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003HÆ\u0003J\u0010\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0019HÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0000HÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0018\u0010\u008d\u0001\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020 \u0018\u00010\u000fHÆ\u0003J\u0018\u0010\u008e\u0001\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020 \u0018\u00010\u000fHÆ\u0003J\u0018\u0010\u008f\u0001\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020#\u0018\u00010\u000fHÆ\u0003J\n\u0010\u0090\u0001\u001a\u00020 HÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020 HÆ\u0003J\n\u0010\u0092\u0001\u001a\u00020\u0019HÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0019HÆ\u0003J\n\u0010\u0094\u0001\u001a\u00020\u0019HÆ\u0003J\n\u0010\u0095\u0001\u001a\u00020\bHÆ\u0003J\u0010\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003HÆ\u0003J\n\u0010\u0097\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u0098\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010\u0099\u0001\u001a\u00020\u0014HÆ\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010/HÆ\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u000101HÆ\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u000103HÆ\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u000105HÆ\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u000107HÆ\u0003J\f\u0010\u009f\u0001\u001a\u0004\u0018\u000109HÆ\u0003J\u0011\u0010 \u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u0010vJ\u0016\u0010¡\u0001\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020<0\u000fHÆ\u0003J¬\u0004\u0010¢\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\b2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020 \u0018\u00010\u000f2\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020 \u0018\u00010\u000f2\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020#\u0018\u00010\u000f2\b\b\u0002\u0010$\u001a\u00020 2\b\b\u0002\u0010%\u001a\u00020 2\b\b\u0002\u0010&\u001a\u00020\u00192\b\b\u0002\u0010'\u001a\u00020\u00192\b\b\u0002\u0010(\u001a\u00020\u00192\b\b\u0002\u0010)\u001a\u00020\b2\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0002\u0010+\u001a\u00020\b2\b\b\u0002\u0010,\u001a\u00020\u000b2\b\b\u0002\u0010-\u001a\u00020\u00142\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\n\b\u0002\u00102\u001a\u0004\u0018\u0001032\n\b\u0002\u00104\u001a\u0004\u0018\u0001052\n\b\u0002\u00106\u001a\u0004\u0018\u0001072\n\b\u0002\u00108\u001a\u0004\u0018\u0001092\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00192\u0014\b\u0002\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020<0\u000fHÆ\u0001¢\u0006\u0003\u0010£\u0001J\u0015\u0010¤\u0001\u001a\u00020\u00192\t\u0010¥\u0001\u001a\u0004\u0018\u00010<HÖ\u0003J\n\u0010¦\u0001\u001a\u00020 HÖ\u0001J\n\u0010§\u0001\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\bE\u0010DR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bH\u0010GR\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bI\u0010DR\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0011\u0010\u0010\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bL\u0010DR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003¢\u0006\b\n\u0000\u001a\u0004\bM\u0010@R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003¢\u0006\b\n\u0000\u001a\u0004\bN\u0010@R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u0010@R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\bP\u0010DR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010GR\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bT\u0010GR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bU\u0010GR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0000¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010DR\u001f\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020 \u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b[\u0010KR\u001f\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020 \u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010KR\u001f\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020#\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b]\u0010KR\u0011\u0010$\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b^\u0010_R\u0011\u0010%\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b`\u0010_R\u0011\u0010&\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\ba\u0010SR\u0011\u0010'\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\bb\u0010SR\u0011\u0010(\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\bc\u0010SR\u0011\u0010)\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bd\u0010DR\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003¢\u0006\b\n\u0000\u001a\u0004\be\u0010@R\u0011\u0010+\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bf\u0010DR\u0011\u0010,\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bg\u0010GR\u0011\u0010-\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\bh\u0010WR\u0013\u0010.\u001a\u0004\u0018\u00010/¢\u0006\b\n\u0000\u001a\u0004\bi\u0010jR\u0013\u00100\u001a\u0004\u0018\u000101¢\u0006\b\n\u0000\u001a\u0004\bk\u0010lR\u0013\u00102\u001a\u0004\u0018\u000103¢\u0006\b\n\u0000\u001a\u0004\bm\u0010nR\u0013\u00104\u001a\u0004\u0018\u000105¢\u0006\b\n\u0000\u001a\u0004\bo\u0010pR\u0013\u00106\u001a\u0004\u0018\u000107¢\u0006\b\n\u0000\u001a\u0004\bq\u0010rR\u0013\u00108\u001a\u0004\u0018\u000109¢\u0006\b\n\u0000\u001a\u0004\bs\u0010tR\u0015\u0010:\u001a\u0004\u0018\u00010\u0019¢\u0006\n\n\u0002\u0010w\u001a\u0004\bu\u0010vR\u001d\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020<0\u000f¢\u0006\b\n\u0000\u001a\u0004\bx\u0010K¨\u0006¨\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;", "attachments", "", "Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;", "channel", "Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;", "cid", "", "command", "created_at", "Ljava/util/Date;", "deleted_at", "html", "i18n", "", "id", "latest_reactions", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionDto;", "mentioned_users", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "own_reactions", "parent_id", "pin_expires", "pinned", "", "pinned_at", "message_text_updated_at", "pinned_by", "quoted_message", "quoted_message_id", "reaction_counts", "", "reaction_scores", "reaction_groups", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;", "reply_count", "deleted_reply_count", "shadowed", "show_in_channel", NotificationCompat.GROUP_KEY_SILENT, "text", "thread_participants", "type", "updated_at", UserState.Sources.USER, "moderation_details", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;", "moderation", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;", "poll", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;", NotificationCompat.CATEGORY_REMINDER, "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;", "shared_location", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;", "member", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;", "deleted_for_me", "extraData", "", "<init>", "(Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;IIZZZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;Ljava/lang/Boolean;Ljava/util/Map;)V", "getAttachments", "()Ljava/util/List;", "getChannel", "()Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;", "getCid", "()Ljava/lang/String;", "getCommand", "getCreated_at", "()Ljava/util/Date;", "getDeleted_at", "getHtml", "getI18n", "()Ljava/util/Map;", "getId", "getLatest_reactions", "getMentioned_users", "getOwn_reactions", "getParent_id", "getPin_expires", "getPinned", "()Z", "getPinned_at", "getMessage_text_updated_at", "getPinned_by", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "getQuoted_message", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "getQuoted_message_id", "getReaction_counts", "getReaction_scores", "getReaction_groups", "getReply_count", "()I", "getDeleted_reply_count", "getShadowed", "getShow_in_channel", "getSilent", "getText", "getThread_participants", "getType", "getUpdated_at", "getUser", "getModeration_details", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;", "getModeration", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;", "getPoll", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;", "getReminder", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;", "getShared_location", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;", "getMember", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;", "getDeleted_for_me", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getExtraData", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "copy", "(Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;IIZZZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;Ljava/lang/Boolean;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "equals", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class DownstreamMessageDto implements ExtraDataDto {
    private final List<AttachmentDto> attachments;
    private final ChannelInfoDto channel;
    private final String cid;
    private final String command;
    private final Date created_at;
    private final Date deleted_at;
    private final Boolean deleted_for_me;
    private final int deleted_reply_count;
    private final Map<String, Object> extraData;
    private final String html;
    private final Map<String, String> i18n;
    private final String id;
    private final List<DownstreamReactionDto> latest_reactions;
    private final DownstreamMemberInfoDto member;
    private final List<DownstreamUserDto> mentioned_users;
    private final Date message_text_updated_at;
    private final DownstreamModerationDto moderation;
    private final DownstreamModerationDetailsDto moderation_details;
    private final List<DownstreamReactionDto> own_reactions;
    private final String parent_id;
    private final Date pin_expires;
    private final boolean pinned;
    private final Date pinned_at;
    private final DownstreamUserDto pinned_by;
    private final DownstreamPollDto poll;
    private final DownstreamMessageDto quoted_message;
    private final String quoted_message_id;
    private final Map<String, Integer> reaction_counts;
    private final Map<String, DownstreamReactionGroupDto> reaction_groups;
    private final Map<String, Integer> reaction_scores;
    private final DownstreamReminderInfoDto reminder;
    private final int reply_count;
    private final boolean shadowed;
    private final DownstreamLocationDto shared_location;
    private final boolean show_in_channel;
    private final boolean silent;
    private final String text;
    private final List<DownstreamUserDto> thread_participants;
    private final String type;
    private final Date updated_at;
    private final DownstreamUserDto user;

    public DownstreamMessageDto(List<AttachmentDto> attachments, ChannelInfoDto channelInfoDto, String cid, String str, Date created_at, Date date, String html, Map<String, String> i18n, String id4, List<DownstreamReactionDto> latest_reactions, List<DownstreamUserDto> mentioned_users, List<DownstreamReactionDto> own_reactions, String str2, Date date2, boolean z4, Date date3, Date date4, DownstreamUserDto downstreamUserDto, DownstreamMessageDto downstreamMessageDto, String str3, Map<String, Integer> map, Map<String, Integer> map2, Map<String, DownstreamReactionGroupDto> map3, int i13, int i14, boolean z13, boolean z14, boolean z15, String text, List<DownstreamUserDto> thread_participants, String type, Date updated_at, DownstreamUserDto user, DownstreamModerationDetailsDto downstreamModerationDetailsDto, DownstreamModerationDto downstreamModerationDto, DownstreamPollDto downstreamPollDto, DownstreamReminderInfoDto downstreamReminderInfoDto, DownstreamLocationDto downstreamLocationDto, DownstreamMemberInfoDto downstreamMemberInfoDto, Boolean bool, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(attachments, "attachments");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(html, "html");
        AbstractC22676k.m65750j(i18n, "i18n");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(latest_reactions, "latest_reactions");
        AbstractC22676k.m65750j(mentioned_users, "mentioned_users");
        AbstractC22676k.m65750j(own_reactions, "own_reactions");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(thread_participants, "thread_participants");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(updated_at, "updated_at");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(extraData, "extraData");
        this.attachments = attachments;
        this.channel = channelInfoDto;
        this.cid = cid;
        this.command = str;
        this.created_at = created_at;
        this.deleted_at = date;
        this.html = html;
        this.i18n = i18n;
        this.id = id4;
        this.latest_reactions = latest_reactions;
        this.mentioned_users = mentioned_users;
        this.own_reactions = own_reactions;
        this.parent_id = str2;
        this.pin_expires = date2;
        this.pinned = z4;
        this.pinned_at = date3;
        this.message_text_updated_at = date4;
        this.pinned_by = downstreamUserDto;
        this.quoted_message = downstreamMessageDto;
        this.quoted_message_id = str3;
        this.reaction_counts = map;
        this.reaction_scores = map2;
        this.reaction_groups = map3;
        this.reply_count = i13;
        this.deleted_reply_count = i14;
        this.shadowed = z13;
        this.show_in_channel = z14;
        this.silent = z15;
        this.text = text;
        this.thread_participants = thread_participants;
        this.type = type;
        this.updated_at = updated_at;
        this.user = user;
        this.moderation_details = downstreamModerationDetailsDto;
        this.moderation = downstreamModerationDto;
        this.poll = downstreamPollDto;
        this.reminder = downstreamReminderInfoDto;
        this.shared_location = downstreamLocationDto;
        this.member = downstreamMemberInfoDto;
        this.deleted_for_me = bool;
        this.extraData = extraData;
    }

    public final List<AttachmentDto> component1() {
        return this.attachments;
    }

    public final List<DownstreamReactionDto> component10() {
        return this.latest_reactions;
    }

    public final List<DownstreamUserDto> component11() {
        return this.mentioned_users;
    }

    public final List<DownstreamReactionDto> component12() {
        return this.own_reactions;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getParent_id() {
        return this.parent_id;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Date getPin_expires() {
        return this.pin_expires;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getPinned() {
        return this.pinned;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Date getPinned_at() {
        return this.pinned_at;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Date getMessage_text_updated_at() {
        return this.message_text_updated_at;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final DownstreamUserDto getPinned_by() {
        return this.pinned_by;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final DownstreamMessageDto getQuoted_message() {
        return this.quoted_message;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ChannelInfoDto getChannel() {
        return this.channel;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getQuoted_message_id() {
        return this.quoted_message_id;
    }

    public final Map<String, Integer> component21() {
        return this.reaction_counts;
    }

    public final Map<String, Integer> component22() {
        return this.reaction_scores;
    }

    public final Map<String, DownstreamReactionGroupDto> component23() {
        return this.reaction_groups;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final int getReply_count() {
        return this.reply_count;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final int getDeleted_reply_count() {
        return this.deleted_reply_count;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final boolean getShadowed() {
        return this.shadowed;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final boolean getShow_in_channel() {
        return this.show_in_channel;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final boolean getSilent() {
        return this.silent;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    public final List<DownstreamUserDto> component30() {
        return this.thread_participants;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final Date getUpdated_at() {
        return this.updated_at;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final DownstreamUserDto getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final DownstreamModerationDetailsDto getModeration_details() {
        return this.moderation_details;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final DownstreamModerationDto getModeration() {
        return this.moderation;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final DownstreamPollDto getPoll() {
        return this.poll;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final DownstreamReminderInfoDto getReminder() {
        return this.reminder;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final DownstreamLocationDto getShared_location() {
        return this.shared_location;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final DownstreamMemberInfoDto getMember() {
        return this.member;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCommand() {
        return this.command;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final Boolean getDeleted_for_me() {
        return this.deleted_for_me;
    }

    public final Map<String, Object> component41() {
        return this.extraData;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Date getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Date getDeleted_at() {
        return this.deleted_at;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getHtml() {
        return this.html;
    }

    public final Map<String, String> component8() {
        return this.i18n;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final DownstreamMessageDto copy(List<AttachmentDto> attachments, ChannelInfoDto channel, String cid, String command, Date created_at, Date deleted_at, String html, Map<String, String> i18n, String id4, List<DownstreamReactionDto> latest_reactions, List<DownstreamUserDto> mentioned_users, List<DownstreamReactionDto> own_reactions, String parent_id, Date pin_expires, boolean pinned, Date pinned_at, Date message_text_updated_at, DownstreamUserDto pinned_by, DownstreamMessageDto quoted_message, String quoted_message_id, Map<String, Integer> reaction_counts, Map<String, Integer> reaction_scores, Map<String, DownstreamReactionGroupDto> reaction_groups, int reply_count, int deleted_reply_count, boolean shadowed, boolean show_in_channel, boolean silent, String text, List<DownstreamUserDto> thread_participants, String type, Date updated_at, DownstreamUserDto user, DownstreamModerationDetailsDto moderation_details, DownstreamModerationDto moderation, DownstreamPollDto poll, DownstreamReminderInfoDto reminder, DownstreamLocationDto shared_location, DownstreamMemberInfoDto member, Boolean deleted_for_me, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(attachments, "attachments");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(html, "html");
        AbstractC22676k.m65750j(i18n, "i18n");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(latest_reactions, "latest_reactions");
        AbstractC22676k.m65750j(mentioned_users, "mentioned_users");
        AbstractC22676k.m65750j(own_reactions, "own_reactions");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(thread_participants, "thread_participants");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(updated_at, "updated_at");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(extraData, "extraData");
        return new DownstreamMessageDto(attachments, channel, cid, command, created_at, deleted_at, html, i18n, id4, latest_reactions, mentioned_users, own_reactions, parent_id, pin_expires, pinned, pinned_at, message_text_updated_at, pinned_by, quoted_message, quoted_message_id, reaction_counts, reaction_scores, reaction_groups, reply_count, deleted_reply_count, shadowed, show_in_channel, silent, text, thread_participants, type, updated_at, user, moderation_details, moderation, poll, reminder, shared_location, member, deleted_for_me, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownstreamMessageDto)) {
            return false;
        }
        DownstreamMessageDto downstreamMessageDto = (DownstreamMessageDto) other;
        return AbstractC22676k.m65745e(this.attachments, downstreamMessageDto.attachments) && AbstractC22676k.m65745e(this.channel, downstreamMessageDto.channel) && AbstractC22676k.m65745e(this.cid, downstreamMessageDto.cid) && AbstractC22676k.m65745e(this.command, downstreamMessageDto.command) && AbstractC22676k.m65745e(this.created_at, downstreamMessageDto.created_at) && AbstractC22676k.m65745e(this.deleted_at, downstreamMessageDto.deleted_at) && AbstractC22676k.m65745e(this.html, downstreamMessageDto.html) && AbstractC22676k.m65745e(this.i18n, downstreamMessageDto.i18n) && AbstractC22676k.m65745e(this.id, downstreamMessageDto.id) && AbstractC22676k.m65745e(this.latest_reactions, downstreamMessageDto.latest_reactions) && AbstractC22676k.m65745e(this.mentioned_users, downstreamMessageDto.mentioned_users) && AbstractC22676k.m65745e(this.own_reactions, downstreamMessageDto.own_reactions) && AbstractC22676k.m65745e(this.parent_id, downstreamMessageDto.parent_id) && AbstractC22676k.m65745e(this.pin_expires, downstreamMessageDto.pin_expires) && this.pinned == downstreamMessageDto.pinned && AbstractC22676k.m65745e(this.pinned_at, downstreamMessageDto.pinned_at) && AbstractC22676k.m65745e(this.message_text_updated_at, downstreamMessageDto.message_text_updated_at) && AbstractC22676k.m65745e(this.pinned_by, downstreamMessageDto.pinned_by) && AbstractC22676k.m65745e(this.quoted_message, downstreamMessageDto.quoted_message) && AbstractC22676k.m65745e(this.quoted_message_id, downstreamMessageDto.quoted_message_id) && AbstractC22676k.m65745e(this.reaction_counts, downstreamMessageDto.reaction_counts) && AbstractC22676k.m65745e(this.reaction_scores, downstreamMessageDto.reaction_scores) && AbstractC22676k.m65745e(this.reaction_groups, downstreamMessageDto.reaction_groups) && this.reply_count == downstreamMessageDto.reply_count && this.deleted_reply_count == downstreamMessageDto.deleted_reply_count && this.shadowed == downstreamMessageDto.shadowed && this.show_in_channel == downstreamMessageDto.show_in_channel && this.silent == downstreamMessageDto.silent && AbstractC22676k.m65745e(this.text, downstreamMessageDto.text) && AbstractC22676k.m65745e(this.thread_participants, downstreamMessageDto.thread_participants) && AbstractC22676k.m65745e(this.type, downstreamMessageDto.type) && AbstractC22676k.m65745e(this.updated_at, downstreamMessageDto.updated_at) && AbstractC22676k.m65745e(this.user, downstreamMessageDto.user) && AbstractC22676k.m65745e(this.moderation_details, downstreamMessageDto.moderation_details) && AbstractC22676k.m65745e(this.moderation, downstreamMessageDto.moderation) && AbstractC22676k.m65745e(this.poll, downstreamMessageDto.poll) && AbstractC22676k.m65745e(this.reminder, downstreamMessageDto.reminder) && AbstractC22676k.m65745e(this.shared_location, downstreamMessageDto.shared_location) && AbstractC22676k.m65745e(this.member, downstreamMessageDto.member) && AbstractC22676k.m65745e(this.deleted_for_me, downstreamMessageDto.deleted_for_me) && AbstractC22676k.m65745e(this.extraData, downstreamMessageDto.extraData);
    }

    public final List<AttachmentDto> getAttachments() {
        return this.attachments;
    }

    public final ChannelInfoDto getChannel() {
        return this.channel;
    }

    public final String getCid() {
        return this.cid;
    }

    public final String getCommand() {
        return this.command;
    }

    public final Date getCreated_at() {
        return this.created_at;
    }

    public final Date getDeleted_at() {
        return this.deleted_at;
    }

    public final Boolean getDeleted_for_me() {
        return this.deleted_for_me;
    }

    public final int getDeleted_reply_count() {
        return this.deleted_reply_count;
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final String getHtml() {
        return this.html;
    }

    public final Map<String, String> getI18n() {
        return this.i18n;
    }

    public final String getId() {
        return this.id;
    }

    public final List<DownstreamReactionDto> getLatest_reactions() {
        return this.latest_reactions;
    }

    public final DownstreamMemberInfoDto getMember() {
        return this.member;
    }

    public final List<DownstreamUserDto> getMentioned_users() {
        return this.mentioned_users;
    }

    public final Date getMessage_text_updated_at() {
        return this.message_text_updated_at;
    }

    public final DownstreamModerationDto getModeration() {
        return this.moderation;
    }

    public final DownstreamModerationDetailsDto getModeration_details() {
        return this.moderation_details;
    }

    public final List<DownstreamReactionDto> getOwn_reactions() {
        return this.own_reactions;
    }

    public final String getParent_id() {
        return this.parent_id;
    }

    public final Date getPin_expires() {
        return this.pin_expires;
    }

    public final boolean getPinned() {
        return this.pinned;
    }

    public final Date getPinned_at() {
        return this.pinned_at;
    }

    public final DownstreamUserDto getPinned_by() {
        return this.pinned_by;
    }

    public final DownstreamPollDto getPoll() {
        return this.poll;
    }

    public final DownstreamMessageDto getQuoted_message() {
        return this.quoted_message;
    }

    public final String getQuoted_message_id() {
        return this.quoted_message_id;
    }

    public final Map<String, Integer> getReaction_counts() {
        return this.reaction_counts;
    }

    public final Map<String, DownstreamReactionGroupDto> getReaction_groups() {
        return this.reaction_groups;
    }

    public final Map<String, Integer> getReaction_scores() {
        return this.reaction_scores;
    }

    public final DownstreamReminderInfoDto getReminder() {
        return this.reminder;
    }

    public final int getReply_count() {
        return this.reply_count;
    }

    public final boolean getShadowed() {
        return this.shadowed;
    }

    public final DownstreamLocationDto getShared_location() {
        return this.shared_location;
    }

    public final boolean getShow_in_channel() {
        return this.show_in_channel;
    }

    public final boolean getSilent() {
        return this.silent;
    }

    public final String getText() {
        return this.text;
    }

    public final List<DownstreamUserDto> getThread_participants() {
        return this.thread_participants;
    }

    public final String getType() {
        return this.type;
    }

    public final Date getUpdated_at() {
        return this.updated_at;
    }

    public final DownstreamUserDto getUser() {
        return this.user;
    }

    public int hashCode() {
        int iHashCode = this.attachments.hashCode() * 31;
        ChannelInfoDto channelInfoDto = this.channel;
        int iM30450d = AbstractC11266d.m30450d((iHashCode + (channelInfoDto == null ? 0 : channelInfoDto.hashCode())) * 31, 31, this.cid);
        String str = this.command;
        int iM124373c = AbstractC38963t7.m124373c(this.created_at, (iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31);
        Date date = this.deleted_at;
        int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC3855a.m11821e(this.i18n, AbstractC11266d.m30450d((iM124373c + (date == null ? 0 : date.hashCode())) * 31, 31, this.html), 31), 31, this.id), 31, this.latest_reactions), 31, this.mentioned_users), 31, this.own_reactions);
        String str2 = this.parent_id;
        int iHashCode2 = (iM31983b + (str2 == null ? 0 : str2.hashCode())) * 31;
        Date date2 = this.pin_expires;
        int iM8289b = AbstractC2875y.m8289b((iHashCode2 + (date2 == null ? 0 : date2.hashCode())) * 31, 31, this.pinned);
        Date date3 = this.pinned_at;
        int iHashCode3 = (iM8289b + (date3 == null ? 0 : date3.hashCode())) * 31;
        Date date4 = this.message_text_updated_at;
        int iHashCode4 = (iHashCode3 + (date4 == null ? 0 : date4.hashCode())) * 31;
        DownstreamUserDto downstreamUserDto = this.pinned_by;
        int iHashCode5 = (iHashCode4 + (downstreamUserDto == null ? 0 : downstreamUserDto.hashCode())) * 31;
        DownstreamMessageDto downstreamMessageDto = this.quoted_message;
        int iHashCode6 = (iHashCode5 + (downstreamMessageDto == null ? 0 : downstreamMessageDto.hashCode())) * 31;
        String str3 = this.quoted_message_id;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, Integer> map = this.reaction_counts;
        int iHashCode8 = (iHashCode7 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, Integer> map2 = this.reaction_scores;
        int iHashCode9 = (iHashCode8 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, DownstreamReactionGroupDto> map3 = this.reaction_groups;
        int iM11819c = AbstractC3855a.m11819c(this.user, AbstractC38963t7.m124373c(this.updated_at, AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.deleted_reply_count, AbstractC11266d.m30448b(this.reply_count, (iHashCode9 + (map3 == null ? 0 : map3.hashCode())) * 31, 31), 31), 31, this.shadowed), 31, this.show_in_channel), 31, this.silent), 31, this.text), 31, this.thread_participants), 31, this.type), 31), 31);
        DownstreamModerationDetailsDto downstreamModerationDetailsDto = this.moderation_details;
        int iHashCode10 = (iM11819c + (downstreamModerationDetailsDto == null ? 0 : downstreamModerationDetailsDto.hashCode())) * 31;
        DownstreamModerationDto downstreamModerationDto = this.moderation;
        int iHashCode11 = (iHashCode10 + (downstreamModerationDto == null ? 0 : downstreamModerationDto.hashCode())) * 31;
        DownstreamPollDto downstreamPollDto = this.poll;
        int iHashCode12 = (iHashCode11 + (downstreamPollDto == null ? 0 : downstreamPollDto.hashCode())) * 31;
        DownstreamReminderInfoDto downstreamReminderInfoDto = this.reminder;
        int iHashCode13 = (iHashCode12 + (downstreamReminderInfoDto == null ? 0 : downstreamReminderInfoDto.hashCode())) * 31;
        DownstreamLocationDto downstreamLocationDto = this.shared_location;
        int iHashCode14 = (iHashCode13 + (downstreamLocationDto == null ? 0 : downstreamLocationDto.hashCode())) * 31;
        DownstreamMemberInfoDto downstreamMemberInfoDto = this.member;
        int iHashCode15 = (iHashCode14 + (downstreamMemberInfoDto == null ? 0 : downstreamMemberInfoDto.hashCode())) * 31;
        Boolean bool = this.deleted_for_me;
        return this.extraData.hashCode() + ((iHashCode15 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public String toString() {
        List<AttachmentDto> list = this.attachments;
        ChannelInfoDto channelInfoDto = this.channel;
        String str = this.cid;
        String str2 = this.command;
        Date date = this.created_at;
        Date date2 = this.deleted_at;
        String str3 = this.html;
        Map<String, String> map = this.i18n;
        String str4 = this.id;
        List<DownstreamReactionDto> list2 = this.latest_reactions;
        List<DownstreamUserDto> list3 = this.mentioned_users;
        List<DownstreamReactionDto> list4 = this.own_reactions;
        String str5 = this.parent_id;
        Date date3 = this.pin_expires;
        boolean z4 = this.pinned;
        Date date4 = this.pinned_at;
        Date date5 = this.message_text_updated_at;
        DownstreamUserDto downstreamUserDto = this.pinned_by;
        DownstreamMessageDto downstreamMessageDto = this.quoted_message;
        String str6 = this.quoted_message_id;
        Map<String, Integer> map2 = this.reaction_counts;
        Map<String, Integer> map3 = this.reaction_scores;
        Map<String, DownstreamReactionGroupDto> map4 = this.reaction_groups;
        int i13 = this.reply_count;
        int i14 = this.deleted_reply_count;
        boolean z13 = this.shadowed;
        boolean z14 = this.show_in_channel;
        boolean z15 = this.silent;
        String str7 = this.text;
        List<DownstreamUserDto> list5 = this.thread_participants;
        String str8 = this.type;
        Date date6 = this.updated_at;
        DownstreamUserDto downstreamUserDto2 = this.user;
        DownstreamModerationDetailsDto downstreamModerationDetailsDto = this.moderation_details;
        DownstreamModerationDto downstreamModerationDto = this.moderation;
        DownstreamPollDto downstreamPollDto = this.poll;
        DownstreamReminderInfoDto downstreamReminderInfoDto = this.reminder;
        DownstreamLocationDto downstreamLocationDto = this.shared_location;
        DownstreamMemberInfoDto downstreamMemberInfoDto = this.member;
        Boolean bool = this.deleted_for_me;
        Map<String, Object> map5 = this.extraData;
        StringBuilder sb4 = new StringBuilder("DownstreamMessageDto(attachments=");
        sb4.append(list);
        sb4.append(", channel=");
        sb4.append(channelInfoDto);
        sb4.append(", cid=");
        AbstractC11266d.m30444B(sb4, str, ", command=", str2, ", created_at=");
        AbstractC17176i.m48512n(sb4, date, ", deleted_at=", date2, ", html=");
        AbstractC36095b.m114695w(sb4, str3, ", i18n=", map, ", id=");
        AbstractC36095b.m114694v(str4, ", latest_reactions=", ", mentioned_users=", sb4, list2);
        AbstractC21702c.m61148s(sb4, list3, ", own_reactions=", list4, ", parent_id=");
        AbstractC13673n.m38579z(sb4, str5, ", pin_expires=", date3, ", pinned=");
        sb4.append(z4);
        sb4.append(", pinned_at=");
        sb4.append(date4);
        sb4.append(", message_text_updated_at=");
        sb4.append(date5);
        sb4.append(", pinned_by=");
        sb4.append(downstreamUserDto);
        sb4.append(", quoted_message=");
        sb4.append(downstreamMessageDto);
        sb4.append(", quoted_message_id=");
        sb4.append(str6);
        sb4.append(", reaction_counts=");
        AbstractC3855a.m11840x(sb4, map2, ", reaction_scores=", map3, ", reaction_groups=");
        sb4.append(map4);
        sb4.append(", reply_count=");
        sb4.append(i13);
        sb4.append(", deleted_reply_count=");
        AbstractC13673n.m38573t(i14, ", shadowed=", ", show_in_channel=", sb4, z13);
        AbstractC38963t7.m124392v(sb4, z14, ", silent=", z15, ", text=");
        AbstractC36095b.m114694v(str7, ", thread_participants=", ", type=", sb4, list5);
        AbstractC13673n.m38579z(sb4, str8, ", updated_at=", date6, ", user=");
        sb4.append(downstreamUserDto2);
        sb4.append(", moderation_details=");
        sb4.append(downstreamModerationDetailsDto);
        sb4.append(", moderation=");
        sb4.append(downstreamModerationDto);
        sb4.append(", poll=");
        sb4.append(downstreamPollDto);
        sb4.append(", reminder=");
        sb4.append(downstreamReminderInfoDto);
        sb4.append(", shared_location=");
        sb4.append(downstreamLocationDto);
        sb4.append(", member=");
        sb4.append(downstreamMemberInfoDto);
        sb4.append(", deleted_for_me=");
        sb4.append(bool);
        sb4.append(", extraData=");
        return AbstractC13673n.m38565l(sb4, map5, ")");
    }

    public /* synthetic */ DownstreamMessageDto(List list, ChannelInfoDto channelInfoDto, String str, String str2, Date date, Date date2, String str3, Map map, String str4, List list2, List list3, List list4, String str5, Date date3, boolean z4, Date date4, Date date5, DownstreamUserDto downstreamUserDto, DownstreamMessageDto downstreamMessageDto, String str6, Map map2, Map map3, Map map4, int i13, int i14, boolean z13, boolean z14, boolean z15, String str7, List list5, String str8, Date date6, DownstreamUserDto downstreamUserDto2, DownstreamModerationDetailsDto downstreamModerationDetailsDto, DownstreamModerationDto downstreamModerationDto, DownstreamPollDto downstreamPollDto, DownstreamReminderInfoDto downstreamReminderInfoDto, DownstreamLocationDto downstreamLocationDto, DownstreamMemberInfoDto downstreamMemberInfoDto, Boolean bool, Map map5, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, channelInfoDto, str, str2, date, date2, str3, (i15 & 128) != 0 ? C25272z.f99163w : map, str4, list2, list3, list4, str5, date3, (i15 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? false : z4, date4, date5, downstreamUserDto, downstreamMessageDto, str6, map2, map3, map4, i13, i14, (33554432 & i15) != 0 ? false : z13, (67108864 & i15) != 0 ? false : z14, z15, str7, (i15 & 536870912) != 0 ? C25271y.f99162w : list5, str8, date6, downstreamUserDto2, (i16 & 2) != 0 ? null : downstreamModerationDetailsDto, (i16 & 4) != 0 ? null : downstreamModerationDto, (i16 & 8) != 0 ? null : downstreamPollDto, (i16 & 16) != 0 ? null : downstreamReminderInfoDto, (i16 & 32) != 0 ? null : downstreamLocationDto, (i16 & 64) != 0 ? null : downstreamMemberInfoDto, bool, map5);
    }
}
