.class final Lsv2/e$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsv2/e;->S(Lrv2/h$b;Lg1/y3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.whoop.weightlifting.feature.library.view.WorkoutLibraryScreenKt$BottomSheetMenuButtons$1$2$2$1$1"
    f = "WorkoutLibraryScreen.kt"
    l = {
        0x1db
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lrv2/h$b;

.field final synthetic F:Lg1/y3;

.field final synthetic G:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field w:Ljava/lang/Object;

.field x:J

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Lrv2/h$b;Lg1/y3;Lkotlin/jvm/functions/Function1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrv2/h$b;",
            "Lg1/y3;",
            "Lkotlin/jvm/functions/Function1;",
            "Lq83/d<",
            "-",
            "Lsv2/e$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsv2/e$b;->E:Lrv2/h$b;

    iput-object p2, p0, Lsv2/e$b;->F:Lg1/y3;

    iput-object p3, p0, Lsv2/e$b;->G:Lkotlin/jvm/functions/Function1;

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

    new-instance p1, Lsv2/e$b;

    iget-object v0, p0, Lsv2/e$b;->E:Lrv2/h$b;

    iget-object v1, p0, Lsv2/e$b;->F:Lg1/y3;

    iget-object v2, p0, Lsv2/e$b;->G:Lkotlin/jvm/functions/Function1;

    invoke-direct {p1, v0, v1, v2, p2}, Lsv2/e$b;-><init>(Lrv2/h$b;Lg1/y3;Lkotlin/jvm/functions/Function1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lsv2/e$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lsv2/e$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lsv2/e$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lsv2/e$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lsv2/e$b;->z:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-wide v0, p0, Lsv2/e$b;->x:J

    iget-object v3, p0, Lsv2/e$b;->w:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lsv2/e$b;->E:Lrv2/h$b;

    invoke-virtual {p1}, Lrv2/h$b;->s()Ljava/lang/Long;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v1, p0, Lsv2/e$b;->F:Lg1/y3;

    iget-object v3, p0, Lsv2/e$b;->G:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    iput-object v3, p0, Lsv2/e$b;->w:Ljava/lang/Object;

    iput-wide v4, p0, Lsv2/e$b;->x:J

    const/4 p1, 0x0

    iput p1, p0, Lsv2/e$b;->y:I

    iput v2, p0, Lsv2/e$b;->z:I

    invoke-virtual {v1, p0}, Lg1/y3;->d(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    move-wide v0, v4

    :goto_0
    sget-object p1, Lrv2/d$b0;->a:Lrv2/d$b0;

    invoke-interface {v3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Lrv2/d$j;

    invoke-direct {p1, v0, v1, v2}, Lrv2/d$j;-><init>(JZ)V

    invoke-interface {v3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
