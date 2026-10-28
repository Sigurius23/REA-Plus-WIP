.class public final synthetic Lz0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lz0/f;

.field public final synthetic y:Lb1/f;


# direct methods
.method public synthetic constructor <init>(Lz0/f;Lb1/f;I)V
    .locals 0

    iput p3, p0, Lz0/b;->w:I

    iput-object p1, p0, Lz0/b;->x:Lz0/f;

    iput-object p2, p0, Lz0/b;->y:Lb1/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lz0/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lz0/b;->x:Lz0/f;

    iget-object v0, v0, Lz0/f;->c:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly2/y;

    iget-object v1, p0, Lz0/b;->y:Lb1/f;

    invoke-interface {v1, v0}, Lb1/f;->v0(Ly2/y;)Lh2/c;

    move-result-object v1

    const-wide/16 v2, 0x0

    invoke-interface {v0, v2, v3}, Ly2/y;->Z(J)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lh2/c;->l(J)Lh2/c;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lz0/b;->x:Lz0/f;

    iget-object v1, v0, Lz0/f;->g:Lz0/a;

    new-instance v2, Lz0/b;

    const/4 v3, 0x2

    iget-object v4, p0, Lz0/b;->y:Lb1/f;

    invoke-direct {v2, v0, v4, v3}, Lz0/b;-><init>(Lz0/f;Lb1/f;I)V

    new-instance v3, Lkotlin/jvm/internal/g0;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iget-object v0, v0, Lz0/f;->e:Lz1/v;

    new-instance v4, Lyo1/b;

    const/4 v5, 0x7

    invoke-direct {v4, v5, v3, v2}, Lyo1/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const-string v2, "positioner"

    invoke-virtual {v0, v4, v1, v2}, Lz1/v;->d(Lc93/a;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    iget-object v0, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-eqz v0, :cond_0

    check-cast v0, Lh2/c;

    return-object v0

    :cond_0
    const-string v0, "result"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0

    :pswitch_1
    iget-object v0, p0, Lz0/b;->x:Lz0/f;

    iget-object v1, v0, Lz0/f;->f:Lz0/a;

    new-instance v2, Lyy/b0;

    const/4 v3, 0x1

    iget-object v4, p0, Lz0/b;->y:Lb1/f;

    invoke-direct {v2, v4, v3}, Lyy/b0;-><init>(Ljava/lang/Object;I)V

    new-instance v3, Lkotlin/jvm/internal/g0;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iget-object v0, v0, Lz0/f;->e:Lz1/v;

    new-instance v4, Lyo1/b;

    const/4 v5, 0x7

    invoke-direct {v4, v5, v3, v2}, Lyo1/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const-string v2, "dataBuilder"

    invoke-virtual {v0, v4, v1, v2}, Lz1/v;->d(Lc93/a;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    iget-object v0, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-eqz v0, :cond_1

    check-cast v0, Lx0/c;

    return-object v0

    :cond_1
    const-string v0, "result"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
