.class public final La3/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La3/c0;


# direct methods
.method public synthetic constructor <init>(La3/c0;I)V
    .locals 0

    iput p2, p0, La3/b0;->a:I

    iput-object p1, p0, La3/b0;->b:La3/c0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ly2/v;La3/s1;J)Ly2/s0;
    .locals 1

    iget v0, p0, La3/b0;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La3/b0;->b:La3/c0;

    invoke-interface {v0, p1, p2, p3, p4}, La3/c0;->b(Ly2/t0;Ly2/q0;J)Ly2/s0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, La3/b0;->b:La3/c0;

    invoke-interface {v0, p1, p2, p3, p4}, La3/c0;->b(Ly2/t0;Ly2/q0;J)Ly2/s0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
