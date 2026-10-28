.class public final synthetic Lwr0/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lm91/u;


# direct methods
.method public synthetic constructor <init>(ILm91/u;)V
    .locals 0

    iput p1, p0, Lwr0/q;->w:I

    iput-object p2, p0, Lwr0/q;->x:Lm91/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lwr0/q;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lwr0/q;->x:Lm91/u;

    check-cast v0, Lwr0/e0;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lwr0/d0;->d(Lwr0/e0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lwr0/q;->x:Lm91/u;

    check-cast v0, Lwr0/t;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lwr0/s;->c(Lwr0/t;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
