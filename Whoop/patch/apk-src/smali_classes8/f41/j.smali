.class public final synthetic Lf41/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lhy0/c2;

.field public final synthetic F:Lcom/whoop/design/util/TextResource;

.field public final synthetic G:Lf41/a;

.field public final synthetic H:Ljava/lang/String;

.field public final synthetic I:Lkotlin/jvm/functions/Function1;

.field public final synthetic J:Lp1/c1;

.field public final synthetic K:Lkotlin/jvm/functions/Function3;

.field public final synthetic L:Lp1/c1;

.field public final synthetic M:Lp1/c1;

.field public final synthetic N:Z

.field public final synthetic O:Lcom/whoop/design/util/TextResource;

.field public final synthetic P:Z

.field public final synthetic Q:Ljava/util/Map;

.field public final synthetic R:Lf41/b;

.field public final synthetic S:Ljava/lang/String;

.field public final synthetic T:Lp1/c1;

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Lkd1/o;

.field public final synthetic y:Z

.field public final synthetic z:Lcom/whoop/design/util/TextResource;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lkd1/o;ZLcom/whoop/design/util/TextResource;Lhy0/c2;Lcom/whoop/design/util/TextResource;Lf41/a;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lp1/c1;Lkotlin/jvm/functions/Function3;Lp1/c1;Lp1/c1;ZLcom/whoop/design/util/TextResource;ZLjava/util/Map;Lf41/b;Ljava/lang/String;Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf41/j;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lf41/j;->x:Lkd1/o;

    iput-boolean p3, p0, Lf41/j;->y:Z

    iput-object p4, p0, Lf41/j;->z:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Lf41/j;->E:Lhy0/c2;

    iput-object p6, p0, Lf41/j;->F:Lcom/whoop/design/util/TextResource;

    iput-object p7, p0, Lf41/j;->G:Lf41/a;

    iput-object p8, p0, Lf41/j;->H:Ljava/lang/String;

    iput-object p9, p0, Lf41/j;->I:Lkotlin/jvm/functions/Function1;

    iput-object p10, p0, Lf41/j;->J:Lp1/c1;

    iput-object p11, p0, Lf41/j;->K:Lkotlin/jvm/functions/Function3;

    iput-object p12, p0, Lf41/j;->L:Lp1/c1;

    iput-object p13, p0, Lf41/j;->M:Lp1/c1;

    iput-boolean p14, p0, Lf41/j;->N:Z

    iput-object p15, p0, Lf41/j;->O:Lcom/whoop/design/util/TextResource;

    move/from16 p1, p16

    iput-boolean p1, p0, Lf41/j;->P:Z

    move-object/from16 p1, p17

    iput-object p1, p0, Lf41/j;->Q:Ljava/util/Map;

    move-object/from16 p1, p18

    iput-object p1, p0, Lf41/j;->R:Lf41/b;

    move-object/from16 p1, p19

    iput-object p1, p0, Lf41/j;->S:Ljava/lang/String;

    move-object/from16 p1, p20

    iput-object p1, p0, Lf41/j;->T:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v21, p1

    check-cast v21, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v22

    iget-object v1, v0, Lf41/j;->w:Landroidx/compose/ui/Modifier;

    iget-object v2, v0, Lf41/j;->x:Lkd1/o;

    iget-boolean v3, v0, Lf41/j;->y:Z

    iget-object v4, v0, Lf41/j;->z:Lcom/whoop/design/util/TextResource;

    iget-object v5, v0, Lf41/j;->E:Lhy0/c2;

    iget-object v6, v0, Lf41/j;->F:Lcom/whoop/design/util/TextResource;

    iget-object v7, v0, Lf41/j;->G:Lf41/a;

    iget-object v8, v0, Lf41/j;->H:Ljava/lang/String;

    iget-object v9, v0, Lf41/j;->I:Lkotlin/jvm/functions/Function1;

    iget-object v10, v0, Lf41/j;->J:Lp1/c1;

    iget-object v11, v0, Lf41/j;->K:Lkotlin/jvm/functions/Function3;

    iget-object v12, v0, Lf41/j;->L:Lp1/c1;

    iget-object v13, v0, Lf41/j;->M:Lp1/c1;

    iget-boolean v14, v0, Lf41/j;->N:Z

    iget-object v15, v0, Lf41/j;->O:Lcom/whoop/design/util/TextResource;

    move-object/from16 v16, v1

    iget-boolean v1, v0, Lf41/j;->P:Z

    move/from16 v17, v1

    iget-object v1, v0, Lf41/j;->Q:Ljava/util/Map;

    move-object/from16 v18, v1

    iget-object v1, v0, Lf41/j;->R:Lf41/b;

    move-object/from16 v19, v1

    iget-object v1, v0, Lf41/j;->S:Ljava/lang/String;

    move-object/from16 v20, v1

    iget-object v1, v0, Lf41/j;->T:Lp1/c1;

    move-object/from16 v23, v20

    move-object/from16 v20, v1

    move-object/from16 v1, v16

    move/from16 v16, v17

    move-object/from16 v17, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v23

    invoke-static/range {v1 .. v22}, Lf41/p;->d(Landroidx/compose/ui/Modifier;Lkd1/o;ZLcom/whoop/design/util/TextResource;Lhy0/c2;Lcom/whoop/design/util/TextResource;Lf41/a;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lp1/c1;Lkotlin/jvm/functions/Function3;Lp1/c1;Lp1/c1;ZLcom/whoop/design/util/TextResource;ZLjava/util/Map;Lf41/b;Ljava/lang/String;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
