.class public final Ld4/k;
.super Ld4/h;
.source "SourceFile"


# instance fields
.field public final synthetic H:Ld4/l;


# direct methods
.method public constructor <init>(Ld4/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld4/k;->H:Ld4/l;

    return-void
.end method


# virtual methods
.method public final h()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Ld4/k;->H:Ld4/l;

    iget-object v0, v0, Ld4/l;->w:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld4/i;

    if-nez v0, :cond_0

    const-string v0, "Completer object has been garbage collected, future will fail soon"

    return-object v0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "tag=["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, Ld4/i;->a:Ljava/lang/Object;

    const-string v2, "]"

    invoke-static {v1, v2, v0}, Lb9/y;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
