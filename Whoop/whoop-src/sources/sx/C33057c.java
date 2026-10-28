package sx;

import androidx.room.AbstractC1772c1;
import com.squareup.moshi.JsonAdapter;
import j93.AbstractC21478l0;
import j93.C21462d0;
import j93.InterfaceC21456a0;
import j93.InterfaceC21458b0;
import j93.InterfaceC21461d;
import j93.InterfaceC21463e;
import j93.InterfaceC21467g;
import j93.InterfaceC21477l;
import j93.InterfaceC21484q;
import j93.InterfaceC21490w;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k93.AbstractC22306c;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import o73.C27648a;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import p249jc.AbstractC21598x;
import p441qx.C30722l0;
import p441qx.C30732q0;
import p441qx.C30740v;
import p441qx.InterfaceC30731q;
import p441qx.InterfaceC30735s;
import p471rx.AbstractC31885f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import p715kotlin.reflect.jvm.internal.DescriptorKCallable;
import p715kotlin.reflect.jvm.internal.KClassImpl;
import x30.AbstractC37926s0;

/* JADX INFO: renamed from: sx.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C33057c implements InterfaceC30735s {
    /* JADX WARN: Code duplicated, block: B:114:0x022c  */
    @Override // p441qx.InterfaceC30735s
    public final JsonAdapter create(Type type, Set annotations, C30722l0 c30722l0) {
        Object next;
        String name;
        Type typeM83558I;
        Class clsM60663S;
        Object next2;
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(annotations, "annotations");
        String str = null;
        if (annotations.isEmpty()) {
            Class clsM5407z = AbstractC1772c1.m5407z(type);
            AbstractC22676k.m65749i(clsM5407z, "getRawType(this)");
            if (!clsM5407z.isInterface() && !clsM5407z.isEnum() && clsM5407z.isAnnotationPresent(Metadata.class) && !AbstractC31885f.m99127e(clsM5407z)) {
                try {
                    JsonAdapter jsonAdapterM99125c = AbstractC31885f.m99125c(c30722l0, type, clsM5407z);
                    if (jsonAdapterM99125c != null) {
                        return jsonAdapterM99125c;
                    }
                } catch (RuntimeException e5) {
                    if (!(e5.getCause() instanceof ClassNotFoundException)) {
                        throw e5;
                    }
                }
                if (clsM5407z.isLocalClass()) {
                    throw new IllegalArgumentException("Cannot serialize local class or object expression ".concat(clsM5407z.getName()).toString());
                }
                InterfaceC21461d interfaceC21461dM60666V = AbstractC21598x.m60666V(clsM5407z);
                if (interfaceC21461dM60666V.isAbstract()) {
                    throw new IllegalArgumentException("Cannot serialize abstract class ".concat(clsM5407z.getName()).toString());
                }
                if (interfaceC21461dM60666V.isInner()) {
                    throw new IllegalArgumentException("Cannot serialize inner class ".concat(clsM5407z.getName()).toString());
                }
                if (interfaceC21461dM60666V.getObjectInstance() != null) {
                    throw new IllegalArgumentException("Cannot serialize object declaration ".concat(clsM5407z.getName()).toString());
                }
                if (interfaceC21461dM60666V.isSealed()) {
                    throw new IllegalArgumentException(("Cannot reflectively serialize sealed class " + clsM5407z.getName() + ". Please register an adapter.").toString());
                }
                InterfaceC21467g interfaceC21467gM64099a = AbstractC22306c.m64099a(interfaceC21461dM60666V);
                if (interfaceC21467gM64099a != null) {
                    List parameters = interfaceC21467gM64099a.getParameters();
                    int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(parameters, 10));
                    if (iM73988W < 16) {
                        iM73988W = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
                    for (Object obj : parameters) {
                        linkedHashMap.put(((InterfaceC21484q) obj).getName(), obj);
                    }
                    AbstractC37926s0.m121455G(interfaceC21467gM64099a);
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    Collection<DescriptorKCallable<?>> allNonStaticMembers = ((KClassImpl.Data) ((KClassImpl) interfaceC21461dM60666V).getData().getValue()).getAllNonStaticMembers();
                    ArrayList<InterfaceC21490w> arrayList = new ArrayList();
                    for (Object obj2 : allNonStaticMembers) {
                        DescriptorKCallable descriptorKCallable = (DescriptorKCallable) obj2;
                        if (descriptorKCallable.getDescriptor().mo78667B() == null && (descriptorKCallable instanceof InterfaceC21490w)) {
                            arrayList.add(obj2);
                        }
                    }
                    for (InterfaceC21490w interfaceC21490w : arrayList) {
                        InterfaceC21484q interfaceC21484q = (InterfaceC21484q) linkedHashMap.get(interfaceC21490w.getName());
                        AbstractC37926s0.m121455G(interfaceC21490w);
                        Iterator it = interfaceC21490w.getAnnotations().iterator();
                        do {
                            if (!it.hasNext()) {
                                next = str;
                                break;
                            }
                            next = it.next();
                        } while (!(((Annotation) next) instanceof InterfaceC30731q));
                        InterfaceC30731q interfaceC30731q = (InterfaceC30731q) next;
                        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(interfaceC21490w.getAnnotations());
                        if (interfaceC21484q != null) {
                            AbstractC25265s.m74141p0(arrayListM74097F1, interfaceC21484q.getAnnotations());
                            if (interfaceC30731q == null) {
                                Iterator it3 = interfaceC21484q.getAnnotations().iterator();
                                do {
                                    if (!it3.hasNext()) {
                                        next2 = str;
                                        break;
                                    }
                                    next2 = it3.next();
                                } while (!(((Annotation) next2) instanceof InterfaceC30731q));
                                interfaceC30731q = (InterfaceC30731q) next2;
                            }
                        }
                        Field fieldM83556G = C27648a.m83556G(interfaceC21490w);
                        if (Modifier.isTransient(fieldM83556G != null ? fieldM83556G.getModifiers() : 0)) {
                            if (interfaceC21484q != null && !interfaceC21484q.isOptional()) {
                                throw new IllegalArgumentException(("No default value for transient constructor " + interfaceC21484q).toString());
                            }
                        } else if (interfaceC30731q == null || !interfaceC30731q.ignore()) {
                            if (interfaceC21484q != null && !AbstractC22676k.m65745e(interfaceC21484q.getType(), interfaceC21490w.getReturnType())) {
                                throw new IllegalArgumentException(("'" + interfaceC21490w.getName() + "' has a constructor parameter of type " + interfaceC21484q.getType() + " but a property of type " + interfaceC21490w.getReturnType() + '.').toString());
                            }
                            if ((interfaceC21490w instanceof InterfaceC21477l) || interfaceC21484q != null) {
                                if (interfaceC30731q == null || (name = interfaceC30731q.name()) == null) {
                                    name = interfaceC21490w.getName();
                                } else {
                                    if (name.equals(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR)) {
                                        name = str;
                                    }
                                    if (name == null) {
                                        name = interfaceC21490w.getName();
                                    }
                                }
                                String str2 = name;
                                InterfaceC21463e classifier = interfaceC21490w.getReturnType().getClassifier();
                                if (classifier instanceof InterfaceC21461d) {
                                    InterfaceC21461d interfaceC21461d = (InterfaceC21461d) classifier;
                                    if (interfaceC21461d.isValue()) {
                                        clsM60663S = AbstractC21598x.m60663S(interfaceC21461d);
                                        if (!interfaceC21490w.getReturnType().getArguments().isEmpty()) {
                                            typeM83558I = clsM60663S;
                                            List arguments = interfaceC21490w.getReturnType().getArguments();
                                            ArrayList arrayList2 = new ArrayList();
                                            Iterator it4 = arguments.iterator();
                                            while (it4.hasNext()) {
                                                InterfaceC21456a0 interfaceC21456a0 = ((C21462d0) it4.next()).f82425b;
                                                Type typeM60396B = interfaceC21456a0 != null ? AbstractC21478l0.m60396B(interfaceC21456a0) : null;
                                                if (typeM60396B != null) {
                                                    arrayList2.add(typeM60396B);
                                                }
                                            }
                                            Type[] typeArr = (Type[]) arrayList2.toArray(new Type[0]);
                                            typeM83558I = AbstractC1772c1.m5369F(clsM60663S, (Type[]) Arrays.copyOf(typeArr, typeArr.length));
                                        }
                                    } else {
                                        typeM83558I = C27648a.m83558I(interfaceC21490w.getReturnType());
                                    }
                                } else {
                                    if (!(classifier instanceof InterfaceC21458b0)) {
                                        throw new IllegalStateException("Not possible!");
                                    }
                                    typeM83558I = C27648a.m83558I(interfaceC21490w.getReturnType());
                                }
                                typeM83558I = clsM60663S;
                                linkedHashMap2.put(interfaceC21490w.getName(), new C33055a(str2, c30722l0.m94400c(AbstractC31885f.m99131i(type, clsM5407z, typeM83558I, new LinkedHashSet()), AbstractC31885f.m99128f((Annotation[]) arrayListM74097F1.toArray(new Annotation[0])), interfaceC21490w.getName()), interfaceC21490w, interfaceC21484q, interfaceC21484q != null ? interfaceC21484q.getIndex() : -1));
                                str = null;
                            }
                        } else if (interfaceC21484q != null && !interfaceC21484q.isOptional()) {
                            throw new IllegalArgumentException(("No default value for ignored constructor " + interfaceC21484q).toString());
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (InterfaceC21484q interfaceC21484q2 : interfaceC21467gM64099a.getParameters()) {
                        C33055a c33055a = (C33055a) AbstractC22681m0.m65772c(linkedHashMap2).remove(interfaceC21484q2.getName());
                        if (c33055a == null && !interfaceC21484q2.isOptional()) {
                            throw new IllegalArgumentException(("No property for required constructor " + interfaceC21484q2).toString());
                        }
                        arrayList3.add(c33055a);
                    }
                    int size = arrayList3.size();
                    Iterator it5 = linkedHashMap2.entrySet().iterator();
                    int i13 = size;
                    while (it5.hasNext()) {
                        C33055a c33055a2 = (C33055a) ((Map.Entry) it5.next()).getValue();
                        String jsonName = c33055a2.f137844a;
                        JsonAdapter jsonAdapter = c33055a2.f137845b;
                        InterfaceC21490w interfaceC21490w2 = c33055a2.f137846c;
                        InterfaceC21484q interfaceC21484q3 = c33055a2.f137847d;
                        AbstractC22676k.m65750j(jsonName, "jsonName");
                        arrayList3.add(new C33055a(jsonName, jsonAdapter, interfaceC21490w2, interfaceC21484q3, i13));
                        i13++;
                    }
                    ArrayList arrayListM74092D0 = AbstractC25265s.m74092D0(arrayList3);
                    ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(arrayListM74092D0, 10));
                    Iterator it6 = arrayListM74092D0.iterator();
                    while (it6.hasNext()) {
                        arrayList4.add(((C33055a) it6.next()).f137844a);
                    }
                    String[] strArr = (String[]) arrayList4.toArray(new String[0]);
                    return new C30732q0(interfaceC21467gM64099a, arrayList3, arrayListM74092D0, C30740v.m94403a((String[]) Arrays.copyOf(strArr, strArr.length))).nullSafe();
                }
            }
        }
        return null;
    }
}
