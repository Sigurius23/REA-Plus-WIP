.class public final synthetic Ll80/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/t2;


# direct methods
.method public synthetic constructor <init>(Lp1/t2;I)V
    .locals 0

    iput p2, p0, Ll80/e;->w:I

    iput-object p1, p0, Ll80/e;->x:Lp1/t2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ll80/e;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll80/e;->x:Lp1/t2;

    invoke-static {v0, p1, p2}, Ll80/n;->D(Lp1/t2;Landroidx/compose/runtime/Composer;I)Lg80/f;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ll80/e;->x:Lp1/t2;

    invoke-static {v0, p1, p2}, Ll80/n;->t(Lp1/t2;Landroidx/compose/runtime/Composer;I)Lg80/f;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Ll80/e;->x:Lp1/t2;

    invoke-static {v0, p1, p2}, Ll80/n;->d(Lp1/t2;Landroidx/compose/runtime/Composer;I)Lg80/f;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Ll80/e;->x:Lp1/t2;

    invoke-static {v0, p1, p2}, Ll80/n;->y(Lp1/t2;Landroidx/compose/runtime/Composer;I)Lg80/f;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
