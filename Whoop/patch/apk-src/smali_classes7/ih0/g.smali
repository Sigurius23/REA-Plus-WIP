.class public final synthetic Lih0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/t2;

.field public final synthetic y:Lp1/t2;


# direct methods
.method public synthetic constructor <init>(Lp1/t2;Lp1/t2;I)V
    .locals 0

    iput p3, p0, Lih0/g;->w:I

    iput-object p1, p0, Lih0/g;->x:Lp1/t2;

    iput-object p2, p0, Lih0/g;->y:Lp1/t2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lih0/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lih0/g;->y:Lp1/t2;

    check-cast p1, Lq3/y;

    iget-object v1, p0, Lih0/g;->x:Lp1/t2;

    invoke-static {v1, v0, p1}, Lih0/l;->f(Lp1/t2;Lp1/t2;Lq3/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lih0/g;->y:Lp1/t2;

    check-cast p1, Lq3/y;

    iget-object v1, p0, Lih0/g;->x:Lp1/t2;

    invoke-static {v1, v0, p1}, Lih0/l;->o(Lp1/t2;Lp1/t2;Lq3/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
