.class public final Lt30/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lm30/h;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lm30/h;)V
    .locals 1

    const-string v0, "uiCustomization"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt30/r;->a:Landroid/content/Context;

    iput-object p2, p0, Lt30/r;->b:Lm30/h;

    return-void
.end method
