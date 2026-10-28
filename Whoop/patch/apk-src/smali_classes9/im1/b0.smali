.class public final synthetic Lim1/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/fragment/app/w1;


# instance fields
.field public final synthetic a:Lcom/whoop/home/view/HomeFragment;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/home/view/HomeFragment;Ljava/lang/String;Lc93/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lim1/b0;->a:Lcom/whoop/home/view/HomeFragment;

    iput-object p2, p0, Lim1/b0;->b:Ljava/lang/String;

    iput-object p3, p0, Lim1/b0;->c:Lc93/a;

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lim1/b0;->b:Ljava/lang/String;

    iget-object v1, p0, Lim1/b0;->c:Lc93/a;

    iget-object v2, p0, Lim1/b0;->a:Lcom/whoop/home/view/HomeFragment;

    invoke-static {v2, v0, v1, p2, p1}, Lcom/whoop/home/view/HomeFragment;->i0(Lcom/whoop/home/view/HomeFragment;Ljava/lang/String;Lc93/a;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
