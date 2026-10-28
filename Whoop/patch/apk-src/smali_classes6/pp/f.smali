.class public final Lpp/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lpp/f;

.field public static final c:Lpp/f;


# instance fields
.field public final a:Ljava/lang/Throwable;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-boolean v0, Lpp/p;->K:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sput-object v1, Lpp/f;->c:Lpp/f;

    sput-object v1, Lpp/f;->b:Lpp/f;

    return-void

    :cond_0
    new-instance v0, Lpp/f;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Lpp/f;-><init>(ZLjava/lang/RuntimeException;)V

    sput-object v0, Lpp/f;->c:Lpp/f;

    new-instance v0, Lpp/f;

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, Lpp/f;-><init>(ZLjava/lang/RuntimeException;)V

    sput-object v0, Lpp/f;->b:Lpp/f;

    return-void
.end method

.method public constructor <init>(ZLjava/lang/RuntimeException;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lpp/f;->a:Ljava/lang/Throwable;

    return-void
.end method
