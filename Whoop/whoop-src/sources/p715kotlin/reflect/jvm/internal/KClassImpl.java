package p715kotlin.reflect.jvm.internal;

import aa3.AbstractC0645p;
import aa3.AbstractC0650r0;
import aa3.C0606b1;
import aa3.C0641n0;
import aa3.C0644o0;
import aa3.EnumC0639m1;
import aa3.EnumC0647q;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.mapbox.common.HttpHeaders;
import da3.C11835b;
import ge3.AbstractC15751g;
import hb3.C17119i;
import hb3.C17122k;
import hb3.C17135x;
import hg3.AbstractC17269i;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import j93.AbstractC21478l0;
import j93.EnumC21466f0;
import j93.InterfaceC21456a0;
import j93.InterfaceC21458b0;
import j93.InterfaceC21459c;
import j93.InterfaceC21461d;
import j93.InterfaceC21463e;
import j93.InterfaceC21467g;
import j93.InterfaceC21493z;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jb3.C21548h;
import kb3.C22342k;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lb3.AbstractC23811y;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25235a0;
import m83.C25271y;
import m83.C25272z;
import n93.AbstractC26487a;
import o93.AbstractC27732d;
import o93.AbstractC27736h;
import o93.AbstractC27741m;
import ob3.InterfaceC27802l;
import p098dt.AbstractC12350b;
import p249jc.AbstractC21598x;
import p249jc.C21565a;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p530up.AbstractC35148d;
import p557vo.AbstractC36220b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22693x;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22706i;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;
import p93.AbstractC29032k;
import p93.C29024c;
import p93.C29028g;
import pa3.EnumC29038a;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import qa3.C30145k;
import qa3.C30146k0;
import r80.AbstractC31061c;
import r93.AbstractC31150q;
import r93.AbstractC31152r;
import r93.EnumC31106a0;
import r93.EnumC31120f;
import r93.InterfaceC31111c;
import r93.InterfaceC31117e;
import r93.InterfaceC31126h;
import r93.InterfaceC31132j;
import r93.InterfaceC31135k;
import r93.InterfaceC31145n0;
import r93.InterfaceC31162w;
import r93.InterfaceC31165x0;
import t83.InterfaceC33616a;
import ta3.AbstractC33686l;
import u93.C34686l;
import u93.C34696q;
import ub3.AbstractC34756j;
import ug.AbstractC34924m;
import va3.AbstractC35849g;
import va3.C35845c;
import va3.C35847e;
import va3.C35850h;
import w93.C36969b;
import w93.C36972e;
import wa3.C37010o;
import wb3.AbstractC37056f;
import wb3.C37058h;
import x93.AbstractC38109c;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import z93.EnumC40212c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u007f*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u00052\u00020\u0006:\u0005\u0080\u0001\u0081\u0001\u007fB\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J)\u0010'\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030&0\r2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010.\u001a\u00020-2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00020-2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b0\u0010/R \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u00103R'\u00106\u001a\u0012\u0012\u000e\u0012\f05R\b\u0012\u0004\u0012\u00028\u00000\u0000048\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020;0:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u001e\u0010A\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030?0\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010@R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020B0\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010@R\u0016\u0010F\u001a\u0004\u0018\u00010\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010!R\u0016\u0010H\u001a\u0004\u0018\u00010\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010!R \u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000I0\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010@R\u001e\u0010M\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010@R\u0016\u0010P\u001a\u0004\u0018\u00018\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020Q0:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010=R\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020T0:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010=R\"\u0010X\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00040:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010=R\u0016\u0010\\\u001a\u0004\u0018\u00010Y8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0014\u0010]\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0014\u0010_\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010^R\u0014\u0010`\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010^R\u0014\u0010a\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010^R\u0014\u0010b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010^R\u0014\u0010c\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010^R\u0014\u0010d\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010^R\u0014\u0010e\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010^R\u0014\u0010f\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010^R\u0014\u0010h\u001a\u00020\u00188@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bg\u0010^R\u0011\u0010k\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0016\u0010o\u001a\u0004\u0018\u00010l8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0014\u0010*\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0014\u0010u\u001a\u00020r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bs\u0010tR\u0014\u0010x\u001a\u00020\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bv\u0010wR\u0014\u0010z\u001a\u00020\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\by\u0010wR\u0014\u0010~\u001a\u00020{8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}¨\u0006\u0082\u0001"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl;", "", "T", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lj93/d;", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "Lob3/l;", "Ljava/lang/Class;", "jClass", "<init>", "(Ljava/lang/Class;)V", "Lva3/h;", "name", "", "Lr93/n0;", "getProperties", "(Lva3/h;)Ljava/util/Collection;", "Lr93/w;", "getFunctions", "", "index", "getLocalProperty", "(I)Lr93/n0;", "value", "", "isInstance", "(Ljava/lang/Object;)Z", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;", "scope", "Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;", "belonginess", "Lkotlin/reflect/jvm/internal/DescriptorKCallable;", "getMembers", "(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;)Ljava/util/Collection;", "Lva3/c;", "classId", "Lw93/e;", "moduleData", "Lr93/e;", "createSyntheticClassOrFail", "(Lva3/c;Lw93/e;)Lr93/e;", "createSyntheticClass", "Ljava/lang/Class;", "getJClass", "()Ljava/lang/Class;", "Ll83/h;", "Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "data", "Ll83/h;", "getData", "()Ll83/h;", "", "", "getAnnotations", "()Ljava/util/List;", "annotations", "Lj93/c;", "()Ljava/util/Collection;", QueryChannelRequest.KEY_MEMBERS, "Lr93/j;", "getConstructorDescriptors", "constructorDescriptors", "getSimpleName", "simpleName", "getQualifiedName", "qualifiedName", "Lj93/g;", "getConstructors", "constructors", "getNestedClasses", "nestedClasses", "getObjectInstance", "()Ljava/lang/Object;", "objectInstance", "Lj93/b0;", "getTypeParameters", "typeParameters", "Lj93/a0;", "getSupertypes", "supertypes", "getSealedSubclasses", "sealedSubclasses", "Lj93/f0;", "getVisibility", "()Lj93/f0;", "visibility", "isFinal", "()Z", "isOpen", "isAbstract", "isSealed", "isData", "isInner", "isCompanion", "isFun", "isValue", "isInline$kotlin_reflection", "isInline", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor", "Laa3/n0;", "getKmClass", "()Lkotlin/metadata/KmClass;", "kmClass", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "Laa3/q;", "getClassKind$kotlin_reflection", "()Lkotlin/metadata/ClassKind;", "classKind", "getMemberScope$kotlin_reflection", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "memberScope", "getStaticScope$kotlin_reflection", "staticScope", "Laa3/m1;", "getModality", "()Lkotlin/metadata/Modality;", "modality", "Companion", "Data", "MemberBelonginess", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class KClassImpl<T> extends KDeclarationContainerImpl implements InterfaceC21461d, KTypeParameterOwnerImpl, InterfaceC27802l {
    private static final Set<String> SPECIAL_JVM_ANNOTATION_NAMES;
    private final InterfaceC23462h data;
    private final Class<T> jClass;

    @Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001b\n\u0002\b\n\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0019\u001a\u00020\u00148FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R!\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\rR\u001d\u0010!\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010 R\u001d\u0010$\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010 R-\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&0%8FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b'\u0010\u0016\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)R%\u00100\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030-0%8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u0016\u001a\u0004\b/\u0010)R#\u00105\u001a\u0004\u0018\u00018\u00008FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b1\u0010\u0010\u0012\u0004\b4\u0010+\u001a\u0004\b2\u00103R!\u00109\u001a\b\u0012\u0004\u0012\u0002060\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\u0016\u001a\u0004\b8\u0010\rR\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\u0016\u001a\u0004\b<\u0010=R!\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b?\u0010\u0016\u001a\u0004\b@\u0010\rR)\u0010D\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000-0\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bB\u0010\u0016\u001a\u0004\bC\u0010\rR%\u0010H\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030E0%8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bF\u0010\u0016\u001a\u0004\bG\u0010)R%\u0010K\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030E0%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010\u0016\u001a\u0004\bJ\u0010)R%\u0010N\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030E0%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010\u0016\u001a\u0004\bM\u0010)R%\u0010Q\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030E0%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010\u0016\u001a\u0004\bP\u0010)R%\u0010T\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030E0%8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bR\u0010\u0016\u001a\u0004\bS\u0010)R%\u0010W\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030E0%8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bU\u0010\u0016\u001a\u0004\bV\u0010)R%\u0010Z\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030E0%8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bX\u0010\u0016\u001a\u0004\bY\u0010)R%\u0010]\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030E0%8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b[\u0010\u0016\u001a\u0004\b\\\u0010)¨\u0006^"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "<init>", "(Lkotlin/reflect/jvm/internal/KClassImpl;)V", "Ljava/lang/Class;", "jClass", "", "calculateLocalClassName", "(Ljava/lang/Class;)Ljava/lang/String;", "", "Lj93/a0;", "computeLegacySupertypes", "()Ljava/util/List;", "Laa3/n0;", "kmClass$delegate", "Ll83/h;", "getKmClass", "()Lkotlin/metadata/KmClass;", "kmClass", "Lr93/e;", "descriptor$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor", "", "annotations$delegate", "getAnnotations", "annotations", "simpleName$delegate", "getSimpleName", "()Ljava/lang/String;", "simpleName", "qualifiedName$delegate", "getQualifiedName", "qualifiedName", "", "Lj93/g;", "constructors$delegate", "getConstructors", "()Ljava/util/Collection;", "getConstructors$annotations", "()V", "constructors", "Lj93/d;", "nestedClasses$delegate", "getNestedClasses", "nestedClasses", "objectInstance$delegate", "getObjectInstance", "()Ljava/lang/Object;", "getObjectInstance$annotations", "objectInstance", "Lj93/b0;", "typeParameters$delegate", "getTypeParameters", "typeParameters", "Lkotlin/reflect/jvm/internal/TypeParameterTable;", "typeParameterTable$delegate", "getTypeParameterTable", "()Lkotlin/reflect/jvm/internal/TypeParameterTable;", "typeParameterTable", "supertypes$delegate", "getSupertypes", "supertypes", "sealedSubclasses$delegate", "getSealedSubclasses", "sealedSubclasses", "Lkotlin/reflect/jvm/internal/DescriptorKCallable;", "declaredNonStaticMembers$delegate", "getDeclaredNonStaticMembers", "declaredNonStaticMembers", "declaredStaticMembers$delegate", "getDeclaredStaticMembers", "declaredStaticMembers", "inheritedNonStaticMembers$delegate", "getInheritedNonStaticMembers", "inheritedNonStaticMembers", "inheritedStaticMembers$delegate", "getInheritedStaticMembers", "inheritedStaticMembers", "allNonStaticMembers$delegate", "getAllNonStaticMembers", "allNonStaticMembers", "allStaticMembers$delegate", "getAllStaticMembers", "allStaticMembers", "declaredMembers$delegate", "getDeclaredMembers", "declaredMembers", "allMembers$delegate", "getAllMembers", "allMembers", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public final class Data extends KDeclarationContainerImpl.Data {
        static final /* synthetic */ InterfaceC21493z[] $$delegatedProperties;

        /* JADX INFO: renamed from: allMembers$delegate, reason: from kotlin metadata */
        private final ReflectProperties.LazySoftVal allMembers;

        /* JADX INFO: renamed from: allNonStaticMembers$delegate, reason: from kotlin metadata */
        private final ReflectProperties.LazySoftVal allNonStaticMembers;

        /* JADX INFO: renamed from: allStaticMembers$delegate, reason: from kotlin metadata */
        private final ReflectProperties.LazySoftVal allStaticMembers;

        /* JADX INFO: renamed from: annotations$delegate, reason: from kotlin metadata */
        private final ReflectProperties.LazySoftVal annotations;

        /* JADX INFO: renamed from: constructors$delegate, reason: from kotlin metadata */
        private final ReflectProperties.LazySoftVal constructors;

        /* JADX INFO: renamed from: declaredMembers$delegate, reason: from kotlin metadata */
        private final ReflectProperties.LazySoftVal declaredMembers;

        /* JADX INFO: renamed from: declaredNonStaticMembers$delegate, reason: from kotlin metadata */
        private final ReflectProperties.LazySoftVal declaredNonStaticMembers;

        /* JADX INFO: renamed from: declaredStaticMembers$delegate, reason: from kotlin metadata */
        private final ReflectProperties.LazySoftVal declaredStaticMembers;

        /* JADX INFO: renamed from: descriptor$delegate, reason: from kotlin metadata */
        private final ReflectProperties.LazySoftVal descriptor;

        /* JADX INFO: renamed from: inheritedNonStaticMembers$delegate, reason: from kotlin metadata */
        private final ReflectProperties.LazySoftVal inheritedNonStaticMembers;

        /* JADX INFO: renamed from: inheritedStaticMembers$delegate, reason: from kotlin metadata */
        private final ReflectProperties.LazySoftVal inheritedStaticMembers;

        /* JADX INFO: renamed from: kmClass$delegate, reason: from kotlin metadata */
        private final InterfaceC23462h kmClass;

        /* JADX INFO: renamed from: nestedClasses$delegate, reason: from kotlin metadata */
        private final ReflectProperties.LazySoftVal nestedClasses;

        /* JADX INFO: renamed from: objectInstance$delegate, reason: from kotlin metadata */
        private final InterfaceC23462h objectInstance;

        /* JADX INFO: renamed from: qualifiedName$delegate, reason: from kotlin metadata */
        private final ReflectProperties.LazySoftVal qualifiedName;

        /* JADX INFO: renamed from: sealedSubclasses$delegate, reason: from kotlin metadata */
        private final ReflectProperties.LazySoftVal sealedSubclasses;

        /* JADX INFO: renamed from: simpleName$delegate, reason: from kotlin metadata */
        private final ReflectProperties.LazySoftVal simpleName;

        /* JADX INFO: renamed from: supertypes$delegate, reason: from kotlin metadata */
        private final ReflectProperties.LazySoftVal supertypes;

        /* JADX INFO: renamed from: typeParameterTable$delegate, reason: from kotlin metadata */
        private final ReflectProperties.LazySoftVal typeParameterTable;

        /* JADX INFO: renamed from: typeParameters$delegate, reason: from kotlin metadata */
        private final ReflectProperties.LazySoftVal typeParameters;

        static {
            C22693x c22693x = new C22693x(Data.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0);
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            $$delegatedProperties = new InterfaceC21493z[]{c22673i0.property1(c22693x), AbstractC31061c.m95632h(Data.class, "annotations", "getAnnotations()Ljava/util/List;", 0, c22673i0), AbstractC31061c.m95632h(Data.class, "simpleName", "getSimpleName()Ljava/lang/String;", 0, c22673i0), AbstractC31061c.m95632h(Data.class, "qualifiedName", "getQualifiedName()Ljava/lang/String;", 0, c22673i0), AbstractC31061c.m95632h(Data.class, "constructors", "getConstructors()Ljava/util/Collection;", 0, c22673i0), AbstractC31061c.m95632h(Data.class, "nestedClasses", "getNestedClasses()Ljava/util/Collection;", 0, c22673i0), AbstractC31061c.m95632h(Data.class, "typeParameters", "getTypeParameters()Ljava/util/List;", 0, c22673i0), AbstractC31061c.m95632h(Data.class, "typeParameterTable", "getTypeParameterTable()Lkotlin/reflect/jvm/internal/TypeParameterTable;", 0, c22673i0), AbstractC31061c.m95632h(Data.class, "supertypes", "getSupertypes()Ljava/util/List;", 0, c22673i0), AbstractC31061c.m95632h(Data.class, "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;", 0, c22673i0), AbstractC31061c.m95632h(Data.class, "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;", 0, c22673i0), AbstractC31061c.m95632h(Data.class, "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;", 0, c22673i0), AbstractC31061c.m95632h(Data.class, "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;", 0, c22673i0), AbstractC31061c.m95632h(Data.class, "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;", 0, c22673i0), AbstractC31061c.m95632h(Data.class, "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;", 0, c22673i0), AbstractC31061c.m95632h(Data.class, "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;", 0, c22673i0), AbstractC31061c.m95632h(Data.class, "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;", 0, c22673i0), AbstractC31061c.m95632h(Data.class, "allMembers", "getAllMembers()Ljava/util/Collection;", 0, c22673i0)};
        }

        public Data() {
            super();
            EnumC23463i enumC23463i = EnumC23463i.f92934x;
            this.kmClass = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(KClassImpl.this, this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$0
                private final KClassImpl arg$0;
                private final KClassImpl.Data arg$1;

                {
                    this.arg$0 = kClassImpl;
                    this.arg$1 = this;
                }

                @Override // c93.InterfaceC4339a
                public Object invoke() {
                    return KClassImpl.Data.kmClass_delegate$lambda$0(this.arg$0, this.arg$1);
                }
            });
            this.descriptor = ReflectProperties.lazySoft(new InterfaceC4339a(KClassImpl.this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$1
                private final KClassImpl arg$0;

                {
                    this.arg$0 = kClassImpl;
                }

                @Override // c93.InterfaceC4339a
                public Object invoke() {
                    return KClassImpl.Data.descriptor_delegate$lambda$0(this.arg$0);
                }
            });
            this.annotations = ReflectProperties.lazySoft(new InterfaceC4339a(KClassImpl.this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$2
                private final KClassImpl arg$0;

                {
                    this.arg$0 = kClassImpl;
                }

                @Override // c93.InterfaceC4339a
                public Object invoke() {
                    return KClassImpl.Data.annotations_delegate$lambda$0(this.arg$0);
                }
            });
            this.simpleName = ReflectProperties.lazySoft(new InterfaceC4339a(KClassImpl.this, this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$3
                private final KClassImpl arg$0;
                private final KClassImpl.Data arg$1;

                {
                    this.arg$0 = kClassImpl;
                    this.arg$1 = this;
                }

                @Override // c93.InterfaceC4339a
                public Object invoke() {
                    return KClassImpl.Data.simpleName_delegate$lambda$0(this.arg$0, this.arg$1);
                }
            });
            this.qualifiedName = ReflectProperties.lazySoft(new InterfaceC4339a(KClassImpl.this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$4
                private final KClassImpl arg$0;

                {
                    this.arg$0 = kClassImpl;
                }

                @Override // c93.InterfaceC4339a
                public Object invoke() {
                    return KClassImpl.Data.qualifiedName_delegate$lambda$0(this.arg$0);
                }
            });
            this.constructors = ReflectProperties.lazySoft(new InterfaceC4339a(KClassImpl.this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$5
                private final KClassImpl arg$0;

                {
                    this.arg$0 = kClassImpl;
                }

                @Override // c93.InterfaceC4339a
                public Object invoke() {
                    return KClassImpl.Data.constructors_delegate$lambda$0(this.arg$0);
                }
            });
            this.nestedClasses = ReflectProperties.lazySoft(new InterfaceC4339a(this, KClassImpl.this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$6
                private final KClassImpl.Data arg$0;
                private final KClassImpl arg$1;

                {
                    this.arg$0 = this;
                    this.arg$1 = kClassImpl;
                }

                @Override // c93.InterfaceC4339a
                public Object invoke() {
                    return KClassImpl.Data.nestedClasses_delegate$lambda$0(this.arg$0, this.arg$1);
                }
            });
            this.objectInstance = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this, KClassImpl.this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$7
                private final KClassImpl.Data arg$0;
                private final KClassImpl arg$1;

                {
                    this.arg$0 = this;
                    this.arg$1 = kClassImpl;
                }

                @Override // c93.InterfaceC4339a
                public Object invoke() {
                    return KClassImpl.Data.objectInstance_delegate$lambda$0(this.arg$0, this.arg$1);
                }
            });
            this.typeParameters = ReflectProperties.lazySoft(new InterfaceC4339a(this, KClassImpl.this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$8
                private final KClassImpl.Data arg$0;
                private final KClassImpl arg$1;

                {
                    this.arg$0 = this;
                    this.arg$1 = kClassImpl;
                }

                @Override // c93.InterfaceC4339a
                public Object invoke() {
                    return KClassImpl.Data.typeParameters_delegate$lambda$0(this.arg$0, this.arg$1);
                }
            });
            this.typeParameterTable = ReflectProperties.lazySoft(new InterfaceC4339a(this, KClassImpl.this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$9
                private final KClassImpl.Data arg$0;
                private final KClassImpl arg$1;

                {
                    this.arg$0 = this;
                    this.arg$1 = kClassImpl;
                }

                @Override // c93.InterfaceC4339a
                public Object invoke() {
                    return KClassImpl.Data.typeParameterTable_delegate$lambda$0(this.arg$0, this.arg$1);
                }
            });
            this.supertypes = ReflectProperties.lazySoft(new InterfaceC4339a(KClassImpl.this, this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$10
                private final KClassImpl arg$0;
                private final KClassImpl.Data arg$1;

                {
                    this.arg$0 = kClassImpl;
                    this.arg$1 = this;
                }

                @Override // c93.InterfaceC4339a
                public Object invoke() {
                    return KClassImpl.Data.supertypes_delegate$lambda$0(this.arg$0, this.arg$1);
                }
            });
            this.sealedSubclasses = ReflectProperties.lazySoft(new InterfaceC4339a(KClassImpl.this, this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$11
                private final KClassImpl arg$0;
                private final KClassImpl.Data arg$1;

                {
                    this.arg$0 = kClassImpl;
                    this.arg$1 = this;
                }

                @Override // c93.InterfaceC4339a
                public Object invoke() {
                    return KClassImpl.Data.sealedSubclasses_delegate$lambda$0(this.arg$0, this.arg$1);
                }
            });
            this.declaredNonStaticMembers = ReflectProperties.lazySoft(new InterfaceC4339a(KClassImpl.this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$12
                private final KClassImpl arg$0;

                {
                    this.arg$0 = kClassImpl;
                }

                @Override // c93.InterfaceC4339a
                public Object invoke() {
                    return KClassImpl.Data.declaredNonStaticMembers_delegate$lambda$0(this.arg$0);
                }
            });
            this.declaredStaticMembers = ReflectProperties.lazySoft(new InterfaceC4339a(KClassImpl.this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$13
                private final KClassImpl arg$0;

                {
                    this.arg$0 = kClassImpl;
                }

                @Override // c93.InterfaceC4339a
                public Object invoke() {
                    return KClassImpl.Data.declaredStaticMembers_delegate$lambda$0(this.arg$0);
                }
            });
            this.inheritedNonStaticMembers = ReflectProperties.lazySoft(new InterfaceC4339a(KClassImpl.this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$14
                private final KClassImpl arg$0;

                {
                    this.arg$0 = kClassImpl;
                }

                @Override // c93.InterfaceC4339a
                public Object invoke() {
                    return KClassImpl.Data.inheritedNonStaticMembers_delegate$lambda$0(this.arg$0);
                }
            });
            this.inheritedStaticMembers = ReflectProperties.lazySoft(new InterfaceC4339a(KClassImpl.this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$15
                private final KClassImpl arg$0;

                {
                    this.arg$0 = kClassImpl;
                }

                @Override // c93.InterfaceC4339a
                public Object invoke() {
                    return KClassImpl.Data.inheritedStaticMembers_delegate$lambda$0(this.arg$0);
                }
            });
            this.allNonStaticMembers = ReflectProperties.lazySoft(new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$16
                private final KClassImpl.Data arg$0;

                {
                    this.arg$0 = this;
                }

                @Override // c93.InterfaceC4339a
                public Object invoke() {
                    return KClassImpl.Data.allNonStaticMembers_delegate$lambda$0(this.arg$0);
                }
            });
            this.allStaticMembers = ReflectProperties.lazySoft(new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$17
                private final KClassImpl.Data arg$0;

                {
                    this.arg$0 = this;
                }

                @Override // c93.InterfaceC4339a
                public Object invoke() {
                    return KClassImpl.Data.allStaticMembers_delegate$lambda$0(this.arg$0);
                }
            });
            this.declaredMembers = ReflectProperties.lazySoft(new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$18
                private final KClassImpl.Data arg$0;

                {
                    this.arg$0 = this;
                }

                @Override // c93.InterfaceC4339a
                public Object invoke() {
                    return KClassImpl.Data.declaredMembers_delegate$lambda$0(this.arg$0);
                }
            });
            this.allMembers = ReflectProperties.lazySoft(new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$19
                private final KClassImpl.Data arg$0;

                {
                    this.arg$0 = this;
                }

                @Override // c93.InterfaceC4339a
                public Object invoke() {
                    return KClassImpl.Data.allMembers_delegate$lambda$0(this.arg$0);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List allMembers_delegate$lambda$0(Data data) {
            return AbstractC25265s.m74129g1(data.getAllNonStaticMembers(), data.getAllStaticMembers());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List allNonStaticMembers_delegate$lambda$0(Data data) {
            return AbstractC25265s.m74129g1(data.getDeclaredNonStaticMembers(), data.getInheritedNonStaticMembers());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List allStaticMembers_delegate$lambda$0(Data data) {
            return AbstractC25265s.m74129g1(data.getDeclaredStaticMembers(), data.getInheritedStaticMembers());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List annotations_delegate$lambda$0(KClassImpl kClassImpl) {
            Annotation[] annotations = kClassImpl.getJClass().getAnnotations();
            AbstractC22676k.m65749i(annotations, "getAnnotations(...)");
            ArrayList arrayList = new ArrayList();
            for (Annotation annotation : annotations) {
                if (!KClassImpl.SPECIAL_JVM_ANNOTATION_NAMES.contains(AbstractC21598x.m60663S(AbstractC21598x.m60655K(annotation)).getName())) {
                    arrayList.add(annotation);
                }
            }
            return UtilKt.unwrapRepeatableAnnotations(arrayList);
        }

        private final String calculateLocalClassName(Class<?> jClass) {
            String simpleName = jClass.getSimpleName();
            Method enclosingMethod = jClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                return AbstractC39414r.m125859E0(simpleName, enclosingMethod.getName() + '$', simpleName);
            }
            Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
            if (enclosingConstructor == null) {
                return AbstractC39414r.m125858D0('$', simpleName, simpleName);
            }
            return AbstractC39414r.m125859E0(simpleName, enclosingConstructor.getName() + '$', simpleName);
        }

        private final List<InterfaceC21456a0> computeLegacySupertypes() {
            Collection<AbstractC23811y> supertypes = getDescriptor().mo60496e().getSupertypes();
            AbstractC22676k.m65749i(supertypes, "getSupertypes(...)");
            ArrayList arrayList = new ArrayList(supertypes.size());
            final KClassImpl<T> kClassImpl = KClassImpl.this;
            for (final AbstractC23811y abstractC23811y : supertypes) {
                AbstractC22676k.m65747g(abstractC23811y);
                arrayList.add(new C37058h(abstractC23811y, new InterfaceC4339a(abstractC23811y, kClassImpl) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$20
                    private final AbstractC23811y arg$0;
                    private final KClassImpl arg$1;

                    {
                        this.arg$0 = abstractC23811y;
                        this.arg$1 = kClassImpl;
                    }

                    @Override // c93.InterfaceC4339a
                    public Object invoke() {
                        return KClassImpl.Data.computeLegacySupertypes$lambda$0$0(this.arg$0, this.arg$1);
                    }
                }));
            }
            InterfaceC31117e descriptor = getDescriptor();
            if (descriptor == null) {
                AbstractC27736h.m83809a(107);
                throw null;
            }
            C35850h c35850h = AbstractC27736h.f111789e;
            if (!AbstractC27736h.m83810b(descriptor, AbstractC27741m.f111843a) && !AbstractC27736h.m83810b(descriptor, AbstractC27741m.f111845b)) {
                if (arrayList.isEmpty()) {
                    arrayList.add(StandardKTypes.INSTANCE.getANY());
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        InterfaceC21463e classifier = ((InterfaceC21456a0) it.next()).getClassifier();
                        KClassImpl kClassImpl2 = classifier instanceof KClassImpl ? (KClassImpl) classifier : null;
                        if (kClassImpl2 == null || (kClassImpl2.getClassKind$kotlin_reflection() != EnumC0647q.INTERFACE && kClassImpl2.getClassKind$kotlin_reflection() != EnumC0647q.ANNOTATION_CLASS)) {
                        }
                    }
                    arrayList.add(StandardKTypes.INSTANCE.getANY());
                }
            }
            return AbstractC34756j.m109752b(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Type computeLegacySupertypes$lambda$0$0(AbstractC23811y abstractC23811y, KClassImpl kClassImpl) {
            InterfaceC31126h interfaceC31126hMo1784d = abstractC23811y.mo69844i0().mo1784d();
            if (!(interfaceC31126hMo1784d instanceof InterfaceC31117e)) {
                throw new KotlinReflectionInternalError("Supertype not a class: " + interfaceC31126hMo1784d);
            }
            Class<?> javaClass = UtilKt.toJavaClass((InterfaceC31117e) interfaceC31126hMo1784d);
            if (javaClass == null) {
                throw new KotlinReflectionInternalError("Unsupported superclass of " + kClassImpl + ": " + interfaceC31126hMo1784d);
            }
            if (AbstractC22676k.m65745e(kClassImpl.getJClass().getSuperclass(), javaClass)) {
                Type genericSuperclass = kClassImpl.getJClass().getGenericSuperclass();
                AbstractC22676k.m65747g(genericSuperclass);
                return genericSuperclass;
            }
            Class<?>[] interfaces = kClassImpl.getJClass().getInterfaces();
            AbstractC22676k.m65749i(interfaces, "getInterfaces(...)");
            int iM74085z0 = AbstractC25260n.m74085z0(interfaces, javaClass);
            if (iM74085z0 >= 0) {
                Type type = kClassImpl.getJClass().getGenericInterfaces()[iM74085z0];
                AbstractC22676k.m65747g(type);
                return type;
            }
            throw new KotlinReflectionInternalError("No superclass of " + kClassImpl + " in Java reflection for " + interfaceC31126hMo1784d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List constructors_delegate$lambda$0(KClassImpl kClassImpl) {
            Collection<InterfaceC31132j> constructorDescriptors = kClassImpl.getConstructorDescriptors();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(constructorDescriptors, 10));
            Iterator<T> it = constructorDescriptors.iterator();
            while (it.hasNext()) {
                arrayList.add(new DescriptorKFunction(kClassImpl, (InterfaceC31132j) it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List declaredMembers_delegate$lambda$0(Data data) {
            return AbstractC25265s.m74129g1(data.getDeclaredNonStaticMembers(), data.getDeclaredStaticMembers());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection declaredNonStaticMembers_delegate$lambda$0(KClassImpl kClassImpl) {
            return kClassImpl.getMembers(kClassImpl.getMemberScope$kotlin_reflection(), MemberBelonginess.DECLARED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection declaredStaticMembers_delegate$lambda$0(KClassImpl kClassImpl) {
            return kClassImpl.getMembers(kClassImpl.getStaticScope$kotlin_reflection(), MemberBelonginess.DECLARED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC31117e descriptor_delegate$lambda$0(KClassImpl kClassImpl) {
            C35845c classId = kClassImpl.getClassId();
            C36972e moduleData = ((Data) kClassImpl.getData().getValue()).getModuleData();
            InterfaceC31117e interfaceC31117eM48364b = (classId.f152611c && kClassImpl.getJClass().isAnnotationPresent(Metadata.class)) ? moduleData.f158232a.m48364b(classId) : AbstractC17269i.m48865L(moduleData.f158232a.f65736b, classId);
            return interfaceC31117eM48364b == null ? kClassImpl.createSyntheticClassOrFail(classId, moduleData) : interfaceC31117eM48364b;
        }

        private final Collection<DescriptorKCallable<?>> getDeclaredStaticMembers() {
            T value = this.declaredStaticMembers.getValue(this, $$delegatedProperties[11]);
            AbstractC22676k.m65749i(value, "getValue(...)");
            return (Collection) value;
        }

        private final Collection<DescriptorKCallable<?>> getInheritedNonStaticMembers() {
            T value = this.inheritedNonStaticMembers.getValue(this, $$delegatedProperties[12]);
            AbstractC22676k.m65749i(value, "getValue(...)");
            return (Collection) value;
        }

        private final Collection<DescriptorKCallable<?>> getInheritedStaticMembers() {
            T value = this.inheritedStaticMembers.getValue(this, $$delegatedProperties[13]);
            AbstractC22676k.m65749i(value, "getValue(...)");
            return (Collection) value;
        }

        private final TypeParameterTable getTypeParameterTable() {
            T value = this.typeParameterTable.getValue(this, $$delegatedProperties[7]);
            AbstractC22676k.m65749i(value, "getValue(...)");
            return (TypeParameterTable) value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection inheritedNonStaticMembers_delegate$lambda$0(KClassImpl kClassImpl) {
            return kClassImpl.getMembers(kClassImpl.getMemberScope$kotlin_reflection(), MemberBelonginess.INHERITED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection inheritedStaticMembers_delegate$lambda$0(KClassImpl kClassImpl) {
            return kClassImpl.getMembers(kClassImpl.getStaticScope$kotlin_reflection(), MemberBelonginess.INHERITED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C0641n0 kmClass_delegate$lambda$0(KClassImpl kClassImpl, Data data) {
            if (SystemPropertiesKt.getLoadMetadataDirectly()) {
                Metadata metadata = (Metadata) kClassImpl.getJClass().getAnnotation(Metadata.class);
                if (metadata != null) {
                    AbstractC35148d abstractC35148dM110129K = AbstractC34924m.m110129K(metadata);
                    C11835b c11835b = abstractC35148dM110129K instanceof C11835b ? (C11835b) abstractC35148dM110129K : null;
                    if (c11835b != null) {
                        return c11835b.m31782U();
                    }
                }
            } else {
                InterfaceC31117e descriptor = data.getDescriptor();
                if (descriptor instanceof C29024c) {
                    C29024c c29024c = (C29024c) descriptor;
                    AbstractC29032k abstractC29032k = c29024c.f117491G;
                    if (abstractC29032k instanceof C29028g) {
                        return BuiltinsKt.createFunctionKmClass(c29024c.f117492H);
                    }
                    throw new KotlinReflectionInternalError("Unsupported function type kind: " + abstractC29032k + " (" + descriptor + ')');
                }
                C21548h c21548h = descriptor instanceof C21548h ? (C21548h) descriptor : null;
                if (c21548h != null) {
                    return AbstractC34132o.m107866K(c21548h.f82629E, c21548h.f82636L.f65761b, false, 6);
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List nestedClasses_delegate$lambda$0(Data data, KClassImpl kClassImpl) {
            C0641n0 kmClass = data.getKmClass();
            if (kmClass == null) {
                Class<?>[] declaredClasses = kClassImpl.getJClass().getDeclaredClasses();
                AbstractC22676k.m65749i(declaredClasses, "getDeclaredClasses(...)");
                ArrayList arrayList = new ArrayList();
                for (Class<?> cls : declaredClasses) {
                    AbstractC22676k.m65747g(cls);
                    InterfaceC21461d interfaceC21461dM60666V = AbstractC21598x.m60666V(cls);
                    if (interfaceC21461dM60666V != null) {
                        arrayList.add(interfaceC21461dM60666V);
                    }
                }
                return arrayList;
            }
            String str = kmClass.f2241x;
            if (str == null) {
                AbstractC22676k.m65757q("name");
                throw null;
            }
            C35845c classId = ConvertFromMetadataKt.toClassId(str);
            ClassLoader classLoaderM122092d = AbstractC38109c.m122092d(kClassImpl.getJClass());
            ArrayList arrayList2 = kmClass.f2231I;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Class clsLoadClass$default = UtilKt.loadClass$default(classLoaderM122092d, classId.m113775d(C35850h.m113814e((String) it.next())), 0, 2, null);
                InterfaceC21461d interfaceC21461dM60666V2 = clsLoadClass$default != null ? AbstractC21598x.m60666V(clsLoadClass$default) : null;
                if (interfaceC21461dM60666V2 != null) {
                    arrayList3.add(interfaceC21461dM60666V2);
                }
            }
            return arrayList3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:22:0x0053  */
        public static final Object objectInstance_delegate$lambda$0(Data data, KClassImpl kClassImpl) throws IllegalAccessException, NoSuchFieldException {
            Field declaredField;
            C0641n0 kmClass = data.getKmClass();
            if (kmClass == null || !(AbstractC0645p.m1631a(kmClass) == EnumC0647q.OBJECT || AbstractC0645p.m1631a(kmClass) == EnumC0647q.COMPANION_OBJECT)) {
                return null;
            }
            if (AbstractC0645p.m1631a(kmClass) == EnumC0647q.COMPANION_OBJECT) {
                LinkedHashSet linkedHashSet = AbstractC27732d.f111783a;
                String str = kmClass.f2241x;
                if (str == null) {
                    AbstractC22676k.m65757q("name");
                    throw null;
                }
                if (AbstractC25265s.m74155w0(linkedHashSet, ConvertFromMetadataKt.toClassId(str).m113776e())) {
                    declaredField = kClassImpl.getJClass().getDeclaredField("INSTANCE");
                } else {
                    Class<?> enclosingClass = kClassImpl.getJClass().getEnclosingClass();
                    String str2 = kmClass.f2241x;
                    if (str2 == null) {
                        AbstractC22676k.m65757q("name");
                        throw null;
                    }
                    declaredField = enclosingClass.getDeclaredField(ConvertFromMetadataKt.toNonLocalSimpleName(str2));
                }
            } else {
                declaredField = kClassImpl.getJClass().getDeclaredField("INSTANCE");
            }
            Object obj = declaredField.get(null);
            AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl");
            return obj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String qualifiedName_delegate$lambda$0(KClassImpl kClassImpl) {
            if (kClassImpl.getJClass().isAnonymousClass()) {
                return null;
            }
            C35845c classId = kClassImpl.getClassId();
            if (classId.f152611c) {
                return null;
            }
            return classId.m113773a().f152613a.f152616a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List sealedSubclasses_delegate$lambda$0(KClassImpl kClassImpl, Data data) throws IllegalAccessException, InvocationTargetException {
            Class[] clsArr;
            ClassLoader classLoaderM122092d = AbstractC38109c.m122092d(kClassImpl.getJClass());
            C0641n0 kmClass = data.getKmClass();
            if (kmClass != null) {
                ArrayList arrayList = kmClass.f2234L;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    InterfaceC21461d interfaceC21461dLoadKClass = ConvertFromMetadataKt.loadKClass(classLoaderM122092d, (String) it.next());
                    if (interfaceC21461dLoadKClass != null) {
                        arrayList2.add(interfaceC21461dLoadKClass);
                    }
                }
                return arrayList2;
            }
            if (AbstractC22676k.m65745e(AbstractC36220b.m115311s(kClassImpl.getJClass()), Boolean.TRUE)) {
                Class<T> clazz = kClassImpl.getJClass();
                AbstractC22676k.m65750j(clazz, "clazz");
                Method method = (Method) AbstractC36220b.m115309q().f177225y;
                ArrayList arrayList3 = null;
                if (method == null) {
                    clsArr = null;
                } else {
                    Object objInvoke = method.invoke(clazz, null);
                    AbstractC22676k.m65748h(objInvoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
                    clsArr = (Class[]) objInvoke;
                }
                if (clsArr != null) {
                    arrayList3 = new ArrayList(clsArr.length);
                    for (Class cls : clsArr) {
                        arrayList3.add(AbstractC21598x.m60666V(cls));
                    }
                }
                if (arrayList3 != null) {
                    return arrayList3;
                }
            }
            return C25271y.f99162w;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String simpleName_delegate$lambda$0(KClassImpl kClassImpl, Data data) {
            if (kClassImpl.getJClass().isAnonymousClass()) {
                return null;
            }
            C35845c classId = kClassImpl.getClassId();
            if (classId.f152611c) {
                return data.calculateLocalClassName(kClassImpl.getJClass());
            }
            String strM113817b = classId.m113777f().m113817b();
            AbstractC22676k.m65749i(strM113817b, "asString(...)");
            return strM113817b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List supertypes_delegate$lambda$0(final KClassImpl kClassImpl, Data data) {
            String qualifiedName;
            String str;
            final C35845c classId;
            if (AbstractC22676k.m65745e(kClassImpl.getJClass(), Object.class)) {
                return C25271y.f99162w;
            }
            if (SystemPropertiesKt.getUseK1Implementation()) {
                return data.computeLegacySupertypes();
            }
            ArrayList arrayList = new ArrayList();
            C0641n0 kmClass = data.getKmClass();
            ArrayList<C0606b1> arrayList2 = kmClass != null ? kmClass.f2243z : null;
            if (arrayList2 != null) {
                for (C0606b1 c0606b1 : arrayList2) {
                    AbstractC0650r0 abstractC0650r0M1615a = c0606b1.m1615a();
                    C0644o0 c0644o0 = abstractC0650r0M1615a instanceof C0644o0 ? (C0644o0) abstractC0650r0M1615a : null;
                    if (c0644o0 == null || (str = c0644o0.f2249a) == null || (classId = ConvertFromMetadataKt.toClassId(str)) == null) {
                        throw new KotlinReflectionInternalError("Supertype of " + kClassImpl + " not a class: " + c0606b1.m1615a());
                    }
                    final Class clsLoadClass$default = UtilKt.loadClass$default(AbstractC38109c.m122092d(kClassImpl.getJClass()), classId, 0, 2, null);
                    if (clsLoadClass$default == null) {
                        throw new KotlinReflectionInternalError("Unsupported superclass of " + kClassImpl + ": " + classId);
                    }
                    arrayList.add(ConvertFromMetadataKt.toKType(c0606b1, AbstractC38109c.m122092d(kClassImpl.getJClass()), data.getTypeParameterTable(), new InterfaceC4339a(kClassImpl, clsLoadClass$default, classId) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$21
                        private final KClassImpl arg$0;
                        private final Class arg$1;
                        private final C35845c arg$2;

                        {
                            this.arg$0 = kClassImpl;
                            this.arg$1 = clsLoadClass$default;
                            this.arg$2 = classId;
                        }

                        @Override // c93.InterfaceC4339a
                        public Object invoke() {
                            return KClassImpl.Data.supertypes_delegate$lambda$0$0$0(this.arg$0, this.arg$1, this.arg$2);
                        }
                    }));
                }
                if (kClassImpl.getJClass().isArray()) {
                    arrayList.add(StandardKTypes.INSTANCE.getCLONEABLE());
                }
                if (Serializable.class.isAssignableFrom(kClassImpl.getJClass())) {
                    StandardKTypes standardKTypes = StandardKTypes.INSTANCE;
                    if (!arrayList.contains(standardKTypes.getSERIALIZABLE()) && (qualifiedName = data.getQualifiedName()) != null && AbstractC39421y.m125930O(qualifiedName, "kotlin.", false)) {
                        arrayList.add(standardKTypes.getSERIALIZABLE());
                    }
                }
            } else {
                Type genericSuperclass = kClassImpl.getJClass().getGenericSuperclass();
                C25272z c25272z = C25272z.f99163w;
                if (genericSuperclass != null) {
                    Type type = !genericSuperclass.equals(Object.class) ? genericSuperclass : null;
                    if (type != null) {
                        arrayList.add(ConvertFromJavaKt.toKType$default(type, c25272z, TypeNullability.NOT_NULL, false, 4, null));
                    }
                }
                Type[] genericInterfaces = kClassImpl.getJClass().getGenericInterfaces();
                AbstractC22676k.m65749i(genericInterfaces, "getGenericInterfaces(...)");
                for (Type type2 : genericInterfaces) {
                    AbstractC22676k.m65747g(type2);
                    arrayList.add(ConvertFromJavaKt.toKType$default(type2, c25272z, TypeNullability.NOT_NULL, false, 4, null));
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.add(StandardKTypes.INSTANCE.getANY());
            } else {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    InterfaceC21463e classifier = ((InterfaceC21456a0) it.next()).getClassifier();
                    KClassImpl kClassImpl2 = classifier instanceof KClassImpl ? (KClassImpl) classifier : null;
                    if (kClassImpl2 == null || (kClassImpl2.getClassKind$kotlin_reflection() != EnumC0647q.INTERFACE && kClassImpl2.getClassKind$kotlin_reflection() != EnumC0647q.ANNOTATION_CLASS)) {
                    }
                }
                arrayList.add(StandardKTypes.INSTANCE.getANY());
            }
            return AbstractC34756j.m109752b(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Type supertypes_delegate$lambda$0$0$0(KClassImpl kClassImpl, Class cls, C35845c c35845c) {
            if (AbstractC22676k.m65745e(kClassImpl.getJClass().getSuperclass(), cls)) {
                Type genericSuperclass = kClassImpl.getJClass().getGenericSuperclass();
                AbstractC22676k.m65747g(genericSuperclass);
                return genericSuperclass;
            }
            Class<?>[] interfaces = kClassImpl.getJClass().getInterfaces();
            AbstractC22676k.m65749i(interfaces, "getInterfaces(...)");
            int iM74085z0 = AbstractC25260n.m74085z0(interfaces, cls);
            if (iM74085z0 >= 0) {
                Type type = kClassImpl.getJClass().getGenericInterfaces()[iM74085z0];
                AbstractC22676k.m65747g(type);
                return type;
            }
            throw new KotlinReflectionInternalError("No superclass of " + kClassImpl + " in Java reflection for " + c35845c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:14:0x003d  */
        public static final TypeParameterTable typeParameterTable_delegate$lambda$0(Data data, KClassImpl kClassImpl) {
            InterfaceC21461d interfaceC21461dM60666V;
            InterfaceC23462h data2;
            Data data3;
            if (data.getKmClass() == null) {
                return TypeParameterTable.EMPTY;
            }
            TypeParameterTable.Companion companion = TypeParameterTable.INSTANCE;
            C0641n0 kmClass = data.getKmClass();
            AbstractC22676k.m65747g(kmClass);
            ArrayList arrayList = kmClass.f2242y;
            Class<?> enclosingClass = kClassImpl.getJClass().getEnclosingClass();
            TypeParameterTable typeParameterTable = null;
            if (enclosingClass != null) {
                C0641n0 kmClass2 = data.getKmClass();
                AbstractC22676k.m65747g(kmClass2);
                if (!AbstractC0645p.f2254e.m16043W(kmClass2, AbstractC0645p.f2250a[10])) {
                    enclosingClass = null;
                }
                if (enclosingClass != null) {
                    interfaceC21461dM60666V = AbstractC21598x.m60666V(enclosingClass);
                } else {
                    interfaceC21461dM60666V = null;
                }
            } else {
                interfaceC21461dM60666V = null;
            }
            KClassImpl kClassImpl2 = interfaceC21461dM60666V instanceof KClassImpl ? (KClassImpl) interfaceC21461dM60666V : null;
            if (kClassImpl2 != null && (data2 = kClassImpl2.getData()) != null && (data3 = (Data) data2.getValue()) != null) {
                typeParameterTable = data3.getTypeParameterTable();
            }
            return companion.create(arrayList, typeParameterTable, kClassImpl, AbstractC38109c.m122092d(kClassImpl.getJClass()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List typeParameters_delegate$lambda$0(Data data, KClassImpl kClassImpl) {
            if (!SystemPropertiesKt.getUseK1Implementation()) {
                if (data.getKmClass() != null) {
                    return data.getTypeParameterTable().getOwnTypeParameters();
                }
                TypeVariable<Class<T>>[] typeParameters = kClassImpl.getJClass().getTypeParameters();
                AbstractC22676k.m65749i(typeParameters, "getTypeParameters(...)");
                return ConvertFromJavaKt.toKTypeParameters(typeParameters);
            }
            List listMo60497j = data.getDescriptor().mo60497j();
            AbstractC22676k.m65749i(listMo60497j, "getDeclaredTypeParameters(...)");
            List<InterfaceC31165x0> list = listMo60497j;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            for (InterfaceC31165x0 interfaceC31165x0 : list) {
                AbstractC22676k.m65747g(interfaceC31165x0);
                arrayList.add(new KTypeParameterImpl(kClassImpl, interfaceC31165x0));
            }
            return arrayList;
        }

        public final Collection<DescriptorKCallable<?>> getAllMembers() {
            T value = this.allMembers.getValue(this, $$delegatedProperties[17]);
            AbstractC22676k.m65749i(value, "getValue(...)");
            return (Collection) value;
        }

        public final Collection<DescriptorKCallable<?>> getAllNonStaticMembers() {
            T value = this.allNonStaticMembers.getValue(this, $$delegatedProperties[14]);
            AbstractC22676k.m65749i(value, "getValue(...)");
            return (Collection) value;
        }

        public final Collection<DescriptorKCallable<?>> getAllStaticMembers() {
            T value = this.allStaticMembers.getValue(this, $$delegatedProperties[15]);
            AbstractC22676k.m65749i(value, "getValue(...)");
            return (Collection) value;
        }

        public final List<Annotation> getAnnotations() {
            T value = this.annotations.getValue(this, $$delegatedProperties[1]);
            AbstractC22676k.m65749i(value, "getValue(...)");
            return (List) value;
        }

        public final Collection<InterfaceC21467g> getConstructors() {
            T value = this.constructors.getValue(this, $$delegatedProperties[4]);
            AbstractC22676k.m65749i(value, "getValue(...)");
            return (Collection) value;
        }

        public final Collection<DescriptorKCallable<?>> getDeclaredMembers() {
            T value = this.declaredMembers.getValue(this, $$delegatedProperties[16]);
            AbstractC22676k.m65749i(value, "getValue(...)");
            return (Collection) value;
        }

        public final Collection<DescriptorKCallable<?>> getDeclaredNonStaticMembers() {
            T value = this.declaredNonStaticMembers.getValue(this, $$delegatedProperties[10]);
            AbstractC22676k.m65749i(value, "getValue(...)");
            return (Collection) value;
        }

        public final InterfaceC31117e getDescriptor() {
            T value = this.descriptor.getValue(this, $$delegatedProperties[0]);
            AbstractC22676k.m65749i(value, "getValue(...)");
            return (InterfaceC31117e) value;
        }

        public final C0641n0 getKmClass() {
            return (C0641n0) this.kmClass.getValue();
        }

        public final Collection<InterfaceC21461d> getNestedClasses() {
            T value = this.nestedClasses.getValue(this, $$delegatedProperties[5]);
            AbstractC22676k.m65749i(value, "getValue(...)");
            return (Collection) value;
        }

        public final T getObjectInstance() {
            return (T) this.objectInstance.getValue();
        }

        public final String getQualifiedName() {
            return (String) this.qualifiedName.getValue(this, $$delegatedProperties[3]);
        }

        public final List<InterfaceC21461d> getSealedSubclasses() {
            T value = this.sealedSubclasses.getValue(this, $$delegatedProperties[9]);
            AbstractC22676k.m65749i(value, "getValue(...)");
            return (List) value;
        }

        public final String getSimpleName() {
            return (String) this.simpleName.getValue(this, $$delegatedProperties[2]);
        }

        public final List<InterfaceC21456a0> getSupertypes() {
            T value = this.supertypes.getValue(this, $$delegatedProperties[8]);
            AbstractC22676k.m65749i(value, "getValue(...)");
            return (List) value;
        }

        public final List<InterfaceC21458b0> getTypeParameters() {
            T value = this.typeParameters.getValue(this, $$delegatedProperties[6]);
            AbstractC22676k.m65749i(value, "getValue(...)");
            return (List) value;
        }
    }

    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;", "", "<init>", "(Ljava/lang/String;I)V", "Lr93/c;", "member", "", HttpHeaders.ACCEPT, "(Lr93/c;)Z", "DECLARED", "INHERITED", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum MemberBelonginess {
        DECLARED,
        INHERITED;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public final boolean accept(InterfaceC31111c member) {
            AbstractC22676k.m65750j(member, "member");
            return AbstractC30007c.m91831a(member.getKind()) == (this == DECLARED);
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC29038a.values().length];
            try {
                C21565a c21565a = EnumC29038a.f117518x;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                C21565a c21565a2 = EnumC29038a.f117518x;
                iArr[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                C21565a c21565a3 = EnumC29038a.f117518x;
                iArr[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                C21565a c21565a4 = EnumC29038a.f117518x;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                C21565a c21565a5 = EnumC29038a.f117518x;
                iArr[0] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                C21565a c21565a6 = EnumC29038a.f117518x;
                iArr[1] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        LinkedHashSet linkedHashSet = AbstractC26487a.f105199a;
        HashSet hashSet = new HashSet();
        Iterator<T> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            hashSet.add(((C35845c) it.next()).m113773a().f152613a.toString());
        }
        SPECIAL_JVM_ANNOTATION_NAMES = hashSet;
    }

    public KClassImpl(Class<T> jClass) {
        AbstractC22676k.m65750j(jClass, "jClass");
        this.jClass = jClass;
        this.data = AbstractC30060g.m92087G(EnumC23463i.f92934x, new InterfaceC4339a(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$$Lambda$0
            private final KClassImpl arg$0;

            {
                this.arg$0 = this;
            }

            @Override // c93.InterfaceC4339a
            public Object invoke() {
                return KClassImpl.data$lambda$0(this.arg$0);
            }
        });
    }

    private final InterfaceC31117e createSyntheticClass(C35845c classId, C36972e moduleData) {
        C34696q c34696q = new C34696q(moduleData.f158232a.f65736b, classId.f152609a);
        C35850h c35850hM113777f = classId.m113777f();
        EnumC31106a0 enumC31106a0 = EnumC31106a0.f128310x;
        EnumC31120f enumC31120f = EnumC31120f.f128328w;
        C17119i c17119i = moduleData.f158232a;
        List listM118958J = AbstractC37056f.m118958J(c17119i.f65736b.mo78661c().m83823k("Any").mo60594i());
        final C22342k c22342k = c17119i.f65735a;
        final C34686l c34686l = new C34686l(c34696q, c35850hM113777f, enumC31106a0, enumC31120f, listM118958J, c22342k);
        c34686l.m109576X(new AbstractC22706i(c34686l, c22342k) { // from class: kotlin.reflect.jvm.internal.KClassImpl$createSyntheticClass$1$1
            @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22706i
            public List<InterfaceC31162w> computeDeclaredFunctions() {
                return C25271y.f99162w;
            }
        }, C25235a0.f99113w, null);
        return c34686l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC31117e createSyntheticClassOrFail(C35845c classId, C36972e moduleData) {
        if (getJClass().isSynthetic()) {
            return createSyntheticClass(classId, moduleData);
        }
        C36969b c36969bM113810l = AbstractC35849g.m113810l(getJClass());
        EnumC29038a enumC29038a = c36969bM113810l != null ? (EnumC29038a) c36969bM113810l.f158228b.f117525d : null;
        switch (enumC29038a == null ? -1 : WhenMappings.$EnumSwitchMapping$0[enumC29038a.ordinal()]) {
            case -1:
            case 6:
                throw new KotlinReflectionInternalError("Unresolved class: " + getJClass() + " (kind = " + enumC29038a + ')');
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
            case 3:
            case 4:
                return createSyntheticClass(classId, moduleData);
            case 5:
                throw new KotlinReflectionInternalError("Unknown class: " + getJClass() + " (kind = " + enumC29038a + ')');
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Data data$lambda$0(KClassImpl kClassImpl) {
        return new Data();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C35845c getClassId() {
        return RuntimeTypeMapper.INSTANCE.mapJvmClassToKotlinClassId(getJClass());
    }

    private final C0641n0 getKmClass() {
        return ((Data) this.data.getValue()).getKmClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC31145n0 getLocalProperty$lambda$1$0$0(C17135x deserializeToDescriptor, C30146k0 proto) {
        AbstractC22676k.m65750j(deserializeToDescriptor, "$this$deserializeToDescriptor");
        AbstractC22676k.m65750j(proto, "proto");
        return deserializeToDescriptor.m48379g(proto, true);
    }

    private final EnumC0639m1 getModality() {
        EnumC0639m1 enumC0639m1;
        C0641n0 kmClass = getKmClass();
        if (kmClass != null && (enumC0639m1 = (EnumC0639m1) AbstractC0645p.f2251b.m133474v(kmClass, AbstractC0645p.f2250a[7])) != null) {
            return enumC0639m1;
        }
        if (getJClass().isAnnotation() || getJClass().isEnum()) {
            return EnumC0639m1.FINAL;
        }
        if (AbstractC22676k.m65745e(AbstractC36220b.m115311s(getJClass()), Boolean.TRUE)) {
            return EnumC0639m1.SEALED;
        }
        if (Modifier.isAbstract(getJClass().getModifiers())) {
            return EnumC0639m1.ABSTRACT;
        }
        return !Modifier.isFinal(getJClass().getModifiers()) ? EnumC0639m1.OPEN : EnumC0639m1.FINAL;
    }

    @Override // j93.InterfaceC21461d
    public boolean equals(Object other) {
        return (other instanceof KClassImpl) && AbstractC21598x.m60664T(this).equals(AbstractC21598x.m60664T((InterfaceC21461d) other));
    }

    @Override // j93.InterfaceC21457b
    public List<Annotation> getAnnotations() {
        return ((Data) this.data.getValue()).getAnnotations();
    }

    public final EnumC0647q getClassKind$kotlin_reflection() {
        EnumC0647q enumC0647qM1631a;
        C0641n0 kmClass = getKmClass();
        if (kmClass != null && (enumC0647qM1631a = AbstractC0645p.m1631a(kmClass)) != null) {
            return enumC0647qM1631a;
        }
        if (getJClass().isAnnotation()) {
            return EnumC0647q.ANNOTATION_CLASS;
        }
        if (getJClass().isInterface()) {
            return EnumC0647q.INTERFACE;
        }
        if (getJClass().isEnum()) {
            return EnumC0647q.ENUM_CLASS;
        }
        return getJClass().getSuperclass().isEnum() ? EnumC0647q.ENUM_ENTRY : EnumC0647q.CLASS;
    }

    @Override // p715kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public Collection<InterfaceC31132j> getConstructorDescriptors() {
        InterfaceC31117e descriptor = getDescriptor();
        if (descriptor.getKind() == EnumC31120f.f128329x || descriptor.getKind() == EnumC31120f.f128326F) {
            return C25271y.f99162w;
        }
        Collection<InterfaceC31132j> constructors = descriptor.getConstructors();
        AbstractC22676k.m65749i(constructors, "getConstructors(...)");
        return constructors;
    }

    @Override // j93.InterfaceC21461d
    public Collection<InterfaceC21467g> getConstructors() {
        return ((Data) this.data.getValue()).getConstructors();
    }

    public final InterfaceC23462h getData() {
        return this.data;
    }

    public final InterfaceC31117e getDescriptor() {
        return ((Data) this.data.getValue()).getDescriptor();
    }

    @Override // p715kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public Collection<InterfaceC31162w> getFunctions(C35850h name) {
        AbstractC22676k.m65750j(name, "name");
        InterfaceC22712o memberScope$kotlin_reflection = getMemberScope$kotlin_reflection();
        EnumC40212c enumC40212c = EnumC40212c.f173638x;
        return AbstractC25265s.m74129g1(memberScope$kotlin_reflection.getContributedFunctions(name, enumC40212c), getStaticScope$kotlin_reflection().getContributedFunctions(name, enumC40212c));
    }

    @Override // p715kotlin.reflect.jvm.internal.KDeclarationContainerImpl, p715kotlin.jvm.internal.InterfaceC22662d
    public Class<T> getJClass() {
        return this.jClass;
    }

    @Override // p715kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public InterfaceC31145n0 getLocalProperty(int index) {
        Class<?> declaringClass;
        if (getJClass().getSimpleName().equals("DefaultImpls") && (declaringClass = getJClass().getDeclaringClass()) != null && declaringClass.isInterface()) {
            InterfaceC21461d interfaceC21461dM60666V = AbstractC21598x.m60666V(declaringClass);
            AbstractC22676k.m65748h(interfaceC21461dM60666V, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
            return ((KClassImpl) interfaceC21461dM60666V).getLocalProperty(index);
        }
        InterfaceC31117e descriptor = getDescriptor();
        C21548h c21548h = descriptor instanceof C21548h ? (C21548h) descriptor : null;
        if (c21548h != null) {
            C30145k c30145k = c21548h.f82629E;
            C37010o classLocalVariable = AbstractC33686l.f140742h;
            AbstractC22676k.m65749i(classLocalVariable, "classLocalVariable");
            C30146k0 c30146k0 = (C30146k0) AbstractC21478l0.m60454y(c30145k, classLocalVariable, index);
            if (c30146k0 != null) {
                Class<T> jClass = getJClass();
                C17122k c17122k = c21548h.f82636L;
                return (InterfaceC31145n0) UtilKt.deserializeToDescriptor(jClass, c30146k0, c17122k.f65761b, c17122k.f65763d, c21548h.f82630F, new InterfaceC4351m() { // from class: kotlin.reflect.jvm.internal.KClassImpl$$Lambda$1
                    @Override // c93.InterfaceC4351m
                    public Object invoke(Object obj, Object obj2) {
                        return KClassImpl.getLocalProperty$lambda$1$0$0((C17135x) obj, (C30146k0) obj2);
                    }
                });
            }
        }
        return null;
    }

    public final InterfaceC22712o getMemberScope$kotlin_reflection() {
        return getDescriptor().mo60594i().mo64128u();
    }

    @Override // p715kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public Collection<InterfaceC21459c> getMembers() {
        return ((Data) this.data.getValue()).getAllMembers();
    }

    public Collection<InterfaceC21461d> getNestedClasses() {
        return ((Data) this.data.getValue()).getNestedClasses();
    }

    @Override // j93.InterfaceC21461d
    public T getObjectInstance() {
        return (T) ((Data) this.data.getValue()).getObjectInstance();
    }

    @Override // p715kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public Collection<InterfaceC31145n0> getProperties(C35850h name) {
        AbstractC22676k.m65750j(name, "name");
        InterfaceC22712o memberScope$kotlin_reflection = getMemberScope$kotlin_reflection();
        EnumC40212c enumC40212c = EnumC40212c.f173638x;
        return AbstractC25265s.m74129g1(memberScope$kotlin_reflection.getContributedVariables(name, enumC40212c), getStaticScope$kotlin_reflection().getContributedVariables(name, enumC40212c));
    }

    @Override // j93.InterfaceC21461d
    public String getQualifiedName() {
        return ((Data) this.data.getValue()).getQualifiedName();
    }

    public List<InterfaceC21461d> getSealedSubclasses() {
        return ((Data) this.data.getValue()).getSealedSubclasses();
    }

    @Override // j93.InterfaceC21461d
    public String getSimpleName() {
        return ((Data) this.data.getValue()).getSimpleName();
    }

    public final InterfaceC22712o getStaticScope$kotlin_reflection() {
        InterfaceC22712o interfaceC22712oMo60494V = getDescriptor().mo60494V();
        AbstractC22676k.m65749i(interfaceC22712oMo60494V, "getStaticScope(...)");
        return interfaceC22712oMo60494V;
    }

    @Override // j93.InterfaceC21461d
    public List<InterfaceC21456a0> getSupertypes() {
        return ((Data) this.data.getValue()).getSupertypes();
    }

    @Override // j93.InterfaceC21461d
    public List<InterfaceC21458b0> getTypeParameters() {
        return ((Data) this.data.getValue()).getTypeParameters();
    }

    public EnumC21466f0 getVisibility() {
        AbstractC31152r visibility = getDescriptor().getVisibility();
        AbstractC22676k.m65749i(visibility, "getVisibility(...)");
        return UtilKt.toKVisibility(visibility);
    }

    @Override // j93.InterfaceC21461d
    public int hashCode() {
        return AbstractC21598x.m60664T(this).hashCode();
    }

    @Override // j93.InterfaceC21461d
    public boolean isAbstract() {
        return getModality() == EnumC0639m1.ABSTRACT;
    }

    public boolean isCompanion() {
        C0641n0 kmClass = getKmClass();
        return (kmClass != null ? AbstractC0645p.m1631a(kmClass) : null) == EnumC0647q.COMPANION_OBJECT;
    }

    public boolean isData() {
        C0641n0 kmClass = getKmClass();
        if (kmClass != null) {
            InterfaceC21493z[] interfaceC21493zArr = AbstractC0645p.f2250a;
            if (AbstractC0645p.f2255f.m16043W(kmClass, AbstractC0645p.f2250a[11])) {
                return true;
            }
        }
        return false;
    }

    public boolean isFinal() {
        return getModality() == EnumC0639m1.FINAL;
    }

    public boolean isFun() {
        C0641n0 kmClass = getKmClass();
        if (kmClass != null) {
            InterfaceC21493z[] interfaceC21493zArr = AbstractC0645p.f2250a;
            if (AbstractC0645p.f2257h.m16043W(kmClass, AbstractC0645p.f2250a[15])) {
                return true;
            }
        }
        return false;
    }

    public final boolean isInline$kotlin_reflection() {
        C0641n0 kmClass = getKmClass();
        return (kmClass != null ? kmClass.f2235M : null) != null;
    }

    @Override // j93.InterfaceC21461d
    public boolean isInner() {
        C0641n0 kmClass = getKmClass();
        if (kmClass == null) {
            return (getJClass().getDeclaringClass() == null || Modifier.isStatic(getJClass().getModifiers())) ? false : true;
        }
        return AbstractC0645p.f2254e.m16043W(kmClass, AbstractC0645p.f2250a[10]);
    }

    @Override // j93.InterfaceC21461d
    public boolean isInstance(Object value) {
        Class<T> jClass = getJClass();
        List list = AbstractC38109c.f163211a;
        AbstractC22676k.m65750j(jClass, "<this>");
        Integer num = (Integer) AbstractC38109c.f163214d.get(jClass);
        if (num != null) {
            return AbstractC22681m0.m65775f(num.intValue(), value);
        }
        Class<T> jClass2 = getJClass();
        AbstractC22676k.m65750j(jClass2, "<this>");
        Class<T> jClass3 = (Class) AbstractC38109c.f163213c.get(jClass2);
        if (jClass3 == null) {
            jClass3 = getJClass();
        }
        return jClass3.isInstance(value);
    }

    public boolean isOpen() {
        return getModality() == EnumC0639m1.OPEN;
    }

    @Override // j93.InterfaceC21461d
    public boolean isSealed() {
        return getModality() == EnumC0639m1.SEALED;
    }

    @Override // j93.InterfaceC21461d
    public boolean isValue() {
        C0641n0 kmClass = getKmClass();
        if (kmClass != null) {
            InterfaceC21493z[] interfaceC21493zArr = AbstractC0645p.f2250a;
            if (AbstractC0645p.f2256g.m16043W(kmClass, AbstractC0645p.f2250a[14])) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("class ");
        C35845c classId = getClassId();
        C35847e c35847e = classId.f152609a;
        String strM73377j = c35847e.f152613a.m113793c() ? "" : AbstractC25012a.m73377j(new StringBuilder(), c35847e.f152613a.f152616a, '.');
        sb4.append(strM73377j + AbstractC39421y.m125927L(classId.f152610b.f152613a.f152616a, '.', '$'));
        return sb4.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    public final Collection<DescriptorKCallable<?>> getMembers(InterfaceC22712o scope, MemberBelonginess belonginess) {
        DescriptorKCallable descriptorKCallable;
        CreateKCallableVisitor createKCallableVisitor = new CreateKCallableVisitor(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$getMembers$visitor$1
            {
                super(this);
            }

            @Override // u93.AbstractC34694p, r93.InterfaceC31141m
            public DescriptorKCallable<?> visitConstructorDescriptor(InterfaceC31132j descriptor, C23454a0 data) {
                AbstractC22676k.m65750j(descriptor, "descriptor");
                AbstractC22676k.m65750j(data, "data");
                throw new IllegalStateException("No constructors should appear here: " + descriptor);
            }
        };
        Collection<InterfaceC31135k> collectionM34599t = AbstractC12350b.m34599t(scope, null, 3);
        ArrayList arrayList = new ArrayList();
        for (InterfaceC31135k interfaceC31135k : collectionM34599t) {
            if (interfaceC31135k instanceof InterfaceC31111c) {
                InterfaceC31111c interfaceC31111c = (InterfaceC31111c) interfaceC31135k;
                if (AbstractC22676k.m65745e(interfaceC31111c.getVisibility(), AbstractC31150q.f128356h) || !belonginess.accept(interfaceC31111c)) {
                    descriptorKCallable = null;
                } else {
                    descriptorKCallable = (DescriptorKCallable) interfaceC31135k.mo78659T(createKCallableVisitor, C23454a0.f92919a);
                }
            } else {
                descriptorKCallable = null;
            }
            if (descriptorKCallable != null) {
                arrayList.add(descriptorKCallable);
            }
        }
        return AbstractC25265s.m74093D1(arrayList);
    }
}
