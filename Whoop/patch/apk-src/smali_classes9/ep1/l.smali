.class public final synthetic Lep1/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lcp1/k;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lcp1/k;I)V
    .locals 0

    iput p3, p0, Lep1/l;->w:I

    iput-object p1, p0, Lep1/l;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lep1/l;->y:Lcp1/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lep1/l;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lep1/l;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lep1/l;->y:Lcp1/k;

    invoke-static {v0, v1}, Lep1/m;->d(Lkotlin/jvm/functions/Function1;Lcp1/k;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lep1/l;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lep1/l;->y:Lcp1/k;

    invoke-static {v0, v1}, Lep1/m;->i(Lkotlin/jvm/functions/Function1;Lcp1/k;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lep1/l;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lep1/l;->y:Lcp1/k;

    invoke-static {v0, v1}, Lep1/m;->m(Lkotlin/jvm/functions/Function1;Lcp1/k;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
