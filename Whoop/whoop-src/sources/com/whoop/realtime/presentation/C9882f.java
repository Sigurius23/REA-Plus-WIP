package com.whoop.realtime.presentation;

import android.app.Activity;
import android.content.Intent;
import com.whoop.service.network.model.Sport;
import lm2.C24517c;
import lm2.C24518d;
import lm2.InterfaceC24516b;
import p479s4.AbstractC32126g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.whoop.realtime.presentation.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lcom/whoop/realtime/presentation/f;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Llm2/b;", "a", "(Landroid/app/Activity;)Llm2/b;", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C9882f {
    /* JADX INFO: renamed from: a */
    public final InterfaceC24516b m24024a(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
        Intent intent = activity.getIntent();
        RealTimeRecordActivity.Companion companion = RealTimeRecordActivity.INSTANCE;
        AbstractC22676k.m65747g(intent);
        if (companion.m23845d(intent)) {
            return new C24517c(false);
        }
        if (companion.m23844c(intent)) {
            return new C24517c(true);
        }
        if (companion.m23842a(intent)) {
            return new C24518d((Sport) AbstractC32126g.m100043h(intent, "sport", Sport.class));
        }
        return null;
    }
}
