.class public final synthetic Lw71/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Integer;

.field public final synthetic F:Z

.field public final synthetic G:Z

.field public final synthetic H:Lkotlin/jvm/functions/Function1;

.field public final synthetic I:I

.field public final synthetic J:I

.field public final synthetic w:Lcom/whoop/design/util/TextResource;

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IILjava/lang/Integer;ZZLkotlin/jvm/functions/Function1;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw71/r;->w:Lcom/whoop/design/util/TextResource;

    iput-object p2, p0, Lw71/r;->x:Lcom/whoop/design/util/TextResource;

    iput p3, p0, Lw71/r;->y:I

    iput p4, p0, Lw71/r;->z:I

    iput-object p5, p0, Lw71/r;->E:Ljava/lang/Integer;

    iput-boolean p6, p0, Lw71/r;->F:Z

    iput-boolean p7, p0, Lw71/r;->G:Z

    iput-object p8, p0, Lw71/r;->H:Lkotlin/jvm/functions/Function1;

    iput p9, p0, Lw71/r;->I:I

    iput p10, p0, Lw71/r;->J:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget-object v0, p0, Lw71/r;->w:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lw71/r;->x:Lcom/whoop/design/util/TextResource;

    iget v2, p0, Lw71/r;->y:I

    iget v3, p0, Lw71/r;->z:I

    iget-object v4, p0, Lw71/r;->E:Ljava/lang/Integer;

    iget-boolean v5, p0, Lw71/r;->F:Z

    iget-boolean v6, p0, Lw71/r;->G:Z

    iget-object v7, p0, Lw71/r;->H:Lkotlin/jvm/functions/Function1;

    iget v8, p0, Lw71/r;->I:I

    iget v9, p0, Lw71/r;->J:I

    invoke-static/range {v0 .. v11}, Lw71/s;->c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IILjava/lang/Integer;ZZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
