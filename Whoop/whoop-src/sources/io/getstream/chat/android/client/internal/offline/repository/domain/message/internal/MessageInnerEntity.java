package io.getstream.chat.android.client.internal.offline.repository.domain.message.internal;

import androidx.core.app.NotificationCompat;
import c13.AbstractC3855a;
import hc3.AbstractC17176i;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.channelinfo.internal.ChannelInfoEntity;
import io.getstream.chat.android.models.SyncStatus;
import java.util.Date;
import java.util.List;
import java.util.Map;
import jh3.AbstractC21702c;
import m83.C25271y;
import m83.C25272z;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bq\b\u0081\b\u0018\u00002\u00020\u0001B«\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u0018\u0012\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u0018\u0012\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u0018\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001f\u0012\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0018\u0012\b\b\u0002\u0010!\u001a\u00020\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\u0012\b\b\u0002\u0010$\u001a\u00020\u001f\u0012\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0018\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010'\u001a\u00020\u001f\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015\u0012\b\b\u0002\u0010,\u001a\u00020\u001f\u0012\b\b\u0002\u0010-\u001a\u00020\u001f\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u000101\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u000f\u0012\b\u00103\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u00104\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000106\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010:\u001a\u00020\u001f¢\u0006\u0004\b;\u0010<J\t\u0010x\u001a\u00020\u0003HÆ\u0003J\t\u0010y\u001a\u00020\u0003HÆ\u0003J\t\u0010z\u001a\u00020\u0003HÆ\u0003J\t\u0010{\u001a\u00020\u0003HÆ\u0003J\t\u0010|\u001a\u00020\u0003HÆ\u0003J\t\u0010}\u001a\u00020\u0003HÆ\u0003J\t\u0010~\u001a\u00020\nHÆ\u0003J\t\u0010\u007f\u001a\u00020\fHÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020\fHÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0010\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015HÆ\u0003J\u0010\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015HÆ\u0003J\u0016\u0010\u0088\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u0018HÆ\u0003J\u0016\u0010\u0089\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u0018HÆ\u0003J\u0016\u0010\u008a\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u0018HÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020\u001fHÆ\u0003J\u0016\u0010\u008e\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0018HÆ\u0003J\n\u0010\u008f\u0001\u001a\u00020\u001fHÆ\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010#HÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020\u001fHÆ\u0003J\u0016\u0010\u0092\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0018HÆ\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0094\u0001\u001a\u00020\u001fHÆ\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015HÆ\u0003J\n\u0010\u0099\u0001\u001a\u00020\u001fHÆ\u0003J\n\u0010\u009a\u0001\u001a\u00020\u001fHÆ\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u00010/HÆ\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u000101HÆ\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u009f\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015HÆ\u0003J\f\u0010 \u0001\u001a\u0004\u0018\u000106HÆ\u0003J\f\u0010¡\u0001\u001a\u0004\u0018\u000108HÆ\u0003J\f\u0010¢\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010£\u0001\u001a\u00020\u001fHÆ\u0003J¼\u0004\u0010¤\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u00182\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u00182\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u00182\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00182\b\b\u0002\u0010!\u001a\u00020\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010$\u001a\u00020\u001f2\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00182\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010'\u001a\u00020\u001f2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\b\b\u0002\u0010,\u001a\u00020\u001f2\b\b\u0002\u0010-\u001a\u00020\u001f2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u00104\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\n\b\u0002\u00107\u001a\u0004\u0018\u0001082\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010:\u001a\u00020\u001fHÆ\u0001J\u0015\u0010¥\u0001\u001a\u00020\u001f2\t\u0010¦\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010§\u0001\u001a\u00020\fHÖ\u0001J\n\u0010¨\u0001\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010>R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010>R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010>R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010>R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010>R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bH\u0010GR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bK\u0010JR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bL\u0010JR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bM\u0010JR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bN\u0010JR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010PR\u001d\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u0018¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u001d\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u0018¢\u0006\b\n\u0000\u001a\u0004\bT\u0010SR\u001d\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u0018¢\u0006\b\n\u0000\u001a\u0004\bU\u0010SR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bV\u0010>R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bW\u0010>R\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u001d\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0018¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010SR\u0011\u0010!\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b[\u0010YR\u0018\u0010\"\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010]R\u0011\u0010$\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b^\u0010YR\u001d\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b_\u0010SR\u0013\u0010&\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b`\u0010>R\u0011\u0010'\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\ba\u0010YR\u0013\u0010(\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bb\u0010JR\u0013\u0010)\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bc\u0010JR\u0013\u0010*\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bd\u0010>R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015¢\u0006\b\n\u0000\u001a\u0004\be\u0010PR\u001a\u0010,\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010Y\"\u0004\bg\u0010hR\u001a\u0010-\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010Y\"\u0004\bj\u0010hR\u0013\u0010.\u001a\u0004\u0018\u00010/¢\u0006\b\n\u0000\u001a\u0004\bk\u0010lR\u0013\u00100\u001a\u0004\u0018\u000101¢\u0006\b\n\u0000\u001a\u0004\bm\u0010nR\u0013\u00102\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bo\u0010JR\u0013\u00103\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bp\u0010>R\u0017\u00104\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015¢\u0006\b\n\u0000\u001a\u0004\bq\u0010PR\u0013\u00105\u001a\u0004\u0018\u000106¢\u0006\b\n\u0000\u001a\u0004\br\u0010sR\u0013\u00107\u001a\u0004\u0018\u000108¢\u0006\b\n\u0000\u001a\u0004\bt\u0010uR\u0013\u00109\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bv\u0010>R\u0011\u0010:\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\bw\u0010Y¨\u0006©\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;", "", "id", "", "cid", "userId", "text", "html", "type", "syncStatus", "Lio/getstream/chat/android/models/SyncStatus;", "replyCount", "", "deletedReplyCount", "createdAt", "Ljava/util/Date;", "createdLocallyAt", "updatedAt", "updatedLocallyAt", "deletedAt", "remoteMentionedUserIds", "", "mentionedUsersId", "reactionCounts", "", "reactionScores", "reactionGroups", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntity;", "parentId", "command", "shadowed", "", "i18n", "showInChannel", "channelInfo", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;", NotificationCompat.GROUP_KEY_SILENT, "extraData", "replyToId", "pinned", "pinnedAt", "pinExpires", "pinnedByUserId", "threadParticipantsIds", "skipPushNotification", "skipEnrichUrl", "moderationDetails", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;", "moderation", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;", "messageTextUpdatedAt", "pollId", "restrictedVisibility", NotificationCompat.CATEGORY_REMINDER, "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;", "sharedLocation", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;", "channelRole", "deletedForMe", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/SyncStatus;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;ZLio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;ZLjava/util/Map;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;ZZLio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getCid", "getUserId", "getText", "getHtml", "getType", "getSyncStatus", "()Lio/getstream/chat/android/models/SyncStatus;", "getReplyCount", "()I", "getDeletedReplyCount", "getCreatedAt", "()Ljava/util/Date;", "getCreatedLocallyAt", "getUpdatedAt", "getUpdatedLocallyAt", "getDeletedAt", "getRemoteMentionedUserIds", "()Ljava/util/List;", "getMentionedUsersId", "getReactionCounts", "()Ljava/util/Map;", "getReactionScores", "getReactionGroups", "getParentId", "getCommand", "getShadowed", "()Z", "getI18n", "getShowInChannel", "getChannelInfo", "()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;", "getSilent", "getExtraData", "getReplyToId", "getPinned", "getPinnedAt", "getPinExpires", "getPinnedByUserId", "getThreadParticipantsIds", "getSkipPushNotification", "setSkipPushNotification", "(Z)V", "getSkipEnrichUrl", "setSkipEnrichUrl", "getModerationDetails", "()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;", "getModeration", "()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;", "getMessageTextUpdatedAt", "getPollId", "getRestrictedVisibility", "getReminder", "()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;", "getSharedLocation", "()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;", "getChannelRole", "getDeletedForMe", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "copy", "equals", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class MessageInnerEntity {
    private final ChannelInfoEntity channelInfo;
    private final String channelRole;
    private final String cid;
    private final String command;
    private final Date createdAt;
    private final Date createdLocallyAt;
    private final Date deletedAt;
    private final boolean deletedForMe;
    private final int deletedReplyCount;
    private final Map<String, Object> extraData;
    private final String html;
    private final Map<String, String> i18n;
    private final String id;
    private final List<String> mentionedUsersId;
    private final Date messageTextUpdatedAt;
    private final ModerationEntity moderation;
    private final ModerationDetailsEntity moderationDetails;
    private final String parentId;
    private final Date pinExpires;
    private final boolean pinned;
    private final Date pinnedAt;
    private final String pinnedByUserId;
    private final String pollId;
    private final Map<String, Integer> reactionCounts;
    private final Map<String, ReactionGroupEntity> reactionGroups;
    private final Map<String, Integer> reactionScores;
    private final ReminderInfoEntity reminder;
    private final List<String> remoteMentionedUserIds;
    private final int replyCount;
    private final String replyToId;
    private final List<String> restrictedVisibility;
    private final boolean shadowed;
    private final LocationEntity sharedLocation;
    private final boolean showInChannel;
    private final boolean silent;
    private boolean skipEnrichUrl;
    private boolean skipPushNotification;
    private final SyncStatus syncStatus;
    private final String text;
    private final List<String> threadParticipantsIds;
    private final String type;
    private final Date updatedAt;
    private final Date updatedLocallyAt;
    private final String userId;

    public MessageInnerEntity(String id4, String cid, String userId, String text, String html, String type, SyncStatus syncStatus, int i13, int i14, Date date, Date date2, Date date3, Date date4, Date date5, List<String> remoteMentionedUserIds, List<String> mentionedUsersId, Map<String, Integer> reactionCounts, Map<String, Integer> reactionScores, Map<String, ReactionGroupEntity> reactionGroups, String str, String str2, boolean z4, Map<String, String> i18n, boolean z13, ChannelInfoEntity channelInfoEntity, boolean z14, Map<String, ? extends Object> extraData, String str3, boolean z15, Date date6, Date date7, String str4, List<String> threadParticipantsIds, boolean z16, boolean z17, ModerationDetailsEntity moderationDetailsEntity, ModerationEntity moderationEntity, Date date8, String str5, List<String> restrictedVisibility, ReminderInfoEntity reminderInfoEntity, LocationEntity locationEntity, String str6, boolean z18) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(html, "html");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(syncStatus, "syncStatus");
        AbstractC22676k.m65750j(remoteMentionedUserIds, "remoteMentionedUserIds");
        AbstractC22676k.m65750j(mentionedUsersId, "mentionedUsersId");
        AbstractC22676k.m65750j(reactionCounts, "reactionCounts");
        AbstractC22676k.m65750j(reactionScores, "reactionScores");
        AbstractC22676k.m65750j(reactionGroups, "reactionGroups");
        AbstractC22676k.m65750j(i18n, "i18n");
        AbstractC22676k.m65750j(extraData, "extraData");
        AbstractC22676k.m65750j(threadParticipantsIds, "threadParticipantsIds");
        AbstractC22676k.m65750j(restrictedVisibility, "restrictedVisibility");
        this.id = id4;
        this.cid = cid;
        this.userId = userId;
        this.text = text;
        this.html = html;
        this.type = type;
        this.syncStatus = syncStatus;
        this.replyCount = i13;
        this.deletedReplyCount = i14;
        this.createdAt = date;
        this.createdLocallyAt = date2;
        this.updatedAt = date3;
        this.updatedLocallyAt = date4;
        this.deletedAt = date5;
        this.remoteMentionedUserIds = remoteMentionedUserIds;
        this.mentionedUsersId = mentionedUsersId;
        this.reactionCounts = reactionCounts;
        this.reactionScores = reactionScores;
        this.reactionGroups = reactionGroups;
        this.parentId = str;
        this.command = str2;
        this.shadowed = z4;
        this.i18n = i18n;
        this.showInChannel = z13;
        this.channelInfo = channelInfoEntity;
        this.silent = z14;
        this.extraData = extraData;
        this.replyToId = str3;
        this.pinned = z15;
        this.pinnedAt = date6;
        this.pinExpires = date7;
        this.pinnedByUserId = str4;
        this.threadParticipantsIds = threadParticipantsIds;
        this.skipPushNotification = z16;
        this.skipEnrichUrl = z17;
        this.moderationDetails = moderationDetailsEntity;
        this.moderation = moderationEntity;
        this.messageTextUpdatedAt = date8;
        this.pollId = str5;
        this.restrictedVisibility = restrictedVisibility;
        this.reminder = reminderInfoEntity;
        this.sharedLocation = locationEntity;
        this.channelRole = str6;
        this.deletedForMe = z18;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Date getCreatedLocallyAt() {
        return this.createdLocallyAt;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Date getUpdatedLocallyAt() {
        return this.updatedLocallyAt;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Date getDeletedAt() {
        return this.deletedAt;
    }

    public final List<String> component15() {
        return this.remoteMentionedUserIds;
    }

    public final List<String> component16() {
        return this.mentionedUsersId;
    }

    public final Map<String, Integer> component17() {
        return this.reactionCounts;
    }

    public final Map<String, Integer> component18() {
        return this.reactionScores;
    }

    public final Map<String, ReactionGroupEntity> component19() {
        return this.reactionGroups;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getCommand() {
        return this.command;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final boolean getShadowed() {
        return this.shadowed;
    }

    public final Map<String, String> component23() {
        return this.i18n;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final boolean getShowInChannel() {
        return this.showInChannel;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final ChannelInfoEntity getChannelInfo() {
        return this.channelInfo;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final boolean getSilent() {
        return this.silent;
    }

    public final Map<String, Object> component27() {
        return this.extraData;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getReplyToId() {
        return this.replyToId;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final boolean getPinned() {
        return this.pinned;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final Date getPinnedAt() {
        return this.pinnedAt;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final Date getPinExpires() {
        return this.pinExpires;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getPinnedByUserId() {
        return this.pinnedByUserId;
    }

    public final List<String> component33() {
        return this.threadParticipantsIds;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final boolean getSkipPushNotification() {
        return this.skipPushNotification;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final boolean getSkipEnrichUrl() {
        return this.skipEnrichUrl;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final ModerationDetailsEntity getModerationDetails() {
        return this.moderationDetails;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final ModerationEntity getModeration() {
        return this.moderation;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final Date getMessageTextUpdatedAt() {
        return this.messageTextUpdatedAt;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final String getPollId() {
        return this.pollId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final List<String> component40() {
        return this.restrictedVisibility;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final ReminderInfoEntity getReminder() {
        return this.reminder;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final LocationEntity getSharedLocation() {
        return this.sharedLocation;
    }

    /* JADX INFO: renamed from: component43, reason: from getter */
    public final String getChannelRole() {
        return this.channelRole;
    }

    /* JADX INFO: renamed from: component44, reason: from getter */
    public final boolean getDeletedForMe() {
        return this.deletedForMe;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getHtml() {
        return this.html;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final SyncStatus getSyncStatus() {
        return this.syncStatus;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getReplyCount() {
        return this.replyCount;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getDeletedReplyCount() {
        return this.deletedReplyCount;
    }

    public final MessageInnerEntity copy(String id4, String cid, String userId, String text, String html, String type, SyncStatus syncStatus, int replyCount, int deletedReplyCount, Date createdAt, Date createdLocallyAt, Date updatedAt, Date updatedLocallyAt, Date deletedAt, List<String> remoteMentionedUserIds, List<String> mentionedUsersId, Map<String, Integer> reactionCounts, Map<String, Integer> reactionScores, Map<String, ReactionGroupEntity> reactionGroups, String parentId, String command, boolean shadowed, Map<String, String> i18n, boolean showInChannel, ChannelInfoEntity channelInfo, boolean silent, Map<String, ? extends Object> extraData, String replyToId, boolean pinned, Date pinnedAt, Date pinExpires, String pinnedByUserId, List<String> threadParticipantsIds, boolean skipPushNotification, boolean skipEnrichUrl, ModerationDetailsEntity moderationDetails, ModerationEntity moderation, Date messageTextUpdatedAt, String pollId, List<String> restrictedVisibility, ReminderInfoEntity reminder, LocationEntity sharedLocation, String channelRole, boolean deletedForMe) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(html, "html");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(syncStatus, "syncStatus");
        AbstractC22676k.m65750j(remoteMentionedUserIds, "remoteMentionedUserIds");
        AbstractC22676k.m65750j(mentionedUsersId, "mentionedUsersId");
        AbstractC22676k.m65750j(reactionCounts, "reactionCounts");
        AbstractC22676k.m65750j(reactionScores, "reactionScores");
        AbstractC22676k.m65750j(reactionGroups, "reactionGroups");
        AbstractC22676k.m65750j(i18n, "i18n");
        AbstractC22676k.m65750j(extraData, "extraData");
        AbstractC22676k.m65750j(threadParticipantsIds, "threadParticipantsIds");
        AbstractC22676k.m65750j(restrictedVisibility, "restrictedVisibility");
        return new MessageInnerEntity(id4, cid, userId, text, html, type, syncStatus, replyCount, deletedReplyCount, createdAt, createdLocallyAt, updatedAt, updatedLocallyAt, deletedAt, remoteMentionedUserIds, mentionedUsersId, reactionCounts, reactionScores, reactionGroups, parentId, command, shadowed, i18n, showInChannel, channelInfo, silent, extraData, replyToId, pinned, pinnedAt, pinExpires, pinnedByUserId, threadParticipantsIds, skipPushNotification, skipEnrichUrl, moderationDetails, moderation, messageTextUpdatedAt, pollId, restrictedVisibility, reminder, sharedLocation, channelRole, deletedForMe);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageInnerEntity)) {
            return false;
        }
        MessageInnerEntity messageInnerEntity = (MessageInnerEntity) other;
        return AbstractC22676k.m65745e(this.id, messageInnerEntity.id) && AbstractC22676k.m65745e(this.cid, messageInnerEntity.cid) && AbstractC22676k.m65745e(this.userId, messageInnerEntity.userId) && AbstractC22676k.m65745e(this.text, messageInnerEntity.text) && AbstractC22676k.m65745e(this.html, messageInnerEntity.html) && AbstractC22676k.m65745e(this.type, messageInnerEntity.type) && this.syncStatus == messageInnerEntity.syncStatus && this.replyCount == messageInnerEntity.replyCount && this.deletedReplyCount == messageInnerEntity.deletedReplyCount && AbstractC22676k.m65745e(this.createdAt, messageInnerEntity.createdAt) && AbstractC22676k.m65745e(this.createdLocallyAt, messageInnerEntity.createdLocallyAt) && AbstractC22676k.m65745e(this.updatedAt, messageInnerEntity.updatedAt) && AbstractC22676k.m65745e(this.updatedLocallyAt, messageInnerEntity.updatedLocallyAt) && AbstractC22676k.m65745e(this.deletedAt, messageInnerEntity.deletedAt) && AbstractC22676k.m65745e(this.remoteMentionedUserIds, messageInnerEntity.remoteMentionedUserIds) && AbstractC22676k.m65745e(this.mentionedUsersId, messageInnerEntity.mentionedUsersId) && AbstractC22676k.m65745e(this.reactionCounts, messageInnerEntity.reactionCounts) && AbstractC22676k.m65745e(this.reactionScores, messageInnerEntity.reactionScores) && AbstractC22676k.m65745e(this.reactionGroups, messageInnerEntity.reactionGroups) && AbstractC22676k.m65745e(this.parentId, messageInnerEntity.parentId) && AbstractC22676k.m65745e(this.command, messageInnerEntity.command) && this.shadowed == messageInnerEntity.shadowed && AbstractC22676k.m65745e(this.i18n, messageInnerEntity.i18n) && this.showInChannel == messageInnerEntity.showInChannel && AbstractC22676k.m65745e(this.channelInfo, messageInnerEntity.channelInfo) && this.silent == messageInnerEntity.silent && AbstractC22676k.m65745e(this.extraData, messageInnerEntity.extraData) && AbstractC22676k.m65745e(this.replyToId, messageInnerEntity.replyToId) && this.pinned == messageInnerEntity.pinned && AbstractC22676k.m65745e(this.pinnedAt, messageInnerEntity.pinnedAt) && AbstractC22676k.m65745e(this.pinExpires, messageInnerEntity.pinExpires) && AbstractC22676k.m65745e(this.pinnedByUserId, messageInnerEntity.pinnedByUserId) && AbstractC22676k.m65745e(this.threadParticipantsIds, messageInnerEntity.threadParticipantsIds) && this.skipPushNotification == messageInnerEntity.skipPushNotification && this.skipEnrichUrl == messageInnerEntity.skipEnrichUrl && AbstractC22676k.m65745e(this.moderationDetails, messageInnerEntity.moderationDetails) && AbstractC22676k.m65745e(this.moderation, messageInnerEntity.moderation) && AbstractC22676k.m65745e(this.messageTextUpdatedAt, messageInnerEntity.messageTextUpdatedAt) && AbstractC22676k.m65745e(this.pollId, messageInnerEntity.pollId) && AbstractC22676k.m65745e(this.restrictedVisibility, messageInnerEntity.restrictedVisibility) && AbstractC22676k.m65745e(this.reminder, messageInnerEntity.reminder) && AbstractC22676k.m65745e(this.sharedLocation, messageInnerEntity.sharedLocation) && AbstractC22676k.m65745e(this.channelRole, messageInnerEntity.channelRole) && this.deletedForMe == messageInnerEntity.deletedForMe;
    }

    public final ChannelInfoEntity getChannelInfo() {
        return this.channelInfo;
    }

    public final String getChannelRole() {
        return this.channelRole;
    }

    public final String getCid() {
        return this.cid;
    }

    public final String getCommand() {
        return this.command;
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final Date getCreatedLocallyAt() {
        return this.createdLocallyAt;
    }

    public final Date getDeletedAt() {
        return this.deletedAt;
    }

    public final boolean getDeletedForMe() {
        return this.deletedForMe;
    }

    public final int getDeletedReplyCount() {
        return this.deletedReplyCount;
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

    public final List<String> getMentionedUsersId() {
        return this.mentionedUsersId;
    }

    public final Date getMessageTextUpdatedAt() {
        return this.messageTextUpdatedAt;
    }

    public final ModerationEntity getModeration() {
        return this.moderation;
    }

    public final ModerationDetailsEntity getModerationDetails() {
        return this.moderationDetails;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final Date getPinExpires() {
        return this.pinExpires;
    }

    public final boolean getPinned() {
        return this.pinned;
    }

    public final Date getPinnedAt() {
        return this.pinnedAt;
    }

    public final String getPinnedByUserId() {
        return this.pinnedByUserId;
    }

    public final String getPollId() {
        return this.pollId;
    }

    public final Map<String, Integer> getReactionCounts() {
        return this.reactionCounts;
    }

    public final Map<String, ReactionGroupEntity> getReactionGroups() {
        return this.reactionGroups;
    }

    public final Map<String, Integer> getReactionScores() {
        return this.reactionScores;
    }

    public final ReminderInfoEntity getReminder() {
        return this.reminder;
    }

    public final List<String> getRemoteMentionedUserIds() {
        return this.remoteMentionedUserIds;
    }

    public final int getReplyCount() {
        return this.replyCount;
    }

    public final String getReplyToId() {
        return this.replyToId;
    }

    public final List<String> getRestrictedVisibility() {
        return this.restrictedVisibility;
    }

    public final boolean getShadowed() {
        return this.shadowed;
    }

    public final LocationEntity getSharedLocation() {
        return this.sharedLocation;
    }

    public final boolean getShowInChannel() {
        return this.showInChannel;
    }

    public final boolean getSilent() {
        return this.silent;
    }

    public final boolean getSkipEnrichUrl() {
        return this.skipEnrichUrl;
    }

    public final boolean getSkipPushNotification() {
        return this.skipPushNotification;
    }

    public final SyncStatus getSyncStatus() {
        return this.syncStatus;
    }

    public final String getText() {
        return this.text;
    }

    public final List<String> getThreadParticipantsIds() {
        return this.threadParticipantsIds;
    }

    public final String getType() {
        return this.type;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public final Date getUpdatedLocallyAt() {
        return this.updatedLocallyAt;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.deletedReplyCount, AbstractC11266d.m30448b(this.replyCount, (this.syncStatus.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.cid), 31, this.userId), 31, this.text), 31, this.html), 31, this.type)) * 31, 31), 31);
        Date date = this.createdAt;
        int iHashCode = (iM30448b + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.createdLocallyAt;
        int iHashCode2 = (iHashCode + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.updatedAt;
        int iHashCode3 = (iHashCode2 + (date3 == null ? 0 : date3.hashCode())) * 31;
        Date date4 = this.updatedLocallyAt;
        int iHashCode4 = (iHashCode3 + (date4 == null ? 0 : date4.hashCode())) * 31;
        Date date5 = this.deletedAt;
        int iM11821e = AbstractC3855a.m11821e(this.reactionGroups, AbstractC3855a.m11821e(this.reactionScores, AbstractC3855a.m11821e(this.reactionCounts, AbstractC11895b.m31983b(AbstractC11895b.m31983b((iHashCode4 + (date5 == null ? 0 : date5.hashCode())) * 31, 31, this.remoteMentionedUserIds), 31, this.mentionedUsersId), 31), 31), 31);
        String str = this.parentId;
        int iHashCode5 = (iM11821e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.command;
        int iM8289b = AbstractC2875y.m8289b(AbstractC3855a.m11821e(this.i18n, AbstractC2875y.m8289b((iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.shadowed), 31), 31, this.showInChannel);
        ChannelInfoEntity channelInfoEntity = this.channelInfo;
        int iM11821e2 = AbstractC3855a.m11821e(this.extraData, AbstractC2875y.m8289b((iM8289b + (channelInfoEntity == null ? 0 : channelInfoEntity.hashCode())) * 31, 31, this.silent), 31);
        String str3 = this.replyToId;
        int iM8289b2 = AbstractC2875y.m8289b((iM11821e2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.pinned);
        Date date6 = this.pinnedAt;
        int iHashCode6 = (iM8289b2 + (date6 == null ? 0 : date6.hashCode())) * 31;
        Date date7 = this.pinExpires;
        int iHashCode7 = (iHashCode6 + (date7 == null ? 0 : date7.hashCode())) * 31;
        String str4 = this.pinnedByUserId;
        int iM8289b3 = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11895b.m31983b((iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.threadParticipantsIds), 31, this.skipPushNotification), 31, this.skipEnrichUrl);
        ModerationDetailsEntity moderationDetailsEntity = this.moderationDetails;
        int iHashCode8 = (iM8289b3 + (moderationDetailsEntity == null ? 0 : moderationDetailsEntity.hashCode())) * 31;
        ModerationEntity moderationEntity = this.moderation;
        int iHashCode9 = (iHashCode8 + (moderationEntity == null ? 0 : moderationEntity.hashCode())) * 31;
        Date date8 = this.messageTextUpdatedAt;
        int iHashCode10 = (iHashCode9 + (date8 == null ? 0 : date8.hashCode())) * 31;
        String str5 = this.pollId;
        int iM31983b = AbstractC11895b.m31983b((iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.restrictedVisibility);
        ReminderInfoEntity reminderInfoEntity = this.reminder;
        int iHashCode11 = (iM31983b + (reminderInfoEntity == null ? 0 : reminderInfoEntity.hashCode())) * 31;
        LocationEntity locationEntity = this.sharedLocation;
        int iHashCode12 = (iHashCode11 + (locationEntity == null ? 0 : locationEntity.hashCode())) * 31;
        String str6 = this.channelRole;
        return Boolean.hashCode(this.deletedForMe) + ((iHashCode12 + (str6 != null ? str6.hashCode() : 0)) * 31);
    }

    public final void setSkipEnrichUrl(boolean z4) {
        this.skipEnrichUrl = z4;
    }

    public final void setSkipPushNotification(boolean z4) {
        this.skipPushNotification = z4;
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.cid;
        String str3 = this.userId;
        String str4 = this.text;
        String str5 = this.html;
        String str6 = this.type;
        SyncStatus syncStatus = this.syncStatus;
        int i13 = this.replyCount;
        int i14 = this.deletedReplyCount;
        Date date = this.createdAt;
        Date date2 = this.createdLocallyAt;
        Date date3 = this.updatedAt;
        Date date4 = this.updatedLocallyAt;
        Date date5 = this.deletedAt;
        List<String> list = this.remoteMentionedUserIds;
        List<String> list2 = this.mentionedUsersId;
        Map<String, Integer> map = this.reactionCounts;
        Map<String, Integer> map2 = this.reactionScores;
        Map<String, ReactionGroupEntity> map3 = this.reactionGroups;
        String str7 = this.parentId;
        String str8 = this.command;
        boolean z4 = this.shadowed;
        Map<String, String> map4 = this.i18n;
        boolean z13 = this.showInChannel;
        ChannelInfoEntity channelInfoEntity = this.channelInfo;
        boolean z14 = this.silent;
        Map<String, Object> map5 = this.extraData;
        String str9 = this.replyToId;
        boolean z15 = this.pinned;
        Date date6 = this.pinnedAt;
        Date date7 = this.pinExpires;
        String str10 = this.pinnedByUserId;
        List<String> list3 = this.threadParticipantsIds;
        boolean z16 = this.skipPushNotification;
        boolean z17 = this.skipEnrichUrl;
        ModerationDetailsEntity moderationDetailsEntity = this.moderationDetails;
        ModerationEntity moderationEntity = this.moderation;
        Date date8 = this.messageTextUpdatedAt;
        String str11 = this.pollId;
        List<String> list4 = this.restrictedVisibility;
        ReminderInfoEntity reminderInfoEntity = this.reminder;
        LocationEntity locationEntity = this.sharedLocation;
        String str12 = this.channelRole;
        boolean z18 = this.deletedForMe;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("MessageInnerEntity(id=", str, ", cid=", str2, ", userId=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", text=", str4, ", html=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", type=", str6, ", syncStatus=");
        sbM32001t.append(syncStatus);
        sbM32001t.append(", replyCount=");
        sbM32001t.append(i13);
        sbM32001t.append(", deletedReplyCount=");
        sbM32001t.append(i14);
        sbM32001t.append(", createdAt=");
        sbM32001t.append(date);
        sbM32001t.append(", createdLocallyAt=");
        AbstractC17176i.m48512n(sbM32001t, date2, ", updatedAt=", date3, ", updatedLocallyAt=");
        AbstractC17176i.m48512n(sbM32001t, date4, ", deletedAt=", date5, ", remoteMentionedUserIds=");
        AbstractC21702c.m61148s(sbM32001t, list, ", mentionedUsersId=", list2, ", reactionCounts=");
        AbstractC3855a.m11840x(sbM32001t, map, ", reactionScores=", map2, ", reactionGroups=");
        sbM32001t.append(map3);
        sbM32001t.append(", parentId=");
        sbM32001t.append(str7);
        sbM32001t.append(", command=");
        AbstractC38963t7.m124390t(sbM32001t, str8, ", shadowed=", z4, ", i18n=");
        sbM32001t.append(map4);
        sbM32001t.append(", showInChannel=");
        sbM32001t.append(z13);
        sbM32001t.append(", channelInfo=");
        sbM32001t.append(channelInfoEntity);
        sbM32001t.append(", silent=");
        sbM32001t.append(z14);
        sbM32001t.append(", extraData=");
        sbM32001t.append(map5);
        sbM32001t.append(", replyToId=");
        sbM32001t.append(str9);
        sbM32001t.append(", pinned=");
        sbM32001t.append(z15);
        sbM32001t.append(", pinnedAt=");
        sbM32001t.append(date6);
        sbM32001t.append(", pinExpires=");
        sbM32001t.append(date7);
        sbM32001t.append(", pinnedByUserId=");
        sbM32001t.append(str10);
        sbM32001t.append(", threadParticipantsIds=");
        AbstractC26725a.m79512p(", skipPushNotification=", ", skipEnrichUrl=", sbM32001t, list3, z16);
        sbM32001t.append(z17);
        sbM32001t.append(", moderationDetails=");
        sbM32001t.append(moderationDetailsEntity);
        sbM32001t.append(", moderation=");
        sbM32001t.append(moderationEntity);
        sbM32001t.append(", messageTextUpdatedAt=");
        sbM32001t.append(date8);
        sbM32001t.append(", pollId=");
        AbstractC36095b.m114694v(str11, ", restrictedVisibility=", ", reminder=", sbM32001t, list4);
        sbM32001t.append(reminderInfoEntity);
        sbM32001t.append(", sharedLocation=");
        sbM32001t.append(locationEntity);
        sbM32001t.append(", channelRole=");
        return AbstractC21702c.m61137h(sbM32001t, str12, ", deletedForMe=", z18, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MessageInnerEntity(String str, String str2, String str3, String str4, String str5, String str6, SyncStatus syncStatus, int i13, int i14, Date date, Date date2, Date date3, Date date4, Date date5, List list, List list2, Map map, Map map2, Map map3, String str7, String str8, boolean z4, Map map4, boolean z13, ChannelInfoEntity channelInfoEntity, boolean z14, Map map5, String str9, boolean z15, Date date6, Date date7, String str10, List list3, boolean z16, boolean z17, ModerationDetailsEntity moderationDetailsEntity, ModerationEntity moderationEntity, Date date8, String str11, List list4, ReminderInfoEntity reminderInfoEntity, LocationEntity locationEntity, String str12, boolean z18, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        String str13 = (i15 & 8) != 0 ? "" : str4;
        String str14 = (i15 & 16) != 0 ? "" : str5;
        String str15 = (i15 & 32) != 0 ? "" : str6;
        SyncStatus syncStatus2 = (i15 & 64) != 0 ? SyncStatus.COMPLETED : syncStatus;
        int i17 = (i15 & 128) != 0 ? 0 : i13;
        int i18 = (i15 & 256) != 0 ? 0 : i14;
        Date date9 = (i15 & 512) != 0 ? null : date;
        Date date10 = (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : date2;
        Date date11 = (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : date3;
        Date date12 = (i15 & 4096) != 0 ? null : date4;
        Date date13 = (i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : date5;
        int i19 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
        C25271y c25271y = C25271y.f99162w;
        List list5 = i19 != 0 ? c25271y : list;
        List list6 = (32768 & i15) != 0 ? c25271y : list2;
        int i24 = 65536 & i15;
        C25272z c25272z = C25272z.f99163w;
        this(str, str2, str3, str13, str14, str15, syncStatus2, i17, i18, date9, date10, date11, date12, date13, list5, list6, i24 != 0 ? c25272z : map, (131072 & i15) != 0 ? c25272z : map2, (262144 & i15) != 0 ? c25272z : map3, (524288 & i15) != 0 ? null : str7, (1048576 & i15) != 0 ? null : str8, (2097152 & i15) != 0 ? false : z4, (4194304 & i15) != 0 ? c25272z : map4, (8388608 & i15) != 0 ? false : z13, (16777216 & i15) != 0 ? null : channelInfoEntity, (33554432 & i15) != 0 ? false : z14, (67108864 & i15) != 0 ? c25272z : map5, str9, z15, (536870912 & i15) != 0 ? null : date6, (i15 & 1073741824) != 0 ? null : date7, str10, (i16 & 1) != 0 ? c25271y : list3, (i16 & 2) != 0 ? false : z16, (i16 & 4) != 0 ? false : z17, (i16 & 8) != 0 ? null : moderationDetailsEntity, (i16 & 16) != 0 ? null : moderationEntity, (i16 & 32) != 0 ? null : date8, str11, (i16 & 128) != 0 ? c25271y : list4, (i16 & 256) != 0 ? null : reminderInfoEntity, (i16 & 512) != 0 ? null : locationEntity, (i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : str12, (i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? false : z18);
    }
}
