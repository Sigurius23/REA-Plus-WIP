.class public final Lh/i;
.super Lj/d;
.source "SourceFile"


# instance fields
.field public final a:Lh/a;


# direct methods
.method public constructor <init>(Lh/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh/i;->a:Lh/a;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V
    .locals 1

    iget-object v0, p0, Lh/i;->a:Lh/a;

    iget-object v0, v0, Lh/a;->a:Lj/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lj/i;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Launcher has not been initialized"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Registration is automatically handled by rememberLauncherForActivityResult"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
