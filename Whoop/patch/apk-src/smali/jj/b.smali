.class public final Ljj/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lij/b;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x2

    iput v0, p0, Ljj/b;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object v0

    .line 4
    sget-object v1, Lbc3/q0;->a:Lkc3/e;

    .line 5
    invoke-static {v0, v1}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object v0

    .line 6
    new-instance v1, Lbc3/b0;

    const-string v2, "isElementVisible"

    invoke-direct {v1, v2}, Lbc3/b0;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v0

    iput-object v0, p0, Ljj/b;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/amplitude/android/engagement/a;I)V
    .locals 0

    .line 1
    iput p2, p0, Ljj/b;->a:I

    iput-object p1, p0, Ljj/b;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lb3/t0;)Ljava/lang/String;
    .locals 6

    iget v0, p0, Ljj/b;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "msgId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lkotlinx/serialization/json/JsonObject;->isEmpty()Z

    move-result p1

    const/4 v4, 0x0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "selector"

    invoke-virtual {p2, p1}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/json/JsonElement;

    if-eqz p1, :cond_3

    invoke-static {p1}, Lad3/m;->j(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p1

    invoke-static {p1}, Lad3/m;->f(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    sget-object p1, Lhj/u;->w:Lhj/u;

    invoke-virtual {p1}, Lhj/u;->a()Landroid/app/Activity;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    iget-object p1, p0, Ljj/b;->b:Ljava/lang/Object;

    check-cast p1, Lhc3/d;

    new-instance v0, Lg20/p;

    const/16 v5, 0x15

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p2, 0x3

    invoke-static {p1, v4, v4, v0, p2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_3
    :goto_0
    return-object v4

    :pswitch_0
    move-object v3, p3

    const-string p3, "msgId"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Showing debug toolbar with args: "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/crypto/tink/internal/l0;->a0([Ljava/lang/Object;)V

    sget-object p1, Lhj/u;->w:Lhj/u;

    invoke-virtual {p1}, Lhj/u;->a()Landroid/app/Activity;

    move-result-object p1

    if-nez p1, :cond_4

    new-instance p1, Lij/g;

    const-string p2, "No active activity to show debug toolbar"

    invoke-direct {p1, p2}, Lij/g;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Lb3/t0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, ""

    goto :goto_2

    :cond_4
    :try_start_0
    new-instance p2, Lio/sentry/c7;

    const/16 p3, 0x10

    invoke-direct {p2, p0, p3}, Lio/sentry/c7;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    new-instance p1, Lij/h;

    const-string p2, "true"

    invoke-direct {p1, p2}, Lij/h;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Lb3/t0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    move-object p1, v0

    sget-object p2, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    const-string p3, "Error showing debug toolbar"

    filled-new-array {p3, p1}, [Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/google/crypto/tink/internal/l0;->K([Ljava/lang/Object;)V

    new-instance p2, Lij/g;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Failed to show debug toolbar: "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1, p3}, Lb9/y;->k(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lij/g;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p2}, Lb3/t0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    const/4 p1, 0x0

    :goto_2
    return-object p1

    :pswitch_1
    move-object v3, p3

    const-string p3, "msgId"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Hiding debug toolbar with args: "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/crypto/tink/internal/l0;->a0([Ljava/lang/Object;)V

    sget-object p1, Lhj/u;->w:Lhj/u;

    invoke-virtual {p1}, Lhj/u;->a()Landroid/app/Activity;

    move-result-object p1

    if-nez p1, :cond_5

    new-instance p1, Lij/g;

    const-string p2, "No active activity to hide debug toolbar"

    invoke-direct {p1, p2}, Lij/g;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Lb3/t0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, ""

    goto :goto_4

    :cond_5
    :try_start_1
    new-instance p2, Lio/sentry/c7;

    const/16 p3, 0xf

    invoke-direct {p2, p0, p3}, Lio/sentry/c7;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    new-instance p1, Lij/h;

    const-string p2, "true"

    invoke-direct {p1, p2}, Lij/h;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Lb3/t0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    move-exception v0

    move-object p1, v0

    sget-object p2, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    const-string p3, "Error hiding debug toolbar"

    filled-new-array {p3, p1}, [Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/google/crypto/tink/internal/l0;->a0([Ljava/lang/Object;)V

    new-instance p2, Lij/g;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Failed to hide debug toolbar: "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1, p3}, Lb9/y;->k(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lij/g;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p2}, Lb3/t0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_3
    const/4 p1, 0x0

    :goto_4
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
