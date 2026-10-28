.class public final synthetic Lbu2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lm91/u;


# direct methods
.method public synthetic constructor <init>(ILm91/u;)V
    .locals 0

    iput p1, p0, Lbu2/f;->w:I

    iput-object p2, p0, Lbu2/f;->x:Lm91/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lbu2/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbu2/f;->x:Lm91/u;

    check-cast v0, Lbu2/h;

    check-cast p1, Ll0/v;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, p1, p2, p3}, Lbu2/j;->c(Lbu2/h;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lbu2/f;->x:Lm91/u;

    check-cast v0, Lbu2/d;

    check-cast p1, Lc0/i0;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, p1, p2, p3}, Lbu2/g;->e(Lbu2/d;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
