.class public final Lk72/a$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk72/a$b;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
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
.field final synthetic w:Lec3/m;

.field final synthetic x:Lk72/a;


# direct methods
.method public constructor <init>(Lec3/m;Lk72/a;)V
    .locals 0

    iput-object p1, p0, Lk72/a$b$a;->w:Lec3/m;

    iput-object p2, p0, Lk72/a$b$a;->x:Lk72/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p2, Lk72/a$b$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lk72/a$b$a$a;

    iget v1, v0, Lk72/a$b$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lk72/a$b$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lk72/a$b$a$a;

    invoke-direct {v0, p0, p2}, Lk72/a$b$a$a;-><init>(Lk72/a$b$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lk72/a$b$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lk72/a$b$a$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lk72/a$b$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lk72/a$b$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lk72/a$b$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lk72/a$b$a;->w:Lec3/m;

    check-cast p1, Lg72/b;

    instance-of v2, p1, Lg72/b$b;

    if-eqz v2, :cond_3

    sget-object p1, Lj72/j$f;->a:Lj72/j$f;

    goto/16 :goto_2

    :cond_3
    sget-object v2, Lg72/b$a;->a:Lg72/b$a;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    sget-object p1, Lj72/j$a;->a:Lj72/j$a;

    goto/16 :goto_2

    :cond_4
    sget-object v2, Lg72/b$d;->a:Lg72/b$d;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    sget-object p1, Lj72/j$j;->a:Lj72/j$j;

    goto :goto_2

    :cond_5
    instance-of v2, p1, Lg72/b$e;

    if-eqz v2, :cond_6

    sget-object p1, Lj72/j$k;->a:Lj72/j$k;

    goto :goto_2

    :cond_6
    instance-of v2, p1, Lg72/b$g;

    if-eqz v2, :cond_7

    iget-object v2, p0, Lk72/a$b$a;->x:Lk72/a;

    check-cast p1, Lg72/b$g;

    invoke-static {v2, p1}, Lk72/a;->a(Lk72/a;Lg72/b$g;)Lj72/j;

    move-result-object p1

    goto :goto_2

    :cond_7
    instance-of v2, p1, Lg72/b$c;

    if-eqz v2, :cond_8

    new-instance v2, Lj72/j$i;

    check-cast p1, Lg72/b$c;

    invoke-virtual {p1}, Lg72/b$c;->a()Lg72/e;

    move-result-object v4

    invoke-virtual {p1}, Lg72/b$c;->b()Lg72/f;

    move-result-object p1

    invoke-direct {v2, v4, p1}, Lj72/j$i;-><init>(Lg72/e;Lg72/f;)V

    :goto_1
    move-object p1, v2

    goto :goto_2

    :cond_8
    instance-of v2, p1, Lg72/b$f;

    if-eqz v2, :cond_a

    new-instance v2, Lj72/j$m;

    new-instance v4, Lj72/n;

    check-cast p1, Lg72/b$f;

    invoke-virtual {p1}, Lg72/b$f;->c()Lcom/whoop/sage/onboarding/domain/models/VarianceDialogModel;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/sage/onboarding/domain/models/VarianceDialogModel;->getTitleDisplay()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lg72/b$f;->c()Lcom/whoop/sage/onboarding/domain/models/VarianceDialogModel;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/sage/onboarding/domain/models/VarianceDialogModel;->getDescriptionDisplay()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lg72/b$f;->c()Lcom/whoop/sage/onboarding/domain/models/VarianceDialogModel;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/sage/onboarding/domain/models/VarianceDialogModel;->getPrimaryButtonDisplay()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lg72/b$f;->c()Lcom/whoop/sage/onboarding/domain/models/VarianceDialogModel;

    move-result-object v8

    invoke-virtual {v8}, Lcom/whoop/sage/onboarding/domain/models/VarianceDialogModel;->getSecondaryButtonDisplay()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v4, v5, v6, v7, v8}, Lj72/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lg72/b$f;->a()Lg72/e;

    move-result-object v5

    invoke-virtual {p1}, Lg72/b$f;->b()Lg72/f;

    move-result-object p1

    invoke-direct {v2, v4, v5, p1}, Lj72/j$m;-><init>(Lj72/n;Lg72/e;Lg72/f;)V

    goto :goto_1

    :goto_2
    const/4 v2, 0x0

    iput-object v2, v0, Lk72/a$b$a$a;->y:Ljava/lang/Object;

    iput-object v2, v0, Lk72/a$b$a$a;->E:Ljava/lang/Object;

    iput-object v2, v0, Lk72/a$b$a$a;->F:Ljava/lang/Object;

    iput-object v2, v0, Lk72/a$b$a$a;->G:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Lk72/a$b$a$a;->H:I

    iput v3, v0, Lk72/a$b$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    return-object v1

    :cond_9
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
