.class public final Ll1/t1;
.super La3/o;
.source "SourceFile"

# interfaces
.implements La3/m;


# instance fields
.field public Q:Z

.field public R:Lj0/i;

.field public S:F

.field public T:F

.field public U:Z

.field public V:Lbc3/c2;

.field public W:Ll1/e4;

.field public X:Ld0/e;

.field public Y:Li2/a1;

.field public final Z:Ld0/e;

.field public final a0:Lf2/c;


# direct methods
.method public constructor <init>(ZLj0/i;Ll1/e4;Li2/a1;)V
    .locals 2

    sget v0, Ll1/h4;->e:F

    sget v1, Ll1/h4;->d:F

    invoke-direct {p0}, La3/o;-><init>()V

    iput-boolean p1, p0, Ll1/t1;->Q:Z

    iput-object p2, p0, Ll1/t1;->R:Lj0/i;

    iput v0, p0, Ll1/t1;->S:F

    iput v1, p0, Ll1/t1;->T:F

    iput-object p3, p0, Ll1/t1;->W:Ll1/e4;

    iput-object p4, p0, Ll1/t1;->Y:Li2/a1;

    new-instance p2, Ld0/e;

    iget-boolean p3, p0, Ll1/t1;->U:Z

    if-eqz p3, :cond_0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    new-instance p1, Ly3/f;

    invoke-direct {p1, v0}, Ly3/f;-><init>(F)V

    sget-object p3, Ld0/f;->k:Ld0/f2;

    const/4 p4, 0x0

    const/16 v0, 0xc

    invoke-direct {p2, p1, p3, p4, v0}, Ld0/e;-><init>(Ljava/lang/Object;Ld0/f2;Ljava/lang/Object;I)V

    iput-object p2, p0, Ll1/t1;->Z:Ld0/e;

    new-instance p1, Lio/getstream/chat/android/ui/viewmodel/typing/a;

    const/16 p2, 0x17

    invoke-direct {p1, p0, p2}, Lio/getstream/chat/android/ui/viewmodel/typing/a;-><init>(Ljava/lang/Object;I)V

    new-instance p2, Lf2/c;

    new-instance p3, Lf2/d;

    invoke-direct {p3}, Lf2/d;-><init>()V

    invoke-direct {p2, p3, p1}, Lf2/c;-><init>(Lf2/d;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, p2}, La3/o;->X0(La3/n;)La3/n;

    iput-object p2, p0, Ll1/t1;->a0:Lf2/c;

    return-void
.end method

.method public static final a1(Ll1/t1;Ls83/i;)Ljava/lang/Object;
    .locals 4

    const/4 v0, 0x0

    iput-boolean v0, p0, Ll1/t1;->U:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Ll1/t1;->R:Lj0/i;

    check-cast v1, Lj0/j;

    iget-object v1, v1, Lj0/j;->a:Lec3/w1;

    new-instance v2, Landroidx/room/x;

    const/16 v3, 0x9

    invoke-direct {v2, v3, v0, p0}, Landroidx/room/x;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v2, p1}, Lec3/w1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    sget-object p0, Lr83/a;->w:Lr83/a;

    return-object p0
.end method


# virtual methods
.method public final M0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final P0()V
    .locals 7

    invoke-virtual {p0}, Lb2/v;->L0()Lbc3/c0;

    move-result-object v0

    new-instance v1, Ll1/s1;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v1, p0, v3, v2}, Ll1/s1;-><init>(Ll1/t1;Lq83/d;I)V

    const/4 v2, 0x3

    invoke-static {v0, v3, v3, v1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    iput-object v0, p0, Ll1/t1;->V:Lbc3/c2;

    iget-object v0, p0, Ll1/t1;->X:Ld0/e;

    if-nez v0, :cond_1

    iget-object v0, p0, Ll1/t1;->W:Ll1/e4;

    if-nez v0, :cond_0

    sget-object v0, Ll1/h4;->a:Ll1/h4;

    sget-object v0, Ll1/n;->a:Lp1/u2;

    invoke-static {p0, v0}, La3/g;->f(La3/m;Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll1/m;

    sget-object v1, Lf1/a2;->a:Lp1/b0;

    invoke-static {p0, v1}, La3/g;->f(La3/m;Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf1/y1;

    invoke-static {v0, v1}, Ll1/h4;->c(Ll1/m;Lf1/y1;)Ll1/e4;

    move-result-object v0

    :cond_0
    iget-boolean v1, p0, Ll1/t1;->Q:Z

    const/4 v2, 0x0

    iget-boolean v4, p0, Ll1/t1;->U:Z

    invoke-virtual {v0, v1, v2, v4}, Ll1/e4;->c(ZZZ)J

    move-result-wide v0

    new-instance v2, Ld0/e;

    new-instance v4, Li2/x;

    invoke-direct {v4, v0, v1}, Li2/x;-><init>(J)V

    invoke-static {v0, v1}, Li2/x;->g(J)Lj2/c;

    move-result-object v0

    sget-object v1, Lc0/d;->z:Lc0/d;

    new-instance v5, La3/m1;

    const/16 v6, 0x9

    invoke-direct {v5, v0, v6}, La3/m1;-><init>(Ljava/lang/Object;I)V

    new-instance v0, Ld0/f2;

    invoke-direct {v0, v1, v5}, Ld0/f2;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    const/16 v1, 0xc

    invoke-direct {v2, v4, v0, v3, v1}, Ld0/e;-><init>(Ljava/lang/Object;Ld0/f2;Ljava/lang/Object;I)V

    iput-object v2, p0, Ll1/t1;->X:Ld0/e;

    :cond_1
    return-void
.end method

.method public final b1()V
    .locals 5

    invoke-virtual {p0}, Lb2/v;->L0()Lbc3/c0;

    move-result-object v0

    new-instance v1, Ll1/s1;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v1, p0, v3, v2}, Ll1/s1;-><init>(Ll1/t1;Lq83/d;I)V

    const/4 v2, 0x3

    invoke-static {v0, v3, v3, v1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    invoke-virtual {p0}, Lb2/v;->L0()Lbc3/c0;

    move-result-object v0

    new-instance v1, Ll1/s1;

    const/4 v4, 0x1

    invoke-direct {v1, p0, v3, v4}, Ll1/s1;-><init>(Ll1/t1;Lq83/d;I)V

    invoke-static {v0, v3, v3, v1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
