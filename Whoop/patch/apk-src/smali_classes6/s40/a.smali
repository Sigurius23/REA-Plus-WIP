.class public final Ls40/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lg/l;

.field public final b:Ljava/lang/Integer;

.field public final c:Lg/l;


# direct methods
.method public constructor <init>(Lg/l;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls40/a;->a:Lg/l;

    iput-object p2, p0, Ls40/a;->b:Ljava/lang/Integer;

    iput-object p1, p0, Ls40/a;->c:Lg/l;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;Landroid/os/Bundle;I)V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Ls40/a;->a:Lg/l;

    invoke-direct {v0, v1, p1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, p2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p1

    const-string p2, "putExtras(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p1, p3}, Lg/l;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method
