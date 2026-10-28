package px2;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.InterfaceC39332e;

/* JADX INFO: renamed from: px2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00152\u00020\u0001:\u0003\u000e\u000b\u0012B)\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014\u0082\u0001\u0002\u0016\u0017¨\u0006\u0018"}, m65681d2 = {"Lpx2/a;", "", "", "icon", "", "title", "Ly81/e;", "iconColor", "iconBackgroundColor", "<init>", "(ILjava/lang/String;Ly81/e;Ly81/e;)V", "a", "I", "()I", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "Ly81/e;", "()Ly81/e;", "e", "Lpx2/a$a;", "Lpx2/a$b;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29598a {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    public static final int f120847f = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC39332e iconColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC39332e iconBackgroundColor;

    /* JADX INFO: renamed from: px2.a$a */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lpx2/a$a;", "Lpx2/a;", "", "icon", "", "title", "Ly81/e;", "iconColor", "iconBackgroundColor", "subtitle", "<init>", "(ILjava/lang/String;Ly81/e;Ly81/e;Ljava/lang/String;)V", "g", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC29598a {

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String subtitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i13, String title, InterfaceC39332e iconColor, InterfaceC39332e iconBackgroundColor, String subtitle) {
            super(i13, title, iconColor, iconBackgroundColor, null);
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(iconColor, "iconColor");
            AbstractC22676k.m65750j(iconBackgroundColor, "iconBackgroundColor");
            AbstractC22676k.m65750j(subtitle, "subtitle");
            this.subtitle = subtitle;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }
    }

    /* JADX INFO: renamed from: px2.a$b */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lpx2/a$b;", "Lpx2/a;", "", "icon", "", "title", "Ly81/e;", "iconColor", "iconBackgroundColor", "<init>", "(ILjava/lang/String;Ly81/e;Ly81/e;)V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC29598a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i13, String title, InterfaceC39332e iconColor, InterfaceC39332e iconBackgroundColor) {
            super(i13, title, iconColor, iconBackgroundColor, null);
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(iconColor, "iconColor");
            AbstractC22676k.m65750j(iconBackgroundColor, "iconBackgroundColor");
        }
    }

    /* JADX INFO: renamed from: px2.a$c, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lpx2/a$c;", "", "<init>", "()V", "", "type", "", "icon", "title", "subtitle", "Lpx2/a;", "a", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lpx2/a;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC29598a m90782a(String type, Integer icon, String title, String subtitle) {
            if (type == null || icon == null || title == null) {
                return null;
            }
            EnumC29601d enumC29601dM90808a = EnumC29601d.INSTANCE.m90808a(type);
            return subtitle == null ? new b(icon.intValue(), title, enumC29601dM90808a.getIconColor(), enumC29601dM90808a.getIconBackgroundColor()) : new a(icon.intValue(), title, enumC29601dM90808a.getIconColor(), enumC29601dM90808a.getIconBackgroundColor(), subtitle);
        }

        private Companion() {
        }
    }

    public /* synthetic */ AbstractC29598a(int i13, String str, InterfaceC39332e interfaceC39332e, InterfaceC39332e interfaceC39332e2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, str, interfaceC39332e, interfaceC39332e2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC39332e getIconBackgroundColor() {
        return this.iconBackgroundColor;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC39332e getIconColor() {
        return this.iconColor;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    private AbstractC29598a(int i13, String str, InterfaceC39332e interfaceC39332e, InterfaceC39332e interfaceC39332e2) {
        this.icon = i13;
        this.title = str;
        this.iconColor = interfaceC39332e;
        this.iconBackgroundColor = interfaceC39332e2;
    }
}
