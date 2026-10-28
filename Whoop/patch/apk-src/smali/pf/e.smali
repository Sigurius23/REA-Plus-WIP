.class public final synthetic Lpf/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lvg/l;


# direct methods
.method public synthetic constructor <init>(Lvg/l;I)V
    .locals 0

    iput p2, p0, Lpf/e;->w:I

    iput-object p1, p0, Lpf/e;->x:Lvg/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lpf/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lpf/e;->x:Lvg/l;

    invoke-static {v0}, Ltx/f;->q(Lvg/l;)Ljava/util/LinkedHashSet;

    move-result-object v0

    return-object v0

    :pswitch_0
    sget-object v0, Lbg/l;->c:Lbg/l;

    iget-object v1, p0, Lpf/e;->x:Lvg/l;

    invoke-static {v1, v0}, Ltx/f;->s(Lvg/l;Lbg/l;)Lpf/q;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-static {v1, v0}, Ltx/f;->r(Lvg/l;Lbg/l;)Lpf/q;

    move-result-object v2

    :cond_0
    return-object v2

    :pswitch_1
    sget-object v0, Lbg/l;->d:Lbg/l;

    iget-object v1, p0, Lpf/e;->x:Lvg/l;

    invoke-static {v1, v0}, Ltx/f;->s(Lvg/l;Lbg/l;)Lpf/q;

    move-result-object v2

    if-nez v2, :cond_1

    invoke-static {v1, v0}, Ltx/f;->r(Lvg/l;Lbg/l;)Lpf/q;

    move-result-object v2

    :cond_1
    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
