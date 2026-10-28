package com.whoop.data.repositories;

import js0.AbstractC21907a;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lcom/whoop/data/repositories/AiPollingDelay;", "Ljs0/a;", "", "<init>", "()V", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class AiPollingDelay extends AbstractC21907a<Long> {
    public static final AiPollingDelay INSTANCE = new AiPollingDelay();

    private AiPollingDelay() {
        super("AI_POLLING_DELAY", 500L);
    }
}
