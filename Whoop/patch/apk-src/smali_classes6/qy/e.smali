.class public final Lqy/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lqy/d;

.field public static final b:Lqy/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqy/d;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lqy/d;-><init>(I)V

    sput-object v0, Lqy/e;->a:Lqy/d;

    new-instance v0, Lqy/d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lqy/d;-><init>(I)V

    sput-object v0, Lqy/e;->b:Lqy/d;

    return-void
.end method
