package u82;

import ad3.AbstractC0757c;
import java.lang.reflect.Type;
import p549vb.AbstractC35862g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: u82.i */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lu82/i;", "Lu82/a;", "Lad3/c;", "json", "<init>", "(Lad3/c;)V", "T", "", "string", "Ljava/lang/reflect/Type;", "type", "a", "(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "Lad3/c;", "serialization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34648i implements InterfaceC34640a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC0757c json;

    public C34648i(AbstractC0757c json) {
        AbstractC22676k.m65750j(json, "json");
        this.json = json;
    }

    @Override // u82.InterfaceC34640a
    /* JADX INFO: renamed from: a */
    public <T> T mo109477a(String string, Type type) {
        AbstractC22676k.m65750j(string, "string");
        AbstractC22676k.m65750j(type, "type");
        return (T) this.json.m1831b(AbstractC35862g.m113845h(this.json.f2764b, type), string);
    }
}
