.class public final synthetic Lhk0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lhk0/j;


# direct methods
.method public synthetic constructor <init>(Lhk0/j;I)V
    .locals 0

    iput p2, p0, Lhk0/i;->w:I

    iput-object p1, p0, Lhk0/i;->x:Lhk0/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lhk0/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhk0/i;->x:Lhk0/j;

    invoke-static {v0}, Lhk0/j;->f0(Lhk0/j;)Loh2/e;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lhk0/i;->x:Lhk0/j;

    invoke-static {v0}, Lhk0/j;->e0(Lhk0/j;)Loh2/c;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
