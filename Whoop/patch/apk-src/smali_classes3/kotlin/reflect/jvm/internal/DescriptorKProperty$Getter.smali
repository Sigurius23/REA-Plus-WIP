.class public abstract Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;
.super Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;
.source "SourceFile"

# interfaces
.implements Lj93/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlin/reflect/jvm/internal/DescriptorKProperty;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Getter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor<",
        "TV;TV;>;",
        "Lj93/s;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008&\u0018\u0000*\u0006\u0008\u0001\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u00022\u0008\u0012\u0004\u0012\u00028\u00010\u0003B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001a\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u001f\u0010\u001c\u001a\u0006\u0012\u0002\u0008\u00030\u00178VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u0008\u00a8\u0006\u001f"
    }
    d2 = {
        "Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;",
        "V",
        "Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;",
        "Lj93/s;",
        "<init>",
        "()V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "",
        "hashCode",
        "()I",
        "Lr93/o0;",
        "descriptor$delegate",
        "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;",
        "getDescriptor",
        "()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;",
        "descriptor",
        "Lm93/g;",
        "caller$delegate",
        "Ll83/h;",
        "getCaller",
        "()Lm93/g;",
        "caller",
        "getName",
        "name",
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

.field private final descriptor$delegate:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/x;

    const-class v1, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;

    const-string v2, "descriptor"

    const-string v3, "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/x;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->property1(Lkotlin/jvm/internal/w;)Lj93/w;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lj93/z;

    aput-object v0, v1, v4

    sput-object v1, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;->$$delegatedProperties:[Lj93/z;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;-><init>()V

    new-instance v0, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter$$Lambda$0;

    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter$$Lambda$0;-><init>(Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;)V

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/ReflectProperties;->lazySoft(Lc93/a;)Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    move-result-object v0

    iput-object v0, p0, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;->descriptor$delegate:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v1, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter$$Lambda$1;

    invoke-direct {v1, p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter$$Lambda$1;-><init>(Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;->caller$delegate:Ll83/h;

    return-void
.end method

.method public static synthetic accessor$DescriptorKProperty$Getter$lambda0(Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;)Lr93/o0;
    .locals 0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;->descriptor_delegate$lambda$0(Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;)Lr93/o0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic accessor$DescriptorKProperty$Getter$lambda1(Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;)Lm93/g;
    .locals 0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;->caller_delegate$lambda$0(Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;)Lm93/g;

    move-result-object p0

    return-object p0
.end method

.method private static final caller_delegate$lambda$0(Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;)Lm93/g;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lkotlin/reflect/jvm/internal/DescriptorKPropertyKt;->access$computeCallerForAccessor(Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;Z)Lm93/g;

    move-result-object p0

    return-object p0
.end method

.method private static final descriptor_delegate$lambda$0(Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;)Lr93/o0;
    .locals 1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;->getProperty()Lkotlin/reflect/jvm/internal/DescriptorKProperty;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getDescriptor()Lr93/n0;

    move-result-object v0

    invoke-interface {v0}, Lr93/n0;->getGetter()Lu93/n0;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;->getProperty()Lkotlin/reflect/jvm/internal/DescriptorKProperty;

    move-result-object p0

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getDescriptor()Lr93/n0;

    move-result-object p0

    sget-object v0, Ls93/g;->a:Ls93/f;

    invoke-static {p0, v0}, Lya3/p;->e(Lr93/n0;Ls93/i;)Lu93/n0;

    move-result-object p0

    return-object p0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;->getProperty()Lkotlin/reflect/jvm/internal/DescriptorKProperty;

    move-result-object v0

    check-cast p1, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;

    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;->getProperty()Lkotlin/reflect/jvm/internal/DescriptorKProperty;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public getCaller()Lm93/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lm93/g;"
        }
    .end annotation

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;->caller$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm93/g;

    return-object v0
.end method

.method public bridge synthetic getDescriptor()Lr93/c;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;->getDescriptor()Lr93/o0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDescriptor()Lr93/m0;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;->getDescriptor()Lr93/o0;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptor()Lr93/o0;
    .locals 3

    .line 3
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;->descriptor$delegate:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    sget-object v1, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;->$$delegatedProperties:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lkotlin/reflect/jvm/internal/ReflectProperties$Val;->getValue(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lr93/o0;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "<get-"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;->getProperty()Lkotlin/reflect/jvm/internal/DescriptorKProperty;

    move-result-object v1

    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract synthetic getProperty()Lj93/z;
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;->getProperty()Lkotlin/reflect/jvm/internal/DescriptorKProperty;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "getter of "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;->getProperty()Lkotlin/reflect/jvm/internal/DescriptorKProperty;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
