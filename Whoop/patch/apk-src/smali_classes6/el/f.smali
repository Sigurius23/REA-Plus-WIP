.class public final Lel/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldl/t;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ldl/t;

.field public final c:Ldl/t;

.field public final d:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ldl/t;Ldl/t;Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lel/f;->a:Landroid/content/Context;

    iput-object p2, p0, Lel/f;->b:Ldl/t;

    iput-object p3, p0, Lel/f;->c:Ldl/t;

    iput-object p4, p0, Lel/f;->d:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Z
    .locals 2

    check-cast p1, Landroid/net/Uri;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    invoke-static {p1}, Lsc3/l;->h(Landroid/net/Uri;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Ljava/lang/Object;IILwk/h;)Ldl/s;
    .locals 10

    move-object v4, p1

    check-cast v4, Landroid/net/Uri;

    new-instance p1, Ldl/s;

    new-instance v9, Lsl/d;

    invoke-direct {v9, v4}, Lsl/d;-><init>(Ljava/lang/Object;)V

    new-instance v0, Lel/e;

    iget-object v3, p0, Lel/f;->c:Ldl/t;

    iget-object v8, p0, Lel/f;->d:Ljava/lang/Class;

    iget-object v1, p0, Lel/f;->a:Landroid/content/Context;

    iget-object v2, p0, Lel/f;->b:Ldl/t;

    move v5, p2

    move v6, p3

    move-object v7, p4

    invoke-direct/range {v0 .. v8}, Lel/e;-><init>(Landroid/content/Context;Ldl/t;Ldl/t;Landroid/net/Uri;IILwk/h;Ljava/lang/Class;)V

    invoke-direct {p1, v9, v0}, Ldl/s;-><init>(Lwk/e;Lxk/e;)V

    return-object p1
.end method
