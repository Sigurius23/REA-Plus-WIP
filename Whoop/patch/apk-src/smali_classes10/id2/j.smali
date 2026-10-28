.class public final Lid2/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R*\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00078\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Lid2/j;",
        "",
        "<init>",
        "()V",
        "Landroid/graphics/Bitmap;",
        "b",
        "()Landroid/graphics/Bitmap;",
        "Lkotlin/Function0;",
        "a",
        "Lc93/a;",
        "getOnSnapshot$share_release",
        "()Lc93/a;",
        "e",
        "(Lc93/a;)V",
        "onSnapshot",
        "Lkd1/m;",
        "Lkd1/m;",
        "c",
        "()Lkd1/m;",
        "imageLoadTracker",
        "share_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final c:I = 0x8


# instance fields
.field private a:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final b:Lkd1/m;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Li21/r;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Li21/r;-><init>(I)V

    iput-object v0, p0, Lid2/j;->a:Lc93/a;

    new-instance v0, Lkd1/m;

    invoke-direct {v0}, Lkd1/m;-><init>()V

    iput-object v0, p0, Lid2/j;->b:Lkd1/m;

    return-void
.end method

.method public static synthetic a()Landroid/graphics/Bitmap;
    .locals 1

    invoke-static {}, Lid2/j;->d()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method private static final d()Landroid/graphics/Bitmap;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public final b()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lid2/j;->a:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final c()Lkd1/m;
    .locals 1

    iget-object v0, p0, Lid2/j;->b:Lkd1/m;

    return-object v0
.end method

.method public final e(Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lid2/j;->a:Lc93/a;

    return-void
.end method
