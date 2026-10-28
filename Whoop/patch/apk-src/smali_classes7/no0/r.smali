.class public final synthetic Lno0/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Lno0/r;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lno0/r;->y:Ljava/lang/String;

    iput-object p2, p0, Lno0/r;->x:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;I)V
    .locals 0

    .line 2
    iput p3, p0, Lno0/r;->w:I

    iput-object p1, p0, Lno0/r;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lno0/r;->y:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lno0/r;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lno0/r;->y:Ljava/lang/String;

    iget-object v1, p0, Lno0/r;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lno0/l0;->s(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lno0/r;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lno0/r;->y:Ljava/lang/String;

    invoke-static {v1, v0}, Lno0/w;->k(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lno0/r;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lno0/r;->y:Ljava/lang/String;

    invoke-static {v1, v0}, Lno0/s;->e(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
