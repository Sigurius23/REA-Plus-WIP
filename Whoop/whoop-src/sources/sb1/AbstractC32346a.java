package sb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.MarkdownTextModel;
import com.whoop.design.models.items.ContextCardModel;
import com.whoop.design.models.items.ContextCardTagModel;
import com.whoop.design.models.items.ContextHubHeaderModel;
import com.whoop.design.models.items.IconSize;
import com.whoop.design.models.items.TagBackgroundStyle;
import com.whoop.design.models.items.TagModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.Action;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.List;
import kd1.AbstractC22404p;
import l83.C23454a0;
import m83.AbstractC25267u;
import p51.AbstractC28853a;
import p51.C28857e;
import p51.EnumC28856d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p716lb1.AbstractC23699q4;
import p716lb1.AbstractC23723u4;
import p716lb1.C23743y0;
import p716lb1.C23749z0;
import p716lb1.Function1;
import p720m91.InterfaceC25312u;
import q51.C29982d;
import qc1.C30217a;

/* JADX INFO: renamed from: sb1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\f\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m65681d2 = {"", "subtitle", "Lcom/whoop/design/models/MarkdownTextModel;", "description", "Lp51/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;)Lp51/a;", "Llb1/y0;", "a", "Llb1/y0;", "g", "()Llb1/y0;", "contextHubMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32346a {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f133912a = Function1.m68251a(new C30217a(13));

    /* JADX INFO: renamed from: sb1.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f133913w;

        public a(p715kotlin.jvm.functions.Function1 function1) {
            this.f133913w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f133913w.invoke((ContextCardModel) it);
        }
    }

    /* JADX INFO: renamed from: sb1.a$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f133914w;

        public b(p715kotlin.jvm.functions.Function1 function1) {
            this.f133914w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f133914w.invoke((ContextHubHeaderModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m100670d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        C30217a c30217a = new C30217a(14);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ContextCardModel.class), new a(c30217a));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ContextHubHeaderModel.class), new b(new C30217a(15)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C28857e m100671e(ContextCardModel model) {
        EnumC28856d enumC28856d;
        TagBackgroundStyle tagBackgroundStyle;
        AbstractC22676k.m65750j(model, "model");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitle());
        String strIsNewText = model.isNewText();
        TextResource textResourceM21278l2 = strIsNewText != null ? AbstractC8693b.m21278l(strIsNewText) : null;
        String status = model.getStatus();
        EnumC28856d enumC28856d2 = EnumC28856d.UNKNOWN;
        EnumC28856d[] enumC28856dArrValues = EnumC28856d.values();
        int length = enumC28856dArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC28856d = null;
                break;
            }
            enumC28856d = enumC28856dArrValues[i13];
            if (AbstractC22676k.m65745e(enumC28856d.name(), status)) {
                break;
            }
            i13++;
        }
        EnumC28856d enumC28856d3 = enumC28856d == null ? enumC28856d2 : enumC28856d;
        List<ContextCardTagModel> tags = model.getTags();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(tags, 10));
        for (ContextCardTagModel contextCardTagModel : tags) {
            String title = contextCardTagModel.getTitle();
            String tagStyle = contextCardTagModel.getTagStyle();
            TagBackgroundStyle tagBackgroundStyle2 = TagBackgroundStyle.DEFAULT;
            TagBackgroundStyle[] tagBackgroundStyleArrValues = TagBackgroundStyle.values();
            int length2 = tagBackgroundStyleArrValues.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length2) {
                    tagBackgroundStyle = null;
                    break;
                }
                tagBackgroundStyle = tagBackgroundStyleArrValues[i14];
                if (AbstractC22676k.m65745e(tagBackgroundStyle.name(), tagStyle)) {
                    break;
                }
                i14++;
            }
            arrayList.add(AbstractC23699q4.m69314d(new TagModel((String) null, title, (String) null, tagBackgroundStyle == null ? tagBackgroundStyle2 : tagBackgroundStyle, (String) null, (String) null, (C9598e) null, (Action) null, (String) null, (String) null, (List) null, (IconSize) null, (GenericInteraction) null, 8181, (DefaultConstructorMarker) null)));
        }
        C9598e destination = model.getDestination();
        AbstractC28853a abstractC28853aM100674h = m100674h(model.getSubtitle(), model.getDescription());
        String lastUpdatedAtText = model.getLastUpdatedAtText();
        TextResource textResourceM21278l3 = lastUpdatedAtText != null ? AbstractC8693b.m21278l(lastUpdatedAtText) : null;
        String expiresAtText = model.getExpiresAtText();
        return new C28857e(textResourceM21278l, textResourceM21278l2, enumC28856d3, arrayList, destination, abstractC28853aM100674h, textResourceM21278l3, expiresAtText != null ? AbstractC8693b.m21278l(expiresAtText) : null, model.isUpdateSeen());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C29982d m100672f(ContextHubHeaderModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C29982d(AbstractC8693b.m21278l(model.getTitle()), AbstractC8693b.m21278l(model.getSubtitle()), AbstractC22404p.m64503l(model.getProfileImageUrl()));
    }

    /* JADX INFO: renamed from: g */
    public static final C23743y0 m100673g() {
        return f133912a;
    }

    /* JADX INFO: renamed from: h */
    private static final AbstractC28853a m100674h(String str, MarkdownTextModel markdownTextModel) {
        if (markdownTextModel != null) {
            return new AbstractC28853a.a(AbstractC23723u4.m69556f(markdownTextModel));
        }
        if (str != null) {
            return new AbstractC28853a.b(str);
        }
        return null;
    }
}
