.class public final synthetic Lch0/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lch0/j0;->w:I

    iput-object p2, p0, Lch0/j0;->x:Ljava/lang/Object;

    iput-object p3, p0, Lch0/j0;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lch0/j0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lch0/j0;->x:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    iget-object v1, p0, Lch0/j0;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function3;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lch0/i1;->b(Lc93/a;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lch0/j0;->x:Ljava/lang/Object;

    check-cast v0, Lzg0/i;

    iget-object v1, p0, Lch0/j0;->y:Ljava/lang/Object;

    check-cast v1, Lch0/v0;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Landroid/net/Uri;

    invoke-static {v0, v1, p1, p2}, Lch0/c1;->k(Lzg0/i;Lch0/v0;Ljava/lang/String;Landroid/net/Uri;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lch0/j0;->x:Ljava/lang/Object;

    check-cast v0, Lzg0/h;

    iget-object v1, p0, Lch0/j0;->y:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    check-cast p1, Ljava/util/List;

    check-cast p2, Lsl0/q2;

    invoke-static {v0, v1, p1, p2}, Lch0/w0;->b(Lzg0/h;Landroid/content/Context;Ljava/util/List;Lsl0/q2;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lch0/j0;->x:Ljava/lang/Object;

    check-cast v0, Lzg0/i;

    iget-object v1, p0, Lch0/j0;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Landroid/net/Uri;

    invoke-static {v0, v1, p1, p2}, Lch0/m0;->w(Lzg0/i;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroid/net/Uri;)Ll83/a0;

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
