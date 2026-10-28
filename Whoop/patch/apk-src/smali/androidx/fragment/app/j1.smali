.class public final Landroidx/fragment/app/j1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/fragment/app/w1;


# instance fields
.field public final a:Landroidx/lifecycle/x;

.field public final b:Landroidx/fragment/app/w1;

.field public final c:Landroidx/fragment/app/g1;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/x;Landroidx/fragment/app/w1;Landroidx/fragment/app/g1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/j1;->a:Landroidx/lifecycle/x;

    iput-object p2, p0, Landroidx/fragment/app/j1;->b:Landroidx/fragment/app/w1;

    iput-object p3, p0, Landroidx/fragment/app/j1;->c:Landroidx/fragment/app/g1;

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/j1;->b:Landroidx/fragment/app/w1;

    invoke-interface {v0, p1, p2}, Landroidx/fragment/app/w1;->a(Landroid/os/Bundle;Ljava/lang/String;)V

    return-void
.end method
