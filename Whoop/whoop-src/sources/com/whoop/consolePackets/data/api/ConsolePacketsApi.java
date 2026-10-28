package com.whoop.consolePackets.data.api;

import java.util.Map;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import ud3.AbstractC34846v0;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37279j;
import wg3.InterfaceC37284o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J6\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H§@¢\u0006\u0004\b\t\u0010\nJ6\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H§@¢\u0006\u0004\b\u000b\u0010\n¨\u0006\fÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/consolePackets/data/api/ConsolePacketsApi;", "", "Lud3/v0;", "body", "", "", "headers", "Lpg3/v0;", "Ll83/a0;", "uploadLogs", "(Lud3/v0;Ljava/util/Map;Lq83/d;)Ljava/lang/Object;", "uploadConsoleEventPackets", "console-packets_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface ConsolePacketsApi {
    @InterfaceC37284o("log-service/v1/log/strap")
    Object uploadConsoleEventPackets(@InterfaceC37270a AbstractC34846v0 abstractC34846v0, @InterfaceC37279j Map<String, String> map, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37284o("log-service/v1/log/mobile")
    Object uploadLogs(@InterfaceC37270a AbstractC34846v0 abstractC34846v0, @InterfaceC37279j Map<String, String> map, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);
}
