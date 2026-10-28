.class public final synthetic Lf41/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Ljava/util/Map;

.field public final synthetic F:Lkotlin/jvm/functions/Function3;

.field public final synthetic G:Lp1/c1;

.field public final synthetic H:Lf41/b;

.field public final synthetic I:Ljava/lang/String;

.field public final synthetic J:Lp1/c1;

.field public final synthetic K:Lp1/c1;

.field public final synthetic L:Lp1/c1;

.field public final synthetic w:Z

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:Z

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(ZLcom/whoop/design/util/TextResource;ZLjava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function3;Lp1/c1;Lf41/b;Ljava/lang/String;Lp1/c1;Lp1/c1;Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lf41/h;->w:Z

    iput-object p2, p0, Lf41/h;->x:Lcom/whoop/design/util/TextResource;

    iput-boolean p3, p0, Lf41/h;->y:Z

    iput-object p4, p0, Lf41/h;->z:Ljava/lang/String;

    iput-object p5, p0, Lf41/h;->E:Ljava/util/Map;

    iput-object p6, p0, Lf41/h;->F:Lkotlin/jvm/functions/Function3;

    iput-object p7, p0, Lf41/h;->G:Lp1/c1;

    iput-object p8, p0, Lf41/h;->H:Lf41/b;

    iput-object p9, p0, Lf41/h;->I:Ljava/lang/String;

    iput-object p10, p0, Lf41/h;->J:Lp1/c1;

    iput-object p11, p0, Lf41/h;->K:Lp1/c1;

    iput-object p12, p0, Lf41/h;->L:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v13, p1

    check-cast v13, Lc0/i0;

    move-object/from16 v14, p2

    check-cast v14, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p3

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v15

    iget-boolean v1, v0, Lf41/h;->w:Z

    iget-object v2, v0, Lf41/h;->x:Lcom/whoop/design/util/TextResource;

    iget-boolean v3, v0, Lf41/h;->y:Z

    iget-object v4, v0, Lf41/h;->z:Ljava/lang/String;

    iget-object v5, v0, Lf41/h;->E:Ljava/util/Map;

    iget-object v6, v0, Lf41/h;->F:Lkotlin/jvm/functions/Function3;

    iget-object v7, v0, Lf41/h;->G:Lp1/c1;

    iget-object v8, v0, Lf41/h;->H:Lf41/b;

    iget-object v9, v0, Lf41/h;->I:Ljava/lang/String;

    iget-object v10, v0, Lf41/h;->J:Lp1/c1;

    iget-object v11, v0, Lf41/h;->K:Lp1/c1;

    iget-object v12, v0, Lf41/h;->L:Lp1/c1;

    invoke-static/range {v1 .. v15}, Lf41/p;->i(ZLcom/whoop/design/util/TextResource;ZLjava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function3;Lp1/c1;Lf41/b;Ljava/lang/String;Lp1/c1;Lp1/c1;Lp1/c1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
