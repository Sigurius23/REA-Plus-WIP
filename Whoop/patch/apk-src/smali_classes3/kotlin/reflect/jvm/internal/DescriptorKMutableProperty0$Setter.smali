.class public final Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0$Setter;
.super Lkotlin/reflect/jvm/internal/DescriptorKProperty$Setter;
.source "SourceFile"

# interfaces
.implements Lj93/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Setter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlin/reflect/jvm/internal/DescriptorKProperty$Setter<",
        "TR;>;",
        "Lj93/i;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000*\u0004\u0008\u0001\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00010\u00022\u0008\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00028\u0001H\u0096\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bR \u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0$Setter;",
        "R",
        "Lkotlin/reflect/jvm/internal/DescriptorKProperty$Setter;",
        "Lj93/i;",
        "Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0;",
        "property",
        "<init>",
        "(Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0;)V",
        "value",
        "Ll83/a0;",
        "invoke",
        "(Ljava/lang/Object;)V",
        "Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0;",
        "getProperty",
        "()Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0;",
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
.field private final property:Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0<",
            "TR;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0<",
            "TR;>;)V"
        }
    .end annotation

    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Setter;-><init>()V

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0$Setter;->property:Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0;

    return-void
.end method


# virtual methods
.method public bridge synthetic getProperty()Lj93/z;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0$Setter;->getProperty()Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0;

    move-result-object v0

    return-object v0
.end method

.method public getProperty()Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0<",
            "TR;>;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0$Setter;->property:Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0;

    return-object v0
.end method

.method public bridge synthetic getProperty()Lkotlin/reflect/jvm/internal/DescriptorKProperty;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0$Setter;->getProperty()Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0$Setter;->invoke(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;)V"
        }
    .end annotation

    .line 2
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0$Setter;->getProperty()Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lkotlin/reflect/jvm/internal/DescriptorKMutableProperty0;->set(Ljava/lang/Object;)V

    return-void
.end method
