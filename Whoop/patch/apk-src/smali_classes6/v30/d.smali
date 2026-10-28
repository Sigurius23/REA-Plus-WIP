.class public final synthetic Lv30/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lv30/e;


# direct methods
.method public synthetic constructor <init>(Lv30/e;I)V
    .locals 0

    iput p2, p0, Lv30/d;->w:I

    iput-object p1, p0, Lv30/d;->x:Lv30/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lv30/d;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lj/l;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lv30/d;->x:Lv30/e;

    iget-object v0, p1, Lv30/e;->e:Lec3/h2;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object p1, p1, Lv30/e;->b:Lv30/b;

    invoke-interface {p1}, Lv30/b;->e()V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lv30/d;->x:Lv30/e;

    iget-object v1, v0, Lv30/e;->e:Lec3/h2;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, v0, Lv30/e;->b:Lv30/b;

    invoke-interface {v0, p1}, Lv30/b;->c(Ljava/lang/Throwable;)V

    goto :goto_0

    :pswitch_1
    check-cast p1, Lj/l;

    const-string v0, "intentSenderRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lv30/d;->x:Lv30/e;

    iget-object v1, v0, Lv30/e;->b:Lv30/b;

    invoke-interface {v1}, Lv30/b;->b()V

    iget-object v1, v0, Lv30/e;->g:Lh/i;

    if-eqz v1, :cond_0

    iget-object v0, v0, Lv30/e;->a:Landroidx/core/app/ActivityOptionsCompat;

    invoke-virtual {v1, p1, v0}, Lh/i;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    goto :goto_0

    :cond_0
    const-string p1, "activityLauncher"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lv30/d;->x:Lv30/e;

    iget-object v0, v0, Lv30/e;->b:Lv30/b;

    invoke-interface {v0, p1}, Lv30/b;->d(Ljava/lang/Throwable;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
