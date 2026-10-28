.class public abstract Lhj0/t$b;
.super Lhj0/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhj0/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Lhj0/t$c;",
        ">",
        "Lhj0/q;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lhj0/q;-><init>(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Lhj0/q;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public q(Landroidx/core/app/ActivityOptionsCompat;)Lhj0/q;
    .locals 0

    invoke-virtual {p0, p1}, Lhj0/q;->k(Landroidx/core/app/ActivityOptionsCompat;)V

    return-object p0
.end method
