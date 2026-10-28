.class public abstract Lkotlin/reflect/jvm/internal/DescriptorKProperty;
.super Lkotlin/reflect/jvm/internal/DescriptorKCallable;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/ReflectKProperty;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;,
        Lkotlin/reflect/jvm/internal/DescriptorKProperty$Companion;,
        Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;,
        Lkotlin/reflect/jvm/internal/DescriptorKProperty$Setter;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlin/reflect/jvm/internal/DescriptorKCallable<",
        "TV;>;",
        "Lkotlin/reflect/jvm/internal/ReflectKProperty<",
        "TV;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u0008 \u0018\u0000 I*\u0006\u0008\u0000\u0010\u0001 \u00012\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0008\u0012\u0004\u0012\u00028\u00000\u0003:\u0004JKLIB5\u0008\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eB\u0019\u0008\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\t\u00a2\u0006\u0004\u0008\r\u0010\u0010B+\u0008\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\r\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0004\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J/\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u000bH\u0004\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u000bH\u0096\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016\u00a2\u0006\u0004\u0008 \u0010!J\u000f\u0010\"\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\"\u0010#R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010$\u001a\u0004\u0008%\u0010&R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\'\u001a\u0004\u0008(\u0010#R\u001a\u0010\u0008\u001a\u00020\u00068\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\'\u001a\u0004\u0008)\u0010#R\u001c\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010*\u001a\u0004\u0008+\u0010,R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0-8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008/\u00100R\"\u00103\u001a\u0010\u0012\u000c\u0012\n 2*\u0004\u0018\u00010\t0\t018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00083\u00104R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b8F\u00a2\u0006\u0006\u001a\u0004\u00085\u0010,R\u0016\u00108\u001a\u0004\u0018\u00010.8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u00086\u00107R\u001a\u0010<\u001a\u0008\u0012\u0004\u0012\u00028\u0000098&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008:\u0010;R\u0018\u0010@\u001a\u0006\u0012\u0002\u0008\u00030=8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008>\u0010?R\u001a\u0010B\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010=8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008A\u0010?R\u0014\u0010C\u001a\u00020\u001c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008C\u0010DR\u0014\u0010E\u001a\u00020\u001c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008E\u0010DR\u0014\u0010F\u001a\u00020\u001c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008F\u0010DR\u0014\u0010\u000f\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008G\u0010H\u00a8\u0006M"
    }
    d2 = {
        "Lkotlin/reflect/jvm/internal/DescriptorKProperty;",
        "V",
        "Lkotlin/reflect/jvm/internal/DescriptorKCallable;",
        "Lkotlin/reflect/jvm/internal/ReflectKProperty;",
        "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;",
        "container",
        "",
        "name",
        "signature",
        "Lr93/n0;",
        "descriptorInitialValue",
        "",
        "rawBoundReceiver",
        "<init>",
        "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Ljava/lang/Object;)V",
        "descriptor",
        "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V",
        "boundReceiver",
        "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V",
        "Ljava/lang/reflect/Member;",
        "computeDelegateSource",
        "()Ljava/lang/reflect/Member;",
        "fieldOrMethod",
        "receiver1",
        "receiver2",
        "getDelegateImpl",
        "(Ljava/lang/reflect/Member;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "",
        "hashCode",
        "()I",
        "toString",
        "()Ljava/lang/String;",
        "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;",
        "getContainer",
        "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;",
        "Ljava/lang/String;",
        "getName",
        "getSignature",
        "Ljava/lang/Object;",
        "getRawBoundReceiver",
        "()Ljava/lang/Object;",
        "Ll83/h;",
        "Ljava/lang/reflect/Field;",
        "_javaField",
        "Ll83/h;",
        "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;",
        "kotlin.jvm.PlatformType",
        "_descriptor",
        "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;",
        "getBoundReceiver",
        "getJavaField",
        "()Ljava/lang/reflect/Field;",
        "javaField",
        "Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;",
        "getGetter",
        "()Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;",
        "getter",
        "Lm93/g;",
        "getCaller",
        "()Lm93/g;",
        "caller",
        "getDefaultCaller",
        "defaultCaller",
        "isLateinit",
        "()Z",
        "isConst",
        "isSuspend",
        "getDescriptor",
        "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;",
        "Companion",
        "Accessor",
        "Getter",
        "Setter",
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
.field public static final Companion:Lkotlin/reflect/jvm/internal/DescriptorKProperty$Companion;

.field private static final EXTENSION_PROPERTY_DELEGATE:Ljava/lang/Object;


# instance fields
.field private final _descriptor:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal<",
            "Lr93/n0;",
            ">;"
        }
    .end annotation
