.class public final Lo23/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:Lo23/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo23/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo23/c;->a:Lo23/c;

    return-void
.end method

.method public static b(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;
    .locals 4

    new-instance v0, Ld33/x;

    const/4 v1, 0x2

    const/4 v2, 0x7

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Ld33/x;-><init>(IILq83/d;)V

    sget-object v1, Lo23/c;->a:Lo23/c;

    invoke-virtual {v1, v0, p0, p1}, Lo23/c;->a(Lc93/m;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lc93/m;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p3, Lo23/b;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lo23/b;

    iget v1, v0, Lo23/b;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lo23/b;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lo23/b;

    invoke-direct {v0, p0, p3}, Lo23/b;-><init>(Lo23/c;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lo23/b;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lo23/b;->F:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lo23/b;->y:Ljava/lang/Object;

    iget-object p2, v0, Lo23/b;->x:Lc93/m;

    iget-object v2, v0, Lo23/b;->w:Lo23/c;

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_3
    iget-object p1, v0, Lo23/b;->x:Lc93/m;

    iget-object v2, v0, Lo23/b;->w:Lo23/c;

    :try_start_1
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p2

    move-object v6, p2

    move-object p2, p1

    move-object p1, v6

    goto :goto_3

    :cond_4
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    iput-object p0, v0, Lo23/b;->w:Lo23/c;

    iput-object p1, v0, Lo23/b;->x:Lc93/m;

    iput v5, v0, Lo23/b;->F:I

    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne p3, v1, :cond_5

    goto :goto_5

    :cond_5
    move-object v2, p0

    :goto_1
    :try_start_3
    move-object p2, p3

    check-cast p2, Ln23/h;

    iput-object v2, v0, Lo23/b;->w:Lo23/c;

    iput-object p1, v0, Lo23/b;->x:Lc93/m;

    iput-object p3, v0, Lo23/b;->y:Ljava/lang/Object;

    iput v4, v0, Lo23/b;->F:I

    invoke-static {v0}, Lbc3/f0;->L(Ls83/c;)Ljava/lang/Object;

    move-result-object p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-ne p2, v1, :cond_6

    goto :goto_5

    :cond_6
    move-object p2, p1

    move-object p1, p3

    :goto_2
    :try_start_4
    check-cast p1, Ln23/h;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    return-object p1

    :catchall_2
    move-exception p2

    move-object v2, p2

    move-object p2, p1

    move-object p1, v2

    move-object v2, p0

    :goto_3
    instance-of p3, p1, Ljava/util/concurrent/CancellationException;

    if-eqz p3, :cond_7

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Ln23/f;

    new-instance p3, Ln23/a;

    const-string v2, "The call was canceled before complete its execution."

    invoke-direct {p3, v2}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p3}, Ln23/f;-><init>(Ln23/e;)V

    goto :goto_4

    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p3, Ln23/f;

    new-instance v2, Ln23/d;

    const-string v4, ""

    invoke-direct {v2, v4, p1}, Ln23/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p3, v2}, Ln23/f;-><init>(Ln23/e;)V

    move-object p1, p3

    :goto_4
    const/4 p3, 0x0

    iput-object p3, v0, Lo23/b;->w:Lo23/c;

    iput-object p3, v0, Lo23/b;->x:Lc93/m;

    iput-object p3, v0, Lo23/b;->y:Ljava/lang/Object;

    iput v3, v0, Lo23/b;->F:I

    invoke-interface {p2, p1, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_8

    :goto_5
    return-object v1

    :cond_8
    :goto_6
    check-cast p3, Ln23/h;

    return-object p3
.end method
