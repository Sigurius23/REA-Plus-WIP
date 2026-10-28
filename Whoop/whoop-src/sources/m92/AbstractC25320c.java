package m92;

import com.whoop.service.push.InvalidPushDataException;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: m92.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\f\u0010\r\"\u0015\u0010\u0010\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Lm92/f;", "", "key", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lm92/f;Ljava/lang/String;)Ljava/lang/String;", "", "e", "(Lm92/f;Ljava/lang/String;)I", "", "f", "(Lm92/f;Ljava/lang/String;)Ljava/util/List;", "Lcom/whoop/service/push/InvalidPushDataException;", "d", "(Lm92/f;Ljava/lang/String;)Lcom/whoop/service/push/InvalidPushDataException;", "g", "(Lm92/f;)Ljava/lang/String;", "notificationTypeOrThrow", "app_prodStandardRelease"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25320c {
    /* JADX INFO: renamed from: d */
    private static final InvalidPushDataException m74361d(C25323f c25323f, String str) {
        return new InvalidPushDataException(c25323f, AbstractC11266d.m30461o("Failed to find: ", str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final int m74362e(C25323f c25323f, String str) throws InvalidPushDataException {
        String strM74365h = m74365h(c25323f, str);
        Integer numM125932Q = AbstractC39421y.m125932Q(strM74365h);
        if (numM125932Q != null) {
            return numM125932Q.intValue();
        }
        throw new InvalidPushDataException(c25323f, AbstractC2875y.m8300m("Key ", str, " returned ", strM74365h, ". Failed to parse into Int"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final List<String> m74363f(C25323f c25323f, String str) throws InvalidPushDataException {
        try {
            JSONArray jSONArray = new JSONArray(m74365h(c25323f, str));
            ArrayList arrayList = new ArrayList(jSONArray.length());
            int length = jSONArray.length();
            for (int i13 = 0; i13 < length; i13++) {
                arrayList.add(jSONArray.getString(i13));
            }
            return arrayList;
        } catch (Exception unused) {
            throw new InvalidPushDataException(c25323f, AbstractC11266d.m30461o("Failed to parse JSON string array: ", str));
        }
    }

    /* JADX INFO: renamed from: g */
    public static final String m74364g(C25323f c25323f) {
        AbstractC22676k.m65750j(c25323f, "<this>");
        return m74365h(c25323f, "notificationType");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final String m74365h(C25323f c25323f, String str) throws InvalidPushDataException {
        String strM74368b = c25323f.m74368b(str);
        if (strM74368b != null) {
            return strM74368b;
        }
        throw m74361d(c25323f, str);
    }
}
