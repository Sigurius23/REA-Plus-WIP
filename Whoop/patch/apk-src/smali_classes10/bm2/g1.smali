.class public final synthetic Lbm2/g1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:Ly81/e;

.field public final synthetic z:Lcom/whoop/design/util/TextResource;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;I)V
    .locals 0

    iput p4, p0, Lbm2/g1;->w:I

    iput-object p1, p0, Lbm2/g1;->x:Lcom/whoop/design/util/TextResource;

    iput-object p2, p0, Lbm2/g1;->y:Ly81/e;

    iput-object p3, p0, Lbm2/g1;->z:Lcom/whoop/design/util/TextResource;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lbm2/g1;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbm2/g1;->x:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lbm2/g1;->y:Ly81/e;

    iget-object v2, p0, Lbm2/g1;->z:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v1, v2, p1, p2}, Lbm2/k1;->f(Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lbm2/g1;->x:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lbm2/g1;->y:Ly81/e;

    iget-object v2, p0, Lbm2/g1;->z:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v1, v2, p1, p2}, Lbm2/k1;->d(Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
