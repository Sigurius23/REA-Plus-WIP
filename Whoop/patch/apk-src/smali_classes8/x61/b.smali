.class public final Lx61/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0014\u0008\u0007\u0018\u00002\u00020\u0001BA\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ+\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0017R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "Lx61/b;",
        "",
        "",
        "Ly61/a;",
        "groups",
        "Lx61/d;",
        "merger",
        "Landroid/content/Context;",
        "context",
        "Lx61/c;",
        "mergeDecider",
        "",
        "parentWidth",
        "fontScale",
        "<init>",
        "(Ljava/util/List;Lx61/d;Landroid/content/Context;Lx61/c;FF)V",
        "accumulatedGroups",
        "nextGroup",
        "a",
        "(Ljava/util/List;Ly61/a;)Ljava/util/List;",
        "b",
        "()Ljava/util/List;",
        "Ljava/util/List;",
        "Lx61/d;",
        "c",
        "Landroid/content/Context;",
        "d",
        "Lx61/c;",
        "e",
        "F",
        "f",
        "design_release"
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
            "Ly61/a;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lx61/d;

.field private final c:Landroid/content/Context;

.field private final d:Lx61/c;

.field private final e:F

.field private final f:F


# direct methods
.method public constructor <init>(Ljava/util/List;Lx61/d;Landroid/content/Context;Lx61/c;FF)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ly61/a;",
            ">;",
            "Lx61/d;",
            "Landroid/content/Context;",
            "Lx61/c;",
            "FF)V"
        }
    .end annotation

    const-string v0, "groups"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "merger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mergeDecider"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lx61/b;->a:Ljava/util/List;

    .line 3
    iput-object p2, p0, Lx61/b;->b:Lx61/d;

    .line 4
    iput-object p3, p0, Lx61/b;->c:Landroid/content/Context;

    .line 5
    iput-object p4, p0, Lx61/b;->d:Lx61/c;

    .line 6
    iput p5, p0, Lx61/b;->e:F

    .line 7
    iput p6, p0, Lx61/b;->f:F

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lx61/d;Landroid/content/Context;Lx61/c;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_0

    .line 8
    new-instance p2, Lx61/d;

    invoke-direct {p2}, Lx61/d;-><init>()V

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_1

    .line 9
    new-instance p4, Lx61/c;

    const/4 p2, 0x0

    const/4 p7, 0x2

    invoke-direct {p4, p3, p2, p7, p2}, Lx61/c;-><init>(Landroid/content/Context;Lx61/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    move v6, p6

    .line 10
    invoke-direct/range {v0 .. v6}, Lx61/b;-><init>(Ljava/util/List;Lx61/d;Landroid/content/Context;Lx61/c;FF)V

    return-void
.end method

.method private final a(Ljava/util/List;Ly61/a;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ly61/a;",
            ">;",
            "Ly61/a;",
            ")",
            "Ljava/util/List<",
            "Ly61/a;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly61/a;

    if-nez v0, :cond_0

    invoke-static {p2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v1, p0, Lx61/b;->d:Lx61/c;

    iget v2, p0, Lx61/b;->e:F

    iget v3, p0, Lx61/b;->f:F

    invoke-virtual {v1, v0, p2, v2, v3}, Lx61/c;->c(Ly61/a;Ly61/a;FF)Z

    move-result v1

    if-eqz v1, :cond_1

    check-cast p1, Ljava/util/Collection;

    invoke-static {p1}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v1

    iget-object v2, p0, Lx61/b;->b:Lx61/d;

    invoke-virtual {v2, v0, p2}, Lx61/d;->b(Ly61/a;Ly61/a;)Ly61/a;

    move-result-object p2

    invoke-virtual {p1, v1, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-object p1

    :cond_1
    check-cast p1, Ljava/util/Collection;

    invoke-static {p2, p1}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final b()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ly61/a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lx61/b;->a:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    sget-object v1, Lm83/y;->w:Lm83/y;

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly61/a;

    invoke-direct {p0, v1, v2}, Lx61/b;->a(Ljava/util/List;Ly61/a;)Ljava/util/List;

    move-result-object v1

    goto :goto_0

    :cond_0
    return-object v1
.end method
