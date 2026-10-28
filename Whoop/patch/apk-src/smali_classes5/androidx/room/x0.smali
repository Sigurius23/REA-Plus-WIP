.class public final Landroidx/room/x0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Z

.field public final synthetic G:[Ljava/lang/String;

.field public w:[Ljava/lang/String;

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Z[Ljava/lang/String;Lq83/d;)V
    .locals 0

    iput-boolean p1, p0, Landroidx/room/x0;->F:Z

    iput-object p2, p0, Landroidx/room/x0;->G:[Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    new-instance v0, Landroidx/room/x0;

    iget-boolean v1, p0, Landroidx/room/x0;->F:Z

    iget-object v2, p0, Landroidx/room/x0;->G:[Ljava/lang/String;

    invoke-direct {v0, v1, v2, p2}, Landroidx/room/x0;-><init>(Z[Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Landroidx/room/x0;->E:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/room/v1;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/x0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/x0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/x0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Landroidx/room/x0;->z:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget v1, p0, Landroidx/room/x0;->y:I

    iget v4, p0, Landroidx/room/x0;->x:I

    iget-object v5, p0, Landroidx/room/x0;->w:[Ljava/lang/String;

    iget-object v6, p0, Landroidx/room/x0;->E:Ljava/lang/Object;

    check-cast v6, Landroidx/room/v1;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Landroidx/room/x0;->E:Ljava/lang/Object;

    check-cast v1, Landroidx/room/v1;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/room/x0;->E:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Landroidx/room/v1;

    iget-boolean p1, p0, Landroidx/room/x0;->F:Z

    if-eqz p1, :cond_3

    iput-object v1, p0, Landroidx/room/x0;->E:Ljava/lang/Object;

    iput v3, p0, Landroidx/room/x0;->z:I

    const-string p1, "PRAGMA defer_foreign_keys = TRUE"

    invoke-static {v1, p1, p0}, Lts/o;->r(Landroidx/room/j0;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_2

    :cond_3
    :goto_0
    iget-object p1, p0, Landroidx/room/x0;->G:[Ljava/lang/String;

    array-length v4, p1

    const/4 v5, 0x0

    move-object v6, v1

    move v1, v4

    move v4, v5

    move-object v5, p1

    :goto_1
    if-ge v4, v1, :cond_5

    aget-object p1, v5, v4

    const-string v7, "DELETE FROM `"

    const/16 v8, 0x60

    invoke-static {v8, v7, p1}, Lr80/c;->i(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object v6, p0, Landroidx/room/x0;->E:Ljava/lang/Object;

    iput-object v5, p0, Landroidx/room/x0;->w:[Ljava/lang/String;

    iput v4, p0, Landroidx/room/x0;->x:I

    iput v1, p0, Landroidx/room/x0;->y:I

    iput v2, p0, Landroidx/room/x0;->z:I

    invoke-static {v6, p1, p0}, Lts/o;->r(Landroidx/room/j0;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_2
    return-object v0

    :cond_4
    :goto_3
    add-int/2addr v4, v3

    goto :goto_1

    :cond_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
