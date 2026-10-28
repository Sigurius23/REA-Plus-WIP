.class public final synthetic Lp92/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp92/h;


# direct methods
.method public synthetic constructor <init>(Lp92/h;I)V
    .locals 0

    iput p2, p0, Lp92/g;->w:I

    iput-object p1, p0, Lp92/g;->x:Lp92/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lp92/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lp92/g;->x:Lp92/h;

    check-cast p1, Landroid/location/Location;

    invoke-static {v0, p1}, Lp92/h;->e(Lp92/h;Landroid/location/Location;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lp92/g;->x:Lp92/h;

    check-cast p1, Lsj0/a;

    invoke-static {v0, p1}, Lp92/h;->f(Lp92/h;Lsj0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
