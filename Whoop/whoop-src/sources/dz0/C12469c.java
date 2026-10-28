package dz0;

import com.mapbox.maps.MapboxMap;
import cz0.AbstractC11258s;
import cz0.C11246g;
import cz0.C11248i;
import cz0.InterfaceC11257r;
import d61.InterfaceC11732a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m83.AbstractC25267u;
import p181h2.C16617b;
import p512u2.C34462h0;
import p512u2.InterfaceC34476v;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: dz0.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J=\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010&\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b\u0019\u0010#\u001a\u0004\b$\u0010%R\u0013\u0010)\u001a\u0004\u0018\u00010'8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010(¨\u0006*"}, m65681d2 = {"Ldz0/c;", "", "Lcz0/g;", "state", "Lcz0/i;", "filter", "<init>", "(Lcz0/g;Lcz0/i;)V", "Lh2/b;", MapboxMap.QFE_OFFSET, "", "Lcz0/r;", "scrubbableData", "Lu2/v;", "scope", "Ll83/a0;", "d", "(JLjava/util/List;Lu2/v;)V", "Ldz0/b;", "change", "dragAmount", "", "isScrubberFixEnabled", "b", "(Ldz0/b;JLjava/util/List;Lu2/v;Z)V", "c", "()V", "a", "Lcz0/g;", "getState", "()Lcz0/g;", "Lcz0/i;", "getFilter", "()Lcz0/i;", "Ldz0/a;", "Ldz0/a;", "getInternalScrubberState", "()Ldz0/a;", "internalScrubberState", "", "()Ljava/lang/Float;", "positionOfScrubber", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12469c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C11246g state;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C11248i filter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C12467a internalScrubberState;

    public C12469c(C11246g state, C11248i filter) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(filter, "filter");
        this.state = state;
        this.filter = filter;
        this.internalScrubberState = new C12467a(null, null, 3, null);
    }

    /* JADX INFO: renamed from: a */
    public final Float m35102a() {
        Iterator<Map.Entry<String, AbstractC11258s>> it = this.state.getScrubberState().mo31360b().entrySet().iterator();
        if (it.hasNext()) {
            return Float.valueOf(it.next().getValue().getX());
        }
        return null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: b */
    public final void m35103b(C12468b change, long dragAmount, List<? extends InterfaceC11257r> scrubbableData, InterfaceC34476v scope, boolean isScrubberFixEnabled) {
        AbstractC22676k.m65750j(change, "change");
        AbstractC22676k.m65750j(scrubbableData, "scrubbableData");
        AbstractC22676k.m65750j(scope, "scope");
        if (change.m35101c()) {
            if (isScrubberFixEnabled) {
                Float lastTouch = this.internalScrubberState.getLastTouch();
                if (lastTouch != null) {
                    float fFloatValue = lastTouch.floatValue();
                    Float positionOfX = this.internalScrubberState.getPositionOfX();
                    if (positionOfX != null) {
                        float fFloatValue2 = positionOfX.floatValue();
                        int i13 = (int) (dragAmount >> 32);
                        float fIntBitsToFloat = (Float.intBitsToFloat(i13) / ((int) (((C34462h0) scope).f144789Y >> 32))) + fFloatValue;
                        this.internalScrubberState.m35097c(Float.valueOf(fIntBitsToFloat));
                        if (0.0f > fIntBitsToFloat || fIntBitsToFloat > 1.0f) {
                            return;
                        }
                        this.internalScrubberState.m35098d(Float.valueOf(Float.intBitsToFloat(i13) + fFloatValue2));
                        C11248i c11248i = this.filter;
                        List<? extends InterfaceC11257r> list = scrubbableData;
                        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((InterfaceC11257r) it.next()).mo30407a(fIntBitsToFloat));
                        }
                        InterfaceC11732a.a aVar = new InterfaceC11732a.a(c11248i.m30368a(fIntBitsToFloat, arrayList), this.internalScrubberState.getPositionOfX());
                        if (!C16617b.m47187c(change.m35100b(), 0L)) {
                            change.m35099a();
                        }
                        this.state.getOnDataScrub().invoke(aVar);
                        return;
                    }
                    return;
                }
                return;
            }
            Float lastTouch2 = this.internalScrubberState.getLastTouch();
            AbstractC22676k.m65747g(lastTouch2);
            int i14 = (int) (dragAmount >> 32);
            float fIntBitsToFloat2 = (Float.intBitsToFloat(i14) / ((int) (((C34462h0) scope).f144789Y >> 32))) + lastTouch2.floatValue();
            this.internalScrubberState.m35097c(Float.valueOf(fIntBitsToFloat2));
            Float lastTouch3 = this.internalScrubberState.getLastTouch();
            AbstractC22676k.m65747g(lastTouch3);
            float fFloatValue3 = lastTouch3.floatValue();
            if (0.0f > fFloatValue3 || fFloatValue3 > 1.0f) {
                return;
            }
            C12467a c12467a = this.internalScrubberState;
            Float positionOfX2 = c12467a.getPositionOfX();
            AbstractC22676k.m65747g(positionOfX2);
            c12467a.m35098d(Float.valueOf(Float.intBitsToFloat(i14) + positionOfX2.floatValue()));
            C11248i c11248i2 = this.filter;
            List<? extends InterfaceC11257r> list2 = scrubbableData;
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((InterfaceC11257r) it3.next()).mo30407a(fIntBitsToFloat2));
            }
            InterfaceC11732a.a aVar2 = new InterfaceC11732a.a(c11248i2.m30368a(fIntBitsToFloat2, arrayList2), this.internalScrubberState.getPositionOfX());
            if (!C16617b.m47187c(change.m35100b(), 0L)) {
                change.m35099a();
            }
            this.state.getOnDataScrub().invoke(aVar2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m35104c() {
        this.internalScrubberState.m35097c(null);
        this.internalScrubberState.m35098d(null);
        this.state.getOnDataScrub().invoke(InterfaceC11732a.b.f37977a);
    }

    /* JADX INFO: renamed from: d */
    public final void m35105d(long offset, List<? extends InterfaceC11257r> scrubbableData, InterfaceC34476v scope) {
        AbstractC22676k.m65750j(scrubbableData, "scrubbableData");
        AbstractC22676k.m65750j(scope, "scope");
        if (this.state.getScrubberState() instanceof InterfaceC11732a.c) {
            return;
        }
        int i13 = (int) (offset >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i13) / ((int) (((C34462h0) scope).f144789Y >> 32));
        this.internalScrubberState.m35097c(Float.valueOf(fIntBitsToFloat));
        this.internalScrubberState.m35098d(Float.valueOf(Float.intBitsToFloat(i13)));
        List<? extends InterfaceC11257r> list = scrubbableData;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC11257r) it.next()).mo30407a(fIntBitsToFloat));
        }
        this.state.getOnDataScrub().invoke(new InterfaceC11732a.c(this.filter.m30368a(fIntBitsToFloat, arrayList), Float.valueOf(Float.intBitsToFloat(i13))));
    }

    public /* synthetic */ C12469c(C11246g c11246g, C11248i c11248i, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c11246g, (i13 & 2) != 0 ? new C11248i() : c11248i);
    }
}
