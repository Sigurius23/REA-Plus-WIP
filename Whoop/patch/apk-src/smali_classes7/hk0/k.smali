.class public final synthetic Lhk0/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lhk0/l;


# direct methods
.method public synthetic constructor <init>(Lhk0/l;I)V
    .locals 0

    iput p2, p0, Lhk0/k;->w:I

    iput-object p1, p0, Lhk0/k;->x:Lhk0/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lhk0/k;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhk0/k;->x:Lhk0/l;

    invoke-static {v0}, Lhk0/l;->e0(Lhk0/l;)Loh2/e;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lhk0/k;->x:Lhk0/l;

    invoke-static {v0}, Lhk0/l;->h0(Lhk0/l;)Loh2/b;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lhk0/k;->x:Lhk0/l;

    invoke-static {v0}, Lhk0/l;->f0(Lhk0/l;)Loh2/c;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lhk0/k;->x:Lhk0/l;

    invoke-static {v0}, Lhk0/l;->g0(Lhk0/l;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
