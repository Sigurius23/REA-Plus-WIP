.class public final synthetic Lhj/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/amplitude/android/engagement/a;


# direct methods
.method public synthetic constructor <init>(Lcom/amplitude/android/engagement/a;I)V
    .locals 0

    iput p2, p0, Lhj/d;->w:I

    iput-object p1, p0, Lhj/d;->x:Lcom/amplitude/android/engagement/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget v0, p0, Lhj/d;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lhj/u;->w:Lhj/u;

    invoke-virtual {v0}, Lhj/u;->a()Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x0

    iget-object v2, p0, Lhj/d;->x:Lcom/amplitude/android/engagement/a;

    invoke-virtual {v2, v0, v1}, Lcom/amplitude/android/engagement/a;->e(Landroid/app/Activity;Z)V

    return-void

    :pswitch_0
    const-string v0, "this$0"

    iget-object v1, p0, Lhj/d;->x:Lcom/amplitude/android/engagement/a;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v1, Lcom/amplitude/android/engagement/a;->f:Ljava/util/LinkedHashMap;

    invoke-static {v0}, Lm83/g0;->j0(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lmj/p;

    :try_start_0
    invoke-virtual {v1}, Lmj/p;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    sget-object v2, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Error cleaning up nudge view manager during cleanup: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1, v3}, Lb9/y;->k(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/google/crypto/tink/internal/l0;->K([Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
