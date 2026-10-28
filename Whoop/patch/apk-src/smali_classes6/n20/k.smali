.class public final Ln20/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lbc3/c0;

.field public final b:Le10/r0;

.field public final c:Ldc3/h;

.field public final d:Lec3/g;


# direct methods
.method public constructor <init>(Lbc3/c0;Le10/r0;)V
    .locals 2

    const-string v0, "coroutineScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmationHandler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln20/k;->a:Lbc3/c0;

    iput-object p2, p0, Ln20/k;->b:Le10/r0;

    const/4 p2, 0x7

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v0, p2, v1}, Lq83/g;->d(IILdc3/a;)Ldc3/h;

    move-result-object p2

    iput-object p2, p0, Ln20/k;->c:Ldc3/h;

    invoke-static {p2}, Lec3/v;->K(Ldc3/w;)Lec3/g;

    move-result-object p2

    iput-object p2, p0, Ln20/k;->d:Lec3/g;

    new-instance p2, Lkd/f;

    const/16 v0, 0xa

    invoke-direct {p2, p0, v1, v0}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v0, 0x3

    invoke-static {p1, v1, v1, p2, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
