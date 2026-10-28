package io.getstream.chat.android.p226ui.feature.messages.list.background;

import android.content.Context;
import android.content.res.ColorStateList;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.IntKt;
import kr.C22782a;
import kr.C22786e;
import kr.C22788g;
import kr.C22790i;
import kr.C22791j;
import kr.C22792k;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/background/ShapeAppearanceModelFactory;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "defaultCornerRadius", "differentCornerRadius", "", "isMine", "isBottomPosition", "Lkr/k;", "create", "(Landroid/content/Context;FFZZ)Lkr/k;", "Lkr/g;", "fileBackground", "(Landroid/content/Context;)Lkr/g;", "audioBackground", "CORNER_SIZE_FILE_PX", "F", "CORNER_SIZE_AUDIO_PX", "STROKE_WIDTH_PX", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ShapeAppearanceModelFactory {
    public static final ShapeAppearanceModelFactory INSTANCE = new ShapeAppearanceModelFactory();
    private static final float CORNER_SIZE_FILE_PX = IntKt.dpToPxPrecise(16);
    private static final float CORNER_SIZE_AUDIO_PX = IntKt.dpToPxPrecise(14);
    private static final float STROKE_WIDTH_PX = IntKt.dpToPxPrecise(1);

    private ShapeAppearanceModelFactory() {
    }

    public final C22788g audioBackground(Context context) {
        AbstractC22676k.m65750j(context, "context");
        C22790i c22790i = new C22790i();
        C22790i c22790i2 = new C22790i();
        C22790i c22790i3 = new C22790i();
        C22790i c22790i4 = new C22790i();
        C22786e c22786e = new C22786e(0);
        C22786e c22786e2 = new C22786e(0);
        C22786e c22786e3 = new C22786e(0);
        C22786e c22786e4 = new C22786e(0);
        float f13 = CORNER_SIZE_AUDIO_PX;
        C22782a c22782a = new C22782a(f13);
        C22782a c22782a2 = new C22782a(f13);
        C22782a c22782a3 = new C22782a(f13);
        C22782a c22782a4 = new C22782a(f13);
        C22792k c22792k = new C22792k();
        c22792k.f89766a = c22790i;
        c22792k.f89767b = c22790i2;
        c22792k.f89768c = c22790i3;
        c22792k.f89769d = c22790i4;
        c22792k.f89770e = c22782a;
        c22792k.f89771f = c22782a2;
        c22792k.f89772g = c22782a3;
        c22792k.f89773h = c22782a4;
        c22792k.f89774i = c22786e;
        c22792k.f89775j = c22786e2;
        c22792k.f89776k = c22786e3;
        c22792k.f89777l = c22786e4;
        C22788g c22788g = new C22788g(c22792k);
        float f14 = STROKE_WIDTH_PX;
        int color = AbstractC32122c.getColor(context, C19469R.color.stream_ui_grey_whisper);
        c22788g.m66017s(f14);
        c22788g.m66015q(ColorStateList.valueOf(color));
        c22788g.setTint(AbstractC32122c.getColor(context, C19469R.color.stream_ui_white));
        return c22788g;
    }

    public final C22792k create(Context context, float defaultCornerRadius, float differentCornerRadius, boolean isMine, boolean isBottomPosition) {
        AbstractC22676k.m65750j(context, "context");
        C22791j c22791j = new C22791j();
        c22791j.m66022b(defaultCornerRadius);
        if (isBottomPosition) {
            boolean zIsRtlLayout = ContextKt.isRtlLayout(context);
            if (!zIsRtlLayout && isMine) {
                c22791j.m66024d(differentCornerRadius);
            } else if (!zIsRtlLayout && !isMine) {
                c22791j.m66023c(differentCornerRadius);
            } else if (zIsRtlLayout && isMine) {
                c22791j.m66023c(differentCornerRadius);
            } else if (zIsRtlLayout && !isMine) {
                c22791j.m66024d(differentCornerRadius);
            }
        }
        return c22791j.m66021a();
    }

    public final C22788g fileBackground(Context context) {
        AbstractC22676k.m65750j(context, "context");
        C22790i c22790i = new C22790i();
        C22790i c22790i2 = new C22790i();
        C22790i c22790i3 = new C22790i();
        C22790i c22790i4 = new C22790i();
        C22786e c22786e = new C22786e(0);
        C22786e c22786e2 = new C22786e(0);
        C22786e c22786e3 = new C22786e(0);
        C22786e c22786e4 = new C22786e(0);
        float f13 = CORNER_SIZE_FILE_PX;
        C22782a c22782a = new C22782a(f13);
        C22782a c22782a2 = new C22782a(f13);
        C22782a c22782a3 = new C22782a(f13);
        C22782a c22782a4 = new C22782a(f13);
        C22792k c22792k = new C22792k();
        c22792k.f89766a = c22790i;
        c22792k.f89767b = c22790i2;
        c22792k.f89768c = c22790i3;
        c22792k.f89769d = c22790i4;
        c22792k.f89770e = c22782a;
        c22792k.f89771f = c22782a2;
        c22792k.f89772g = c22782a3;
        c22792k.f89773h = c22782a4;
        c22792k.f89774i = c22786e;
        c22792k.f89775j = c22786e2;
        c22792k.f89776k = c22786e3;
        c22792k.f89777l = c22786e4;
        C22788g c22788g = new C22788g(c22792k);
        float f14 = STROKE_WIDTH_PX;
        int color = AbstractC32122c.getColor(context, C19469R.color.stream_ui_grey_whisper);
        c22788g.m66017s(f14);
        c22788g.m66015q(ColorStateList.valueOf(color));
        c22788g.setTint(AbstractC32122c.getColor(context, C19469R.color.stream_ui_white));
        return c22788g;
    }
}
