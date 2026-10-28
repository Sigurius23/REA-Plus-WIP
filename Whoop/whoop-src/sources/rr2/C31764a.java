package rr2;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: rr2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u0013\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\t2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\t2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u000eJ!\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00172\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\tH\u0016¢\u0006\u0004\b\"\u0010#J)\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\t2\u0010\u0010\f\u001a\f\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0004\b%\u0010\u000eJ\u001f\u0010'\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010&\u001a\u00020\tH\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b)\u0010#R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, m65681d2 = {"Lrr2/a;", "Lrr2/c;", "", "reporters", "<init>", "(Ljava/util/List;)V", "Ll83/a0;", "a", "()V", "", "message", "", "metadata", "l", "(Ljava/lang/String;Ljava/util/Map;)V", "from", "to", "", "additionalData", "n", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "tag", "r", "", "thr", "g", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "p", "(Ljava/lang/Throwable;)V", "throwable", "tags", "o", "(Ljava/lang/Throwable;Ljava/util/Map;)V", "userId", "d", "(Ljava/lang/String;)V", "section", "j", "value", "c", "(Ljava/lang/String;Ljava/lang/String;)V", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/util/List;", "essentials_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31764a implements InterfaceC31766c {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final List<InterfaceC31766c> reporters;

    /* JADX WARN: Multi-variable type inference failed */
    public C31764a(List<? extends InterfaceC31766c> reporters) {
        AbstractC22676k.m65750j(reporters, "reporters");
        this.reporters = reporters;
    }

    @Override // rr2.InterfaceC31766c
    /* JADX INFO: renamed from: a */
    public void mo98622a() {
        Iterator<T> it = this.reporters.iterator();
        while (it.hasNext()) {
            ((InterfaceC31766c) it.next()).mo98622a();
        }
    }

    @Override // rr2.InterfaceC31766c
    /* JADX INFO: renamed from: b */
    public void mo98623b(String tag) {
        AbstractC22676k.m65750j(tag, "tag");
        Iterator<T> it = this.reporters.iterator();
        while (it.hasNext()) {
            ((InterfaceC31766c) it.next()).mo98623b(tag);
        }
    }

    @Override // rr2.InterfaceC31766c
    /* JADX INFO: renamed from: c */
    public void mo98624c(String tag, String value) {
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(value, "value");
        Iterator<T> it = this.reporters.iterator();
        while (it.hasNext()) {
            ((InterfaceC31766c) it.next()).mo98624c(tag, value);
        }
    }

    @Override // rr2.InterfaceC31766c
    /* JADX INFO: renamed from: d */
    public void mo98625d(String userId) {
        AbstractC22676k.m65750j(userId, "userId");
        Iterator<T> it = this.reporters.iterator();
        while (it.hasNext()) {
            ((InterfaceC31766c) it.next()).mo98625d(userId);
        }
    }

    @Override // rr2.InterfaceC31766c
    @InterfaceC23457c
    /* JADX INFO: renamed from: g */
    public void mo98626g(Throwable thr, String message) {
        AbstractC22676k.m65750j(thr, "thr");
        Iterator<T> it = this.reporters.iterator();
        while (it.hasNext()) {
            ((InterfaceC31766c) it.next()).mo98626g(thr, message);
        }
    }

    @Override // rr2.InterfaceC31766c
    /* JADX INFO: renamed from: j */
    public void mo98627j(String section, Map<String, ?> metadata) {
        AbstractC22676k.m65750j(section, "section");
        AbstractC22676k.m65750j(metadata, "metadata");
        Iterator<T> it = this.reporters.iterator();
        while (it.hasNext()) {
            ((InterfaceC31766c) it.next()).mo98627j(section, metadata);
        }
    }

    @Override // rr2.InterfaceC31766c
    /* JADX INFO: renamed from: l */
    public void mo98628l(String message, Map<String, String> metadata) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(metadata, "metadata");
        Iterator<T> it = this.reporters.iterator();
        while (it.hasNext()) {
            ((InterfaceC31766c) it.next()).mo98628l(message, metadata);
        }
    }

    @Override // rr2.InterfaceC31766c
    /* JADX INFO: renamed from: n */
    public void mo98629n(String from, String to3, Map<String, ? extends Object> additionalData) {
        AbstractC22676k.m65750j(to3, "to");
        AbstractC22676k.m65750j(additionalData, "additionalData");
        Iterator<T> it = this.reporters.iterator();
        while (it.hasNext()) {
            ((InterfaceC31766c) it.next()).mo98629n(from, to3, additionalData);
        }
    }

    @Override // rr2.InterfaceC31766c
    /* JADX INFO: renamed from: o */
    public void mo98630o(Throwable throwable, Map<String, String> tags) {
        AbstractC22676k.m65750j(throwable, "throwable");
        AbstractC22676k.m65750j(tags, "tags");
        Iterator<T> it = this.reporters.iterator();
        while (it.hasNext()) {
            ((InterfaceC31766c) it.next()).mo98630o(throwable, tags);
        }
    }

    @Override // rr2.InterfaceC31766c
    /* JADX INFO: renamed from: p */
    public void mo98631p(Throwable thr) {
        AbstractC22676k.m65750j(thr, "thr");
        Iterator<T> it = this.reporters.iterator();
        while (it.hasNext()) {
            ((InterfaceC31766c) it.next()).mo98631p(thr);
        }
    }

    @Override // rr2.InterfaceC31766c
    /* JADX INFO: renamed from: r */
    public void mo98632r(String tag, Map<String, String> additionalData) {
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(additionalData, "additionalData");
        Iterator<T> it = this.reporters.iterator();
        while (it.hasNext()) {
            ((InterfaceC31766c) it.next()).mo98632r(tag, additionalData);
        }
    }
}
