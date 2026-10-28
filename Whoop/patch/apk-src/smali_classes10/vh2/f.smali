.class public final Lvh2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvh2/f$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\u0011B\u0015\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u0008\u001a\u00020\u0007H\u0086@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0008\u001a\u00020\u0007H\u0086@\u00a2\u0006\u0004\u0008\u0010\u0010\u000eR\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lvh2/f;",
        "",
        "La6/g;",
        "Lf6/f;",
        "dataStore",
        "<init>",
        "(La6/g;)V",
        "",
        "strapId",
        "Lf6/d;",
        "",
        "c",
        "(Ljava/lang/String;)Lf6/d;",
        "b",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "",
        "d",
        "a",
        "La6/g;",
        "strap-auth_release"
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
.field private static final b:Lvh2/f$a;


# instance fields
.field private final a:La6/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La6/g;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvh2/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lvh2/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lvh2/f;->b:Lvh2/f$a;

    return-void
.end method

.method public constructor <init>(La6/g;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La6/g;",
            ")V"
        }
    .end annotation

    const-string v0, "dataStore"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvh2/f;->a:La6/g;

    return-void
.end method

.method public static final synthetic a(Lvh2/f;Ljava/lang/String;)Lf6/d;
    .locals 0

    invoke-direct {p0, p1}, Lvh2/f;->c(Ljava/lang/String;)Lf6/d;

    move-result-object p0

    return-object p0
.end method

.method private final c(Ljava/lang/String;)Lf6/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lf6/d;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "strap_stuck_locked_count_"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lge3/g;->C(Ljava/lang/String;)Lf6/d;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final b(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lvh2/f$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lvh2/f$b;

    iget v1, v0, Lvh2/f$b;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lvh2/f$b;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lvh2/f$b;

    invoke-direct {v0, p0, p2}, Lvh2/f$b;-><init>(Lvh2/f;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lvh2/f$b;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lvh2/f$b;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lvh2/f$b;->x:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/e0;

    iget-object v0, v0, Lvh2/f$b;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, Lkotlin/jvm/internal/e0;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iget-object v2, p0, Lvh2/f;->a:La6/g;

    new-instance v4, Lvh2/f$c;

    const/4 v5, 0x0

    invoke-direct {v4, p2, p0, p1, v5}, Lvh2/f$c;-><init>(Lkotlin/jvm/internal/e0;Lvh2/f;Ljava/lang/String;Lq83/d;)V

    iput-object v5, v0, Lvh2/f$b;->w:Ljava/lang/Object;

    iput-object p2, v0, Lvh2/f$b;->x:Ljava/lang/Object;

    iput v3, v0, Lvh2/f$b;->E:I

    invoke-static {v2, v4, v0}, Lhg3/i;->G(La6/g;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p2

    :goto_1
    iget p1, p1, Lkotlin/jvm/internal/e0;->w:I

    new-instance p2, Ljava/lang/Integer;

    invoke-direct {p2, p1}, Ljava/lang/Integer;-><init>(I)V

    return-object p2
.end method

.method public final d(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lvh2/f$d;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lvh2/f$d;

    iget v1, v0, Lvh2/f$d;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lvh2/f$d;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lvh2/f$d;

    invoke-direct {v0, p0, p2}, Lvh2/f$d;-><init>(Lvh2/f;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lvh2/f$d;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lvh2/f$d;->F:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lvh2/f$d;->y:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/b0;

    iget-object v1, v0, Lvh2/f$d;->x:Ljava/lang/Object;

    check-cast v1, Lf6/d;

    iget-object v0, v0, Lvh2/f$d;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lvh2/f;->c(Ljava/lang/String;)Lf6/d;

    move-result-object p1

    new-instance p2, Lkotlin/jvm/internal/b0;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iget-object v2, p0, Lvh2/f;->a:La6/g;

    new-instance v4, Lvh2/f$e;

    const/4 v5, 0x0

    invoke-direct {v4, p2, p1, v5}, Lvh2/f$e;-><init>(Lkotlin/jvm/internal/b0;Lf6/d;Lq83/d;)V

    iput-object v5, v0, Lvh2/f$d;->w:Ljava/lang/Object;

    iput-object v5, v0, Lvh2/f$d;->x:Ljava/lang/Object;

    iput-object p2, v0, Lvh2/f$d;->y:Ljava/lang/Object;

    iput v3, v0, Lvh2/f$d;->F:I

    invoke-static {v2, v4, v0}, Lhg3/i;->G(La6/g;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p2

    :goto_1
    iget-boolean p1, p1, Lkotlin/jvm/internal/b0;->w:Z

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
