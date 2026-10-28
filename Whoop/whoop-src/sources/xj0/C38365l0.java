package xj0;

import java.nio.ByteBuffer;
import lt0.AbstractC24727d;
import lt0.EnumC24728e;
import lt0.EnumC24733j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: xj0.l0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m65681d2 = {"Lxj0/l0;", "Lxj0/b;", "Lxj0/w;", "selection", "<init>", "(Lxj0/w;)V", "i", "Lxj0/w;", "getSelection", "()Lxj0/w;", "j", "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38365l0 extends AbstractC38334b {

    /* JADX INFO: renamed from: j */
    private static final a f164282j = new a(null);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final EnumC38389w selection;

    /* JADX INFO: renamed from: xj0.l0$a */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lxj0/l0$a;", "", "<init>", "()V", "Lxj0/w;", "selection", "Ljava/nio/ByteBuffer;", "b", "(Lxj0/w;)Ljava/nio/ByteBuffer;", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public final ByteBuffer m122924b(EnumC38389w selection) {
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(2).order(AbstractC24727d.m72403a());
            byteBufferOrder.put(EnumC24733j.REVISION_1.getValue());
            byteBufferOrder.put(selection.getInput());
            return byteBufferOrder;
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38365l0(EnumC38389w selection) {
        super(EnumC24728e.TOGGLE_LABRADOR_RAW_SAVE, f164282j.m122924b(selection), null, 4, null);
        AbstractC22676k.m65750j(selection, "selection");
        this.selection = selection;
    }
}
