package io.getstream.android.video.generated.infrastructure;

import com.squareup.wire.AbstractC5583n;
import jg3.C21678e;
import lg3.C24040b;
import p441qx.InterfaceC30729p;
import p441qx.InterfaceC30738t0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lio/getstream/android/video/generated/infrastructure/LocalDateTimeAdapter;", "", "<init>", "()V", "Ljg3/e;", "value", "", "toJson", "(Ljg3/e;)Ljava/lang/String;", "fromJson", "(Ljava/lang/String;)Ljg3/e;", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class LocalDateTimeAdapter {
    @InterfaceC30729p
    public final C21678e fromJson(String value) {
        AbstractC22676k.m65750j(value, "value");
        C24040b c24040b = C24040b.f95017g;
        C21678e c21678e = C21678e.f83243H;
        AbstractC5583n.m16762V(c24040b, "formatter");
        C21678e c21678e2 = (C21678e) c24040b.m70943b(value, C21678e.f83245J);
        AbstractC22676k.m65749i(c21678e2, "parse(...)");
        return c21678e2;
    }

    @InterfaceC30738t0
    public final String toJson(C21678e value) {
        AbstractC22676k.m65750j(value, "value");
        String strM70942a = C24040b.f95017g.m70942a(value);
        AbstractC22676k.m65749i(strM70942a, "format(...)");
        return strM70942a;
    }
}
