package uw2;

import com.whoop.whoopaction.domain.models.ActionErrorCode;
import java.util.Iterator;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import vf3.AbstractC35952b;
import wc3.InterfaceC37138c;
import yc3.C39441e;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: uw2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Luw2/a;", "Lwc3/c;", "Lcom/whoop/whoopaction/domain/models/ActionErrorCode;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "b", "(Lzc3/e;Lcom/whoop/whoopaction/domain/models/ActionErrorCode;)V", "Lzc3/d;", "decoder", "a", "(Lzc3/d;)Lcom/whoop/whoopaction/domain/models/ActionErrorCode;", "Ltr2/n;", "Ltr2/n;", "logger", "Lyc3/g;", "c", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "descriptor", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35316a implements InterfaceC37138c {

    /* JADX INFO: renamed from: a */
    public static final C35316a f150501a = new C35316a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final InterfaceC34116n logger = InterfaceC34116n.INSTANCE.m107848a("ActionErrorCode");

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final InterfaceC39443g descriptor = AbstractC35952b.m114194b("ActionErrorCode", C39441e.f169698i);

    /* JADX INFO: renamed from: d */
    public static final int f150504d = 8;

    private C35316a() {
    }

    @Override // wc3.InterfaceC37137b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ActionErrorCode deserialize(InterfaceC40541d decoder) {
        Object next;
        AbstractC22676k.m65750j(decoder, "decoder");
        String strDecodeString = decoder.decodeString();
        Iterator<E> it = ActionErrorCode.getEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((ActionErrorCode) next).name(), strDecodeString));
        ActionErrorCode actionErrorCode = (ActionErrorCode) next;
        if (actionErrorCode != null) {
            return actionErrorCode;
        }
        ActionErrorCode actionErrorCode2 = ActionErrorCode.UNKNOWN;
        logger.mo85226q(AbstractC11266d.m30461o("Unrecognized ActionErrorCode: ", strDecodeString), new AbstractC30556a.a[0]);
        return actionErrorCode2;
    }

    @Override // wc3.InterfaceC37145j
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC40542e encoder, ActionErrorCode value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        encoder.encodeString(value.name());
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return descriptor;
    }
}
