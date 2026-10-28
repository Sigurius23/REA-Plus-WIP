.class public final Lel/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldl/u;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lel/d;->a:Landroid/content/Context;

    iput-object p2, p0, Lel/d;->b:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public final a(Ldl/z;)Ldl/t;
    .locals 4

    new-instance v0, Lel/f;

    const-class v1, Ljava/io/File;

    iget-object v2, p0, Lel/d;->b:Ljava/lang/Class;

    invoke-virtual {p1, v1, v2}, Ldl/z;->b(Ljava/lang/Class;Ljava/lang/Class;)Ldl/t;

    move-result-object v1

    const-class v3, Landroid/net/Uri;

    invoke-virtual {p1, v3, v2}, Ldl/z;->b(Ljava/lang/Class;Ljava/lang/Class;)Ldl/t;

    move-result-object p1

    iget-object v3, p0, Lel/d;->a:Landroid/content/Context;

    invoke-direct {v0, v3, v1, p1, v2}, Lel/f;-><init>(Landroid/content/Context;Ldl/t;Ldl/t;Ljava/lang/Class;)V

    return-object v0
.end method
