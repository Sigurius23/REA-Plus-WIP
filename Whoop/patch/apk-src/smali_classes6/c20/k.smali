.class public final Lc20/k;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/String;

.field public final synthetic F:Ljava/lang/String;

.field public final synthetic G:Ljava/lang/String;

.field public final synthetic H:Ljava/lang/String;

.field public final synthetic I:Z

.field public final synthetic J:Ljava/lang/String;

.field public final synthetic K:Z

.field public final synthetic w:Lc20/n;

.field public final synthetic x:Ls40/a;

.field public final synthetic y:Ly00/c8;

.field public final synthetic z:I


# direct methods
.method public constructor <init>(Lc20/n;Ls40/a;Ly00/c8;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLq83/d;)V
    .locals 0

    iput-object p1, p0, Lc20/k;->w:Lc20/n;

    iput-object p2, p0, Lc20/k;->x:Ls40/a;

    iput-object p3, p0, Lc20/k;->y:Ly00/c8;

    iput p4, p0, Lc20/k;->z:I

    iput-object p5, p0, Lc20/k;->E:Ljava/lang/String;

    iput-object p6, p0, Lc20/k;->F:Ljava/lang/String;

    iput-object p7, p0, Lc20/k;->G:Ljava/lang/String;

    iput-object p8, p0, Lc20/k;->H:Ljava/lang/String;

    iput-boolean p9, p0, Lc20/k;->I:Z

    iput-object p10, p0, Lc20/k;->J:Ljava/lang/String;

    iput-boolean p11, p0, Lc20/k;->K:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p12}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 13

    new-instance v0, Lc20/k;

    iget-object v10, p0, Lc20/k;->J:Ljava/lang/String;

    iget-boolean v11, p0, Lc20/k;->K:Z

    iget-object v1, p0, Lc20/k;->w:Lc20/n;

    iget-object v2, p0, Lc20/k;->x:Ls40/a;

    iget-object v3, p0, Lc20/k;->y:Ly00/c8;

    iget v4, p0, Lc20/k;->z:I

    iget-object v5, p0, Lc20/k;->E:Ljava/lang/String;

    iget-object v6, p0, Lc20/k;->F:Ljava/lang/String;

    iget-object v7, p0, Lc20/k;->G:Ljava/lang/String;

    iget-object v8, p0, Lc20/k;->H:Ljava/lang/String;

    iget-boolean v9, p0, Lc20/k;->I:Z

    move-object v12, p2

    invoke-direct/range {v0 .. v12}, Lc20/k;-><init>(Lc20/n;Ls40/a;Ly00/c8;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLq83/d;)V

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lc20/k;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lc20/k;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lc20/k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lc20/k;->w:Lc20/n;

    iget-object v2, v1, Lc20/n;->a:Lkotlin/jvm/functions/Function1;

    iget-object v3, v0, Lc20/k;->x:Ls40/a;

    invoke-interface {v2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lux/w;

    new-instance v4, Lyx/b;

    iget-object v5, v0, Lc20/k;->y:Ly00/c8;

    invoke-interface {v5}, Ly00/c8;->getId()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_0

    const-string v5, ""

    :cond_0
    iget-boolean v10, v1, Lc20/n;->d:Z

    iget-object v15, v3, Ls40/a;->b:Ljava/lang/Integer;

    iget-object v3, v1, Lc20/n;->f:Lc93/a;

    invoke-interface {v3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v16, v3

    check-cast v16, Ljava/lang/String;

    iget-boolean v1, v1, Lc20/n;->g:Z

    iget-boolean v3, v0, Lc20/k;->K:Z

    const/16 v20, 0x40

    iget v6, v0, Lc20/k;->z:I

    iget-object v7, v0, Lc20/k;->E:Ljava/lang/String;

    iget-object v8, v0, Lc20/k;->F:Ljava/lang/String;

    iget-object v9, v0, Lc20/k;->G:Ljava/lang/String;

    iget-object v12, v0, Lc20/k;->H:Ljava/lang/String;

    const/4 v13, 0x0

    iget-boolean v14, v0, Lc20/k;->I:Z

    iget-object v11, v0, Lc20/k;->J:Ljava/lang/String;

    move/from16 v17, v1

    move/from16 v19, v3

    move-object/from16 v18, v11

    const/4 v11, 0x0

    invoke-direct/range {v4 .. v20}, Lyx/b;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLm30/g;Ljava/lang/String;ZZLjava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;ZI)V

    invoke-interface {v2, v4}, Ls40/b;->b(Ljava/lang/Object;)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
