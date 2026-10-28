.class public final synthetic Lbp0/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lbp0/t;->w:I

    iput-object p1, p0, Lbp0/t;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lbp0/t;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbp0/t;->x:Ljava/lang/Object;

    check-cast v0, Ldp0/g;

    invoke-static {v0}, Lbp0/s$e;->f(Ldp0/g;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lbp0/t;->x:Ljava/lang/Object;

    check-cast v0, Lcp0/t;

    invoke-static {v0}, Lbp0/s$b;->f(Lcp0/t;)Lcp0/l;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
