.class public final Lch3/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxg3/o;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lch3/s;->w:I

    iput-object p1, p0, Lch3/s;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lxg3/g;)Lch3/s;
    .locals 2

    new-instance v0, Lch3/s;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lch3/s;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lch3/s;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lxg3/r;

    new-instance v0, Lch3/y0;

    invoke-direct {v0, p1}, Lch3/y0;-><init>(Lxg3/r;)V

    invoke-virtual {p1, v0}, Lxg3/r;->c(Lxg3/t;)V

    iget-object p1, p0, Lch3/s;->x:Ljava/lang/Object;

    check-cast p1, Lch3/n;

    invoke-virtual {p1, v0}, Lch3/n;->b(Ljava/lang/Object;)V

    return-void

    :pswitch_0
    check-cast p1, Lxg3/r;

    :try_start_0
    iget-object v0, p0, Lch3/s;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/i0;

    iget-object v0, v0, Lio/sentry/i0;->x:Ljava/lang/Object;

    check-cast v0, Lu92/e;

    invoke-virtual {v0}, Lu92/e;->c()Ljava/util/List;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1, v0}, Lxg3/r;->e(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Ldt/b;->V(Ljava/lang/Throwable;)V

    invoke-virtual {p1, v0}, Lxg3/r;->d(Ljava/lang/Throwable;)V

    :goto_0
    return-void

    :pswitch_1
    check-cast p1, Lxg3/r;

    new-instance v0, Lch3/r;

    invoke-direct {v0, p1}, Lch3/r;-><init>(Lxg3/r;)V

    invoke-virtual {p1, v0}, Lxg3/r;->c(Lxg3/t;)V

    iget-object p1, p0, Lch3/s;->x:Ljava/lang/Object;

    check-cast p1, Lxg3/g;

    invoke-virtual {p1, v0}, Lxg3/g;->W(Lxg3/s;)Lxg3/t;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
