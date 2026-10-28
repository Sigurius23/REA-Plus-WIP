.class public final Lb9/g1;
.super Ll9/r;
.source "SourceFile"


# instance fields
.field public final synthetic c:I

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lu8/o0;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lb9/g1;->c:I

    .line 3
    invoke-direct {p0, p1}, Ll9/r;-><init>(Lu8/o0;)V

    .line 4
    new-instance p1, Lu8/n0;

    invoke-direct {p1}, Lu8/n0;-><init>()V

    iput-object p1, p0, Lb9/g1;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lu8/o0;Lu8/x;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lb9/g1;->c:I

    .line 1
    invoke-direct {p0, p1}, Ll9/r;-><init>(Lu8/o0;)V

    .line 2
    iput-object p2, p0, Lb9/g1;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public f(ILu8/m0;Z)Lu8/m0;
    .locals 11

    iget v0, p0, Lb9/g1;->c:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2, p3}, Ll9/r;->f(ILu8/m0;Z)Lu8/m0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ll9/r;->b:Lu8/o0;

    invoke-virtual {v0, p1, p2, p3}, Lu8/o0;->f(ILu8/m0;Z)Lu8/m0;

    move-result-object v1

    iget p1, v1, Lu8/m0;->c:I

    iget-object p3, p0, Lb9/g1;->d:Ljava/lang/Object;

    check-cast p3, Lu8/n0;

    const-wide/16 v2, 0x0

    invoke-virtual {v0, p1, p3, v2, v3}, Lu8/o0;->m(ILu8/n0;J)Lu8/n0;

    move-result-object p1

    invoke-virtual {p1}, Lu8/n0;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object v2, p2, Lu8/m0;->a:Ljava/lang/Object;

    iget-object v3, p2, Lu8/m0;->b:Ljava/lang/Object;

    iget v4, p2, Lu8/m0;->c:I

    iget-wide v5, p2, Lu8/m0;->d:J

    iget-wide v7, p2, Lu8/m0;->e:J

    sget-object v9, Lu8/b;->c:Lu8/b;

    const/4 v10, 0x1

    invoke-virtual/range {v1 .. v10}, Lu8/m0;->h(Ljava/lang/Object;Ljava/lang/Object;IJJLu8/b;Z)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, v1, Lu8/m0;->f:Z

    :goto_0
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public m(ILu8/n0;J)Lu8/n0;
    .locals 1

    iget v0, p0, Lb9/g1;->c:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2, p3, p4}, Ll9/r;->m(ILu8/n0;J)Lu8/n0;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-super {p0, p1, p2, p3, p4}, Ll9/r;->m(ILu8/n0;J)Lu8/n0;

    iget-object p1, p0, Lb9/g1;->d:Ljava/lang/Object;

    check-cast p1, Lu8/x;

    iput-object p1, p2, Lu8/n0;->c:Lu8/x;

    iget-object p1, p1, Lu8/x;->b:Lu8/u;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
