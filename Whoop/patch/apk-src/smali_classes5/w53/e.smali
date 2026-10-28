.class public final Lw53/e;
.super Lw53/b;
.source "SourceFile"


# instance fields
.field public final F:[B

.field public final G:Z


# direct methods
.method public constructor <init>(Lv53/c;Le63/b;Lf63/c;[B)V
    .locals 0

    invoke-direct {p0, p1}, Lw53/b;-><init>(Lv53/c;)V

    iput-object p4, p0, Lw53/e;->F:[B

    new-instance p1, Lw53/f;

    invoke-direct {p1, p0, p2}, Lw53/f;-><init>(Lw53/e;Le63/b;)V

    iput-object p1, p0, Lw53/b;->x:Le63/b;

    new-instance p1, Lf63/a;

    invoke-direct {p1, p0, p4, p3}, Lf63/a;-><init>(Lw53/e;[BLf63/c;)V

    iput-object p1, p0, Lw53/b;->y:Lf63/c;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lw53/e;->G:Z

    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lw53/e;->G:Z

    return v0
.end method

.method public final e()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lw53/e;->F:[B

    invoke-static {v0}, Lge3/g;->a([B)Lio/ktor/utils/io/m;

    move-result-object v0

    return-object v0
.end method
