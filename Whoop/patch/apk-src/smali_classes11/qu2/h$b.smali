.class final Lqu2/h$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqu2/h;->b0(Ll0/y;Lqu2/j;Lin2/e;Lpu2/h$e;Lkotlin/jvm/functions/Function1;Lp1/c1;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.weightlifting.feature.active.activeworkout.view.ActiveWorkoutScreenKt$ActiveWorkoutContent$2$1"
    f = "ActiveWorkoutScreen.kt"
    l = {
        0x19d
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lg2/i;

.field w:I

.field final synthetic x:Lbm/t;

.field final synthetic y:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic z:Lb3/x2;


# direct methods
.method public constructor <init>(Lbm/t;Lp1/c1;Lb3/x2;Lg2/i;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbm/t;",
            "Lp1/c1;",
            "Lb3/x2;",
            "Lg2/i;",
            "Lq83/d<",
            "-",
            "Lqu2/h$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqu2/h$b;->x:Lbm/t;

    iput-object p2, p0, Lqu2/h$b;->y:Lp1/c1;

    iput-object p3, p0, Lqu2/h$b;->z:Lb3/x2;

    iput-object p4, p0, Lqu2/h$b;->E:Lg2/i;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lbm/t;)I
    .locals 0

    invoke-static {p0}, Lqu2/h$b;->h(Lbm/t;)I

    move-result p0

    return p0
.end method

.method private static final h(Lbm/t;)I
    .locals 0

    invoke-virtual {p0}, Lbm/t;->l()I

    move-result p0

    return p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Lqu2/h$b;

    iget-object v1, p0, Lqu2/h$b;->x:Lbm/t;

    iget-object v2, p0, Lqu2/h$b;->y:Lp1/c1;

    iget-object v3, p0, Lqu2/h$b;->z:Lb3/x2;

    iget-object v4, p0, Lqu2/h$b;->E:Lg2/i;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lqu2/h$b;-><init>(Lbm/t;Lp1/c1;Lb3/x2;Lg2/i;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lqu2/h$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lqu2/h$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lqu2/h$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lqu2/h$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lqu2/h$b;->w:I

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

    iget-object p1, p0, Lqu2/h$b;->x:Lbm/t;

    new-instance v1, Lqu2/i;

    const/4 v3, 0x0

    invoke-direct {v1, p1, v3}, Lqu2/i;-><init>(Ljava/lang/Object;I)V

    invoke-static {v1}, Lp1/x;->H(Lc93/a;)Lec3/s1;

    move-result-object p1

    new-instance v1, Lqu2/h$b$a;

    iget-object v3, p0, Lqu2/h$b;->y:Lp1/c1;

    iget-object v4, p0, Lqu2/h$b;->z:Lb3/x2;

    iget-object v5, p0, Lqu2/h$b;->E:Lg2/i;

    invoke-direct {v1, v3, v4, v5}, Lqu2/h$b$a;-><init>(Lp1/c1;Lb3/x2;Lg2/i;)V

    iput v2, p0, Lqu2/h$b;->w:I

    invoke-virtual {p1, v1, p0}, Lec3/s1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
