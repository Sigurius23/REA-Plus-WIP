package io.getstream.chat.android.p226ui.feature.messages.list;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.common.C19470R;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.edit.EditReactionsViewStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.view.ViewReactionsViewStyle;
import io.getstream.chat.android.p226ui.font.TextStyle;
import io.getstream.chat.android.p226ui.helper.TransformStyle;
import io.getstream.chat.android.p226ui.helper.ViewStyle;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.TypedArrayKt;
import l83.InterfaceC23462h;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p479s4.AbstractC32122c;
import p513u4.AbstractC34523k;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u007f\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u0000 ¹\u00012\u00020\u0001:\u0004¹\u0001º\u0001BË\u0003\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020\u001d\u0012\u0006\u0010\"\u001a\u00020\u000b\u0012\b\b\u0001\u0010#\u001a\u00020\u0003\u0012\u0006\u0010$\u001a\u00020\u000b\u0012\b\b\u0001\u0010%\u001a\u00020\u0003\u0012\b\b\u0001\u0010&\u001a\u00020\u0003\u0012\b\b\u0001\u0010'\u001a\u00020(\u0012\b\b\u0001\u0010)\u001a\u00020\u0003\u0012\b\b\u0001\u0010*\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020\u000b\u0012\u0006\u0010,\u001a\u00020\u000b\u0012\u0006\u0010-\u001a\u00020\u000b\u0012\u0006\u0010.\u001a\u00020\u001d\u0012\b\b\u0001\u0010/\u001a\u00020\u0003\u0012\b\b\u0001\u00100\u001a\u00020\u0003\u0012\b\b\u0001\u00101\u001a\u00020\u0003\u0012\u0006\u00102\u001a\u00020(\u0012\u0006\u00103\u001a\u00020(\u0012\u0006\u00104\u001a\u000205\u0012\u0006\u00106\u001a\u00020\u001d\u0012\u0006\u00107\u001a\u00020\u001d\u0012\u0006\u00108\u001a\u00020\u0003\u0012\b\b\u0001\u00109\u001a\u00020\u0003\u0012\b\b\u0001\u0010:\u001a\u00020\u0003\u0012\u0006\u0010;\u001a\u00020\u000b¢\u0006\u0004\b<\u0010=J\u0017\u0010z\u001a\u0004\u0018\u00010\u00032\u0006\u0010{\u001a\u000205H\u0007¢\u0006\u0002\u0010|J\u0017\u0010}\u001a\u0004\u0018\u00010\u00032\u0006\u0010{\u001a\u000205H\u0007¢\u0006\u0002\u0010|J\u0010\u0010~\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010?J\u0010\u0010\u007f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010?J\u0011\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010?J\u0011\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010?J\n\u0010\u0082\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010\u0089\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010\u008f\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010\u0090\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010\u0092\u0001\u001a\u00020\u0019HÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\u001bHÆ\u0003J\n\u0010\u0094\u0001\u001a\u00020\u001dHÆ\u0003J\n\u0010\u0095\u0001\u001a\u00020\u001dHÆ\u0003J\n\u0010\u0096\u0001\u001a\u00020\u001dHÆ\u0003J\n\u0010\u0097\u0001\u001a\u00020\u001dHÆ\u0003J\n\u0010\u0098\u0001\u001a\u00020\u001dHÆ\u0003J\n\u0010\u0099\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010\u009a\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009b\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010\u009c\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009d\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009e\u0001\u001a\u00020(HÆ\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010 \u0001\u001a\u00020(HÆ\u0003J\n\u0010¡\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010¢\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010£\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010¤\u0001\u001a\u00020\u001dHÆ\u0003J\n\u0010¥\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¦\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010§\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¨\u0001\u001a\u00020(HÆ\u0003J\n\u0010©\u0001\u001a\u00020(HÆ\u0003J\n\u0010ª\u0001\u001a\u000205HÆ\u0003J\n\u0010«\u0001\u001a\u00020\u001dHÆ\u0003J\n\u0010¬\u0001\u001a\u00020\u001dHÆ\u0003J\n\u0010\u00ad\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010®\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¯\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010°\u0001\u001a\u00020\u000bHÆ\u0003J\u0096\u0004\u0010±\u0001\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0003\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001d2\b\b\u0002\u0010!\u001a\u00020\u001d2\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0003\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u000b2\b\b\u0003\u0010%\u001a\u00020\u00032\b\b\u0003\u0010&\u001a\u00020\u00032\b\b\u0003\u0010'\u001a\u00020(2\b\b\u0003\u0010)\u001a\u00020\u00032\b\b\u0003\u0010*\u001a\u00020(2\b\b\u0002\u0010+\u001a\u00020\u000b2\b\b\u0002\u0010,\u001a\u00020\u000b2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020\u001d2\b\b\u0003\u0010/\u001a\u00020\u00032\b\b\u0003\u00100\u001a\u00020\u00032\b\b\u0003\u00101\u001a\u00020\u00032\b\b\u0002\u00102\u001a\u00020(2\b\b\u0002\u00103\u001a\u00020(2\b\b\u0002\u00104\u001a\u0002052\b\b\u0002\u00106\u001a\u00020\u001d2\b\b\u0002\u00107\u001a\u00020\u001d2\b\b\u0002\u00108\u001a\u00020\u00032\b\b\u0003\u00109\u001a\u00020\u00032\b\b\u0003\u0010:\u001a\u00020\u00032\b\b\u0002\u0010;\u001a\u00020\u000bHÆ\u0001¢\u0006\u0003\u0010²\u0001J\u0016\u0010³\u0001\u001a\u0002052\n\u0010´\u0001\u001a\u0005\u0018\u00010µ\u0001HÖ\u0003J\n\u0010¶\u0001\u001a\u00020\u0003HÖ\u0001J\u000b\u0010·\u0001\u001a\u00030¸\u0001HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010@\u001a\u0004\b>\u0010?R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010@\u001a\u0004\bA\u0010?R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010@\u001a\u0004\bB\u0010?R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010@\u001a\u0004\bC\u0010?R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010ER\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010ER\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010IR\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bK\u0010IR\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bL\u0010IR\u0011\u0010\u000f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bM\u0010IR\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bN\u0010IR\u0011\u0010\u0011\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bO\u0010IR\u0011\u0010\u0012\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bP\u0010IR\u0011\u0010\u0013\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010IR\u0011\u0010\u0014\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bR\u0010IR\u0011\u0010\u0015\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bS\u0010IR\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bT\u0010ER\u0011\u0010\u0017\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bU\u0010IR\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u0011\u0010\u001e\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010[R\u0011\u0010\u001f\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b]\u0010[R\u0011\u0010 \u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b^\u0010[R\u0011\u0010!\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b_\u0010[R\u0011\u0010\"\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b`\u0010IR\u0011\u0010#\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\ba\u0010ER\u0011\u0010$\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bb\u0010IR\u0011\u0010%\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bc\u0010ER\u0011\u0010&\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bd\u0010ER\u0011\u0010'\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\be\u0010fR\u0011\u0010)\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bg\u0010ER\u0011\u0010*\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\bh\u0010fR\u0011\u0010+\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bi\u0010IR\u0011\u0010,\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bj\u0010IR\u0011\u0010-\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bk\u0010IR\u0011\u0010.\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\bl\u0010[R\u0011\u0010/\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bm\u0010ER\u0011\u00100\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bn\u0010ER\u0011\u00101\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bo\u0010ER\u0011\u00102\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\bp\u0010fR\u0011\u00103\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\bq\u0010fR\u0011\u00104\u001a\u000205¢\u0006\b\n\u0000\u001a\u0004\br\u0010sR\u0011\u00106\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\bt\u0010[R\u0011\u00107\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\bu\u0010[R\u0011\u00108\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bv\u0010ER\u0011\u00109\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bw\u0010ER\u0011\u0010:\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bx\u0010ER\u0011\u0010;\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\by\u0010I¨\u0006»\u0001"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;", "Lio/getstream/chat/android/ui/helper/ViewStyle;", "messageBackgroundColorMine", "", "messageBackgroundColorTheirs", "messageLinkTextColorMine", "messageLinkTextColorTheirs", "messageLinkBackgroundColorMine", "messageLinkBackgroundColorTheirs", "linkDescriptionMaxLines", "textStyleMine", "Lio/getstream/chat/android/ui/font/TextStyle;", "textStyleTheirs", "textStyleUserName", "textStyleMessageDate", "textStyleMessageLanguage", "textStyleThreadCounter", "textStyleReadCounter", "threadSeparatorTextStyle", "textStyleLinkLabel", "textStyleLinkTitle", "textStyleLinkDescription", "dateSeparatorBackgroundColor", "textStyleDateSeparator", "reactionsViewStyle", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;", "editReactionsViewStyle", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;", "iconIndicatorSent", "Landroid/graphics/drawable/Drawable;", "iconIndicatorDelivered", "iconIndicatorRead", "iconIndicatorPendingSync", "iconOnlyVisibleToYou", "textStyleMessageDeletedMine", "messageDeletedBackgroundMine", "textStyleMessageDeletedTheirs", "messageDeletedBackgroundTheirs", "messageStrokeColorMine", "messageStrokeWidthMine", "", "messageStrokeColorTheirs", "messageStrokeWidthTheirs", "textStyleSystemMessage", "textStyleErrorMessage", "pinnedMessageIndicatorTextStyle", "pinnedMessageIndicatorIcon", "pinnedMessageBackgroundColor", "messageStartMargin", "messageEndMargin", "messageMaxWidthFactorMine", "messageMaxWidthFactorTheirs", "showMessageDeliveryStatusIndicator", "", "iconFailedMessage", "iconBannedMessage", "systemMessageAlignment", "loadingMoreView", "unreadSeparatorBackgroundColor", "unreadSeparatorTextStyle", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;ILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;ILio/getstream/chat/android/ui/font/TextStyle;IIFIFLio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;IIIFFZLandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;IIILio/getstream/chat/android/ui/font/TextStyle;)V", "getMessageBackgroundColorMine", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMessageBackgroundColorTheirs", "getMessageLinkTextColorMine", "getMessageLinkTextColorTheirs", "getMessageLinkBackgroundColorMine", "()I", "getMessageLinkBackgroundColorTheirs", "getLinkDescriptionMaxLines", "getTextStyleMine", "()Lio/getstream/chat/android/ui/font/TextStyle;", "getTextStyleTheirs", "getTextStyleUserName", "getTextStyleMessageDate", "getTextStyleMessageLanguage", "getTextStyleThreadCounter", "getTextStyleReadCounter", "getThreadSeparatorTextStyle", "getTextStyleLinkLabel", "getTextStyleLinkTitle", "getTextStyleLinkDescription", "getDateSeparatorBackgroundColor", "getTextStyleDateSeparator", "getReactionsViewStyle", "()Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;", "getEditReactionsViewStyle", "()Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;", "getIconIndicatorSent", "()Landroid/graphics/drawable/Drawable;", "getIconIndicatorDelivered", "getIconIndicatorRead", "getIconIndicatorPendingSync", "getIconOnlyVisibleToYou", "getTextStyleMessageDeletedMine", "getMessageDeletedBackgroundMine", "getTextStyleMessageDeletedTheirs", "getMessageDeletedBackgroundTheirs", "getMessageStrokeColorMine", "getMessageStrokeWidthMine", "()F", "getMessageStrokeColorTheirs", "getMessageStrokeWidthTheirs", "getTextStyleSystemMessage", "getTextStyleErrorMessage", "getPinnedMessageIndicatorTextStyle", "getPinnedMessageIndicatorIcon", "getPinnedMessageBackgroundColor", "getMessageStartMargin", "getMessageEndMargin", "getMessageMaxWidthFactorMine", "getMessageMaxWidthFactorTheirs", "getShowMessageDeliveryStatusIndicator", "()Z", "getIconFailedMessage", "getIconBannedMessage", "getSystemMessageAlignment", "getLoadingMoreView", "getUnreadSeparatorBackgroundColor", "getUnreadSeparatorTextStyle", "getStyleTextColor", "isMine", "(Z)Ljava/lang/Integer;", "getStyleLinkTextColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;ILio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;ILio/getstream/chat/android/ui/font/TextStyle;IIFIFLio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;IIIFFZLandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;IIILio/getstream/chat/android/ui/font/TextStyle;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;", "equals", "other", "", "hashCode", "toString", "", "Companion", "Builder", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class MessageListItemStyle implements ViewStyle {
    private static final int BASE_MESSAGE_MAX_WIDTH_FACTOR = 1;
    private static final float DEFAULT_MESSAGE_MAX_WIDTH_FACTOR = 0.75f;
    private static final int DEFAULT_TEXT_COLOR_DATE;
    private static final int DEFAULT_TEXT_COLOR_DATE_SEPARATOR;
    private static final int DEFAULT_TEXT_COLOR_LINK_DESCRIPTION;
    private static final int DEFAULT_TEXT_COLOR_READ_COUNTER;
    private static final int DEFAULT_TEXT_COLOR_THREAD_COUNTER;
    private static final int DEFAULT_TEXT_COLOR_USER_NAME;
    private static final int DEFAULT_TEXT_SIZE_DATE;
    private static final int DEFAULT_TEXT_SIZE_DATE_SEPARATOR;
    private static final int DEFAULT_TEXT_SIZE_LINK_DESCRIPTION;
    private static final int DEFAULT_TEXT_SIZE_READ_COUNTER;
    private static final int DEFAULT_TEXT_SIZE_THREAD_COUNTER;
    private static final int DEFAULT_TEXT_SIZE_USER_NAME;
    public static final int DEFAULT_TEXT_STYLE = 0;
    private static final int MESSAGE_STROKE_COLOR_MINE;
    private static final int MESSAGE_STROKE_COLOR_THEIRS;
    public static final float MESSAGE_STROKE_WIDTH_MINE = 0.0f;
    private static final InterfaceC23462h MESSAGE_STROKE_WIDTH_THEIRS$delegate;
    public static final int VALUE_NOT_SET = Integer.MAX_VALUE;
    private final int dateSeparatorBackgroundColor;
    private final EditReactionsViewStyle editReactionsViewStyle;
    private final Drawable iconBannedMessage;
    private final Drawable iconFailedMessage;
    private final Drawable iconIndicatorDelivered;
    private final Drawable iconIndicatorPendingSync;
    private final Drawable iconIndicatorRead;
    private final Drawable iconIndicatorSent;
    private final Drawable iconOnlyVisibleToYou;
    private final int linkDescriptionMaxLines;
    private final int loadingMoreView;
    private final Integer messageBackgroundColorMine;
    private final Integer messageBackgroundColorTheirs;
    private final int messageDeletedBackgroundMine;
    private final int messageDeletedBackgroundTheirs;
    private final int messageEndMargin;
    private final int messageLinkBackgroundColorMine;
    private final int messageLinkBackgroundColorTheirs;
    private final Integer messageLinkTextColorMine;
    private final Integer messageLinkTextColorTheirs;
    private final float messageMaxWidthFactorMine;
    private final float messageMaxWidthFactorTheirs;
    private final int messageStartMargin;
    private final int messageStrokeColorMine;
    private final int messageStrokeColorTheirs;
    private final float messageStrokeWidthMine;
    private final float messageStrokeWidthTheirs;
    private final int pinnedMessageBackgroundColor;
    private final Drawable pinnedMessageIndicatorIcon;
    private final TextStyle pinnedMessageIndicatorTextStyle;
    private final ViewReactionsViewStyle reactionsViewStyle;
    private final boolean showMessageDeliveryStatusIndicator;
    private final int systemMessageAlignment;
    private final TextStyle textStyleDateSeparator;
    private final TextStyle textStyleErrorMessage;
    private final TextStyle textStyleLinkDescription;
    private final TextStyle textStyleLinkLabel;
    private final TextStyle textStyleLinkTitle;
    private final TextStyle textStyleMessageDate;
    private final TextStyle textStyleMessageDeletedMine;
    private final TextStyle textStyleMessageDeletedTheirs;
    private final TextStyle textStyleMessageLanguage;
    private final TextStyle textStyleMine;
    private final TextStyle textStyleReadCounter;
    private final TextStyle textStyleSystemMessage;
    private final TextStyle textStyleTheirs;
    private final TextStyle textStyleThreadCounter;
    private final TextStyle textStyleUserName;
    private final TextStyle threadSeparatorTextStyle;
    private final int unreadSeparatorBackgroundColor;
    private final TextStyle unreadSeparatorTextStyle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final int DEFAULT_LINK_BACKGROUND_COLOR = C19469R.color.stream_ui_blue_alice;
    private static final int DEFAULT_TEXT_COLOR = C19469R.color.stream_ui_text_color_primary;
    private static final int DEFAULT_TEXT_SIZE = C19469R.dimen.stream_ui_text_medium;

    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\u00002\b\b\u0001\u0010\u000f\u001a\u00020\b2\b\b\u0003\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\u00002\b\b\u0001\u0010\u0013\u001a\u00020\b2\b\b\u0003\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0012J!\u0010\u0016\u001a\u00020\u00002\b\b\u0001\u0010\u0015\u001a\u00020\b2\b\b\u0003\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0012J!\u0010\u0018\u001a\u00020\u00002\b\b\u0001\u0010\u0017\u001a\u00020\b2\b\b\u0003\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0012J!\u0010\u0019\u001a\u00020\u00002\b\b\u0001\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u001a¢\u0006\u0004\b\u0019\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u0012J!\u0010\u001e\u001a\u00020\u00002\b\b\u0001\u0010\u001e\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u0012J\r\u0010 \u001a\u00020\u000b¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0016\u0010\u0011\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010$R\u0016\u0010\u0014\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010$R\u0016\u0010\u0016\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010$R\u0016\u0010\u0018\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010$R\u0016\u0010\u0019\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010%R\u0016\u0010\u001d\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010$R\u0016\u0010\u001e\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010$¨\u0006&"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;", "", "Landroid/content/res/TypedArray;", "attributes", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/res/TypedArray;Landroid/content/Context;)V", "", "nullIfNotSet", "(I)Ljava/lang/Integer;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;", "Ll83/a0;", "checkMessageMaxWidthFactorsRange", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V", "messageBackgroundColorMineStyleableId", "defaultValue", "messageBackgroundColorMine", "(II)Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;", "messageBackgroundColorTheirsId", "messageBackgroundColorTheirs", "messageLinkTextColorMineId", "messageLinkTextColorMine", "messageLinkTextColorTheirsId", "messageLinkTextColorTheirs", "reactionsEnabled", "", "(IZ)Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Builder;", "maxLines", "linkDescriptionMaxLines", "systemMessageGravity", "defaultGravity", "build", "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;", "Landroid/content/res/TypedArray;", "Landroid/content/Context;", "I", "Z", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Builder {
        private final TypedArray attributes;
        private final Context context;
        private int linkDescriptionMaxLines;
        private int messageBackgroundColorMine;
        private int messageBackgroundColorTheirs;
        private int messageLinkTextColorMine;
        private int messageLinkTextColorTheirs;
        private boolean reactionsEnabled;
        private int systemMessageGravity;

        public Builder(TypedArray attributes, Context context) {
            AbstractC22676k.m65750j(attributes, "attributes");
            AbstractC22676k.m65750j(context, "context");
            this.attributes = attributes;
            this.context = context;
            this.messageBackgroundColorMine = Integer.MAX_VALUE;
            this.messageBackgroundColorTheirs = Integer.MAX_VALUE;
            this.messageLinkTextColorMine = Integer.MAX_VALUE;
            this.messageLinkTextColorTheirs = Integer.MAX_VALUE;
            this.reactionsEnabled = true;
            this.linkDescriptionMaxLines = 5;
            this.systemMessageGravity = 17;
        }

        private final void checkMessageMaxWidthFactorsRange(MessageListItemStyle messageListItemStyle) {
            double messageMaxWidthFactorMine = messageListItemStyle.getMessageMaxWidthFactorMine();
            if (0.75d > messageMaxWidthFactorMine || messageMaxWidthFactorMine > 1.0d) {
                throw new IllegalArgumentException(("messageMaxWidthFactorMine cannot be lower than 0.75 and greater than 1! Current value: " + messageListItemStyle.getMessageMaxWidthFactorMine()).toString());
            }
            double messageMaxWidthFactorTheirs = messageListItemStyle.getMessageMaxWidthFactorTheirs();
            if (0.75d > messageMaxWidthFactorTheirs || messageMaxWidthFactorTheirs > 1.0d) {
                throw new IllegalArgumentException(("messageMaxWidthFactorTheirs cannot be lower than 0.75 and greater than 1! Current value: " + messageListItemStyle.getMessageMaxWidthFactorTheirs()).toString());
            }
        }

        public static /* synthetic */ Builder linkDescriptionMaxLines$default(Builder builder, int i13, int i14, int i15, Object obj) {
            if ((i15 & 2) != 0) {
                i14 = 5;
            }
            builder.linkDescriptionMaxLines(i13, i14);
            return builder;
        }

        public static /* synthetic */ Builder messageBackgroundColorMine$default(Builder builder, int i13, int i14, int i15, Object obj) {
            if ((i15 & 2) != 0) {
                i14 = Integer.MAX_VALUE;
            }
            builder.messageBackgroundColorMine(i13, i14);
            return builder;
        }

        public static /* synthetic */ Builder messageBackgroundColorTheirs$default(Builder builder, int i13, int i14, int i15, Object obj) {
            if ((i15 & 2) != 0) {
                i14 = Integer.MAX_VALUE;
            }
            builder.messageBackgroundColorTheirs(i13, i14);
            return builder;
        }

        public static /* synthetic */ Builder messageLinkTextColorMine$default(Builder builder, int i13, int i14, int i15, Object obj) {
            if ((i15 & 2) != 0) {
                i14 = Integer.MAX_VALUE;
            }
            builder.messageLinkTextColorMine(i13, i14);
            return builder;
        }

        public static /* synthetic */ Builder messageLinkTextColorTheirs$default(Builder builder, int i13, int i14, int i15, Object obj) {
            if ((i15 & 2) != 0) {
                i14 = Integer.MAX_VALUE;
            }
            builder.messageLinkTextColorTheirs(i13, i14);
            return builder;
        }

        private final Integer nullIfNotSet(int i13) {
            if (i13 == Integer.MAX_VALUE) {
                return null;
            }
            return Integer.valueOf(i13);
        }

        public static /* synthetic */ Builder reactionsEnabled$default(Builder builder, int i13, boolean z4, int i14, Object obj) {
            if ((i14 & 2) != 0) {
                z4 = true;
            }
            builder.reactionsEnabled(i13, z4);
            return builder;
        }

        public static /* synthetic */ Builder systemMessageGravity$default(Builder builder, int i13, int i14, int i15, Object obj) {
            if ((i15 & 2) != 0) {
                i14 = 17;
            }
            builder.systemMessageGravity(i13, i14);
            return builder;
        }

        public final MessageListItemStyle build() {
            TypedArray typedArray = this.attributes;
            int i13 = C19469R.styleable.MessageListView_streamUiMessageLinkBackgroundColorMine;
            Context context = this.context;
            Companion companion = MessageListItemStyle.INSTANCE;
            companion.getClass();
            int color = typedArray.getColor(i13, ContextKt.getColorCompat(context, MessageListItemStyle.DEFAULT_LINK_BACKGROUND_COLOR));
            int color2 = this.attributes.getColor(C19469R.styleable.MessageListView_streamUiMessageLinkBackgroundColorTheirs, ContextKt.getColorCompat(this.context, MessageListItemStyle.DEFAULT_LINK_BACKGROUND_COLOR));
            Typeface typefaceM109098b = AbstractC34523k.m109098b(this.context, C19470R.font.stream_roboto_medium);
            if (typefaceM109098b == null) {
                typefaceM109098b = Typeface.DEFAULT;
            }
            Typeface typefaceM109098b2 = AbstractC34523k.m109098b(this.context, C19470R.font.stream_roboto_bold);
            if (typefaceM109098b2 == null) {
                typefaceM109098b2 = Typeface.DEFAULT_BOLD;
            }
            TextStyle.Builder builder = new TextStyle.Builder(this.attributes);
            builder.size(C19469R.styleable.MessageListView_streamUiMessageTextSizeMine, ContextKt.getDimension(this.context, MessageListItemStyle.DEFAULT_TEXT_SIZE));
            builder.color(C19469R.styleable.MessageListView_streamUiMessageTextColorMine, ContextKt.getColorCompat(this.context, MessageListItemStyle.DEFAULT_TEXT_COLOR));
            int i14 = C19469R.styleable.MessageListView_streamUiMessageTextFontAssetsMine;
            int i15 = C19469R.styleable.MessageListView_streamUiMessageTextFontMine;
            AbstractC22676k.m65747g(typefaceM109098b);
            builder.font(i14, i15, typefaceM109098b);
            builder.style(C19469R.styleable.MessageListView_streamUiMessageTextStyleMine, 0);
            TextStyle textStyleBuild = builder.build();
            TextStyle.Builder builder2 = new TextStyle.Builder(this.attributes);
            builder2.size(C19469R.styleable.MessageListView_streamUiMessageTextSizeTheirs, ContextKt.getDimension(this.context, MessageListItemStyle.DEFAULT_TEXT_SIZE));
            builder2.color(C19469R.styleable.MessageListView_streamUiMessageTextColorTheirs, ContextKt.getColorCompat(this.context, MessageListItemStyle.DEFAULT_TEXT_COLOR));
            builder2.font(C19469R.styleable.MessageListView_streamUiMessageTextFontAssetsTheirs, C19469R.styleable.MessageListView_streamUiMessageTextFontTheirs, typefaceM109098b);
            builder2.style(C19469R.styleable.MessageListView_streamUiMessageTextStyleTheirs, 0);
            TextStyle textStyleBuild2 = builder2.build();
            TextStyle.Builder builder3 = new TextStyle.Builder(this.attributes);
            builder3.size(C19469R.styleable.MessageListView_streamUiMessageTextSizeUserName, ContextKt.getDimension(this.context, MessageListItemStyle.DEFAULT_TEXT_SIZE_USER_NAME));
            builder3.color(C19469R.styleable.MessageListView_streamUiMessageTextColorUserName, ContextKt.getColorCompat(this.context, MessageListItemStyle.DEFAULT_TEXT_COLOR_USER_NAME));
            builder3.font(C19469R.styleable.MessageListView_streamUiMessageTextFontAssetsUserName, C19469R.styleable.MessageListView_streamUiMessageTextFontUserName);
            builder3.style(C19469R.styleable.MessageListView_streamUiMessageTextStyleUserName, 0);
            TextStyle textStyleBuild3 = builder3.build();
            TextStyle.Builder builder4 = new TextStyle.Builder(this.attributes);
            builder4.size(C19469R.styleable.MessageListView_streamUiMessageTextSizeDate, ContextKt.getDimension(this.context, MessageListItemStyle.DEFAULT_TEXT_SIZE_DATE));
            builder4.color(C19469R.styleable.MessageListView_streamUiMessageTextColorDate, ContextKt.getColorCompat(this.context, MessageListItemStyle.DEFAULT_TEXT_COLOR_DATE));
            builder4.font(C19469R.styleable.MessageListView_streamUiMessageTextFontAssetsDate, C19469R.styleable.MessageListView_streamUiMessageTextFontDate);
            builder4.style(C19469R.styleable.MessageListView_streamUiMessageTextStyleDate, 0);
            TextStyle textStyleBuild4 = builder4.build();
            TextStyle.Builder builder5 = new TextStyle.Builder(this.attributes);
            builder5.size(C19469R.styleable.MessageListView_streamUiMessageTextSizeLanguage, ContextKt.getDimension(this.context, MessageListItemStyle.DEFAULT_TEXT_SIZE_DATE));
            builder5.color(C19469R.styleable.MessageListView_streamUiMessageTextColorLanguage, ContextKt.getColorCompat(this.context, MessageListItemStyle.DEFAULT_TEXT_COLOR_DATE));
            builder5.font(C19469R.styleable.MessageListView_streamUiMessageTextFontAssetsLanguage, C19469R.styleable.MessageListView_streamUiMessageTextFontLanguage);
            builder5.style(C19469R.styleable.MessageListView_streamUiMessageTextStyleLanguage, 0);
            TextStyle textStyleBuild5 = builder5.build();
            TextStyle.Builder builder6 = new TextStyle.Builder(this.attributes);
            builder6.size(C19469R.styleable.MessageListView_streamUiMessageTextSizeThreadCounter, ContextKt.getDimension(this.context, MessageListItemStyle.DEFAULT_TEXT_SIZE_THREAD_COUNTER));
            builder6.color(C19469R.styleable.MessageListView_streamUiMessageTextColorThreadCounter, ContextKt.getColorCompat(this.context, MessageListItemStyle.DEFAULT_TEXT_COLOR_THREAD_COUNTER));
            builder6.font(C19469R.styleable.MessageListView_streamUiMessageTextFontAssetsThreadCounter, C19469R.styleable.MessageListView_streamUiMessageTextFontThreadCounter, typefaceM109098b);
            builder6.style(C19469R.styleable.MessageListView_streamUiMessageTextStyleThreadCounter, 0);
            TextStyle textStyleBuild6 = builder6.build();
            TextStyle.Builder builder7 = new TextStyle.Builder(this.attributes);
            builder7.size(C19469R.styleable.MessageListView_streamUiMessageTextSizeReadCounter, ContextKt.getDimension(this.context, MessageListItemStyle.DEFAULT_TEXT_SIZE_READ_COUNTER));
            builder7.color(C19469R.styleable.MessageListView_streamUiMessageTextColorReadCounter, ContextKt.getColorCompat(this.context, MessageListItemStyle.DEFAULT_TEXT_COLOR_READ_COUNTER));
            builder7.font(C19469R.styleable.MessageListView_streamUiMessageTextFontAssetsReadCounter, C19469R.styleable.MessageListView_streamUiMessageTextFontReadCounter, typefaceM109098b);
            builder7.style(C19469R.styleable.MessageListView_streamUiMessageTextStyleReadCounter, 0);
            TextStyle textStyleBuild7 = builder7.build();
            TextStyle.Builder builder8 = new TextStyle.Builder(this.attributes);
            builder8.size(C19469R.styleable.MessageListView_streamUiMessageTextSizeThreadSeparator, ContextKt.getDimension(this.context, MessageListItemStyle.DEFAULT_TEXT_SIZE_THREAD_COUNTER));
            builder8.color(C19469R.styleable.MessageListView_streamUiMessageTextColorThreadSeparator, ContextKt.getColorCompat(this.context, MessageListItemStyle.DEFAULT_TEXT_COLOR_THREAD_COUNTER));
            builder8.font(C19469R.styleable.MessageListView_streamUiMessageTextFontAssetsThreadSeparator, C19469R.styleable.MessageListView_streamUiMessageTextFontThreadSeparator, typefaceM109098b);
            builder8.style(C19469R.styleable.MessageListView_streamUiMessageTextStyleThreadSeparator, 0);
            TextStyle textStyleBuild8 = builder8.build();
            TextStyle.Builder builder9 = new TextStyle.Builder(this.attributes);
            builder9.size(C19469R.styleable.MessageListView_streamUiMessageTextSizeLinkTitle, ContextKt.getDimension(this.context, MessageListItemStyle.DEFAULT_TEXT_SIZE));
            builder9.color(C19469R.styleable.MessageListView_streamUiMessageTextColorLinkTitle, ContextKt.getColorCompat(this.context, MessageListItemStyle.DEFAULT_TEXT_COLOR));
            int i16 = C19469R.styleable.MessageListView_streamUiMessageTextFontAssetsLinkTitle;
            int i17 = C19469R.styleable.MessageListView_streamUiMessageTextFontLinkTitle;
            AbstractC22676k.m65747g(typefaceM109098b2);
            builder9.font(i16, i17, typefaceM109098b2);
            builder9.style(C19469R.styleable.MessageListView_streamUiMessageTextStyleLinkTitle, 0);
            TextStyle textStyleBuild9 = builder9.build();
            TextStyle.Builder builder10 = new TextStyle.Builder(this.attributes);
            builder10.size(C19469R.styleable.MessageListView_streamUiMessageTextSizeLinkDescription, ContextKt.getDimension(this.context, MessageListItemStyle.DEFAULT_TEXT_SIZE_LINK_DESCRIPTION));
            builder10.color(C19469R.styleable.MessageListView_streamUiMessageTextColorLinkDescription, ContextKt.getColorCompat(this.context, MessageListItemStyle.DEFAULT_TEXT_COLOR_LINK_DESCRIPTION));
            builder10.font(C19469R.styleable.MessageListView_streamUiMessageTextFontAssetsLinkDescription, C19469R.styleable.MessageListView_streamUiMessageTextFontLinkDescription);
            builder10.style(C19469R.styleable.MessageListView_streamUiMessageTextStyleLinkDescription, 0);
            TextStyle textStyleBuild10 = builder10.build();
            TextStyle.Builder builder11 = new TextStyle.Builder(this.attributes);
            builder11.size(C19469R.styleable.MessageListView_streamUiMessageTextSizeLinkLabel, ContextKt.getDimension(this.context, MessageListItemStyle.DEFAULT_TEXT_SIZE_LINK_DESCRIPTION));
            builder11.color(C19469R.styleable.MessageListView_streamUiMessageTextColorLinkLabel, ContextKt.getColorCompat(this.context, MessageListItemStyle.DEFAULT_TEXT_COLOR_LINK_DESCRIPTION));
            builder11.font(C19469R.styleable.MessageListView_streamUiMessageTextFontAssetsLinkLabel, C19469R.styleable.MessageListView_streamUiMessageTextFontLinkLabel);
            builder11.style(C19469R.styleable.MessageListView_streamUiMessageTextStyleLinkLabel, 0);
            TextStyle textStyleBuild11 = builder11.build();
            int color3 = this.attributes.getColor(C19469R.styleable.MessageListView_streamUiDateSeparatorBackgroundColor, ContextKt.getColorCompat(this.context, C19469R.color.stream_ui_overlay_dark));
            TextStyle.Builder builder12 = new TextStyle.Builder(this.attributes);
            builder12.size(C19469R.styleable.MessageListView_streamUiMessageTextSizeDateSeparator, ContextKt.getDimension(this.context, MessageListItemStyle.DEFAULT_TEXT_SIZE_DATE_SEPARATOR));
            builder12.color(C19469R.styleable.MessageListView_streamUiMessageTextColorDateSeparator, ContextKt.getColorCompat(this.context, MessageListItemStyle.DEFAULT_TEXT_COLOR_DATE_SEPARATOR));
            builder12.font(C19469R.styleable.MessageListView_streamUiMessageTextFontAssetsDateSeparator, C19469R.styleable.MessageListView_streamUiMessageTextFontDateSeparator);
            builder12.style(C19469R.styleable.MessageListView_streamUiMessageTextStyleDateSeparator, 0);
            TextStyle textStyleBuild12 = builder12.build();
            ViewReactionsViewStyle.Companion.Builder builder13 = new ViewReactionsViewStyle.Companion.Builder(this.attributes, this.context);
            builder13.bubbleBorderColorMine(C19469R.styleable.MessageListView_streamUiMessageReactionsBubbleBorderColorMine);
            builder13.bubbleBorderColorTheirs(C19469R.styleable.MessageListView_streamUiMessageReactionsBubbleBorderColorTheirs);
            builder13.bubbleBorderWidthMine(C19469R.styleable.MessageListView_streamUiMessageReactionsBubbleBorderWidthMine);
            builder13.bubbleBorderWidthTheirs(C19469R.styleable.MessageListView_streamUiMessageReactionsBubbleBorderWidthTheirs);
            builder13.bubbleColorMine(C19469R.styleable.MessageListView_streamUiMessageReactionsBubbleColorMine);
            builder13.bubbleColorTheirs(C19469R.styleable.MessageListView_streamUiMessageReactionsBubbleColorTheirs);
            builder13.messageOptionsReactionSorting(C19469R.styleable.MessageListView_streamUiMessageOptionsReactionSorting);
            ViewReactionsViewStyle viewReactionsViewStyleBuild = builder13.build();
            EditReactionsViewStyle.Builder builder14 = new EditReactionsViewStyle.Builder(this.attributes, this.context);
            builder14.bubbleColorMine(C19469R.styleable.MessageListView_streamUiEditReactionsBubbleColorMine);
            builder14.bubbleColorTheirs(C19469R.styleable.MessageListView_streamUiEditReactionsBubbleColorTheirs);
            builder14.reactionsColumns(C19469R.styleable.MessageListView_streamUiEditReactionsColumns);
            EditReactionsViewStyle editReactionsViewStyleBuild = builder14.build();
            boolean z4 = this.attributes.getBoolean(C19469R.styleable.MessageListView_streamUiShowMessageDeliveryStatusIndicator, true);
            Drawable drawable = this.attributes.getDrawable(C19469R.styleable.MessageListView_streamUiIconIndicatorSent);
            if (drawable == null) {
                drawable = ContextKt.getDrawableCompat(this.context, C19469R.drawable.stream_ui_ic_check_single);
                AbstractC22676k.m65747g(drawable);
            }
            Drawable drawable2 = drawable;
            Drawable drawable3 = this.attributes.getDrawable(C19469R.styleable.MessageListView_streamUiIconIndicatorDelivered);
            if (drawable3 == null) {
                drawable3 = ContextKt.getDrawableCompat(this.context, C19469R.drawable.stream_ui_ic_check_double_grey);
                AbstractC22676k.m65747g(drawable3);
            }
            Drawable drawable4 = drawable3;
            Drawable drawable5 = this.attributes.getDrawable(C19469R.styleable.MessageListView_streamUiIconIndicatorRead);
            if (drawable5 == null) {
                drawable5 = ContextKt.getDrawableCompat(this.context, C19469R.drawable.stream_ui_ic_check_double);
                AbstractC22676k.m65747g(drawable5);
            }
            Drawable drawable6 = drawable5;
            Drawable drawableCompat = TypedArrayKt.getDrawableCompat(this.attributes, this.context, C19469R.styleable.MessageListView_streamUiIconIndicatorPendingSync);
            if (drawableCompat == null) {
                drawableCompat = AbstractC30060g.m92133x(this.context, C19469R.drawable.stream_ui_ic_clock);
                AbstractC22676k.m65747g(drawableCompat);
            }
            Drawable drawable7 = drawableCompat;
            Drawable drawable8 = this.attributes.getDrawable(C19469R.styleable.MessageListView_streamUiIconOnlyVisibleToYou);
            if (drawable8 == null) {
                drawable8 = ContextKt.getDrawableCompat(this.context, C19469R.drawable.stream_ui_ic_icon_eye_off);
                AbstractC22676k.m65747g(drawable8);
            }
            Drawable drawable9 = drawable8;
            TextStyle.Builder builder15 = new TextStyle.Builder(this.attributes);
            builder15.size(C19469R.styleable.MessageListView_streamUiMessageTextSizeMessageDeleted, ContextKt.getDimension(this.context, MessageListItemStyle.DEFAULT_TEXT_SIZE));
            builder15.color(C19469R.styleable.MessageListView_streamUiMessageTextColorMessageDeleted, ContextKt.getColorCompat(this.context, C19469R.color.stream_ui_text_color_secondary));
            builder15.font(C19469R.styleable.MessageListView_streamUiMessageTextFontAssetsMessageDeleted, C19469R.styleable.MessageListView_streamUiMessageTextFontMessageDeleted);
            builder15.style(C19469R.styleable.MessageListView_streamUiMessageTextStyleMessageDeleted, 2);
            TextStyle textStyleBuild13 = builder15.build();
            int color4 = this.attributes.getColor(C19469R.styleable.MessageListView_streamUiDeletedMessageBackgroundColorMine, ContextKt.getColorCompat(this.context, C19469R.color.stream_ui_grey_whisper));
            TextStyle.Builder builder16 = new TextStyle.Builder(this.attributes);
            builder16.size(C19469R.styleable.MessageListView_streamUiMessageTextSizeMessageDeletedMine, textStyleBuild13.getSize());
            builder16.color(C19469R.styleable.MessageListView_streamUiMessageTextColorMessageDeletedMine, textStyleBuild13.getColor());
            builder16.fontAssetsPath(C19469R.styleable.MessageListView_streamUiMessageTextFontAssetsMessageDeletedMine, textStyleBuild13.getFontAssetsPath());
            builder16.fontResource(C19469R.styleable.MessageListView_streamUiMessageTextFontMessageDeletedMine, textStyleBuild13.getFontResource());
            builder16.style(C19469R.styleable.MessageListView_streamUiMessageTextStyleMessageDeletedMine, textStyleBuild13.getStyle());
            TextStyle textStyleBuild14 = builder16.build();
            int color5 = this.attributes.getColor(C19469R.styleable.MessageListView_streamUiDeletedMessageBackgroundColorTheirs, ContextKt.getColorCompat(this.context, C19469R.color.stream_ui_grey_whisper));
            TextStyle.Builder builder17 = new TextStyle.Builder(this.attributes);
            builder17.size(C19469R.styleable.MessageListView_streamUiMessageTextSizeMessageDeletedTheirs, textStyleBuild13.getSize());
            builder17.color(C19469R.styleable.MessageListView_streamUiMessageTextColorMessageDeletedTheirs, textStyleBuild13.getColor());
            builder17.fontAssetsPath(C19469R.styleable.f74391x910e5668, textStyleBuild13.getFontAssetsPath());
            builder17.fontResource(C19469R.styleable.MessageListView_streamUiMessageTextFontMessageDeletedTheirs, textStyleBuild13.getFontResource());
            builder17.style(C19469R.styleable.MessageListView_streamUiMessageTextStyleMessageDeletedTheirs, textStyleBuild13.getStyle());
            TextStyle textStyleBuild15 = builder17.build();
            int color6 = this.attributes.getColor(C19469R.styleable.MessageListView_streamUiMessageStrokeColorMine, ContextKt.getColorCompat(this.context, MessageListItemStyle.MESSAGE_STROKE_COLOR_MINE));
            float dimension = this.attributes.getDimension(C19469R.styleable.MessageListView_streamUiMessageStrokeWidthMine, 0.0f);
            int color7 = this.attributes.getColor(C19469R.styleable.MessageListView_streamUiMessageStrokeColorTheirs, ContextKt.getColorCompat(this.context, MessageListItemStyle.MESSAGE_STROKE_COLOR_THEIRS));
            float dimension2 = this.attributes.getDimension(C19469R.styleable.MessageListView_streamUiMessageStrokeWidthTheirs, companion.m55324x72528af8());
            TextStyle.Builder builder18 = new TextStyle.Builder(this.attributes);
            builder18.size(C19469R.styleable.MessageListView_streamUiSystemMessageTextSize, ContextKt.getDimension(this.context, C19469R.dimen.stream_ui_text_small));
            builder18.color(C19469R.styleable.MessageListView_streamUiSystemMessageTextColor, ContextKt.getColorCompat(this.context, C19469R.color.stream_ui_text_color_secondary));
            builder18.font(C19469R.styleable.MessageListView_streamUiSystemMessageTextFontAssets, C19469R.styleable.MessageListView_streamUiSystemMessageTextFont);
            builder18.style(C19469R.styleable.MessageListView_streamUiSystemMessageTextStyle, 1);
            TextStyle textStyleBuild16 = builder18.build();
            TextStyle.Builder builder19 = new TextStyle.Builder(this.attributes);
            builder19.size(C19469R.styleable.MessageListView_streamUiErrorMessageTextSize, ContextKt.getDimension(this.context, C19469R.dimen.stream_ui_text_small));
            builder19.color(C19469R.styleable.MessageListView_streamUiErrorMessageTextColor, ContextKt.getColorCompat(this.context, C19469R.color.stream_ui_text_color_secondary));
            builder19.font(C19469R.styleable.MessageListView_streamUiErrorMessageTextFontAssets, C19469R.styleable.MessageListView_streamUiErrorMessageTextFont);
            builder19.style(C19469R.styleable.MessageListView_streamUiErrorMessageTextStyle, 1);
            TextStyle textStyleBuild17 = builder19.build();
            TextStyle.Builder builder20 = new TextStyle.Builder(this.attributes);
            builder20.size(C19469R.styleable.MessageListView_streamUiPinnedMessageIndicatorTextSize, ContextKt.getDimension(this.context, C19469R.dimen.stream_ui_text_small));
            builder20.color(C19469R.styleable.MessageListView_streamUiPinnedMessageIndicatorTextColor, ContextKt.getColorCompat(this.context, C19469R.color.stream_ui_text_color_secondary));
            builder20.font(C19469R.styleable.MessageListView_streamUiPinnedMessageIndicatorTextFontAssets, C19469R.styleable.MessageListView_streamUiPinnedMessageIndicatorTextFont);
            builder20.style(C19469R.styleable.MessageListView_streamUiPinnedMessageIndicatorTextStyle, 0);
            TextStyle textStyleBuild18 = builder20.build();
            Drawable drawable10 = this.attributes.getDrawable(C19469R.styleable.MessageListView_streamUiPinnedMessageIndicatorIcon);
            if (drawable10 == null) {
                drawable10 = ContextKt.getDrawableCompat(this.context, C19469R.drawable.stream_ui_ic_pin);
                AbstractC22676k.m65747g(drawable10);
            }
            Drawable drawable11 = drawable10;
            int color8 = this.attributes.getColor(C19469R.styleable.MessageListView_streamUiPinnedMessageBackgroundColor, ContextKt.getColorCompat(this.context, C19469R.color.stream_ui_highlight));
            int dimension3 = (int) this.attributes.getDimension(C19469R.styleable.MessageListView_streamUiMessageStartMargin, ContextKt.getDimension(this.context, C19469R.dimen.stream_ui_message_viewholder_avatar_missing_margin));
            int dimension4 = (int) this.attributes.getDimension(C19469R.styleable.MessageListView_streamUiMessageEndMargin, ContextKt.getDimension(this.context, C19469R.dimen.stream_ui_message_viewholder_avatar_missing_margin));
            float fraction = this.attributes.getFraction(C19469R.styleable.MessageListView_streamUiMessageMaxWidthFactorMine, 1, 1, MessageListItemStyle.DEFAULT_MESSAGE_MAX_WIDTH_FACTOR);
            float fraction2 = this.attributes.getFraction(C19469R.styleable.MessageListView_streamUiMessageMaxWidthFactorTheirs, 1, 1, MessageListItemStyle.DEFAULT_MESSAGE_MAX_WIDTH_FACTOR);
            Drawable drawable12 = this.attributes.getDrawable(C19469R.styleable.MessageListView_streamUiIconFailedIndicator);
            if (drawable12 == null) {
                drawable12 = AbstractC32122c.getDrawable(this.context, C19469R.drawable.stream_ui_ic_warning);
                AbstractC22676k.m65747g(drawable12);
            }
            Drawable drawable13 = drawable12;
            Drawable drawable14 = this.attributes.getDrawable(C19469R.styleable.MessageListView_streamUiIconBannedIndicator);
            if (drawable14 == null) {
                drawable14 = AbstractC32122c.getDrawable(this.context, C19469R.drawable.stream_ui_ic_warning);
                AbstractC22676k.m65747g(drawable14);
            }
            Drawable drawable15 = drawable14;
            int resourceId = this.attributes.getResourceId(C19469R.styleable.MessageListView_streamUiMessageListLoadingMoreView, C19469R.layout.stream_ui_message_list_loading_more_view);
            int color9 = this.attributes.getColor(C19469R.styleable.MessageListView_streamUiUnreadSeparatorBackgroundColor, ContextKt.getColorCompat(this.context, C19469R.color.stream_ui_unread_label_background_color));
            TextStyle.Builder builder21 = new TextStyle.Builder(this.attributes);
            builder21.size(C19469R.styleable.MessageListView_streamUiUnreadSeparatorTextSize, ContextKt.getDimension(this.context, C19469R.dimen.stream_ui_text_small));
            builder21.color(C19469R.styleable.MessageListView_streamUiUnreadSeparatorTextColor, ContextKt.getColorCompat(this.context, C19469R.color.stream_ui_unread_label_text_color));
            builder21.font(C19469R.styleable.MessageListView_streamUiUnreadSeparatorTextFontAssets, C19469R.styleable.MessageListView_streamUiUnreadSeparatorTextFont);
            builder21.style(C19469R.styleable.MessageListView_streamUiUnreadSeparatorTextStyle, 1);
            MessageListItemStyle messageListItemStyleTransform = TransformStyle.getMessageListItemStyleTransformer().transform(new MessageListItemStyle(nullIfNotSet(this.messageBackgroundColorMine), nullIfNotSet(this.messageBackgroundColorTheirs), nullIfNotSet(this.messageLinkTextColorMine), nullIfNotSet(this.messageLinkTextColorTheirs), color, color2, this.linkDescriptionMaxLines, textStyleBuild, textStyleBuild2, textStyleBuild3, textStyleBuild4, textStyleBuild5, textStyleBuild6, textStyleBuild7, textStyleBuild8, textStyleBuild11, textStyleBuild9, textStyleBuild10, color3, textStyleBuild12, viewReactionsViewStyleBuild, editReactionsViewStyleBuild, drawable2, drawable4, drawable6, drawable7, drawable9, textStyleBuild14, color4, textStyleBuild15, color5, color6, dimension, color7, dimension2, textStyleBuild16, textStyleBuild17, textStyleBuild18, drawable11, color8, dimension3, dimension4, fraction, fraction2, z4, drawable13, drawable15, this.systemMessageGravity, resourceId, color9, builder21.build()));
            checkMessageMaxWidthFactorsRange(messageListItemStyleTransform);
            return messageListItemStyleTransform;
        }

        public final Builder linkDescriptionMaxLines(int maxLines, int defaultValue) {
            this.linkDescriptionMaxLines = this.attributes.getInt(maxLines, defaultValue);
            return this;
        }

        public final Builder messageBackgroundColorMine(int messageBackgroundColorMineStyleableId, int defaultValue) {
            this.messageBackgroundColorMine = this.attributes.getColor(messageBackgroundColorMineStyleableId, defaultValue);
            return this;
        }

        public final Builder messageBackgroundColorTheirs(int messageBackgroundColorTheirsId, int defaultValue) {
            this.messageBackgroundColorTheirs = this.attributes.getColor(messageBackgroundColorTheirsId, defaultValue);
            return this;
        }

        public final Builder messageLinkTextColorMine(int messageLinkTextColorMineId, int defaultValue) {
            this.messageLinkTextColorMine = this.attributes.getColor(messageLinkTextColorMineId, defaultValue);
            return this;
        }

        public final Builder messageLinkTextColorTheirs(int messageLinkTextColorTheirsId, int defaultValue) {
            this.messageLinkTextColorTheirs = this.attributes.getColor(messageLinkTextColorTheirsId, defaultValue);
            return this;
        }

        public final Builder reactionsEnabled(int reactionsEnabled, boolean defaultValue) {
            this.reactionsEnabled = this.attributes.getBoolean(reactionsEnabled, defaultValue);
            return this;
        }

        public final Builder systemMessageGravity(int systemMessageGravity, int defaultGravity) {
            this.systemMessageGravity = this.attributes.getInt(systemMessageGravity, defaultGravity);
            return this;
        }
    }

    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b$\n\u0002\u0010\u0007\n\u0002\b\f\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0017\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0019\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u001a\u0010\u001d\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u001a\u0010\u001f\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u001a\u0010#\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR\u001a\u0010%\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u001a\u0010'\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\bR\u001b\u0010.\u001a\u00020)8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b/\u0010\u0006R\u0014\u00100\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b0\u0010\u0006R\u0014\u00101\u001a\u00020)8\u0000X\u0080T¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010\u0006R\u0014\u00104\u001a\u00020)8\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u00102¨\u00065"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Companion;", "", "<init>", "()V", "", "DEFAULT_LINK_BACKGROUND_COLOR", "I", "getDEFAULT_LINK_BACKGROUND_COLOR$stream_chat_android_ui_components_release", "()I", "DEFAULT_TEXT_COLOR", "getDEFAULT_TEXT_COLOR$stream_chat_android_ui_components_release", "DEFAULT_TEXT_SIZE", "getDEFAULT_TEXT_SIZE$stream_chat_android_ui_components_release", "DEFAULT_TEXT_COLOR_USER_NAME", "getDEFAULT_TEXT_COLOR_USER_NAME$stream_chat_android_ui_components_release", "DEFAULT_TEXT_SIZE_USER_NAME", "getDEFAULT_TEXT_SIZE_USER_NAME$stream_chat_android_ui_components_release", "DEFAULT_TEXT_COLOR_DATE", "getDEFAULT_TEXT_COLOR_DATE$stream_chat_android_ui_components_release", "DEFAULT_TEXT_SIZE_DATE", "getDEFAULT_TEXT_SIZE_DATE$stream_chat_android_ui_components_release", "DEFAULT_TEXT_COLOR_THREAD_COUNTER", "getDEFAULT_TEXT_COLOR_THREAD_COUNTER$stream_chat_android_ui_components_release", "DEFAULT_TEXT_SIZE_THREAD_COUNTER", "getDEFAULT_TEXT_SIZE_THREAD_COUNTER$stream_chat_android_ui_components_release", "DEFAULT_TEXT_COLOR_READ_COUNTER", "getDEFAULT_TEXT_COLOR_READ_COUNTER$stream_chat_android_ui_components_release", "DEFAULT_TEXT_SIZE_READ_COUNTER", "getDEFAULT_TEXT_SIZE_READ_COUNTER$stream_chat_android_ui_components_release", "DEFAULT_TEXT_COLOR_LINK_DESCRIPTION", "getDEFAULT_TEXT_COLOR_LINK_DESCRIPTION$stream_chat_android_ui_components_release", "DEFAULT_TEXT_SIZE_LINK_DESCRIPTION", "getDEFAULT_TEXT_SIZE_LINK_DESCRIPTION$stream_chat_android_ui_components_release", "DEFAULT_TEXT_COLOR_DATE_SEPARATOR", "getDEFAULT_TEXT_COLOR_DATE_SEPARATOR$stream_chat_android_ui_components_release", "DEFAULT_TEXT_SIZE_DATE_SEPARATOR", "getDEFAULT_TEXT_SIZE_DATE_SEPARATOR$stream_chat_android_ui_components_release", "MESSAGE_STROKE_COLOR_MINE", "getMESSAGE_STROKE_COLOR_MINE$stream_chat_android_ui_components_release", "MESSAGE_STROKE_COLOR_THEIRS", "getMESSAGE_STROKE_COLOR_THEIRS$stream_chat_android_ui_components_release", "", "MESSAGE_STROKE_WIDTH_THEIRS$delegate", "Ll83/h;", "getMESSAGE_STROKE_WIDTH_THEIRS$stream_chat_android_ui_components_release", "()F", "MESSAGE_STROKE_WIDTH_THEIRS", "VALUE_NOT_SET", "DEFAULT_TEXT_STYLE", "MESSAGE_STROKE_WIDTH_MINE", "F", "BASE_MESSAGE_MAX_WIDTH_FACTOR", "DEFAULT_MESSAGE_MAX_WIDTH_FACTOR", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: renamed from: getDEFAULT_LINK_BACKGROUND_COLOR$stream_chat_android_ui_components_release */
        public final int m55309x4b0a4810() {
            return MessageListItemStyle.DEFAULT_LINK_BACKGROUND_COLOR;
        }

        public final int getDEFAULT_TEXT_COLOR$stream_chat_android_ui_components_release() {
            return MessageListItemStyle.DEFAULT_TEXT_COLOR;
        }

        /* JADX INFO: renamed from: getDEFAULT_TEXT_COLOR_DATE$stream_chat_android_ui_components_release */
        public final int m55310x873479b5() {
            return MessageListItemStyle.DEFAULT_TEXT_COLOR_DATE;
        }

        /* JADX INFO: renamed from: getDEFAULT_TEXT_COLOR_DATE_SEPARATOR$stream_chat_android_ui_components_release */
        public final int m55311xa743757b() {
            return MessageListItemStyle.DEFAULT_TEXT_COLOR_DATE_SEPARATOR;
        }

        /* JADX INFO: renamed from: getDEFAULT_TEXT_COLOR_LINK_DESCRIPTION$stream_chat_android_ui_components_release */
        public final int m55312xa6c55ede() {
            return MessageListItemStyle.DEFAULT_TEXT_COLOR_LINK_DESCRIPTION;
        }

        /* JADX INFO: renamed from: getDEFAULT_TEXT_COLOR_READ_COUNTER$stream_chat_android_ui_components_release */
        public final int m55313xeac945fa() {
            return MessageListItemStyle.DEFAULT_TEXT_COLOR_READ_COUNTER;
        }

        /* JADX INFO: renamed from: getDEFAULT_TEXT_COLOR_THREAD_COUNTER$stream_chat_android_ui_components_release */
        public final int m55314x3bce92ee() {
            return MessageListItemStyle.DEFAULT_TEXT_COLOR_THREAD_COUNTER;
        }

        /* JADX INFO: renamed from: getDEFAULT_TEXT_COLOR_USER_NAME$stream_chat_android_ui_components_release */
        public final int m55315x80188552() {
            return MessageListItemStyle.DEFAULT_TEXT_COLOR_USER_NAME;
        }

        public final int getDEFAULT_TEXT_SIZE$stream_chat_android_ui_components_release() {
            return MessageListItemStyle.DEFAULT_TEXT_SIZE;
        }

        /* JADX INFO: renamed from: getDEFAULT_TEXT_SIZE_DATE$stream_chat_android_ui_components_release */
        public final int m55316x6ba05c3b() {
            return MessageListItemStyle.DEFAULT_TEXT_SIZE_DATE;
        }

        /* JADX INFO: renamed from: getDEFAULT_TEXT_SIZE_DATE_SEPARATOR$stream_chat_android_ui_components_release */
        public final int m55317x17726881() {
            return MessageListItemStyle.DEFAULT_TEXT_SIZE_DATE_SEPARATOR;
        }

        /* JADX INFO: renamed from: getDEFAULT_TEXT_SIZE_LINK_DESCRIPTION$stream_chat_android_ui_components_release */
        public final int m55318xc703a864() {
            return MessageListItemStyle.DEFAULT_TEXT_SIZE_LINK_DESCRIPTION;
        }

        /* JADX INFO: renamed from: getDEFAULT_TEXT_SIZE_READ_COUNTER$stream_chat_android_ui_components_release */
        public final int m55319x3a054280() {
            return MessageListItemStyle.DEFAULT_TEXT_SIZE_READ_COUNTER;
        }

        /* JADX INFO: renamed from: getDEFAULT_TEXT_SIZE_THREAD_COUNTER$stream_chat_android_ui_components_release */
        public final int m55320xabfd85f4() {
            return MessageListItemStyle.DEFAULT_TEXT_SIZE_THREAD_COUNTER;
        }

        /* JADX INFO: renamed from: getDEFAULT_TEXT_SIZE_USER_NAME$stream_chat_android_ui_components_release */
        public final int m55321x3273468c() {
            return MessageListItemStyle.DEFAULT_TEXT_SIZE_USER_NAME;
        }

        /* JADX INFO: renamed from: getMESSAGE_STROKE_COLOR_MINE$stream_chat_android_ui_components_release */
        public final int m55322x3b5abdb5() {
            return MessageListItemStyle.MESSAGE_STROKE_COLOR_MINE;
        }

        /* JADX INFO: renamed from: getMESSAGE_STROKE_COLOR_THEIRS$stream_chat_android_ui_components_release */
        public final int m55323x453a8afb() {
            return MessageListItemStyle.MESSAGE_STROKE_COLOR_THEIRS;
        }

        /* JADX INFO: renamed from: getMESSAGE_STROKE_WIDTH_THEIRS$stream_chat_android_ui_components_release */
        public final float m55324x72528af8() {
            return ((Number) MessageListItemStyle.MESSAGE_STROKE_WIDTH_THEIRS$delegate.getValue()).floatValue();
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        int i13 = C19469R.color.stream_ui_text_color_secondary;
        DEFAULT_TEXT_COLOR_USER_NAME = i13;
        int i14 = C19469R.dimen.stream_ui_text_small;
        DEFAULT_TEXT_SIZE_USER_NAME = i14;
        DEFAULT_TEXT_COLOR_DATE = i13;
        DEFAULT_TEXT_SIZE_DATE = i14;
        DEFAULT_TEXT_COLOR_THREAD_COUNTER = C19469R.color.stream_ui_accent_blue;
        DEFAULT_TEXT_SIZE_THREAD_COUNTER = i14;
        DEFAULT_TEXT_COLOR_READ_COUNTER = i13;
        DEFAULT_TEXT_SIZE_READ_COUNTER = i14;
        DEFAULT_TEXT_COLOR_LINK_DESCRIPTION = i13;
        DEFAULT_TEXT_SIZE_LINK_DESCRIPTION = i14;
        DEFAULT_TEXT_COLOR_DATE_SEPARATOR = C19469R.color.stream_ui_white;
        DEFAULT_TEXT_SIZE_DATE_SEPARATOR = i14;
        MESSAGE_STROKE_COLOR_MINE = C19469R.color.stream_ui_literal_transparent;
        MESSAGE_STROKE_COLOR_THEIRS = C19469R.color.stream_ui_grey_whisper;
        MESSAGE_STROKE_WIDTH_THEIRS$delegate = AbstractC30060g.m92088H(new C19728a(0));
    }

    public MessageListItemStyle(Integer num, Integer num2, Integer num3, Integer num4, int i13, int i14, int i15, TextStyle textStyleMine, TextStyle textStyleTheirs, TextStyle textStyleUserName, TextStyle textStyleMessageDate, TextStyle textStyleMessageLanguage, TextStyle textStyleThreadCounter, TextStyle textStyleReadCounter, TextStyle threadSeparatorTextStyle, TextStyle textStyleLinkLabel, TextStyle textStyleLinkTitle, TextStyle textStyleLinkDescription, int i16, TextStyle textStyleDateSeparator, ViewReactionsViewStyle reactionsViewStyle, EditReactionsViewStyle editReactionsViewStyle, Drawable iconIndicatorSent, Drawable iconIndicatorDelivered, Drawable iconIndicatorRead, Drawable iconIndicatorPendingSync, Drawable iconOnlyVisibleToYou, TextStyle textStyleMessageDeletedMine, int i17, TextStyle textStyleMessageDeletedTheirs, int i18, int i19, float f13, int i24, float f14, TextStyle textStyleSystemMessage, TextStyle textStyleErrorMessage, TextStyle pinnedMessageIndicatorTextStyle, Drawable pinnedMessageIndicatorIcon, int i25, int i26, int i27, float f15, float f16, boolean z4, Drawable iconFailedMessage, Drawable iconBannedMessage, int i28, int i29, int i34, TextStyle unreadSeparatorTextStyle) {
        AbstractC22676k.m65750j(textStyleMine, "textStyleMine");
        AbstractC22676k.m65750j(textStyleTheirs, "textStyleTheirs");
        AbstractC22676k.m65750j(textStyleUserName, "textStyleUserName");
        AbstractC22676k.m65750j(textStyleMessageDate, "textStyleMessageDate");
        AbstractC22676k.m65750j(textStyleMessageLanguage, "textStyleMessageLanguage");
        AbstractC22676k.m65750j(textStyleThreadCounter, "textStyleThreadCounter");
        AbstractC22676k.m65750j(textStyleReadCounter, "textStyleReadCounter");
        AbstractC22676k.m65750j(threadSeparatorTextStyle, "threadSeparatorTextStyle");
        AbstractC22676k.m65750j(textStyleLinkLabel, "textStyleLinkLabel");
        AbstractC22676k.m65750j(textStyleLinkTitle, "textStyleLinkTitle");
        AbstractC22676k.m65750j(textStyleLinkDescription, "textStyleLinkDescription");
        AbstractC22676k.m65750j(textStyleDateSeparator, "textStyleDateSeparator");
        AbstractC22676k.m65750j(reactionsViewStyle, "reactionsViewStyle");
        AbstractC22676k.m65750j(editReactionsViewStyle, "editReactionsViewStyle");
        AbstractC22676k.m65750j(iconIndicatorSent, "iconIndicatorSent");
        AbstractC22676k.m65750j(iconIndicatorDelivered, "iconIndicatorDelivered");
        AbstractC22676k.m65750j(iconIndicatorRead, "iconIndicatorRead");
        AbstractC22676k.m65750j(iconIndicatorPendingSync, "iconIndicatorPendingSync");
        AbstractC22676k.m65750j(iconOnlyVisibleToYou, "iconOnlyVisibleToYou");
        AbstractC22676k.m65750j(textStyleMessageDeletedMine, "textStyleMessageDeletedMine");
        AbstractC22676k.m65750j(textStyleMessageDeletedTheirs, "textStyleMessageDeletedTheirs");
        AbstractC22676k.m65750j(textStyleSystemMessage, "textStyleSystemMessage");
        AbstractC22676k.m65750j(textStyleErrorMessage, "textStyleErrorMessage");
        AbstractC22676k.m65750j(pinnedMessageIndicatorTextStyle, "pinnedMessageIndicatorTextStyle");
        AbstractC22676k.m65750j(pinnedMessageIndicatorIcon, "pinnedMessageIndicatorIcon");
        AbstractC22676k.m65750j(iconFailedMessage, "iconFailedMessage");
        AbstractC22676k.m65750j(iconBannedMessage, "iconBannedMessage");
        AbstractC22676k.m65750j(unreadSeparatorTextStyle, "unreadSeparatorTextStyle");
        this.messageBackgroundColorMine = num;
        this.messageBackgroundColorTheirs = num2;
        this.messageLinkTextColorMine = num3;
        this.messageLinkTextColorTheirs = num4;
        this.messageLinkBackgroundColorMine = i13;
        this.messageLinkBackgroundColorTheirs = i14;
        this.linkDescriptionMaxLines = i15;
        this.textStyleMine = textStyleMine;
        this.textStyleTheirs = textStyleTheirs;
        this.textStyleUserName = textStyleUserName;
        this.textStyleMessageDate = textStyleMessageDate;
        this.textStyleMessageLanguage = textStyleMessageLanguage;
        this.textStyleThreadCounter = textStyleThreadCounter;
        this.textStyleReadCounter = textStyleReadCounter;
        this.threadSeparatorTextStyle = threadSeparatorTextStyle;
        this.textStyleLinkLabel = textStyleLinkLabel;
        this.textStyleLinkTitle = textStyleLinkTitle;
        this.textStyleLinkDescription = textStyleLinkDescription;
        this.dateSeparatorBackgroundColor = i16;
        this.textStyleDateSeparator = textStyleDateSeparator;
        this.reactionsViewStyle = reactionsViewStyle;
        this.editReactionsViewStyle = editReactionsViewStyle;
        this.iconIndicatorSent = iconIndicatorSent;
        this.iconIndicatorDelivered = iconIndicatorDelivered;
        this.iconIndicatorRead = iconIndicatorRead;
        this.iconIndicatorPendingSync = iconIndicatorPendingSync;
        this.iconOnlyVisibleToYou = iconOnlyVisibleToYou;
        this.textStyleMessageDeletedMine = textStyleMessageDeletedMine;
        this.messageDeletedBackgroundMine = i17;
        this.textStyleMessageDeletedTheirs = textStyleMessageDeletedTheirs;
        this.messageDeletedBackgroundTheirs = i18;
        this.messageStrokeColorMine = i19;
        this.messageStrokeWidthMine = f13;
        this.messageStrokeColorTheirs = i24;
        this.messageStrokeWidthTheirs = f14;
        this.textStyleSystemMessage = textStyleSystemMessage;
        this.textStyleErrorMessage = textStyleErrorMessage;
        this.pinnedMessageIndicatorTextStyle = pinnedMessageIndicatorTextStyle;
        this.pinnedMessageIndicatorIcon = pinnedMessageIndicatorIcon;
        this.pinnedMessageBackgroundColor = i25;
        this.messageStartMargin = i26;
        this.messageEndMargin = i27;
        this.messageMaxWidthFactorMine = f15;
        this.messageMaxWidthFactorTheirs = f16;
        this.showMessageDeliveryStatusIndicator = z4;
        this.iconFailedMessage = iconFailedMessage;
        this.iconBannedMessage = iconBannedMessage;
        this.systemMessageAlignment = i28;
        this.loadingMoreView = i29;
        this.unreadSeparatorBackgroundColor = i34;
        this.unreadSeparatorTextStyle = unreadSeparatorTextStyle;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getMessageBackgroundColorMine() {
        return this.messageBackgroundColorMine;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final TextStyle getTextStyleUserName() {
        return this.textStyleUserName;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final TextStyle getTextStyleMessageDate() {
        return this.textStyleMessageDate;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final TextStyle getTextStyleMessageLanguage() {
        return this.textStyleMessageLanguage;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final TextStyle getTextStyleThreadCounter() {
        return this.textStyleThreadCounter;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final TextStyle getTextStyleReadCounter() {
        return this.textStyleReadCounter;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final TextStyle getThreadSeparatorTextStyle() {
        return this.threadSeparatorTextStyle;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final TextStyle getTextStyleLinkLabel() {
        return this.textStyleLinkLabel;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final TextStyle getTextStyleLinkTitle() {
        return this.textStyleLinkTitle;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final TextStyle getTextStyleLinkDescription() {
        return this.textStyleLinkDescription;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getDateSeparatorBackgroundColor() {
        return this.dateSeparatorBackgroundColor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getMessageBackgroundColorTheirs() {
        return this.messageBackgroundColorTheirs;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final TextStyle getTextStyleDateSeparator() {
        return this.textStyleDateSeparator;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final ViewReactionsViewStyle getReactionsViewStyle() {
        return this.reactionsViewStyle;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final EditReactionsViewStyle getEditReactionsViewStyle() {
        return this.editReactionsViewStyle;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Drawable getIconIndicatorSent() {
        return this.iconIndicatorSent;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Drawable getIconIndicatorDelivered() {
        return this.iconIndicatorDelivered;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Drawable getIconIndicatorRead() {
        return this.iconIndicatorRead;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Drawable getIconIndicatorPendingSync() {
        return this.iconIndicatorPendingSync;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Drawable getIconOnlyVisibleToYou() {
        return this.iconOnlyVisibleToYou;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final TextStyle getTextStyleMessageDeletedMine() {
        return this.textStyleMessageDeletedMine;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final int getMessageDeletedBackgroundMine() {
        return this.messageDeletedBackgroundMine;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getMessageLinkTextColorMine() {
        return this.messageLinkTextColorMine;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final TextStyle getTextStyleMessageDeletedTheirs() {
        return this.textStyleMessageDeletedTheirs;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final int getMessageDeletedBackgroundTheirs() {
        return this.messageDeletedBackgroundTheirs;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final int getMessageStrokeColorMine() {
        return this.messageStrokeColorMine;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final float getMessageStrokeWidthMine() {
        return this.messageStrokeWidthMine;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final int getMessageStrokeColorTheirs() {
        return this.messageStrokeColorTheirs;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final float getMessageStrokeWidthTheirs() {
        return this.messageStrokeWidthTheirs;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final TextStyle getTextStyleSystemMessage() {
        return this.textStyleSystemMessage;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final TextStyle getTextStyleErrorMessage() {
        return this.textStyleErrorMessage;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final TextStyle getPinnedMessageIndicatorTextStyle() {
        return this.pinnedMessageIndicatorTextStyle;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final Drawable getPinnedMessageIndicatorIcon() {
        return this.pinnedMessageIndicatorIcon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getMessageLinkTextColorTheirs() {
        return this.messageLinkTextColorTheirs;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final int getPinnedMessageBackgroundColor() {
        return this.pinnedMessageBackgroundColor;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final int getMessageStartMargin() {
        return this.messageStartMargin;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final int getMessageEndMargin() {
        return this.messageEndMargin;
    }

    /* JADX INFO: renamed from: component43, reason: from getter */
    public final float getMessageMaxWidthFactorMine() {
        return this.messageMaxWidthFactorMine;
    }

    /* JADX INFO: renamed from: component44, reason: from getter */
    public final float getMessageMaxWidthFactorTheirs() {
        return this.messageMaxWidthFactorTheirs;
    }

    /* JADX INFO: renamed from: component45, reason: from getter */
    public final boolean getShowMessageDeliveryStatusIndicator() {
        return this.showMessageDeliveryStatusIndicator;
    }

    /* JADX INFO: renamed from: component46, reason: from getter */
    public final Drawable getIconFailedMessage() {
        return this.iconFailedMessage;
    }

    /* JADX INFO: renamed from: component47, reason: from getter */
    public final Drawable getIconBannedMessage() {
        return this.iconBannedMessage;
    }

    /* JADX INFO: renamed from: component48, reason: from getter */
    public final int getSystemMessageAlignment() {
        return this.systemMessageAlignment;
    }

    /* JADX INFO: renamed from: component49, reason: from getter */
    public final int getLoadingMoreView() {
        return this.loadingMoreView;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMessageLinkBackgroundColorMine() {
        return this.messageLinkBackgroundColorMine;
    }

    /* JADX INFO: renamed from: component50, reason: from getter */
    public final int getUnreadSeparatorBackgroundColor() {
        return this.unreadSeparatorBackgroundColor;
    }

    /* JADX INFO: renamed from: component51, reason: from getter */
    public final TextStyle getUnreadSeparatorTextStyle() {
        return this.unreadSeparatorTextStyle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getMessageLinkBackgroundColorTheirs() {
        return this.messageLinkBackgroundColorTheirs;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getLinkDescriptionMaxLines() {
        return this.linkDescriptionMaxLines;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final TextStyle getTextStyleMine() {
        return this.textStyleMine;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final TextStyle getTextStyleTheirs() {
        return this.textStyleTheirs;
    }

    public final MessageListItemStyle copy(Integer messageBackgroundColorMine, Integer messageBackgroundColorTheirs, Integer messageLinkTextColorMine, Integer messageLinkTextColorTheirs, int messageLinkBackgroundColorMine, int messageLinkBackgroundColorTheirs, int linkDescriptionMaxLines, TextStyle textStyleMine, TextStyle textStyleTheirs, TextStyle textStyleUserName, TextStyle textStyleMessageDate, TextStyle textStyleMessageLanguage, TextStyle textStyleThreadCounter, TextStyle textStyleReadCounter, TextStyle threadSeparatorTextStyle, TextStyle textStyleLinkLabel, TextStyle textStyleLinkTitle, TextStyle textStyleLinkDescription, int dateSeparatorBackgroundColor, TextStyle textStyleDateSeparator, ViewReactionsViewStyle reactionsViewStyle, EditReactionsViewStyle editReactionsViewStyle, Drawable iconIndicatorSent, Drawable iconIndicatorDelivered, Drawable iconIndicatorRead, Drawable iconIndicatorPendingSync, Drawable iconOnlyVisibleToYou, TextStyle textStyleMessageDeletedMine, int messageDeletedBackgroundMine, TextStyle textStyleMessageDeletedTheirs, int messageDeletedBackgroundTheirs, int messageStrokeColorMine, float messageStrokeWidthMine, int messageStrokeColorTheirs, float messageStrokeWidthTheirs, TextStyle textStyleSystemMessage, TextStyle textStyleErrorMessage, TextStyle pinnedMessageIndicatorTextStyle, Drawable pinnedMessageIndicatorIcon, int pinnedMessageBackgroundColor, int messageStartMargin, int messageEndMargin, float messageMaxWidthFactorMine, float messageMaxWidthFactorTheirs, boolean showMessageDeliveryStatusIndicator, Drawable iconFailedMessage, Drawable iconBannedMessage, int systemMessageAlignment, int loadingMoreView, int unreadSeparatorBackgroundColor, TextStyle unreadSeparatorTextStyle) {
        AbstractC22676k.m65750j(textStyleMine, "textStyleMine");
        AbstractC22676k.m65750j(textStyleTheirs, "textStyleTheirs");
        AbstractC22676k.m65750j(textStyleUserName, "textStyleUserName");
        AbstractC22676k.m65750j(textStyleMessageDate, "textStyleMessageDate");
        AbstractC22676k.m65750j(textStyleMessageLanguage, "textStyleMessageLanguage");
        AbstractC22676k.m65750j(textStyleThreadCounter, "textStyleThreadCounter");
        AbstractC22676k.m65750j(textStyleReadCounter, "textStyleReadCounter");
        AbstractC22676k.m65750j(threadSeparatorTextStyle, "threadSeparatorTextStyle");
        AbstractC22676k.m65750j(textStyleLinkLabel, "textStyleLinkLabel");
        AbstractC22676k.m65750j(textStyleLinkTitle, "textStyleLinkTitle");
        AbstractC22676k.m65750j(textStyleLinkDescription, "textStyleLinkDescription");
        AbstractC22676k.m65750j(textStyleDateSeparator, "textStyleDateSeparator");
        AbstractC22676k.m65750j(reactionsViewStyle, "reactionsViewStyle");
        AbstractC22676k.m65750j(editReactionsViewStyle, "editReactionsViewStyle");
        AbstractC22676k.m65750j(iconIndicatorSent, "iconIndicatorSent");
        AbstractC22676k.m65750j(iconIndicatorDelivered, "iconIndicatorDelivered");
        AbstractC22676k.m65750j(iconIndicatorRead, "iconIndicatorRead");
        AbstractC22676k.m65750j(iconIndicatorPendingSync, "iconIndicatorPendingSync");
        AbstractC22676k.m65750j(iconOnlyVisibleToYou, "iconOnlyVisibleToYou");
        AbstractC22676k.m65750j(textStyleMessageDeletedMine, "textStyleMessageDeletedMine");
        AbstractC22676k.m65750j(textStyleMessageDeletedTheirs, "textStyleMessageDeletedTheirs");
        AbstractC22676k.m65750j(textStyleSystemMessage, "textStyleSystemMessage");
        AbstractC22676k.m65750j(textStyleErrorMessage, "textStyleErrorMessage");
        AbstractC22676k.m65750j(pinnedMessageIndicatorTextStyle, "pinnedMessageIndicatorTextStyle");
        AbstractC22676k.m65750j(pinnedMessageIndicatorIcon, "pinnedMessageIndicatorIcon");
        AbstractC22676k.m65750j(iconFailedMessage, "iconFailedMessage");
        AbstractC22676k.m65750j(iconBannedMessage, "iconBannedMessage");
        AbstractC22676k.m65750j(unreadSeparatorTextStyle, "unreadSeparatorTextStyle");
        return new MessageListItemStyle(messageBackgroundColorMine, messageBackgroundColorTheirs, messageLinkTextColorMine, messageLinkTextColorTheirs, messageLinkBackgroundColorMine, messageLinkBackgroundColorTheirs, linkDescriptionMaxLines, textStyleMine, textStyleTheirs, textStyleUserName, textStyleMessageDate, textStyleMessageLanguage, textStyleThreadCounter, textStyleReadCounter, threadSeparatorTextStyle, textStyleLinkLabel, textStyleLinkTitle, textStyleLinkDescription, dateSeparatorBackgroundColor, textStyleDateSeparator, reactionsViewStyle, editReactionsViewStyle, iconIndicatorSent, iconIndicatorDelivered, iconIndicatorRead, iconIndicatorPendingSync, iconOnlyVisibleToYou, textStyleMessageDeletedMine, messageDeletedBackgroundMine, textStyleMessageDeletedTheirs, messageDeletedBackgroundTheirs, messageStrokeColorMine, messageStrokeWidthMine, messageStrokeColorTheirs, messageStrokeWidthTheirs, textStyleSystemMessage, textStyleErrorMessage, pinnedMessageIndicatorTextStyle, pinnedMessageIndicatorIcon, pinnedMessageBackgroundColor, messageStartMargin, messageEndMargin, messageMaxWidthFactorMine, messageMaxWidthFactorTheirs, showMessageDeliveryStatusIndicator, iconFailedMessage, iconBannedMessage, systemMessageAlignment, loadingMoreView, unreadSeparatorBackgroundColor, unreadSeparatorTextStyle);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageListItemStyle)) {
            return false;
        }
        MessageListItemStyle messageListItemStyle = (MessageListItemStyle) other;
        return AbstractC22676k.m65745e(this.messageBackgroundColorMine, messageListItemStyle.messageBackgroundColorMine) && AbstractC22676k.m65745e(this.messageBackgroundColorTheirs, messageListItemStyle.messageBackgroundColorTheirs) && AbstractC22676k.m65745e(this.messageLinkTextColorMine, messageListItemStyle.messageLinkTextColorMine) && AbstractC22676k.m65745e(this.messageLinkTextColorTheirs, messageListItemStyle.messageLinkTextColorTheirs) && this.messageLinkBackgroundColorMine == messageListItemStyle.messageLinkBackgroundColorMine && this.messageLinkBackgroundColorTheirs == messageListItemStyle.messageLinkBackgroundColorTheirs && this.linkDescriptionMaxLines == messageListItemStyle.linkDescriptionMaxLines && AbstractC22676k.m65745e(this.textStyleMine, messageListItemStyle.textStyleMine) && AbstractC22676k.m65745e(this.textStyleTheirs, messageListItemStyle.textStyleTheirs) && AbstractC22676k.m65745e(this.textStyleUserName, messageListItemStyle.textStyleUserName) && AbstractC22676k.m65745e(this.textStyleMessageDate, messageListItemStyle.textStyleMessageDate) && AbstractC22676k.m65745e(this.textStyleMessageLanguage, messageListItemStyle.textStyleMessageLanguage) && AbstractC22676k.m65745e(this.textStyleThreadCounter, messageListItemStyle.textStyleThreadCounter) && AbstractC22676k.m65745e(this.textStyleReadCounter, messageListItemStyle.textStyleReadCounter) && AbstractC22676k.m65745e(this.threadSeparatorTextStyle, messageListItemStyle.threadSeparatorTextStyle) && AbstractC22676k.m65745e(this.textStyleLinkLabel, messageListItemStyle.textStyleLinkLabel) && AbstractC22676k.m65745e(this.textStyleLinkTitle, messageListItemStyle.textStyleLinkTitle) && AbstractC22676k.m65745e(this.textStyleLinkDescription, messageListItemStyle.textStyleLinkDescription) && this.dateSeparatorBackgroundColor == messageListItemStyle.dateSeparatorBackgroundColor && AbstractC22676k.m65745e(this.textStyleDateSeparator, messageListItemStyle.textStyleDateSeparator) && AbstractC22676k.m65745e(this.reactionsViewStyle, messageListItemStyle.reactionsViewStyle) && AbstractC22676k.m65745e(this.editReactionsViewStyle, messageListItemStyle.editReactionsViewStyle) && AbstractC22676k.m65745e(this.iconIndicatorSent, messageListItemStyle.iconIndicatorSent) && AbstractC22676k.m65745e(this.iconIndicatorDelivered, messageListItemStyle.iconIndicatorDelivered) && AbstractC22676k.m65745e(this.iconIndicatorRead, messageListItemStyle.iconIndicatorRead) && AbstractC22676k.m65745e(this.iconIndicatorPendingSync, messageListItemStyle.iconIndicatorPendingSync) && AbstractC22676k.m65745e(this.iconOnlyVisibleToYou, messageListItemStyle.iconOnlyVisibleToYou) && AbstractC22676k.m65745e(this.textStyleMessageDeletedMine, messageListItemStyle.textStyleMessageDeletedMine) && this.messageDeletedBackgroundMine == messageListItemStyle.messageDeletedBackgroundMine && AbstractC22676k.m65745e(this.textStyleMessageDeletedTheirs, messageListItemStyle.textStyleMessageDeletedTheirs) && this.messageDeletedBackgroundTheirs == messageListItemStyle.messageDeletedBackgroundTheirs && this.messageStrokeColorMine == messageListItemStyle.messageStrokeColorMine && Float.compare(this.messageStrokeWidthMine, messageListItemStyle.messageStrokeWidthMine) == 0 && this.messageStrokeColorTheirs == messageListItemStyle.messageStrokeColorTheirs && Float.compare(this.messageStrokeWidthTheirs, messageListItemStyle.messageStrokeWidthTheirs) == 0 && AbstractC22676k.m65745e(this.textStyleSystemMessage, messageListItemStyle.textStyleSystemMessage) && AbstractC22676k.m65745e(this.textStyleErrorMessage, messageListItemStyle.textStyleErrorMessage) && AbstractC22676k.m65745e(this.pinnedMessageIndicatorTextStyle, messageListItemStyle.pinnedMessageIndicatorTextStyle) && AbstractC22676k.m65745e(this.pinnedMessageIndicatorIcon, messageListItemStyle.pinnedMessageIndicatorIcon) && this.pinnedMessageBackgroundColor == messageListItemStyle.pinnedMessageBackgroundColor && this.messageStartMargin == messageListItemStyle.messageStartMargin && this.messageEndMargin == messageListItemStyle.messageEndMargin && Float.compare(this.messageMaxWidthFactorMine, messageListItemStyle.messageMaxWidthFactorMine) == 0 && Float.compare(this.messageMaxWidthFactorTheirs, messageListItemStyle.messageMaxWidthFactorTheirs) == 0 && this.showMessageDeliveryStatusIndicator == messageListItemStyle.showMessageDeliveryStatusIndicator && AbstractC22676k.m65745e(this.iconFailedMessage, messageListItemStyle.iconFailedMessage) && AbstractC22676k.m65745e(this.iconBannedMessage, messageListItemStyle.iconBannedMessage) && this.systemMessageAlignment == messageListItemStyle.systemMessageAlignment && this.loadingMoreView == messageListItemStyle.loadingMoreView && this.unreadSeparatorBackgroundColor == messageListItemStyle.unreadSeparatorBackgroundColor && AbstractC22676k.m65745e(this.unreadSeparatorTextStyle, messageListItemStyle.unreadSeparatorTextStyle);
    }

    public final int getDateSeparatorBackgroundColor() {
        return this.dateSeparatorBackgroundColor;
    }

    public final EditReactionsViewStyle getEditReactionsViewStyle() {
        return this.editReactionsViewStyle;
    }

    public final Drawable getIconBannedMessage() {
        return this.iconBannedMessage;
    }

    public final Drawable getIconFailedMessage() {
        return this.iconFailedMessage;
    }

    public final Drawable getIconIndicatorDelivered() {
        return this.iconIndicatorDelivered;
    }

    public final Drawable getIconIndicatorPendingSync() {
        return this.iconIndicatorPendingSync;
    }

    public final Drawable getIconIndicatorRead() {
        return this.iconIndicatorRead;
    }

    public final Drawable getIconIndicatorSent() {
        return this.iconIndicatorSent;
    }

    public final Drawable getIconOnlyVisibleToYou() {
        return this.iconOnlyVisibleToYou;
    }

    public final int getLinkDescriptionMaxLines() {
        return this.linkDescriptionMaxLines;
    }

    public final int getLoadingMoreView() {
        return this.loadingMoreView;
    }

    public final Integer getMessageBackgroundColorMine() {
        return this.messageBackgroundColorMine;
    }

    public final Integer getMessageBackgroundColorTheirs() {
        return this.messageBackgroundColorTheirs;
    }

    public final int getMessageDeletedBackgroundMine() {
        return this.messageDeletedBackgroundMine;
    }

    public final int getMessageDeletedBackgroundTheirs() {
        return this.messageDeletedBackgroundTheirs;
    }

    public final int getMessageEndMargin() {
        return this.messageEndMargin;
    }

    public final int getMessageLinkBackgroundColorMine() {
        return this.messageLinkBackgroundColorMine;
    }

    public final int getMessageLinkBackgroundColorTheirs() {
        return this.messageLinkBackgroundColorTheirs;
    }

    public final Integer getMessageLinkTextColorMine() {
        return this.messageLinkTextColorMine;
    }

    public final Integer getMessageLinkTextColorTheirs() {
        return this.messageLinkTextColorTheirs;
    }

    public final float getMessageMaxWidthFactorMine() {
        return this.messageMaxWidthFactorMine;
    }

    public final float getMessageMaxWidthFactorTheirs() {
        return this.messageMaxWidthFactorTheirs;
    }

    public final int getMessageStartMargin() {
        return this.messageStartMargin;
    }

    public final int getMessageStrokeColorMine() {
        return this.messageStrokeColorMine;
    }

    public final int getMessageStrokeColorTheirs() {
        return this.messageStrokeColorTheirs;
    }

    public final float getMessageStrokeWidthMine() {
        return this.messageStrokeWidthMine;
    }

    public final float getMessageStrokeWidthTheirs() {
        return this.messageStrokeWidthTheirs;
    }

    public final int getPinnedMessageBackgroundColor() {
        return this.pinnedMessageBackgroundColor;
    }

    public final Drawable getPinnedMessageIndicatorIcon() {
        return this.pinnedMessageIndicatorIcon;
    }

    public final TextStyle getPinnedMessageIndicatorTextStyle() {
        return this.pinnedMessageIndicatorTextStyle;
    }

    public final ViewReactionsViewStyle getReactionsViewStyle() {
        return this.reactionsViewStyle;
    }

    public final boolean getShowMessageDeliveryStatusIndicator() {
        return this.showMessageDeliveryStatusIndicator;
    }

    public final Integer getStyleLinkTextColor(boolean isMine) {
        return isMine ? this.messageLinkTextColorMine : this.messageLinkTextColorTheirs;
    }

    public final Integer getStyleTextColor(boolean isMine) {
        return (isMine ? this.textStyleMine : this.textStyleTheirs).colorOrNull();
    }

    public final int getSystemMessageAlignment() {
        return this.systemMessageAlignment;
    }

    public final TextStyle getTextStyleDateSeparator() {
        return this.textStyleDateSeparator;
    }

    public final TextStyle getTextStyleErrorMessage() {
        return this.textStyleErrorMessage;
    }

    public final TextStyle getTextStyleLinkDescription() {
        return this.textStyleLinkDescription;
    }

    public final TextStyle getTextStyleLinkLabel() {
        return this.textStyleLinkLabel;
    }

    public final TextStyle getTextStyleLinkTitle() {
        return this.textStyleLinkTitle;
    }

    public final TextStyle getTextStyleMessageDate() {
        return this.textStyleMessageDate;
    }

    public final TextStyle getTextStyleMessageDeletedMine() {
        return this.textStyleMessageDeletedMine;
    }

    public final TextStyle getTextStyleMessageDeletedTheirs() {
        return this.textStyleMessageDeletedTheirs;
    }

    public final TextStyle getTextStyleMessageLanguage() {
        return this.textStyleMessageLanguage;
    }

    public final TextStyle getTextStyleMine() {
        return this.textStyleMine;
    }

    public final TextStyle getTextStyleReadCounter() {
        return this.textStyleReadCounter;
    }

    public final TextStyle getTextStyleSystemMessage() {
        return this.textStyleSystemMessage;
    }

    public final TextStyle getTextStyleTheirs() {
        return this.textStyleTheirs;
    }

    public final TextStyle getTextStyleThreadCounter() {
        return this.textStyleThreadCounter;
    }

    public final TextStyle getTextStyleUserName() {
        return this.textStyleUserName;
    }

    public final TextStyle getThreadSeparatorTextStyle() {
        return this.threadSeparatorTextStyle;
    }

    public final int getUnreadSeparatorBackgroundColor() {
        return this.unreadSeparatorBackgroundColor;
    }

    public final TextStyle getUnreadSeparatorTextStyle() {
        return this.unreadSeparatorTextStyle;
    }

    public final int hashCode() {
        Integer num = this.messageBackgroundColorMine;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.messageBackgroundColorTheirs;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.messageLinkTextColorMine;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.messageLinkTextColorTheirs;
        return this.unreadSeparatorTextStyle.hashCode() + AbstractC11266d.m30448b(this.unreadSeparatorBackgroundColor, AbstractC11266d.m30448b(this.loadingMoreView, AbstractC11266d.m30448b(this.systemMessageAlignment, AbstractC26725a.m79497a(this.iconBannedMessage, AbstractC26725a.m79497a(this.iconFailedMessage, AbstractC2875y.m8289b(AbstractC11266d.m30447a(this.messageMaxWidthFactorTheirs, AbstractC11266d.m30447a(this.messageMaxWidthFactorMine, AbstractC11266d.m30448b(this.messageEndMargin, AbstractC11266d.m30448b(this.messageStartMargin, AbstractC11266d.m30448b(this.pinnedMessageBackgroundColor, AbstractC26725a.m79497a(this.pinnedMessageIndicatorIcon, AbstractC26725a.m79499c(this.pinnedMessageIndicatorTextStyle, AbstractC26725a.m79499c(this.textStyleErrorMessage, AbstractC26725a.m79499c(this.textStyleSystemMessage, AbstractC11266d.m30447a(this.messageStrokeWidthTheirs, AbstractC11266d.m30448b(this.messageStrokeColorTheirs, AbstractC11266d.m30447a(this.messageStrokeWidthMine, AbstractC11266d.m30448b(this.messageStrokeColorMine, AbstractC11266d.m30448b(this.messageDeletedBackgroundTheirs, AbstractC26725a.m79499c(this.textStyleMessageDeletedTheirs, AbstractC11266d.m30448b(this.messageDeletedBackgroundMine, AbstractC26725a.m79499c(this.textStyleMessageDeletedMine, AbstractC26725a.m79497a(this.iconOnlyVisibleToYou, AbstractC26725a.m79497a(this.iconIndicatorPendingSync, AbstractC26725a.m79497a(this.iconIndicatorRead, AbstractC26725a.m79497a(this.iconIndicatorDelivered, AbstractC26725a.m79497a(this.iconIndicatorSent, (this.editReactionsViewStyle.hashCode() + ((this.reactionsViewStyle.hashCode() + AbstractC26725a.m79499c(this.textStyleDateSeparator, AbstractC11266d.m30448b(this.dateSeparatorBackgroundColor, AbstractC26725a.m79499c(this.textStyleLinkDescription, AbstractC26725a.m79499c(this.textStyleLinkTitle, AbstractC26725a.m79499c(this.textStyleLinkLabel, AbstractC26725a.m79499c(this.threadSeparatorTextStyle, AbstractC26725a.m79499c(this.textStyleReadCounter, AbstractC26725a.m79499c(this.textStyleThreadCounter, AbstractC26725a.m79499c(this.textStyleMessageLanguage, AbstractC26725a.m79499c(this.textStyleMessageDate, AbstractC26725a.m79499c(this.textStyleUserName, AbstractC26725a.m79499c(this.textStyleTheirs, AbstractC26725a.m79499c(this.textStyleMine, AbstractC11266d.m30448b(this.linkDescriptionMaxLines, AbstractC11266d.m30448b(this.messageLinkBackgroundColorTheirs, AbstractC11266d.m30448b(this.messageLinkBackgroundColorMine, (iHashCode3 + (num4 != null ? num4.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31)) * 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31, this.showMessageDeliveryStatusIndicator), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        Integer num = this.messageBackgroundColorMine;
        Integer num2 = this.messageBackgroundColorTheirs;
        Integer num3 = this.messageLinkTextColorMine;
        Integer num4 = this.messageLinkTextColorTheirs;
        int i13 = this.messageLinkBackgroundColorMine;
        int i14 = this.messageLinkBackgroundColorTheirs;
        int i15 = this.linkDescriptionMaxLines;
        TextStyle textStyle = this.textStyleMine;
        TextStyle textStyle2 = this.textStyleTheirs;
        TextStyle textStyle3 = this.textStyleUserName;
        TextStyle textStyle4 = this.textStyleMessageDate;
        TextStyle textStyle5 = this.textStyleMessageLanguage;
        TextStyle textStyle6 = this.textStyleThreadCounter;
        TextStyle textStyle7 = this.textStyleReadCounter;
        TextStyle textStyle8 = this.threadSeparatorTextStyle;
        TextStyle textStyle9 = this.textStyleLinkLabel;
        TextStyle textStyle10 = this.textStyleLinkTitle;
        TextStyle textStyle11 = this.textStyleLinkDescription;
        int i16 = this.dateSeparatorBackgroundColor;
        TextStyle textStyle12 = this.textStyleDateSeparator;
        ViewReactionsViewStyle viewReactionsViewStyle = this.reactionsViewStyle;
        EditReactionsViewStyle editReactionsViewStyle = this.editReactionsViewStyle;
        Drawable drawable = this.iconIndicatorSent;
        Drawable drawable2 = this.iconIndicatorDelivered;
        Drawable drawable3 = this.iconIndicatorRead;
        Drawable drawable4 = this.iconIndicatorPendingSync;
        Drawable drawable5 = this.iconOnlyVisibleToYou;
        TextStyle textStyle13 = this.textStyleMessageDeletedMine;
        int i17 = this.messageDeletedBackgroundMine;
        TextStyle textStyle14 = this.textStyleMessageDeletedTheirs;
        int i18 = this.messageDeletedBackgroundTheirs;
        int i19 = this.messageStrokeColorMine;
        float f13 = this.messageStrokeWidthMine;
        int i24 = this.messageStrokeColorTheirs;
        float f14 = this.messageStrokeWidthTheirs;
        TextStyle textStyle15 = this.textStyleSystemMessage;
        TextStyle textStyle16 = this.textStyleErrorMessage;
        TextStyle textStyle17 = this.pinnedMessageIndicatorTextStyle;
        Drawable drawable6 = this.pinnedMessageIndicatorIcon;
        int i25 = this.pinnedMessageBackgroundColor;
        int i26 = this.messageStartMargin;
        int i27 = this.messageEndMargin;
        float f15 = this.messageMaxWidthFactorMine;
        float f16 = this.messageMaxWidthFactorTheirs;
        boolean z4 = this.showMessageDeliveryStatusIndicator;
        Drawable drawable7 = this.iconFailedMessage;
        Drawable drawable8 = this.iconBannedMessage;
        int i28 = this.systemMessageAlignment;
        int i29 = this.loadingMoreView;
        int i34 = this.unreadSeparatorBackgroundColor;
        TextStyle textStyle18 = this.unreadSeparatorTextStyle;
        StringBuilder sbM114684l = AbstractC36095b.m114684l("MessageListItemStyle(messageBackgroundColorMine=", num, ", messageBackgroundColorTheirs=", num2, ", messageLinkTextColorMine=");
        AbstractC31061c.m95621A(sbM114684l, num3, ", messageLinkTextColorTheirs=", num4, ", messageLinkBackgroundColorMine=");
        AbstractC30802r.m94773v(sbM114684l, i13, ", messageLinkBackgroundColorTheirs=", i14, ", linkDescriptionMaxLines=");
        sbM114684l.append(i15);
        sbM114684l.append(", textStyleMine=");
        sbM114684l.append(textStyle);
        sbM114684l.append(", textStyleTheirs=");
        sbM114684l.append(textStyle2);
        sbM114684l.append(", textStyleUserName=");
        sbM114684l.append(textStyle3);
        sbM114684l.append(", textStyleMessageDate=");
        sbM114684l.append(textStyle4);
        sbM114684l.append(", textStyleMessageLanguage=");
        sbM114684l.append(textStyle5);
        sbM114684l.append(", textStyleThreadCounter=");
        sbM114684l.append(textStyle6);
        sbM114684l.append(", textStyleReadCounter=");
        sbM114684l.append(textStyle7);
        sbM114684l.append(", threadSeparatorTextStyle=");
        sbM114684l.append(textStyle8);
        sbM114684l.append(", textStyleLinkLabel=");
        sbM114684l.append(textStyle9);
        sbM114684l.append(", textStyleLinkTitle=");
        sbM114684l.append(textStyle10);
        sbM114684l.append(", textStyleLinkDescription=");
        sbM114684l.append(textStyle11);
        sbM114684l.append(", dateSeparatorBackgroundColor=");
        sbM114684l.append(i16);
        sbM114684l.append(", textStyleDateSeparator=");
        sbM114684l.append(textStyle12);
        sbM114684l.append(", reactionsViewStyle=");
        sbM114684l.append(viewReactionsViewStyle);
        sbM114684l.append(", editReactionsViewStyle=");
        sbM114684l.append(editReactionsViewStyle);
        sbM114684l.append(", iconIndicatorSent=");
        sbM114684l.append(drawable);
        sbM114684l.append(", iconIndicatorDelivered=");
        sbM114684l.append(drawable2);
        sbM114684l.append(", iconIndicatorRead=");
        sbM114684l.append(drawable3);
        sbM114684l.append(", iconIndicatorPendingSync=");
        sbM114684l.append(drawable4);
        sbM114684l.append(", iconOnlyVisibleToYou=");
        sbM114684l.append(drawable5);
        sbM114684l.append(", textStyleMessageDeletedMine=");
        sbM114684l.append(textStyle13);
        sbM114684l.append(", messageDeletedBackgroundMine=");
        sbM114684l.append(i17);
        sbM114684l.append(", textStyleMessageDeletedTheirs=");
        sbM114684l.append(textStyle14);
        sbM114684l.append(", messageDeletedBackgroundTheirs=");
        AbstractC30802r.m94773v(sbM114684l, i18, ", messageStrokeColorMine=", i19, ", messageStrokeWidthMine=");
        sbM114684l.append(f13);
        sbM114684l.append(", messageStrokeColorTheirs=");
        sbM114684l.append(i24);
        sbM114684l.append(", messageStrokeWidthTheirs=");
        sbM114684l.append(f14);
        sbM114684l.append(", textStyleSystemMessage=");
        sbM114684l.append(textStyle15);
        sbM114684l.append(", textStyleErrorMessage=");
        sbM114684l.append(textStyle16);
        sbM114684l.append(", pinnedMessageIndicatorTextStyle=");
        sbM114684l.append(textStyle17);
        sbM114684l.append(", pinnedMessageIndicatorIcon=");
        sbM114684l.append(drawable6);
        sbM114684l.append(", pinnedMessageBackgroundColor=");
        sbM114684l.append(i25);
        sbM114684l.append(", messageStartMargin=");
        AbstractC30802r.m94773v(sbM114684l, i26, ", messageEndMargin=", i27, ", messageMaxWidthFactorMine=");
        AbstractC30802r.m94772u(sbM114684l, f15, ", messageMaxWidthFactorTheirs=", f16, ", showMessageDeliveryStatusIndicator=");
        sbM114684l.append(z4);
        sbM114684l.append(", iconFailedMessage=");
        sbM114684l.append(drawable7);
        sbM114684l.append(", iconBannedMessage=");
        sbM114684l.append(drawable8);
        sbM114684l.append(", systemMessageAlignment=");
        sbM114684l.append(i28);
        sbM114684l.append(", loadingMoreView=");
        AbstractC30802r.m94773v(sbM114684l, i29, ", unreadSeparatorBackgroundColor=", i34, ", unreadSeparatorTextStyle=");
        sbM114684l.append(textStyle18);
        sbM114684l.append(")");
        return sbM114684l.toString();
    }
}
