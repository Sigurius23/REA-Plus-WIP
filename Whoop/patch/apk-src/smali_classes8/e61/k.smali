.class public final synthetic Le61/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lj61/c;

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(Lj61/c;II)V
    .locals 0

    iput p3, p0, Le61/k;->w:I

    iput-object p1, p0, Le61/k;->x:Lj61/c;

    iput p2, p0, Le61/k;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Le61/k;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Le61/k;->x:Lj61/c;

    iget v1, p0, Le61/k;->y:I

    invoke-static {v0, v1, p1, p2}, Le61/m;->b(Lj61/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Le61/k;->x:Lj61/c;

    iget v1, p0, Le61/k;->y:I

    invoke-static {v0, v1, p1, p2}, Le61/m;->a(Lj61/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
