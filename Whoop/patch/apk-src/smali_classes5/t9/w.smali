.class public abstract Lt9/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt9/e0;


# instance fields
.field public final a:Lt9/e0;


# direct methods
.method public constructor <init>(Lt9/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt9/w;->a:Lt9/e0;

    return-void
.end method


# virtual methods
.method public c(J)Lt9/d0;
    .locals 1

    iget-object v0, p0, Lt9/w;->a:Lt9/e0;

    invoke-interface {v0, p1, p2}, Lt9/e0;->c(J)Lt9/d0;

    move-result-object p1

    return-object p1
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Lt9/w;->a:Lt9/e0;

    invoke-interface {v0}, Lt9/e0;->e()Z

    move-result v0

    return v0
.end method

.method public f()J
    .locals 2

    iget-object v0, p0, Lt9/w;->a:Lt9/e0;

    invoke-interface {v0}, Lt9/e0;->f()J

    move-result-wide v0

    return-wide v0
.end method
