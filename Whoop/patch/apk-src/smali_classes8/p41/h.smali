.class public final synthetic Lp41/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp41/j;

.field public final synthetic y:Lp1/c1;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lp41/j;Lp1/c1;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p4, p0, Lp41/h;->w:I

    iput-object p1, p0, Lp41/h;->x:Lp41/j;

    iput-object p2, p0, Lp41/h;->y:Lp1/c1;

    iput-object p3, p0, Lp41/h;->z:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lp41/h;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lp41/h;->x:Lp41/j;

    iget-object v1, p0, Lp41/h;->y:Lp1/c1;

    iget-object v2, p0, Lp41/h;->z:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2, p1, p2}, Lp41/i;->a(Lp41/j;Lp1/c1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lp41/h;->x:Lp41/j;

    iget-object v1, p0, Lp41/h;->y:Lp1/c1;

    iget-object v2, p0, Lp41/h;->z:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2, p1, p2}, Lp41/i;->b(Lp41/j;Lp1/c1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
