.class public final Lh5/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ll5/f;

.field public c:Landroid/view/VelocityTracker;

.field public d:F

.field public e:I

.field public f:I

.field public g:I

.field public final h:[I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ll5/f;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lh5/g;->e:I

    iput v0, p0, Lh5/g;->f:I

    iput v0, p0, Lh5/g;->g:I

    const v0, 0x7fffffff

    const/4 v1, 0x0

    filled-new-array {v0, v1}, [I

    move-result-object v0

    iput-object v0, p0, Lh5/g;->h:[I

    iput-object p1, p0, Lh5/g;->a:Landroid/content/Context;

    iput-object p2, p0, Lh5/g;->b:Ll5/f;

    return-void
.end method
