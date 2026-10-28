.class public abstract Lsr/g;
.super Lxr/u;
.source "SourceFile"


# instance fields
.field public final synthetic x:Lsr/h;


# direct methods
.method public constructor <init>(Lsr/h;Lcq/i;)V
    .locals 0

    iput-object p1, p0, Lsr/g;->x:Lsr/h;

    invoke-direct {p0, p2}, Lxr/u;-><init>(Lcq/i;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Exception;)V
    .locals 2

    instance-of v0, p1, Lcom/google/android/play/integrity/internal/af;

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Lxr/u;->a(Ljava/lang/Exception;)V

    return-void

    :cond_0
    iget-object v0, p0, Lsr/g;->x:Lsr/h;

    invoke-static {v0}, Lsr/h;->d(Lsr/h;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lcom/google/android/play/core/integrity/StandardIntegrityException;

    const/4 v1, -0x2

    invoke-direct {v0, v1, p1}, Lcom/google/android/play/core/integrity/StandardIntegrityException;-><init>(ILjava/lang/Exception;)V

    invoke-super {p0, v0}, Lxr/u;->a(Ljava/lang/Exception;)V

    return-void

    :cond_1
    new-instance v0, Lcom/google/android/play/core/integrity/StandardIntegrityException;

    const/16 v1, -0x9

    invoke-direct {v0, v1, p1}, Lcom/google/android/play/core/integrity/StandardIntegrityException;-><init>(ILjava/lang/Exception;)V

    invoke-super {p0, v0}, Lxr/u;->a(Ljava/lang/Exception;)V

    return-void
.end method
