.class public final synthetic Lny0/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:Z

.field public final synthetic G:Z

.field public final synthetic H:Lny0/y0;

.field public final synthetic I:Z

.field public final synthetic J:Lkotlin/jvm/functions/Function1;

.field public final synthetic K:I

.field public final synthetic L:I

.field public final synthetic w:Lcom/whoop/design/util/TextResource;

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:Lcom/whoop/design/util/TextResource;

.field public final synthetic z:Landroidx/compose/ui/Modifier;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;JZZLny0/y0;ZLkotlin/jvm/functions/Function1;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lny0/w0;->w:Lcom/whoop/design/util/TextResource;

    iput-object p2, p0, Lny0/w0;->x:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lny0/w0;->y:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lny0/w0;->z:Landroidx/compose/ui/Modifier;

    iput-wide p5, p0, Lny0/w0;->E:J

    iput-boolean p7, p0, Lny0/w0;->F:Z

    iput-boolean p8, p0, Lny0/w0;->G:Z

    iput-object p9, p0, Lny0/w0;->H:Lny0/y0;

    iput-boolean p10, p0, Lny0/w0;->I:Z

    iput-object p11, p0, Lny0/w0;->J:Lkotlin/jvm/functions/Function1;

    iput p12, p0, Lny0/w0;->K:I

    iput p13, p0, Lny0/w0;->L:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v14, p1

    check-cast v14, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v15

    iget-object v1, v0, Lny0/w0;->w:Lcom/whoop/design/util/TextResource;

    iget-object v2, v0, Lny0/w0;->x:Lcom/whoop/design/util/TextResource;

    iget-object v3, v0, Lny0/w0;->y:Lcom/whoop/design/util/TextResource;

    iget-object v4, v0, Lny0/w0;->z:Landroidx/compose/ui/Modifier;

    iget-wide v5, v0, Lny0/w0;->E:J

    iget-boolean v7, v0, Lny0/w0;->F:Z

    iget-boolean v8, v0, Lny0/w0;->G:Z

    iget-object v9, v0, Lny0/w0;->H:Lny0/y0;

    iget-boolean v10, v0, Lny0/w0;->I:Z

    iget-object v11, v0, Lny0/w0;->J:Lkotlin/jvm/functions/Function1;

    iget v12, v0, Lny0/w0;->K:I

    iget v13, v0, Lny0/w0;->L:I

    invoke-static/range {v1 .. v15}, Lny0/x0;->a(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;JZZLny0/y0;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
