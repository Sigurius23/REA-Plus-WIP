package p748zc1;

import com.mapbox.maps.MapboxMap;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import w71.AbstractC36877d;
import w71.AbstractC36882f0;
import w71.C36873b;
import w71.C36901t;
import w71.C36906y;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: zc1.f4 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0019\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010#\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u00122\b\b\u0002\u0010!\u001a\u00020\u0012H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u000bH\u0002¢\u0006\u0004\b&\u0010'J\u0019\u0010)\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b)\u0010*J\u0019\u0010+\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b+\u0010*J\u0015\u0010.\u001a\u00020\r2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u0002002\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b1\u00102R&\u00106\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b04038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00105R%\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001038\u0006¢\u0006\f\n\u0004\b7\u00105\u001a\u0004\b8\u00109R\"\u0010@\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006A"}, m65681d2 = {"Lzc1/f4;", "", "<init>", "()V", "", "question", "context", "group", "Lw71/f0;", "type", "", "Lzc1/n2;", MapboxMap.QFE_CHILDREN, "Ll83/a0;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lw71/f0;Ljava/util/List;)V", "l", "(Ljava/lang/String;Lw71/f0;)Lzc1/n2;", "", "enabled", "Lw71/b;", "c", "(Z)Ljava/util/List;", "questions", "title", "d", "(Ljava/util/List;Ljava/lang/String;Z)Lw71/b;", "", "index", "Lw71/t;", "g", "(ILzc1/n2;Z)Lw71/t;", "isSubQuestion", "isEnabled", "Lw71/y;", "e", "(Lzc1/n2;ZZ)Lw71/y;", "state", "j", "(Lzc1/n2;)Lw71/f0;", "answer", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/Object;)Ljava/lang/String;", "i", "Lw71/d;", "action", "k", "(Lw71/d;)V", "Lzc1/g4;", "m", "(Z)Lzc1/g4;", "", "", "Ljava/util/Map;", "questionsByGroup", "b", "getAnswers", "()Ljava/util/Map;", "answers", "I", "getCurrentId", "()I", "setCurrentId", "(I)V", "currentId", "design-showcase_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40324f4 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Map<String, List<C40410n2>> questionsByGroup = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Map<Object, Object> answers = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int currentId;

    /* JADX WARN: Multi-variable type inference failed */
    public C40324f4() {
        int i13 = 1;
        int i14 = 0;
        m129718b(this, "Feel tired?", null, "MOOD", new AbstractC36882f0.i(null, i13, 0 == true ? 1 : 0), AbstractC37056f.m118958J(m129727l("To what extent?", new AbstractC36882f0.c(null, 0, 9, i14, "LOW", 9, null))), 2, null);
        m129718b(this, "Alcohol", "DRINKS", "LIFESTYLE", new AbstractC36882f0.d(null, 0, 9, 1, null), null, 16, null);
        Boolean bool = Boolean.FALSE;
        m129718b(this, "Cat in Bedroom", null, "LIFESTYLE", new AbstractC36882f0.i(bool), null, 18, null);
        m129717a("Caffeine", "Servings", "LIFESTYLE", new AbstractC36882f0.i(bool), AbstractC37056f.m118959K(m129727l("When was your last serving?", new AbstractC36882f0.f(0 == true ? 1 : 0, i13, 0 == true ? 1 : 0)), m129727l("How many cups?", new AbstractC36882f0.d(null, i14, 9, 1, 0 == true ? 1 : 0))));
        m129718b(this, "Did you listen to that song that goes ba di do dadum da ds screettttttt bap", null, "LIFESTYLE", new AbstractC36882f0.i(bool), null, 18, null);
        int i15 = 31;
        DefaultConstructorMarker defaultConstructorMarker = null;
        Double d3 = null;
        Double d14 = null;
        int i16 = 0;
        m129718b(this, "Workout", null, "EXERCISE", new AbstractC36882f0.i(0 == true ? 1 : 0, i13, 0 == true ? 1 : 0), AbstractC37056f.m118959K(m129727l("Go to a gym", new AbstractC36882f0.i(0 == true ? 1 : 0, i13, 0 == true ? 1 : 0)), m129727l("What time did you exercised?", new AbstractC36882f0.f(0 == true ? 1 : 0, i13, 0 == true ? 1 : 0)), m129727l("Number of Squats", new AbstractC36882f0.b(0 == true ? 1 : 0, d3, d14, i16, 0 == true ? 1 : 0, i15, defaultConstructorMarker)), m129727l("Number of Push Ups", new AbstractC36882f0.b(0 == true ? 1 : 0, d3, d14, i16, 0 == true ? 1 : 0, i15, defaultConstructorMarker))), 2, null);
        Object[] objArr = 0 == true ? 1 : 0;
        m129718b(this, "Feel tired?", null, "MOOD", new AbstractC36882f0.i(0 == true ? 1 : 0, i13, 0 == true ? 1 : 0), AbstractC37056f.m118958J(m129727l("To what extent?", new AbstractC36882f0.e(objArr, 0, 4, i16, "LOW", 9, defaultConstructorMarker))), 2, null);
    }

    /* JADX INFO: renamed from: a */
    private final void m129717a(String question, String context, String group, AbstractC36882f0 type, List<C40410n2> children) {
        C40410n2 c40410n2 = new C40410n2(this.currentId, question, context, group, type, children);
        Map<String, List<C40410n2>> map = this.questionsByGroup;
        List<C40410n2> arrayList = map.get(group);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(group, arrayList);
        }
        arrayList.add(c40410n2);
        this.currentId++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m129718b(C40324f4 c40324f4, String str, String str2, String str3, AbstractC36882f0 abstractC36882f0, List list, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str2 = "";
        }
        if ((i13 & 4) != 0) {
            str3 = "";
        }
        if ((i13 & 16) != 0) {
            list = C25271y.f99162w;
        }
        c40324f4.m129717a(str, str2, str3, abstractC36882f0, list);
    }

    /* JADX INFO: renamed from: c */
    private final List<C36873b> m129719c(boolean enabled) {
        List<String> listM74150t1 = AbstractC25265s.m74150t1(this.questionsByGroup.keySet());
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM74150t1, 10));
        for (String str : listM74150t1) {
            List<C40410n2> list = this.questionsByGroup.get(str);
            if (list == null) {
                list = C25271y.f99162w;
            }
            arrayList.add(m129720d(list, str, enabled));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    private final C36873b m129720d(List<C40410n2> questions, String title, boolean enabled) {
        List<C40410n2> list = questions;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            arrayList.add(m129723g(i13, (C40410n2) obj, enabled));
            i13 = i14;
        }
        return new C36873b(arrayList, title);
    }

    /* JADX INFO: renamed from: e */
    private final C36906y m129721e(C40410n2 question, boolean isSubQuestion, boolean isEnabled) {
        return new C36906y(question.getId(), null, question.getQuestion(), question.getContext(), isSubQuestion, isEnabled, m129726j(question), null, null, null, 898, null);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ C36906y m129722f(C40324f4 c40324f4, C40410n2 c40410n2, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        if ((i13 & 4) != 0) {
            z13 = true;
        }
        return c40324f4.m129721e(c40410n2, z4, z13);
    }

    /* JADX INFO: renamed from: g */
    private final C36901t m129723g(int index, C40410n2 question, boolean enabled) {
        Object obj = this.answers.get(Integer.valueOf(question.getId()));
        C36906y c36906yM129722f = m129722f(this, question, false, enabled, 2, null);
        List<C40410n2> listM130430a = question.m130430a();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM130430a, 10));
        Iterator<T> it = listM130430a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            arrayList.add(m129721e((C40410n2) it.next(), true, enabled));
        }
        return new C36901t(c36906yM129722f, arrayList, AbstractC22676k.m65745e(obj instanceof Boolean ? (Boolean) obj : null, Boolean.TRUE), false, index > 0, null, null, 104, null);
    }

    /* JADX INFO: renamed from: h */
    private final String m129724h(Object answer) {
        Integer num = answer instanceof Integer ? (Integer) answer : null;
        if (num == null) {
            return "";
        }
        int iIntValue = num.intValue();
        if (iIntValue < 0 || iIntValue >= 3) {
            return (iIntValue < 0 || iIntValue >= 5) ? "HIGH" : "MEDIUM";
        }
        return "LOW";
    }

    /* JADX INFO: renamed from: i */
    private final String m129725i(Object answer) {
        Integer num = answer instanceof Integer ? (Integer) answer : null;
        if (num == null) {
            return "";
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return "LOW";
        }
        if (iIntValue == 1) {
            return "MEDIUM";
        }
        if (iIntValue != 2) {
            return iIntValue != 3 ? "EVEN HIGHER" : "HIGHER";
        }
        return "HIGH";
    }

    /* JADX INFO: renamed from: j */
    private final AbstractC36882f0 m129726j(C40410n2 state) {
        AbstractC36882f0 abstractC36882f0M130434e = state.getType();
        if (abstractC36882f0M130434e instanceof AbstractC36882f0.b) {
            return new AbstractC36882f0.b((Double) this.answers.get(Integer.valueOf(state.getId())), null, null, 0, null, 30, null);
        }
        if (abstractC36882f0M130434e instanceof AbstractC36882f0.c) {
            return new AbstractC36882f0.c((Integer) this.answers.get(Integer.valueOf(state.getId())), ((AbstractC36882f0.c) state.getType()).getMin(), ((AbstractC36882f0.c) state.getType()).getMax(), 0, m129724h(this.answers.get(Integer.valueOf(state.getId()))), 8, null);
        }
        if (abstractC36882f0M130434e instanceof AbstractC36882f0.d) {
            return new AbstractC36882f0.d((Integer) this.answers.get(Integer.valueOf(state.getId())), ((AbstractC36882f0.d) state.getType()).getMin(), ((AbstractC36882f0.d) state.getType()).getMax());
        }
        if (abstractC36882f0M130434e instanceof AbstractC36882f0.e) {
            return new AbstractC36882f0.e((Integer) this.answers.get(Integer.valueOf(state.getId())), ((AbstractC36882f0.e) state.getType()).getMin(), ((AbstractC36882f0.e) state.getType()).getMax(), 0, m129725i(this.answers.get(Integer.valueOf(state.getId()))), 8, null);
        }
        if (abstractC36882f0M130434e instanceof AbstractC36882f0.f) {
            String str = (String) this.answers.get(Integer.valueOf(state.getId()));
            if (str == null) {
                str = "";
            }
            return new AbstractC36882f0.f(str);
        }
        if (abstractC36882f0M130434e instanceof AbstractC36882f0.h) {
            Boolean bool = (Boolean) this.answers.get(Integer.valueOf(state.getId()));
            return new AbstractC36882f0.h(Boolean.valueOf(bool != null ? bool.booleanValue() : false));
        }
        if (!(abstractC36882f0M130434e instanceof AbstractC36882f0.i)) {
            return state.getType();
        }
        Boolean bool2 = (Boolean) this.answers.get(Integer.valueOf(state.getId()));
        return new AbstractC36882f0.i(Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false));
    }

    /* JADX INFO: renamed from: l */
    private final C40410n2 m129727l(String question, AbstractC36882f0 type) {
        C40410n2 c40410n2 = new C40410n2(this.currentId, question, "", "", type, C25271y.f99162w);
        this.currentId++;
        return c40410n2;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ C40335g4 m129728n(C40324f4 c40324f4, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = true;
        }
        return c40324f4.m129730m(z4);
    }

    /* JADX INFO: renamed from: k */
    public final void m129729k(AbstractC36877d action) {
        AbstractC22676k.m65750j(action, "action");
        if (action instanceof AbstractC36877d.c) {
            AbstractC36877d.c cVar = (AbstractC36877d.c) action;
            this.answers.put(Integer.valueOf(cVar.getQuestionId()), cVar.getNumber());
            return;
        }
        if (action instanceof AbstractC36877d.d) {
            this.answers.put(Integer.valueOf(((AbstractC36877d.d) action).getQuestionId()), "3:00 pm");
            return;
        }
        if (action instanceof AbstractC36877d.g) {
            this.answers.put(Integer.valueOf(((AbstractC36877d.g) action).getQuestionId()), 100);
            return;
        }
        if (action instanceof AbstractC36877d.k) {
            AbstractC36877d.k kVar = (AbstractC36877d.k) action;
            this.answers.put(Integer.valueOf(kVar.getQuestionId()), kVar.getBoolean());
        } else if (action instanceof AbstractC36877d.j) {
            AbstractC36877d.j jVar = (AbstractC36877d.j) action;
            this.answers.put(Integer.valueOf(jVar.getQuestionId()), jVar.getBoolean());
        } else if (action instanceof AbstractC36877d.a) {
            AbstractC36877d.a aVar = (AbstractC36877d.a) action;
            this.answers.put(Integer.valueOf(aVar.getQuestionId()), aVar.getNumber());
        }
    }

    /* JADX INFO: renamed from: m */
    public final C40335g4 m129730m(boolean enabled) {
        return new C40335g4(m129719c(enabled));
    }
}
