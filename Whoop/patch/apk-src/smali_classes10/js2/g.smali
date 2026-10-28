.class public final synthetic Ljs2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;I)V
    .locals 0

    iput p2, p0, Ljs2/g;->w:I

    iput-object p1, p0, Ljs2/g;->x:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ljs2/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ljs2/g;->x:Landroid/view/View;

    check-cast p1, Lp1/i0;

    invoke-static {v0, p1}, Lst1/l;->h(Landroid/view/View;Lp1/i0;)Lp1/h0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ljs2/g;->x:Landroid/view/View;

    check-cast p1, Lp1/i0;

    invoke-static {v0, p1}, Lpj2/t;->d(Landroid/view/View;Lp1/i0;)Lp1/h0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Ljs2/g;->x:Landroid/view/View;

    check-cast p1, Lp1/i0;

    invoke-static {v0, p1}, Ljs2/i;->d(Landroid/view/View;Lp1/i0;)Lp1/h0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
