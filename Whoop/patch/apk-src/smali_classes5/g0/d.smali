.class public final Lg0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lz1/p;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lz1/p;

    invoke-direct {v0}, Lz1/p;-><init>()V

    iput-object v0, p0, Lg0/d;->a:Lz1/p;

    return-void
.end method

.method public static b(Lg0/d;Lc93/m;Lx1/b;Lc93/a;I)V
    .locals 0

    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    iget-object p0, p0, Lg0/d;->a:Lz1/p;

    new-instance p4, Lch/t;

    invoke-direct {p4, p1, p2, p3}, Lch/t;-><init>(Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/a;)V

    new-instance p1, Lx1/b;

    const/4 p2, 0x1

    const p3, 0x194839ac

    invoke-direct {p1, p4, p2, p3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-virtual {p0, p1}, Lz1/p;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final a(Lg0/c;Landroidx/compose/runtime/Composer;I)V
    .locals 6

    check-cast p2, Lp1/q;

    const v0, 0x4eb252f8

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p2, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x20

    goto :goto_1

    :cond_1
    const/16 v1, 0x10

    :goto_1
    or-int/2addr v0, v1

    and-int/lit8 v1, v0, 0x13

    const/16 v2, 0x12

    const/4 v3, 0x0

    if-eq v1, v2, :cond_2

    const/4 v1, 0x1

    goto :goto_2

    :cond_2
    move v1, v3

    :goto_2
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {p2, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lg0/d;->a:Lz1/p;

    invoke-virtual {v1}, Lz1/p;->size()I

    move-result v2

    :goto_3
    if-ge v3, v2, :cond_4

    invoke-virtual {v1, v3}, Lz1/p;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lkotlin/jvm/functions/Function3;

    and-int/lit8 v5, v0, 0xe

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v4, p1, p2, v5}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_3
    invoke-virtual {p2}, Lp1/q;->X()V

    :cond_4
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_5

    new-instance v0, Lf01/f;

    const/16 v1, 0x9

    invoke-direct {v0, p0, p1, p3, v1}, Lf01/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method
