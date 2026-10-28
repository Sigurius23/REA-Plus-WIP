.class public final synthetic Llq0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Llq0/g;

.field public final synthetic y:Liq0/g;


# direct methods
.method public synthetic constructor <init>(Llq0/g;Liq0/g;I)V
    .locals 0

    iput p3, p0, Llq0/e;->w:I

    iput-object p1, p0, Llq0/e;->x:Llq0/g;

    iput-object p2, p0, Llq0/e;->y:Liq0/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Llq0/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llq0/e;->y:Liq0/g;

    check-cast p1, Landroid/view/View;

    iget-object v1, p0, Llq0/e;->x:Llq0/g;

    invoke-static {v1, v0, p1}, Llq0/g;->h(Llq0/g;Liq0/g;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Llq0/e;->y:Liq0/g;

    check-cast p1, Landroid/view/View;

    iget-object v1, p0, Llq0/e;->x:Llq0/g;

    invoke-static {v1, v0, p1}, Llq0/g;->e(Llq0/g;Liq0/g;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
