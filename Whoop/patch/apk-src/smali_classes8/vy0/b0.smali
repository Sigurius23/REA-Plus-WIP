.class public final synthetic Lvy0/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lvy0/d0;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lvy0/d0;Lkotlin/jvm/functions/Function1;Lp1/c1;I)V
    .locals 0

    iput p4, p0, Lvy0/b0;->w:I

    iput-object p1, p0, Lvy0/b0;->x:Lvy0/d0;

    iput-object p2, p0, Lvy0/b0;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lvy0/b0;->z:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lvy0/b0;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lvy0/b0;->x:Lvy0/d0;

    iget-object v1, p0, Lvy0/b0;->y:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lvy0/b0;->z:Lp1/c1;

    invoke-static {v0, v1, v2, p1, p2}, Lzq0/x;->g(Lvy0/d0;Lkotlin/jvm/functions/Function1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lvy0/b0;->x:Lvy0/d0;

    iget-object v1, p0, Lvy0/b0;->y:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lvy0/b0;->z:Lp1/c1;

    invoke-static {v0, v1, v2, p1, p2}, Lvy0/c0;->f(Lvy0/d0;Lkotlin/jvm/functions/Function1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
