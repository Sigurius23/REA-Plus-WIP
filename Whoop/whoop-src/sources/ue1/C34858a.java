package ue1;

import androidx.compose.foundation.layout.AbstractC1099a;
import com.whoop.educationModels.MediaHeader;
import com.whoop.educationModels.StickyButton;
import p291l0.InterfaceC22973k1;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: ue1.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lue1/a;", "", "<init>", "()V", "Lcom/whoop/educationModels/MediaHeader;", "mediaHeader", "Lcom/whoop/educationModels/StickyButton;", "stickyButton", "Ly3/f;", "stickyButtonShadowHeight", "Ll0/k1;", "a", "(Lcom/whoop/educationModels/MediaHeader;Lcom/whoop/educationModels/StickyButton;F)Ll0/k1;", "education_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34858a {
    /* JADX INFO: renamed from: a */
    public final InterfaceC22973k1 m109940a(MediaHeader mediaHeader, StickyButton stickyButton, float stickyButtonShadowHeight) {
        if (mediaHeader != null) {
            float f13 = 4 * 8;
            if (stickyButton == null) {
                stickyButtonShadowHeight = 0;
            }
            return AbstractC1099a.m3381c(0.0f, 0.0f, 0.0f, f13 + stickyButtonShadowHeight, 7);
        }
        float f14 = 8;
        float f15 = f14 * f14;
        if (stickyButton == null) {
            stickyButtonShadowHeight = 0;
        }
        return AbstractC1099a.m3381c(0.0f, 0.0f, 0.0f, f15 + stickyButtonShadowHeight, 7);
    }
}
