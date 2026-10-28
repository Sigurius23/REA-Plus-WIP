.class public final Lch3/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxg3/f;
.implements Lbh3/h;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lch3/d0;->w:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p0, p0, Lch3/d0;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lxg3/g;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lch3/d0;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lch3/d0;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lch3/d0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lxg3/s;

    new-instance v0, Lch3/o0;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lch3/o0;-><init>(Lxg3/s;Z)V

    new-instance v1, Lch3/p0;

    invoke-direct {v1, v0, v0}, Lch3/p0;-><init>(Lch3/o0;Lch3/o0;)V

    new-instance v2, Lch3/p0;

    const/4 v3, 0x2

    invoke-direct {v2, v1, v3}, Lch3/p0;-><init>(Lxg3/s;I)V

    invoke-virtual {v0, v1}, Lxg3/s;->c(Lxg3/t;)V

    invoke-virtual {v0, v2}, Lxg3/s;->c(Lxg3/t;)V

    invoke-virtual {p1, v0}, Lxg3/s;->c(Lxg3/t;)V

    iget-object p1, p0, Lch3/d0;->x:Ljava/lang/Object;

    check-cast p1, Lxg3/g;

    invoke-virtual {p1, v2}, Lxg3/g;->W(Lxg3/s;)Lxg3/t;

    return-object v1

    :pswitch_0
    check-cast p1, Lxg3/s;

    new-instance v0, Lch3/x;

    invoke-direct {v0, p0, p1, p1}, Lch3/x;-><init>(Lch3/d0;Lxg3/s;Lxg3/s;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-eq p1, p2, :cond_1

    if-eqz p1, :cond_0

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
