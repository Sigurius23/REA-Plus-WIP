package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.JournalEntrypointBehaviorTagModel;
import com.whoop.design.models.items.JournalEntrypointModel;
import com.whoop.design.models.items.JournalEntrypointNoteModel;
import com.whoop.design.models.items.JournalEntrypointState;
import com.whoop.design.models.items.JournalEntrypointTagModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import hy0.EnumC17775o1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import u71.AbstractC34578l;
import u71.C34571e;
import u71.C34572f;
import u71.C34576j;
import u71.C34577k;
import y71.C39274g;

/* JADX INFO: renamed from: lb1.o2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"Llb1/y0;", "a", "Llb1/y0;", "c", "()Llb1/y0;", "journalEntryPointModelMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23685o2 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93896a = Function1.m68251a(new C23714t1(23));

    /* JADX INFO: renamed from: lb1.o2$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93897a;

        static {
            int[] iArr = new int[JournalEntrypointState.values().length];
            try {
                iArr[JournalEntrypointState.FIRST_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JournalEntrypointState.NOT_FILLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JournalEntrypointState.INTRADAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f93897a = iArr;
        }
    }

    /* JADX INFO: renamed from: lb1.o2$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93898w;

        public b(Function1 function1) {
            this.f93898w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93898w.invoke((JournalEntrypointModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C23743y0 m69187c() {
        return f93896a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m69188d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(JournalEntrypointModel.class), new b(new C23714t1(24)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C34576j m69189e(JournalEntrypointModel model) {
        EnumC16313m0 enumC16313m0;
        AbstractC34578l abstractC34578l;
        C34571e c34571e;
        C34577k c34577k;
        EnumC16313m0 enumC16313m1;
        Iterator it;
        EnumC17775o1 enumC17775o1;
        EnumC16313m0 enumC16313m2;
        EnumC17775o1 enumC17775o2;
        C39274g c39274g;
        EnumC16313m0 enumC16313m3;
        AbstractC22676k.m65750j(model, "model");
        String icon = model.getIcon();
        EnumC16313m0 enumC16313m4 = EnumC16313m0.JOURNAL;
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC16313m0 = null;
                break;
            }
            enumC16313m0 = enumC16313m0ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC16313m0.name(), icon)) {
                break;
            }
            i13++;
        }
        if (enumC16313m0 != null) {
            enumC16313m4 = enumC16313m0;
        }
        int whoopIcon = enumC16313m4.toWhoopIcon();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitle());
        int i14 = a.f93897a[model.getState().ordinal()];
        if (i14 == 1) {
            abstractC34578l = AbstractC34578l.a.f145597a;
        } else if (i14 == 2) {
            abstractC34578l = AbstractC34578l.c.f145599a;
        } else {
            if (i14 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            abstractC34578l = AbstractC34578l.b.f145598a;
        }
        AbstractC34578l abstractC34578l2 = abstractC34578l;
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(model.getCta());
        String bodyText = model.getBodyText();
        TextResource textResourceM21278l3 = bodyText != null ? AbstractC8693b.m21278l(bodyText) : null;
        JournalEntrypointTagModel actionTag = model.getActionTag();
        if (actionTag != null) {
            String tagStyle = actionTag.getTagStyle();
            EnumC17775o1 enumC17775o3 = EnumC17775o1.NONE;
            EnumC17775o1[] enumC17775o1ArrValues = EnumC17775o1.values();
            int length2 = enumC17775o1ArrValues.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length2) {
                    enumC17775o2 = null;
                    break;
                }
                enumC17775o2 = enumC17775o1ArrValues[i15];
                if (AbstractC22676k.m65745e(enumC17775o2.name(), tagStyle)) {
                    break;
                }
                i15++;
            }
            if (enumC17775o2 != null) {
                enumC17775o3 = enumC17775o2;
            }
            String icon2 = actionTag.getIcon();
            if (icon2 != null) {
                EnumC16313m0 enumC16313m5 = EnumC16313m0.JOURNAL;
                EnumC16313m0[] enumC16313m0ArrValues2 = EnumC16313m0.values();
                int length3 = enumC16313m0ArrValues2.length;
                int i16 = 0;
                while (true) {
                    if (i16 >= length3) {
                        enumC16313m3 = null;
                        break;
                    }
                    enumC16313m3 = enumC16313m0ArrValues2[i16];
                    if (AbstractC22676k.m65745e(enumC16313m3.name(), icon2)) {
                        break;
                    }
                    i16++;
                }
                if (enumC16313m3 != null) {
                    enumC16313m5 = enumC16313m3;
                }
                c39274g = new C39274g(enumC16313m5.toWhoopIcon(), AbstractC8693b.m21278l(actionTag.getTagLabel()));
            } else {
                c39274g = null;
            }
            c34571e = new C34571e(enumC17775o3, c39274g, AbstractC8693b.m21278l(actionTag.getTagLabel()));
        } else {
            c34571e = null;
        }
        List<JournalEntrypointBehaviorTagModel> behaviorTags = model.getBehaviorTags();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(behaviorTags, 10));
        Iterator it3 = behaviorTags.iterator();
        while (it3.hasNext()) {
            JournalEntrypointBehaviorTagModel journalEntrypointBehaviorTagModel = (JournalEntrypointBehaviorTagModel) it3.next();
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l(journalEntrypointBehaviorTagModel.getTagLabel());
            String tagStyle2 = journalEntrypointBehaviorTagModel.getTagStyle();
            EnumC17775o1 enumC17775o4 = EnumC17775o1.NONE;
            EnumC17775o1[] enumC17775o1ArrValues2 = EnumC17775o1.values();
            int length4 = enumC17775o1ArrValues2.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length4) {
                    it = it3;
                    enumC17775o1 = null;
                    break;
                }
                enumC17775o1 = enumC17775o1ArrValues2[i17];
                it = it3;
                if (AbstractC22676k.m65745e(enumC17775o1.name(), tagStyle2)) {
                    break;
                }
                i17++;
                it3 = it;
            }
            if (enumC17775o1 != null) {
                enumC17775o4 = enumC17775o1;
            }
            String icon3 = journalEntrypointBehaviorTagModel.getIcon();
            EnumC16313m0 enumC16313m6 = EnumC16313m0.JOURNAL;
            EnumC16313m0[] enumC16313m0ArrValues3 = EnumC16313m0.values();
            int length5 = enumC16313m0ArrValues3.length;
            int i18 = 0;
            while (true) {
                if (i18 >= length5) {
                    enumC16313m2 = null;
                    break;
                }
                enumC16313m2 = enumC16313m0ArrValues3[i18];
                if (AbstractC22676k.m65745e(enumC16313m2.name(), icon3)) {
                    break;
                }
                i18++;
            }
            if (enumC16313m2 != null) {
                enumC16313m6 = enumC16313m2;
            }
            arrayList.add(new C34572f(textResourceM21278l4, enumC17775o4, new C39274g(enumC16313m6.toWhoopIcon(), AbstractC8693b.m21278l(journalEntrypointBehaviorTagModel.getTagLabel()))));
            it3 = it;
        }
        JournalEntrypointNoteModel note = model.getNote();
        if (note != null) {
            String noteIcon = note.getNoteIcon();
            EnumC16313m0 enumC16313m7 = EnumC16313m0.JOURNAL;
            EnumC16313m0[] enumC16313m0ArrValues4 = EnumC16313m0.values();
            int length6 = enumC16313m0ArrValues4.length;
            int i19 = 0;
            while (true) {
                if (i19 >= length6) {
                    enumC16313m1 = null;
                    break;
                }
                EnumC16313m0 enumC16313m8 = enumC16313m0ArrValues4[i19];
                if (AbstractC22676k.m65745e(enumC16313m8.name(), noteIcon)) {
                    enumC16313m1 = enumC16313m8;
                    break;
                }
                i19++;
            }
            if (enumC16313m1 != null) {
                enumC16313m7 = enumC16313m1;
            }
            c34577k = new C34577k(enumC16313m7.toWhoopIcon(), AbstractC8693b.m21278l(note.getNoteText()));
        } else {
            c34577k = null;
        }
        return new C34576j(whoopIcon, textResourceM21278l, abstractC34578l2, textResourceM21278l2, textResourceM21278l3, c34571e, arrayList, c34577k);
    }
}
