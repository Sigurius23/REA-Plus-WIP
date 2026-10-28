.class public final Loy/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj/c;


# instance fields
.field public final w:Ljava/lang/String;

.field public final x:Lj/k;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lj/k;)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loy/c;->w:Ljava/lang/String;

    iput-object p2, p0, Loy/c;->x:Lj/k;

    return-void
.end method


# virtual methods
.method public final registerForActivityResult(Lk/b;Lj/b;)Lj/d;
    .locals 4

    const-string v0, "contract"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Loy/c;->x:Lj/k;

    invoke-interface {v0}, Lj/k;->getActivityResultRegistry()Lj/j;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "_"

    iget-object v3, p0, Loy/c;->w:Ljava/lang/String;

    invoke-static {v3, v2, v1}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Lj/j;->d(Ljava/lang/String;Lk/b;Lj/b;)Lj/i;

    move-result-object p1

    return-object p1
.end method
