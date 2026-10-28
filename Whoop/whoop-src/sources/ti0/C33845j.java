package ti0;

import com.whoop.archv2.model.template.FillMode;
import com.whoop.archv2.model.template.HorizontalAlignment;
import com.whoop.archv2.model.template.VerticalAlignment;
import ep0.C13404j;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p291l0.InterfaceC22973k1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.C25306o;
import ri0.C31442a;
import ri0.C31447f;

/* JADX INFO: renamed from: ti0.j */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015Jt\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b0\u00102\u001a\u0004\b3\u00104R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b3\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b,\u00108\u001a\u0004\b.\u00109R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b(\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b;\u0010=\u001a\u0004\b*\u0010>¨\u0006?"}, m65681d2 = {"Lti0/j;", "Lti0/m;", "Lep0/j;", "screenContextMetadata", "Lri0/f;", "navigationBarState", "Lm91/o;", "itemWrapper", "Lri0/a;", "footerState", "Lcom/whoop/archv2/model/template/HorizontalAlignment;", "horizontalAlignment", "Lcom/whoop/archv2/model/template/VerticalAlignment;", "verticalAlignment", "Lcom/whoop/archv2/model/template/FillMode;", "fillMode", "Ll0/k1;", "paddingValues", "Lti0/c;", "background", "<init>", "(Lep0/j;Lri0/f;Lm91/o;Lri0/a;Lcom/whoop/archv2/model/template/HorizontalAlignment;Lcom/whoop/archv2/model/template/VerticalAlignment;Lcom/whoop/archv2/model/template/FillMode;Ll0/k1;Lti0/c;)V", "a", "(Lep0/j;Lri0/f;Lm91/o;Lri0/a;Lcom/whoop/archv2/model/template/HorizontalAlignment;Lcom/whoop/archv2/model/template/VerticalAlignment;Lcom/whoop/archv2/model/template/FillMode;Ll0/k1;Lti0/c;)Lti0/j;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lep0/j;", "j", "()Lep0/j;", "b", "Lri0/f;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lri0/f;", "c", "Lm91/o;", "g", "()Lm91/o;", "d", "Lri0/a;", "e", "()Lri0/a;", "Lcom/whoop/archv2/model/template/HorizontalAlignment;", "f", "()Lcom/whoop/archv2/model/template/HorizontalAlignment;", "Lcom/whoop/archv2/model/template/VerticalAlignment;", "k", "()Lcom/whoop/archv2/model/template/VerticalAlignment;", "Lcom/whoop/archv2/model/template/FillMode;", "()Lcom/whoop/archv2/model/template/FillMode;", "Ll0/k1;", "i", "()Ll0/k1;", "Lti0/c;", "()Lti0/c;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33845j implements InterfaceC33848m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C13404j screenContextMetadata;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C31447f navigationBarState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C25306o itemWrapper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C31442a footerState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final HorizontalAlignment horizontalAlignment;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final VerticalAlignment verticalAlignment;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final FillMode fillMode;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC22973k1 paddingValues;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C33838c background;

    public C33845j(C13404j c13404j, C31447f c31447f, C25306o c25306o, C31442a c31442a, HorizontalAlignment horizontalAlignment, VerticalAlignment verticalAlignment, FillMode fillMode, InterfaceC22973k1 paddingValues, C33838c c33838c) {
        AbstractC22676k.m65750j(horizontalAlignment, "horizontalAlignment");
        AbstractC22676k.m65750j(verticalAlignment, "verticalAlignment");
        AbstractC22676k.m65750j(fillMode, "fillMode");
        AbstractC22676k.m65750j(paddingValues, "paddingValues");
        this.screenContextMetadata = c13404j;
        this.navigationBarState = c31447f;
        this.itemWrapper = c25306o;
        this.footerState = c31442a;
        this.horizontalAlignment = horizontalAlignment;
        this.verticalAlignment = verticalAlignment;
        this.fillMode = fillMode;
        this.paddingValues = paddingValues;
        this.background = c33838c;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C33845j m107038b(C33845j c33845j, C13404j c13404j, C31447f c31447f, C25306o c25306o, C31442a c31442a, HorizontalAlignment horizontalAlignment, VerticalAlignment verticalAlignment, FillMode fillMode, InterfaceC22973k1 interfaceC22973k1, C33838c c33838c, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c13404j = c33845j.screenContextMetadata;
        }
        if ((i13 & 2) != 0) {
            c31447f = c33845j.navigationBarState;
        }
        if ((i13 & 4) != 0) {
            c25306o = c33845j.itemWrapper;
        }
        if ((i13 & 8) != 0) {
            c31442a = c33845j.footerState;
        }
        if ((i13 & 16) != 0) {
            horizontalAlignment = c33845j.horizontalAlignment;
        }
        if ((i13 & 32) != 0) {
            verticalAlignment = c33845j.verticalAlignment;
        }
        if ((i13 & 64) != 0) {
            fillMode = c33845j.fillMode;
        }
        if ((i13 & 128) != 0) {
            interfaceC22973k1 = c33845j.paddingValues;
        }
        if ((i13 & 256) != 0) {
            c33838c = c33845j.background;
        }
        InterfaceC22973k1 interfaceC22973k2 = interfaceC22973k1;
        C33838c c33838c2 = c33838c;
        VerticalAlignment verticalAlignment2 = verticalAlignment;
        FillMode fillMode2 = fillMode;
        HorizontalAlignment horizontalAlignment2 = horizontalAlignment;
        C25306o c25306o2 = c25306o;
        return c33845j.m107039a(c13404j, c31447f, c25306o2, c31442a, horizontalAlignment2, verticalAlignment2, fillMode2, interfaceC22973k2, c33838c2);
    }

    /* JADX INFO: renamed from: a */
    public final C33845j m107039a(C13404j screenContextMetadata, C31447f navigationBarState, C25306o itemWrapper, C31442a footerState, HorizontalAlignment horizontalAlignment, VerticalAlignment verticalAlignment, FillMode fillMode, InterfaceC22973k1 paddingValues, C33838c background) {
        AbstractC22676k.m65750j(horizontalAlignment, "horizontalAlignment");
        AbstractC22676k.m65750j(verticalAlignment, "verticalAlignment");
        AbstractC22676k.m65750j(fillMode, "fillMode");
        AbstractC22676k.m65750j(paddingValues, "paddingValues");
        return new C33845j(screenContextMetadata, navigationBarState, itemWrapper, footerState, horizontalAlignment, verticalAlignment, fillMode, paddingValues, background);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C33838c getBackground() {
        return this.background;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final FillMode getFillMode() {
        return this.fillMode;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C31442a getFooterState() {
        return this.footerState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33845j)) {
            return false;
        }
        C33845j c33845j = (C33845j) other;
        return AbstractC22676k.m65745e(this.screenContextMetadata, c33845j.screenContextMetadata) && AbstractC22676k.m65745e(this.navigationBarState, c33845j.navigationBarState) && AbstractC22676k.m65745e(this.itemWrapper, c33845j.itemWrapper) && AbstractC22676k.m65745e(this.footerState, c33845j.footerState) && this.horizontalAlignment == c33845j.horizontalAlignment && this.verticalAlignment == c33845j.verticalAlignment && this.fillMode == c33845j.fillMode && AbstractC22676k.m65745e(this.paddingValues, c33845j.paddingValues) && AbstractC22676k.m65745e(this.background, c33845j.background);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final HorizontalAlignment getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C25306o getItemWrapper() {
        return this.itemWrapper;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C31447f getNavigationBarState() {
        return this.navigationBarState;
    }

    public int hashCode() {
        C13404j c13404j = this.screenContextMetadata;
        int iHashCode = (c13404j == null ? 0 : c13404j.hashCode()) * 31;
        C31447f c31447f = this.navigationBarState;
        int iHashCode2 = (iHashCode + (c31447f == null ? 0 : c31447f.hashCode())) * 31;
        C25306o c25306o = this.itemWrapper;
        int iHashCode3 = (iHashCode2 + (c25306o == null ? 0 : c25306o.hashCode())) * 31;
        C31442a c31442a = this.footerState;
        int iHashCode4 = (this.paddingValues.hashCode() + ((this.fillMode.hashCode() + ((this.verticalAlignment.hashCode() + ((this.horizontalAlignment.hashCode() + ((iHashCode3 + (c31442a == null ? 0 : c31442a.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31;
        C33838c c33838c = this.background;
        return iHashCode4 + (c33838c != null ? c33838c.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final InterfaceC22973k1 getPaddingValues() {
        return this.paddingValues;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final C13404j getScreenContextMetadata() {
        return this.screenContextMetadata;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final VerticalAlignment getVerticalAlignment() {
        return this.verticalAlignment;
    }

    public String toString() {
        return "SingleItemContentState(screenContextMetadata=" + this.screenContextMetadata + ", navigationBarState=" + this.navigationBarState + ", itemWrapper=" + this.itemWrapper + ", footerState=" + this.footerState + ", horizontalAlignment=" + this.horizontalAlignment + ", verticalAlignment=" + this.verticalAlignment + ", fillMode=" + this.fillMode + ", paddingValues=" + this.paddingValues + ", background=" + this.background + ")";
    }
}
