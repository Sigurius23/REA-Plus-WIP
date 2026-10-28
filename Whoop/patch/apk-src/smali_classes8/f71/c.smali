.class public final synthetic Lf71/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(IJI)V
    .locals 0

    iput p4, p0, Lf71/c;->w:I

    iput-wide p2, p0, Lf71/c;->x:J

    iput p1, p0, Lf71/c;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lf71/c;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lf71/c;->y:I

    iget-wide v1, p0, Lf71/c;->x:J

    invoke-static {v0, v1, v2, p1, p2}, Lhe1/a;->b(IJLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget v0, p0, Lf71/c;->y:I

    iget-wide v1, p0, Lf71/c;->x:J

    invoke-static {v0, v1, v2, p1, p2}, Lf71/d;->e(IJLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
