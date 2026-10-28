.class public final Lkotlin/reflect/jvm/internal/KClassImpl;
.super Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;
.source "SourceFile"

# interfaces
.implements Lj93/d;
.implements Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;
.implements Lob3/l;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/reflect/jvm/internal/KClassImpl$Companion;,
        Lkotlin/reflect/jvm/internal/KClassImpl$Data;,
        Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;,
        Lkotlin/reflect/jvm/internal/KClassImpl$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;",
        "Lj93/d;",
        "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;",
        "Lob3/l;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00da\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u0000 \u007f*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u0008\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u00052\u00020\u0006:\u0005\u0080\u0001\u0081\u0001\u007fB\u0015\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001d\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\r2\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0010J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00182\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00182\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016\u00a2\u0006\u0004\u0008 \u0010!J)\u0010\'\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030&0\r2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0002\u00a2\u0006\u0004\u0008\'\u0010(J\u001f\u0010.\u001a\u00020-2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0002\u00a2\u0006\u0004\u0008.\u0010/J\u001f\u00100\u001a\u00020-2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0002\u00a2\u0006\u0004\u00080\u0010/R \u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00101\u001a\u0004\u00082\u00103R\'\u00106\u001a\u0012\u0012\u000e\u0012\u000c05R\u0008\u0012\u0004\u0012\u00028\u00000\u0000048\u0006\u00a2\u0006\u000c\n\u0004\u00086\u00107\u001a\u0004\u00088\u00109R\u001a\u0010>\u001a\u0008\u0012\u0004\u0012\u00020;0:8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008<\u0010=R\u001e\u0010A\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030?0\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010@R\u001a\u0010D\u001a\u0008\u0012\u0004\u0012\u00020B0\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008C\u0010@R\u0016\u0010F\u001a\u0004\u0018\u00010\u001f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008E\u0010!R\u0016\u0010H\u001a\u0004\u0018\u00010\u001f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008G\u0010!R \u0010K\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000I0\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008J\u0010@R\u001e\u0010M\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00040\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008L\u0010@R\u0016\u0010P\u001a\u0004\u0018\u00018\u00008VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008N\u0010OR\u001a\u0010S\u001a\u0008\u0012\u0004\u0012\u00020Q0:8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008R\u0010=R\u001a\u0010V\u001a\u0008\u0012\u0004\u0012\u00020T0:8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008U\u0010=R\"\u0010X\u001a\u0010\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00028\u00000\u00040:8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008W\u0010=R\u0016\u0010\\\u001a\u0004\u0018\u00010Y8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008Z\u0010[R\u0014\u0010]\u001a\u00020\u00188VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008]\u0010^R\u0014\u0010_\u001a\u00020\u00188VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008_\u0010^R\u0014\u0010`\u001a\u00020\u00188VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008`\u0010^R\u0014\u0010a\u001a\u00020\u00188VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008a\u0010^R\u0014\u0010b\u001a\u00020\u00188VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008b\u0010^R\u0014\u0010c\u001a\u00020\u00188VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008c\u0010^R\u0014\u0010d\u001a\u00020\u00188VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008d\u0010^R\u0014\u0010e\u001a\u00020\u00188VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008e\u0010^R\u0014\u0010f\u001a\u00020\u00188VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008f\u0010^R\u0014\u0010h\u001a\u00020\u00188@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008g\u0010^R\u0011\u0010k\u001a\u00020-8F\u00a2\u0006\u0006\u001a\u0004\u0008i\u0010jR\u0016\u0010o\u001a\u0004\u0018\u00010l8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008m\u0010nR\u0014\u0010*\u001a\u00020)8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008p\u0010qR\u0014\u0010u\u001a\u00020r8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008s\u0010tR\u0014\u0010x\u001a\u00020\"8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008v\u0010wR\u0014\u0010z\u001a\u00020\"8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008y\u0010wR\u0014\u0010~\u001a\u00020{8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008|\u0010}\u00a8\u0006\u0082\u0001"
    }
    d2 = {
        "Lkotlin/reflect/jvm/internal/KClassImpl;",
        "",
        "T",
        "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;",
        "Lj93/d;",
        "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;",
        "Lob3/l;",
        "Ljava/lang/Class;",
        "jClass",
        "<init>",
        "(Ljava/lang/Class;)V",
        "Lva3/h;",
        "name",
        "",
        "Lr93/n0;",
        "getProperties",
        "(Lva3/h;)Ljava/util/Collection;",
        "Lr93/w;",
        "getFunctions",
        "",
        "index",
        "getLocalProperty",
        "(I)Lr93/n0;",
        "value",
        "",
        "isInstance",
        "(Ljava/lang/Object;)Z",
        "other",
        "equals",
        "hashCode",
        "()I",
        "",
        "toString",
        "()Ljava/lang/String;",
        "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;",
        "scope",
        "Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;",
        "belonginess",
        "Lkotlin/reflect/jvm/internal/DescriptorKCallable;",
        "getMembers",
        "(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;)Ljava/util/Collection;",
        "Lva3/c;",
        "classId",
        "Lw93/e;",
        "moduleData",
        "Lr93/e;",
        "createSyntheticClassOrFail",
        "(Lva3/c;Lw93/e;)Lr93/e;",
        "createSyntheticClass",
        "Ljava/lang/Class;",
        "getJClass",
        "()Ljava/lang/Class;",
        "Ll83/h;",
        "Lkotlin/reflect/jvm/internal/KClassImpl$Data;",
        "data",
        "Ll83/h;",
        "getData",
        "()Ll83/h;",
        "",
        "",
        "getAnnotations",
        "()Ljava/util/List;",
        "annotations",
        "Lj93/c;",
        "()Ljava/util/Collection;",
        "members",
        "Lr93/j;",
        "getConstructorDescriptors",
        "constructorDescriptors",
        "getSimpleName",
        "simpleName",
        "getQualifiedName",
        "qualifiedName",
        "Lj93/g;",
        "getConstructors",
        "constructors",
        "getNestedClasses",
        "nestedClasses",
        "getObjectInstance",
        "()Ljava/lang/Object;",
        "objectInstance",
        "Lj93/b0;",
        "getTypeParameters",
        "typeParameters",
        "Lj93/a0;",
        "getSupertypes",
        "supertypes",
        "getSealedSubclasses",
        "sealedSubclasses",
        "Lj93/f0;",
        "getVisibility",
        "()Lj93/f0;",
        "visibility",
        "isFinal",
        "()Z",
        "isOpen",
        "isAbstract",
        "isSealed",
        "isData",
        "isInner",
        "isCompanion",
        "isFun",
        "isValue",
        "isInline$kotlin_reflection",
        "isInline",
        "getDescriptor",
        "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;",
        "descriptor",
        "Laa3/n0;",
        "getKmClass",
        "()Lkotlin/metadata/KmClass;",
        "kmClass",
        "getClassId",
        "()Lorg/jetbrains/kotlin/name/ClassId;",
        "Laa3/q;",
        "getClassKind$kotlin_reflection",
        "()Lkotlin/metadata/ClassKind;",
        "classKind",
        "getMemberScope$kotlin_reflection",
        "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;",
        "memberScope",
        "getStaticScope$kotlin_reflection",
        "staticScope",
        "Laa3/m1;",
        "getModality",
        "()Lkotlin/metadata/Modality;",
        "modality",
        "Companion",
        "Data",
        "MemberBelonginess",
        "kotlin-reflection"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lkotlin/reflect/jvm/internal/KClassImpl$Companion;

.field private static final SPECIAL_JVM_ANNOTATION_NAMES:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final data:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field private final jClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lkotlin/reflect/jvm/internal/KClassImpl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkotlin/reflect/jvm/internal/KClassImpl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkotlin/reflect/jvm/internal/KClassImpl;->Companion:Lkotlin/reflect/jvm/internal/KClassImpl$Companion;

    sget-object v0, Ln93/a;->a:Ljava/util/LinkedHashSet;

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lva3/c;

    invoke-virtual {v2}, Lva3/c;->a()Lva3/e;

    move-result-object v2

    iget-object v2, v2, Lva3/e;->a:Lva3/f;

    invoke-virtual {v2}, Lva3/f;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    sput-object v1, Lkotlin/reflect/jvm/internal/KClassImpl;->SPECIAL_JVM_ANNOTATION_NAMES:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TT;>;)V"
        }
    .end annotation

    const-string v0, "jClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;-><init>()V

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/KClassImpl;->jClass:Ljava/lang/Class;

    sget-object p1, Ll83/i;->x:Ll83/i;

    new-instance v0, Lkotlin/reflect/jvm/internal/KClassImpl$$Lambda$0;

    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/KClassImpl$$Lambda$0;-><init>(Lkotlin/reflect/jvm/internal/KClassImpl;)V

    invoke-static {p1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/KClassImpl;->data:Ll83/h;

    return-void
.end method

.method public static final synthetic access$createSyntheticClassOrFail(Lkotlin/reflect/jvm/internal/KClassImpl;Lva3/c;Lw93/e;)Lr93/e;
    .locals 0

    invoke-direct {p0, p1, p2}, Lkotlin/reflect/jvm/internal/KClassImpl;->createSyntheticClassOrFail(Lva3/c;Lw93/e;)Lr93/e;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getClassId(Lkotlin/reflect/jvm/internal/KClassImpl;)Lva3/c;
    .locals 0

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getClassId()Lva3/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMembers(Lkotlin/reflect/jvm/internal/KClassImpl;Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;)Ljava/util/Collection;
    .locals 0

    invoke-direct {p0, p1, p2}, Lkotlin/reflect/jvm/internal/KClassImpl;->getMembers(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getSPECIAL_JVM_ANNOTATION_NAMES$cp()Ljava/util/Set;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/KClassImpl;->SPECIAL_JVM_ANNOTATION_NAMES:Ljava/util/Set;

    return-object v0
.end method

.method public static synthetic accessor$KClassImpl$lambda0(Lkotlin/reflect/jvm/internal/KClassImpl;)Lkotlin/reflect/jvm/internal/KClassImpl$Data;
    .locals 0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->data$lambda$0(Lkotlin/reflect/jvm/internal/KClassImpl;)Lkotlin/reflect/jvm/internal/KClassImpl$Data;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic accessor$KClassImpl$lambda1(Lhb3/x;Lqa3/k0;)Lr93/n0;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/KClassImpl;->getLocalProperty$lambda$1$0$0(Lhb3/x;Lqa3/k0;)Lr93/n0;

    move-result-object p0

    return-object p0
.end method

.method private final createSyntheticClass(Lva3/c;Lw93/e;)Lr93/e;
    .locals 7

    new-instance v0, Lu93/l;

    new-instance v1, Lu93/q;

    iget-object v2, p2, Lw93/e;->a:Lhb3/i;

    iget-object v2, v2, Lhb3/i;->b:Lr93/b0;

    iget-object v3, p1, Lva3/c;->a:Lva3/e;

    invoke-direct {v1, v2, v3}, Lu93/q;-><init>(Lr93/b0;Lva3/e;)V

    invoke-virtual {p1}, Lva3/c;->f()Lva3/h;

    move-result-object v2

    sget-object v3, Lr93/a0;->x:Lr93/a0;

    sget-object v4, Lr93/f;->w:Lr93/f;

    iget-object p1, p2, Lw93/e;->a:Lhb3/i;

    iget-object p2, p1, Lhb3/i;->b:Lr93/b0;

    invoke-interface {p2}, Lr93/b0;->c()Lo93/h;

    move-result-object p2

    const-string v5, "Any"

    invoke-virtual {p2, v5}, Lo93/h;->k(Ljava/lang/String;)Lr93/e;

    move-result-object p2

    invoke-interface {p2}, Lr93/e;->i()Llb3/c0;

    move-result-object p2

    invoke-static {p2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    move-object v5, p2

    check-cast v5, Ljava/util/Collection;

    iget-object v6, p1, Lhb3/i;->a:Lkb3/k;

    invoke-direct/range {v0 .. v6}, Lu93/l;-><init>(Lr93/k;Lva3/h;Lr93/a0;Lr93/f;Ljava/util/Collection;Lkb3/n;)V

    new-instance p1, Lkotlin/reflect/jvm/internal/KClassImpl$createSyntheticClass$1$1;

    invoke-direct {p1, v0, v6}, Lkotlin/reflect/jvm/internal/KClassImpl$createSyntheticClass$1$1;-><init>(Lu93/l;Lkb3/n;)V

    sget-object p2, Lm83/a0;->w:Lm83/a0;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, v1}, Lu93/l;->X(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;Ljava/util/Set;Lu93/j;)V

    return-object v0
.end method

.method private final createSyntheticClassOrFail(Lva3/c;Lw93/e;)Lr93/e;
    .locals 4

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getJClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isSynthetic()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2}, Lkotlin/reflect/jvm/internal/KClassImpl;->createSyntheticClass(Lva3/c;Lw93/e;)Lr93/e;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getJClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lva3/g;->l(Ljava/lang/Class;)Lw93/b;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, v0, Lw93/b;->b:Lpa3/b;

    iget-object v0, v0, Lpa3/b;->d:Ljava/lang/Object;

    check-cast v0, Lpa3/a;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    const/4 v1, -0x1

    goto :goto_1

    :cond_2
    sget-object v1, Lkotlin/reflect/jvm/internal/KClassImpl$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    :goto_1
    const/16 v2, 0x29

    const-string v3, " (kind = "

    packed-switch v1, :pswitch_data_0

    :pswitch_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_1
    new-instance p1, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "Unknown class: "

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getJClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_2
    invoke-direct {p0, p1, p2}, Lkotlin/reflect/jvm/internal/KClassImpl;->createSyntheticClass(Lva3/c;Lw93/e;)Lr93/e;

    move-result-object p1

    return-object p1

    :pswitch_3
    new-instance p1, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "Unresolved class: "

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getJClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_3
    .end packed-switch
.end method

.method private static final data$lambda$0(Lkotlin/reflect/jvm/internal/KClassImpl;)Lkotlin/reflect/jvm/internal/KClassImpl$Data;
    .locals 1

    new-instance v0, Lkotlin/reflect/jvm/internal/KClassImpl$Data;

    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/KClassImpl$Data;-><init>(Lkotlin/reflect/jvm/internal/KClassImpl;)V

    return-object v0
.end method

.method private final getClassId()Lva3/c;
    .locals 2

    sget-object v0, Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;->INSTANCE:Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getJClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;->mapJvmClassToKotlinClassId(Ljava/lang/Class;)Lva3/c;

    move-result-object v0

    return-object v0
.end method

.method private final getKmClass()Laa3/n0;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/KClassImpl;->data:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/reflect/jvm/internal/KClassImpl$Data;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/KClassImpl$Data;->getKmClass()Laa3/n0;

    move-result-object v0

    return-object v0
.end method

.method private static final getLocalProperty$lambda$1$0$0(Lhb3/x;Lqa3/k0;)Lr93/n0;
    .locals 1

    const-string v0, "$this$deserializeToDescriptor"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proto"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lhb3/x;->g(Lqa3/k0;Z)Ljb3/s;

    move-result-object p0

    return-object p0
.end method

.method private final getMembers(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;)Ljava/util/Collection;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;",
            "Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;",
            ")",
            "Ljava/util/Collection<",
            "Lkotlin/reflect/jvm/internal/DescriptorKCallable<",
            "*>;>;"
        }
    .end annotation

    .line 2
    new-instance v0, Lkotlin/reflect/jvm/internal/KClassImpl$getMembers$visitor$1;

    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/KClassImpl$getMembers$visitor$1;-><init>(Lkotlin/reflect/jvm/internal/KClassImpl;)V

    const/4 v1, 0x3

    const/4 v2, 0x0

    .line 3
    invoke-static {p1, v2, v1}, Ldt/b;->t(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/q;Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;I)Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 4
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 5
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 6
    check-cast v3, Lr93/k;

    .line 7
    instance-of v4, v3, Lr93/c;

    if-eqz v4, :cond_1

    .line 8
    move-object v4, v3

    check-cast v4, Lr93/c;

    invoke-interface {v4}, Lr93/z;->getVisibility()Lr93/r;

    move-result-object v5

    sget-object v6, Lr93/q;->h:Lr93/p;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 9
    invoke-virtual {p2, v4}, Lkotlin/reflect/jvm/internal/KClassImpl$MemberBelonginess;->accept(Lr93/c;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 10
    sget-object v4, Ll83/a0;->a:Ll83/a0;

    invoke-interface {v3, v0, v4}, Lr93/k;->T(Lr93/m;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlin/reflect/jvm/internal/DescriptorKCallable;

    goto :goto_1

    :cond_1
    move-object v3, v2

    :goto_1
    if-eqz v3, :cond_0

    .line 11
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 12
    :cond_2
    invoke-static {v1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method private final getModality()Laa3/m1;
    .locals 4

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getKmClass()Laa3/n0;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object v1, Laa3/p;->b:Lzt/q;

    sget-object v2, Laa3/p;->a:[Lj93/z;

    const/4 v3, 0x7

    aget-object v2, v2, v3

    invoke-virtual {v1, v0, v2}, Lzt/q;->v(Laa3/n0;Lj93/z;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Laa3/m1;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getJClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isAnnotation()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getJClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isEnum()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getJClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lvo/b;->s(Ljava/lang/Class;)Ljava/lang/Boolean;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Laa3/m1;->E:Laa3/m1;

    return-object v0

    :cond_3
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getJClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Laa3/m1;->z:Laa3/m1;

    return-object v0

    :cond_4
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getJClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    move-result v0

    if-nez v0, :cond_5

    sget-object v0, Laa3/m1;->y:Laa3/m1;

    return-object v0

    :cond_5
    sget-object v0, Laa3/m1;->x:Laa3/m1;

    return-object v0

    :cond_6
    :goto_1
    sget-object v0, Laa3/m1;->x:Laa3/m1;

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lkotlin/reflect/jvm/internal/KClassImpl;

    if-eqz v0, :cond_0

    invoke-static {p0}, Ljc/x;->T(Lj93/d;)Ljava/lang/Class;

    move-result-object v0

    check-cast p1, Lj93/d;

    invoke-static {p1}, Ljc/x;->T(Lj93/d;)Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public getAnnotations()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/KClassImpl;->data:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/reflect/jvm/internal/KClassImpl$Data;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/KClassImpl$Data;->getAnnotations()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getClassKind$kotlin_reflection()Laa3/q;
    .locals 1

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getKmClass()Laa3/n0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Laa3/p;->a(Laa3/n0;)Laa3/q;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getJClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isAnnotation()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Laa3/q;->F:Laa3/q;

    return-object v0

    :cond_2
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getJClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isInterface()Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Laa3/q;->y:Laa3/q;

    return-object v0

    :cond_3
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getJClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isEnum()Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Laa3/q;->z:Laa3/q;

    return-object v0

    :cond_4
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getJClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isEnum()Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Laa3/q;->E:Laa3/q;

    return-object v0

    :cond_5
    sget-object v0, Laa3/q;->x:Laa3/q;

    return-object v0
.end method

.method public getConstructorDescriptors()Ljava/util/Collection;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lr93/j;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getDescriptor()Lr93/e;

    move-result-object v0

    invoke-interface {v0}, Lr93/e;->getKind()Lr93/f;

    move-result-object v1

    sget-object v2, Lr93/f;->x:Lr93/f;

    if-eq v1, v2, :cond_1

    invoke-interface {v0}, Lr93/e;->getKind()Lr93/f;

    move-result-object v1

    sget-object v2, Lr93/f;->F:Lr93/f;

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Lr93/e;->getConstructors()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "getConstructors(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_1
    :goto_0
    sget-object v0, Lm83/y;->w:Lm83/y;

    return-object v0
.end method

.method public getConstructors()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lj93/g;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/KClassImpl;->data:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/reflect/jvm/internal/KClassImpl$Data;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/KClassImpl$Data;->getConstructors()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public final getData()Ll83/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ll83/h;"
        }
    .end annotation

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/KClassImpl;->data:Ll83/h;

    return-object v0
.end method

.method public final getDescriptor()Lr93/e;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/KClassImpl;->data:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/reflect/jvm/internal/KClassImpl$Data;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/KClassImpl$Data;->getDescriptor()Lr93/e;

    move-result-object v0

    return-object v0
.end method

.method public getFunctions(Lva3/h;)Ljava/util/Collection;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lva3/h;",
            ")",
            "Ljava/util/Collection<",
            "Lr93/w;",
            ">;"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getMemberScope$kotlin_reflection()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v0

    sget-object v1, Lz93/c;->x:Lz93/c;

    invoke-interface {v0, p1, v1}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/q;->getContributedFunctions(Lva3/h;Lz93/a;)Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getStaticScope$kotlin_reflection()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v2

    invoke-interface {v2, p1, v1}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/q;->getContributedFunctions(Lva3/h;Lz93/a;)Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {v0, p1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public getJClass()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/KClassImpl;->jClass:Ljava/lang/Class;

    return-object v0
.end method

.method public getLocalProperty(I)Lr93/n0;
    .locals 9

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getJClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "DefaultImpls"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getJClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Class;->isInterface()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Ljc/x;->V(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lkotlin/reflect/jvm/internal/KClassImpl;

    invoke-virtual {v0, p1}, Lkotlin/reflect/jvm/internal/KClassImpl;->getLocalProperty(I)Lr93/n0;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getDescriptor()Lr93/e;

    move-result-object v0

    instance-of v1, v0, Ljb3/h;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast v0, Ljb3/h;

    goto :goto_0

    :cond_1
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_2

    iget-object v1, v0, Ljb3/h;->E:Lqa3/k;

    sget-object v3, Lta3/l;->h:Lwa3/o;

    const-string v4, "classLocalVariable"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v3, p1}, Lj93/l0;->y(Lwa3/m;Lwa3/o;I)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Lqa3/k0;

    if-eqz v4, :cond_2

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getJClass()Ljava/lang/Class;

    move-result-object v3

    iget-object p1, v0, Ljb3/h;->L:Lhb3/k;

    iget-object v5, p1, Lhb3/k;->b:Lsa3/f;

    iget-object v6, p1, Lhb3/k;->d:Lsa3/h;

    iget-object v7, v0, Ljb3/h;->F:Lsa3/a;

    sget-object v8, Lkotlin/reflect/jvm/internal/KClassImpl$$Lambda$1;->INSTANCE:Lkotlin/reflect/jvm/internal/KClassImpl$$Lambda$1;

    invoke-static/range {v3 .. v8}, Lkotlin/reflect/jvm/internal/UtilKt;->deserializeToDescriptor(Ljava/lang/Class;Lwa3/v;Lsa3/f;Lsa3/h;Lsa3/a;Lc93/m;)Lr93/b;

    move-result-object p1

    check-cast p1, Lr93/n0;

    return-object p1

    :cond_2
    return-object v2
.end method

.method public final getMemberScope$kotlin_reflection()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getDescriptor()Lr93/e;

    move-result-object v0

    invoke-interface {v0}, Lr93/e;->i()Llb3/c0;

    move-result-object v0

    invoke-virtual {v0}, Llb3/y;->u()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v0

    return-object v0
.end method

.method public getMembers()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lj93/c;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/KClassImpl;->data:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/reflect/jvm/internal/KClassImpl$Data;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/KClassImpl$Data;->getAllMembers()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public getNestedClasses()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lj93/d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/KClassImpl;->data:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/reflect/jvm/internal/KClassImpl$Data;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/KClassImpl$Data;->getNestedClasses()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public getObjectInstance()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/KClassImpl;->data:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/reflect/jvm/internal/KClassImpl$Data;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/KClassImpl$Data;->getObjectInstance()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getProperties(Lva3/h;)Ljava/util/Collection;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lva3/h;",
            ")",
            "Ljava/util/Collection<",
            "Lr93/n0;",
            ">;"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getMemberScope$kotlin_reflection()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v0

    sget-object v1, Lz93/c;->x:Lz93/c;

    invoke-interface {v0, p1, v1}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;->getContributedVariables(Lva3/h;Lz93/a;)Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getStaticScope$kotlin_reflection()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v2

    invoke-interface {v2, p1, v1}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;->getContributedVariables(Lva3/h;Lz93/a;)Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {v0, p1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public getQualifiedName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/KClassImpl;->data:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/reflect/jvm/internal/KClassImpl$Data;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/KClassImpl$Data;->getQualifiedName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSealedSubclasses()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lj93/d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/KClassImpl;->data:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/reflect/jvm/internal/KClassImpl$Data;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/KClassImpl$Data;->getSealedSubclasses()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getSimpleName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/KClassImpl;->data:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/reflect/jvm/internal/KClassImpl$Data;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/KClassImpl$Data;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getStaticScope$kotlin_reflection()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 2

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getDescriptor()Lr93/e;

    move-result-object v0

    invoke-interface {v0}, Lr93/e;->V()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v0

    const-string v1, "getStaticScope(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public getSupertypes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lj93/a0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/KClassImpl;->data:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/reflect/jvm/internal/KClassImpl$Data;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/KClassImpl$Data;->getSupertypes()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getTypeParameters()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lj93/b0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/KClassImpl;->data:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/reflect/jvm/internal/KClassImpl$Data;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/KClassImpl$Data;->getTypeParameters()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getVisibility()Lj93/f0;
    .locals 2

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getDescriptor()Lr93/e;

    move-result-object v0

    invoke-interface {v0}, Lr93/e;->getVisibility()Lr93/r;

    move-result-object v0

    const-string v1, "getVisibility(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/UtilKt;->toKVisibility(Lr93/r;)Lj93/f0;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-static {p0}, Ljc/x;->T(Lj93/d;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public isAbstract()Z
    .locals 2

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getModality()Laa3/m1;

    move-result-object v0

    sget-object v1, Laa3/m1;->z:Laa3/m1;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isCompanion()Z
    .locals 2

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getKmClass()Laa3/n0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Laa3/p;->a(Laa3/n0;)Laa3/q;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sget-object v1, Laa3/q;->H:Laa3/q;

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public isData()Z
    .locals 5

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getKmClass()Laa3/n0;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget-object v2, Laa3/p;->a:[Lj93/z;

    sget-object v2, Laa3/p;->f:Lcom/google/crypto/tink/internal/l0;

    sget-object v3, Laa3/p;->a:[Lj93/z;

    const/16 v4, 0xb

    aget-object v3, v3, v4

    invoke-virtual {v2, v0, v3}, Lcom/google/crypto/tink/internal/l0;->W(Ljava/lang/Object;Lj93/z;)Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    return v2

    :cond_0
    return v1
.end method

.method public isFinal()Z
    .locals 2

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getModality()Laa3/m1;

    move-result-object v0

    sget-object v1, Laa3/m1;->x:Laa3/m1;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isFun()Z
    .locals 5

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getKmClass()Laa3/n0;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget-object v2, Laa3/p;->a:[Lj93/z;

    sget-object v2, Laa3/p;->h:Lcom/google/crypto/tink/internal/l0;

    sget-object v3, Laa3/p;->a:[Lj93/z;

    const/16 v4, 0xf

    aget-object v3, v3, v4

    invoke-virtual {v2, v0, v3}, Lcom/google/crypto/tink/internal/l0;->W(Ljava/lang/Object;Lj93/z;)Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    return v2

    :cond_0
    return v1
.end method

.method public final isInline$kotlin_reflection()Z
    .locals 1

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getKmClass()Laa3/n0;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, v0, Laa3/n0;->M:Laa3/b1;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public isInner()Z
    .locals 4

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getKmClass()Laa3/n0;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getJClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getJClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    sget-object v1, Laa3/p;->e:Lcom/google/crypto/tink/internal/l0;

    sget-object v2, Laa3/p;->a:[Lj93/z;

    const/16 v3, 0xa

    aget-object v2, v2, v3

    invoke-virtual {v1, v0, v2}, Lcom/google/crypto/tink/internal/l0;->W(Ljava/lang/Object;Lj93/z;)Z

    move-result v0

    return v0
.end method

.method public isInstance(Ljava/lang/Object;)Z
    .locals 3

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getJClass()Ljava/lang/Class;

    move-result-object v0

    sget-object v1, Lx93/c;->a:Ljava/util/List;

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lx93/c;->d:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/m0;->f(ILjava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getJClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lx93/c;->c:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getJClass()Ljava/lang/Class;

    move-result-object v0

    :cond_1
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public isOpen()Z
    .locals 2

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getModality()Laa3/m1;

    move-result-object v0

    sget-object v1, Laa3/m1;->y:Laa3/m1;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isSealed()Z
    .locals 2

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getModality()Laa3/m1;

    move-result-object v0

    sget-object v1, Laa3/m1;->E:Laa3/m1;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isValue()Z
    .locals 5

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getKmClass()Laa3/n0;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget-object v2, Laa3/p;->a:[Lj93/z;

    sget-object v2, Laa3/p;->g:Lcom/google/crypto/tink/internal/l0;

    sget-object v3, Laa3/p;->a:[Lj93/z;

    const/16 v4, 0xe

    aget-object v3, v3, v4

    invoke-virtual {v2, v0, v3}, Lcom/google/crypto/tink/internal/l0;->W(Ljava/lang/Object;Lj93/z;)Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    return v2

    :cond_0
    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "class "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getClassId()Lva3/c;

    move-result-object v1

    iget-object v2, v1, Lva3/c;->a:Lva3/e;

    iget-object v3, v2, Lva3/e;->a:Lva3/f;

    invoke-virtual {v3}, Lva3/f;->c()Z

    move-result v3

    const/16 v4, 0x2e

    if-eqz v3, :cond_0

    const-string v2, ""

    goto :goto_0

    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v2, Lva3/e;->a:Lva3/f;

    iget-object v2, v2, Lva3/f;->a:Ljava/lang/String;

    invoke-static {v3, v2, v4}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v2

    :goto_0
    iget-object v1, v1, Lva3/c;->b:Lva3/e;

    iget-object v1, v1, Lva3/e;->a:Lva3/f;

    iget-object v1, v1, Lva3/f;->a:Ljava/lang/String;

    const/16 v3, 0x24

    invoke-static {v1, v4, v3}, Lyb3/y;->L(Ljava/lang/String;CC)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
