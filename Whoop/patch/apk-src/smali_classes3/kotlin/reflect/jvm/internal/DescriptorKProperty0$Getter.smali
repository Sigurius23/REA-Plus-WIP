.class public final Lkotlin/reflect/jvm/internal/DescriptorKProperty0$Getter;
.super Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;
.source "SourceFile"

# interfaces
.implements Lj93/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlin/reflect/jvm/internal/DescriptorKProperty0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Getter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter<",
        "TR;>;",
        "Lj93/t;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u0000*\u0006\u0008\u0001\u0010\u0001 \u00012\u0008\u0012\u0004\u0012\u00028\u00010\u00022\u0008\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\u0008\u001a\u00028\u0001H\u0096\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tR \u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lkotlin/reflect/jvm/internal/DescriptorKProperty0$Getter;",
        "R",
        "Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;",
        "Lj93/t;",
        "Lkotlin/reflect/jvm/internal/DescriptorKProperty0;",
        "property",
        "<init>",
        "(Lkotlin/reflect/jvm/internal/DescriptorKProperty0;)V",
        "invoke",
        "()Ljava/lang/Object;",
        "Lkotlin/reflect/jvm/internal/DescriptorKProperty0;",
        "getProperty",
        "()Lkotlin/reflect/jvm/internal/DescriptorKProperty0;",
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
.field private final property:Lkotlin/reflect/jvm/internal/DescriptorKProperty0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/reflect/jvm/internal/DescriptorKProperty0<",
            "TR;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/reflect/jvm/internal/DescriptorKProperty0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/reflect/jvm/internal/DescriptorKProperty0<",
            "+TR;>;)V"
        }
    .end annotation

    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Getter;-><init>()V

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/DescriptorKProperty0$Getter;->property:Lkotlin/reflect/jvm/internal/DescriptorKProperty0;

    return-void
.end method


# virtual methods
.method public bridge synthetic getProperty()Lj93/z;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty0$Getter;->getProperty()Lkotlin/reflect/jvm/internal/DescriptorKProperty0;

    move-result-object v0

    return-object v0
.end method

.method public getProperty()Lkotlin/reflect/jvm/internal/DescriptorKProperty0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/reflect/jvm/internal/DescriptorKProperty0<",
            "TR;>;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/DescriptorKProperty0$Getter;->property:Lkotlin/reflect/jvm/internal/DescriptorKProperty0;

    return-object v0
.end method

.method public bridge synthetic getProperty()Lkotlin/reflect/jvm/internal/DescriptorKProperty;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty0$Getter;->getProperty()Lkotlin/reflect/jvm/internal/DescriptorKProperty0;

    move-result-object v0

    return-object v0
.end method

.method public invoke()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TR;"
        }
    .end annotation

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty0$Getter;->getProperty()Lkotlin/reflect/jvm/internal/DescriptorKProperty0;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty0;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
