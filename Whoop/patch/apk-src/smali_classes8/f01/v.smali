.class public final synthetic Lf01/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lc93/a;

.field public final synthetic F:Lcom/whoop/design/util/TextResource;

.field public final synthetic G:J

.field public final synthetic H:Lcom/whoop/design/util/TextResource;

.field public final synthetic I:Lny0/o;

.field public final synthetic J:Ljava/lang/String;

.field public final synthetic K:Lc93/m;

.field public final synthetic L:I

.field public final synthetic M:I

.field public final synthetic N:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:Lcom/whoop/design/util/TextResource;

.field public final synthetic z:Lcom/whoop/design/util/TextResource;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;Lny0/o;Ljava/lang/String;Lc93/m;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf01/v;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lf01/v;->x:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lf01/v;->y:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lf01/v;->z:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Lf01/v;->E:Lc93/a;

    iput-object p6, p0, Lf01/v;->F:Lcom/whoop/design/util/TextResource;

    iput-wide p7, p0, Lf01/v;->G:J

    iput-object p9, p0, Lf01/v;->H:Lcom/whoop/design/util/TextResource;

    iput-object p10, p0, Lf01/v;->I:Lny0/o;

    iput-object p11, p0, Lf01/v;->J:Ljava/lang/String;

    iput-object p12, p0, Lf01/v;->K:Lc93/m;

    iput p13, p0, Lf01/v;->L:I

    iput p14, p0, Lf01/v;->M:I

    iput p15, p0, Lf01/v;->N:I

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

    iget-object v1, v0, Lf01/v;->w:Landroidx/compose/ui/Modifier;

    iget-object v2, v0, Lf01/v;->x:Lcom/whoop/design/util/TextResource;

    iget-object v3, v0, Lf01/v;->y:Lcom/whoop/design/util/TextResource;

    iget-object v4, v0, Lf01/v;->z:Lcom/whoop/design/util/TextResource;

    iget-object v5, v0, Lf01/v;->E:Lc93/a;

    iget-object v6, v0, Lf01/v;->F:Lcom/whoop/design/util/TextResource;

    iget-wide v7, v0, Lf01/v;->G:J

    iget-object v9, v0, Lf01/v;->H:Lcom/whoop/design/util/TextResource;

    iget-object v10, v0, Lf01/v;->I:Lny0/o;

    iget-object v11, v0, Lf01/v;->J:Ljava/lang/String;

    iget-object v12, v0, Lf01/v;->K:Lc93/m;

    iget v13, v0, Lf01/v;->L:I

    iget v14, v0, Lf01/v;->M:I

    iget v15, v0, Lf01/v;->N:I

    invoke-static/range {v1 .. v17}, Lf01/w;->c(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;Lny0/o;Ljava/lang/String;Lc93/m;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
