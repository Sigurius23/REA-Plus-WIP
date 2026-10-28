.class public final synthetic Lgt1/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lft1/c;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lft1/c;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lgt1/k;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgt1/k;->x:Lft1/c;

    iput-object p2, p0, Lgt1/k;->y:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lft1/c;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lgt1/k;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgt1/k;->y:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lgt1/k;->x:Lft1/c;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lgt1/k;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lgt1/k;->x:Lft1/c;

    iget-object v1, p0, Lgt1/k;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lgt1/l;->k(Lft1/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lgt1/k;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lgt1/k;->x:Lft1/c;

    invoke-static {v1, v0}, Lgt1/l;->i(Lft1/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
