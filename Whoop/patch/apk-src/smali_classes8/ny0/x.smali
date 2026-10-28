.class public final synthetic Lny0/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Lv41/r0;

.field public final synthetic F:Ljava/lang/Integer;

.field public final synthetic G:Lcom/whoop/design/util/TextResource;

.field public final synthetic H:Lg1/u0;

.field public final synthetic I:Z

.field public final synthetic J:Lb91/a;

.field public final synthetic K:Ljava/lang/Integer;

.field public final synthetic L:Landroidx/compose/ui/Modifier;

.field public final synthetic M:Landroidx/compose/ui/Modifier;

.field public final synthetic w:Li2/t;

.field public final synthetic x:Lt0/i;

.field public final synthetic y:Ll0/k1;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Li2/t;Lt0/i;Ll0/k1;ZLv41/r0;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lg1/u0;ZLb91/a;Ljava/lang/Integer;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lny0/x;->w:Li2/t;

    iput-object p2, p0, Lny0/x;->x:Lt0/i;

    iput-object p3, p0, Lny0/x;->y:Ll0/k1;

    iput-boolean p4, p0, Lny0/x;->z:Z

    iput-object p5, p0, Lny0/x;->E:Lv41/r0;

    iput-object p6, p0, Lny0/x;->F:Ljava/lang/Integer;

    iput-object p7, p0, Lny0/x;->G:Lcom/whoop/design/util/TextResource;

    iput-object p8, p0, Lny0/x;->H:Lg1/u0;

    iput-boolean p9, p0, Lny0/x;->I:Z

    iput-object p10, p0, Lny0/x;->J:Lb91/a;

    iput-object p11, p0, Lny0/x;->K:Ljava/lang/Integer;

    iput-object p12, p0, Lny0/x;->L:Landroidx/compose/ui/Modifier;

    iput-object p13, p0, Lny0/x;->M:Landroidx/compose/ui/Modifier;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v14, p1

    check-cast v14, Ll0/s1;

    move-object/from16 v15, p2

    check-cast v15, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p3

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v16

    iget-object v1, v0, Lny0/x;->w:Li2/t;

    iget-object v2, v0, Lny0/x;->x:Lt0/i;

    iget-object v3, v0, Lny0/x;->y:Ll0/k1;

    iget-boolean v4, v0, Lny0/x;->z:Z

    iget-object v5, v0, Lny0/x;->E:Lv41/r0;

    iget-object v6, v0, Lny0/x;->F:Ljava/lang/Integer;

    iget-object v7, v0, Lny0/x;->G:Lcom/whoop/design/util/TextResource;

    iget-object v8, v0, Lny0/x;->H:Lg1/u0;

    iget-boolean v9, v0, Lny0/x;->I:Z

    iget-object v10, v0, Lny0/x;->J:Lb91/a;

    iget-object v11, v0, Lny0/x;->K:Ljava/lang/Integer;

    iget-object v12, v0, Lny0/x;->L:Landroidx/compose/ui/Modifier;

    iget-object v13, v0, Lny0/x;->M:Landroidx/compose/ui/Modifier;

    invoke-static/range {v1 .. v16}, Lny0/z;->d(Li2/t;Lt0/i;Ll0/k1;ZLv41/r0;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lg1/u0;ZLb91/a;Ljava/lang/Integer;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
