package io.getstream.chat.android.client.helpers;

import com.iterable.iterableapi.C5378v;
import e93.AbstractC12889b;
import i93.C18282h;
import io.getstream.chat.android.client.utils.TimeProvider;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Attachment;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import m83.C25235a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import ud3.C34810e0;
import yb3.AbstractC39421y;
import yb3.C39412p;
import yb3.EnumC39413q;

/* JADX INFO: loaded from: classes11.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/client/helpers/AttachmentHelper;", "", "timeProvider", "Lio/getstream/chat/android/client/utils/TimeProvider;", "<init>", "(Lio/getstream/chat/android/client/utils/TimeProvider;)V", "hasValidImageUrl", "", "attachment", "Lio/getstream/chat/android/models/Attachment;", "hasStreamImageUrl", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AttachmentHelper {
    private static final Companion Companion = new Companion();
    private static final String QUERY_KEY_NAME_EXPIRES = "Expires";
    private static final C39412p STREAM_CDN_HOST_PATTERN;
    private final TimeProvider timeProvider;

    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/client/helpers/AttachmentHelper$Companion;", "", "<init>", "()V", "", "QUERY_KEY_NAME_EXPIRES", "Ljava/lang/String;", "Lyb3/p;", "STREAM_CDN_HOST_PATTERN", "Lyb3/p;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        EnumC39413q enumC39413q = EnumC39413q.IGNORE_CASE;
        STREAM_CDN_HOST_PATTERN = new C39412p("stream-chat-+.+\\.imgix.net$|.+\\.stream-io-cdn.com$", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AttachmentHelper() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean hasStreamImageUrl(Attachment attachment) {
        String str;
        AbstractC22676k.m65750j(attachment, "attachment");
        String imageUrl = attachment.getImageUrl();
        if (imageUrl == null) {
            return false;
        }
        C34810e0 c34810e0M16526b = null;
        try {
            C5378v c5378v = new C5378v(1);
            c5378v.m16528d(null, imageUrl);
            c34810e0M16526b = c5378v.m16526b();
        } catch (IllegalArgumentException unused) {
        }
        if (c34810e0M16526b == null || (str = c34810e0M16526b.f146565d) == null) {
            return false;
        }
        return STREAM_CDN_HOST_PATTERN.m125851e(str);
    }

    public final boolean hasValidImageUrl(Attachment attachment) {
        C34810e0 c34810e0M16526b;
        Set setUnmodifiableSet;
        Long lM125933R;
        AbstractC22676k.m65750j(attachment, "attachment");
        String imageUrl = attachment.getImageUrl();
        if (imageUrl != null) {
            String str = null;
            try {
                C5378v c5378v = new C5378v(1);
                c5378v.m16528d(null, imageUrl);
                c34810e0M16526b = c5378v.m16526b();
            } catch (IllegalArgumentException unused) {
                c34810e0M16526b = null;
            }
            if (c34810e0M16526b != null) {
                List list = c34810e0M16526b.f146568g;
                if (list == null) {
                    setUnmodifiableSet = C25235a0.f99113w;
                } else {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(list.size() / 2, 1.0f);
                    C18282h c18282hM36268d0 = AbstractC12889b.m36268d0(2, AbstractC12889b.m36278i0(0, list.size()));
                    int i13 = c18282hM36268d0.f71133w;
                    int i14 = c18282hM36268d0.f71134x;
                    int i15 = c18282hM36268d0.f71135y;
                    if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
                        while (true) {
                            Object obj = list.get(i13);
                            AbstractC22676k.m65747g(obj);
                            linkedHashSet.add(obj);
                            if (i13 == i14) {
                                break;
                            }
                            i13 += i15;
                        }
                    }
                    setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
                    AbstractC22676k.m65749i(setUnmodifiableSet, "unmodifiableSet(...)");
                }
                if (setUnmodifiableSet.contains(QUERY_KEY_NAME_EXPIRES)) {
                    if (list != null) {
                        C18282h c18282hM36268d1 = AbstractC12889b.m36268d0(2, AbstractC12889b.m36278i0(0, list.size()));
                        int i16 = c18282hM36268d1.f71133w;
                        int i17 = c18282hM36268d1.f71134x;
                        int i18 = c18282hM36268d1.f71135y;
                        if ((i18 > 0 && i16 <= i17) || (i18 < 0 && i17 <= i16)) {
                            while (true) {
                                if (!QUERY_KEY_NAME_EXPIRES.equals(list.get(i16))) {
                                    if (i16 == i17) {
                                        break;
                                    }
                                    i16 += i18;
                                } else {
                                    str = (String) list.get(i16 + 1);
                                    break;
                                }
                            }
                        }
                    }
                    if (str == null || (lM125933R = AbstractC39421y.m125933R(str)) == null || lM125933R.longValue() <= this.timeProvider.provideCurrentTimeInSeconds()) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public AttachmentHelper(TimeProvider timeProvider) {
        AbstractC22676k.m65750j(timeProvider, "timeProvider");
        this.timeProvider = timeProvider;
    }

    public /* synthetic */ AttachmentHelper(TimeProvider timeProvider, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? TimeProvider.INSTANCE : timeProvider);
    }
}
