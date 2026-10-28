.class public final Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0;
.super Lkotlin/reflect/jvm/internal/DescriptorKProperty0;
.source "SourceFile"

# interfaces
.implements Lj93/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0$Setter;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlin/reflect/jvm/internal/DescriptorKProperty0<",
        "TV;>;",
        "Lj93/j;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0008\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u001bB\u0019\u0008\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tB+\u0008\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000c\u001a\u00020\n\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\u0008\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R \u0010\u0016\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00150\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00158VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001c"
    }
    d2 = {
        "Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0;",
        "V",
        "Lkotlin/reflect/jvm/internal/DescriptorKProperty0;",
        "Lj93/j;",
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
        "value",
        "Ll83/a0;",
        "set",
        "(Ljava/lang/Object;)V",
        "Ll83/h;",
        "Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0$Setter;",
        "_setter",
        "Ll83/h;",
        "getSetter",
        "()Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0$Setter;",
        "setter",
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


# instance fields
.field private final _setter:Ll83/h;
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

    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, Lkotlin/reflect/jvm/internal/DescriptorKProperty0;-><init>(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    sget-object p1, Ll83/i;->x:Ll83/i;

    new-instance p2, Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0$$Lambda$0;

    invoke-direct {p2, p0}, Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0$$Lambda$0;-><init>(Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0;->_setter:Ll83/h;

    return-void
.end method

.method public constructor <init>(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lr93/n0;)V
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1, p2}, Lkotlin/reflect/jvm/internal/DescriptorKProperty0;-><init>(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lr93/n0;)V

    .line 2
    sget-object p1, Ll83/i;->x:Ll83/i;

    new-instance p2, Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0$$Lambda$0;

    invoke-direct {p2, p0}, Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0$$Lambda$0;-><init>(Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0;->_setter:Ll83/h;

    return-void
.end method

.method private static final _setter$lambda$0(Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0;)Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0$Setter;
    .locals 1

    new-instance v0, Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0$Setter;

    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0$Setter;-><init>(Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0;)V

    return-object v0
.end method

.method public static synthetic accessor$DescriptorKMutableProperty0$lambda0(Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0;)Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0$Setter;
    .locals 0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0;->_setter$lambda$0(Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0;)Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0$Setter;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic getSetter()Lj93/h;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0;->getSetter()Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0$Setter;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getSetter()Lj93/i;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0;->getSetter()Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0$Setter;

    move-result-object v0

    return-object v0
.end method

.method public getSetter()Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0$Setter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0$Setter<",
            "TV;>;"
        }
    .end annotation

    .line 3
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0;->_setter:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0$Setter;

    return-object v0
.end method

.method public set(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0;->getSetter()Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0$Setter;

    move-result-object v0

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;->call([Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
