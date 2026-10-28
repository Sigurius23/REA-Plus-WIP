package c41;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.ActivityDetailType;
import com.whoop.navigation.C9598e;
import com.whoop.service.network.model.cycles.Activity;
import com.whoop.service.network.model.cycles.Period;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: c41.w */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00162\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b*\u00108R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010(\u001a\u0004\b.\u0010\u001fR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010(\u001a\u0004\b6\u0010\u001fR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b,\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b4\u0010D\u001a\u0004\b=\u0010ER\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bB\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bG\u0010I\u001a\u0004\b'\u0010JR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\b9\u0010M¨\u0006N"}, m65681d2 = {"Lc41/w;", "Lm91/u;", "", "id", "Lcom/whoop/design/util/TextResource;", "title", "Lc41/o;", "pillState", "Lc41/x;", "type", "Lcom/whoop/navigation/ActivityDetailType;", "activityDetailType", "Lcom/whoop/service/network/model/cycles/Period;", "during", "Ly81/f;", "backgroundColor", "activityIdV1", "activityIdV2", "Lcom/whoop/service/network/model/cycles/Activity;", "whoopActivity", "Lc41/n1;", "detectedActivityMetadata", "", "isEmpty", "Lc41/g2;", "actionState", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lc41/o;Lc41/x;Lcom/whoop/navigation/ActivityDetailType;Lcom/whoop/service/network/model/cycles/Period;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/service/network/model/cycles/Activity;Lc41/n1;ZLc41/g2;Lcom/whoop/navigation/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Lcom/whoop/design/util/TextResource;", "j", "()Lcom/whoop/design/util/TextResource;", "c", "Lc41/o;", "i", "()Lc41/o;", "d", "Lc41/x;", "k", "()Lc41/x;", "e", "Lcom/whoop/navigation/ActivityDetailType;", "()Lcom/whoop/navigation/ActivityDetailType;", "f", "Lcom/whoop/service/network/model/cycles/Period;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/service/network/model/cycles/Period;", "g", "Ly81/f;", "getBackgroundColor", "()Ly81/f;", "Lcom/whoop/service/network/model/cycles/Activity;", "l", "()Lcom/whoop/service/network/model/cycles/Activity;", "Lc41/n1;", "()Lc41/n1;", "Z", "m", "()Z", "Lc41/g2;", "()Lc41/g2;", "n", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4138w implements InterfaceC25312u {

    /* JADX INFO: renamed from: o */
    public static final int f16823o = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C4082o pillState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC4145x type;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final ActivityDetailType activityDetailType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Period during;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final EnumC39333f backgroundColor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String activityIdV1;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String activityIdV2;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final Activity whoopActivity;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C4077n1 detectedActivityMetadata;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final boolean isEmpty;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final EnumC4029g2 actionState;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final C9598e destination;

    public C4138w(String id4, TextResource title, C4082o pillState, AbstractC4145x type, ActivityDetailType activityDetailType, Period period, EnumC39333f backgroundColor, String activityIdV1, String activityIdV2, Activity activity, C4077n1 c4077n1, boolean z4, EnumC4029g2 actionState, C9598e c9598e) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(pillState, "pillState");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(activityDetailType, "activityDetailType");
        AbstractC22676k.m65750j(backgroundColor, "backgroundColor");
        AbstractC22676k.m65750j(activityIdV1, "activityIdV1");
        AbstractC22676k.m65750j(activityIdV2, "activityIdV2");
        AbstractC22676k.m65750j(actionState, "actionState");
        this.id = id4;
        this.title = title;
        this.pillState = pillState;
        this.type = type;
        this.activityDetailType = activityDetailType;
        this.during = period;
        this.backgroundColor = backgroundColor;
        this.activityIdV1 = activityIdV1;
        this.activityIdV2 = activityIdV2;
        this.whoopActivity = activity;
        this.detectedActivityMetadata = c4077n1;
        this.isEmpty = z4;
        this.actionState = actionState;
        this.destination = c9598e;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC4029g2 getActionState() {
        return this.actionState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ActivityDetailType getActivityDetailType() {
        return this.activityDetailType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getActivityIdV1() {
        return this.activityIdV1;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getActivityIdV2() {
        return this.activityIdV2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4138w)) {
            return false;
        }
        C4138w c4138w = (C4138w) other;
        return AbstractC22676k.m65745e(this.id, c4138w.id) && AbstractC22676k.m65745e(this.title, c4138w.title) && AbstractC22676k.m65745e(this.pillState, c4138w.pillState) && AbstractC22676k.m65745e(this.type, c4138w.type) && this.activityDetailType == c4138w.activityDetailType && AbstractC22676k.m65745e(this.during, c4138w.during) && this.backgroundColor == c4138w.backgroundColor && AbstractC22676k.m65745e(this.activityIdV1, c4138w.activityIdV1) && AbstractC22676k.m65745e(this.activityIdV2, c4138w.activityIdV2) && AbstractC22676k.m65745e(this.whoopActivity, c4138w.whoopActivity) && AbstractC22676k.m65745e(this.detectedActivityMetadata, c4138w.detectedActivityMetadata) && this.isEmpty == c4138w.isEmpty && this.actionState == c4138w.actionState && AbstractC22676k.m65745e(this.destination, c4138w.destination);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C4077n1 getDetectedActivityMetadata() {
        return this.detectedActivityMetadata;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Period getDuring() {
        return this.during;
    }

    public int hashCode() {
        int iHashCode = (this.activityDetailType.hashCode() + ((this.type.hashCode() + ((this.pillState.hashCode() + AbstractC31061c.m95625a(this.id.hashCode() * 31, this.title, 31)) * 31)) * 31)) * 31;
        Period period = this.during;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC21702c.m61132c(this.backgroundColor, (iHashCode + (period == null ? 0 : period.hashCode())) * 31, 31), 31, this.activityIdV1), 31, this.activityIdV2);
        Activity activity = this.whoopActivity;
        int iHashCode2 = (iM30450d + (activity == null ? 0 : activity.hashCode())) * 31;
        C4077n1 c4077n1 = this.detectedActivityMetadata;
        int iHashCode3 = (this.actionState.hashCode() + AbstractC2875y.m8289b((iHashCode2 + (c4077n1 == null ? 0 : c4077n1.hashCode())) * 31, 31, this.isEmpty)) * 31;
        C9598e c9598e = this.destination;
        return iHashCode3 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final C4082o getPillState() {
        return this.pillState;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final AbstractC4145x getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Activity getWhoopActivity() {
        return this.whoopActivity;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getIsEmpty() {
        return this.isEmpty;
    }

    public String toString() {
        String str = this.id;
        TextResource textResource = this.title;
        C4082o c4082o = this.pillState;
        AbstractC4145x abstractC4145x = this.type;
        ActivityDetailType activityDetailType = this.activityDetailType;
        Period period = this.during;
        EnumC39333f enumC39333f = this.backgroundColor;
        String str2 = this.activityIdV1;
        String str3 = this.activityIdV2;
        Activity activity = this.whoopActivity;
        C4077n1 c4077n1 = this.detectedActivityMetadata;
        boolean z4 = this.isEmpty;
        EnumC4029g2 enumC4029g2 = this.actionState;
        C9598e c9598e = this.destination;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("ActivityTileState(id=", str, ", title=", textResource, ", pillState=");
        sbM91847q.append(c4082o);
        sbM91847q.append(", type=");
        sbM91847q.append(abstractC4145x);
        sbM91847q.append(", activityDetailType=");
        sbM91847q.append(activityDetailType);
        sbM91847q.append(", during=");
        sbM91847q.append(period);
        sbM91847q.append(", backgroundColor=");
        sbM91847q.append(enumC39333f);
        sbM91847q.append(", activityIdV1=");
        sbM91847q.append(str2);
        sbM91847q.append(", activityIdV2=");
        sbM91847q.append(str3);
        sbM91847q.append(", whoopActivity=");
        sbM91847q.append(activity);
        sbM91847q.append(", detectedActivityMetadata=");
        sbM91847q.append(c4077n1);
        sbM91847q.append(", isEmpty=");
        sbM91847q.append(z4);
        sbM91847q.append(", actionState=");
        sbM91847q.append(enumC4029g2);
        sbM91847q.append(", destination=");
        sbM91847q.append(c9598e);
        sbM91847q.append(")");
        return sbM91847q.toString();
    }

    public /* synthetic */ C4138w(String str, TextResource textResource, C4082o c4082o, AbstractC4145x abstractC4145x, ActivityDetailType activityDetailType, Period period, EnumC39333f enumC39333f, String str2, String str3, Activity activity, C4077n1 c4077n1, boolean z4, EnumC4029g2 enumC4029g2, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, textResource, c4082o, abstractC4145x, activityDetailType, (i13 & 32) != 0 ? null : period, (i13 & 64) != 0 ? EnumC39333f.WHITE_10 : enumC39333f, (i13 & 128) != 0 ? "" : str2, (i13 & 256) != 0 ? "" : str3, (i13 & 512) != 0 ? null : activity, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : c4077n1, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? false : z4, (i13 & 4096) != 0 ? EnumC4029g2.NORMAL : enumC4029g2, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : c9598e);
    }
}
