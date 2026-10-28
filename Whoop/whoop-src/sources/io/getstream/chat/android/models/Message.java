package io.getstream.chat.android.models;

import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import d13.AbstractC11478a;
import io.getstream.chat.android.models.querysort.ComparableFieldProvider;
import java.util.Date;
import java.util.List;
import java.util.Map;
import live.hms.video.utils.AndroidSDKConstants;
import live.hms.video.utils.HMSConstantsKt;
import m83.C25271y;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bF\n\u0002\u0010\u000f\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b7\b\u0087\b\u0018\u0000 Î\u00012\u00020\u00012\u00020\u0002:\u0004Î\u0001Ï\u0001Bõ\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u0014\u0012\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u0014\u0012\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00170\u0014\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u001f\u0012\b\b\u0002\u0010$\u001a\u00020\u000f\u0012\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020&0\u0014\u0012\b\b\u0002\u0010'\u001a\u00020(\u0012\b\b\u0002\u0010)\u001a\u00020(\u0012\u0014\b\u0002\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0014\u0012\b\b\u0002\u0010+\u001a\u00020(\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0000\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u00100\u001a\u00020(\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u000f\u0012\u000e\b\u0002\u00104\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b\u0012\b\b\u0002\u00105\u001a\u00020(\u0012\b\b\u0002\u00106\u001a\u00020(\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010:\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=\u0012\u000e\b\u0002\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010D\u001a\u00020(¢\u0006\u0004\bE\u0010FJ\u0019\u0010\u0088\u0001\u001a\t\u0012\u0002\b\u0003\u0018\u00010\u0089\u00012\u0007\u0010\u008a\u0001\u001a\u00020\u0004H\u0016J\u0010\u0010\u008b\u0001\u001a\u00020\u00042\u0007\u0010\u008c\u0001\u001a\u00020\u0004JD\u0010\u008f\u0001\u001a\u0003H\u0090\u0001\"\u0005\b\u0000\u0010\u0091\u0001\"\u0005\b\u0001\u0010\u0090\u0001*\u0010\u0012\u0005\u0012\u0003H\u0091\u0001\u0012\u0005\u0012\u0003H\u0090\u00010\u00142\b\u0010\u0092\u0001\u001a\u0003H\u0091\u00012\b\u0010\u0093\u0001\u001a\u0003H\u0090\u0001H\u0002¢\u0006\u0003\u0010\u0094\u0001J\b\u0010\u0095\u0001\u001a\u00030\u0096\u0001J\t\u0010\u0097\u0001\u001a\u00020\u0004H\u0016J\n\u0010\u0098\u0001\u001a\u00030\u0099\u0001H\u0007J\n\u0010\u009a\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010\u009b\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010\u009c\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010\u009d\u0001\u001a\u00020\u0004HÆ\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010 \u0001\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u0010\u0010¡\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bHÆ\u0003J\u0010\u0010¢\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bHÆ\u0003J\n\u0010£\u0001\u001a\u00020\u0011HÆ\u0003J\n\u0010¤\u0001\u001a\u00020\u0011HÆ\u0003J\u0016\u0010¥\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u0014HÆ\u0003J\u0016\u0010¦\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u0014HÆ\u0003J\u0016\u0010§\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00170\u0014HÆ\u0003J\n\u0010¨\u0001\u001a\u00020\u0019HÆ\u0003J\n\u0010©\u0001\u001a\u00020\u0004HÆ\u0003J\u0010\u0010ª\u0001\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000bHÆ\u0003J\u0010\u0010«\u0001\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000bHÆ\u0003J\f\u0010¬\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\f\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\f\u0010®\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\f\u0010¯\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\f\u0010°\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\n\u0010±\u0001\u001a\u00020\u000fHÆ\u0003J\u0016\u0010²\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020&0\u0014HÆ\u0003J\n\u0010³\u0001\u001a\u00020(HÆ\u0003J\n\u0010´\u0001\u001a\u00020(HÆ\u0003J\u0016\u0010µ\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0014HÆ\u0003J\n\u0010¶\u0001\u001a\u00020(HÆ\u0003J\f\u0010·\u0001\u001a\u0004\u0018\u00010-HÆ\u0003J\f\u0010¸\u0001\u001a\u0004\u0018\u00010\u0000HÆ\u0003J\f\u0010¹\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\n\u0010º\u0001\u001a\u00020(HÆ\u0003J\f\u0010»\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\f\u0010¼\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\f\u0010½\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0010\u0010¾\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bHÆ\u0003J\n\u0010¿\u0001\u001a\u00020(HÆ\u0003J\n\u0010À\u0001\u001a\u00020(HÆ\u0003J\f\u0010Á\u0001\u001a\u0004\u0018\u000108HÆ\u0003J\f\u0010Â\u0001\u001a\u0004\u0018\u00010:HÆ\u0003J\f\u0010Ã\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\f\u0010Ä\u0001\u001a\u0004\u0018\u00010=HÆ\u0003J\u0010\u0010Å\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bHÆ\u0003J\f\u0010Æ\u0001\u001a\u0004\u0018\u00010@HÆ\u0003J\f\u0010Ç\u0001\u001a\u0004\u0018\u00010BHÆ\u0003J\f\u0010È\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\n\u0010É\u0001\u001a\u00020(HÆ\u0003Jø\u0004\u0010Ê\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u00142\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u00142\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00170\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00042\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010$\u001a\u00020\u000f2\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020&0\u00142\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020(2\u0014\b\u0002\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00142\b\b\u0002\u0010+\u001a\u00020(2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u00100\u001a\u00020(2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u000f2\u000e\b\u0002\u00104\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\b\b\u0002\u00105\u001a\u00020(2\b\b\u0002\u00106\u001a\u00020(2\n\b\u0002\u00107\u001a\u0004\u0018\u0001082\n\b\u0002\u00109\u001a\u0004\u0018\u00010:2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=2\u000e\b\u0002\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010D\u001a\u00020(HÆ\u0001J\u0015\u0010Ë\u0001\u001a\u00020(2\t\u0010Ì\u0001\u001a\u0004\u0018\u00010&HÖ\u0003J\n\u0010Í\u0001\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010HR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010HR\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010HR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010HR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010HR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\b\n\u0000\u001a\u0004\bP\u0010OR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010OR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0011\u0010\u0012\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\bT\u0010SR\u001d\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u0014¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u001d\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u0014¢\u0006\b\n\u0000\u001a\u0004\bW\u0010VR\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00170\u0014¢\u0006\b\n\u0000\u001a\u0004\bX\u0010VR\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\bY\u0010ZR\u0011\u0010\u001a\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u0010HR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010OR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b¢\u0006\b\n\u0000\u001a\u0004\b]\u0010OR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\b^\u0010_R\u0013\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\b`\u0010_R\u0013\u0010!\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\ba\u0010_R\u0013\u0010\"\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\bb\u0010_R\u001c\u0010#\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010_\"\u0004\bd\u0010eR\u0011\u0010$\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\bf\u0010gR \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020&0\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bh\u0010VR\u0011\u0010'\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\bi\u0010jR\u0011\u0010)\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\bk\u0010jR\u001d\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0014¢\u0006\b\n\u0000\u001a\u0004\bl\u0010VR\u0011\u0010+\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\bm\u0010jR\u0013\u0010,\u001a\u0004\u0018\u00010-¢\u0006\b\n\u0000\u001a\u0004\bn\u0010oR\u0013\u0010.\u001a\u0004\u0018\u00010\u0000¢\u0006\b\n\u0000\u001a\u0004\bp\u0010qR\u0013\u0010/\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\br\u0010HR\u0011\u00100\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\bs\u0010jR\u0013\u00101\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\bt\u0010_R\u0013\u00102\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\bu\u0010_R\u0013\u00103\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bv\u0010gR\u0017\u00104\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b¢\u0006\b\n\u0000\u001a\u0004\bw\u0010OR\u0011\u00105\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\bx\u0010jR\u0011\u00106\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\by\u0010jR\u0013\u00107\u001a\u0004\u0018\u000108¢\u0006\b\n\u0000\u001a\u0004\bz\u0010{R\u0013\u00109\u001a\u0004\u0018\u00010:¢\u0006\b\n\u0000\u001a\u0004\b|\u0010}R\u0013\u0010;\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\b~\u0010_R\u0014\u0010<\u001a\u0004\u0018\u00010=¢\u0006\t\n\u0000\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010OR\u0015\u0010?\u001a\u0004\u0018\u00010@¢\u0006\n\n\u0000\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0015\u0010A\u001a\u0004\u0018\u00010B¢\u0006\n\n\u0000\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0014\u0010C\u001a\u0004\u0018\u00010\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010HR\u0012\u0010D\u001a\u00020(¢\u0006\t\n\u0000\u001a\u0005\b\u0087\u0001\u0010jR\u0013\u0010\u008d\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010H¨\u0006Ð\u0001"}, m65681d2 = {"Lio/getstream/chat/android/models/Message;", "Lio/getstream/chat/android/models/CustomObject;", "Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;", "id", "", "cid", "text", "html", "parentId", "command", "attachments", "", "Lio/getstream/chat/android/models/Attachment;", "mentionedUsersIds", "mentionedUsers", "Lio/getstream/chat/android/models/User;", "replyCount", "", "deletedReplyCount", "reactionCounts", "", "reactionScores", "reactionGroups", "Lio/getstream/chat/android/models/ReactionGroup;", "syncStatus", "Lio/getstream/chat/android/models/SyncStatus;", "type", "latestReactions", "Lio/getstream/chat/android/models/Reaction;", "ownReactions", "createdAt", "Ljava/util/Date;", "updatedAt", "deletedAt", "updatedLocallyAt", "createdLocallyAt", UserState.Sources.USER, "extraData", "", NotificationCompat.GROUP_KEY_SILENT, "", "shadowed", "i18n", "showInChannel", "channelInfo", "Lio/getstream/chat/android/models/ChannelInfo;", "replyTo", "replyMessageId", "pinned", "pinnedAt", "pinExpires", "pinnedBy", "threadParticipants", "skipPushNotification", "skipEnrichUrl", "moderationDetails", "Lio/getstream/chat/android/models/MessageModerationDetails;", "moderation", "Lio/getstream/chat/android/models/Moderation;", "messageTextUpdatedAt", "poll", "Lio/getstream/chat/android/models/Poll;", "restrictedVisibility", NotificationCompat.CATEGORY_REMINDER, "Lio/getstream/chat/android/models/MessageReminderInfo;", "sharedLocation", "Lio/getstream/chat/android/models/Location;", "channelRole", "deletedForMe", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getCid", "getText", "getHtml", "getParentId", "getCommand", "getAttachments", "()Ljava/util/List;", "getMentionedUsersIds", "getMentionedUsers", "getReplyCount", "()I", "getDeletedReplyCount", "getReactionCounts", "()Ljava/util/Map;", "getReactionScores", "getReactionGroups", "getSyncStatus", "()Lio/getstream/chat/android/models/SyncStatus;", "getType", "getLatestReactions", "getOwnReactions", "getCreatedAt", "()Ljava/util/Date;", "getUpdatedAt", "getDeletedAt", "getUpdatedLocallyAt", "getCreatedLocallyAt", "setCreatedLocallyAt", "(Ljava/util/Date;)V", "getUser", "()Lio/getstream/chat/android/models/User;", "getExtraData", "getSilent", "()Z", "getShadowed", "getI18n", "getShowInChannel", "getChannelInfo", "()Lio/getstream/chat/android/models/ChannelInfo;", "getReplyTo", "()Lio/getstream/chat/android/models/Message;", "getReplyMessageId", "getPinned", "getPinnedAt", "getPinExpires", "getPinnedBy", "getThreadParticipants", "getSkipPushNotification", "getSkipEnrichUrl", "getModerationDetails", "()Lio/getstream/chat/android/models/MessageModerationDetails;", "getModeration", "()Lio/getstream/chat/android/models/Moderation;", "getMessageTextUpdatedAt", "getPoll", "()Lio/getstream/chat/android/models/Poll;", "getRestrictedVisibility", "getReminder", "()Lio/getstream/chat/android/models/MessageReminderInfo;", "getSharedLocation", "()Lio/getstream/chat/android/models/Location;", "getChannelRole", "getDeletedForMe", "getComparableField", "", "fieldName", "getTranslation", "language", "originalLanguage", "getOriginalLanguage", "get", "B", "A", "key", HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY, "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "identifierHash", "", "toString", "newBuilder", "Lio/getstream/chat/android/models/Message$Builder;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "copy", "equals", "other", "hashCode", "Companion", "Builder", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class Message implements CustomObject, ComparableFieldProvider {
    public static final String TYPE_EPHEMERAL = "ephemeral";
    public static final String TYPE_ERROR = "error";
    public static final String TYPE_REGULAR = "regular";
    private final List<Attachment> attachments;
    private final ChannelInfo channelInfo;
    private final String channelRole;
    private final String cid;
    private final String command;
    private final Date createdAt;
    private Date createdLocallyAt;
    private final Date deletedAt;
    private final boolean deletedForMe;
    private final int deletedReplyCount;
    private final Map<String, Object> extraData;
    private final String html;
    private final Map<String, String> i18n;
    private final String id;
    private final List<Reaction> latestReactions;
    private final List<User> mentionedUsers;
    private final List<String> mentionedUsersIds;
    private final Date messageTextUpdatedAt;
    private final Moderation moderation;
    private final MessageModerationDetails moderationDetails;
    private final List<Reaction> ownReactions;
    private final String parentId;
    private final Date pinExpires;
    private final boolean pinned;
    private final Date pinnedAt;
    private final User pinnedBy;
    private final Poll poll;
    private final Map<String, Integer> reactionCounts;
    private final Map<String, ReactionGroup> reactionGroups;
    private final Map<String, Integer> reactionScores;
    private final MessageReminderInfo reminder;
    private final int replyCount;
    private final String replyMessageId;
    private final Message replyTo;
    private final List<String> restrictedVisibility;
    private final boolean shadowed;
    private final Location sharedLocation;
    private final boolean showInChannel;
    private final boolean silent;
    private final boolean skipEnrichUrl;
    private final boolean skipPushNotification;
    private final SyncStatus syncStatus;
    private final String text;
    private final List<User> threadParticipants;
    private final String type;
    private final Date updatedAt;
    private final Date updatedLocallyAt;
    private final User user;

    public Message() {
        this(null, null, null, null, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, null, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, false, -1, 65535, null);
    }

    private final <A, B> B get(Map<A, ? extends B> map, A a5, B b) {
        B b6 = map.get(a5);
        return b6 == null ? b : b6;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getReplyCount() {
        return this.replyCount;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getDeletedReplyCount() {
        return this.deletedReplyCount;
    }

    public final Map<String, Integer> component12() {
        return this.reactionCounts;
    }

    public final Map<String, Integer> component13() {
        return this.reactionScores;
    }

    public final Map<String, ReactionGroup> component14() {
        return this.reactionGroups;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final SyncStatus getSyncStatus() {
        return this.syncStatus;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final List<Reaction> component17() {
        return this.latestReactions;
    }

    public final List<Reaction> component18() {
        return this.ownReactions;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Date getDeletedAt() {
        return this.deletedAt;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Date getUpdatedLocallyAt() {
        return this.updatedLocallyAt;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Date getCreatedLocallyAt() {
        return this.createdLocallyAt;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    public final Map<String, Object> component25() {
        return this.extraData;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final boolean getSilent() {
        return this.silent;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final boolean getShadowed() {
        return this.shadowed;
    }

    public final Map<String, String> component28() {
        return this.i18n;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final boolean getShowInChannel() {
        return this.showInChannel;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final ChannelInfo getChannelInfo() {
        return this.channelInfo;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final Message getReplyTo() {
        return this.replyTo;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getReplyMessageId() {
        return this.replyMessageId;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final boolean getPinned() {
        return this.pinned;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final Date getPinnedAt() {
        return this.pinnedAt;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final Date getPinExpires() {
        return this.pinExpires;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final User getPinnedBy() {
        return this.pinnedBy;
    }

    public final List<User> component37() {
        return this.threadParticipants;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final boolean getSkipPushNotification() {
        return this.skipPushNotification;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final boolean getSkipEnrichUrl() {
        return this.skipEnrichUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHtml() {
        return this.html;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final MessageModerationDetails getModerationDetails() {
        return this.moderationDetails;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final Moderation getModeration() {
        return this.moderation;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final Date getMessageTextUpdatedAt() {
        return this.messageTextUpdatedAt;
    }

    /* JADX INFO: renamed from: component43, reason: from getter */
    public final Poll getPoll() {
        return this.poll;
    }

    public final List<String> component44() {
        return this.restrictedVisibility;
    }

    /* JADX INFO: renamed from: component45, reason: from getter */
    public final MessageReminderInfo getReminder() {
        return this.reminder;
    }

    /* JADX INFO: renamed from: component46, reason: from getter */
    public final Location getSharedLocation() {
        return this.sharedLocation;
    }

    /* JADX INFO: renamed from: component47, reason: from getter */
    public final String getChannelRole() {
        return this.channelRole;
    }

    /* JADX INFO: renamed from: component48, reason: from getter */
    public final boolean getDeletedForMe() {
        return this.deletedForMe;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCommand() {
        return this.command;
    }

    public final List<Attachment> component7() {
        return this.attachments;
    }

    public final List<String> component8() {
        return this.mentionedUsersIds;
    }

    public final List<User> component9() {
        return this.mentionedUsers;
    }

    public final Message copy(String id4, String cid, String text, String html, String parentId, String command, List<Attachment> attachments, List<String> mentionedUsersIds, List<User> mentionedUsers, int replyCount, int deletedReplyCount, Map<String, Integer> reactionCounts, Map<String, Integer> reactionScores, Map<String, ReactionGroup> reactionGroups, SyncStatus syncStatus, String type, List<Reaction> latestReactions, List<Reaction> ownReactions, Date createdAt, Date updatedAt, Date deletedAt, Date updatedLocallyAt, Date createdLocallyAt, User user, Map<String, ? extends Object> extraData, boolean silent, boolean shadowed, Map<String, String> i18n, boolean showInChannel, ChannelInfo channelInfo, Message replyTo, String replyMessageId, boolean pinned, Date pinnedAt, Date pinExpires, User pinnedBy, List<User> threadParticipants, boolean skipPushNotification, boolean skipEnrichUrl, MessageModerationDetails moderationDetails, Moderation moderation, Date messageTextUpdatedAt, Poll poll, List<String> restrictedVisibility, MessageReminderInfo reminder, Location sharedLocation, String channelRole, boolean deletedForMe) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(html, "html");
        AbstractC22676k.m65750j(attachments, "attachments");
        AbstractC22676k.m65750j(mentionedUsersIds, "mentionedUsersIds");
        AbstractC22676k.m65750j(mentionedUsers, "mentionedUsers");
        AbstractC22676k.m65750j(reactionCounts, "reactionCounts");
        AbstractC22676k.m65750j(reactionScores, "reactionScores");
        AbstractC22676k.m65750j(reactionGroups, "reactionGroups");
        AbstractC22676k.m65750j(syncStatus, "syncStatus");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(latestReactions, "latestReactions");
        AbstractC22676k.m65750j(ownReactions, "ownReactions");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(extraData, "extraData");
        AbstractC22676k.m65750j(i18n, "i18n");
        AbstractC22676k.m65750j(threadParticipants, "threadParticipants");
        AbstractC22676k.m65750j(restrictedVisibility, "restrictedVisibility");
        return new Message(id4, cid, text, html, parentId, command, attachments, mentionedUsersIds, mentionedUsers, replyCount, deletedReplyCount, reactionCounts, reactionScores, reactionGroups, syncStatus, type, latestReactions, ownReactions, createdAt, updatedAt, deletedAt, updatedLocallyAt, createdLocallyAt, user, extraData, silent, shadowed, i18n, showInChannel, channelInfo, replyTo, replyMessageId, pinned, pinnedAt, pinExpires, pinnedBy, threadParticipants, skipPushNotification, skipEnrichUrl, moderationDetails, moderation, messageTextUpdatedAt, poll, restrictedVisibility, reminder, sharedLocation, channelRole, deletedForMe);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Message)) {
            return false;
        }
        Message message = (Message) other;
        return AbstractC22676k.m65745e(this.id, message.id) && AbstractC22676k.m65745e(this.cid, message.cid) && AbstractC22676k.m65745e(this.text, message.text) && AbstractC22676k.m65745e(this.html, message.html) && AbstractC22676k.m65745e(this.parentId, message.parentId) && AbstractC22676k.m65745e(this.command, message.command) && AbstractC22676k.m65745e(this.attachments, message.attachments) && AbstractC22676k.m65745e(this.mentionedUsersIds, message.mentionedUsersIds) && AbstractC22676k.m65745e(this.mentionedUsers, message.mentionedUsers) && this.replyCount == message.replyCount && this.deletedReplyCount == message.deletedReplyCount && AbstractC22676k.m65745e(this.reactionCounts, message.reactionCounts) && AbstractC22676k.m65745e(this.reactionScores, message.reactionScores) && AbstractC22676k.m65745e(this.reactionGroups, message.reactionGroups) && this.syncStatus == message.syncStatus && AbstractC22676k.m65745e(this.type, message.type) && AbstractC22676k.m65745e(this.latestReactions, message.latestReactions) && AbstractC22676k.m65745e(this.ownReactions, message.ownReactions) && AbstractC22676k.m65745e(this.createdAt, message.createdAt) && AbstractC22676k.m65745e(this.updatedAt, message.updatedAt) && AbstractC22676k.m65745e(this.deletedAt, message.deletedAt) && AbstractC22676k.m65745e(this.updatedLocallyAt, message.updatedLocallyAt) && AbstractC22676k.m65745e(this.createdLocallyAt, message.createdLocallyAt) && AbstractC22676k.m65745e(this.user, message.user) && AbstractC22676k.m65745e(this.extraData, message.extraData) && this.silent == message.silent && this.shadowed == message.shadowed && AbstractC22676k.m65745e(this.i18n, message.i18n) && this.showInChannel == message.showInChannel && AbstractC22676k.m65745e(this.channelInfo, message.channelInfo) && AbstractC22676k.m65745e(this.replyTo, message.replyTo) && AbstractC22676k.m65745e(this.replyMessageId, message.replyMessageId) && this.pinned == message.pinned && AbstractC22676k.m65745e(this.pinnedAt, message.pinnedAt) && AbstractC22676k.m65745e(this.pinExpires, message.pinExpires) && AbstractC22676k.m65745e(this.pinnedBy, message.pinnedBy) && AbstractC22676k.m65745e(this.threadParticipants, message.threadParticipants) && this.skipPushNotification == message.skipPushNotification && this.skipEnrichUrl == message.skipEnrichUrl && AbstractC22676k.m65745e(this.moderationDetails, message.moderationDetails) && AbstractC22676k.m65745e(this.moderation, message.moderation) && AbstractC22676k.m65745e(this.messageTextUpdatedAt, message.messageTextUpdatedAt) && AbstractC22676k.m65745e(this.poll, message.poll) && AbstractC22676k.m65745e(this.restrictedVisibility, message.restrictedVisibility) && AbstractC22676k.m65745e(this.reminder, message.reminder) && AbstractC22676k.m65745e(this.sharedLocation, message.sharedLocation) && AbstractC22676k.m65745e(this.channelRole, message.channelRole) && this.deletedForMe == message.deletedForMe;
    }

    public final List<Attachment> getAttachments() {
        return this.attachments;
    }

    public final ChannelInfo getChannelInfo() {
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:129:0x017d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0180 A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0133, code lost:
    
        if (r2.equals("deleted_reply_count") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x013c, code lost:
    
        return java.lang.Integer.valueOf(r1.deletedReplyCount);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0163, code lost:
    
        if (r2.equals("createdLocallyAt") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0168, code lost:
    
        return r1.createdLocallyAt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x016f, code lost:
    
        if (r2.equals("updatedAt") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (r2.equals("pinExpires") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0184, code lost:
    
        return r1.updatedAt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r2.equals("created_at") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        if (r2.equals("updated_locally_at") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r2.equals("pin_expires") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        return r1.pinExpires;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        if (r2.equals("parentId") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        return r1.parentId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        if (r2.equals("createdAt") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0073, code lost:
    
        return r1.createdAt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007a, code lost:
    
        if (r2.equals("deletedReplyCount") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0084, code lost:
    
        if (r2.equals("reply_count") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r2.equals("parent_id") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00cf, code lost:
    
        if (r2.equals("created_locally_at") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00d9, code lost:
    
        if (r2.equals("pinned_at") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00e3, code lost:
    
        if (r2.equals("updated_at") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00ed, code lost:
    
        if (r2.equals("deletedAt") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00f3, code lost:
    
        return r1.deletedAt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00fa, code lost:
    
        if (r2.equals("pinnedAt") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0100, code lost:
    
        return r1.pinnedAt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0107, code lost:
    
        if (r2.equals("replyCount") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0110, code lost:
    
        return java.lang.Integer.valueOf(r1.replyCount);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0117, code lost:
    
        if (r2.equals("updatedLocallyAt") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x011c, code lost:
    
        return r1.updatedLocallyAt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (r2.equals("deleted_at") == false) goto L127;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.getstream.chat.android.models.querysort.ComparableFieldProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Comparable<?> getComparableField(java.lang.String r2) {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.models.Message.getComparableField(java.lang.String):java.lang.Comparable");
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

    @Override // io.getstream.chat.android.models.CustomObject
    public Map<String, Object> getExtraData() {
        return this.extraData;
    }

    @Override // io.getstream.chat.android.models.CustomObject
    public <T> T getExtraValue(String str, T t14) {
        return (T) super.getExtraValue(str, t14);
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

    public final List<Reaction> getLatestReactions() {
        return this.latestReactions;
    }

    public final List<User> getMentionedUsers() {
        return this.mentionedUsers;
    }

    public final List<String> getMentionedUsersIds() {
        return this.mentionedUsersIds;
    }

    public final Date getMessageTextUpdatedAt() {
        return this.messageTextUpdatedAt;
    }

    public final Moderation getModeration() {
        return this.moderation;
    }

    public final MessageModerationDetails getModerationDetails() {
        return this.moderationDetails;
    }

    public final String getOriginalLanguage() {
        return (String) get(this.i18n, "language", "");
    }

    public final List<Reaction> getOwnReactions() {
        return this.ownReactions;
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

    public final User getPinnedBy() {
        return this.pinnedBy;
    }

    public final Poll getPoll() {
        return this.poll;
    }

    public final Map<String, Integer> getReactionCounts() {
        return this.reactionCounts;
    }

    public final Map<String, ReactionGroup> getReactionGroups() {
        return this.reactionGroups;
    }

    public final Map<String, Integer> getReactionScores() {
        return this.reactionScores;
    }

    public final MessageReminderInfo getReminder() {
        return this.reminder;
    }

    public final int getReplyCount() {
        return this.replyCount;
    }

    public final String getReplyMessageId() {
        return this.replyMessageId;
    }

    public final Message getReplyTo() {
        return this.replyTo;
    }

    public final List<String> getRestrictedVisibility() {
        return this.restrictedVisibility;
    }

    public final boolean getShadowed() {
        return this.shadowed;
    }

    public final Location getSharedLocation() {
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

    public final List<User> getThreadParticipants() {
        return this.threadParticipants;
    }

    public final String getTranslation(String language) {
        AbstractC22676k.m65750j(language, "language");
        return (String) get(this.i18n, language.concat("_text"), "");
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

    public final User getUser() {
        return this.user;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.cid), 31, this.text), 31, this.html);
        String str = this.parentId;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.command;
        int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11266d.m30450d((this.syncStatus.hashCode() + AbstractC3855a.m11821e(this.reactionGroups, AbstractC3855a.m11821e(this.reactionScores, AbstractC3855a.m11821e(this.reactionCounts, AbstractC11266d.m30448b(this.deletedReplyCount, AbstractC11266d.m30448b(this.replyCount, AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.attachments), 31, this.mentionedUsersIds), 31, this.mentionedUsers), 31), 31), 31), 31), 31)) * 31, 31, this.type), 31, this.latestReactions), 31, this.ownReactions);
        Date date = this.createdAt;
        int iHashCode2 = (iM31983b + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.updatedAt;
        int iHashCode3 = (iHashCode2 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.deletedAt;
        int iHashCode4 = (iHashCode3 + (date3 == null ? 0 : date3.hashCode())) * 31;
        Date date4 = this.updatedLocallyAt;
        int iHashCode5 = (iHashCode4 + (date4 == null ? 0 : date4.hashCode())) * 31;
        Date date5 = this.createdLocallyAt;
        int iM8289b = AbstractC2875y.m8289b(AbstractC3855a.m11821e(this.i18n, AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC3855a.m11821e(this.extraData, AbstractC11478a.m30850b(this.user, (iHashCode5 + (date5 == null ? 0 : date5.hashCode())) * 31, 31), 31), 31, this.silent), 31, this.shadowed), 31), 31, this.showInChannel);
        ChannelInfo channelInfo = this.channelInfo;
        int iHashCode6 = (iM8289b + (channelInfo == null ? 0 : channelInfo.hashCode())) * 31;
        Message message = this.replyTo;
        int iHashCode7 = (iHashCode6 + (message == null ? 0 : message.hashCode())) * 31;
        String str3 = this.replyMessageId;
        int iM8289b2 = AbstractC2875y.m8289b((iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.pinned);
        Date date6 = this.pinnedAt;
        int iHashCode8 = (iM8289b2 + (date6 == null ? 0 : date6.hashCode())) * 31;
        Date date7 = this.pinExpires;
        int iHashCode9 = (iHashCode8 + (date7 == null ? 0 : date7.hashCode())) * 31;
        User user = this.pinnedBy;
        int iM8289b3 = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11895b.m31983b((iHashCode9 + (user == null ? 0 : user.hashCode())) * 31, 31, this.threadParticipants), 31, this.skipPushNotification), 31, this.skipEnrichUrl);
        MessageModerationDetails messageModerationDetails = this.moderationDetails;
        int iHashCode10 = (iM8289b3 + (messageModerationDetails == null ? 0 : messageModerationDetails.hashCode())) * 31;
        Moderation moderation = this.moderation;
        int iHashCode11 = (iHashCode10 + (moderation == null ? 0 : moderation.hashCode())) * 31;
        Date date8 = this.messageTextUpdatedAt;
        int iHashCode12 = (iHashCode11 + (date8 == null ? 0 : date8.hashCode())) * 31;
        Poll poll = this.poll;
        int iM31983b2 = AbstractC11895b.m31983b((iHashCode12 + (poll == null ? 0 : poll.hashCode())) * 31, 31, this.restrictedVisibility);
        MessageReminderInfo messageReminderInfo = this.reminder;
        int iHashCode13 = (iM31983b2 + (messageReminderInfo == null ? 0 : messageReminderInfo.hashCode())) * 31;
        Location location = this.sharedLocation;
        int iHashCode14 = (iHashCode13 + (location == null ? 0 : location.hashCode())) * 31;
        String str4 = this.channelRole;
        return Boolean.hashCode(this.deletedForMe) + ((iHashCode14 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final long identifierHash() {
        int iHashCode = this.id.hashCode();
        Message message = this.replyTo;
        String str = message != null ? message.id : null;
        Integer numValueOf = Integer.valueOf(str != null ? str.hashCode() : 0);
        Integer num = numValueOf.intValue() != 0 ? numValueOf : null;
        if (num != null) {
            iHashCode = (iHashCode * 31) + num.intValue();
        }
        return iHashCode;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final void setCreatedLocallyAt(Date date) {
        this.createdLocallyAt = date;
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("Message(type=\"");
        sb4.append(this.type);
        sb4.append("\", id=\"");
        sb4.append(this.id);
        sb4.append("\", text=\"");
        sb4.append(this.text);
        sb4.append("\", html=\"");
        sb4.append(this.html);
        sb4.append("\", cid=\"");
        sb4.append(this.cid);
        sb4.append("\"");
        if (this.parentId != null) {
            sb4.append(", parentId=");
            sb4.append(this.parentId);
        }
        if (this.command != null) {
            sb4.append(", command=");
            sb4.append(this.command);
        }
        if (!this.attachments.isEmpty()) {
            sb4.append(", attachments=");
            sb4.append(this.attachments);
        }
        if (!this.mentionedUsersIds.isEmpty()) {
            sb4.append(", mentionedUsersIds=");
            sb4.append(this.mentionedUsersIds);
        }
        if (!this.mentionedUsers.isEmpty()) {
            sb4.append(", mentionedUsers=");
            sb4.append(this.mentionedUsers);
        }
        if (this.replyCount > 0) {
            sb4.append(", replyCount=");
            sb4.append(this.replyCount);
        }
        if (this.deletedReplyCount > 0) {
            sb4.append(", deletedReplyCount=");
            sb4.append(this.deletedReplyCount);
        }
        if (!this.reactionCounts.isEmpty()) {
            sb4.append(", reactionCounts=");
            sb4.append(this.reactionCounts);
        }
        if (!this.reactionScores.isEmpty()) {
            sb4.append(", reactionScores=");
            sb4.append(this.reactionScores);
        }
        sb4.append(", syncStatus=");
        sb4.append(this.syncStatus);
        if (!this.latestReactions.isEmpty()) {
            sb4.append(", latestReactions=");
            sb4.append(this.latestReactions);
        }
        if (!this.ownReactions.isEmpty()) {
            sb4.append(", ownReactions=");
            sb4.append(this.ownReactions);
        }
        if (this.createdAt != null) {
            sb4.append(", createdAt=");
            sb4.append(this.createdAt);
        }
        if (this.updatedAt != null) {
            sb4.append(", updatedAt=");
            sb4.append(this.updatedAt);
        }
        if (this.deletedAt != null) {
            sb4.append(", deletedAt=");
            sb4.append(this.deletedAt);
        }
        if (this.updatedLocallyAt != null) {
            sb4.append(", updatedLocallyAt=");
            sb4.append(this.updatedLocallyAt);
        }
        if (this.createdLocallyAt != null) {
            sb4.append(", createdLocallyAt=");
            sb4.append(this.createdLocallyAt);
        }
        sb4.append(", sentBy=User(id=\"");
        sb4.append(this.user.getId());
        sb4.append("\", name=\"");
        sb4.append(this.user.getName());
        sb4.append("\"), silent=");
        sb4.append(this.silent);
        sb4.append(", shadowed=");
        sb4.append(this.shadowed);
        if (!this.i18n.isEmpty()) {
            sb4.append(", i18n=");
            sb4.append(this.i18n);
        }
        sb4.append(", showInChannel=");
        sb4.append(this.showInChannel);
        if (this.channelInfo != null) {
            sb4.append(", channelInfo=");
            sb4.append(this.channelInfo);
        }
        if (this.replyMessageId != null) {
            sb4.append(", replyMessageId=");
            sb4.append(this.replyMessageId);
        }
        if (this.replyTo != null) {
            sb4.append(", replyTo=");
            sb4.append(this.replyTo);
        }
        sb4.append(", pinned=");
        sb4.append(this.pinned);
        if (this.pinnedAt != null) {
            sb4.append(", pinnedAt=");
            sb4.append(this.pinnedAt);
        }
        if (this.pinExpires != null) {
            sb4.append(", pinExpires=");
            sb4.append(this.pinExpires);
        }
        if (this.pinnedBy != null) {
            sb4.append(", pinnedBy=");
            sb4.append(this.pinnedBy);
        }
        if (!this.threadParticipants.isEmpty()) {
            sb4.append(", threadParticipants=");
            sb4.append(this.threadParticipants);
        }
        sb4.append(", skipPushNotification=");
        sb4.append(this.skipPushNotification);
        sb4.append(", skipEnrichUrl=");
        sb4.append(this.skipEnrichUrl);
        if (this.moderationDetails != null) {
            sb4.append(", moderationDetails=");
            sb4.append(this.moderationDetails);
        }
        if (this.moderation != null) {
            sb4.append(", moderation=");
            sb4.append(this.moderation);
        }
        if (this.poll != null) {
            sb4.append(", poll=");
            sb4.append(this.poll);
        }
        if (this.channelRole != null) {
            sb4.append(", channelRole=");
            sb4.append(this.channelRole);
        }
        sb4.append(", deletedForMe=");
        sb4.append(this.deletedForMe);
        if (!getExtraData().isEmpty()) {
            sb4.append(", extraData=");
            sb4.append(getExtraData());
        }
        sb4.append(")");
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    public Message(String id4, String cid, String text, String html, String str, String str2, List<Attachment> attachments, List<String> mentionedUsersIds, List<User> mentionedUsers, int i13, int i14, Map<String, Integer> reactionCounts, Map<String, Integer> reactionScores, Map<String, ReactionGroup> reactionGroups, SyncStatus syncStatus, String type, List<Reaction> latestReactions, List<Reaction> ownReactions, Date date, Date date2, Date date3, Date date4, Date date5, User user, Map<String, ? extends Object> extraData, boolean z4, boolean z13, Map<String, String> i18n, boolean z14, ChannelInfo channelInfo, Message message, String str3, boolean z15, Date date6, Date date7, User user2, List<User> threadParticipants, boolean z16, boolean z17, MessageModerationDetails messageModerationDetails, Moderation moderation, Date date8, Poll poll, List<String> restrictedVisibility, MessageReminderInfo messageReminderInfo, Location location, String str4, boolean z18) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(html, "html");
        AbstractC22676k.m65750j(attachments, "attachments");
        AbstractC22676k.m65750j(mentionedUsersIds, "mentionedUsersIds");
        AbstractC22676k.m65750j(mentionedUsers, "mentionedUsers");
        AbstractC22676k.m65750j(reactionCounts, "reactionCounts");
        AbstractC22676k.m65750j(reactionScores, "reactionScores");
        AbstractC22676k.m65750j(reactionGroups, "reactionGroups");
        AbstractC22676k.m65750j(syncStatus, "syncStatus");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(latestReactions, "latestReactions");
        AbstractC22676k.m65750j(ownReactions, "ownReactions");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(extraData, "extraData");
        AbstractC22676k.m65750j(i18n, "i18n");
        AbstractC22676k.m65750j(threadParticipants, "threadParticipants");
        AbstractC22676k.m65750j(restrictedVisibility, "restrictedVisibility");
        this.id = id4;
        this.cid = cid;
        this.text = text;
        this.html = html;
        this.parentId = str;
        this.command = str2;
        this.attachments = attachments;
        this.mentionedUsersIds = mentionedUsersIds;
        this.mentionedUsers = mentionedUsers;
        this.replyCount = i13;
        this.deletedReplyCount = i14;
        this.reactionCounts = reactionCounts;
        this.reactionScores = reactionScores;
        this.reactionGroups = reactionGroups;
        this.syncStatus = syncStatus;
        this.type = type;
        this.latestReactions = latestReactions;
        this.ownReactions = ownReactions;
        this.createdAt = date;
        this.updatedAt = date2;
        this.deletedAt = date3;
        this.updatedLocallyAt = date4;
        this.createdLocallyAt = date5;
        this.user = user;
        this.extraData = extraData;
        this.silent = z4;
        this.shadowed = z13;
        this.i18n = i18n;
        this.showInChannel = z14;
        this.channelInfo = channelInfo;
        this.replyTo = message;
        this.replyMessageId = str3;
        this.pinned = z15;
        this.pinnedAt = date6;
        this.pinExpires = date7;
        this.pinnedBy = user2;
        this.threadParticipants = threadParticipants;
        this.skipPushNotification = z16;
        this.skipEnrichUrl = z17;
        this.moderationDetails = messageModerationDetails;
        this.moderation = moderation;
        this.messageTextUpdatedAt = date8;
        this.poll = poll;
        this.restrictedVisibility = restrictedVisibility;
        this.reminder = messageReminderInfo;
        this.sharedLocation = location;
        this.channelRole = str4;
        this.deletedForMe = z18;
    }

    @Metadata(m65680d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b4\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u000e\u0010H\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010I\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010J\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010K\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\bJ\u0010\u0010L\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\bJ\u0010\u0010M\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\bJ\u0014\u0010N\u001a\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u0014\u0010O\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u000fJ\u0014\u0010P\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000fJ\u000e\u0010Q\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010R\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015J\u001a\u0010S\u001a\u00020\u00002\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00150\u0018J\u001a\u0010T\u001a\u00020\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00150\u0018J\u001a\u0010U\u001a\u00020\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001b0\u0018J\u000e\u0010V\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010W\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\bJ\u0014\u0010X\u001a\u00020\u00002\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u000fJ\u0014\u0010Y\u001a\u00020\u00002\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u000fJ\u0010\u0010Z\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010#J\u0010\u0010[\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010#J\u0010\u0010\\\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010#J\u0010\u0010]\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010#J\u0010\u0010^\u001a\u00020\u00002\b\u0010'\u001a\u0004\u0018\u00010#J\u000e\u0010_\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0013J\u001a\u0010`\u001a\u00020\u00002\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0018J\u000e\u0010a\u001a\u00020\u00002\u0006\u0010*\u001a\u00020+J\u000e\u0010b\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+J\u001a\u0010c\u001a\u00020\u00002\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0018J\u000e\u0010d\u001a\u00020\u00002\u0006\u0010.\u001a\u00020+J\u0010\u0010e\u001a\u00020\u00002\b\u0010/\u001a\u0004\u0018\u000100J\u0010\u0010f\u001a\u00020\u00002\b\u00101\u001a\u0004\u0018\u00010\u0005J\u0010\u0010g\u001a\u00020\u00002\b\u00102\u001a\u0004\u0018\u00010\bJ\u000e\u0010h\u001a\u00020\u00002\u0006\u00103\u001a\u00020+J\u0010\u0010i\u001a\u00020\u00002\b\u00104\u001a\u0004\u0018\u00010#J\u0010\u0010j\u001a\u00020\u00002\b\u00105\u001a\u0004\u0018\u00010#J\u0010\u0010k\u001a\u00020\u00002\b\u00106\u001a\u0004\u0018\u00010\u0013J\u0014\u0010l\u001a\u00020\u00002\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00130\u000fJ\u000e\u0010m\u001a\u00020\u00002\u0006\u00108\u001a\u00020+J\u000e\u0010n\u001a\u00020\u00002\u0006\u00109\u001a\u00020+J\u000e\u0010o\u001a\u00020\u00002\u0006\u0010:\u001a\u00020;J\u000e\u0010p\u001a\u00020\u00002\u0006\u0010<\u001a\u00020=J\u0010\u0010q\u001a\u00020\u00002\b\u0010>\u001a\u0004\u0018\u00010#J\u0010\u0010r\u001a\u00020\u00002\b\u0010?\u001a\u0004\u0018\u00010@J\u0014\u0010s\u001a\u00020\u00002\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\b0\u000fJ\u0010\u0010t\u001a\u00020\u00002\b\u0010B\u001a\u0004\u0018\u00010CJ\u0010\u0010u\u001a\u00020\u00002\b\u0010D\u001a\u0004\u0018\u00010EJ\u0010\u0010v\u001a\u00020\u00002\b\u0010F\u001a\u0004\u0018\u00010\bJ\u000e\u0010w\u001a\u00020\u00002\u0006\u0010G\u001a\u00020+J\u0006\u0010x\u001a\u00020\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00150\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00150\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001b0\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00107\u001a\b\u0012\u0004\u0012\u00020\u00130\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u00010;X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010<\u001a\u0004\u0018\u00010=X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010>\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010?\u001a\u0004\u0018\u00010@X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010A\u001a\b\u0012\u0004\u0012\u00020\b0\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010B\u001a\u0004\u0018\u00010CX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010D\u001a\u0004\u0018\u00010EX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010F\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006y"}, m65681d2 = {"Lio/getstream/chat/android/models/Message$Builder;", "", "<init>", "()V", "message", "Lio/getstream/chat/android/models/Message;", "(Lio/getstream/chat/android/models/Message;)V", "id", "", "cid", "text", "html", "parentId", "command", "attachments", "", "Lio/getstream/chat/android/models/Attachment;", "mentionedUsersIds", "mentionedUsers", "Lio/getstream/chat/android/models/User;", "replyCount", "", "deletedReplyCount", "reactionCounts", "", "reactionScores", "reactionGroups", "Lio/getstream/chat/android/models/ReactionGroup;", "syncStatus", "Lio/getstream/chat/android/models/SyncStatus;", "type", "latestReactions", "Lio/getstream/chat/android/models/Reaction;", "ownReactions", "createdAt", "Ljava/util/Date;", "updatedAt", "deletedAt", "updatedLocallyAt", "createdLocallyAt", UserState.Sources.USER, "extraData", NotificationCompat.GROUP_KEY_SILENT, "", "shadowed", "i18n", "showInChannel", "channelInfo", "Lio/getstream/chat/android/models/ChannelInfo;", "replyTo", "replyMessageId", "pinned", "pinnedAt", "pinExpires", "pinnedBy", "threadParticipants", "skipPushNotification", "skipEnrichUrl", "moderationDetails", "Lio/getstream/chat/android/models/MessageModerationDetails;", "moderation", "Lio/getstream/chat/android/models/Moderation;", "messageTextUpdatedAt", "poll", "Lio/getstream/chat/android/models/Poll;", "restrictedVisibility", NotificationCompat.CATEGORY_REMINDER, "Lio/getstream/chat/android/models/MessageReminderInfo;", "sharedLocation", "Lio/getstream/chat/android/models/Location;", "channelRole", "deletedForMe", "withId", "withCid", "withText", "withHtml", "withParentId", "withCommand", "withAttachments", "withMentionedUsersIds", "withMentionedUsers", "withReplyCount", "withDeletedReplyCount", "withReactionCounts", "withReactionScores", "withReactionGroups", "withSyncStatus", "withType", "withLatestReactions", "withOwnReactions", "withCreatedAt", "withUpdatedAt", "withDeletedAt", "withUpdatedLocallyAt", "withCreatedLocallyAt", "withUser", "withExtraData", "withSilent", "withShadowed", "withI18n", "withShowInChannel", "withChannelInfo", "withReplyTo", "withReplyMessageId", "withPinned", "withPinnedAt", "withPinExpires", "withPinnedBy", "withThreadParticipants", "withSkipPushNotification", "withSkipEnrichUrl", "withModerationDetails", "withModeration", "withMessageTextUpdatedAt", "withPoll", "withRestrictedVisibility", "withReminder", "withSharedLocation", "withChannelRole", "withDeletedForMe", "build", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Builder {
        private List<Attachment> attachments;
        private ChannelInfo channelInfo;
        private String channelRole;
        private String cid;
        private String command;
        private Date createdAt;
        private Date createdLocallyAt;
        private Date deletedAt;
        private boolean deletedForMe;
        private int deletedReplyCount;
        private Map<String, ? extends Object> extraData;
        private String html;
        private Map<String, String> i18n;
        private String id;
        private List<Reaction> latestReactions;
        private List<User> mentionedUsers;
        private List<String> mentionedUsersIds;
        private Date messageTextUpdatedAt;
        private Moderation moderation;
        private MessageModerationDetails moderationDetails;
        private List<Reaction> ownReactions;
        private String parentId;
        private Date pinExpires;
        private boolean pinned;
        private Date pinnedAt;
        private User pinnedBy;
        private Poll poll;
        private Map<String, Integer> reactionCounts;
        private Map<String, ReactionGroup> reactionGroups;
        private Map<String, Integer> reactionScores;
        private MessageReminderInfo reminder;
        private int replyCount;
        private String replyMessageId;
        private Message replyTo;
        private List<String> restrictedVisibility;
        private boolean shadowed;
        private Location sharedLocation;
        private boolean showInChannel;
        private boolean silent;
        private boolean skipEnrichUrl;
        private boolean skipPushNotification;
        private SyncStatus syncStatus;
        private String text;
        private List<User> threadParticipants;
        private String type;
        private Date updatedAt;
        private Date updatedLocallyAt;
        private User user;

        public Builder() {
            this.id = "";
            this.cid = "";
            this.text = "";
            this.html = "";
            C25271y c25271y = C25271y.f99162w;
            this.attachments = c25271y;
            this.mentionedUsersIds = c25271y;
            this.mentionedUsers = c25271y;
            C25272z c25272z = C25272z.f99163w;
            this.reactionCounts = c25272z;
            this.reactionScores = c25272z;
            this.reactionGroups = c25272z;
            this.syncStatus = SyncStatus.COMPLETED;
            this.type = "";
            this.latestReactions = c25271y;
            this.ownReactions = c25271y;
            this.user = new User(null, null, null, null, null, null, null, null, null, false, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, 33554431, null);
            this.extraData = c25272z;
            this.i18n = c25272z;
            this.threadParticipants = c25271y;
            this.restrictedVisibility = c25271y;
        }

        public final Message build() {
            return new Message(this.id, this.cid, this.text, this.html, this.parentId, this.command, this.attachments, this.mentionedUsersIds, this.mentionedUsers, this.replyCount, this.deletedReplyCount, this.reactionCounts, this.reactionScores, this.reactionGroups, this.syncStatus, this.type, this.latestReactions, this.ownReactions, this.createdAt, this.updatedAt, this.deletedAt, this.updatedLocallyAt, this.createdLocallyAt, this.user, this.extraData, this.silent, this.shadowed, this.i18n, this.showInChannel, this.channelInfo, this.replyTo, this.replyMessageId, this.pinned, this.pinnedAt, this.pinExpires, this.pinnedBy, this.threadParticipants, this.skipPushNotification, this.skipEnrichUrl, this.moderationDetails, this.moderation, this.messageTextUpdatedAt, this.poll, this.restrictedVisibility, this.reminder, this.sharedLocation, this.channelRole, this.deletedForMe);
        }

        public final Builder withAttachments(List<Attachment> attachments) {
            AbstractC22676k.m65750j(attachments, "attachments");
            this.attachments = attachments;
            return this;
        }

        public final Builder withChannelInfo(ChannelInfo channelInfo) {
            this.channelInfo = channelInfo;
            return this;
        }

        public final Builder withChannelRole(String channelRole) {
            this.channelRole = channelRole;
            return this;
        }

        public final Builder withCid(String cid) {
            AbstractC22676k.m65750j(cid, "cid");
            this.cid = cid;
            return this;
        }

        public final Builder withCommand(String command) {
            this.command = command;
            return this;
        }

        public final Builder withCreatedAt(Date createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public final Builder withCreatedLocallyAt(Date createdLocallyAt) {
            this.createdLocallyAt = createdLocallyAt;
            return this;
        }

        public final Builder withDeletedAt(Date deletedAt) {
            this.deletedAt = deletedAt;
            return this;
        }

        public final Builder withDeletedForMe(boolean deletedForMe) {
            this.deletedForMe = deletedForMe;
            return this;
        }

        public final Builder withDeletedReplyCount(int deletedReplyCount) {
            this.deletedReplyCount = deletedReplyCount;
            return this;
        }

        public final Builder withExtraData(Map<String, ? extends Object> extraData) {
            AbstractC22676k.m65750j(extraData, "extraData");
            this.extraData = extraData;
            return this;
        }

        public final Builder withHtml(String html) {
            AbstractC22676k.m65750j(html, "html");
            this.html = html;
            return this;
        }

        public final Builder withI18n(Map<String, String> i18n) {
            AbstractC22676k.m65750j(i18n, "i18n");
            this.i18n = i18n;
            return this;
        }

        public final Builder withId(String id4) {
            AbstractC22676k.m65750j(id4, "id");
            this.id = id4;
            return this;
        }

        public final Builder withLatestReactions(List<Reaction> latestReactions) {
            AbstractC22676k.m65750j(latestReactions, "latestReactions");
            this.latestReactions = latestReactions;
            return this;
        }

        public final Builder withMentionedUsers(List<User> mentionedUsers) {
            AbstractC22676k.m65750j(mentionedUsers, "mentionedUsers");
            this.mentionedUsers = mentionedUsers;
            return this;
        }

        public final Builder withMentionedUsersIds(List<String> mentionedUsersIds) {
            AbstractC22676k.m65750j(mentionedUsersIds, "mentionedUsersIds");
            this.mentionedUsersIds = mentionedUsersIds;
            return this;
        }

        public final Builder withMessageTextUpdatedAt(Date messageTextUpdatedAt) {
            this.messageTextUpdatedAt = messageTextUpdatedAt;
            return this;
        }

        public final Builder withModeration(Moderation moderation) {
            AbstractC22676k.m65750j(moderation, "moderation");
            this.moderation = moderation;
            return this;
        }

        public final Builder withModerationDetails(MessageModerationDetails moderationDetails) {
            AbstractC22676k.m65750j(moderationDetails, "moderationDetails");
            this.moderationDetails = moderationDetails;
            return this;
        }

        public final Builder withOwnReactions(List<Reaction> ownReactions) {
            AbstractC22676k.m65750j(ownReactions, "ownReactions");
            this.ownReactions = ownReactions;
            return this;
        }

        public final Builder withParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }

        public final Builder withPinExpires(Date pinExpires) {
            this.pinExpires = pinExpires;
            return this;
        }

        public final Builder withPinned(boolean pinned) {
            this.pinned = pinned;
            return this;
        }

        public final Builder withPinnedAt(Date pinnedAt) {
            this.pinnedAt = pinnedAt;
            return this;
        }

        public final Builder withPinnedBy(User pinnedBy) {
            this.pinnedBy = pinnedBy;
            return this;
        }

        public final Builder withPoll(Poll poll) {
            this.poll = poll;
            return this;
        }

        public final Builder withReactionCounts(Map<String, Integer> reactionCounts) {
            AbstractC22676k.m65750j(reactionCounts, "reactionCounts");
            this.reactionCounts = reactionCounts;
            return this;
        }

        public final Builder withReactionGroups(Map<String, ReactionGroup> reactionGroups) {
            AbstractC22676k.m65750j(reactionGroups, "reactionGroups");
            this.reactionGroups = reactionGroups;
            return this;
        }

        public final Builder withReactionScores(Map<String, Integer> reactionScores) {
            AbstractC22676k.m65750j(reactionScores, "reactionScores");
            this.reactionScores = reactionScores;
            return this;
        }

        public final Builder withReminder(MessageReminderInfo reminder) {
            this.reminder = reminder;
            return this;
        }

        public final Builder withReplyCount(int replyCount) {
            this.replyCount = replyCount;
            return this;
        }

        public final Builder withReplyMessageId(String replyMessageId) {
            this.replyMessageId = replyMessageId;
            return this;
        }

        public final Builder withReplyTo(Message replyTo) {
            this.replyTo = replyTo;
            return this;
        }

        public final Builder withRestrictedVisibility(List<String> restrictedVisibility) {
            AbstractC22676k.m65750j(restrictedVisibility, "restrictedVisibility");
            this.restrictedVisibility = restrictedVisibility;
            return this;
        }

        public final Builder withShadowed(boolean shadowed) {
            this.shadowed = shadowed;
            return this;
        }

        public final Builder withSharedLocation(Location sharedLocation) {
            this.sharedLocation = sharedLocation;
            return this;
        }

        public final Builder withShowInChannel(boolean showInChannel) {
            this.showInChannel = showInChannel;
            return this;
        }

        public final Builder withSilent(boolean silent) {
            this.silent = silent;
            return this;
        }

        public final Builder withSkipEnrichUrl(boolean skipEnrichUrl) {
            this.skipEnrichUrl = skipEnrichUrl;
            return this;
        }

        public final Builder withSkipPushNotification(boolean skipPushNotification) {
            this.skipPushNotification = skipPushNotification;
            return this;
        }

        public final Builder withSyncStatus(SyncStatus syncStatus) {
            AbstractC22676k.m65750j(syncStatus, "syncStatus");
            this.syncStatus = syncStatus;
            return this;
        }

        public final Builder withText(String text) {
            AbstractC22676k.m65750j(text, "text");
            this.text = text;
            return this;
        }

        public final Builder withThreadParticipants(List<User> threadParticipants) {
            AbstractC22676k.m65750j(threadParticipants, "threadParticipants");
            this.threadParticipants = threadParticipants;
            return this;
        }

        public final Builder withType(String type) {
            AbstractC22676k.m65750j(type, "type");
            this.type = type;
            return this;
        }

        public final Builder withUpdatedAt(Date updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public final Builder withUpdatedLocallyAt(Date updatedLocallyAt) {
            this.updatedLocallyAt = updatedLocallyAt;
            return this;
        }

        public final Builder withUser(User user) {
            AbstractC22676k.m65750j(user, "user");
            this.user = user;
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(Message message) {
            this();
            AbstractC22676k.m65750j(message, "message");
            this.id = message.getId();
            this.cid = message.getCid();
            this.text = message.getText();
            this.html = message.getHtml();
            this.parentId = message.getParentId();
            this.command = message.getCommand();
            this.attachments = message.getAttachments();
            this.mentionedUsersIds = message.getMentionedUsersIds();
            this.mentionedUsers = message.getMentionedUsers();
            this.replyCount = message.getReplyCount();
            this.deletedReplyCount = message.getDeletedReplyCount();
            this.reactionCounts = message.getReactionCounts();
            this.reactionScores = message.getReactionScores();
            this.reactionGroups = message.getReactionGroups();
            this.syncStatus = message.getSyncStatus();
            this.type = message.getType();
            this.latestReactions = message.getLatestReactions();
            this.ownReactions = message.getOwnReactions();
            this.createdAt = message.getCreatedAt();
            this.updatedAt = message.getUpdatedAt();
            this.deletedAt = message.getDeletedAt();
            this.updatedLocallyAt = message.getUpdatedLocallyAt();
            this.createdLocallyAt = message.getCreatedLocallyAt();
            this.user = message.getUser();
            this.extraData = message.getExtraData();
            this.silent = message.getSilent();
            this.shadowed = message.getShadowed();
            this.i18n = message.getI18n();
            this.showInChannel = message.getShowInChannel();
            this.channelInfo = message.getChannelInfo();
            this.replyTo = message.getReplyTo();
            this.replyMessageId = message.getReplyMessageId();
            this.pinned = message.getPinned();
            this.pinnedAt = message.getPinnedAt();
            this.pinExpires = message.getPinExpires();
            this.pinnedBy = message.getPinnedBy();
            this.threadParticipants = message.getThreadParticipants();
            this.skipPushNotification = message.getSkipPushNotification();
            this.skipEnrichUrl = message.getSkipEnrichUrl();
            this.moderationDetails = message.getModerationDetails();
            this.moderation = message.getModeration();
            this.messageTextUpdatedAt = message.getMessageTextUpdatedAt();
            this.poll = message.getPoll();
            this.restrictedVisibility = message.getRestrictedVisibility();
            this.reminder = message.getReminder();
            this.sharedLocation = message.getSharedLocation();
            this.channelRole = message.getChannelRole();
            this.deletedForMe = message.getDeletedForMe();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Message(String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, int i13, int i14, Map map, Map map2, Map map3, SyncStatus syncStatus, String str7, List list4, List list5, Date date, Date date2, Date date3, Date date4, Date date5, User user, Map map4, boolean z4, boolean z13, Map map5, boolean z14, ChannelInfo channelInfo, Message message, String str8, boolean z15, Date date6, Date date7, User user2, List list6, boolean z16, boolean z17, MessageModerationDetails messageModerationDetails, Moderation moderation, Date date8, Poll poll, List list7, MessageReminderInfo messageReminderInfo, Location location, String str9, boolean z18, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        String str10 = (i15 & 1) != 0 ? "" : str;
        String str11 = (i15 & 2) != 0 ? "" : str2;
        String str12 = (i15 & 4) != 0 ? "" : str3;
        String str13 = (i15 & 8) != 0 ? "" : str4;
        String str14 = (i15 & 16) != 0 ? null : str5;
        String str15 = (i15 & 32) != 0 ? null : str6;
        int i17 = i15 & 64;
        List list8 = C25271y.f99162w;
        List list9 = i17 != 0 ? list8 : list;
        List list10 = (i15 & 128) != 0 ? list8 : list2;
        List list11 = (i15 & 256) != 0 ? list8 : list3;
        int i18 = (i15 & 512) != 0 ? 0 : i13;
        int i19 = (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? 0 : i14;
        int i24 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        Map map6 = C25272z.f99163w;
        this(str10, str11, str12, str13, str14, str15, list9, list10, list11, i18, i19, i24 != 0 ? map6 : map, (i15 & 4096) != 0 ? map6 : map2, (i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? map6 : map3, (i15 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? SyncStatus.COMPLETED : syncStatus, (i15 & 32768) == 0 ? str7 : "", (i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? list8 : list4, (i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? list8 : list5, (i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? null : date, (i15 & 524288) != 0 ? null : date2, (i15 & 1048576) != 0 ? null : date3, (i15 & 2097152) != 0 ? null : date4, (i15 & 4194304) != 0 ? null : date5, (i15 & 8388608) != 0 ? new User(null, null, null, null, null, null, null, null, null, false, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, 33554431, null) : user, (i15 & 16777216) != 0 ? map6 : map4, (i15 & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? false : z4, (i15 & 67108864) != 0 ? false : z13, (i15 & 134217728) == 0 ? map5 : map6, (i15 & 268435456) != 0 ? false : z14, (i15 & 536870912) != 0 ? null : channelInfo, (i15 & 1073741824) != 0 ? null : message, (i15 & Integer.MIN_VALUE) != 0 ? null : str8, (i16 & 1) != 0 ? false : z15, (i16 & 2) != 0 ? null : date6, (i16 & 4) != 0 ? null : date7, (i16 & 8) != 0 ? null : user2, (i16 & 16) != 0 ? list8 : list6, (i16 & 32) != 0 ? false : z16, (i16 & 64) != 0 ? false : z17, (i16 & 128) != 0 ? null : messageModerationDetails, (i16 & 256) != 0 ? null : moderation, (i16 & 512) != 0 ? null : date8, (i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : poll, (i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0 ? list7 : list8, (i16 & 4096) != 0 ? null : messageReminderInfo, (i16 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : location, (i16 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : str9, (i16 & 32768) != 0 ? false : z18);
    }
}
