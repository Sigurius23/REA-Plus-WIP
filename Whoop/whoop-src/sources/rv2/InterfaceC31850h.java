package rv2;

import androidx.profileinstaller.ProfileVerifier;
import c13.AbstractC3855a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import cu2.AbstractC11128h;
import d13.AbstractC11478a;
import ep0.C13404j;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Map;
import jh3.AbstractC21702c;
import m83.C25271y;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33208p0;
import q63.AbstractC30007c;
import qv2.C30660a;
import qv2.EnumC30665f;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import y71.C39271d;

/* JADX INFO: renamed from: rv2.h */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lrv2/h;", "", "a", "b", "Lrv2/h$a;", "Lrv2/h$b;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC31850h {

    /* JADX INFO: renamed from: rv2.h$a */
    @Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0001\u001bBG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJR\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, m65681d2 = {"Lrv2/h$a;", "Lrv2/h;", "Lsz0/p0;", "type", "Lcom/whoop/design/util/TextResource;", "supportText", "primaryButtonText", "Lrv2/d;", "buttonClickEvent", "followUpEvent", "Lrv2/f;", "initialTab", "<init>", "(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lrv2/d;Lrv2/d;Lrv2/f;)V", "f", "(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lrv2/d;Lrv2/d;Lrv2/f;)Lrv2/h$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsz0/p0;", "m", "()Lsz0/p0;", "b", "Lcom/whoop/design/util/TextResource;", "l", "()Lcom/whoop/design/util/TextResource;", "c", "k", "d", "Lrv2/d;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lrv2/d;", "e", "i", "Lrv2/f;", "j", "()Lrv2/f;", "g", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC31850h {

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: h */
        public static final int f132068h = TextResource.$stable | AbstractC33208p0.f138461d;

        /* JADX INFO: renamed from: i */
        private static final a f132069i = new a(AbstractC33208p0.c.f138471e, null, null, null, null, null, 62, null);

        /* JADX INFO: renamed from: j */
        private static final a f132070j;

        /* JADX INFO: renamed from: k */
        private static final a f132071k;

        /* JADX INFO: renamed from: l */
        private static final a f132072l;

        /* JADX INFO: renamed from: m */
        private static final a f132073m;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC33208p0 type;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource supportText;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource primaryButtonText;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final InterfaceC31846d buttonClickEvent;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final InterfaceC31846d followUpEvent;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final EnumC31848f initialTab;

        /* JADX INFO: renamed from: rv2.h$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b¨\u0006\u0011"}, m65681d2 = {"Lrv2/h$a$a;", "", "<init>", "()V", "Lrv2/h$a;", "loading", "Lrv2/h$a;", "c", "()Lrv2/h$a;", "networkError", "d", "serverError", "e", "deleting", "b", "deleted", "a", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final a m99012a() {
                return a.f132073m;
            }

            /* JADX INFO: renamed from: b */
            public final a m99013b() {
                return a.f132072l;
            }

            /* JADX INFO: renamed from: c */
            public final a m99014c() {
                return a.f132069i;
            }

            /* JADX INFO: renamed from: d */
            public final a m99015d() {
                return a.f132070j;
            }

            /* JADX INFO: renamed from: e */
            public final a m99016e() {
                return a.f132071k;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            f132070j = new a(new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC11128h.f35473h1), false, objArr, 6, null), null, AbstractC8693b.m21277k(AbstractC11128h.f35409N), objArr2, null, 0 == true ? 1 : 0, 58, null);
            Object[] objArr3 = 0 == true ? 1 : 0;
            InterfaceC31846d interfaceC31846d = null;
            f132071k = new a(new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC11128h.f35506s1), false, objArr3, 6, null), null, AbstractC8693b.m21277k(AbstractC11128h.f35409N), 0 == true ? 1 : 0, interfaceC31846d, 0 == true ? 1 : 0, 58, null);
            DefaultConstructorMarker defaultConstructorMarker = null;
            f132072l = new a(AbstractC33208p0.a.f138465e, null, 0 == true ? 1 : 0, interfaceC31846d, 0 == true ? 1 : 0, null, 62, defaultConstructorMarker);
            Object[] objArr4 = 0 == true ? 1 : 0;
            Object[] objArr5 = 0 == true ? 1 : 0;
            f132073m = new a(new AbstractC33208p0.h(AbstractC8693b.m21277k(AbstractC11128h.f35447Z1), 0L, objArr4, 6, defaultConstructorMarker), null, null, null, objArr5, null, 62, null);
        }

        public a(AbstractC33208p0 type, TextResource supportText, TextResource primaryButtonText, InterfaceC31846d interfaceC31846d, InterfaceC31846d interfaceC31846d2, EnumC31848f enumC31848f) {
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(supportText, "supportText");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            this.type = type;
            this.supportText = supportText;
            this.primaryButtonText = primaryButtonText;
            this.buttonClickEvent = interfaceC31846d;
            this.followUpEvent = interfaceC31846d2;
            this.initialTab = enumC31848f;
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ a m99004g(a aVar, AbstractC33208p0 abstractC33208p0, TextResource textResource, TextResource textResource2, InterfaceC31846d interfaceC31846d, InterfaceC31846d interfaceC31846d2, EnumC31848f enumC31848f, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                abstractC33208p0 = aVar.type;
            }
            if ((i13 & 2) != 0) {
                textResource = aVar.supportText;
            }
            if ((i13 & 4) != 0) {
                textResource2 = aVar.primaryButtonText;
            }
            if ((i13 & 8) != 0) {
                interfaceC31846d = aVar.buttonClickEvent;
            }
            if ((i13 & 16) != 0) {
                interfaceC31846d2 = aVar.followUpEvent;
            }
            if ((i13 & 32) != 0) {
                enumC31848f = aVar.initialTab;
            }
            InterfaceC31846d interfaceC31846d3 = interfaceC31846d2;
            EnumC31848f enumC31848f2 = enumC31848f;
            return aVar.m99005f(abstractC33208p0, textResource, textResource2, interfaceC31846d, interfaceC31846d3, enumC31848f2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.type, aVar.type) && AbstractC22676k.m65745e(this.supportText, aVar.supportText) && AbstractC22676k.m65745e(this.primaryButtonText, aVar.primaryButtonText) && AbstractC22676k.m65745e(this.buttonClickEvent, aVar.buttonClickEvent) && AbstractC22676k.m65745e(this.followUpEvent, aVar.followUpEvent) && this.initialTab == aVar.initialTab;
        }

        /* JADX INFO: renamed from: f */
        public final a m99005f(AbstractC33208p0 type, TextResource supportText, TextResource primaryButtonText, InterfaceC31846d buttonClickEvent, InterfaceC31846d followUpEvent, EnumC31848f initialTab) {
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(supportText, "supportText");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            return new a(type, supportText, primaryButtonText, buttonClickEvent, followUpEvent, initialTab);
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final InterfaceC31846d getButtonClickEvent() {
            return this.buttonClickEvent;
        }

        public int hashCode() {
            int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.type.hashCode() * 31, this.supportText, 31), this.primaryButtonText, 31);
            InterfaceC31846d interfaceC31846d = this.buttonClickEvent;
            int iHashCode = (iM95625a + (interfaceC31846d == null ? 0 : interfaceC31846d.hashCode())) * 31;
            InterfaceC31846d interfaceC31846d2 = this.followUpEvent;
            int iHashCode2 = (iHashCode + (interfaceC31846d2 == null ? 0 : interfaceC31846d2.hashCode())) * 31;
            EnumC31848f enumC31848f = this.initialTab;
            return iHashCode2 + (enumC31848f != null ? enumC31848f.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final InterfaceC31846d getFollowUpEvent() {
            return this.followUpEvent;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final EnumC31848f getInitialTab() {
            return this.initialTab;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final TextResource getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final TextResource getSupportText() {
            return this.supportText;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final AbstractC33208p0 getType() {
            return this.type;
        }

        public String toString() {
            AbstractC33208p0 abstractC33208p0 = this.type;
            TextResource textResource = this.supportText;
            TextResource textResource2 = this.primaryButtonText;
            InterfaceC31846d interfaceC31846d = this.buttonClickEvent;
            InterfaceC31846d interfaceC31846d2 = this.followUpEvent;
            EnumC31848f enumC31848f = this.initialTab;
            StringBuilder sbM30862n = AbstractC11478a.m30862n("FullScreenModal(type=", abstractC33208p0, ", supportText=", textResource, ", primaryButtonText=");
            sbM30862n.append(textResource2);
            sbM30862n.append(", buttonClickEvent=");
            sbM30862n.append(interfaceC31846d);
            sbM30862n.append(", followUpEvent=");
            sbM30862n.append(interfaceC31846d2);
            sbM30862n.append(", initialTab=");
            sbM30862n.append(enumC31848f);
            sbM30862n.append(")");
            return sbM30862n.toString();
        }

        public /* synthetic */ a(AbstractC33208p0 abstractC33208p0, TextResource textResource, TextResource textResource2, InterfaceC31846d interfaceC31846d, InterfaceC31846d interfaceC31846d2, EnumC31848f enumC31848f, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(abstractC33208p0, (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 8) != 0 ? null : interfaceC31846d, (i13 & 16) != 0 ? null : interfaceC31846d2, (i13 & 32) != 0 ? null : enumC31848f);
        }
    }

    /* JADX INFO: renamed from: rv2.h$b */
    @Metadata(m65680d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b7\b\u0087\b\u0018\u00002\u00020\u0001BÃ\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\t\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\b\b\u0002\u0010$\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020&0%\u0012\b\b\u0002\u0010(\u001a\u00020\u0015\u0012\b\b\u0002\u0010)\u001a\u00020\u0015¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u00020\u00152\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b4\u00105R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b?\u0010=R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b@\u0010;\u001a\u0004\bA\u0010=R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b8\u0010;\u001a\u0004\bB\u0010=R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0006¢\u0006\f\n\u0004\bG\u0010D\u001a\u0004\bH\u0010FR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8\u0006¢\u0006\f\n\u0004\bI\u0010D\u001a\u0004\bJ\u0010FR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0006¢\u0006\f\n\u0004\bK\u0010D\u001a\u0004\bK\u0010FR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bJ\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bO\u0010;\u001a\u0004\b@\u0010=R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bB\u0010P\u001a\u0004\bC\u0010QR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bA\u0010R\u001a\u0004\bS\u0010TR\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bU\u0010;\u001a\u0004\bV\u0010=R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8\u0006¢\u0006\f\n\u0004\bM\u0010D\u001a\u0004\bW\u0010FR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\b>\u0010ZR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\bV\u0010[\u001a\u0004\b:\u0010\\R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bW\u0010]\u001a\u0004\b^\u0010_R\u0019\u0010\"\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\b`\u0010bR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0006¢\u0006\f\n\u0004\b^\u0010D\u001a\u0004\bG\u0010FR\u0017\u0010$\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bS\u0010;\u001a\u0004\bI\u0010=R#\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020&0%8\u0006¢\u0006\f\n\u0004\b<\u0010c\u001a\u0004\bX\u0010dR\u0017\u0010(\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bH\u0010R\u001a\u0004\be\u0010TR\u0017\u0010)\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b?\u0010R\u001a\u0004\bU\u0010TR\u0017\u0010f\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bE\u0010R\u001a\u0004\b6\u0010TR\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b \u0010g\u001a\u0004\bO\u0010h¨\u0006i"}, m65681d2 = {"Lrv2/h$b;", "Lrv2/h;", "Lrv2/c;", "dialogState", "Lcom/whoop/design/util/TextResource;", "title", "whoopWorkoutsTabTitle", "myWorkoutsTitle", "myWorkoutsCtaText", "", "Lrv2/f;", "workoutTabs", "Lm91/u;", "whoopWorkoutList", "Ly71/d;", "myWorkouts", "myWorkoutHeaderItems", "Lrv2/b;", "noWorkoutsState", "bottomSheetTitle", "initialTab", "", "showPendingSessions", "pendingSessionContent", "pendingSessions", "Lqv2/f;", "bottomSheetLoadingState", "Lrv2/d;", "bottomSheetLoadingEvent", "Lqv2/a;", "shareableWorkoutLink", "Lrv2/a;", "myWorkoutsCoachButton", "", "selectedWorkoutKey", "myProgress", "myProgressTitle", "", "Lep0/j;", "pagerScreenContextMetadata", "isExerciseDetailsV2ExperimentEnabled", "navigateToEmptyWorkout", "<init>", "(Lrv2/c;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lrv2/b;Lcom/whoop/design/util/TextResource;Lrv2/f;ZLcom/whoop/design/util/TextResource;Ljava/util/List;Lqv2/f;Lrv2/d;Lqv2/a;Lrv2/a;Ljava/lang/Long;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/util/Map;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lrv2/c;", "e", "()Lrv2/c;", "b", "Lcom/whoop/design/util/TextResource;", "v", "()Lcom/whoop/design/util/TextResource;", "c", "x", "d", "m", "l", "f", "Ljava/util/List;", "y", "()Ljava/util/List;", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "j", "i", "Lrv2/b;", "o", "()Lrv2/b;", "k", "Lrv2/f;", "()Lrv2/f;", "Z", "u", "()Z", "n", "q", "r", "p", "Lqv2/f;", "()Lqv2/f;", "Lrv2/d;", "()Lrv2/d;", "Lqv2/a;", "t", "()Lqv2/a;", "s", "Ljava/lang/Long;", "()Ljava/lang/Long;", "Ljava/util/Map;", "()Ljava/util/Map;", "z", "bottomSheetLoading", "Lrv2/a;", "()Lrv2/a;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC31850h {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C31845c dialogState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource whoopWorkoutsTabTitle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource myWorkoutsTitle;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextResource myWorkoutsCtaText;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final List<EnumC31848f> workoutTabs;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final List<InterfaceC25312u> whoopWorkoutList;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final List<C39271d> myWorkouts;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final List<InterfaceC25312u> myWorkoutHeaderItems;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final C31844b noWorkoutsState;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final TextResource bottomSheetTitle;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final EnumC31848f initialTab;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final boolean showPendingSessions;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private final TextResource pendingSessionContent;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        private final List<C39271d> pendingSessions;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        private final EnumC30665f bottomSheetLoadingState;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        private final InterfaceC31846d bottomSheetLoadingEvent;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        private final C30660a shareableWorkoutLink;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        private final Long selectedWorkoutKey;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        private final List<InterfaceC25312u> myProgress;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        private final TextResource myProgressTitle;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata */
        private final Map<EnumC31848f, C13404j> pagerScreenContextMetadata;

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final boolean isExerciseDetailsV2ExperimentEnabled;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private final boolean navigateToEmptyWorkout;

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        private final boolean bottomSheetLoading;

        /* JADX WARN: Multi-variable type inference failed */
        public b(C31845c c31845c, TextResource title, TextResource whoopWorkoutsTabTitle, TextResource myWorkoutsTitle, TextResource textResource, List<? extends EnumC31848f> workoutTabs, List<? extends InterfaceC25312u> whoopWorkoutList, List<C39271d> myWorkouts, List<? extends InterfaceC25312u> myWorkoutHeaderItems, C31844b c31844b, TextResource bottomSheetTitle, EnumC31848f enumC31848f, boolean z4, TextResource pendingSessionContent, List<C39271d> pendingSessions, EnumC30665f enumC30665f, InterfaceC31846d interfaceC31846d, C30660a c30660a, AbstractC31843a abstractC31843a, Long l7, List<? extends InterfaceC25312u> myProgress, TextResource myProgressTitle, Map<EnumC31848f, C13404j> pagerScreenContextMetadata, boolean z13, boolean z14) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(whoopWorkoutsTabTitle, "whoopWorkoutsTabTitle");
            AbstractC22676k.m65750j(myWorkoutsTitle, "myWorkoutsTitle");
            AbstractC22676k.m65750j(workoutTabs, "workoutTabs");
            AbstractC22676k.m65750j(whoopWorkoutList, "whoopWorkoutList");
            AbstractC22676k.m65750j(myWorkouts, "myWorkouts");
            AbstractC22676k.m65750j(myWorkoutHeaderItems, "myWorkoutHeaderItems");
            AbstractC22676k.m65750j(bottomSheetTitle, "bottomSheetTitle");
            AbstractC22676k.m65750j(pendingSessionContent, "pendingSessionContent");
            AbstractC22676k.m65750j(pendingSessions, "pendingSessions");
            AbstractC22676k.m65750j(myProgress, "myProgress");
            AbstractC22676k.m65750j(myProgressTitle, "myProgressTitle");
            AbstractC22676k.m65750j(pagerScreenContextMetadata, "pagerScreenContextMetadata");
            this.dialogState = c31845c;
            this.title = title;
            this.whoopWorkoutsTabTitle = whoopWorkoutsTabTitle;
            this.myWorkoutsTitle = myWorkoutsTitle;
            this.myWorkoutsCtaText = textResource;
            this.workoutTabs = workoutTabs;
            this.whoopWorkoutList = whoopWorkoutList;
            this.myWorkouts = myWorkouts;
            this.myWorkoutHeaderItems = myWorkoutHeaderItems;
            this.noWorkoutsState = c31844b;
            this.bottomSheetTitle = bottomSheetTitle;
            this.initialTab = enumC31848f;
            this.showPendingSessions = z4;
            this.pendingSessionContent = pendingSessionContent;
            this.pendingSessions = pendingSessions;
            this.bottomSheetLoadingState = enumC30665f;
            this.bottomSheetLoadingEvent = interfaceC31846d;
            this.shareableWorkoutLink = c30660a;
            this.selectedWorkoutKey = l7;
            this.myProgress = myProgress;
            this.myProgressTitle = myProgressTitle;
            this.pagerScreenContextMetadata = pagerScreenContextMetadata;
            this.isExerciseDetailsV2ExperimentEnabled = z13;
            this.navigateToEmptyWorkout = z14;
            this.bottomSheetLoading = enumC30665f != null;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getBottomSheetLoading() {
            return this.bottomSheetLoading;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC31846d getBottomSheetLoadingEvent() {
            return this.bottomSheetLoadingEvent;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final EnumC30665f getBottomSheetLoadingState() {
            return this.bottomSheetLoadingState;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextResource getBottomSheetTitle() {
            return this.bottomSheetTitle;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final C31845c getDialogState() {
            return this.dialogState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.dialogState, bVar.dialogState) && AbstractC22676k.m65745e(this.title, bVar.title) && AbstractC22676k.m65745e(this.whoopWorkoutsTabTitle, bVar.whoopWorkoutsTabTitle) && AbstractC22676k.m65745e(this.myWorkoutsTitle, bVar.myWorkoutsTitle) && AbstractC22676k.m65745e(this.myWorkoutsCtaText, bVar.myWorkoutsCtaText) && AbstractC22676k.m65745e(this.workoutTabs, bVar.workoutTabs) && AbstractC22676k.m65745e(this.whoopWorkoutList, bVar.whoopWorkoutList) && AbstractC22676k.m65745e(this.myWorkouts, bVar.myWorkouts) && AbstractC22676k.m65745e(this.myWorkoutHeaderItems, bVar.myWorkoutHeaderItems) && AbstractC22676k.m65745e(this.noWorkoutsState, bVar.noWorkoutsState) && AbstractC22676k.m65745e(this.bottomSheetTitle, bVar.bottomSheetTitle) && this.initialTab == bVar.initialTab && this.showPendingSessions == bVar.showPendingSessions && AbstractC22676k.m65745e(this.pendingSessionContent, bVar.pendingSessionContent) && AbstractC22676k.m65745e(this.pendingSessions, bVar.pendingSessions) && this.bottomSheetLoadingState == bVar.bottomSheetLoadingState && AbstractC22676k.m65745e(this.bottomSheetLoadingEvent, bVar.bottomSheetLoadingEvent) && AbstractC22676k.m65745e(this.shareableWorkoutLink, bVar.shareableWorkoutLink) && AbstractC22676k.m65745e(this.selectedWorkoutKey, bVar.selectedWorkoutKey) && AbstractC22676k.m65745e(this.myProgress, bVar.myProgress) && AbstractC22676k.m65745e(this.myProgressTitle, bVar.myProgressTitle) && AbstractC22676k.m65745e(this.pagerScreenContextMetadata, bVar.pagerScreenContextMetadata) && this.isExerciseDetailsV2ExperimentEnabled == bVar.isExerciseDetailsV2ExperimentEnabled && this.navigateToEmptyWorkout == bVar.navigateToEmptyWorkout;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final EnumC31848f getInitialTab() {
            return this.initialTab;
        }

        /* JADX INFO: renamed from: g */
        public final List<InterfaceC25312u> m99023g() {
            return this.myProgress;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final TextResource getMyProgressTitle() {
            return this.myProgressTitle;
        }

        public int hashCode() {
            C31845c c31845c = this.dialogState;
            int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a((c31845c == null ? 0 : c31845c.hashCode()) * 31, this.title, 31), this.whoopWorkoutsTabTitle, 31), this.myWorkoutsTitle, 31);
            TextResource textResource = this.myWorkoutsCtaText;
            int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b((iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31, 31, this.workoutTabs), 31, this.whoopWorkoutList), 31, this.myWorkouts), 31, this.myWorkoutHeaderItems);
            C31844b c31844b = this.noWorkoutsState;
            int iM95625a2 = AbstractC31061c.m95625a((iM31983b + (c31844b == null ? 0 : c31844b.hashCode())) * 31, this.bottomSheetTitle, 31);
            EnumC31848f enumC31848f = this.initialTab;
            int iM31983b2 = AbstractC11895b.m31983b(AbstractC31061c.m95625a(AbstractC2875y.m8289b((iM95625a2 + (enumC31848f == null ? 0 : enumC31848f.hashCode())) * 31, 31, this.showPendingSessions), this.pendingSessionContent, 31), 31, this.pendingSessions);
            EnumC30665f enumC30665f = this.bottomSheetLoadingState;
            int iHashCode = (iM31983b2 + (enumC30665f == null ? 0 : enumC30665f.hashCode())) * 31;
            InterfaceC31846d interfaceC31846d = this.bottomSheetLoadingEvent;
            int iHashCode2 = (iHashCode + (interfaceC31846d == null ? 0 : interfaceC31846d.hashCode())) * 31;
            C30660a c30660a = this.shareableWorkoutLink;
            int iHashCode3 = (iHashCode2 + (c30660a == null ? 0 : c30660a.hashCode())) * 961;
            Long l7 = this.selectedWorkoutKey;
            return Boolean.hashCode(this.navigateToEmptyWorkout) + AbstractC2875y.m8289b(AbstractC3855a.m11821e(this.pagerScreenContextMetadata, AbstractC31061c.m95625a(AbstractC11895b.m31983b((iHashCode3 + (l7 != null ? l7.hashCode() : 0)) * 31, 31, this.myProgress), this.myProgressTitle, 31), 31), 31, this.isExerciseDetailsV2ExperimentEnabled);
        }

        /* JADX INFO: renamed from: i */
        public final List<InterfaceC25312u> m99025i() {
            return this.myWorkoutHeaderItems;
        }

        /* JADX INFO: renamed from: j */
        public final List<C39271d> m99026j() {
            return this.myWorkouts;
        }

        /* JADX INFO: renamed from: k */
        public final AbstractC31843a m99027k() {
            return null;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final TextResource getMyWorkoutsCtaText() {
            return this.myWorkoutsCtaText;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final TextResource getMyWorkoutsTitle() {
            return this.myWorkoutsTitle;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final boolean getNavigateToEmptyWorkout() {
            return this.navigateToEmptyWorkout;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final C31844b getNoWorkoutsState() {
            return this.noWorkoutsState;
        }

        /* JADX INFO: renamed from: p */
        public final Map<EnumC31848f, C13404j> m99032p() {
            return this.pagerScreenContextMetadata;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final TextResource getPendingSessionContent() {
            return this.pendingSessionContent;
        }

        /* JADX INFO: renamed from: r */
        public final List<C39271d> m99034r() {
            return this.pendingSessions;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final Long getSelectedWorkoutKey() {
            return this.selectedWorkoutKey;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final C30660a getShareableWorkoutLink() {
            return this.shareableWorkoutLink;
        }

        public String toString() {
            C31845c c31845c = this.dialogState;
            TextResource textResource = this.title;
            TextResource textResource2 = this.whoopWorkoutsTabTitle;
            TextResource textResource3 = this.myWorkoutsTitle;
            TextResource textResource4 = this.myWorkoutsCtaText;
            List<EnumC31848f> list = this.workoutTabs;
            List<InterfaceC25312u> list2 = this.whoopWorkoutList;
            List<C39271d> list3 = this.myWorkouts;
            List<InterfaceC25312u> list4 = this.myWorkoutHeaderItems;
            C31844b c31844b = this.noWorkoutsState;
            TextResource textResource5 = this.bottomSheetTitle;
            EnumC31848f enumC31848f = this.initialTab;
            boolean z4 = this.showPendingSessions;
            TextResource textResource6 = this.pendingSessionContent;
            List<C39271d> list5 = this.pendingSessions;
            EnumC30665f enumC30665f = this.bottomSheetLoadingState;
            InterfaceC31846d interfaceC31846d = this.bottomSheetLoadingEvent;
            C30660a c30660a = this.shareableWorkoutLink;
            Long l7 = this.selectedWorkoutKey;
            List<InterfaceC25312u> list6 = this.myProgress;
            TextResource textResource7 = this.myProgressTitle;
            Map<EnumC31848f, C13404j> map = this.pagerScreenContextMetadata;
            boolean z13 = this.isExerciseDetailsV2ExperimentEnabled;
            boolean z14 = this.navigateToEmptyWorkout;
            StringBuilder sb4 = new StringBuilder("Loaded(dialogState=");
            sb4.append(c31845c);
            sb4.append(", title=");
            sb4.append(textResource);
            sb4.append(", whoopWorkoutsTabTitle=");
            AbstractC30007c.m91855y(sb4, textResource2, ", myWorkoutsTitle=", textResource3, ", myWorkoutsCtaText=");
            AbstractC21702c.m61143n(textResource4, ", workoutTabs=", ", whoopWorkoutList=", sb4, list);
            AbstractC21702c.m61148s(sb4, list2, ", myWorkouts=", list3, ", myWorkoutHeaderItems=");
            sb4.append(list4);
            sb4.append(", noWorkoutsState=");
            sb4.append(c31844b);
            sb4.append(", bottomSheetTitle=");
            sb4.append(textResource5);
            sb4.append(", initialTab=");
            sb4.append(enumC31848f);
            sb4.append(", showPendingSessions=");
            AbstractC21702c.m61144o(textResource6, ", pendingSessionContent=", ", pendingSessions=", sb4, z4);
            sb4.append(list5);
            sb4.append(", bottomSheetLoadingState=");
            sb4.append(enumC30665f);
            sb4.append(", bottomSheetLoadingEvent=");
            sb4.append(interfaceC31846d);
            sb4.append(", shareableWorkoutLink=");
            sb4.append(c30660a);
            sb4.append(", myWorkoutsCoachButton=null, selectedWorkoutKey=");
            sb4.append(l7);
            sb4.append(", myProgress=");
            sb4.append(list6);
            sb4.append(", myProgressTitle=");
            sb4.append(textResource7);
            sb4.append(", pagerScreenContextMetadata=");
            sb4.append(map);
            sb4.append(", isExerciseDetailsV2ExperimentEnabled=");
            return AbstractC36095b.m114682j(sb4, z13, ", navigateToEmptyWorkout=", z14, ")");
        }

        /* JADX INFO: renamed from: u, reason: from getter */
        public final boolean getShowPendingSessions() {
            return this.showPendingSessions;
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: w */
        public final List<InterfaceC25312u> m99039w() {
            return this.whoopWorkoutList;
        }

        /* JADX INFO: renamed from: x, reason: from getter */
        public final TextResource getWhoopWorkoutsTabTitle() {
            return this.whoopWorkoutsTabTitle;
        }

        /* JADX INFO: renamed from: y */
        public final List<EnumC31848f> m99041y() {
            return this.workoutTabs;
        }

        /* JADX INFO: renamed from: z, reason: from getter */
        public final boolean getIsExerciseDetailsV2ExperimentEnabled() {
            return this.isExerciseDetailsV2ExperimentEnabled;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ b(C31845c c31845c, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, List list, List list2, List list3, List list4, C31844b c31844b, TextResource textResource5, EnumC31848f enumC31848f, boolean z4, TextResource textResource6, List list5, EnumC30665f enumC30665f, InterfaceC31846d interfaceC31846d, C30660a c30660a, AbstractC31843a abstractC31843a, Long l7, List list6, TextResource textResource7, Map map, boolean z13, boolean z14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            C31845c c31845c2 = (i13 & 1) != 0 ? null : c31845c;
            TextResource textResourceM21267a = (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource;
            TextResource textResourceM21267a2 = (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource2;
            TextResource textResourceM21267a3 = (i13 & 8) != 0 ? AbstractC8693b.m21267a() : textResource3;
            TextResource textResource8 = (i13 & 16) != 0 ? null : textResource4;
            List listM118959K = (i13 & 32) != 0 ? AbstractC37056f.m118959K(EnumC31848f.EXERCISE_PROGRESSION, EnumC31848f.PERSONAL_WORKOUTS, EnumC31848f.WHOOP_WORKOUTS) : list;
            int i14 = i13 & 64;
            List list7 = C25271y.f99162w;
            this(c31845c2, textResourceM21267a, textResourceM21267a2, textResourceM21267a3, textResource8, listM118959K, i14 != 0 ? list7 : list2, (i13 & 128) != 0 ? list7 : list3, (i13 & 256) != 0 ? list7 : list4, (i13 & 512) != 0 ? null : c31844b, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? AbstractC8693b.m21267a() : textResource5, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : enumC31848f, (i13 & 4096) != 0 ? false : z4, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? AbstractC8693b.m21267a() : textResource6, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? list7 : list5, (i13 & 32768) != 0 ? null : enumC30665f, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? null : interfaceC31846d, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? null : c30660a, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? null : abstractC31843a, (i13 & 524288) != 0 ? null : l7, (i13 & 1048576) == 0 ? list6 : list7, (i13 & 2097152) != 0 ? AbstractC8693b.m21267a() : textResource7, (i13 & 4194304) != 0 ? C25272z.f99163w : map, (i13 & 8388608) != 0 ? false : z13, (i13 & 16777216) != 0 ? false : z14);
        }
    }
}
