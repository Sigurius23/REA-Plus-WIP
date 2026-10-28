.class public final synthetic Lxq2/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Lp1/a1;

.field public final synthetic F:Lxq2/f0;

.field public final synthetic G:Lbc3/c0;

.field public final synthetic H:Lp1/t2;

.field public final synthetic I:Lp1/c1;

.field public final synthetic J:Ljava/util/List;

.field public final synthetic K:Ln0/u;

.field public final synthetic L:Lxq2/g1;

.field public final synthetic w:Ly3/c;

.field public final synthetic x:Lmq2/b;

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Ly3/c;Lmq2/b;IILp1/a1;Lxq2/f0;Lbc3/c0;Lp1/t2;Lp1/c1;Ljava/util/List;Ln0/u;Lxq2/g1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxq2/a1;->w:Ly3/c;

    iput-object p2, p0, Lxq2/a1;->x:Lmq2/b;

    iput p3, p0, Lxq2/a1;->y:I

    iput p4, p0, Lxq2/a1;->z:I

    iput-object p5, p0, Lxq2/a1;->E:Lp1/a1;

    iput-object p6, p0, Lxq2/a1;->F:Lxq2/f0;

    iput-object p7, p0, Lxq2/a1;->G:Lbc3/c0;

    iput-object p8, p0, Lxq2/a1;->H:Lp1/t2;

    iput-object p9, p0, Lxq2/a1;->I:Lp1/c1;

    iput-object p10, p0, Lxq2/a1;->J:Ljava/util/List;

    iput-object p11, p0, Lxq2/a1;->K:Ln0/u;

    iput-object p12, p0, Lxq2/a1;->L:Lxq2/g1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v13, p1

    check-cast v13, Ll0/v;

    move-object/from16 v14, p2

    check-cast v14, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p3

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v15

    iget-object v1, v0, Lxq2/a1;->w:Ly3/c;

    iget-object v2, v0, Lxq2/a1;->x:Lmq2/b;

    iget v3, v0, Lxq2/a1;->y:I

    iget v4, v0, Lxq2/a1;->z:I

    iget-object v5, v0, Lxq2/a1;->E:Lp1/a1;

    iget-object v6, v0, Lxq2/a1;->F:Lxq2/f0;

    iget-object v7, v0, Lxq2/a1;->G:Lbc3/c0;

    iget-object v8, v0, Lxq2/a1;->H:Lp1/t2;

    iget-object v9, v0, Lxq2/a1;->I:Lp1/c1;

    iget-object v10, v0, Lxq2/a1;->J:Ljava/util/List;

    iget-object v11, v0, Lxq2/a1;->K:Ln0/u;

    iget-object v12, v0, Lxq2/a1;->L:Lxq2/g1;

    invoke-static/range {v1 .. v15}, Lxq2/c1;->h(Ly3/c;Lmq2/b;IILp1/a1;Lxq2/f0;Lbc3/c0;Lp1/t2;Lp1/c1;Ljava/util/List;Ln0/u;Lxq2/g1;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
