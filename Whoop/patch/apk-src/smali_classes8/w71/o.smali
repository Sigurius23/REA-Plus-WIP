.class public final synthetic Lw71/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic G:Ljava/lang/Integer;

.field public final synthetic H:Z

.field public final synthetic I:Z

.field public final synthetic J:Lkotlin/jvm/functions/Function1;

.field public final synthetic K:I

.field public final synthetic L:I

.field public final synthetic w:Lcom/whoop/design/util/TextResource;

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:Lcom/whoop/design/util/TextResource;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIILjava/lang/Integer;ZZLkotlin/jvm/functions/Function1;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw71/o;->w:Lcom/whoop/design/util/TextResource;

    iput-object p2, p0, Lw71/o;->x:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lw71/o;->y:Lcom/whoop/design/util/TextResource;

    iput p4, p0, Lw71/o;->z:I

    iput p5, p0, Lw71/o;->E:I

    iput p6, p0, Lw71/o;->F:I

    iput-object p7, p0, Lw71/o;->G:Ljava/lang/Integer;

    iput-boolean p8, p0, Lw71/o;->H:Z

    iput-boolean p9, p0, Lw71/o;->I:Z

    iput-object p10, p0, Lw71/o;->J:Lkotlin/jvm/functions/Function1;

    iput p11, p0, Lw71/o;->K:I

    iput p12, p0, Lw71/o;->L:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    move-object v12, p1

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v13

    iget-object v0, p0, Lw71/o;->w:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lw71/o;->x:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lw71/o;->y:Lcom/whoop/design/util/TextResource;

    iget v3, p0, Lw71/o;->z:I

    iget v4, p0, Lw71/o;->E:I

    iget v5, p0, Lw71/o;->F:I

    iget-object v6, p0, Lw71/o;->G:Ljava/lang/Integer;

    iget-boolean v7, p0, Lw71/o;->H:Z

    iget-boolean v8, p0, Lw71/o;->I:Z

    iget-object v9, p0, Lw71/o;->J:Lkotlin/jvm/functions/Function1;

    iget v10, p0, Lw71/o;->K:I

    iget v11, p0, Lw71/o;->L:I

    invoke-static/range {v0 .. v13}, Lw71/p;->a(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIILjava/lang/Integer;ZZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
