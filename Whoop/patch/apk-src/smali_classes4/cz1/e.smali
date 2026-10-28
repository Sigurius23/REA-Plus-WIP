.class public final Lcz1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcz1/e$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u000bB\u001f\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\tH\u0086@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0086@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcz1/e;",
        "",
        "La6/g;",
        "Lf6/f;",
        "dataStore",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(La6/g;Ltr2/n;)V",
        "",
        "path",
        "a",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "count",
        "Ll83/a0;",
        "b",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "La6/g;",
        "Ltr2/n;",
        "c",
        "milestone-pill-arch-mini_release"
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
.field public static final c:Lcz1/e$a;

.field public static final d:I


# instance fields
.field private final a:La6/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La6/g;"
        }
    .end annotation
.end field

.field private final b:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcz1/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcz1/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcz1/e;->c:Lcz1/e$a;

    const/16 v0, 0x8

    sput v0, Lcz1/e;->d:I

    return-void
.end method

.method public constructor <init>(La6/g;Ltr2/n;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La6/g;",
            "Ltr2/n;",
            ")V"
        }
    .end annotation

    const-string v0, "dataStore"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcz1/e;->a:La6/g;

    .line 3
    iput-object p2, p0, Lcz1/e;->b:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(La6/g;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "MilestonePillPreviousDataStoreHandler"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lcz1/e;-><init>(La6/g;Ltr2/n;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "previousMilestonePillCount_"

    instance-of v1, p2, Lcz1/e$b;

    if-eqz v1, :cond_0

    move-object v1, p2

    check-cast v1, Lcz1/e$b;

    iget v2, v1, Lcz1/e$b;->E:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lcz1/e$b;->E:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcz1/e$b;

    invoke-direct {v1, p0, p2}, Lcz1/e$b;-><init>(Lcz1/e;Lq83/d;)V

    :goto_0
    iget-object p2, v1, Lcz1/e$b;->y:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lcz1/e$b;->E:I

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget-object p1, v1, Lcz1/e$b;->x:Ljava/lang/Object;

    check-cast p1, Lf6/d;

    iget-object v0, v1, Lcz1/e$b;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lge3/g;->U(Ljava/lang/String;)Lf6/d;

    move-result-object p1

    iget-object p2, p0, Lcz1/e;->a:La6/g;

    invoke-interface {p2}, La6/g;->getData()Lec3/l;

    move-result-object p2

    iput-object v5, v1, Lcz1/e$b;->w:Ljava/lang/Object;

    iput-object p1, v1, Lcz1/e$b;->x:Ljava/lang/Object;

    iput v4, v1, Lcz1/e$b;->E:I

    invoke-static {p2, v1}, Lec3/v;->C(Lec3/l;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v2, :cond_3

    return-object v2

    :cond_3
    :goto_1
    check-cast p2, Lf6/f;

    if-eqz p2, :cond_4

    invoke-virtual {p2, p1}, Lf6/f;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    goto :goto_2

    :cond_4
    move-object p1, v5

    :goto_2
    if-eqz p1, :cond_6

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-eqz p2, :cond_5

    goto :goto_3

    :cond_5
    return-object p1

    :cond_6
    :goto_3
    return-object v5

    :goto_4
    invoke-interface {v1}, Lq83/d;->getContext()Lq83/j;

    move-result-object p2

    invoke-static {p2}, Lbc3/f0;->o(Lq83/j;)V

    iget-object p2, p0, Lcz1/e;->b:Ltr2/n;

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "Failed to read previous milestone pill count"

    invoke-interface {p2, v1, p1, v0}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    return-object v5
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "previousMilestonePillCount_"

    instance-of v1, p3, Lcz1/e$c;

    if-eqz v1, :cond_0

    move-object v1, p3

    check-cast v1, Lcz1/e$c;

    iget v2, v1, Lcz1/e$c;->F:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lcz1/e$c;->F:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcz1/e$c;

    invoke-direct {v1, p0, p3}, Lcz1/e$c;-><init>(Lcz1/e;Lq83/d;)V

    :goto_0
    iget-object p3, v1, Lcz1/e$c;->z:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lcz1/e$c;->F:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget-object p1, v1, Lcz1/e$c;->y:Ljava/lang/Object;

    check-cast p1, Lf6/d;

    iget-object p1, v1, Lcz1/e$c;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v1, Lcz1/e$c;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lge3/g;->U(Ljava/lang/String;)Lf6/d;

    move-result-object p1

    iget-object p3, p0, Lcz1/e;->a:La6/g;

    new-instance v0, Lcz1/e$d;

    const/4 v3, 0x0

    invoke-direct {v0, p1, p2, v3}, Lcz1/e$d;-><init>(Lf6/d;Ljava/lang/String;Lq83/d;)V

    iput-object v3, v1, Lcz1/e$c;->w:Ljava/lang/Object;

    iput-object v3, v1, Lcz1/e$c;->x:Ljava/lang/Object;

    iput-object v3, v1, Lcz1/e$c;->y:Ljava/lang/Object;

    iput v4, v1, Lcz1/e$c;->F:I

    invoke-static {p3, v0, v1}, Lhg3/i;->G(La6/g;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v2, :cond_3

    return-object v2

    :goto_1
    invoke-interface {v1}, Lq83/d;->getContext()Lq83/j;

    move-result-object p2

    invoke-static {p2}, Lbc3/f0;->o(Lq83/j;)V

    iget-object p2, p0, Lcz1/e;->b:Ltr2/n;

    const/4 p3, 0x0

    new-array p3, p3, [Lqr2/a$a;

    const-string v0, "Failed to update previous milestone pill count in DataStore"

    invoke-interface {p2, v0, p1, p3}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_3
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
