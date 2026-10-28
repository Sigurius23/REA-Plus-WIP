.class public abstract Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/internal/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Companion;,
        Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;,
        Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$FunctionJvmDescriptor;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008 \u0018\u0000 D2\u00020\u0001:\u0003EFDB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JG\u0010\r\u001a\u0004\u0018\u00010\u000c*\u0006\u0012\u0002\u0008\u00030\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0010\u0010\u0008\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00040\u00072\n\u0010\t\u001a\u0006\u0012\u0002\u0008\u00030\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ?\u0010\u000f\u001a\u0004\u0018\u00010\u000c*\u0006\u0012\u0002\u0008\u00030\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0010\u0010\u0008\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00040\u00072\n\u0010\t\u001a\u0006\u0012\u0002\u0008\u00030\u0004H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J/\u0010\u0013\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u0012*\u0006\u0012\u0002\u0008\u00030\u00042\u0010\u0010\u0008\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00040\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J;\u0010\u001a\u001a\u00020\u00192\u0010\u0010\u0016\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00040\u00152\u0010\u0010\u0017\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00040\u00112\u0006\u0010\u0018\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u001f\u0010 J+\u0010$\u001a\u0006\u0012\u0002\u0008\u00030\u00042\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0002\u00a2\u0006\u0004\u0008$\u0010%J\u001d\u0010)\u001a\u0008\u0012\u0004\u0012\u00020(0\'2\u0006\u0010\u0006\u001a\u00020&H&\u00a2\u0006\u0004\u0008)\u0010*J\u001d\u0010,\u001a\u0008\u0012\u0004\u0012\u00020+0\'2\u0006\u0010\u0006\u001a\u00020&H&\u00a2\u0006\u0004\u0008,\u0010*J\u0019\u0010.\u001a\u0004\u0018\u00010(2\u0006\u0010-\u001a\u00020!H&\u00a2\u0006\u0004\u0008.\u0010/J\u001d\u00101\u001a\u00020(2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u0005\u00a2\u0006\u0004\u00081\u00102J\u001d\u00103\u001a\u00020+2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u0005\u00a2\u0006\u0004\u00083\u00104J\u001f\u00105\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005\u00a2\u0006\u0004\u00085\u00106J\'\u00108\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u00107\u001a\u00020\n\u00a2\u0006\u0004\u00088\u00109J\u001b\u0010:\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u00122\u0006\u0010\u001c\u001a\u00020\u0005\u00a2\u0006\u0004\u0008:\u0010;J\u001b\u0010<\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u00122\u0006\u0010\u001c\u001a\u00020\u0005\u00a2\u0006\u0004\u0008<\u0010;R\u0018\u0010?\u001a\u0006\u0012\u0002\u0008\u00030\u00048TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008=\u0010>R\u001a\u0010C\u001a\u0008\u0012\u0004\u0012\u00020@0\'8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008A\u0010B\u00a8\u0006G"
    }
    d2 = {
        "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;",
        "Lkotlin/jvm/internal/d;",
        "<init>",
        "()V",
        "Ljava/lang/Class;",
        "",
        "name",
        "",
        "parameterTypes",
        "returnType",
        "",
        "isStaticDefault",
        "Ljava/lang/reflect/Method;",
        "lookupMethod",
        "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;Z)Ljava/lang/reflect/Method;",
        "tryGetMethod",
        "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;",
        "",
        "Ljava/lang/reflect/Constructor;",
        "tryGetConstructor",
        "(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;",
        "",
        "result",
        "valueParameters",
        "isConstructor",
        "Ll83/a0;",
        "addParametersAndMasks",
        "(Ljava/util/List;Ljava/util/List;Z)V",
        "desc",
        "parseReturnType",
        "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$FunctionJvmDescriptor;",
        "parseJvmDescriptor",
        "(Ljava/lang/String;Z)Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$FunctionJvmDescriptor;",
        "",
        "begin",
        "end",
        "parseType",
        "(Ljava/lang/String;II)Ljava/lang/Class;",
        "Lva3/h;",
        "",
        "Lr93/n0;",
        "getProperties",
        "(Lva3/h;)Ljava/util/Collection;",
        "Lr93/w;",
        "getFunctions",
        "index",
        "getLocalProperty",
        "(I)Lr93/n0;",
        "signature",
        "findPropertyDescriptor",
        "(Ljava/lang/String;Ljava/lang/String;)Lr93/n0;",
        "findFunctionDescriptor",
        "(Ljava/lang/String;Ljava/lang/String;)Lr93/w;",
        "findMethodBySignature",
        "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;",
        "isMember",
        "findDefaultMethod",
        "(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/reflect/Method;",
        "findConstructorBySignature",
        "(Ljava/lang/String;)Ljava/lang/reflect/Constructor;",
        "findDefaultConstructor",
        "getMethodOwner",
        "()Ljava/lang/Class;",
        "methodOwner",
        "Lr93/j;",
        "getConstructorDescriptors",
        "()Ljava/util/Collection;",
        "constructorDescriptors",
        "Companion",
        "Data",
        "FunctionJvmDescriptor",
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
.field public static final Companion:Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Companion;

.field private static final DEFAULT_CONSTRUCTOR_MARKER:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private static final LOCAL_PROPERTY_SIGNATURE:Lyb3/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->Companion:Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Companion;

    const-class v0, Lkotlin/jvm/internal/DefaultConstructorMarker;

    sput-object v0, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->DEFAULT_CONSTRUCTOR_MARKER:Ljava/lang/Class;

    new-instance v0, Lyb3/p;

    const-string v1, "<v#(\\d+)>"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->LOCAL_PROPERTY_SIGNATURE:Lyb3/p;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$getLOCAL_PROPERTY_SIGNATURE$cp()Lyb3/p;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->LOCAL_PROPERTY_SIGNATURE:Lyb3/p;

    return-object v0
.end method

.method public static synthetic accessor$KDeclarationContainerImpl$lambda0(Lr93/r;Lr93/r;)I
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->findPropertyDescriptor$lambda$2(Lr93/r;Lr93/r;)I

    move-result p0

    return p0
.end method

.method public static synthetic accessor$KDeclarationContainerImpl$lambda1(Lc93/m;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    invoke-static {p0, p1, p2}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->findPropertyDescriptor$lambda$3(Lc93/m;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static synthetic accessor$KDeclarationContainerImpl$lambda2(Lr93/n0;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->findPropertyDescriptor$lambda$4(Lr93/n0;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic accessor$KDeclarationContainerImpl$lambda3(Lr93/w;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->findFunctionDescriptor$lambda$2(Lr93/w;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method private final addParametersAndMasks(Ljava/util/List;Ljava/util/List;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Class<",
            "*>;>;Z)V"
        }
    .end annotation

    invoke-static {p2}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->DEFAULT_CONSTRUCTOR_MARKER:Ljava/lang/Class;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {p2, v1, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p2

    :cond_0
    move-object v0, p2

    check-cast v0, Ljava/util/Collection;

    invoke-interface {p1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    add-int/lit8 p2, p2, 0x1f

    div-int/lit8 p2, p2, 0x20

    :goto_0
    if-ge v1, p2, :cond_1

    const-string v0, "TYPE"

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    if-eqz p3, :cond_2

    sget-object p2, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->DEFAULT_CONSTRUCTOR_MARKER:Ljava/lang/Class;

    goto :goto_1

    :cond_2
    const-class p2, Ljava/lang/Object;

    :goto_1
    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private static final findFunctionDescriptor$lambda$2(Lr93/w;)Ljava/lang/CharSequence;
    .locals 2

    const-string v0, "descriptor"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lxa3/i;->e:Lxa3/i;

    invoke-virtual {v1, p0}, Lxa3/i;->w(Lr93/k;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " | "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;->INSTANCE:Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;

    invoke-virtual {v1, p0}, Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;->mapSignature(Lr93/w;)Lkotlin/reflect/jvm/internal/JvmFunctionSignature;

    move-result-object p0

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/JvmFunctionSignature;->asString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final findPropertyDescriptor$lambda$2(Lr93/r;Lr93/r;)I
    .locals 0

    invoke-static {p0, p1}, Lr93/q;->b(Lr93/r;Lr93/r;)Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final findPropertyDescriptor$lambda$3(Lc93/m;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    invoke-interface {p0, p1, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private static final findPropertyDescriptor$lambda$4(Lr93/n0;)Ljava/lang/CharSequence;
    .locals 2

    const-string v0, "descriptor"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lxa3/i;->e:Lxa3/i;

    invoke-virtual {v1, p0}, Lxa3/i;->w(Lr93/k;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " | "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;->INSTANCE:Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;

    invoke-virtual {v1, p0}, Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;->mapPropertySignature(Lr93/n0;)Lkotlin/reflect/jvm/internal/JvmPropertySignature;

    move-result-object p0

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/JvmPropertySignature;->asString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final lookupMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;Z)Ljava/lang/reflect/Method;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;Z)",
            "Ljava/lang/reflect/Method;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    aput-object p1, p3, v0

    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->tryGetMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    if-eqz v1, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v3

    if-eqz v3, :cond_2

    move-object v2, p0

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move v7, p5

    invoke-direct/range {v2 .. v7}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->lookupMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;Z)Ljava/lang/reflect/Method;

    move-result-object p2

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move v6, v7

    if-eqz p2, :cond_3

    return-object p2

    :cond_2
    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    :cond_3
    invoke-virtual {p1}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object p1

    const-string p2, "getInterfaces(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    array-length p2, p1

    move p3, v0

    :goto_0
    if-ge p3, p2, :cond_6

    aget-object v2, p1, p3

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->lookupMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;Z)Ljava/lang/reflect/Method;

    move-result-object p4

    if-eqz p4, :cond_4

    return-object p4

    :cond_4
    if-eqz v6, :cond_5

    invoke-static {v2}, Lx93/c;->d(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    move-result-object p4

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p5

    const-string v7, "$DefaultImpls"

    invoke-virtual {p5, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p5

    invoke-static {p4, p5}, Lva3/d;->k(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p4

    if-eqz p4, :cond_5

    aput-object v2, v4, v0

    invoke-direct {p0, p4, v3, v4, v5}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->tryGetMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p4

    if-eqz p4, :cond_5

    return-object p4

    :cond_5
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_6
    move-object v1, p0

    const/4 p1, 0x0

    return-object p1
.end method

.method private final parseJvmDescriptor(Ljava/lang/String;Z)Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$FunctionJvmDescriptor;
    .locals 7

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x1

    move v2, v1

    :goto_0
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x29

    if-eq v3, v4, :cond_3

    move v3, v2

    :goto_1
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x5b

    if-ne v4, v5, :cond_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_0
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const-string v5, "VZCBSIFJD"

    const/4 v6, 0x0

    invoke-static {v5, v4, v6}, Lyb3/r;->T(Ljava/lang/CharSequence;CZ)Z

    move-result v5

    if-eqz v5, :cond_1

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_1
    const/16 v3, 0x4c

    if-ne v4, v3, :cond_2

    const/16 v3, 0x3b

    const/4 v4, 0x4

    invoke-static {p1, v3, v2, v6, v4}, Lyb3/r;->f0(Ljava/lang/CharSequence;CIZI)I

    move-result v3

    add-int/2addr v3, v1

    :goto_2
    invoke-direct {p0, p1, v2, v3}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->parseType(Ljava/lang/String;II)Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v2, v3

    goto :goto_0

    :cond_2
    new-instance p2, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    const-string v0, "Unknown type prefix in the method signature: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    if-eqz p2, :cond_4

    add-int/2addr v2, v1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    invoke-direct {p0, p1, v2, p2}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->parseType(Ljava/lang/String;II)Ljava/lang/Class;

    move-result-object p1

    goto :goto_3

    :cond_4
    const/4 p1, 0x0

    :goto_3
    new-instance p2, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$FunctionJvmDescriptor;

    invoke-direct {p2, v0, p1}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$FunctionJvmDescriptor;-><init>(Ljava/util/List;Ljava/lang/Class;)V

    return-object p2
.end method

.method private final parseType(Ljava/lang/String;II)Ljava/lang/Class;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x46

    if-eq v0, v1, :cond_7

    const/16 v1, 0x4c

    if-eq v0, v1, :cond_6

    const/16 v1, 0x53

    if-eq v0, v1, :cond_5

    const/16 v1, 0x56

    if-eq v0, v1, :cond_4

    const/16 v1, 0x49

    if-eq v0, v1, :cond_3

    const/16 v1, 0x4a

    if-eq v0, v1, :cond_2

    const/16 v1, 0x5a

    if-eq v0, v1, :cond_1

    const/16 v1, 0x5b

    if-eq v0, v1, :cond_0

    packed-switch v0, :pswitch_data_0

    new-instance p2, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    const-string p3, "Unknown type prefix in the method signature: "

    invoke-virtual {p3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw p2

    :pswitch_0
    sget-object p1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    return-object p1

    :pswitch_1
    sget-object p1, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    return-object p1

    :pswitch_2
    sget-object p1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    return-object p1

    :cond_0
    add-int/lit8 p2, p2, 0x1

    invoke-direct {p0, p1, p2, p3}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->parseType(Ljava/lang/String;II)Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Lkotlin/reflect/jvm/internal/UtilKt;->createArrayType(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p1

    return-object p1

    :cond_1
    sget-object p1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    return-object p1

    :cond_2
    sget-object p1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    return-object p1

    :cond_3
    sget-object p1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    return-object p1

    :cond_4
    const-string p1, "TYPE"

    sget-object p2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p2

    :cond_5
    sget-object p1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    return-object p1

    :cond_6
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->getJClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lx93/c;->d(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    move-result-object v0

    add-int/lit8 p2, p2, 0x1

    add-int/lit8 p3, p3, -0x1

    invoke-virtual {p1, p2, p3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    const-string p2, "substring(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 p2, 0x2f

    const/16 p3, 0x2e

    invoke-static {p1, p2, p3}, Lyb3/y;->L(Ljava/lang/String;CC)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    const-string p2, "loadClass(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_7
    sget-object p1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x42
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final tryGetConstructor(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Class<",
            "*>;>;)",
            "Ljava/lang/reflect/Constructor<",
            "*>;"
        }
    .end annotation

    :try_start_0
    check-cast p2, Ljava/util/Collection;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Class;

    invoke-interface {p2, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/Class;

    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/Class;

    invoke-virtual {p1, p2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final tryGetMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/reflect/Method;"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    array-length v1, p3

    invoke-static {p3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Class;

    invoke-virtual {p1, p2, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v2

    invoke-static {v2, p4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object p1

    const-string v1, "getDeclaredMethods(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, p1, v2

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v4

    invoke-static {v4, p4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    invoke-static {v4, p3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v4
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v4, :cond_1

    return-object v3

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catch_0
    :cond_2
    return-object v0
.end method


# virtual methods
.method public final findConstructorBySignature(Ljava/lang/String;)Ljava/lang/reflect/Constructor;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/reflect/Constructor<",
            "*>;"
        }
    .end annotation

    const-string v0, "desc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->getJClass()Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->parseJvmDescriptor(Ljava/lang/String;Z)Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$FunctionJvmDescriptor;

    move-result-object p1

    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$FunctionJvmDescriptor;->getParameters()Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->tryGetConstructor(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    return-object p1
.end method

.method public final findDefaultConstructor(Ljava/lang/String;)Ljava/lang/reflect/Constructor;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/reflect/Constructor<",
            "*>;"
        }
    .end annotation

    const-string v0, "desc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->getJClass()Ljava/lang/Class;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    invoke-direct {p0, p1, v2}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->parseJvmDescriptor(Ljava/lang/String;Z)Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$FunctionJvmDescriptor;

    move-result-object p1

    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$FunctionJvmDescriptor;->getParameters()Ljava/util/List;

    move-result-object p1

    const/4 v2, 0x1

    invoke-direct {p0, v1, p1, v2}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->addParametersAndMasks(Ljava/util/List;Ljava/util/List;Z)V

    invoke-direct {p0, v0, v1}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->tryGetConstructor(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    return-object p1
.end method

.method public final findDefaultMethod(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/reflect/Method;
    .locals 9

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "desc"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<init>"

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p3, :cond_1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->getJClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    const/4 v1, 0x1

    invoke-direct {p0, p2, v1}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->parseJvmDescriptor(Ljava/lang/String;Z)Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$FunctionJvmDescriptor;

    move-result-object p2

    invoke-virtual {p2}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$FunctionJvmDescriptor;->getParameters()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->addParametersAndMasks(Ljava/util/List;Ljava/util/List;Z)V

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->getMethodOwner()Ljava/lang/Class;

    move-result-object v4

    const-string v1, "$default"

    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-array p1, v2, [Ljava/lang/Class;

    invoke-interface {v0, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, [Ljava/lang/Class;

    invoke-virtual {p2}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$FunctionJvmDescriptor;->getReturnType()Ljava/lang/Class;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    move-object v3, p0

    move v8, p3

    invoke-direct/range {v3 .. v8}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->lookupMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;Z)Ljava/lang/reflect/Method;

    move-result-object p1

    return-object p1
.end method

.method public final findFunctionDescriptor(Ljava/lang/String;Ljava/lang/String;)Lr93/w;
    .locals 10

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signature"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<init>"

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->getConstructorDescriptors()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lr93/j;

    invoke-interface {v4}, Lr93/j;->O()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Lr93/j;->g()Lr93/i;

    move-result-object v5

    const-string v6, "getContainingDeclaration(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5}, Lya3/h;->c(Lr93/k;)Z

    move-result v5

    if-eqz v5, :cond_2

    sget-object v5, Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;->INSTANCE:Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;

    invoke-virtual {v5, v4}, Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;->mapSignature(Lr93/w;)Lkotlin/reflect/jvm/internal/JvmFunctionSignature;

    move-result-object v5

    invoke-virtual {v5}, Lkotlin/reflect/jvm/internal/JvmFunctionSignature;->asString()Ljava/lang/String;

    move-result-object v5

    const-string v7, "constructor-impl"

    const/4 v8, 0x0

    invoke-static {v5, v7, v8}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v7

    if-eqz v7, :cond_1

    const-string v7, ")V"

    invoke-static {v5, v7, v8}, Lyb3/y;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v7

    if-eqz v7, :cond_1

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "V"

    invoke-static {v5, v8}, Lyb3/r;->s0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v4}, Lr93/j;->g()Lr93/i;

    move-result-object v4

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Lcb3/e;->f(Lr93/h;)Lva3/c;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lva3/c;->b()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lua3/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Invalid signature of "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ": "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    sget-object v5, Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;->INSTANCE:Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;

    invoke-virtual {v5, v4}, Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;->mapSignature(Lr93/w;)Lkotlin/reflect/jvm/internal/JvmFunctionSignature;

    move-result-object v4

    invoke-virtual {v4}, Lkotlin/reflect/jvm/internal/JvmFunctionSignature;->asString()Ljava/lang/String;

    move-result-object v4

    :goto_1
    invoke-static {v4, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_3
    invoke-static {p1}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->getFunctions(Lva3/h;)Ljava/util/Collection;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lr93/w;

    sget-object v5, Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;->INSTANCE:Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;

    invoke-virtual {v5, v4}, Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;->mapSignature(Lr93/w;)Lkotlin/reflect/jvm/internal/JvmFunctionSignature;

    move-result-object v4

    invoke-virtual {v4}, Lkotlin/reflect/jvm/internal/JvmFunctionSignature;->asString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v1

    const/4 v3, 0x1

    if-eq v1, v3, :cond_7

    move-object v4, v0

    check-cast v4, Ljava/lang/Iterable;

    sget-object v8, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$$Lambda$3;->INSTANCE:Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$$Lambda$3;

    const/16 v9, 0x1e

    const-string v5, "\n"

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    const-string v2, "\' (JVM signature: "

    const-string v3, ") not resolved in "

    const-string v4, "Function \'"

    invoke-static {v4, p1, v2, p2, v3}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p2, 0x3a

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p2

    if-nez p2, :cond_6

    const-string p2, " no members found"

    goto :goto_3

    :cond_6
    const-string p2, "\n"

    invoke-virtual {p2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    :goto_3
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    invoke-static {v2}, Lm83/s;->p1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr93/w;

    return-object p1
.end method

.method public final findMethodBySignature(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;
    .locals 8

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "desc"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<init>"

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    const/4 v0, 0x1

    invoke-direct {p0, p2, v0}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->parseJvmDescriptor(Ljava/lang/String;Z)Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$FunctionJvmDescriptor;

    move-result-object p2

    invoke-virtual {p2}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$FunctionJvmDescriptor;->getParameters()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, [Ljava/lang/Class;

    invoke-virtual {p2}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$FunctionJvmDescriptor;->getReturnType()Ljava/lang/Class;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->getMethodOwner()Ljava/lang/Class;

    move-result-object v3

    const/4 v7, 0x0

    move-object v2, p0

    move-object v4, p1

    invoke-direct/range {v2 .. v7}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->lookupMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;Z)Ljava/lang/reflect/Method;

    move-result-object p1

    if-eqz p1, :cond_1

    return-object p1

    :cond_1
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->getMethodOwner()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->isInterface()Z

    move-result p1

    if-eqz p1, :cond_2

    const-class v3, Ljava/lang/Object;

    const/4 v7, 0x0

    move-object v2, p0

    invoke-direct/range {v2 .. v7}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->lookupMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;Z)Ljava/lang/reflect/Method;

    move-result-object p1

    if-eqz p1, :cond_2

    return-object p1

    :cond_2
    return-object v1
.end method

.method public final findPropertyDescriptor(Ljava/lang/String;Ljava/lang/String;)Lr93/n0;
    .locals 12

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signature"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->LOCAL_PROPERTY_SIGNATURE:Lyb3/p;

    invoke-virtual {v0, p2}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-static {v0}, Ls6/a;->f(Lyb3/n;)Lty/c;

    move-result-object p1

    invoke-virtual {p1}, Lty/c;->o()Lyb3/k;

    move-result-object p1

    check-cast p1, Lyb3/n;

    invoke-virtual {p1}, Lyb3/n;->a()Ljava/util/List;

    move-result-object p1

    check-cast p1, Lyb3/l;

    invoke-virtual {p1, v1}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {p0, p2}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->getLocalProperty(I)Lr93/n0;

    move-result-object p2

    if-eqz p2, :cond_0

    return-object p2

    :cond_0
    new-instance p2, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    const-string v0, "Local property #"

    const-string v1, " not found in "

    invoke-static {v0, p1, v1}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->getJClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    invoke-static {p1}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->getProperties(Lva3/h;)Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lr93/n0;

    sget-object v5, Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;->INSTANCE:Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;

    invoke-virtual {v5, v4}, Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;->mapPropertySignature(Lr93/n0;)Lkotlin/reflect/jvm/internal/JvmPropertySignature;

    move-result-object v4

    invoke-virtual {v4}, Lkotlin/reflect/jvm/internal/JvmPropertySignature;->asString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    const-string v3, ") not resolved in "

    const-string v4, "\' (JVM signature: "

    const-string v5, "Property \'"

    if-nez v0, :cond_9

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eq v0, v1, :cond_8

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lr93/n0;

    invoke-interface {v7}, Lr93/z;->getVisibility()Lr93/r;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_4

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    check-cast v8, Ljava/util/List;

    invoke-interface {v8, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    sget-object v2, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$$Lambda$0;->INSTANCE:Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$$Lambda$0;

    new-instance v6, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$$Lambda$1;

    invoke-direct {v6, v2}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$$Lambda$1;-><init>(Lc93/m;)V

    invoke-static {v0, v6}, Lm83/g0;->o0(Ljava/util/Map;Ljava/util/Comparator;)Ljava/util/TreeMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v2, "<get-values>(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->O0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ne v2, v1, :cond_6

    invoke-static {v0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr93/n0;

    return-object p1

    :cond_6
    invoke-static {p1}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->getProperties(Lva3/h;)Ljava/util/Collection;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/Iterable;

    sget-object v10, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$$Lambda$2;->INSTANCE:Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$$Lambda$2;

    const/16 v11, 0x1e

    const-string v7, "\n"

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    invoke-static {v5, p1, v4, p2, v3}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p2, 0x3a

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p2

    if-nez p2, :cond_7

    const-string p2, " no members found"

    goto :goto_2

    :cond_7
    const-string p2, "\n"

    invoke-virtual {p2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    :goto_2
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_8
    invoke-static {v2}, Lm83/s;->p1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr93/n0;

    return-object p1

    :cond_9
    new-instance v0, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    invoke-static {v5, p1, v4, p2, v3}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public abstract getConstructorDescriptors()Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lr93/j;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getFunctions(Lva3/h;)Ljava/util/Collection;
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
.end method

.method public abstract synthetic getJClass()Ljava/lang/Class;
.end method

.method public abstract getLocalProperty(I)Lr93/n0;
.end method

.method public abstract synthetic getMembers()Ljava/util/Collection;
.end method

.method public getMethodOwner()Ljava/lang/Class;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->getJClass()Ljava/lang/Class;

    move-result-object v0

    sget-object v1, Lx93/c;->a:Ljava/util/List;

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lx93/c;->c:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->getJClass()Ljava/lang/Class;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public abstract getProperties(Lva3/h;)Ljava/util/Collection;
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
.end method
