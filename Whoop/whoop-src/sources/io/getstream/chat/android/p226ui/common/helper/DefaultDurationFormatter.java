package io.getstream.chat.android.p226ui.common.helper;

import ih0.AbstractC18489d0;
import p715kotlin.Metadata;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/helper/DefaultDurationFormatter;", "Lio/getstream/chat/android/ui/common/helper/DurationFormatter;", "<init>", "()V", "format", "", "durationInMillis", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
final class DefaultDurationFormatter implements DurationFormatter {
    @Override // io.getstream.chat.android.p226ui.common.helper.DurationFormatter
    public final String format(int durationInMillis) {
        long duration = DurationKt.toDuration(durationInMillis, DurationUnit.MILLISECONDS);
        return AbstractC18489d0.m53370k(AbstractC39414r.m125895n0(2, String.valueOf(Duration.m134274getInWholeMinutesimpl(duration))), ":", AbstractC39414r.m125895n0(2, String.valueOf(Duration.m134276getInWholeSecondsimpl(duration) % ((long) 60))));
    }
}
