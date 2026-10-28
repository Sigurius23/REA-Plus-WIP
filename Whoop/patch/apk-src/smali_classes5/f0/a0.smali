.class public final synthetic Lf0/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lf0/c0;


# direct methods
.method public synthetic constructor <init>(Lf0/c0;I)V
    .locals 0

    iput p2, p0, Lf0/a0;->w:I

    iput-object p1, p0, Lf0/a0;->x:Lf0/c0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lf0/a0;->w:I

    check-cast p1, Lh2/b;

    packed-switch v0, :pswitch_data_0

    iget-object p1, p0, Lf0/a0;->x:Lf0/c0;

    iget-boolean v0, p1, Lf0/h;->V:Z

    if-eqz v0, :cond_0

    iget-object p1, p1, Lf0/h;->W:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object p1, p0, Lf0/a0;->x:Lf0/c0;

    iget-object v0, p1, Lf0/c0;->k0:Lc93/a;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_1
    iget-boolean v0, p1, Lf0/c0;->l0:Z

    if-eqz v0, :cond_2

    sget-object v0, Lb3/v1;->l:Lp1/u2;

    invoke-static {p1, v0}, La3/g;->f(La3/m;Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lq2/a;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lq2/a;->a(I)V

    :cond_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
