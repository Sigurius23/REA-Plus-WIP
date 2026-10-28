.class public final Lt3/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Laj/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Laj/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lh6/j;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Laj/d;->k()Lp1/t2;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-object v1, v0, Laj/d;->w:Ljava/lang/Object;

    sput-object v0, Lt3/h;->a:Laj/d;

    return-void
.end method
