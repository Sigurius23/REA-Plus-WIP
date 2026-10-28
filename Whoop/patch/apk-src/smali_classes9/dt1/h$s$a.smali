.class final Ldt1/h$s$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldt1/h$s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.labrador.feature.details.domain.LabradorDetailsInteractor$updateSymptomsAndNotesForUnsavedReading$1$1"
    f = "LabradorDetailsInteractor.kt"
    l = {
        0xd4,
        0xd5,
        0xd6,
        0xd9
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic F:Ljava/lang/String;

.field final synthetic G:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field

.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Ldt1/h;

.field final synthetic z:Ljava/time/Instant;


# direct methods
.method public constructor <init>(Ldt1/h;Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;Lec3/m;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt1/h;",
            "Ljava/time/Instant;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ldt1/h$s$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldt1/h$s$a;->y:Ldt1/h;

    iput-object p2, p0, Ldt1/h$s$a;->z:Ljava/time/Instant;

    iput-object p3, p0, Ldt1/h$s$a;->E:Ljava/util/List;

    iput-object p4, p0, Ldt1/h$s$a;->F:Ljava/lang/String;

    iput-object p5, p0, Ldt1/h$s$a;->G:Lec3/m;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Ldt1/h$s$a;

    iget-object v1, p0, Ldt1/h$s$a;->y:Ldt1/h;

    iget-object v2, p0, Ldt1/h$s$a;->z:Ljava/time/Instant;

    iget-object v3, p0, Ldt1/h$s$a;->E:Ljava/util/List;

    iget-object v4, p0, Ldt1/h$s$a;->F:Ljava/lang/String;

    iget-object v5, p0, Ldt1/h$s$a;->G:Lec3/m;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Ldt1/h$s$a;-><init>(Ldt1/h;Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;Lec3/m;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Ldt1/h$s$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ldt1/h$s$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ldt1/h$s$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ldt1/h$s$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v0, p0, Ldt1/h$s$a;->x:I

    const/4 v2, 0x0

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v0, :cond_4

    if-eq v0, v6, :cond_3

    if-eq v0, v5, :cond_2

    if-eq v0, v4, :cond_1

    if-ne v0, v3, :cond_0

    iget-object v0, p0, Ldt1/h$s$a;->w:Ljava/lang/Object;

    check-cast v0, Landroid/database/sqlite/SQLiteException;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :goto_0
    move-object v11, p0

    goto/16 :goto_6

    :catch_0
    move-exception v0

    move-object p1, v0

    move-object v11, p0

    goto :goto_4

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v11, p0

    goto :goto_2

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Ldt1/h$s$a;->y:Ldt1/h;

    invoke-static {p1}, Ldt1/h;->h(Ldt1/h;)Lqk1/b;

    move-result-object p1

    iget-object v0, p0, Ldt1/h$s$a;->z:Ljava/time/Instant;

    invoke-virtual {v0}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v7

    iput v6, p0, Ldt1/h$s$a;->x:I

    invoke-interface {p1, v7, v8, v2, p0}, Lqk1/b;->d(JZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    move-object v11, p0

    goto :goto_5

    :cond_5
    :goto_1
    iget-object p1, p0, Ldt1/h$s$a;->y:Ldt1/h;

    invoke-static {p1}, Ldt1/h;->h(Ldt1/h;)Lqk1/b;

    move-result-object v6

    iget-object p1, p0, Ldt1/h$s$a;->z:Ljava/time/Instant;

    invoke-virtual {p1}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v7

    iget-object v9, p0, Ldt1/h$s$a;->E:Ljava/util/List;

    iget-object v10, p0, Ldt1/h$s$a;->F:Ljava/lang/String;

    iput v5, p0, Ldt1/h$s$a;->x:I
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_2

    move-object v11, p0

    :try_start_2
    invoke-interface/range {v6 .. v11}, Lqk1/b;->a(JLjava/util/List;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_5

    :cond_6
    :goto_2
    iget-object p1, v11, Ldt1/h$s$a;->G:Lec3/m;

    sget-object v0, Ldt1/b$l;->a:Ldt1/b$l;

    iput v4, v11, Ldt1/h$s$a;->x:I

    invoke-interface {p1, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_1

    if-ne p1, v1, :cond_7

    goto :goto_5

    :catch_1
    move-exception v0

    :goto_3
    move-object p1, v0

    goto :goto_4

    :catch_2
    move-exception v0

    move-object v11, p0

    goto :goto_3

    :goto_4
    iget-object v0, v11, Ldt1/h$s$a;->y:Ldt1/h;

    invoke-static {v0}, Ldt1/h;->k(Ldt1/h;)Ltr2/n;

    move-result-object v0

    const-string v4, "Failed to locally save symptoms and notes for brand new reading"

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v4, p1, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    iget-object p1, v11, Ldt1/h$s$a;->G:Lec3/m;

    new-instance v0, Ldt1/b$p;

    iget-object v2, v11, Ldt1/h$s$a;->z:Ljava/time/Instant;

    iget-object v4, v11, Ldt1/h$s$a;->E:Ljava/util/List;

    iget-object v5, v11, Ldt1/h$s$a;->F:Ljava/lang/String;

    const-string v6, ""

    invoke-direct {v0, v6, v2, v4, v5}, Ldt1/b$p;-><init>(Ljava/lang/String;Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;)V

    const/4 v2, 0x0

    iput-object v2, v11, Ldt1/h$s$a;->w:Ljava/lang/Object;

    iput v3, v11, Ldt1/h$s$a;->x:I

    invoke-interface {p1, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_5
    return-object v1

    :cond_7
    :goto_6
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
