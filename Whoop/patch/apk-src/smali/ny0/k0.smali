.class public final synthetic Lny0/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lj91/b;


# direct methods
.method public synthetic constructor <init>(Lj91/b;I)V
    .locals 0

    iput p2, p0, Lny0/k0;->w:I

    iput-object p1, p0, Lny0/k0;->x:Lj91/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lny0/k0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lny0/k0;->x:Lj91/b;

    check-cast p1, Lk2/c;

    invoke-static {v0, p1}, Lny0/l0;->f(Lj91/b;Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lny0/k0;->x:Lj91/b;

    check-cast p1, Lf2/d;

    invoke-static {v0, p1}, Lny0/l0;->c(Lj91/b;Lf2/d;)Lf2/g;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
