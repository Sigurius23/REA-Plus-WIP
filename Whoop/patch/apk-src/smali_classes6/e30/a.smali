.class public final synthetic Le30/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Le30/c;


# direct methods
.method public synthetic constructor <init>(Le30/c;I)V
    .locals 0

    iput p2, p0, Le30/a;->w:I

    iput-object p1, p0, Le30/a;->x:Le30/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Le30/a;->w:I

    iget-object v1, p0, Le30/a;->x:Le30/c;

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, Le30/c;->x:Lk20/a;

    sget-object v1, Ly00/f4;->G:Lt9/c0;

    const-string v1, "us_bank_account"

    invoke-virtual {v0, v1}, Lk20/a;->n(Ljava/lang/String;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    iget-object v0, v1, Le30/c;->L:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv00/c0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lv00/c0;->w:Ly00/c8;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    instance-of v0, v0, Ly00/g6;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-virtual {v1}, Le30/c;->o()Lh20/x2;

    move-result-object v0

    sget-object v1, Lh20/x2;->w:Lh20/x2;

    if-eq v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-virtual {v1}, Le30/c;->n()Lh20/d0;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-virtual {v1}, Le30/c;->l()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
