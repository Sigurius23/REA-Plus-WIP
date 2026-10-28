.class public Lkotlin/reflect/jvm/internal/DescriptorKProperty0;
.super Lkotlin/reflect/jvm/internal/DescriptorKProperty;
.source "SourceFile"

# interfaces
.implements Lj93/u;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/reflect/jvm/internal/DescriptorKProperty0$Getter;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlin/reflect/jvm/internal/DescriptorKProperty<",
        "TV;>;",
        "Lj93/u;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0010\u0018\u0000*\u0006\u0008\u0000\u0010\u0001 \u00012\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0008\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u001cB\u0019\u0008\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tB+\u0008\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000c\u001a\u00020\n\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\u0008\u0010\u000fJ\u000f\u0010\u0010\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0011R \u0010\u0016\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00150\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0017R\u001a\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00158VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001d"
    }
    d2 = {
        "Lkotlin/reflect/jvm/internal/DescriptorKProperty0;",
        "V",
        "Lj93/u;",
        "Lkotlin/reflect/jvm/internal/DescriptorKProperty;",
        "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;",
        "container",
        "Lr93/n0;",
        "descriptor",
        "<init>",
        "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V",
        "",
        "name",
        "signature",
        "",
        "boundReceiver",
        "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V",
        "get",
        "()Ljava/lang/Object;",
        "getDelegate",
        "invoke",
        "Ll83/h;",
        "Lkotlin/reflect/jvm/internal/DescriptorKProperty0$Getter;",
        "_getter",
        "Ll83/h;",
        "delegateValue",
        "getGetter",
        "()Lkotlin/reflect/jvm/internal/DescriptorKProperty0$Getter;",
        "getter",
        "Getter",
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
.field private final _getter:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field private final delegateValue:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signature"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0, p1, p2, p3, p4}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;-><init>(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 5
    sget-object p1, Ll83/i;->x:Ll83/i;

    new-instance p2, Lkotlin/reflect/jvm/internal/DescriptorKProperty0$$Lambda$0;

    invoke-direct {p2, p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty0$$Lambda$0;-><init>(Lkotlin/reflect/jvm/internal/DescriptorKProperty0;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lkotlin/reflect/jvm/internal/DescriptorKProperty0;->_getter:Ll83/h;

    .line 6
    new-instance p2, Lkotlin/reflect/jvm/internal/DescriptorKProperty0$$Lambda$1;

    invoke-direct {p2, p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty0$$Lambda$1;-><init>(Lkotlin/reflect/jvm/internal/DescriptorKProperty0;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/DescriptorKProperty0;->delegateValue:Ll83/h;

    return-void
.end method

.method public constructor <init>(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lr93/n0;)V
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1, p2}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;-><init>(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lr93/n0;)V

    .line 2
    sget-object p1, Ll83/i;->x:Ll83/i;

    new-instance p2, Lkotlin/reflect/jvm/internal/DescriptorKProperty0$$Lambda$0;

    invoke-direct {p2, p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty0$$Lambda$0;-><init>(Lkotlin/reflect/jvm/internal/DescriptorKProperty0;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lkotlin/reflect/jvm/internal/DescriptorKProperty0;->_getter:Ll83/h;

    .line 3
    new-instance p2, Lkotlin/reflect/jvm/internal/DescriptorKProperty0$$Lambda$1;

    invoke-direct {p2, p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty0$$Lambda$1;-><init>(Lkotlin/reflect/jvm/internal/DescriptorKProperty0;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/DescriptorKProperty0;->delegateValue:Ll83/h;

    return-void
.end method

.method private static final _getter$lambda$0(Lkotlin/reflect/jvm/internal/DescriptorKProperty0;)Lkotlin/reflect/jvm/internal/DescriptorKProperty0$Getter;
    .locals 1

    new-instance v0, Lkotlin/reflect/jvm/internal/DescriptorKProperty0$Getter;

    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty0$Getter;-><init>(Lkotlin/reflect/jvm/internal/DescriptorKProperty0;)V

    return-object v0
.end method

.method public static synthetic accessor$DescriptorKProperty0$lambda0(Lkotlin/reflect/jvm/internal/DescriptorKProperty0;)Lkotlin/reflect/jvm/internal/DescriptorKProperty0$Getter;
    .locals 0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty0;->_getter$lambda$0(Lkotlin/reflect/jvm/internal/DescriptorKProperty0;)Lkotlin/reflect/jvm/internal/DescriptorKProperty0$Getter;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic accessor$DescriptorKProperty0$lambda1(Lkotlin/reflect/jvm/internal/DescriptorKProperty0;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty0;->delegateValue$lambda$0(Lkotlin/reflect/jvm/internal/DescriptorKProperty0;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final delegateValue$lambda$0(Lkotlin/reflect/jvm/internal/DescriptorKProperty0;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->computeDelegateSource()Ljava/lang/reflect/Member;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getDelegateImpl(Ljava/lang/reflect/Member;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty0;->getGetter()Lkotlin/reflect/jvm/internal/DescriptorKProperty0$Getter;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getDelegate()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/DescriptorKProperty0;->delegateValue:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getGetter()Lj93/s;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty0;->getGetter()Lkotlin/reflect/jvm/internal/DescriptorKProperty0$Getter;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getGetter()Lj93/t;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty0;->getGetter()Lkotlin/reflect/jvm/internal/DescriptorKProperty0$Getter;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getGetter()Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty0;->getGetter()Lkotlin/reflect/jvm/internal/DescriptorKProperty0$Getter;

    move-result-object v0

    return-object v0
.end method

.method public getGetter()Lkotlin/reflect/jvm/internal/DescriptorKProperty0$Getter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/reflect/jvm/internal/DescriptorKProperty0$Getter<",
            "TV;>;"
        }
    .end annotation

    .line 4
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/DescriptorKProperty0;->_getter:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/reflect/jvm/internal/DescriptorKProperty0$Getter;

    return-object v0
.end method

.method public invoke()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty0;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
