.class public final synthetic Lhe2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/NumberPicker$OnValueChangeListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lp1/c1;I)V
    .locals 0

    iput p3, p0, Lhe2/b;->a:I

    iput-object p1, p0, Lhe2/b;->b:Ljava/lang/Object;

    iput-object p2, p0, Lhe2/b;->c:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onValueChange(Landroid/widget/NumberPicker;II)V
    .locals 2

    iget v0, p0, Lhe2/b;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhe2/b;->b:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lhe2/b;->c:Lp1/c1;

    invoke-static {v0, v1, p1, p2, p3}, Lx21/d;->e(Lkotlin/jvm/functions/Function1;Lp1/c1;Landroid/widget/NumberPicker;II)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lhe2/b;->b:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/String;

    iget-object v1, p0, Lhe2/b;->c:Lp1/c1;

    invoke-static {v0, v1, p1, p2, p3}, Lot1/d;->d([Ljava/lang/String;Lp1/c1;Landroid/widget/NumberPicker;II)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lhe2/b;->b:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/String;

    iget-object v1, p0, Lhe2/b;->c:Lp1/c1;

    invoke-static {v0, v1, p1, p2, p3}, Lhe2/c;->b([Ljava/lang/String;Lp1/c1;Landroid/widget/NumberPicker;II)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
