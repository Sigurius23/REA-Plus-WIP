.class public final Loo/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/c;


# static fields
.field public static final y:Loo/b;


# instance fields
.field public final w:Z

.field public final x:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/sentry/internal/debugmeta/c;

    const/16 v1, 0x1d

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/sentry/internal/debugmeta/c;-><init>(IC)V

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    new-instance v1, Loo/b;

    invoke-direct {v1, v0}, Loo/b;-><init>(Lio/sentry/internal/debugmeta/c;)V

    sput-object v1, Loo/b;->y:Loo/b;

    return-void
.end method

.method public constructor <init>(Lio/sentry/internal/debugmeta/c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Loo/b;->w:Z

    iget-object p1, p1, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Loo/b;->x:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Loo/b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Loo/b;

    const/4 v1, 0x0

    invoke-static {v1, v1}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Loo/b;->w:Z

    iget-boolean v3, p1, Loo/b;->w:Z

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Loo/b;->x:Ljava/lang/String;

    iget-object p1, p1, Loo/b;->x:Ljava/lang/String;

    invoke-static {v1, p1}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 3

    iget-boolean v0, p0, Loo/b;->w:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget-object v1, p0, Loo/b;->x:Ljava/lang/String;

    const/4 v2, 0x0

    filled-new-array {v2, v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
