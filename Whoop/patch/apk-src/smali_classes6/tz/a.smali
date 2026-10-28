.class public final Ltz/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lqy/d;

.field public final c:Lb20/f;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lqy/d;Lb20/f;)V
    .locals 1

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltz/a;->a:Landroid/content/Context;

    iput-object p2, p0, Ltz/a;->b:Lqy/d;

    iput-object p3, p0, Ltz/a;->c:Lb20/f;

    return-void
.end method


# virtual methods
.method public final a(Lsz/g;Lux/b;Lux/a;)Lsz/d;
    .locals 11

    const-string v0, "environment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardFundingFilter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardBrandFilter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lux/j;

    const/4 v0, 0x0

    sget-object v1, Lux/i;->x:Lux/i;

    invoke-direct {v4, v0, v1, v0}, Lux/j;-><init>(ZLux/i;Z)V

    new-instance v1, Lsz/d;

    const/4 v5, 0x1

    const/4 v6, 0x1

    iget-object v2, p0, Ltz/a;->a:Landroid/content/Context;

    iget-object v7, p0, Ltz/a;->c:Lb20/f;

    iget-object v8, p0, Ltz/a;->b:Lqy/d;

    move-object v3, p1

    move-object v10, p2

    move-object v9, p3

    invoke-direct/range {v1 .. v10}, Lsz/d;-><init>(Landroid/content/Context;Lsz/g;Lux/j;ZZLb20/f;Lqy/d;Lux/a;Lux/b;)V

    return-object v1
.end method
