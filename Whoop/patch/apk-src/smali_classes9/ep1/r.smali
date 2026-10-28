.class public final synthetic Lep1/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lcom/whoop/design/util/TextResource;

.field public final synthetic F:Lc93/a;

.field public final synthetic G:Lc93/a;

.field public final synthetic H:I

.field public final synthetic I:I

.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:Lcom/whoop/design/util/TextResource;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Lc93/a;Lc93/a;III)V
    .locals 0

    iput p9, p0, Lep1/r;->w:I

    iput-object p1, p0, Lep1/r;->x:Lcom/whoop/design/util/TextResource;

    iput-object p2, p0, Lep1/r;->y:Lcom/whoop/design/util/TextResource;

    iput p3, p0, Lep1/r;->z:I

    iput-object p4, p0, Lep1/r;->E:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Lep1/r;->F:Lc93/a;

    iput-object p6, p0, Lep1/r;->G:Lc93/a;

    iput p7, p0, Lep1/r;->H:I

    iput p8, p0, Lep1/r;->I:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lep1/r;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-object v1, p0, Lep1/r;->x:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lep1/r;->y:Lcom/whoop/design/util/TextResource;

    iget v3, p0, Lep1/r;->z:I

    iget-object v4, p0, Lep1/r;->E:Lcom/whoop/design/util/TextResource;

    iget-object v5, p0, Lep1/r;->F:Lc93/a;

    iget-object v6, p0, Lep1/r;->G:Lc93/a;

    iget v7, p0, Lep1/r;->H:I

    iget v8, p0, Lep1/r;->I:I

    invoke-static/range {v1 .. v10}, Ljp1/q;->c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v0, p0, Lep1/r;->x:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lep1/r;->y:Lcom/whoop/design/util/TextResource;

    iget v2, p0, Lep1/r;->z:I

    iget-object v3, p0, Lep1/r;->E:Lcom/whoop/design/util/TextResource;

    iget-object v4, p0, Lep1/r;->F:Lc93/a;

    iget-object v5, p0, Lep1/r;->G:Lc93/a;

    iget v6, p0, Lep1/r;->H:I

    iget v7, p0, Lep1/r;->I:I

    invoke-static/range {v0 .. v9}, Lep1/s;->a(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
