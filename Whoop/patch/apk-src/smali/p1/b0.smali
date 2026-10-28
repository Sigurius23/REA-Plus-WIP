.class public final Lp1/b0;
.super Lp1/t1;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lc93/a;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lp1/b0;->b:I

    sget-object v0, Lp1/v0;->F:Lp1/v0;

    .line 1
    invoke-direct {p0, p1}, Lp1/t1;-><init>(Lc93/a;)V

    .line 2
    iput-object v0, p0, Lp1/b0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lp1/b0;->b:I

    .line 3
    new-instance v0, Lma1/a;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lma1/a;-><init>(I)V

    .line 4
    invoke-direct {p0, v0}, Lp1/t1;-><init>(Lc93/a;)V

    .line 5
    new-instance v0, Lp1/c0;

    invoke-direct {v0, p1}, Lp1/c0;-><init>(Lkotlin/jvm/functions/Function1;)V

    iput-object v0, p0, Lp1/b0;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lp1/u1;
    .locals 13

    iget v0, p0, Lp1/b0;->b:I

    packed-switch v0, :pswitch_data_0

    new-instance v1, Lp1/u1;

    if-nez p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    move v4, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    iget-object v0, p0, Lp1/b0;->c:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lp1/o2;

    const/4 v6, 0x1

    move-object v2, p0

    move-object v3, p1

    invoke-direct/range {v1 .. v6}, Lp1/u1;-><init>(Lp1/t1;Ljava/lang/Object;ZLp1/o2;Z)V

    return-object v1

    :pswitch_0
    move-object v3, p1

    new-instance v7, Lp1/u1;

    if-nez v3, :cond_1

    const/4 p1, 0x1

    :goto_2
    move v10, p1

    goto :goto_3

    :cond_1
    const/4 p1, 0x0

    goto :goto_2

    :goto_3
    const/4 v11, 0x0

    const/4 v12, 0x1

    move-object v8, p0

    move-object v9, v3

    invoke-direct/range {v7 .. v12}, Lp1/u1;-><init>(Lp1/t1;Ljava/lang/Object;ZLp1/o2;Z)V

    return-object v7

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public b()Lp1/w2;
    .locals 1

    iget v0, p0, Lp1/b0;->b:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Lp1/t1;->b()Lp1/w2;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lp1/b0;->c:Ljava/lang/Object;

    check-cast v0, Lp1/c0;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
