.class public final synthetic Le41/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Z

.field public final synthetic G:Lgz0/m0;

.field public final synthetic H:Lgz0/m0;

.field public final synthetic I:Lcom/whoop/design/util/TextResource;

.field public final synthetic J:Lkotlin/jvm/functions/Function1;

.field public final synthetic K:Ljava/lang/Object;

.field public final synthetic L:Lg1/n7;

.field public final synthetic M:I

.field public final synthetic N:I

.field public final synthetic O:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;ZZZZZLgz0/m0;Lgz0/m0;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lg1/n7;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le41/c;->w:Landroidx/compose/ui/Modifier;

    iput-boolean p2, p0, Le41/c;->x:Z

    iput-boolean p3, p0, Le41/c;->y:Z

    iput-boolean p4, p0, Le41/c;->z:Z

    iput-boolean p5, p0, Le41/c;->E:Z

    iput-boolean p6, p0, Le41/c;->F:Z

    iput-object p7, p0, Le41/c;->G:Lgz0/m0;

    iput-object p8, p0, Le41/c;->H:Lgz0/m0;

    iput-object p9, p0, Le41/c;->I:Lcom/whoop/design/util/TextResource;

    iput-object p10, p0, Le41/c;->J:Lkotlin/jvm/functions/Function1;

    iput-object p11, p0, Le41/c;->K:Ljava/lang/Object;

    iput-object p12, p0, Le41/c;->L:Lg1/n7;

    iput p13, p0, Le41/c;->M:I

    iput p14, p0, Le41/c;->N:I

    iput p15, p0, Le41/c;->O:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v16, p1

    check-cast v16, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v17

    iget-object v1, v0, Le41/c;->w:Landroidx/compose/ui/Modifier;

    iget-boolean v2, v0, Le41/c;->x:Z

    iget-boolean v3, v0, Le41/c;->y:Z

    iget-boolean v4, v0, Le41/c;->z:Z

    iget-boolean v5, v0, Le41/c;->E:Z

    iget-boolean v6, v0, Le41/c;->F:Z

    iget-object v7, v0, Le41/c;->G:Lgz0/m0;

    iget-object v8, v0, Le41/c;->H:Lgz0/m0;

    iget-object v9, v0, Le41/c;->I:Lcom/whoop/design/util/TextResource;

    iget-object v10, v0, Le41/c;->J:Lkotlin/jvm/functions/Function1;

    iget-object v11, v0, Le41/c;->K:Ljava/lang/Object;

    iget-object v12, v0, Le41/c;->L:Lg1/n7;

    iget v13, v0, Le41/c;->M:I

    iget v14, v0, Le41/c;->N:I

    iget v15, v0, Le41/c;->O:I

    invoke-static/range {v1 .. v17}, Le41/g;->c(Landroidx/compose/ui/Modifier;ZZZZZLgz0/m0;Lgz0/m0;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lg1/n7;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
