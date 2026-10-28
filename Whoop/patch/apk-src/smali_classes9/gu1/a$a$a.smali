.class public final Lgu1/a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgu1/a$a;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Lgu1/a;


# direct methods
.method public constructor <init>(Lec3/m;Lgu1/a;)V
    .locals 0

    iput-object p1, p0, Lgu1/a$a$a;->w:Lec3/m;

    iput-object p2, p0, Lgu1/a$a$a;->x:Lgu1/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p2, Lgu1/a$a$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lgu1/a$a$a$a;

    iget v1, v0, Lgu1/a$a$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lgu1/a$a$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lgu1/a$a$a$a;

    invoke-direct {v0, p0, p2}, Lgu1/a$a$a$a;-><init>(Lgu1/a$a$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lgu1/a$a$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lgu1/a$a$a$a;->x:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lgu1/a$a$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lgu1/a$a$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lgu1/a$a$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lgu1/a$a$a$a;->K:I

    iget-object v2, v0, Lgu1/a$a$a$a;->J:Ljava/lang/Object;

    check-cast v2, Lts0/c;

    iget-object v2, v0, Lgu1/a$a$a$a;->I:Ljava/lang/Object;

    check-cast v2, Lq83/d;

    iget-object v2, v0, Lgu1/a$a$a$a;->H:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v7, v0, Lgu1/a$a$a$a;->G:Ljava/lang/Object;

    check-cast v7, Lec3/m;

    iget-object v7, v0, Lgu1/a$a$a$a;->E:Ljava/lang/Object;

    check-cast v7, Lgu1/a$a$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, p0, Lgu1/a$a$a;->w:Lec3/m;

    check-cast p1, Lts0/c;

    iget-object p1, p0, Lgu1/a$a$a;->x:Lgu1/a;

    invoke-static {p1}, Lgu1/a;->a(Lgu1/a;)Leu1/b;

    move-result-object p1

    sget-object p2, Leu1/a;->ACTION_FORCE_UPLOAD_TRIGGERED:Leu1/a;

    invoke-virtual {p1, p2}, Leu1/b;->a(Leu1/a;)V

    iget-object p1, p0, Lgu1/a$a$a;->x:Lgu1/a;

    invoke-static {p1}, Lgu1/a;->b(Lgu1/a;)Lku1/a;

    move-result-object p1

    iput-object v6, v0, Lgu1/a$a$a$a;->y:Ljava/lang/Object;

    iput-object v6, v0, Lgu1/a$a$a$a;->E:Ljava/lang/Object;

    iput-object v6, v0, Lgu1/a$a$a$a;->F:Ljava/lang/Object;

    iput-object v6, v0, Lgu1/a$a$a$a;->G:Ljava/lang/Object;

    iput-object v2, v0, Lgu1/a$a$a$a;->H:Ljava/lang/Object;

    iput-object v6, v0, Lgu1/a$a$a$a;->I:Ljava/lang/Object;

    iput-object v6, v0, Lgu1/a$a$a$a;->J:Ljava/lang/Object;

    const/4 p2, 0x0

    iput p2, v0, Lgu1/a$a$a$a;->K:I

    iput p2, v0, Lgu1/a$a$a$a;->L:I

    iput v5, v0, Lgu1/a$a$a$a;->x:I

    invoke-virtual {p1, v0}, Lku1/a;->d(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_3

    :cond_4
    move v8, p2

    move-object p2, p1

    move p1, v8

    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-ne p2, v5, :cond_5

    iget-object p2, p0, Lgu1/a$a$a;->x:Lgu1/a;

    invoke-static {p2}, Lgu1/a;->a(Lgu1/a;)Leu1/b;

    move-result-object p2

    sget-object v5, Leu1/a;->ACTION_FORCE_UPLOAD_COMPLETE:Leu1/a;

    invoke-virtual {p2, v5}, Leu1/b;->a(Leu1/a;)V

    goto :goto_2

    :cond_5
    if-nez p2, :cond_7

    iget-object p2, p0, Lgu1/a$a$a;->x:Lgu1/a;

    invoke-static {p2}, Lgu1/a;->a(Lgu1/a;)Leu1/b;

    move-result-object p2

    sget-object v5, Leu1/a;->ACTION_FORCE_UPLOAD_FAILURE:Leu1/a;

    invoke-virtual {p2, v5}, Leu1/b;->a(Leu1/a;)V

    :goto_2
    iput-object v6, v0, Lgu1/a$a$a$a;->y:Ljava/lang/Object;

    iput-object v6, v0, Lgu1/a$a$a$a;->E:Ljava/lang/Object;

    iput-object v6, v0, Lgu1/a$a$a$a;->F:Ljava/lang/Object;

    iput-object v6, v0, Lgu1/a$a$a$a;->G:Ljava/lang/Object;

    iput-object v6, v0, Lgu1/a$a$a$a;->H:Ljava/lang/Object;

    iput-object v6, v0, Lgu1/a$a$a$a;->I:Ljava/lang/Object;

    iput-object v6, v0, Lgu1/a$a$a$a;->J:Ljava/lang/Object;

    iput p1, v0, Lgu1/a$a$a$a;->K:I

    iput v4, v0, Lgu1/a$a$a$a;->x:I

    invoke-interface {v2, v3, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_3
    return-object v1

    :cond_6
    :goto_4
    return-object v3

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
