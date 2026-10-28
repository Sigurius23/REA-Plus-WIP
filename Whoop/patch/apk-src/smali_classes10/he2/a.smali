.class public final synthetic Lhe2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:[Ljava/lang/String;

.field public final synthetic y:Lp1/c1;


# direct methods
.method public synthetic constructor <init>([Ljava/lang/String;Lp1/c1;I)V
    .locals 0

    iput p3, p0, Lhe2/a;->w:I

    iput-object p1, p0, Lhe2/a;->x:[Ljava/lang/String;

    iput-object p2, p0, Lhe2/a;->y:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lhe2/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhe2/a;->y:Lp1/c1;

    check-cast p1, Landroid/content/Context;

    iget-object v1, p0, Lhe2/a;->x:[Ljava/lang/String;

    invoke-static {v1, v0, p1}, Lot1/d;->c([Ljava/lang/String;Lp1/c1;Landroid/content/Context;)Landroid/widget/NumberPicker;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lhe2/a;->y:Lp1/c1;

    check-cast p1, Landroid/content/Context;

    iget-object v1, p0, Lhe2/a;->x:[Ljava/lang/String;

    invoke-static {v1, v0, p1}, Lhe2/c;->a([Ljava/lang/String;Lp1/c1;Landroid/content/Context;)Landroid/widget/NumberPicker;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
