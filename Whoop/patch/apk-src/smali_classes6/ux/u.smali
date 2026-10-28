.class public final Lux/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lux/w;


# instance fields
.field public final a:Ls40/a;

.field public final b:Lv10/a;


# direct methods
.method public constructor <init>(Ls40/a;Lv10/a;)V
    .locals 1

    const-string v0, "host"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lux/u;->a:Ls40/a;

    iput-object p2, p0, Lux/u;->b:Lv10/a;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Lyx/b;

    iget-object v2, v0, Lux/u;->a:Ls40/a;

    iget-object v14, v2, Ls40/a;->b:Ljava/lang/Integer;

    iget-object v4, v1, Lyx/b;->w:Ljava/lang/String;

    iget v5, v1, Lyx/b;->x:I

    iget-object v6, v1, Lyx/b;->y:Ljava/lang/String;

    iget-object v7, v1, Lyx/b;->z:Ljava/lang/String;

    iget-object v8, v1, Lyx/b;->E:Ljava/lang/String;

    iget-boolean v9, v1, Lyx/b;->F:Z

    iget-object v10, v1, Lyx/b;->G:Lm30/g;

    iget-object v11, v1, Lyx/b;->H:Ljava/lang/String;

    iget-boolean v12, v1, Lyx/b;->I:Z

    iget-boolean v13, v1, Lyx/b;->J:Z

    iget-object v15, v1, Lyx/b;->L:Ljava/lang/String;

    iget-boolean v3, v1, Lyx/b;->M:Z

    move/from16 v16, v3

    iget-object v3, v1, Lyx/b;->N:Ljava/lang/String;

    move-object/from16 v17, v3

    iget-boolean v3, v1, Lyx/b;->O:Z

    move/from16 v18, v3

    const-string v3, "objectId"

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "clientSecret"

    invoke-static {v6, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "url"

    invoke-static {v7, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "publishableKey"

    invoke-static {v15, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lyx/b;

    invoke-direct/range {v3 .. v18}, Lyx/b;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLm30/g;Ljava/lang/String;ZZLjava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;Z)V

    new-instance v4, Ll83/k;

    const-string v5, "extra_args"

    invoke-direct {v4, v5, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v4}, [Ll83/k;

    move-result-object v3

    invoke-static {v3}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object v3

    iget-object v4, v1, Lyx/b;->E:Ljava/lang/String;

    iget-object v5, v0, Lux/u;->b:Lv10/a;

    invoke-virtual {v5}, Lv10/a;->a()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    iget-boolean v4, v1, Lyx/b;->M:Z

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    const-class v4, Lcom/stripe/android/view/PaymentAuthWebViewActivity;

    goto :goto_1

    :cond_1
    :goto_0
    const-class v4, Lcom/stripe/android/payments/StripeBrowserLauncherActivity;

    :goto_1
    iget v1, v1, Lyx/b;->x:I

    invoke-virtual {v2, v4, v3, v1}, Ls40/a;->a(Ljava/lang/Class;Landroid/os/Bundle;I)V

    return-void
.end method
