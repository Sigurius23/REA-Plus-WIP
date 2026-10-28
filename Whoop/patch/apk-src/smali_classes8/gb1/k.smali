.class public final synthetic Lgb1/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(IFFF)V
    .locals 0

    iput p1, p0, Lgb1/k;->w:I

    iput p2, p0, Lgb1/k;->x:F

    iput p3, p0, Lgb1/k;->y:F

    iput p4, p0, Lgb1/k;->z:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lgb1/k;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v4, p1

    check-cast v4, Ly2/t0;

    move-object v5, p2

    check-cast v5, Ly2/q0;

    move-object v6, p3

    check-cast v6, Ly3/a;

    iget v1, p0, Lgb1/k;->x:F

    iget v2, p0, Lgb1/k;->y:F

    iget v3, p0, Lgb1/k;->z:F

    invoke-static/range {v1 .. v6}, Lzk2/w;->d(FFFLy2/t0;Ly2/q0;Ly3/a;)Ly2/s0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v3, p1

    check-cast v3, Landroidx/compose/ui/Modifier;

    move-object v4, p2

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget v0, p0, Lgb1/k;->x:F

    iget v1, p0, Lgb1/k;->y:F

    iget v2, p0, Lgb1/k;->z:F

    invoke-static/range {v0 .. v5}, Lgb1/l;->a(FFFLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
