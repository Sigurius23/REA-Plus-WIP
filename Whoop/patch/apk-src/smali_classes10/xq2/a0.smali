.class public final synthetic Lxq2/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lxq2/a0;->w:I

    iput-object p1, p0, Lxq2/a0;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lxq2/a0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lxq2/a0;->x:Ljava/lang/Object;

    check-cast v0, Lb3/x2;

    check-cast p1, Lu0/p0;

    invoke-static {v0, p1}, Lxq2/b0;->b(Lb3/x2;Lu0/p0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lxq2/a0;->x:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, p1}, Lxq2/c1;->b(Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lxq2/a0;->x:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    check-cast p1, Lg2/v;

    invoke-static {v0, p1}, Lxq2/b0;->f(Lp1/c1;Lg2/v;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
