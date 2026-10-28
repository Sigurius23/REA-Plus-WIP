.class public final synthetic Lwz/f1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lec3/t1;

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic G:Lc93/a;

.field public final synthetic H:Lc93/a;

.field public final synthetic I:Lc93/m;

.field public final synthetic J:Lc93/a;

.field public final synthetic K:Lkotlin/jvm/functions/Function1;

.field public final synthetic L:Lc93/a;

.field public final synthetic M:Lkotlin/jvm/functions/Function1;

.field public final synthetic N:Lkotlin/jvm/functions/Function1;

.field public final synthetic O:Lc93/a;

.field public final synthetic P:Lc93/a;

.field public final synthetic w:Lh40/k;

.field public final synthetic x:Lwz/r1;

.field public final synthetic y:Lh00/j;

.field public final synthetic z:Lk20/a;


# direct methods
.method public synthetic constructor <init>(Lh40/k;Lwz/r1;Lh00/j;Lk20/a;Lec3/t1;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/m;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwz/f1;->w:Lh40/k;

    iput-object p2, p0, Lwz/f1;->x:Lwz/r1;

    iput-object p3, p0, Lwz/f1;->y:Lh00/j;

    iput-object p4, p0, Lwz/f1;->z:Lk20/a;

    iput-object p5, p0, Lwz/f1;->E:Lec3/t1;

    iput-object p6, p0, Lwz/f1;->F:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lwz/f1;->G:Lc93/a;

    iput-object p8, p0, Lwz/f1;->H:Lc93/a;

    iput-object p9, p0, Lwz/f1;->I:Lc93/m;

    iput-object p10, p0, Lwz/f1;->J:Lc93/a;

    iput-object p11, p0, Lwz/f1;->K:Lkotlin/jvm/functions/Function1;

    iput-object p12, p0, Lwz/f1;->L:Lc93/a;

    iput-object p13, p0, Lwz/f1;->M:Lkotlin/jvm/functions/Function1;

    iput-object p14, p0, Lwz/f1;->N:Lkotlin/jvm/functions/Function1;

    iput-object p15, p0, Lwz/f1;->O:Lc93/a;

    move-object/from16 p1, p16

    iput-object p1, p0, Lwz/f1;->P:Lc93/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v17, p1

    check-cast v17, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v1, 0x9

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v18

    iget-object v1, v0, Lwz/f1;->w:Lh40/k;

    iget-object v2, v0, Lwz/f1;->x:Lwz/r1;

    iget-object v3, v0, Lwz/f1;->y:Lh00/j;

    iget-object v4, v0, Lwz/f1;->z:Lk20/a;

    iget-object v5, v0, Lwz/f1;->E:Lec3/t1;

    iget-object v6, v0, Lwz/f1;->F:Lkotlin/jvm/functions/Function1;

    iget-object v7, v0, Lwz/f1;->G:Lc93/a;

    iget-object v8, v0, Lwz/f1;->H:Lc93/a;

    iget-object v9, v0, Lwz/f1;->I:Lc93/m;

    iget-object v10, v0, Lwz/f1;->J:Lc93/a;

    iget-object v11, v0, Lwz/f1;->K:Lkotlin/jvm/functions/Function1;

    iget-object v12, v0, Lwz/f1;->L:Lc93/a;

    iget-object v13, v0, Lwz/f1;->M:Lkotlin/jvm/functions/Function1;

    iget-object v14, v0, Lwz/f1;->N:Lkotlin/jvm/functions/Function1;

    iget-object v15, v0, Lwz/f1;->O:Lc93/a;

    move-object/from16 v16, v1

    iget-object v1, v0, Lwz/f1;->P:Lc93/a;

    move-object/from16 v19, v16

    move-object/from16 v16, v1

    move-object/from16 v1, v19

    invoke-static/range {v1 .. v18}, Lwz/n1;->b(Lh40/k;Lwz/r1;Lh00/j;Lk20/a;Lec3/t1;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/m;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
