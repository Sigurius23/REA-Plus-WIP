.class public final Lkotlin/reflect/jvm/internal/DescriptorKFunction;
.super Lkotlin/reflect/jvm/internal/DescriptorKCallable;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/internal/g;
.implements Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;
.implements Lkotlin/reflect/jvm/internal/ReflectKFunction;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/reflect/jvm/internal/DescriptorKCallable<",
        "Ljava/lang/Object;",
        ">;",
        "Lkotlin/jvm/internal/g;",
        "Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;",
        "Lkotlin/reflect/jvm/internal/ReflectKFunction;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008!\u0008\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u00020\u0005B5\u0008\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\n\u001a\u00020\u0008\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fB\u0019\u0008\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u0011B+\u0008\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\n\u001a\u00020\u0008\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0096\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\u0008!\u0010\"J#\u0010%\u001a\u0006\u0012\u0002\u0008\u00030$2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008%\u0010&J\u0017\u0010(\u001a\u00020\'2\u0006\u0010 \u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\u0008(\u0010)J\u0017\u0010*\u001a\u00020\'2\u0006\u0010 \u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\u0008*\u0010)J5\u0010.\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030+0-2\n\u0010 \u001a\u0006\u0012\u0002\u0008\u00030+2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008.\u0010/R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00100\u001a\u0004\u00081\u00102R\u001a\u0010\n\u001a\u00020\u00088\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u00103\u001a\u0004\u00084\u0010\u001cR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u00105\u001a\u0004\u00086\u00107R\u001b\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00088\u00109\u001a\u0004\u0008:\u0010;R\u001f\u0010@\u001a\u0006\u0012\u0002\u0008\u00030$8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008<\u0010=\u001a\u0004\u0008>\u0010?R!\u0010C\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010$8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008A\u0010=\u001a\u0004\u0008B\u0010?R\u0014\u0010\t\u001a\u00020\u00088VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008D\u0010\u001cR\u0014\u0010F\u001a\u00020\u00188VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008E\u0010\u001aR\u0014\u0010G\u001a\u00020\u00158VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008G\u0010HR\u0014\u0010I\u001a\u00020\u00158VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008I\u0010HR\u0014\u0010J\u001a\u00020\u00158VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008J\u0010HR\u0014\u0010K\u001a\u00020\u00158VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008K\u0010HR\u0014\u0010L\u001a\u00020\u00158VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008L\u0010HR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008M\u00107\u00a8\u0006N"
    }
    d2 = {
        "Lkotlin/reflect/jvm/internal/DescriptorKFunction;",
        "Lkotlin/reflect/jvm/internal/DescriptorKCallable;",
        "",
        "Lkotlin/reflect/jvm/internal/ReflectKFunction;",
        "Lkotlin/jvm/internal/g;",
        "Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;",
        "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;",
        "container",
        "",
        "name",
        "signature",
        "Lr93/w;",
        "descriptorInitialValue",
        "rawBoundReceiver",
        "<init>",
        "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Ljava/lang/Object;)V",
        "descriptor",
        "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;)V",
        "boundReceiver",
        "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "",
        "hashCode",
        "()I",
        "toString",
        "()Ljava/lang/String;",
        "getFunctionWithDefaultParametersForValueClassOverride",
        "(Lr93/w;)Lr93/w;",
        "Ljava/lang/reflect/Method;",
        "member",
        "useBoxedBoundReceiver",
        "(Ljava/lang/reflect/Method;)Z",
        "isCallByToValueClassMangledMethod",
        "Lm93/g;",
        "createStaticMethodCaller",
        "(Ljava/lang/reflect/Method;Z)Lm93/g;",
        "Lm93/x;",
        "createJvmStaticInObjectCaller",
        "(Ljava/lang/reflect/Method;)Lm93/x;",
        "createInstanceMethodCaller",
        "Ljava/lang/reflect/Constructor;",
        "isDefault",
        "Lm93/y;",
        "createConstructorCaller",
        "(Ljava/lang/reflect/Constructor;Lr93/w;Z)Lm93/y;",
        "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;",
        "getContainer",
        "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;",
        "Ljava/lang/String;",
        "getSignature",
        "Ljava/lang/Object;",
        "getRawBoundReceiver",
        "()Ljava/lang/Object;",
        "descriptor$delegate",
        "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;",
        "getDescriptor",
        "()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;",
        "caller$delegate",
        "Ll83/h;",
        "getCaller",
        "()Lm93/g;",
        "caller",
        "defaultCaller$delegate",
        "getDefaultCaller",
        "defaultCaller",
        "getName",
        "getArity",
        "arity",
        "isInline",
        "()Z",
        "isExternal",
        "isOperator",
        "isInfix",
        "isSuspend",
        "getBoundReceiver",
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
.field static final synthetic $$delegatedProperties:[Lj93/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lj93/z;"
        }
    .end annotation
.end field


# instance fields
.field private final caller$delegate:Ll83/h;

.field private final container:Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;

.field private final defaultCaller$delegate:Ll83/h;

.field private final descriptor$delegate:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

.field private final rawBoundReceiver:Ljava/lang/Object;

.field private final signature:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/x;

    const-class v1, Lkotlin/reflect/jvm/internal/DescriptorKFunction;

    const-string v2, "descriptor"

    const-string v3, "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/x;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->property1(Lkotlin/jvm/internal/w;)Lj93/w;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lj93/z;

    aput-object v0, v1, v4

    sput-object v1, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->$$delegatedProperties:[Lj93/z;

    return-void
.end method

.method public constructor <init>(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 7

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signature"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v6, p4

    .line 8
    invoke-direct/range {v1 .. v6}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;-><init>(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lr93/w;Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lr93/w;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;-><init>()V

    .line 2
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->container:Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;

    .line 3
    iput-object p3, p0, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->signature:Ljava/lang/String;

    .line 4
    iput-object p5, p0, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->rawBoundReceiver:Ljava/lang/Object;

    .line 5
    new-instance p1, Lkotlin/reflect/jvm/internal/DescriptorKFunction$$Lambda$0;

    invoke-direct {p1, p0, p2}, Lkotlin/reflect/jvm/internal/DescriptorKFunction$$Lambda$0;-><init>(Lkotlin/reflect/jvm/internal/DescriptorKFunction;Ljava/lang/String;)V

    invoke-static {p4, p1}, Lkotlin/reflect/jvm/internal/ReflectProperties;->lazySoft(Ljava/lang/Object;Lc93/a;)Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    move-result-object p1

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->descriptor$delegate:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    .line 6
    sget-object p1, Ll83/i;->x:Ll83/i;

    new-instance p2, Lkotlin/reflect/jvm/internal/DescriptorKFunction$$Lambda$1;

    invoke-direct {p2, p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction$$Lambda$1;-><init>(Lkotlin/reflect/jvm/internal/DescriptorKFunction;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->caller$delegate:Ll83/h;

    .line 7
    new-instance p2, Lkotlin/reflect/jvm/internal/DescriptorKFunction$$Lambda$2;

    invoke-direct {p2, p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction$$Lambda$2;-><init>(Lkotlin/reflect/jvm/internal/DescriptorKFunction;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->defaultCaller$delegate:Ll83/h;

    return-void
.end method

.method public constructor <init>(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lr93/w;)V
    .locals 7

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    move-object v0, p2

    check-cast v0, Lu93/n;

    invoke-virtual {v0}, Lu93/n;->getName()Lva3/h;

    move-result-object v0

    invoke-virtual {v0}, Lva3/h;->b()Ljava/lang/String;

    move-result-object v3

    const-string v0, "asString(...)"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    sget-object v0, Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;->INSTANCE:Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;

    invoke-virtual {v0, p2}, Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;->mapSignature(Lr93/w;)Lkotlin/reflect/jvm/internal/JvmFunctionSignature;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/JvmFunctionSignature;->asString()Ljava/lang/String;

    move-result-object v4

    .line 11
    sget-object v6, Lkotlin/jvm/internal/c;->NO_RECEIVER:Ljava/lang/Object;

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    .line 12
    invoke-direct/range {v1 .. v6}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;-><init>(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lr93/w;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic accessor$DescriptorKFunction$lambda0(Lkotlin/reflect/jvm/internal/DescriptorKFunction;Ljava/lang/String;)Lr93/w;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->descriptor_delegate$lambda$0(Lkotlin/reflect/jvm/internal/DescriptorKFunction;Ljava/lang/String;)Lr93/w;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic accessor$DescriptorKFunction$lambda1(Lkotlin/reflect/jvm/internal/DescriptorKFunction;)Lm93/g;
    .locals 0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->caller_delegate$lambda$0(Lkotlin/reflect/jvm/internal/DescriptorKFunction;)Lm93/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic accessor$DescriptorKFunction$lambda2(Lkotlin/reflect/jvm/internal/DescriptorKFunction;)Lm93/g;
    .locals 0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->defaultCaller_delegate$lambda$0(Lkotlin/reflect/jvm/internal/DescriptorKFunction;)Lm93/g;

    move-result-object p0

    return-object p0
.end method

.method private static final caller_delegate$lambda$0(Lkotlin/reflect/jvm/internal/DescriptorKFunction;)Lm93/g;
    .locals 9

    sget-object v0, Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;->INSTANCE:Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getDescriptor()Lr93/w;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;->mapSignature(Lr93/w;)Lkotlin/reflect/jvm/internal/JvmFunctionSignature;

    move-result-object v0

    instance-of v1, v0, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;

    const/16 v2, 0xa

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->isAnnotationConstructor()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getContainer()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->getJClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->getParameters()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {p0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj93/q;

    invoke-interface {v2}, Lj93/q;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    sget-object p0, Lm93/a;->x:Lm93/a;

    sget-object v2, Lm93/b;->w:Lm93/b;

    new-instance v2, Lm93/c;

    invoke-direct {v2, v0, v1, p0}, Lm93/c;-><init>(Ljava/lang/Class;Ljava/util/ArrayList;Lm93/a;)V

    return-object v2

    :cond_1
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getContainer()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;

    move-result-object v1

    check-cast v0, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;->getConstructorDesc()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->findConstructorBySignature(Ljava/lang/String;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    goto/16 :goto_1

    :cond_2
    instance-of v1, v0, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getDescriptor()Lr93/w;

    move-result-object v1

    invoke-interface {v1}, Lr93/k;->g()Lr93/k;

    move-result-object v2

    const-string v3, "getContainingDeclaration(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lya3/h;->c(Lr93/k;)Z

    move-result v2

    if-eqz v2, :cond_3

    instance-of v2, v1, Lr93/j;

    if-eqz v2, :cond_3

    check-cast v1, Lr93/j;

    invoke-interface {v1}, Lr93/j;->O()Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v1, Lm93/d0;

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getDescriptor()Lr93/w;

    move-result-object v2

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getContainer()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;

    move-result-object v3

    check-cast v0, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;->getMethodDesc()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getDescriptor()Lr93/w;

    move-result-object p0

    invoke-interface {p0}, Lr93/b;->v()Ljava/util/List;

    move-result-object p0

    const-string v4, "getValueParameters(...)"

    invoke-static {p0, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v2, v3, v0, p0}, Lm93/d0;-><init>(Lr93/w;Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/util/List;)V

    return-object v1

    :cond_3
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getContainer()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;

    move-result-object v1

    check-cast v0, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;->getMethodName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;->getMethodDesc()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->findMethodBySignature(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v0

    goto :goto_1

    :cond_4
    instance-of v1, v0, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaMethod;

    const-string v3, "null cannot be cast to non-null type java.lang.reflect.Member"

    if-eqz v1, :cond_5

    check-cast v0, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaMethod;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaMethod;->getMethod()Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    instance-of v1, v0, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;

    if-eqz v1, :cond_a

    check-cast v0, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;->getConstructor()Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    instance-of v1, v0, Ljava/lang/reflect/Constructor;

    const/4 v2, 0x0

    if-eqz v1, :cond_6

    check-cast v0, Ljava/lang/reflect/Constructor;

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getDescriptor()Lr93/w;

    move-result-object v1

    invoke-direct {p0, v0, v1, v2}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->createConstructorCaller(Ljava/lang/reflect/Constructor;Lr93/w;Z)Lm93/y;

    move-result-object v0

    goto :goto_2

    :cond_6
    instance-of v1, v0, Ljava/lang/reflect/Method;

    if-eqz v1, :cond_9

    check-cast v0, Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v1

    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v1

    if-nez v1, :cond_7

    invoke-direct {p0, v0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->createInstanceMethodCaller(Ljava/lang/reflect/Method;)Lm93/x;

    move-result-object v0

    goto :goto_2

    :cond_7
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getDescriptor()Lr93/w;

    move-result-object v1

    check-cast v1, Lal/a;

    invoke-virtual {v1}, Lal/a;->getAnnotations()Ls93/i;

    move-result-object v1

    invoke-static {}, Lkotlin/reflect/jvm/internal/UtilKt;->getJVM_STATIC()Lva3/e;

    move-result-object v3

    invoke-interface {v1, v3}, Ls93/i;->T(Lva3/e;)Ls93/b;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-direct {p0, v0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->createJvmStaticInObjectCaller(Ljava/lang/reflect/Method;)Lm93/x;

    move-result-object v0

    goto :goto_2

    :cond_8
    invoke-direct {p0, v0, v2}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->createStaticMethodCaller(Ljava/lang/reflect/Method;Z)Lm93/g;

    move-result-object v0

    :goto_2
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getDescriptor()Lr93/w;

    move-result-object p0

    invoke-static {v0, p0, v2}, Lhg3/i;->B(Lm93/g;Lr93/c;Z)Lm93/g;

    move-result-object p0

    return-object p0

    :cond_9
    new-instance v1, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Could not compute caller for function: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getDescriptor()Lr93/w;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " (member = "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_a
    instance-of v1, v0, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;

    if-eqz v1, :cond_c

    check-cast v0, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;->getMethods()Ljava/util/List;

    move-result-object v8

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getContainer()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;

    move-result-object p0

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->getJClass()Ljava/lang/Class;

    move-result-object v4

    move-object p0, v8

    check-cast p0, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {p0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_b
    sget-object v6, Lm93/a;->x:Lm93/a;

    sget-object v7, Lm93/b;->w:Lm93/b;

    new-instance v3, Lm93/c;

    invoke-direct/range {v3 .. v8}, Lm93/c;-><init>(Ljava/lang/Class;Ljava/util/ArrayList;Lm93/a;Lm93/b;Ljava/util/List;)V

    return-object v3

    :cond_c
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private final createConstructorCaller(Ljava/lang/reflect/Constructor;Lr93/w;Z)Lm93/y;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor<",
            "*>;",
            "Lr93/w;",
            "Z)",
            "Lm93/y;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p3, :cond_8

    const-string p3, "descriptor"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p3, p2, Lu93/j;

    if-eqz p3, :cond_0

    check-cast p2, Lu93/j;

    goto :goto_0

    :cond_0
    move-object p2, v0

    :goto_0
    if-nez p2, :cond_1

    goto/16 :goto_1

    :cond_1
    move-object p3, p2

    check-cast p3, Lu93/x;

    invoke-virtual {p3}, Lu93/x;->getVisibility()Lr93/r;

    move-result-object v1

    invoke-static {v1}, Lr93/q;->e(Lr93/r;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p2}, Lu93/j;->P()Lr93/e;

    move-result-object v1

    const-string v2, "getConstructedClass(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lya3/h;->e(Lr93/k;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p2}, Lu93/j;->P()Lr93/e;

    move-result-object p2

    invoke-static {p2}, Lya3/f;->o(Lr93/i;)Z

    move-result p2

    if-eqz p2, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {p3}, Lu93/x;->v()Ljava/util/List;

    move-result-object p2

    const-string p3, "getValueParameters(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Iterable;

    instance-of p3, p2, Ljava/util/Collection;

    if-eqz p3, :cond_5

    move-object p3, p2

    check-cast p3, Ljava/util/Collection;

    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_5

    goto :goto_1

    :cond_5
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_8

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lr93/a1;

    check-cast p3, Lu93/x0;

    invoke-virtual {p3}, Lu93/x0;->getType()Llb3/y;

    move-result-object p3

    const-string v1, "getType(...)"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3}, Lpf/c;->T(Llb3/y;)Z

    move-result p3

    if-eqz p3, :cond_6

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/ReflectKCallableKt;->isBound(Lkotlin/reflect/jvm/internal/ReflectKCallable;)Z

    move-result p2

    if-eqz p2, :cond_7

    new-instance p2, Lm93/h;

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getBoundReceiver()Ljava/lang/Object;

    move-result-object p3

    const/4 v0, 0x0

    invoke-direct {p2, p1, p3, v0}, Lm93/h;-><init>(Ljava/lang/reflect/Constructor;Ljava/lang/Object;I)V

    return-object p2

    :cond_7
    new-instance p2, Lm93/i;

    invoke-direct {p2, p1}, Lm93/i;-><init>(Ljava/lang/reflect/Constructor;)V

    return-object p2

    :cond_8
    :goto_1
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/ReflectKCallableKt;->isBound(Lkotlin/reflect/jvm/internal/ReflectKCallable;)Z

    move-result p2

    if-eqz p2, :cond_9

    new-instance p2, Lm93/h;

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getBoundReceiver()Ljava/lang/Object;

    move-result-object p3

    const/4 v0, 0x1

    invoke-direct {p2, p1, p3, v0}, Lm93/h;-><init>(Ljava/lang/reflect/Constructor;Ljava/lang/Object;I)V

    return-object p2

    :cond_9
    new-instance p2, Lm93/j;

    const-string p3, "constructor"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    move-result-object p3

    const-string v1, "getDeclaringClass(...)"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-virtual {v1}, Ljava/lang/Class;->getModifiers()I

    move-result v1

    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v1

    if-nez v1, :cond_a

    move-object v0, v2

    :cond_a
    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    move-result-object v1

    const-string v2, "getGenericParameterTypes(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p1, p3, v0, v1}, Lm93/y;-><init>(Ljava/lang/reflect/Member;Ljava/lang/reflect/Type;Ljava/lang/Class;[Ljava/lang/reflect/Type;)V

    return-object p2
.end method

.method private final createInstanceMethodCaller(Ljava/lang/reflect/Method;)Lm93/x;
    .locals 2

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/ReflectKCallableKt;->isBound(Lkotlin/reflect/jvm/internal/ReflectKCallable;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lm93/s;

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getBoundReceiver()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lm93/s;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    return-object v0

    :cond_0
    new-instance v0, Lm93/w;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lm93/w;-><init>(Ljava/lang/reflect/Method;I)V

    return-object v0
.end method

.method private final createJvmStaticInObjectCaller(Ljava/lang/reflect/Method;)Lm93/x;
    .locals 2

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/ReflectKCallableKt;->isBound(Lkotlin/reflect/jvm/internal/ReflectKCallable;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lm93/t;

    invoke-direct {v0, p1}, Lm93/t;-><init>(Ljava/lang/reflect/Method;)V

    return-object v0

    :cond_0
    new-instance v0, Lm93/w;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lm93/w;-><init>(Ljava/lang/reflect/Method;I)V

    return-object v0
.end method

.method private final createStaticMethodCaller(Ljava/lang/reflect/Method;Z)Lm93/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Method;",
            "Z)",
            "Lm93/g;"
        }
    .end annotation

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/ReflectKCallableKt;->isBound(Lkotlin/reflect/jvm/internal/ReflectKCallable;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lm93/u;

    invoke-direct {p0, p1}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->useBoxedBoundReceiver(Ljava/lang/reflect/Method;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getRawBoundReceiver()Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getBoundReceiver()Ljava/lang/Object;

    move-result-object v1

    :goto_0
    invoke-direct {v0, p1, p2, v1}, Lm93/u;-><init>(Ljava/lang/reflect/Method;ZLjava/lang/Object;)V

    return-object v0

    :cond_1
    new-instance p2, Lm93/w;

    const/4 v0, 0x2

    invoke-direct {p2, p1, v0}, Lm93/w;-><init>(Ljava/lang/reflect/Method;I)V

    return-object p2
.end method

.method private static final defaultCaller_delegate$lambda$0(Lkotlin/reflect/jvm/internal/DescriptorKFunction;)Lm93/g;
    .locals 9

    sget-object v0, Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;->INSTANCE:Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getDescriptor()Lr93/w;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;->mapSignature(Lr93/w;)Lkotlin/reflect/jvm/internal/JvmFunctionSignature;

    move-result-object v1

    instance-of v2, v1, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getDescriptor()Lr93/w;

    move-result-object v2

    invoke-interface {v2}, Lr93/k;->g()Lr93/k;

    move-result-object v5

    const-string v6, "getContainingDeclaration(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5}, Lya3/h;->c(Lr93/k;)Z

    move-result v5

    if-eqz v5, :cond_1

    instance-of v5, v2, Lr93/j;

    if-eqz v5, :cond_1

    check-cast v2, Lr93/j;

    invoke-interface {v2}, Lr93/j;->O()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getDescriptor()Lr93/w;

    move-result-object p0

    invoke-interface {p0}, Lr93/k;->g()Lr93/k;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " cannot have default arguments"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getDescriptor()Lr93/w;

    move-result-object v2

    invoke-direct {p0, v2}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getFunctionWithDefaultParametersForValueClassOverride(Lr93/w;)Lr93/w;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v0, v2}, Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;->mapSignature(Lr93/w;)Lkotlin/reflect/jvm/internal/JvmFunctionSignature;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getContainer()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;

    move-result-object v1

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;->getMethodName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;->getMethodDesc()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0, v4}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->findDefaultMethod(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/reflect/Method;

    move-result-object v0

    goto/16 :goto_3

    :cond_2
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getContainer()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;

    move-result-object v0

    check-cast v1, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;

    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;->getMethodName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;->getMethodDesc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getCaller()Lm93/g;

    move-result-object v5

    invoke-interface {v5}, Lm93/g;->getMember()Ljava/lang/reflect/Member;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v5}, Ljava/lang/reflect/Member;->getModifiers()I

    move-result v5

    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v5

    xor-int/2addr v5, v4

    invoke-virtual {v0, v2, v1, v5}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->findDefaultMethod(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/reflect/Method;

    move-result-object v0

    goto/16 :goto_3

    :cond_3
    instance-of v0, v1, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;

    const/16 v2, 0xa

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->isAnnotationConstructor()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getContainer()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->getJClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->getParameters()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {p0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj93/q;

    invoke-interface {v2}, Lj93/q;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    sget-object p0, Lm93/a;->w:Lm93/a;

    sget-object v2, Lm93/b;->w:Lm93/b;

    new-instance v2, Lm93/c;

    invoke-direct {v2, v0, v1, p0}, Lm93/c;-><init>(Ljava/lang/Class;Ljava/util/ArrayList;Lm93/a;)V

    return-object v2

    :cond_5
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getContainer()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;

    move-result-object v0

    check-cast v1, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;

    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;->getConstructorDesc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->findDefaultConstructor(Ljava/lang/String;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    goto :goto_3

    :cond_6
    instance-of v0, v1, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;

    if-eqz v0, :cond_8

    check-cast v1, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;

    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;->getMethods()Ljava/util/List;

    move-result-object v8

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getContainer()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;

    move-result-object p0

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->getJClass()Ljava/lang/Class;

    move-result-object v4

    move-object p0, v8

    check-cast p0, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {p0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    sget-object v6, Lm93/a;->w:Lm93/a;

    sget-object v7, Lm93/b;->w:Lm93/b;

    new-instance v3, Lm93/c;

    invoke-direct/range {v3 .. v8}, Lm93/c;-><init>(Ljava/lang/Class;Ljava/util/ArrayList;Lm93/a;Lm93/b;Ljava/util/List;)V

    return-object v3

    :cond_8
    move-object v0, v3

    :goto_3
    instance-of v1, v0, Ljava/lang/reflect/Constructor;

    if-eqz v1, :cond_9

    check-cast v0, Ljava/lang/reflect/Constructor;

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getDescriptor()Lr93/w;

    move-result-object v1

    invoke-direct {p0, v0, v1, v4}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->createConstructorCaller(Ljava/lang/reflect/Constructor;Lr93/w;Z)Lm93/y;

    move-result-object v0

    goto :goto_4

    :cond_9
    instance-of v1, v0, Ljava/lang/reflect/Method;

    if-eqz v1, :cond_b

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getDescriptor()Lr93/w;

    move-result-object v1

    check-cast v1, Lal/a;

    invoke-virtual {v1}, Lal/a;->getAnnotations()Ls93/i;

    move-result-object v1

    invoke-static {}, Lkotlin/reflect/jvm/internal/UtilKt;->getJVM_STATIC()Lva3/e;

    move-result-object v2

    invoke-interface {v1, v2}, Ls93/i;->T(Lva3/e;)Ls93/b;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getDescriptor()Lr93/w;

    move-result-object v1

    invoke-interface {v1}, Lr93/k;->g()Lr93/k;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lr93/e;

    invoke-interface {v1}, Lr93/e;->N()Z

    move-result v1

    if-nez v1, :cond_a

    check-cast v0, Ljava/lang/reflect/Method;

    invoke-direct {p0, v0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->createJvmStaticInObjectCaller(Ljava/lang/reflect/Method;)Lm93/x;

    move-result-object v0

    goto :goto_4

    :cond_a
    check-cast v0, Ljava/lang/reflect/Method;

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getCaller()Lm93/g;

    move-result-object v1

    invoke-interface {v1}, Lm93/g;->b()Z

    move-result v1

    invoke-direct {p0, v0, v1}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->createStaticMethodCaller(Ljava/lang/reflect/Method;Z)Lm93/g;

    move-result-object v0

    goto :goto_4

    :cond_b
    move-object v0, v3

    :goto_4
    if-eqz v0, :cond_c

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getDescriptor()Lr93/w;

    move-result-object p0

    invoke-static {v0, p0, v4}, Lhg3/i;->B(Lm93/g;Lr93/c;Z)Lm93/g;

    move-result-object p0

    return-object p0

    :cond_c
    return-object v3
.end method

.method private static final descriptor_delegate$lambda$0(Lkotlin/reflect/jvm/internal/DescriptorKFunction;Ljava/lang/String;)Lr93/w;
    .locals 1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getContainer()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;

    move-result-object v0

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getSignature()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p1, p0}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->findFunctionDescriptor(Ljava/lang/String;Ljava/lang/String;)Lr93/w;

    move-result-object p0

    return-object p0
.end method

.method private final getBoundReceiver()Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getRawBoundReceiver()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getDescriptor()Lr93/w;

    move-result-object v1

    invoke-static {v0, v1}, Lhg3/i;->z(Ljava/lang/Object;Lr93/c;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private final getFunctionWithDefaultParametersForValueClassOverride(Lr93/w;)Lr93/w;
    .locals 5

    invoke-interface {p1}, Lr93/b;->v()Ljava/util/List;

    move-result-object v0

    const-string v1, "getValueParameters(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    instance-of v2, v0, Ljava/util/Collection;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr93/a1;

    check-cast v2, Lu93/w0;

    invoke-virtual {v2}, Lu93/w0;->J0()Z

    move-result v2

    if-eqz v2, :cond_1

    goto/16 :goto_3

    :cond_2
    :goto_0
    invoke-interface {p1}, Lr93/k;->g()Lr93/k;

    move-result-object v0

    const-string v2, "getContainingDeclaration(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lya3/h;->e(Lr93/k;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getCaller()Lm93/g;

    move-result-object v0

    invoke-interface {v0}, Lm93/g;->getMember()Ljava/lang/reflect/Member;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v0}, Ljava/lang/reflect/Member;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {p1}, Lcb3/e;->l(Lr93/c;)Lxb3/g;

    move-result-object p1

    new-instance v0, Lxb3/e;

    invoke-direct {v0, p1}, Lxb3/e;-><init>(Lxb3/g;)V

    :cond_3
    :goto_1
    invoke-virtual {v0}, Lxb3/e;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {v0}, Lxb3/e;->next()Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lr93/c;

    invoke-interface {v2}, Lr93/b;->v()Ljava/util/List;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    instance-of v4, v2, Ljava/util/Collection;

    if-eqz v4, :cond_4

    move-object v4, v2

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_1

    :cond_4
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lr93/a1;

    check-cast v4, Lu93/w0;

    invoke-virtual {v4}, Lu93/w0;->J0()Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_2

    :cond_6
    move-object p1, v3

    :goto_2
    instance-of v0, p1, Lr93/w;

    if-eqz v0, :cond_7

    check-cast p1, Lr93/w;

    return-object p1

    :cond_7
    :goto_3
    return-object v3
.end method

.method private final useBoxedBoundReceiver(Ljava/lang/reflect/Method;)Z
    .locals 3

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getDescriptor()Lr93/w;

    move-result-object v0

    invoke-interface {v0}, Lr93/b;->y()Lr93/q0;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast v0, Lu93/d;

    invoke-virtual {v0}, Lu93/d;->getType()Llb3/y;

    move-result-object v0

    sget v2, Lya3/h;->a:I

    invoke-virtual {v0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v0

    invoke-interface {v0}, Llb3/q0;->d()Lr93/h;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lya3/h;->b(Lr93/k;)Z

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p1

    const-string v0, "getParameterTypes(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lm83/n;->t0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Class;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Class;->isInterface()Z

    move-result p1

    if-ne p1, v2, :cond_1

    return v2

    :cond_1
    return v1
.end method


# virtual methods
.method public default$invoke()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    .line 1
    new-array v0, v0, [Ljava/lang/Object;

    invoke-interface {p0, v0}, Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public default$invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public default$invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 3
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public default$invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 4
    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public default$invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 5
    filled-new-array {p1, p2, p3, p4}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public default$invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 6
    filled-new-array {p1, p2, p3, p4, p5}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public default$invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 7
    filled-new-array/range {p1 .. p6}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public default$invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 8
    filled-new-array/range {p1 .. p7}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public default$invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 9
    filled-new-array/range {p1 .. p8}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public default$invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 10
    filled-new-array/range {p1 .. p9}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public default$invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 11
    filled-new-array/range {p1 .. p10}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public default$invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 12
    filled-new-array/range {p1 .. p11}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public default$invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 13
    filled-new-array/range {p1 .. p12}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public default$invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    filled-new-array/range {p1 .. p13}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public default$invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 15
    filled-new-array/range {p1 .. p14}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public default$invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 16
    filled-new-array/range {p1 .. p15}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public default$invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 17
    filled-new-array/range {p1 .. p16}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public default$invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 18
    filled-new-array/range {p1 .. p17}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public default$invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 19
    filled-new-array/range {p1 .. p18}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public default$invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 20
    filled-new-array/range {p1 .. p19}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public default$invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 21
    filled-new-array/range {p1 .. p20}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public default$invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 22
    filled-new-array/range {p1 .. p21}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public default$invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 23
    filled-new-array/range {p1 .. p22}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    invoke-static {p1}, Lkotlin/reflect/jvm/internal/UtilKt;->asReflectFunction(Ljava/lang/Object;)Lkotlin/reflect/jvm/internal/ReflectKFunction;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getContainer()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;

    move-result-object v1

    invoke-interface {p1}, Lkotlin/reflect/jvm/internal/ReflectKCallable;->getContainer()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Lkotlin/reflect/jvm/internal/ReflectKFunction;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getSignature()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Lkotlin/reflect/jvm/internal/ReflectKFunction;->getSignature()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getRawBoundReceiver()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1}, Lkotlin/reflect/jvm/internal/ReflectKCallable;->getRawBoundReceiver()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v0
.end method

.method public getArity()I
    .locals 1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getCaller()Lm93/g;

    move-result-object v0

    invoke-static {v0}, Lge3/g;->z(Lm93/g;)I

    move-result v0

    return v0
.end method

.method public getCaller()Lm93/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lm93/g;"
        }
    .end annotation

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->caller$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm93/g;

    return-object v0
.end method

.method public getContainer()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->container:Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;

    return-object v0
.end method

.method public getDefaultCaller()Lm93/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lm93/g;"
        }
    .end annotation

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->defaultCaller$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm93/g;

    return-object v0
.end method

.method public bridge synthetic getDescriptor()Lr93/c;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getDescriptor()Lr93/w;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptor()Lr93/w;
    .locals 3

    .line 2
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->descriptor$delegate:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    sget-object v1, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->$$delegatedProperties:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lkotlin/reflect/jvm/internal/ReflectProperties$Val;->getValue(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lr93/w;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getDescriptor()Lr93/w;

    move-result-object v0

    check-cast v0, Lu93/n;

    invoke-virtual {v0}, Lu93/n;->getName()Lva3/h;

    move-result-object v0

    invoke-virtual {v0}, Lva3/h;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "asString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public getRawBoundReceiver()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->rawBoundReceiver:Ljava/lang/Object;

    return-object v0
.end method

.method public getSignature()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->signature:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getContainer()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getSignature()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public bridge invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->default$invoke()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public bridge invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->default$invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->default$invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2, p3}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->default$invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 5
    invoke-virtual {p0, p1, p2, p3, p4}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->default$invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 6
    invoke-virtual/range {p0 .. p5}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->default$invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 7
    invoke-virtual/range {p0 .. p6}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->default$invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 8
    invoke-virtual/range {p0 .. p7}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->default$invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 9
    invoke-virtual/range {p0 .. p8}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->default$invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 10
    invoke-virtual/range {p0 .. p9}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->default$invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 11
    invoke-virtual/range {p0 .. p10}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->default$invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 12
    invoke-virtual/range {p0 .. p11}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->default$invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 13
    invoke-virtual/range {p0 .. p12}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->default$invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    invoke-virtual/range {p0 .. p13}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->default$invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 15
    invoke-virtual/range {p0 .. p14}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->default$invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 16
    invoke-virtual/range {p0 .. p15}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->default$invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 17
    invoke-virtual/range {p0 .. p16}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->default$invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 18
    invoke-virtual/range {p0 .. p17}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->default$invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 19
    invoke-virtual/range {p0 .. p18}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->default$invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 20
    invoke-virtual/range {p0 .. p19}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->default$invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 21
    invoke-virtual/range {p0 .. p20}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->default$invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 22
    invoke-virtual/range {p0 .. p21}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->default$invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 23
    invoke-virtual/range {p0 .. p22}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->default$invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public isExternal()Z
    .locals 1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getDescriptor()Lr93/w;

    move-result-object v0

    invoke-interface {v0}, Lr93/z;->isExternal()Z

    move-result v0

    return v0
.end method

.method public isInfix()Z
    .locals 1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getDescriptor()Lr93/w;

    move-result-object v0

    invoke-interface {v0}, Lr93/w;->isInfix()Z

    move-result v0

    return v0
.end method

.method public isInline()Z
    .locals 1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getDescriptor()Lr93/w;

    move-result-object v0

    invoke-interface {v0}, Lr93/w;->isInline()Z

    move-result v0

    return v0
.end method

.method public isOperator()Z
    .locals 1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getDescriptor()Lr93/w;

    move-result-object v0

    invoke-interface {v0}, Lr93/w;->isOperator()Z

    move-result v0

    return v0
.end method

.method public isSuspend()Z
    .locals 1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getDescriptor()Lr93/w;

    move-result-object v0

    invoke-interface {v0}, Lr93/w;->isSuspend()Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/ReflectionObjectRenderer;->INSTANCE:Lkotlin/reflect/jvm/internal/ReflectionObjectRenderer;

    invoke-virtual {v0, p0}, Lkotlin/reflect/jvm/internal/ReflectionObjectRenderer;->renderFunction(Lj93/g;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
