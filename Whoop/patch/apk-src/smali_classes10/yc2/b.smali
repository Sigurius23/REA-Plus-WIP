.class public final synthetic Lyc2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lxc2/d;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lxc2/d;Lkotlin/jvm/functions/Function1;Lc93/a;I)V
    .locals 0

    iput p4, p0, Lyc2/b;->w:I

    iput-object p1, p0, Lyc2/b;->x:Lxc2/d;

    iput-object p2, p0, Lyc2/b;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lyc2/b;->z:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lyc2/b;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lyc2/b;->x:Lxc2/d;

    iget-object v1, p0, Lyc2/b;->y:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lyc2/b;->z:Lc93/a;

    invoke-static {v0, v1, v2, p1, p2}, Lyc2/c;->k(Lxc2/d;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lyc2/b;->x:Lxc2/d;

    iget-object v1, p0, Lyc2/b;->y:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lyc2/b;->z:Lc93/a;

    invoke-static {v0, v1, v2, p1, p2}, Lyc2/c;->j(Lxc2/d;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
