.class final Lqu2/h$j;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqu2/h;->n0(Lcom/whoop/weightlifting/StrengthTrainerDestination$a$a;Lcu2/t;Leb/a0;Lj02/o0;ZLc93/a;ZLandroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.weightlifting.feature.active.activeworkout.view.ActiveWorkoutScreenKt$ActiveWorkoutScreen$3$1"
    f = "ActiveWorkoutScreen.kt"
    l = {
        0x98
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field final synthetic y:Lou2/b;

.field final synthetic z:Z


# direct methods
.method public constructor <init>(Ll83/h;Lou2/b;ZLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/h;",
            "Lou2/b;",
            "Z",
            "Lq83/d<",
            "-",
            "Lqu2/h$j;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqu2/h$j;->x:Ll83/h;

    iput-object p2, p0, Lqu2/h$j;->y:Lou2/b;

    iput-boolean p3, p0, Lqu2/h$j;->z:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance p1, Lqu2/h$j;

    iget-object v0, p0, Lqu2/h$j;->x:Ll83/h;

    iget-object v1, p0, Lqu2/h$j;->y:Lou2/b;

    iget-boolean v2, p0, Lqu2/h$j;->z:Z

    invoke-direct {p1, v0, v1, v2, p2}, Lqu2/h$j;-><init>(Ll83/h;Lou2/b;ZLq83/d;)V

    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lqu2/h$j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lqu2/h$j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lqu2/h$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lqu2/h$j;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lqu2/h$j;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lqu2/h$j;->x:Ll83/h;

    invoke-static {p1}, Lqu2/h;->f1(Ll83/h;)Lpu2/f;

    move-result-object p1

    invoke-virtual {p1}, Lpu2/f;->t()Lec3/l;

    move-result-object p1

    new-instance v1, Lqu2/h$j$a;

    iget-object v3, p0, Lqu2/h$j;->y:Lou2/b;

    iget-boolean v4, p0, Lqu2/h$j;->z:Z

    invoke-direct {v1, v3, v4}, Lqu2/h$j$a;-><init>(Lou2/b;Z)V

    iput v2, p0, Lqu2/h$j;->w:I

    invoke-interface {p1, v1, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
