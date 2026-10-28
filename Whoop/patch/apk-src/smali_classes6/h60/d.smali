.class public final synthetic Lh60/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lf60/c$a;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lf60/c$a;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p3, p0, Lh60/d;->w:I

    iput-object p1, p0, Lh60/d;->x:Lf60/c$a;

    iput-object p2, p0, Lh60/d;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lh60/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lh60/d;->x:Lf60/c$a;

    iget-object v1, p0, Lh60/d;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lh60/e;->e(Lf60/c$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lh60/d;->x:Lf60/c$a;

    iget-object v1, p0, Lh60/d;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lh60/e;->c(Lf60/c$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lh60/d;->x:Lf60/c$a;

    iget-object v1, p0, Lh60/d;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lh60/e;->f(Lf60/c$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
