package io.getstream.chat.android.p226ui.feature.messages.list;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.common.state.messages.list.MessageOptionsUserReactionAlignment;
import io.getstream.chat.android.p226ui.feature.messages.common.AudioRecordPlayerViewStyle;
import io.getstream.chat.android.p226ui.font.TextStyle;
import io.getstream.chat.android.p226ui.helper.TransformStyle;
import io.getstream.chat.android.p226ui.helper.ViewStyle;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import l83.InterfaceC23462h;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p127ev.AbstractC13673n;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0003\bª\u0001\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 Ý\u00012\u00020\u0001:\u0002Ý\u0001B\u0091\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0014\u0012\u0006\u0010\u001c\u001a\u00020\u0012\u0012\u0006\u0010\u001d\u001a\u00020\u0014\u0012\u0006\u0010\u001e\u001a\u00020\u0014\u0012\u0006\u0010\u001f\u001a\u00020\u0012\u0012\u0006\u0010 \u001a\u00020\u0014\u0012\u0006\u0010!\u001a\u00020\u0014\u0012\u0006\u0010\"\u001a\u00020\u0012\u0012\u0006\u0010#\u001a\u00020\u0014\u0012\u0006\u0010$\u001a\u00020\u0012\u0012\u0006\u0010%\u001a\u00020\u0014\u0012\u0006\u0010&\u001a\u00020\u0014\u0012\u0006\u0010'\u001a\u00020\u0012\u0012\u0006\u0010(\u001a\u00020\u0012\u0012\u0006\u0010)\u001a\u00020\u0012\u0012\u0006\u0010*\u001a\u00020\u0012\u0012\u0006\u0010+\u001a\u00020\u0012\u0012\u0006\u0010,\u001a\u00020\u0012\u0012\u0006\u0010-\u001a\u00020.\u0012\u0006\u0010/\u001a\u00020.\u0012\b\b\u0001\u00100\u001a\u00020\u0014\u0012\b\b\u0001\u00101\u001a\u00020\u0014\u0012\u0006\u00102\u001a\u00020.\u0012\b\b\u0001\u00103\u001a\u00020\u0014\u0012\u0006\u00104\u001a\u00020.\u0012\b\b\u0001\u00105\u001a\u00020\u0014\u0012\u0006\u00106\u001a\u00020\u0014\u0012\u0006\u00107\u001a\u00020\u0014\u0012\u0006\u00108\u001a\u00020\u0014\u0012\u0006\u00109\u001a\u00020\u0014\u0012\u0006\u0010:\u001a\u00020\u0014\u0012\u0006\u0010;\u001a\u00020\u0012\u0012\u0006\u0010<\u001a\u00020\u0014\u0012\u0006\u0010=\u001a\u00020\u0014\u0012\u0006\u0010>\u001a\u00020\u0014\u0012\u0006\u0010?\u001a\u00020\u0014\u0012\u0006\u0010@\u001a\u00020\u0014\u0012\u0006\u0010A\u001a\u00020\u0014\u0012\u0006\u0010B\u001a\u00020\u0014\u0012\u0006\u0010C\u001a\u00020\u0014\u0012\u0006\u0010D\u001a\u00020\u0014\u0012\u0006\u0010E\u001a\u00020\u0014\u0012\u0006\u0010F\u001a\u00020\u0014\u0012\u0006\u0010G\u001a\u00020\u0014\u0012\u0006\u0010H\u001a\u00020\u0012\u0012\u0006\u0010I\u001a\u00020\u0012\u0012\u0006\u0010J\u001a\u00020\u0012\u0012\b\b\u0001\u0010K\u001a\u00020\u0014¢\u0006\u0004\bL\u0010MJ\n\u0010\u0097\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0098\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0099\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u009a\u0001\u001a\u00020\tHÆ\u0003J\u0010\u0010\u009b\u0001\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\n\u0010\u009c\u0001\u001a\u00020\u000eHÆ\u0003J\n\u0010\u009d\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010\u009e\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010 \u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010¡\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010¢\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010£\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010¤\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010¥\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010¦\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010§\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010¨\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010©\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010ª\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010«\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010¬\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010\u00ad\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010®\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010¯\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010°\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010±\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010²\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010³\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010´\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010µ\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010¶\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010·\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010¸\u0001\u001a\u00020.HÆ\u0003J\n\u0010¹\u0001\u001a\u00020.HÆ\u0003J\n\u0010º\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010»\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010¼\u0001\u001a\u00020.HÆ\u0003J\n\u0010½\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010¾\u0001\u001a\u00020.HÆ\u0003J\n\u0010¿\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010À\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010Á\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010Â\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010Ã\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010Ä\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010Å\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010Æ\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010Ç\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010È\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010É\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010Ê\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010Ë\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010Ì\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010Í\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010Î\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010Ï\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010Ð\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010Ñ\u0001\u001a\u00020\u0014HÆ\u0003J\n\u0010Ò\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010Ó\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010Ô\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010Õ\u0001\u001a\u00020\u0014HÆ\u0003J\u0086\u0005\u0010Ö\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0003\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00122\b\b\u0002\u0010\u0019\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u00142\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u00142\b\b\u0002\u0010\u001e\u001a\u00020\u00142\b\b\u0002\u0010\u001f\u001a\u00020\u00122\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\u00142\b\b\u0002\u0010\"\u001a\u00020\u00122\b\b\u0002\u0010#\u001a\u00020\u00142\b\b\u0002\u0010$\u001a\u00020\u00122\b\b\u0002\u0010%\u001a\u00020\u00142\b\b\u0002\u0010&\u001a\u00020\u00142\b\b\u0002\u0010'\u001a\u00020\u00122\b\b\u0002\u0010(\u001a\u00020\u00122\b\b\u0002\u0010)\u001a\u00020\u00122\b\b\u0002\u0010*\u001a\u00020\u00122\b\b\u0002\u0010+\u001a\u00020\u00122\b\b\u0002\u0010,\u001a\u00020\u00122\b\b\u0002\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0003\u00100\u001a\u00020\u00142\b\b\u0003\u00101\u001a\u00020\u00142\b\b\u0002\u00102\u001a\u00020.2\b\b\u0003\u00103\u001a\u00020\u00142\b\b\u0002\u00104\u001a\u00020.2\b\b\u0003\u00105\u001a\u00020\u00142\b\b\u0002\u00106\u001a\u00020\u00142\b\b\u0002\u00107\u001a\u00020\u00142\b\b\u0002\u00108\u001a\u00020\u00142\b\b\u0002\u00109\u001a\u00020\u00142\b\b\u0002\u0010:\u001a\u00020\u00142\b\b\u0002\u0010;\u001a\u00020\u00122\b\b\u0002\u0010<\u001a\u00020\u00142\b\b\u0002\u0010=\u001a\u00020\u00142\b\b\u0002\u0010>\u001a\u00020\u00142\b\b\u0002\u0010?\u001a\u00020\u00142\b\b\u0002\u0010@\u001a\u00020\u00142\b\b\u0002\u0010A\u001a\u00020\u00142\b\b\u0002\u0010B\u001a\u00020\u00142\b\b\u0002\u0010C\u001a\u00020\u00142\b\b\u0002\u0010D\u001a\u00020\u00142\b\b\u0002\u0010E\u001a\u00020\u00142\b\b\u0002\u0010F\u001a\u00020\u00142\b\b\u0002\u0010G\u001a\u00020\u00142\b\b\u0002\u0010H\u001a\u00020\u00122\b\b\u0002\u0010I\u001a\u00020\u00122\b\b\u0002\u0010J\u001a\u00020\u00122\b\b\u0003\u0010K\u001a\u00020\u0014HÆ\u0001J\u0016\u0010×\u0001\u001a\u00020\u00122\n\u0010Ø\u0001\u001a\u0005\u0018\u00010Ù\u0001HÖ\u0003J\n\u0010Ú\u0001\u001a\u00020\u0014HÖ\u0001J\u000b\u0010Û\u0001\u001a\u00030Ü\u0001HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010]R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b^\u0010_R\u0011\u0010\u0015\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b`\u0010_R\u0011\u0010\u0016\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\ba\u0010]R\u0011\u0010\u0017\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\bb\u0010_R\u0011\u0010\u0018\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bc\u0010]R\u0011\u0010\u0019\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\bd\u0010_R\u0011\u0010\u001a\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\be\u0010_R\u0011\u0010\u001b\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\bf\u0010_R\u0011\u0010\u001c\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bg\u0010]R\u0011\u0010\u001d\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\bh\u0010_R\u0011\u0010\u001e\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\bi\u0010_R\u0011\u0010\u001f\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bj\u0010]R\u0011\u0010 \u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\bk\u0010_R\u0011\u0010!\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\bl\u0010_R\u0011\u0010\"\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bm\u0010]R\u0011\u0010#\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\bn\u0010_R\u0011\u0010$\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bo\u0010]R\u0011\u0010%\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\bp\u0010_R\u0011\u0010&\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\bq\u0010_R\u0011\u0010'\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\br\u0010]R\u0011\u0010(\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bs\u0010]R\u0011\u0010)\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bt\u0010]R\u0011\u0010*\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bu\u0010]R\u0011\u0010+\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bv\u0010]R\u0011\u0010,\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bw\u0010]R\u0011\u0010-\u001a\u00020.¢\u0006\b\n\u0000\u001a\u0004\bx\u0010yR\u0011\u0010/\u001a\u00020.¢\u0006\b\n\u0000\u001a\u0004\bz\u0010yR\u0011\u00100\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b{\u0010_R\u0011\u00101\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b|\u0010_R\u0011\u00102\u001a\u00020.¢\u0006\b\n\u0000\u001a\u0004\b}\u0010yR\u0011\u00103\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b~\u0010_R\u0011\u00104\u001a\u00020.¢\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010yR\u0012\u00105\u001a\u00020\u0014¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010_R\u0012\u00106\u001a\u00020\u0014¢\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010_R\u0012\u00107\u001a\u00020\u0014¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010_R\u0012\u00108\u001a\u00020\u0014¢\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010_R\u0012\u00109\u001a\u00020\u0014¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010_R\u0012\u0010:\u001a\u00020\u0014¢\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u0010_R\u0012\u0010;\u001a\u00020\u0012¢\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010]R\u0012\u0010<\u001a\u00020\u0014¢\u0006\t\n\u0000\u001a\u0005\b\u0087\u0001\u0010_R\u0012\u0010=\u001a\u00020\u0014¢\u0006\t\n\u0000\u001a\u0005\b\u0088\u0001\u0010_R\u0012\u0010>\u001a\u00020\u0014¢\u0006\t\n\u0000\u001a\u0005\b\u0089\u0001\u0010_R\u0012\u0010?\u001a\u00020\u0014¢\u0006\t\n\u0000\u001a\u0005\b\u008a\u0001\u0010_R\u0012\u0010@\u001a\u00020\u0014¢\u0006\t\n\u0000\u001a\u0005\b\u008b\u0001\u0010_R\u0012\u0010A\u001a\u00020\u0014¢\u0006\t\n\u0000\u001a\u0005\b\u008c\u0001\u0010_R\u0012\u0010B\u001a\u00020\u0014¢\u0006\t\n\u0000\u001a\u0005\b\u008d\u0001\u0010_R\u0012\u0010C\u001a\u00020\u0014¢\u0006\t\n\u0000\u001a\u0005\b\u008e\u0001\u0010_R\u0012\u0010D\u001a\u00020\u0014¢\u0006\t\n\u0000\u001a\u0005\b\u008f\u0001\u0010_R\u0012\u0010E\u001a\u00020\u0014¢\u0006\t\n\u0000\u001a\u0005\b\u0090\u0001\u0010_R\u0012\u0010F\u001a\u00020\u0014¢\u0006\t\n\u0000\u001a\u0005\b\u0091\u0001\u0010_R\u0012\u0010G\u001a\u00020\u0014¢\u0006\t\n\u0000\u001a\u0005\b\u0092\u0001\u0010_R\u0012\u0010H\u001a\u00020\u0012¢\u0006\t\n\u0000\u001a\u0005\b\u0093\u0001\u0010]R\u0012\u0010I\u001a\u00020\u0012¢\u0006\t\n\u0000\u001a\u0005\b\u0094\u0001\u0010]R\u0012\u0010J\u001a\u00020\u0012¢\u0006\t\n\u0000\u001a\u0005\b\u0095\u0001\u0010]R\u0012\u0010K\u001a\u00020\u0014¢\u0006\t\n\u0000\u001a\u0005\b\u0096\u0001\u0010_¨\u0006Þ\u0001"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;", "Lio/getstream/chat/android/ui/helper/ViewStyle;", "scrollButtonViewStyle", "Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;", "scrollButtonBehaviour", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$NewMessagesBehaviour;", "itemStyle", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;", "giphyViewHolderStyle", "Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;", "audioRecordPlayerViewStyle", "Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;", "Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;", "replyMessageStyle", "Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;", "unreadLabelButtonStyle", "Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;", "reactionsEnabled", "", "backgroundColor", "", "replyIcon", "replyEnabled", "threadReplyIcon", "threadsEnabled", "retryIcon", "copyIcon", "markAsUnreadIcon", "editMessageEnabled", "editIcon", "flagIcon", "flagEnabled", "pinIcon", "unpinIcon", "pinMessageEnabled", "deleteIcon", "deleteMessageEnabled", "blockUserIcon", "unblockUserIcon", "blockUserEnabled", "copyTextEnabled", "markAsUnreadEnabled", "retryMessageEnabled", "deleteConfirmationEnabled", "flagMessageConfirmationEnabled", "messageOptionsText", "Lio/getstream/chat/android/ui/font/TextStyle;", "warningMessageOptionsText", "messageOptionsBackgroundColor", "userReactionsBackgroundColor", "userReactionsTitleText", "optionsOverlayDimColor", "emptyViewTextStyle", "loadingView", "messagesStart", "threadMessagesStart", "messageOptionsUserReactionAlignment", "scrollButtonBottomMargin", "scrollButtonEndMargin", "disableScrollWhenShowingDialog", "optionsOverlayEditReactionsMarginTop", "optionsOverlayEditReactionsMarginBottom", "optionsOverlayEditReactionsMarginStart", "optionsOverlayEditReactionsMarginEnd", "optionsOverlayUserReactionsMarginTop", "optionsOverlayUserReactionsMarginBottom", "optionsOverlayUserReactionsMarginStart", "optionsOverlayUserReactionsMarginEnd", "optionsOverlayMessageOptionsMarginTop", "optionsOverlayMessageOptionsMarginBottom", "optionsOverlayMessageOptionsMarginStart", "optionsOverlayMessageOptionsMarginEnd", "showReactionsForUnsentMessages", "readCountEnabled", "swipeToReplyEnabled", "swipeToReplyIcon", "<init>", "(Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$NewMessagesBehaviour;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;ZIIZIZIIIZIIZIIZIZIIZZZZZZLio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;IILio/getstream/chat/android/ui/font/TextStyle;ILio/getstream/chat/android/ui/font/TextStyle;IIIIIIZIIIIIIIIIIIIZZZI)V", "getScrollButtonViewStyle", "()Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;", "getScrollButtonBehaviour", "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$NewMessagesBehaviour;", "getItemStyle", "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;", "getGiphyViewHolderStyle", "()Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;", "getAudioRecordPlayerViewStyle", "()Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;", "getReplyMessageStyle", "()Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;", "getUnreadLabelButtonStyle", "()Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;", "getReactionsEnabled", "()Z", "getBackgroundColor", "()I", "getReplyIcon", "getReplyEnabled", "getThreadReplyIcon", "getThreadsEnabled", "getRetryIcon", "getCopyIcon", "getMarkAsUnreadIcon", "getEditMessageEnabled", "getEditIcon", "getFlagIcon", "getFlagEnabled", "getPinIcon", "getUnpinIcon", "getPinMessageEnabled", "getDeleteIcon", "getDeleteMessageEnabled", "getBlockUserIcon", "getUnblockUserIcon", "getBlockUserEnabled", "getCopyTextEnabled", "getMarkAsUnreadEnabled", "getRetryMessageEnabled", "getDeleteConfirmationEnabled", "getFlagMessageConfirmationEnabled", "getMessageOptionsText", "()Lio/getstream/chat/android/ui/font/TextStyle;", "getWarningMessageOptionsText", "getMessageOptionsBackgroundColor", "getUserReactionsBackgroundColor", "getUserReactionsTitleText", "getOptionsOverlayDimColor", "getEmptyViewTextStyle", "getLoadingView", "getMessagesStart", "getThreadMessagesStart", "getMessageOptionsUserReactionAlignment", "getScrollButtonBottomMargin", "getScrollButtonEndMargin", "getDisableScrollWhenShowingDialog", "getOptionsOverlayEditReactionsMarginTop", "getOptionsOverlayEditReactionsMarginBottom", "getOptionsOverlayEditReactionsMarginStart", "getOptionsOverlayEditReactionsMarginEnd", "getOptionsOverlayUserReactionsMarginTop", "getOptionsOverlayUserReactionsMarginBottom", "getOptionsOverlayUserReactionsMarginStart", "getOptionsOverlayUserReactionsMarginEnd", "getOptionsOverlayMessageOptionsMarginTop", "getOptionsOverlayMessageOptionsMarginBottom", "getOptionsOverlayMessageOptionsMarginStart", "getOptionsOverlayMessageOptionsMarginEnd", "getShowReactionsForUnsentMessages", "getReadCountEnabled", "getSwipeToReplyEnabled", "getSwipeToReplyIcon", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component60", "component61", "component62", "component63", "copy", "equals", "other", "", "hashCode", "toString", "", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class MessageListViewStyle implements ViewStyle {
    private final MessageViewStyle<AudioRecordPlayerViewStyle> audioRecordPlayerViewStyle;
    private final int backgroundColor;
    private final boolean blockUserEnabled;
    private final int blockUserIcon;
    private final int copyIcon;
    private final boolean copyTextEnabled;
    private final boolean deleteConfirmationEnabled;
    private final int deleteIcon;
    private final boolean deleteMessageEnabled;
    private final boolean disableScrollWhenShowingDialog;
    private final int editIcon;
    private final boolean editMessageEnabled;
    private final TextStyle emptyViewTextStyle;
    private final boolean flagEnabled;
    private final int flagIcon;
    private final boolean flagMessageConfirmationEnabled;
    private final GiphyViewHolderStyle giphyViewHolderStyle;
    private final MessageListItemStyle itemStyle;
    private final int loadingView;
    private final boolean markAsUnreadEnabled;
    private final int markAsUnreadIcon;
    private final int messageOptionsBackgroundColor;
    private final TextStyle messageOptionsText;
    private final int messageOptionsUserReactionAlignment;
    private final int messagesStart;
    private final int optionsOverlayDimColor;
    private final int optionsOverlayEditReactionsMarginBottom;
    private final int optionsOverlayEditReactionsMarginEnd;
    private final int optionsOverlayEditReactionsMarginStart;
    private final int optionsOverlayEditReactionsMarginTop;
    private final int optionsOverlayMessageOptionsMarginBottom;
    private final int optionsOverlayMessageOptionsMarginEnd;
    private final int optionsOverlayMessageOptionsMarginStart;
    private final int optionsOverlayMessageOptionsMarginTop;
    private final int optionsOverlayUserReactionsMarginBottom;
    private final int optionsOverlayUserReactionsMarginEnd;
    private final int optionsOverlayUserReactionsMarginStart;
    private final int optionsOverlayUserReactionsMarginTop;
    private final int pinIcon;
    private final boolean pinMessageEnabled;
    private final boolean reactionsEnabled;
    private final boolean readCountEnabled;
    private final boolean replyEnabled;
    private final int replyIcon;
    private final MessageReplyStyle replyMessageStyle;
    private final int retryIcon;
    private final boolean retryMessageEnabled;
    private final MessageListView.NewMessagesBehaviour scrollButtonBehaviour;
    private final int scrollButtonBottomMargin;
    private final int scrollButtonEndMargin;
    private final ScrollButtonViewStyle scrollButtonViewStyle;
    private final boolean showReactionsForUnsentMessages;
    private final boolean swipeToReplyEnabled;
    private final int swipeToReplyIcon;
    private final int threadMessagesStart;
    private final int threadReplyIcon;
    private final boolean threadsEnabled;
    private final int unblockUserIcon;
    private final int unpinIcon;
    private final UnreadLabelButtonStyle unreadLabelButtonStyle;
    private final int userReactionsBackgroundColor;
    private final TextStyle userReactionsTitleText;
    private final TextStyle warningMessageOptionsText;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final int DEFAULT_BACKGROUND_COLOR = C19469R.color.stream_ui_white_snow;
    private static final InterfaceC23462h DEFAULT_SCROLL_BUTTON_ELEVATION$delegate = AbstractC30060g.m92088H(new C19728a(2));
    private static final InterfaceC23462h DEFAULT_SCROLL_BUTTON_MARGIN$delegate = AbstractC30060g.m92088H(new C19728a(15));
    private static final InterfaceC23462h DEFAULT_SCROLL_BUTTON_INTERNAL_MARGIN$delegate = AbstractC30060g.m92088H(new C19728a(16));
    private static final InterfaceC23462h DEFAULT_SCROLL_BUTTON_BADGE_ELEVATION$delegate = AbstractC30060g.m92088H(new C19728a(17));
    private static final InterfaceC23462h DEFAULT_EDIT_REACTIONS_MARGIN_TOP$delegate = AbstractC30060g.m92088H(new C19728a(3));
    private static final InterfaceC23462h DEFAULT_EDIT_REACTIONS_MARGIN_BOTTOM$delegate = AbstractC30060g.m92088H(new C19728a(4));
    private static final InterfaceC23462h DEFAULT_EDIT_REACTIONS_MARGIN_START$delegate = AbstractC30060g.m92088H(new C19728a(5));
    private static final InterfaceC23462h DEFAULT_EDIT_REACTIONS_MARGIN_END$delegate = AbstractC30060g.m92088H(new C19728a(6));
    private static final InterfaceC23462h DEFAULT_USER_REACTIONS_MARGIN_TOP$delegate = AbstractC30060g.m92088H(new C19728a(7));
    private static final InterfaceC23462h DEFAULT_USER_REACTIONS_MARGIN_BOTTOM$delegate = AbstractC30060g.m92088H(new C19728a(8));
    private static final InterfaceC23462h DEFAULT_USER_REACTIONS_MARGIN_START$delegate = AbstractC30060g.m92088H(new C19728a(9));
    private static final InterfaceC23462h DEFAULT_USER_REACTIONS_MARGIN_END$delegate = AbstractC30060g.m92088H(new C19728a(10));
    private static final InterfaceC23462h DEFAULT_MESSAGE_OPTIONS_MARGIN_TOP$delegate = AbstractC30060g.m92088H(new C19728a(11));
    private static final InterfaceC23462h DEFAULT_MESSAGE_OPTIONS_MARGIN_BOTTOM$delegate = AbstractC30060g.m92088H(new C19728a(12));
    private static final InterfaceC23462h DEFAULT_MESSAGE_OPTIONS_MARGIN_START$delegate = AbstractC30060g.m92088H(new C19728a(13));
    private static final InterfaceC23462h DEFAULT_MESSAGE_OPTIONS_MARGIN_END$delegate = AbstractC30060g.m92088H(new C19728a(14));

    @Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b1\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0080\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010 \u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u001cR\u001b\u0010#\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0015\u001a\u0004\b\"\u0010\u0017R\u001b\u0010&\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0015\u001a\u0004\b%\u0010\u001cR\u001b\u0010)\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0015\u001a\u0004\b(\u0010\u001cR\u001b\u0010,\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0015\u001a\u0004\b+\u0010\u001cR\u001b\u0010/\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0015\u001a\u0004\b.\u0010\u001cR\u001b\u00102\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u0015\u001a\u0004\b1\u0010\u001cR\u001b\u00105\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u0015\u001a\u0004\b4\u0010\u001cR\u001b\u00108\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u0015\u001a\u0004\b7\u0010\u001cR\u001b\u0010;\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\u0015\u001a\u0004\b:\u0010\u001cR\u001b\u0010>\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\u0015\u001a\u0004\b=\u0010\u001cR\u001b\u0010A\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010\u0015\u001a\u0004\b@\u0010\u001cR\u001b\u0010D\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010\u0015\u001a\u0004\bC\u0010\u001cR\u001b\u0010G\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010\u0015\u001a\u0004\bF\u0010\u001cR\u0014\u0010H\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006J"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/res/TypedArray;", "typedArray", "Lio/getstream/chat/android/ui/font/TextStyle;", "emptyViewStyle", "(Landroid/content/Context;Landroid/content/res/TypedArray;)Lio/getstream/chat/android/ui/font/TextStyle;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;", "createDefault", "(Landroid/content/Context;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;", "Landroid/util/AttributeSet;", "attrs", "invoke$stream_chat_android_ui_components_release", "(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;", "invoke", "", "DEFAULT_SCROLL_BUTTON_ELEVATION$delegate", "Ll83/h;", "getDEFAULT_SCROLL_BUTTON_ELEVATION", "()F", "DEFAULT_SCROLL_BUTTON_ELEVATION", "", "DEFAULT_SCROLL_BUTTON_MARGIN$delegate", "getDEFAULT_SCROLL_BUTTON_MARGIN", "()I", "DEFAULT_SCROLL_BUTTON_MARGIN", "DEFAULT_SCROLL_BUTTON_INTERNAL_MARGIN$delegate", "getDEFAULT_SCROLL_BUTTON_INTERNAL_MARGIN", "DEFAULT_SCROLL_BUTTON_INTERNAL_MARGIN", "DEFAULT_SCROLL_BUTTON_BADGE_ELEVATION$delegate", "getDEFAULT_SCROLL_BUTTON_BADGE_ELEVATION", "DEFAULT_SCROLL_BUTTON_BADGE_ELEVATION", "DEFAULT_EDIT_REACTIONS_MARGIN_TOP$delegate", "getDEFAULT_EDIT_REACTIONS_MARGIN_TOP", "DEFAULT_EDIT_REACTIONS_MARGIN_TOP", "DEFAULT_EDIT_REACTIONS_MARGIN_BOTTOM$delegate", "getDEFAULT_EDIT_REACTIONS_MARGIN_BOTTOM", "DEFAULT_EDIT_REACTIONS_MARGIN_BOTTOM", "DEFAULT_EDIT_REACTIONS_MARGIN_START$delegate", "getDEFAULT_EDIT_REACTIONS_MARGIN_START", "DEFAULT_EDIT_REACTIONS_MARGIN_START", "DEFAULT_EDIT_REACTIONS_MARGIN_END$delegate", "getDEFAULT_EDIT_REACTIONS_MARGIN_END", "DEFAULT_EDIT_REACTIONS_MARGIN_END", "DEFAULT_USER_REACTIONS_MARGIN_TOP$delegate", "getDEFAULT_USER_REACTIONS_MARGIN_TOP", "DEFAULT_USER_REACTIONS_MARGIN_TOP", "DEFAULT_USER_REACTIONS_MARGIN_BOTTOM$delegate", "getDEFAULT_USER_REACTIONS_MARGIN_BOTTOM", "DEFAULT_USER_REACTIONS_MARGIN_BOTTOM", "DEFAULT_USER_REACTIONS_MARGIN_START$delegate", "getDEFAULT_USER_REACTIONS_MARGIN_START", "DEFAULT_USER_REACTIONS_MARGIN_START", "DEFAULT_USER_REACTIONS_MARGIN_END$delegate", "getDEFAULT_USER_REACTIONS_MARGIN_END", "DEFAULT_USER_REACTIONS_MARGIN_END", "DEFAULT_MESSAGE_OPTIONS_MARGIN_TOP$delegate", "getDEFAULT_MESSAGE_OPTIONS_MARGIN_TOP", "DEFAULT_MESSAGE_OPTIONS_MARGIN_TOP", "DEFAULT_MESSAGE_OPTIONS_MARGIN_BOTTOM$delegate", "getDEFAULT_MESSAGE_OPTIONS_MARGIN_BOTTOM", "DEFAULT_MESSAGE_OPTIONS_MARGIN_BOTTOM", "DEFAULT_MESSAGE_OPTIONS_MARGIN_START$delegate", "getDEFAULT_MESSAGE_OPTIONS_MARGIN_START", "DEFAULT_MESSAGE_OPTIONS_MARGIN_START", "DEFAULT_MESSAGE_OPTIONS_MARGIN_END$delegate", "getDEFAULT_MESSAGE_OPTIONS_MARGIN_END", "DEFAULT_MESSAGE_OPTIONS_MARGIN_END", "DEFAULT_BACKGROUND_COLOR", "I", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        private final TextStyle emptyViewStyle(Context context, TypedArray typedArray) {
            TextStyle.Builder builder = new TextStyle.Builder(typedArray);
            builder.color(C19469R.styleable.MessageListView_streamUiEmptyStateTextColor, ContextKt.getColorCompat(context, C19469R.color.stream_ui_text_color_primary));
            builder.size(C19469R.styleable.MessageListView_streamUiEmptyStateTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_medium));
            builder.font(C19469R.styleable.MessageListView_streamUiEmptyStateTextFontAssets, C19469R.styleable.MessageListView_streamUiEmptyStateTextFont);
            builder.style(C19469R.styleable.MessageListView_streamUiEmptyStateTextStyle, 0);
            return builder.build();
        }

        private final int getDEFAULT_EDIT_REACTIONS_MARGIN_BOTTOM() {
            return ((Number) MessageListViewStyle.DEFAULT_EDIT_REACTIONS_MARGIN_BOTTOM$delegate.getValue()).intValue();
        }

        private final int getDEFAULT_EDIT_REACTIONS_MARGIN_END() {
            return ((Number) MessageListViewStyle.DEFAULT_EDIT_REACTIONS_MARGIN_END$delegate.getValue()).intValue();
        }

        private final int getDEFAULT_EDIT_REACTIONS_MARGIN_START() {
            return ((Number) MessageListViewStyle.DEFAULT_EDIT_REACTIONS_MARGIN_START$delegate.getValue()).intValue();
        }

        private final int getDEFAULT_EDIT_REACTIONS_MARGIN_TOP() {
            return ((Number) MessageListViewStyle.DEFAULT_EDIT_REACTIONS_MARGIN_TOP$delegate.getValue()).intValue();
        }

        private final int getDEFAULT_MESSAGE_OPTIONS_MARGIN_BOTTOM() {
            return ((Number) MessageListViewStyle.DEFAULT_MESSAGE_OPTIONS_MARGIN_BOTTOM$delegate.getValue()).intValue();
        }

        private final int getDEFAULT_MESSAGE_OPTIONS_MARGIN_END() {
            return ((Number) MessageListViewStyle.DEFAULT_MESSAGE_OPTIONS_MARGIN_END$delegate.getValue()).intValue();
        }

        private final int getDEFAULT_MESSAGE_OPTIONS_MARGIN_START() {
            return ((Number) MessageListViewStyle.DEFAULT_MESSAGE_OPTIONS_MARGIN_START$delegate.getValue()).intValue();
        }

        private final int getDEFAULT_MESSAGE_OPTIONS_MARGIN_TOP() {
            return ((Number) MessageListViewStyle.DEFAULT_MESSAGE_OPTIONS_MARGIN_TOP$delegate.getValue()).intValue();
        }

        private final float getDEFAULT_SCROLL_BUTTON_BADGE_ELEVATION() {
            return ((Number) MessageListViewStyle.DEFAULT_SCROLL_BUTTON_BADGE_ELEVATION$delegate.getValue()).floatValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float getDEFAULT_SCROLL_BUTTON_ELEVATION() {
            return ((Number) MessageListViewStyle.DEFAULT_SCROLL_BUTTON_ELEVATION$delegate.getValue()).floatValue();
        }

        private final int getDEFAULT_SCROLL_BUTTON_INTERNAL_MARGIN() {
            return ((Number) MessageListViewStyle.DEFAULT_SCROLL_BUTTON_INTERNAL_MARGIN$delegate.getValue()).intValue();
        }

        private final int getDEFAULT_SCROLL_BUTTON_MARGIN() {
            return ((Number) MessageListViewStyle.DEFAULT_SCROLL_BUTTON_MARGIN$delegate.getValue()).intValue();
        }

        private final int getDEFAULT_USER_REACTIONS_MARGIN_BOTTOM() {
            return ((Number) MessageListViewStyle.DEFAULT_USER_REACTIONS_MARGIN_BOTTOM$delegate.getValue()).intValue();
        }

        private final int getDEFAULT_USER_REACTIONS_MARGIN_END() {
            return ((Number) MessageListViewStyle.DEFAULT_USER_REACTIONS_MARGIN_END$delegate.getValue()).intValue();
        }

        private final int getDEFAULT_USER_REACTIONS_MARGIN_START() {
            return ((Number) MessageListViewStyle.DEFAULT_USER_REACTIONS_MARGIN_START$delegate.getValue()).intValue();
        }

        private final int getDEFAULT_USER_REACTIONS_MARGIN_TOP() {
            return ((Number) MessageListViewStyle.DEFAULT_USER_REACTIONS_MARGIN_TOP$delegate.getValue()).intValue();
        }

        public final MessageListViewStyle createDefault(Context context) {
            AbstractC22676k.m65750j(context, "context");
            return invoke$stream_chat_android_ui_components_release(context, null);
        }

        public final MessageListViewStyle invoke$stream_chat_android_ui_components_release(Context context, AttributeSet attrs) {
            AudioRecordPlayerViewStyle audioRecordPlayerViewStyleInvoke$stream_chat_android_ui_components_release;
            AbstractC22676k.m65750j(context, "context");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C19469R.styleable.MessageListView, C19469R.attr.streamUiMessageListStyle, C19469R.style.StreamUi_MessageList);
            AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            ScrollButtonViewStyle.Builder builder = new ScrollButtonViewStyle.Builder(context, typedArrayObtainStyledAttributes);
            builder.scrollButtonEnabled(C19469R.styleable.MessageListView_streamUiScrollButtonEnabled, true);
            builder.scrollButtonUnreadEnabled(C19469R.styleable.MessageListView_streamUiScrollButtonUnreadEnabled, true);
            builder.scrollButtonColor(C19469R.styleable.MessageListView_streamUiScrollButtonColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_white));
            builder.scrollButtonRippleColor(C19469R.styleable.MessageListView_streamUiScrollButtonRippleColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_white_smoke));
            builder.scrollButtonBadgeColor(C19469R.styleable.MessageListView_streamUiScrollButtonBadgeColor);
            int i13 = C19469R.styleable.MessageListView_streamUiScrollButtonElevation;
            Companion companion = MessageListViewStyle.INSTANCE;
            builder.scrollButtonElevation(i13, companion.getDEFAULT_SCROLL_BUTTON_ELEVATION());
            builder.scrollButtonIcon(C19469R.styleable.MessageListView_streamUiScrollButtonIcon, AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_down));
            builder.scrollButtonBadgeGravity(C19469R.styleable.MessageListView_streamUiScrollButtonBadgeGravity, 49);
            builder.scrollButtonBadgeIcon(C19469R.styleable.MessageListView_streamUiScrollButtonBadgeIcon, AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_shape_scroll_button_badge));
            builder.scrollButtonBadgeElevation(C19469R.styleable.MessageListView_streamUiScrollButtonBadgeElevation, companion.getDEFAULT_SCROLL_BUTTON_BADGE_ELEVATION());
            builder.scrollButtonBadgeInternalMargin(C19469R.styleable.MessageListView_streamUIScrollButtonInternalMargin, companion.getDEFAULT_SCROLL_BUTTON_INTERNAL_MARGIN());
            ScrollButtonViewStyle scrollButtonViewStyleBuild = builder.build();
            UnreadLabelButtonStyle.Builder builder2 = new UnreadLabelButtonStyle.Builder(context, typedArrayObtainStyledAttributes);
            builder2.unreadLabelButtonEnabled(C19469R.styleable.MessageListView_streamUiUnreadLabelButtonEnabled, true);
            builder2.unreadLabelButtonColor(C19469R.styleable.MessageListView_streamUiUnreadLabelButtonColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_overlay_dark));
            builder2.unreadLabelButtonRippleColor(C19469R.styleable.MessageListView_streamUiUnreadLabelButtonRippleColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_white_smoke));
            UnreadLabelButtonStyle unreadLabelButtonStyleBuild = builder2.build();
            MessageListView.NewMessagesBehaviour value = MessageListView.NewMessagesBehaviour.INSTANCE.parseValue(typedArrayObtainStyledAttributes.getInt(C19469R.styleable.MessageListView_streamUiNewMessagesBehaviour, MessageListView.NewMessagesBehaviour.COUNT_UPDATE.getValue()));
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.MessageListView_streamUiScrollButtonBottomMargin, companion.getDEFAULT_SCROLL_BUTTON_MARGIN());
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.MessageListView_streamUiScrollButtonEndMargin, companion.getDEFAULT_SCROLL_BUTTON_MARGIN());
            boolean z4 = typedArrayObtainStyledAttributes.getBoolean(C19469R.styleable.MessageListView_streamUiReactionsEnabled, true);
            int color = typedArrayObtainStyledAttributes.getColor(C19469R.styleable.MessageListView_streamUiBackgroundColor, AbstractC32122c.getColor(context, MessageListViewStyle.DEFAULT_BACKGROUND_COLOR));
            MessageListItemStyle.Builder builder3 = new MessageListItemStyle.Builder(typedArrayObtainStyledAttributes, context);
            AudioRecordPlayerViewStyle audioRecordPlayerViewStyleInvoke$stream_chat_android_ui_components_release2 = null;
            MessageListItemStyle.Builder.messageBackgroundColorMine$default(builder3, C19469R.styleable.MessageListView_streamUiMessageBackgroundColorMine, 0, 2, null);
            MessageListItemStyle.Builder.messageBackgroundColorTheirs$default(builder3, C19469R.styleable.MessageListView_streamUiMessageBackgroundColorTheirs, 0, 2, null);
            MessageListItemStyle.Builder.messageLinkTextColorMine$default(builder3, C19469R.styleable.MessageListView_streamUiMessageLinkColorMine, 0, 2, null);
            MessageListItemStyle.Builder.messageLinkTextColorTheirs$default(builder3, C19469R.styleable.MessageListView_streamUiMessageLinkColorTheirs, 0, 2, null);
            MessageListItemStyle.Builder.reactionsEnabled$default(builder3, C19469R.styleable.MessageListView_streamUiReactionsEnabled, false, 2, null);
            MessageListItemStyle.Builder.linkDescriptionMaxLines$default(builder3, C19469R.styleable.MessageListView_streamUiLinkDescriptionMaxLines, 0, 2, null);
            MessageListItemStyle.Builder.systemMessageGravity$default(builder3, C19469R.styleable.MessageListView_streamUiSystemMessageAlignment, 0, 2, null);
            MessageListItemStyle messageListItemStyleBuild = builder3.build();
            GiphyViewHolderStyle giphyViewHolderStyleInvoke = GiphyViewHolderStyle.INSTANCE.invoke(context, typedArrayObtainStyledAttributes);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(C19469R.styleable.MessageListView_streamUiMessageListAudioRecordPlayerViewStyleOwn, C19469R.style.StreamUi_AudioRecordPlayerView);
            if (resourceId != C19469R.style.StreamUi_AudioRecordPlayerView) {
                TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, C19469R.styleable.AudioRecordPlayerView);
                AbstractC22676k.m65749i(typedArrayObtainStyledAttributes2, "obtainStyledAttributes(...)");
                audioRecordPlayerViewStyleInvoke$stream_chat_android_ui_components_release = AudioRecordPlayerViewStyle.INSTANCE.invoke$stream_chat_android_ui_components_release(context, typedArrayObtainStyledAttributes2);
                typedArrayObtainStyledAttributes2.recycle();
            } else {
                audioRecordPlayerViewStyleInvoke$stream_chat_android_ui_components_release = null;
            }
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(C19469R.styleable.f74390x89f3bd19, C19469R.style.StreamUi_AudioRecordPlayerView);
            if (resourceId2 != C19469R.style.StreamUi_AudioRecordPlayerView) {
                TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(resourceId2, C19469R.styleable.AudioRecordPlayerView);
                AbstractC22676k.m65749i(typedArrayObtainStyledAttributes3, "obtainStyledAttributes(...)");
                audioRecordPlayerViewStyleInvoke$stream_chat_android_ui_components_release2 = AudioRecordPlayerViewStyle.INSTANCE.invoke$stream_chat_android_ui_components_release(context, typedArrayObtainStyledAttributes3);
                typedArrayObtainStyledAttributes3.recycle();
            }
            MessageReplyStyle messageReplyStyleInvoke = MessageReplyStyle.INSTANCE.invoke(typedArrayObtainStyledAttributes, context);
            int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(C19469R.styleable.MessageListView_streamUiReplyOptionIcon, C19469R.drawable.stream_ui_ic_arrow_curve_left_grey);
            int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(C19469R.styleable.MessageListView_streamUiSwipeToReplyIcon, C19469R.drawable.stream_ui_ic_arrow_curve_left_grey);
            boolean z13 = typedArrayObtainStyledAttributes.getBoolean(C19469R.styleable.MessageListView_streamUiReplyEnabled, true);
            int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(C19469R.styleable.MessageListView_streamUiThreadReplyOptionIcon, C19469R.drawable.stream_ui_ic_thread_reply);
            int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(C19469R.styleable.MessageListView_streamUiRetryOptionIcon, C19469R.drawable.stream_ui_ic_send);
            int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(C19469R.styleable.MessageListView_streamUiCopyOptionIcon, C19469R.drawable.stream_ui_ic_copy);
            int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(C19469R.styleable.MessageListView_streamUiMarkAsUnreadOptionIcon, C19469R.drawable.stream_ui_ic_mark_as_unread);
            int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(C19469R.styleable.MessageListView_streamUiEditOptionIcon, C19469R.drawable.stream_ui_ic_edit);
            int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(C19469R.styleable.MessageListView_streamUiFlagOptionIcon, C19469R.drawable.stream_ui_ic_flag);
            int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(C19469R.styleable.MessageListView_streamUiDeleteOptionIcon, C19469R.drawable.stream_ui_ic_delete);
            boolean z14 = typedArrayObtainStyledAttributes.getBoolean(C19469R.styleable.MessageListView_streamUiFlagMessageEnabled, true);
            int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(C19469R.styleable.MessageListView_streamUiPinOptionIcon, C19469R.drawable.stream_ui_ic_pin);
            int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(C19469R.styleable.MessageListView_streamUiUnpinOptionIcon, C19469R.drawable.stream_ui_ic_unpin);
            boolean z15 = typedArrayObtainStyledAttributes.getBoolean(C19469R.styleable.MessageListView_streamUiPinMessageEnabled, false);
            boolean z16 = typedArrayObtainStyledAttributes.getBoolean(C19469R.styleable.MessageListView_streamUiCopyMessageActionEnabled, true);
            boolean z17 = typedArrayObtainStyledAttributes.getBoolean(C19469R.styleable.MessageListView_streamUiMarkAsUnreadEnabled, true);
            boolean z18 = typedArrayObtainStyledAttributes.getBoolean(C19469R.styleable.MessageListView_streamUiRetryMessageEnabled, true);
            boolean z19 = typedArrayObtainStyledAttributes.getBoolean(C19469R.styleable.MessageListView_streamUiDeleteConfirmationEnabled, true);
            boolean z24 = typedArrayObtainStyledAttributes.getBoolean(C19469R.styleable.MessageListView_streamUiFlagMessageConfirmationEnabled, false);
            boolean z25 = typedArrayObtainStyledAttributes.getBoolean(C19469R.styleable.MessageListView_streamUiDeleteMessageEnabled, true);
            boolean z26 = typedArrayObtainStyledAttributes.getBoolean(C19469R.styleable.MessageListView_streamUiEditMessageEnabled, true);
            boolean z27 = typedArrayObtainStyledAttributes.getBoolean(C19469R.styleable.MessageListView_streamUiThreadsEnabled, true);
            TextStyle.Builder builder4 = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder4.size(C19469R.styleable.MessageListView_streamUiMessageOptionsTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_medium));
            builder4.color(C19469R.styleable.MessageListView_streamUiMessageOptionsTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_primary));
            builder4.font(C19469R.styleable.MessageListView_streamUiMessageOptionsTextFontAssets, C19469R.styleable.MessageListView_streamUiMessageOptionsTextFont);
            builder4.style(C19469R.styleable.MessageListView_streamUiMessageOptionsTextStyle, 0);
            TextStyle textStyleBuild = builder4.build();
            TextStyle.Builder builder5 = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder5.size(C19469R.styleable.MessageListView_streamUiWarningMessageOptionsTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_medium));
            builder5.color(C19469R.styleable.MessageListView_streamUiWarningMessageOptionsTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_accent_red));
            builder5.font(C19469R.styleable.MessageListView_streamUiWarningMessageOptionsTextFontAssets, C19469R.styleable.MessageListView_streamUiWarningMessageOptionsTextFont);
            builder5.style(C19469R.styleable.MessageListView_streamUiWarningMessageOptionsTextStyle, 0);
            TextStyle textStyleBuild2 = builder5.build();
            int color2 = typedArrayObtainStyledAttributes.getColor(C19469R.styleable.MessageListView_streamUiMessageOptionBackgroundColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_white));
            int color3 = typedArrayObtainStyledAttributes.getColor(C19469R.styleable.MessageListView_streamUiUserReactionsBackgroundColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_white));
            TextStyle.Builder builder6 = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder6.size(C19469R.styleable.MessageListView_streamUiUserReactionsTitleTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_large));
            builder6.color(C19469R.styleable.MessageListView_streamUiUserReactionsTitleTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_primary));
            builder6.font(C19469R.styleable.MessageListView_streamUiUserReactionsTitleTextFontAssets, C19469R.styleable.MessageListView_streamUiUserReactionsTitleTextFont);
            builder6.style(C19469R.styleable.MessageListView_streamUiUserReactionsTitleTextStyle, 1);
            TextStyle textStyleBuild3 = builder6.build();
            int color4 = typedArrayObtainStyledAttributes.getColor(C19469R.styleable.MessageListView_streamUiOptionsOverlayDimColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_literal_transparent));
            TextStyle textStyleEmptyViewStyle = companion.emptyViewStyle(context, typedArrayObtainStyledAttributes);
            int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(C19469R.styleable.MessageListView_streamUiMessageListLoadingView, C19469R.layout.stream_ui_default_loading_view);
            int i14 = C19469R.styleable.MessageListView_streamUiMessagesStart;
            MessageListView.MessagesStart messagesStart = MessageListView.MessagesStart.BOTTOM;
            int i15 = typedArrayObtainStyledAttributes.getInt(i14, messagesStart.getValue());
            int i16 = typedArrayObtainStyledAttributes.getInt(C19469R.styleable.MessageListView_streamUiThreadMessagesStart, messagesStart.getValue());
            int i17 = typedArrayObtainStyledAttributes.getInt(C19469R.styleable.MessageListView_streamUiMessageOptionsUserReactionAlignment, MessageOptionsUserReactionAlignment.BY_USER.getValue());
            boolean z28 = typedArrayObtainStyledAttributes.getBoolean(C19469R.styleable.MessageListView_streamUiDisableScrollWhenShowingDialog, true);
            int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.MessageListView_streamUiOptionsOverlayEditReactionsMarginBottom, companion.getDEFAULT_EDIT_REACTIONS_MARGIN_BOTTOM());
            int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.MessageListView_streamUiOptionsOverlayEditReactionsMarginTop, companion.getDEFAULT_EDIT_REACTIONS_MARGIN_TOP());
            int dimensionPixelSize5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.MessageListView_streamUiOptionsOverlayEditReactionsMarginStart, companion.getDEFAULT_EDIT_REACTIONS_MARGIN_START());
            int dimensionPixelSize6 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.MessageListView_streamUiOptionsOverlayEditReactionsMarginEnd, companion.getDEFAULT_EDIT_REACTIONS_MARGIN_END());
            int dimensionPixelSize7 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.MessageListView_streamUiOptionsOverlayUserReactionsMarginTop, companion.getDEFAULT_USER_REACTIONS_MARGIN_TOP());
            int dimensionPixelSize8 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.MessageListView_streamUiOptionsOverlayUserReactionsMarginBottom, companion.getDEFAULT_USER_REACTIONS_MARGIN_BOTTOM());
            int dimensionPixelSize9 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.MessageListView_streamUiOptionsOverlayUserReactionsMarginStart, companion.getDEFAULT_USER_REACTIONS_MARGIN_START());
            int dimensionPixelSize10 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.MessageListView_streamUiOptionsOverlayUserReactionsMarginEnd, companion.getDEFAULT_USER_REACTIONS_MARGIN_END());
            int dimensionPixelSize11 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.MessageListView_streamUiOptionsOverlayMessageOptionsMarginTop, companion.getDEFAULT_MESSAGE_OPTIONS_MARGIN_TOP());
            int dimensionPixelSize12 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.MessageListView_streamUiOptionsOverlayMessageOptionsMarginBottom, companion.getDEFAULT_MESSAGE_OPTIONS_MARGIN_BOTTOM());
            int dimensionPixelSize13 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.MessageListView_streamUiOptionsOverlayMessageOptionsMarginStart, companion.getDEFAULT_MESSAGE_OPTIONS_MARGIN_START());
            int dimensionPixelSize14 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.MessageListView_streamUiOptionsOverlayMessageOptionsMarginEnd, companion.getDEFAULT_MESSAGE_OPTIONS_MARGIN_END());
            boolean z29 = typedArrayObtainStyledAttributes.getBoolean(C19469R.styleable.MessageListView_streamUiShowReactionsForUnsentMessages, false);
            boolean z34 = typedArrayObtainStyledAttributes.getBoolean(C19469R.styleable.MessageListView_streamUiReadCount, true);
            boolean z35 = typedArrayObtainStyledAttributes.getBoolean(C19469R.styleable.MessageListView_streamUiSwipeToReply, true);
            return TransformStyle.getMessageListStyleTransformer().transform(new MessageListViewStyle(scrollButtonViewStyleBuild, value, messageListItemStyleBuild, giphyViewHolderStyleInvoke, new MessageViewStyle(audioRecordPlayerViewStyleInvoke$stream_chat_android_ui_components_release, audioRecordPlayerViewStyleInvoke$stream_chat_android_ui_components_release2), messageReplyStyleInvoke, unreadLabelButtonStyleBuild, z4, color, resourceId3, z13, resourceId5, z27, resourceId6, resourceId7, resourceId8, z26, resourceId9, resourceId10, z14, resourceId12, resourceId13, z15, resourceId11, z25, typedArrayObtainStyledAttributes.getResourceId(C19469R.styleable.MessageListView_streamUiBlockUserOptionIcon, C19469R.drawable.stream_ui_ic_clear), typedArrayObtainStyledAttributes.getResourceId(C19469R.styleable.MessageListView_streamUiUnblockUserOptionIcon, C19469R.drawable.stream_ui_ic_clear), typedArrayObtainStyledAttributes.getBoolean(C19469R.styleable.MessageListView_streamUiBlockUserOptionEnabled, true), z16, z17, z18, z19, z24, textStyleBuild, textStyleBuild2, color2, color3, textStyleBuild3, color4, textStyleEmptyViewStyle, resourceId14, i15, i16, i17, dimensionPixelSize, dimensionPixelSize2, z28, dimensionPixelSize4, dimensionPixelSize3, dimensionPixelSize5, dimensionPixelSize6, dimensionPixelSize7, dimensionPixelSize8, dimensionPixelSize9, dimensionPixelSize10, dimensionPixelSize11, dimensionPixelSize12, dimensionPixelSize13, dimensionPixelSize14, z29, z34, z35, resourceId4));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public MessageListViewStyle(ScrollButtonViewStyle scrollButtonViewStyle, MessageListView.NewMessagesBehaviour scrollButtonBehaviour, MessageListItemStyle itemStyle, GiphyViewHolderStyle giphyViewHolderStyle, MessageViewStyle<AudioRecordPlayerViewStyle> audioRecordPlayerViewStyle, MessageReplyStyle replyMessageStyle, UnreadLabelButtonStyle unreadLabelButtonStyle, boolean z4, int i13, int i14, boolean z13, int i15, boolean z14, int i16, int i17, int i18, boolean z15, int i19, int i24, boolean z16, int i25, int i26, boolean z17, int i27, boolean z18, int i28, int i29, boolean z19, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, TextStyle messageOptionsText, TextStyle warningMessageOptionsText, int i34, int i35, TextStyle userReactionsTitleText, int i36, TextStyle emptyViewTextStyle, int i37, int i38, int i39, int i44, int i45, int i46, boolean z29, int i47, int i48, int i49, int i54, int i55, int i56, int i57, int i58, int i59, int i64, int i65, int i66, boolean z34, boolean z35, boolean z36, int i67) {
        AbstractC22676k.m65750j(scrollButtonViewStyle, "scrollButtonViewStyle");
        AbstractC22676k.m65750j(scrollButtonBehaviour, "scrollButtonBehaviour");
        AbstractC22676k.m65750j(itemStyle, "itemStyle");
        AbstractC22676k.m65750j(giphyViewHolderStyle, "giphyViewHolderStyle");
        AbstractC22676k.m65750j(audioRecordPlayerViewStyle, "audioRecordPlayerViewStyle");
        AbstractC22676k.m65750j(replyMessageStyle, "replyMessageStyle");
        AbstractC22676k.m65750j(unreadLabelButtonStyle, "unreadLabelButtonStyle");
        AbstractC22676k.m65750j(messageOptionsText, "messageOptionsText");
        AbstractC22676k.m65750j(warningMessageOptionsText, "warningMessageOptionsText");
        AbstractC22676k.m65750j(userReactionsTitleText, "userReactionsTitleText");
        AbstractC22676k.m65750j(emptyViewTextStyle, "emptyViewTextStyle");
        this.scrollButtonViewStyle = scrollButtonViewStyle;
        this.scrollButtonBehaviour = scrollButtonBehaviour;
        this.itemStyle = itemStyle;
        this.giphyViewHolderStyle = giphyViewHolderStyle;
        this.audioRecordPlayerViewStyle = audioRecordPlayerViewStyle;
        this.replyMessageStyle = replyMessageStyle;
        this.unreadLabelButtonStyle = unreadLabelButtonStyle;
        this.reactionsEnabled = z4;
        this.backgroundColor = i13;
        this.replyIcon = i14;
        this.replyEnabled = z13;
        this.threadReplyIcon = i15;
        this.threadsEnabled = z14;
        this.retryIcon = i16;
        this.copyIcon = i17;
        this.markAsUnreadIcon = i18;
        this.editMessageEnabled = z15;
        this.editIcon = i19;
        this.flagIcon = i24;
        this.flagEnabled = z16;
        this.pinIcon = i25;
        this.unpinIcon = i26;
        this.pinMessageEnabled = z17;
        this.deleteIcon = i27;
        this.deleteMessageEnabled = z18;
        this.blockUserIcon = i28;
        this.unblockUserIcon = i29;
        this.blockUserEnabled = z19;
        this.copyTextEnabled = z24;
        this.markAsUnreadEnabled = z25;
        this.retryMessageEnabled = z26;
        this.deleteConfirmationEnabled = z27;
        this.flagMessageConfirmationEnabled = z28;
        this.messageOptionsText = messageOptionsText;
        this.warningMessageOptionsText = warningMessageOptionsText;
        this.messageOptionsBackgroundColor = i34;
        this.userReactionsBackgroundColor = i35;
        this.userReactionsTitleText = userReactionsTitleText;
        this.optionsOverlayDimColor = i36;
        this.emptyViewTextStyle = emptyViewTextStyle;
        this.loadingView = i37;
        this.messagesStart = i38;
        this.threadMessagesStart = i39;
        this.messageOptionsUserReactionAlignment = i44;
        this.scrollButtonBottomMargin = i45;
        this.scrollButtonEndMargin = i46;
        this.disableScrollWhenShowingDialog = z29;
        this.optionsOverlayEditReactionsMarginTop = i47;
        this.optionsOverlayEditReactionsMarginBottom = i48;
        this.optionsOverlayEditReactionsMarginStart = i49;
        this.optionsOverlayEditReactionsMarginEnd = i54;
        this.optionsOverlayUserReactionsMarginTop = i55;
        this.optionsOverlayUserReactionsMarginBottom = i56;
        this.optionsOverlayUserReactionsMarginStart = i57;
        this.optionsOverlayUserReactionsMarginEnd = i58;
        this.optionsOverlayMessageOptionsMarginTop = i59;
        this.optionsOverlayMessageOptionsMarginBottom = i64;
        this.optionsOverlayMessageOptionsMarginStart = i65;
        this.optionsOverlayMessageOptionsMarginEnd = i66;
        this.showReactionsForUnsentMessages = z34;
        this.readCountEnabled = z35;
        this.swipeToReplyEnabled = z36;
        this.swipeToReplyIcon = i67;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ScrollButtonViewStyle getScrollButtonViewStyle() {
        return this.scrollButtonViewStyle;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getReplyIcon() {
        return this.replyIcon;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getReplyEnabled() {
        return this.replyEnabled;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getThreadReplyIcon() {
        return this.threadReplyIcon;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getThreadsEnabled() {
        return this.threadsEnabled;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getRetryIcon() {
        return this.retryIcon;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getCopyIcon() {
        return this.copyIcon;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getMarkAsUnreadIcon() {
        return this.markAsUnreadIcon;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getEditMessageEnabled() {
        return this.editMessageEnabled;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getEditIcon() {
        return this.editIcon;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getFlagIcon() {
        return this.flagIcon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MessageListView.NewMessagesBehaviour getScrollButtonBehaviour() {
        return this.scrollButtonBehaviour;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final boolean getFlagEnabled() {
        return this.flagEnabled;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final int getPinIcon() {
        return this.pinIcon;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final int getUnpinIcon() {
        return this.unpinIcon;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final boolean getPinMessageEnabled() {
        return this.pinMessageEnabled;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final int getDeleteIcon() {
        return this.deleteIcon;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final boolean getDeleteMessageEnabled() {
        return this.deleteMessageEnabled;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final int getBlockUserIcon() {
        return this.blockUserIcon;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final int getUnblockUserIcon() {
        return this.unblockUserIcon;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final boolean getBlockUserEnabled() {
        return this.blockUserEnabled;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final boolean getCopyTextEnabled() {
        return this.copyTextEnabled;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MessageListItemStyle getItemStyle() {
        return this.itemStyle;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final boolean getMarkAsUnreadEnabled() {
        return this.markAsUnreadEnabled;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final boolean getRetryMessageEnabled() {
        return this.retryMessageEnabled;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final boolean getDeleteConfirmationEnabled() {
        return this.deleteConfirmationEnabled;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final boolean getFlagMessageConfirmationEnabled() {
        return this.flagMessageConfirmationEnabled;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final TextStyle getMessageOptionsText() {
        return this.messageOptionsText;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final TextStyle getWarningMessageOptionsText() {
        return this.warningMessageOptionsText;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final int getMessageOptionsBackgroundColor() {
        return this.messageOptionsBackgroundColor;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final int getUserReactionsBackgroundColor() {
        return this.userReactionsBackgroundColor;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final TextStyle getUserReactionsTitleText() {
        return this.userReactionsTitleText;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final int getOptionsOverlayDimColor() {
        return this.optionsOverlayDimColor;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final GiphyViewHolderStyle getGiphyViewHolderStyle() {
        return this.giphyViewHolderStyle;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final TextStyle getEmptyViewTextStyle() {
        return this.emptyViewTextStyle;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final int getLoadingView() {
        return this.loadingView;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final int getMessagesStart() {
        return this.messagesStart;
    }

    /* JADX INFO: renamed from: component43, reason: from getter */
    public final int getThreadMessagesStart() {
        return this.threadMessagesStart;
    }

    /* JADX INFO: renamed from: component44, reason: from getter */
    public final int getMessageOptionsUserReactionAlignment() {
        return this.messageOptionsUserReactionAlignment;
    }

    /* JADX INFO: renamed from: component45, reason: from getter */
    public final int getScrollButtonBottomMargin() {
        return this.scrollButtonBottomMargin;
    }

    /* JADX INFO: renamed from: component46, reason: from getter */
    public final int getScrollButtonEndMargin() {
        return this.scrollButtonEndMargin;
    }

    /* JADX INFO: renamed from: component47, reason: from getter */
    public final boolean getDisableScrollWhenShowingDialog() {
        return this.disableScrollWhenShowingDialog;
    }

    /* JADX INFO: renamed from: component48, reason: from getter */
    public final int getOptionsOverlayEditReactionsMarginTop() {
        return this.optionsOverlayEditReactionsMarginTop;
    }

    /* JADX INFO: renamed from: component49, reason: from getter */
    public final int getOptionsOverlayEditReactionsMarginBottom() {
        return this.optionsOverlayEditReactionsMarginBottom;
    }

    public final MessageViewStyle<AudioRecordPlayerViewStyle> component5() {
        return this.audioRecordPlayerViewStyle;
    }

    /* JADX INFO: renamed from: component50, reason: from getter */
    public final int getOptionsOverlayEditReactionsMarginStart() {
        return this.optionsOverlayEditReactionsMarginStart;
    }

    /* JADX INFO: renamed from: component51, reason: from getter */
    public final int getOptionsOverlayEditReactionsMarginEnd() {
        return this.optionsOverlayEditReactionsMarginEnd;
    }

    /* JADX INFO: renamed from: component52, reason: from getter */
    public final int getOptionsOverlayUserReactionsMarginTop() {
        return this.optionsOverlayUserReactionsMarginTop;
    }

    /* JADX INFO: renamed from: component53, reason: from getter */
    public final int getOptionsOverlayUserReactionsMarginBottom() {
        return this.optionsOverlayUserReactionsMarginBottom;
    }

    /* JADX INFO: renamed from: component54, reason: from getter */
    public final int getOptionsOverlayUserReactionsMarginStart() {
        return this.optionsOverlayUserReactionsMarginStart;
    }

    /* JADX INFO: renamed from: component55, reason: from getter */
    public final int getOptionsOverlayUserReactionsMarginEnd() {
        return this.optionsOverlayUserReactionsMarginEnd;
    }

    /* JADX INFO: renamed from: component56, reason: from getter */
    public final int getOptionsOverlayMessageOptionsMarginTop() {
        return this.optionsOverlayMessageOptionsMarginTop;
    }

    /* JADX INFO: renamed from: component57, reason: from getter */
    public final int getOptionsOverlayMessageOptionsMarginBottom() {
        return this.optionsOverlayMessageOptionsMarginBottom;
    }

    /* JADX INFO: renamed from: component58, reason: from getter */
    public final int getOptionsOverlayMessageOptionsMarginStart() {
        return this.optionsOverlayMessageOptionsMarginStart;
    }

    /* JADX INFO: renamed from: component59, reason: from getter */
    public final int getOptionsOverlayMessageOptionsMarginEnd() {
        return this.optionsOverlayMessageOptionsMarginEnd;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final MessageReplyStyle getReplyMessageStyle() {
        return this.replyMessageStyle;
    }

    /* JADX INFO: renamed from: component60, reason: from getter */
    public final boolean getShowReactionsForUnsentMessages() {
        return this.showReactionsForUnsentMessages;
    }

    /* JADX INFO: renamed from: component61, reason: from getter */
    public final boolean getReadCountEnabled() {
        return this.readCountEnabled;
    }

    /* JADX INFO: renamed from: component62, reason: from getter */
    public final boolean getSwipeToReplyEnabled() {
        return this.swipeToReplyEnabled;
    }

    /* JADX INFO: renamed from: component63, reason: from getter */
    public final int getSwipeToReplyIcon() {
        return this.swipeToReplyIcon;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final UnreadLabelButtonStyle getUnreadLabelButtonStyle() {
        return this.unreadLabelButtonStyle;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getReactionsEnabled() {
        return this.reactionsEnabled;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final MessageListViewStyle copy(ScrollButtonViewStyle scrollButtonViewStyle, MessageListView.NewMessagesBehaviour scrollButtonBehaviour, MessageListItemStyle itemStyle, GiphyViewHolderStyle giphyViewHolderStyle, MessageViewStyle<AudioRecordPlayerViewStyle> audioRecordPlayerViewStyle, MessageReplyStyle replyMessageStyle, UnreadLabelButtonStyle unreadLabelButtonStyle, boolean reactionsEnabled, int backgroundColor, int replyIcon, boolean replyEnabled, int threadReplyIcon, boolean threadsEnabled, int retryIcon, int copyIcon, int markAsUnreadIcon, boolean editMessageEnabled, int editIcon, int flagIcon, boolean flagEnabled, int pinIcon, int unpinIcon, boolean pinMessageEnabled, int deleteIcon, boolean deleteMessageEnabled, int blockUserIcon, int unblockUserIcon, boolean blockUserEnabled, boolean copyTextEnabled, boolean markAsUnreadEnabled, boolean retryMessageEnabled, boolean deleteConfirmationEnabled, boolean flagMessageConfirmationEnabled, TextStyle messageOptionsText, TextStyle warningMessageOptionsText, int messageOptionsBackgroundColor, int userReactionsBackgroundColor, TextStyle userReactionsTitleText, int optionsOverlayDimColor, TextStyle emptyViewTextStyle, int loadingView, int messagesStart, int threadMessagesStart, int messageOptionsUserReactionAlignment, int scrollButtonBottomMargin, int scrollButtonEndMargin, boolean disableScrollWhenShowingDialog, int optionsOverlayEditReactionsMarginTop, int optionsOverlayEditReactionsMarginBottom, int optionsOverlayEditReactionsMarginStart, int optionsOverlayEditReactionsMarginEnd, int optionsOverlayUserReactionsMarginTop, int optionsOverlayUserReactionsMarginBottom, int optionsOverlayUserReactionsMarginStart, int optionsOverlayUserReactionsMarginEnd, int optionsOverlayMessageOptionsMarginTop, int optionsOverlayMessageOptionsMarginBottom, int optionsOverlayMessageOptionsMarginStart, int optionsOverlayMessageOptionsMarginEnd, boolean showReactionsForUnsentMessages, boolean readCountEnabled, boolean swipeToReplyEnabled, int swipeToReplyIcon) {
        AbstractC22676k.m65750j(scrollButtonViewStyle, "scrollButtonViewStyle");
        AbstractC22676k.m65750j(scrollButtonBehaviour, "scrollButtonBehaviour");
        AbstractC22676k.m65750j(itemStyle, "itemStyle");
        AbstractC22676k.m65750j(giphyViewHolderStyle, "giphyViewHolderStyle");
        AbstractC22676k.m65750j(audioRecordPlayerViewStyle, "audioRecordPlayerViewStyle");
        AbstractC22676k.m65750j(replyMessageStyle, "replyMessageStyle");
        AbstractC22676k.m65750j(unreadLabelButtonStyle, "unreadLabelButtonStyle");
        AbstractC22676k.m65750j(messageOptionsText, "messageOptionsText");
        AbstractC22676k.m65750j(warningMessageOptionsText, "warningMessageOptionsText");
        AbstractC22676k.m65750j(userReactionsTitleText, "userReactionsTitleText");
        AbstractC22676k.m65750j(emptyViewTextStyle, "emptyViewTextStyle");
        return new MessageListViewStyle(scrollButtonViewStyle, scrollButtonBehaviour, itemStyle, giphyViewHolderStyle, audioRecordPlayerViewStyle, replyMessageStyle, unreadLabelButtonStyle, reactionsEnabled, backgroundColor, replyIcon, replyEnabled, threadReplyIcon, threadsEnabled, retryIcon, copyIcon, markAsUnreadIcon, editMessageEnabled, editIcon, flagIcon, flagEnabled, pinIcon, unpinIcon, pinMessageEnabled, deleteIcon, deleteMessageEnabled, blockUserIcon, unblockUserIcon, blockUserEnabled, copyTextEnabled, markAsUnreadEnabled, retryMessageEnabled, deleteConfirmationEnabled, flagMessageConfirmationEnabled, messageOptionsText, warningMessageOptionsText, messageOptionsBackgroundColor, userReactionsBackgroundColor, userReactionsTitleText, optionsOverlayDimColor, emptyViewTextStyle, loadingView, messagesStart, threadMessagesStart, messageOptionsUserReactionAlignment, scrollButtonBottomMargin, scrollButtonEndMargin, disableScrollWhenShowingDialog, optionsOverlayEditReactionsMarginTop, optionsOverlayEditReactionsMarginBottom, optionsOverlayEditReactionsMarginStart, optionsOverlayEditReactionsMarginEnd, optionsOverlayUserReactionsMarginTop, optionsOverlayUserReactionsMarginBottom, optionsOverlayUserReactionsMarginStart, optionsOverlayUserReactionsMarginEnd, optionsOverlayMessageOptionsMarginTop, optionsOverlayMessageOptionsMarginBottom, optionsOverlayMessageOptionsMarginStart, optionsOverlayMessageOptionsMarginEnd, showReactionsForUnsentMessages, readCountEnabled, swipeToReplyEnabled, swipeToReplyIcon);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageListViewStyle)) {
            return false;
        }
        MessageListViewStyle messageListViewStyle = (MessageListViewStyle) other;
        return AbstractC22676k.m65745e(this.scrollButtonViewStyle, messageListViewStyle.scrollButtonViewStyle) && this.scrollButtonBehaviour == messageListViewStyle.scrollButtonBehaviour && AbstractC22676k.m65745e(this.itemStyle, messageListViewStyle.itemStyle) && AbstractC22676k.m65745e(this.giphyViewHolderStyle, messageListViewStyle.giphyViewHolderStyle) && AbstractC22676k.m65745e(this.audioRecordPlayerViewStyle, messageListViewStyle.audioRecordPlayerViewStyle) && AbstractC22676k.m65745e(this.replyMessageStyle, messageListViewStyle.replyMessageStyle) && AbstractC22676k.m65745e(this.unreadLabelButtonStyle, messageListViewStyle.unreadLabelButtonStyle) && this.reactionsEnabled == messageListViewStyle.reactionsEnabled && this.backgroundColor == messageListViewStyle.backgroundColor && this.replyIcon == messageListViewStyle.replyIcon && this.replyEnabled == messageListViewStyle.replyEnabled && this.threadReplyIcon == messageListViewStyle.threadReplyIcon && this.threadsEnabled == messageListViewStyle.threadsEnabled && this.retryIcon == messageListViewStyle.retryIcon && this.copyIcon == messageListViewStyle.copyIcon && this.markAsUnreadIcon == messageListViewStyle.markAsUnreadIcon && this.editMessageEnabled == messageListViewStyle.editMessageEnabled && this.editIcon == messageListViewStyle.editIcon && this.flagIcon == messageListViewStyle.flagIcon && this.flagEnabled == messageListViewStyle.flagEnabled && this.pinIcon == messageListViewStyle.pinIcon && this.unpinIcon == messageListViewStyle.unpinIcon && this.pinMessageEnabled == messageListViewStyle.pinMessageEnabled && this.deleteIcon == messageListViewStyle.deleteIcon && this.deleteMessageEnabled == messageListViewStyle.deleteMessageEnabled && this.blockUserIcon == messageListViewStyle.blockUserIcon && this.unblockUserIcon == messageListViewStyle.unblockUserIcon && this.blockUserEnabled == messageListViewStyle.blockUserEnabled && this.copyTextEnabled == messageListViewStyle.copyTextEnabled && this.markAsUnreadEnabled == messageListViewStyle.markAsUnreadEnabled && this.retryMessageEnabled == messageListViewStyle.retryMessageEnabled && this.deleteConfirmationEnabled == messageListViewStyle.deleteConfirmationEnabled && this.flagMessageConfirmationEnabled == messageListViewStyle.flagMessageConfirmationEnabled && AbstractC22676k.m65745e(this.messageOptionsText, messageListViewStyle.messageOptionsText) && AbstractC22676k.m65745e(this.warningMessageOptionsText, messageListViewStyle.warningMessageOptionsText) && this.messageOptionsBackgroundColor == messageListViewStyle.messageOptionsBackgroundColor && this.userReactionsBackgroundColor == messageListViewStyle.userReactionsBackgroundColor && AbstractC22676k.m65745e(this.userReactionsTitleText, messageListViewStyle.userReactionsTitleText) && this.optionsOverlayDimColor == messageListViewStyle.optionsOverlayDimColor && AbstractC22676k.m65745e(this.emptyViewTextStyle, messageListViewStyle.emptyViewTextStyle) && this.loadingView == messageListViewStyle.loadingView && this.messagesStart == messageListViewStyle.messagesStart && this.threadMessagesStart == messageListViewStyle.threadMessagesStart && this.messageOptionsUserReactionAlignment == messageListViewStyle.messageOptionsUserReactionAlignment && this.scrollButtonBottomMargin == messageListViewStyle.scrollButtonBottomMargin && this.scrollButtonEndMargin == messageListViewStyle.scrollButtonEndMargin && this.disableScrollWhenShowingDialog == messageListViewStyle.disableScrollWhenShowingDialog && this.optionsOverlayEditReactionsMarginTop == messageListViewStyle.optionsOverlayEditReactionsMarginTop && this.optionsOverlayEditReactionsMarginBottom == messageListViewStyle.optionsOverlayEditReactionsMarginBottom && this.optionsOverlayEditReactionsMarginStart == messageListViewStyle.optionsOverlayEditReactionsMarginStart && this.optionsOverlayEditReactionsMarginEnd == messageListViewStyle.optionsOverlayEditReactionsMarginEnd && this.optionsOverlayUserReactionsMarginTop == messageListViewStyle.optionsOverlayUserReactionsMarginTop && this.optionsOverlayUserReactionsMarginBottom == messageListViewStyle.optionsOverlayUserReactionsMarginBottom && this.optionsOverlayUserReactionsMarginStart == messageListViewStyle.optionsOverlayUserReactionsMarginStart && this.optionsOverlayUserReactionsMarginEnd == messageListViewStyle.optionsOverlayUserReactionsMarginEnd && this.optionsOverlayMessageOptionsMarginTop == messageListViewStyle.optionsOverlayMessageOptionsMarginTop && this.optionsOverlayMessageOptionsMarginBottom == messageListViewStyle.optionsOverlayMessageOptionsMarginBottom && this.optionsOverlayMessageOptionsMarginStart == messageListViewStyle.optionsOverlayMessageOptionsMarginStart && this.optionsOverlayMessageOptionsMarginEnd == messageListViewStyle.optionsOverlayMessageOptionsMarginEnd && this.showReactionsForUnsentMessages == messageListViewStyle.showReactionsForUnsentMessages && this.readCountEnabled == messageListViewStyle.readCountEnabled && this.swipeToReplyEnabled == messageListViewStyle.swipeToReplyEnabled && this.swipeToReplyIcon == messageListViewStyle.swipeToReplyIcon;
    }

    public final MessageViewStyle<AudioRecordPlayerViewStyle> getAudioRecordPlayerViewStyle() {
        return this.audioRecordPlayerViewStyle;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final boolean getBlockUserEnabled() {
        return this.blockUserEnabled;
    }

    public final int getBlockUserIcon() {
        return this.blockUserIcon;
    }

    public final int getCopyIcon() {
        return this.copyIcon;
    }

    public final boolean getCopyTextEnabled() {
        return this.copyTextEnabled;
    }

    public final boolean getDeleteConfirmationEnabled() {
        return this.deleteConfirmationEnabled;
    }

    public final int getDeleteIcon() {
        return this.deleteIcon;
    }

    public final boolean getDeleteMessageEnabled() {
        return this.deleteMessageEnabled;
    }

    public final boolean getDisableScrollWhenShowingDialog() {
        return this.disableScrollWhenShowingDialog;
    }

    public final int getEditIcon() {
        return this.editIcon;
    }

    public final boolean getEditMessageEnabled() {
        return this.editMessageEnabled;
    }

    public final TextStyle getEmptyViewTextStyle() {
        return this.emptyViewTextStyle;
    }

    public final boolean getFlagEnabled() {
        return this.flagEnabled;
    }

    public final int getFlagIcon() {
        return this.flagIcon;
    }

    public final boolean getFlagMessageConfirmationEnabled() {
        return this.flagMessageConfirmationEnabled;
    }

    public final GiphyViewHolderStyle getGiphyViewHolderStyle() {
        return this.giphyViewHolderStyle;
    }

    public final MessageListItemStyle getItemStyle() {
        return this.itemStyle;
    }

    public final int getLoadingView() {
        return this.loadingView;
    }

    public final boolean getMarkAsUnreadEnabled() {
        return this.markAsUnreadEnabled;
    }

    public final int getMarkAsUnreadIcon() {
        return this.markAsUnreadIcon;
    }

    public final int getMessageOptionsBackgroundColor() {
        return this.messageOptionsBackgroundColor;
    }

    public final TextStyle getMessageOptionsText() {
        return this.messageOptionsText;
    }

    public final int getMessageOptionsUserReactionAlignment() {
        return this.messageOptionsUserReactionAlignment;
    }

    public final int getMessagesStart() {
        return this.messagesStart;
    }

    public final int getOptionsOverlayDimColor() {
        return this.optionsOverlayDimColor;
    }

    public final int getOptionsOverlayEditReactionsMarginBottom() {
        return this.optionsOverlayEditReactionsMarginBottom;
    }

    public final int getOptionsOverlayEditReactionsMarginEnd() {
        return this.optionsOverlayEditReactionsMarginEnd;
    }

    public final int getOptionsOverlayEditReactionsMarginStart() {
        return this.optionsOverlayEditReactionsMarginStart;
    }

    public final int getOptionsOverlayEditReactionsMarginTop() {
        return this.optionsOverlayEditReactionsMarginTop;
    }

    public final int getOptionsOverlayMessageOptionsMarginBottom() {
        return this.optionsOverlayMessageOptionsMarginBottom;
    }

    public final int getOptionsOverlayMessageOptionsMarginEnd() {
        return this.optionsOverlayMessageOptionsMarginEnd;
    }

    public final int getOptionsOverlayMessageOptionsMarginStart() {
        return this.optionsOverlayMessageOptionsMarginStart;
    }

    public final int getOptionsOverlayMessageOptionsMarginTop() {
        return this.optionsOverlayMessageOptionsMarginTop;
    }

    public final int getOptionsOverlayUserReactionsMarginBottom() {
        return this.optionsOverlayUserReactionsMarginBottom;
    }

    public final int getOptionsOverlayUserReactionsMarginEnd() {
        return this.optionsOverlayUserReactionsMarginEnd;
    }

    public final int getOptionsOverlayUserReactionsMarginStart() {
        return this.optionsOverlayUserReactionsMarginStart;
    }

    public final int getOptionsOverlayUserReactionsMarginTop() {
        return this.optionsOverlayUserReactionsMarginTop;
    }

    public final int getPinIcon() {
        return this.pinIcon;
    }

    public final boolean getPinMessageEnabled() {
        return this.pinMessageEnabled;
    }

    public final boolean getReactionsEnabled() {
        return this.reactionsEnabled;
    }

    public final boolean getReadCountEnabled() {
        return this.readCountEnabled;
    }

    public final boolean getReplyEnabled() {
        return this.replyEnabled;
    }

    public final int getReplyIcon() {
        return this.replyIcon;
    }

    public final MessageReplyStyle getReplyMessageStyle() {
        return this.replyMessageStyle;
    }

    public final int getRetryIcon() {
        return this.retryIcon;
    }

    public final boolean getRetryMessageEnabled() {
        return this.retryMessageEnabled;
    }

    public final MessageListView.NewMessagesBehaviour getScrollButtonBehaviour() {
        return this.scrollButtonBehaviour;
    }

    public final int getScrollButtonBottomMargin() {
        return this.scrollButtonBottomMargin;
    }

    public final int getScrollButtonEndMargin() {
        return this.scrollButtonEndMargin;
    }

    public final ScrollButtonViewStyle getScrollButtonViewStyle() {
        return this.scrollButtonViewStyle;
    }

    public final boolean getShowReactionsForUnsentMessages() {
        return this.showReactionsForUnsentMessages;
    }

    public final boolean getSwipeToReplyEnabled() {
        return this.swipeToReplyEnabled;
    }

    public final int getSwipeToReplyIcon() {
        return this.swipeToReplyIcon;
    }

    public final int getThreadMessagesStart() {
        return this.threadMessagesStart;
    }

    public final int getThreadReplyIcon() {
        return this.threadReplyIcon;
    }

    public final boolean getThreadsEnabled() {
        return this.threadsEnabled;
    }

    public final int getUnblockUserIcon() {
        return this.unblockUserIcon;
    }

    public final int getUnpinIcon() {
        return this.unpinIcon;
    }

    public final UnreadLabelButtonStyle getUnreadLabelButtonStyle() {
        return this.unreadLabelButtonStyle;
    }

    public final int getUserReactionsBackgroundColor() {
        return this.userReactionsBackgroundColor;
    }

    public final TextStyle getUserReactionsTitleText() {
        return this.userReactionsTitleText;
    }

    public final TextStyle getWarningMessageOptionsText() {
        return this.warningMessageOptionsText;
    }

    public final int hashCode() {
        return Integer.hashCode(this.swipeToReplyIcon) + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.optionsOverlayMessageOptionsMarginEnd, AbstractC11266d.m30448b(this.optionsOverlayMessageOptionsMarginStart, AbstractC11266d.m30448b(this.optionsOverlayMessageOptionsMarginBottom, AbstractC11266d.m30448b(this.optionsOverlayMessageOptionsMarginTop, AbstractC11266d.m30448b(this.optionsOverlayUserReactionsMarginEnd, AbstractC11266d.m30448b(this.optionsOverlayUserReactionsMarginStart, AbstractC11266d.m30448b(this.optionsOverlayUserReactionsMarginBottom, AbstractC11266d.m30448b(this.optionsOverlayUserReactionsMarginTop, AbstractC11266d.m30448b(this.optionsOverlayEditReactionsMarginEnd, AbstractC11266d.m30448b(this.optionsOverlayEditReactionsMarginStart, AbstractC11266d.m30448b(this.optionsOverlayEditReactionsMarginBottom, AbstractC11266d.m30448b(this.optionsOverlayEditReactionsMarginTop, AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.scrollButtonEndMargin, AbstractC11266d.m30448b(this.scrollButtonBottomMargin, AbstractC11266d.m30448b(this.messageOptionsUserReactionAlignment, AbstractC11266d.m30448b(this.threadMessagesStart, AbstractC11266d.m30448b(this.messagesStart, AbstractC11266d.m30448b(this.loadingView, AbstractC26725a.m79499c(this.emptyViewTextStyle, AbstractC11266d.m30448b(this.optionsOverlayDimColor, AbstractC26725a.m79499c(this.userReactionsTitleText, AbstractC11266d.m30448b(this.userReactionsBackgroundColor, AbstractC11266d.m30448b(this.messageOptionsBackgroundColor, AbstractC26725a.m79499c(this.warningMessageOptionsText, AbstractC26725a.m79499c(this.messageOptionsText, AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.unblockUserIcon, AbstractC11266d.m30448b(this.blockUserIcon, AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.deleteIcon, AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.unpinIcon, AbstractC11266d.m30448b(this.pinIcon, AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.flagIcon, AbstractC11266d.m30448b(this.editIcon, AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.markAsUnreadIcon, AbstractC11266d.m30448b(this.copyIcon, AbstractC11266d.m30448b(this.retryIcon, AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.threadReplyIcon, AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.replyIcon, AbstractC11266d.m30448b(this.backgroundColor, AbstractC2875y.m8289b((this.unreadLabelButtonStyle.hashCode() + ((this.replyMessageStyle.hashCode() + ((this.audioRecordPlayerViewStyle.hashCode() + ((this.giphyViewHolderStyle.hashCode() + ((this.itemStyle.hashCode() + ((this.scrollButtonBehaviour.hashCode() + (this.scrollButtonViewStyle.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.reactionsEnabled), 31), 31), 31, this.replyEnabled), 31), 31, this.threadsEnabled), 31), 31), 31), 31, this.editMessageEnabled), 31), 31), 31, this.flagEnabled), 31), 31), 31, this.pinMessageEnabled), 31), 31, this.deleteMessageEnabled), 31), 31), 31, this.blockUserEnabled), 31, this.copyTextEnabled), 31, this.markAsUnreadEnabled), 31, this.retryMessageEnabled), 31, this.deleteConfirmationEnabled), 31, this.flagMessageConfirmationEnabled), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31, this.disableScrollWhenShowingDialog), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31, this.showReactionsForUnsentMessages), 31, this.readCountEnabled), 31, this.swipeToReplyEnabled);
    }

    public final String toString() {
        ScrollButtonViewStyle scrollButtonViewStyle = this.scrollButtonViewStyle;
        MessageListView.NewMessagesBehaviour newMessagesBehaviour = this.scrollButtonBehaviour;
        MessageListItemStyle messageListItemStyle = this.itemStyle;
        GiphyViewHolderStyle giphyViewHolderStyle = this.giphyViewHolderStyle;
        MessageViewStyle<AudioRecordPlayerViewStyle> messageViewStyle = this.audioRecordPlayerViewStyle;
        MessageReplyStyle messageReplyStyle = this.replyMessageStyle;
        UnreadLabelButtonStyle unreadLabelButtonStyle = this.unreadLabelButtonStyle;
        boolean z4 = this.reactionsEnabled;
        int i13 = this.backgroundColor;
        int i14 = this.replyIcon;
        boolean z13 = this.replyEnabled;
        int i15 = this.threadReplyIcon;
        boolean z14 = this.threadsEnabled;
        int i16 = this.retryIcon;
        int i17 = this.copyIcon;
        int i18 = this.markAsUnreadIcon;
        boolean z15 = this.editMessageEnabled;
        int i19 = this.editIcon;
        int i24 = this.flagIcon;
        boolean z16 = this.flagEnabled;
        int i25 = this.pinIcon;
        int i26 = this.unpinIcon;
        boolean z17 = this.pinMessageEnabled;
        int i27 = this.deleteIcon;
        boolean z18 = this.deleteMessageEnabled;
        int i28 = this.blockUserIcon;
        int i29 = this.unblockUserIcon;
        boolean z19 = this.blockUserEnabled;
        boolean z24 = this.copyTextEnabled;
        boolean z25 = this.markAsUnreadEnabled;
        boolean z26 = this.retryMessageEnabled;
        boolean z27 = this.deleteConfirmationEnabled;
        boolean z28 = this.flagMessageConfirmationEnabled;
        TextStyle textStyle = this.messageOptionsText;
        TextStyle textStyle2 = this.warningMessageOptionsText;
        int i34 = this.messageOptionsBackgroundColor;
        int i35 = this.userReactionsBackgroundColor;
        TextStyle textStyle3 = this.userReactionsTitleText;
        int i36 = this.optionsOverlayDimColor;
        TextStyle textStyle4 = this.emptyViewTextStyle;
        int i37 = this.loadingView;
        int i38 = this.messagesStart;
        int i39 = this.threadMessagesStart;
        int i44 = this.messageOptionsUserReactionAlignment;
        int i45 = this.scrollButtonBottomMargin;
        int i46 = this.scrollButtonEndMargin;
        boolean z29 = this.disableScrollWhenShowingDialog;
        int i47 = this.optionsOverlayEditReactionsMarginTop;
        int i48 = this.optionsOverlayEditReactionsMarginBottom;
        int i49 = this.optionsOverlayEditReactionsMarginStart;
        int i54 = this.optionsOverlayEditReactionsMarginEnd;
        int i55 = this.optionsOverlayUserReactionsMarginTop;
        int i56 = this.optionsOverlayUserReactionsMarginBottom;
        int i57 = this.optionsOverlayUserReactionsMarginStart;
        int i58 = this.optionsOverlayUserReactionsMarginEnd;
        int i59 = this.optionsOverlayMessageOptionsMarginTop;
        int i64 = this.optionsOverlayMessageOptionsMarginBottom;
        int i65 = this.optionsOverlayMessageOptionsMarginStart;
        int i66 = this.optionsOverlayMessageOptionsMarginEnd;
        boolean z34 = this.showReactionsForUnsentMessages;
        boolean z35 = this.readCountEnabled;
        boolean z36 = this.swipeToReplyEnabled;
        int i67 = this.swipeToReplyIcon;
        StringBuilder sb4 = new StringBuilder("MessageListViewStyle(scrollButtonViewStyle=");
        sb4.append(scrollButtonViewStyle);
        sb4.append(", scrollButtonBehaviour=");
        sb4.append(newMessagesBehaviour);
        sb4.append(", itemStyle=");
        sb4.append(messageListItemStyle);
        sb4.append(", giphyViewHolderStyle=");
        sb4.append(giphyViewHolderStyle);
        sb4.append(", audioRecordPlayerViewStyle=");
        sb4.append(messageViewStyle);
        sb4.append(", replyMessageStyle=");
        sb4.append(messageReplyStyle);
        sb4.append(", unreadLabelButtonStyle=");
        sb4.append(unreadLabelButtonStyle);
        sb4.append(", reactionsEnabled=");
        sb4.append(z4);
        sb4.append(", backgroundColor=");
        AbstractC30802r.m94773v(sb4, i13, ", replyIcon=", i14, ", replyEnabled=");
        AbstractC30802r.m94769r(i15, ", threadReplyIcon=", ", threadsEnabled=", sb4, z13);
        AbstractC30802r.m94769r(i16, ", retryIcon=", ", copyIcon=", sb4, z14);
        AbstractC30802r.m94773v(sb4, i17, ", markAsUnreadIcon=", i18, ", editMessageEnabled=");
        AbstractC30802r.m94769r(i19, ", editIcon=", ", flagIcon=", sb4, z15);
        AbstractC13673n.m38573t(i24, ", flagEnabled=", ", pinIcon=", sb4, z16);
        AbstractC30802r.m94773v(sb4, i25, ", unpinIcon=", i26, ", pinMessageEnabled=");
        AbstractC30802r.m94769r(i27, ", deleteIcon=", ", deleteMessageEnabled=", sb4, z17);
        AbstractC30802r.m94769r(i28, ", blockUserIcon=", ", unblockUserIcon=", sb4, z18);
        AbstractC13673n.m38573t(i29, ", blockUserEnabled=", ", copyTextEnabled=", sb4, z19);
        AbstractC38963t7.m124392v(sb4, z24, ", markAsUnreadEnabled=", z25, ", retryMessageEnabled=");
        AbstractC38963t7.m124392v(sb4, z26, ", deleteConfirmationEnabled=", z27, ", flagMessageConfirmationEnabled=");
        sb4.append(z28);
        sb4.append(", messageOptionsText=");
        sb4.append(textStyle);
        sb4.append(", warningMessageOptionsText=");
        sb4.append(textStyle2);
        sb4.append(", messageOptionsBackgroundColor=");
        sb4.append(i34);
        sb4.append(", userReactionsBackgroundColor=");
        sb4.append(i35);
        sb4.append(", userReactionsTitleText=");
        sb4.append(textStyle3);
        sb4.append(", optionsOverlayDimColor=");
        sb4.append(i36);
        sb4.append(", emptyViewTextStyle=");
        sb4.append(textStyle4);
        sb4.append(", loadingView=");
        AbstractC30802r.m94773v(sb4, i37, ", messagesStart=", i38, ", threadMessagesStart=");
        AbstractC30802r.m94773v(sb4, i39, ", messageOptionsUserReactionAlignment=", i44, ", scrollButtonBottomMargin=");
        AbstractC30802r.m94773v(sb4, i45, ", scrollButtonEndMargin=", i46, ", disableScrollWhenShowingDialog=");
        AbstractC30802r.m94769r(i47, ", optionsOverlayEditReactionsMarginTop=", ", optionsOverlayEditReactionsMarginBottom=", sb4, z29);
        AbstractC30802r.m94773v(sb4, i48, ", optionsOverlayEditReactionsMarginStart=", i49, ", optionsOverlayEditReactionsMarginEnd=");
        AbstractC30802r.m94773v(sb4, i54, ", optionsOverlayUserReactionsMarginTop=", i55, ", optionsOverlayUserReactionsMarginBottom=");
        AbstractC30802r.m94773v(sb4, i56, ", optionsOverlayUserReactionsMarginStart=", i57, ", optionsOverlayUserReactionsMarginEnd=");
        AbstractC30802r.m94773v(sb4, i58, ", optionsOverlayMessageOptionsMarginTop=", i59, ", optionsOverlayMessageOptionsMarginBottom=");
        AbstractC30802r.m94773v(sb4, i64, ", optionsOverlayMessageOptionsMarginStart=", i65, ", optionsOverlayMessageOptionsMarginEnd=");
        AbstractC13673n.m38573t(i66, ", showReactionsForUnsentMessages=", ", readCountEnabled=", sb4, z34);
        AbstractC38963t7.m124392v(sb4, z35, ", swipeToReplyEnabled=", z36, ", swipeToReplyIcon=");
        return AbstractC18489d0.m53371l(sb4, i67, ")");
    }
}
