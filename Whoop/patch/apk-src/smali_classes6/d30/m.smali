.class public final synthetic Ld30/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ld30/u;


# direct methods
.method public synthetic constructor <init>(Ld30/u;I)V
    .locals 0

    iput p2, p0, Ld30/m;->w:I

    iput-object p1, p0, Ld30/m;->x:Ld30/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Ld30/m;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ld30/m;->x:Ld30/u;

    sget-object v1, Ld30/t0;->a:Ld30/t0;

    invoke-virtual {v0, v1}, Ld30/u;->b(Ld30/z0;)V

    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ld30/m;->x:Ld30/u;

    sget-object v1, Ld30/x0;->a:Ld30/x0;

    invoke-virtual {v0, v1}, Ld30/u;->b(Ld30/z0;)V

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Ld30/m;->x:Ld30/u;

    iget-object v0, v0, Ld30/u;->g:Lb30/h0;

    sget-object v1, Lq20/j;->x:Lq20/j;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1, v2}, Lb30/h0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Ld30/m;->x:Ld30/u;

    iget-object v0, v0, Ld30/u;->g:Lb30/h0;

    new-instance v1, Lq20/m;

    const/4 v2, 0x0

    const/4 v3, 0x7

    invoke-direct {v1, v2, v2, v2, v3}, Lq20/m;-><init>(Lwz/h0;Lwz/u0;Ly00/j0;I)V

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1, v2}, Lb30/h0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
