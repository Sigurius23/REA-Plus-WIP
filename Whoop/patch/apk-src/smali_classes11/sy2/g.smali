.class public final synthetic Lsy2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lg2/i;


# direct methods
.method public synthetic constructor <init>(Lg2/i;I)V
    .locals 0

    iput p2, p0, Lsy2/g;->w:I

    iput-object p1, p0, Lsy2/g;->x:Lg2/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lsy2/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsy2/g;->x:Lg2/i;

    invoke-static {v0}, Lsy2/p;->c(Lg2/i;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lsy2/g;->x:Lg2/i;

    invoke-static {v0}, Lsy2/m;->a(Lg2/i;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lsy2/g;->x:Lg2/i;

    invoke-static {v0}, Lsy2/k;->f(Lg2/i;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
