package io.getstream.chat.android.p226ui.feature.messages.list.reactions.user.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.file.internal.C19683b;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.user.SingleReactionViewStyle;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010!\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010(\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010&R\u001b\u0010-\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010.R\u0016\u0010\u001e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010/R\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010/¨\u00060"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/SingleReactionViewBubbleDrawer;", "", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;", "viewReactionsViewStyle", "<init>", "(Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;)V", "", "shouldDrawTheirsBorder", "()Z", "Landroid/graphics/Path;", "createBubbleRoundRectPath", "()Landroid/graphics/Path;", "", "getStrokeOffset", "()F", "isRtl", "createLargeTailBubblePath", "(Z)Landroid/graphics/Path;", "createSmallTailBubblePath", "bubbleOffset", "calculateBubbleCenterX", "(F)F", "positionBubble", "(ZF)F", "Landroid/content/Context;", "context", "Landroid/graphics/Canvas;", "canvas", "", "bubbleWidth", "isMyMessage", "isOrientedTowardsStart", "Ll83/a0;", "drawReactionsBubble", "(Landroid/content/Context;Landroid/graphics/Canvas;IZZ)V", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;", "Landroid/graphics/Paint;", "bubblePaintTheirs", "Landroid/graphics/Paint;", "bubblePaintMine", "bubbleStrokePaintMine", "bubbleStrokePaintTheirs$delegate", "Ll83/h;", "getBubbleStrokePaintTheirs", "()Landroid/graphics/Paint;", "bubbleStrokePaintTheirs", "I", "Z", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SingleReactionViewBubbleDrawer {
    private final Paint bubblePaintMine;
    private final Paint bubblePaintTheirs;
    private final Paint bubbleStrokePaintMine;

    /* JADX INFO: renamed from: bubbleStrokePaintTheirs$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h bubbleStrokePaintTheirs;
    private int bubbleWidth;
    private boolean isMyMessage;
    private boolean isOrientedTowardsStart;
    private final SingleReactionViewStyle viewReactionsViewStyle;

    public SingleReactionViewBubbleDrawer(SingleReactionViewStyle viewReactionsViewStyle) {
        AbstractC22676k.m65750j(viewReactionsViewStyle, "viewReactionsViewStyle");
        this.viewReactionsViewStyle = viewReactionsViewStyle;
        Paint paint = new Paint(1);
        paint.setColor(viewReactionsViewStyle.getBubbleColorTheirs());
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.bubblePaintTheirs = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(viewReactionsViewStyle.getBubbleColorMine());
        paint2.setStyle(style);
        this.bubblePaintMine = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(viewReactionsViewStyle.getBubbleBorderColorMine());
        paint3.setStrokeWidth(viewReactionsViewStyle.getBubbleBorderWidthMine());
        paint3.setStyle(Paint.Style.STROKE);
        this.bubbleStrokePaintMine = paint3;
        this.bubbleStrokePaintTheirs = AbstractC30060g.m92088H(new C19683b(this, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint bubbleStrokePaintTheirs_delegate$lambda$5(SingleReactionViewBubbleDrawer singleReactionViewBubbleDrawer) {
        if (!singleReactionViewBubbleDrawer.shouldDrawTheirsBorder()) {
            throw new IllegalStateException("You need to specify either bubbleBorderColorTheirs and bubbleBorderWidthTheirs to draw a border for another user reaction bubble");
        }
        Paint paint = new Paint(1);
        Integer bubbleBorderColorTheirs = singleReactionViewBubbleDrawer.viewReactionsViewStyle.getBubbleBorderColorTheirs();
        AbstractC22676k.m65747g(bubbleBorderColorTheirs);
        paint.setColor(bubbleBorderColorTheirs.intValue());
        Float bubbleBorderWidthTheirs = singleReactionViewBubbleDrawer.viewReactionsViewStyle.getBubbleBorderWidthTheirs();
        AbstractC22676k.m65747g(bubbleBorderWidthTheirs);
        paint.setStrokeWidth(bubbleBorderWidthTheirs.floatValue());
        paint.setStyle(Paint.Style.STROKE);
        return paint;
    }

    private final float calculateBubbleCenterX(float bubbleOffset) {
        return !this.isOrientedTowardsStart ? (this.bubbleWidth / 2) + bubbleOffset : (this.bubbleWidth / 2) - bubbleOffset;
    }

    private final Path createBubbleRoundRectPath() {
        float strokeOffset = getStrokeOffset();
        Path path = new Path();
        path.addRoundRect(strokeOffset, strokeOffset, this.bubbleWidth - strokeOffset, this.viewReactionsViewStyle.getBubbleHeight(), this.viewReactionsViewStyle.getBubbleRadius(), this.viewReactionsViewStyle.getBubbleRadius(), Path.Direction.CW);
        return path;
    }

    private final Path createLargeTailBubblePath(boolean isRtl) {
        Path path = new Path();
        path.addCircle(positionBubble(isRtl, this.viewReactionsViewStyle.getLargeTailBubbleOffset()), this.viewReactionsViewStyle.getLargeTailBubbleCy(), this.viewReactionsViewStyle.getLargeTailBubbleRadius(), Path.Direction.CW);
        return path;
    }

    private final Path createSmallTailBubblePath(boolean isRtl) {
        Path path = new Path();
        path.addCircle(positionBubble(isRtl, this.viewReactionsViewStyle.getSmallTailBubbleOffset()), this.viewReactionsViewStyle.getSmallTailBubbleCy(), this.viewReactionsViewStyle.getSmallTailBubbleRadius() - getStrokeOffset(), Path.Direction.CW);
        return path;
    }

    private final Paint getBubbleStrokePaintTheirs() {
        return (Paint) this.bubbleStrokePaintTheirs.getValue();
    }

    private final float getStrokeOffset() {
        float fFloatValue;
        if (this.isMyMessage) {
            fFloatValue = this.viewReactionsViewStyle.getBubbleBorderWidthMine();
        } else {
            if (!shouldDrawTheirsBorder()) {
                return 0.0f;
            }
            Float bubbleBorderWidthTheirs = this.viewReactionsViewStyle.getBubbleBorderWidthTheirs();
            AbstractC22676k.m65747g(bubbleBorderWidthTheirs);
            fFloatValue = bubbleBorderWidthTheirs.floatValue();
        }
        return fFloatValue / 2;
    }

    private final float positionBubble(boolean isRtl, float bubbleOffset) {
        float fCalculateBubbleCenterX = calculateBubbleCenterX(bubbleOffset);
        return isRtl ? this.bubbleWidth - fCalculateBubbleCenterX : fCalculateBubbleCenterX;
    }

    private final boolean shouldDrawTheirsBorder() {
        return (this.viewReactionsViewStyle.getBubbleBorderColorTheirs() == null || this.viewReactionsViewStyle.getBubbleBorderWidthTheirs() == null) ? false : true;
    }

    public final void drawReactionsBubble(Context context, Canvas canvas, int bubbleWidth, boolean isMyMessage, boolean isOrientedTowardsStart) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(canvas, "canvas");
        this.isMyMessage = isMyMessage;
        this.bubbleWidth = bubbleWidth;
        this.isOrientedTowardsStart = isOrientedTowardsStart;
        boolean zIsRtlLayout = ContextKt.isRtlLayout(context);
        Path path = new Path();
        Path pathCreateBubbleRoundRectPath = createBubbleRoundRectPath();
        Path.Op op3 = Path.Op.UNION;
        path.op(pathCreateBubbleRoundRectPath, op3);
        path.op(createLargeTailBubblePath(zIsRtlLayout), op3);
        path.op(createSmallTailBubblePath(zIsRtlLayout), op3);
        if (isMyMessage) {
            canvas.drawPath(path, this.bubblePaintMine);
            canvas.drawPath(path, this.bubbleStrokePaintMine);
        } else {
            canvas.drawPath(path, this.bubblePaintTheirs);
            if (shouldDrawTheirsBorder()) {
                canvas.drawPath(path, getBubbleStrokePaintTheirs());
            }
        }
    }
}
