package iq0;

import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Reaction;
import java.util.HashMap;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: iq0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b`\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Liq0/f;", "", "<init>", "()V", "Lio/getstream/chat/android/models/Message;", "message", "Ljava/util/HashMap;", "", "Liq0/g;", "Lkotlin/collections/HashMap;", "a", "(Lio/getstream/chat/android/models/Message;)Ljava/util/HashMap;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C20827f {

    /* JADX INFO: renamed from: a */
    public static final C20827f f78206a = new C20827f();

    private C20827f() {
    }

    /* JADX INFO: renamed from: a */
    public final HashMap<String, C20828g> m57445a(Message message) {
        AbstractC22676k.m65750j(message, "message");
        HashMap<String, C20828g> mapM73987V = AbstractC25247g0.m73987V(new C23465k("love", new C20828g(0, false, false, "love", 7, null)), new C23465k("like", new C20828g(0, false, false, "like", 7, null)), new C23465k("dislike", new C20828g(0, false, false, "dislike", 7, null)), new C23465k("haha", new C20828g(0, false, false, "haha", 7, null)), new C23465k("wow", new C20828g(0, false, false, "wow", 7, null)), new C23465k("sad", new C20828g(0, false, false, "sad", 7, null)), new C23465k("strong", new C20828g(0, false, false, "strong", 7, null)));
        for (Map.Entry<String, Integer> entry : message.getReactionCounts().entrySet()) {
            String key = entry.getKey();
            int iIntValue = entry.getValue().intValue();
            if (mapM73987V.containsKey(key)) {
                C20828g c20828g = mapM73987V.get(key);
                AbstractC22676k.m65747g(c20828g);
                mapM73987V.put(key, C20828g.m57446b(c20828g, iIntValue, false, true, null, 10, null));
            }
        }
        for (Reaction reaction : message.getOwnReactions()) {
            if (mapM73987V.containsKey(reaction.getType())) {
                String type = reaction.getType();
                C20828g c20828g2 = mapM73987V.get(reaction.getType());
                AbstractC22676k.m65747g(c20828g2);
                mapM73987V.put(type, C20828g.m57446b(c20828g2, 0, true, false, null, 13, null));
            }
        }
        return mapM73987V;
    }
}
