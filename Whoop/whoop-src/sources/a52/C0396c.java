package a52;

import java.nio.ByteBuffer;
import lt0.AbstractC24727d;
import lt0.EnumC24733j;
import lt0.EnumC24735l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import st0.EnumC32978v;
import xj0.AbstractC38334b;

/* JADX INFO: renamed from: a52.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m65681d2 = {"La52/c;", "Lxj0/b;", "<init>", "()V", "i", "a", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0396c extends AbstractC38334b {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a52.c$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"La52/c$a;", "", "<init>", "()V", "Ljava/nio/ByteBuffer;", "b", "()Ljava/nio/ByteBuffer;", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public final ByteBuffer m1091b() {
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(1).order(AbstractC24727d.m72403a());
            byteBufferOrder.put(EnumC24733j.REVISION_1.getValue());
            return byteBufferOrder;
        }

        private Companion() {
        }
    }

    public C0396c() {
        super(EnumC24735l.HISTORICAL_PULL_ABORT, INSTANCE.m1091b(), EnumC32978v.PUFFIN);
    }
}
