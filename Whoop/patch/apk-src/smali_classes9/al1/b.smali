.class public final synthetic Lal1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lal1/c;


# direct methods
.method public synthetic constructor <init>(Lal1/c;I)V
    .locals 0

    iput p2, p0, Lal1/b;->w:I

    iput-object p1, p0, Lal1/b;->x:Lal1/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lal1/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lal1/b;->x:Lal1/c;

    invoke-static {v0}, Lzk1/a;->c(Lal1/c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lal1/b;->x:Lal1/c;

    invoke-static {v0}, Lal1/c;->g(Lal1/c;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
