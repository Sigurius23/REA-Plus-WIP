package io.getstream.chat.android.p226ui.feature.messages.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.profileinstaller.ProfileVerifier;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.feature.messages.list.background.ShapeAppearanceModelFactory;
import io.getstream.chat.android.p226ui.font.TextStyle;
import io.getstream.chat.android.p226ui.helper.TransformStyle;
import io.getstream.chat.android.p226ui.helper.ViewPadding;
import io.getstream.chat.android.p226ui.helper.ViewSize;
import io.getstream.chat.android.p226ui.helper.ViewStyle;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.DrawableKt;
import io.getstream.chat.android.p226ui.utils.extensions.TypedArrayKt;
import kr.C22788g;
import live.hms.video.utils.AndroidSDKConstants;
import live.hms.video.utils.HMSConstantsKt;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\bj\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u0093\u00012\u00020\u0001:\u0002\u0093\u0001Bé\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\b\u0001\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0017\u001a\u00020\n\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010!\u001a\u00020\u0003\u0012\b\b\u0001\u0010\"\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020$\u0012\b\b\u0001\u0010%\u001a\u00020\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010'\u001a\u00020\u001a\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010*\u001a\u00020\n\u0012\b\b\u0001\u0010+\u001a\u00020\u0003¢\u0006\u0004\b,\u0010-J\t\u0010g\u001a\u00020\u0003HÆ\u0003J\t\u0010h\u001a\u00020\u0005HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00105J\t\u0010k\u001a\u00020\nHÆ\u0003J\t\u0010l\u001a\u00020\nHÆ\u0003J\t\u0010m\u001a\u00020\u0005HÆ\u0003J\t\u0010n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010p\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00105J\u000b\u0010q\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00105J\t\u0010s\u001a\u00020\nHÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010u\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00105J\u000b\u0010v\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010w\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00105J\t\u0010x\u001a\u00020\nHÆ\u0003J\t\u0010y\u001a\u00020\u0003HÆ\u0003J\t\u0010z\u001a\u00020\u001aHÆ\u0003J\t\u0010{\u001a\u00020\u0003HÆ\u0003J\t\u0010|\u001a\u00020\u0003HÆ\u0003J\t\u0010}\u001a\u00020\u0003HÆ\u0003J\t\u0010~\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00105J\n\u0010\u0081\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020$HÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\u001aHÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00105J\n\u0010\u0089\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0003HÆ\u0003J\u0096\u0003\u0010\u008b\u0001\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0003\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0012\u001a\u00020\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0003\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0003\u0010\u001b\u001a\u00020\u00032\b\b\u0003\u0010\u001c\u001a\u00020\u00032\b\b\u0003\u0010\u001d\u001a\u00020\u00032\b\b\u0003\u0010\u001e\u001a\u00020\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010!\u001a\u00020\u00032\b\b\u0003\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0003\u0010%\u001a\u00020\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010'\u001a\u00020\u001a2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010)\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010*\u001a\u00020\n2\b\b\u0003\u0010+\u001a\u00020\u0003HÆ\u0001¢\u0006\u0003\u0010\u008c\u0001J\u0016\u0010\u008d\u0001\u001a\u00020$2\n\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008f\u0001HÖ\u0003J\n\u0010\u0090\u0001\u001a\u00020\u0003HÖ\u0001J\u000b\u0010\u0091\u0001\u001a\u00030\u0092\u0001HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00106\u001a\u0004\b4\u00105R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b9\u00108R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u00101R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010/R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b<\u00103R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00106\u001a\u0004\b=\u00105R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b>\u00103R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00106\u001a\u0004\b?\u00105R\u0011\u0010\u0012\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b@\u00108R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bA\u00103R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00106\u001a\u0004\bB\u00105R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bC\u00103R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00106\u001a\u0004\bD\u00105R\u0011\u0010\u0017\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bE\u00108R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010/R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u0010/R\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010/R\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u0010/R\u0011\u0010\u001e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bL\u0010/R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bM\u00103R\u0015\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00106\u001a\u0004\bN\u00105R\u0011\u0010!\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u0010/R\u0011\u0010\"\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bP\u0010/R\u0011\u0010#\u001a\u00020$¢\u0006\b\n\u0000\u001a\u0004\b#\u0010QR\u0011\u0010%\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bR\u0010/R\u0013\u0010&\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bS\u00103R\u0011\u0010'\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\bT\u0010HR\u0013\u0010(\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bU\u00103R\u0015\u0010)\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00106\u001a\u0004\bV\u00105R\u0011\u0010*\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bW\u00108R\u0011\u0010+\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bX\u0010/R\u0013\u0010Y\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\bZ\u00103R\u0013\u0010[\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\\\u00103R\u0013\u0010]\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b^\u00103R\u0013\u0010_\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b`\u00103R\u0013\u0010a\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\bb\u00103R\u0013\u0010c\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\bd\u00103R\u0013\u0010e\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\bf\u00103¨\u0006\u0094\u0001"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;", "Lio/getstream/chat/android/ui/helper/ViewStyle;", "height", "", "padding", "Lio/getstream/chat/android/ui/helper/ViewPadding;", "backgroundDrawable", "Landroid/graphics/drawable/Drawable;", "backgroundDrawableTint", "playbackProgressContainerSize", "Lio/getstream/chat/android/ui/helper/ViewSize;", "playbackButtonSize", "playbackButtonPadding", "playbackButtonElevation", "playbackButtonBackground", "playbackButtonBackgroundTint", "progressBarDrawable", "progressBarDrawableTint", "progressBarSize", "playIconDrawable", "playIconDrawableTint", "pauseIconDrawable", "pauseIconDrawableTint", "durationTextViewSize", "durationTextMarginStart", "durationTextStyle", "Lio/getstream/chat/android/ui/font/TextStyle;", "waveBarHeight", "waveBarMarginStart", "waveBarColorPlayed", "waveBarColorFuture", "scrubberDrawable", "scrubberDrawableTint", "scrubberWidthDefault", "scrubberWidthPressed", "isFileIconContainerVisible", "", "fileIconContainerWidth", "audioFileIconDrawable", "speedButtonTextStyle", "speedButtonBackground", "speedButtonBackgroundTint", "speedButtonSize", "speedButtonElevation", "<init>", "(ILio/getstream/chat/android/ui/helper/ViewPadding;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Lio/getstream/chat/android/ui/helper/ViewSize;Lio/getstream/chat/android/ui/helper/ViewSize;Lio/getstream/chat/android/ui/helper/ViewPadding;ILandroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Lio/getstream/chat/android/ui/helper/ViewSize;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Lio/getstream/chat/android/ui/helper/ViewSize;ILio/getstream/chat/android/ui/font/TextStyle;IIIILandroid/graphics/drawable/Drawable;Ljava/lang/Integer;IIZILandroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Lio/getstream/chat/android/ui/helper/ViewSize;I)V", "getHeight", "()I", "getPadding", "()Lio/getstream/chat/android/ui/helper/ViewPadding;", "getBackgroundDrawable", "()Landroid/graphics/drawable/Drawable;", "getBackgroundDrawableTint", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPlaybackProgressContainerSize", "()Lio/getstream/chat/android/ui/helper/ViewSize;", "getPlaybackButtonSize", "getPlaybackButtonPadding", "getPlaybackButtonElevation", "getPlaybackButtonBackground", "getPlaybackButtonBackgroundTint", "getProgressBarDrawable", "getProgressBarDrawableTint", "getProgressBarSize", "getPlayIconDrawable", "getPlayIconDrawableTint", "getPauseIconDrawable", "getPauseIconDrawableTint", "getDurationTextViewSize", "getDurationTextMarginStart", "getDurationTextStyle", "()Lio/getstream/chat/android/ui/font/TextStyle;", "getWaveBarHeight", "getWaveBarMarginStart", "getWaveBarColorPlayed", "getWaveBarColorFuture", "getScrubberDrawable", "getScrubberDrawableTint", "getScrubberWidthDefault", "getScrubberWidthPressed", "()Z", "getFileIconContainerWidth", "getAudioFileIconDrawable", "getSpeedButtonTextStyle", "getSpeedButtonBackground", "getSpeedButtonBackgroundTint", "getSpeedButtonSize", "getSpeedButtonElevation", "tintedBackgroundDrawable", "getTintedBackgroundDrawable", "tintedPlaybackButtonBackground", "getTintedPlaybackButtonBackground", "tintedProgressBarDrawable", "getTintedProgressBarDrawable", "tintedPlayIconDrawable", "getTintedPlayIconDrawable", "tintedPauseIconDrawable", "getTintedPauseIconDrawable", "tintedScrubberDrawable", "getTintedScrubberDrawable", "tintedSpeedButtonBackground", "getTintedSpeedButtonBackground", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "copy", "(ILio/getstream/chat/android/ui/helper/ViewPadding;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Lio/getstream/chat/android/ui/helper/ViewSize;Lio/getstream/chat/android/ui/helper/ViewSize;Lio/getstream/chat/android/ui/helper/ViewPadding;ILandroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Lio/getstream/chat/android/ui/helper/ViewSize;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Lio/getstream/chat/android/ui/helper/ViewSize;ILio/getstream/chat/android/ui/font/TextStyle;IIIILandroid/graphics/drawable/Drawable;Ljava/lang/Integer;IIZILandroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Lio/getstream/chat/android/ui/helper/ViewSize;I)Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;", "equals", "other", "", "hashCode", "toString", "", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class AudioRecordPlayerViewStyle implements ViewStyle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final Drawable audioFileIconDrawable;
    private final Drawable backgroundDrawable;
    private final Integer backgroundDrawableTint;
    private final int durationTextMarginStart;
    private final TextStyle durationTextStyle;
    private final ViewSize durationTextViewSize;
    private final int fileIconContainerWidth;
    private final int height;
    private final boolean isFileIconContainerVisible;
    private final ViewPadding padding;
    private final Drawable pauseIconDrawable;
    private final Integer pauseIconDrawableTint;
    private final Drawable playIconDrawable;
    private final Integer playIconDrawableTint;
    private final Drawable playbackButtonBackground;
    private final Integer playbackButtonBackgroundTint;
    private final int playbackButtonElevation;
    private final ViewPadding playbackButtonPadding;
    private final ViewSize playbackButtonSize;
    private final ViewSize playbackProgressContainerSize;
    private final Drawable progressBarDrawable;
    private final Integer progressBarDrawableTint;
    private final ViewSize progressBarSize;
    private final Drawable scrubberDrawable;
    private final Integer scrubberDrawableTint;
    private final int scrubberWidthDefault;
    private final int scrubberWidthPressed;
    private final Drawable speedButtonBackground;
    private final Integer speedButtonBackgroundTint;
    private final int speedButtonElevation;
    private final ViewSize speedButtonSize;
    private final TextStyle speedButtonTextStyle;
    private final int waveBarColorFuture;
    private final int waveBarColorPlayed;
    private final int waveBarHeight;
    private final int waveBarMarginStart;

    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0080\u0002¢\u0006\u0002\b\nJ\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0080\u0002¢\u0006\u0002\b\nJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\u000e"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle$Companion;", "", "<init>", "()V", "invoke", "Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "invoke$stream_chat_android_ui_components_release", "attributes", "Landroid/content/res/TypedArray;", HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY, "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: renamed from: default, reason: not valid java name */
        public final AudioRecordPlayerViewStyle m134227default(Context context) {
            AbstractC22676k.m65750j(context, "context");
            int dimension = ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_height);
            int dimension2 = ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_padding_start);
            int dimension3 = ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_padding_top);
            int dimension4 = ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_padding_end);
            int dimension5 = ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_padding_bottom);
            C22788g c22788gAudioBackground = ShapeAppearanceModelFactory.INSTANCE.audioBackground(context);
            int dimension6 = ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_playback_progress_container_width);
            int dimension7 = ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_playback_progress_container_height);
            int dimension8 = ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_playback_button_width);
            int dimension9 = ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_playback_button_height);
            int dimension10 = ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_playback_button_elevation);
            int dimension11 = ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_playback_button_padding);
            Drawable drawable = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_white_shape_circular);
            Drawable drawable2 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_play);
            Drawable drawable3 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_pause);
            Drawable drawable4 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_rotating_indeterminate_progress_gradient);
            int dimension12 = ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_progress_bar_width);
            int dimension13 = ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_progress_bar_height);
            int dimension14 = ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_duration_text_view_width);
            int dimension15 = ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_duration_text_view_height);
            int dimension16 = ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_duration_text_view_margin_start);
            TextStyle textStyle = new TextStyle(0, null, 0, ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_duration_text_size), AbstractC32122c.getColor(context, C19469R.color.stream_ui_audio_record_player_duration_text_color), null, 0, null, 231, null);
            int dimension17 = ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_wave_bar_height);
            int dimension18 = ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_wave_bar_margin_start);
            int color = AbstractC32122c.getColor(context, C19469R.color.stream_ui_accent_blue);
            int color2 = AbstractC32122c.getColor(context, C19469R.color.stream_ui_grey);
            int dimension19 = ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_scrubber_width_default);
            int dimension20 = ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_scrubber_width_pressed);
            Drawable drawable5 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_share_rectangle);
            int dimension21 = ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_file_icon_container_width);
            boolean z4 = context.getResources().getBoolean(C19469R.bool.stream_ui_audio_record_player_file_icon_container_visible);
            Drawable drawable6 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_file_aac);
            int dimension22 = ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_speed_button_width);
            int dimension23 = ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_speed_button_height);
            int dimension24 = ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_speed_button_elevation);
            Drawable drawable7 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_literal_white_shape_16dp_corners);
            return new AudioRecordPlayerViewStyle(dimension, new ViewPadding(dimension2, dimension3, dimension4, dimension5), c22788gAudioBackground, null, new ViewSize(dimension6, dimension7), new ViewSize(dimension8, dimension9), new ViewPadding(dimension11, dimension11, dimension11, dimension11), dimension10, drawable, null, drawable4, null, new ViewSize(dimension12, dimension13), drawable2, null, drawable3, null, new ViewSize(dimension14, dimension15), dimension16, textStyle, dimension17, dimension18, color, color2, drawable5, null, dimension19, dimension20, z4, dimension21, drawable6, new TextStyle(0, null, 0, ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_speed_text_size), AbstractC32122c.getColor(context, C19469R.color.stream_ui_audio_record_player_speed_text_color), null, 0, null, 231, null), drawable7, null, new ViewSize(dimension22, dimension23), dimension24);
        }

        public final AudioRecordPlayerViewStyle invoke$stream_chat_android_ui_components_release(Context context, AttributeSet attrs) {
            AbstractC22676k.m65750j(context, "context");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C19469R.styleable.AudioRecordPlayerView, C19469R.attr.streamUiAudioRecordPlayerViewStyle, C19469R.style.StreamUi_AudioRecordPlayerView);
            AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            return TransformStyle.getAudioRecordPlayerViewStyle().transform(AudioRecordPlayerViewStyle.INSTANCE.invoke$stream_chat_android_ui_components_release(context, typedArrayObtainStyledAttributes));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final AudioRecordPlayerViewStyle invoke$stream_chat_android_ui_components_release(Context context, TypedArray attributes) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(attributes, "attributes");
            int dimensionPixelSize = attributes.getDimensionPixelSize(C19469R.styleable.AudioRecordPlayerView_streamUiAudioRecordPlayerHeight, ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_height));
            int dimensionPixelSize2 = attributes.getDimensionPixelSize(C19469R.styleable.AudioRecordPlayerView_streamUiAudioRecordPlayerPaddingStart, ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_padding_start));
            int dimensionPixelSize3 = attributes.getDimensionPixelSize(C19469R.styleable.AudioRecordPlayerView_streamUiAudioRecordPlayerPaddingTop, ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_padding_top));
            int dimensionPixelSize4 = attributes.getDimensionPixelSize(C19469R.styleable.AudioRecordPlayerView_streamUiAudioRecordPlayerPaddingEnd, ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_padding_end));
            int dimensionPixelSize5 = attributes.getDimensionPixelSize(C19469R.styleable.AudioRecordPlayerView_streamUiAudioRecordPlayerPaddingBottom, ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_padding_bottom));
            C22788g c22788gAudioBackground = ShapeAppearanceModelFactory.INSTANCE.audioBackground(context);
            int dimensionPixelSize6 = attributes.getDimensionPixelSize(C19469R.styleable.f74122x18db820f, ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_playback_progress_container_width));
            int dimensionPixelSize7 = attributes.getDimensionPixelSize(C19469R.styleable.f74121xe8c5c5fe, ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_playback_progress_container_height));
            int dimensionPixelSize8 = attributes.getDimensionPixelSize(C19469R.styleable.f74120xdb292d17, ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_playback_button_width));
            int dimensionPixelSize9 = attributes.getDimensionPixelSize(C19469R.styleable.f74118x702d7bf6, ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_playback_button_height));
            int dimensionPixelSize10 = attributes.getDimensionPixelSize(C19469R.styleable.f74117x9d061d2e, ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_playback_button_elevation));
            int dimensionPixelSize11 = attributes.getDimensionPixelSize(C19469R.styleable.f74119x3598ab22, ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_playback_button_padding));
            Drawable drawable = attributes.getDrawable(C19469R.styleable.f74115xbc6d407d);
            if (drawable == null) {
                drawable = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_white_shape_circular);
                AbstractC22676k.m65747g(drawable);
            }
            Integer colorOrNull = TypedArrayKt.getColorOrNull(attributes, C19469R.styleable.f74116x4ad68118);
            Drawable drawable2 = attributes.getDrawable(C19469R.styleable.AudioRecordPlayerView_streamUiAudioRecordPlayerPlayIconDrawable);
            if (drawable2 == null) {
                drawable2 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_play);
                AbstractC22676k.m65747g(drawable2);
            }
            Drawable drawable3 = drawable2;
            Integer colorOrNull2 = TypedArrayKt.getColorOrNull(attributes, C19469R.styleable.f74114x7eecfe68);
            Drawable drawable4 = attributes.getDrawable(C19469R.styleable.AudioRecordPlayerView_streamUiAudioRecordPlayerPauseIconDrawable);
            if (drawable4 == null) {
                drawable4 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_pause);
                AbstractC22676k.m65747g(drawable4);
            }
            Drawable drawable5 = drawable4;
            Integer colorOrNull3 = TypedArrayKt.getColorOrNull(attributes, C19469R.styleable.f74113x6c48e6e6);
            Drawable drawable6 = attributes.getDrawable(C19469R.styleable.f74123x204d39e2);
            if (drawable6 == null) {
                drawable6 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_rotating_indeterminate_progress_gradient);
                AbstractC22676k.m65747g(drawable6);
            }
            Drawable drawable7 = drawable6;
            Integer colorOrNull4 = TypedArrayKt.getColorOrNull(attributes, C19469R.styleable.f74124x61a13ffd);
            int dimensionPixelSize12 = attributes.getDimensionPixelSize(C19469R.styleable.AudioRecordPlayerView_streamUiAudioRecordPlayerProgressBarWidth, ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_progress_bar_width));
            int dimensionPixelSize13 = attributes.getDimensionPixelSize(C19469R.styleable.AudioRecordPlayerView_streamUiAudioRecordPlayerProgressBarHeight, ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_progress_bar_height));
            Drawable drawable8 = drawable;
            int dimensionPixelSize14 = attributes.getDimensionPixelSize(C19469R.styleable.f74110x29768f3e, ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_duration_text_view_width));
            int dimensionPixelSize15 = attributes.getDimensionPixelSize(C19469R.styleable.f74108xeb8c5eaf, ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_duration_text_view_height));
            int dimensionPixelSize16 = attributes.getDimensionPixelSize(C19469R.styleable.f74109x7b4912cc, ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_duration_text_view_margin_start));
            TextStyle.Builder builder = new TextStyle.Builder(attributes);
            builder.size(C19469R.styleable.AudioRecordPlayerView_streamUiAudioRecordPlayerDurationTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_duration_text_size));
            builder.color(C19469R.styleable.AudioRecordPlayerView_streamUiAudioRecordPlayerDurationTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_audio_record_player_duration_text_color));
            builder.font(C19469R.styleable.f74107x1d9fab35, C19469R.styleable.AudioRecordPlayerView_streamUiAudioRecordPlayerDurationTextFont);
            builder.style(C19469R.styleable.AudioRecordPlayerView_streamUiAudioRecordPlayerDurationTextStyle, 0);
            TextStyle textStyleBuild = builder.build();
            int dimensionPixelSize17 = attributes.getDimensionPixelSize(C19469R.styleable.AudioRecordPlayerView_streamUiAudioRecordPlayerWaveBarHeight, ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_wave_bar_height));
            int dimensionPixelSize18 = attributes.getDimensionPixelSize(C19469R.styleable.f74138xdbc685c, ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_wave_bar_margin_start));
            int color = AbstractC32122c.getColor(context, C19469R.color.stream_ui_accent_blue);
            int color2 = AbstractC32122c.getColor(context, C19469R.color.stream_ui_grey);
            int dimensionPixelSize19 = attributes.getDimensionPixelSize(C19469R.styleable.f74126x6926a4fd, ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_scrubber_width_default));
            int dimensionPixelSize20 = attributes.getDimensionPixelSize(C19469R.styleable.f74127xfa1a7ade, ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_scrubber_width_pressed));
            Drawable drawable9 = attributes.getDrawable(C19469R.styleable.AudioRecordPlayerView_streamUiAudioRecordPlayerScrubberDrawable);
            if (drawable9 == null) {
                drawable9 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_share_rectangle);
                AbstractC22676k.m65747g(drawable9);
            }
            Integer colorOrNull5 = TypedArrayKt.getColorOrNull(attributes, C19469R.styleable.f74125x5aa3181b);
            Drawable drawable10 = drawable9;
            int dimensionPixelSize21 = attributes.getDimensionPixelSize(C19469R.styleable.f74112xfb0a87fc, ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_file_icon_container_width));
            boolean z4 = attributes.getBoolean(C19469R.styleable.f74111x2e709528, context.getResources().getBoolean(C19469R.bool.stream_ui_audio_record_player_file_icon_container_visible));
            Drawable drawable11 = attributes.getDrawable(C19469R.styleable.f74104x119eb8c7);
            if (drawable11 == null) {
                drawable11 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_file_aac);
                AbstractC22676k.m65747g(drawable11);
            }
            int dimensionPixelSize22 = attributes.getDimensionPixelSize(C19469R.styleable.AudioRecordPlayerView_streamUiAudioRecordPlayerSpeedButtonWidth, ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_speed_button_width));
            Drawable drawable12 = drawable11;
            int dimensionPixelSize23 = attributes.getDimensionPixelSize(C19469R.styleable.AudioRecordPlayerView_streamUiAudioRecordPlayerSpeedButtonHeight, ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_speed_button_height));
            int dimensionPixelSize24 = attributes.getDimensionPixelSize(C19469R.styleable.f74130x94210b46, ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_speed_button_elevation));
            Drawable drawable13 = attributes.getDrawable(C19469R.styleable.f74128xe761c523);
            if (drawable13 == null) {
                drawable13 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_literal_white_shape_16dp_corners);
                AbstractC22676k.m65747g(drawable13);
            }
            Integer colorOrNull6 = TypedArrayKt.getColorOrNull(attributes, C19469R.styleable.f74129x290c42be);
            TextStyle.Builder builder2 = new TextStyle.Builder(attributes);
            Drawable drawable14 = drawable13;
            builder2.size(C19469R.styleable.f74134x44d59cc5, ContextKt.getDimension(context, C19469R.dimen.stream_ui_audio_record_player_speed_text_size));
            builder2.color(C19469R.styleable.f74131x54ff0b1f, AbstractC32122c.getColor(context, C19469R.color.stream_ui_audio_record_player_speed_text_color));
            builder2.font(C19469R.styleable.f74133x54a0ce76, C19469R.styleable.f74132x44cfc913);
            builder2.style(C19469R.styleable.f74135x55e2f96d, 0);
            return new AudioRecordPlayerViewStyle(dimensionPixelSize, new ViewPadding(dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize5), c22788gAudioBackground, null, new ViewSize(dimensionPixelSize6, dimensionPixelSize7), new ViewSize(dimensionPixelSize8, dimensionPixelSize9), new ViewPadding(dimensionPixelSize11, dimensionPixelSize11, dimensionPixelSize11, dimensionPixelSize11), dimensionPixelSize10, drawable8, colorOrNull, drawable7, colorOrNull4, new ViewSize(dimensionPixelSize12, dimensionPixelSize13), drawable3, colorOrNull2, drawable5, colorOrNull3, new ViewSize(dimensionPixelSize14, dimensionPixelSize15), dimensionPixelSize16, textStyleBuild, dimensionPixelSize17, dimensionPixelSize18, color, color2, drawable10, colorOrNull5, dimensionPixelSize19, dimensionPixelSize20, z4, dimensionPixelSize21, drawable12, builder2.build(), drawable14, colorOrNull6, new ViewSize(dimensionPixelSize22, dimensionPixelSize23), dimensionPixelSize24);
        }
    }

    public AudioRecordPlayerViewStyle(int i13, ViewPadding padding, Drawable drawable, Integer num, ViewSize playbackProgressContainerSize, ViewSize playbackButtonSize, ViewPadding playbackButtonPadding, int i14, Drawable drawable2, Integer num2, Drawable drawable3, Integer num3, ViewSize progressBarSize, Drawable drawable4, Integer num4, Drawable drawable5, Integer num5, ViewSize durationTextViewSize, int i15, TextStyle durationTextStyle, int i16, int i17, int i18, int i19, Drawable drawable6, Integer num6, int i24, int i25, boolean z4, int i26, Drawable drawable7, TextStyle speedButtonTextStyle, Drawable drawable8, Integer num7, ViewSize speedButtonSize, int i27) {
        AbstractC22676k.m65750j(padding, "padding");
        AbstractC22676k.m65750j(playbackProgressContainerSize, "playbackProgressContainerSize");
        AbstractC22676k.m65750j(playbackButtonSize, "playbackButtonSize");
        AbstractC22676k.m65750j(playbackButtonPadding, "playbackButtonPadding");
        AbstractC22676k.m65750j(progressBarSize, "progressBarSize");
        AbstractC22676k.m65750j(durationTextViewSize, "durationTextViewSize");
        AbstractC22676k.m65750j(durationTextStyle, "durationTextStyle");
        AbstractC22676k.m65750j(speedButtonTextStyle, "speedButtonTextStyle");
        AbstractC22676k.m65750j(speedButtonSize, "speedButtonSize");
        this.height = i13;
        this.padding = padding;
        this.backgroundDrawable = drawable;
        this.backgroundDrawableTint = num;
        this.playbackProgressContainerSize = playbackProgressContainerSize;
        this.playbackButtonSize = playbackButtonSize;
        this.playbackButtonPadding = playbackButtonPadding;
        this.playbackButtonElevation = i14;
        this.playbackButtonBackground = drawable2;
        this.playbackButtonBackgroundTint = num2;
        this.progressBarDrawable = drawable3;
        this.progressBarDrawableTint = num3;
        this.progressBarSize = progressBarSize;
        this.playIconDrawable = drawable4;
        this.playIconDrawableTint = num4;
        this.pauseIconDrawable = drawable5;
        this.pauseIconDrawableTint = num5;
        this.durationTextViewSize = durationTextViewSize;
        this.durationTextMarginStart = i15;
        this.durationTextStyle = durationTextStyle;
        this.waveBarHeight = i16;
        this.waveBarMarginStart = i17;
        this.waveBarColorPlayed = i18;
        this.waveBarColorFuture = i19;
        this.scrubberDrawable = drawable6;
        this.scrubberDrawableTint = num6;
        this.scrubberWidthDefault = i24;
        this.scrubberWidthPressed = i25;
        this.isFileIconContainerVisible = z4;
        this.fileIconContainerWidth = i26;
        this.audioFileIconDrawable = drawable7;
        this.speedButtonTextStyle = speedButtonTextStyle;
        this.speedButtonBackground = drawable8;
        this.speedButtonBackgroundTint = num7;
        this.speedButtonSize = speedButtonSize;
        this.speedButtonElevation = i27;
    }

    public static /* synthetic */ AudioRecordPlayerViewStyle copy$default(AudioRecordPlayerViewStyle audioRecordPlayerViewStyle, int i13, ViewPadding viewPadding, Drawable drawable, Integer num, ViewSize viewSize, ViewSize viewSize2, ViewPadding viewPadding2, int i14, Drawable drawable2, Integer num2, Drawable drawable3, Integer num3, ViewSize viewSize3, Drawable drawable4, Integer num4, Drawable drawable5, Integer num5, ViewSize viewSize4, int i15, TextStyle textStyle, int i16, int i17, int i18, int i19, Drawable drawable6, Integer num6, int i24, int i25, boolean z4, int i26, Drawable drawable7, TextStyle textStyle2, Drawable drawable8, Integer num7, ViewSize viewSize5, int i27, int i28, int i29, Object obj) {
        int i34;
        ViewSize viewSize6;
        int i35 = (i28 & 1) != 0 ? audioRecordPlayerViewStyle.height : i13;
        ViewPadding viewPadding3 = (i28 & 2) != 0 ? audioRecordPlayerViewStyle.padding : viewPadding;
        Drawable drawable9 = (i28 & 4) != 0 ? audioRecordPlayerViewStyle.backgroundDrawable : drawable;
        Integer num8 = (i28 & 8) != 0 ? audioRecordPlayerViewStyle.backgroundDrawableTint : num;
        ViewSize viewSize7 = (i28 & 16) != 0 ? audioRecordPlayerViewStyle.playbackProgressContainerSize : viewSize;
        ViewSize viewSize8 = (i28 & 32) != 0 ? audioRecordPlayerViewStyle.playbackButtonSize : viewSize2;
        ViewPadding viewPadding4 = (i28 & 64) != 0 ? audioRecordPlayerViewStyle.playbackButtonPadding : viewPadding2;
        int i36 = (i28 & 128) != 0 ? audioRecordPlayerViewStyle.playbackButtonElevation : i14;
        Drawable drawable10 = (i28 & 256) != 0 ? audioRecordPlayerViewStyle.playbackButtonBackground : drawable2;
        Integer num9 = (i28 & 512) != 0 ? audioRecordPlayerViewStyle.playbackButtonBackgroundTint : num2;
        Drawable drawable11 = (i28 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? audioRecordPlayerViewStyle.progressBarDrawable : drawable3;
        Integer num10 = (i28 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? audioRecordPlayerViewStyle.progressBarDrawableTint : num3;
        ViewSize viewSize9 = (i28 & 4096) != 0 ? audioRecordPlayerViewStyle.progressBarSize : viewSize3;
        Drawable drawable12 = (i28 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? audioRecordPlayerViewStyle.playIconDrawable : drawable4;
        int i37 = i35;
        Integer num11 = (i28 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? audioRecordPlayerViewStyle.playIconDrawableTint : num4;
        Drawable drawable13 = (i28 & 32768) != 0 ? audioRecordPlayerViewStyle.pauseIconDrawable : drawable5;
        Integer num12 = (i28 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? audioRecordPlayerViewStyle.pauseIconDrawableTint : num5;
        ViewSize viewSize10 = (i28 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? audioRecordPlayerViewStyle.durationTextViewSize : viewSize4;
        int i38 = (i28 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? audioRecordPlayerViewStyle.durationTextMarginStart : i15;
        TextStyle textStyle3 = (i28 & 524288) != 0 ? audioRecordPlayerViewStyle.durationTextStyle : textStyle;
        int i39 = (i28 & 1048576) != 0 ? audioRecordPlayerViewStyle.waveBarHeight : i16;
        int i44 = (i28 & 2097152) != 0 ? audioRecordPlayerViewStyle.waveBarMarginStart : i17;
        int i45 = (i28 & 4194304) != 0 ? audioRecordPlayerViewStyle.waveBarColorPlayed : i18;
        int i46 = (i28 & 8388608) != 0 ? audioRecordPlayerViewStyle.waveBarColorFuture : i19;
        Drawable drawable14 = (i28 & 16777216) != 0 ? audioRecordPlayerViewStyle.scrubberDrawable : drawable6;
        Integer num13 = (i28 & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? audioRecordPlayerViewStyle.scrubberDrawableTint : num6;
        int i47 = (i28 & 67108864) != 0 ? audioRecordPlayerViewStyle.scrubberWidthDefault : i24;
        int i48 = (i28 & 134217728) != 0 ? audioRecordPlayerViewStyle.scrubberWidthPressed : i25;
        boolean z13 = (i28 & 268435456) != 0 ? audioRecordPlayerViewStyle.isFileIconContainerVisible : z4;
        int i49 = (i28 & 536870912) != 0 ? audioRecordPlayerViewStyle.fileIconContainerWidth : i26;
        Drawable drawable15 = (i28 & 1073741824) != 0 ? audioRecordPlayerViewStyle.audioFileIconDrawable : drawable7;
        TextStyle textStyle4 = (i28 & Integer.MIN_VALUE) != 0 ? audioRecordPlayerViewStyle.speedButtonTextStyle : textStyle2;
        Drawable drawable16 = (i29 & 1) != 0 ? audioRecordPlayerViewStyle.speedButtonBackground : drawable8;
        Integer num14 = (i29 & 2) != 0 ? audioRecordPlayerViewStyle.speedButtonBackgroundTint : num7;
        ViewSize viewSize11 = (i29 & 4) != 0 ? audioRecordPlayerViewStyle.speedButtonSize : viewSize5;
        if ((i29 & 8) != 0) {
            viewSize6 = viewSize11;
            i34 = audioRecordPlayerViewStyle.speedButtonElevation;
        } else {
            i34 = i27;
            viewSize6 = viewSize11;
        }
        return audioRecordPlayerViewStyle.copy(i37, viewPadding3, drawable9, num8, viewSize7, viewSize8, viewPadding4, i36, drawable10, num9, drawable11, num10, viewSize9, drawable12, num11, drawable13, num12, viewSize10, i38, textStyle3, i39, i44, i45, i46, drawable14, num13, i47, i48, z13, i49, drawable15, textStyle4, drawable16, num14, viewSize6, i34);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getPlaybackButtonBackgroundTint() {
        return this.playbackButtonBackgroundTint;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Drawable getProgressBarDrawable() {
        return this.progressBarDrawable;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getProgressBarDrawableTint() {
        return this.progressBarDrawableTint;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final ViewSize getProgressBarSize() {
        return this.progressBarSize;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Drawable getPlayIconDrawable() {
        return this.playIconDrawable;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Integer getPlayIconDrawableTint() {
        return this.playIconDrawableTint;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Drawable getPauseIconDrawable() {
        return this.pauseIconDrawable;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Integer getPauseIconDrawableTint() {
        return this.pauseIconDrawableTint;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final ViewSize getDurationTextViewSize() {
        return this.durationTextViewSize;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getDurationTextMarginStart() {
        return this.durationTextMarginStart;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ViewPadding getPadding() {
        return this.padding;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final TextStyle getDurationTextStyle() {
        return this.durationTextStyle;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final int getWaveBarHeight() {
        return this.waveBarHeight;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final int getWaveBarMarginStart() {
        return this.waveBarMarginStart;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final int getWaveBarColorPlayed() {
        return this.waveBarColorPlayed;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final int getWaveBarColorFuture() {
        return this.waveBarColorFuture;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Drawable getScrubberDrawable() {
        return this.scrubberDrawable;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Integer getScrubberDrawableTint() {
        return this.scrubberDrawableTint;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final int getScrubberWidthDefault() {
        return this.scrubberWidthDefault;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final int getScrubberWidthPressed() {
        return this.scrubberWidthPressed;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final boolean getIsFileIconContainerVisible() {
        return this.isFileIconContainerVisible;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Drawable getBackgroundDrawable() {
        return this.backgroundDrawable;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final int getFileIconContainerWidth() {
        return this.fileIconContainerWidth;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final Drawable getAudioFileIconDrawable() {
        return this.audioFileIconDrawable;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final TextStyle getSpeedButtonTextStyle() {
        return this.speedButtonTextStyle;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final Drawable getSpeedButtonBackground() {
        return this.speedButtonBackground;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final Integer getSpeedButtonBackgroundTint() {
        return this.speedButtonBackgroundTint;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final ViewSize getSpeedButtonSize() {
        return this.speedButtonSize;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final int getSpeedButtonElevation() {
        return this.speedButtonElevation;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getBackgroundDrawableTint() {
        return this.backgroundDrawableTint;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ViewSize getPlaybackProgressContainerSize() {
        return this.playbackProgressContainerSize;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ViewSize getPlaybackButtonSize() {
        return this.playbackButtonSize;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ViewPadding getPlaybackButtonPadding() {
        return this.playbackButtonPadding;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getPlaybackButtonElevation() {
        return this.playbackButtonElevation;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Drawable getPlaybackButtonBackground() {
        return this.playbackButtonBackground;
    }

    public final AudioRecordPlayerViewStyle copy(int height, ViewPadding padding, Drawable backgroundDrawable, Integer backgroundDrawableTint, ViewSize playbackProgressContainerSize, ViewSize playbackButtonSize, ViewPadding playbackButtonPadding, int playbackButtonElevation, Drawable playbackButtonBackground, Integer playbackButtonBackgroundTint, Drawable progressBarDrawable, Integer progressBarDrawableTint, ViewSize progressBarSize, Drawable playIconDrawable, Integer playIconDrawableTint, Drawable pauseIconDrawable, Integer pauseIconDrawableTint, ViewSize durationTextViewSize, int durationTextMarginStart, TextStyle durationTextStyle, int waveBarHeight, int waveBarMarginStart, int waveBarColorPlayed, int waveBarColorFuture, Drawable scrubberDrawable, Integer scrubberDrawableTint, int scrubberWidthDefault, int scrubberWidthPressed, boolean isFileIconContainerVisible, int fileIconContainerWidth, Drawable audioFileIconDrawable, TextStyle speedButtonTextStyle, Drawable speedButtonBackground, Integer speedButtonBackgroundTint, ViewSize speedButtonSize, int speedButtonElevation) {
        AbstractC22676k.m65750j(padding, "padding");
        AbstractC22676k.m65750j(playbackProgressContainerSize, "playbackProgressContainerSize");
        AbstractC22676k.m65750j(playbackButtonSize, "playbackButtonSize");
        AbstractC22676k.m65750j(playbackButtonPadding, "playbackButtonPadding");
        AbstractC22676k.m65750j(progressBarSize, "progressBarSize");
        AbstractC22676k.m65750j(durationTextViewSize, "durationTextViewSize");
        AbstractC22676k.m65750j(durationTextStyle, "durationTextStyle");
        AbstractC22676k.m65750j(speedButtonTextStyle, "speedButtonTextStyle");
        AbstractC22676k.m65750j(speedButtonSize, "speedButtonSize");
        return new AudioRecordPlayerViewStyle(height, padding, backgroundDrawable, backgroundDrawableTint, playbackProgressContainerSize, playbackButtonSize, playbackButtonPadding, playbackButtonElevation, playbackButtonBackground, playbackButtonBackgroundTint, progressBarDrawable, progressBarDrawableTint, progressBarSize, playIconDrawable, playIconDrawableTint, pauseIconDrawable, pauseIconDrawableTint, durationTextViewSize, durationTextMarginStart, durationTextStyle, waveBarHeight, waveBarMarginStart, waveBarColorPlayed, waveBarColorFuture, scrubberDrawable, scrubberDrawableTint, scrubberWidthDefault, scrubberWidthPressed, isFileIconContainerVisible, fileIconContainerWidth, audioFileIconDrawable, speedButtonTextStyle, speedButtonBackground, speedButtonBackgroundTint, speedButtonSize, speedButtonElevation);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioRecordPlayerViewStyle)) {
            return false;
        }
        AudioRecordPlayerViewStyle audioRecordPlayerViewStyle = (AudioRecordPlayerViewStyle) other;
        return this.height == audioRecordPlayerViewStyle.height && AbstractC22676k.m65745e(this.padding, audioRecordPlayerViewStyle.padding) && AbstractC22676k.m65745e(this.backgroundDrawable, audioRecordPlayerViewStyle.backgroundDrawable) && AbstractC22676k.m65745e(this.backgroundDrawableTint, audioRecordPlayerViewStyle.backgroundDrawableTint) && AbstractC22676k.m65745e(this.playbackProgressContainerSize, audioRecordPlayerViewStyle.playbackProgressContainerSize) && AbstractC22676k.m65745e(this.playbackButtonSize, audioRecordPlayerViewStyle.playbackButtonSize) && AbstractC22676k.m65745e(this.playbackButtonPadding, audioRecordPlayerViewStyle.playbackButtonPadding) && this.playbackButtonElevation == audioRecordPlayerViewStyle.playbackButtonElevation && AbstractC22676k.m65745e(this.playbackButtonBackground, audioRecordPlayerViewStyle.playbackButtonBackground) && AbstractC22676k.m65745e(this.playbackButtonBackgroundTint, audioRecordPlayerViewStyle.playbackButtonBackgroundTint) && AbstractC22676k.m65745e(this.progressBarDrawable, audioRecordPlayerViewStyle.progressBarDrawable) && AbstractC22676k.m65745e(this.progressBarDrawableTint, audioRecordPlayerViewStyle.progressBarDrawableTint) && AbstractC22676k.m65745e(this.progressBarSize, audioRecordPlayerViewStyle.progressBarSize) && AbstractC22676k.m65745e(this.playIconDrawable, audioRecordPlayerViewStyle.playIconDrawable) && AbstractC22676k.m65745e(this.playIconDrawableTint, audioRecordPlayerViewStyle.playIconDrawableTint) && AbstractC22676k.m65745e(this.pauseIconDrawable, audioRecordPlayerViewStyle.pauseIconDrawable) && AbstractC22676k.m65745e(this.pauseIconDrawableTint, audioRecordPlayerViewStyle.pauseIconDrawableTint) && AbstractC22676k.m65745e(this.durationTextViewSize, audioRecordPlayerViewStyle.durationTextViewSize) && this.durationTextMarginStart == audioRecordPlayerViewStyle.durationTextMarginStart && AbstractC22676k.m65745e(this.durationTextStyle, audioRecordPlayerViewStyle.durationTextStyle) && this.waveBarHeight == audioRecordPlayerViewStyle.waveBarHeight && this.waveBarMarginStart == audioRecordPlayerViewStyle.waveBarMarginStart && this.waveBarColorPlayed == audioRecordPlayerViewStyle.waveBarColorPlayed && this.waveBarColorFuture == audioRecordPlayerViewStyle.waveBarColorFuture && AbstractC22676k.m65745e(this.scrubberDrawable, audioRecordPlayerViewStyle.scrubberDrawable) && AbstractC22676k.m65745e(this.scrubberDrawableTint, audioRecordPlayerViewStyle.scrubberDrawableTint) && this.scrubberWidthDefault == audioRecordPlayerViewStyle.scrubberWidthDefault && this.scrubberWidthPressed == audioRecordPlayerViewStyle.scrubberWidthPressed && this.isFileIconContainerVisible == audioRecordPlayerViewStyle.isFileIconContainerVisible && this.fileIconContainerWidth == audioRecordPlayerViewStyle.fileIconContainerWidth && AbstractC22676k.m65745e(this.audioFileIconDrawable, audioRecordPlayerViewStyle.audioFileIconDrawable) && AbstractC22676k.m65745e(this.speedButtonTextStyle, audioRecordPlayerViewStyle.speedButtonTextStyle) && AbstractC22676k.m65745e(this.speedButtonBackground, audioRecordPlayerViewStyle.speedButtonBackground) && AbstractC22676k.m65745e(this.speedButtonBackgroundTint, audioRecordPlayerViewStyle.speedButtonBackgroundTint) && AbstractC22676k.m65745e(this.speedButtonSize, audioRecordPlayerViewStyle.speedButtonSize) && this.speedButtonElevation == audioRecordPlayerViewStyle.speedButtonElevation;
    }

    public final Drawable getAudioFileIconDrawable() {
        return this.audioFileIconDrawable;
    }

    public final Drawable getBackgroundDrawable() {
        return this.backgroundDrawable;
    }

    public final Integer getBackgroundDrawableTint() {
        return this.backgroundDrawableTint;
    }

    public final int getDurationTextMarginStart() {
        return this.durationTextMarginStart;
    }

    public final TextStyle getDurationTextStyle() {
        return this.durationTextStyle;
    }

    public final ViewSize getDurationTextViewSize() {
        return this.durationTextViewSize;
    }

    public final int getFileIconContainerWidth() {
        return this.fileIconContainerWidth;
    }

    public final int getHeight() {
        return this.height;
    }

    public final ViewPadding getPadding() {
        return this.padding;
    }

    public final Drawable getPauseIconDrawable() {
        return this.pauseIconDrawable;
    }

    public final Integer getPauseIconDrawableTint() {
        return this.pauseIconDrawableTint;
    }

    public final Drawable getPlayIconDrawable() {
        return this.playIconDrawable;
    }

    public final Integer getPlayIconDrawableTint() {
        return this.playIconDrawableTint;
    }

    public final Drawable getPlaybackButtonBackground() {
        return this.playbackButtonBackground;
    }

    public final Integer getPlaybackButtonBackgroundTint() {
        return this.playbackButtonBackgroundTint;
    }

    public final int getPlaybackButtonElevation() {
        return this.playbackButtonElevation;
    }

    public final ViewPadding getPlaybackButtonPadding() {
        return this.playbackButtonPadding;
    }

    public final ViewSize getPlaybackButtonSize() {
        return this.playbackButtonSize;
    }

    public final ViewSize getPlaybackProgressContainerSize() {
        return this.playbackProgressContainerSize;
    }

    public final Drawable getProgressBarDrawable() {
        return this.progressBarDrawable;
    }

    public final Integer getProgressBarDrawableTint() {
        return this.progressBarDrawableTint;
    }

    public final ViewSize getProgressBarSize() {
        return this.progressBarSize;
    }

    public final Drawable getScrubberDrawable() {
        return this.scrubberDrawable;
    }

    public final Integer getScrubberDrawableTint() {
        return this.scrubberDrawableTint;
    }

    public final int getScrubberWidthDefault() {
        return this.scrubberWidthDefault;
    }

    public final int getScrubberWidthPressed() {
        return this.scrubberWidthPressed;
    }

    public final Drawable getSpeedButtonBackground() {
        return this.speedButtonBackground;
    }

    public final Integer getSpeedButtonBackgroundTint() {
        return this.speedButtonBackgroundTint;
    }

    public final int getSpeedButtonElevation() {
        return this.speedButtonElevation;
    }

    public final ViewSize getSpeedButtonSize() {
        return this.speedButtonSize;
    }

    public final TextStyle getSpeedButtonTextStyle() {
        return this.speedButtonTextStyle;
    }

    public final Drawable getTintedBackgroundDrawable() {
        Drawable drawable = this.backgroundDrawable;
        if (drawable != null) {
            return DrawableKt.applyTint(drawable, this.backgroundDrawableTint);
        }
        return null;
    }

    public final Drawable getTintedPauseIconDrawable() {
        Drawable drawable = this.pauseIconDrawable;
        if (drawable != null) {
            return DrawableKt.applyTint(drawable, this.pauseIconDrawableTint);
        }
        return null;
    }

    public final Drawable getTintedPlayIconDrawable() {
        Drawable drawable = this.playIconDrawable;
        if (drawable != null) {
            return DrawableKt.applyTint(drawable, this.playIconDrawableTint);
        }
        return null;
    }

    public final Drawable getTintedPlaybackButtonBackground() {
        Drawable drawable = this.playbackButtonBackground;
        if (drawable != null) {
            return DrawableKt.applyTint(drawable, this.playbackButtonBackgroundTint);
        }
        return null;
    }

    public final Drawable getTintedProgressBarDrawable() {
        Drawable drawable = this.progressBarDrawable;
        if (drawable != null) {
            return DrawableKt.applyTint(drawable, this.progressBarDrawableTint);
        }
        return null;
    }

    public final Drawable getTintedScrubberDrawable() {
        Drawable drawable = this.scrubberDrawable;
        if (drawable != null) {
            return DrawableKt.applyTint(drawable, this.scrubberDrawableTint);
        }
        return null;
    }

    public final Drawable getTintedSpeedButtonBackground() {
        Drawable drawable = this.speedButtonBackground;
        if (drawable != null) {
            return DrawableKt.applyTint(drawable, this.speedButtonBackgroundTint);
        }
        return null;
    }

    public final int getWaveBarColorFuture() {
        return this.waveBarColorFuture;
    }

    public final int getWaveBarColorPlayed() {
        return this.waveBarColorPlayed;
    }

    public final int getWaveBarHeight() {
        return this.waveBarHeight;
    }

    public final int getWaveBarMarginStart() {
        return this.waveBarMarginStart;
    }

    public final int hashCode() {
        int iHashCode = (this.padding.hashCode() + (Integer.hashCode(this.height) * 31)) * 31;
        Drawable drawable = this.backgroundDrawable;
        int iHashCode2 = (iHashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Integer num = this.backgroundDrawableTint;
        int iM30448b = AbstractC11266d.m30448b(this.playbackButtonElevation, (this.playbackButtonPadding.hashCode() + ((this.playbackButtonSize.hashCode() + ((this.playbackProgressContainerSize.hashCode() + ((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31)) * 31)) * 31)) * 31, 31);
        Drawable drawable2 = this.playbackButtonBackground;
        int iHashCode3 = (iM30448b + (drawable2 == null ? 0 : drawable2.hashCode())) * 31;
        Integer num2 = this.playbackButtonBackgroundTint;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Drawable drawable3 = this.progressBarDrawable;
        int iHashCode5 = (iHashCode4 + (drawable3 == null ? 0 : drawable3.hashCode())) * 31;
        Integer num3 = this.progressBarDrawableTint;
        int iHashCode6 = (this.progressBarSize.hashCode() + ((iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31)) * 31;
        Drawable drawable4 = this.playIconDrawable;
        int iHashCode7 = (iHashCode6 + (drawable4 == null ? 0 : drawable4.hashCode())) * 31;
        Integer num4 = this.playIconDrawableTint;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Drawable drawable5 = this.pauseIconDrawable;
        int iHashCode9 = (iHashCode8 + (drawable5 == null ? 0 : drawable5.hashCode())) * 31;
        Integer num5 = this.pauseIconDrawableTint;
        int iM30448b2 = AbstractC11266d.m30448b(this.waveBarColorFuture, AbstractC11266d.m30448b(this.waveBarColorPlayed, AbstractC11266d.m30448b(this.waveBarMarginStart, AbstractC11266d.m30448b(this.waveBarHeight, AbstractC26725a.m79499c(this.durationTextStyle, AbstractC11266d.m30448b(this.durationTextMarginStart, (this.durationTextViewSize.hashCode() + ((iHashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31)) * 31, 31), 31), 31), 31), 31), 31);
        Drawable drawable6 = this.scrubberDrawable;
        int iHashCode10 = (iM30448b2 + (drawable6 == null ? 0 : drawable6.hashCode())) * 31;
        Integer num6 = this.scrubberDrawableTint;
        int iM30448b3 = AbstractC11266d.m30448b(this.fileIconContainerWidth, AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.scrubberWidthPressed, AbstractC11266d.m30448b(this.scrubberWidthDefault, (iHashCode10 + (num6 == null ? 0 : num6.hashCode())) * 31, 31), 31), 31, this.isFileIconContainerVisible), 31);
        Drawable drawable7 = this.audioFileIconDrawable;
        int iM79499c = AbstractC26725a.m79499c(this.speedButtonTextStyle, (iM30448b3 + (drawable7 == null ? 0 : drawable7.hashCode())) * 31, 31);
        Drawable drawable8 = this.speedButtonBackground;
        int iHashCode11 = (iM79499c + (drawable8 == null ? 0 : drawable8.hashCode())) * 31;
        Integer num7 = this.speedButtonBackgroundTint;
        return Integer.hashCode(this.speedButtonElevation) + ((this.speedButtonSize.hashCode() + ((iHashCode11 + (num7 != null ? num7.hashCode() : 0)) * 31)) * 31);
    }

    public final boolean isFileIconContainerVisible() {
        return this.isFileIconContainerVisible;
    }

    public final String toString() {
        int i13 = this.height;
        ViewPadding viewPadding = this.padding;
        Drawable drawable = this.backgroundDrawable;
        Integer num = this.backgroundDrawableTint;
        ViewSize viewSize = this.playbackProgressContainerSize;
        ViewSize viewSize2 = this.playbackButtonSize;
        ViewPadding viewPadding2 = this.playbackButtonPadding;
        int i14 = this.playbackButtonElevation;
        Drawable drawable2 = this.playbackButtonBackground;
        Integer num2 = this.playbackButtonBackgroundTint;
        Drawable drawable3 = this.progressBarDrawable;
        Integer num3 = this.progressBarDrawableTint;
        ViewSize viewSize3 = this.progressBarSize;
        Drawable drawable4 = this.playIconDrawable;
        Integer num4 = this.playIconDrawableTint;
        Drawable drawable5 = this.pauseIconDrawable;
        Integer num5 = this.pauseIconDrawableTint;
        ViewSize viewSize4 = this.durationTextViewSize;
        int i15 = this.durationTextMarginStart;
        TextStyle textStyle = this.durationTextStyle;
        int i16 = this.waveBarHeight;
        int i17 = this.waveBarMarginStart;
        int i18 = this.waveBarColorPlayed;
        int i19 = this.waveBarColorFuture;
        Drawable drawable6 = this.scrubberDrawable;
        Integer num6 = this.scrubberDrawableTint;
        int i24 = this.scrubberWidthDefault;
        int i25 = this.scrubberWidthPressed;
        boolean z4 = this.isFileIconContainerVisible;
        int i26 = this.fileIconContainerWidth;
        Drawable drawable7 = this.audioFileIconDrawable;
        TextStyle textStyle2 = this.speedButtonTextStyle;
        Drawable drawable8 = this.speedButtonBackground;
        Integer num7 = this.speedButtonBackgroundTint;
        ViewSize viewSize5 = this.speedButtonSize;
        int i27 = this.speedButtonElevation;
        StringBuilder sb4 = new StringBuilder("AudioRecordPlayerViewStyle(height=");
        sb4.append(i13);
        sb4.append(", padding=");
        sb4.append(viewPadding);
        sb4.append(", backgroundDrawable=");
        sb4.append(drawable);
        sb4.append(", backgroundDrawableTint=");
        sb4.append(num);
        sb4.append(", playbackProgressContainerSize=");
        sb4.append(viewSize);
        sb4.append(", playbackButtonSize=");
        sb4.append(viewSize2);
        sb4.append(", playbackButtonPadding=");
        sb4.append(viewPadding2);
        sb4.append(", playbackButtonElevation=");
        sb4.append(i14);
        sb4.append(", playbackButtonBackground=");
        sb4.append(drawable2);
        sb4.append(", playbackButtonBackgroundTint=");
        sb4.append(num2);
        sb4.append(", progressBarDrawable=");
        sb4.append(drawable3);
        sb4.append(", progressBarDrawableTint=");
        sb4.append(num3);
        sb4.append(", progressBarSize=");
        sb4.append(viewSize3);
        sb4.append(", playIconDrawable=");
        sb4.append(drawable4);
        sb4.append(", playIconDrawableTint=");
        sb4.append(num4);
        sb4.append(", pauseIconDrawable=");
        sb4.append(drawable5);
        sb4.append(", pauseIconDrawableTint=");
        sb4.append(num5);
        sb4.append(", durationTextViewSize=");
        sb4.append(viewSize4);
        sb4.append(", durationTextMarginStart=");
        sb4.append(i15);
        sb4.append(", durationTextStyle=");
        sb4.append(textStyle);
        sb4.append(", waveBarHeight=");
        AbstractC30802r.m94773v(sb4, i16, ", waveBarMarginStart=", i17, ", waveBarColorPlayed=");
        AbstractC30802r.m94773v(sb4, i18, ", waveBarColorFuture=", i19, ", scrubberDrawable=");
        sb4.append(drawable6);
        sb4.append(", scrubberDrawableTint=");
        sb4.append(num6);
        sb4.append(", scrubberWidthDefault=");
        AbstractC30802r.m94773v(sb4, i24, ", scrubberWidthPressed=", i25, ", isFileIconContainerVisible=");
        AbstractC30802r.m94769r(i26, ", fileIconContainerWidth=", ", audioFileIconDrawable=", sb4, z4);
        sb4.append(drawable7);
        sb4.append(", speedButtonTextStyle=");
        sb4.append(textStyle2);
        sb4.append(", speedButtonBackground=");
        sb4.append(drawable8);
        sb4.append(", speedButtonBackgroundTint=");
        sb4.append(num7);
        sb4.append(", speedButtonSize=");
        sb4.append(viewSize5);
        sb4.append(", speedButtonElevation=");
        sb4.append(i27);
        sb4.append(")");
        return sb4.toString();
    }
}
