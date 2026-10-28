.class public final synthetic Lev2/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lm91/u;Ljava/util/Map;ZLj0/i;Lkotlin/jvm/functions/Function1;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lev2/s;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lev2/s;->z:Ljava/lang/Object;

    iput-object p2, p0, Lev2/s;->E:Ljava/lang/Object;

    iput-boolean p3, p0, Lev2/s;->x:Z

    iput-object p4, p0, Lev2/s;->F:Ljava/lang/Object;

    iput-object p5, p0, Lev2/s;->G:Ljava/lang/Object;

    iput-boolean p6, p0, Lev2/s;->y:Z

    return-void
.end method

.method public synthetic constructor <init>(Lu0/s0;Lg2/s;ZZLf1/s1;Lq3/r;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lev2/s;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lev2/s;->z:Ljava/lang/Object;

    iput-object p2, p0, Lev2/s;->E:Ljava/lang/Object;

    iput-boolean p3, p0, Lev2/s;->x:Z

    iput-boolean p4, p0, Lev2/s;->y:Z

    iput-object p5, p0, Lev2/s;->F:Ljava/lang/Object;

    iput-object p6, p0, Lev2/s;->G:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lev2/s;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lev2/s;->z:Ljava/lang/Object;

    check-cast v0, Lu0/s0;

    iget-object v1, p0, Lev2/s;->E:Ljava/lang/Object;

    check-cast v1, Lg2/s;

    iget-object v2, p0, Lev2/s;->F:Ljava/lang/Object;

    check-cast v2, Lf1/s1;

    iget-object v3, p0, Lev2/s;->G:Ljava/lang/Object;

    check-cast v3, Lq3/r;

    check-cast p1, Lh2/b;

    invoke-virtual {v0}, Lu0/s0;->b()Z

    move-result v4

    if-nez v4, :cond_0

    invoke-static {v1}, Lg2/s;->c(Lg2/s;)V

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Lev2/s;->x:Z

    if-nez v1, :cond_1

    iget-object v1, v0, Lu0/s0;->c:Lb3/x2;

    if-eqz v1, :cond_1

    check-cast v1, Lb3/x1;

    invoke-virtual {v1}, Lb3/x1;->b()V

    :cond_1
    :goto_0
    invoke-virtual {v0}, Lu0/s0;->b()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-boolean v1, p0, Lev2/s;->y:Z

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Lu0/s0;->a()Lu0/g0;

    move-result-object v1

    sget-object v4, Lu0/g0;->x:Lu0/g0;

    if-eq v1, v4, :cond_2

    invoke-virtual {v0}, Lu0/s0;->d()Lu0/p1;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-wide v4, p1, Lh2/b;->a:J

    iget-object p1, v0, Lu0/s0;->d:Lq3/i;

    iget-object v2, v0, Lu0/s0;->v:Lu0/v;

    const/4 v6, 0x1

    invoke-virtual {v1, v4, v5, v6}, Lu0/p1;->b(JZ)I

    move-result v1

    invoke-interface {v3, v1}, Lq3/r;->n(I)I

    move-result v1

    iget-object p1, p1, Lq3/i;->w:Ljava/lang/Object;

    check-cast p1, Lq3/y;

    invoke-static {v1, v1}, Lj93/l0;->f(II)J

    move-result-wide v3

    const/4 v1, 0x5

    const/4 v5, 0x0

    invoke-static {p1, v5, v3, v4, v1}, Lq3/y;->b(Lq3/y;Ll3/g;JI)Lq3/y;

    move-result-object p1

    invoke-virtual {v2, p1}, Lu0/v;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, v0, Lu0/s0;->a:Lu0/c1;

    iget-object p1, p1, Lu0/c1;->a:Ll3/g;

    iget-object p1, p1, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_3

    sget-object p1, Lu0/g0;->y:Lu0/g0;

    iget-object v0, v0, Lu0/s0;->k:Lp1/k1;

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v2, p1}, Lf1/s1;->g(Lh2/b;)V

    :cond_3
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lev2/s;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lm91/u;

    iget-object v0, p0, Lev2/s;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/util/Map;

    iget-object v0, p0, Lev2/s;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lj0/i;

    iget-object v0, p0, Lev2/s;->G:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lkotlin/jvm/functions/Function1;

    iget-boolean v6, p0, Lev2/s;->y:Z

    move-object v7, p1

    check-cast v7, Ln0/q;

    iget-boolean v3, p0, Lev2/s;->x:Z

    invoke-static/range {v1 .. v7}, Lev2/u;->T(Lm91/u;Ljava/util/Map;ZLj0/i;Lkotlin/jvm/functions/Function1;ZLn0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
