package vq0;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: vq0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lvq0/b;", "Landroid/text/style/MetricAffectingSpan;", "Landroid/graphics/Typeface;", "typeface", "", "letterSpacing", "<init>", "(Landroid/graphics/Typeface;F)V", "Landroid/graphics/Paint;", "paint", "tf", "spacing", "Ll83/a0;", "a", "(Landroid/graphics/Paint;Landroid/graphics/Typeface;F)V", "Landroid/text/TextPaint;", "ds", "updateDrawState", "(Landroid/text/TextPaint;)V", "updateMeasureState", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Landroid/graphics/Typeface;", "x", "F", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36278b extends MetricAffectingSpan {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final Typeface typeface;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final float letterSpacing;

    public C36278b(Typeface typeface, float f13) {
        AbstractC22676k.m65750j(typeface, "typeface");
        this.typeface = typeface;
        this.letterSpacing = f13;
    }

    /* JADX INFO: renamed from: a */
    private final void m115965a(Paint paint, Typeface tf4, float spacing) {
        paint.setTypeface(tf4);
        paint.setLetterSpacing(spacing);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint ds3) {
        AbstractC22676k.m65750j(ds3, "ds");
        m115965a(ds3, this.typeface, this.letterSpacing);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint paint) {
        AbstractC22676k.m65750j(paint, "paint");
        m115965a(paint, this.typeface, this.letterSpacing);
    }

    public /* synthetic */ C36278b(Typeface typeface, float f13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeface, (i13 & 2) != 0 ? 0.0f : f13);
    }
}
