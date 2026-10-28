.class public final synthetic Lwo1/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lcom/whoop/navigation/e;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lwo1/g0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwo1/g0;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lwo1/g0;->y:Lcom/whoop/navigation/e;

    iput-object p3, p0, Lwo1/g0;->z:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lwo1/g0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwo1/g0;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lwo1/g0;->z:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lwo1/g0;->y:Lcom/whoop/navigation/e;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lwo1/g0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lwo1/g0;->y:Lcom/whoop/navigation/e;

    iget-object v1, p0, Lwo1/g0;->z:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lwo1/g0;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v2, v1}, Lwo1/p0;->b(Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lwo1/g0;->z:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lwo1/g0;->y:Lcom/whoop/navigation/e;

    iget-object v2, p0, Lwo1/g0;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v2, v0}, Lwo1/h0;->b(Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
