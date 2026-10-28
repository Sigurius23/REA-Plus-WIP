package io.getstream.chat.android.p226ui.feature.messages.list.reactions.edit.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.mapbox.maps.MapboxMap;
import i93.C18284j;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.edit.EditReactionsViewStyle;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.IntKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019JM\u0010#\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010&\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010)R\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010)R\u0016\u0010\u0013\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010*R\u0016\u0010\u001f\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010*¨\u0006+"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsBubbleDrawer;", "", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;", "editReactionsViewStyle", "<init>", "(Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;)V", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/Paint;", "paint", "Ll83/a0;", "drawBubbleRoundRect", "(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V", "", "isRtl", "", "bubbleTailPosition", "drawLargeTailBubble", "(Landroid/graphics/Canvas;Landroid/graphics/Paint;ZF)V", "isMyMessage", MapboxMap.QFE_OFFSET, "parseOffset", "(ZZF)F", "drawSmallTailBubble", "largeTailBubbleInitialPosition", "()F", "Landroid/content/Context;", "context", "", "bubbleWidth", "bubbleHeight", "isSingleReaction", "messageAnchorPosition", "Li93/j;", "canvasBounds", "drawReactionsBubble", "(Landroid/content/Context;Landroid/graphics/Canvas;IIZZFLi93/j;)V", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;", "bubblePaintMine", "Landroid/graphics/Paint;", "bubblePaintTheirs", "I", "Z", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class EditReactionsBubbleDrawer {
    private int bubbleHeight;
    private final Paint bubblePaintMine;
    private final Paint bubblePaintTheirs;
    private int bubbleWidth;
    private final EditReactionsViewStyle editReactionsViewStyle;
    private boolean isMyMessage;
    private boolean isSingleReaction;

    public EditReactionsBubbleDrawer(EditReactionsViewStyle editReactionsViewStyle) {
        AbstractC22676k.m65750j(editReactionsViewStyle, "editReactionsViewStyle");
        this.editReactionsViewStyle = editReactionsViewStyle;
        Paint paint = new Paint(1);
        paint.setColor(editReactionsViewStyle.getBubbleColorMine());
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.bubblePaintMine = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(editReactionsViewStyle.getBubbleColorTheirs());
        paint2.setStyle(style);
        this.bubblePaintTheirs = paint2;
    }

    private final void drawBubbleRoundRect(Canvas canvas, Paint paint) {
        canvas.drawRoundRect(0.0f, 0.0f, this.bubbleWidth, this.bubbleHeight, this.editReactionsViewStyle.getBubbleRadius(), this.editReactionsViewStyle.getBubbleRadius(), paint);
    }

    private final void drawLargeTailBubble(Canvas canvas, Paint paint, boolean isRtl, float bubbleTailPosition) {
        canvas.drawCircle(parseOffset(isRtl, this.isMyMessage, this.editReactionsViewStyle.getLargeTailBubbleOffset()) + bubbleTailPosition, largeTailBubbleInitialPosition() + this.editReactionsViewStyle.getLargeTailBubbleCyOffset(), this.editReactionsViewStyle.getLargeTailBubbleRadius(), paint);
    }

    private final void drawSmallTailBubble(Canvas canvas, Paint paint, boolean isRtl, float bubbleTailPosition) {
        canvas.drawCircle(parseOffset(isRtl, this.isMyMessage, this.editReactionsViewStyle.getSmallTailBubbleOffset()) + bubbleTailPosition, largeTailBubbleInitialPosition() + this.editReactionsViewStyle.getLargeTailBubbleRadius() + this.editReactionsViewStyle.getSmallTailBubbleCyOffset(), this.editReactionsViewStyle.getSmallTailBubbleRadius(), paint);
    }

    private final float largeTailBubbleInitialPosition() {
        return this.bubbleHeight - IntKt.dpToPx(2);
    }

    private final float parseOffset(boolean isRtl, boolean isMyMessage, float offset) {
        if (!isMyMessage || isRtl) {
            if (isMyMessage && isRtl) {
                return -offset;
            }
            if (!isMyMessage && !isRtl) {
                return -offset;
            }
        }
        return offset;
    }

    public final void drawReactionsBubble(Context context, Canvas canvas, int bubbleWidth, int bubbleHeight, boolean isMyMessage, boolean isSingleReaction, float messageAnchorPosition, C18284j canvasBounds) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(canvas, "canvas");
        AbstractC22676k.m65750j(canvasBounds, "canvasBounds");
        this.bubbleWidth = bubbleWidth;
        this.bubbleHeight = bubbleHeight;
        this.isMyMessage = isMyMessage;
        this.isSingleReaction = isSingleReaction;
        Paint paint = isMyMessage ? this.bubblePaintMine : this.bubblePaintTheirs;
        boolean zIsRtlLayout = ContextKt.isRtlLayout(context);
        int i13 = canvasBounds.f71133w;
        int i14 = canvasBounds.f71134x;
        int i15 = (int) messageAnchorPosition;
        if (i13 > i15 || i15 > i14) {
            if (messageAnchorPosition > i14) {
                i13 = i14;
            }
            messageAnchorPosition = i13;
        }
        drawBubbleRoundRect(canvas, paint);
        drawLargeTailBubble(canvas, paint, zIsRtlLayout, messageAnchorPosition);
        drawSmallTailBubble(canvas, paint, zIsRtlLayout, messageAnchorPosition);
    }
}
