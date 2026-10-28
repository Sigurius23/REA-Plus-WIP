package kotlinx.coroutines.channels;

import java.util.NoSuchElementException;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m65681d2 = {"Lkotlinx/coroutines/channels/ClosedReceiveChannelException;", "Ljava/util/NoSuchElementException;", "Lkotlin/NoSuchElementException;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class ClosedReceiveChannelException extends NoSuchElementException {
    public ClosedReceiveChannelException() {
        super("Channel was closed");
    }
}
