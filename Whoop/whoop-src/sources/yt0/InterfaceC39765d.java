package yt0;

import com.whoop.connectivityDataPacketsModels.console.dto.ConsolePacketsMetadata;
import ec3.InterfaceC13058l;
import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import zt0.C41124b;

/* JADX INFO: renamed from: yt0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H'¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0011J6\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0017\u0010\u0018J0\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0019\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0006H§@¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001cÀ\u0006\u0003"}, m65681d2 = {"Lyt0/d;", "", "", "c", "(Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "", "observeNewestTimestamp", "()Lec3/l;", "Lzt0/b;", "consolePacketsDtoNew", "Ll83/a0;", "f", "(Lzt0/b;Lq83/d;)Ljava/lang/Object;", "noOfRows", "", "b", "(ILq83/d;)Ljava/lang/Object;", "noRows", "from", "to", "Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;", "consolePacketsMetadata", "e", "(IJJLcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;Lq83/d;)Ljava/lang/Object;", "d", "a", "(JLq83/d;)Ljava/lang/Object;", "connectivity-data-packets-model_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC39765d {
    /* JADX INFO: renamed from: a */
    Object mo127292a(long j7, InterfaceC30057d<? super Integer> interfaceC30057d);

    /* JADX INFO: renamed from: b */
    Object mo127293b(int i13, InterfaceC30057d<? super List<C41124b>> interfaceC30057d);

    /* JADX INFO: renamed from: c */
    Object mo127294c(InterfaceC30057d<? super Integer> interfaceC30057d);

    /* JADX INFO: renamed from: d */
    Object mo127295d(int i13, long j7, long j13, ConsolePacketsMetadata consolePacketsMetadata, InterfaceC30057d<? super Integer> interfaceC30057d);

    /* JADX INFO: renamed from: e */
    Object mo127296e(int i13, long j7, long j13, ConsolePacketsMetadata consolePacketsMetadata, InterfaceC30057d<? super List<C41124b>> interfaceC30057d);

    /* JADX INFO: renamed from: f */
    Object mo127297f(C41124b c41124b, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    InterfaceC13058l observeNewestTimestamp();
}
