.class public final Ly1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/c;


# static fields
.field public static final E:Lp0/n0;


# instance fields
.field public final w:Ljava/util/Map;

.field public final x:La0/v0;

.field public y:Ly1/f;

.field public final z:Lrf/p;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lxl2/a;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Lxl2/a;-><init>(I)V

    new-instance v1, Lvb1/a;

    const/16 v2, 0x11

    invoke-direct {v1, v2}, Lvb1/a;-><init>(I)V

    new-instance v2, Lp0/n0;

    const/16 v3, 0xa

    invoke-direct {v2, v3, v0, v1}, Lp0/n0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    sput-object v2, Ly1/d;->E:Lp0/n0;

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly1/d;->w:Ljava/util/Map;

    sget-object p1, La0/d1;->a:[J

    new-instance p1, La0/v0;

    invoke-direct {p1}, La0/v0;-><init>()V

    iput-object p1, p0, Ly1/d;->x:La0/v0;

    new-instance p1, Lrf/p;

    const/16 v0, 0xa

    invoke-direct {p1, p0, v0}, Lrf/p;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Ly1/d;->z:Lrf/p;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Ly1/d;->x:La0/v0;

    invoke-virtual {v0, p1}, La0/v0;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ly1/d;->w:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final c(Ljava/lang/Object;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 7

    check-cast p3, Lp1/q;

    const v0, 0x1fcd8740

    invoke-virtual {p3, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p3, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p4

    goto :goto_1

    :cond_1
    move v0, p4

    :goto_1
    and-int/lit8 v1, p4, 0x30

    if-nez v1, :cond_3

    invoke-virtual {p3, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit16 v1, p4, 0x180

    if-nez v1, :cond_5

    invoke-virtual {p3, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0x100

    goto :goto_3

    :cond_4
    const/16 v1, 0x80

    :goto_3
    or-int/2addr v0, v1

    :cond_5
    and-int/lit16 v1, v0, 0x93

    const/16 v2, 0x92

    const/4 v3, 0x0

    if-eq v1, v2, :cond_6

    const/4 v1, 0x1

    goto :goto_4

    :cond_6
    move v1, v3

    :goto_4
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {p3, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-virtual {p3, p1}, Lp1/q;->h0(Ljava/lang/Object;)V

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_8

    iget-object v1, p0, Ly1/d;->z:Lrf/p;

    invoke-virtual {v1, p1}, Lrf/p;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_7

    new-instance v4, Ly1/i;

    iget-object v5, p0, Ly1/d;->w:Ljava/util/Map;

    invoke-interface {v5, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map;

    sget-object v6, Ly1/h;->a:Lp1/u2;

    new-instance v6, Ly1/g;

    invoke-direct {v6, v5, v1}, Ly1/g;-><init>(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V

    invoke-direct {v4, v6}, Ly1/i;-><init>(Ly1/g;)V

    invoke-virtual {p3, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v4

    goto :goto_5

    :cond_7
    const-string p2, "Type of the key "

    const-string p3, " is not supported. On Android you can only use types which can be stored inside the Bundle."

    invoke-static {p1, p2, p3}, Lih0/d0;->j(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_8
    :goto_5
    check-cast v1, Ly1/i;

    sget-object v4, Ly1/h;->a:Lp1/u2;

    invoke-virtual {v4, v1}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v4

    sget-object v5, Lqb/a;->a:Lp1/t1;

    invoke-virtual {v5, v1}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v5

    filled-new-array {v4, v5}, [Lp1/u1;

    move-result-object v4

    and-int/lit8 v0, v0, 0x70

    const/16 v5, 0x8

    or-int/2addr v0, v5

    invoke-static {v4, p2, p3, v0}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p3, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {p3, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    invoke-virtual {p3, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_9

    if-ne v4, v2, :cond_a

    :cond_9
    new-instance v4, La6/z0;

    const/4 v0, 0x7

    invoke-direct {v4, p0, p1, v1, v0}, La6/z0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p3, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v4, Lkotlin/jvm/functions/Function1;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-static {v0, v4, p3}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    iget-boolean v0, p3, Lp1/q;->y:Z

    if-eqz v0, :cond_b

    iget-object v0, p3, Lp1/q;->G:Lp1/e2;

    iget v0, v0, Lp1/e2;->i:I

    iget v1, p3, Lp1/q;->z:I

    if-ne v0, v1, :cond_b

    const/4 v0, -0x1

    iput v0, p3, Lp1/q;->z:I

    iput-boolean v3, p3, Lp1/q;->y:Z

    :cond_b
    invoke-virtual {p3, v3}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_c
    invoke-virtual {p3}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {p3}, Lp1/q;->u()Lp1/v1;

    move-result-object p3

    if-eqz p3, :cond_d

    new-instance v0, La11/o;

    const/4 v5, 0x7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p4

    invoke-direct/range {v0 .. v5}, La11/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p3, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method
