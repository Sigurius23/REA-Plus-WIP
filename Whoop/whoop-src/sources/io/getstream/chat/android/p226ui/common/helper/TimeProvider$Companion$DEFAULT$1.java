package io.getstream.chat.android.p226ui.common.helper;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class TimeProvider$Companion$DEFAULT$1 implements TimeProvider {
    public static final TimeProvider$Companion$DEFAULT$1 INSTANCE = new TimeProvider$Companion$DEFAULT$1();

    @Override // io.getstream.chat.android.p226ui.common.helper.TimeProvider, c93.InterfaceC4339a
    public final Long invoke() {
        return Long.valueOf(System.currentTimeMillis());
    }
}
