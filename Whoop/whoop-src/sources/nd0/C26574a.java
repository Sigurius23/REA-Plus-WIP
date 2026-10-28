package nd0;

import androidx.core.app.NotificationCompat;
import c31.C3927k;
import c31.EnumC3920d;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import gz0.EnumC16313m0;
import ma0.AbstractC25370d;
import p715kotlin.Metadata;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: nd0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lnd0/a;", "", "<init>", "()V", "", "buttonTextDisplay", "", NotificationCompat.CATEGORY_PROGRESS, "", "enabled", "Lc31/k;", "a", "(Ljava/lang/String;Ljava/lang/Float;Z)Lc31/k;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26574a {
    /* JADX INFO: renamed from: a */
    public final C3927k m78748a(String buttonTextDisplay, Float progress, boolean enabled) {
        boolean z4 = progress != null && progress.floatValue() < 1.0f;
        EnumC3920d enumC3920d = z4 ? EnumC3920d.PROGRESS : EnumC3920d.FILLED;
        TextResource c8691e = buttonTextDisplay != null ? new TextResource.C8691e(buttonTextDisplay) : new TextResource.C8688b(AbstractC25370d.f99440i, null, 2, null);
        EnumC16313m0 enumC16313m0 = z4 ? EnumC16313m0.ARROW_FORWARD : EnumC16313m0.CHECKMARK;
        EnumC39333f enumC39333f = z4 ? EnumC39333f.BRAND_WHITE : EnumC39333f.BRAND_BLACK;
        return new C3927k(enumC3920d, c8691e, EnumC39333f.BRAND_WHITE, null, null, enumC16313m0, 0, 0, progress, enabled, false, z4 ? null : EnumC39333f.ACCENT_POSITIVE_TREND, z4 ? AbstractC15673b0.m44006R() : null, enumC39333f, null, null, null, 115928, null);
    }
}
