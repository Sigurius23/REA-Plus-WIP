.class public final synthetic La6/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:La6/i0;


# direct methods
.method public synthetic constructor <init>(La6/i0;I)V
    .locals 0

    iput p2, p0, La6/h;->w:I

    iput-object p1, p0, La6/h;->x:La6/i0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, La6/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La6/h;->x:La6/i0;

    iget-object v0, v0, La6/i0;->i:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La6/g1;

    invoke-interface {v0}, La6/g1;->e()La6/d1;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, La6/h;->x:La6/i0;

    iget-object v0, v0, La6/i0;->a:La6/f1;

    invoke-interface {v0}, La6/f1;->a()La6/g1;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