.end field

.field private final _javaField:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field private final container:Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;

.field private final name:Ljava/lang/String;

.field private final rawBoundReceiver:Ljava/lang/Object;

.field private final signature:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->Companion:Lkotlin/reflect/jvm/internal/DescriptorKProperty$Companion;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->EXTENSION_PROPERTY_DELEGATE:Ljava/lang/Object;

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
    invoke-direct/range {v1 .. v6}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;-><init>(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lr93/n0;Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lr93/n0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;-><init>()V

    .line 2
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->container:Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;

    .line 3
    iput-object p2, p0, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->name:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->signature:Ljava/lang/String;

    .line 5
    iput-object p5, p0, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->rawBoundReceiver:Ljava/lang/Object;

    .line 6
    sget-object p1, Ll83/i;->x:Ll83/i;

    new-instance p2, Lkotlin/reflect/jvm/internal/DescriptorKProperty$$Lambda$0;

    invoke-direct {p2, p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$$Lambda$0;-><init>(Lkotlin/reflect/jvm/internal/DescriptorKProperty;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->_javaField:Ll83/h;

    .line 7
    new-instance p1, Lkotlin/reflect/jvm/internal/DescriptorKProperty$$Lambda$1;

    invoke-direct {p1, p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$$Lambda$1;-><init>(Lkotlin/reflect/jvm/internal/DescriptorKProperty;)V

    invoke-static {p4, p1}, Lkotlin/reflect/jvm/internal/ReflectProperties;->lazySoft(Ljava/lang/Object;Lc93/a;)Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    move-result-object p1

    const-string p2, "lazySoft(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->_descriptor:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    return-void
.end method

.method public constructor <init>(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lr93/n0;)V
    .locals 7

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-interface {p2}, Lr93/k;->getName()Lva3/h;

    move-result-object v0

    invoke-virtual {v0}, Lva3/h;->b()Ljava/lang/String;

    move-result-object v3

    const-string v0, "asString(...)"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    sget-object v0, Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;->INSTANCE:Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;

    invoke-virtual {v0, p2}, Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;->mapPropertySignature(Lr93/n0;)Lkotlin/reflect/jvm/internal/JvmPropertySignature;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/JvmPropertySignature;->asString()Ljava/lang/String;

    move-result-object v4

    .line 11
    sget-object v6, Lkotlin/jvm/internal/c;->NO_RECEIVER:Ljava/lang/Object;

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    .line 12
    invoke-direct/range {v1 .. v6}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;-><init>(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lr93/n0;Ljava/lang/Object;)V

    return-void
.end method

.method private static final _descriptor$lambda$0(Lkotlin/reflect/jvm/internal/DescriptorKProperty;)Lr93/n0;
    .locals 2

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getContainer()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;

    move-result-object v0

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getSignature()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->findPropertyDescriptor(Ljava/lang/String;Ljava/lang/String;)Lr93/n0;

    move-result-object p0

    return-object p0
.end method

.method private static final _javaField$lambda$0(Lkotlin/reflect/jvm/internal/DescriptorKProperty;)Ljava/lang/reflect/Field;
    .locals 6

    sget-object v0, Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;->INSTANCE:Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getDescriptor()Lr93/n0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;->mapPropertySignature(Lr93/n0;)Lkotlin/reflect/jvm/internal/JvmPropertySignature;

    move-result-object v0

    instance-of v1, v0, Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;

    if-eqz v1, :cond_3

    check-cast v0, Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;->getDescriptor()Lr93/n0;

    move-result-object v1

    sget-object v2, Lua3/g;->a:Lwa3/i;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;->getProto()Lqa3/k0;

    move-result-object v2

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;->getNameResolver()Lsa3/f;

    move-result-object v3

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;->getTypeTable()Lsa3/h;

    move-result-object v4

    const/4 v5, 0x1

    invoke-static {v2, v3, v4, v5}, Lua3/g;->b(Lqa3/k0;Lsa3/f;Lsa3/h;Z)Lua3/d;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-static {v1}, Lse/a;->Q(Lr93/n0;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;->getProto()Lqa3/k0;

    move-result-object v0

    invoke-static {v0}, Lua3/g;->d(Lqa3/k0;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v1}, Lr93/k;->g()Lr93/k;

    move-result-object v0

    instance-of v1, v0, Lr93/e;

    if-eqz v1, :cond_1

    check-cast v0, Lr93/e;

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/UtilKt;->toJavaClass(Lr93/e;)Ljava/lang/Class;

    move-result-object p0

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getContainer()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;

    move-result-object p0

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->getJClass()Ljava/lang/Class;

    move-result-object p0

    goto :goto_1

    :cond_2
    :goto_0
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getContainer()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;

    move-result-object p0

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->getJClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getEnclosingClass()Ljava/lang/Class;

    move-result-object p0

    :goto_1
    if-eqz p0, :cond_6

    :try_start_0
    iget-object v0, v2, Lua3/d;->x:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :cond_3
    instance-of p0, v0, Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;

    if-eqz p0, :cond_4

    check-cast v0, Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;->getField()Ljava/lang/reflect/Field;

    move-result-object p0

    return-object p0

    :cond_4
    instance-of p0, v0, Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;

    if-eqz p0, :cond_5

    goto :goto_2

    :cond_5
    instance-of p0, v0, Lkotlin/reflect/jvm/internal/JvmPropertySignature$MappedKotlinProperty;

    if-eqz p0, :cond_7

    :catch_0
    :cond_6
    :goto_2
    const/4 p0, 0x0

    return-object p0

    :cond_7
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final synthetic access$getEXTENSION_PROPERTY_DELEGATE$cp()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->EXTENSION_PROPERTY_DELEGATE:Ljava/lang/Object;

    return-object v0
.end method

.method public static synthetic accessor$DescriptorKProperty$lambda0(Lkotlin/reflect/jvm/internal/DescriptorKProperty;)Ljava/lang/reflect/Field;
    .locals 0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->_javaField$lambda$0(Lkotlin/reflect/jvm/internal/DescriptorKProperty;)Ljava/lang/reflect/Field;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic accessor$DescriptorKProperty$lambda1(Lkotlin/reflect/jvm/internal/DescriptorKProperty;)Lr93/n0;
    .locals 0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->_descriptor$lambda$0(Lkotlin/reflect/jvm/internal/DescriptorKProperty;)Lr93/n0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final computeDelegateSource()Ljava/lang/reflect/Member;
    .locals 6

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getDescriptor()Lr93/n0;

    move-result-object v0

    invoke-interface {v0}, Lr93/n0;->p()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    sget-object v0, Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;->INSTANCE:Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getDescriptor()Lr93/n0;

    move-result-object v2

    invoke-virtual {v0, v2}, Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;->mapPropertySignature(Lr93/n0;)Lkotlin/reflect/jvm/internal/JvmPropertySignature;

    move-result-object v0

    instance-of v2, v0, Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;

    if-eqz v2, :cond_2

    check-cast v0, Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;->getSignature()Lta3/f;

    move-result-object v2

    iget v2, v2, Lta3/f;->x:I

    const/16 v3, 0x10

    and-int/2addr v2, v3

    if-ne v2, v3, :cond_2

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;->getSignature()Lta3/f;

    move-result-object v2

    iget-object v2, v2, Lta3/f;->G:Lta3/d;

    iget v3, v2, Lta3/d;->x:I

    and-int/lit8 v4, v3, 0x1

    const/4 v5, 0x1

    if-ne v4, v5, :cond_1

    const/4 v4, 0x2

    and-int/2addr v3, v4

    if-ne v3, v4, :cond_1

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;->getNameResolver()Lsa3/f;

    move-result-object v1

    iget v3, v2, Lta3/d;->y:I

    invoke-interface {v1, v3}, Lsa3/f;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;->getNameResolver()Lsa3/f;

    move-result-object v0

    iget v2, v2, Lta3/d;->z:I

    invoke-interface {v0, v2}, Lsa3/f;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getContainer()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;

    move-result-object v2

    invoke-virtual {v2, v1, v0}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->findMethodBySignature(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v0

    return-object v0

    :cond_1
    return-object v1

    :cond_2
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getJavaField()Ljava/lang/reflect/Field;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    invoke-static {p1}, Lkotlin/reflect/jvm/internal/UtilKt;->asReflectProperty(Ljava/lang/Object;)Lkotlin/reflect/jvm/internal/ReflectKProperty;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getContainer()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;

    move-result-object v1

    invoke-interface {p1}, Lkotlin/reflect/jvm/internal/ReflectKCallable;->getContainer()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Lkotlin/reflect/jvm/internal/ReflectKProperty;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getSignature()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Lkotlin/reflect/jvm/internal/ReflectKProperty;->getSignature()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getRawBoundReceiver()Ljava/lang/Object;

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

.method public final getBoundReceiver()Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getRawBoundReceiver()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getDescriptor()Lr93/n0;

    move-result-object v1

    invoke-static {v0, v1}, Lhg3/i;->z(Ljava/lang/Object;Lr93/c;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getCaller()Lm93/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lm93/g;"
        }
    .end annotation

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getGetter()Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;->getCaller()Lm93/g;

    move-result-object v0

    return-object v0
.end method

.method public getContainer()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->container:Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;

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

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getGetter()Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;->getDefaultCaller()Lm93/g;

    move-result-object v0

    return-object v0
.end method

.method public final getDelegateImpl(Ljava/lang/reflect/Member;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    const-string v0, "delegate field/method "

    const-string v1, "delegate method "

    const-string v2, "\'"

    :try_start_0
    sget-object v3, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->EXTENSION_PROPERTY_DELEGATE:Ljava/lang/Object;

    if-eq p2, v3, :cond_0

    if-ne p3, v3, :cond_1

    :cond_0
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getDescriptor()Lr93/n0;

    move-result-object v4

    invoke-interface {v4}, Lr93/b;->B()Lr93/q0;

    move-result-object v4

    if-eqz v4, :cond_10

    :cond_1
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/ReflectKCallableKt;->isBound(Lkotlin/reflect/jvm/internal/ReflectKCallable;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getBoundReceiver()Ljava/lang/Object;

    move-result-object v2

    goto :goto_0

    :catch_0
    move-exception p1

    goto/16 :goto_5

    :cond_2
    move-object v2, p2

    :goto_0
    const/4 v4, 0x0

    if-eq v2, v3, :cond_3

    goto :goto_1

    :cond_3
    move-object v2, v4

    :goto_1
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/ReflectKCallableKt;->isBound(Lkotlin/reflect/jvm/internal/ReflectKCallable;)Z

    move-result v5

    if-eqz v5, :cond_4

    goto :goto_2

    :cond_4
    move-object p2, p3

    :goto_2
    if-eq p2, v3, :cond_5

    goto :goto_3

    :cond_5
    move-object p2, v4

    :goto_3
    instance-of p3, p1, Ljava/lang/reflect/AccessibleObject;

    if-eqz p3, :cond_6

    move-object p3, p1

    check-cast p3, Ljava/lang/reflect/AccessibleObject;

    goto :goto_4

    :cond_6
    move-object p3, v4

    :goto_4
    if-eqz p3, :cond_7

    invoke-static {p0}, Lx30/s0;->t(Lkotlin/reflect/jvm/internal/DescriptorKProperty;)Z

    move-result v3

    invoke-virtual {p3, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    :cond_7
    if-nez p1, :cond_8

    return-object v4

    :cond_8
    instance-of p3, p1, Ljava/lang/reflect/Field;

    if-eqz p3, :cond_9

    check-cast p1, Ljava/lang/reflect/Field;

    invoke-virtual {p1, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_9
    instance-of p3, p1, Ljava/lang/reflect/Method;

    if-eqz p3, :cond_f

    move-object p3, p1

    check-cast p3, Ljava/lang/reflect/Method;

    invoke-virtual {p3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p3

    array-length p3, p3
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p3, :cond_e

    const-string v0, "get(...)"

    const/4 v3, 0x1

    if-eq p3, v3, :cond_c

    const/4 v5, 0x2

    if-ne p3, v5, :cond_b

    :try_start_1
    move-object p3, p1

    check-cast p3, Ljava/lang/reflect/Method;

    if-nez p2, :cond_a

    check-cast p1, Ljava/lang/reflect/Method;

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p1

    aget-object p1, p1, v3

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/reflect/jvm/internal/UtilKt;->defaultPrimitiveValue(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p2

    :cond_a
    filled-new-array {v2, p2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p3, v4, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_b
    new-instance p2, Ljava/lang/AssertionError;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " should take 0, 1, or 2 parameters"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p2

    :cond_c
    move-object p2, p1

    check-cast p2, Ljava/lang/reflect/Method;

    if-nez v2, :cond_d

    check-cast p1, Ljava/lang/reflect/Method;

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p1

    const/4 p3, 0x0

    aget-object p1, p1, p3

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/reflect/jvm/internal/UtilKt;->defaultPrimitiveValue(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v2

    :cond_d
    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2, v4, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_e
    check-cast p1, Ljava/lang/reflect/Method;

    invoke-virtual {p1, v4, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_f
    new-instance p2, Ljava/lang/AssertionError;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " neither field nor method"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p2

    :cond_10
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, "\' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0

    :goto_5
    new-instance p2, Lkotlin/reflect/full/IllegalPropertyDelegateAccessException;

    invoke-direct {p2, p1}, Lkotlin/reflect/full/IllegalPropertyDelegateAccessException;-><init>(Ljava/lang/IllegalAccessException;)V

    throw p2
.end method

.method public bridge synthetic getDescriptor()Lr93/c;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getDescriptor()Lr93/n0;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptor()Lr93/n0;
    .locals 2

    .line 2
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->_descriptor:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;->invoke()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "invoke(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lr93/n0;

    return-object v0
.end method

.method public abstract synthetic getGetter()Lj93/s;
.end method

.method public abstract getGetter()Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter<",
            "TV;>;"
        }
    .end annotation
.end method

.method public getJavaField()Ljava/lang/reflect/Field;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->_javaField:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Field;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getRawBoundReceiver()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->rawBoundReceiver:Ljava/lang/Object;

    return-object v0
.end method

.method public getSignature()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->signature:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getContainer()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getSignature()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public isConst()Z
    .locals 1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getDescriptor()Lr93/n0;

    move-result-object v0

    invoke-interface {v0}, Lr93/b1;->isConst()Z

    move-result v0

    return v0
.end method

.method public isLateinit()Z
    .locals 1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getDescriptor()Lr93/n0;

    move-result-object v0

    invoke-interface {v0}, Lr93/b1;->d0()Z

    move-result v0

    return v0
.end method

.method public isSuspend()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/ReflectionObjectRenderer;->INSTANCE:Lkotlin/reflect/jvm/internal/ReflectionObjectRenderer;

    invoke-virtual {v0, p0}, Lkotlin/reflect/jvm/internal/ReflectionObjectRenderer;->renderProperty(Lj93/z;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
