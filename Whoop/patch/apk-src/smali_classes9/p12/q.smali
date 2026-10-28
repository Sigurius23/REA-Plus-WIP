.class public final synthetic Lp12/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/m;

.field public final synthetic y:Lp12/e0;


# direct methods
.method public synthetic constructor <init>(Lc93/m;Lp12/e0;I)V
    .locals 0

    iput p3, p0, Lp12/q;->w:I

    iput-object p1, p0, Lp12/q;->x:Lc93/m;

    iput-object p2, p0, Lp12/q;->y:Lp12/e0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lp12/q;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lp12/q;->x:Lc93/m;

    iget-object v1, p0, Lp12/q;->y:Lp12/e0;

    invoke-static {v0, v1}, Lp12/x;->j(Lc93/m;Lp12/e0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lp12/q;->x:Lc93/m;

    iget-object v1, p0, Lp12/q;->y:Lp12/e0;

    invoke-static {v0, v1}, Lp12/x;->c(Lc93/m;Lp12/e0;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
