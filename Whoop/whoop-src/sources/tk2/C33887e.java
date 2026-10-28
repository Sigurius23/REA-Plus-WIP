package tk2;

import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.time.Duration;
import kk2.AbstractC22551d;
import l83.C23465k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: tk2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Ltk2/e;", "", "<init>", "()V", "Ljava/time/Duration;", AttachmentExtensionsKt.EXTRA_DURATION, "Ll83/k;", "Lcom/whoop/design/util/TextResource;", "b", "(Ljava/time/Duration;)Ll83/k;", "target", "a", "(Ljava/time/Duration;)Lcom/whoop/design/util/TextResource;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33887e {

    /* JADX INFO: renamed from: a */
    public static final C33887e f141968a = new C33887e();

    private C33887e() {
    }

    /* JADX INFO: renamed from: a */
    public final TextResource m107175a(Duration target) {
        AbstractC22676k.m65750j(target, "target");
        long seconds = target.getSeconds();
        if (seconds < 0) {
            seconds = 0;
        }
        return new TextResource.C8688b(AbstractC22551d.f88684Z, new TextResource.AbstractC8690d.a(Long.valueOf(seconds / 3600)), new TextResource.AbstractC8690d.a(Long.valueOf((seconds % 3600) / 60)), new TextResource.AbstractC8690d.a(Long.valueOf(seconds % 60)));
    }

    /* JADX INFO: renamed from: b */
    public final C23465k m107176b(Duration duration) {
        AbstractC22676k.m65750j(duration, "duration");
        long seconds = duration.getSeconds();
        if (seconds < 0) {
            seconds = 0;
        }
        return new C23465k(new TextResource.C8688b(AbstractC22551d.f88683Y, new TextResource.AbstractC8690d.a(Long.valueOf(seconds / 3600)), new TextResource.AbstractC8690d.a(Long.valueOf((seconds % 3600) / 60))), new TextResource.C8688b(AbstractC22551d.f88686a0, new TextResource.AbstractC8690d.a(Long.valueOf(seconds % 60))));
    }
}
