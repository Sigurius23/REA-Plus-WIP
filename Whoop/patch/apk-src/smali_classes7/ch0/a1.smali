.class public final synthetic Lch0/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lch0/v0;


# direct methods
.method public synthetic constructor <init>(Lch0/v0;I)V
    .locals 0

    iput p2, p0, Lch0/a1;->w:I

    iput-object p1, p0, Lch0/a1;->x:Lch0/v0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lch0/a1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lch0/a1;->x:Lch0/v0;

    invoke-static {v0}, Lch0/c1;->h(Lch0/v0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lch0/a1;->x:Lch0/v0;

    invoke-static {v0}, Lch0/c1;->l(Lch0/v0;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
