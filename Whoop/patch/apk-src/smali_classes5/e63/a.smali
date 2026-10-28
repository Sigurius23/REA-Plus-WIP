.class public final Le63/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le63/b;


# instance fields
.field public final E:Lo63/f;

.field public final w:Lw53/b;

.field public final x:Li63/t;

.field public final y:Li63/e0;

.field public final z:Li63/o;


# direct methods
.method public constructor <init>(Lw53/b;Le63/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le63/a;->w:Lw53/b;

    iget-object p1, p2, Le63/e;->b:Li63/t;

    iput-object p1, p0, Le63/a;->x:Li63/t;

    iget-object p1, p2, Le63/e;->a:Li63/e0;

    iput-object p1, p0, Le63/a;->y:Li63/e0;

    iget-object p1, p2, Le63/e;->c:Li63/o;

    iput-object p1, p0, Le63/a;->z:Li63/o;

    iget-object p1, p2, Le63/e;->f:Lo63/f;

    iput-object p1, p0, Le63/a;->E:Lo63/f;

    return-void
.end method


# virtual methods
.method public final getAttributes()Lo63/f;
    .locals 1

    iget-object v0, p0, Le63/a;->E:Lo63/f;

    return-object v0
.end method

.method public final getCoroutineContext()Lq83/j;
    .locals 1

    iget-object v0, p0, Le63/a;->w:Lw53/b;

    invoke-virtual {v0}, Lw53/b;->getCoroutineContext()Lq83/j;

    move-result-object v0

    return-object v0
.end method

.method public final getHeaders()Li63/m;
    .locals 1

    iget-object v0, p0, Le63/a;->z:Li63/o;

    return-object v0
.end method

.method public final getMethod()Li63/t;
    .locals 1

    iget-object v0, p0, Le63/a;->x:Li63/t;

    return-object v0
.end method

.method public final getUrl()Li63/e0;
    .locals 1

    iget-object v0, p0, Le63/a;->y:Li63/e0;

    return-object v0
.end method
