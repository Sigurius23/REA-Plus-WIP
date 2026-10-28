.class public final synthetic Lbp0/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lbc3/c0;

.field public final synthetic y:Lcp0/t;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lbc3/c0;Lcp0/t;ZI)V
    .locals 0

    iput p4, p0, Lbp0/r;->w:I

    iput-object p1, p0, Lbp0/r;->x:Lbc3/c0;

    iput-object p2, p0, Lbp0/r;->y:Lcp0/t;

    iput-boolean p3, p0, Lbp0/r;->z:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lbp0/r;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbp0/r;->y:Lcp0/t;

    iget-boolean v1, p0, Lbp0/r;->z:Z

    iget-object v2, p0, Lbp0/r;->x:Lbc3/c0;

    invoke-static {v2, v0, v1}, Lbp0/s;->k(Lbc3/c0;Lcp0/t;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lbp0/r;->y:Lcp0/t;

    iget-boolean v1, p0, Lbp0/r;->z:Z

    iget-object v2, p0, Lbp0/r;->x:Lbc3/c0;

    invoke-static {v2, v0, v1}, Lbp0/s;->g(Lbc3/c0;Lcp0/t;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
