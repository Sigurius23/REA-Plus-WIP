.class public final Ler/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ler/c;

.field public final b:Ler/b;

.field public final c:Landroid/view/View;


# direct methods
.method public constructor <init>(Ler/b;Landroid/view/View;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    new-instance v0, Ler/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto :goto_0

    :cond_0
    const/16 v1, 0x21

    if-lt v0, v1, :cond_1

    new-instance v0, Ler/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Ler/f;->a:Ler/c;

    iput-object p1, p0, Ler/f;->b:Ler/b;

    iput-object p2, p0, Ler/f;->c:Landroid/view/View;

    return-void
.end method
