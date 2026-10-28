.class public final Lkotlin/reflect/jvm/internal/DescriptorKMutablePropertyN;
.super Lkotlin/reflect/jvm/internal/DescriptorKPropertyN;
.source "SourceFile"

# interfaces
.implements Lj93/o;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/reflect/jvm/internal/DescriptorKMutablePropertyN$Setter;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlin/reflect/jvm/internal/DescriptorKPropertyN<",
        "TV;>;",
        "Lj93/o;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0008\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0011B\u0019\u0008\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tR \u0010\u000c\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u000b0\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u001a\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0012"
    }
    d2 = {
        "Lkotlin/reflect/jvm/internal/DescriptorKMutablePropertyN;",
        "V",
        "Lkotlin/reflect/jvm/internal/DescriptorKPropertyN;",
        "Lj93/o;",
        "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;",
        "container",
        "Lr93/n0;",
        "descriptor",
        "<init>",
        "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V",
        "Ll83/h;",
        "Lkotlin/reflect/jvm/internal/DescriptorKMutablePropertyN$Setter;",
        "_setter",
        "Ll83/h;",
        "getSetter",
        "()Lkotlin/reflect/jvm/internal/DescriptorKMutablePropertyN$Setter;",
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
.method public constructor <init>(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lr93/n0;)V
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lkotlin/reflect/jvm/internal/DescriptorKPropertyN;-><init>(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lr93/n0;)V

    sget-object p1, Ll83/i;->x:Ll83/i;

    new-instance p2, Lkotlin/reflect/jvm/internal/DescriptorKMutablePropertyN$$Lambda$0;

    invoke-direct {p2, p0}, Lkotlin/reflect/jvm/internal/DescriptorKMutablePropertyN$$Lambda$0;-><init>(Lkotlin/reflect/jvm/internal/DescriptorKMutablePropertyN;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/DescriptorKMutablePropertyN;->_setter:Ll83/h;

    return-void
.end method

.method private static final _setter$lambda$0(Lkotlin/reflect/jvm/internal/DescriptorKMutablePropertyN;)Lkotlin/reflect/jvm/internal/DescriptorKMutablePropertyN$Setter;
    .locals 1

    new-instance v0, Lkotlin/reflect/jvm/internal/DescriptorKMutablePropertyN$Setter;

    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/DescriptorKMutablePropertyN$Setter;-><init>(Lkotlin/reflect/jvm/internal/DescriptorKMutablePropertyN;)V

    return-object v0
.end method

.method public static synthetic accessor$DescriptorKMutablePropertyN$lambda0(Lkotlin/reflect/jvm/internal/DescriptorKMutablePropertyN;)Lkotlin/reflect/jvm/internal/DescriptorKMutablePropertyN$Setter;
    .locals 0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/DescriptorKMutablePropertyN;->_setter$lambda$0(Lkotlin/reflect/jvm/internal/DescriptorKMutablePropertyN;)Lkotlin/reflect/jvm/internal/DescriptorKMutablePropertyN$Setter;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic getSetter()Lj93/h;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKMutablePropertyN;->getSetter()Lkotlin/reflect/jvm/internal/DescriptorKMutablePropertyN$Setter;

    move-result-object v0

    return-object v0
.end method

.method public getSetter()Lkotlin/reflect/jvm/internal/DescriptorKMutablePropertyN$Setter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/reflect/jvm/internal/DescriptorKMutablePropertyN$Setter<",
            "TV;>;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/DescriptorKMutablePropertyN;->_setter:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/reflect/jvm/internal/DescriptorKMutablePropertyN$Setter;

    return-object v0
.end method
