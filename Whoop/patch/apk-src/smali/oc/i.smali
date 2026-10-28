.class public final Loc/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Leb/o0;

.field public final c:Loc/a;

.field public final d:Leb/o0;

.field public final e:Leb/o0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lsc/b;)V
    .locals 6

    new-instance v0, Loc/a;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getApplicationContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-direct {v0, v1, p2, v3}, Loc/a;-><init>(Landroid/content/Context;Lsc/b;I)V

    new-instance v1, Loc/a;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x1

    invoke-direct {v1, v3, p2, v4}, Loc/a;-><init>(Landroid/content/Context;Lsc/b;I)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Loc/g;->a:Ljava/lang/String;

    new-instance v4, Loc/f;

    invoke-direct {v4, v3, p2}, Loc/f;-><init>(Landroid/content/Context;Lsc/b;)V

    new-instance v3, Loc/a;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x2

    invoke-direct {v3, v5, p2, v2}, Loc/a;-><init>(Landroid/content/Context;Lsc/b;I)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loc/i;->a:Landroid/content/Context;

    iput-object v0, p0, Loc/i;->b:Leb/o0;

    iput-object v1, p0, Loc/i;->c:Loc/a;

    iput-object v4, p0, Loc/i;->d:Leb/o0;

    iput-object v3, p0, Loc/i;->e:Leb/o0;

    return-void
.end method
