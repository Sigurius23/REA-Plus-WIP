.class final Lvp1/h$q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvp1/h;->H0(Ltp1/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvp1/h$q$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lm91/u;

.field final synthetic x:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic y:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lm91/u;Lkotlin/jvm/functions/Function1;Lp1/c1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm91/u;",
            "Lkotlin/jvm/functions/Function1;",
            "Lp1/c1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lvp1/h$q;->w:Lm91/u;

    iput-object p2, p0, Lvp1/h$q;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lvp1/h$q;->y:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lvp1/h$q;->w:Lm91/u;

    check-cast v0, Ltp1/g;

    invoke-virtual {v0}, Ltp1/g;->f()Ltp1/h;

    move-result-object v0

    const/4 v1, -0x1

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    sget-object v2, Lvp1/h$q$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v2, v0

    :goto_0
    if-eq v0, v1, :cond_6

    const/4 v1, 0x1

    if-eq v0, v1, :cond_5

    const/4 v1, 0x2

    if-eq v0, v1, :cond_4

    const/4 v1, 0x3

    if-eq v0, v1, :cond_3

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lvp1/h$q;->y:Lp1/c1;

    sget-object v1, Lvp1/a;->GOALS:Lvp1/a;

    invoke-static {v0, v1}, Lvp1/h;->h2(Lp1/c1;Lvp1/a;)V

    return-void

    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_2
    iget-object v0, p0, Lvp1/h$q;->y:Lp1/c1;

    sget-object v1, Lvp1/a;->FERTILITY_INSIGHTS_DISABLE_SURVEY:Lvp1/a;

    invoke-static {v0, v1}, Lvp1/h;->h2(Lp1/c1;Lvp1/a;)V

    return-void

    :cond_3
    iget-object v0, p0, Lvp1/h$q;->x:Lkotlin/jvm/functions/Function1;

    sget-object v1, Lyn1/a$n;->a:Lyn1/a$n;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lvp1/h$q;->y:Lp1/c1;

    sget-object v1, Lvp1/a;->PREVIOUS_PREGNANCIES:Lvp1/a;

    invoke-static {v0, v1}, Lvp1/h;->h2(Lp1/c1;Lvp1/a;)V

    return-void

    :cond_4
    iget-object v0, p0, Lvp1/h$q;->x:Lkotlin/jvm/functions/Function1;

    sget-object v1, Lyn1/a$k;->a:Lyn1/a$k;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lvp1/h$q;->y:Lp1/c1;

    sget-object v1, Lvp1/a;->CONTRACEPTION:Lvp1/a;

    invoke-static {v0, v1}, Lvp1/h;->h2(Lp1/c1;Lvp1/a;)V

    return-void

    :cond_5
    iget-object v0, p0, Lvp1/h$q;->x:Lkotlin/jvm/functions/Function1;

    sget-object v1, Lyn1/a$m;->a:Lyn1/a$m;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lvp1/h$q;->y:Lp1/c1;

    sget-object v1, Lvp1/a;->MODE:Lvp1/a;

    invoke-static {v0, v1}, Lvp1/h;->h2(Lp1/c1;Lvp1/a;)V

    :cond_6
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lvp1/h$q;->a()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
