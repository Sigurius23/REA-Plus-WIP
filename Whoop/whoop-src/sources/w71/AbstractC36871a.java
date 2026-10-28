package w71;

import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8692a;
import com.whoop.design.util.TextResource;
import l83.C23454a0;
import p088dc.AbstractC11895b;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: w71.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0004\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\u0006\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, m65681d2 = {"", "prefix", "Lcom/whoop/design/util/TextResource;", "question", "b", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;)Ljava/lang/String;", "c", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "Ltr2/n;", "a", "Ltr2/n;", "logger", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36871a {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC34116n f157709a = InterfaceC34116n.INSTANCE.m107848a("JournalAutomationTag");

    /* JADX INFO: renamed from: w71.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.journalsurvey.JournalAutomationTagKt$journalAutomationTag$1$1", m100430f = "JournalAutomationTag.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f157710w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f157711x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f157711x = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f157711x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f157710w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC36871a.f157709a.mo85226q(AbstractC11895b.m31996o("No extractable string for journal automation id (prefix='", this.f157711x, "'); tag omitted to keep tags unique. Back the question with TextResource.Value to tag it."), new AbstractC30556a.a[0]);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m118258b(String prefix, TextResource question) {
        AbstractC22676k.m65750j(prefix, "prefix");
        AbstractC22676k.m65750j(question, "question");
        String strM21264b = AbstractC8692a.m21264b(question);
        if (strM21264b != null) {
            if (strM21264b.length() <= 0) {
                strM21264b = null;
            }
            if (strM21264b != null) {
                return prefix.concat(strM21264b);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final String m118259c(String prefix, TextResource question, Composer composer, int i13) {
        AbstractC22676k.m65750j(prefix, "prefix");
        AbstractC22676k.m65750j(question, "question");
        String strM118258b = m118258b(prefix, question);
        if (strM118258b != null) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(1541807003);
            c28655q.m87173q(false);
            return strM118258b;
        }
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87150e0(1541522547);
        boolean z4 = (((i13 & 14) ^ 6) > 4 && c28655q2.m87153g(prefix)) || (i13 & 6) == 4;
        Object objM87133R = c28655q2.m87133R();
        if (z4 || objM87133R == C28635l.f115821a) {
            objM87133R = new a(prefix, null);
            c28655q2.m87172p0(objM87133R);
        }
        AbstractC28683x.m87254h(prefix, question, (InterfaceC4351m) objM87133R, c28655q2);
        c28655q2.m87173q(false);
        return strM118258b;
    }
}
