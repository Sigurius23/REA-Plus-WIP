.class public final synthetic Lp1/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/q;


# direct methods
.method public synthetic constructor <init>(Lp1/q;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lp1/m;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/m;->x:Lp1/q;

    return-void
.end method

.method public synthetic constructor <init>(Lp1/q;Lp1/y0;)V
    .locals 0

    .line 2
    const/4 p2, 0x0

    iput p2, p0, Lp1/m;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/m;->x:Lp1/q;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lp1/m;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lp1/m;->x:Lp1/q;

    invoke-virtual {v0}, Lp1/q;->n()Ljava/util/List;

    move-result-object v0

    return-object v0

    :pswitch_0
    const/4 v0, 0x0

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
