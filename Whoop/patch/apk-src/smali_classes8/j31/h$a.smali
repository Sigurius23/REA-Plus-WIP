.class final Lj31/h$a;
.super Ls83/h;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj31/h;->a(Lu2/v;JLc93/a;Lc93/a;Lc93/m;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/h;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lu2/b;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lu2/b;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.design.atomic.molecule.reordable.ReorderableKt$detectDrag$4"
    f = "Reorderable.kt"
    l = {
        0x45
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field final synthetic F:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field final synthetic G:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:J


# direct methods
.method public constructor <init>(JLc93/a;Lc93/a;Lc93/m;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lc93/a;",
            "Lc93/a;",
            "Lc93/m;",
            "Lq83/d<",
            "-",
            "Lj31/h$a;",
            ">;)V"
        }
    .end annotation

    iput-wide p1, p0, Lj31/h$a;->z:J

    iput-object p3, p0, Lj31/h$a;->E:Lc93/a;

    iput-object p4, p0, Lj31/h$a;->F:Lc93/a;

    iput-object p5, p0, Lj31/h$a;->G:Lc93/m;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/h;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lc93/m;Lu2/r;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lj31/h$a;->i(Lc93/m;Lu2/r;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Lc93/m;Lu2/r;)Ll83/a0;
    .locals 3

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lu2/d0;->k(Lu2/r;Z)J

    move-result-wide v0

    new-instance v2, Lh2/b;

    invoke-direct {v2, v0, v1}, Lh2/b;-><init>(J)V

    invoke-interface {p0, p1, v2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lu2/r;->a()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
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

    new-instance v0, Lj31/h$a;

    iget-wide v1, p0, Lj31/h$a;->z:J

    iget-object v3, p0, Lj31/h$a;->E:Lc93/a;

    iget-object v4, p0, Lj31/h$a;->F:Lc93/a;

    iget-object v5, p0, Lj31/h$a;->G:Lc93/m;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lj31/h$a;-><init>(JLc93/a;Lc93/a;Lc93/m;Lq83/d;)V

    iput-object p1, v0, Lj31/h$a;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public final h(Lu2/b;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu2/b;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lj31/h$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lj31/h$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lj31/h$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu2/b;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lj31/h$a;->h(Lu2/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lj31/h$a;->y:Ljava/lang/Object;

    check-cast v0, Lu2/b;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lj31/h$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-wide v4, p0, Lj31/h$a;->z:J

    iget-object p1, p0, Lj31/h$a;->G:Lc93/m;

    new-instance v2, Lj31/g;

    invoke-direct {v2, p1}, Lj31/g;-><init>(Lc93/m;)V

    iput-object v0, p0, Lj31/h$a;->y:Ljava/lang/Object;

    iput v3, p0, Lj31/h$a;->x:I

    invoke-static {v0, v4, v5, v2, p0}, Lh0/z0;->j(Lu2/b;JLkotlin/jvm/functions/Function1;Ls83/a;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_5

    check-cast v0, Lu2/g0;

    iget-object p1, v0, Lu2/g0;->F:Lu2/h0;

    iget-object p1, p1, Lu2/h0;->T:Lu2/k;

    iget-object p1, p1, Lu2/k;->a:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu2/r;

    invoke-static {v0}, Lu2/d0;->d(Lu2/r;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Lu2/r;->a()V

    goto :goto_1

    :cond_4
    iget-object p1, p0, Lj31/h$a;->E:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    goto :goto_2

    :cond_5
    iget-object p1, p0, Lj31/h$a;->F:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
