.class public final synthetic La11/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:Lc93/a;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(IILc93/a;Lcom/whoop/design/util/TextResource;)V
    .locals 0

    iput p2, p0, La11/k;->w:I

    iput-object p4, p0, La11/k;->x:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, La11/k;->y:Lc93/a;

    iput p1, p0, La11/k;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, La11/k;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La11/k;->x:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, La11/k;->y:Lc93/a;

    iget v2, p0, La11/k;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lky2/h;->b(Lcom/whoop/design/util/TextResource;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, La11/k;->x:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, La11/k;->y:Lc93/a;

    iget v2, p0, La11/k;->z:I

    invoke-static {v0, v1, v2, p1, p2}, La11/q;->m(Lcom/whoop/design/util/TextResource;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
