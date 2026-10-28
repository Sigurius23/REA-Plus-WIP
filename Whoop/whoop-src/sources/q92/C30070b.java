package q92;

import f93.InterfaceC14291c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21493z;
import oh3.AbstractC27946d;
import oh3.AbstractC27947e;
import oh3.C27945c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: q92.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lq92/b;", "Lf93/c;", "", "Loh3/d;", "", "tag", "<init>", "(Ljava/lang/String;)V", "thisRef", "Lj93/z;", "property", "a", "(Ljava/lang/Object;Lj93/z;)Loh3/d;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30070b implements InterfaceC14291c {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String tag;

    public C30070b(String tag) {
        AbstractC22676k.m65750j(tag, "tag");
        this.tag = tag;
    }

    @Override // f93.InterfaceC14291c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC27946d getValue(Object thisRef, InterfaceC21493z property) {
        AbstractC22676k.m65750j(thisRef, "thisRef");
        AbstractC22676k.m65750j(property, "property");
        if (this.tag.length() <= 0) {
            return AbstractC27947e.f112718a;
        }
        C27945c c27945c = AbstractC27947e.f112718a;
        String tag = this.tag;
        c27945c.getClass();
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC27946d[] abstractC27946dArr = AbstractC27947e.f112720c;
        int length = abstractC27946dArr.length;
        int i13 = 0;
        while (i13 < length) {
            AbstractC27946d abstractC27946d = abstractC27946dArr[i13];
            i13++;
            abstractC27946d.m84375f().set(tag);
        }
        return c27945c;
    }
}
