package hu1;

import ec3.InterfaceC13058l;
import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: hu1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u000e\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u000e\u0010\u0007J\u0017\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, m65681d2 = {"Lhu1/d;", "", "", "Lhu1/b;", "ecgPacketsList", "Ll83/a0;", "insertList", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "", "numberOfPackets", "packetRevision", "b", "(IILq83/d;)Ljava/lang/Object;", "labradorPacketDtoList", "a", "Lec3/l;", "", "observeNewestTimestamp", "()Lec3/l;", "labrador-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC17647d {
    /* JADX INFO: renamed from: a */
    Object mo50278a(List<C17645b> list, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: b */
    Object mo50279b(int i13, int i14, InterfaceC30057d<? super List<C17645b>> interfaceC30057d);

    Object insertList(List<C17645b> list, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    InterfaceC13058l observeNewestTimestamp();
}
