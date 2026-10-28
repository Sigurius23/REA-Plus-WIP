.class public final Ld4/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Throwable;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ld4/c;

    new-instance v1, Ld4/b;

    invoke-direct {v1}, Ld4/b;-><init>()V

    invoke-direct {v0, v1}, Ld4/c;-><init>(Ljava/lang/Throwable;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-boolean v0, Ld4/h;->z:Z

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Ld4/c;->a:Ljava/lang/Throwable;

    return-void
.end method
