.class public final Ld4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Ld4/a;

.field public static final d:Ld4/a;


# instance fields
.field public final a:Z

.field public final b:Ljava/lang/Throwable;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-boolean v0, Ld4/h;->z:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sput-object v1, Ld4/a;->d:Ld4/a;

    sput-object v1, Ld4/a;->c:Ld4/a;

    return-void

    :cond_0
    new-instance v0, Ld4/a;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ld4/a;-><init>(Ljava/lang/Throwable;Z)V

    sput-object v0, Ld4/a;->d:Ld4/a;

    new-instance v0, Ld4/a;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ld4/a;-><init>(Ljava/lang/Throwable;Z)V

    sput-object v0, Ld4/a;->c:Ld4/a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Ld4/a;->a:Z

    iput-object p1, p0, Ld4/a;->b:Ljava/lang/Throwable;

    return-void
.end method
