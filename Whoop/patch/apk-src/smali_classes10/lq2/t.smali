.class public abstract Llq2/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llq2/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llq2/t$a;,
        Llq2/t$b;,
        Llq2/t$c;,
        Llq2/t$d;,
        Llq2/t$e;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0005\n\u0011\u000e\u0012\rB/\u0008\u0004\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u001d\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\n\u0010\u000cR\u001d\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000b\u001a\u0004\u0008\u000e\u0010\u000cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\r\u0010\u0010\u0082\u0001\u0005\u0013\u0014\u0015\u0016\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Llq2/t;",
        "Llq2/e;",
        "",
        "Li2/x;",
        "colors",
        "secondaryColors",
        "Llq2/f;",
        "option",
        "<init>",
        "(Ljava/util/List;Ljava/util/List;Llq2/f;)V",
        "a",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "b",
        "c",
        "Llq2/f;",
        "()Llq2/f;",
        "d",
        "e",
        "Llq2/t$a;",
        "Llq2/t$b;",
        "Llq2/t$c;",
        "Llq2/t$d;",
        "Llq2/t$e;",
        "user-journey_release"
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
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Li2/x;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Li2/x;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Llq2/f;


# direct methods
.method private constructor <init>(Ljava/util/List;Ljava/util/List;Llq2/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Li2/x;",
            ">;",
            "Ljava/util/List<",
            "Li2/x;",
            ">;",
            "Llq2/f;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Llq2/t;->a:Ljava/util/List;

    .line 4
    iput-object p2, p0, Llq2/t;->b:Ljava/util/List;

    .line 5
    iput-object p3, p0, Llq2/t;->c:Llq2/f;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/List;Llq2/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    .line 6
    move-object p2, p1

    check-cast p2, Ljava/util/Collection;

    invoke-static {p2}, Lwb3/f;->B(Ljava/util/Collection;)Li93/j;

    move-result-object p2

    .line 7
    new-instance p4, Ljava/util/ArrayList;

    const/16 p5, 0xa

    invoke-static {p2, p5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p5

    invoke-direct {p4, p5}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p5

    if-eqz p5, :cond_0

    move-object p5, p2

    check-cast p5, Lm83/e0;

    invoke-virtual {p5}, Lm83/e0;->nextInt()I

    move-result p5

    .line 9
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    sub-int/2addr v0, p5

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Li2/x;

    .line 10
    iget-wide v0, p5, Li2/x;->a:J

    .line 11
    new-instance p5, Li2/x;

    invoke-direct {p5, v0, v1}, Li2/x;-><init>(J)V

    .line 12
    invoke-interface {p4, p5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    move-object p2, p4

    :cond_1
    const/4 p4, 0x0

    .line 13
    invoke-direct {p0, p1, p2, p3, p4}, Llq2/t;-><init>(Ljava/util/List;Ljava/util/List;Llq2/f;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/List;Llq2/f;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Llq2/t;-><init>(Ljava/util/List;Ljava/util/List;Llq2/f;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Li2/x;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llq2/t;->a:Ljava/util/List;

    return-object v0
.end method

.method public final b()Llq2/f;
    .locals 1

    iget-object v0, p0, Llq2/t;->c:Llq2/f;

    return-object v0
.end method

.method public final c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Li2/x;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llq2/t;->b:Ljava/util/List;

    return-object v0
.end method
