.class public final synthetic Lcp0/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/c1;

.field public final synthetic y:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lc93/a;Lp1/c1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lcp0/t0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcp0/t0;->x:Lp1/c1;

    iput-object p1, p0, Lcp0/t0;->y:Lc93/a;

    return-void
.end method

.method public synthetic constructor <init>(Lc93/a;Lp1/c1;I)V
    .locals 0

    .line 2
    iput p3, p0, Lcp0/t0;->w:I

    iput-object p1, p0, Lcp0/t0;->y:Lc93/a;

    iput-object p2, p0, Lcp0/t0;->x:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcp0/t0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcp0/t0;->y:Lc93/a;

    iget-object v1, p0, Lcp0/t0;->x:Lp1/c1;

    invoke-static {v0, v1}, Lyn2/b;->b(Lc93/a;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lcp0/t0;->y:Lc93/a;

    iget-object v1, p0, Lcp0/t0;->x:Lp1/c1;

    invoke-static {v0, v1}, Lwi0/e;->a(Lc93/a;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lcp0/t0;->y:Lc93/a;

    iget-object v1, p0, Lcp0/t0;->x:Lp1/c1;

    invoke-static {v0, v1}, Lw31/e;->e(Lc93/a;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lcp0/t0;->y:Lc93/a;

    iget-object v1, p0, Lcp0/t0;->x:Lp1/c1;

    invoke-static {v0, v1}, Llq2/r;->p(Lc93/a;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lcp0/t0;->y:Lc93/a;

    iget-object v1, p0, Lcp0/t0;->x:Lp1/c1;

    invoke-static {v0, v1}, Llq2/l;->c(Lc93/a;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lcp0/t0;->y:Lc93/a;

    iget-object v1, p0, Lcp0/t0;->x:Lp1/c1;

    invoke-static {v0, v1}, Lkd1/d;->c(Lc93/a;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lcp0/t0;->x:Lp1/c1;

    iget-object v1, p0, Lcp0/t0;->y:Lc93/a;

    invoke-static {v1, v0}, Lim1/h;->d(Lc93/a;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lcp0/t0;->y:Lc93/a;

    iget-object v1, p0, Lcp0/t0;->x:Lp1/c1;

    invoke-static {v0, v1}, Lcp0/x0;->k(Lc93/a;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
