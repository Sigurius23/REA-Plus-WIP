.class public final synthetic Lx21/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic G:Lkotlin/jvm/functions/Function1;

.field public final synthetic H:Z

.field public final synthetic I:Z

.field public final synthetic J:Lcom/whoop/design/util/TextResource;

.field public final synthetic K:Lkotlin/jvm/functions/Function1;

.field public final synthetic L:I

.field public final synthetic M:I

.field public final synthetic N:I

.field public final synthetic w:Lcom/whoop/design/util/TextResource;

.field public final synthetic x:I

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;IIIZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZLcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx21/b;->w:Lcom/whoop/design/util/TextResource;

    iput p2, p0, Lx21/b;->x:I

    iput p3, p0, Lx21/b;->y:I

    iput p4, p0, Lx21/b;->z:I

    iput-boolean p5, p0, Lx21/b;->E:Z

    iput-object p6, p0, Lx21/b;->F:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lx21/b;->G:Lkotlin/jvm/functions/Function1;

    iput-boolean p8, p0, Lx21/b;->H:Z

    iput-boolean p9, p0, Lx21/b;->I:Z

    iput-object p10, p0, Lx21/b;->J:Lcom/whoop/design/util/TextResource;

    iput-object p11, p0, Lx21/b;->K:Lkotlin/jvm/functions/Function1;

    iput p12, p0, Lx21/b;->L:I

    iput p13, p0, Lx21/b;->M:I

    iput p14, p0, Lx21/b;->N:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v15, p1

    check-cast v15, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v16

    iget-object v1, v0, Lx21/b;->w:Lcom/whoop/design/util/TextResource;

    iget v2, v0, Lx21/b;->x:I

    iget v3, v0, Lx21/b;->y:I

    iget v4, v0, Lx21/b;->z:I

    iget-boolean v5, v0, Lx21/b;->E:Z

    iget-object v6, v0, Lx21/b;->F:Lkotlin/jvm/functions/Function1;

    iget-object v7, v0, Lx21/b;->G:Lkotlin/jvm/functions/Function1;

    iget-boolean v8, v0, Lx21/b;->H:Z

    iget-boolean v9, v0, Lx21/b;->I:Z

    iget-object v10, v0, Lx21/b;->J:Lcom/whoop/design/util/TextResource;

    iget-object v11, v0, Lx21/b;->K:Lkotlin/jvm/functions/Function1;

    iget v12, v0, Lx21/b;->L:I

    iget v13, v0, Lx21/b;->M:I

    iget v14, v0, Lx21/b;->N:I

    invoke-static/range {v1 .. v16}, Lx21/d;->h(Lcom/whoop/design/util/TextResource;IIIZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZLcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
