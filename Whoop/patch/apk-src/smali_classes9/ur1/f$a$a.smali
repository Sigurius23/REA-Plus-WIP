.class public final Lur1/f$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lur1/f$a;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Lur1/f;


# direct methods
.method public constructor <init>(Lec3/m;Lur1/f;)V
    .locals 0

    iput-object p1, p0, Lur1/f$a$a;->w:Lec3/m;

    iput-object p2, p0, Lur1/f$a$a;->x:Lur1/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p2, Lur1/f$a$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lur1/f$a$a$a;

    iget v1, v0, Lur1/f$a$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lur1/f$a$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lur1/f$a$a$a;

    invoke-direct {v0, p0, p2}, Lur1/f$a$a$a;-><init>(Lur1/f$a$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lur1/f$a$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lur1/f$a$a$a;->x:I

    const/4 v3, 0x5

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v8, 0x0

    if-eqz v2, :cond_6

    const/4 p1, 0x1

    if-eq v2, p1, :cond_5

    if-eq v2, v6, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lur1/f$a$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lur1/f$a$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lur1/f$a$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget v7, v0, Lur1/f$a$a$a;->K:I

    iget-object p1, v0, Lur1/f$a$a$a;->J:Ljava/lang/Object;

    check-cast p1, Lur1/e;

    iget-object p1, v0, Lur1/f$a$a$a;->I:Ljava/lang/Object;

    check-cast p1, Lq83/d;

    iget-object p1, v0, Lur1/f$a$a$a;->H:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v2, v0, Lur1/f$a$a$a;->G:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v2, v0, Lur1/f$a$a$a;->E:Ljava/lang/Object;

    check-cast v2, Lur1/f$a$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_3
    iget p1, v0, Lur1/f$a$a$a;->K:I

    iget-object v2, v0, Lur1/f$a$a$a;->J:Ljava/lang/Object;

    check-cast v2, Lur1/e;

    iget-object v2, v0, Lur1/f$a$a$a;->I:Ljava/lang/Object;

    check-cast v2, Lq83/d;

    iget-object v2, v0, Lur1/f$a$a$a;->H:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v4, v0, Lur1/f$a$a$a;->G:Ljava/lang/Object;

    check-cast v4, Lec3/m;

    iget-object v4, v0, Lur1/f$a$a$a;->E:Ljava/lang/Object;

    check-cast v4, Lur1/f$a$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_4
    iget v7, v0, Lur1/f$a$a$a;->K:I

    iget-object p1, v0, Lur1/f$a$a$a;->J:Ljava/lang/Object;

    check-cast p1, Lur1/e;

    iget-object p1, v0, Lur1/f$a$a$a;->I:Ljava/lang/Object;

    check-cast p1, Lq83/d;

    iget-object p1, v0, Lur1/f$a$a$a;->H:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v2, v0, Lur1/f$a$a$a;->G:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v2, v0, Lur1/f$a$a$a;->E:Ljava/lang/Object;

    check-cast v2, Lur1/f$a$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    iget-object p1, v0, Lur1/f$a$a$a;->J:Ljava/lang/Object;

    check-cast p1, Lur1/e;

    iget-object v1, v0, Lur1/f$a$a$a;->I:Ljava/lang/Object;

    check-cast v1, Lq83/d;

    iget-object v1, v0, Lur1/f$a$a$a;->H:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    iget-object v1, v0, Lur1/f$a$a$a;->G:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    iget-object v0, v0, Lur1/f$a$a$a;->E:Ljava/lang/Object;

    check-cast v0, Lur1/f$a$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;

    iget-object p2, p0, Lur1/f$a$a;->x:Lur1/f;

    invoke-static {p2}, Lur1/f;->c(Lur1/f;)Lcom/whoop/data/repositories/JournalRepository;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :cond_6
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lur1/f$a$a;->w:Lec3/m;

    check-cast p1, Lur1/e;

    sget-object v2, Lur1/e$d;->a:Lur1/e$d;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    iget-object p1, p0, Lur1/f$a$a;->x:Lur1/f;

    invoke-static {p1}, Lur1/f;->c(Lur1/f;)Lcom/whoop/data/repositories/JournalRepository;

    move-result-object p1

    iput-object v8, v0, Lur1/f$a$a$a;->y:Ljava/lang/Object;

    iput-object v8, v0, Lur1/f$a$a$a;->E:Ljava/lang/Object;

    iput-object v8, v0, Lur1/f$a$a$a;->F:Ljava/lang/Object;

    iput-object v8, v0, Lur1/f$a$a$a;->G:Ljava/lang/Object;

    iput-object p2, v0, Lur1/f$a$a$a;->H:Ljava/lang/Object;

    iput-object v8, v0, Lur1/f$a$a$a;->I:Ljava/lang/Object;

    iput-object v8, v0, Lur1/f$a$a$a;->J:Ljava/lang/Object;

    iput v7, v0, Lur1/f$a$a$a;->K:I

    iput v7, v0, Lur1/f$a$a$a;->L:I

    iput v6, v0, Lur1/f$a$a$a;->x:I

    invoke-virtual {p1, v7, v0}, Lcom/whoop/data/repositories/JournalRepository;->setShouldShowDismissConfirmationDialog(ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto/16 :goto_5

    :cond_7
    move-object p1, p2

    :goto_1
    sget-object p2, Lur1/n$n;->a:Lur1/n$n;

    move-object v9, p2

    move-object p2, p1

    move-object p1, v9

    goto/16 :goto_4

    :cond_8
    instance-of v2, p1, Lur1/e$c;

    if-eqz v2, :cond_a

    iget-object p1, p0, Lur1/f$a$a;->x:Lur1/f;

    invoke-static {p1}, Lur1/f;->c(Lur1/f;)Lcom/whoop/data/repositories/JournalRepository;

    move-result-object p1

    iput-object v8, v0, Lur1/f$a$a$a;->y:Ljava/lang/Object;

    iput-object v8, v0, Lur1/f$a$a$a;->E:Ljava/lang/Object;

    iput-object v8, v0, Lur1/f$a$a$a;->F:Ljava/lang/Object;

    iput-object v8, v0, Lur1/f$a$a$a;->G:Ljava/lang/Object;

    iput-object p2, v0, Lur1/f$a$a$a;->H:Ljava/lang/Object;

    iput-object v8, v0, Lur1/f$a$a$a;->I:Ljava/lang/Object;

    iput-object v8, v0, Lur1/f$a$a$a;->J:Ljava/lang/Object;

    iput v7, v0, Lur1/f$a$a$a;->K:I

    iput v7, v0, Lur1/f$a$a$a;->L:I

    iput v5, v0, Lur1/f$a$a$a;->x:I

    invoke-virtual {p1, v0}, Lcom/whoop/data/repositories/JournalRepository;->getShouldShowDismissConfirmationDialog(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    goto/16 :goto_5

    :cond_9
    move-object v2, p2

    move-object p2, p1

    move p1, v7

    :goto_2
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    new-instance v4, Lur1/n$p;

    new-instance v5, Lsr1/d;

    invoke-direct {v5, p2, v7, v6, v8}, Lsr1/d;-><init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v4, v5, v7, v6, v8}, Lur1/n$p;-><init>(Lsr1/d;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move v7, p1

    move-object p2, v2

    move-object p1, v4

    goto :goto_4

    :cond_a
    instance-of v2, p1, Lur1/e$b;

    if-eqz v2, :cond_d

    check-cast p1, Lur1/e$b;

    invoke-virtual {p1}, Lur1/e$b;->a()Z

    move-result p1

    if-eqz p1, :cond_c

    iget-object p1, p0, Lur1/f$a$a;->x:Lur1/f;

    invoke-static {p1}, Lur1/f;->c(Lur1/f;)Lcom/whoop/data/repositories/JournalRepository;

    move-result-object p1

    iput-object v8, v0, Lur1/f$a$a$a;->y:Ljava/lang/Object;

    iput-object v8, v0, Lur1/f$a$a$a;->E:Ljava/lang/Object;

    iput-object v8, v0, Lur1/f$a$a$a;->F:Ljava/lang/Object;

    iput-object v8, v0, Lur1/f$a$a$a;->G:Ljava/lang/Object;

    iput-object p2, v0, Lur1/f$a$a$a;->H:Ljava/lang/Object;

    iput-object v8, v0, Lur1/f$a$a$a;->I:Ljava/lang/Object;

    iput-object v8, v0, Lur1/f$a$a$a;->J:Ljava/lang/Object;

    iput v7, v0, Lur1/f$a$a$a;->K:I

    iput v7, v0, Lur1/f$a$a$a;->L:I

    iput v4, v0, Lur1/f$a$a$a;->x:I

    invoke-virtual {p1, v7, v0}, Lcom/whoop/data/repositories/JournalRepository;->setShouldShowDismissConfirmationDialog(ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    goto :goto_5

    :cond_b
    move-object p1, p2

    :goto_3
    move-object p2, p1

    :cond_c
    sget-object p1, Lur1/n$f;->a:Lur1/n$f;

    goto :goto_4

    :cond_d
    instance-of p1, p1, Lur1/e$a;

    if-eqz p1, :cond_f

    sget-object p1, Lur1/n$c;->a:Lur1/n$c;

    :goto_4
    iput-object v8, v0, Lur1/f$a$a$a;->y:Ljava/lang/Object;

    iput-object v8, v0, Lur1/f$a$a$a;->E:Ljava/lang/Object;

    iput-object v8, v0, Lur1/f$a$a$a;->F:Ljava/lang/Object;

    iput-object v8, v0, Lur1/f$a$a$a;->G:Ljava/lang/Object;

    iput-object v8, v0, Lur1/f$a$a$a;->H:Ljava/lang/Object;

    iput-object v8, v0, Lur1/f$a$a$a;->I:Ljava/lang/Object;

    iput-object v8, v0, Lur1/f$a$a$a;->J:Ljava/lang/Object;

    iput v7, v0, Lur1/f$a$a$a;->K:I

    iput v3, v0, Lur1/f$a$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_e

    :goto_5
    return-object v1

    :cond_e
    :goto_6
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_f
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
