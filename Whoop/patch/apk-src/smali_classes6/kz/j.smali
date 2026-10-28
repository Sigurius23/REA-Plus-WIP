.class public final Lkz/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkz/o;


# instance fields
.field public final a:Lj/d;


# direct methods
.method public constructor <init>(Lj/d;)V
    .locals 1

    const-string v0, "activityResultLauncher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkz/j;->a:Lj/d;

    return-void
.end method


# virtual methods
.method public final c(Ljz/f;Ljz/e;)V
    .locals 1

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkz/a;

    invoke-direct {v0, p1, p2}, Lkz/a;-><init>(Ljz/f;Ljz/e;)V

    const/4 p1, 0x0

    iget-object p2, p0, Lkz/j;->a:Lj/d;

    invoke-virtual {p2, v0, p1}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    return-void
.end method
