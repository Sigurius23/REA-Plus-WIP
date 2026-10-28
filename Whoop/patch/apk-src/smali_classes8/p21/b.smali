.class public final synthetic Lp21/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(FLp21/g;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lp21/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lp21/b;->x:F

    iput-object p2, p0, Lp21/b;->y:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;FI)V
    .locals 0

    .line 2
    iput p3, p0, Lp21/b;->w:I

    iput-object p1, p0, Lp21/b;->y:Ljava/lang/Object;

    iput p2, p0, Lp21/b;->x:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lp21/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lp21/b;->y:Ljava/lang/Object;

    check-cast v0, Lg1/w7;

    check-cast p1, Landroidx/compose/ui/Modifier;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    iget v1, p0, Lp21/b;->x:F

    invoke-static {v0, v1, p1, p2, p3}, Lx31/f;->k(Lg1/w7;FLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lp21/b;->y:Ljava/lang/Object;

    check-cast v0, Ltp1/a;

    check-cast p1, Ll0/s1;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    iget v1, p0, Lp21/b;->x:F

    invoke-static {v0, v1, p1, p2, p3}, Lvp1/h;->b(Ltp1/a;FLl0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lp21/b;->y:Ljava/lang/Object;

    check-cast v0, Lp21/g;

    check-cast p1, Ll0/v;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    iget v1, p0, Lp21/b;->x:F

    invoke-static {v1, v0, p1, p2, p3}, Lp21/e;->b(FLp21/g;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
