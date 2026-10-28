.class public abstract Lkotlin/reflect/jvm/internal/DescriptorKCallable;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;
.implements Lkotlin/reflect/jvm/internal/ReflectKCallable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;",
        "Lkotlin/reflect/jvm/internal/ReflectKCallable<",
        "TR;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008 \u0018\u0000*\u0006\u0008\u0000\u0010\u0001 \u00012\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\'\u0010\t\u001a\u00028\u00002\u0016\u0010\u0008\u001a\u000c\u0012\u0008\u0008\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ%\u0010\r\u001a\u00028\u00002\u0014\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ3\u0010\u0011\u001a\u00028\u00002\u0014\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b2\u000c\u0010\u0010\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u000fH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014*\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ%\u0010\u001e\u001a\u00028\u00002\u0014\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000bH\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u000eJ\u0017\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\u0008!\u0010\"J\u0011\u0010$\u001a\u0004\u0018\u00010#H\u0002\u00a2\u0006\u0004\u0008$\u0010%R.\u0010)\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\' (*\n\u0012\u0004\u0012\u00020\'\u0018\u00010\u00140\u00140&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010*RD\u0010-\u001a2\u0012.\u0012,\u0012\u0004\u0012\u00020\u000c (*\u0016\u0012\u0004\u0012\u00020\u000c\u0018\u00010+j\n\u0012\u0004\u0012\u00020\u000c\u0018\u0001`,0+j\u0008\u0012\u0004\u0012\u00020\u000c`,0&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010*RD\u0010.\u001a2\u0012.\u0012,\u0012\u0004\u0012\u00020\u000c (*\u0016\u0012\u0004\u0012\u00020\u000c\u0018\u00010+j\n\u0012\u0004\u0012\u00020\u000c\u0018\u0001`,0+j\u0008\u0012\u0004\u0012\u00020\u000c`,0&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008.\u0010*R\"\u00100\u001a\u0010\u0012\u000c\u0012\n (*\u0004\u0018\u00010/0/0&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u0010*R.\u00102\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000201 (*\n\u0012\u0004\u0012\u000201\u0018\u00010\u00140\u00140&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u0010*R2\u00103\u001a \u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007 (*\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00060&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00083\u0010*R\u001a\u00106\u001a\u0008\u0012\u0004\u0012\u000205048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00086\u00107R\u001a\u0010:\u001a\u0008\u0012\u0004\u0012\u00020\'0\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u00088\u00109R\u001a\u0010<\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008;\u00109R\u001a\u0010>\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008=\u00109R\u0014\u0010A\u001a\u00020\u001f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008?\u0010@R\u001a\u0010D\u001a\u0008\u0012\u0004\u0012\u00020B0\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008C\u00109R\u0016\u0010H\u001a\u0004\u0018\u00010E8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008F\u0010GR\u0014\u0010I\u001a\u0002058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008I\u0010JR\u0014\u0010K\u001a\u0002058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008K\u0010JR\u0014\u0010L\u001a\u0002058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008L\u0010JR\u0014\u0010M\u001a\u0002058DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\u0008M\u0010JR\u0014\u0010P\u001a\u00020\u00138&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008N\u0010O\u00a8\u0006Q"
    }
    d2 = {
        "Lkotlin/reflect/jvm/internal/DescriptorKCallable;",
        "R",
        "Lkotlin/reflect/jvm/internal/ReflectKCallable;",
        "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;",
        "<init>",
        "()V",
        "",
        "",
        "args",
        "call",
        "([Ljava/lang/Object;)Ljava/lang/Object;",
        "",
        "Lj93/q;",
        "callBy",
        "(Ljava/util/Map;)Ljava/lang/Object;",
        "Lq83/d;",
        "continuationArgument",
        "callDefaultMethod",
        "(Ljava/util/Map;Lq83/d;)Ljava/lang/Object;",
        "Lr93/c;",
        "",
        "Lr93/a1;",
        "computeContextParameters",
        "(Lr93/c;)Ljava/util/List;",
        "getAbsentArguments",
        "()[Ljava/lang/Object;",
        "parameter",
        "",
        "getParameterTypeSize",
        "(Lj93/q;)I",
        "callAnnotationConstructor",
        "Lj93/a0;",
        "type",
        "defaultEmptyArray",
        "(Lj93/a0;)Ljava/lang/Object;",
        "Ljava/lang/reflect/Type;",
        "extractContinuationArgument",
        "()Ljava/lang/reflect/Type;",
        "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;",
        "",
        "kotlin.jvm.PlatformType",
        "_annotations",
        "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "_receiverParameters",
        "_parameters",
        "Lwb3/h;",
        "_returnType",
        "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;",
        "_typeParameters",
        "_absentArguments",
        "Ll83/h;",
        "",
        "parametersNeedMFVCFlattening",
        "Ll83/h;",
        "getAnnotations",
        "()Ljava/util/List;",
        "annotations",
        "getReceiverParameters",
        "receiverParameters",
        "getParameters",
        "parameters",
        "getReturnType",
        "()Lj93/a0;",
        "returnType",
        "Lj93/b0;",
        "getTypeParameters",
        "typeParameters",
        "Lj93/f0;",
        "getVisibility",
        "()Lj93/f0;",
        "visibility",
        "isFinal",
        "()Z",
        "isOpen",
        "isAbstract",
        "isAnnotationConstructor",
        "getDescriptor",
        "()Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;",
        "descriptor",
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


# instance fields
.field private final _absentArguments:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal<",
            "[",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final _annotations:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal<",
            "Ljava/util/List<",
            "Ljava/lang/annotation/Annotation;",
            ">;>;"
        }
    .end annotation
