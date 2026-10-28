.class public final Lz2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/compose/ui/platform/AndroidComposeView;

.field public final b:Lr1/c;

.field public final c:Lr1/c;

.field public final d:Lr1/c;

.field public final e:Lr1/c;

.field public f:Z


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/AndroidComposeView;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/d;->a:Landroidx/compose/ui/platform/AndroidComposeView;

    new-instance p1, Lr1/c;

    const/16 v0, 0x10

    new-array v1, v0, [La3/d;

    invoke-direct {p1, v1}, Lr1/c;-><init>([Ljava/lang/Object;)V

    iput-object p1, p0, Lz2/d;->b:Lr1/c;

    new-instance p1, Lr1/c;

    new-array v1, v0, [Lz2/h;

    invoke-direct {p1, v1}, Lr1/c;-><init>([Ljava/lang/Object;)V

    iput-object p1, p0, Lz2/d;->c:Lr1/c;

    new-instance p1, Lr1/c;

    new-array v1, v0, [La3/n0;

    invoke-direct {p1, v1}, Lr1/c;-><init>([Ljava/lang/Object;)V

    iput-object p1, p0, Lz2/d;->d:Lr1/c;

    new-instance p1, Lr1/c;

    new-array v0, v0, [Lz2/h;

    invoke-direct {p1, v0}, Lr1/c;-><init>([Ljava/lang/Object;)V

    iput-object p1, p0, Lz2/d;->e:Lr1/c;

    return-void
.end method

.method public static b(Lb2/v;Lz2/h;Ljava/util/HashSet;)V
    .locals 10

    iget-object v0, p0, Lb2/v;->w:Lb2/v;

    iget-boolean v0, v0, Lb2/v;->N:Z

    if-nez v0, :cond_0

    const-string v0, "visitSubtreeIf called on an unattached node"

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_0
    new-instance v0, Lr1/c;

    const/16 v1, 0x10

    new-array v2, v1, [Lb2/v;

    invoke-direct {v0, v2}, Lr1/c;-><init>([Ljava/lang/Object;)V

    iget-object p0, p0, Lb2/v;->w:Lb2/v;

    iget-object v2, p0, Lb2/v;->F:Lb2/v;

    if-nez v2, :cond_1

    invoke-static {v0, p0}, La3/g;->a(Lr1/c;Lb2/v;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v2}, Lr1/c;->b(Ljava/lang/Object;)V

    :goto_0
    iget p0, v0, Lr1/c;->y:I

    if-eqz p0, :cond_c

    add-int/lit8 p0, p0, -0x1

    invoke-virtual {v0, p0}, Lr1/c;->l(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lb2/v;

    iget v2, p0, Lb2/v;->z:I

    and-int/lit8 v2, v2, 0x20

    if-eqz v2, :cond_b

    move-object v2, p0

    :goto_1
    if-eqz v2, :cond_b

    iget v3, v2, Lb2/v;->y:I

    and-int/lit8 v3, v3, 0x20

    if-eqz v3, :cond_a

    const/4 v3, 0x0

    move-object v4, v2

    move-object v5, v3

    :goto_2
    if-eqz v4, :cond_a

    instance-of v6, v4, Lz2/e;

    if-eqz v6, :cond_3

    check-cast v4, Lz2/e;

    instance-of v6, v4, La3/d;

    if-eqz v6, :cond_2

    move-object v6, v4

    check-cast v6, La3/d;

    iget-object v7, v6, La3/d;->O:Lb2/u;

    instance-of v7, v7, Lz2/c;

    if-eqz v7, :cond_2

    iget-object v6, v6, La3/d;->Q:Ljava/util/HashSet;

    invoke-virtual {v6, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-virtual {p2, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-interface {v4}, Lz2/e;->v()Lv63/c;

    move-result-object v4

    invoke-virtual {v4, p1}, Lv63/c;->c(Lz2/h;)Z

    move-result v4

    if-eqz v4, :cond_9

    goto :goto_0

    :cond_3
    iget v6, v4, Lb2/v;->y:I

    and-int/lit8 v6, v6, 0x20

    if-eqz v6, :cond_9

    instance-of v6, v4, La3/o;

    if-eqz v6, :cond_9

    move-object v6, v4

    check-cast v6, La3/o;

    iget-object v6, v6, La3/o;->P:Lb2/v;

    const/4 v7, 0x0

    :goto_3
    const/4 v8, 0x1

    if-eqz v6, :cond_8

    iget v9, v6, Lb2/v;->y:I

    and-int/lit8 v9, v9, 0x20

    if-eqz v9, :cond_7

    add-int/lit8 v7, v7, 0x1

    if-ne v7, v8, :cond_4

    move-object v4, v6

    goto :goto_4

    :cond_4
    if-nez v5, :cond_5

    new-instance v5, Lr1/c;

    new-array v8, v1, [Lb2/v;

    invoke-direct {v5, v8}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_5
    if-eqz v4, :cond_6

    invoke-virtual {v5, v4}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v4, v3

    :cond_6
    invoke-virtual {v5, v6}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_7
    :goto_4
    iget-object v6, v6, Lb2/v;->F:Lb2/v;

    goto :goto_3

    :cond_8
    if-ne v7, v8, :cond_9

    goto :goto_2

    :cond_9
    invoke-static {v5}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v4

    goto :goto_2

    :cond_a
    iget-object v2, v2, Lb2/v;->F:Lb2/v;

    goto :goto_1

    :cond_b
    invoke-static {v0, p0}, La3/g;->a(Lr1/c;Lb2/v;)V

    goto/16 :goto_0

    :cond_c
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-boolean v0, p0, Lz2/d;->f:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lz2/d;->f:Z

    new-instance v0, La3/l0;

    const/16 v1, 0x18

    invoke-direct {v0, p0, v1}, La3/l0;-><init>(Ljava/lang/Object;I)V

    iget-object v1, p0, Lz2/d;->a:Landroidx/compose/ui/platform/AndroidComposeView;

    iget-object v1, v1, Landroidx/compose/ui/platform/AndroidComposeView;->V0:La0/q0;

    invoke-virtual {v1, v0}, La0/q0;->f(Ljava/lang/Object;)I

    move-result v2

    if-ltz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v0}, La0/q0;->a(Ljava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method
