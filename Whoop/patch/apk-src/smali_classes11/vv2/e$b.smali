.class final Lvv2/e$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvv2/e;->x(Lcom/whoop/weightlifting/StrengthTrainerDestination$g$a;Lfi0/a;Lvv2/a;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.whoop.weightlifting.feature.linkworkouts.view.LinkWorkoutScreenKt$LinkWorkoutScreen$1$1"
    f = "LinkWorkoutScreen.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lcom/whoop/weightlifting/StrengthTrainerDestination$g$a;

.field final synthetic y:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/whoop/weightlifting/StrengthTrainerDestination$g$a;Ll83/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weightlifting/StrengthTrainerDestination$g$a;",
            "Ll83/h;",
            "Lq83/d<",
            "-",
            "Lvv2/e$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvv2/e$b;->x:Lcom/whoop/weightlifting/StrengthTrainerDestination$g$a;

    iput-object p2, p0, Lvv2/e$b;->y:Ll83/h;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
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

    new-instance p1, Lvv2/e$b;

    iget-object v0, p0, Lvv2/e$b;->x:Lcom/whoop/weightlifting/StrengthTrainerDestination$g$a;

    iget-object v1, p0, Lvv2/e$b;->y:Ll83/h;

    invoke-direct {p1, v0, v1, p2}, Lvv2/e$b;-><init>(Lcom/whoop/weightlifting/StrengthTrainerDestination$g$a;Ll83/h;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lvv2/e$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvv2/e$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvv2/e$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvv2/e$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lvv2/e$b;->w:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lvv2/e$b;->y:Ll83/h;

    invoke-static {p1}, Lvv2/e;->Q(Ll83/h;)Luv2/b;

    move-result-object p1

    new-instance v0, Luv2/a$b;

    iget-object v1, p0, Lvv2/e$b;->x:Lcom/whoop/weightlifting/StrengthTrainerDestination$g$a;

    invoke-virtual {v1}, Lcom/whoop/weightlifting/StrengthTrainerDestination$g$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Luv2/a$b;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Luv2/b;->n(Luv2/a$i;)V

    iget-object p1, p0, Lvv2/e$b;->y:Ll83/h;

    invoke-static {p1}, Lvv2/e;->Q(Ll83/h;)Luv2/b;

    move-result-object p1

    sget-object v0, Luv2/a$d;->a:Luv2/a$d;

    invoke-virtual {p1, v0}, Luv2/b;->n(Luv2/a$i;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
