.class public final Lr9/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Z

.field public c:Li9/j;

.field public d:J

.field public e:Landroid/os/Handler;

.field public f:Lb9/c0;

.field public g:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr9/d;->a:Landroid/content/Context;

    new-instance v0, Lgm/j;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lgm/j;-><init>(Landroid/content/Context;B)V

    iput-object v0, p0, Lr9/d;->c:Li9/j;

    return-void
.end method
