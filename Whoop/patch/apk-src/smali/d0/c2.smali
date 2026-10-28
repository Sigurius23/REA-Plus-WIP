.class public final Ld0/c2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/h0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ld0/z1;


# direct methods
.method public synthetic constructor <init>(Ld0/z1;I)V
    .locals 0

    iput p2, p0, Ld0/c2;->a:I

    iput-object p1, p0, Ld0/c2;->b:Ld0/z1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final dispose()V
    .locals 1

    iget v0, p0, Ld0/c2;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ld0/c2;->b:Ld0/z1;

    invoke-virtual {v0}, Ld0/z1;->i()V

    iget-object v0, v0, Ld0/z1;->a:Lal/a;

    invoke-virtual {v0}, Lal/a;->D0()V

    return-void

    :pswitch_0
    iget-object v0, p0, Ld0/c2;->b:Ld0/z1;

    invoke-virtual {v0}, Ld0/z1;->i()V

    iget-object v0, v0, Ld0/z1;->a:Lal/a;

    invoke-virtual {v0}, Lal/a;->D0()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
