package p441qx;

import androidx.room.AbstractC1772c1;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;

/* JADX INFO: renamed from: qx.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C30703c extends AbstractC30705d {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f126426h;

    /* JADX INFO: renamed from: i */
    public JsonAdapter f126427i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Type[] f126428j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Type f126429k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Set f126430l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Set f126431m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C30703c(Type type, Set set, Object obj, Method method, int i13, boolean z4, Type[] typeArr, Type type2, Set set2, Set set3, int i14) {
        super(type, set, obj, method, i13, 1, z4);
        this.f126426h = i14;
        this.f126428j = typeArr;
        this.f126429k = type2;
        this.f126430l = set2;
        this.f126431m = set3;
    }

    @Override // p441qx.AbstractC30705d
    /* JADX INFO: renamed from: a */
    public final void mo94375a(C30722l0 c30722l0, C30707e c30707e) {
        switch (this.f126426h) {
            case 0:
                super.mo94375a(c30722l0, c30707e);
                Type type = this.f126428j[0];
                Type type2 = this.f126429k;
                boolean zM5398p = AbstractC1772c1.m5398p(type, type2);
                Set set = this.f126431m;
                this.f126427i = (zM5398p && this.f126430l.equals(set)) ? c30722l0.m94401d(c30707e, type2, set) : c30722l0.m94400c(type2, set, null);
                break;
            default:
                super.mo94375a(c30722l0, c30707e);
                Type[] typeArr = this.f126428j;
                boolean zM5398p2 = AbstractC1772c1.m5398p(typeArr[0], this.f126429k);
                Set set2 = this.f126430l;
                this.f126427i = (zM5398p2 && set2.equals(this.f126431m)) ? c30722l0.m94401d(c30707e, typeArr[0], set2) : c30722l0.m94400c(typeArr[0], set2, null);
                break;
        }
    }

    @Override // p441qx.AbstractC30705d
    /* JADX INFO: renamed from: b */
    public Object mo94360b(JsonReader jsonReader) {
        switch (this.f126426h) {
            case 1:
                return m94381c(this.f126427i.fromJson(jsonReader));
            default:
                return super.mo94360b(jsonReader);
        }
    }

    @Override // p441qx.AbstractC30705d
    /* JADX INFO: renamed from: d */
    public void mo94361d(AbstractC30704c0 abstractC30704c0, Object obj) {
        switch (this.f126426h) {
            case 0:
                this.f126427i.toJson(abstractC30704c0, m94381c(obj));
                break;
            default:
                super.mo94361d(abstractC30704c0, obj);
                break;
        }
    }
}
