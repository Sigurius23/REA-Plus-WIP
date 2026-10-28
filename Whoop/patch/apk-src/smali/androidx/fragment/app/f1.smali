.class public final Landroidx/fragment/app/f1;
.super Landroidx/fragment/app/w0;
.source "SourceFile"


# instance fields
.field public final synthetic b:Landroidx/fragment/app/o1;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/o1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/f1;->b:Landroidx/fragment/app/o1;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroidx/fragment/app/m0;
    .locals 1

    iget-object p1, p0, Landroidx/fragment/app/f1;->b:Landroidx/fragment/app/o1;

    iget-object p1, p1, Landroidx/fragment/app/o1;->x:Landroidx/fragment/app/x0;

    iget-object p1, p1, Landroidx/fragment/app/x0;->x:Landroidx/fragment/app/r0;

    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Landroidx/fragment/app/m0;->instantiate(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/fragment/app/m0;

    move-result-object p1

    return-object p1
.end method
