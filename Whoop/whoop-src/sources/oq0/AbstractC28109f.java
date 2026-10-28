package oq0;

import java.util.regex.Pattern;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: oq0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0007\"\u001c\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003\"\u001c\u0010\u0006\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0003¨\u0006\u0007"}, m65681d2 = {"Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "a", "Ljava/util/regex/Pattern;", "ELITE_LEGACY_INVITE_CODE_PATTERN", "b", "COMMUNITY_INVITE_CODE_PATTERN", "community_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28109f {

    /* JADX INFO: renamed from: a */
    private static final Pattern f113701a = Pattern.compile("[A-Za-z0-9]{4}-[A-Za-z0-9]{4}");

    /* JADX INFO: renamed from: b */
    private static final Pattern f113702b = Pattern.compile("COMM-[A-Za-z0-9]{6}", 2);
}
