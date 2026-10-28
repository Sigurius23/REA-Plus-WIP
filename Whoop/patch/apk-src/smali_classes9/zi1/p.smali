.class public final synthetic Lzi1/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lyi1/i;

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(Lyi1/i;II)V
    .locals 0

    iput p3, p0, Lzi1/p;->w:I

    iput-object p1, p0, Lzi1/p;->x:Lyi1/i;

    iput p2, p0, Lzi1/p;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lzi1/p;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lzi1/p;->x:Lyi1/i;

    iget v1, p0, Lzi1/p;->y:I

    invoke-static {v0, v1, p1, p2}, Lzi1/q;->h(Lyi1/i;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lzi1/p;->x:Lyi1/i;

    iget v1, p0, Lzi1/p;->y:I

    invoke-static {v0, v1, p1, p2}, Lzi1/q;->e(Lyi1/i;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
