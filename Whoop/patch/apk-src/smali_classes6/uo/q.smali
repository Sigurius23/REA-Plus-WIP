.class public final Luo/q;
.super Luo/r;
.source "SourceFile"


# instance fields
.field public final synthetic w:Landroid/content/Intent;

.field public final synthetic x:Lto/i;


# direct methods
.method public constructor <init>(Landroid/content/Intent;Lto/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luo/q;->w:Landroid/content/Intent;

    iput-object p2, p0, Luo/q;->x:Lto/i;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Luo/q;->w:Landroid/content/Intent;

    if-eqz v0, :cond_0

    iget-object v1, p0, Luo/q;->x:Lto/i;

    const/4 v2, 0x2

    invoke-interface {v1, v0, v2}, Lto/i;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_0
    return-void
.end method
