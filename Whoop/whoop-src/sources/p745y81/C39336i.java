package p745y81;

import androidx.profileinstaller.ProfileVerifier;
import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd1.C22396h;
import live.hms.video.utils.AndroidSDKConstants;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: y81.i */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\bl\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\bs\b\u0087\b\u0018\u00002\u00020\u0001BÕ\b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u0002\u0012\b\b\u0002\u0010!\u001a\u00020\u0002\u0012\b\b\u0002\u0010\"\u001a\u00020\u0002\u0012\b\b\u0002\u0010#\u001a\u00020\u0002\u0012\b\b\u0002\u0010$\u001a\u00020\u0002\u0012\b\b\u0002\u0010%\u001a\u00020\u0002\u0012\b\b\u0002\u0010&\u001a\u00020\u0002\u0012\b\b\u0002\u0010'\u001a\u00020\u0002\u0012\b\b\u0002\u0010(\u001a\u00020\u0002\u0012\b\b\u0002\u0010)\u001a\u00020\u0002\u0012\b\b\u0002\u0010*\u001a\u00020\u0002\u0012\b\b\u0002\u0010+\u001a\u00020\u0002\u0012\b\b\u0002\u0010,\u001a\u00020\u0002\u0012\b\b\u0002\u0010-\u001a\u00020\u0002\u0012\b\b\u0002\u0010.\u001a\u00020\u0002\u0012\b\b\u0002\u0010/\u001a\u00020\u0002\u0012\b\b\u0002\u00100\u001a\u00020\u0002\u0012\b\b\u0002\u00101\u001a\u00020\u0002\u0012\b\b\u0002\u00102\u001a\u00020\u0002\u0012\b\b\u0002\u00103\u001a\u00020\u0002\u0012\b\b\u0002\u00104\u001a\u00020\u0002\u0012\b\b\u0002\u00105\u001a\u00020\u0002\u0012\b\b\u0002\u00106\u001a\u00020\u0002\u0012\b\b\u0002\u00107\u001a\u00020\u0002\u0012\b\b\u0002\u00108\u001a\u00020\u0002\u0012\b\b\u0002\u00109\u001a\u00020\u0002\u0012\b\b\u0002\u0010:\u001a\u00020\u0002\u0012\b\b\u0002\u0010;\u001a\u00020\u0002\u0012\b\b\u0002\u0010<\u001a\u00020\u0002\u0012\b\b\u0002\u0010=\u001a\u00020\u0002\u0012\b\b\u0002\u0010>\u001a\u00020\u0002\u0012\b\b\u0002\u0010?\u001a\u00020\u0002\u0012\b\b\u0002\u0010@\u001a\u00020\u0002\u0012\b\b\u0002\u0010A\u001a\u00020\u0002\u0012\b\b\u0002\u0010B\u001a\u00020\u0002\u0012\b\b\u0002\u0010C\u001a\u00020\u0002\u0012\b\b\u0002\u0010D\u001a\u00020\u0002\u0012\b\b\u0002\u0010E\u001a\u00020\u0002\u0012\b\b\u0002\u0010F\u001a\u00020\u0002\u0012\b\b\u0002\u0010G\u001a\u00020\u0002\u0012\b\b\u0002\u0010H\u001a\u00020\u0002\u0012\b\b\u0002\u0010I\u001a\u00020\u0002\u0012\b\b\u0002\u0010J\u001a\u00020\u0002\u0012\b\b\u0002\u0010K\u001a\u00020\u0002\u0012\b\b\u0002\u0010L\u001a\u00020\u0002\u0012\b\b\u0002\u0010M\u001a\u00020\u0002\u0012\b\b\u0002\u0010N\u001a\u00020\u0002\u0012\b\b\u0002\u0010O\u001a\u00020\u0002\u0012\b\b\u0002\u0010P\u001a\u00020\u0002\u0012\b\b\u0002\u0010Q\u001a\u00020\u0002\u0012\b\b\u0002\u0010R\u001a\u00020\u0002\u0012\b\b\u0002\u0010S\u001a\u00020\u0002\u0012\b\b\u0002\u0010T\u001a\u00020\u0002\u0012\b\b\u0002\u0010U\u001a\u00020\u0002\u0012\b\b\u0002\u0010V\u001a\u00020\u0002\u0012\b\b\u0002\u0010W\u001a\u00020\u0002\u0012\b\b\u0002\u0010X\u001a\u00020\u0002\u0012\b\b\u0002\u0010Y\u001a\u00020\u0002\u0012\b\b\u0002\u0010Z\u001a\u00020\u0002\u0012\b\b\u0002\u0010[\u001a\u00020\u0002\u0012\b\b\u0002\u0010\\\u001a\u00020\u0002\u0012\b\b\u0002\u0010]\u001a\u00020\u0002\u0012\b\b\u0002\u0010^\u001a\u00020\u0002\u0012\b\b\u0002\u0010_\u001a\u00020\u0002\u0012\b\b\u0002\u0010`\u001a\u00020\u0002\u0012\b\b\u0002\u0010a\u001a\u00020\u0002\u0012\b\b\u0002\u0010b\u001a\u00020\u0002\u0012\b\b\u0002\u0010c\u001a\u00020\u0002\u0012\b\b\u0002\u0010d\u001a\u00020\u0002\u0012\b\b\u0002\u0010e\u001a\u00020\u0002\u0012\b\b\u0002\u0010f\u001a\u00020\u0002\u0012\b\b\u0002\u0010g\u001a\u00020\u0002\u0012\b\b\u0002\u0010h\u001a\u00020\u0002\u0012\b\b\u0002\u0010i\u001a\u00020\u0002\u0012\b\b\u0002\u0010j\u001a\u00020\u0002\u0012\b\b\u0002\u0010k\u001a\u00020\u0002\u0012\b\b\u0002\u0010l\u001a\u00020\u0002\u0012\b\b\u0002\u0010m\u001a\u00020\u0002\u0012\b\b\u0002\u0010n\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020p0o¢\u0006\u0004\br\u0010sJ\u0010\u0010u\u001a\u00020tHÖ\u0001¢\u0006\u0004\bu\u0010vJ\u0010\u0010x\u001a\u00020wHÖ\u0001¢\u0006\u0004\bx\u0010yJ\u001a\u0010|\u001a\u00020{2\b\u0010z\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b|\u0010}R\u0018\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\b~\u0010\u007f\u001a\u0005\b~\u0010\u0080\u0001R\u001a\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u0081\u0001\u0010\u007f\u001a\u0006\b\u0081\u0001\u0010\u0080\u0001R\u001a\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u0082\u0001\u0010\u007f\u001a\u0006\b\u0082\u0001\u0010\u0080\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u0083\u0001\u0010\u007f\u001a\u0006\b\u0083\u0001\u0010\u0080\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u0084\u0001\u0010\u007f\u001a\u0006\b\u0084\u0001\u0010\u0080\u0001R\u001a\u0010\b\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u0085\u0001\u0010\u007f\u001a\u0006\b\u0085\u0001\u0010\u0080\u0001R\u001a\u0010\t\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u0086\u0001\u0010\u007f\u001a\u0006\b\u0086\u0001\u0010\u0080\u0001R\u001a\u0010\n\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u0087\u0001\u0010\u007f\u001a\u0006\b\u0087\u0001\u0010\u0080\u0001R\u001a\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u0088\u0001\u0010\u007f\u001a\u0006\b\u0088\u0001\u0010\u0080\u0001R\u001a\u0010\f\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u0089\u0001\u0010\u007f\u001a\u0006\b\u0089\u0001\u0010\u0080\u0001R\u001a\u0010\r\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u008a\u0001\u0010\u007f\u001a\u0006\b\u008a\u0001\u0010\u0080\u0001R\u001a\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u008b\u0001\u0010\u007f\u001a\u0006\b\u008b\u0001\u0010\u0080\u0001R\u001a\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u008c\u0001\u0010\u007f\u001a\u0006\b\u008c\u0001\u0010\u0080\u0001R\u001a\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u008d\u0001\u0010\u007f\u001a\u0006\b\u008d\u0001\u0010\u0080\u0001R\u001a\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u008e\u0001\u0010\u007f\u001a\u0006\b\u008e\u0001\u0010\u0080\u0001R\u001a\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u008f\u0001\u0010\u007f\u001a\u0006\b\u008f\u0001\u0010\u0080\u0001R\u001a\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u0090\u0001\u0010\u007f\u001a\u0006\b\u0090\u0001\u0010\u0080\u0001R\u001a\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u0091\u0001\u0010\u007f\u001a\u0006\b\u0091\u0001\u0010\u0080\u0001R\u001a\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u0092\u0001\u0010\u007f\u001a\u0006\b\u0092\u0001\u0010\u0080\u0001R\u001a\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u0093\u0001\u0010\u007f\u001a\u0006\b\u0093\u0001\u0010\u0080\u0001R\u001a\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u0094\u0001\u0010\u007f\u001a\u0006\b\u0094\u0001\u0010\u0080\u0001R\u001a\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u0095\u0001\u0010\u007f\u001a\u0006\b\u0095\u0001\u0010\u0080\u0001R\u001a\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u0096\u0001\u0010\u007f\u001a\u0006\b\u0096\u0001\u0010\u0080\u0001R\u001a\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u0097\u0001\u0010\u007f\u001a\u0006\b\u0097\u0001\u0010\u0080\u0001R\u001a\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u0098\u0001\u0010\u007f\u001a\u0006\b\u0098\u0001\u0010\u0080\u0001R\u001a\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u0099\u0001\u0010\u007f\u001a\u0006\b\u0099\u0001\u0010\u0080\u0001R\u001a\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u009a\u0001\u0010\u007f\u001a\u0006\b\u009a\u0001\u0010\u0080\u0001R\u001a\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u009b\u0001\u0010\u007f\u001a\u0006\b\u009b\u0001\u0010\u0080\u0001R\u001a\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u009c\u0001\u0010\u007f\u001a\u0006\b\u009c\u0001\u0010\u0080\u0001R\u001a\u0010 \u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u009d\u0001\u0010\u007f\u001a\u0006\b\u009e\u0001\u0010\u0080\u0001R\u001a\u0010!\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u009e\u0001\u0010\u007f\u001a\u0006\b\u009f\u0001\u0010\u0080\u0001R\u001a\u0010\"\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u009f\u0001\u0010\u007f\u001a\u0006\b \u0001\u0010\u0080\u0001R\u001a\u0010#\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b \u0001\u0010\u007f\u001a\u0006\b¡\u0001\u0010\u0080\u0001R\u001a\u0010$\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b¡\u0001\u0010\u007f\u001a\u0006\b¢\u0001\u0010\u0080\u0001R\u0019\u0010%\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b¢\u0001\u0010\u007f\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0019\u0010&\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0004\b\u007f\u0010\u007f\u001a\u0006\b£\u0001\u0010\u0080\u0001R\u001a\u0010'\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b£\u0001\u0010\u007f\u001a\u0006\b¤\u0001\u0010\u0080\u0001R\u001a\u0010(\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b¤\u0001\u0010\u007f\u001a\u0006\b¥\u0001\u0010\u0080\u0001R\u001a\u0010)\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b¥\u0001\u0010\u007f\u001a\u0006\b¦\u0001\u0010\u0080\u0001R\u001a\u0010*\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b¦\u0001\u0010\u007f\u001a\u0006\b§\u0001\u0010\u0080\u0001R\u001a\u0010+\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b§\u0001\u0010\u007f\u001a\u0006\b¨\u0001\u0010\u0080\u0001R\u001a\u0010,\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b¨\u0001\u0010\u007f\u001a\u0006\b©\u0001\u0010\u0080\u0001R\u001a\u0010-\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b©\u0001\u0010\u007f\u001a\u0006\bª\u0001\u0010\u0080\u0001R\u001a\u0010.\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bª\u0001\u0010\u007f\u001a\u0006\b«\u0001\u0010\u0080\u0001R\u001a\u0010/\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b«\u0001\u0010\u007f\u001a\u0006\b¬\u0001\u0010\u0080\u0001R\u001a\u00100\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b¬\u0001\u0010\u007f\u001a\u0006\b\u00ad\u0001\u0010\u0080\u0001R\u001a\u00101\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u00ad\u0001\u0010\u007f\u001a\u0006\b®\u0001\u0010\u0080\u0001R\u001a\u00102\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b®\u0001\u0010\u007f\u001a\u0006\b¯\u0001\u0010\u0080\u0001R\u001a\u00103\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b¯\u0001\u0010\u007f\u001a\u0006\b°\u0001\u0010\u0080\u0001R\u001a\u00104\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b°\u0001\u0010\u007f\u001a\u0006\b±\u0001\u0010\u0080\u0001R\u001a\u00105\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b±\u0001\u0010\u007f\u001a\u0006\b²\u0001\u0010\u0080\u0001R\u001a\u00106\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b²\u0001\u0010\u007f\u001a\u0006\b³\u0001\u0010\u0080\u0001R\u001a\u00107\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b³\u0001\u0010\u007f\u001a\u0006\b´\u0001\u0010\u0080\u0001R\u001a\u00108\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b´\u0001\u0010\u007f\u001a\u0006\bµ\u0001\u0010\u0080\u0001R\u001a\u00109\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bµ\u0001\u0010\u007f\u001a\u0006\b¶\u0001\u0010\u0080\u0001R\u001a\u0010:\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b¶\u0001\u0010\u007f\u001a\u0006\b·\u0001\u0010\u0080\u0001R\u001a\u0010;\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b·\u0001\u0010\u007f\u001a\u0006\b¸\u0001\u0010\u0080\u0001R\u001a\u0010<\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b¸\u0001\u0010\u007f\u001a\u0006\b¹\u0001\u0010\u0080\u0001R\u001a\u0010=\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b¹\u0001\u0010\u007f\u001a\u0006\bº\u0001\u0010\u0080\u0001R\u001a\u0010>\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bº\u0001\u0010\u007f\u001a\u0006\b»\u0001\u0010\u0080\u0001R\u001a\u0010?\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b»\u0001\u0010\u007f\u001a\u0006\b¼\u0001\u0010\u0080\u0001R\u001a\u0010@\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b¼\u0001\u0010\u007f\u001a\u0006\b½\u0001\u0010\u0080\u0001R\u001a\u0010A\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b½\u0001\u0010\u007f\u001a\u0006\b¾\u0001\u0010\u0080\u0001R\u001a\u0010B\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b¾\u0001\u0010\u007f\u001a\u0006\b¿\u0001\u0010\u0080\u0001R\u001a\u0010C\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b¿\u0001\u0010\u007f\u001a\u0006\bÀ\u0001\u0010\u0080\u0001R\u001a\u0010D\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bÀ\u0001\u0010\u007f\u001a\u0006\bÁ\u0001\u0010\u0080\u0001R\u001a\u0010E\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bÁ\u0001\u0010\u007f\u001a\u0006\bÂ\u0001\u0010\u0080\u0001R\u001a\u0010F\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bÂ\u0001\u0010\u007f\u001a\u0006\bÃ\u0001\u0010\u0080\u0001R\u001a\u0010G\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bÃ\u0001\u0010\u007f\u001a\u0006\bÄ\u0001\u0010\u0080\u0001R\u001a\u0010H\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bÄ\u0001\u0010\u007f\u001a\u0006\bÅ\u0001\u0010\u0080\u0001R\u001a\u0010I\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bÅ\u0001\u0010\u007f\u001a\u0006\bÆ\u0001\u0010\u0080\u0001R\u001a\u0010J\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bÆ\u0001\u0010\u007f\u001a\u0006\bÇ\u0001\u0010\u0080\u0001R\u001a\u0010K\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bÇ\u0001\u0010\u007f\u001a\u0006\bÈ\u0001\u0010\u0080\u0001R\u001a\u0010L\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bÈ\u0001\u0010\u007f\u001a\u0006\bÉ\u0001\u0010\u0080\u0001R\u001a\u0010M\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bÉ\u0001\u0010\u007f\u001a\u0006\bÊ\u0001\u0010\u0080\u0001R\u001a\u0010N\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bÊ\u0001\u0010\u007f\u001a\u0006\bË\u0001\u0010\u0080\u0001R\u001a\u0010O\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bË\u0001\u0010\u007f\u001a\u0006\bÌ\u0001\u0010\u0080\u0001R\u001a\u0010P\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bÌ\u0001\u0010\u007f\u001a\u0006\bÍ\u0001\u0010\u0080\u0001R\u001a\u0010Q\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bÍ\u0001\u0010\u007f\u001a\u0006\bÎ\u0001\u0010\u0080\u0001R\u001a\u0010R\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bÎ\u0001\u0010\u007f\u001a\u0006\bÏ\u0001\u0010\u0080\u0001R\u001a\u0010S\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bÏ\u0001\u0010\u007f\u001a\u0006\bÐ\u0001\u0010\u0080\u0001R\u001a\u0010T\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bÐ\u0001\u0010\u007f\u001a\u0006\bÑ\u0001\u0010\u0080\u0001R\u001a\u0010U\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bÑ\u0001\u0010\u007f\u001a\u0006\bÒ\u0001\u0010\u0080\u0001R\u001a\u0010V\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bÒ\u0001\u0010\u007f\u001a\u0006\bÓ\u0001\u0010\u0080\u0001R\u001a\u0010W\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bÓ\u0001\u0010\u007f\u001a\u0006\bÔ\u0001\u0010\u0080\u0001R\u001a\u0010X\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bÔ\u0001\u0010\u007f\u001a\u0006\bÕ\u0001\u0010\u0080\u0001R\u001a\u0010Y\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bÕ\u0001\u0010\u007f\u001a\u0006\bÖ\u0001\u0010\u0080\u0001R\u001a\u0010Z\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bÖ\u0001\u0010\u007f\u001a\u0006\b×\u0001\u0010\u0080\u0001R\u001a\u0010[\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b×\u0001\u0010\u007f\u001a\u0006\bØ\u0001\u0010\u0080\u0001R\u001a\u0010\\\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bØ\u0001\u0010\u007f\u001a\u0006\bÙ\u0001\u0010\u0080\u0001R\u001a\u0010]\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bÙ\u0001\u0010\u007f\u001a\u0006\bÚ\u0001\u0010\u0080\u0001R\u001a\u0010^\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bÚ\u0001\u0010\u007f\u001a\u0006\bÛ\u0001\u0010\u0080\u0001R\u001a\u0010_\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bÛ\u0001\u0010\u007f\u001a\u0006\bÜ\u0001\u0010\u0080\u0001R\u001a\u0010`\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bÜ\u0001\u0010\u007f\u001a\u0006\bÝ\u0001\u0010\u0080\u0001R\u001a\u0010a\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bÝ\u0001\u0010\u007f\u001a\u0006\bÞ\u0001\u0010\u0080\u0001R\u001a\u0010b\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bÞ\u0001\u0010\u007f\u001a\u0006\bß\u0001\u0010\u0080\u0001R\u001a\u0010c\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bß\u0001\u0010\u007f\u001a\u0006\bà\u0001\u0010\u0080\u0001R\u001a\u0010d\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bà\u0001\u0010\u007f\u001a\u0006\bá\u0001\u0010\u0080\u0001R\u001a\u0010e\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bá\u0001\u0010\u007f\u001a\u0006\bâ\u0001\u0010\u0080\u0001R\u001a\u0010f\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bâ\u0001\u0010\u007f\u001a\u0006\bã\u0001\u0010\u0080\u0001R\u001a\u0010g\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bã\u0001\u0010\u007f\u001a\u0006\bä\u0001\u0010\u0080\u0001R\u001a\u0010h\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bä\u0001\u0010\u007f\u001a\u0006\bå\u0001\u0010\u0080\u0001R\u001a\u0010i\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bå\u0001\u0010\u007f\u001a\u0006\bæ\u0001\u0010\u0080\u0001R\u001a\u0010j\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bæ\u0001\u0010\u007f\u001a\u0006\bç\u0001\u0010\u0080\u0001R\u001a\u0010k\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bç\u0001\u0010\u007f\u001a\u0006\bè\u0001\u0010\u0080\u0001R\u001a\u0010l\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bè\u0001\u0010\u007f\u001a\u0006\bé\u0001\u0010\u0080\u0001R\u001a\u0010m\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bé\u0001\u0010\u007f\u001a\u0006\bê\u0001\u0010\u0080\u0001R\u001a\u0010n\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\bê\u0001\u0010\u007f\u001a\u0006\bë\u0001\u0010\u0080\u0001R'\u0010q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020p0o8\u0006¢\u0006\u0010\n\u0006\bë\u0001\u0010ì\u0001\u001a\u0006\b\u009d\u0001\u0010í\u0001¨\u0006î\u0001"}, m65681d2 = {"Ly81/i;", "", "Li2/x;", "accentAction", "accentAlert", "accentAlertTrend15", "accentFocus", "accentFocus15", "accentNegativeTrend", "accentNegativeTrend15", "accentNote", "accentOnboardingAction", "accentPositiveTrend", "accentPositiveTrend15", "america250Blue", "america250Red", "backgroundDarkAlt", "backgroundDarkStd", "black10", "black20", "black30", "black5", "black50", "black70", "black90", "brandBlack", "brandPrimary", "brandWhite", "brandWhoopPro", "bronze", "challengeGaugeInactive", "coachBlue", "gold", "greyL1", "greyL2", "greyL3", "greyL4", "greyL5", "greyL6", "greyL7", "greyL8", "healthCalibrating", "healthNeutral", "healthOld", "healthYoung", "mciRed", "mciRed50", "neutral15", "patrioticBlue", "patrioticRed", "platinum", "recovery", "recovery10", "recoveryHighRecovery", "recoveryHighRecovery10", "recoveryLowRecovery", "recoveryMediumRecovery", "secondaryText", "silver", UserState.States.SLEEP, "sleepAwake", "sleepDeepSleep", "sleepLightSleep", "sleepRemSleep", "strain", "strainZone1", "strainZone2", "strainZone3", "strainZone4", "strainZone5", "sufficientTrend", "sufficientTrend15", "surfaceMciBirthControl", "surfaceMciBirthControlDim", "surfaceMciFollicular", "surfaceMciFollicularDim", "surfaceMciLuteal", "surfaceMciLutealDim", "surfaceMciMenstrual", "surfaceMciMenstrualDim", "surfaceMciOvulatory", "surfaceMciOvulatoryDim", "surfacePregnancyTrimester1", "surfacePregnancyTrimester1Dim", "surfacePregnancyTrimester2", "surfacePregnancyTrimester2Dim", "surfacePregnancyTrimester3", "surfacePregnancyTrimester3Dim", "surfacePregnancyTrimester4", "surfacePregnancyTrimester4Dim", "surfaceSecondaryGrey", "textBaseSecondary", "textMciBirthControl", "textMciFollicular", "textMciLuteal", "textMciMenstrual", "textMciOvulatory", "textPregnancyTrimester1", "textPregnancyTrimester2", "textPregnancyTrimester3", "textPregnancyTrimester4", "transparent", "white10", "white20", "white30", "white40", "white5", "white50", "white70", "white90", "withingsPlan", "", "Lkd1/h;", "descriptions", "<init>", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLjava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "c", "d", "e", "f", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a0", "b0", "c0", "d0", "e0", "f0", "g0", "h0", "i0", "j0", "k0", "l0", "m0", "n0", "o0", "p0", "q0", "r0", "s0", "t0", "u0", "v0", "w0", "x0", "y0", "z0", "A0", "B0", "C0", "D0", "E0", "F0", "G0", "H0", "I0", "J0", "K0", "L0", "M0", "N0", "O0", "P0", "Q0", "R0", "S0", "T0", "U0", "V0", "W0", "X0", "Y0", "Z0", "a1", "b1", "c1", "d1", "e1", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39336i {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final long bronze;

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    private final long surfaceMciOvulatoryDim;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final long challengeGaugeInactive;

    /* JADX INFO: renamed from: B0, reason: from kotlin metadata */
    private final long surfacePregnancyTrimester1;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final long coachBlue;

    /* JADX INFO: renamed from: C0, reason: from kotlin metadata */
    private final long surfacePregnancyTrimester1Dim;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final long gold;

    /* JADX INFO: renamed from: D0, reason: from kotlin metadata */
    private final long surfacePregnancyTrimester2;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final long greyL1;

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    private final long surfacePregnancyTrimester2Dim;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final long greyL2;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    private final long surfacePregnancyTrimester3;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final long greyL3;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    private final long surfacePregnancyTrimester3Dim;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final long greyL4;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    private final long surfacePregnancyTrimester4;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final long greyL5;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    private final long surfacePregnancyTrimester4Dim;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final long greyL6;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    private final long surfaceSecondaryGrey;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final long greyL7;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    private final long textBaseSecondary;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final long greyL8;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    private final long textMciBirthControl;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final long healthCalibrating;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    private final long textMciFollicular;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final long healthNeutral;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    private final long textMciLuteal;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final long healthOld;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    private final long textMciMenstrual;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final long healthYoung;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    private final long textMciOvulatory;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final long mciRed;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    private final long textPregnancyTrimester1;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private final long mciRed50;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    private final long textPregnancyTrimester2;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private final long neutral15;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    private final long textPregnancyTrimester3;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private final long patrioticBlue;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    private final long textPregnancyTrimester4;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private final long patrioticRed;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    private final long transparent;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private final long platinum;

    /* JADX INFO: renamed from: V0, reason: from kotlin metadata */
    private final long white10;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private final long recovery;

    /* JADX INFO: renamed from: W0, reason: from kotlin metadata */
    private final long white20;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private final long recovery10;

    /* JADX INFO: renamed from: X0, reason: from kotlin metadata */
    private final long white30;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private final long recoveryHighRecovery;

    /* JADX INFO: renamed from: Y0, reason: from kotlin metadata */
    private final long white40;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private final long recoveryHighRecovery10;

    /* JADX INFO: renamed from: Z0, reason: from kotlin metadata */
    private final long white5;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long accentAction;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    private final long recoveryLowRecovery;

    /* JADX INFO: renamed from: a1, reason: from kotlin metadata */
    private final long white50;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long accentAlert;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    private final long recoveryMediumRecovery;

    /* JADX INFO: renamed from: b1, reason: from kotlin metadata */
    private final long white70;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long accentAlertTrend15;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    private final long secondaryText;

    /* JADX INFO: renamed from: c1, reason: from kotlin metadata */
    private final long white90;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long accentFocus;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    private final long silver;

    /* JADX INFO: renamed from: d1, reason: from kotlin metadata */
    private final long withingsPlan;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final long accentFocus15;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    private final long sleep;

    /* JADX INFO: renamed from: e1, reason: from kotlin metadata */
    private final List<C22396h<C17919x>> descriptions;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final long accentNegativeTrend;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    private final long sleepAwake;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final long accentNegativeTrend15;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    private final long sleepDeepSleep;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final long accentNote;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    private final long sleepLightSleep;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final long accentOnboardingAction;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    private final long sleepRemSleep;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final long accentPositiveTrend;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    private final long strain;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final long accentPositiveTrend15;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    private final long strainZone1;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final long america250Blue;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    private final long strainZone2;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final long america250Red;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    private final long strainZone3;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final long backgroundDarkAlt;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    private final long strainZone4;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final long backgroundDarkStd;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    private final long strainZone5;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final long black10;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    private final long sufficientTrend;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final long black20;

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    private final long sufficientTrend15;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final long black30;

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    private final long surfaceMciBirthControl;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final long black5;

    /* JADX INFO: renamed from: s0, reason: from kotlin metadata */
    private final long surfaceMciBirthControlDim;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final long black50;

    /* JADX INFO: renamed from: t0, reason: from kotlin metadata */
    private final long surfaceMciFollicular;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final long black70;

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    private final long surfaceMciFollicularDim;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final long black90;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    private final long surfaceMciLuteal;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final long brandBlack;

    /* JADX INFO: renamed from: w0, reason: from kotlin metadata */
    private final long surfaceMciLutealDim;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final long brandPrimary;

    /* JADX INFO: renamed from: x0, reason: from kotlin metadata */
    private final long surfaceMciMenstrual;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final long brandWhite;

    /* JADX INFO: renamed from: y0, reason: from kotlin metadata */
    private final long surfaceMciMenstrualDim;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final long brandWhoopPro;

    /* JADX INFO: renamed from: z0, reason: from kotlin metadata */
    private final long surfaceMciOvulatory;

    public /* synthetic */ C39336i(long j7, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j24, long j25, long j26, long j27, long j28, long j29, long j34, long j35, long j36, long j37, long j38, long j39, long j44, long j45, long j46, long j47, long j48, long j49, long j54, long j55, long j56, long j57, long j58, long j59, long j64, long j65, long j66, long j67, long j68, long j69, long j73, long j74, long j75, long j76, long j77, long j78, long j79, long j82, long j83, long j84, long j85, long j86, long j87, long j88, long j89, long j94, long j95, long j96, long j97, long j98, long j99, long j100, long j101, long j102, long j103, long j104, long j105, long j106, long j107, long j108, long j109, long j110, long j111, long j112, long j113, long j114, long j115, long j116, long j117, long j118, long j119, long j120, long j121, long j122, long j123, long j124, long j125, long j126, long j127, long j128, long j129, long j130, long j131, long j132, long j133, long j134, long j135, long j136, long j137, long j138, long j139, long j140, long j141, long j142, long j143, long j144, long j145, long j146, long j147, long j148, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(j7, j13, j14, j15, j16, j17, j18, j19, j24, j25, j26, j27, j28, j29, j34, j35, j36, j37, j38, j39, j44, j45, j46, j47, j48, j49, j54, j55, j56, j57, j58, j59, j64, j65, j66, j67, j68, j69, j73, j74, j75, j76, j77, j78, j79, j82, j83, j84, j85, j86, j87, j88, j89, j94, j95, j96, j97, j98, j99, j100, j101, j102, j103, j104, j105, j106, j107, j108, j109, j110, j111, j112, j113, j114, j115, j116, j117, j118, j119, j120, j121, j122, j123, j124, j125, j126, j127, j128, j129, j130, j131, j132, j133, j134, j135, j136, j137, j138, j139, j140, j141, j142, j143, j144, j145, j146, j147, j148, list);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final long getBronze() {
        return this.bronze;
    }

    /* JADX INFO: renamed from: A0, reason: from getter */
    public final long getSurfaceMciOvulatory() {
        return this.surfaceMciOvulatory;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final long getChallengeGaugeInactive() {
        return this.challengeGaugeInactive;
    }

    /* JADX INFO: renamed from: B0, reason: from getter */
    public final long getSurfaceMciOvulatoryDim() {
        return this.surfaceMciOvulatoryDim;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final long getCoachBlue() {
        return this.coachBlue;
    }

    /* JADX INFO: renamed from: C0, reason: from getter */
    public final long getSurfacePregnancyTrimester1() {
        return this.surfacePregnancyTrimester1;
    }

    /* JADX INFO: renamed from: D */
    public final List<C22396h<C17919x>> m125331D() {
        return this.descriptions;
    }

    /* JADX INFO: renamed from: D0, reason: from getter */
    public final long getSurfacePregnancyTrimester1Dim() {
        return this.surfacePregnancyTrimester1Dim;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final long getGold() {
        return this.gold;
    }

    /* JADX INFO: renamed from: E0, reason: from getter */
    public final long getSurfacePregnancyTrimester2() {
        return this.surfacePregnancyTrimester2;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final long getGreyL1() {
        return this.greyL1;
    }

    /* JADX INFO: renamed from: F0, reason: from getter */
    public final long getSurfacePregnancyTrimester2Dim() {
        return this.surfacePregnancyTrimester2Dim;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final long getGreyL2() {
        return this.greyL2;
    }

    /* JADX INFO: renamed from: G0, reason: from getter */
    public final long getSurfacePregnancyTrimester3() {
        return this.surfacePregnancyTrimester3;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final long getGreyL3() {
        return this.greyL3;
    }

    /* JADX INFO: renamed from: H0, reason: from getter */
    public final long getSurfacePregnancyTrimester3Dim() {
        return this.surfacePregnancyTrimester3Dim;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final long getGreyL4() {
        return this.greyL4;
    }

    /* JADX INFO: renamed from: I0, reason: from getter */
    public final long getSurfacePregnancyTrimester4() {
        return this.surfacePregnancyTrimester4;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final long getGreyL5() {
        return this.greyL5;
    }

    /* JADX INFO: renamed from: J0, reason: from getter */
    public final long getSurfacePregnancyTrimester4Dim() {
        return this.surfacePregnancyTrimester4Dim;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final long getGreyL6() {
        return this.greyL6;
    }

    /* JADX INFO: renamed from: K0, reason: from getter */
    public final long getSurfaceSecondaryGrey() {
        return this.surfaceSecondaryGrey;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final long getGreyL7() {
        return this.greyL7;
    }

    /* JADX INFO: renamed from: L0, reason: from getter */
    public final long getTextBaseSecondary() {
        return this.textBaseSecondary;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final long getGreyL8() {
        return this.greyL8;
    }

    /* JADX INFO: renamed from: M0, reason: from getter */
    public final long getTextMciBirthControl() {
        return this.textMciBirthControl;
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public final long getHealthCalibrating() {
        return this.healthCalibrating;
    }

    /* JADX INFO: renamed from: N0, reason: from getter */
    public final long getTextMciFollicular() {
        return this.textMciFollicular;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final long getHealthNeutral() {
        return this.healthNeutral;
    }

    /* JADX INFO: renamed from: O0, reason: from getter */
    public final long getTextMciLuteal() {
        return this.textMciLuteal;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final long getHealthOld() {
        return this.healthOld;
    }

    /* JADX INFO: renamed from: P0, reason: from getter */
    public final long getTextMciMenstrual() {
        return this.textMciMenstrual;
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final long getHealthYoung() {
        return this.healthYoung;
    }

    /* JADX INFO: renamed from: Q0, reason: from getter */
    public final long getTextMciOvulatory() {
        return this.textMciOvulatory;
    }

    /* JADX INFO: renamed from: R, reason: from getter */
    public final long getMciRed() {
        return this.mciRed;
    }

    /* JADX INFO: renamed from: R0, reason: from getter */
    public final long getTextPregnancyTrimester1() {
        return this.textPregnancyTrimester1;
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public final long getMciRed50() {
        return this.mciRed50;
    }

    /* JADX INFO: renamed from: S0, reason: from getter */
    public final long getTextPregnancyTrimester2() {
        return this.textPregnancyTrimester2;
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final long getNeutral15() {
        return this.neutral15;
    }

    /* JADX INFO: renamed from: T0, reason: from getter */
    public final long getTextPregnancyTrimester3() {
        return this.textPregnancyTrimester3;
    }

    /* JADX INFO: renamed from: U, reason: from getter */
    public final long getPatrioticBlue() {
        return this.patrioticBlue;
    }

    /* JADX INFO: renamed from: U0, reason: from getter */
    public final long getTextPregnancyTrimester4() {
        return this.textPregnancyTrimester4;
    }

    /* JADX INFO: renamed from: V, reason: from getter */
    public final long getPatrioticRed() {
        return this.patrioticRed;
    }

    /* JADX INFO: renamed from: V0, reason: from getter */
    public final long getTransparent() {
        return this.transparent;
    }

    /* JADX INFO: renamed from: W, reason: from getter */
    public final long getPlatinum() {
        return this.platinum;
    }

    /* JADX INFO: renamed from: W0, reason: from getter */
    public final long getWhite10() {
        return this.white10;
    }

    /* JADX INFO: renamed from: X, reason: from getter */
    public final long getRecovery() {
        return this.recovery;
    }

    /* JADX INFO: renamed from: X0, reason: from getter */
    public final long getWhite20() {
        return this.white20;
    }

    /* JADX INFO: renamed from: Y, reason: from getter */
    public final long getRecovery10() {
        return this.recovery10;
    }

    /* JADX INFO: renamed from: Y0, reason: from getter */
    public final long getWhite30() {
        return this.white30;
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final long getRecoveryHighRecovery() {
        return this.recoveryHighRecovery;
    }

    /* JADX INFO: renamed from: Z0, reason: from getter */
    public final long getWhite40() {
        return this.white40;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getAccentAction() {
        return this.accentAction;
    }

    /* JADX INFO: renamed from: a0, reason: from getter */
    public final long getRecoveryHighRecovery10() {
        return this.recoveryHighRecovery10;
    }

    /* JADX INFO: renamed from: a1, reason: from getter */
    public final long getWhite5() {
        return this.white5;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getAccentAlert() {
        return this.accentAlert;
    }

    /* JADX INFO: renamed from: b0, reason: from getter */
    public final long getRecoveryLowRecovery() {
        return this.recoveryLowRecovery;
    }

    /* JADX INFO: renamed from: b1, reason: from getter */
    public final long getWhite50() {
        return this.white50;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getAccentAlertTrend15() {
        return this.accentAlertTrend15;
    }

    /* JADX INFO: renamed from: c0, reason: from getter */
    public final long getRecoveryMediumRecovery() {
        return this.recoveryMediumRecovery;
    }

    /* JADX INFO: renamed from: c1, reason: from getter */
    public final long getWhite70() {
        return this.white70;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getAccentFocus() {
        return this.accentFocus;
    }

    /* JADX INFO: renamed from: d0, reason: from getter */
    public final long getSecondaryText() {
        return this.secondaryText;
    }

    /* JADX INFO: renamed from: d1, reason: from getter */
    public final long getWhite90() {
        return this.white90;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getAccentFocus15() {
        return this.accentFocus15;
    }

    /* JADX INFO: renamed from: e0, reason: from getter */
    public final long getSilver() {
        return this.silver;
    }

    /* JADX INFO: renamed from: e1, reason: from getter */
    public final long getWithingsPlan() {
        return this.withingsPlan;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39336i)) {
            return false;
        }
        C39336i c39336i = (C39336i) other;
        return C17919x.m51542d(this.accentAction, c39336i.accentAction) && C17919x.m51542d(this.accentAlert, c39336i.accentAlert) && C17919x.m51542d(this.accentAlertTrend15, c39336i.accentAlertTrend15) && C17919x.m51542d(this.accentFocus, c39336i.accentFocus) && C17919x.m51542d(this.accentFocus15, c39336i.accentFocus15) && C17919x.m51542d(this.accentNegativeTrend, c39336i.accentNegativeTrend) && C17919x.m51542d(this.accentNegativeTrend15, c39336i.accentNegativeTrend15) && C17919x.m51542d(this.accentNote, c39336i.accentNote) && C17919x.m51542d(this.accentOnboardingAction, c39336i.accentOnboardingAction) && C17919x.m51542d(this.accentPositiveTrend, c39336i.accentPositiveTrend) && C17919x.m51542d(this.accentPositiveTrend15, c39336i.accentPositiveTrend15) && C17919x.m51542d(this.america250Blue, c39336i.america250Blue) && C17919x.m51542d(this.america250Red, c39336i.america250Red) && C17919x.m51542d(this.backgroundDarkAlt, c39336i.backgroundDarkAlt) && C17919x.m51542d(this.backgroundDarkStd, c39336i.backgroundDarkStd) && C17919x.m51542d(this.black10, c39336i.black10) && C17919x.m51542d(this.black20, c39336i.black20) && C17919x.m51542d(this.black30, c39336i.black30) && C17919x.m51542d(this.black5, c39336i.black5) && C17919x.m51542d(this.black50, c39336i.black50) && C17919x.m51542d(this.black70, c39336i.black70) && C17919x.m51542d(this.black90, c39336i.black90) && C17919x.m51542d(this.brandBlack, c39336i.brandBlack) && C17919x.m51542d(this.brandPrimary, c39336i.brandPrimary) && C17919x.m51542d(this.brandWhite, c39336i.brandWhite) && C17919x.m51542d(this.brandWhoopPro, c39336i.brandWhoopPro) && C17919x.m51542d(this.bronze, c39336i.bronze) && C17919x.m51542d(this.challengeGaugeInactive, c39336i.challengeGaugeInactive) && C17919x.m51542d(this.coachBlue, c39336i.coachBlue) && C17919x.m51542d(this.gold, c39336i.gold) && C17919x.m51542d(this.greyL1, c39336i.greyL1) && C17919x.m51542d(this.greyL2, c39336i.greyL2) && C17919x.m51542d(this.greyL3, c39336i.greyL3) && C17919x.m51542d(this.greyL4, c39336i.greyL4) && C17919x.m51542d(this.greyL5, c39336i.greyL5) && C17919x.m51542d(this.greyL6, c39336i.greyL6) && C17919x.m51542d(this.greyL7, c39336i.greyL7) && C17919x.m51542d(this.greyL8, c39336i.greyL8) && C17919x.m51542d(this.healthCalibrating, c39336i.healthCalibrating) && C17919x.m51542d(this.healthNeutral, c39336i.healthNeutral) && C17919x.m51542d(this.healthOld, c39336i.healthOld) && C17919x.m51542d(this.healthYoung, c39336i.healthYoung) && C17919x.m51542d(this.mciRed, c39336i.mciRed) && C17919x.m51542d(this.mciRed50, c39336i.mciRed50) && C17919x.m51542d(this.neutral15, c39336i.neutral15) && C17919x.m51542d(this.patrioticBlue, c39336i.patrioticBlue) && C17919x.m51542d(this.patrioticRed, c39336i.patrioticRed) && C17919x.m51542d(this.platinum, c39336i.platinum) && C17919x.m51542d(this.recovery, c39336i.recovery) && C17919x.m51542d(this.recovery10, c39336i.recovery10) && C17919x.m51542d(this.recoveryHighRecovery, c39336i.recoveryHighRecovery) && C17919x.m51542d(this.recoveryHighRecovery10, c39336i.recoveryHighRecovery10) && C17919x.m51542d(this.recoveryLowRecovery, c39336i.recoveryLowRecovery) && C17919x.m51542d(this.recoveryMediumRecovery, c39336i.recoveryMediumRecovery) && C17919x.m51542d(this.secondaryText, c39336i.secondaryText) && C17919x.m51542d(this.silver, c39336i.silver) && C17919x.m51542d(this.sleep, c39336i.sleep) && C17919x.m51542d(this.sleepAwake, c39336i.sleepAwake) && C17919x.m51542d(this.sleepDeepSleep, c39336i.sleepDeepSleep) && C17919x.m51542d(this.sleepLightSleep, c39336i.sleepLightSleep) && C17919x.m51542d(this.sleepRemSleep, c39336i.sleepRemSleep) && C17919x.m51542d(this.strain, c39336i.strain) && C17919x.m51542d(this.strainZone1, c39336i.strainZone1) && C17919x.m51542d(this.strainZone2, c39336i.strainZone2) && C17919x.m51542d(this.strainZone3, c39336i.strainZone3) && C17919x.m51542d(this.strainZone4, c39336i.strainZone4) && C17919x.m51542d(this.strainZone5, c39336i.strainZone5) && C17919x.m51542d(this.sufficientTrend, c39336i.sufficientTrend) && C17919x.m51542d(this.sufficientTrend15, c39336i.sufficientTrend15) && C17919x.m51542d(this.surfaceMciBirthControl, c39336i.surfaceMciBirthControl) && C17919x.m51542d(this.surfaceMciBirthControlDim, c39336i.surfaceMciBirthControlDim) && C17919x.m51542d(this.surfaceMciFollicular, c39336i.surfaceMciFollicular) && C17919x.m51542d(this.surfaceMciFollicularDim, c39336i.surfaceMciFollicularDim) && C17919x.m51542d(this.surfaceMciLuteal, c39336i.surfaceMciLuteal) && C17919x.m51542d(this.surfaceMciLutealDim, c39336i.surfaceMciLutealDim) && C17919x.m51542d(this.surfaceMciMenstrual, c39336i.surfaceMciMenstrual) && C17919x.m51542d(this.surfaceMciMenstrualDim, c39336i.surfaceMciMenstrualDim) && C17919x.m51542d(this.surfaceMciOvulatory, c39336i.surfaceMciOvulatory) && C17919x.m51542d(this.surfaceMciOvulatoryDim, c39336i.surfaceMciOvulatoryDim) && C17919x.m51542d(this.surfacePregnancyTrimester1, c39336i.surfacePregnancyTrimester1) && C17919x.m51542d(this.surfacePregnancyTrimester1Dim, c39336i.surfacePregnancyTrimester1Dim) && C17919x.m51542d(this.surfacePregnancyTrimester2, c39336i.surfacePregnancyTrimester2) && C17919x.m51542d(this.surfacePregnancyTrimester2Dim, c39336i.surfacePregnancyTrimester2Dim) && C17919x.m51542d(this.surfacePregnancyTrimester3, c39336i.surfacePregnancyTrimester3) && C17919x.m51542d(this.surfacePregnancyTrimester3Dim, c39336i.surfacePregnancyTrimester3Dim) && C17919x.m51542d(this.surfacePregnancyTrimester4, c39336i.surfacePregnancyTrimester4) && C17919x.m51542d(this.surfacePregnancyTrimester4Dim, c39336i.surfacePregnancyTrimester4Dim) && C17919x.m51542d(this.surfaceSecondaryGrey, c39336i.surfaceSecondaryGrey) && C17919x.m51542d(this.textBaseSecondary, c39336i.textBaseSecondary) && C17919x.m51542d(this.textMciBirthControl, c39336i.textMciBirthControl) && C17919x.m51542d(this.textMciFollicular, c39336i.textMciFollicular) && C17919x.m51542d(this.textMciLuteal, c39336i.textMciLuteal) && C17919x.m51542d(this.textMciMenstrual, c39336i.textMciMenstrual) && C17919x.m51542d(this.textMciOvulatory, c39336i.textMciOvulatory) && C17919x.m51542d(this.textPregnancyTrimester1, c39336i.textPregnancyTrimester1) && C17919x.m51542d(this.textPregnancyTrimester2, c39336i.textPregnancyTrimester2) && C17919x.m51542d(this.textPregnancyTrimester3, c39336i.textPregnancyTrimester3) && C17919x.m51542d(this.textPregnancyTrimester4, c39336i.textPregnancyTrimester4) && C17919x.m51542d(this.transparent, c39336i.transparent) && C17919x.m51542d(this.white10, c39336i.white10) && C17919x.m51542d(this.white20, c39336i.white20) && C17919x.m51542d(this.white30, c39336i.white30) && C17919x.m51542d(this.white40, c39336i.white40) && C17919x.m51542d(this.white5, c39336i.white5) && C17919x.m51542d(this.white50, c39336i.white50) && C17919x.m51542d(this.white70, c39336i.white70) && C17919x.m51542d(this.white90, c39336i.white90) && C17919x.m51542d(this.withingsPlan, c39336i.withingsPlan) && AbstractC22676k.m65745e(this.descriptions, c39336i.descriptions);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getAccentNegativeTrend() {
        return this.accentNegativeTrend;
    }

    /* JADX INFO: renamed from: f0, reason: from getter */
    public final long getSleep() {
        return this.sleep;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getAccentNegativeTrend15() {
        return this.accentNegativeTrend15;
    }

    /* JADX INFO: renamed from: g0, reason: from getter */
    public final long getSleepAwake() {
        return this.sleepAwake;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getAccentNote() {
        return this.accentNote;
    }

    /* JADX INFO: renamed from: h0, reason: from getter */
    public final long getSleepDeepSleep() {
        return this.sleepDeepSleep;
    }

    public int hashCode() {
        long j7 = this.accentAction;
        int i13 = C17919x.f69638o;
        return this.descriptions.hashCode() + AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(Long.hashCode(j7) * 31, this.accentAlert, 31), this.accentAlertTrend15, 31), this.accentFocus, 31), this.accentFocus15, 31), this.accentNegativeTrend, 31), this.accentNegativeTrend15, 31), this.accentNote, 31), this.accentOnboardingAction, 31), this.accentPositiveTrend, 31), this.accentPositiveTrend15, 31), this.america250Blue, 31), this.america250Red, 31), this.backgroundDarkAlt, 31), this.backgroundDarkStd, 31), this.black10, 31), this.black20, 31), this.black30, 31), this.black5, 31), this.black50, 31), this.black70, 31), this.black90, 31), this.brandBlack, 31), this.brandPrimary, 31), this.brandWhite, 31), this.brandWhoopPro, 31), this.bronze, 31), this.challengeGaugeInactive, 31), this.coachBlue, 31), this.gold, 31), this.greyL1, 31), this.greyL2, 31), this.greyL3, 31), this.greyL4, 31), this.greyL5, 31), this.greyL6, 31), this.greyL7, 31), this.greyL8, 31), this.healthCalibrating, 31), this.healthNeutral, 31), this.healthOld, 31), this.healthYoung, 31), this.mciRed, 31), this.mciRed50, 31), this.neutral15, 31), this.patrioticBlue, 31), this.patrioticRed, 31), this.platinum, 31), this.recovery, 31), this.recovery10, 31), this.recoveryHighRecovery, 31), this.recoveryHighRecovery10, 31), this.recoveryLowRecovery, 31), this.recoveryMediumRecovery, 31), this.secondaryText, 31), this.silver, 31), this.sleep, 31), this.sleepAwake, 31), this.sleepDeepSleep, 31), this.sleepLightSleep, 31), this.sleepRemSleep, 31), this.strain, 31), this.strainZone1, 31), this.strainZone2, 31), this.strainZone3, 31), this.strainZone4, 31), this.strainZone5, 31), this.sufficientTrend, 31), this.sufficientTrend15, 31), this.surfaceMciBirthControl, 31), this.surfaceMciBirthControlDim, 31), this.surfaceMciFollicular, 31), this.surfaceMciFollicularDim, 31), this.surfaceMciLuteal, 31), this.surfaceMciLutealDim, 31), this.surfaceMciMenstrual, 31), this.surfaceMciMenstrualDim, 31), this.surfaceMciOvulatory, 31), this.surfaceMciOvulatoryDim, 31), this.surfacePregnancyTrimester1, 31), this.surfacePregnancyTrimester1Dim, 31), this.surfacePregnancyTrimester2, 31), this.surfacePregnancyTrimester2Dim, 31), this.surfacePregnancyTrimester3, 31), this.surfacePregnancyTrimester3Dim, 31), this.surfacePregnancyTrimester4, 31), this.surfacePregnancyTrimester4Dim, 31), this.surfaceSecondaryGrey, 31), this.textBaseSecondary, 31), this.textMciBirthControl, 31), this.textMciFollicular, 31), this.textMciLuteal, 31), this.textMciMenstrual, 31), this.textMciOvulatory, 31), this.textPregnancyTrimester1, 31), this.textPregnancyTrimester2, 31), this.textPregnancyTrimester3, 31), this.textPregnancyTrimester4, 31), this.transparent, 31), this.white10, 31), this.white20, 31), this.white30, 31), this.white40, 31), this.white5, 31), this.white50, 31), this.white70, 31), this.white90, 31), this.withingsPlan, 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getAccentOnboardingAction() {
        return this.accentOnboardingAction;
    }

    /* JADX INFO: renamed from: i0, reason: from getter */
    public final long getSleepLightSleep() {
        return this.sleepLightSleep;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getAccentPositiveTrend() {
        return this.accentPositiveTrend;
    }

    /* JADX INFO: renamed from: j0, reason: from getter */
    public final long getSleepRemSleep() {
        return this.sleepRemSleep;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getAccentPositiveTrend15() {
        return this.accentPositiveTrend15;
    }

    /* JADX INFO: renamed from: k0, reason: from getter */
    public final long getStrain() {
        return this.strain;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getAmerica250Blue() {
        return this.america250Blue;
    }

    /* JADX INFO: renamed from: l0, reason: from getter */
    public final long getStrainZone1() {
        return this.strainZone1;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final long getAmerica250Red() {
        return this.america250Red;
    }

    /* JADX INFO: renamed from: m0, reason: from getter */
    public final long getStrainZone2() {
        return this.strainZone2;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final long getBackgroundDarkAlt() {
        return this.backgroundDarkAlt;
    }

    /* JADX INFO: renamed from: n0, reason: from getter */
    public final long getStrainZone3() {
        return this.strainZone3;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final long getBackgroundDarkStd() {
        return this.backgroundDarkStd;
    }

    /* JADX INFO: renamed from: o0, reason: from getter */
    public final long getStrainZone4() {
        return this.strainZone4;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final long getBlack10() {
        return this.black10;
    }

    /* JADX INFO: renamed from: p0, reason: from getter */
    public final long getStrainZone5() {
        return this.strainZone5;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final long getBlack20() {
        return this.black20;
    }

    /* JADX INFO: renamed from: q0, reason: from getter */
    public final long getSufficientTrend() {
        return this.sufficientTrend;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final long getBlack30() {
        return this.black30;
    }

    /* JADX INFO: renamed from: r0, reason: from getter */
    public final long getSufficientTrend15() {
        return this.sufficientTrend15;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final long getBlack5() {
        return this.black5;
    }

    /* JADX INFO: renamed from: s0, reason: from getter */
    public final long getSurfaceMciBirthControl() {
        return this.surfaceMciBirthControl;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final long getBlack50() {
        return this.black50;
    }

    /* JADX INFO: renamed from: t0, reason: from getter */
    public final long getSurfaceMciBirthControlDim() {
        return this.surfaceMciBirthControlDim;
    }

    public String toString() {
        String strM51548j = C17919x.m51548j(this.accentAction);
        String strM51548j2 = C17919x.m51548j(this.accentAlert);
        String strM51548j3 = C17919x.m51548j(this.accentAlertTrend15);
        String strM51548j4 = C17919x.m51548j(this.accentFocus);
        String strM51548j5 = C17919x.m51548j(this.accentFocus15);
        String strM51548j6 = C17919x.m51548j(this.accentNegativeTrend);
        String strM51548j7 = C17919x.m51548j(this.accentNegativeTrend15);
        String strM51548j8 = C17919x.m51548j(this.accentNote);
        String strM51548j9 = C17919x.m51548j(this.accentOnboardingAction);
        String strM51548j10 = C17919x.m51548j(this.accentPositiveTrend);
        String strM51548j11 = C17919x.m51548j(this.accentPositiveTrend15);
        String strM51548j12 = C17919x.m51548j(this.america250Blue);
        String strM51548j13 = C17919x.m51548j(this.america250Red);
        String strM51548j14 = C17919x.m51548j(this.backgroundDarkAlt);
        String strM51548j15 = C17919x.m51548j(this.backgroundDarkStd);
        String strM51548j16 = C17919x.m51548j(this.black10);
        String strM51548j17 = C17919x.m51548j(this.black20);
        String strM51548j18 = C17919x.m51548j(this.black30);
        String strM51548j19 = C17919x.m51548j(this.black5);
        String strM51548j20 = C17919x.m51548j(this.black50);
        String strM51548j21 = C17919x.m51548j(this.black70);
        String strM51548j22 = C17919x.m51548j(this.black90);
        String strM51548j23 = C17919x.m51548j(this.brandBlack);
        String strM51548j24 = C17919x.m51548j(this.brandPrimary);
        String strM51548j25 = C17919x.m51548j(this.brandWhite);
        String strM51548j26 = C17919x.m51548j(this.brandWhoopPro);
        String strM51548j27 = C17919x.m51548j(this.bronze);
        String strM51548j28 = C17919x.m51548j(this.challengeGaugeInactive);
        String strM51548j29 = C17919x.m51548j(this.coachBlue);
        String strM51548j30 = C17919x.m51548j(this.gold);
        String strM51548j31 = C17919x.m51548j(this.greyL1);
        String strM51548j32 = C17919x.m51548j(this.greyL2);
        String strM51548j33 = C17919x.m51548j(this.greyL3);
        String strM51548j34 = C17919x.m51548j(this.greyL4);
        String strM51548j35 = C17919x.m51548j(this.greyL5);
        String strM51548j36 = C17919x.m51548j(this.greyL6);
        String strM51548j37 = C17919x.m51548j(this.greyL7);
        String strM51548j38 = C17919x.m51548j(this.greyL8);
        String strM51548j39 = C17919x.m51548j(this.healthCalibrating);
        String strM51548j40 = C17919x.m51548j(this.healthNeutral);
        String strM51548j41 = C17919x.m51548j(this.healthOld);
        String strM51548j42 = C17919x.m51548j(this.healthYoung);
        String strM51548j43 = C17919x.m51548j(this.mciRed);
        String strM51548j44 = C17919x.m51548j(this.mciRed50);
        String strM51548j45 = C17919x.m51548j(this.neutral15);
        String strM51548j46 = C17919x.m51548j(this.patrioticBlue);
        String strM51548j47 = C17919x.m51548j(this.patrioticRed);
        String strM51548j48 = C17919x.m51548j(this.platinum);
        String strM51548j49 = C17919x.m51548j(this.recovery);
        String strM51548j50 = C17919x.m51548j(this.recovery10);
        String strM51548j51 = C17919x.m51548j(this.recoveryHighRecovery);
        String strM51548j52 = C17919x.m51548j(this.recoveryHighRecovery10);
        String strM51548j53 = C17919x.m51548j(this.recoveryLowRecovery);
        String strM51548j54 = C17919x.m51548j(this.recoveryMediumRecovery);
        String strM51548j55 = C17919x.m51548j(this.secondaryText);
        String strM51548j56 = C17919x.m51548j(this.silver);
        String strM51548j57 = C17919x.m51548j(this.sleep);
        String strM51548j58 = C17919x.m51548j(this.sleepAwake);
        String strM51548j59 = C17919x.m51548j(this.sleepDeepSleep);
        String strM51548j60 = C17919x.m51548j(this.sleepLightSleep);
        String strM51548j61 = C17919x.m51548j(this.sleepRemSleep);
        String strM51548j62 = C17919x.m51548j(this.strain);
        String strM51548j63 = C17919x.m51548j(this.strainZone1);
        String strM51548j64 = C17919x.m51548j(this.strainZone2);
        String strM51548j65 = C17919x.m51548j(this.strainZone3);
        String strM51548j66 = C17919x.m51548j(this.strainZone4);
        String strM51548j67 = C17919x.m51548j(this.strainZone5);
        String strM51548j68 = C17919x.m51548j(this.sufficientTrend);
        String strM51548j69 = C17919x.m51548j(this.sufficientTrend15);
        String strM51548j70 = C17919x.m51548j(this.surfaceMciBirthControl);
        String strM51548j71 = C17919x.m51548j(this.surfaceMciBirthControlDim);
        String strM51548j72 = C17919x.m51548j(this.surfaceMciFollicular);
        String strM51548j73 = C17919x.m51548j(this.surfaceMciFollicularDim);
        String strM51548j74 = C17919x.m51548j(this.surfaceMciLuteal);
        String strM51548j75 = C17919x.m51548j(this.surfaceMciLutealDim);
        String strM51548j76 = C17919x.m51548j(this.surfaceMciMenstrual);
        String strM51548j77 = C17919x.m51548j(this.surfaceMciMenstrualDim);
        String strM51548j78 = C17919x.m51548j(this.surfaceMciOvulatory);
        String strM51548j79 = C17919x.m51548j(this.surfaceMciOvulatoryDim);
        String strM51548j80 = C17919x.m51548j(this.surfacePregnancyTrimester1);
        String strM51548j81 = C17919x.m51548j(this.surfacePregnancyTrimester1Dim);
        String strM51548j82 = C17919x.m51548j(this.surfacePregnancyTrimester2);
        String strM51548j83 = C17919x.m51548j(this.surfacePregnancyTrimester2Dim);
        String strM51548j84 = C17919x.m51548j(this.surfacePregnancyTrimester3);
        String strM51548j85 = C17919x.m51548j(this.surfacePregnancyTrimester3Dim);
        String strM51548j86 = C17919x.m51548j(this.surfacePregnancyTrimester4);
        String strM51548j87 = C17919x.m51548j(this.surfacePregnancyTrimester4Dim);
        String strM51548j88 = C17919x.m51548j(this.surfaceSecondaryGrey);
        String strM51548j89 = C17919x.m51548j(this.textBaseSecondary);
        String strM51548j90 = C17919x.m51548j(this.textMciBirthControl);
        String strM51548j91 = C17919x.m51548j(this.textMciFollicular);
        String strM51548j92 = C17919x.m51548j(this.textMciLuteal);
        String strM51548j93 = C17919x.m51548j(this.textMciMenstrual);
        String strM51548j94 = C17919x.m51548j(this.textMciOvulatory);
        String strM51548j95 = C17919x.m51548j(this.textPregnancyTrimester1);
        String strM51548j96 = C17919x.m51548j(this.textPregnancyTrimester2);
        String strM51548j97 = C17919x.m51548j(this.textPregnancyTrimester3);
        String strM51548j98 = C17919x.m51548j(this.textPregnancyTrimester4);
        String strM51548j99 = C17919x.m51548j(this.transparent);
        String strM51548j100 = C17919x.m51548j(this.white10);
        String strM51548j101 = C17919x.m51548j(this.white20);
        String strM51548j102 = C17919x.m51548j(this.white30);
        String strM51548j103 = C17919x.m51548j(this.white40);
        String strM51548j104 = C17919x.m51548j(this.white5);
        String strM51548j105 = C17919x.m51548j(this.white50);
        String strM51548j106 = C17919x.m51548j(this.white70);
        String strM51548j107 = C17919x.m51548j(this.white90);
        String strM51548j108 = C17919x.m51548j(this.withingsPlan);
        List<C22396h<C17919x>> list = this.descriptions;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("WhoopColors(accentAction=", strM51548j, ", accentAlert=", strM51548j2, ", accentAlertTrend15=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j3, ", accentFocus=", strM51548j4, ", accentFocus15=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j5, ", accentNegativeTrend=", strM51548j6, ", accentNegativeTrend15=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j7, ", accentNote=", strM51548j8, ", accentOnboardingAction=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j9, ", accentPositiveTrend=", strM51548j10, ", accentPositiveTrend15=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j11, ", america250Blue=", strM51548j12, ", america250Red=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j13, ", backgroundDarkAlt=", strM51548j14, ", backgroundDarkStd=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j15, ", black10=", strM51548j16, ", black20=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j17, ", black30=", strM51548j18, ", black5=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j19, ", black50=", strM51548j20, ", black70=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j21, ", black90=", strM51548j22, ", brandBlack=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j23, ", brandPrimary=", strM51548j24, ", brandWhite=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j25, ", brandWhoopPro=", strM51548j26, ", bronze=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j27, ", challengeGaugeInactive=", strM51548j28, ", coachBlue=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j29, ", gold=", strM51548j30, ", greyL1=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j31, ", greyL2=", strM51548j32, ", greyL3=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j33, ", greyL4=", strM51548j34, ", greyL5=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j35, ", greyL6=", strM51548j36, ", greyL7=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j37, ", greyL8=", strM51548j38, ", healthCalibrating=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j39, ", healthNeutral=", strM51548j40, ", healthOld=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j41, ", healthYoung=", strM51548j42, ", mciRed=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j43, ", mciRed50=", strM51548j44, ", neutral15=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j45, ", patrioticBlue=", strM51548j46, ", patrioticRed=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j47, ", platinum=", strM51548j48, ", recovery=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j49, ", recovery10=", strM51548j50, ", recoveryHighRecovery=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j51, ", recoveryHighRecovery10=", strM51548j52, ", recoveryLowRecovery=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j53, ", recoveryMediumRecovery=", strM51548j54, ", secondaryText=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j55, ", silver=", strM51548j56, ", sleep=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j57, ", sleepAwake=", strM51548j58, ", sleepDeepSleep=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j59, ", sleepLightSleep=", strM51548j60, ", sleepRemSleep=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j61, ", strain=", strM51548j62, ", strainZone1=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j63, ", strainZone2=", strM51548j64, ", strainZone3=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j65, ", strainZone4=", strM51548j66, ", strainZone5=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j67, ", sufficientTrend=", strM51548j68, ", sufficientTrend15=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j69, ", surfaceMciBirthControl=", strM51548j70, ", surfaceMciBirthControlDim=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j71, ", surfaceMciFollicular=", strM51548j72, ", surfaceMciFollicularDim=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j73, ", surfaceMciLuteal=", strM51548j74, ", surfaceMciLutealDim=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j75, ", surfaceMciMenstrual=", strM51548j76, ", surfaceMciMenstrualDim=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j77, ", surfaceMciOvulatory=", strM51548j78, ", surfaceMciOvulatoryDim=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j79, ", surfacePregnancyTrimester1=", strM51548j80, ", surfacePregnancyTrimester1Dim=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j81, ", surfacePregnancyTrimester2=", strM51548j82, ", surfacePregnancyTrimester2Dim=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j83, ", surfacePregnancyTrimester3=", strM51548j84, ", surfacePregnancyTrimester3Dim=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j85, ", surfacePregnancyTrimester4=", strM51548j86, ", surfacePregnancyTrimester4Dim=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j87, ", surfaceSecondaryGrey=", strM51548j88, ", textBaseSecondary=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j89, ", textMciBirthControl=", strM51548j90, ", textMciFollicular=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j91, ", textMciLuteal=", strM51548j92, ", textMciMenstrual=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j93, ", textMciOvulatory=", strM51548j94, ", textPregnancyTrimester1=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j95, ", textPregnancyTrimester2=", strM51548j96, ", textPregnancyTrimester3=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j97, ", textPregnancyTrimester4=", strM51548j98, ", transparent=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j99, ", white10=", strM51548j100, ", white20=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j101, ", white30=", strM51548j102, ", white40=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j103, ", white5=", strM51548j104, ", white50=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j105, ", white70=", strM51548j106, ", white90=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j107, ", withingsPlan=", strM51548j108, ", descriptions=");
        return AbstractC3855a.m11829m(sbM32001t, list, ")");
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final long getBlack70() {
        return this.black70;
    }

    /* JADX INFO: renamed from: u0, reason: from getter */
    public final long getSurfaceMciFollicular() {
        return this.surfaceMciFollicular;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final long getBlack90() {
        return this.black90;
    }

    /* JADX INFO: renamed from: v0, reason: from getter */
    public final long getSurfaceMciFollicularDim() {
        return this.surfaceMciFollicularDim;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final long getBrandBlack() {
        return this.brandBlack;
    }

    /* JADX INFO: renamed from: w0, reason: from getter */
    public final long getSurfaceMciLuteal() {
        return this.surfaceMciLuteal;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final long getBrandPrimary() {
        return this.brandPrimary;
    }

    /* JADX INFO: renamed from: x0, reason: from getter */
    public final long getSurfaceMciLutealDim() {
        return this.surfaceMciLutealDim;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final long getBrandWhite() {
        return this.brandWhite;
    }

    /* JADX INFO: renamed from: y0, reason: from getter */
    public final long getSurfaceMciMenstrual() {
        return this.surfaceMciMenstrual;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final long getBrandWhoopPro() {
        return this.brandWhoopPro;
    }

    /* JADX INFO: renamed from: z0, reason: from getter */
    public final long getSurfaceMciMenstrualDim() {
        return this.surfaceMciMenstrualDim;
    }

    private C39336i(long j7, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j24, long j25, long j26, long j27, long j28, long j29, long j34, long j35, long j36, long j37, long j38, long j39, long j44, long j45, long j46, long j47, long j48, long j49, long j54, long j55, long j56, long j57, long j58, long j59, long j64, long j65, long j66, long j67, long j68, long j69, long j73, long j74, long j75, long j76, long j77, long j78, long j79, long j82, long j83, long j84, long j85, long j86, long j87, long j88, long j89, long j94, long j95, long j96, long j97, long j98, long j99, long j100, long j101, long j102, long j103, long j104, long j105, long j106, long j107, long j108, long j109, long j110, long j111, long j112, long j113, long j114, long j115, long j116, long j117, long j118, long j119, long j120, long j121, long j122, long j123, long j124, long j125, long j126, long j127, long j128, long j129, long j130, long j131, long j132, long j133, long j134, long j135, long j136, long j137, long j138, long j139, long j140, long j141, long j142, long j143, long j144, long j145, long j146, long j147, long j148, List<C22396h<C17919x>> descriptions) {
        AbstractC22676k.m65750j(descriptions, "descriptions");
        this.accentAction = j7;
        this.accentAlert = j13;
        this.accentAlertTrend15 = j14;
        this.accentFocus = j15;
        this.accentFocus15 = j16;
        this.accentNegativeTrend = j17;
        this.accentNegativeTrend15 = j18;
        this.accentNote = j19;
        this.accentOnboardingAction = j24;
        this.accentPositiveTrend = j25;
        this.accentPositiveTrend15 = j26;
        this.america250Blue = j27;
        this.america250Red = j28;
        this.backgroundDarkAlt = j29;
        this.backgroundDarkStd = j34;
        this.black10 = j35;
        this.black20 = j36;
        this.black30 = j37;
        this.black5 = j38;
        this.black50 = j39;
        this.black70 = j44;
        this.black90 = j45;
        this.brandBlack = j46;
        this.brandPrimary = j47;
        this.brandWhite = j48;
        this.brandWhoopPro = j49;
        this.bronze = j54;
        this.challengeGaugeInactive = j55;
        this.coachBlue = j56;
        this.gold = j57;
        this.greyL1 = j58;
        this.greyL2 = j59;
        this.greyL3 = j64;
        this.greyL4 = j65;
        this.greyL5 = j66;
        this.greyL6 = j67;
        this.greyL7 = j68;
        this.greyL8 = j69;
        this.healthCalibrating = j73;
        this.healthNeutral = j74;
        this.healthOld = j75;
        this.healthYoung = j76;
        this.mciRed = j77;
        this.mciRed50 = j78;
        this.neutral15 = j79;
        this.patrioticBlue = j82;
        this.patrioticRed = j83;
        this.platinum = j84;
        this.recovery = j85;
        this.recovery10 = j86;
        this.recoveryHighRecovery = j87;
        this.recoveryHighRecovery10 = j88;
        this.recoveryLowRecovery = j89;
        this.recoveryMediumRecovery = j94;
        this.secondaryText = j95;
        this.silver = j96;
        this.sleep = j97;
        this.sleepAwake = j98;
        this.sleepDeepSleep = j99;
        this.sleepLightSleep = j100;
        this.sleepRemSleep = j101;
        this.strain = j102;
        this.strainZone1 = j103;
        this.strainZone2 = j104;
        this.strainZone3 = j105;
        this.strainZone4 = j106;
        this.strainZone5 = j107;
        this.sufficientTrend = j108;
        this.sufficientTrend15 = j109;
        this.surfaceMciBirthControl = j110;
        this.surfaceMciBirthControlDim = j111;
        this.surfaceMciFollicular = j112;
        this.surfaceMciFollicularDim = j113;
        this.surfaceMciLuteal = j114;
        this.surfaceMciLutealDim = j115;
        this.surfaceMciMenstrual = j116;
        this.surfaceMciMenstrualDim = j117;
        this.surfaceMciOvulatory = j118;
        this.surfaceMciOvulatoryDim = j119;
        this.surfacePregnancyTrimester1 = j120;
        this.surfacePregnancyTrimester1Dim = j121;
        this.surfacePregnancyTrimester2 = j122;
        this.surfacePregnancyTrimester2Dim = j123;
        this.surfacePregnancyTrimester3 = j124;
        this.surfacePregnancyTrimester3Dim = j125;
        this.surfacePregnancyTrimester4 = j126;
        this.surfacePregnancyTrimester4Dim = j127;
        this.surfaceSecondaryGrey = j128;
        this.textBaseSecondary = j129;
        this.textMciBirthControl = j130;
        this.textMciFollicular = j131;
        this.textMciLuteal = j132;
        this.textMciMenstrual = j133;
        this.textMciOvulatory = j134;
        this.textPregnancyTrimester1 = j135;
        this.textPregnancyTrimester2 = j136;
        this.textPregnancyTrimester3 = j137;
        this.textPregnancyTrimester4 = j138;
        this.transparent = j139;
        this.white10 = j140;
        this.white20 = j141;
        this.white30 = j142;
        this.white40 = j143;
        this.white5 = j144;
        this.white50 = j145;
        this.white70 = j146;
        this.white90 = j147;
        this.withingsPlan = j148;
        this.descriptions = descriptions;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C39336i(long j7, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j24, long j25, long j26, long j27, long j28, long j29, long j34, long j35, long j36, long j37, long j38, long j39, long j44, long j45, long j46, long j47, long j48, long j49, long j54, long j55, long j56, long j57, long j58, long j59, long j64, long j65, long j66, long j67, long j68, long j69, long j73, long j74, long j75, long j76, long j77, long j78, long j79, long j82, long j83, long j84, long j85, long j86, long j87, long j88, long j89, long j94, long j95, long j96, long j97, long j98, long j99, long j100, long j101, long j102, long j103, long j104, long j105, long j106, long j107, long j108, long j109, long j110, long j111, long j112, long j113, long j114, long j115, long j116, long j117, long j118, long j119, long j120, long j121, long j122, long j123, long j124, long j125, long j126, long j127, long j128, long j129, long j130, long j131, long j132, long j133, long j134, long j135, long j136, long j137, long j138, long j139, long j140, long j141, long j142, long j143, long j144, long j145, long j146, long j147, long j148, List list, int i13, int i14, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        long j149;
        long j150;
        long j151;
        long j152;
        long j153;
        long j154;
        long j155;
        long j156;
        long j157;
        long j158;
        long j159;
        long j160;
        long j161;
        long j162;
        long j163;
        long j164;
        long j165;
        long j166;
        long j167;
        long j168;
        long j169;
        long j170;
        long j171;
        long j172;
        long j173;
        long j174;
        long j175;
        long j176;
        long j177;
        long j178;
        long j179;
        long j180;
        long j181;
        long j182;
        long j183;
        long j184;
        long j185;
        long j186;
        long j187;
        long j188;
        long j189;
        long j190;
        long j191;
        long j192;
        long j193;
        long j194;
        long j195;
        long j196;
        long j197;
        long j198;
        long j199;
        long j200;
        long j201;
        long j202;
        long j203;
        long j204;
        long j205;
        long j206;
        long j207;
        long j208;
        long j209;
        long j210;
        long j211;
        long j212;
        long j213;
        long j214;
        long j215;
        long j216;
        long j217;
        long j218;
        long j219;
        long j220;
        long j221;
        long j222;
        long j223;
        long j224;
        long j225;
        long j226;
        long j227;
        long j228;
        long j229;
        long j230;
        long j231;
        long j232;
        long j233;
        long j234;
        long j235;
        long j236;
        long j237;
        long j238;
        long j239;
        long j240;
        long j241;
        long j242;
        long j243;
        long j244;
        long j245;
        long j246;
        long j247;
        long j248;
        long j249;
        long j250;
        long j251;
        long j252;
        long j253;
        long j254;
        long j255;
        long j256;
        if ((i13 & 1) != 0) {
            int i17 = C17919x.f69638o;
            j149 = C17919x.f69637n;
        } else {
            j149 = j7;
        }
        if ((i13 & 2) != 0) {
            int i18 = C17919x.f69638o;
            j150 = C17919x.f69637n;
        } else {
            j150 = j13;
        }
        if ((i13 & 4) != 0) {
            int i19 = C17919x.f69638o;
            j151 = C17919x.f69637n;
        } else {
            j151 = j14;
        }
        if ((i13 & 8) != 0) {
            int i24 = C17919x.f69638o;
            j152 = C17919x.f69637n;
        } else {
            j152 = j15;
        }
        if ((i13 & 16) != 0) {
            int i25 = C17919x.f69638o;
            j153 = C17919x.f69637n;
        } else {
            j153 = j16;
        }
        if ((i13 & 32) != 0) {
            int i26 = C17919x.f69638o;
            j154 = C17919x.f69637n;
        } else {
            j154 = j17;
        }
        if ((i13 & 64) != 0) {
            int i27 = C17919x.f69638o;
            j155 = C17919x.f69637n;
        } else {
            j155 = j18;
        }
        long j257 = j149;
        if ((i13 & 128) != 0) {
            int i28 = C17919x.f69638o;
            j156 = C17919x.f69637n;
        } else {
            j156 = j19;
        }
        long j258 = j156;
        if ((i13 & 256) != 0) {
            int i29 = C17919x.f69638o;
            j157 = C17919x.f69637n;
        } else {
            j157 = j24;
        }
        long j259 = j157;
        if ((i13 & 512) != 0) {
            int i34 = C17919x.f69638o;
            j158 = C17919x.f69637n;
        } else {
            j158 = j25;
        }
        long j260 = j158;
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            int i35 = C17919x.f69638o;
            j159 = C17919x.f69637n;
        } else {
            j159 = j26;
        }
        long j261 = j159;
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            int i36 = C17919x.f69638o;
            j160 = C17919x.f69637n;
        } else {
            j160 = j27;
        }
        long j262 = j160;
        if ((i13 & 4096) != 0) {
            int i37 = C17919x.f69638o;
            j161 = C17919x.f69637n;
        } else {
            j161 = j28;
        }
        long j263 = j161;
        if ((i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
            int i38 = C17919x.f69638o;
            j162 = C17919x.f69637n;
        } else {
            j162 = j29;
        }
        long j264 = j162;
        if ((i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0) {
            int i39 = C17919x.f69638o;
            j163 = C17919x.f69637n;
        } else {
            j163 = j34;
        }
        if ((i13 & 32768) != 0) {
            int i44 = C17919x.f69638o;
            j164 = C17919x.f69637n;
        } else {
            j164 = j35;
        }
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0) {
            int i45 = C17919x.f69638o;
            j165 = C17919x.f69637n;
        } else {
            j165 = j36;
        }
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0) {
            int i46 = C17919x.f69638o;
            j166 = C17919x.f69637n;
        } else {
            j166 = j37;
        }
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
            int i47 = C17919x.f69638o;
            j167 = C17919x.f69637n;
        } else {
            j167 = j38;
        }
        if ((i13 & 524288) != 0) {
            int i48 = C17919x.f69638o;
            j168 = C17919x.f69637n;
        } else {
            j168 = j39;
        }
        if ((i13 & 1048576) != 0) {
            int i49 = C17919x.f69638o;
            j169 = C17919x.f69637n;
        } else {
            j169 = j44;
        }
        if ((i13 & 2097152) != 0) {
            int i54 = C17919x.f69638o;
            j170 = C17919x.f69637n;
        } else {
            j170 = j45;
        }
        if ((i13 & 4194304) != 0) {
            int i55 = C17919x.f69638o;
            j171 = C17919x.f69637n;
        } else {
            j171 = j46;
        }
        if ((i13 & 8388608) != 0) {
            int i56 = C17919x.f69638o;
            j172 = C17919x.f69637n;
        } else {
            j172 = j47;
        }
        if ((i13 & 16777216) != 0) {
            int i57 = C17919x.f69638o;
            j173 = C17919x.f69637n;
        } else {
            j173 = j48;
        }
        if ((i13 & AndroidSDKConstants.FLAG_MUTABLE) != 0) {
            int i58 = C17919x.f69638o;
            j174 = C17919x.f69637n;
        } else {
            j174 = j49;
        }
        if ((i13 & 67108864) != 0) {
            int i59 = C17919x.f69638o;
            j175 = C17919x.f69637n;
        } else {
            j175 = j54;
        }
        if ((i13 & 134217728) != 0) {
            int i64 = C17919x.f69638o;
            j176 = C17919x.f69637n;
        } else {
            j176 = j55;
        }
        if ((i13 & 268435456) != 0) {
            int i65 = C17919x.f69638o;
            j177 = C17919x.f69637n;
        } else {
            j177 = j56;
        }
        if ((i13 & 536870912) != 0) {
            int i66 = C17919x.f69638o;
            j178 = C17919x.f69637n;
        } else {
            j178 = j57;
        }
        if ((i13 & 1073741824) != 0) {
            int i67 = C17919x.f69638o;
            j179 = C17919x.f69637n;
        } else {
            j179 = j58;
        }
        if ((i13 & Integer.MIN_VALUE) != 0) {
            int i68 = C17919x.f69638o;
            j180 = C17919x.f69637n;
        } else {
            j180 = j59;
        }
        if ((i14 & 1) != 0) {
            int i69 = C17919x.f69638o;
            j181 = C17919x.f69637n;
        } else {
            j181 = j64;
        }
        if ((i14 & 2) != 0) {
            int i74 = C17919x.f69638o;
            j182 = C17919x.f69637n;
        } else {
            j182 = j65;
        }
        if ((i14 & 4) != 0) {
            int i75 = C17919x.f69638o;
            j183 = C17919x.f69637n;
        } else {
            j183 = j66;
        }
        if ((i14 & 8) != 0) {
            int i76 = C17919x.f69638o;
            j184 = C17919x.f69637n;
        } else {
            j184 = j67;
        }
        if ((i14 & 16) != 0) {
            int i77 = C17919x.f69638o;
            j185 = C17919x.f69637n;
        } else {
            j185 = j68;
        }
        if ((i14 & 32) != 0) {
            int i78 = C17919x.f69638o;
            j186 = C17919x.f69637n;
        } else {
            j186 = j69;
        }
        if ((i14 & 64) != 0) {
            int i79 = C17919x.f69638o;
            j187 = C17919x.f69637n;
        } else {
            j187 = j73;
        }
        if ((i14 & 128) != 0) {
            int i83 = C17919x.f69638o;
            j188 = C17919x.f69637n;
        } else {
            j188 = j74;
        }
        if ((i14 & 256) != 0) {
            int i84 = C17919x.f69638o;
            j189 = C17919x.f69637n;
        } else {
            j189 = j75;
        }
        if ((i14 & 512) != 0) {
            int i85 = C17919x.f69638o;
            j190 = C17919x.f69637n;
        } else {
            j190 = j76;
        }
        if ((i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            int i86 = C17919x.f69638o;
            j191 = C17919x.f69637n;
        } else {
            j191 = j77;
        }
        if ((i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            int i87 = C17919x.f69638o;
            j192 = C17919x.f69637n;
        } else {
            j192 = j78;
        }
        if ((i14 & 4096) != 0) {
            int i88 = C17919x.f69638o;
            j193 = C17919x.f69637n;
        } else {
            j193 = j79;
        }
        if ((i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
            int i89 = C17919x.f69638o;
            j194 = C17919x.f69637n;
        } else {
            j194 = j82;
        }
        if ((i14 & DfuBaseService.ERROR_CONNECTION_MASK) != 0) {
            int i94 = C17919x.f69638o;
            j195 = C17919x.f69637n;
        } else {
            j195 = j83;
        }
        if ((i14 & 32768) != 0) {
            int i95 = C17919x.f69638o;
            j196 = C17919x.f69637n;
        } else {
            j196 = j84;
        }
        if ((i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0) {
            int i96 = C17919x.f69638o;
            j197 = C17919x.f69637n;
        } else {
            j197 = j85;
        }
        if ((i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0) {
            int i97 = C17919x.f69638o;
            j198 = C17919x.f69637n;
        } else {
            j198 = j86;
        }
        if ((i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
            int i98 = C17919x.f69638o;
            j199 = C17919x.f69637n;
        } else {
            j199 = j87;
        }
        if ((i14 & 524288) != 0) {
            int i99 = C17919x.f69638o;
            j200 = C17919x.f69637n;
        } else {
            j200 = j88;
        }
        if ((i14 & 1048576) != 0) {
            int i100 = C17919x.f69638o;
            j201 = C17919x.f69637n;
        } else {
            j201 = j89;
        }
        if ((i14 & 2097152) != 0) {
            int i101 = C17919x.f69638o;
            j202 = C17919x.f69637n;
        } else {
            j202 = j94;
        }
        if ((i14 & 4194304) != 0) {
            int i102 = C17919x.f69638o;
            j203 = C17919x.f69637n;
        } else {
            j203 = j95;
        }
        if ((i14 & 8388608) != 0) {
            int i103 = C17919x.f69638o;
            j204 = C17919x.f69637n;
        } else {
            j204 = j96;
        }
        if ((i14 & 16777216) != 0) {
            int i104 = C17919x.f69638o;
            j205 = C17919x.f69637n;
        } else {
            j205 = j97;
        }
        if ((i14 & AndroidSDKConstants.FLAG_MUTABLE) != 0) {
            int i105 = C17919x.f69638o;
            j206 = C17919x.f69637n;
        } else {
            j206 = j98;
        }
        if ((i14 & 67108864) != 0) {
            int i106 = C17919x.f69638o;
            j207 = C17919x.f69637n;
        } else {
            j207 = j99;
        }
        if ((i14 & 134217728) != 0) {
            int i107 = C17919x.f69638o;
            j208 = C17919x.f69637n;
        } else {
            j208 = j100;
        }
        if ((i14 & 268435456) != 0) {
            int i108 = C17919x.f69638o;
            j209 = C17919x.f69637n;
        } else {
            j209 = j101;
        }
        if ((i14 & 536870912) != 0) {
            int i109 = C17919x.f69638o;
            j210 = C17919x.f69637n;
        } else {
            j210 = j102;
        }
        if ((i14 & 1073741824) != 0) {
            int i110 = C17919x.f69638o;
            j211 = C17919x.f69637n;
        } else {
            j211 = j103;
        }
        if ((i14 & Integer.MIN_VALUE) != 0) {
            int i111 = C17919x.f69638o;
            j212 = C17919x.f69637n;
        } else {
            j212 = j104;
        }
        if ((i15 & 1) != 0) {
            int i112 = C17919x.f69638o;
            j213 = C17919x.f69637n;
        } else {
            j213 = j105;
        }
        if ((i15 & 2) != 0) {
            int i113 = C17919x.f69638o;
            j214 = C17919x.f69637n;
        } else {
            j214 = j106;
        }
        if ((i15 & 4) != 0) {
            int i114 = C17919x.f69638o;
            j215 = C17919x.f69637n;
        } else {
            j215 = j107;
        }
        if ((i15 & 8) != 0) {
            int i115 = C17919x.f69638o;
            j216 = C17919x.f69637n;
        } else {
            j216 = j108;
        }
        if ((i15 & 16) != 0) {
            int i116 = C17919x.f69638o;
            j217 = C17919x.f69637n;
        } else {
            j217 = j109;
        }
        if ((i15 & 32) != 0) {
            int i117 = C17919x.f69638o;
            j218 = C17919x.f69637n;
        } else {
            j218 = j110;
        }
        if ((i15 & 64) != 0) {
            int i118 = C17919x.f69638o;
            j219 = C17919x.f69637n;
        } else {
            j219 = j111;
        }
        long j265 = j212;
        if ((i15 & 128) != 0) {
            int i119 = C17919x.f69638o;
            j220 = C17919x.f69637n;
        } else {
            j220 = j112;
        }
        long j266 = j220;
        if ((i15 & 256) != 0) {
            int i120 = C17919x.f69638o;
            j221 = C17919x.f69637n;
        } else {
            j221 = j113;
        }
        long j267 = j221;
        if ((i15 & 512) != 0) {
            int i121 = C17919x.f69638o;
            j222 = C17919x.f69637n;
        } else {
            j222 = j114;
        }
        long j268 = j222;
        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            int i122 = C17919x.f69638o;
            j223 = C17919x.f69637n;
        } else {
            j223 = j115;
        }
        long j269 = j223;
        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            int i123 = C17919x.f69638o;
            j224 = C17919x.f69637n;
        } else {
            j224 = j116;
        }
        long j270 = j224;
        if ((i15 & 4096) != 0) {
            int i124 = C17919x.f69638o;
            j225 = C17919x.f69637n;
        } else {
            j225 = j117;
        }
        long j271 = j225;
        if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
            int i125 = C17919x.f69638o;
            j226 = C17919x.f69637n;
        } else {
            j226 = j118;
        }
        long j272 = j226;
        if ((i15 & DfuBaseService.ERROR_CONNECTION_MASK) != 0) {
            int i126 = C17919x.f69638o;
            j227 = C17919x.f69637n;
        } else {
            j227 = j119;
        }
        if ((i15 & 32768) != 0) {
            int i127 = C17919x.f69638o;
            j228 = C17919x.f69637n;
        } else {
            j228 = j120;
        }
        if ((i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0) {
            int i128 = C17919x.f69638o;
            j229 = C17919x.f69637n;
        } else {
            j229 = j121;
        }
        if ((i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0) {
            int i129 = C17919x.f69638o;
            j230 = C17919x.f69637n;
        } else {
            j230 = j122;
        }
        if ((i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
            int i130 = C17919x.f69638o;
            j231 = C17919x.f69637n;
        } else {
            j231 = j123;
        }
        if ((i15 & 524288) != 0) {
            int i131 = C17919x.f69638o;
            j232 = C17919x.f69637n;
        } else {
            j232 = j124;
        }
        if ((i15 & 1048576) != 0) {
            int i132 = C17919x.f69638o;
            j233 = C17919x.f69637n;
        } else {
            j233 = j125;
        }
        if ((i15 & 2097152) != 0) {
            int i133 = C17919x.f69638o;
            j234 = C17919x.f69637n;
        } else {
            j234 = j126;
        }
        if ((i15 & 4194304) != 0) {
            int i134 = C17919x.f69638o;
            j235 = C17919x.f69637n;
        } else {
            j235 = j127;
        }
        if ((i15 & 8388608) != 0) {
            int i135 = C17919x.f69638o;
            j236 = C17919x.f69637n;
        } else {
            j236 = j128;
        }
        if ((i15 & 16777216) != 0) {
            int i136 = C17919x.f69638o;
            j237 = C17919x.f69637n;
        } else {
            j237 = j129;
        }
        if ((i15 & AndroidSDKConstants.FLAG_MUTABLE) != 0) {
            int i137 = C17919x.f69638o;
            j238 = C17919x.f69637n;
        } else {
            j238 = j130;
        }
        if ((i15 & 67108864) != 0) {
            int i138 = C17919x.f69638o;
            j239 = C17919x.f69637n;
        } else {
            j239 = j131;
        }
        if ((i15 & 134217728) != 0) {
            int i139 = C17919x.f69638o;
            j240 = C17919x.f69637n;
        } else {
            j240 = j132;
        }
        if ((i15 & 268435456) != 0) {
            int i140 = C17919x.f69638o;
            j241 = C17919x.f69637n;
        } else {
            j241 = j133;
        }
        if ((i15 & 536870912) != 0) {
            int i141 = C17919x.f69638o;
            j242 = C17919x.f69637n;
        } else {
            j242 = j134;
        }
        if ((i15 & 1073741824) != 0) {
            int i142 = C17919x.f69638o;
            j243 = C17919x.f69637n;
        } else {
            j243 = j135;
        }
        if ((i15 & Integer.MIN_VALUE) != 0) {
            int i143 = C17919x.f69638o;
            j244 = C17919x.f69637n;
        } else {
            j244 = j136;
        }
        if ((i16 & 1) != 0) {
            int i144 = C17919x.f69638o;
            j245 = C17919x.f69637n;
        } else {
            j245 = j137;
        }
        if ((i16 & 2) != 0) {
            int i145 = C17919x.f69638o;
            j246 = C17919x.f69637n;
        } else {
            j246 = j138;
        }
        if ((i16 & 4) != 0) {
            int i146 = C17919x.f69638o;
            j247 = C17919x.f69637n;
        } else {
            j247 = j139;
        }
        if ((i16 & 8) != 0) {
            int i147 = C17919x.f69638o;
            j248 = C17919x.f69637n;
        } else {
            j248 = j140;
        }
        if ((i16 & 16) != 0) {
            int i148 = C17919x.f69638o;
            j249 = C17919x.f69637n;
        } else {
            j249 = j141;
        }
        if ((i16 & 32) != 0) {
            int i149 = C17919x.f69638o;
            j250 = C17919x.f69637n;
        } else {
            j250 = j142;
        }
        if ((i16 & 64) != 0) {
            int i150 = C17919x.f69638o;
            j251 = C17919x.f69637n;
        } else {
            j251 = j143;
        }
        if ((i16 & 128) != 0) {
            int i151 = C17919x.f69638o;
            j252 = C17919x.f69637n;
        } else {
            j252 = j144;
        }
        if ((i16 & 256) != 0) {
            int i152 = C17919x.f69638o;
            j253 = C17919x.f69637n;
        } else {
            j253 = j145;
        }
        if ((i16 & 512) != 0) {
            int i153 = C17919x.f69638o;
            j254 = C17919x.f69637n;
        } else {
            j254 = j146;
        }
        if ((i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            int i154 = C17919x.f69638o;
            j255 = C17919x.f69637n;
        } else {
            j255 = j147;
        }
        if ((i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            int i155 = C17919x.f69638o;
            j256 = C17919x.f69637n;
        } else {
            j256 = j148;
        }
        long j273 = j150;
        long j274 = j151;
        long j275 = j152;
        long j276 = j153;
        long j277 = j154;
        long j278 = j155;
        this(j257, j273, j274, j275, j276, j277, j278, j258, j259, j260, j261, j262, j263, j264, j163, j164, j165, j166, j167, j168, j169, j170, j171, j172, j173, j174, j175, j176, j177, j178, j179, j180, j181, j182, j183, j184, j185, j186, j187, j188, j189, j190, j191, j192, j193, j194, j195, j196, j197, j198, j199, j200, j201, j202, j203, j204, j205, j206, j207, j208, j209, j210, j211, j265, j213, j214, j215, j216, j217, j218, j219, j266, j267, j268, j269, j270, j271, j272, j227, j228, j229, j230, j231, j232, j233, j234, j235, j236, j237, j238, j239, j240, j241, j242, j243, j244, j245, j246, j247, j248, j249, j250, j251, j252, j253, j254, j255, j256, (i16 & 4096) != 0 ? C25271y.f99162w : list, null);
    }
}
