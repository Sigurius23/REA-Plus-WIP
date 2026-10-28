.class public final Lo2/c0;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lo2/d0;


# direct methods
.method public synthetic constructor <init>(Lo2/d0;I)V
    .locals 0

    iput p2, p0, Lo2/c0;->w:I

    iput-object p1, p0, Lo2/c0;->x:Lo2/d0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lo2/c0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lk2/e;

    iget-object v0, p0, Lo2/c0;->x:Lo2/d0;

    iget-object v1, v0, Lo2/d0;->b:Lo2/b;

    iget v2, v0, Lo2/d0;->k:F

    iget v0, v0, Lo2/d0;->l:F

    invoke-interface {p1}, Lk2/e;->t0()La3/p;

    move-result-object v3

    invoke-virtual {v3}, La3/p;->A()J

    move-result-wide v4

    invoke-virtual {v3}, La3/p;->w()Li2/v;

    move-result-object v6

    invoke-interface {v6}, Li2/v;->q()V

    :try_start_0
    iget-object v6, v3, La3/p;->x:Ljava/lang/Object;

    check-cast v6, Laj/d;

    const-wide/16 v7, 0x0

    invoke-virtual {v6, v2, v7, v8, v0}, Laj/d;->w(FJF)V

    invoke-virtual {v1, p1}, Lo2/b;->a(Lk2/e;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v3, v4, v5}, Ld;->z(La3/p;J)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_0
    move-exception p1

    invoke-static {v3, v4, v5}, Ld;->z(La3/p;J)V

    throw p1

    :pswitch_0
    check-cast p1, Lo2/b0;

    const/4 p1, 0x1

    iget-object v0, p0, Lo2/c0;->x:Lo2/d0;

    iput-boolean p1, v0, Lo2/d0;->d:Z

    iget-object p1, v0, Lo2/d0;->f:Lkotlin/jvm/internal/m;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
