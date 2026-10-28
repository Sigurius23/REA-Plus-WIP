.class public final Landroidx/room/h2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public E:I

.field public F:I

.field public G:I

.field public final synthetic H:[Landroidx/room/f0;

.field public final synthetic I:Landroidx/room/i2;

.field public final synthetic J:Landroidx/room/x1;

.field public w:[Landroidx/room/f0;

.field public x:Landroidx/room/i2;

.field public y:Landroidx/room/x1;

.field public z:I


# direct methods
.method public constructor <init>([Landroidx/room/f0;Landroidx/room/i2;Landroidx/room/x1;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Landroidx/room/h2;->H:[Landroidx/room/f0;

    iput-object p2, p0, Landroidx/room/h2;->I:Landroidx/room/i2;

    iput-object p3, p0, Landroidx/room/h2;->J:Landroidx/room/x1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    new-instance p1, Landroidx/room/h2;

    iget-object v0, p0, Landroidx/room/h2;->I:Landroidx/room/i2;

    iget-object v1, p0, Landroidx/room/h2;->J:Landroidx/room/x1;

    iget-object v2, p0, Landroidx/room/h2;->H:[Landroidx/room/f0;

    invoke-direct {p1, v2, v0, v1, p2}, Landroidx/room/h2;-><init>([Landroidx/room/f0;Landroidx/room/i2;Landroidx/room/x1;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/room/v1;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/h2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/h2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/h2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Landroidx/room/h2;->G:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_0

    if-ne v1, v2, :cond_1

    :cond_0
    iget v1, p0, Landroidx/room/h2;->F:I

    iget v4, p0, Landroidx/room/h2;->E:I

    iget v5, p0, Landroidx/room/h2;->z:I

    iget-object v6, p0, Landroidx/room/h2;->y:Landroidx/room/x1;

    iget-object v7, p0, Landroidx/room/h2;->x:Landroidx/room/i2;

    iget-object v8, p0, Landroidx/room/h2;->w:[Landroidx/room/f0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/room/h2;->H:[Landroidx/room/f0;

    array-length v1, p1

    const/4 v4, 0x0

    iget-object v5, p0, Landroidx/room/h2;->I:Landroidx/room/i2;

    iget-object v6, p0, Landroidx/room/h2;->J:Landroidx/room/x1;

    move-object v8, p1

    move p1, v4

    move-object v7, v5

    :goto_0
    if-ge v4, v1, :cond_7

    aget-object v5, v8, v4

    add-int/lit8 v9, p1, 0x1

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    if-eqz v5, :cond_6

    if-eq v5, v3, :cond_5

    if-ne v5, v2, :cond_4

    iput-object v8, p0, Landroidx/room/h2;->w:[Landroidx/room/f0;

    iput-object v7, p0, Landroidx/room/h2;->x:Landroidx/room/i2;

    iput-object v6, p0, Landroidx/room/h2;->y:Landroidx/room/x1;

    iput v9, p0, Landroidx/room/h2;->z:I

    iput v4, p0, Landroidx/room/h2;->E:I

    iput v1, p0, Landroidx/room/h2;->F:I

    iput v2, p0, Landroidx/room/h2;->G:I

    invoke-static {v7, v6, p1, p0}, Landroidx/room/i2;->d(Landroidx/room/i2;Landroidx/room/x1;ILs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_2

    :cond_3
    move v5, v9

    :goto_1
    move p1, v5

    goto :goto_3

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    iput-object v8, p0, Landroidx/room/h2;->w:[Landroidx/room/f0;

    iput-object v7, p0, Landroidx/room/h2;->x:Landroidx/room/i2;

    iput-object v6, p0, Landroidx/room/h2;->y:Landroidx/room/x1;

    iput v9, p0, Landroidx/room/h2;->z:I

    iput v4, p0, Landroidx/room/h2;->E:I

    iput v1, p0, Landroidx/room/h2;->F:I

    iput v3, p0, Landroidx/room/h2;->G:I

    invoke-static {v7, v6, p1, p0}, Landroidx/room/i2;->c(Landroidx/room/i2;Landroidx/room/x1;ILs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    :goto_2
    return-object v0

    :cond_6
    move p1, v9

    :goto_3
    add-int/2addr v4, v3

    goto :goto_0

    :cond_7
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
