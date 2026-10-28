.class final Lpu2/f$f$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpu2/f$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lpu2/e;",
        "newState",
        "Ll83/a0;",
        "<anonymous>",
        "(Lpu2/e;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.weightlifting.feature.active.activeworkout.presentation.ActiveWorkoutViewModel$onCreate$1$1"
    f = "ActiveWorkoutViewModel.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lpu2/f;


# direct methods
.method public constructor <init>(Lpu2/f;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpu2/f;",
            "Lq83/d<",
            "-",
            "Lpu2/f$f$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lpu2/f$f$a;->y:Lpu2/f;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lpu2/f;Lhu2/a$c0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lpu2/f$f$a;->i(Lpu2/f;Lhu2/a$c0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Lpu2/f;Lhu2/a$c0;)Ll83/a0;
    .locals 0

    invoke-virtual {p0, p1}, Lpu2/f;->v(Lhu2/a$c0;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance v0, Lpu2/f$f$a;

    iget-object v1, p0, Lpu2/f$f$a;->y:Lpu2/f;

    invoke-direct {v0, v1, p2}, Lpu2/f$f$a;-><init>(Lpu2/f;Lq83/d;)V

    iput-object p1, v0, Lpu2/f$f$a;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final h(Lpu2/e;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpu2/e;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lpu2/f$f$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lpu2/f$f$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lpu2/f$f$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lpu2/e;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lpu2/f$f$a;->h(Lpu2/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lpu2/f$f$a;->x:Ljava/lang/Object;

    check-cast v0, Lpu2/e;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lpu2/f$f$a;->w:I

    if-nez v1, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lpu2/f$f$a;->y:Lpu2/f;

    invoke-static {p1}, Lpu2/f;->n(Lpu2/f;)Lpu2/b;

    move-result-object p1

    iget-object v1, p0, Lpu2/f$f$a;->y:Lpu2/f;

    new-instance v2, Lpu2/g;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3}, Lpu2/g;-><init>(Lpu2/f;I)V

    invoke-virtual {p1, v0, v2}, Lpu2/b;->p(Lpu2/e;Lkotlin/jvm/functions/Function1;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
