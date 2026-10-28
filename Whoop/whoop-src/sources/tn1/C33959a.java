package tn1;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: tn1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Ltn1/a;", "", "<init>", "()V", "", "imageUrl", "", "a", "(Ljava/lang/String;)Ljava/lang/Integer;", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33959a {
    /* JADX INFO: renamed from: a */
    public final Integer m107408a(String imageUrl) {
        if (AbstractC22676k.m65745e(imageUrl, "https://d3feqk8jsfbag1.cloudfront.net/home/notifications/wake_up_rooster.png")) {
            return 1;
        }
        if (AbstractC22676k.m65745e(imageUrl, "https://d3feqk8jsfbag1.cloudfront.net/home/notifications/wake_up_bird.png")) {
            return 2;
        }
        return AbstractC22676k.m65745e(imageUrl, "https://d3feqk8jsfbag1.cloudfront.net/home/notifications/wake_up_skyline.png") ? 3 : null;
    }
}
