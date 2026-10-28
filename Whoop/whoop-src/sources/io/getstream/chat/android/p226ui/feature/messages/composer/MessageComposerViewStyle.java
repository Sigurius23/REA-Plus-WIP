package io.getstream.chat.android.p226ui.feature.messages.composer;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.profileinstaller.ProfileVerifier;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.common.C19470R;
import io.getstream.chat.android.p226ui.common.permissions.VisualMediaType;
import io.getstream.chat.android.p226ui.feature.messages.common.AudioRecordPlayerViewStyle;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.AttachmentsPickerDialogStyle;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.PickerMediaMode;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageReplyStyle;
import io.getstream.chat.android.p226ui.font.TextStyle;
import io.getstream.chat.android.p226ui.helper.TransformStyle;
import io.getstream.chat.android.p226ui.helper.ViewStyle;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.IntKt;
import io.getstream.chat.android.p226ui.utils.extensions.TypedArrayKt;
import live.hms.video.utils.AndroidSDKConstants;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p479s4.AbstractC32122c;
import p513u4.AbstractC34523k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bo\n\u0002\u0018\u0002\n\u0002\be\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 Ä\u00022\u00020\u0001:\u0002Ä\u0002Bí\u0006\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\t\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0007\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0017\u0012\u0006\u0010\"\u001a\u00020\u0005\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010%\u001a\u00020&\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010(\u001a\u00020\u0003\u0012\u0006\u0010)\u001a\u00020\u0003\u0012\u0006\u0010*\u001a\u00020\u0003\u0012\u0006\u0010+\u001a\u00020\u0003\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010-\u001a\u00020\t\u0012\u0006\u0010.\u001a\u00020\u0005\u0012\n\b\u0001\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u00100\u001a\u00020\u0007\u0012\u0006\u00101\u001a\u00020\t\u0012\u0006\u00102\u001a\u00020\u0005\u0012\n\b\u0001\u00103\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u00104\u001a\u00020\u0005\u0012\n\b\u0001\u00105\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u00106\u001a\u00020\u0005\u0012\n\b\u0001\u00107\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u00108\u001a\u00020\u0005\u0012\n\b\u0001\u00109\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010:\u001a\u00020\u0005\u0012\n\b\u0001\u0010;\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010<\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010=\u001a\u00020\u0017\u0012\u0006\u0010>\u001a\u00020\u0005\u0012\b\u0010?\u001a\u0004\u0018\u00010@\u0012\n\b\u0001\u0010A\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010B\u001a\u00020\u0017\u0012\u0006\u0010C\u001a\u00020\u0005\u0012\b\u0010D\u001a\u0004\u0018\u00010@\u0012\n\b\u0001\u0010E\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010F\u001a\u00020\u0017\u0012\b\u0010G\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010H\u001a\u00020\u0007\u0012\u0006\u0010I\u001a\u00020\t\u0012\u0006\u0010J\u001a\u00020\u0007\u0012\u0006\u0010K\u001a\u00020\u0005\u0012\u0006\u0010L\u001a\u00020\u0007\u0012\u0006\u0010M\u001a\u00020\u0005\u0012\u0006\u0010N\u001a\u00020\u0005\u0012\u0006\u0010O\u001a\u00020\u0017\u0012\u0006\u0010P\u001a\u00020\u0005\u0012\b\u0010Q\u001a\u0004\u0018\u00010@\u0012\b\b\u0001\u0010R\u001a\u00020\u0003\u0012\b\b\u0001\u0010S\u001a\u00020\u0003\u0012\b\b\u0001\u0010T\u001a\u00020\u0003\u0012\u0006\u0010U\u001a\u00020\u0017\u0012\u0006\u0010V\u001a\u00020\u0017\u0012\u0006\u0010W\u001a\u00020\u0017\u0012\u0006\u0010X\u001a\u00020\u0017\u0012\u0006\u0010Y\u001a\u00020\u0005\u0012\b\u0010Z\u001a\u0004\u0018\u00010@\u0012\b\b\u0001\u0010[\u001a\u00020\u0003\u0012\b\b\u0001\u0010\\\u001a\u00020\u0003\u0012\b\b\u0001\u0010]\u001a\u00020\u0003\u0012\u0006\u0010^\u001a\u00020\t\u0012\u0006\u0010_\u001a\u00020\u0005\u0012\b\b\u0002\u0010`\u001a\u00020\u0017\u0012\b\b\u0001\u0010a\u001a\u00020\u0003\u0012\u0006\u0010b\u001a\u00020\t\u0012\b\b\u0001\u0010c\u001a\u00020\u0003\u0012\b\b\u0001\u0010d\u001a\u00020&\u0012\u0006\u0010e\u001a\u00020\t\u0012\b\b\u0001\u0010f\u001a\u00020\u0003\u0012\b\b\u0001\u0010g\u001a\u00020&\u0012\u0006\u0010h\u001a\u00020i\u0012\b\u0010j\u001a\u0004\u0018\u00010k¢\u0006\u0004\bl\u0010mJ\b\u0010Ú\u0001\u001a\u00030Û\u0001J\n\u0010Ü\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ý\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010Þ\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010ß\u0001\u001a\u00020\tHÆ\u0003J\n\u0010à\u0001\u001a\u00020\u0005HÆ\u0003J\u0011\u0010á\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010xJ\n\u0010â\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ã\u0001\u001a\u00020\tHÆ\u0003J\n\u0010ä\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010å\u0001\u001a\u00020\tHÆ\u0003J\n\u0010æ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ç\u0001\u001a\u00020\u0005HÆ\u0003J\u0011\u0010è\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010xJ\n\u0010é\u0001\u001a\u00020\tHÆ\u0003J\n\u0010ê\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010ë\u0001\u001a\u00020\tHÆ\u0003J\n\u0010ì\u0001\u001a\u00020\u0017HÆ\u0003J\n\u0010í\u0001\u001a\u00020\u0017HÆ\u0003J\n\u0010î\u0001\u001a\u00020\tHÆ\u0003J\n\u0010ï\u0001\u001a\u00020\u0005HÆ\u0003J\f\u0010ð\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\n\u0010ñ\u0001\u001a\u00020\u0017HÆ\u0003J\n\u0010ò\u0001\u001a\u00020\u0017HÆ\u0003J\n\u0010ó\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ô\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010õ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ö\u0001\u001a\u00020\u0017HÆ\u0003J\n\u0010÷\u0001\u001a\u00020\u0005HÆ\u0003J\u0011\u0010ø\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010xJ\u0011\u0010ù\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010xJ\n\u0010ú\u0001\u001a\u00020&HÆ\u0003J\n\u0010û\u0001\u001a\u00020&HÆ\u0003J\n\u0010ü\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ý\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010þ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ÿ\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u0080\u0002\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\n\u0010\u0081\u0002\u001a\u00020\tHÆ\u0003J\n\u0010\u0082\u0002\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0083\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010xJ\n\u0010\u0084\u0002\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0085\u0002\u001a\u00020\tHÆ\u0003J\n\u0010\u0086\u0002\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0087\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010xJ\n\u0010\u0088\u0002\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0089\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010xJ\n\u0010\u008a\u0002\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u008b\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010xJ\n\u0010\u008c\u0002\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u008d\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010xJ\n\u0010\u008e\u0002\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u008f\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010xJ\u0011\u0010\u0090\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010xJ\n\u0010\u0091\u0002\u001a\u00020\u0017HÆ\u0003J\n\u0010\u0092\u0002\u001a\u00020\u0005HÆ\u0003J\f\u0010\u0093\u0002\u001a\u0004\u0018\u00010@HÆ\u0003J\u0011\u0010\u0094\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010xJ\n\u0010\u0095\u0002\u001a\u00020\u0017HÆ\u0003J\n\u0010\u0096\u0002\u001a\u00020\u0005HÆ\u0003J\f\u0010\u0097\u0002\u001a\u0004\u0018\u00010@HÆ\u0003J\u0011\u0010\u0098\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010xJ\n\u0010\u0099\u0002\u001a\u00020\u0017HÆ\u0003J\f\u0010\u009a\u0002\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\n\u0010\u009b\u0002\u001a\u00020\u0007HÆ\u0003J\n\u0010\u009c\u0002\u001a\u00020\tHÆ\u0003J\n\u0010\u009d\u0002\u001a\u00020\u0007HÆ\u0003J\n\u0010\u009e\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010\u009f\u0002\u001a\u00020\u0007HÆ\u0003J\n\u0010 \u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010¡\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010¢\u0002\u001a\u00020\u0017HÆ\u0003J\n\u0010£\u0002\u001a\u00020\u0005HÆ\u0003J\f\u0010¤\u0002\u001a\u0004\u0018\u00010@HÆ\u0003J\n\u0010¥\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010¦\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010§\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010¨\u0002\u001a\u00020\u0017HÆ\u0003J\n\u0010©\u0002\u001a\u00020\u0017HÆ\u0003J\n\u0010ª\u0002\u001a\u00020\u0017HÆ\u0003J\n\u0010«\u0002\u001a\u00020\u0017HÆ\u0003J\n\u0010¬\u0002\u001a\u00020\u0005HÆ\u0003J\f\u0010\u00ad\u0002\u001a\u0004\u0018\u00010@HÆ\u0003J\n\u0010®\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010¯\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010°\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010±\u0002\u001a\u00020\tHÆ\u0003J\n\u0010²\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010³\u0002\u001a\u00020\u0017HÆ\u0003J\n\u0010´\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010µ\u0002\u001a\u00020\tHÆ\u0003J\n\u0010¶\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010·\u0002\u001a\u00020&HÆ\u0003J\n\u0010¸\u0002\u001a\u00020\tHÆ\u0003J\n\u0010¹\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010º\u0002\u001a\u00020&HÆ\u0003J\n\u0010»\u0002\u001a\u00020iHÆ\u0003J\f\u0010¼\u0002\u001a\u0004\u0018\u00010kHÆ\u0003J\u0084\b\u0010½\u0002\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0003\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00172\b\b\u0002\u0010\u001d\u001a\u00020\u00172\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00172\b\b\u0002\u0010\"\u001a\u00020\u00052\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020\u00032\b\b\u0002\u0010)\u001a\u00020\u00032\b\b\u0002\u0010*\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010-\u001a\u00020\t2\b\b\u0002\u0010.\u001a\u00020\u00052\n\b\u0003\u0010/\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u00100\u001a\u00020\u00072\b\b\u0002\u00101\u001a\u00020\t2\b\b\u0002\u00102\u001a\u00020\u00052\n\b\u0003\u00103\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u00104\u001a\u00020\u00052\n\b\u0003\u00105\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u00106\u001a\u00020\u00052\n\b\u0003\u00107\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u00108\u001a\u00020\u00052\n\b\u0003\u00109\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010:\u001a\u00020\u00052\n\b\u0003\u0010;\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010<\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010=\u001a\u00020\u00172\b\b\u0002\u0010>\u001a\u00020\u00052\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@2\n\b\u0003\u0010A\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010B\u001a\u00020\u00172\b\b\u0002\u0010C\u001a\u00020\u00052\n\b\u0002\u0010D\u001a\u0004\u0018\u00010@2\n\b\u0003\u0010E\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010F\u001a\u00020\u00172\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010H\u001a\u00020\u00072\b\b\u0002\u0010I\u001a\u00020\t2\b\b\u0002\u0010J\u001a\u00020\u00072\b\b\u0002\u0010K\u001a\u00020\u00052\b\b\u0002\u0010L\u001a\u00020\u00072\b\b\u0002\u0010M\u001a\u00020\u00052\b\b\u0002\u0010N\u001a\u00020\u00052\b\b\u0002\u0010O\u001a\u00020\u00172\b\b\u0002\u0010P\u001a\u00020\u00052\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010@2\b\b\u0003\u0010R\u001a\u00020\u00032\b\b\u0003\u0010S\u001a\u00020\u00032\b\b\u0003\u0010T\u001a\u00020\u00032\b\b\u0002\u0010U\u001a\u00020\u00172\b\b\u0002\u0010V\u001a\u00020\u00172\b\b\u0002\u0010W\u001a\u00020\u00172\b\b\u0002\u0010X\u001a\u00020\u00172\b\b\u0002\u0010Y\u001a\u00020\u00052\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010@2\b\b\u0003\u0010[\u001a\u00020\u00032\b\b\u0003\u0010\\\u001a\u00020\u00032\b\b\u0003\u0010]\u001a\u00020\u00032\b\b\u0002\u0010^\u001a\u00020\t2\b\b\u0002\u0010_\u001a\u00020\u00052\b\b\u0002\u0010`\u001a\u00020\u00172\b\b\u0003\u0010a\u001a\u00020\u00032\b\b\u0002\u0010b\u001a\u00020\t2\b\b\u0003\u0010c\u001a\u00020\u00032\b\b\u0003\u0010d\u001a\u00020&2\b\b\u0002\u0010e\u001a\u00020\t2\b\b\u0003\u0010f\u001a\u00020\u00032\b\b\u0003\u0010g\u001a\u00020&2\b\b\u0002\u0010h\u001a\u00020i2\n\b\u0002\u0010j\u001a\u0004\u0018\u00010kHÆ\u0001¢\u0006\u0003\u0010¾\u0002J\u0016\u0010¿\u0002\u001a\u00020\u00172\n\u0010À\u0002\u001a\u0005\u0018\u00010Á\u0002HÖ\u0003J\n\u0010Â\u0002\u001a\u00020\u0003HÖ\u0001J\n\u0010Ã\u0002\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bn\u0010oR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bp\u0010qR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\br\u0010sR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bt\u0010uR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bv\u0010qR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010y\u001a\u0004\bw\u0010xR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bz\u0010oR\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b{\u0010uR\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b|\u0010sR\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b}\u0010uR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b~\u0010oR\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010qR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u000b\n\u0002\u0010y\u001a\u0005\b\u0080\u0001\u0010xR\u0012\u0010\u0013\u001a\u00020\t¢\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010uR\u0012\u0010\u0014\u001a\u00020\u0007¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010sR\u0012\u0010\u0015\u001a\u00020\t¢\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010uR\u0013\u0010\u0016\u001a\u00020\u0017¢\u0006\n\n\u0000\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0013\u0010\u0018\u001a\u00020\u0017¢\u0006\n\n\u0000\u001a\u0006\b\u0086\u0001\u0010\u0085\u0001R\u0012\u0010\u0019\u001a\u00020\t¢\u0006\t\n\u0000\u001a\u0005\b\u0087\u0001\u0010uR\u0012\u0010\u001a\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u0088\u0001\u0010qR\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u0089\u0001\u0010qR\u0013\u0010\u001c\u001a\u00020\u0017¢\u0006\n\n\u0000\u001a\u0006\b\u008a\u0001\u0010\u0085\u0001R\u0013\u0010\u001d\u001a\u00020\u0017¢\u0006\n\n\u0000\u001a\u0006\b\u008b\u0001\u0010\u0085\u0001R\u0012\u0010\u001e\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008c\u0001\u0010oR\u0012\u0010\u001f\u001a\u00020\u0007¢\u0006\t\n\u0000\u001a\u0005\b\u008d\u0001\u0010sR\u0012\u0010 \u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008e\u0001\u0010oR\u0013\u0010!\u001a\u00020\u0017¢\u0006\n\n\u0000\u001a\u0006\b\u008f\u0001\u0010\u0085\u0001R\u0012\u0010\"\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u0090\u0001\u0010qR\u0016\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\u000b\n\u0002\u0010y\u001a\u0005\b\u0091\u0001\u0010xR\u0016\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\u000b\n\u0002\u0010y\u001a\u0005\b\u0092\u0001\u0010xR\u0013\u0010%\u001a\u00020&¢\u0006\n\n\u0000\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0013\u0010'\u001a\u00020&¢\u0006\n\n\u0000\u001a\u0006\b\u0095\u0001\u0010\u0094\u0001R\u0012\u0010(\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0096\u0001\u0010oR\u0012\u0010)\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0097\u0001\u0010oR\u0012\u0010*\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0098\u0001\u0010oR\u0012\u0010+\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0099\u0001\u0010oR\u0014\u0010,\u001a\u0004\u0018\u00010\u0007¢\u0006\t\n\u0000\u001a\u0005\b\u009a\u0001\u0010sR\u0012\u0010-\u001a\u00020\t¢\u0006\t\n\u0000\u001a\u0005\b\u009b\u0001\u0010uR\u0012\u0010.\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u009c\u0001\u0010qR\u0016\u0010/\u001a\u0004\u0018\u00010\u0003¢\u0006\u000b\n\u0002\u0010y\u001a\u0005\b\u009d\u0001\u0010xR\u0012\u00100\u001a\u00020\u0007¢\u0006\t\n\u0000\u001a\u0005\b\u009e\u0001\u0010sR\u0012\u00101\u001a\u00020\t¢\u0006\t\n\u0000\u001a\u0005\b\u009f\u0001\u0010uR\u0012\u00102\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b \u0001\u0010qR\u0016\u00103\u001a\u0004\u0018\u00010\u0003¢\u0006\u000b\n\u0002\u0010y\u001a\u0005\b¡\u0001\u0010xR\u0012\u00104\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b¢\u0001\u0010qR\u0016\u00105\u001a\u0004\u0018\u00010\u0003¢\u0006\u000b\n\u0002\u0010y\u001a\u0005\b£\u0001\u0010xR\u0012\u00106\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b¤\u0001\u0010qR\u0016\u00107\u001a\u0004\u0018\u00010\u0003¢\u0006\u000b\n\u0002\u0010y\u001a\u0005\b¥\u0001\u0010xR\u0012\u00108\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b¦\u0001\u0010qR\u0016\u00109\u001a\u0004\u0018\u00010\u0003¢\u0006\u000b\n\u0002\u0010y\u001a\u0005\b§\u0001\u0010xR\u0012\u0010:\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b¨\u0001\u0010qR\u0016\u0010;\u001a\u0004\u0018\u00010\u0003¢\u0006\u000b\n\u0002\u0010y\u001a\u0005\b©\u0001\u0010xR\u0016\u0010<\u001a\u0004\u0018\u00010\u0003¢\u0006\u000b\n\u0002\u0010y\u001a\u0005\bª\u0001\u0010xR\u0013\u0010=\u001a\u00020\u0017¢\u0006\n\n\u0000\u001a\u0006\b«\u0001\u0010\u0085\u0001R\u0012\u0010>\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b¬\u0001\u0010qR\u0015\u0010?\u001a\u0004\u0018\u00010@¢\u0006\n\n\u0000\u001a\u0006\b\u00ad\u0001\u0010®\u0001R\u0016\u0010A\u001a\u0004\u0018\u00010\u0003¢\u0006\u000b\n\u0002\u0010y\u001a\u0005\b¯\u0001\u0010xR\u0013\u0010B\u001a\u00020\u0017¢\u0006\n\n\u0000\u001a\u0006\b°\u0001\u0010\u0085\u0001R\u0012\u0010C\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b±\u0001\u0010qR\u0015\u0010D\u001a\u0004\u0018\u00010@¢\u0006\n\n\u0000\u001a\u0006\b²\u0001\u0010®\u0001R\u0016\u0010E\u001a\u0004\u0018\u00010\u0003¢\u0006\u000b\n\u0002\u0010y\u001a\u0005\b³\u0001\u0010xR\u0013\u0010F\u001a\u00020\u0017¢\u0006\n\n\u0000\u001a\u0006\b´\u0001\u0010\u0085\u0001R\u0014\u0010G\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\bµ\u0001\u0010qR\u0012\u0010H\u001a\u00020\u0007¢\u0006\t\n\u0000\u001a\u0005\b¶\u0001\u0010sR\u0012\u0010I\u001a\u00020\t¢\u0006\t\n\u0000\u001a\u0005\b·\u0001\u0010uR\u0012\u0010J\u001a\u00020\u0007¢\u0006\t\n\u0000\u001a\u0005\b¸\u0001\u0010sR\u0012\u0010K\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b¹\u0001\u0010qR\u0012\u0010L\u001a\u00020\u0007¢\u0006\t\n\u0000\u001a\u0005\bº\u0001\u0010sR\u0012\u0010M\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b»\u0001\u0010qR\u0012\u0010N\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b¼\u0001\u0010qR\u0013\u0010O\u001a\u00020\u0017¢\u0006\n\n\u0000\u001a\u0006\b½\u0001\u0010\u0085\u0001R\u0012\u0010P\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\b¾\u0001\u0010qR\u0015\u0010Q\u001a\u0004\u0018\u00010@¢\u0006\n\n\u0000\u001a\u0006\b¿\u0001\u0010®\u0001R\u0012\u0010R\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\bÀ\u0001\u0010oR\u0012\u0010S\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\bÁ\u0001\u0010oR\u0012\u0010T\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\bÂ\u0001\u0010oR\u0013\u0010U\u001a\u00020\u0017¢\u0006\n\n\u0000\u001a\u0006\bÃ\u0001\u0010\u0085\u0001R\u0013\u0010V\u001a\u00020\u0017¢\u0006\n\n\u0000\u001a\u0006\bÄ\u0001\u0010\u0085\u0001R\u0013\u0010W\u001a\u00020\u0017¢\u0006\n\n\u0000\u001a\u0006\bÅ\u0001\u0010\u0085\u0001R\u0013\u0010X\u001a\u00020\u0017¢\u0006\n\n\u0000\u001a\u0006\bÆ\u0001\u0010\u0085\u0001R\u0012\u0010Y\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\bÇ\u0001\u0010qR\u0015\u0010Z\u001a\u0004\u0018\u00010@¢\u0006\n\n\u0000\u001a\u0006\bÈ\u0001\u0010®\u0001R\u0012\u0010[\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\bÉ\u0001\u0010oR\u0012\u0010\\\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\bÊ\u0001\u0010oR\u0012\u0010]\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\bË\u0001\u0010oR\u0012\u0010^\u001a\u00020\t¢\u0006\t\n\u0000\u001a\u0005\bÌ\u0001\u0010uR\u0012\u0010_\u001a\u00020\u0005¢\u0006\t\n\u0000\u001a\u0005\bÍ\u0001\u0010qR\u0013\u0010`\u001a\u00020\u0017¢\u0006\n\n\u0000\u001a\u0006\bÎ\u0001\u0010\u0085\u0001R\u0012\u0010a\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\bÏ\u0001\u0010oR\u0012\u0010b\u001a\u00020\t¢\u0006\t\n\u0000\u001a\u0005\bÐ\u0001\u0010uR\u0012\u0010c\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\bÑ\u0001\u0010oR\u0013\u0010d\u001a\u00020&¢\u0006\n\n\u0000\u001a\u0006\bÒ\u0001\u0010\u0094\u0001R\u0012\u0010e\u001a\u00020\t¢\u0006\t\n\u0000\u001a\u0005\bÓ\u0001\u0010uR\u0012\u0010f\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\bÔ\u0001\u0010oR\u0013\u0010g\u001a\u00020&¢\u0006\n\n\u0000\u001a\u0006\bÕ\u0001\u0010\u0094\u0001R\u0013\u0010h\u001a\u00020i¢\u0006\n\n\u0000\u001a\u0006\bÖ\u0001\u0010×\u0001R\u0015\u0010j\u001a\u0004\u0018\u00010k¢\u0006\n\n\u0000\u001a\u0006\bØ\u0001\u0010Ù\u0001¨\u0006Å\u0002"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "Lio/getstream/chat/android/ui/helper/ViewStyle;", "backgroundColor", "", "dividerBackgroundDrawable", "Landroid/graphics/drawable/Drawable;", "commandSuggestionsTitleText", "", "commandSuggestionsTitleTextStyle", "Lio/getstream/chat/android/ui/font/TextStyle;", "commandSuggestionsTitleIconDrawable", "commandSuggestionsTitleIconDrawableTintColor", "commandSuggestionsBackgroundColor", "commandSuggestionItemCommandNameTextStyle", "commandSuggestionItemCommandDescriptionText", "commandSuggestionItemCommandDescriptionTextStyle", "mentionSuggestionsBackgroundColor", "mentionSuggestionItemIconDrawable", "mentionSuggestionItemIconDrawableTintColor", "mentionSuggestionItemUsernameTextStyle", "mentionSuggestionItemMentionText", "mentionSuggestionItemMentionTextStyle", "messageInputCommandsHandlingEnabled", "", "messageInputMentionsHandlingEnabled", "messageInputTextStyle", "messageInputBackgroundDrawable", "messageInputCursorDrawable", "messageInputScrollbarEnabled", "messageInputScrollbarFadingEnabled", "messageInputMaxLines", "messageInputCannotSendHintText", "messageInputInputType", "messageInputShowReplyView", "messageInputVideoAttachmentIconDrawable", "messageInputVideoAttachmentIconDrawableTint", "messageInputVideoAttachmentIconBackgroundColor", "messageInputVideoAttachmentIconCornerRadius", "", "messageInputVideoAttachmentIconElevation", "messageInputVideoAttachmentIconDrawablePaddingTop", "messageInputVideoAttachmentIconDrawablePaddingBottom", "messageInputVideoAttachmentIconDrawablePaddingStart", "messageInputVideoAttachmentIconDrawablePaddingEnd", "audioRecordingHoldToRecordText", "audioRecordingHoldToRecordTextStyle", "audioRecordingHoldToRecordBackgroundDrawable", "audioRecordingHoldToRecordBackgroundDrawableTint", "audioRecordingSlideToCancelText", "audioRecordingSlideToCancelTextStyle", "audioRecordingSlideToCancelStartDrawable", "audioRecordingSlideToCancelStartDrawableTint", "audioRecordingFloatingButtonIconDrawable", "audioRecordingFloatingButtonIconDrawableTint", "audioRecordingFloatingButtonBackgroundDrawable", "audioRecordingFloatingButtonBackgroundDrawableTint", "audioRecordingFloatingLockIconDrawable", "audioRecordingFloatingLockIconDrawableTint", "audioRecordingFloatingLockedIconDrawable", "audioRecordingFloatingLockedIconDrawableTint", "audioRecordingWaveformColor", "attachmentsButtonVisible", "attachmentsButtonIconDrawable", "attachmentsButtonIconTintList", "Landroid/content/res/ColorStateList;", "attachmentsButtonRippleColor", "commandsButtonVisible", "commandsButtonIconDrawable", "commandsButtonIconTintList", "commandsButtonRippleColor", "alsoSendToChannelCheckboxVisible", "alsoSendToChannelCheckboxDrawable", "alsoSendToChannelCheckboxText", "alsoSendToChannelCheckboxTextStyle", "editModeText", "editModeIconDrawable", "replyModeText", "replyModeIconDrawable", "dismissModeIconDrawable", "sendMessageButtonEnabled", "sendMessageButtonIconDrawable", "sendMessageButtonIconTintList", "sendMessageButtonWidth", "sendMessageButtonHeight", "sendMessageButtonPadding", "audioRecordingButtonVisible", "audioRecordingButtonEnabled", "audioRecordingButtonPreferred", "audioRecordingSendOnComplete", "audioRecordingButtonIconDrawable", "audioRecordingButtonIconTintList", "audioRecordingButtonWidth", "audioRecordingButtonHeight", "audioRecordingButtonPadding", "cooldownTimerTextStyle", "cooldownTimerBackgroundDrawable", "messageReplyShowUserAvatar", "messageReplyBackgroundColor", "messageReplyTextStyleMine", "messageReplyMessageBackgroundStrokeColorMine", "messageReplyMessageBackgroundStrokeWidthMine", "messageReplyTextStyleTheirs", "messageReplyMessageBackgroundStrokeColorTheirs", "messageReplyMessageBackgroundStrokeWidthTheirs", "attachmentsPickerDialogStyle", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;", "audioRecordPlayerViewStyle", "Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;", "<init>", "(ILandroid/graphics/drawable/Drawable;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;ILio/getstream/chat/android/ui/font/TextStyle;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;ILandroid/graphics/drawable/Drawable;Ljava/lang/Integer;Lio/getstream/chat/android/ui/font/TextStyle;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;ZZLio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;ZZILjava/lang/String;IZLandroid/graphics/drawable/Drawable;Ljava/lang/Integer;Ljava/lang/Integer;FFIIIILjava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Ljava/lang/Integer;ZLandroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;Ljava/lang/Integer;ZLandroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;Ljava/lang/Integer;ZLandroid/graphics/drawable/Drawable;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;ZLandroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;IIIZZZZLandroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;IIILio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;ZILio/getstream/chat/android/ui/font/TextStyle;IFLio/getstream/chat/android/ui/font/TextStyle;IFLio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;)V", "getBackgroundColor", "()I", "getDividerBackgroundDrawable", "()Landroid/graphics/drawable/Drawable;", "getCommandSuggestionsTitleText", "()Ljava/lang/String;", "getCommandSuggestionsTitleTextStyle", "()Lio/getstream/chat/android/ui/font/TextStyle;", "getCommandSuggestionsTitleIconDrawable", "getCommandSuggestionsTitleIconDrawableTintColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCommandSuggestionsBackgroundColor", "getCommandSuggestionItemCommandNameTextStyle", "getCommandSuggestionItemCommandDescriptionText", "getCommandSuggestionItemCommandDescriptionTextStyle", "getMentionSuggestionsBackgroundColor", "getMentionSuggestionItemIconDrawable", "getMentionSuggestionItemIconDrawableTintColor", "getMentionSuggestionItemUsernameTextStyle", "getMentionSuggestionItemMentionText", "getMentionSuggestionItemMentionTextStyle", "getMessageInputCommandsHandlingEnabled", "()Z", "getMessageInputMentionsHandlingEnabled", "getMessageInputTextStyle", "getMessageInputBackgroundDrawable", "getMessageInputCursorDrawable", "getMessageInputScrollbarEnabled", "getMessageInputScrollbarFadingEnabled", "getMessageInputMaxLines", "getMessageInputCannotSendHintText", "getMessageInputInputType", "getMessageInputShowReplyView", "getMessageInputVideoAttachmentIconDrawable", "getMessageInputVideoAttachmentIconDrawableTint", "getMessageInputVideoAttachmentIconBackgroundColor", "getMessageInputVideoAttachmentIconCornerRadius", "()F", "getMessageInputVideoAttachmentIconElevation", "getMessageInputVideoAttachmentIconDrawablePaddingTop", "getMessageInputVideoAttachmentIconDrawablePaddingBottom", "getMessageInputVideoAttachmentIconDrawablePaddingStart", "getMessageInputVideoAttachmentIconDrawablePaddingEnd", "getAudioRecordingHoldToRecordText", "getAudioRecordingHoldToRecordTextStyle", "getAudioRecordingHoldToRecordBackgroundDrawable", "getAudioRecordingHoldToRecordBackgroundDrawableTint", "getAudioRecordingSlideToCancelText", "getAudioRecordingSlideToCancelTextStyle", "getAudioRecordingSlideToCancelStartDrawable", "getAudioRecordingSlideToCancelStartDrawableTint", "getAudioRecordingFloatingButtonIconDrawable", "getAudioRecordingFloatingButtonIconDrawableTint", "getAudioRecordingFloatingButtonBackgroundDrawable", "getAudioRecordingFloatingButtonBackgroundDrawableTint", "getAudioRecordingFloatingLockIconDrawable", "getAudioRecordingFloatingLockIconDrawableTint", "getAudioRecordingFloatingLockedIconDrawable", "getAudioRecordingFloatingLockedIconDrawableTint", "getAudioRecordingWaveformColor", "getAttachmentsButtonVisible", "getAttachmentsButtonIconDrawable", "getAttachmentsButtonIconTintList", "()Landroid/content/res/ColorStateList;", "getAttachmentsButtonRippleColor", "getCommandsButtonVisible", "getCommandsButtonIconDrawable", "getCommandsButtonIconTintList", "getCommandsButtonRippleColor", "getAlsoSendToChannelCheckboxVisible", "getAlsoSendToChannelCheckboxDrawable", "getAlsoSendToChannelCheckboxText", "getAlsoSendToChannelCheckboxTextStyle", "getEditModeText", "getEditModeIconDrawable", "getReplyModeText", "getReplyModeIconDrawable", "getDismissModeIconDrawable", "getSendMessageButtonEnabled", "getSendMessageButtonIconDrawable", "getSendMessageButtonIconTintList", "getSendMessageButtonWidth", "getSendMessageButtonHeight", "getSendMessageButtonPadding", "getAudioRecordingButtonVisible", "getAudioRecordingButtonEnabled", "getAudioRecordingButtonPreferred", "getAudioRecordingSendOnComplete", "getAudioRecordingButtonIconDrawable", "getAudioRecordingButtonIconTintList", "getAudioRecordingButtonWidth", "getAudioRecordingButtonHeight", "getAudioRecordingButtonPadding", "getCooldownTimerTextStyle", "getCooldownTimerBackgroundDrawable", "getMessageReplyShowUserAvatar", "getMessageReplyBackgroundColor", "getMessageReplyTextStyleMine", "getMessageReplyMessageBackgroundStrokeColorMine", "getMessageReplyMessageBackgroundStrokeWidthMine", "getMessageReplyTextStyleTheirs", "getMessageReplyMessageBackgroundStrokeColorTheirs", "getMessageReplyMessageBackgroundStrokeWidthTheirs", "getAttachmentsPickerDialogStyle", "()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;", "getAudioRecordPlayerViewStyle", "()Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;", "toMessageReplyStyle", "Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "component68", "component69", "component70", "component71", "component72", "component73", "component74", "component75", "component76", "component77", "component78", "component79", "component80", "component81", "component82", "component83", "component84", "component85", "component86", "component87", "component88", "component89", "component90", "component91", "component92", "component93", "component94", "component95", "component96", "component97", "copy", "(ILandroid/graphics/drawable/Drawable;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;ILio/getstream/chat/android/ui/font/TextStyle;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;ILandroid/graphics/drawable/Drawable;Ljava/lang/Integer;Lio/getstream/chat/android/ui/font/TextStyle;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;ZZLio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;ZZILjava/lang/String;IZLandroid/graphics/drawable/Drawable;Ljava/lang/Integer;Ljava/lang/Integer;FFIIIILjava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Ljava/lang/Integer;ZLandroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;Ljava/lang/Integer;ZLandroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;Ljava/lang/Integer;ZLandroid/graphics/drawable/Drawable;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;ZLandroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;IIIZZZZLandroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;IIILio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;ZILio/getstream/chat/android/ui/font/TextStyle;IFLio/getstream/chat/android/ui/font/TextStyle;IFLio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;)Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "equals", "other", "", "hashCode", "toString", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class MessageComposerViewStyle implements ViewStyle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final float DEFAULT_MESSAGE_REPLY_BACKGROUND_STROKE_WIDTH = 4.0f;
    private static final int DEFAULT_TRAILING_BUTTON_PADDING = 4;
    private static final int DEFAULT_TRAILING_BUTTON_SIZE = 32;
    private final Drawable alsoSendToChannelCheckboxDrawable;
    private final String alsoSendToChannelCheckboxText;
    private final TextStyle alsoSendToChannelCheckboxTextStyle;
    private final boolean alsoSendToChannelCheckboxVisible;
    private final Drawable attachmentsButtonIconDrawable;
    private final ColorStateList attachmentsButtonIconTintList;
    private final Integer attachmentsButtonRippleColor;
    private final boolean attachmentsButtonVisible;
    private final AttachmentsPickerDialogStyle attachmentsPickerDialogStyle;
    private final AudioRecordPlayerViewStyle audioRecordPlayerViewStyle;
    private final boolean audioRecordingButtonEnabled;
    private final int audioRecordingButtonHeight;
    private final Drawable audioRecordingButtonIconDrawable;
    private final ColorStateList audioRecordingButtonIconTintList;
    private final int audioRecordingButtonPadding;
    private final boolean audioRecordingButtonPreferred;
    private final boolean audioRecordingButtonVisible;
    private final int audioRecordingButtonWidth;
    private final Drawable audioRecordingFloatingButtonBackgroundDrawable;
    private final Integer audioRecordingFloatingButtonBackgroundDrawableTint;
    private final Drawable audioRecordingFloatingButtonIconDrawable;
    private final Integer audioRecordingFloatingButtonIconDrawableTint;
    private final Drawable audioRecordingFloatingLockIconDrawable;
    private final Integer audioRecordingFloatingLockIconDrawableTint;
    private final Drawable audioRecordingFloatingLockedIconDrawable;
    private final Integer audioRecordingFloatingLockedIconDrawableTint;
    private final Drawable audioRecordingHoldToRecordBackgroundDrawable;
    private final Integer audioRecordingHoldToRecordBackgroundDrawableTint;
    private final String audioRecordingHoldToRecordText;
    private final TextStyle audioRecordingHoldToRecordTextStyle;
    private final boolean audioRecordingSendOnComplete;
    private final Drawable audioRecordingSlideToCancelStartDrawable;
    private final Integer audioRecordingSlideToCancelStartDrawableTint;
    private final String audioRecordingSlideToCancelText;
    private final TextStyle audioRecordingSlideToCancelTextStyle;
    private final Integer audioRecordingWaveformColor;
    private final int backgroundColor;
    private final String commandSuggestionItemCommandDescriptionText;
    private final TextStyle commandSuggestionItemCommandDescriptionTextStyle;
    private final TextStyle commandSuggestionItemCommandNameTextStyle;
    private final int commandSuggestionsBackgroundColor;
    private final Drawable commandSuggestionsTitleIconDrawable;
    private final Integer commandSuggestionsTitleIconDrawableTintColor;
    private final String commandSuggestionsTitleText;
    private final TextStyle commandSuggestionsTitleTextStyle;
    private final Drawable commandsButtonIconDrawable;
    private final ColorStateList commandsButtonIconTintList;
    private final Integer commandsButtonRippleColor;
    private final boolean commandsButtonVisible;
    private final Drawable cooldownTimerBackgroundDrawable;
    private final TextStyle cooldownTimerTextStyle;
    private final Drawable dismissModeIconDrawable;
    private final Drawable dividerBackgroundDrawable;
    private final Drawable editModeIconDrawable;
    private final String editModeText;
    private final Drawable mentionSuggestionItemIconDrawable;
    private final Integer mentionSuggestionItemIconDrawableTintColor;
    private final String mentionSuggestionItemMentionText;
    private final TextStyle mentionSuggestionItemMentionTextStyle;
    private final TextStyle mentionSuggestionItemUsernameTextStyle;
    private final int mentionSuggestionsBackgroundColor;
    private final Drawable messageInputBackgroundDrawable;
    private final String messageInputCannotSendHintText;
    private final boolean messageInputCommandsHandlingEnabled;
    private final Drawable messageInputCursorDrawable;
    private final int messageInputInputType;
    private final int messageInputMaxLines;
    private final boolean messageInputMentionsHandlingEnabled;
    private final boolean messageInputScrollbarEnabled;
    private final boolean messageInputScrollbarFadingEnabled;
    private final boolean messageInputShowReplyView;
    private final TextStyle messageInputTextStyle;
    private final Integer messageInputVideoAttachmentIconBackgroundColor;
    private final float messageInputVideoAttachmentIconCornerRadius;
    private final Drawable messageInputVideoAttachmentIconDrawable;
    private final int messageInputVideoAttachmentIconDrawablePaddingBottom;
    private final int messageInputVideoAttachmentIconDrawablePaddingEnd;
    private final int messageInputVideoAttachmentIconDrawablePaddingStart;
    private final int messageInputVideoAttachmentIconDrawablePaddingTop;
    private final Integer messageInputVideoAttachmentIconDrawableTint;
    private final float messageInputVideoAttachmentIconElevation;
    private final int messageReplyBackgroundColor;
    private final int messageReplyMessageBackgroundStrokeColorMine;
    private final int messageReplyMessageBackgroundStrokeColorTheirs;
    private final float messageReplyMessageBackgroundStrokeWidthMine;
    private final float messageReplyMessageBackgroundStrokeWidthTheirs;
    private final boolean messageReplyShowUserAvatar;
    private final TextStyle messageReplyTextStyleMine;
    private final TextStyle messageReplyTextStyleTheirs;
    private final Drawable replyModeIconDrawable;
    private final String replyModeText;
    private final boolean sendMessageButtonEnabled;
    private final int sendMessageButtonHeight;
    private final Drawable sendMessageButtonIconDrawable;
    private final ColorStateList sendMessageButtonIconTintList;
    private final int sendMessageButtonPadding;
    private final int sendMessageButtonWidth;

    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0080\u0002¢\u0006\u0002\b\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle$Companion;", "", "<init>", "()V", "invoke", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "invoke$stream_chat_android_ui_components_release", "createAttachmentPickerDialogStyle", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;", "a", "Landroid/content/res/TypedArray;", "DEFAULT_MESSAGE_REPLY_BACKGROUND_STROKE_WIDTH", "", "DEFAULT_TRAILING_BUTTON_SIZE", "", "DEFAULT_TRAILING_BUTTON_PADDING", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        private final AttachmentsPickerDialogStyle createAttachmentPickerDialogStyle(Context context, TypedArray a5) {
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            String string7;
            boolean z4 = a5.getBoolean(C19469R.styleable.f74259x409ff5b6, false);
            int color = a5.getColor(C19469R.styleable.f74217x5b88d657, ContextKt.getColorCompat(context, C19469R.color.stream_ui_white_smoke));
            TextStyle.Builder builder = new TextStyle.Builder(a5);
            builder.size(C19469R.styleable.f74193xfe99f48f, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_large));
            builder.color(C19469R.styleable.f74190xd3c5ac95, AbstractC32122c.getColor(context, C19469R.color.stream_ui_accent_blue));
            builder.font(C19469R.styleable.f74192xa732a6c0, C19469R.styleable.f74191xfe9420dd);
            builder.style(C19469R.styleable.f74194xd4a99ae3, 1);
            TextStyle textStyleBuild = builder.build();
            Drawable drawableCompat = TypedArrayKt.getDrawableCompat(a5, context, C19469R.styleable.f74260xaa1c25a3);
            if (drawableCompat == null) {
                drawableCompat = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_next);
                AbstractC22676k.m65747g(drawableCompat);
            }
            Drawable drawable = drawableCompat;
            ColorStateList colorStateList = a5.getColorStateList(C19469R.styleable.f74216xdd62c4b5);
            if (colorStateList == null) {
                colorStateList = AbstractC32122c.getColorStateList(context, C19469R.color.stream_ui_attachment_tab_button);
            }
            ColorStateList colorStateList2 = colorStateList;
            boolean z13 = a5.getBoolean(C19469R.styleable.f74248x3a9f76, true);
            Drawable drawable2 = a5.getDrawable(C19469R.styleable.f74249xae36dd22);
            if (drawable2 == null) {
                drawable2 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_attachment_permission_media);
                AbstractC22676k.m65747g(drawable2);
            }
            Drawable drawable3 = drawable2;
            CharSequence text = a5.getText(C19469R.styleable.f74206x95f42fb9);
            if (text == null || (string = text.toString()) == null) {
                string = context.getString(C19469R.string.stream_ui_message_composer_gallery_access);
                AbstractC22676k.m65749i(string, "getString(...)");
            }
            String str = string;
            Drawable drawable4 = a5.getDrawable(C19469R.styleable.f74207xe04ca9f1);
            if (drawable4 == null) {
                drawable4 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_attachment_permission_media);
                AbstractC22676k.m65747g(drawable4);
            }
            Drawable drawable5 = drawable4;
            boolean z14 = a5.getBoolean(C19469R.styleable.f74272x82e4a2c2, true);
            TextStyle.Builder builder2 = new TextStyle.Builder(a5);
            builder2.size(C19469R.styleable.f74270x6ad8cfb1, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_small));
            builder2.color(C19469R.styleable.f74267xef6235b3, AbstractC32122c.getColor(context, C19469R.color.stream_ui_black));
            builder2.font(C19469R.styleable.f74269x68352062, C19469R.styleable.f74268x6ad2fbff);
            builder2.style(C19469R.styleable.f74271xf0462401, 0);
            TextStyle textStyleBuild2 = builder2.build();
            boolean z15 = a5.getBoolean(C19469R.styleable.f74266xa2f69afc, true);
            Drawable drawable6 = a5.getDrawable(C19469R.styleable.f74264x2c2d2754);
            if (drawable6 == null) {
                drawable6 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_video);
                AbstractC22676k.m65747g(drawable6);
            }
            Drawable drawable7 = drawable6;
            Integer colorOrNull = TypedArrayKt.getColorOrNull(a5, C19469R.styleable.f74265x7809246f);
            String string8 = a5.getString(C19469R.styleable.f74242x40890f07);
            if (string8 == null) {
                string8 = context.getString(C19469R.string.stream_ui_message_composer_no_files);
                AbstractC22676k.m65749i(string8, "getString(...)");
            }
            String str2 = string8;
            TextStyle.Builder builder3 = new TextStyle.Builder(a5);
            builder3.size(C19469R.styleable.f74246xa7f387a8, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_large));
            builder3.color(C19469R.styleable.f74243x559e7c9c, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_primary));
            builder3.font(C19469R.styleable.f74245x884dc319, C19469R.styleable.f74244xa7edb3f6);
            builder3.style(C19469R.styleable.f74247x56826aea, 0);
            TextStyle textStyleBuild3 = builder3.build();
            boolean z16 = a5.getBoolean(C19469R.styleable.f74239x7cb32a2, true);
            Drawable drawable8 = a5.getDrawable(C19469R.styleable.f74240x41f6576);
            if (drawable8 == null) {
                drawable8 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_attachment_permission_file);
                AbstractC22676k.m65747g(drawable8);
            }
            Drawable drawable9 = drawable8;
            CharSequence text2 = a5.getText(C19469R.styleable.f74204x75d19e8c);
            if (text2 == null || (string2 = text2.toString()) == null) {
                string2 = context.getString(C19469R.string.stream_ui_message_composer_files_access);
                AbstractC22676k.m65749i(string2, "getString(...)");
            }
            String str3 = string2;
            Drawable drawable10 = a5.getDrawable(C19469R.styleable.f74205x3e89b004);
            if (drawable10 == null) {
                drawable10 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_attachment_permission_file);
                AbstractC22676k.m65747g(drawable10);
            }
            Drawable drawable11 = drawable10;
            CharSequence text3 = a5.getText(C19469R.styleable.f74196x91e393d9);
            if (text3 == null || (string3 = text3.toString()) == null) {
                string3 = context.getString(C19469R.string.stream_ui_message_composer_files_allow_audio_access);
                AbstractC22676k.m65749i(string3, "getString(...)");
            }
            String str4 = string3;
            TextStyle.Builder builder4 = new TextStyle.Builder(a5);
            builder4.size(C19469R.styleable.f74200xbfb537a, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_large));
            builder4.color(C19469R.styleable.f74197x72902b0a, AbstractC32122c.getColor(context, C19469R.color.stream_ui_black));
            builder4.font(C19469R.styleable.f74199x80ede96b, C19469R.styleable.f74198xbf57fc8);
            builder4.style(C19469R.styleable.f74201x73741958, 1);
            TextStyle textStyleBuild4 = builder4.build();
            Drawable drawable12 = a5.getDrawable(C19469R.styleable.f74195x3c9e7ae3);
            if (drawable12 == null) {
                drawable12 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_file_manager);
                AbstractC22676k.m65747g(drawable12);
            }
            CharSequence text4 = a5.getText(C19469R.styleable.f74210x15f4d107);
            if (text4 == null || (string4 = text4.toString()) == null) {
                string4 = context.getString(C19469R.string.stream_ui_message_composer_files_allow_visual_media_access);
                AbstractC22676k.m65749i(string4, "getString(...)");
            }
            String str5 = string4;
            CharSequence text5 = a5.getText(C19469R.styleable.f74208xf41a0df2);
            if (text5 == null || (string5 = text5.toString()) == null) {
                string5 = context.getString(C19469R.string.stream_ui_message_composer_files_allow_more_visual_media);
                AbstractC22676k.m65749i(string5, "getString(...)");
            }
            String str6 = string5;
            TextStyle.Builder builder5 = new TextStyle.Builder(a5);
            Drawable drawable13 = drawable12;
            builder5.size(C19469R.styleable.f74214x7dae49a8, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_large));
            builder5.color(C19469R.styleable.f74211x373bfa9c, AbstractC32122c.getColor(context, C19469R.color.stream_ui_black));
            builder5.font(C19469R.styleable.f74213x236f0519, C19469R.styleable.f74212x7da875f6);
            builder5.style(C19469R.styleable.f74215x381fe8ea, 1);
            TextStyle textStyleBuild5 = builder5.build();
            Drawable drawable14 = a5.getDrawable(C19469R.styleable.f74209x126eaa11);
            if (drawable14 == null) {
                drawable14 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_file_manager);
                AbstractC22676k.m65747g(drawable14);
            }
            CharSequence text6 = a5.getText(C19469R.styleable.f74253x4a5d0fab);
            if (text6 == null || (string6 = text6.toString()) == null) {
                string6 = context.getString(C19469R.string.stream_ui_message_composer_recent_files);
                AbstractC22676k.m65749i(string6, "getString(...)");
            }
            String str7 = string6;
            TextStyle.Builder builder6 = new TextStyle.Builder(a5);
            Drawable drawable15 = drawable14;
            builder6.size(C19469R.styleable.f74257xb0ce964c, ContextKt.getDimension(context, C19469R.dimen.stream_ui_spacing_medium));
            builder6.color(C19469R.styleable.f74254x68254278, AbstractC32122c.getColor(context, C19469R.color.stream_ui_black));
            builder6.font(C19469R.styleable.f74256xbba446bd, C19469R.styleable.f74255xb0c8c29a);
            builder6.style(C19469R.styleable.f74258x690930c6, 1);
            TextStyle textStyleBuild6 = builder6.build();
            Drawable drawable16 = a5.getDrawable(C19469R.styleable.f74241xc319a6ea);
            if (drawable16 == null) {
                drawable16 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_file_manager);
                AbstractC22676k.m65747g(drawable16);
            }
            String string9 = a5.getString(C19469R.styleable.f74233xd25ce18d);
            if (string9 == null) {
                string9 = context.getString(C19469R.string.stream_ui_message_composer_no_files);
                AbstractC22676k.m65749i(string9, "getString(...)");
            }
            String str8 = string9;
            TextStyle.Builder builder7 = new TextStyle.Builder(a5);
            Drawable drawable17 = drawable16;
            builder7.size(C19469R.styleable.f74237xaeeea72e, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_large));
            builder7.color(C19469R.styleable.f74234x2e074dd6, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_primary));
            builder7.font(C19469R.styleable.f74236xb8b8a61f, C19469R.styleable.f74235xaee8d37c);
            builder7.style(C19469R.styleable.f74238x2eeb3c24, 0);
            TextStyle textStyleBuild7 = builder7.build();
            TextStyle.Builder builder8 = new TextStyle.Builder(a5);
            builder8.size(C19469R.styleable.f74226xd7db7b49, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_medium));
            builder8.color(C19469R.styleable.f74223x22b4fd1b, AbstractC32122c.getColor(context, C19469R.color.stream_ui_black));
            builder8.font(C19469R.styleable.f74225xbdfeb9fa, C19469R.styleable.f74224xd7d5a797);
            builder8.style(C19469R.styleable.f74227x2398eb69, 1);
            TextStyle textStyleBuild8 = builder8.build();
            TextStyle.Builder builder9 = new TextStyle.Builder(a5);
            builder9.size(C19469R.styleable.f74231xd340abf, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_small));
            builder9.color(C19469R.styleable.f74228x986e5c65, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_secondary));
            builder9.font(C19469R.styleable.f74230x8e8f58f0, C19469R.styleable.f74229xd2e370d);
            builder9.style(C19469R.styleable.f74232x99524ab3, 1);
            TextStyle textStyleBuild9 = builder9.build();
            Drawable drawable18 = a5.getDrawable(C19469R.styleable.f74221x52e4eb0c);
            if (drawable18 == null) {
                drawable18 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_circle_blue);
                AbstractC22676k.m65747g(drawable18);
            }
            Drawable drawable19 = a5.getDrawable(C19469R.styleable.f74220x9fa8f4cd);
            if (drawable19 == null) {
                drawable19 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_file_manager);
                AbstractC22676k.m65747g(drawable19);
            }
            Drawable drawable20 = drawable19;
            int color2 = a5.getColor(C19469R.styleable.f74222xef0122e3, AbstractC32122c.getColor(context, C19469R.color.stream_ui_literal_white));
            boolean z17 = a5.getBoolean(C19469R.styleable.f74218x2f368019, true);
            Drawable drawable21 = a5.getDrawable(C19469R.styleable.f74219xf7ccea5f);
            if (drawable21 == null) {
                drawable21 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_attachment_permission_camera);
                AbstractC22676k.m65747g(drawable21);
            }
            Drawable drawable22 = drawable21;
            Drawable drawable23 = drawable18;
            boolean z18 = a5.getBoolean(C19469R.styleable.f74251xc75fa83f, true);
            Drawable drawable24 = a5.getDrawable(C19469R.styleable.f74252x93f4e9f9);
            if (drawable24 == null) {
                drawable24 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_attachment_poll);
                AbstractC22676k.m65747g(drawable24);
            }
            Drawable drawable25 = drawable24;
            CharSequence text7 = a5.getText(C19469R.styleable.f74202xa7ec5a0e);
            if (text7 == null || (string7 = text7.toString()) == null) {
                string7 = context.getString(C19469R.string.stream_ui_message_composer_camera_access);
                AbstractC22676k.m65749i(string7, "getString(...)");
            }
            String str9 = string7;
            Drawable drawable26 = a5.getDrawable(C19469R.styleable.f74203x54e39306);
            if (drawable26 == null) {
                drawable26 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_attachment_permission_camera);
                AbstractC22676k.m65747g(drawable26);
            }
            Drawable drawable27 = drawable26;
            int i13 = C19469R.styleable.f74250xb658b4a9;
            PickerMediaMode pickerMediaMode = PickerMediaMode.PHOTO_AND_VIDEO;
            int i14 = a5.getInt(i13, -1);
            if (i14 >= 0) {
                pickerMediaMode = PickerMediaMode.values()[i14];
            }
            PickerMediaMode pickerMediaMode2 = pickerMediaMode;
            boolean z19 = a5.getBoolean(C19469R.styleable.f74261xf6d64f66, true);
            boolean z24 = a5.getBoolean(C19469R.styleable.f74262xd88264d0, false);
            int i15 = C19469R.styleable.f74263x2c787103;
            VisualMediaType visualMediaType = VisualMediaType.IMAGE_AND_VIDEO;
            int i16 = a5.getInt(i15, -1);
            if (i16 >= 0) {
                visualMediaType = VisualMediaType.values()[i16];
            }
            return TransformStyle.getAttachmentsPickerStyleTransformer().transform(new AttachmentsPickerDialogStyle(z19, z4, color, textStyleBuild, drawable, colorStateList2, z13, drawable3, str, drawable5, z14, textStyleBuild2, z15, drawable7, colorOrNull, str2, textStyleBuild3, z16, drawable9, str3, drawable11, str4, textStyleBuild4, drawable13, str5, str6, textStyleBuild5, drawable15, str7, textStyleBuild6, drawable17, str8, textStyleBuild7, textStyleBuild8, textStyleBuild9, drawable23, drawable20, color2, z17, drawable22, z18, drawable25, str9, drawable27, pickerMediaMode2, z24, visualMediaType));
        }

        public final MessageComposerViewStyle invoke$stream_chat_android_ui_components_release(Context context, AttributeSet attrs) {
            String string;
            String string2;
            String string3;
            AbstractC22676k.m65750j(context, "context");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C19469R.styleable.MessageComposerView, C19469R.attr.streamUiMessageComposerViewStyle, C19469R.style.StreamUi_MessageComposerView);
            AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attrs, new int[]{R.attr.background});
            AbstractC22676k.m65749i(typedArrayObtainStyledAttributes2, "obtainStyledAttributes(...)");
            int color = typedArrayObtainStyledAttributes2.getColor(0, AbstractC32122c.getColor(context, C19469R.color.stream_ui_white));
            typedArrayObtainStyledAttributes2.recycle();
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C19469R.styleable.f74337x68681325);
            if (drawable == null) {
                drawable = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_divider);
                AbstractC22676k.m65747g(drawable);
            }
            Drawable drawable2 = drawable;
            String string4 = typedArrayObtainStyledAttributes.getString(C19469R.styleable.f74322x5075b1a1);
            if (string4 == null) {
                string4 = context.getString(C19469R.string.stream_ui_message_composer_instant_commands);
                AbstractC22676k.m65749i(string4, "getString(...)");
            }
            String str = string4;
            TextStyle.Builder builder = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder.size(C19469R.styleable.f74326xd5394d42, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_medium));
            builder.color(C19469R.styleable.f74323xd1116a42, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_secondary));
            builder.font(C19469R.styleable.f74325xebeb6d33, C19469R.styleable.f74324xd5337990);
            builder.style(C19469R.styleable.f74327xd1f55890, 0);
            TextStyle textStyleBuild = builder.build();
            Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(C19469R.styleable.f74320xdf3a50ab);
            if (drawable3 == null) {
                drawable3 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_command_blue);
                AbstractC22676k.m65747g(drawable3);
            }
            Drawable drawable4 = drawable3;
            Integer colorOrNull = TypedArrayKt.getColorOrNull(typedArrayObtainStyledAttributes, C19469R.styleable.f74339x52a42530);
            int color2 = typedArrayObtainStyledAttributes.getColor(C19469R.styleable.f74319x68484bd1, AbstractC32122c.getColor(context, C19469R.color.stream_ui_white));
            TextStyle.Builder builder2 = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder2.size(C19469R.styleable.f74317xdc39fa62, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_medium));
            builder2.color(C19469R.styleable.f74314xaa266122, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_primary));
            builder2.font(C19469R.styleable.f74316xe5bdc253, C19469R.styleable.f74315xdc3426b0);
            builder2.style(C19469R.styleable.f74318xab0a4f70, 0);
            TextStyle textStyleBuild2 = builder2.build();
            String string5 = typedArrayObtainStyledAttributes.getString(C19469R.styleable.f74308xc2b24ec0);
            if (string5 == null) {
                string5 = context.getString(C19469R.string.stream_ui_message_composer_command_template);
                AbstractC22676k.m65749i(string5, "getString(...)");
            }
            String str2 = string5;
            TextStyle.Builder builder3 = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder3.size(C19469R.styleable.f74312x6f9442e1, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_medium));
            builder3.color(C19469R.styleable.f74309x82152883, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_primary));
            builder3.font(C19469R.styleable.f74311xc796f92, C19469R.styleable.f74310x6f8e6f2f);
            builder3.style(C19469R.styleable.f74313x82f916d1, 0);
            TextStyle textStyleBuild3 = builder3.build();
            int color3 = typedArrayObtainStyledAttributes.getColor(C19469R.styleable.f74351x92ef71b0, AbstractC32122c.getColor(context, C19469R.color.stream_ui_white));
            Drawable drawable5 = typedArrayObtainStyledAttributes.getDrawable(C19469R.styleable.f74338x1b5cbed8);
            if (drawable5 == null) {
                drawable5 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_mention);
                AbstractC22676k.m65747g(drawable5);
            }
            Drawable drawable6 = drawable5;
            Integer colorOrNull2 = TypedArrayKt.getColorOrNull(typedArrayObtainStyledAttributes, C19469R.styleable.f74339x52a42530);
            TextStyle.Builder builder4 = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder4.size(C19469R.styleable.f74349x7aefdfe5, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_medium));
            builder4.color(C19469R.styleable.f74346xe22d2bff, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_primary));
            builder4.font(C19469R.styleable.f74348xed843996, C19469R.styleable.f74347x7aea0c33);
            builder4.style(C19469R.styleable.f74350xe3111a4d, 0);
            TextStyle textStyleBuild4 = builder4.build();
            String string6 = typedArrayObtainStyledAttributes.getString(C19469R.styleable.f74340xd19fd376);
            if (string6 == null) {
                string6 = context.getString(C19469R.string.stream_ui_message_composer_mention_template);
                AbstractC22676k.m65749i(string6, "getString(...)");
            }
            String str3 = string6;
            TextStyle.Builder builder5 = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder5.size(C19469R.styleable.f74344x8e247c97, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_medium));
            builder5.color(C19469R.styleable.f74341x358c258d, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_secondary));
            builder5.font(C19469R.styleable.f74343xdde908c8, C19469R.styleable.f74342x8e1ea8e5);
            builder5.style(C19469R.styleable.f74345x367013db, 0);
            TextStyle textStyleBuild5 = builder5.build();
            boolean z4 = typedArrayObtainStyledAttributes.getBoolean(C19469R.styleable.f74331x7eaa4f34, true);
            boolean z13 = typedArrayObtainStyledAttributes.getBoolean(C19469R.styleable.f74352xddee6fd3, true);
            TextStyle.Builder builder6 = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder6.size(C19469R.styleable.MessageComposerView_streamUiMessageComposerMessageInputTextSize, context.getResources().getDimensionPixelSize(C19469R.dimen.stream_ui_text_size_input));
            builder6.color(C19469R.styleable.MessageComposerView_streamUiMessageComposerMessageInputTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_primary));
            builder6.font(C19469R.styleable.f74356x71039c62, C19469R.styleable.MessageComposerView_streamUiMessageComposerMessageInputTextFont);
            builder6.style(C19469R.styleable.MessageComposerView_streamUiMessageComposerMessageInputTextStyle, 0);
            int i13 = C19469R.styleable.MessageComposerView_streamUiMessageComposerMessageInputHintText;
            String string7 = context.getString(C19469R.string.stream_ui_message_composer_hint_normal);
            AbstractC22676k.m65749i(string7, "getString(...)");
            builder6.hint(i13, string7);
            builder6.hintColor(C19469R.styleable.MessageComposerView_streamUiMessageComposerMessageInputHintColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_hint));
            TextStyle textStyleBuild6 = builder6.build();
            Drawable drawable7 = typedArrayObtainStyledAttributes.getDrawable(C19469R.styleable.f74353x5893bd0f);
            if (drawable7 == null) {
                drawable7 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_shape_edit_text_round);
                AbstractC22676k.m65747g(drawable7);
            }
            Drawable drawable8 = typedArrayObtainStyledAttributes.getDrawable(C19469R.styleable.f74355x3508dcb7);
            boolean z14 = typedArrayObtainStyledAttributes.getBoolean(C19469R.styleable.MessageComposerView_streamUiMessageComposerScrollbarEnabled, false);
            boolean z15 = typedArrayObtainStyledAttributes.getBoolean(C19469R.styleable.f74383xf0005002, false);
            int i14 = typedArrayObtainStyledAttributes.getInt(C19469R.styleable.MessageComposerView_streamUiMessageComposerMessageInputMaxLines, 7);
            String string8 = typedArrayObtainStyledAttributes.getString(C19469R.styleable.f74354x7ba2f9c2);
            if (string8 == null) {
                string8 = context.getString(C19469R.string.stream_ui_message_composer_hint_cannot_send_message);
                AbstractC22676k.m65749i(string8, "getString(...)");
            }
            String str4 = string8;
            String string9 = typedArrayObtainStyledAttributes.getString(C19469R.styleable.f74292x795c0f3);
            TextStyle.Builder builder7 = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder7.size(C19469R.styleable.f74296xd43d6394, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_medium));
            builder7.color(C19469R.styleable.f74293xb2901e30, AbstractC32122c.getColor(context, C19469R.color.stream_ui_white_snow));
            builder7.font(C19469R.styleable.f74295x52c5fe05, C19469R.styleable.f74294xd4378fe2);
            builder7.style(C19469R.styleable.f74297xb3740c7e, 1);
            TextStyle textStyleBuild7 = builder7.build();
            Drawable drawableCompat = TypedArrayKt.getDrawableCompat(typedArrayObtainStyledAttributes, context, C19469R.styleable.f74290xe9369532);
            if (drawableCompat == null) {
                drawableCompat = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_message_composer_audio_record_hold_background);
                AbstractC22676k.m65747g(drawableCompat);
            }
            Drawable drawable9 = drawableCompat;
            Integer colorOrNull3 = TypedArrayKt.getColorOrNull(typedArrayObtainStyledAttributes, C19469R.styleable.f74291x94cc734d);
            String string10 = typedArrayObtainStyledAttributes.getString(C19469R.styleable.f74301x7c5cceb8);
            if (string10 == null) {
                string10 = context.getString(C19469R.string.stream_ui_message_composer_slide_to_cancel);
                AbstractC22676k.m65749i(string10, "getString(...)");
            }
            String str5 = string10;
            TextStyle.Builder builder8 = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder8.size(C19469R.styleable.f74305x4f8e06d9, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_medium));
            builder8.color(C19469R.styleable.f74302xa153e38b, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_secondary));
            builder8.font(C19469R.styleable.f74304xebde598a, C19469R.styleable.f74303x4f883327);
            builder8.style(C19469R.styleable.f74306xa237d1d9, 0);
            TextStyle textStyleBuild8 = builder8.build();
            Drawable drawableCompat2 = TypedArrayKt.getDrawableCompat(typedArrayObtainStyledAttributes, context, C19469R.styleable.f74299x965429f5);
            if (drawableCompat2 == null) {
                drawableCompat2 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_arrow_left);
                AbstractC22676k.m65747g(drawableCompat2);
            }
            Drawable drawable10 = drawableCompat2;
            Integer colorOrNull4 = TypedArrayKt.getColorOrNull(typedArrayObtainStyledAttributes, C19469R.styleable.f74300x9bbbee90);
            Drawable drawableCompat3 = TypedArrayKt.getDrawableCompat(typedArrayObtainStyledAttributes, context, C19469R.styleable.f74284x71e1de0a);
            if (drawableCompat3 == null) {
                drawableCompat3 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_mic);
                AbstractC22676k.m65747g(drawableCompat3);
            }
            Drawable drawable11 = drawableCompat3;
            Integer colorOrNull5 = TypedArrayKt.getColorOrNull(typedArrayObtainStyledAttributes, C19469R.styleable.f74285xd2779025);
            Drawable drawableCompat4 = TypedArrayKt.getDrawableCompat(typedArrayObtainStyledAttributes, context, C19469R.styleable.f74282xb00e877f);
            if (drawableCompat4 == null) {
                drawableCompat4 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_message_composer_audio_record_mic_background);
                AbstractC22676k.m65747g(drawableCompat4);
            }
            Drawable drawable12 = drawableCompat4;
            Integer colorOrNull6 = TypedArrayKt.getColorOrNull(typedArrayObtainStyledAttributes, C19469R.styleable.f74283x6e98771a);
            Drawable drawableCompat5 = TypedArrayKt.getDrawableCompat(typedArrayObtainStyledAttributes, context, C19469R.styleable.f74286xd6f5bac3);
            if (drawableCompat5 == null) {
                drawableCompat5 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_mic_lock);
                AbstractC22676k.m65747g(drawableCompat5);
            }
            Drawable drawable13 = drawableCompat5;
            Integer colorOrNull7 = TypedArrayKt.getColorOrNull(typedArrayObtainStyledAttributes, C19469R.styleable.f74287x9c6c685e);
            Drawable drawableCompat6 = TypedArrayKt.getDrawableCompat(typedArrayObtainStyledAttributes, context, C19469R.styleable.f74288xf46ae5e2);
            if (drawableCompat6 == null) {
                drawableCompat6 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_mic_locked);
                AbstractC22676k.m65747g(drawableCompat6);
            }
            Drawable drawable14 = drawableCompat6;
            Integer colorOrNull8 = TypedArrayKt.getColorOrNull(typedArrayObtainStyledAttributes, C19469R.styleable.f74289x5708ebfd);
            Integer colorOrNull9 = TypedArrayKt.getColorOrNull(typedArrayObtainStyledAttributes, C19469R.styleable.f74307xb963436b);
            boolean z16 = typedArrayObtainStyledAttributes.getBoolean(C19469R.styleable.f74189xb0952d0, true);
            Drawable drawableCompat7 = TypedArrayKt.getDrawableCompat(typedArrayObtainStyledAttributes, context, C19469R.styleable.f74186x6a20099);
            if (drawableCompat7 == null) {
                drawableCompat7 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_attach);
                AbstractC22676k.m65747g(drawableCompat7);
            }
            Drawable drawable15 = drawableCompat7;
            ColorStateList colorStateListCompat = TypedArrayKt.getColorStateListCompat(typedArrayObtainStyledAttributes, context, C19469R.styleable.f74187xbe980234);
            Integer colorOrNull10 = TypedArrayKt.getColorOrNull(typedArrayObtainStyledAttributes, C19469R.styleable.f74188xb7acea71);
            boolean z17 = typedArrayObtainStyledAttributes.getBoolean(C19469R.styleable.MessageComposerView_streamUiMessageComposerCommandsButtonVisible, true);
            Drawable drawableCompat8 = TypedArrayKt.getDrawableCompat(typedArrayObtainStyledAttributes, context, C19469R.styleable.f74328x302248f1);
            if (drawableCompat8 == null) {
                drawableCompat8 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_command);
                AbstractC22676k.m65747g(drawableCompat8);
            }
            Drawable drawable16 = drawableCompat8;
            ColorStateList colorStateListCompat2 = TypedArrayKt.getColorStateListCompat(typedArrayObtainStyledAttributes, context, C19469R.styleable.f74329xe8184a8c);
            Integer colorOrNull11 = TypedArrayKt.getColorOrNull(typedArrayObtainStyledAttributes, C19469R.styleable.f74330x3563719);
            boolean z18 = typedArrayObtainStyledAttributes.getBoolean(C19469R.styleable.f74185xc4e382d6, true);
            Drawable drawable17 = typedArrayObtainStyledAttributes.getDrawable(C19469R.styleable.f74178x47dd3aba);
            CharSequence text = typedArrayObtainStyledAttributes.getText(C19469R.styleable.f74179xc9206d49);
            if (text == null || (string = text.toString()) == null) {
                string = context.getString(C19469R.string.stream_ui_message_composer_send_to_channel);
                AbstractC22676k.m65749i(string, "getString(...)");
            }
            String str6 = string;
            TextStyle.Builder builder9 = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder9.size(C19469R.styleable.f74183x3d4df4ea, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_small));
            builder9.color(C19469R.styleable.f74180x6b91b79a, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_secondary));
            builder9.font(C19469R.styleable.f74182xdcbdb6db, C19469R.styleable.f74181x3d482138);
            builder9.style(C19469R.styleable.f74184x6c75a5e8, 0);
            TextStyle textStyleBuild9 = builder9.build();
            CharSequence text2 = typedArrayObtainStyledAttributes.getText(C19469R.styleable.MessageComposerView_streamUiMessageComposerEditModeText);
            if (text2 == null || (string2 = text2.toString()) == null) {
                string2 = context.getString(C19469R.string.stream_ui_message_composer_mode_edit);
                AbstractC22676k.m65749i(string2, "getString(...)");
            }
            String str7 = string2;
            Drawable drawable18 = typedArrayObtainStyledAttributes.getDrawable(C19469R.styleable.MessageComposerView_streamUiMessageComposerEditModeIconDrawable);
            if (drawable18 == null) {
                drawable18 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_edit);
                AbstractC22676k.m65747g(drawable18);
            }
            Drawable drawable19 = drawable18;
            CharSequence text3 = typedArrayObtainStyledAttributes.getText(C19469R.styleable.MessageComposerView_streamUiMessageComposerReplyModeText);
            if (text3 == null || (string3 = text3.toString()) == null) {
                string3 = context.getString(C19469R.string.stream_ui_message_composer_mode_reply);
                AbstractC22676k.m65749i(string3, "getString(...)");
            }
            String str8 = string3;
            Drawable drawable20 = typedArrayObtainStyledAttributes.getDrawable(C19469R.styleable.MessageComposerView_streamUiMessageComposerReplyModeIconDrawable);
            if (drawable20 == null) {
                drawable20 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_arrow_curve_left_grey);
                AbstractC22676k.m65747g(drawable20);
            }
            Drawable drawable21 = drawable20;
            Drawable drawable22 = typedArrayObtainStyledAttributes.getDrawable(C19469R.styleable.f74336x14dbc864);
            if (drawable22 == null) {
                drawable22 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_clear);
                AbstractC22676k.m65747g(drawable22);
            }
            Drawable drawable23 = drawable22;
            boolean z19 = typedArrayObtainStyledAttributes.getBoolean(C19469R.styleable.f74384x4243ae50, true);
            Drawable drawableCompat9 = TypedArrayKt.getDrawableCompat(typedArrayObtainStyledAttributes, context, C19469R.styleable.f74386xa1a70688);
            if (drawableCompat9 == null) {
                drawableCompat9 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_send_message);
                AbstractC22676k.m65747g(drawableCompat9);
            }
            Drawable drawable24 = drawableCompat9;
            ColorStateList colorStateListCompat3 = TypedArrayKt.getColorStateListCompat(typedArrayObtainStyledAttributes, context, C19469R.styleable.f74387x599d0823);
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.f74389xd66dc895, IntKt.dpToPx(32));
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.f74385xdd7c5038, IntKt.dpToPx(32));
            int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.f74388x72245f20, IntKt.dpToPx(4));
            boolean z24 = typedArrayObtainStyledAttributes.getBoolean(C19469R.styleable.f74274x6e6ce0f4, true);
            boolean z25 = typedArrayObtainStyledAttributes.getBoolean(C19469R.styleable.f74280xea2f4625, true);
            boolean z26 = typedArrayObtainStyledAttributes.getBoolean(C19469R.styleable.f74279x5f3dc174, false);
            boolean z27 = typedArrayObtainStyledAttributes.getBoolean(C19469R.styleable.f74298xeb795d3b, false);
            Drawable drawableCompat10 = TypedArrayKt.getDrawableCompat(typedArrayObtainStyledAttributes, context, C19469R.styleable.f74276x1147da64);
            if (drawableCompat10 == null) {
                drawableCompat10 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_mic);
                AbstractC22676k.m65747g(drawableCompat10);
            }
            Drawable drawable25 = drawableCompat10;
            ColorStateList colorStateListCompat4 = TypedArrayKt.getColorStateListCompat(typedArrayObtainStyledAttributes, context, C19469R.styleable.f74277xc93ddbff);
            int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.f74281xe3cb5439, IntKt.dpToPx(32));
            int dimensionPixelSize5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.f74275x7bd03914, IntKt.dpToPx(32));
            int dimensionPixelSize6 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.f74278x9e4d91c4, IntKt.dpToPx(4));
            TextStyle.Builder builder10 = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder10.size(C19469R.styleable.MessageComposerView_streamUiMessageComposerCooldownTimerTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_large));
            builder10.color(C19469R.styleable.f74333x3cf3bc7c, AbstractC32122c.getColor(context, C19469R.color.stream_ui_literal_white));
            builder10.font(C19469R.styleable.f74334xeda56f39, C19469R.styleable.MessageComposerView_streamUiMessageComposerCooldownTimerTextFont);
            builder10.style(C19469R.styleable.f74335x3dd7aaca, 1);
            TextStyle textStyleBuild10 = builder10.build();
            Drawable drawable26 = typedArrayObtainStyledAttributes.getDrawable(C19469R.styleable.f74332x37d24c66);
            if (drawable26 == null) {
                drawable26 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_cooldown_badge_background);
                AbstractC22676k.m65747g(drawable26);
            }
            Drawable drawable27 = drawable26;
            int i15 = typedArrayObtainStyledAttributes.getInt(C19469R.styleable.MessageComposerView_android_inputType, 147457);
            boolean z28 = typedArrayObtainStyledAttributes.getBoolean(C19469R.styleable.MessageComposerView_streamUiMessageComposerShowMessageReplyView, true);
            Drawable drawable28 = typedArrayObtainStyledAttributes.getDrawable(C19469R.styleable.f74358x2eda1192);
            if (drawable28 == null) {
                drawable28 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_play);
                AbstractC22676k.m65747g(drawable28);
            }
            Drawable drawable29 = drawable28;
            Integer colorOrNull12 = TypedArrayKt.getColorOrNull(typedArrayObtainStyledAttributes, C19469R.styleable.f74364x299abfad);
            Integer colorOrNull13 = TypedArrayKt.getColorOrNull(typedArrayObtainStyledAttributes, C19469R.styleable.f74357xadd72b61);
            float dimension = typedArrayObtainStyledAttributes.getDimension(C19469R.styleable.f74366x11c4bddf, IntKt.dpToPxPrecise(20));
            float dimension2 = typedArrayObtainStyledAttributes.getDimension(C19469R.styleable.f74365xa351bbe9, 0.0f);
            int dimensionPixelSize7 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.f74363x7cd7e6b6, 0);
            int dimensionPixelSize8 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.f74360x9f56d2a, 0);
            int dimensionPixelSize9 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.f74362xa66d1583, 0);
            int dimensionPixelSize10 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.f74361x7cd7ae3c, 0);
            Float dimensionOrNull = TypedArrayKt.getDimensionOrNull(typedArrayObtainStyledAttributes, C19469R.styleable.f74359xad753a1f);
            AudioRecordPlayerViewStyle audioRecordPlayerViewStyleInvoke$stream_chat_android_ui_components_release = null;
            Integer numValueOf = dimensionOrNull != null ? Integer.valueOf((int) dimensionOrNull.floatValue()) : null;
            int iIntValue = dimensionPixelSize10;
            Typeface typefaceM109098b = AbstractC34523k.m109098b(context, C19470R.font.stream_roboto_medium);
            if (typefaceM109098b == null) {
                typefaceM109098b = Typeface.DEFAULT;
            }
            int iIntValue2 = dimensionPixelSize7;
            Drawable drawable30 = drawable7;
            boolean z29 = typedArrayObtainStyledAttributes.getBoolean(C19469R.styleable.f74368x89ed91a4, true);
            int color4 = typedArrayObtainStyledAttributes.getColor(C19469R.styleable.f74367xb6dd5172, AbstractC32122c.getColor(context, C19469R.color.stream_ui_white));
            TextStyle.Builder builder11 = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            int i16 = C19469R.styleable.f74379xef94aec4;
            MessageReplyStyle.INSTANCE.getClass();
            Integer num = numValueOf;
            builder11.size(i16, ContextKt.getDimension(context, MessageReplyStyle.DEFAULT_TEXT_SIZE));
            builder11.color(C19469R.styleable.f74373x5c771986, AbstractC32122c.getColor(context, MessageReplyStyle.DEFAULT_TEXT_COLOR));
            int i17 = C19469R.styleable.f74375x940d66f5;
            int i18 = C19469R.styleable.f74381x51ff30d4;
            AbstractC22676k.m65747g(typefaceM109098b);
            builder11.font(i17, i18, typefaceM109098b);
            builder11.style(C19469R.styleable.f74381x51ff30d4, 0);
            TextStyle textStyleBuild11 = builder11.build();
            int color5 = typedArrayObtainStyledAttributes.getColor(C19469R.styleable.f74369x36a6e19b, AbstractC32122c.getColor(context, C19469R.color.stream_ui_grey_gainsboro));
            float dimension3 = typedArrayObtainStyledAttributes.getDimension(C19469R.styleable.f74371xbd81f67e, MessageComposerViewStyle.DEFAULT_MESSAGE_REPLY_BACKGROUND_STROKE_WIDTH);
            TextStyle.Builder builder12 = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder12.size(C19469R.styleable.f74380x6903e88a, ContextKt.getDimension(context, MessageReplyStyle.DEFAULT_TEXT_SIZE));
            builder12.color(C19469R.styleable.f74374x26f6aacc, AbstractC32122c.getColor(context, MessageReplyStyle.DEFAULT_TEXT_COLOR));
            builder12.font(C19469R.styleable.f74376xd22f587b, C19469R.styleable.f74382xdad6269a, typefaceM109098b);
            builder12.style(C19469R.styleable.f74382xdad6269a, 0);
            TextStyle textStyleBuild12 = builder12.build();
            int color6 = typedArrayObtainStyledAttributes.getColor(C19469R.styleable.f74370x3454c1a1, AbstractC32122c.getColor(context, C19469R.color.stream_ui_grey_gainsboro));
            float dimension4 = typedArrayObtainStyledAttributes.getDimension(C19469R.styleable.f74372x70be29c4, MessageComposerViewStyle.DEFAULT_MESSAGE_REPLY_BACKGROUND_STROKE_WIDTH);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(C19469R.styleable.f74273x6eb8d524, C19469R.style.StreamUi_AudioRecordPlayerView);
            if (resourceId != C19469R.style.StreamUi_AudioRecordPlayerView) {
                TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(resourceId, C19469R.styleable.AudioRecordPlayerView);
                AbstractC22676k.m65749i(typedArrayObtainStyledAttributes3, "obtainStyledAttributes(...)");
                audioRecordPlayerViewStyleInvoke$stream_chat_android_ui_components_release = AudioRecordPlayerViewStyle.INSTANCE.invoke$stream_chat_android_ui_components_release(context, typedArrayObtainStyledAttributes3);
                typedArrayObtainStyledAttributes3.recycle();
            }
            AudioRecordPlayerViewStyle audioRecordPlayerViewStyle = audioRecordPlayerViewStyleInvoke$stream_chat_android_ui_components_release;
            if (num != null) {
                iIntValue2 = num.intValue();
            }
            if (num != null) {
                dimensionPixelSize8 = num.intValue();
            }
            int iIntValue3 = num != null ? num.intValue() : dimensionPixelSize9;
            if (num != null) {
                iIntValue = num.intValue();
            }
            return TransformStyle.getMessageComposerStyleTransformer().transform(new MessageComposerViewStyle(color, drawable2, str, textStyleBuild, drawable4, colorOrNull, color2, textStyleBuild2, str2, textStyleBuild3, color3, drawable6, colorOrNull2, textStyleBuild4, str3, textStyleBuild5, z4, z13, textStyleBuild6, drawable30, drawable8, z14, z15, i14, str4, i15, z28, drawable29, colorOrNull12, colorOrNull13, dimension, dimension2, iIntValue2, dimensionPixelSize8, iIntValue3, iIntValue, string9, textStyleBuild7, drawable9, colorOrNull3, str5, textStyleBuild8, drawable10, colorOrNull4, drawable11, colorOrNull5, drawable12, colorOrNull6, drawable13, colorOrNull7, drawable14, colorOrNull8, colorOrNull9, z16, drawable15, colorStateListCompat, colorOrNull10, z17, drawable16, colorStateListCompat2, colorOrNull11, z18, drawable17, str6, textStyleBuild9, str7, drawable19, str8, drawable21, drawable23, z19, drawable24, colorStateListCompat3, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, z25, z24, z26, z27, drawable25, colorStateListCompat4, dimensionPixelSize4, dimensionPixelSize5, dimensionPixelSize6, textStyleBuild10, drawable27, z29, color4, textStyleBuild11, color5, dimension3, textStyleBuild12, color6, dimension4, MessageComposerViewStyle.INSTANCE.createAttachmentPickerDialogStyle(context, typedArrayObtainStyledAttributes), audioRecordPlayerViewStyle));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public MessageComposerViewStyle(int i13, Drawable dividerBackgroundDrawable, String commandSuggestionsTitleText, TextStyle commandSuggestionsTitleTextStyle, Drawable commandSuggestionsTitleIconDrawable, Integer num, int i14, TextStyle commandSuggestionItemCommandNameTextStyle, String commandSuggestionItemCommandDescriptionText, TextStyle commandSuggestionItemCommandDescriptionTextStyle, int i15, Drawable mentionSuggestionItemIconDrawable, Integer num2, TextStyle mentionSuggestionItemUsernameTextStyle, String mentionSuggestionItemMentionText, TextStyle mentionSuggestionItemMentionTextStyle, boolean z4, boolean z13, TextStyle messageInputTextStyle, Drawable messageInputBackgroundDrawable, Drawable drawable, boolean z14, boolean z15, int i16, String messageInputCannotSendHintText, int i17, boolean z16, Drawable messageInputVideoAttachmentIconDrawable, Integer num3, Integer num4, float f13, float f14, int i18, int i19, int i24, int i25, String str, TextStyle audioRecordingHoldToRecordTextStyle, Drawable audioRecordingHoldToRecordBackgroundDrawable, Integer num5, String audioRecordingSlideToCancelText, TextStyle audioRecordingSlideToCancelTextStyle, Drawable audioRecordingSlideToCancelStartDrawable, Integer num6, Drawable audioRecordingFloatingButtonIconDrawable, Integer num7, Drawable audioRecordingFloatingButtonBackgroundDrawable, Integer num8, Drawable audioRecordingFloatingLockIconDrawable, Integer num9, Drawable audioRecordingFloatingLockedIconDrawable, Integer num10, Integer num11, boolean z17, Drawable attachmentsButtonIconDrawable, ColorStateList colorStateList, Integer num12, boolean z18, Drawable commandsButtonIconDrawable, ColorStateList colorStateList2, Integer num13, boolean z19, Drawable drawable2, String alsoSendToChannelCheckboxText, TextStyle alsoSendToChannelCheckboxTextStyle, String editModeText, Drawable editModeIconDrawable, String replyModeText, Drawable replyModeIconDrawable, Drawable dismissModeIconDrawable, boolean z24, Drawable sendMessageButtonIconDrawable, ColorStateList colorStateList3, int i26, int i27, int i28, boolean z25, boolean z26, boolean z27, boolean z28, Drawable audioRecordingButtonIconDrawable, ColorStateList colorStateList4, int i29, int i34, int i35, TextStyle cooldownTimerTextStyle, Drawable cooldownTimerBackgroundDrawable, boolean z29, int i36, TextStyle messageReplyTextStyleMine, int i37, float f15, TextStyle messageReplyTextStyleTheirs, int i38, float f16, AttachmentsPickerDialogStyle attachmentsPickerDialogStyle, AudioRecordPlayerViewStyle audioRecordPlayerViewStyle) {
        AbstractC22676k.m65750j(dividerBackgroundDrawable, "dividerBackgroundDrawable");
        AbstractC22676k.m65750j(commandSuggestionsTitleText, "commandSuggestionsTitleText");
        AbstractC22676k.m65750j(commandSuggestionsTitleTextStyle, "commandSuggestionsTitleTextStyle");
        AbstractC22676k.m65750j(commandSuggestionsTitleIconDrawable, "commandSuggestionsTitleIconDrawable");
        AbstractC22676k.m65750j(commandSuggestionItemCommandNameTextStyle, "commandSuggestionItemCommandNameTextStyle");
        AbstractC22676k.m65750j(commandSuggestionItemCommandDescriptionText, "commandSuggestionItemCommandDescriptionText");
        AbstractC22676k.m65750j(commandSuggestionItemCommandDescriptionTextStyle, "commandSuggestionItemCommandDescriptionTextStyle");
        AbstractC22676k.m65750j(mentionSuggestionItemIconDrawable, "mentionSuggestionItemIconDrawable");
        AbstractC22676k.m65750j(mentionSuggestionItemUsernameTextStyle, "mentionSuggestionItemUsernameTextStyle");
        AbstractC22676k.m65750j(mentionSuggestionItemMentionText, "mentionSuggestionItemMentionText");
        AbstractC22676k.m65750j(mentionSuggestionItemMentionTextStyle, "mentionSuggestionItemMentionTextStyle");
        AbstractC22676k.m65750j(messageInputTextStyle, "messageInputTextStyle");
        AbstractC22676k.m65750j(messageInputBackgroundDrawable, "messageInputBackgroundDrawable");
        AbstractC22676k.m65750j(messageInputCannotSendHintText, "messageInputCannotSendHintText");
        AbstractC22676k.m65750j(messageInputVideoAttachmentIconDrawable, "messageInputVideoAttachmentIconDrawable");
        AbstractC22676k.m65750j(audioRecordingHoldToRecordTextStyle, "audioRecordingHoldToRecordTextStyle");
        AbstractC22676k.m65750j(audioRecordingHoldToRecordBackgroundDrawable, "audioRecordingHoldToRecordBackgroundDrawable");
        AbstractC22676k.m65750j(audioRecordingSlideToCancelText, "audioRecordingSlideToCancelText");
        AbstractC22676k.m65750j(audioRecordingSlideToCancelTextStyle, "audioRecordingSlideToCancelTextStyle");
        AbstractC22676k.m65750j(audioRecordingSlideToCancelStartDrawable, "audioRecordingSlideToCancelStartDrawable");
        AbstractC22676k.m65750j(audioRecordingFloatingButtonIconDrawable, "audioRecordingFloatingButtonIconDrawable");
        AbstractC22676k.m65750j(audioRecordingFloatingButtonBackgroundDrawable, "audioRecordingFloatingButtonBackgroundDrawable");
        AbstractC22676k.m65750j(audioRecordingFloatingLockIconDrawable, "audioRecordingFloatingLockIconDrawable");
        AbstractC22676k.m65750j(audioRecordingFloatingLockedIconDrawable, "audioRecordingFloatingLockedIconDrawable");
        AbstractC22676k.m65750j(attachmentsButtonIconDrawable, "attachmentsButtonIconDrawable");
        AbstractC22676k.m65750j(commandsButtonIconDrawable, "commandsButtonIconDrawable");
        AbstractC22676k.m65750j(alsoSendToChannelCheckboxText, "alsoSendToChannelCheckboxText");
        AbstractC22676k.m65750j(alsoSendToChannelCheckboxTextStyle, "alsoSendToChannelCheckboxTextStyle");
        AbstractC22676k.m65750j(editModeText, "editModeText");
        AbstractC22676k.m65750j(editModeIconDrawable, "editModeIconDrawable");
        AbstractC22676k.m65750j(replyModeText, "replyModeText");
        AbstractC22676k.m65750j(replyModeIconDrawable, "replyModeIconDrawable");
        AbstractC22676k.m65750j(dismissModeIconDrawable, "dismissModeIconDrawable");
        AbstractC22676k.m65750j(sendMessageButtonIconDrawable, "sendMessageButtonIconDrawable");
        AbstractC22676k.m65750j(audioRecordingButtonIconDrawable, "audioRecordingButtonIconDrawable");
        AbstractC22676k.m65750j(cooldownTimerTextStyle, "cooldownTimerTextStyle");
        AbstractC22676k.m65750j(cooldownTimerBackgroundDrawable, "cooldownTimerBackgroundDrawable");
        AbstractC22676k.m65750j(messageReplyTextStyleMine, "messageReplyTextStyleMine");
        AbstractC22676k.m65750j(messageReplyTextStyleTheirs, "messageReplyTextStyleTheirs");
        AbstractC22676k.m65750j(attachmentsPickerDialogStyle, "attachmentsPickerDialogStyle");
        this.backgroundColor = i13;
        this.dividerBackgroundDrawable = dividerBackgroundDrawable;
        this.commandSuggestionsTitleText = commandSuggestionsTitleText;
        this.commandSuggestionsTitleTextStyle = commandSuggestionsTitleTextStyle;
        this.commandSuggestionsTitleIconDrawable = commandSuggestionsTitleIconDrawable;
        this.commandSuggestionsTitleIconDrawableTintColor = num;
        this.commandSuggestionsBackgroundColor = i14;
        this.commandSuggestionItemCommandNameTextStyle = commandSuggestionItemCommandNameTextStyle;
        this.commandSuggestionItemCommandDescriptionText = commandSuggestionItemCommandDescriptionText;
        this.commandSuggestionItemCommandDescriptionTextStyle = commandSuggestionItemCommandDescriptionTextStyle;
        this.mentionSuggestionsBackgroundColor = i15;
        this.mentionSuggestionItemIconDrawable = mentionSuggestionItemIconDrawable;
        this.mentionSuggestionItemIconDrawableTintColor = num2;
        this.mentionSuggestionItemUsernameTextStyle = mentionSuggestionItemUsernameTextStyle;
        this.mentionSuggestionItemMentionText = mentionSuggestionItemMentionText;
        this.mentionSuggestionItemMentionTextStyle = mentionSuggestionItemMentionTextStyle;
        this.messageInputCommandsHandlingEnabled = z4;
        this.messageInputMentionsHandlingEnabled = z13;
        this.messageInputTextStyle = messageInputTextStyle;
        this.messageInputBackgroundDrawable = messageInputBackgroundDrawable;
        this.messageInputCursorDrawable = drawable;
        this.messageInputScrollbarEnabled = z14;
        this.messageInputScrollbarFadingEnabled = z15;
        this.messageInputMaxLines = i16;
        this.messageInputCannotSendHintText = messageInputCannotSendHintText;
        this.messageInputInputType = i17;
        this.messageInputShowReplyView = z16;
        this.messageInputVideoAttachmentIconDrawable = messageInputVideoAttachmentIconDrawable;
        this.messageInputVideoAttachmentIconDrawableTint = num3;
        this.messageInputVideoAttachmentIconBackgroundColor = num4;
        this.messageInputVideoAttachmentIconCornerRadius = f13;
        this.messageInputVideoAttachmentIconElevation = f14;
        this.messageInputVideoAttachmentIconDrawablePaddingTop = i18;
        this.messageInputVideoAttachmentIconDrawablePaddingBottom = i19;
        this.messageInputVideoAttachmentIconDrawablePaddingStart = i24;
        this.messageInputVideoAttachmentIconDrawablePaddingEnd = i25;
        this.audioRecordingHoldToRecordText = str;
        this.audioRecordingHoldToRecordTextStyle = audioRecordingHoldToRecordTextStyle;
        this.audioRecordingHoldToRecordBackgroundDrawable = audioRecordingHoldToRecordBackgroundDrawable;
        this.audioRecordingHoldToRecordBackgroundDrawableTint = num5;
        this.audioRecordingSlideToCancelText = audioRecordingSlideToCancelText;
        this.audioRecordingSlideToCancelTextStyle = audioRecordingSlideToCancelTextStyle;
        this.audioRecordingSlideToCancelStartDrawable = audioRecordingSlideToCancelStartDrawable;
        this.audioRecordingSlideToCancelStartDrawableTint = num6;
        this.audioRecordingFloatingButtonIconDrawable = audioRecordingFloatingButtonIconDrawable;
        this.audioRecordingFloatingButtonIconDrawableTint = num7;
        this.audioRecordingFloatingButtonBackgroundDrawable = audioRecordingFloatingButtonBackgroundDrawable;
        this.audioRecordingFloatingButtonBackgroundDrawableTint = num8;
        this.audioRecordingFloatingLockIconDrawable = audioRecordingFloatingLockIconDrawable;
        this.audioRecordingFloatingLockIconDrawableTint = num9;
        this.audioRecordingFloatingLockedIconDrawable = audioRecordingFloatingLockedIconDrawable;
        this.audioRecordingFloatingLockedIconDrawableTint = num10;
        this.audioRecordingWaveformColor = num11;
        this.attachmentsButtonVisible = z17;
        this.attachmentsButtonIconDrawable = attachmentsButtonIconDrawable;
        this.attachmentsButtonIconTintList = colorStateList;
        this.attachmentsButtonRippleColor = num12;
        this.commandsButtonVisible = z18;
        this.commandsButtonIconDrawable = commandsButtonIconDrawable;
        this.commandsButtonIconTintList = colorStateList2;
        this.commandsButtonRippleColor = num13;
        this.alsoSendToChannelCheckboxVisible = z19;
        this.alsoSendToChannelCheckboxDrawable = drawable2;
        this.alsoSendToChannelCheckboxText = alsoSendToChannelCheckboxText;
        this.alsoSendToChannelCheckboxTextStyle = alsoSendToChannelCheckboxTextStyle;
        this.editModeText = editModeText;
        this.editModeIconDrawable = editModeIconDrawable;
        this.replyModeText = replyModeText;
        this.replyModeIconDrawable = replyModeIconDrawable;
        this.dismissModeIconDrawable = dismissModeIconDrawable;
        this.sendMessageButtonEnabled = z24;
        this.sendMessageButtonIconDrawable = sendMessageButtonIconDrawable;
        this.sendMessageButtonIconTintList = colorStateList3;
        this.sendMessageButtonWidth = i26;
        this.sendMessageButtonHeight = i27;
        this.sendMessageButtonPadding = i28;
        this.audioRecordingButtonVisible = z25;
        this.audioRecordingButtonEnabled = z26;
        this.audioRecordingButtonPreferred = z27;
        this.audioRecordingSendOnComplete = z28;
        this.audioRecordingButtonIconDrawable = audioRecordingButtonIconDrawable;
        this.audioRecordingButtonIconTintList = colorStateList4;
        this.audioRecordingButtonWidth = i29;
        this.audioRecordingButtonHeight = i34;
        this.audioRecordingButtonPadding = i35;
        this.cooldownTimerTextStyle = cooldownTimerTextStyle;
        this.cooldownTimerBackgroundDrawable = cooldownTimerBackgroundDrawable;
        this.messageReplyShowUserAvatar = z29;
        this.messageReplyBackgroundColor = i36;
        this.messageReplyTextStyleMine = messageReplyTextStyleMine;
        this.messageReplyMessageBackgroundStrokeColorMine = i37;
        this.messageReplyMessageBackgroundStrokeWidthMine = f15;
        this.messageReplyTextStyleTheirs = messageReplyTextStyleTheirs;
        this.messageReplyMessageBackgroundStrokeColorTheirs = i38;
        this.messageReplyMessageBackgroundStrokeWidthTheirs = f16;
        this.attachmentsPickerDialogStyle = attachmentsPickerDialogStyle;
        this.audioRecordPlayerViewStyle = audioRecordPlayerViewStyle;
    }

    public static /* synthetic */ MessageComposerViewStyle copy$default(MessageComposerViewStyle messageComposerViewStyle, int i13, Drawable drawable, String str, TextStyle textStyle, Drawable drawable2, Integer num, int i14, TextStyle textStyle2, String str2, TextStyle textStyle3, int i15, Drawable drawable3, Integer num2, TextStyle textStyle4, String str3, TextStyle textStyle5, boolean z4, boolean z13, TextStyle textStyle6, Drawable drawable4, Drawable drawable5, boolean z14, boolean z15, int i16, String str4, int i17, boolean z16, Drawable drawable6, Integer num3, Integer num4, float f13, float f14, int i18, int i19, int i24, int i25, String str5, TextStyle textStyle7, Drawable drawable7, Integer num5, String str6, TextStyle textStyle8, Drawable drawable8, Integer num6, Drawable drawable9, Integer num7, Drawable drawable10, Integer num8, Drawable drawable11, Integer num9, Drawable drawable12, Integer num10, Integer num11, boolean z17, Drawable drawable13, ColorStateList colorStateList, Integer num12, boolean z18, Drawable drawable14, ColorStateList colorStateList2, Integer num13, boolean z19, Drawable drawable15, String str7, TextStyle textStyle9, String str8, Drawable drawable16, String str9, Drawable drawable17, Drawable drawable18, boolean z24, Drawable drawable19, ColorStateList colorStateList3, int i26, int i27, int i28, boolean z25, boolean z26, boolean z27, boolean z28, Drawable drawable20, ColorStateList colorStateList4, int i29, int i34, int i35, TextStyle textStyle10, Drawable drawable21, boolean z29, int i36, TextStyle textStyle11, int i37, float f15, TextStyle textStyle12, int i38, float f16, AttachmentsPickerDialogStyle attachmentsPickerDialogStyle, AudioRecordPlayerViewStyle audioRecordPlayerViewStyle, int i39, int i44, int i45, int i46, Object obj) {
        AudioRecordPlayerViewStyle audioRecordPlayerViewStyle2;
        float f17;
        int i47 = (i39 & 1) != 0 ? messageComposerViewStyle.backgroundColor : i13;
        Drawable drawable22 = (i39 & 2) != 0 ? messageComposerViewStyle.dividerBackgroundDrawable : drawable;
        String str10 = (i39 & 4) != 0 ? messageComposerViewStyle.commandSuggestionsTitleText : str;
        TextStyle textStyle13 = (i39 & 8) != 0 ? messageComposerViewStyle.commandSuggestionsTitleTextStyle : textStyle;
        Drawable drawable23 = (i39 & 16) != 0 ? messageComposerViewStyle.commandSuggestionsTitleIconDrawable : drawable2;
        Integer num14 = (i39 & 32) != 0 ? messageComposerViewStyle.commandSuggestionsTitleIconDrawableTintColor : num;
        int i48 = (i39 & 64) != 0 ? messageComposerViewStyle.commandSuggestionsBackgroundColor : i14;
        TextStyle textStyle14 = (i39 & 128) != 0 ? messageComposerViewStyle.commandSuggestionItemCommandNameTextStyle : textStyle2;
        String str11 = (i39 & 256) != 0 ? messageComposerViewStyle.commandSuggestionItemCommandDescriptionText : str2;
        TextStyle textStyle15 = (i39 & 512) != 0 ? messageComposerViewStyle.commandSuggestionItemCommandDescriptionTextStyle : textStyle3;
        int i49 = (i39 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageComposerViewStyle.mentionSuggestionsBackgroundColor : i15;
        Drawable drawable24 = (i39 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageComposerViewStyle.mentionSuggestionItemIconDrawable : drawable3;
        int i54 = i47;
        Integer num15 = (i39 & 4096) != 0 ? messageComposerViewStyle.mentionSuggestionItemIconDrawableTintColor : num2;
        TextStyle textStyle16 = (i39 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? messageComposerViewStyle.mentionSuggestionItemUsernameTextStyle : textStyle4;
        String str12 = (i39 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? messageComposerViewStyle.mentionSuggestionItemMentionText : str3;
        TextStyle textStyle17 = (i39 & 32768) != 0 ? messageComposerViewStyle.mentionSuggestionItemMentionTextStyle : textStyle5;
        boolean z34 = (i39 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? messageComposerViewStyle.messageInputCommandsHandlingEnabled : z4;
        boolean z35 = (i39 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? messageComposerViewStyle.messageInputMentionsHandlingEnabled : z13;
        TextStyle textStyle18 = (i39 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? messageComposerViewStyle.messageInputTextStyle : textStyle6;
        Drawable drawable25 = (i39 & 524288) != 0 ? messageComposerViewStyle.messageInputBackgroundDrawable : drawable4;
        Drawable drawable26 = (i39 & 1048576) != 0 ? messageComposerViewStyle.messageInputCursorDrawable : drawable5;
        boolean z36 = (i39 & 2097152) != 0 ? messageComposerViewStyle.messageInputScrollbarEnabled : z14;
        boolean z37 = (i39 & 4194304) != 0 ? messageComposerViewStyle.messageInputScrollbarFadingEnabled : z15;
        int i55 = (i39 & 8388608) != 0 ? messageComposerViewStyle.messageInputMaxLines : i16;
        String str13 = (i39 & 16777216) != 0 ? messageComposerViewStyle.messageInputCannotSendHintText : str4;
        int i56 = (i39 & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? messageComposerViewStyle.messageInputInputType : i17;
        boolean z38 = (i39 & 67108864) != 0 ? messageComposerViewStyle.messageInputShowReplyView : z16;
        Drawable drawable27 = (i39 & 134217728) != 0 ? messageComposerViewStyle.messageInputVideoAttachmentIconDrawable : drawable6;
        Integer num16 = (i39 & 268435456) != 0 ? messageComposerViewStyle.messageInputVideoAttachmentIconDrawableTint : num3;
        Integer num17 = (i39 & 536870912) != 0 ? messageComposerViewStyle.messageInputVideoAttachmentIconBackgroundColor : num4;
        float f18 = (i39 & 1073741824) != 0 ? messageComposerViewStyle.messageInputVideoAttachmentIconCornerRadius : f13;
        float f19 = (i39 & Integer.MIN_VALUE) != 0 ? messageComposerViewStyle.messageInputVideoAttachmentIconElevation : f14;
        int i57 = (i44 & 1) != 0 ? messageComposerViewStyle.messageInputVideoAttachmentIconDrawablePaddingTop : i18;
        int i58 = (i44 & 2) != 0 ? messageComposerViewStyle.messageInputVideoAttachmentIconDrawablePaddingBottom : i19;
        int i59 = (i44 & 4) != 0 ? messageComposerViewStyle.messageInputVideoAttachmentIconDrawablePaddingStart : i24;
        int i64 = (i44 & 8) != 0 ? messageComposerViewStyle.messageInputVideoAttachmentIconDrawablePaddingEnd : i25;
        String str14 = (i44 & 16) != 0 ? messageComposerViewStyle.audioRecordingHoldToRecordText : str5;
        TextStyle textStyle19 = (i44 & 32) != 0 ? messageComposerViewStyle.audioRecordingHoldToRecordTextStyle : textStyle7;
        Drawable drawable28 = (i44 & 64) != 0 ? messageComposerViewStyle.audioRecordingHoldToRecordBackgroundDrawable : drawable7;
        Integer num18 = (i44 & 128) != 0 ? messageComposerViewStyle.audioRecordingHoldToRecordBackgroundDrawableTint : num5;
        String str15 = (i44 & 256) != 0 ? messageComposerViewStyle.audioRecordingSlideToCancelText : str6;
        TextStyle textStyle20 = (i44 & 512) != 0 ? messageComposerViewStyle.audioRecordingSlideToCancelTextStyle : textStyle8;
        Drawable drawable29 = (i44 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageComposerViewStyle.audioRecordingSlideToCancelStartDrawable : drawable8;
        Integer num19 = (i44 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageComposerViewStyle.audioRecordingSlideToCancelStartDrawableTint : num6;
        Drawable drawable30 = (i44 & 4096) != 0 ? messageComposerViewStyle.audioRecordingFloatingButtonIconDrawable : drawable9;
        Integer num20 = (i44 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? messageComposerViewStyle.audioRecordingFloatingButtonIconDrawableTint : num7;
        Drawable drawable31 = (i44 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? messageComposerViewStyle.audioRecordingFloatingButtonBackgroundDrawable : drawable10;
        Integer num21 = (i44 & 32768) != 0 ? messageComposerViewStyle.audioRecordingFloatingButtonBackgroundDrawableTint : num8;
        Drawable drawable32 = (i44 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? messageComposerViewStyle.audioRecordingFloatingLockIconDrawable : drawable11;
        Integer num22 = (i44 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? messageComposerViewStyle.audioRecordingFloatingLockIconDrawableTint : num9;
        Drawable drawable33 = (i44 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? messageComposerViewStyle.audioRecordingFloatingLockedIconDrawable : drawable12;
        Integer num23 = (i44 & 524288) != 0 ? messageComposerViewStyle.audioRecordingFloatingLockedIconDrawableTint : num10;
        Integer num24 = (i44 & 1048576) != 0 ? messageComposerViewStyle.audioRecordingWaveformColor : num11;
        boolean z39 = (i44 & 2097152) != 0 ? messageComposerViewStyle.attachmentsButtonVisible : z17;
        Drawable drawable34 = (i44 & 4194304) != 0 ? messageComposerViewStyle.attachmentsButtonIconDrawable : drawable13;
        ColorStateList colorStateList5 = (i44 & 8388608) != 0 ? messageComposerViewStyle.attachmentsButtonIconTintList : colorStateList;
        Integer num25 = (i44 & 16777216) != 0 ? messageComposerViewStyle.attachmentsButtonRippleColor : num12;
        boolean z44 = (i44 & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? messageComposerViewStyle.commandsButtonVisible : z18;
        Drawable drawable35 = (i44 & 67108864) != 0 ? messageComposerViewStyle.commandsButtonIconDrawable : drawable14;
        ColorStateList colorStateList6 = (i44 & 134217728) != 0 ? messageComposerViewStyle.commandsButtonIconTintList : colorStateList2;
        Integer num26 = (i44 & 268435456) != 0 ? messageComposerViewStyle.commandsButtonRippleColor : num13;
        boolean z45 = (i44 & 536870912) != 0 ? messageComposerViewStyle.alsoSendToChannelCheckboxVisible : z19;
        Drawable drawable36 = (i44 & 1073741824) != 0 ? messageComposerViewStyle.alsoSendToChannelCheckboxDrawable : drawable15;
        String str16 = (i44 & Integer.MIN_VALUE) != 0 ? messageComposerViewStyle.alsoSendToChannelCheckboxText : str7;
        Drawable drawable37 = drawable36;
        TextStyle textStyle21 = (i45 & 1) != 0 ? messageComposerViewStyle.alsoSendToChannelCheckboxTextStyle : textStyle9;
        String str17 = (i45 & 2) != 0 ? messageComposerViewStyle.editModeText : str8;
        Drawable drawable38 = (i45 & 4) != 0 ? messageComposerViewStyle.editModeIconDrawable : drawable16;
        String str18 = (i45 & 8) != 0 ? messageComposerViewStyle.replyModeText : str9;
        Drawable drawable39 = (i45 & 16) != 0 ? messageComposerViewStyle.replyModeIconDrawable : drawable17;
        Drawable drawable40 = (i45 & 32) != 0 ? messageComposerViewStyle.dismissModeIconDrawable : drawable18;
        boolean z46 = (i45 & 64) != 0 ? messageComposerViewStyle.sendMessageButtonEnabled : z24;
        Drawable drawable41 = (i45 & 128) != 0 ? messageComposerViewStyle.sendMessageButtonIconDrawable : drawable19;
        ColorStateList colorStateList7 = (i45 & 256) != 0 ? messageComposerViewStyle.sendMessageButtonIconTintList : colorStateList3;
        int i65 = (i45 & 512) != 0 ? messageComposerViewStyle.sendMessageButtonWidth : i26;
        int i66 = (i45 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageComposerViewStyle.sendMessageButtonHeight : i27;
        int i67 = (i45 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageComposerViewStyle.sendMessageButtonPadding : i28;
        boolean z47 = (i45 & 4096) != 0 ? messageComposerViewStyle.audioRecordingButtonVisible : z25;
        boolean z48 = (i45 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? messageComposerViewStyle.audioRecordingButtonEnabled : z26;
        boolean z49 = (i45 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? messageComposerViewStyle.audioRecordingButtonPreferred : z27;
        boolean z52 = (i45 & 32768) != 0 ? messageComposerViewStyle.audioRecordingSendOnComplete : z28;
        Drawable drawable42 = (i45 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? messageComposerViewStyle.audioRecordingButtonIconDrawable : drawable20;
        ColorStateList colorStateList8 = (i45 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? messageComposerViewStyle.audioRecordingButtonIconTintList : colorStateList4;
        int i68 = (i45 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? messageComposerViewStyle.audioRecordingButtonWidth : i29;
        int i69 = (i45 & 524288) != 0 ? messageComposerViewStyle.audioRecordingButtonHeight : i34;
        int i74 = (i45 & 1048576) != 0 ? messageComposerViewStyle.audioRecordingButtonPadding : i35;
        TextStyle textStyle22 = (i45 & 2097152) != 0 ? messageComposerViewStyle.cooldownTimerTextStyle : textStyle10;
        Drawable drawable43 = (i45 & 4194304) != 0 ? messageComposerViewStyle.cooldownTimerBackgroundDrawable : drawable21;
        boolean z54 = (i45 & 8388608) != 0 ? messageComposerViewStyle.messageReplyShowUserAvatar : z29;
        int i75 = (i45 & 16777216) != 0 ? messageComposerViewStyle.messageReplyBackgroundColor : i36;
        TextStyle textStyle23 = (i45 & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? messageComposerViewStyle.messageReplyTextStyleMine : textStyle11;
        int i76 = (i45 & 67108864) != 0 ? messageComposerViewStyle.messageReplyMessageBackgroundStrokeColorMine : i37;
        float f24 = (i45 & 134217728) != 0 ? messageComposerViewStyle.messageReplyMessageBackgroundStrokeWidthMine : f15;
        TextStyle textStyle24 = (i45 & 268435456) != 0 ? messageComposerViewStyle.messageReplyTextStyleTheirs : textStyle12;
        int i77 = (i45 & 536870912) != 0 ? messageComposerViewStyle.messageReplyMessageBackgroundStrokeColorTheirs : i38;
        float f25 = (i45 & 1073741824) != 0 ? messageComposerViewStyle.messageReplyMessageBackgroundStrokeWidthTheirs : f16;
        AttachmentsPickerDialogStyle attachmentsPickerDialogStyle2 = (i45 & Integer.MIN_VALUE) != 0 ? messageComposerViewStyle.attachmentsPickerDialogStyle : attachmentsPickerDialogStyle;
        if ((i46 & 1) != 0) {
            f17 = f25;
            audioRecordPlayerViewStyle2 = messageComposerViewStyle.audioRecordPlayerViewStyle;
        } else {
            audioRecordPlayerViewStyle2 = audioRecordPlayerViewStyle;
            f17 = f25;
        }
        return messageComposerViewStyle.copy(i54, drawable22, str10, textStyle13, drawable23, num14, i48, textStyle14, str11, textStyle15, i49, drawable24, num15, textStyle16, str12, textStyle17, z34, z35, textStyle18, drawable25, drawable26, z36, z37, i55, str13, i56, z38, drawable27, num16, num17, f18, f19, i57, i58, i59, i64, str14, textStyle19, drawable28, num18, str15, textStyle20, drawable29, num19, drawable30, num20, drawable31, num21, drawable32, num22, drawable33, num23, num24, z39, drawable34, colorStateList5, num25, z44, drawable35, colorStateList6, num26, z45, drawable37, str16, textStyle21, str17, drawable38, str18, drawable39, drawable40, z46, drawable41, colorStateList7, i65, i66, i67, z47, z48, z49, z52, drawable42, colorStateList8, i68, i69, i74, textStyle22, drawable43, z54, i75, textStyle23, i76, f24, textStyle24, i77, f17, attachmentsPickerDialogStyle2, audioRecordPlayerViewStyle2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final TextStyle getCommandSuggestionItemCommandDescriptionTextStyle() {
        return this.commandSuggestionItemCommandDescriptionTextStyle;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getMentionSuggestionsBackgroundColor() {
        return this.mentionSuggestionsBackgroundColor;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Drawable getMentionSuggestionItemIconDrawable() {
        return this.mentionSuggestionItemIconDrawable;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getMentionSuggestionItemIconDrawableTintColor() {
        return this.mentionSuggestionItemIconDrawableTintColor;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final TextStyle getMentionSuggestionItemUsernameTextStyle() {
        return this.mentionSuggestionItemUsernameTextStyle;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getMentionSuggestionItemMentionText() {
        return this.mentionSuggestionItemMentionText;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final TextStyle getMentionSuggestionItemMentionTextStyle() {
        return this.mentionSuggestionItemMentionTextStyle;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getMessageInputCommandsHandlingEnabled() {
        return this.messageInputCommandsHandlingEnabled;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final boolean getMessageInputMentionsHandlingEnabled() {
        return this.messageInputMentionsHandlingEnabled;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final TextStyle getMessageInputTextStyle() {
        return this.messageInputTextStyle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Drawable getDividerBackgroundDrawable() {
        return this.dividerBackgroundDrawable;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Drawable getMessageInputBackgroundDrawable() {
        return this.messageInputBackgroundDrawable;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Drawable getMessageInputCursorDrawable() {
        return this.messageInputCursorDrawable;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final boolean getMessageInputScrollbarEnabled() {
        return this.messageInputScrollbarEnabled;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final boolean getMessageInputScrollbarFadingEnabled() {
        return this.messageInputScrollbarFadingEnabled;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final int getMessageInputMaxLines() {
        return this.messageInputMaxLines;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getMessageInputCannotSendHintText() {
        return this.messageInputCannotSendHintText;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final int getMessageInputInputType() {
        return this.messageInputInputType;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final boolean getMessageInputShowReplyView() {
        return this.messageInputShowReplyView;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Drawable getMessageInputVideoAttachmentIconDrawable() {
        return this.messageInputVideoAttachmentIconDrawable;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final Integer getMessageInputVideoAttachmentIconDrawableTint() {
        return this.messageInputVideoAttachmentIconDrawableTint;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCommandSuggestionsTitleText() {
        return this.commandSuggestionsTitleText;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final Integer getMessageInputVideoAttachmentIconBackgroundColor() {
        return this.messageInputVideoAttachmentIconBackgroundColor;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final float getMessageInputVideoAttachmentIconCornerRadius() {
        return this.messageInputVideoAttachmentIconCornerRadius;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final float getMessageInputVideoAttachmentIconElevation() {
        return this.messageInputVideoAttachmentIconElevation;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final int getMessageInputVideoAttachmentIconDrawablePaddingTop() {
        return this.messageInputVideoAttachmentIconDrawablePaddingTop;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final int getMessageInputVideoAttachmentIconDrawablePaddingBottom() {
        return this.messageInputVideoAttachmentIconDrawablePaddingBottom;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final int getMessageInputVideoAttachmentIconDrawablePaddingStart() {
        return this.messageInputVideoAttachmentIconDrawablePaddingStart;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final int getMessageInputVideoAttachmentIconDrawablePaddingEnd() {
        return this.messageInputVideoAttachmentIconDrawablePaddingEnd;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getAudioRecordingHoldToRecordText() {
        return this.audioRecordingHoldToRecordText;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final TextStyle getAudioRecordingHoldToRecordTextStyle() {
        return this.audioRecordingHoldToRecordTextStyle;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final Drawable getAudioRecordingHoldToRecordBackgroundDrawable() {
        return this.audioRecordingHoldToRecordBackgroundDrawable;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TextStyle getCommandSuggestionsTitleTextStyle() {
        return this.commandSuggestionsTitleTextStyle;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final Integer getAudioRecordingHoldToRecordBackgroundDrawableTint() {
        return this.audioRecordingHoldToRecordBackgroundDrawableTint;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final String getAudioRecordingSlideToCancelText() {
        return this.audioRecordingSlideToCancelText;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final TextStyle getAudioRecordingSlideToCancelTextStyle() {
        return this.audioRecordingSlideToCancelTextStyle;
    }

    /* JADX INFO: renamed from: component43, reason: from getter */
    public final Drawable getAudioRecordingSlideToCancelStartDrawable() {
        return this.audioRecordingSlideToCancelStartDrawable;
    }

    /* JADX INFO: renamed from: component44, reason: from getter */
    public final Integer getAudioRecordingSlideToCancelStartDrawableTint() {
        return this.audioRecordingSlideToCancelStartDrawableTint;
    }

    /* JADX INFO: renamed from: component45, reason: from getter */
    public final Drawable getAudioRecordingFloatingButtonIconDrawable() {
        return this.audioRecordingFloatingButtonIconDrawable;
    }

    /* JADX INFO: renamed from: component46, reason: from getter */
    public final Integer getAudioRecordingFloatingButtonIconDrawableTint() {
        return this.audioRecordingFloatingButtonIconDrawableTint;
    }

    /* JADX INFO: renamed from: component47, reason: from getter */
    public final Drawable getAudioRecordingFloatingButtonBackgroundDrawable() {
        return this.audioRecordingFloatingButtonBackgroundDrawable;
    }

    /* JADX INFO: renamed from: component48, reason: from getter */
    public final Integer getAudioRecordingFloatingButtonBackgroundDrawableTint() {
        return this.audioRecordingFloatingButtonBackgroundDrawableTint;
    }

    /* JADX INFO: renamed from: component49, reason: from getter */
    public final Drawable getAudioRecordingFloatingLockIconDrawable() {
        return this.audioRecordingFloatingLockIconDrawable;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Drawable getCommandSuggestionsTitleIconDrawable() {
        return this.commandSuggestionsTitleIconDrawable;
    }

    /* JADX INFO: renamed from: component50, reason: from getter */
    public final Integer getAudioRecordingFloatingLockIconDrawableTint() {
        return this.audioRecordingFloatingLockIconDrawableTint;
    }

    /* JADX INFO: renamed from: component51, reason: from getter */
    public final Drawable getAudioRecordingFloatingLockedIconDrawable() {
        return this.audioRecordingFloatingLockedIconDrawable;
    }

    /* JADX INFO: renamed from: component52, reason: from getter */
    public final Integer getAudioRecordingFloatingLockedIconDrawableTint() {
        return this.audioRecordingFloatingLockedIconDrawableTint;
    }

    /* JADX INFO: renamed from: component53, reason: from getter */
    public final Integer getAudioRecordingWaveformColor() {
        return this.audioRecordingWaveformColor;
    }

    /* JADX INFO: renamed from: component54, reason: from getter */
    public final boolean getAttachmentsButtonVisible() {
        return this.attachmentsButtonVisible;
    }

    /* JADX INFO: renamed from: component55, reason: from getter */
    public final Drawable getAttachmentsButtonIconDrawable() {
        return this.attachmentsButtonIconDrawable;
    }

    /* JADX INFO: renamed from: component56, reason: from getter */
    public final ColorStateList getAttachmentsButtonIconTintList() {
        return this.attachmentsButtonIconTintList;
    }

    /* JADX INFO: renamed from: component57, reason: from getter */
    public final Integer getAttachmentsButtonRippleColor() {
        return this.attachmentsButtonRippleColor;
    }

    /* JADX INFO: renamed from: component58, reason: from getter */
    public final boolean getCommandsButtonVisible() {
        return this.commandsButtonVisible;
    }

    /* JADX INFO: renamed from: component59, reason: from getter */
    public final Drawable getCommandsButtonIconDrawable() {
        return this.commandsButtonIconDrawable;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getCommandSuggestionsTitleIconDrawableTintColor() {
        return this.commandSuggestionsTitleIconDrawableTintColor;
    }

    /* JADX INFO: renamed from: component60, reason: from getter */
    public final ColorStateList getCommandsButtonIconTintList() {
        return this.commandsButtonIconTintList;
    }

    /* JADX INFO: renamed from: component61, reason: from getter */
    public final Integer getCommandsButtonRippleColor() {
        return this.commandsButtonRippleColor;
    }

    /* JADX INFO: renamed from: component62, reason: from getter */
    public final boolean getAlsoSendToChannelCheckboxVisible() {
        return this.alsoSendToChannelCheckboxVisible;
    }

    /* JADX INFO: renamed from: component63, reason: from getter */
    public final Drawable getAlsoSendToChannelCheckboxDrawable() {
        return this.alsoSendToChannelCheckboxDrawable;
    }

    /* JADX INFO: renamed from: component64, reason: from getter */
    public final String getAlsoSendToChannelCheckboxText() {
        return this.alsoSendToChannelCheckboxText;
    }

    /* JADX INFO: renamed from: component65, reason: from getter */
    public final TextStyle getAlsoSendToChannelCheckboxTextStyle() {
        return this.alsoSendToChannelCheckboxTextStyle;
    }

    /* JADX INFO: renamed from: component66, reason: from getter */
    public final String getEditModeText() {
        return this.editModeText;
    }

    /* JADX INFO: renamed from: component67, reason: from getter */
    public final Drawable getEditModeIconDrawable() {
        return this.editModeIconDrawable;
    }

    /* JADX INFO: renamed from: component68, reason: from getter */
    public final String getReplyModeText() {
        return this.replyModeText;
    }

    /* JADX INFO: renamed from: component69, reason: from getter */
    public final Drawable getReplyModeIconDrawable() {
        return this.replyModeIconDrawable;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getCommandSuggestionsBackgroundColor() {
        return this.commandSuggestionsBackgroundColor;
    }

    /* JADX INFO: renamed from: component70, reason: from getter */
    public final Drawable getDismissModeIconDrawable() {
        return this.dismissModeIconDrawable;
    }

    /* JADX INFO: renamed from: component71, reason: from getter */
    public final boolean getSendMessageButtonEnabled() {
        return this.sendMessageButtonEnabled;
    }

    /* JADX INFO: renamed from: component72, reason: from getter */
    public final Drawable getSendMessageButtonIconDrawable() {
        return this.sendMessageButtonIconDrawable;
    }

    /* JADX INFO: renamed from: component73, reason: from getter */
    public final ColorStateList getSendMessageButtonIconTintList() {
        return this.sendMessageButtonIconTintList;
    }

    /* JADX INFO: renamed from: component74, reason: from getter */
    public final int getSendMessageButtonWidth() {
        return this.sendMessageButtonWidth;
    }

    /* JADX INFO: renamed from: component75, reason: from getter */
    public final int getSendMessageButtonHeight() {
        return this.sendMessageButtonHeight;
    }

    /* JADX INFO: renamed from: component76, reason: from getter */
    public final int getSendMessageButtonPadding() {
        return this.sendMessageButtonPadding;
    }

    /* JADX INFO: renamed from: component77, reason: from getter */
    public final boolean getAudioRecordingButtonVisible() {
        return this.audioRecordingButtonVisible;
    }

    /* JADX INFO: renamed from: component78, reason: from getter */
    public final boolean getAudioRecordingButtonEnabled() {
        return this.audioRecordingButtonEnabled;
    }

    /* JADX INFO: renamed from: component79, reason: from getter */
    public final boolean getAudioRecordingButtonPreferred() {
        return this.audioRecordingButtonPreferred;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final TextStyle getCommandSuggestionItemCommandNameTextStyle() {
        return this.commandSuggestionItemCommandNameTextStyle;
    }

    /* JADX INFO: renamed from: component80, reason: from getter */
    public final boolean getAudioRecordingSendOnComplete() {
        return this.audioRecordingSendOnComplete;
    }

    /* JADX INFO: renamed from: component81, reason: from getter */
    public final Drawable getAudioRecordingButtonIconDrawable() {
        return this.audioRecordingButtonIconDrawable;
    }

    /* JADX INFO: renamed from: component82, reason: from getter */
    public final ColorStateList getAudioRecordingButtonIconTintList() {
        return this.audioRecordingButtonIconTintList;
    }

    /* JADX INFO: renamed from: component83, reason: from getter */
    public final int getAudioRecordingButtonWidth() {
        return this.audioRecordingButtonWidth;
    }

    /* JADX INFO: renamed from: component84, reason: from getter */
    public final int getAudioRecordingButtonHeight() {
        return this.audioRecordingButtonHeight;
    }

    /* JADX INFO: renamed from: component85, reason: from getter */
    public final int getAudioRecordingButtonPadding() {
        return this.audioRecordingButtonPadding;
    }

    /* JADX INFO: renamed from: component86, reason: from getter */
    public final TextStyle getCooldownTimerTextStyle() {
        return this.cooldownTimerTextStyle;
    }

    /* JADX INFO: renamed from: component87, reason: from getter */
    public final Drawable getCooldownTimerBackgroundDrawable() {
        return this.cooldownTimerBackgroundDrawable;
    }

    /* JADX INFO: renamed from: component88, reason: from getter */
    public final boolean getMessageReplyShowUserAvatar() {
        return this.messageReplyShowUserAvatar;
    }

    /* JADX INFO: renamed from: component89, reason: from getter */
    public final int getMessageReplyBackgroundColor() {
        return this.messageReplyBackgroundColor;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCommandSuggestionItemCommandDescriptionText() {
        return this.commandSuggestionItemCommandDescriptionText;
    }

    /* JADX INFO: renamed from: component90, reason: from getter */
    public final TextStyle getMessageReplyTextStyleMine() {
        return this.messageReplyTextStyleMine;
    }

    /* JADX INFO: renamed from: component91, reason: from getter */
    public final int getMessageReplyMessageBackgroundStrokeColorMine() {
        return this.messageReplyMessageBackgroundStrokeColorMine;
    }

    /* JADX INFO: renamed from: component92, reason: from getter */
    public final float getMessageReplyMessageBackgroundStrokeWidthMine() {
        return this.messageReplyMessageBackgroundStrokeWidthMine;
    }

    /* JADX INFO: renamed from: component93, reason: from getter */
    public final TextStyle getMessageReplyTextStyleTheirs() {
        return this.messageReplyTextStyleTheirs;
    }

    /* JADX INFO: renamed from: component94, reason: from getter */
    public final int getMessageReplyMessageBackgroundStrokeColorTheirs() {
        return this.messageReplyMessageBackgroundStrokeColorTheirs;
    }

    /* JADX INFO: renamed from: component95, reason: from getter */
    public final float getMessageReplyMessageBackgroundStrokeWidthTheirs() {
        return this.messageReplyMessageBackgroundStrokeWidthTheirs;
    }

    /* JADX INFO: renamed from: component96, reason: from getter */
    public final AttachmentsPickerDialogStyle getAttachmentsPickerDialogStyle() {
        return this.attachmentsPickerDialogStyle;
    }

    /* JADX INFO: renamed from: component97, reason: from getter */
    public final AudioRecordPlayerViewStyle getAudioRecordPlayerViewStyle() {
        return this.audioRecordPlayerViewStyle;
    }

    public final MessageComposerViewStyle copy(int backgroundColor, Drawable dividerBackgroundDrawable, String commandSuggestionsTitleText, TextStyle commandSuggestionsTitleTextStyle, Drawable commandSuggestionsTitleIconDrawable, Integer commandSuggestionsTitleIconDrawableTintColor, int commandSuggestionsBackgroundColor, TextStyle commandSuggestionItemCommandNameTextStyle, String commandSuggestionItemCommandDescriptionText, TextStyle commandSuggestionItemCommandDescriptionTextStyle, int mentionSuggestionsBackgroundColor, Drawable mentionSuggestionItemIconDrawable, Integer mentionSuggestionItemIconDrawableTintColor, TextStyle mentionSuggestionItemUsernameTextStyle, String mentionSuggestionItemMentionText, TextStyle mentionSuggestionItemMentionTextStyle, boolean messageInputCommandsHandlingEnabled, boolean messageInputMentionsHandlingEnabled, TextStyle messageInputTextStyle, Drawable messageInputBackgroundDrawable, Drawable messageInputCursorDrawable, boolean messageInputScrollbarEnabled, boolean messageInputScrollbarFadingEnabled, int messageInputMaxLines, String messageInputCannotSendHintText, int messageInputInputType, boolean messageInputShowReplyView, Drawable messageInputVideoAttachmentIconDrawable, Integer messageInputVideoAttachmentIconDrawableTint, Integer messageInputVideoAttachmentIconBackgroundColor, float messageInputVideoAttachmentIconCornerRadius, float messageInputVideoAttachmentIconElevation, int messageInputVideoAttachmentIconDrawablePaddingTop, int messageInputVideoAttachmentIconDrawablePaddingBottom, int messageInputVideoAttachmentIconDrawablePaddingStart, int messageInputVideoAttachmentIconDrawablePaddingEnd, String audioRecordingHoldToRecordText, TextStyle audioRecordingHoldToRecordTextStyle, Drawable audioRecordingHoldToRecordBackgroundDrawable, Integer audioRecordingHoldToRecordBackgroundDrawableTint, String audioRecordingSlideToCancelText, TextStyle audioRecordingSlideToCancelTextStyle, Drawable audioRecordingSlideToCancelStartDrawable, Integer audioRecordingSlideToCancelStartDrawableTint, Drawable audioRecordingFloatingButtonIconDrawable, Integer audioRecordingFloatingButtonIconDrawableTint, Drawable audioRecordingFloatingButtonBackgroundDrawable, Integer audioRecordingFloatingButtonBackgroundDrawableTint, Drawable audioRecordingFloatingLockIconDrawable, Integer audioRecordingFloatingLockIconDrawableTint, Drawable audioRecordingFloatingLockedIconDrawable, Integer audioRecordingFloatingLockedIconDrawableTint, Integer audioRecordingWaveformColor, boolean attachmentsButtonVisible, Drawable attachmentsButtonIconDrawable, ColorStateList attachmentsButtonIconTintList, Integer attachmentsButtonRippleColor, boolean commandsButtonVisible, Drawable commandsButtonIconDrawable, ColorStateList commandsButtonIconTintList, Integer commandsButtonRippleColor, boolean alsoSendToChannelCheckboxVisible, Drawable alsoSendToChannelCheckboxDrawable, String alsoSendToChannelCheckboxText, TextStyle alsoSendToChannelCheckboxTextStyle, String editModeText, Drawable editModeIconDrawable, String replyModeText, Drawable replyModeIconDrawable, Drawable dismissModeIconDrawable, boolean sendMessageButtonEnabled, Drawable sendMessageButtonIconDrawable, ColorStateList sendMessageButtonIconTintList, int sendMessageButtonWidth, int sendMessageButtonHeight, int sendMessageButtonPadding, boolean audioRecordingButtonVisible, boolean audioRecordingButtonEnabled, boolean audioRecordingButtonPreferred, boolean audioRecordingSendOnComplete, Drawable audioRecordingButtonIconDrawable, ColorStateList audioRecordingButtonIconTintList, int audioRecordingButtonWidth, int audioRecordingButtonHeight, int audioRecordingButtonPadding, TextStyle cooldownTimerTextStyle, Drawable cooldownTimerBackgroundDrawable, boolean messageReplyShowUserAvatar, int messageReplyBackgroundColor, TextStyle messageReplyTextStyleMine, int messageReplyMessageBackgroundStrokeColorMine, float messageReplyMessageBackgroundStrokeWidthMine, TextStyle messageReplyTextStyleTheirs, int messageReplyMessageBackgroundStrokeColorTheirs, float messageReplyMessageBackgroundStrokeWidthTheirs, AttachmentsPickerDialogStyle attachmentsPickerDialogStyle, AudioRecordPlayerViewStyle audioRecordPlayerViewStyle) {
        AbstractC22676k.m65750j(dividerBackgroundDrawable, "dividerBackgroundDrawable");
        AbstractC22676k.m65750j(commandSuggestionsTitleText, "commandSuggestionsTitleText");
        AbstractC22676k.m65750j(commandSuggestionsTitleTextStyle, "commandSuggestionsTitleTextStyle");
        AbstractC22676k.m65750j(commandSuggestionsTitleIconDrawable, "commandSuggestionsTitleIconDrawable");
        AbstractC22676k.m65750j(commandSuggestionItemCommandNameTextStyle, "commandSuggestionItemCommandNameTextStyle");
        AbstractC22676k.m65750j(commandSuggestionItemCommandDescriptionText, "commandSuggestionItemCommandDescriptionText");
        AbstractC22676k.m65750j(commandSuggestionItemCommandDescriptionTextStyle, "commandSuggestionItemCommandDescriptionTextStyle");
        AbstractC22676k.m65750j(mentionSuggestionItemIconDrawable, "mentionSuggestionItemIconDrawable");
        AbstractC22676k.m65750j(mentionSuggestionItemUsernameTextStyle, "mentionSuggestionItemUsernameTextStyle");
        AbstractC22676k.m65750j(mentionSuggestionItemMentionText, "mentionSuggestionItemMentionText");
        AbstractC22676k.m65750j(mentionSuggestionItemMentionTextStyle, "mentionSuggestionItemMentionTextStyle");
        AbstractC22676k.m65750j(messageInputTextStyle, "messageInputTextStyle");
        AbstractC22676k.m65750j(messageInputBackgroundDrawable, "messageInputBackgroundDrawable");
        AbstractC22676k.m65750j(messageInputCannotSendHintText, "messageInputCannotSendHintText");
        AbstractC22676k.m65750j(messageInputVideoAttachmentIconDrawable, "messageInputVideoAttachmentIconDrawable");
        AbstractC22676k.m65750j(audioRecordingHoldToRecordTextStyle, "audioRecordingHoldToRecordTextStyle");
        AbstractC22676k.m65750j(audioRecordingHoldToRecordBackgroundDrawable, "audioRecordingHoldToRecordBackgroundDrawable");
        AbstractC22676k.m65750j(audioRecordingSlideToCancelText, "audioRecordingSlideToCancelText");
        AbstractC22676k.m65750j(audioRecordingSlideToCancelTextStyle, "audioRecordingSlideToCancelTextStyle");
        AbstractC22676k.m65750j(audioRecordingSlideToCancelStartDrawable, "audioRecordingSlideToCancelStartDrawable");
        AbstractC22676k.m65750j(audioRecordingFloatingButtonIconDrawable, "audioRecordingFloatingButtonIconDrawable");
        AbstractC22676k.m65750j(audioRecordingFloatingButtonBackgroundDrawable, "audioRecordingFloatingButtonBackgroundDrawable");
        AbstractC22676k.m65750j(audioRecordingFloatingLockIconDrawable, "audioRecordingFloatingLockIconDrawable");
        AbstractC22676k.m65750j(audioRecordingFloatingLockedIconDrawable, "audioRecordingFloatingLockedIconDrawable");
        AbstractC22676k.m65750j(attachmentsButtonIconDrawable, "attachmentsButtonIconDrawable");
        AbstractC22676k.m65750j(commandsButtonIconDrawable, "commandsButtonIconDrawable");
        AbstractC22676k.m65750j(alsoSendToChannelCheckboxText, "alsoSendToChannelCheckboxText");
        AbstractC22676k.m65750j(alsoSendToChannelCheckboxTextStyle, "alsoSendToChannelCheckboxTextStyle");
        AbstractC22676k.m65750j(editModeText, "editModeText");
        AbstractC22676k.m65750j(editModeIconDrawable, "editModeIconDrawable");
        AbstractC22676k.m65750j(replyModeText, "replyModeText");
        AbstractC22676k.m65750j(replyModeIconDrawable, "replyModeIconDrawable");
        AbstractC22676k.m65750j(dismissModeIconDrawable, "dismissModeIconDrawable");
        AbstractC22676k.m65750j(sendMessageButtonIconDrawable, "sendMessageButtonIconDrawable");
        AbstractC22676k.m65750j(audioRecordingButtonIconDrawable, "audioRecordingButtonIconDrawable");
        AbstractC22676k.m65750j(cooldownTimerTextStyle, "cooldownTimerTextStyle");
        AbstractC22676k.m65750j(cooldownTimerBackgroundDrawable, "cooldownTimerBackgroundDrawable");
        AbstractC22676k.m65750j(messageReplyTextStyleMine, "messageReplyTextStyleMine");
        AbstractC22676k.m65750j(messageReplyTextStyleTheirs, "messageReplyTextStyleTheirs");
        AbstractC22676k.m65750j(attachmentsPickerDialogStyle, "attachmentsPickerDialogStyle");
        return new MessageComposerViewStyle(backgroundColor, dividerBackgroundDrawable, commandSuggestionsTitleText, commandSuggestionsTitleTextStyle, commandSuggestionsTitleIconDrawable, commandSuggestionsTitleIconDrawableTintColor, commandSuggestionsBackgroundColor, commandSuggestionItemCommandNameTextStyle, commandSuggestionItemCommandDescriptionText, commandSuggestionItemCommandDescriptionTextStyle, mentionSuggestionsBackgroundColor, mentionSuggestionItemIconDrawable, mentionSuggestionItemIconDrawableTintColor, mentionSuggestionItemUsernameTextStyle, mentionSuggestionItemMentionText, mentionSuggestionItemMentionTextStyle, messageInputCommandsHandlingEnabled, messageInputMentionsHandlingEnabled, messageInputTextStyle, messageInputBackgroundDrawable, messageInputCursorDrawable, messageInputScrollbarEnabled, messageInputScrollbarFadingEnabled, messageInputMaxLines, messageInputCannotSendHintText, messageInputInputType, messageInputShowReplyView, messageInputVideoAttachmentIconDrawable, messageInputVideoAttachmentIconDrawableTint, messageInputVideoAttachmentIconBackgroundColor, messageInputVideoAttachmentIconCornerRadius, messageInputVideoAttachmentIconElevation, messageInputVideoAttachmentIconDrawablePaddingTop, messageInputVideoAttachmentIconDrawablePaddingBottom, messageInputVideoAttachmentIconDrawablePaddingStart, messageInputVideoAttachmentIconDrawablePaddingEnd, audioRecordingHoldToRecordText, audioRecordingHoldToRecordTextStyle, audioRecordingHoldToRecordBackgroundDrawable, audioRecordingHoldToRecordBackgroundDrawableTint, audioRecordingSlideToCancelText, audioRecordingSlideToCancelTextStyle, audioRecordingSlideToCancelStartDrawable, audioRecordingSlideToCancelStartDrawableTint, audioRecordingFloatingButtonIconDrawable, audioRecordingFloatingButtonIconDrawableTint, audioRecordingFloatingButtonBackgroundDrawable, audioRecordingFloatingButtonBackgroundDrawableTint, audioRecordingFloatingLockIconDrawable, audioRecordingFloatingLockIconDrawableTint, audioRecordingFloatingLockedIconDrawable, audioRecordingFloatingLockedIconDrawableTint, audioRecordingWaveformColor, attachmentsButtonVisible, attachmentsButtonIconDrawable, attachmentsButtonIconTintList, attachmentsButtonRippleColor, commandsButtonVisible, commandsButtonIconDrawable, commandsButtonIconTintList, commandsButtonRippleColor, alsoSendToChannelCheckboxVisible, alsoSendToChannelCheckboxDrawable, alsoSendToChannelCheckboxText, alsoSendToChannelCheckboxTextStyle, editModeText, editModeIconDrawable, replyModeText, replyModeIconDrawable, dismissModeIconDrawable, sendMessageButtonEnabled, sendMessageButtonIconDrawable, sendMessageButtonIconTintList, sendMessageButtonWidth, sendMessageButtonHeight, sendMessageButtonPadding, audioRecordingButtonVisible, audioRecordingButtonEnabled, audioRecordingButtonPreferred, audioRecordingSendOnComplete, audioRecordingButtonIconDrawable, audioRecordingButtonIconTintList, audioRecordingButtonWidth, audioRecordingButtonHeight, audioRecordingButtonPadding, cooldownTimerTextStyle, cooldownTimerBackgroundDrawable, messageReplyShowUserAvatar, messageReplyBackgroundColor, messageReplyTextStyleMine, messageReplyMessageBackgroundStrokeColorMine, messageReplyMessageBackgroundStrokeWidthMine, messageReplyTextStyleTheirs, messageReplyMessageBackgroundStrokeColorTheirs, messageReplyMessageBackgroundStrokeWidthTheirs, attachmentsPickerDialogStyle, audioRecordPlayerViewStyle);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageComposerViewStyle)) {
            return false;
        }
        MessageComposerViewStyle messageComposerViewStyle = (MessageComposerViewStyle) other;
        return this.backgroundColor == messageComposerViewStyle.backgroundColor && AbstractC22676k.m65745e(this.dividerBackgroundDrawable, messageComposerViewStyle.dividerBackgroundDrawable) && AbstractC22676k.m65745e(this.commandSuggestionsTitleText, messageComposerViewStyle.commandSuggestionsTitleText) && AbstractC22676k.m65745e(this.commandSuggestionsTitleTextStyle, messageComposerViewStyle.commandSuggestionsTitleTextStyle) && AbstractC22676k.m65745e(this.commandSuggestionsTitleIconDrawable, messageComposerViewStyle.commandSuggestionsTitleIconDrawable) && AbstractC22676k.m65745e(this.commandSuggestionsTitleIconDrawableTintColor, messageComposerViewStyle.commandSuggestionsTitleIconDrawableTintColor) && this.commandSuggestionsBackgroundColor == messageComposerViewStyle.commandSuggestionsBackgroundColor && AbstractC22676k.m65745e(this.commandSuggestionItemCommandNameTextStyle, messageComposerViewStyle.commandSuggestionItemCommandNameTextStyle) && AbstractC22676k.m65745e(this.commandSuggestionItemCommandDescriptionText, messageComposerViewStyle.commandSuggestionItemCommandDescriptionText) && AbstractC22676k.m65745e(this.commandSuggestionItemCommandDescriptionTextStyle, messageComposerViewStyle.commandSuggestionItemCommandDescriptionTextStyle) && this.mentionSuggestionsBackgroundColor == messageComposerViewStyle.mentionSuggestionsBackgroundColor && AbstractC22676k.m65745e(this.mentionSuggestionItemIconDrawable, messageComposerViewStyle.mentionSuggestionItemIconDrawable) && AbstractC22676k.m65745e(this.mentionSuggestionItemIconDrawableTintColor, messageComposerViewStyle.mentionSuggestionItemIconDrawableTintColor) && AbstractC22676k.m65745e(this.mentionSuggestionItemUsernameTextStyle, messageComposerViewStyle.mentionSuggestionItemUsernameTextStyle) && AbstractC22676k.m65745e(this.mentionSuggestionItemMentionText, messageComposerViewStyle.mentionSuggestionItemMentionText) && AbstractC22676k.m65745e(this.mentionSuggestionItemMentionTextStyle, messageComposerViewStyle.mentionSuggestionItemMentionTextStyle) && this.messageInputCommandsHandlingEnabled == messageComposerViewStyle.messageInputCommandsHandlingEnabled && this.messageInputMentionsHandlingEnabled == messageComposerViewStyle.messageInputMentionsHandlingEnabled && AbstractC22676k.m65745e(this.messageInputTextStyle, messageComposerViewStyle.messageInputTextStyle) && AbstractC22676k.m65745e(this.messageInputBackgroundDrawable, messageComposerViewStyle.messageInputBackgroundDrawable) && AbstractC22676k.m65745e(this.messageInputCursorDrawable, messageComposerViewStyle.messageInputCursorDrawable) && this.messageInputScrollbarEnabled == messageComposerViewStyle.messageInputScrollbarEnabled && this.messageInputScrollbarFadingEnabled == messageComposerViewStyle.messageInputScrollbarFadingEnabled && this.messageInputMaxLines == messageComposerViewStyle.messageInputMaxLines && AbstractC22676k.m65745e(this.messageInputCannotSendHintText, messageComposerViewStyle.messageInputCannotSendHintText) && this.messageInputInputType == messageComposerViewStyle.messageInputInputType && this.messageInputShowReplyView == messageComposerViewStyle.messageInputShowReplyView && AbstractC22676k.m65745e(this.messageInputVideoAttachmentIconDrawable, messageComposerViewStyle.messageInputVideoAttachmentIconDrawable) && AbstractC22676k.m65745e(this.messageInputVideoAttachmentIconDrawableTint, messageComposerViewStyle.messageInputVideoAttachmentIconDrawableTint) && AbstractC22676k.m65745e(this.messageInputVideoAttachmentIconBackgroundColor, messageComposerViewStyle.messageInputVideoAttachmentIconBackgroundColor) && Float.compare(this.messageInputVideoAttachmentIconCornerRadius, messageComposerViewStyle.messageInputVideoAttachmentIconCornerRadius) == 0 && Float.compare(this.messageInputVideoAttachmentIconElevation, messageComposerViewStyle.messageInputVideoAttachmentIconElevation) == 0 && this.messageInputVideoAttachmentIconDrawablePaddingTop == messageComposerViewStyle.messageInputVideoAttachmentIconDrawablePaddingTop && this.messageInputVideoAttachmentIconDrawablePaddingBottom == messageComposerViewStyle.messageInputVideoAttachmentIconDrawablePaddingBottom && this.messageInputVideoAttachmentIconDrawablePaddingStart == messageComposerViewStyle.messageInputVideoAttachmentIconDrawablePaddingStart && this.messageInputVideoAttachmentIconDrawablePaddingEnd == messageComposerViewStyle.messageInputVideoAttachmentIconDrawablePaddingEnd && AbstractC22676k.m65745e(this.audioRecordingHoldToRecordText, messageComposerViewStyle.audioRecordingHoldToRecordText) && AbstractC22676k.m65745e(this.audioRecordingHoldToRecordTextStyle, messageComposerViewStyle.audioRecordingHoldToRecordTextStyle) && AbstractC22676k.m65745e(this.audioRecordingHoldToRecordBackgroundDrawable, messageComposerViewStyle.audioRecordingHoldToRecordBackgroundDrawable) && AbstractC22676k.m65745e(this.audioRecordingHoldToRecordBackgroundDrawableTint, messageComposerViewStyle.audioRecordingHoldToRecordBackgroundDrawableTint) && AbstractC22676k.m65745e(this.audioRecordingSlideToCancelText, messageComposerViewStyle.audioRecordingSlideToCancelText) && AbstractC22676k.m65745e(this.audioRecordingSlideToCancelTextStyle, messageComposerViewStyle.audioRecordingSlideToCancelTextStyle) && AbstractC22676k.m65745e(this.audioRecordingSlideToCancelStartDrawable, messageComposerViewStyle.audioRecordingSlideToCancelStartDrawable) && AbstractC22676k.m65745e(this.audioRecordingSlideToCancelStartDrawableTint, messageComposerViewStyle.audioRecordingSlideToCancelStartDrawableTint) && AbstractC22676k.m65745e(this.audioRecordingFloatingButtonIconDrawable, messageComposerViewStyle.audioRecordingFloatingButtonIconDrawable) && AbstractC22676k.m65745e(this.audioRecordingFloatingButtonIconDrawableTint, messageComposerViewStyle.audioRecordingFloatingButtonIconDrawableTint) && AbstractC22676k.m65745e(this.audioRecordingFloatingButtonBackgroundDrawable, messageComposerViewStyle.audioRecordingFloatingButtonBackgroundDrawable) && AbstractC22676k.m65745e(this.audioRecordingFloatingButtonBackgroundDrawableTint, messageComposerViewStyle.audioRecordingFloatingButtonBackgroundDrawableTint) && AbstractC22676k.m65745e(this.audioRecordingFloatingLockIconDrawable, messageComposerViewStyle.audioRecordingFloatingLockIconDrawable) && AbstractC22676k.m65745e(this.audioRecordingFloatingLockIconDrawableTint, messageComposerViewStyle.audioRecordingFloatingLockIconDrawableTint) && AbstractC22676k.m65745e(this.audioRecordingFloatingLockedIconDrawable, messageComposerViewStyle.audioRecordingFloatingLockedIconDrawable) && AbstractC22676k.m65745e(this.audioRecordingFloatingLockedIconDrawableTint, messageComposerViewStyle.audioRecordingFloatingLockedIconDrawableTint) && AbstractC22676k.m65745e(this.audioRecordingWaveformColor, messageComposerViewStyle.audioRecordingWaveformColor) && this.attachmentsButtonVisible == messageComposerViewStyle.attachmentsButtonVisible && AbstractC22676k.m65745e(this.attachmentsButtonIconDrawable, messageComposerViewStyle.attachmentsButtonIconDrawable) && AbstractC22676k.m65745e(this.attachmentsButtonIconTintList, messageComposerViewStyle.attachmentsButtonIconTintList) && AbstractC22676k.m65745e(this.attachmentsButtonRippleColor, messageComposerViewStyle.attachmentsButtonRippleColor) && this.commandsButtonVisible == messageComposerViewStyle.commandsButtonVisible && AbstractC22676k.m65745e(this.commandsButtonIconDrawable, messageComposerViewStyle.commandsButtonIconDrawable) && AbstractC22676k.m65745e(this.commandsButtonIconTintList, messageComposerViewStyle.commandsButtonIconTintList) && AbstractC22676k.m65745e(this.commandsButtonRippleColor, messageComposerViewStyle.commandsButtonRippleColor) && this.alsoSendToChannelCheckboxVisible == messageComposerViewStyle.alsoSendToChannelCheckboxVisible && AbstractC22676k.m65745e(this.alsoSendToChannelCheckboxDrawable, messageComposerViewStyle.alsoSendToChannelCheckboxDrawable) && AbstractC22676k.m65745e(this.alsoSendToChannelCheckboxText, messageComposerViewStyle.alsoSendToChannelCheckboxText) && AbstractC22676k.m65745e(this.alsoSendToChannelCheckboxTextStyle, messageComposerViewStyle.alsoSendToChannelCheckboxTextStyle) && AbstractC22676k.m65745e(this.editModeText, messageComposerViewStyle.editModeText) && AbstractC22676k.m65745e(this.editModeIconDrawable, messageComposerViewStyle.editModeIconDrawable) && AbstractC22676k.m65745e(this.replyModeText, messageComposerViewStyle.replyModeText) && AbstractC22676k.m65745e(this.replyModeIconDrawable, messageComposerViewStyle.replyModeIconDrawable) && AbstractC22676k.m65745e(this.dismissModeIconDrawable, messageComposerViewStyle.dismissModeIconDrawable) && this.sendMessageButtonEnabled == messageComposerViewStyle.sendMessageButtonEnabled && AbstractC22676k.m65745e(this.sendMessageButtonIconDrawable, messageComposerViewStyle.sendMessageButtonIconDrawable) && AbstractC22676k.m65745e(this.sendMessageButtonIconTintList, messageComposerViewStyle.sendMessageButtonIconTintList) && this.sendMessageButtonWidth == messageComposerViewStyle.sendMessageButtonWidth && this.sendMessageButtonHeight == messageComposerViewStyle.sendMessageButtonHeight && this.sendMessageButtonPadding == messageComposerViewStyle.sendMessageButtonPadding && this.audioRecordingButtonVisible == messageComposerViewStyle.audioRecordingButtonVisible && this.audioRecordingButtonEnabled == messageComposerViewStyle.audioRecordingButtonEnabled && this.audioRecordingButtonPreferred == messageComposerViewStyle.audioRecordingButtonPreferred && this.audioRecordingSendOnComplete == messageComposerViewStyle.audioRecordingSendOnComplete && AbstractC22676k.m65745e(this.audioRecordingButtonIconDrawable, messageComposerViewStyle.audioRecordingButtonIconDrawable) && AbstractC22676k.m65745e(this.audioRecordingButtonIconTintList, messageComposerViewStyle.audioRecordingButtonIconTintList) && this.audioRecordingButtonWidth == messageComposerViewStyle.audioRecordingButtonWidth && this.audioRecordingButtonHeight == messageComposerViewStyle.audioRecordingButtonHeight && this.audioRecordingButtonPadding == messageComposerViewStyle.audioRecordingButtonPadding && AbstractC22676k.m65745e(this.cooldownTimerTextStyle, messageComposerViewStyle.cooldownTimerTextStyle) && AbstractC22676k.m65745e(this.cooldownTimerBackgroundDrawable, messageComposerViewStyle.cooldownTimerBackgroundDrawable) && this.messageReplyShowUserAvatar == messageComposerViewStyle.messageReplyShowUserAvatar && this.messageReplyBackgroundColor == messageComposerViewStyle.messageReplyBackgroundColor && AbstractC22676k.m65745e(this.messageReplyTextStyleMine, messageComposerViewStyle.messageReplyTextStyleMine) && this.messageReplyMessageBackgroundStrokeColorMine == messageComposerViewStyle.messageReplyMessageBackgroundStrokeColorMine && Float.compare(this.messageReplyMessageBackgroundStrokeWidthMine, messageComposerViewStyle.messageReplyMessageBackgroundStrokeWidthMine) == 0 && AbstractC22676k.m65745e(this.messageReplyTextStyleTheirs, messageComposerViewStyle.messageReplyTextStyleTheirs) && this.messageReplyMessageBackgroundStrokeColorTheirs == messageComposerViewStyle.messageReplyMessageBackgroundStrokeColorTheirs && Float.compare(this.messageReplyMessageBackgroundStrokeWidthTheirs, messageComposerViewStyle.messageReplyMessageBackgroundStrokeWidthTheirs) == 0 && AbstractC22676k.m65745e(this.attachmentsPickerDialogStyle, messageComposerViewStyle.attachmentsPickerDialogStyle) && AbstractC22676k.m65745e(this.audioRecordPlayerViewStyle, messageComposerViewStyle.audioRecordPlayerViewStyle);
    }

    public final Drawable getAlsoSendToChannelCheckboxDrawable() {
        return this.alsoSendToChannelCheckboxDrawable;
    }

    public final String getAlsoSendToChannelCheckboxText() {
        return this.alsoSendToChannelCheckboxText;
    }

    public final TextStyle getAlsoSendToChannelCheckboxTextStyle() {
        return this.alsoSendToChannelCheckboxTextStyle;
    }

    public final boolean getAlsoSendToChannelCheckboxVisible() {
        return this.alsoSendToChannelCheckboxVisible;
    }

    public final Drawable getAttachmentsButtonIconDrawable() {
        return this.attachmentsButtonIconDrawable;
    }

    public final ColorStateList getAttachmentsButtonIconTintList() {
        return this.attachmentsButtonIconTintList;
    }

    public final Integer getAttachmentsButtonRippleColor() {
        return this.attachmentsButtonRippleColor;
    }

    public final boolean getAttachmentsButtonVisible() {
        return this.attachmentsButtonVisible;
    }

    public final AttachmentsPickerDialogStyle getAttachmentsPickerDialogStyle() {
        return this.attachmentsPickerDialogStyle;
    }

    public final AudioRecordPlayerViewStyle getAudioRecordPlayerViewStyle() {
        return this.audioRecordPlayerViewStyle;
    }

    public final boolean getAudioRecordingButtonEnabled() {
        return this.audioRecordingButtonEnabled;
    }

    public final int getAudioRecordingButtonHeight() {
        return this.audioRecordingButtonHeight;
    }

    public final Drawable getAudioRecordingButtonIconDrawable() {
        return this.audioRecordingButtonIconDrawable;
    }

    public final ColorStateList getAudioRecordingButtonIconTintList() {
        return this.audioRecordingButtonIconTintList;
    }

    public final int getAudioRecordingButtonPadding() {
        return this.audioRecordingButtonPadding;
    }

    public final boolean getAudioRecordingButtonPreferred() {
        return this.audioRecordingButtonPreferred;
    }

    public final boolean getAudioRecordingButtonVisible() {
        return this.audioRecordingButtonVisible;
    }

    public final int getAudioRecordingButtonWidth() {
        return this.audioRecordingButtonWidth;
    }

    public final Drawable getAudioRecordingFloatingButtonBackgroundDrawable() {
        return this.audioRecordingFloatingButtonBackgroundDrawable;
    }

    public final Integer getAudioRecordingFloatingButtonBackgroundDrawableTint() {
        return this.audioRecordingFloatingButtonBackgroundDrawableTint;
    }

    public final Drawable getAudioRecordingFloatingButtonIconDrawable() {
        return this.audioRecordingFloatingButtonIconDrawable;
    }

    public final Integer getAudioRecordingFloatingButtonIconDrawableTint() {
        return this.audioRecordingFloatingButtonIconDrawableTint;
    }

    public final Drawable getAudioRecordingFloatingLockIconDrawable() {
        return this.audioRecordingFloatingLockIconDrawable;
    }

    public final Integer getAudioRecordingFloatingLockIconDrawableTint() {
        return this.audioRecordingFloatingLockIconDrawableTint;
    }

    public final Drawable getAudioRecordingFloatingLockedIconDrawable() {
        return this.audioRecordingFloatingLockedIconDrawable;
    }

    public final Integer getAudioRecordingFloatingLockedIconDrawableTint() {
        return this.audioRecordingFloatingLockedIconDrawableTint;
    }

    public final Drawable getAudioRecordingHoldToRecordBackgroundDrawable() {
        return this.audioRecordingHoldToRecordBackgroundDrawable;
    }

    public final Integer getAudioRecordingHoldToRecordBackgroundDrawableTint() {
        return this.audioRecordingHoldToRecordBackgroundDrawableTint;
    }

    public final String getAudioRecordingHoldToRecordText() {
        return this.audioRecordingHoldToRecordText;
    }

    public final TextStyle getAudioRecordingHoldToRecordTextStyle() {
        return this.audioRecordingHoldToRecordTextStyle;
    }

    public final boolean getAudioRecordingSendOnComplete() {
        return this.audioRecordingSendOnComplete;
    }

    public final Drawable getAudioRecordingSlideToCancelStartDrawable() {
        return this.audioRecordingSlideToCancelStartDrawable;
    }

    public final Integer getAudioRecordingSlideToCancelStartDrawableTint() {
        return this.audioRecordingSlideToCancelStartDrawableTint;
    }

    public final String getAudioRecordingSlideToCancelText() {
        return this.audioRecordingSlideToCancelText;
    }

    public final TextStyle getAudioRecordingSlideToCancelTextStyle() {
        return this.audioRecordingSlideToCancelTextStyle;
    }

    public final Integer getAudioRecordingWaveformColor() {
        return this.audioRecordingWaveformColor;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getCommandSuggestionItemCommandDescriptionText() {
        return this.commandSuggestionItemCommandDescriptionText;
    }

    public final TextStyle getCommandSuggestionItemCommandDescriptionTextStyle() {
        return this.commandSuggestionItemCommandDescriptionTextStyle;
    }

    public final TextStyle getCommandSuggestionItemCommandNameTextStyle() {
        return this.commandSuggestionItemCommandNameTextStyle;
    }

    public final int getCommandSuggestionsBackgroundColor() {
        return this.commandSuggestionsBackgroundColor;
    }

    public final Drawable getCommandSuggestionsTitleIconDrawable() {
        return this.commandSuggestionsTitleIconDrawable;
    }

    public final Integer getCommandSuggestionsTitleIconDrawableTintColor() {
        return this.commandSuggestionsTitleIconDrawableTintColor;
    }

    public final String getCommandSuggestionsTitleText() {
        return this.commandSuggestionsTitleText;
    }

    public final TextStyle getCommandSuggestionsTitleTextStyle() {
        return this.commandSuggestionsTitleTextStyle;
    }

    public final Drawable getCommandsButtonIconDrawable() {
        return this.commandsButtonIconDrawable;
    }

    public final ColorStateList getCommandsButtonIconTintList() {
        return this.commandsButtonIconTintList;
    }

    public final Integer getCommandsButtonRippleColor() {
        return this.commandsButtonRippleColor;
    }

    public final boolean getCommandsButtonVisible() {
        return this.commandsButtonVisible;
    }

    public final Drawable getCooldownTimerBackgroundDrawable() {
        return this.cooldownTimerBackgroundDrawable;
    }

    public final TextStyle getCooldownTimerTextStyle() {
        return this.cooldownTimerTextStyle;
    }

    public final Drawable getDismissModeIconDrawable() {
        return this.dismissModeIconDrawable;
    }

    public final Drawable getDividerBackgroundDrawable() {
        return this.dividerBackgroundDrawable;
    }

    public final Drawable getEditModeIconDrawable() {
        return this.editModeIconDrawable;
    }

    public final String getEditModeText() {
        return this.editModeText;
    }

    public final Drawable getMentionSuggestionItemIconDrawable() {
        return this.mentionSuggestionItemIconDrawable;
    }

    public final Integer getMentionSuggestionItemIconDrawableTintColor() {
        return this.mentionSuggestionItemIconDrawableTintColor;
    }

    public final String getMentionSuggestionItemMentionText() {
        return this.mentionSuggestionItemMentionText;
    }

    public final TextStyle getMentionSuggestionItemMentionTextStyle() {
        return this.mentionSuggestionItemMentionTextStyle;
    }

    public final TextStyle getMentionSuggestionItemUsernameTextStyle() {
        return this.mentionSuggestionItemUsernameTextStyle;
    }

    public final int getMentionSuggestionsBackgroundColor() {
        return this.mentionSuggestionsBackgroundColor;
    }

    public final Drawable getMessageInputBackgroundDrawable() {
        return this.messageInputBackgroundDrawable;
    }

    public final String getMessageInputCannotSendHintText() {
        return this.messageInputCannotSendHintText;
    }

    public final boolean getMessageInputCommandsHandlingEnabled() {
        return this.messageInputCommandsHandlingEnabled;
    }

    public final Drawable getMessageInputCursorDrawable() {
        return this.messageInputCursorDrawable;
    }

    public final int getMessageInputInputType() {
        return this.messageInputInputType;
    }

    public final int getMessageInputMaxLines() {
        return this.messageInputMaxLines;
    }

    public final boolean getMessageInputMentionsHandlingEnabled() {
        return this.messageInputMentionsHandlingEnabled;
    }

    public final boolean getMessageInputScrollbarEnabled() {
        return this.messageInputScrollbarEnabled;
    }

    public final boolean getMessageInputScrollbarFadingEnabled() {
        return this.messageInputScrollbarFadingEnabled;
    }

    public final boolean getMessageInputShowReplyView() {
        return this.messageInputShowReplyView;
    }

    public final TextStyle getMessageInputTextStyle() {
        return this.messageInputTextStyle;
    }

    public final Integer getMessageInputVideoAttachmentIconBackgroundColor() {
        return this.messageInputVideoAttachmentIconBackgroundColor;
    }

    public final float getMessageInputVideoAttachmentIconCornerRadius() {
        return this.messageInputVideoAttachmentIconCornerRadius;
    }

    public final Drawable getMessageInputVideoAttachmentIconDrawable() {
        return this.messageInputVideoAttachmentIconDrawable;
    }

    public final int getMessageInputVideoAttachmentIconDrawablePaddingBottom() {
        return this.messageInputVideoAttachmentIconDrawablePaddingBottom;
    }

    public final int getMessageInputVideoAttachmentIconDrawablePaddingEnd() {
        return this.messageInputVideoAttachmentIconDrawablePaddingEnd;
    }

    public final int getMessageInputVideoAttachmentIconDrawablePaddingStart() {
        return this.messageInputVideoAttachmentIconDrawablePaddingStart;
    }

    public final int getMessageInputVideoAttachmentIconDrawablePaddingTop() {
        return this.messageInputVideoAttachmentIconDrawablePaddingTop;
    }

    public final Integer getMessageInputVideoAttachmentIconDrawableTint() {
        return this.messageInputVideoAttachmentIconDrawableTint;
    }

    public final float getMessageInputVideoAttachmentIconElevation() {
        return this.messageInputVideoAttachmentIconElevation;
    }

    public final int getMessageReplyBackgroundColor() {
        return this.messageReplyBackgroundColor;
    }

    public final int getMessageReplyMessageBackgroundStrokeColorMine() {
        return this.messageReplyMessageBackgroundStrokeColorMine;
    }

    public final int getMessageReplyMessageBackgroundStrokeColorTheirs() {
        return this.messageReplyMessageBackgroundStrokeColorTheirs;
    }

    public final float getMessageReplyMessageBackgroundStrokeWidthMine() {
        return this.messageReplyMessageBackgroundStrokeWidthMine;
    }

    public final float getMessageReplyMessageBackgroundStrokeWidthTheirs() {
        return this.messageReplyMessageBackgroundStrokeWidthTheirs;
    }

    public final boolean getMessageReplyShowUserAvatar() {
        return this.messageReplyShowUserAvatar;
    }

    public final TextStyle getMessageReplyTextStyleMine() {
        return this.messageReplyTextStyleMine;
    }

    public final TextStyle getMessageReplyTextStyleTheirs() {
        return this.messageReplyTextStyleTheirs;
    }

    public final Drawable getReplyModeIconDrawable() {
        return this.replyModeIconDrawable;
    }

    public final String getReplyModeText() {
        return this.replyModeText;
    }

    public final boolean getSendMessageButtonEnabled() {
        return this.sendMessageButtonEnabled;
    }

    public final int getSendMessageButtonHeight() {
        return this.sendMessageButtonHeight;
    }

    public final Drawable getSendMessageButtonIconDrawable() {
        return this.sendMessageButtonIconDrawable;
    }

    public final ColorStateList getSendMessageButtonIconTintList() {
        return this.sendMessageButtonIconTintList;
    }

    public final int getSendMessageButtonPadding() {
        return this.sendMessageButtonPadding;
    }

    public final int getSendMessageButtonWidth() {
        return this.sendMessageButtonWidth;
    }

    public final int hashCode() {
        int iM79497a = AbstractC26725a.m79497a(this.commandSuggestionsTitleIconDrawable, AbstractC26725a.m79499c(this.commandSuggestionsTitleTextStyle, AbstractC11266d.m30450d(AbstractC26725a.m79497a(this.dividerBackgroundDrawable, Integer.hashCode(this.backgroundColor) * 31, 31), 31, this.commandSuggestionsTitleText), 31), 31);
        Integer num = this.commandSuggestionsTitleIconDrawableTintColor;
        int iM79497a2 = AbstractC26725a.m79497a(this.mentionSuggestionItemIconDrawable, AbstractC11266d.m30448b(this.mentionSuggestionsBackgroundColor, AbstractC26725a.m79499c(this.commandSuggestionItemCommandDescriptionTextStyle, AbstractC11266d.m30450d(AbstractC26725a.m79499c(this.commandSuggestionItemCommandNameTextStyle, AbstractC11266d.m30448b(this.commandSuggestionsBackgroundColor, (iM79497a + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31, this.commandSuggestionItemCommandDescriptionText), 31), 31), 31);
        Integer num2 = this.mentionSuggestionItemIconDrawableTintColor;
        int iM79497a3 = AbstractC26725a.m79497a(this.messageInputBackgroundDrawable, AbstractC26725a.m79499c(this.messageInputTextStyle, AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC26725a.m79499c(this.mentionSuggestionItemMentionTextStyle, AbstractC11266d.m30450d(AbstractC26725a.m79499c(this.mentionSuggestionItemUsernameTextStyle, (iM79497a2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31), 31, this.mentionSuggestionItemMentionText), 31), 31, this.messageInputCommandsHandlingEnabled), 31, this.messageInputMentionsHandlingEnabled), 31), 31);
        Drawable drawable = this.messageInputCursorDrawable;
        int iM79497a4 = AbstractC26725a.m79497a(this.messageInputVideoAttachmentIconDrawable, AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.messageInputInputType, AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.messageInputMaxLines, AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM79497a3 + (drawable == null ? 0 : drawable.hashCode())) * 31, 31, this.messageInputScrollbarEnabled), 31, this.messageInputScrollbarFadingEnabled), 31), 31, this.messageInputCannotSendHintText), 31), 31, this.messageInputShowReplyView), 31);
        Integer num3 = this.messageInputVideoAttachmentIconDrawableTint;
        int iHashCode = (iM79497a4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.messageInputVideoAttachmentIconBackgroundColor;
        int iM30448b = AbstractC11266d.m30448b(this.messageInputVideoAttachmentIconDrawablePaddingEnd, AbstractC11266d.m30448b(this.messageInputVideoAttachmentIconDrawablePaddingStart, AbstractC11266d.m30448b(this.messageInputVideoAttachmentIconDrawablePaddingBottom, AbstractC11266d.m30448b(this.messageInputVideoAttachmentIconDrawablePaddingTop, AbstractC11266d.m30447a(this.messageInputVideoAttachmentIconElevation, AbstractC11266d.m30447a(this.messageInputVideoAttachmentIconCornerRadius, (iHashCode + (num4 == null ? 0 : num4.hashCode())) * 31, 31), 31), 31), 31), 31), 31);
        String str = this.audioRecordingHoldToRecordText;
        int iM79497a5 = AbstractC26725a.m79497a(this.audioRecordingHoldToRecordBackgroundDrawable, AbstractC26725a.m79499c(this.audioRecordingHoldToRecordTextStyle, (iM30448b + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        Integer num5 = this.audioRecordingHoldToRecordBackgroundDrawableTint;
        int iM79497a6 = AbstractC26725a.m79497a(this.audioRecordingSlideToCancelStartDrawable, AbstractC26725a.m79499c(this.audioRecordingSlideToCancelTextStyle, AbstractC11266d.m30450d((iM79497a5 + (num5 == null ? 0 : num5.hashCode())) * 31, 31, this.audioRecordingSlideToCancelText), 31), 31);
        Integer num6 = this.audioRecordingSlideToCancelStartDrawableTint;
        int iM79497a7 = AbstractC26725a.m79497a(this.audioRecordingFloatingButtonIconDrawable, (iM79497a6 + (num6 == null ? 0 : num6.hashCode())) * 31, 31);
        Integer num7 = this.audioRecordingFloatingButtonIconDrawableTint;
        int iM79497a8 = AbstractC26725a.m79497a(this.audioRecordingFloatingButtonBackgroundDrawable, (iM79497a7 + (num7 == null ? 0 : num7.hashCode())) * 31, 31);
        Integer num8 = this.audioRecordingFloatingButtonBackgroundDrawableTint;
        int iM79497a9 = AbstractC26725a.m79497a(this.audioRecordingFloatingLockIconDrawable, (iM79497a8 + (num8 == null ? 0 : num8.hashCode())) * 31, 31);
        Integer num9 = this.audioRecordingFloatingLockIconDrawableTint;
        int iM79497a10 = AbstractC26725a.m79497a(this.audioRecordingFloatingLockedIconDrawable, (iM79497a9 + (num9 == null ? 0 : num9.hashCode())) * 31, 31);
        Integer num10 = this.audioRecordingFloatingLockedIconDrawableTint;
        int iHashCode2 = (iM79497a10 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.audioRecordingWaveformColor;
        int iM79497a11 = AbstractC26725a.m79497a(this.attachmentsButtonIconDrawable, AbstractC2875y.m8289b((iHashCode2 + (num11 == null ? 0 : num11.hashCode())) * 31, 31, this.attachmentsButtonVisible), 31);
        ColorStateList colorStateList = this.attachmentsButtonIconTintList;
        int iHashCode3 = (iM79497a11 + (colorStateList == null ? 0 : colorStateList.hashCode())) * 31;
        Integer num12 = this.attachmentsButtonRippleColor;
        int iM79497a12 = AbstractC26725a.m79497a(this.commandsButtonIconDrawable, AbstractC2875y.m8289b((iHashCode3 + (num12 == null ? 0 : num12.hashCode())) * 31, 31, this.commandsButtonVisible), 31);
        ColorStateList colorStateList2 = this.commandsButtonIconTintList;
        int iHashCode4 = (iM79497a12 + (colorStateList2 == null ? 0 : colorStateList2.hashCode())) * 31;
        Integer num13 = this.commandsButtonRippleColor;
        int iM8289b = AbstractC2875y.m8289b((iHashCode4 + (num13 == null ? 0 : num13.hashCode())) * 31, 31, this.alsoSendToChannelCheckboxVisible);
        Drawable drawable2 = this.alsoSendToChannelCheckboxDrawable;
        int iM79497a13 = AbstractC26725a.m79497a(this.sendMessageButtonIconDrawable, AbstractC2875y.m8289b(AbstractC26725a.m79497a(this.dismissModeIconDrawable, AbstractC26725a.m79497a(this.replyModeIconDrawable, AbstractC11266d.m30450d(AbstractC26725a.m79497a(this.editModeIconDrawable, AbstractC11266d.m30450d(AbstractC26725a.m79499c(this.alsoSendToChannelCheckboxTextStyle, AbstractC11266d.m30450d((iM8289b + (drawable2 == null ? 0 : drawable2.hashCode())) * 31, 31, this.alsoSendToChannelCheckboxText), 31), 31, this.editModeText), 31), 31, this.replyModeText), 31), 31), 31, this.sendMessageButtonEnabled), 31);
        ColorStateList colorStateList3 = this.sendMessageButtonIconTintList;
        int iM79497a14 = AbstractC26725a.m79497a(this.audioRecordingButtonIconDrawable, AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.sendMessageButtonPadding, AbstractC11266d.m30448b(this.sendMessageButtonHeight, AbstractC11266d.m30448b(this.sendMessageButtonWidth, (iM79497a13 + (colorStateList3 == null ? 0 : colorStateList3.hashCode())) * 31, 31), 31), 31), 31, this.audioRecordingButtonVisible), 31, this.audioRecordingButtonEnabled), 31, this.audioRecordingButtonPreferred), 31, this.audioRecordingSendOnComplete), 31);
        ColorStateList colorStateList4 = this.audioRecordingButtonIconTintList;
        int iHashCode5 = (this.attachmentsPickerDialogStyle.hashCode() + AbstractC11266d.m30447a(this.messageReplyMessageBackgroundStrokeWidthTheirs, AbstractC11266d.m30448b(this.messageReplyMessageBackgroundStrokeColorTheirs, AbstractC26725a.m79499c(this.messageReplyTextStyleTheirs, AbstractC11266d.m30447a(this.messageReplyMessageBackgroundStrokeWidthMine, AbstractC11266d.m30448b(this.messageReplyMessageBackgroundStrokeColorMine, AbstractC26725a.m79499c(this.messageReplyTextStyleMine, AbstractC11266d.m30448b(this.messageReplyBackgroundColor, AbstractC2875y.m8289b(AbstractC26725a.m79497a(this.cooldownTimerBackgroundDrawable, AbstractC26725a.m79499c(this.cooldownTimerTextStyle, AbstractC11266d.m30448b(this.audioRecordingButtonPadding, AbstractC11266d.m30448b(this.audioRecordingButtonHeight, AbstractC11266d.m30448b(this.audioRecordingButtonWidth, (iM79497a14 + (colorStateList4 == null ? 0 : colorStateList4.hashCode())) * 31, 31), 31), 31), 31), 31), 31, this.messageReplyShowUserAvatar), 31), 31), 31), 31), 31), 31), 31)) * 31;
        AudioRecordPlayerViewStyle audioRecordPlayerViewStyle = this.audioRecordPlayerViewStyle;
        return iHashCode5 + (audioRecordPlayerViewStyle != null ? audioRecordPlayerViewStyle.hashCode() : 0);
    }

    public final MessageReplyStyle toMessageReplyStyle() {
        boolean z4 = this.messageReplyShowUserAvatar;
        int i13 = this.messageReplyBackgroundColor;
        TextStyle textStyle = this.messageReplyTextStyleMine;
        TextStyle textStyle2 = this.messageReplyTextStyleTheirs;
        return new MessageReplyStyle(z4, i13, i13, i13, i13, textStyle, textStyle2, textStyle, textStyle2, this.messageReplyMessageBackgroundStrokeColorMine, this.messageReplyMessageBackgroundStrokeWidthMine, this.messageReplyMessageBackgroundStrokeColorTheirs, this.messageReplyMessageBackgroundStrokeWidthTheirs);
    }

    public final String toString() {
        int i13 = this.backgroundColor;
        Drawable drawable = this.dividerBackgroundDrawable;
        String str = this.commandSuggestionsTitleText;
        TextStyle textStyle = this.commandSuggestionsTitleTextStyle;
        Drawable drawable2 = this.commandSuggestionsTitleIconDrawable;
        Integer num = this.commandSuggestionsTitleIconDrawableTintColor;
        int i14 = this.commandSuggestionsBackgroundColor;
        TextStyle textStyle2 = this.commandSuggestionItemCommandNameTextStyle;
        String str2 = this.commandSuggestionItemCommandDescriptionText;
        TextStyle textStyle3 = this.commandSuggestionItemCommandDescriptionTextStyle;
        int i15 = this.mentionSuggestionsBackgroundColor;
        Drawable drawable3 = this.mentionSuggestionItemIconDrawable;
        Integer num2 = this.mentionSuggestionItemIconDrawableTintColor;
        TextStyle textStyle4 = this.mentionSuggestionItemUsernameTextStyle;
        String str3 = this.mentionSuggestionItemMentionText;
        TextStyle textStyle5 = this.mentionSuggestionItemMentionTextStyle;
        boolean z4 = this.messageInputCommandsHandlingEnabled;
        boolean z13 = this.messageInputMentionsHandlingEnabled;
        TextStyle textStyle6 = this.messageInputTextStyle;
        Drawable drawable4 = this.messageInputBackgroundDrawable;
        Drawable drawable5 = this.messageInputCursorDrawable;
        boolean z14 = this.messageInputScrollbarEnabled;
        boolean z15 = this.messageInputScrollbarFadingEnabled;
        int i16 = this.messageInputMaxLines;
        String str4 = this.messageInputCannotSendHintText;
        int i17 = this.messageInputInputType;
        boolean z16 = this.messageInputShowReplyView;
        Drawable drawable6 = this.messageInputVideoAttachmentIconDrawable;
        Integer num3 = this.messageInputVideoAttachmentIconDrawableTint;
        Integer num4 = this.messageInputVideoAttachmentIconBackgroundColor;
        float f13 = this.messageInputVideoAttachmentIconCornerRadius;
        float f14 = this.messageInputVideoAttachmentIconElevation;
        int i18 = this.messageInputVideoAttachmentIconDrawablePaddingTop;
        int i19 = this.messageInputVideoAttachmentIconDrawablePaddingBottom;
        int i24 = this.messageInputVideoAttachmentIconDrawablePaddingStart;
        int i25 = this.messageInputVideoAttachmentIconDrawablePaddingEnd;
        String str5 = this.audioRecordingHoldToRecordText;
        TextStyle textStyle7 = this.audioRecordingHoldToRecordTextStyle;
        Drawable drawable7 = this.audioRecordingHoldToRecordBackgroundDrawable;
        Integer num5 = this.audioRecordingHoldToRecordBackgroundDrawableTint;
        String str6 = this.audioRecordingSlideToCancelText;
        TextStyle textStyle8 = this.audioRecordingSlideToCancelTextStyle;
        Drawable drawable8 = this.audioRecordingSlideToCancelStartDrawable;
        Integer num6 = this.audioRecordingSlideToCancelStartDrawableTint;
        Drawable drawable9 = this.audioRecordingFloatingButtonIconDrawable;
        Integer num7 = this.audioRecordingFloatingButtonIconDrawableTint;
        Drawable drawable10 = this.audioRecordingFloatingButtonBackgroundDrawable;
        Integer num8 = this.audioRecordingFloatingButtonBackgroundDrawableTint;
        Drawable drawable11 = this.audioRecordingFloatingLockIconDrawable;
        Integer num9 = this.audioRecordingFloatingLockIconDrawableTint;
        Drawable drawable12 = this.audioRecordingFloatingLockedIconDrawable;
        Integer num10 = this.audioRecordingFloatingLockedIconDrawableTint;
        Integer num11 = this.audioRecordingWaveformColor;
        boolean z17 = this.attachmentsButtonVisible;
        Drawable drawable13 = this.attachmentsButtonIconDrawable;
        ColorStateList colorStateList = this.attachmentsButtonIconTintList;
        Integer num12 = this.attachmentsButtonRippleColor;
        boolean z18 = this.commandsButtonVisible;
        Drawable drawable14 = this.commandsButtonIconDrawable;
        ColorStateList colorStateList2 = this.commandsButtonIconTintList;
        Integer num13 = this.commandsButtonRippleColor;
        boolean z19 = this.alsoSendToChannelCheckboxVisible;
        Drawable drawable15 = this.alsoSendToChannelCheckboxDrawable;
        String str7 = this.alsoSendToChannelCheckboxText;
        TextStyle textStyle9 = this.alsoSendToChannelCheckboxTextStyle;
        String str8 = this.editModeText;
        Drawable drawable16 = this.editModeIconDrawable;
        String str9 = this.replyModeText;
        Drawable drawable17 = this.replyModeIconDrawable;
        Drawable drawable18 = this.dismissModeIconDrawable;
        boolean z24 = this.sendMessageButtonEnabled;
        Drawable drawable19 = this.sendMessageButtonIconDrawable;
        ColorStateList colorStateList3 = this.sendMessageButtonIconTintList;
        int i26 = this.sendMessageButtonWidth;
        int i27 = this.sendMessageButtonHeight;
        int i28 = this.sendMessageButtonPadding;
        boolean z25 = this.audioRecordingButtonVisible;
        boolean z26 = this.audioRecordingButtonEnabled;
        boolean z27 = this.audioRecordingButtonPreferred;
        boolean z28 = this.audioRecordingSendOnComplete;
        Drawable drawable20 = this.audioRecordingButtonIconDrawable;
        ColorStateList colorStateList4 = this.audioRecordingButtonIconTintList;
        int i29 = this.audioRecordingButtonWidth;
        int i34 = this.audioRecordingButtonHeight;
        int i35 = this.audioRecordingButtonPadding;
        TextStyle textStyle10 = this.cooldownTimerTextStyle;
        Drawable drawable21 = this.cooldownTimerBackgroundDrawable;
        boolean z29 = this.messageReplyShowUserAvatar;
        int i36 = this.messageReplyBackgroundColor;
        TextStyle textStyle11 = this.messageReplyTextStyleMine;
        int i37 = this.messageReplyMessageBackgroundStrokeColorMine;
        float f15 = this.messageReplyMessageBackgroundStrokeWidthMine;
        TextStyle textStyle12 = this.messageReplyTextStyleTheirs;
        int i38 = this.messageReplyMessageBackgroundStrokeColorTheirs;
        float f16 = this.messageReplyMessageBackgroundStrokeWidthTheirs;
        AttachmentsPickerDialogStyle attachmentsPickerDialogStyle = this.attachmentsPickerDialogStyle;
        AudioRecordPlayerViewStyle audioRecordPlayerViewStyle = this.audioRecordPlayerViewStyle;
        StringBuilder sb4 = new StringBuilder("MessageComposerViewStyle(backgroundColor=");
        sb4.append(i13);
        sb4.append(", dividerBackgroundDrawable=");
        sb4.append(drawable);
        sb4.append(", commandSuggestionsTitleText=");
        sb4.append(str);
        sb4.append(", commandSuggestionsTitleTextStyle=");
        sb4.append(textStyle);
        sb4.append(", commandSuggestionsTitleIconDrawable=");
        sb4.append(drawable2);
        sb4.append(", commandSuggestionsTitleIconDrawableTintColor=");
        sb4.append(num);
        sb4.append(", commandSuggestionsBackgroundColor=");
        sb4.append(i14);
        sb4.append(", commandSuggestionItemCommandNameTextStyle=");
        sb4.append(textStyle2);
        sb4.append(", commandSuggestionItemCommandDescriptionText=");
        sb4.append(str2);
        sb4.append(", commandSuggestionItemCommandDescriptionTextStyle=");
        sb4.append(textStyle3);
        sb4.append(", mentionSuggestionsBackgroundColor=");
        sb4.append(i15);
        sb4.append(", mentionSuggestionItemIconDrawable=");
        sb4.append(drawable3);
        sb4.append(", mentionSuggestionItemIconDrawableTintColor=");
        sb4.append(num2);
        sb4.append(", mentionSuggestionItemUsernameTextStyle=");
        sb4.append(textStyle4);
        sb4.append(", mentionSuggestionItemMentionText=");
        sb4.append(str3);
        sb4.append(", mentionSuggestionItemMentionTextStyle=");
        sb4.append(textStyle5);
        sb4.append(", messageInputCommandsHandlingEnabled=");
        AbstractC38963t7.m124392v(sb4, z4, ", messageInputMentionsHandlingEnabled=", z13, ", messageInputTextStyle=");
        sb4.append(textStyle6);
        sb4.append(", messageInputBackgroundDrawable=");
        sb4.append(drawable4);
        sb4.append(", messageInputCursorDrawable=");
        sb4.append(drawable5);
        sb4.append(", messageInputScrollbarEnabled=");
        sb4.append(z14);
        sb4.append(", messageInputScrollbarFadingEnabled=");
        AbstractC30802r.m94769r(i16, ", messageInputMaxLines=", ", messageInputCannotSendHintText=", sb4, z15);
        AbstractC11266d.m30470x(i17, str4, ", messageInputInputType=", ", messageInputShowReplyView=", sb4);
        sb4.append(z16);
        sb4.append(", messageInputVideoAttachmentIconDrawable=");
        sb4.append(drawable6);
        sb4.append(", messageInputVideoAttachmentIconDrawableTint=");
        AbstractC31061c.m95621A(sb4, num3, ", messageInputVideoAttachmentIconBackgroundColor=", num4, ", messageInputVideoAttachmentIconCornerRadius=");
        AbstractC30802r.m94772u(sb4, f13, ", messageInputVideoAttachmentIconElevation=", f14, ", messageInputVideoAttachmentIconDrawablePaddingTop=");
        AbstractC30802r.m94773v(sb4, i18, ", messageInputVideoAttachmentIconDrawablePaddingBottom=", i19, ", messageInputVideoAttachmentIconDrawablePaddingStart=");
        AbstractC30802r.m94773v(sb4, i24, ", messageInputVideoAttachmentIconDrawablePaddingEnd=", i25, ", audioRecordingHoldToRecordText=");
        sb4.append(str5);
        sb4.append(", audioRecordingHoldToRecordTextStyle=");
        sb4.append(textStyle7);
        sb4.append(", audioRecordingHoldToRecordBackgroundDrawable=");
        sb4.append(drawable7);
        sb4.append(", audioRecordingHoldToRecordBackgroundDrawableTint=");
        sb4.append(num5);
        sb4.append(", audioRecordingSlideToCancelText=");
        sb4.append(str6);
        sb4.append(", audioRecordingSlideToCancelTextStyle=");
        sb4.append(textStyle8);
        sb4.append(", audioRecordingSlideToCancelStartDrawable=");
        sb4.append(drawable8);
        sb4.append(", audioRecordingSlideToCancelStartDrawableTint=");
        sb4.append(num6);
        sb4.append(", audioRecordingFloatingButtonIconDrawable=");
        sb4.append(drawable9);
        sb4.append(", audioRecordingFloatingButtonIconDrawableTint=");
        sb4.append(num7);
        sb4.append(", audioRecordingFloatingButtonBackgroundDrawable=");
        sb4.append(drawable10);
        sb4.append(", audioRecordingFloatingButtonBackgroundDrawableTint=");
        sb4.append(num8);
        sb4.append(", audioRecordingFloatingLockIconDrawable=");
        sb4.append(drawable11);
        sb4.append(", audioRecordingFloatingLockIconDrawableTint=");
        sb4.append(num9);
        sb4.append(", audioRecordingFloatingLockedIconDrawable=");
        sb4.append(drawable12);
        sb4.append(", audioRecordingFloatingLockedIconDrawableTint=");
        sb4.append(num10);
        sb4.append(", audioRecordingWaveformColor=");
        sb4.append(num11);
        sb4.append(", attachmentsButtonVisible=");
        sb4.append(z17);
        sb4.append(", attachmentsButtonIconDrawable=");
        sb4.append(drawable13);
        sb4.append(", attachmentsButtonIconTintList=");
        sb4.append(colorStateList);
        sb4.append(", attachmentsButtonRippleColor=");
        sb4.append(num12);
        sb4.append(", commandsButtonVisible=");
        sb4.append(z18);
        sb4.append(", commandsButtonIconDrawable=");
        sb4.append(drawable14);
        sb4.append(", commandsButtonIconTintList=");
        sb4.append(colorStateList2);
        sb4.append(", commandsButtonRippleColor=");
        sb4.append(num13);
        sb4.append(", alsoSendToChannelCheckboxVisible=");
        sb4.append(z19);
        sb4.append(", alsoSendToChannelCheckboxDrawable=");
        sb4.append(drawable15);
        sb4.append(", alsoSendToChannelCheckboxText=");
        sb4.append(str7);
        sb4.append(", alsoSendToChannelCheckboxTextStyle=");
        sb4.append(textStyle9);
        sb4.append(", editModeText=");
        sb4.append(str8);
        sb4.append(", editModeIconDrawable=");
        sb4.append(drawable16);
        sb4.append(", replyModeText=");
        sb4.append(str9);
        sb4.append(", replyModeIconDrawable=");
        sb4.append(drawable17);
        sb4.append(", dismissModeIconDrawable=");
        sb4.append(drawable18);
        sb4.append(", sendMessageButtonEnabled=");
        sb4.append(z24);
        sb4.append(", sendMessageButtonIconDrawable=");
        sb4.append(drawable19);
        sb4.append(", sendMessageButtonIconTintList=");
        sb4.append(colorStateList3);
        sb4.append(", sendMessageButtonWidth=");
        sb4.append(i26);
        sb4.append(", sendMessageButtonHeight=");
        AbstractC30802r.m94773v(sb4, i27, ", sendMessageButtonPadding=", i28, ", audioRecordingButtonVisible=");
        AbstractC38963t7.m124392v(sb4, z25, ", audioRecordingButtonEnabled=", z26, ", audioRecordingButtonPreferred=");
        AbstractC38963t7.m124392v(sb4, z27, ", audioRecordingSendOnComplete=", z28, ", audioRecordingButtonIconDrawable=");
        sb4.append(drawable20);
        sb4.append(", audioRecordingButtonIconTintList=");
        sb4.append(colorStateList4);
        sb4.append(", audioRecordingButtonWidth=");
        AbstractC30802r.m94773v(sb4, i29, ", audioRecordingButtonHeight=", i34, ", audioRecordingButtonPadding=");
        sb4.append(i35);
        sb4.append(", cooldownTimerTextStyle=");
        sb4.append(textStyle10);
        sb4.append(", cooldownTimerBackgroundDrawable=");
        sb4.append(drawable21);
        sb4.append(", messageReplyShowUserAvatar=");
        sb4.append(z29);
        sb4.append(", messageReplyBackgroundColor=");
        sb4.append(i36);
        sb4.append(", messageReplyTextStyleMine=");
        sb4.append(textStyle11);
        sb4.append(", messageReplyMessageBackgroundStrokeColorMine=");
        sb4.append(i37);
        sb4.append(", messageReplyMessageBackgroundStrokeWidthMine=");
        sb4.append(f15);
        sb4.append(", messageReplyTextStyleTheirs=");
        sb4.append(textStyle12);
        sb4.append(", messageReplyMessageBackgroundStrokeColorTheirs=");
        sb4.append(i38);
        sb4.append(", messageReplyMessageBackgroundStrokeWidthTheirs=");
        sb4.append(f16);
        sb4.append(", attachmentsPickerDialogStyle=");
        sb4.append(attachmentsPickerDialogStyle);
        sb4.append(", audioRecordPlayerViewStyle=");
        sb4.append(audioRecordPlayerViewStyle);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ MessageComposerViewStyle(int i13, Drawable drawable, String str, TextStyle textStyle, Drawable drawable2, Integer num, int i14, TextStyle textStyle2, String str2, TextStyle textStyle3, int i15, Drawable drawable3, Integer num2, TextStyle textStyle4, String str3, TextStyle textStyle5, boolean z4, boolean z13, TextStyle textStyle6, Drawable drawable4, Drawable drawable5, boolean z14, boolean z15, int i16, String str4, int i17, boolean z16, Drawable drawable6, Integer num3, Integer num4, float f13, float f14, int i18, int i19, int i24, int i25, String str5, TextStyle textStyle7, Drawable drawable7, Integer num5, String str6, TextStyle textStyle8, Drawable drawable8, Integer num6, Drawable drawable9, Integer num7, Drawable drawable10, Integer num8, Drawable drawable11, Integer num9, Drawable drawable12, Integer num10, Integer num11, boolean z17, Drawable drawable13, ColorStateList colorStateList, Integer num12, boolean z18, Drawable drawable14, ColorStateList colorStateList2, Integer num13, boolean z19, Drawable drawable15, String str7, TextStyle textStyle9, String str8, Drawable drawable16, String str9, Drawable drawable17, Drawable drawable18, boolean z24, Drawable drawable19, ColorStateList colorStateList3, int i26, int i27, int i28, boolean z25, boolean z26, boolean z27, boolean z28, Drawable drawable20, ColorStateList colorStateList4, int i29, int i34, int i35, TextStyle textStyle10, Drawable drawable21, boolean z29, int i36, TextStyle textStyle11, int i37, float f15, TextStyle textStyle12, int i38, float f16, AttachmentsPickerDialogStyle attachmentsPickerDialogStyle, AudioRecordPlayerViewStyle audioRecordPlayerViewStyle, int i39, int i44, int i45, int i46, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, drawable, str, textStyle, drawable2, num, i14, textStyle2, str2, textStyle3, i15, drawable3, num2, textStyle4, str3, textStyle5, z4, z13, textStyle6, drawable4, drawable5, z14, z15, i16, str4, i17, z16, drawable6, num3, num4, f13, f14, i18, i19, i24, i25, str5, textStyle7, drawable7, num5, str6, textStyle8, drawable8, num6, drawable9, num7, drawable10, num8, drawable11, num9, drawable12, num10, num11, z17, drawable13, colorStateList, num12, z18, drawable14, colorStateList2, num13, z19, drawable15, str7, textStyle9, str8, drawable16, str9, drawable17, drawable18, z24, drawable19, colorStateList3, i26, i27, i28, z25, z26, z27, z28, drawable20, colorStateList4, i29, i34, i35, textStyle10, drawable21, (i45 & 8388608) != 0 ? true : z29, i36, textStyle11, i37, f15, textStyle12, i38, f16, attachmentsPickerDialogStyle, audioRecordPlayerViewStyle);
    }
}
