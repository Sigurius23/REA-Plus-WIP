.class public final synthetic Lep1/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lcp1/f;


# direct methods
.method public synthetic constructor <init>(Lcp1/f;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lep1/t;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lep1/t;->y:Lcp1/f;

    iput-object p2, p0, Lep1/t;->x:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lcp1/f;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lep1/t;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lep1/t;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lep1/t;->y:Lcp1/f;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lep1/t;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lep1/t;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lep1/t;->y:Lcp1/f;

    invoke-static {v1, v0}, Lep1/u;->f(Lcp1/f;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lep1/t;->y:Lcp1/f;

    iget-object v1, p0, Lep1/t;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lep1/u;->e(Lcp1/f;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
