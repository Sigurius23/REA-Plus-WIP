package uw2;

import com.whoop.whoopaction.domain.models.Action;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: uw2.c */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m65681d2 = {"Luw2/c;", "Lwc3/c;", "Lcom/whoop/whoopaction/domain/models/Action;", "<init>", "()V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "b", "(Lzc3/e;Lcom/whoop/whoopaction/domain/models/Action;)V", "Lzc3/d;", "decoder", "a", "(Lzc3/d;)Lcom/whoop/whoopaction/domain/models/Action;", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "descriptor", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35318c implements InterfaceC37138c {

    /* JADX INFO: renamed from: b */
    public static final C35318c f150512b = new C35318c();

    /* JADX INFO: renamed from: c */
    public static final int f150513c = 8;

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ C35317b f150514a = new C35317b(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);

    /* JADX WARN: Multi-variable type inference failed */
    private C35318c() {
    }

    @Override // wc3.InterfaceC37137b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Action deserialize(InterfaceC40541d decoder) {
        AbstractC22676k.m65750j(decoder, "decoder");
        return this.f150514a.deserialize(decoder);
    }

    @Override // wc3.InterfaceC37145j
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC40542e encoder, Action value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        this.f150514a.serialize(encoder, value);
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return this.f150514a.getDescriptor();
    }
}
