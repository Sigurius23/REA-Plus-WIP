.class public final Ld9/d;
.super Landroid/database/ContentObserver;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/ContentResolver;

.field public final b:Landroid/net/Uri;

.field public final synthetic c:Ld30/h;


# direct methods
.method public constructor <init>(Ld30/h;Landroid/os/Handler;Landroid/content/ContentResolver;Landroid/net/Uri;)V
    .locals 0

    iput-object p1, p0, Ld9/d;->c:Ld30/h;

    invoke-direct {p0, p2}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    iput-object p3, p0, Ld9/d;->a:Landroid/content/ContentResolver;

    iput-object p4, p0, Ld9/d;->b:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public final onChange(Z)V
    .locals 3

    iget-object p1, p0, Ld9/d;->c:Ld30/h;

    iget-object v0, p1, Ld30/h;->b:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    iget-object v1, p1, Ld30/h;->j:Ljava/lang/Object;

    check-cast v1, Lu8/d;

    iget-object v2, p1, Ld30/h;->i:Ljava/lang/Object;

    check-cast v2, Lro/i;

    invoke-static {v0, v1, v2}, Ld9/b;->c(Landroid/content/Context;Lu8/d;Lro/i;)Ld9/b;

    move-result-object v0

    invoke-virtual {p1, v0}, Ld30/h;->b(Ld9/b;)V

    return-void
.end method
