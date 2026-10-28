.class public final synthetic Le51/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Le51/n;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Le51/n;Ljava/lang/Object;I)V
    .locals 0

    iput p3, p0, Le51/k;->w:I

    iput-object p1, p0, Le51/k;->x:Le51/n;

    iput-object p2, p0, Le51/k;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Le51/k;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Le51/k;->y:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    iget-object v1, p0, Le51/k;->x:Le51/n;

    invoke-static {v1, v0}, Le51/l;->e(Le51/n;Lp1/c1;)I

    move-result v0

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Le51/k;->y:Ljava/lang/Object;

    check-cast v0, Ln0/u;

    iget-object v1, p0, Le51/k;->x:Le51/n;

    invoke-static {v1, v0}, Le51/l$a;->f(Le51/n;Ln0/u;)I

    move-result v0

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
