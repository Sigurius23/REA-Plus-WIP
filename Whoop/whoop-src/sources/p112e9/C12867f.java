package p112e9;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.ParserException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p284ko.C22629m;
import p398p9.InterfaceC28989m;

/* JADX INFO: renamed from: e9.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C12867f implements InterfaceC28989m {

    /* JADX INFO: renamed from: w */
    public static final Pattern f44248w = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    @Override // p398p9.InterfaceC28989m
    /* JADX INFO: renamed from: c */
    public final Object mo36141c(Uri uri, C22629m c22629m) throws IOException {
        String line = new BufferedReader(new InputStreamReader(c22629m, StandardCharsets.UTF_8)).readLine();
        try {
            Matcher matcher = f44248w.matcher(line);
            if (!matcher.matches()) {
                throw ParserException.m5050b(null, "Couldn't parse timestamp: " + line);
            }
            String strGroup = matcher.group(1);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            long time = simpleDateFormat.parse(strGroup).getTime();
            if (!"Z".equals(matcher.group(2))) {
                long j7 = "+".equals(matcher.group(4)) ? 1L : -1L;
                long j13 = Long.parseLong(matcher.group(5));
                String strGroup2 = matcher.group(7);
                time -= (((j13 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60000) * j7;
            }
            return Long.valueOf(time);
        } catch (ParseException e5) {
            throw ParserException.m5050b(e5, null);
        }
    }
}
