.class public final synthetic Lis0/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(FLjava/lang/Object;I)V
    .locals 0

    iput p3, p0, Lis0/m;->w:I

    iput p1, p0, Lis0/m;->x:F

    iput-object p2, p0, Lis0/m;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lis0/m;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lis0/m;->y:Ljava/lang/Object;

    check-cast v0, Lp21/g;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, Lis0/m;->x:F

    invoke-static {v1, v0, p1, p2}, Lp21/e;->a(FLp21/g;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lis0/m;->y:Ljava/lang/Object;

    check-cast v0, Lis0/s0;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, Lis0/m;->x:F

    invoke-static {v1, v0, p1, p2}, Lis0/p;->c(FLis0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
