.class final Luu2/w$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luu2/w;->J(Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;Leb/a0;Leb/a0;Lj02/o0;Lfi0/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.weightlifting.feature.builder.details.ExerciseDetailsV2ScreenKt$ExerciseDetailsV2Screen$3$1"
    f = "ExerciseDetailsV2Screen.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;

.field final synthetic z:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;Lc93/a;Ll83/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;",
            "Lc93/a;",
            "Ll83/h;",
            "Lq83/d<",
            "-",
            "Luu2/w$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Luu2/w$e;->y:Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;

    iput-object p2, p0, Luu2/w$e;->z:Lc93/a;

    iput-object p3, p0, Luu2/w$e;->E:Ll83/h;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Luu2/w$e;

    iget-object v1, p0, Luu2/w$e;->y:Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;

    iget-object v2, p0, Luu2/w$e;->z:Lc93/a;

    iget-object v3, p0, Luu2/w$e;->E:Ll83/h;

    invoke-direct {v0, v1, v2, v3, p2}, Luu2/w$e;-><init>(Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;Lc93/a;Ll83/h;Lq83/d;)V

    iput-object p1, v0, Luu2/w$e;->x:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Luu2/w$e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Luu2/w$e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Luu2/w$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Luu2/w$e;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Luu2/w$e;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Luu2/w$e;->w:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Luu2/w$e;->y:Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;

    invoke-virtual {p1}, Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;->c()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    if-nez p1, :cond_0

    iget-object p1, p0, Luu2/w$e;->z:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    return-object v0

    :cond_0
    iget-object v1, p0, Luu2/w$e;->E:Ll83/h;

    invoke-static {v1}, Luu2/w;->b0(Ll83/h;)Luu2/x;

    move-result-object v1

    new-instance v2, Luu2/p$d;

    iget-object v3, p0, Luu2/w$e;->y:Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;

    invoke-virtual {v3}, Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;->b()Lcu2/b;

    move-result-object v3

    iget-object v4, p0, Luu2/w$e;->y:Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;

    invoke-virtual {v4}, Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;->a()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, p1, v3, v4}, Luu2/p$d;-><init>(Ljava/lang/String;Lcu2/b;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Luu2/x;->n(Luu2/p$g;)V

    return-object v0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
