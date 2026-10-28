.class public final Lv30/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/core/app/ActivityOptionsCompat;

.field public final b:Lv30/b;

.field public final c:Lv30/k;

.field public d:Z

.field public final e:Lec3/h2;

.field public final f:Lec3/r1;

.field public g:Lh/i;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/core/app/ActivityOptionsCompat;Lv30/b;Lv30/k;)V
    .locals 1

    const-string v0, "paymentCardRecognitionClient"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lv30/e;->a:Landroidx/core/app/ActivityOptionsCompat;

    iput-object p3, p0, Lv30/e;->b:Lv30/b;

    iput-object p4, p0, Lv30/e;->c:Lv30/k;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p2

    iput-object p2, p0, Lv30/e;->e:Lec3/h2;

    invoke-static {p2}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object p2

    iput-object p2, p0, Lv30/e;->f:Lec3/r1;

    new-instance p2, Lv30/d;

    const/4 p3, 0x2

    invoke-direct {p2, p0, p3}, Lv30/d;-><init>(Lv30/e;I)V

    new-instance p3, Lv30/d;

    const/4 v0, 0x3

    invoke-direct {p3, p0, v0}, Lv30/d;-><init>(Lv30/e;I)V

    invoke-virtual {p4, p1, p2, p3}, Lv30/k;->a(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lv30/e;->d:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lv30/e;->d:Z

    new-instance v0, Lv30/d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lv30/d;-><init>(Lv30/e;I)V

    new-instance v1, Lv30/d;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lv30/d;-><init>(Lv30/e;I)V

    iget-object v2, p0, Lv30/e;->c:Lv30/k;

    invoke-virtual {v2, p1, v0, v1}, Lv30/k;->a(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
