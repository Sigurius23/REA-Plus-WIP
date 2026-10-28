.class public final synthetic Lyl2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lyl2/k;


# direct methods
.method public synthetic constructor <init>(Lyl2/k;I)V
    .locals 0

    iput p2, p0, Lyl2/j;->w:I

    iput-object p1, p0, Lyl2/j;->x:Lyl2/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lyl2/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lyl2/j;->x:Lyl2/k;

    invoke-static {v0}, Lyl2/k;->h(Lyl2/k;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lyl2/j;->x:Lyl2/k;

    invoke-static {v0}, Lyl2/k;->i(Lyl2/k;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lyl2/j;->x:Lyl2/k;

    invoke-static {v0}, Lyl2/k;->c(Lyl2/k;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
