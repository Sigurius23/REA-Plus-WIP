.class public final synthetic Lis0/k;
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

    iput p2, p0, Lis0/k;->w:I

    iput-object p1, p0, Lis0/k;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lis0/k;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lis0/k;->x:Ljava/lang/Object;

    check-cast v0, Lis0/y0;

    invoke-static {v0}, Lis0/x0;->e(Lis0/y0;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lis0/k;->x:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    invoke-static {v0}, Lis0/j0;->v(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lis0/k;->x:Ljava/lang/Object;

    check-cast v0, Lis0/a0;

    invoke-static {v0}, Lis0/p;->i(Lis0/a0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
