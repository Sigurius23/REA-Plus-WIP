.class public final Lcx/i;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcx/j;

.field public final synthetic y:Ljava/lang/Boolean;


# direct methods
.method public synthetic constructor <init>(Lcx/j;Ljava/lang/Boolean;I)V
    .locals 0

    iput p3, p0, Lcx/i;->w:I

    iput-object p1, p0, Lcx/i;->x:Lcx/j;

    iput-object p2, p0, Lcx/i;->y:Ljava/lang/Boolean;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lcx/i;->w:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "$granted"

    iget-object v1, p0, Lcx/i;->y:Ljava/lang/Boolean;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iget-object v1, p0, Lcx/i;->x:Lcx/j;

    invoke-virtual {v1}, Lcx/j;->y()Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Lcx/f;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v1, v3}, Lcx/f;-><init>(ZLcx/j;I)V

    invoke-virtual {v1, v2}, Lcx/j;->A(Lc93/a;)V

    :cond_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    const-string v0, "$granted"

    iget-object v1, p0, Lcx/i;->y:Ljava/lang/Boolean;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iget-object v1, p0, Lcx/i;->x:Lcx/j;

    invoke-virtual {v1}, Lcx/j;->y()Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v2, Lcx/f;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v1, v3}, Lcx/f;-><init>(ZLcx/j;I)V

    invoke-virtual {v1, v2}, Lcx/j;->A(Lc93/a;)V

    :cond_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
