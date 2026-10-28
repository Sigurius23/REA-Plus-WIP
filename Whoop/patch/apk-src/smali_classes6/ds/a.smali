.class public final Lds/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lds/a;

.field public static final d:Lds/a;


# instance fields
.field public final a:Z

.field public final b:Ljava/lang/Throwable;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-boolean v0, Lds/n;->z:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sput-object v1, Lds/a;->d:Lds/a;

    sput-object v1, Lds/a;->c:Lds/a;

    return-void

    :cond_0
    new-instance v0, Lds/a;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lds/a;-><init>(Ljava/lang/Throwable;Z)V

    sput-object v0, Lds/a;->d:Lds/a;

    new-instance v0, Lds/a;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lds/a;-><init>(Ljava/lang/Throwable;Z)V

    sput-object v0, Lds/a;->c:Lds/a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Lds/a;->a:Z

    iput-object p1, p0, Lds/a;->b:Ljava/lang/Throwable;

    return-void
.end method
