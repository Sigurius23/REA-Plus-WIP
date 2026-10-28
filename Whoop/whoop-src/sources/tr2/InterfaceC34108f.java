package tr2;

import java.util.List;
import p518ub.InterfaceC34734g;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: tr2.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH'¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH'¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000bH'¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H'¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH'¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0007H'¢\u0006\u0004\b \u0010!¨\u0006\"À\u0006\u0003"}, m65681d2 = {"Ltr2/f;", "", "", "count", "()I", "noOfRows", "", "Ltr2/h;", "c", "(I)Ljava/util/List;", "", "", "d", "(ILq83/d;)Ljava/lang/Object;", "noRows", "from", "to", "b", "(ILjava/lang/String;Ljava/lang/String;)Ljava/util/List;", "e", "(ILjava/lang/String;Ljava/lang/String;)I", "dateTime", "g", "(Ljava/lang/String;)I", "Ll83/a0;", "deleteAll", "()V", "Lub/g;", "query", "a", "(Lub/g;)I", "logEventsDto", "f", "(Ltr2/h;)V", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC34108f {
    /* JADX INFO: renamed from: a */
    int mo107807a(InterfaceC34734g query);

    /* JADX INFO: renamed from: b */
    List<C34110h> mo107808b(int noRows, String from, String to3);

    /* JADX INFO: renamed from: c */
    List<C34110h> mo107809c(int noOfRows);

    int count();

    /* JADX INFO: renamed from: d */
    Object mo107810d(int i13, InterfaceC30057d<? super List<String>> interfaceC30057d);

    void deleteAll();

    /* JADX INFO: renamed from: e */
    int mo107811e(int noRows, String from, String to3);

    /* JADX INFO: renamed from: f */
    void mo107812f(C34110h logEventsDto);

    /* JADX INFO: renamed from: g */
    int mo107813g(String dateTime);
}
