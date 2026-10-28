.class public final synthetic Ljc/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic E:Ljava/lang/String;

.field public final synthetic F:Ljava/util/Set;

.field public final synthetic G:Z

.field public final synthetic w:Landroidx/work/impl/WorkDatabase;

.field public final synthetic x:Lqc/q;

.field public final synthetic y:Lqc/q;

.field public final synthetic z:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Landroidx/work/impl/WorkDatabase;Lqc/q;Lqc/q;Ljava/util/List;Ljava/lang/String;Ljava/util/Set;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljc/y;->w:Landroidx/work/impl/WorkDatabase;

    iput-object p2, p0, Ljc/y;->x:Lqc/q;

    iput-object p3, p0, Ljc/y;->y:Lqc/q;

    iput-object p4, p0, Ljc/y;->z:Ljava/util/List;

    iput-object p5, p0, Ljc/y;->E:Ljava/lang/String;

    iput-object p6, p0, Ljc/y;->F:Ljava/util/Set;

    iput-boolean p7, p0, Ljc/y;->G:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 20

    move-object/from16 v0, p0

    iget-object v1, v0, Ljc/y;->w:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->h()Lqc/u;

    move-result-object v2

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->i()Lqc/w;

    move-result-object v3

    iget-object v4, v0, Ljc/y;->x:Lqc/q;

    iget-object v7, v4, Lqc/q;->b:Lic/m0;

    iget v10, v4, Lqc/q;->k:I

    iget-wide v11, v4, Lqc/q;->n:J

    iget v5, v4, Lqc/q;->t:I

    const/4 v6, 0x1

    add-int/lit8 v14, v5, 0x1

    iget v13, v4, Lqc/q;->s:I

    iget-wide v8, v4, Lqc/q;->u:J

    iget v4, v4, Lqc/q;->v:I

    move-wide v15, v8

    const/4 v9, 0x0

    const v18, 0x1c3dbfd

    iget-object v5, v0, Ljc/y;->y:Lqc/q;

    move v8, v6

    const/4 v6, 0x0

    move/from16 v17, v8

    const/4 v8, 0x0

    move/from16 v19, v17

    move/from16 v17, v4

    move/from16 v4, v19

    invoke-static/range {v5 .. v18}, Lqc/q;->b(Lqc/q;Ljava/lang/String;Lic/m0;Ljava/lang/String;Lic/g;IJIIJII)Lqc/q;

    move-result-object v6

    iget v7, v5, Lqc/q;->v:I

    if-ne v7, v4, :cond_0

    iget-wide v7, v5, Lqc/q;->u:J

    iput-wide v7, v6, Lqc/q;->u:J

    iget v5, v6, Lqc/q;->v:I

    add-int/2addr v5, v4

    iput v5, v6, Lqc/q;->v:I

    :cond_0
    iget-object v5, v0, Ljc/y;->z:Ljava/util/List;

    invoke-static {v5, v6}, Lts/o;->U(Ljava/util/List;Lqc/q;)Lqc/q;

    move-result-object v5

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v6, v2, Lqc/u;->a:Landroidx/room/z0;

    new-instance v7, Lqc/r;

    const/4 v8, 0x1

    invoke-direct {v7, v2, v5, v8}, Lqc/r;-><init>(Lqc/u;Lqc/q;I)V

    const/4 v5, 0x0

    invoke-static {v6, v5, v4, v7}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v6, "id"

    iget-object v7, v0, Ljc/y;->E:Ljava/lang/String;

    invoke-static {v7, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, v3, Lqc/w;->a:Landroidx/room/z0;

    new-instance v8, Le61/g;

    const/16 v9, 0x13

    invoke-direct {v8, v7, v9}, Le61/g;-><init>(Ljava/lang/String;I)V

    invoke-static {v6, v5, v4, v8}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    iget-object v6, v0, Ljc/y;->F:Ljava/util/Set;

    invoke-virtual {v3, v7, v6}, Lqc/w;->a(Ljava/lang/String;Ljava/util/Set;)V

    iget-boolean v3, v0, Ljc/y;->G:Z

    if-nez v3, :cond_1

    const-wide/16 v8, -0x1

    invoke-virtual {v2, v8, v9, v7}, Lqc/u;->g(JLjava/lang/String;)I

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->g()Lqc/n;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v1, Lqc/n;->a:Landroidx/room/z0;

    new-instance v2, Le61/g;

    const/16 v3, 0x8

    invoke-direct {v2, v7, v3}, Le61/g;-><init>(Ljava/lang/String;I)V

    invoke-static {v1, v5, v4, v2}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    :cond_1
    return-void
.end method
