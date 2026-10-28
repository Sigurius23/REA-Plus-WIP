.class public final synthetic Lxq2/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/a1;


# direct methods
.method public synthetic constructor <init>(Lp1/a1;I)V
    .locals 0

    iput p2, p0, Lxq2/b1;->w:I

    iput-object p1, p0, Lxq2/b1;->x:Lp1/a1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lxq2/b1;->w:I

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lxq2/b1;->x:Lp1/a1;

    invoke-static {v0, p1}, Lxq2/c1;->t(Lp1/a1;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lxq2/b1;->x:Lp1/a1;

    invoke-static {v0, p1}, Lxq2/c1;->i(Lp1/a1;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