.end field

.field private final _parameters:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal<",
            "Ljava/util/ArrayList<",
            "Lj93/q;",
            ">;>;"
        }
    .end annotation
.end field

.field private final _receiverParameters:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal<",
            "Ljava/util/ArrayList<",
            "Lj93/q;",
            ">;>;"
        }
    .end annotation
.end field

.field private final _returnType:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal<",
            "Lwb3/h;",
            ">;"
        }
    .end annotation
.end field

.field private final _typeParameters:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal<",
            "Ljava/util/List<",
            "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;",
            ">;>;"
        }
    .end annotation
.end field

.field private final parametersNeedMFVCFlattening:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lkotlin/reflect/jvm/internal/DescriptorKCallable$$Lambda$0;

    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable$$Lambda$0;-><init>(Lkotlin/reflect/jvm/internal/DescriptorKCallable;)V

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/ReflectProperties;->lazySoft(Lc93/a;)Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    move-result-object v0

    const-string v1, "lazySoft(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->_annotations:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    new-instance v0, Lkotlin/reflect/jvm/internal/DescriptorKCallable$$Lambda$1;

    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable$$Lambda$1;-><init>(Lkotlin/reflect/jvm/internal/DescriptorKCallable;)V

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/ReflectProperties;->lazySoft(Lc93/a;)Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->_receiverParameters:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    new-instance v0, Lkotlin/reflect/jvm/internal/DescriptorKCallable$$Lambda$2;

    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable$$Lambda$2;-><init>(Lkotlin/reflect/jvm/internal/DescriptorKCallable;)V

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/ReflectProperties;->lazySoft(Lc93/a;)Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->_parameters:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    new-instance v0, Lkotlin/reflect/jvm/internal/DescriptorKCallable$$Lambda$3;

    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable$$Lambda$3;-><init>(Lkotlin/reflect/jvm/internal/DescriptorKCallable;)V

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/ReflectProperties;->lazySoft(Lc93/a;)Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->_returnType:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    new-instance v0, Lkotlin/reflect/jvm/internal/DescriptorKCallable$$Lambda$4;

    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable$$Lambda$4;-><init>(Lkotlin/reflect/jvm/internal/DescriptorKCallable;)V

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/ReflectProperties;->lazySoft(Lc93/a;)Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->_typeParameters:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    new-instance v0, Lkotlin/reflect/jvm/internal/DescriptorKCallable$$Lambda$5;

    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable$$Lambda$5;-><init>(Lkotlin/reflect/jvm/internal/DescriptorKCallable;)V

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/ReflectProperties;->lazySoft(Lc93/a;)Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->_absentArguments:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v1, Lkotlin/reflect/jvm/internal/DescriptorKCallable$$Lambda$6;

    invoke-direct {v1, p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable$$Lambda$6;-><init>(Lkotlin/reflect/jvm/internal/DescriptorKCallable;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->parametersNeedMFVCFlattening:Ll83/h;

    return-void
.end method

.method private static final _absentArguments$lambda$0(Lkotlin/reflect/jvm/internal/DescriptorKCallable;)[Ljava/lang/Object;
    .locals 8

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->getParameters()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->isSuspend()Z

    move-result v2

    add-int/2addr v2, v1

    iget-object v1, p0, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->parametersNeedMFVCFlattening:Ll83/h;

    invoke-interface {v1}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v4, v3

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lj93/q;

    invoke-interface {v5}, Lj93/q;->getKind()Lj93/p;

    move-result-object v6

    sget-object v7, Lj93/p;->z:Lj93/p;

    if-ne v6, v7, :cond_0

    invoke-direct {p0, v5}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->getParameterTypeSize(Lj93/q;)I

    move-result v5

    goto :goto_1

    :cond_0
    move v5, v3

    :goto_1
    add-int/2addr v4, v5

    goto :goto_0

    :cond_1
    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    instance-of v4, v1, Ljava/util/Collection;

    if-eqz v4, :cond_2

    move-object v4, v1

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_2

    move v4, v3

    goto :goto_3

    :cond_2
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v4, v3

    :cond_3
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lj93/q;

    invoke-interface {v5}, Lj93/q;->getKind()Lj93/p;

    move-result-object v5

    sget-object v6, Lj93/p;->z:Lj93/p;

    if-ne v5, v6, :cond_3

    add-int/lit8 v4, v4, 0x1

    if-ltz v4, :cond_4

    goto :goto_2

    :cond_4
    invoke-static {}, Lwb3/f;->c0()V

    const/4 p0, 0x0

    throw p0

    :cond_5
    :goto_3
    add-int/lit8 v4, v4, 0x1f

    div-int/lit8 v4, v4, 0x20

    add-int v1, v2, v4

    add-int/lit8 v1, v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lj93/q;

    invoke-interface {v5}, Lj93/q;->isOptional()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v5}, Lj93/q;->getType()Lj93/a0;

    move-result-object v6

    invoke-static {v6}, Lkotlin/reflect/jvm/internal/UtilKt;->isInlineClassType(Lj93/a0;)Z

    move-result v6

    if-nez v6, :cond_7

    invoke-interface {v5}, Lj93/q;->getIndex()I

    move-result v6

    invoke-interface {v5}, Lj93/q;->getType()Lj93/a0;

    move-result-object v5

    invoke-static {v5}, Lo73/a;->I(Lj93/a0;)Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lkotlin/reflect/jvm/internal/UtilKt;->defaultPrimitiveValue(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v5

    aput-object v5, v1, v6

    goto :goto_4

    :cond_7
    invoke-interface {v5}, Lj93/q;->isVararg()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v5}, Lj93/q;->getIndex()I

    move-result v6

    invoke-interface {v5}, Lj93/q;->getType()Lj93/a0;

    move-result-object v5

    invoke-direct {p0, v5}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->defaultEmptyArray(Lj93/a0;)Ljava/lang/Object;

    move-result-object v5

    aput-object v5, v1, v6

    goto :goto_4

    :cond_8
    move p0, v3

    :goto_5
    if-ge p0, v4, :cond_9

    add-int v0, v2, p0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v1, v0

    add-int/lit8 p0, p0, 0x1

    goto :goto_5

    :cond_9
    return-object v1
.end method

.method private static final _annotations$lambda$0(Lkotlin/reflect/jvm/internal/DescriptorKCallable;)Ljava/util/List;
    .locals 0

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->getDescriptor()Lr93/c;

    move-result-object p0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/UtilKt;->computeAnnotations(Ls93/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final _parameters$lambda$0(Lkotlin/reflect/jvm/internal/DescriptorKCallable;)Ljava/util/ArrayList;
    .locals 8

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->getDescriptor()Lr93/c;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/ReflectKCallableKt;->isBound(Lkotlin/reflect/jvm/internal/ReflectKCallable;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->getReceiverParameters()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_0
    invoke-interface {v0}, Lr93/b;->v()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    new-instance v4, Lkotlin/reflect/jvm/internal/DescriptorKParameter;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v5

    sget-object v6, Lj93/p;->z:Lj93/p;

    new-instance v7, Lkotlin/reflect/jvm/internal/DescriptorKCallable$$Lambda$10;

    invoke-direct {v7, v0, v3}, Lkotlin/reflect/jvm/internal/DescriptorKCallable$$Lambda$10;-><init>(Lr93/c;I)V

    invoke-direct {v4, p0, v5, v6, v7}, Lkotlin/reflect/jvm/internal/DescriptorKParameter;-><init>(Lkotlin/reflect/jvm/internal/DescriptorKCallable;ILj93/p;Lc93/a;)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->isAnnotationConstructor()Z

    move-result p0

    if-eqz p0, :cond_2

    instance-of p0, v0, Lha3/a;

    if-eqz p0, :cond_2

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p0

    const/4 v0, 0x1

    if-le p0, v0, :cond_2

    new-instance p0, Lkotlin/reflect/jvm/internal/DescriptorKCallable$_parameters$lambda$0$$inlined$sortBy$1;

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable$_parameters$lambda$0$$inlined$sortBy$1;-><init>()V

    invoke-static {v1, p0}, Lm83/w;->l0(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->trimToSize()V

    return-object v1
.end method

.method private static final _parameters$lambda$0$0(Lr93/c;I)Lr93/l0;
    .locals 0

    invoke-interface {p0}, Lr93/b;->v()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    const-string p1, "get(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lr93/l0;

    return-object p0
.end method

.method private static final _receiverParameters$lambda$0(Lkotlin/reflect/jvm/internal/DescriptorKCallable;)Ljava/util/ArrayList;
    .locals 8

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->getDescriptor()Lr93/c;

    move-result-object v1

    invoke-static {v1}, Lkotlin/reflect/jvm/internal/UtilKt;->getInstanceReceiverParameter(Lr93/b;)Lr93/q0;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v2, Lkotlin/reflect/jvm/internal/DescriptorKParameter;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    sget-object v4, Lj93/p;->w:Lj93/p;

    new-instance v5, Lkotlin/reflect/jvm/internal/DescriptorKCallable$$Lambda$7;

    invoke-direct {v5, v1}, Lkotlin/reflect/jvm/internal/DescriptorKCallable$$Lambda$7;-><init>(Lr93/q0;)V

    invoke-direct {v2, p0, v3, v4, v5}, Lkotlin/reflect/jvm/internal/DescriptorKParameter;-><init>(Lkotlin/reflect/jvm/internal/DescriptorKCallable;ILj93/p;Lc93/a;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->getDescriptor()Lr93/c;

    move-result-object v1

    invoke-direct {p0, v1}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->computeContextParameters(Lr93/c;)Ljava/util/List;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    new-instance v4, Lkotlin/reflect/jvm/internal/DescriptorKParameter;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    sget-object v6, Lj93/p;->x:Lj93/p;

    new-instance v7, Lkotlin/reflect/jvm/internal/DescriptorKCallable$$Lambda$8;

    invoke-direct {v7, v1, v3}, Lkotlin/reflect/jvm/internal/DescriptorKCallable$$Lambda$8;-><init>(Ljava/util/List;I)V

    invoke-direct {v4, p0, v5, v6, v7}, Lkotlin/reflect/jvm/internal/DescriptorKParameter;-><init>(Lkotlin/reflect/jvm/internal/DescriptorKCallable;ILj93/p;Lc93/a;)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->getDescriptor()Lr93/c;

    move-result-object v1

    invoke-interface {v1}, Lr93/b;->B()Lr93/q0;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v2, Lkotlin/reflect/jvm/internal/DescriptorKParameter;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    sget-object v4, Lj93/p;->y:Lj93/p;

    new-instance v5, Lkotlin/reflect/jvm/internal/DescriptorKCallable$$Lambda$9;

    invoke-direct {v5, v1}, Lkotlin/reflect/jvm/internal/DescriptorKCallable$$Lambda$9;-><init>(Lr93/q0;)V

    invoke-direct {v2, p0, v3, v4, v5}, Lkotlin/reflect/jvm/internal/DescriptorKParameter;-><init>(Lkotlin/reflect/jvm/internal/DescriptorKCallable;ILj93/p;Lc93/a;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    return-object v0
.end method

.method private static final _receiverParameters$lambda$0$0(Lr93/q0;)Lr93/l0;
    .locals 0

    return-object p0
.end method

.method private static final _receiverParameters$lambda$0$1(Ljava/util/List;I)Lr93/l0;
    .locals 0

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lr93/l0;

    return-object p0
.end method

.method private static final _receiverParameters$lambda$0$2(Lr93/q0;)Lr93/l0;
    .locals 0

    return-object p0
.end method

.method private static final _returnType$lambda$0(Lkotlin/reflect/jvm/internal/DescriptorKCallable;)Lwb3/h;
    .locals 3

    new-instance v0, Lwb3/h;

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->getDescriptor()Lr93/c;

    move-result-object v1

    invoke-interface {v1}, Lr93/b;->getReturnType()Llb3/y;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v2, Lkotlin/reflect/jvm/internal/DescriptorKCallable$$Lambda$11;

    invoke-direct {v2, p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable$$Lambda$11;-><init>(Lkotlin/reflect/jvm/internal/DescriptorKCallable;)V

    invoke-direct {v0, v1, v2}, Lwb3/h;-><init>(Llb3/y;Lc93/a;)V

    return-object v0
.end method

.method private static final _returnType$lambda$0$0(Lkotlin/reflect/jvm/internal/DescriptorKCallable;)Ljava/lang/reflect/Type;
    .locals 1

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->extractContinuationArgument()Ljava/lang/reflect/Type;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-interface {p0}, Lkotlin/reflect/jvm/internal/ReflectKCallable;->getCaller()Lm93/g;

    move-result-object p0

    invoke-interface {p0}, Lm93/g;->getReturnType()Ljava/lang/reflect/Type;

    move-result-object p0

    return-object p0

    :cond_0
    return-object v0
.end method

.method private static final _typeParameters$lambda$0(Lkotlin/reflect/jvm/internal/DescriptorKCallable;)Ljava/util/List;
    .locals 4

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->getDescriptor()Lr93/c;

    move-result-object v0

    invoke-interface {v0}, Lr93/b;->getTypeParameters()Ljava/util/List;

    move-result-object v0

    const-string v1, "getTypeParameters(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr93/x0;

    new-instance v3, Lkotlin/reflect/jvm/internal/KTypeParameterImpl;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v3, p0, v2}, Lkotlin/reflect/jvm/internal/KTypeParameterImpl;-><init>(Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;Lr93/x0;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public static synthetic accessor$DescriptorKCallable$lambda0(Lkotlin/reflect/jvm/internal/DescriptorKCallable;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->_annotations$lambda$0(Lkotlin/reflect/jvm/internal/DescriptorKCallable;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic accessor$DescriptorKCallable$lambda1(Lkotlin/reflect/jvm/internal/DescriptorKCallable;)Ljava/util/ArrayList;
    .locals 0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->_receiverParameters$lambda$0(Lkotlin/reflect/jvm/internal/DescriptorKCallable;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic accessor$DescriptorKCallable$lambda10(Lr93/c;I)Lr93/l0;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->_parameters$lambda$0$0(Lr93/c;I)Lr93/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic accessor$DescriptorKCallable$lambda11(Lkotlin/reflect/jvm/internal/DescriptorKCallable;)Ljava/lang/reflect/Type;
    .locals 0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->_returnType$lambda$0$0(Lkotlin/reflect/jvm/internal/DescriptorKCallable;)Ljava/lang/reflect/Type;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic accessor$DescriptorKCallable$lambda2(Lkotlin/reflect/jvm/internal/DescriptorKCallable;)Ljava/util/ArrayList;
    .locals 0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->_parameters$lambda$0(Lkotlin/reflect/jvm/internal/DescriptorKCallable;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic accessor$DescriptorKCallable$lambda3(Lkotlin/reflect/jvm/internal/DescriptorKCallable;)Lwb3/h;
    .locals 0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->_returnType$lambda$0(Lkotlin/reflect/jvm/internal/DescriptorKCallable;)Lwb3/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic accessor$DescriptorKCallable$lambda4(Lkotlin/reflect/jvm/internal/DescriptorKCallable;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->_typeParameters$lambda$0(Lkotlin/reflect/jvm/internal/DescriptorKCallable;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic accessor$DescriptorKCallable$lambda5(Lkotlin/reflect/jvm/internal/DescriptorKCallable;)[Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->_absentArguments$lambda$0(Lkotlin/reflect/jvm/internal/DescriptorKCallable;)[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic accessor$DescriptorKCallable$lambda6(Lkotlin/reflect/jvm/internal/DescriptorKCallable;)Z
    .locals 0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->parametersNeedMFVCFlattening$lambda$0(Lkotlin/reflect/jvm/internal/DescriptorKCallable;)Z

    move-result p0

    return p0
.end method

.method public static synthetic accessor$DescriptorKCallable$lambda7(Lr93/q0;)Lr93/l0;
    .locals 0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->_receiverParameters$lambda$0$0(Lr93/q0;)Lr93/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic accessor$DescriptorKCallable$lambda8(Ljava/util/List;I)Lr93/l0;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->_receiverParameters$lambda$0$1(Ljava/util/List;I)Lr93/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic accessor$DescriptorKCallable$lambda9(Lr93/q0;)Lr93/l0;
    .locals 0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->_receiverParameters$lambda$0$2(Lr93/q0;)Lr93/l0;

    move-result-object p0

    return-object p0
.end method

.method private final callAnnotationConstructor(Ljava/util/Map;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lj93/q;",
            "+",
            "Ljava/lang/Object;",
            ">;)TR;"
        }
    .end annotation

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->getParameters()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj93/q;

    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Annotation argument value cannot be null ("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-interface {v2}, Lj93/q;->isOptional()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, 0x0

    goto :goto_1

    :cond_2
    invoke-interface {v2}, Lj93/q;->isVararg()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Lj93/q;->getType()Lj93/a0;

    move-result-object v2

    invoke-direct {p0, v2}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->defaultEmptyArray(Lj93/a0;)Ljava/lang/Object;

    move-result-object v3

    :goto_1
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "No argument provided for a required parameter: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-interface {p0}, Lkotlin/reflect/jvm/internal/ReflectKCallable;->getDefaultCaller()Lm93/g;

    move-result-object p1

    if-eqz p1, :cond_5

    const/4 v0, 0x0

    :try_start_0
    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lm93/g;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Lkotlin/reflect/full/IllegalCallableAccessException;

    invoke-direct {v0, p1}, Lkotlin/reflect/full/IllegalCallableAccessException;-><init>(Ljava/lang/IllegalAccessException;)V

    throw v0

    :cond_5
    new-instance p1, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "This callable does not support a default call: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->getDescriptor()Lr93/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final computeContextParameters(Lr93/c;)Ljava/util/List;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr93/c;",
            ")",
            "Ljava/util/List<",
            "Lr93/a1;",
            ">;"
        }
    .end annotation

    move-object/from16 v1, p1

    instance-of v0, v1, Ljb3/t;

    const/4 v12, 0x0

    if-eqz v0, :cond_0

    move-object v0, v1

    check-cast v0, Ljb3/t;

    iget-object v2, v0, Ljb3/t;->f0:Lsa3/f;

    iget-object v0, v0, Ljb3/t;->e0:Lqa3/c0;

    iget-object v0, v0, Lqa3/c0;->O:Ljava/util/List;

    new-instance v3, Ll83/k;

    invoke-direct {v3, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    instance-of v0, v1, Ljb3/s;

    if-eqz v0, :cond_1

    move-object v0, v1

    check-cast v0, Ljb3/s;

    iget-object v2, v0, Ljb3/s;->c0:Lsa3/f;

    iget-object v0, v0, Ljb3/s;->b0:Lqa3/k0;

    iget-object v0, v0, Lqa3/k0;->O:Ljava/util/List;

    new-instance v3, Ll83/k;

    invoke-direct {v3, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    instance-of v0, v1, Lr93/m0;

    if-eqz v0, :cond_3

    move-object v0, v1

    check-cast v0, Lr93/m0;

    check-cast v0, Lu93/k0;

    invoke-virtual {v0}, Lu93/k0;->J0()Lr93/n0;

    move-result-object v0

    instance-of v2, v0, Ljb3/s;

    if-eqz v2, :cond_2

    check-cast v0, Ljb3/s;

    goto :goto_0

    :cond_2
    move-object v0, v12

    :goto_0
    if-eqz v0, :cond_3

    iget-object v2, v0, Ljb3/s;->c0:Lsa3/f;

    iget-object v0, v0, Ljb3/s;->b0:Lqa3/k0;

    iget-object v0, v0, Lqa3/k0;->O:Ljava/util/List;

    new-instance v3, Ll83/k;

    invoke-direct {v3, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    move-object v3, v12

    :goto_1
    if-nez v3, :cond_4

    sget-object v0, Lm83/y;->w:Lm83/y;

    return-object v0

    :cond_4
    iget-object v0, v3, Ll83/k;->w:Ljava/lang/Object;

    move-object v13, v0

    check-cast v13, Lsa3/f;

    iget-object v0, v3, Ll83/k;->x:Ljava/lang/Object;

    move-object v14, v0

    check-cast v14, Ljava/util/List;

    invoke-interface {v1}, Lr93/b;->c0()Ljava/util/List;

    move-result-object v0

    const-string v2, "getContextReceiverParameters(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v15, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v15, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    const/4 v0, 0x0

    move v3, v0

    :goto_2
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    add-int/lit8 v17, v3, 0x1

    if-ltz v3, :cond_5

    check-cast v0, Lr93/q0;

    move-object v2, v0

    new-instance v0, Lu93/w0;

    move-object v4, v2

    check-cast v4, Lal/a;

    invoke-virtual {v4}, Lal/a;->getAnnotations()Ls93/i;

    move-result-object v4

    invoke-interface {v14, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lqa3/e1;

    iget v5, v5, Lqa3/e1;->E:I

    invoke-interface {v13, v5}, Lsa3/f;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lva3/h;->d(Ljava/lang/String;)Lva3/h;

    move-result-object v5

    check-cast v2, Lu93/d;

    invoke-virtual {v2}, Lu93/d;->getType()Llb3/y;

    move-result-object v6

    const/4 v10, 0x0

    sget-object v11, Lr93/s0;->q:Lr93/v0;

    const/4 v2, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v0 .. v11}, Lu93/w0;-><init>(Lr93/b;Lr93/a1;ILs93/i;Lva3/h;Llb3/y;ZZZLlb3/y;Lr93/s0;)V

    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, p1

    move/from16 v3, v17

    goto :goto_2

    :cond_5
    invoke-static {}, Lwb3/f;->d0()V

    throw v12

    :cond_6
    return-object v15
.end method

.method private final defaultEmptyArray(Lj93/a0;)Ljava/lang/Object;
    .locals 3

    invoke-static {p1}, Lx43/j;->E(Lj93/a0;)Lj93/d;

    move-result-object p1

    invoke-static {p1}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "run(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_0
    new-instance v0, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot instantiate the default empty array of type "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", because it is not an array type"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final extractContinuationArgument()Ljava/lang/reflect/Type;
    .locals 4

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->isSuspend()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Lkotlin/reflect/jvm/internal/ReflectKCallable;->getCaller()Lm93/g;

    move-result-object v0

    invoke-interface {v0}, Lm93/g;->a()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v2, :cond_0

    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    const-class v3, Lq83/d;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v0

    const-string v2, "getActualTypeArguments(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lm83/n;->M0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/lang/reflect/WildcardType;

    if-eqz v2, :cond_2

    check-cast v0, Ljava/lang/reflect/WildcardType;

    goto :goto_2

    :cond_2
    move-object v0, v1

    :goto_2
    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {v0}, Lm83/n;->s0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Type;

    return-object v0

    :cond_3
    return-object v1
.end method

.method private final getAbsentArguments()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->_absentArguments:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    return-object v0
.end method

.method private final getParameterTypeSize(Lj93/q;)I
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->parametersNeedMFVCFlattening:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lj93/q;->getType()Lj93/a0;

    move-result-object v0

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/UtilKt;->getNeedsMultiFieldValueClassFlattening(Lj93/a0;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lj93/q;->getType()Lj93/a0;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.types.DescriptorKType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lwb3/h;

    invoke-virtual {p1}, Lwb3/h;->l()Llb3/y;

    move-result-object p1

    invoke-static {p1}, Lse/a;->t(Llb3/y;)Llb3/c0;

    move-result-object p1

    invoke-static {p1}, Lhg3/i;->S(Llb3/c0;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Check if parametersNeedMFVCFlattening is true before"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static final parametersNeedMFVCFlattening$lambda$0(Lkotlin/reflect/jvm/internal/DescriptorKCallable;)Z
    .locals 2

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->getParameters()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    instance-of v0, p0, Ljava/util/Collection;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj93/q;

    invoke-interface {v0}, Lj93/q;->getType()Lj93/a0;

    move-result-object v0

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/UtilKt;->getNeedsMultiFieldValueClassFlattening(Lj93/a0;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_2
    return v1
.end method


# virtual methods
.method public varargs call([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Object;",
            ")TR;"
        }
    .end annotation

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-interface {p0}, Lkotlin/reflect/jvm/internal/ReflectKCallable;->getCaller()Lm93/g;

    move-result-object v0

    invoke-interface {v0, p1}, Lm93/g;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Lkotlin/reflect/full/IllegalCallableAccessException;

    invoke-direct {v0, p1}, Lkotlin/reflect/full/IllegalCallableAccessException;-><init>(Ljava/lang/IllegalAccessException;)V

    throw v0
.end method

.method public callBy(Ljava/util/Map;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lj93/q;",
            "+",
            "Ljava/lang/Object;",
            ">;)TR;"
        }
    .end annotation

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->isAnnotationConstructor()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->callAnnotationConstructor(Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->callDefaultMethod(Ljava/util/Map;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public callDefaultMethod(Ljava/util/Map;Lq83/d;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lj93/q;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lq83/d<",
            "*>;)TR;"
        }
    .end annotation

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->getParameters()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    :try_start_0
    invoke-interface {p0}, Lkotlin/reflect/jvm/internal/ReflectKCallable;->getCaller()Lm93/g;

    move-result-object p1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->isSuspend()Z

    move-result v0

    if-eqz v0, :cond_0

    new-array v0, v3, [Lq83/d;

    aput-object p2, v0, v2

    goto :goto_0

    :cond_0
    new-array v0, v2, [Lq83/d;

    :goto_0
    invoke-interface {p1, v0}, Lm93/g;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance p2, Lkotlin/reflect/full/IllegalCallableAccessException;

    invoke-direct {p2, p1}, Lkotlin/reflect/full/IllegalCallableAccessException;-><init>(Ljava/lang/IllegalAccessException;)V

    throw p2

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->isSuspend()Z

    move-result v4

    add-int/2addr v4, v1

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->getAbsentArguments()[Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->isSuspend()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    aput-object p2, v1, v5

    :cond_2
    iget-object p2, p0, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->parametersNeedMFVCFlattening:Ll83/h;

    invoke-interface {p2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v5, v2

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lj93/q;

    if-eqz p2, :cond_4

    invoke-direct {p0, v6}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->getParameterTypeSize(Lj93/q;)I

    move-result v7

    goto :goto_2

    :cond_4
    move v7, v3

    :goto_2
    invoke-interface {p1, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-interface {v6}, Lj93/q;->getIndex()I

    move-result v8

    invoke-interface {p1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    aput-object v9, v1, v8

    goto :goto_4

    :cond_5
    invoke-interface {v6}, Lj93/q;->isOptional()Z

    move-result v8

    if-eqz v8, :cond_8

    const-string v2, "null cannot be cast to non-null type kotlin.Int"

    if-eqz p2, :cond_6

    add-int v8, v5, v7

    move v9, v5

    :goto_3
    if-ge v9, v8, :cond_7

    div-int/lit8 v10, v9, 0x20

    add-int/2addr v10, v4

    aget-object v11, v1, v10

    invoke-static {v11, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Ljava/lang/Integer;

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    rem-int/lit8 v12, v9, 0x20

    shl-int v12, v3, v12

    or-int/2addr v11, v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    aput-object v11, v1, v10

    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    :cond_6
    div-int/lit8 v8, v5, 0x20

    add-int/2addr v8, v4

    aget-object v9, v1, v8

    invoke-static {v9, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v2

    rem-int/lit8 v9, v5, 0x20

    shl-int v9, v3, v9

    or-int/2addr v2, v9

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v8

    :cond_7
    move v2, v3

    goto :goto_4

    :cond_8
    invoke-interface {v6}, Lj93/q;->isVararg()Z

    move-result v8

    if-eqz v8, :cond_9

    :goto_4
    invoke-interface {v6}, Lj93/q;->getKind()Lj93/p;

    move-result-object v6

    sget-object v8, Lj93/p;->z:Lj93/p;

    if-ne v6, v8, :cond_3

    add-int/2addr v5, v7

    goto :goto_1

    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "No argument provided for a required parameter: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    if-nez v2, :cond_b

    :try_start_1
    invoke-interface {p0}, Lkotlin/reflect/jvm/internal/ReflectKCallable;->getCaller()Lm93/g;

    move-result-object p1

    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    const-string v0, "copyOf(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Lm93/g;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    return-object p1

    :catch_1
    move-exception p1

    new-instance p2, Lkotlin/reflect/full/IllegalCallableAccessException;

    invoke-direct {p2, p1}, Lkotlin/reflect/full/IllegalCallableAccessException;-><init>(Ljava/lang/IllegalAccessException;)V

    throw p2

    :cond_b
    invoke-interface {p0}, Lkotlin/reflect/jvm/internal/ReflectKCallable;->getDefaultCaller()Lm93/g;

    move-result-object p1

    if-eqz p1, :cond_c

    :try_start_2
    invoke-interface {p1, v1}, Lm93/g;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_2

    return-object p1

    :catch_2
    move-exception p1

    new-instance p2, Lkotlin/reflect/full/IllegalCallableAccessException;

    invoke-direct {p2, p1}, Lkotlin/reflect/full/IllegalCallableAccessException;-><init>(Ljava/lang/IllegalAccessException;)V

    throw p2

    :cond_c
    new-instance p1, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "This callable does not support a default call: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->getDescriptor()Lr93/c;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getAnnotations()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->_annotations:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;->invoke()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "invoke(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public abstract getDescriptor()Lr93/c;
.end method

.method public abstract synthetic getName()Ljava/lang/String;
.end method

.method public getParameters()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lj93/q;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->_parameters:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;->invoke()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "invoke(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public getReceiverParameters()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lj93/q;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->_receiverParameters:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;->invoke()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "invoke(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public getReturnType()Lj93/a0;
    .locals 2

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->_returnType:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;->invoke()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "invoke(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lj93/a0;

    return-object v0
.end method

.method public getTypeParameters()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lj93/b0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->_typeParameters:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;->invoke()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "invoke(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public getVisibility()Lj93/f0;
    .locals 2

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->getDescriptor()Lr93/c;

    move-result-object v0

    invoke-interface {v0}, Lr93/z;->getVisibility()Lr93/r;

    move-result-object v0

    const-string v1, "getVisibility(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/UtilKt;->toKVisibility(Lr93/r;)Lj93/f0;

    move-result-object v0

    return-object v0
.end method

.method public isAbstract()Z
    .locals 2

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->getDescriptor()Lr93/c;

    move-result-object v0

    invoke-interface {v0}, Lr93/z;->k()Lr93/a0;

    move-result-object v0

    sget-object v1, Lr93/a0;->E:Lr93/a0;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isAnnotationConstructor()Z
    .locals 2

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "<init>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Lkotlin/reflect/jvm/internal/ReflectKCallable;->getContainer()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->getJClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isAnnotation()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isFinal()Z
    .locals 2

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->getDescriptor()Lr93/c;

    move-result-object v0

    invoke-interface {v0}, Lr93/z;->k()Lr93/a0;

    move-result-object v0

    sget-object v1, Lr93/a0;->x:Lr93/a0;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isOpen()Z
    .locals 2

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->getDescriptor()Lr93/c;

    move-result-object v0

    invoke-interface {v0}, Lr93/z;->k()Lr93/a0;

    move-result-object v0

    sget-object v1, Lr93/a0;->z:Lr93/a0;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public abstract synthetic isSuspend()Z
.end method
