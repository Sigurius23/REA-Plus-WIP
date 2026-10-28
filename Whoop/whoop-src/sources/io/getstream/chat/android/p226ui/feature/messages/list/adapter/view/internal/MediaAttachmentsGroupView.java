package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.C1153p;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.service.network.model.UserSessionDto;
import io.getstream.chat.android.client.utils.attachment.AttachmentUtilsKt;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.common.utils.extensions.AttachmentKt;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.internal.BackgroundDecorator;
import io.getstream.chat.android.p226ui.feature.messages.list.background.ShapeAppearanceModelFactory;
import io.getstream.chat.android.p226ui.utils.extensions.ConstraintLayoutKt;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.IntKt;
import io.getstream.chat.android.p226ui.utils.extensions.MessageItemKt;
import java.util.ArrayList;
import java.util.List;
import kr.C22782a;
import kr.C22788g;
import kr.C22792k;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import p031b9.AbstractC2875y;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 T2\u00020\u0001:\u0002UTB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bB+\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ9\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J'\u0010'\u001a\u00020&*\u00020\u001f2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020$0#H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b*\u0010+J#\u0010/\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\t2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00110-¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u000e2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0015\u00107\u001a\u00020\u000e2\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108R\u001b\u0010>\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R$\u0010@\u001a\u0004\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010G\u001a\u0004\u0018\u00010F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001b\u0010P\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010;\u001a\u0004\bN\u0010OR\u0016\u0010R\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010S¨\u0006V"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Ll83/a0;", "showZero", "()V", "Lio/getstream/chat/android/models/Attachment;", "first", "showOne", "(Lio/getstream/chat/android/models/Attachment;)V", "second", "showTwo", "(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/models/Attachment;)V", "third", "showThree", "(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/models/Attachment;)V", "fourth", "andMoreCount", "showFour", "(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/models/Attachment;I)V", "Lkr/k;", "shapeAppearanceModel", "applyToMediaPreviews", "(Lkr/k;)V", "Lkotlin/Function1;", "Lkr/c;", "selector", "", "getCornerSize", "(Lkr/k;Lkotlin/jvm/functions/Function1;)F", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;", "createMediaAttachmentView", "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;", "position", "", "attachments", "showAttachments", "(ILjava/util/List;)V", "Landroid/graphics/drawable/Drawable;", "background", "setBackground", "(Landroid/graphics/drawable/Drawable;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;", "data", "setupBackground", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;", "attachmentClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;", "getAttachmentClickListener", "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;", "setAttachmentClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;", "attachmentLongClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;", "getAttachmentLongClickListener", "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;", "setAttachmentLongClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;)V", "maxMediaAttachmentHeight$delegate", "getMaxMediaAttachmentHeight", "()I", "maxMediaAttachmentHeight", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State;", "state", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State;", "Companion", "State", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MediaAttachmentsGroupView extends ConstraintLayout {
    private static final double MAX_HEIGHT_PERCENTAGE = 0.75d;
    private static final int MAX_PREVIEW_COUNT = 4;
    private AttachmentClickListener attachmentClickListener;
    private AttachmentLongClickListener attachmentLongClickListener;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;

    /* JADX INFO: renamed from: maxMediaAttachmentHeight$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h maxMediaAttachmentHeight;
    private State state;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final int MIN_HEIGHT_PX = IntKt.dpToPx(95);
    private static final float STROKE_WIDTH = IntKt.dpToPxPrecise(2);

    @Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$Companion;", "", "<init>", "()V", "Landroidx/constraintlayout/widget/p;", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "", "isQuarter", "Ll83/a0;", "setupMinHeight", "(Landroidx/constraintlayout/widget/p;Landroid/view/View;Z)V", "", "MAX_HEIGHT_PERCENTAGE", "D", "", "MAX_PREVIEW_COUNT", "I", "MIN_HEIGHT_PX", "", "STROKE_WIDTH", "F", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setupMinHeight(C1153p c1153p, View view, boolean z4) {
            c1153p.m3651j(view.getId()).f5118d.f5153c0 = z4 ? MediaAttachmentsGroupView.MIN_HEIGHT_PX : MediaAttachmentsGroupView.MIN_HEIGHT_PX * 2;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State;", "", "<init>", "()V", "Empty", "OneView", "TwoViews", "ThreeViews", "FourViews", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$Empty;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$FourViews;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$OneView;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$TwoViews;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static abstract class State {

        @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$Empty;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State;", "<init>", "()V", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class Empty extends State {
            public static final Empty INSTANCE = new Empty();

            private Empty() {
            }

            public final String toString() {
                return "Empty";
            }
        }

        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$FourViews;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State;", "viewOne", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;", "viewTwo", "viewThree", "viewFour", "<init>", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;)V", "getViewOne", "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;", "getViewTwo", "getViewThree", "getViewFour", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class FourViews extends State {
            private final MediaAttachmentView viewFour;
            private final MediaAttachmentView viewOne;
            private final MediaAttachmentView viewThree;
            private final MediaAttachmentView viewTwo;

            public FourViews(MediaAttachmentView viewOne, MediaAttachmentView viewTwo, MediaAttachmentView viewThree, MediaAttachmentView viewFour) {
                AbstractC22676k.m65750j(viewOne, "viewOne");
                AbstractC22676k.m65750j(viewTwo, "viewTwo");
                AbstractC22676k.m65750j(viewThree, "viewThree");
                AbstractC22676k.m65750j(viewFour, "viewFour");
                this.viewOne = viewOne;
                this.viewTwo = viewTwo;
                this.viewThree = viewThree;
                this.viewFour = viewFour;
            }

            public static /* synthetic */ FourViews copy$default(FourViews fourViews, MediaAttachmentView mediaAttachmentView, MediaAttachmentView mediaAttachmentView2, MediaAttachmentView mediaAttachmentView3, MediaAttachmentView mediaAttachmentView4, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    mediaAttachmentView = fourViews.viewOne;
                }
                if ((i13 & 2) != 0) {
                    mediaAttachmentView2 = fourViews.viewTwo;
                }
                if ((i13 & 4) != 0) {
                    mediaAttachmentView3 = fourViews.viewThree;
                }
                if ((i13 & 8) != 0) {
                    mediaAttachmentView4 = fourViews.viewFour;
                }
                return fourViews.copy(mediaAttachmentView, mediaAttachmentView2, mediaAttachmentView3, mediaAttachmentView4);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final MediaAttachmentView getViewOne() {
                return this.viewOne;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final MediaAttachmentView getViewTwo() {
                return this.viewTwo;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final MediaAttachmentView getViewThree() {
                return this.viewThree;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final MediaAttachmentView getViewFour() {
                return this.viewFour;
            }

            public final FourViews copy(MediaAttachmentView viewOne, MediaAttachmentView viewTwo, MediaAttachmentView viewThree, MediaAttachmentView viewFour) {
                AbstractC22676k.m65750j(viewOne, "viewOne");
                AbstractC22676k.m65750j(viewTwo, "viewTwo");
                AbstractC22676k.m65750j(viewThree, "viewThree");
                AbstractC22676k.m65750j(viewFour, "viewFour");
                return new FourViews(viewOne, viewTwo, viewThree, viewFour);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FourViews)) {
                    return false;
                }
                FourViews fourViews = (FourViews) other;
                return AbstractC22676k.m65745e(this.viewOne, fourViews.viewOne) && AbstractC22676k.m65745e(this.viewTwo, fourViews.viewTwo) && AbstractC22676k.m65745e(this.viewThree, fourViews.viewThree) && AbstractC22676k.m65745e(this.viewFour, fourViews.viewFour);
            }

            public final MediaAttachmentView getViewFour() {
                return this.viewFour;
            }

            public final MediaAttachmentView getViewOne() {
                return this.viewOne;
            }

            public final MediaAttachmentView getViewThree() {
                return this.viewThree;
            }

            public final MediaAttachmentView getViewTwo() {
                return this.viewTwo;
            }

            public final int hashCode() {
                return this.viewFour.hashCode() + ((this.viewThree.hashCode() + ((this.viewTwo.hashCode() + (this.viewOne.hashCode() * 31)) * 31)) * 31);
            }

            public final String toString() {
                return "FourViews(viewOne=" + this.viewOne + ", viewTwo=" + this.viewTwo + ", viewThree=" + this.viewThree + ", viewFour=" + this.viewFour + ")";
            }
        }

        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$OneView;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State;", ProfileAnalyticsKt.VIEW, "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;", "<init>", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;)V", "getView", "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class OneView extends State {
            private final MediaAttachmentView view;

            public OneView(MediaAttachmentView view) {
                AbstractC22676k.m65750j(view, "view");
                this.view = view;
            }

            public static /* synthetic */ OneView copy$default(OneView oneView, MediaAttachmentView mediaAttachmentView, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    mediaAttachmentView = oneView.view;
                }
                return oneView.copy(mediaAttachmentView);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final MediaAttachmentView getView() {
                return this.view;
            }

            public final OneView copy(MediaAttachmentView view) {
                AbstractC22676k.m65750j(view, "view");
                return new OneView(view);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OneView) && AbstractC22676k.m65745e(this.view, ((OneView) other).view);
            }

            public final MediaAttachmentView getView() {
                return this.view;
            }

            public final int hashCode() {
                return this.view.hashCode();
            }

            public final String toString() {
                return "OneView(view=" + this.view + ")";
            }
        }

        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0018"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State;", "viewOne", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;", "viewTwo", "viewThree", "<init>", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;)V", "getViewOne", "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;", "getViewTwo", "getViewThree", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class ThreeViews extends State {
            private final MediaAttachmentView viewOne;
            private final MediaAttachmentView viewThree;
            private final MediaAttachmentView viewTwo;

            public ThreeViews(MediaAttachmentView viewOne, MediaAttachmentView viewTwo, MediaAttachmentView viewThree) {
                AbstractC22676k.m65750j(viewOne, "viewOne");
                AbstractC22676k.m65750j(viewTwo, "viewTwo");
                AbstractC22676k.m65750j(viewThree, "viewThree");
                this.viewOne = viewOne;
                this.viewTwo = viewTwo;
                this.viewThree = viewThree;
            }

            public static /* synthetic */ ThreeViews copy$default(ThreeViews threeViews, MediaAttachmentView mediaAttachmentView, MediaAttachmentView mediaAttachmentView2, MediaAttachmentView mediaAttachmentView3, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    mediaAttachmentView = threeViews.viewOne;
                }
                if ((i13 & 2) != 0) {
                    mediaAttachmentView2 = threeViews.viewTwo;
                }
                if ((i13 & 4) != 0) {
                    mediaAttachmentView3 = threeViews.viewThree;
                }
                return threeViews.copy(mediaAttachmentView, mediaAttachmentView2, mediaAttachmentView3);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final MediaAttachmentView getViewOne() {
                return this.viewOne;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final MediaAttachmentView getViewTwo() {
                return this.viewTwo;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final MediaAttachmentView getViewThree() {
                return this.viewThree;
            }

            public final ThreeViews copy(MediaAttachmentView viewOne, MediaAttachmentView viewTwo, MediaAttachmentView viewThree) {
                AbstractC22676k.m65750j(viewOne, "viewOne");
                AbstractC22676k.m65750j(viewTwo, "viewTwo");
                AbstractC22676k.m65750j(viewThree, "viewThree");
                return new ThreeViews(viewOne, viewTwo, viewThree);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ThreeViews)) {
                    return false;
                }
                ThreeViews threeViews = (ThreeViews) other;
                return AbstractC22676k.m65745e(this.viewOne, threeViews.viewOne) && AbstractC22676k.m65745e(this.viewTwo, threeViews.viewTwo) && AbstractC22676k.m65745e(this.viewThree, threeViews.viewThree);
            }

            public final MediaAttachmentView getViewOne() {
                return this.viewOne;
            }

            public final MediaAttachmentView getViewThree() {
                return this.viewThree;
            }

            public final MediaAttachmentView getViewTwo() {
                return this.viewTwo;
            }

            public final int hashCode() {
                return this.viewThree.hashCode() + ((this.viewTwo.hashCode() + (this.viewOne.hashCode() * 31)) * 31);
            }

            public final String toString() {
                return "ThreeViews(viewOne=" + this.viewOne + ", viewTwo=" + this.viewTwo + ", viewThree=" + this.viewThree + ")";
            }
        }

        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$TwoViews;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State;", "viewOne", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;", "viewTwo", "<init>", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;)V", "getViewOne", "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;", "getViewTwo", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class TwoViews extends State {
            private final MediaAttachmentView viewOne;
            private final MediaAttachmentView viewTwo;

            public TwoViews(MediaAttachmentView viewOne, MediaAttachmentView viewTwo) {
                AbstractC22676k.m65750j(viewOne, "viewOne");
                AbstractC22676k.m65750j(viewTwo, "viewTwo");
                this.viewOne = viewOne;
                this.viewTwo = viewTwo;
            }

            public static /* synthetic */ TwoViews copy$default(TwoViews twoViews, MediaAttachmentView mediaAttachmentView, MediaAttachmentView mediaAttachmentView2, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    mediaAttachmentView = twoViews.viewOne;
                }
                if ((i13 & 2) != 0) {
                    mediaAttachmentView2 = twoViews.viewTwo;
                }
                return twoViews.copy(mediaAttachmentView, mediaAttachmentView2);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final MediaAttachmentView getViewOne() {
                return this.viewOne;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final MediaAttachmentView getViewTwo() {
                return this.viewTwo;
            }

            public final TwoViews copy(MediaAttachmentView viewOne, MediaAttachmentView viewTwo) {
                AbstractC22676k.m65750j(viewOne, "viewOne");
                AbstractC22676k.m65750j(viewTwo, "viewTwo");
                return new TwoViews(viewOne, viewTwo);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TwoViews)) {
                    return false;
                }
                TwoViews twoViews = (TwoViews) other;
                return AbstractC22676k.m65745e(this.viewOne, twoViews.viewOne) && AbstractC22676k.m65745e(this.viewTwo, twoViews.viewTwo);
            }

            public final MediaAttachmentView getViewOne() {
                return this.viewOne;
            }

            public final MediaAttachmentView getViewTwo() {
                return this.viewTwo;
            }

            public final int hashCode() {
                return this.viewTwo.hashCode() + (this.viewOne.hashCode() * 31);
            }

            public final String toString() {
                return "TwoViews(viewOne=" + this.viewOne + ", viewTwo=" + this.viewTwo + ")";
            }
        }

        private State() {
        }

        public State(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaAttachmentsGroupView(Context context) {
        super(ContextKt.createStreamThemeWrapper(context));
        AbstractC22676k.m65750j(context, "context");
        this.logger = AbstractC1772c1.m5382S(this, "MediaAttachGroupView");
        this.maxMediaAttachmentHeight = AbstractC30060g.m92088H(new C19777h(1));
        this.state = State.Empty.INSTANCE;
    }

    private final void applyToMediaPreviews(C22792k shapeAppearanceModel) {
        float cornerSize = getCornerSize(shapeAppearanceModel, MediaAttachmentsGroupView$applyToMediaPreviews$topLeftCorner$1.INSTANCE);
        float cornerSize2 = getCornerSize(shapeAppearanceModel, MediaAttachmentsGroupView$applyToMediaPreviews$topRightCorner$1.INSTANCE);
        float cornerSize3 = getCornerSize(shapeAppearanceModel, C19768x40b448c1.INSTANCE);
        float cornerSize4 = getCornerSize(shapeAppearanceModel, C19767xc1e25186.INSTANCE);
        State state = this.state;
        if (state instanceof State.OneView) {
            ((State.OneView) state).getView().setMediaPreviewShapeByCorners(cornerSize, cornerSize2, cornerSize3, cornerSize4);
            return;
        }
        if (state instanceof State.TwoViews) {
            State.TwoViews twoViews = (State.TwoViews) state;
            twoViews.getViewOne().setMediaPreviewShapeByCorners(cornerSize, 0.0f, 0.0f, cornerSize4);
            twoViews.getViewTwo().setMediaPreviewShapeByCorners(0.0f, cornerSize2, cornerSize3, 0.0f);
        } else {
            if (state instanceof State.ThreeViews) {
                State.ThreeViews threeViews = (State.ThreeViews) state;
                threeViews.getViewOne().setMediaPreviewShapeByCorners(cornerSize, 0.0f, 0.0f, cornerSize4);
                threeViews.getViewTwo().setMediaPreviewShapeByCorners(0.0f, cornerSize2, 0.0f, 0.0f);
                threeViews.getViewThree().setMediaPreviewShapeByCorners(0.0f, 0.0f, cornerSize3, 0.0f);
                return;
            }
            if (state instanceof State.FourViews) {
                State.FourViews fourViews = (State.FourViews) state;
                fourViews.getViewOne().setMediaPreviewShapeByCorners(cornerSize, 0.0f, 0.0f, 0.0f);
                fourViews.getViewTwo().setMediaPreviewShapeByCorners(0.0f, cornerSize2, 0.0f, 0.0f);
                fourViews.getViewThree().setMediaPreviewShapeByCorners(0.0f, 0.0f, 0.0f, cornerSize4);
                fourViews.getViewFour().setMediaPreviewShapeByCorners(0.0f, 0.0f, cornerSize3, 0.0f);
            }
        }
    }

    private final MediaAttachmentView createMediaAttachmentView() {
        Context context = getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        MediaAttachmentView mediaAttachmentView = new MediaAttachmentView(context);
        mediaAttachmentView.setId(View.generateViewId());
        mediaAttachmentView.setAttachmentClickListener(this.attachmentClickListener);
        mediaAttachmentView.setAttachmentLongClickListener(this.attachmentLongClickListener);
        return mediaAttachmentView;
    }

    private final float getCornerSize(C22792k c22792k, Function1 function1) {
        Object objInvoke = function1.invoke(c22792k);
        C22782a c22782a = objInvoke instanceof C22782a ? (C22782a) objInvoke : null;
        Float fValueOf = Float.valueOf((c22782a != null ? c22782a.f89705a : 0.0f) - STROKE_WIDTH);
        Float f13 = fValueOf.floatValue() >= 0.0f ? fValueOf : null;
        Float fValueOf2 = Float.valueOf(0.0f);
        if (f13 == null) {
            f13 = fValueOf2;
        }
        return f13.floatValue();
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final int getMaxMediaAttachmentHeight() {
        return ((Number) this.maxMediaAttachmentHeight.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int maxMediaAttachmentHeight_delegate$lambda$0() {
        return (int) (((double) IntKt.displayMetrics().heightPixels) * MAX_HEIGHT_PERCENTAGE);
    }

    private final void showFour(Attachment first, Attachment second, Attachment third, Attachment fourth, int andMoreCount) {
        removeAllViews();
        MediaAttachmentView mediaAttachmentViewCreateMediaAttachmentView = createMediaAttachmentView();
        addView(mediaAttachmentViewCreateMediaAttachmentView);
        MediaAttachmentView mediaAttachmentViewCreateMediaAttachmentView2 = createMediaAttachmentView();
        addView(mediaAttachmentViewCreateMediaAttachmentView2);
        MediaAttachmentView mediaAttachmentViewCreateMediaAttachmentView3 = createMediaAttachmentView();
        addView(mediaAttachmentViewCreateMediaAttachmentView3);
        MediaAttachmentView mediaAttachmentViewCreateMediaAttachmentView4 = createMediaAttachmentView();
        addView(mediaAttachmentViewCreateMediaAttachmentView4);
        this.state = new State.FourViews(mediaAttachmentViewCreateMediaAttachmentView, mediaAttachmentViewCreateMediaAttachmentView2, mediaAttachmentViewCreateMediaAttachmentView3, mediaAttachmentViewCreateMediaAttachmentView4);
        C1153p c1153p = new C1153p();
        Companion companion = INSTANCE;
        companion.setupMinHeight(c1153p, mediaAttachmentViewCreateMediaAttachmentView, true);
        companion.setupMinHeight(c1153p, mediaAttachmentViewCreateMediaAttachmentView2, true);
        companion.setupMinHeight(c1153p, mediaAttachmentViewCreateMediaAttachmentView3, true);
        companion.setupMinHeight(c1153p, mediaAttachmentViewCreateMediaAttachmentView4, true);
        ConstraintLayoutKt.horizontalChainInParent(c1153p, mediaAttachmentViewCreateMediaAttachmentView, mediaAttachmentViewCreateMediaAttachmentView2);
        ConstraintLayoutKt.horizontalChainInParent(c1153p, mediaAttachmentViewCreateMediaAttachmentView3, mediaAttachmentViewCreateMediaAttachmentView4);
        ConstraintLayoutKt.verticalChainInParent(c1153p, mediaAttachmentViewCreateMediaAttachmentView, mediaAttachmentViewCreateMediaAttachmentView3);
        ConstraintLayoutKt.verticalChainInParent(c1153p, mediaAttachmentViewCreateMediaAttachmentView2, mediaAttachmentViewCreateMediaAttachmentView4);
        c1153p.m3644a(this);
        MediaAttachmentView.showAttachment$default(mediaAttachmentViewCreateMediaAttachmentView, first, 0, 2, null);
        MediaAttachmentView.showAttachment$default(mediaAttachmentViewCreateMediaAttachmentView2, second, 0, 2, null);
        MediaAttachmentView.showAttachment$default(mediaAttachmentViewCreateMediaAttachmentView3, third, 0, 2, null);
        mediaAttachmentViewCreateMediaAttachmentView4.showAttachment(fourth, andMoreCount);
    }

    public static /* synthetic */ void showFour$default(MediaAttachmentsGroupView mediaAttachmentsGroupView, Attachment attachment, Attachment attachment2, Attachment attachment3, Attachment attachment4, int i13, int i14, Object obj) {
        if ((i14 & 16) != 0) {
            i13 = 0;
        }
        mediaAttachmentsGroupView.showFour(attachment, attachment2, attachment3, attachment4, i13);
    }

    private final void showOne(Attachment first) {
        removeAllViews();
        MediaAttachmentView mediaAttachmentViewCreateMediaAttachmentView = createMediaAttachmentView();
        addView(mediaAttachmentViewCreateMediaAttachmentView);
        this.state = new State.OneView(mediaAttachmentViewCreateMediaAttachmentView);
        C1153p c1153p = new C1153p();
        c1153p.m3651j(mediaAttachmentViewCreateMediaAttachmentView.getId()).f5118d.f5149a0 = getMaxMediaAttachmentHeight();
        c1153p.m3651j(mediaAttachmentViewCreateMediaAttachmentView.getId()).f5118d.f5150b = -1;
        ConstraintLayoutKt.constrainViewToParentBySide(c1153p, mediaAttachmentViewCreateMediaAttachmentView, 1);
        ConstraintLayoutKt.constrainViewToParentBySide(c1153p, mediaAttachmentViewCreateMediaAttachmentView, 2);
        ConstraintLayoutKt.constrainViewToParentBySide(c1153p, mediaAttachmentViewCreateMediaAttachmentView, 3);
        ConstraintLayoutKt.constrainViewToParentBySide(c1153p, mediaAttachmentViewCreateMediaAttachmentView, 4);
        Integer originalWidth = first.getOriginalWidth();
        Float fValueOf = originalWidth != null ? Float.valueOf(originalWidth.intValue()) : null;
        Integer originalHeight = first.getOriginalHeight();
        Float fValueOf2 = originalHeight != null ? Float.valueOf(originalHeight.intValue()) : null;
        if (fValueOf == null || fValueOf2 == null) {
            c1153p.m3651j(mediaAttachmentViewCreateMediaAttachmentView.getId()).f5118d.f5187y = UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE;
        } else {
            c1153p.m3651j(mediaAttachmentViewCreateMediaAttachmentView.getId()).f5118d.f5187y = String.valueOf(fValueOf.floatValue() / fValueOf2.floatValue());
        }
        c1153p.m3644a(this);
        mediaAttachmentViewCreateMediaAttachmentView.showAttachment(first, 0);
    }

    private final void showThree(Attachment first, Attachment second, Attachment third) {
        removeAllViews();
        MediaAttachmentView mediaAttachmentViewCreateMediaAttachmentView = createMediaAttachmentView();
        addView(mediaAttachmentViewCreateMediaAttachmentView);
        MediaAttachmentView mediaAttachmentViewCreateMediaAttachmentView2 = createMediaAttachmentView();
        addView(mediaAttachmentViewCreateMediaAttachmentView2);
        MediaAttachmentView mediaAttachmentViewCreateMediaAttachmentView3 = createMediaAttachmentView();
        addView(mediaAttachmentViewCreateMediaAttachmentView3);
        this.state = new State.ThreeViews(mediaAttachmentViewCreateMediaAttachmentView, mediaAttachmentViewCreateMediaAttachmentView2, mediaAttachmentViewCreateMediaAttachmentView3);
        C1153p c1153p = new C1153p();
        Companion companion = INSTANCE;
        companion.setupMinHeight(c1153p, mediaAttachmentViewCreateMediaAttachmentView2, true);
        companion.setupMinHeight(c1153p, mediaAttachmentViewCreateMediaAttachmentView3, true);
        ConstraintLayoutKt.horizontalChainInParent(c1153p, mediaAttachmentViewCreateMediaAttachmentView, mediaAttachmentViewCreateMediaAttachmentView2);
        ConstraintLayoutKt.horizontalChainInParent(c1153p, mediaAttachmentViewCreateMediaAttachmentView, mediaAttachmentViewCreateMediaAttachmentView3);
        ConstraintLayoutKt.verticalChainInParent(c1153p, mediaAttachmentViewCreateMediaAttachmentView2, mediaAttachmentViewCreateMediaAttachmentView3);
        c1153p.m3649f(mediaAttachmentViewCreateMediaAttachmentView.getId(), 3, mediaAttachmentViewCreateMediaAttachmentView2.getId(), 3);
        c1153p.m3649f(mediaAttachmentViewCreateMediaAttachmentView.getId(), 4, mediaAttachmentViewCreateMediaAttachmentView3.getId(), 4);
        c1153p.m3644a(this);
        MediaAttachmentView.showAttachment$default(mediaAttachmentViewCreateMediaAttachmentView, first, 0, 2, null);
        MediaAttachmentView.showAttachment$default(mediaAttachmentViewCreateMediaAttachmentView2, second, 0, 2, null);
        MediaAttachmentView.showAttachment$default(mediaAttachmentViewCreateMediaAttachmentView3, third, 0, 2, null);
    }

    private final void showTwo(Attachment first, Attachment second) {
        removeAllViews();
        MediaAttachmentView mediaAttachmentViewCreateMediaAttachmentView = createMediaAttachmentView();
        addView(mediaAttachmentViewCreateMediaAttachmentView);
        MediaAttachmentView mediaAttachmentViewCreateMediaAttachmentView2 = createMediaAttachmentView();
        addView(mediaAttachmentViewCreateMediaAttachmentView2);
        this.state = new State.TwoViews(mediaAttachmentViewCreateMediaAttachmentView, mediaAttachmentViewCreateMediaAttachmentView2);
        C1153p c1153p = new C1153p();
        Companion companion = INSTANCE;
        companion.setupMinHeight(c1153p, mediaAttachmentViewCreateMediaAttachmentView, false);
        companion.setupMinHeight(c1153p, mediaAttachmentViewCreateMediaAttachmentView2, false);
        ConstraintLayoutKt.constrainViewToParentBySide(c1153p, mediaAttachmentViewCreateMediaAttachmentView, 3);
        ConstraintLayoutKt.constrainViewToParentBySide(c1153p, mediaAttachmentViewCreateMediaAttachmentView2, 3);
        ConstraintLayoutKt.constrainViewToParentBySide(c1153p, mediaAttachmentViewCreateMediaAttachmentView, 4);
        ConstraintLayoutKt.constrainViewToParentBySide(c1153p, mediaAttachmentViewCreateMediaAttachmentView2, 4);
        ConstraintLayoutKt.horizontalChainInParent(c1153p, mediaAttachmentViewCreateMediaAttachmentView, mediaAttachmentViewCreateMediaAttachmentView2);
        c1153p.m3644a(this);
        MediaAttachmentView.showAttachment$default(mediaAttachmentViewCreateMediaAttachmentView, first, 0, 2, null);
        MediaAttachmentView.showAttachment$default(mediaAttachmentViewCreateMediaAttachmentView2, second, 0, 2, null);
    }

    private final void showZero() {
        removeAllViews();
        this.state = State.Empty.INSTANCE;
    }

    public final AttachmentClickListener getAttachmentClickListener() {
        return this.attachmentClickListener;
    }

    public final AttachmentLongClickListener getAttachmentLongClickListener() {
        return this.attachmentLongClickListener;
    }

    public final void setAttachmentClickListener(AttachmentClickListener attachmentClickListener) {
        this.attachmentClickListener = attachmentClickListener;
    }

    public final void setAttachmentLongClickListener(AttachmentLongClickListener attachmentLongClickListener) {
        this.attachmentLongClickListener = attachmentLongClickListener;
    }

    @Override // android.view.View
    public void setBackground(Drawable background) {
        AbstractC22676k.m65750j(background, "background");
        super.setBackground(background);
        if (background instanceof C22788g) {
            C22792k c22792k = ((C22788g) background).f89748w.f89710a;
            AbstractC22676k.m65749i(c22792k, "getShapeAppearanceModel(...)");
            applyToMediaPreviews(c22792k);
        }
    }

    public final void setupBackground(MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(data, "data");
        ShapeAppearanceModelFactory shapeAppearanceModelFactory = ShapeAppearanceModelFactory.INSTANCE;
        Context context = getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        BackgroundDecorator.INSTANCE.getClass();
        C22788g c22788g = new C22788g(shapeAppearanceModelFactory.create(context, BackgroundDecorator.DEFAULT_CORNER_RADIUS, 0.0f, data.isMine(), MessageItemKt.isBottomPosition(data)));
        c22788g.setTint(AbstractC32122c.getColor(getContext(), C19469R.color.stream_ui_literal_transparent));
        setBackground(c22788g);
    }

    public final void showAttachments(int position, List<Attachment> attachments) {
        C22792k c22792k;
        AbstractC22676k.m65750j(attachments, "attachments");
        ArrayList arrayList = new ArrayList();
        for (Object obj : attachments) {
            Attachment attachment = (Attachment) obj;
            if (!AttachmentKt.hasLink(attachment) && (AttachmentUtilsKt.isImage(attachment) || AttachmentUtilsKt.isVideo(attachment))) {
                arrayList.add(obj);
            }
        }
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC2875y.m8294g(position, arrayList.size(), "[showAttachments] #", "; attachments.size: "), null);
        }
        int size = arrayList.size();
        if (size == 0) {
            showZero();
        } else if (size == 1) {
            showOne((Attachment) AbstractC25265s.m74096F0(arrayList));
        } else if (size == 2) {
            showTwo((Attachment) AbstractC25265s.m74096F0(arrayList), (Attachment) arrayList.get(1));
        } else if (size != 3) {
            showFour((Attachment) AbstractC25265s.m74096F0(arrayList), (Attachment) arrayList.get(1), (Attachment) arrayList.get(2), (Attachment) arrayList.get(3), arrayList.size() - 4);
        } else {
            showThree((Attachment) AbstractC25265s.m74096F0(arrayList), (Attachment) arrayList.get(1), (Attachment) arrayList.get(2));
        }
        Drawable background = getBackground();
        C22788g c22788g = background instanceof C22788g ? (C22788g) background : null;
        if (c22788g == null || (c22792k = c22788g.f89748w.f89710a) == null) {
            return;
        }
        applyToMediaPreviews(c22792k);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaAttachmentsGroupView(Context context, AttributeSet attributeSet) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet);
        AbstractC22676k.m65750j(context, "context");
        this.logger = AbstractC1772c1.m5382S(this, "MediaAttachGroupView");
        this.maxMediaAttachmentHeight = AbstractC30060g.m92088H(new C19777h(1));
        this.state = State.Empty.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaAttachmentsGroupView(Context context, AttributeSet attributeSet, int i13) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        this.logger = AbstractC1772c1.m5382S(this, "MediaAttachGroupView");
        this.maxMediaAttachmentHeight = AbstractC30060g.m92088H(new C19777h(1));
        this.state = State.Empty.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaAttachmentsGroupView(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet, i13, i14);
        AbstractC22676k.m65750j(context, "context");
        this.logger = AbstractC1772c1.m5382S(this, "MediaAttachGroupView");
        this.maxMediaAttachmentHeight = AbstractC30060g.m92088H(new C19777h(1));
        this.state = State.Empty.INSTANCE;
    }
}
