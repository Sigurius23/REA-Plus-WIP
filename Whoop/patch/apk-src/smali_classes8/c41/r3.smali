.class public final synthetic Lc41/r3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(ILcom/whoop/design/util/TextResource;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lc41/r3;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lc41/r3;->y:I

    iput-object p2, p0, Lc41/r3;->x:Lcom/whoop/design/util/TextResource;

    iput p3, p0, Lc41/r3;->z:I

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;II)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lc41/r3;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc41/r3;->x:Lcom/whoop/design/util/TextResource;

    iput p2, p0, Lc41/r3;->y:I

    iput p3, p0, Lc41/r3;->z:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lc41/r3;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lc41/r3;->y:I

    iget-object v1, p0, Lc41/r3;->x:Lcom/whoop/design/util/TextResource;

    iget v2, p0, Lc41/r3;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lkz2/c;->e(ILcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget v0, p0, Lc41/r3;->y:I

    iget-object v1, p0, Lc41/r3;->x:Lcom/whoop/design/util/TextResource;

    iget v2, p0, Lc41/r3;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lc41/u3;->g(ILcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
