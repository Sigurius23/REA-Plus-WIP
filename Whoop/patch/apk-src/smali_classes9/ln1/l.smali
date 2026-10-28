.class public final synthetic Lln1/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/t2;


# direct methods
.method public synthetic constructor <init>(Lp1/t2;I)V
    .locals 0

    iput p2, p0, Lln1/l;->w:I

    iput-object p1, p0, Lln1/l;->x:Lp1/t2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lln1/l;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lln1/l;->x:Lp1/t2;

    invoke-static {v0}, Lln1/k$j;->f(Lp1/t2;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lln1/l;->x:Lp1/t2;

    invoke-static {v0}, Lln1/k$i;->f(Lp1/t2;)Ljava/util/List;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
