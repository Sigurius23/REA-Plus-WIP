package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import io.getstream.chat.android.p226ui.common.permissions.VisualMediaType;
import io.getstream.chat.android.p226ui.font.TextStyle;
import io.getstream.chat.android.p226ui.helper.ViewStyle;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bn\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0003\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\n\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0010\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\n\u0012\u0006\u0010\u001b\u001a\u00020\u0010\u0012\u0006\u0010\u001c\u001a\u00020\n\u0012\u0006\u0010\u001d\u001a\u00020\u0010\u0012\u0006\u0010\u001e\u001a\u00020\b\u0012\u0006\u0010\u001f\u001a\u00020\n\u0012\u0006\u0010 \u001a\u00020\u0010\u0012\u0006\u0010!\u001a\u00020\u0010\u0012\u0006\u0010\"\u001a\u00020\b\u0012\u0006\u0010#\u001a\u00020\n\u0012\u0006\u0010$\u001a\u00020\u0010\u0012\u0006\u0010%\u001a\u00020\b\u0012\u0006\u0010&\u001a\u00020\n\u0012\u0006\u0010'\u001a\u00020\u0010\u0012\u0006\u0010(\u001a\u00020\b\u0012\u0006\u0010)\u001a\u00020\b\u0012\u0006\u0010*\u001a\u00020\b\u0012\u0006\u0010+\u001a\u00020\n\u0012\u0006\u0010,\u001a\u00020\n\u0012\b\b\u0001\u0010-\u001a\u00020\u0006\u0012\u0006\u0010.\u001a\u00020\u0003\u0012\u0006\u0010/\u001a\u00020\n\u0012\u0006\u00100\u001a\u00020\u0003\u0012\u0006\u00101\u001a\u00020\n\u0012\u0006\u00102\u001a\u00020\u0010\u0012\u0006\u00103\u001a\u00020\n\u0012\u0006\u00104\u001a\u000205\u0012\u0006\u00106\u001a\u00020\u0003\u0012\u0006\u00107\u001a\u000208¢\u0006\u0004\b9\u0010:J\t\u0010t\u001a\u00020\u0003HÆ\u0003J\t\u0010u\u001a\u00020\u0003HÆ\u0003J\t\u0010v\u001a\u00020\u0006HÆ\u0003J\t\u0010w\u001a\u00020\bHÆ\u0003J\t\u0010x\u001a\u00020\nHÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010z\u001a\u00020\u0003HÆ\u0003J\t\u0010{\u001a\u00020\nHÆ\u0003J\t\u0010|\u001a\u00020\u0010HÆ\u0003J\t\u0010}\u001a\u00020\nHÆ\u0003J\t\u0010~\u001a\u00020\u0003HÆ\u0003J\t\u0010\u007f\u001a\u00020\bHÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020\nHÆ\u0003J\u0011\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010PJ\n\u0010\u0083\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u008f\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0090\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u0092\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010\u0094\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u0095\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u0096\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u0097\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0098\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0099\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u009a\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009b\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u009c\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009d\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u009e\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010\u009f\u0001\u001a\u00020\nHÆ\u0003J\n\u0010 \u0001\u001a\u000205HÆ\u0003J\n\u0010¡\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¢\u0001\u001a\u000208HÆ\u0003Jê\u0003\u0010£\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\n2\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\u00102\b\b\u0002\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\u00102\b\b\u0002\u0010\u001e\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\n2\b\b\u0002\u0010 \u001a\u00020\u00102\b\b\u0002\u0010!\u001a\u00020\u00102\b\b\u0002\u0010\"\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\n2\b\b\u0002\u0010$\u001a\u00020\u00102\b\b\u0002\u0010%\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020\n2\b\b\u0002\u0010'\u001a\u00020\u00102\b\b\u0002\u0010(\u001a\u00020\b2\b\b\u0002\u0010)\u001a\u00020\b2\b\b\u0002\u0010*\u001a\u00020\b2\b\b\u0002\u0010+\u001a\u00020\n2\b\b\u0002\u0010,\u001a\u00020\n2\b\b\u0003\u0010-\u001a\u00020\u00062\b\b\u0002\u0010.\u001a\u00020\u00032\b\b\u0002\u0010/\u001a\u00020\n2\b\b\u0002\u00100\u001a\u00020\u00032\b\b\u0002\u00101\u001a\u00020\n2\b\b\u0002\u00102\u001a\u00020\u00102\b\b\u0002\u00103\u001a\u00020\n2\b\b\u0002\u00104\u001a\u0002052\b\b\u0002\u00106\u001a\u00020\u00032\b\b\u0002\u00107\u001a\u000208HÆ\u0001¢\u0006\u0003\u0010¤\u0001J\u0016\u0010¥\u0001\u001a\u00020\u00032\n\u0010¦\u0001\u001a\u0005\u0018\u00010§\u0001HÖ\u0003J\n\u0010¨\u0001\u001a\u00020\u0006HÖ\u0001J\n\u0010©\u0001\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010<R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010<R\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bG\u0010CR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0011\u0010\u0011\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010CR\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u0010<R\u0011\u0010\u0013\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bL\u0010AR\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bM\u0010<R\u0011\u0010\u0015\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bN\u0010CR\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010Q\u001a\u0004\bO\u0010PR\u0011\u0010\u0017\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bR\u0010IR\u0011\u0010\u0018\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bS\u0010AR\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bT\u0010<R\u0011\u0010\u001a\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bU\u0010CR\u0011\u0010\u001b\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bV\u0010IR\u0011\u0010\u001c\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bW\u0010CR\u0011\u0010\u001d\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bX\u0010IR\u0011\u0010\u001e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bY\u0010AR\u0011\u0010\u001f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010CR\u0011\u0010 \u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b[\u0010IR\u0011\u0010!\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010IR\u0011\u0010\"\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b]\u0010AR\u0011\u0010#\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b^\u0010CR\u0011\u0010$\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b_\u0010IR\u0011\u0010%\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b`\u0010AR\u0011\u0010&\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\ba\u0010CR\u0011\u0010'\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bb\u0010IR\u0011\u0010(\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bc\u0010AR\u0011\u0010)\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bd\u0010AR\u0011\u0010*\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\be\u0010AR\u0011\u0010+\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bf\u0010CR\u0011\u0010,\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bg\u0010CR\u0011\u0010-\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bh\u0010?R\u0011\u0010.\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bi\u0010<R\u0011\u0010/\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bj\u0010CR\u0011\u00100\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bk\u0010<R\u0011\u00101\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bl\u0010CR\u0011\u00102\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bm\u0010IR\u0011\u00103\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bn\u0010CR\u0011\u00104\u001a\u000205¢\u0006\b\n\u0000\u001a\u0004\bo\u0010pR\u0011\u00106\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bq\u0010<R\u0011\u00107\u001a\u000208¢\u0006\b\n\u0000\u001a\u0004\br\u0010s¨\u0006ª\u0001"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;", "Lio/getstream/chat/android/ui/helper/ViewStyle;", "useDefaultSystemMediaPicker", "", "saveAttachmentsOnDismiss", "attachmentsPickerBackgroundColor", "", "allowAccessButtonTextStyle", "Lio/getstream/chat/android/ui/font/TextStyle;", "submitAttachmentsButtonIconDrawable", "Landroid/graphics/drawable/Drawable;", "attachmentTabToggleButtonStateList", "Landroid/content/res/ColorStateList;", "mediaAttachmentsTabEnabled", "mediaAttachmentsTabIconDrawable", "allowAccessToMediaButtonText", "", "allowAccessToMediaIconDrawable", "videoLengthTextVisible", "videoLengthTextStyle", "videoIconVisible", "videoIconDrawable", "videoIconDrawableTint", "mediaAttachmentNoMediaText", "mediaAttachmentNoMediaTextStyle", "fileAttachmentsTabEnabled", "fileAttachmentsTabIconDrawable", "allowAccessToFilesButtonText", "allowAccessToFilesIconDrawable", "allowAccessToAudioText", "allowAccessToAudioTextStyle", "allowAccessToAudioIconDrawable", "allowAccessToVisualMediaText", "allowAccessToMoreVisualMediaText", "allowAccessToVisualMediaTextStyle", "allowAccessToVisualMediaIconDrawable", "recentFilesText", "recentFilesTextStyle", "fileManagerIconDrawable", "fileAttachmentsNoFilesText", "fileAttachmentsNoFilesTextStyle", "fileAttachmentItemNameTextStyle", "fileAttachmentItemSizeTextStyle", "fileAttachmentItemCheckboxSelectedDrawable", "fileAttachmentItemCheckboxDeselectedDrawable", "fileAttachmentItemCheckboxTextColor", "cameraAttachmentsTabEnabled", "cameraAttachmentsTabIconDrawable", "pollAttachmentsTabEnabled", "pollAttachmentsTabIconDrawable", "allowAccessToCameraButtonText", "allowAccessToCameraIconDrawable", "pickerMediaMode", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;", "systemMediaPickerVisualMediaAllowMultiple", "systemMediaPickerVisualMediaType", "Lio/getstream/chat/android/ui/common/permissions/VisualMediaType;", "<init>", "(ZZILio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;ZLandroid/graphics/drawable/Drawable;Ljava/lang/String;Landroid/graphics/drawable/Drawable;ZLio/getstream/chat/android/ui/font/TextStyle;ZLandroid/graphics/drawable/Drawable;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;ZLandroid/graphics/drawable/Drawable;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;IZLandroid/graphics/drawable/Drawable;ZLandroid/graphics/drawable/Drawable;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;ZLio/getstream/chat/android/ui/common/permissions/VisualMediaType;)V", "getUseDefaultSystemMediaPicker", "()Z", "getSaveAttachmentsOnDismiss", "getAttachmentsPickerBackgroundColor", "()I", "getAllowAccessButtonTextStyle", "()Lio/getstream/chat/android/ui/font/TextStyle;", "getSubmitAttachmentsButtonIconDrawable", "()Landroid/graphics/drawable/Drawable;", "getAttachmentTabToggleButtonStateList", "()Landroid/content/res/ColorStateList;", "getMediaAttachmentsTabEnabled", "getMediaAttachmentsTabIconDrawable", "getAllowAccessToMediaButtonText", "()Ljava/lang/String;", "getAllowAccessToMediaIconDrawable", "getVideoLengthTextVisible", "getVideoLengthTextStyle", "getVideoIconVisible", "getVideoIconDrawable", "getVideoIconDrawableTint", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMediaAttachmentNoMediaText", "getMediaAttachmentNoMediaTextStyle", "getFileAttachmentsTabEnabled", "getFileAttachmentsTabIconDrawable", "getAllowAccessToFilesButtonText", "getAllowAccessToFilesIconDrawable", "getAllowAccessToAudioText", "getAllowAccessToAudioTextStyle", "getAllowAccessToAudioIconDrawable", "getAllowAccessToVisualMediaText", "getAllowAccessToMoreVisualMediaText", "getAllowAccessToVisualMediaTextStyle", "getAllowAccessToVisualMediaIconDrawable", "getRecentFilesText", "getRecentFilesTextStyle", "getFileManagerIconDrawable", "getFileAttachmentsNoFilesText", "getFileAttachmentsNoFilesTextStyle", "getFileAttachmentItemNameTextStyle", "getFileAttachmentItemSizeTextStyle", "getFileAttachmentItemCheckboxSelectedDrawable", "getFileAttachmentItemCheckboxDeselectedDrawable", "getFileAttachmentItemCheckboxTextColor", "getCameraAttachmentsTabEnabled", "getCameraAttachmentsTabIconDrawable", "getPollAttachmentsTabEnabled", "getPollAttachmentsTabIconDrawable", "getAllowAccessToCameraButtonText", "getAllowAccessToCameraIconDrawable", "getPickerMediaMode", "()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;", "getSystemMediaPickerVisualMediaAllowMultiple", "getSystemMediaPickerVisualMediaType", "()Lio/getstream/chat/android/ui/common/permissions/VisualMediaType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "copy", "(ZZILio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;ZLandroid/graphics/drawable/Drawable;Ljava/lang/String;Landroid/graphics/drawable/Drawable;ZLio/getstream/chat/android/ui/font/TextStyle;ZLandroid/graphics/drawable/Drawable;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;ZLandroid/graphics/drawable/Drawable;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;IZLandroid/graphics/drawable/Drawable;ZLandroid/graphics/drawable/Drawable;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;ZLio/getstream/chat/android/ui/common/permissions/VisualMediaType;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;", "equals", "other", "", "hashCode", "toString", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class AttachmentsPickerDialogStyle implements ViewStyle {
    private final TextStyle allowAccessButtonTextStyle;
    private final Drawable allowAccessToAudioIconDrawable;
    private final String allowAccessToAudioText;
    private final TextStyle allowAccessToAudioTextStyle;
    private final String allowAccessToCameraButtonText;
    private final Drawable allowAccessToCameraIconDrawable;
    private final String allowAccessToFilesButtonText;
    private final Drawable allowAccessToFilesIconDrawable;
    private final String allowAccessToMediaButtonText;
    private final Drawable allowAccessToMediaIconDrawable;
    private final String allowAccessToMoreVisualMediaText;
    private final Drawable allowAccessToVisualMediaIconDrawable;
    private final String allowAccessToVisualMediaText;
    private final TextStyle allowAccessToVisualMediaTextStyle;
    private final ColorStateList attachmentTabToggleButtonStateList;
    private final int attachmentsPickerBackgroundColor;
    private final boolean cameraAttachmentsTabEnabled;
    private final Drawable cameraAttachmentsTabIconDrawable;
    private final Drawable fileAttachmentItemCheckboxDeselectedDrawable;
    private final Drawable fileAttachmentItemCheckboxSelectedDrawable;
    private final int fileAttachmentItemCheckboxTextColor;
    private final TextStyle fileAttachmentItemNameTextStyle;
    private final TextStyle fileAttachmentItemSizeTextStyle;
    private final String fileAttachmentsNoFilesText;
    private final TextStyle fileAttachmentsNoFilesTextStyle;
    private final boolean fileAttachmentsTabEnabled;
    private final Drawable fileAttachmentsTabIconDrawable;
    private final Drawable fileManagerIconDrawable;
    private final String mediaAttachmentNoMediaText;
    private final TextStyle mediaAttachmentNoMediaTextStyle;
    private final boolean mediaAttachmentsTabEnabled;
    private final Drawable mediaAttachmentsTabIconDrawable;
    private final PickerMediaMode pickerMediaMode;
    private final boolean pollAttachmentsTabEnabled;
    private final Drawable pollAttachmentsTabIconDrawable;
    private final String recentFilesText;
    private final TextStyle recentFilesTextStyle;
    private final boolean saveAttachmentsOnDismiss;
    private final Drawable submitAttachmentsButtonIconDrawable;
    private final boolean systemMediaPickerVisualMediaAllowMultiple;
    private final VisualMediaType systemMediaPickerVisualMediaType;
    private final boolean useDefaultSystemMediaPicker;
    private final Drawable videoIconDrawable;
    private final Integer videoIconDrawableTint;
    private final boolean videoIconVisible;
    private final TextStyle videoLengthTextStyle;
    private final boolean videoLengthTextVisible;

    public AttachmentsPickerDialogStyle(boolean z4, boolean z13, int i13, TextStyle allowAccessButtonTextStyle, Drawable submitAttachmentsButtonIconDrawable, ColorStateList colorStateList, boolean z14, Drawable mediaAttachmentsTabIconDrawable, String allowAccessToMediaButtonText, Drawable allowAccessToMediaIconDrawable, boolean z15, TextStyle videoLengthTextStyle, boolean z16, Drawable videoIconDrawable, Integer num, String mediaAttachmentNoMediaText, TextStyle mediaAttachmentNoMediaTextStyle, boolean z17, Drawable fileAttachmentsTabIconDrawable, String allowAccessToFilesButtonText, Drawable allowAccessToFilesIconDrawable, String allowAccessToAudioText, TextStyle allowAccessToAudioTextStyle, Drawable allowAccessToAudioIconDrawable, String allowAccessToVisualMediaText, String allowAccessToMoreVisualMediaText, TextStyle allowAccessToVisualMediaTextStyle, Drawable allowAccessToVisualMediaIconDrawable, String recentFilesText, TextStyle recentFilesTextStyle, Drawable fileManagerIconDrawable, String fileAttachmentsNoFilesText, TextStyle fileAttachmentsNoFilesTextStyle, TextStyle fileAttachmentItemNameTextStyle, TextStyle fileAttachmentItemSizeTextStyle, Drawable fileAttachmentItemCheckboxSelectedDrawable, Drawable fileAttachmentItemCheckboxDeselectedDrawable, int i14, boolean z18, Drawable cameraAttachmentsTabIconDrawable, boolean z19, Drawable pollAttachmentsTabIconDrawable, String allowAccessToCameraButtonText, Drawable allowAccessToCameraIconDrawable, PickerMediaMode pickerMediaMode, boolean z24, VisualMediaType systemMediaPickerVisualMediaType) {
        AbstractC22676k.m65750j(allowAccessButtonTextStyle, "allowAccessButtonTextStyle");
        AbstractC22676k.m65750j(submitAttachmentsButtonIconDrawable, "submitAttachmentsButtonIconDrawable");
        AbstractC22676k.m65750j(mediaAttachmentsTabIconDrawable, "mediaAttachmentsTabIconDrawable");
        AbstractC22676k.m65750j(allowAccessToMediaButtonText, "allowAccessToMediaButtonText");
        AbstractC22676k.m65750j(allowAccessToMediaIconDrawable, "allowAccessToMediaIconDrawable");
        AbstractC22676k.m65750j(videoLengthTextStyle, "videoLengthTextStyle");
        AbstractC22676k.m65750j(videoIconDrawable, "videoIconDrawable");
        AbstractC22676k.m65750j(mediaAttachmentNoMediaText, "mediaAttachmentNoMediaText");
        AbstractC22676k.m65750j(mediaAttachmentNoMediaTextStyle, "mediaAttachmentNoMediaTextStyle");
        AbstractC22676k.m65750j(fileAttachmentsTabIconDrawable, "fileAttachmentsTabIconDrawable");
        AbstractC22676k.m65750j(allowAccessToFilesButtonText, "allowAccessToFilesButtonText");
        AbstractC22676k.m65750j(allowAccessToFilesIconDrawable, "allowAccessToFilesIconDrawable");
        AbstractC22676k.m65750j(allowAccessToAudioText, "allowAccessToAudioText");
        AbstractC22676k.m65750j(allowAccessToAudioTextStyle, "allowAccessToAudioTextStyle");
        AbstractC22676k.m65750j(allowAccessToAudioIconDrawable, "allowAccessToAudioIconDrawable");
        AbstractC22676k.m65750j(allowAccessToVisualMediaText, "allowAccessToVisualMediaText");
        AbstractC22676k.m65750j(allowAccessToMoreVisualMediaText, "allowAccessToMoreVisualMediaText");
        AbstractC22676k.m65750j(allowAccessToVisualMediaTextStyle, "allowAccessToVisualMediaTextStyle");
        AbstractC22676k.m65750j(allowAccessToVisualMediaIconDrawable, "allowAccessToVisualMediaIconDrawable");
        AbstractC22676k.m65750j(recentFilesText, "recentFilesText");
        AbstractC22676k.m65750j(recentFilesTextStyle, "recentFilesTextStyle");
        AbstractC22676k.m65750j(fileManagerIconDrawable, "fileManagerIconDrawable");
        AbstractC22676k.m65750j(fileAttachmentsNoFilesText, "fileAttachmentsNoFilesText");
        AbstractC22676k.m65750j(fileAttachmentsNoFilesTextStyle, "fileAttachmentsNoFilesTextStyle");
        AbstractC22676k.m65750j(fileAttachmentItemNameTextStyle, "fileAttachmentItemNameTextStyle");
        AbstractC22676k.m65750j(fileAttachmentItemSizeTextStyle, "fileAttachmentItemSizeTextStyle");
        AbstractC22676k.m65750j(fileAttachmentItemCheckboxSelectedDrawable, "fileAttachmentItemCheckboxSelectedDrawable");
        AbstractC22676k.m65750j(fileAttachmentItemCheckboxDeselectedDrawable, "fileAttachmentItemCheckboxDeselectedDrawable");
        AbstractC22676k.m65750j(cameraAttachmentsTabIconDrawable, "cameraAttachmentsTabIconDrawable");
        AbstractC22676k.m65750j(pollAttachmentsTabIconDrawable, "pollAttachmentsTabIconDrawable");
        AbstractC22676k.m65750j(allowAccessToCameraButtonText, "allowAccessToCameraButtonText");
        AbstractC22676k.m65750j(allowAccessToCameraIconDrawable, "allowAccessToCameraIconDrawable");
        AbstractC22676k.m65750j(pickerMediaMode, "pickerMediaMode");
        AbstractC22676k.m65750j(systemMediaPickerVisualMediaType, "systemMediaPickerVisualMediaType");
        this.useDefaultSystemMediaPicker = z4;
        this.saveAttachmentsOnDismiss = z13;
        this.attachmentsPickerBackgroundColor = i13;
        this.allowAccessButtonTextStyle = allowAccessButtonTextStyle;
        this.submitAttachmentsButtonIconDrawable = submitAttachmentsButtonIconDrawable;
        this.attachmentTabToggleButtonStateList = colorStateList;
        this.mediaAttachmentsTabEnabled = z14;
        this.mediaAttachmentsTabIconDrawable = mediaAttachmentsTabIconDrawable;
        this.allowAccessToMediaButtonText = allowAccessToMediaButtonText;
        this.allowAccessToMediaIconDrawable = allowAccessToMediaIconDrawable;
        this.videoLengthTextVisible = z15;
        this.videoLengthTextStyle = videoLengthTextStyle;
        this.videoIconVisible = z16;
        this.videoIconDrawable = videoIconDrawable;
        this.videoIconDrawableTint = num;
        this.mediaAttachmentNoMediaText = mediaAttachmentNoMediaText;
        this.mediaAttachmentNoMediaTextStyle = mediaAttachmentNoMediaTextStyle;
        this.fileAttachmentsTabEnabled = z17;
        this.fileAttachmentsTabIconDrawable = fileAttachmentsTabIconDrawable;
        this.allowAccessToFilesButtonText = allowAccessToFilesButtonText;
        this.allowAccessToFilesIconDrawable = allowAccessToFilesIconDrawable;
        this.allowAccessToAudioText = allowAccessToAudioText;
        this.allowAccessToAudioTextStyle = allowAccessToAudioTextStyle;
        this.allowAccessToAudioIconDrawable = allowAccessToAudioIconDrawable;
        this.allowAccessToVisualMediaText = allowAccessToVisualMediaText;
        this.allowAccessToMoreVisualMediaText = allowAccessToMoreVisualMediaText;
        this.allowAccessToVisualMediaTextStyle = allowAccessToVisualMediaTextStyle;
        this.allowAccessToVisualMediaIconDrawable = allowAccessToVisualMediaIconDrawable;
        this.recentFilesText = recentFilesText;
        this.recentFilesTextStyle = recentFilesTextStyle;
        this.fileManagerIconDrawable = fileManagerIconDrawable;
        this.fileAttachmentsNoFilesText = fileAttachmentsNoFilesText;
        this.fileAttachmentsNoFilesTextStyle = fileAttachmentsNoFilesTextStyle;
        this.fileAttachmentItemNameTextStyle = fileAttachmentItemNameTextStyle;
        this.fileAttachmentItemSizeTextStyle = fileAttachmentItemSizeTextStyle;
        this.fileAttachmentItemCheckboxSelectedDrawable = fileAttachmentItemCheckboxSelectedDrawable;
        this.fileAttachmentItemCheckboxDeselectedDrawable = fileAttachmentItemCheckboxDeselectedDrawable;
        this.fileAttachmentItemCheckboxTextColor = i14;
        this.cameraAttachmentsTabEnabled = z18;
        this.cameraAttachmentsTabIconDrawable = cameraAttachmentsTabIconDrawable;
        this.pollAttachmentsTabEnabled = z19;
        this.pollAttachmentsTabIconDrawable = pollAttachmentsTabIconDrawable;
        this.allowAccessToCameraButtonText = allowAccessToCameraButtonText;
        this.allowAccessToCameraIconDrawable = allowAccessToCameraIconDrawable;
        this.pickerMediaMode = pickerMediaMode;
        this.systemMediaPickerVisualMediaAllowMultiple = z24;
        this.systemMediaPickerVisualMediaType = systemMediaPickerVisualMediaType;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getUseDefaultSystemMediaPicker() {
        return this.useDefaultSystemMediaPicker;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Drawable getAllowAccessToMediaIconDrawable() {
        return this.allowAccessToMediaIconDrawable;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getVideoLengthTextVisible() {
        return this.videoLengthTextVisible;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final TextStyle getVideoLengthTextStyle() {
        return this.videoLengthTextStyle;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getVideoIconVisible() {
        return this.videoIconVisible;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Drawable getVideoIconDrawable() {
        return this.videoIconDrawable;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Integer getVideoIconDrawableTint() {
        return this.videoIconDrawableTint;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getMediaAttachmentNoMediaText() {
        return this.mediaAttachmentNoMediaText;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final TextStyle getMediaAttachmentNoMediaTextStyle() {
        return this.mediaAttachmentNoMediaTextStyle;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final boolean getFileAttachmentsTabEnabled() {
        return this.fileAttachmentsTabEnabled;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Drawable getFileAttachmentsTabIconDrawable() {
        return this.fileAttachmentsTabIconDrawable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSaveAttachmentsOnDismiss() {
        return this.saveAttachmentsOnDismiss;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getAllowAccessToFilesButtonText() {
        return this.allowAccessToFilesButtonText;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Drawable getAllowAccessToFilesIconDrawable() {
        return this.allowAccessToFilesIconDrawable;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getAllowAccessToAudioText() {
        return this.allowAccessToAudioText;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final TextStyle getAllowAccessToAudioTextStyle() {
        return this.allowAccessToAudioTextStyle;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Drawable getAllowAccessToAudioIconDrawable() {
        return this.allowAccessToAudioIconDrawable;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getAllowAccessToVisualMediaText() {
        return this.allowAccessToVisualMediaText;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getAllowAccessToMoreVisualMediaText() {
        return this.allowAccessToMoreVisualMediaText;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final TextStyle getAllowAccessToVisualMediaTextStyle() {
        return this.allowAccessToVisualMediaTextStyle;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Drawable getAllowAccessToVisualMediaIconDrawable() {
        return this.allowAccessToVisualMediaIconDrawable;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getRecentFilesText() {
        return this.recentFilesText;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAttachmentsPickerBackgroundColor() {
        return this.attachmentsPickerBackgroundColor;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final TextStyle getRecentFilesTextStyle() {
        return this.recentFilesTextStyle;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final Drawable getFileManagerIconDrawable() {
        return this.fileManagerIconDrawable;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getFileAttachmentsNoFilesText() {
        return this.fileAttachmentsNoFilesText;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final TextStyle getFileAttachmentsNoFilesTextStyle() {
        return this.fileAttachmentsNoFilesTextStyle;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final TextStyle getFileAttachmentItemNameTextStyle() {
        return this.fileAttachmentItemNameTextStyle;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final TextStyle getFileAttachmentItemSizeTextStyle() {
        return this.fileAttachmentItemSizeTextStyle;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final Drawable getFileAttachmentItemCheckboxSelectedDrawable() {
        return this.fileAttachmentItemCheckboxSelectedDrawable;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final Drawable getFileAttachmentItemCheckboxDeselectedDrawable() {
        return this.fileAttachmentItemCheckboxDeselectedDrawable;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final int getFileAttachmentItemCheckboxTextColor() {
        return this.fileAttachmentItemCheckboxTextColor;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final boolean getCameraAttachmentsTabEnabled() {
        return this.cameraAttachmentsTabEnabled;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TextStyle getAllowAccessButtonTextStyle() {
        return this.allowAccessButtonTextStyle;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final Drawable getCameraAttachmentsTabIconDrawable() {
        return this.cameraAttachmentsTabIconDrawable;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final boolean getPollAttachmentsTabEnabled() {
        return this.pollAttachmentsTabEnabled;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final Drawable getPollAttachmentsTabIconDrawable() {
        return this.pollAttachmentsTabIconDrawable;
    }

    /* JADX INFO: renamed from: component43, reason: from getter */
    public final String getAllowAccessToCameraButtonText() {
        return this.allowAccessToCameraButtonText;
    }

    /* JADX INFO: renamed from: component44, reason: from getter */
    public final Drawable getAllowAccessToCameraIconDrawable() {
        return this.allowAccessToCameraIconDrawable;
    }

    /* JADX INFO: renamed from: component45, reason: from getter */
    public final PickerMediaMode getPickerMediaMode() {
        return this.pickerMediaMode;
    }

    /* JADX INFO: renamed from: component46, reason: from getter */
    public final boolean getSystemMediaPickerVisualMediaAllowMultiple() {
        return this.systemMediaPickerVisualMediaAllowMultiple;
    }

    /* JADX INFO: renamed from: component47, reason: from getter */
    public final VisualMediaType getSystemMediaPickerVisualMediaType() {
        return this.systemMediaPickerVisualMediaType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Drawable getSubmitAttachmentsButtonIconDrawable() {
        return this.submitAttachmentsButtonIconDrawable;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ColorStateList getAttachmentTabToggleButtonStateList() {
        return this.attachmentTabToggleButtonStateList;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getMediaAttachmentsTabEnabled() {
        return this.mediaAttachmentsTabEnabled;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Drawable getMediaAttachmentsTabIconDrawable() {
        return this.mediaAttachmentsTabIconDrawable;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAllowAccessToMediaButtonText() {
        return this.allowAccessToMediaButtonText;
    }

    public final AttachmentsPickerDialogStyle copy(boolean useDefaultSystemMediaPicker, boolean saveAttachmentsOnDismiss, int attachmentsPickerBackgroundColor, TextStyle allowAccessButtonTextStyle, Drawable submitAttachmentsButtonIconDrawable, ColorStateList attachmentTabToggleButtonStateList, boolean mediaAttachmentsTabEnabled, Drawable mediaAttachmentsTabIconDrawable, String allowAccessToMediaButtonText, Drawable allowAccessToMediaIconDrawable, boolean videoLengthTextVisible, TextStyle videoLengthTextStyle, boolean videoIconVisible, Drawable videoIconDrawable, Integer videoIconDrawableTint, String mediaAttachmentNoMediaText, TextStyle mediaAttachmentNoMediaTextStyle, boolean fileAttachmentsTabEnabled, Drawable fileAttachmentsTabIconDrawable, String allowAccessToFilesButtonText, Drawable allowAccessToFilesIconDrawable, String allowAccessToAudioText, TextStyle allowAccessToAudioTextStyle, Drawable allowAccessToAudioIconDrawable, String allowAccessToVisualMediaText, String allowAccessToMoreVisualMediaText, TextStyle allowAccessToVisualMediaTextStyle, Drawable allowAccessToVisualMediaIconDrawable, String recentFilesText, TextStyle recentFilesTextStyle, Drawable fileManagerIconDrawable, String fileAttachmentsNoFilesText, TextStyle fileAttachmentsNoFilesTextStyle, TextStyle fileAttachmentItemNameTextStyle, TextStyle fileAttachmentItemSizeTextStyle, Drawable fileAttachmentItemCheckboxSelectedDrawable, Drawable fileAttachmentItemCheckboxDeselectedDrawable, int fileAttachmentItemCheckboxTextColor, boolean cameraAttachmentsTabEnabled, Drawable cameraAttachmentsTabIconDrawable, boolean pollAttachmentsTabEnabled, Drawable pollAttachmentsTabIconDrawable, String allowAccessToCameraButtonText, Drawable allowAccessToCameraIconDrawable, PickerMediaMode pickerMediaMode, boolean systemMediaPickerVisualMediaAllowMultiple, VisualMediaType systemMediaPickerVisualMediaType) {
        AbstractC22676k.m65750j(allowAccessButtonTextStyle, "allowAccessButtonTextStyle");
        AbstractC22676k.m65750j(submitAttachmentsButtonIconDrawable, "submitAttachmentsButtonIconDrawable");
        AbstractC22676k.m65750j(mediaAttachmentsTabIconDrawable, "mediaAttachmentsTabIconDrawable");
        AbstractC22676k.m65750j(allowAccessToMediaButtonText, "allowAccessToMediaButtonText");
        AbstractC22676k.m65750j(allowAccessToMediaIconDrawable, "allowAccessToMediaIconDrawable");
        AbstractC22676k.m65750j(videoLengthTextStyle, "videoLengthTextStyle");
        AbstractC22676k.m65750j(videoIconDrawable, "videoIconDrawable");
        AbstractC22676k.m65750j(mediaAttachmentNoMediaText, "mediaAttachmentNoMediaText");
        AbstractC22676k.m65750j(mediaAttachmentNoMediaTextStyle, "mediaAttachmentNoMediaTextStyle");
        AbstractC22676k.m65750j(fileAttachmentsTabIconDrawable, "fileAttachmentsTabIconDrawable");
        AbstractC22676k.m65750j(allowAccessToFilesButtonText, "allowAccessToFilesButtonText");
        AbstractC22676k.m65750j(allowAccessToFilesIconDrawable, "allowAccessToFilesIconDrawable");
        AbstractC22676k.m65750j(allowAccessToAudioText, "allowAccessToAudioText");
        AbstractC22676k.m65750j(allowAccessToAudioTextStyle, "allowAccessToAudioTextStyle");
        AbstractC22676k.m65750j(allowAccessToAudioIconDrawable, "allowAccessToAudioIconDrawable");
        AbstractC22676k.m65750j(allowAccessToVisualMediaText, "allowAccessToVisualMediaText");
        AbstractC22676k.m65750j(allowAccessToMoreVisualMediaText, "allowAccessToMoreVisualMediaText");
        AbstractC22676k.m65750j(allowAccessToVisualMediaTextStyle, "allowAccessToVisualMediaTextStyle");
        AbstractC22676k.m65750j(allowAccessToVisualMediaIconDrawable, "allowAccessToVisualMediaIconDrawable");
        AbstractC22676k.m65750j(recentFilesText, "recentFilesText");
        AbstractC22676k.m65750j(recentFilesTextStyle, "recentFilesTextStyle");
        AbstractC22676k.m65750j(fileManagerIconDrawable, "fileManagerIconDrawable");
        AbstractC22676k.m65750j(fileAttachmentsNoFilesText, "fileAttachmentsNoFilesText");
        AbstractC22676k.m65750j(fileAttachmentsNoFilesTextStyle, "fileAttachmentsNoFilesTextStyle");
        AbstractC22676k.m65750j(fileAttachmentItemNameTextStyle, "fileAttachmentItemNameTextStyle");
        AbstractC22676k.m65750j(fileAttachmentItemSizeTextStyle, "fileAttachmentItemSizeTextStyle");
        AbstractC22676k.m65750j(fileAttachmentItemCheckboxSelectedDrawable, "fileAttachmentItemCheckboxSelectedDrawable");
        AbstractC22676k.m65750j(fileAttachmentItemCheckboxDeselectedDrawable, "fileAttachmentItemCheckboxDeselectedDrawable");
        AbstractC22676k.m65750j(cameraAttachmentsTabIconDrawable, "cameraAttachmentsTabIconDrawable");
        AbstractC22676k.m65750j(pollAttachmentsTabIconDrawable, "pollAttachmentsTabIconDrawable");
        AbstractC22676k.m65750j(allowAccessToCameraButtonText, "allowAccessToCameraButtonText");
        AbstractC22676k.m65750j(allowAccessToCameraIconDrawable, "allowAccessToCameraIconDrawable");
        AbstractC22676k.m65750j(pickerMediaMode, "pickerMediaMode");
        AbstractC22676k.m65750j(systemMediaPickerVisualMediaType, "systemMediaPickerVisualMediaType");
        return new AttachmentsPickerDialogStyle(useDefaultSystemMediaPicker, saveAttachmentsOnDismiss, attachmentsPickerBackgroundColor, allowAccessButtonTextStyle, submitAttachmentsButtonIconDrawable, attachmentTabToggleButtonStateList, mediaAttachmentsTabEnabled, mediaAttachmentsTabIconDrawable, allowAccessToMediaButtonText, allowAccessToMediaIconDrawable, videoLengthTextVisible, videoLengthTextStyle, videoIconVisible, videoIconDrawable, videoIconDrawableTint, mediaAttachmentNoMediaText, mediaAttachmentNoMediaTextStyle, fileAttachmentsTabEnabled, fileAttachmentsTabIconDrawable, allowAccessToFilesButtonText, allowAccessToFilesIconDrawable, allowAccessToAudioText, allowAccessToAudioTextStyle, allowAccessToAudioIconDrawable, allowAccessToVisualMediaText, allowAccessToMoreVisualMediaText, allowAccessToVisualMediaTextStyle, allowAccessToVisualMediaIconDrawable, recentFilesText, recentFilesTextStyle, fileManagerIconDrawable, fileAttachmentsNoFilesText, fileAttachmentsNoFilesTextStyle, fileAttachmentItemNameTextStyle, fileAttachmentItemSizeTextStyle, fileAttachmentItemCheckboxSelectedDrawable, fileAttachmentItemCheckboxDeselectedDrawable, fileAttachmentItemCheckboxTextColor, cameraAttachmentsTabEnabled, cameraAttachmentsTabIconDrawable, pollAttachmentsTabEnabled, pollAttachmentsTabIconDrawable, allowAccessToCameraButtonText, allowAccessToCameraIconDrawable, pickerMediaMode, systemMediaPickerVisualMediaAllowMultiple, systemMediaPickerVisualMediaType);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttachmentsPickerDialogStyle)) {
            return false;
        }
        AttachmentsPickerDialogStyle attachmentsPickerDialogStyle = (AttachmentsPickerDialogStyle) other;
        return this.useDefaultSystemMediaPicker == attachmentsPickerDialogStyle.useDefaultSystemMediaPicker && this.saveAttachmentsOnDismiss == attachmentsPickerDialogStyle.saveAttachmentsOnDismiss && this.attachmentsPickerBackgroundColor == attachmentsPickerDialogStyle.attachmentsPickerBackgroundColor && AbstractC22676k.m65745e(this.allowAccessButtonTextStyle, attachmentsPickerDialogStyle.allowAccessButtonTextStyle) && AbstractC22676k.m65745e(this.submitAttachmentsButtonIconDrawable, attachmentsPickerDialogStyle.submitAttachmentsButtonIconDrawable) && AbstractC22676k.m65745e(this.attachmentTabToggleButtonStateList, attachmentsPickerDialogStyle.attachmentTabToggleButtonStateList) && this.mediaAttachmentsTabEnabled == attachmentsPickerDialogStyle.mediaAttachmentsTabEnabled && AbstractC22676k.m65745e(this.mediaAttachmentsTabIconDrawable, attachmentsPickerDialogStyle.mediaAttachmentsTabIconDrawable) && AbstractC22676k.m65745e(this.allowAccessToMediaButtonText, attachmentsPickerDialogStyle.allowAccessToMediaButtonText) && AbstractC22676k.m65745e(this.allowAccessToMediaIconDrawable, attachmentsPickerDialogStyle.allowAccessToMediaIconDrawable) && this.videoLengthTextVisible == attachmentsPickerDialogStyle.videoLengthTextVisible && AbstractC22676k.m65745e(this.videoLengthTextStyle, attachmentsPickerDialogStyle.videoLengthTextStyle) && this.videoIconVisible == attachmentsPickerDialogStyle.videoIconVisible && AbstractC22676k.m65745e(this.videoIconDrawable, attachmentsPickerDialogStyle.videoIconDrawable) && AbstractC22676k.m65745e(this.videoIconDrawableTint, attachmentsPickerDialogStyle.videoIconDrawableTint) && AbstractC22676k.m65745e(this.mediaAttachmentNoMediaText, attachmentsPickerDialogStyle.mediaAttachmentNoMediaText) && AbstractC22676k.m65745e(this.mediaAttachmentNoMediaTextStyle, attachmentsPickerDialogStyle.mediaAttachmentNoMediaTextStyle) && this.fileAttachmentsTabEnabled == attachmentsPickerDialogStyle.fileAttachmentsTabEnabled && AbstractC22676k.m65745e(this.fileAttachmentsTabIconDrawable, attachmentsPickerDialogStyle.fileAttachmentsTabIconDrawable) && AbstractC22676k.m65745e(this.allowAccessToFilesButtonText, attachmentsPickerDialogStyle.allowAccessToFilesButtonText) && AbstractC22676k.m65745e(this.allowAccessToFilesIconDrawable, attachmentsPickerDialogStyle.allowAccessToFilesIconDrawable) && AbstractC22676k.m65745e(this.allowAccessToAudioText, attachmentsPickerDialogStyle.allowAccessToAudioText) && AbstractC22676k.m65745e(this.allowAccessToAudioTextStyle, attachmentsPickerDialogStyle.allowAccessToAudioTextStyle) && AbstractC22676k.m65745e(this.allowAccessToAudioIconDrawable, attachmentsPickerDialogStyle.allowAccessToAudioIconDrawable) && AbstractC22676k.m65745e(this.allowAccessToVisualMediaText, attachmentsPickerDialogStyle.allowAccessToVisualMediaText) && AbstractC22676k.m65745e(this.allowAccessToMoreVisualMediaText, attachmentsPickerDialogStyle.allowAccessToMoreVisualMediaText) && AbstractC22676k.m65745e(this.allowAccessToVisualMediaTextStyle, attachmentsPickerDialogStyle.allowAccessToVisualMediaTextStyle) && AbstractC22676k.m65745e(this.allowAccessToVisualMediaIconDrawable, attachmentsPickerDialogStyle.allowAccessToVisualMediaIconDrawable) && AbstractC22676k.m65745e(this.recentFilesText, attachmentsPickerDialogStyle.recentFilesText) && AbstractC22676k.m65745e(this.recentFilesTextStyle, attachmentsPickerDialogStyle.recentFilesTextStyle) && AbstractC22676k.m65745e(this.fileManagerIconDrawable, attachmentsPickerDialogStyle.fileManagerIconDrawable) && AbstractC22676k.m65745e(this.fileAttachmentsNoFilesText, attachmentsPickerDialogStyle.fileAttachmentsNoFilesText) && AbstractC22676k.m65745e(this.fileAttachmentsNoFilesTextStyle, attachmentsPickerDialogStyle.fileAttachmentsNoFilesTextStyle) && AbstractC22676k.m65745e(this.fileAttachmentItemNameTextStyle, attachmentsPickerDialogStyle.fileAttachmentItemNameTextStyle) && AbstractC22676k.m65745e(this.fileAttachmentItemSizeTextStyle, attachmentsPickerDialogStyle.fileAttachmentItemSizeTextStyle) && AbstractC22676k.m65745e(this.fileAttachmentItemCheckboxSelectedDrawable, attachmentsPickerDialogStyle.fileAttachmentItemCheckboxSelectedDrawable) && AbstractC22676k.m65745e(this.fileAttachmentItemCheckboxDeselectedDrawable, attachmentsPickerDialogStyle.fileAttachmentItemCheckboxDeselectedDrawable) && this.fileAttachmentItemCheckboxTextColor == attachmentsPickerDialogStyle.fileAttachmentItemCheckboxTextColor && this.cameraAttachmentsTabEnabled == attachmentsPickerDialogStyle.cameraAttachmentsTabEnabled && AbstractC22676k.m65745e(this.cameraAttachmentsTabIconDrawable, attachmentsPickerDialogStyle.cameraAttachmentsTabIconDrawable) && this.pollAttachmentsTabEnabled == attachmentsPickerDialogStyle.pollAttachmentsTabEnabled && AbstractC22676k.m65745e(this.pollAttachmentsTabIconDrawable, attachmentsPickerDialogStyle.pollAttachmentsTabIconDrawable) && AbstractC22676k.m65745e(this.allowAccessToCameraButtonText, attachmentsPickerDialogStyle.allowAccessToCameraButtonText) && AbstractC22676k.m65745e(this.allowAccessToCameraIconDrawable, attachmentsPickerDialogStyle.allowAccessToCameraIconDrawable) && this.pickerMediaMode == attachmentsPickerDialogStyle.pickerMediaMode && this.systemMediaPickerVisualMediaAllowMultiple == attachmentsPickerDialogStyle.systemMediaPickerVisualMediaAllowMultiple && this.systemMediaPickerVisualMediaType == attachmentsPickerDialogStyle.systemMediaPickerVisualMediaType;
    }

    public final TextStyle getAllowAccessButtonTextStyle() {
        return this.allowAccessButtonTextStyle;
    }

    public final Drawable getAllowAccessToAudioIconDrawable() {
        return this.allowAccessToAudioIconDrawable;
    }

    public final String getAllowAccessToAudioText() {
        return this.allowAccessToAudioText;
    }

    public final TextStyle getAllowAccessToAudioTextStyle() {
        return this.allowAccessToAudioTextStyle;
    }

    public final String getAllowAccessToCameraButtonText() {
        return this.allowAccessToCameraButtonText;
    }

    public final Drawable getAllowAccessToCameraIconDrawable() {
        return this.allowAccessToCameraIconDrawable;
    }

    public final String getAllowAccessToFilesButtonText() {
        return this.allowAccessToFilesButtonText;
    }

    public final Drawable getAllowAccessToFilesIconDrawable() {
        return this.allowAccessToFilesIconDrawable;
    }

    public final String getAllowAccessToMediaButtonText() {
        return this.allowAccessToMediaButtonText;
    }

    public final Drawable getAllowAccessToMediaIconDrawable() {
        return this.allowAccessToMediaIconDrawable;
    }

    public final String getAllowAccessToMoreVisualMediaText() {
        return this.allowAccessToMoreVisualMediaText;
    }

    public final Drawable getAllowAccessToVisualMediaIconDrawable() {
        return this.allowAccessToVisualMediaIconDrawable;
    }

    public final String getAllowAccessToVisualMediaText() {
        return this.allowAccessToVisualMediaText;
    }

    public final TextStyle getAllowAccessToVisualMediaTextStyle() {
        return this.allowAccessToVisualMediaTextStyle;
    }

    public final ColorStateList getAttachmentTabToggleButtonStateList() {
        return this.attachmentTabToggleButtonStateList;
    }

    public final int getAttachmentsPickerBackgroundColor() {
        return this.attachmentsPickerBackgroundColor;
    }

    public final boolean getCameraAttachmentsTabEnabled() {
        return this.cameraAttachmentsTabEnabled;
    }

    public final Drawable getCameraAttachmentsTabIconDrawable() {
        return this.cameraAttachmentsTabIconDrawable;
    }

    public final Drawable getFileAttachmentItemCheckboxDeselectedDrawable() {
        return this.fileAttachmentItemCheckboxDeselectedDrawable;
    }

    public final Drawable getFileAttachmentItemCheckboxSelectedDrawable() {
        return this.fileAttachmentItemCheckboxSelectedDrawable;
    }

    public final int getFileAttachmentItemCheckboxTextColor() {
        return this.fileAttachmentItemCheckboxTextColor;
    }

    public final TextStyle getFileAttachmentItemNameTextStyle() {
        return this.fileAttachmentItemNameTextStyle;
    }

    public final TextStyle getFileAttachmentItemSizeTextStyle() {
        return this.fileAttachmentItemSizeTextStyle;
    }

    public final String getFileAttachmentsNoFilesText() {
        return this.fileAttachmentsNoFilesText;
    }

    public final TextStyle getFileAttachmentsNoFilesTextStyle() {
        return this.fileAttachmentsNoFilesTextStyle;
    }

    public final boolean getFileAttachmentsTabEnabled() {
        return this.fileAttachmentsTabEnabled;
    }

    public final Drawable getFileAttachmentsTabIconDrawable() {
        return this.fileAttachmentsTabIconDrawable;
    }

    public final Drawable getFileManagerIconDrawable() {
        return this.fileManagerIconDrawable;
    }

    public final String getMediaAttachmentNoMediaText() {
        return this.mediaAttachmentNoMediaText;
    }

    public final TextStyle getMediaAttachmentNoMediaTextStyle() {
        return this.mediaAttachmentNoMediaTextStyle;
    }

    public final boolean getMediaAttachmentsTabEnabled() {
        return this.mediaAttachmentsTabEnabled;
    }

    public final Drawable getMediaAttachmentsTabIconDrawable() {
        return this.mediaAttachmentsTabIconDrawable;
    }

    public final PickerMediaMode getPickerMediaMode() {
        return this.pickerMediaMode;
    }

    public final boolean getPollAttachmentsTabEnabled() {
        return this.pollAttachmentsTabEnabled;
    }

    public final Drawable getPollAttachmentsTabIconDrawable() {
        return this.pollAttachmentsTabIconDrawable;
    }

    public final String getRecentFilesText() {
        return this.recentFilesText;
    }

    public final TextStyle getRecentFilesTextStyle() {
        return this.recentFilesTextStyle;
    }

    public final boolean getSaveAttachmentsOnDismiss() {
        return this.saveAttachmentsOnDismiss;
    }

    public final Drawable getSubmitAttachmentsButtonIconDrawable() {
        return this.submitAttachmentsButtonIconDrawable;
    }

    public final boolean getSystemMediaPickerVisualMediaAllowMultiple() {
        return this.systemMediaPickerVisualMediaAllowMultiple;
    }

    public final VisualMediaType getSystemMediaPickerVisualMediaType() {
        return this.systemMediaPickerVisualMediaType;
    }

    public final boolean getUseDefaultSystemMediaPicker() {
        return this.useDefaultSystemMediaPicker;
    }

    public final Drawable getVideoIconDrawable() {
        return this.videoIconDrawable;
    }

    public final Integer getVideoIconDrawableTint() {
        return this.videoIconDrawableTint;
    }

    public final boolean getVideoIconVisible() {
        return this.videoIconVisible;
    }

    public final TextStyle getVideoLengthTextStyle() {
        return this.videoLengthTextStyle;
    }

    public final boolean getVideoLengthTextVisible() {
        return this.videoLengthTextVisible;
    }

    public final int hashCode() {
        int iM79497a = AbstractC26725a.m79497a(this.submitAttachmentsButtonIconDrawable, AbstractC26725a.m79499c(this.allowAccessButtonTextStyle, AbstractC11266d.m30448b(this.attachmentsPickerBackgroundColor, AbstractC2875y.m8289b(Boolean.hashCode(this.useDefaultSystemMediaPicker) * 31, 31, this.saveAttachmentsOnDismiss), 31), 31), 31);
        ColorStateList colorStateList = this.attachmentTabToggleButtonStateList;
        int iM79497a2 = AbstractC26725a.m79497a(this.videoIconDrawable, AbstractC2875y.m8289b(AbstractC26725a.m79499c(this.videoLengthTextStyle, AbstractC2875y.m8289b(AbstractC26725a.m79497a(this.allowAccessToMediaIconDrawable, AbstractC11266d.m30450d(AbstractC26725a.m79497a(this.mediaAttachmentsTabIconDrawable, AbstractC2875y.m8289b((iM79497a + (colorStateList == null ? 0 : colorStateList.hashCode())) * 31, 31, this.mediaAttachmentsTabEnabled), 31), 31, this.allowAccessToMediaButtonText), 31), 31, this.videoLengthTextVisible), 31), 31, this.videoIconVisible), 31);
        Integer num = this.videoIconDrawableTint;
        return this.systemMediaPickerVisualMediaType.hashCode() + AbstractC2875y.m8289b((this.pickerMediaMode.hashCode() + AbstractC26725a.m79497a(this.allowAccessToCameraIconDrawable, AbstractC11266d.m30450d(AbstractC26725a.m79497a(this.pollAttachmentsTabIconDrawable, AbstractC2875y.m8289b(AbstractC26725a.m79497a(this.cameraAttachmentsTabIconDrawable, AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.fileAttachmentItemCheckboxTextColor, AbstractC26725a.m79497a(this.fileAttachmentItemCheckboxDeselectedDrawable, AbstractC26725a.m79497a(this.fileAttachmentItemCheckboxSelectedDrawable, AbstractC26725a.m79499c(this.fileAttachmentItemSizeTextStyle, AbstractC26725a.m79499c(this.fileAttachmentItemNameTextStyle, AbstractC26725a.m79499c(this.fileAttachmentsNoFilesTextStyle, AbstractC11266d.m30450d(AbstractC26725a.m79497a(this.fileManagerIconDrawable, AbstractC26725a.m79499c(this.recentFilesTextStyle, AbstractC11266d.m30450d(AbstractC26725a.m79497a(this.allowAccessToVisualMediaIconDrawable, AbstractC26725a.m79499c(this.allowAccessToVisualMediaTextStyle, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC26725a.m79497a(this.allowAccessToAudioIconDrawable, AbstractC26725a.m79499c(this.allowAccessToAudioTextStyle, AbstractC11266d.m30450d(AbstractC26725a.m79497a(this.allowAccessToFilesIconDrawable, AbstractC11266d.m30450d(AbstractC26725a.m79497a(this.fileAttachmentsTabIconDrawable, AbstractC2875y.m8289b(AbstractC26725a.m79499c(this.mediaAttachmentNoMediaTextStyle, AbstractC11266d.m30450d((iM79497a2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.mediaAttachmentNoMediaText), 31), 31, this.fileAttachmentsTabEnabled), 31), 31, this.allowAccessToFilesButtonText), 31), 31, this.allowAccessToAudioText), 31), 31), 31, this.allowAccessToVisualMediaText), 31, this.allowAccessToMoreVisualMediaText), 31), 31), 31, this.recentFilesText), 31), 31), 31, this.fileAttachmentsNoFilesText), 31), 31), 31), 31), 31), 31), 31, this.cameraAttachmentsTabEnabled), 31), 31, this.pollAttachmentsTabEnabled), 31), 31, this.allowAccessToCameraButtonText), 31)) * 31, 31, this.systemMediaPickerVisualMediaAllowMultiple);
    }

    public final String toString() {
        boolean z4 = this.useDefaultSystemMediaPicker;
        boolean z13 = this.saveAttachmentsOnDismiss;
        int i13 = this.attachmentsPickerBackgroundColor;
        TextStyle textStyle = this.allowAccessButtonTextStyle;
        Drawable drawable = this.submitAttachmentsButtonIconDrawable;
        ColorStateList colorStateList = this.attachmentTabToggleButtonStateList;
        boolean z14 = this.mediaAttachmentsTabEnabled;
        Drawable drawable2 = this.mediaAttachmentsTabIconDrawable;
        String str = this.allowAccessToMediaButtonText;
        Drawable drawable3 = this.allowAccessToMediaIconDrawable;
        boolean z15 = this.videoLengthTextVisible;
        TextStyle textStyle2 = this.videoLengthTextStyle;
        boolean z16 = this.videoIconVisible;
        Drawable drawable4 = this.videoIconDrawable;
        Integer num = this.videoIconDrawableTint;
        String str2 = this.mediaAttachmentNoMediaText;
        TextStyle textStyle3 = this.mediaAttachmentNoMediaTextStyle;
        boolean z17 = this.fileAttachmentsTabEnabled;
        Drawable drawable5 = this.fileAttachmentsTabIconDrawable;
        String str3 = this.allowAccessToFilesButtonText;
        Drawable drawable6 = this.allowAccessToFilesIconDrawable;
        String str4 = this.allowAccessToAudioText;
        TextStyle textStyle4 = this.allowAccessToAudioTextStyle;
        Drawable drawable7 = this.allowAccessToAudioIconDrawable;
        String str5 = this.allowAccessToVisualMediaText;
        String str6 = this.allowAccessToMoreVisualMediaText;
        TextStyle textStyle5 = this.allowAccessToVisualMediaTextStyle;
        Drawable drawable8 = this.allowAccessToVisualMediaIconDrawable;
        String str7 = this.recentFilesText;
        TextStyle textStyle6 = this.recentFilesTextStyle;
        Drawable drawable9 = this.fileManagerIconDrawable;
        String str8 = this.fileAttachmentsNoFilesText;
        TextStyle textStyle7 = this.fileAttachmentsNoFilesTextStyle;
        TextStyle textStyle8 = this.fileAttachmentItemNameTextStyle;
        TextStyle textStyle9 = this.fileAttachmentItemSizeTextStyle;
        Drawable drawable10 = this.fileAttachmentItemCheckboxSelectedDrawable;
        Drawable drawable11 = this.fileAttachmentItemCheckboxDeselectedDrawable;
        int i14 = this.fileAttachmentItemCheckboxTextColor;
        boolean z18 = this.cameraAttachmentsTabEnabled;
        Drawable drawable12 = this.cameraAttachmentsTabIconDrawable;
        boolean z19 = this.pollAttachmentsTabEnabled;
        Drawable drawable13 = this.pollAttachmentsTabIconDrawable;
        String str9 = this.allowAccessToCameraButtonText;
        Drawable drawable14 = this.allowAccessToCameraIconDrawable;
        PickerMediaMode pickerMediaMode = this.pickerMediaMode;
        boolean z24 = this.systemMediaPickerVisualMediaAllowMultiple;
        VisualMediaType visualMediaType = this.systemMediaPickerVisualMediaType;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("AttachmentsPickerDialogStyle(useDefaultSystemMediaPicker=", ", saveAttachmentsOnDismiss=", ", attachmentsPickerBackgroundColor=", z4, z13);
        sbM32002u.append(i13);
        sbM32002u.append(", allowAccessButtonTextStyle=");
        sbM32002u.append(textStyle);
        sbM32002u.append(", submitAttachmentsButtonIconDrawable=");
        sbM32002u.append(drawable);
        sbM32002u.append(", attachmentTabToggleButtonStateList=");
        sbM32002u.append(colorStateList);
        sbM32002u.append(", mediaAttachmentsTabEnabled=");
        sbM32002u.append(z14);
        sbM32002u.append(", mediaAttachmentsTabIconDrawable=");
        sbM32002u.append(drawable2);
        sbM32002u.append(", allowAccessToMediaButtonText=");
        sbM32002u.append(str);
        sbM32002u.append(", allowAccessToMediaIconDrawable=");
        sbM32002u.append(drawable3);
        sbM32002u.append(", videoLengthTextVisible=");
        sbM32002u.append(z15);
        sbM32002u.append(", videoLengthTextStyle=");
        sbM32002u.append(textStyle2);
        sbM32002u.append(", videoIconVisible=");
        sbM32002u.append(z16);
        sbM32002u.append(", videoIconDrawable=");
        sbM32002u.append(drawable4);
        sbM32002u.append(", videoIconDrawableTint=");
        AbstractC13673n.m38577x(num, ", mediaAttachmentNoMediaText=", str2, ", mediaAttachmentNoMediaTextStyle=", sbM32002u);
        sbM32002u.append(textStyle3);
        sbM32002u.append(", fileAttachmentsTabEnabled=");
        sbM32002u.append(z17);
        sbM32002u.append(", fileAttachmentsTabIconDrawable=");
        sbM32002u.append(drawable5);
        sbM32002u.append(", allowAccessToFilesButtonText=");
        sbM32002u.append(str3);
        sbM32002u.append(", allowAccessToFilesIconDrawable=");
        sbM32002u.append(drawable6);
        sbM32002u.append(", allowAccessToAudioText=");
        sbM32002u.append(str4);
        sbM32002u.append(", allowAccessToAudioTextStyle=");
        sbM32002u.append(textStyle4);
        sbM32002u.append(", allowAccessToAudioIconDrawable=");
        sbM32002u.append(drawable7);
        sbM32002u.append(", allowAccessToVisualMediaText=");
        AbstractC11266d.m30444B(sbM32002u, str5, ", allowAccessToMoreVisualMediaText=", str6, ", allowAccessToVisualMediaTextStyle=");
        sbM32002u.append(textStyle5);
        sbM32002u.append(", allowAccessToVisualMediaIconDrawable=");
        sbM32002u.append(drawable8);
        sbM32002u.append(", recentFilesText=");
        sbM32002u.append(str7);
        sbM32002u.append(", recentFilesTextStyle=");
        sbM32002u.append(textStyle6);
        sbM32002u.append(", fileManagerIconDrawable=");
        sbM32002u.append(drawable9);
        sbM32002u.append(", fileAttachmentsNoFilesText=");
        sbM32002u.append(str8);
        sbM32002u.append(", fileAttachmentsNoFilesTextStyle=");
        sbM32002u.append(textStyle7);
        sbM32002u.append(", fileAttachmentItemNameTextStyle=");
        sbM32002u.append(textStyle8);
        sbM32002u.append(", fileAttachmentItemSizeTextStyle=");
        sbM32002u.append(textStyle9);
        sbM32002u.append(", fileAttachmentItemCheckboxSelectedDrawable=");
        sbM32002u.append(drawable10);
        sbM32002u.append(", fileAttachmentItemCheckboxDeselectedDrawable=");
        sbM32002u.append(drawable11);
        sbM32002u.append(", fileAttachmentItemCheckboxTextColor=");
        sbM32002u.append(i14);
        sbM32002u.append(", cameraAttachmentsTabEnabled=");
        sbM32002u.append(z18);
        sbM32002u.append(", cameraAttachmentsTabIconDrawable=");
        sbM32002u.append(drawable12);
        sbM32002u.append(", pollAttachmentsTabEnabled=");
        sbM32002u.append(z19);
        sbM32002u.append(", pollAttachmentsTabIconDrawable=");
        sbM32002u.append(drawable13);
        sbM32002u.append(", allowAccessToCameraButtonText=");
        sbM32002u.append(str9);
        sbM32002u.append(", allowAccessToCameraIconDrawable=");
        sbM32002u.append(drawable14);
        sbM32002u.append(", pickerMediaMode=");
        sbM32002u.append(pickerMediaMode);
        sbM32002u.append(", systemMediaPickerVisualMediaAllowMultiple=");
        sbM32002u.append(z24);
        sbM32002u.append(", systemMediaPickerVisualMediaType=");
        sbM32002u.append(visualMediaType);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    public /* synthetic */ AttachmentsPickerDialogStyle(boolean z4, boolean z13, int i13, TextStyle textStyle, Drawable drawable, ColorStateList colorStateList, boolean z14, Drawable drawable2, String str, Drawable drawable3, boolean z15, TextStyle textStyle2, boolean z16, Drawable drawable4, Integer num, String str2, TextStyle textStyle3, boolean z17, Drawable drawable5, String str3, Drawable drawable6, String str4, TextStyle textStyle4, Drawable drawable7, String str5, String str6, TextStyle textStyle5, Drawable drawable8, String str7, TextStyle textStyle6, Drawable drawable9, String str8, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, Drawable drawable10, Drawable drawable11, int i14, boolean z18, Drawable drawable12, boolean z19, Drawable drawable13, String str9, Drawable drawable14, PickerMediaMode pickerMediaMode, boolean z24, VisualMediaType visualMediaType, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? true : z4, z13, i13, textStyle, drawable, colorStateList, z14, drawable2, str, drawable3, z15, textStyle2, z16, drawable4, num, str2, textStyle3, z17, drawable5, str3, drawable6, str4, textStyle4, drawable7, str5, str6, textStyle5, drawable8, str7, textStyle6, drawable9, str8, textStyle7, textStyle8, textStyle9, drawable10, drawable11, i14, z18, drawable12, z19, drawable13, str9, drawable14, pickerMediaMode, z24, visualMediaType);
    }
}
