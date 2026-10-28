package i21;

import androidx.compose.runtime.Composer;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.service.network.model.UserSessionDto;
import g93.AbstractC15612d;
import g93.C15611c;
import i93.C18277c;
import i93.C18283i;
import i93.C18284j;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import m83.AbstractC25243e0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import o73.C27648a;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;
import x81.C38072d;
import y11.C39065r;
import z11.AbstractC39996a;

/* JADX INFO: renamed from: i21.k */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"", "Li21/j;", "b", "(Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "Lcom/whoop/design/util/TextResource;", "a", "()Lcom/whoop/design/util/TextResource;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18001k {
    /* JADX INFO: renamed from: a */
    private static final TextResource m51642a() {
        C18284j c18284j = new C18284j(1, 15, 1);
        C15611c c15611c = AbstractC15612d.f58612w;
        try {
            int iM83570U = C27648a.m83570U(c18284j);
            C18277c c18277c = new C18277c('A', 'Z');
            C18284j c18284j2 = new C18284j(2, iM83570U, 1);
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284j2, 10));
            Iterator it = c18284j2.iterator();
            while (((C18283i) it).f71138y) {
                ((AbstractC25243e0) it).nextInt();
                C15611c c15611c2 = AbstractC15612d.f58612w;
                try {
                    arrayList.add(Character.valueOf((char) AbstractC15612d.f58613x.mo43933h(c18277c.f71122w, c18277c.f71123x + 1)));
                } catch (IllegalArgumentException e5) {
                    throw new NoSuchElementException(e5.getMessage());
                }
            }
            return AbstractC8693b.m21278l(AbstractC25265s.m74110N0(arrayList, "", null, null, null, 62));
        } catch (IllegalArgumentException e13) {
            throw new NoSuchElementException(e13.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public static final List<C18000j> m51643b(Composer composer, int i13) {
        TextResource textResourceM21278l = AbstractC8693b.m21278l("Eating a diet of only easy mac and beef jerky");
        C39065r c39065rM128219h = AbstractC39996a.m128219h();
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l("+24%");
        EnumC39333f enumC39333f = EnumC39333f.ACCENT_POSITIVE_TREND;
        C18000j c18000j = new C18000j(textResourceM21278l, null, c39065rM128219h, new InterfaceC18002l.a(textResourceM21278l2, false, enumC39333f, null, null, null, null, null, null, new UUID(0L, 0L), 506, null), 2, null);
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l("Throwing your whoop into the pool and replacing it with an Oura");
        C39065r c39065rM128214c = AbstractC39996a.m128214c();
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l("-24%");
        EnumC39333f enumC39333f2 = EnumC39333f.ACCENT_NEGATIVE_TREND;
        C18000j c18000j2 = new C18000j(textResourceM21278l3, null, c39065rM128214c, new InterfaceC18002l.a(textResourceM21278l4, false, enumC39333f2, null, null, null, null, null, null, null, MessageListItemViewType.POLL, null), 2, null);
        C18000j c18000j3 = new C18000j(AbstractC8693b.m21278l("Caffeine"), null, AbstractC39996a.m128219h(), new InterfaceC18002l.a(AbstractC8693b.m21278l("+4%"), false, enumC39333f, AbstractC8693b.m21278l("Avoid caffeine 8 hours before bedtime"), EnumC39333f.WHITE_70, null, null, null, null, null, 994, null), 2, null);
        TextResource textResourceM21278l5 = AbstractC8693b.m21278l("Yelling into the void");
        C39065r c39065rM128219h2 = AbstractC39996a.m128219h();
        TextResource textResourceM21278l6 = AbstractC8693b.m21278l("+24%");
        EnumC18012v enumC18012v = EnumC18012v.NEW;
        TextResource textResourceM21278l7 = AbstractC8693b.m21278l("NEW");
        EnumC39333f enumC39333f3 = EnumC39333f.NEUTRAL_15;
        EnumC39333f enumC39333f4 = EnumC39333f.RECOVERY;
        C18000j c18000j4 = new C18000j(textResourceM21278l5, null, c39065rM128219h2, new InterfaceC18002l.a(textResourceM21278l6, false, enumC39333f, null, null, new C18011u(enumC18012v, textResourceM21278l7, enumC39333f3, enumC39333f4), null, null, enumC39333f4, null, 730, null), 2, null);
        TextResource textResourceM21278l8 = AbstractC8693b.m21278l("Crying at least twice a day");
        C39065r c39065rM128217f = AbstractC39996a.m128217f();
        TextResource textResourceM21278l9 = AbstractC8693b.m21278l("life is pain");
        TextResource textResourceM21278l10 = AbstractC8693b.m21278l("12");
        TextResource textResourceM21278l11 = AbstractC8693b.m21278l("32");
        EnumC39333f enumC39333f5 = EnumC39333f.WHITE_50;
        EnumC39333f enumC39333f6 = EnumC39333f.BRAND_WHITE;
        return AbstractC37056f.m118959K(c18000j, c18000j2, c18000j3, c18000j4, new C18000j(textResourceM21278l8, null, c39065rM128217f, new InterfaceC18002l.d(textResourceM21278l9, textResourceM21278l10, textResourceM21278l11, enumC39333f5, enumC39333f6, null, null, 96, null), 2, null), new C18000j(AbstractC8693b.m21278l("Saying life is pain twice a day"), null, AbstractC39996a.m128217f(), new InterfaceC18002l.d(null, AbstractC8693b.m21278l(UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE), AbstractC8693b.m21278l("89"), enumC39333f5, enumC39333f6, null, null, 97, null), 2, null), new C18000j(AbstractC8693b.m21278l("Having an imaginary friend"), null, AbstractC39996a.m128217f(), new InterfaceC18002l.d(null, AbstractC8693b.m21278l(UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE), AbstractC8693b.m21278l("3"), enumC39333f5, enumC39333f6, null, null, 97, null), 2, null), new C18000j(AbstractC8693b.m21278l("Having an imaginary friend"), null, AbstractC39996a.m128217f(), new InterfaceC18002l.d(null, AbstractC8693b.m21278l("54"), AbstractC8693b.m21278l("32"), enumC39333f5, enumC39333f6, null, null, 97, null), 2, null), new C18000j(AbstractC8693b.m21278l("Drinking a keg a day, doing 2 back flips and then breaking the sound barrier"), null, AbstractC39996a.m128217f(), new InterfaceC18002l.e(AbstractC2875y.m8290c(C38072d.f163053a), AbstractC8693b.m21278l("Unable to calculate impact. Please log more responses"), enumC39333f5.mo134584toComposableColorWaAFU9c(composer, 6), null), 2, null), new C18000j(AbstractC8693b.m21278l("Being alive"), null, AbstractC39996a.m128217f(), new InterfaceC18002l.c(AbstractC8693b.m21278l("-%"), AbstractC8693b.m21278l("Impact pending, will be calculated on next refresh"), enumC39333f5.mo134584toComposableColorWaAFU9c(composer, 6), null), 2, null), new C18000j(m51642a(), null, new C39065r(0.0f, null, 0.0f, 0.0f, null, null, null, 127, null), new InterfaceC18002l.a(AbstractC8693b.m21278l("24%"), true, null, null, null, null, null, null, null, null, 1020, null), 2, null), new C18000j(m51642a(), null, new C39065r(0.0f, null, 0.4f, 0.5f, enumC39333f2, null, null, 99, null), new InterfaceC18002l.a(AbstractC8693b.m21278l("-6%"), true, enumC39333f2, null, null, null, null, null, null, null, MessageListItemViewType.UNREAD_SEPARATOR, null), 2, null), new C18000j(m51642a(), null, new C39065r(0.0f, null, 0.2f, 0.5f, enumC39333f2, null, null, 99, null), new InterfaceC18002l.a(AbstractC8693b.m21278l("-13%"), true, enumC39333f2, null, null, null, null, null, null, null, MessageListItemViewType.UNREAD_SEPARATOR, null), 2, null));
    }
}
