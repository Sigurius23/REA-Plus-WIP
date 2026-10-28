.class public final synthetic Lj02/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leb/u;


# instance fields
.field public final synthetic a:Lj02/p;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lj02/p;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj02/o;->a:Lj02/p;

    iput-object p2, p0, Lj02/o;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Leb/a0;Leb/n0;Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lj02/o;->a:Lj02/p;

    iget-object v1, p0, Lj02/o;->b:Ljava/lang/String;

    invoke-static {v0, v1, p1, p2, p3}, Lj02/p;->a(Lj02/p;Ljava/lang/String;Leb/a0;Leb/n0;Landroid/os/Bundle;)V

    return-void
.end method
