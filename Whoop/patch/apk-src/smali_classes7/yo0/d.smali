.class public final synthetic Lyo0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lyo0/f;

.field public final synthetic y:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lyo0/f;Lc93/a;I)V
    .locals 0

    iput p3, p0, Lyo0/d;->w:I

    iput-object p1, p0, Lyo0/d;->x:Lyo0/f;

    iput-object p2, p0, Lyo0/d;->y:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lyo0/d;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ll0/v;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    iget-object v0, p0, Lyo0/d;->x:Lyo0/f;

    iget-object v1, p0, Lyo0/d;->y:Lc93/a;

    invoke-static {v0, v1, p1, p2, p3}, Lyo0/e;->o(Lyo0/f;Lc93/a;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lc0/i0;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    iget-object v0, p0, Lyo0/d;->x:Lyo0/f;

    iget-object v1, p0, Lyo0/d;->y:Lc93/a;

    invoke-static {v0, v1, p1, p2, p3}, Lyo0/e;->m(Lyo0/f;Lc93/a;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
