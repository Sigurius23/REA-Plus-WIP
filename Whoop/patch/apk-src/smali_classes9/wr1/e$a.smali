.class final Lwr1/e$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwr1/e;->g(Ltr2/n;Ljava/lang/String;)Lec3/l;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Lwr1/c;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.journal.interactors.v2.datepicker.JournalDatePickerInteractor$fetchDatePicker$1"
    f = "JournalDatePickerInteractor.kt"
    l = {
        0x23,
        0x28
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ltr2/n;

.field final synthetic F:Ljava/lang/String;

.field final synthetic G:Lwr1/e;

.field w:Ljava/lang/Object;

.field x:I

.field y:I

.field private synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ltr2/n;Ljava/lang/String;Lwr1/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr2/n;",
            "Ljava/lang/String;",
            "Lwr1/e;",
            "Lq83/d<",
            "-",
            "Lwr1/e$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lwr1/e$a;->E:Ltr2/n;

    iput-object p2, p0, Lwr1/e$a;->F:Ljava/lang/String;

    iput-object p3, p0, Lwr1/e$a;->G:Lwr1/e;

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

    new-instance v0, Lwr1/e$a;

    iget-object v1, p0, Lwr1/e$a;->E:Ltr2/n;

    iget-object v2, p0, Lwr1/e$a;->F:Ljava/lang/String;

    iget-object v3, p0, Lwr1/e$a;->G:Lwr1/e;

    invoke-direct {v0, v1, v2, v3, p2}, Lwr1/e$a;-><init>(Ltr2/n;Ljava/lang/String;Lwr1/e;Lq83/d;)V

    iput-object p1, v0, Lwr1/e$a;->z:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lwr1/e$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lwr1/e$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lwr1/e$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lwr1/e$a;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v5, p0

    iget-object v0, v5, Lwr1/e$a;->z:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lec3/m;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v0, v5, Lwr1/e$a;->y:I

    const/4 v10, 0x2

    const/4 v1, 0x1

    const/4 v11, 0x0

    if-eqz v0, :cond_2

    if-eq v0, v1, :cond_1

    if-ne v0, v10, :cond_0

    iget-object v0, v5, Lwr1/e$a;->w:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Lu02/a;->a:Lu02/a$a;

    iget-object v2, v5, Lwr1/e$a;->E:Ltr2/n;

    new-instance v4, Lwr1/e$a$a;

    iget-object v3, v5, Lwr1/e$a;->F:Ljava/lang/String;

    iget-object v6, v5, Lwr1/e$a;->G:Lwr1/e;

    invoke-direct {v4, v3, v6, v11}, Lwr1/e$a$a;-><init>(Ljava/lang/String;Lwr1/e;Lq83/d;)V

    iput-object v8, v5, Lwr1/e$a;->z:Ljava/lang/Object;

    iput v1, v5, Lwr1/e$a;->y:I

    move-object v1, v2

    const/4 v2, 0x0

    const-string v3, "Failed to fetch date picker"

    const/4 v6, 0x2

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_3

    goto/16 :goto_4

    :cond_3
    :goto_0
    check-cast v0, Lu02/a;

    instance-of v1, v0, Lu02/a$b;

    if-eqz v1, :cond_4

    new-instance v0, Lwr1/c;

    sget-object v1, Lwr1/d$a;->a:Lwr1/d$a;

    invoke-direct {v0, v1}, Lwr1/c;-><init>(Lwr1/d;)V

    goto :goto_3

    :cond_4
    instance-of v1, v0, Lu02/a$c;

    if-eqz v1, :cond_9

    check-cast v0, Lu02/a$c;

    invoke-virtual {v0}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;

    invoke-virtual {v0}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;

    invoke-virtual {v0}, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->getItems()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;

    invoke-virtual {v2}, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->isSelected()Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_1

    :cond_6
    move-object v1, v11

    :goto_1
    check-cast v1, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->getDate()Ljava/lang/String;

    move-result-object v0

    move-object v14, v0

    goto :goto_2

    :cond_7
    move-object v14, v11

    :goto_2
    new-instance v12, Lwr1/a;

    const/16 v16, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x4

    const/16 v18, 0x0

    invoke-direct/range {v12 .. v18}, Lwr1/a;-><init>(Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;Ljava/lang/String;Ljava/util/Map;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lwr1/d$c;

    invoke-direct {v0, v12}, Lwr1/d$c;-><init>(Lwr1/a;)V

    new-instance v1, Lwr1/c;

    invoke-direct {v1, v0}, Lwr1/c;-><init>(Lwr1/d;)V

    move-object v0, v1

    :goto_3
    iput-object v11, v5, Lwr1/e$a;->z:Ljava/lang/Object;

    iput-object v11, v5, Lwr1/e$a;->w:Ljava/lang/Object;

    const/4 v1, 0x0

    iput v1, v5, Lwr1/e$a;->x:I

    iput v10, v5, Lwr1/e$a;->y:I

    invoke-interface {v8, v0, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_8

    :goto_4
    return-object v9

    :cond_8
    :goto_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_9
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
